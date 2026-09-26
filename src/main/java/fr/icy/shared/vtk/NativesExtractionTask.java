/*
 * Copyright (c) 2010-2026. Institut Pasteur.
 *
 * This file is part of Icy.
 * Icy is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Icy is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Icy. If not, see <https://www.gnu.org/licenses/>.
 */

package fr.icy.shared.vtk;

import fr.icy.shared.task.Task;
import org.jspecify.annotations.NonNull;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static fr.icy.shared.vtk.Loader.currentPlatform;

public class NativesExtractionTask extends Task {
    private static final Logger LOGGER = Logger.getLogger(NativesExtractionTask.class.getName());

    private final @NonNull LinkedHashSet<String> natives;
    private final @NonNull Path path;

    public NativesExtractionTask(final @NonNull LinkedHashSet<String> natives, final @NonNull Path path) {
        super(1L, "VTK Natives Extractor");
        this.natives = natives;
        this.path = path;
    }

    @Override
    public void execute() throws Exception {

        final long t0 = System.nanoTime();

        // 1. Extract pack and verify it
        final LinkedHashMap<String, byte[]> data = readNativesPack(natives);
        long ms = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - t0);
        if (LOGGER.isLoggable(Level.CONFIG))
            LOGGER.log(Level.CONFIG, String.format("Verified natives.pack in %d ms", ms));
        reportProgress(0, "Verified natives pack");

        // 2. Extract natives from pack
        writeAllParallel(data, path);
        ms = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - t0);
        if (LOGGER.isLoggable(Level.CONFIG))
            LOGGER.log(Level.CONFIG, String.format("Wrote %d natives from natives.pack in %d ms", natives.size(), ms));

        reportProgress(100, "Extracted VTK");
    }

    /**
     * Opens /natives.pack once and reads every entry into a byte[].
     */
    private @NonNull LinkedHashMap<String, byte[]> readNativesPack(final LinkedHashSet<String> wanted) throws IOException {
        final LinkedHashSet<String> wantedSet = new LinkedHashSet<>(wanted);
        final LinkedHashMap<String, byte[]> result = new LinkedHashMap<>(wanted.size());

        final String pack = "/natives-" + currentPlatform() + ".pack";

        try (final InputStream raw = Loader.class.getResourceAsStream(pack)) {
            if (raw == null)
                throw new IOException(pack + " not found. Ensure the correct natives JAR is on the classpath.");

            try (final ZipInputStream zis = new ZipInputStream(new BufferedInputStream(raw, 4 << 20))) {
                ZipEntry entry;
                while ((entry = zis.getNextEntry()) != null) {
                    // Strip any directory prefix — pack may store "linux-amd64/foo.so"
                    final String name = Path.of(entry.getName()).getFileName().toString();
                    if (wantedSet.contains(name)) {
                        result.put(name, zis.readAllBytes());
                    }
                    zis.closeEntry();
                }
            }
        }

        if (result.size() != wanted.size()) {
            final Set<String> missing = new HashSet<>(wanted);
            missing.removeAll(result.keySet());
            throw new IOException("Entries missing from natives.pack: " + missing);
        }
        return result;
    }

    /**
     * Writes all native files to cacheDir in parallel.
     * <p>
     * Thread count = min(2 × CPUs, files) — I/O-bound tasks benefit from
     * over-subscription relative to CPU count.
     * <p>
     * Each write uses NIO FileChannel to avoid double-buffering and goes
     * through a tmp-file and atomic rename to guarantee the loader never
     * sees a partially written file even if the JVM crashes mid-write.
     */
    @SuppressWarnings("resource")
    private void writeAllParallel(final @NonNull LinkedHashMap<String, byte[]> data, final Path cacheDir) throws InterruptedException, ExecutionException {
        final int nThreads = Math.min(Runtime.getRuntime().availableProcessors() * 2, data.size());

        final ExecutorService pool = Executors.newFixedThreadPool(nThreads, r -> {
            final Thread t = new Thread(r, "native-writer");
            t.setDaemon(true);
            return t;
        });

        final int nFiles = data.size();
        final AtomicInteger i = new AtomicInteger();

        final List<CompletableFuture<Void>> futures = data.entrySet().stream()
                .map(e -> CompletableFuture.runAsync(() -> {
                    writeAtomic(e.getValue(), cacheDir.resolve(e.getKey()));
                    i.getAndIncrement();
                    this.reportProgress((i.get() /nFiles)*100, "Extracting VTK (" + i + " / " + nFiles + ")");
                }, pool))
                .toList();

        try {
            CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).get();
        }
        finally {
            pool.shutdownNow();
        }
    }

    /**
     * Writes data to dest via a .part temp-file and atomic rename.
     * FileChannel.write() bypasses Java heap buffering — writes directly from
     * the byte[] without an extra copy.
     */
    private static void writeAtomic(final byte[] data, final @NonNull Path dest) {
        // .part suffix is unique per-file, so parallel writes never collide
        final Path tmp = dest.resolveSibling(dest.getFileName() + ".part");
        try {
            // Write via FileChannel: no extra heap copy, direct to OS page cache
            try (final FileChannel ch = FileChannel.open(tmp, StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)) {
                final ByteBuffer buf = ByteBuffer.wrap(data);
                while (buf.hasRemaining()) {
                    ch.write(buf);   // loop handles short writes
                }
            }

            // Atomic rename: dest is either absent or fully written, never partial
            try {
                Files.move(tmp, dest, StandardCopyOption.ATOMIC_MOVE);
            }
            catch (final AtomicMoveNotSupportedException ex) {
                Files.move(tmp, dest, StandardCopyOption.REPLACE_EXISTING);
            }

        }
        catch (final IOException e) {
            throw new UncheckedIOException("Failed to write: " + dest.getFileName(), e);
        }
    }
}
