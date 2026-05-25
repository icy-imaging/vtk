package fr.icy.lib.vtk;

import fr.icy.lib.task.Pipeline;
import fr.icy.lib.task.TaskExecutionException;
import fr.icy.lib.task.TaskExecutor;
import org.jetbrains.annotations.Contract;
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
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * The {@code Loader} class is responsible for managing the initialization and loading of native libraries
 * required by the application. It provides utility methods to ensure the environment is correctly set up,
 * native libraries are extracted and loaded, and platform compatibility is verified.
 * <p>
 * This class has a private constructor to prevent instantiation and operates as a utility class
 * with a focus on native library management.
 * <p>
 * Key functionalities include:
 * <ul>
 *     <li>Checking platform support.</li>
 *     <li>Initializing the library environment with caching mechanisms.</li>
 *     <li>Loading libraries sequentially from the appropriate directories.</li>
 *     <li>Extracting and writing native library files using optimized IO operations.</li>
 * </ul>
 */
@SuppressWarnings("UseOfSystemOutOrSystemErr")
public final class Loader {
    /**
     * Private constructor to prevent instantiation.
     */
    @Contract(pure = true)
    private Loader() {
        //
    }

    /**
     * Bump this string whenever the native binaries change.
     * This invalidates the old cache automatically.
     */
    private static final String VERSION = "9.4.2";
    private static final String APP_ID = "icy";
    private static final String LIBRARY_ID = "vtk";

    private static volatile boolean initialized = false;

    /**
     * Determines whether the current platform is supported.
     * This method retrieves the platform information using the {@code currentPlatform()} method
     * and checks if it matches any unsupported platforms. Platforms specifically marked as unsupported
     * include "linux-arm64" and "windows-arm64".
     *
     * @return {@code true} if the current platform is supported; {@code false} otherwise.
     */
    public static boolean isCurrentPlatformSupported() {
        final String current = currentPlatform();
        return !current.equals("linux-arm64") && !current.equals("windows-arm64");
    }

    /**
     * Initializes the environment for loading native libraries. This method must be invoked
     * to ensure that the required native libraries are loaded and ready for use.
     * <p>
     * The initialization process involves the following:
     * 1. Checks if the platform is supported using {@link #isCurrentPlatformSupported()}.
     * If the platform is not supported, throws a {@code RuntimeException}.
     * 2. Sets up a cache directory for library extraction by invoking {@link #setupCacheDir()}.
     * 3. Obtains the ordered set of native libraries specific to the current platform using
     * {@link #getOrderSet()}.
     * 4. Determines whether the required native libraries are already present in the cache
     * directory by calling {@link #isCacheComplete(LinkedHashSet, Path)}:
     * - If the cache is complete, the libraries are loaded sequentially using
     * {@link #loadSequential(LinkedHashSet, Path)}.
     * - Otherwise, libraries are extracted and loaded using
     * {@link #extractAndLoad(LinkedHashSet, Path)}.
     * 5. Marks the system as initialized to avoid redundant operations in subsequent calls.
     * <p>
     * The method ensures thread safety by synchronizing on the initialization process.
     * If initialization fails due to any exception during the process, a
     * {@code RuntimeException} is thrown with the underlying cause.
     *
     * @throws RuntimeException if the current platform is unsupported, the native library
     *                          loading fails, or any other error occurs during initialization.
     */
    public static synchronized void init() throws RuntimeException {
        if (initialized) return;
        if (!isCurrentPlatformSupported())
            throw new RuntimeException("Platform (" + currentPlatform() + ") not supported by VTK");
        try {
            final long t0 = System.nanoTime();

            final Path cacheDir = setupCacheDir();
            //final LinkedHashSet<String> natives = readManifest();
            final LinkedHashSet<String> natives = getOrderSet();

            if (isCacheComplete(natives, cacheDir)) {
                // ── Fast path (subsequent runs) ──────────────────────────────
                // All files already on disk → just load, no extraction needed
                loadSequential(natives, cacheDir);
            }
            else {
                // ── Slow path (first run only) ───────────────────────────────
                // Extract in parallel, load as soon as each file is ready
                extractAndLoad(natives, cacheDir);
            }

            initialized = true;

            final long ms = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - t0);
            System.out.printf("[NativeLoader] %d natives loaded in %d ms%n", natives.size(), ms); // TODO: replace with better logging
        }
        catch (final Exception e) {
            throw new RuntimeException("Failed to initialize native libraries", e);
        }
    }

    /**
     * Returns: ~/.icy/natives/vtk@$0.0.0/ (0.0.0 references {@link #VERSION})
     * <p>
     * Versioned and platform-specific so updating the library (new VERSION) auto-invalidates the cache
     */
    private static @NonNull Path setupCacheDir() throws IOException {
        final Path dir = Path.of(System.getProperty("user.home"), "." + APP_ID, "natives", LIBRARY_ID + "@" + VERSION);
        Files.createDirectories(dir);
        System.setProperty("vtk.lib.dir", dir.toAbsolutePath().toString().replace('\\', '/'));
        return dir;
    }

    /**
     * Checks if the cache is complete by verifying the existence of all specified files within the given cache directory.
     * The method iterates through the provided set of file names and ensures that each file exists in the resolved path.
     *
     * @param files    A {@code LinkedHashSet<String>} containing the names of the files to check.
     *                 The file names are resolved against the specified cache directory.
     * @param cacheDir A {@code Path} object representing the cache directory where the files are expected to be located.
     * @return {@code true} if all specified files exist in the cache directory; {@code false} otherwise.
     */
    private static boolean isCacheComplete(final @NonNull LinkedHashSet<String> files, final Path cacheDir) {
        return files.stream().allMatch(f -> Files.exists(cacheDir.resolve(f)));
    }

    /**
     * Loads a sequence of native library files into the JVM from the specified directory.
     * The method resolves the absolute file path for each library in the order provided
     * by the {@code files} parameter, and loads them sequentially using {@link System#load}.
     *
     * @param files A {@code LinkedHashSet<String>} containing the names of the native files to load.
     *              The order in this set determines the order in which the files are loaded.
     * @param dir   A {@code Path} object representing the directory where the native files
     *              are located. Each file's absolute path is resolved relative to this directory.
     */
    private static void loadSequential(final @NonNull LinkedHashSet<String> files, final Path dir) {
        final TaskExecutor executor = TaskExecutor.getInstance();
        final Pipeline pipeline = new Pipeline("VTK loader");
        pipeline.addTask(new NativesLoadTask(files, dir));

        try {
            executor.execute(pipeline);
        }
        catch (final TaskExecutionException e) {
            e.getFailedTasks().forEach(task ->
                    task.getError().ifPresent(err -> System.err.println(task.getName() + ": " + err.getMessage())) // TODO: replace with logger
            );
        }

        /*for (final String file : files) {
            System.load(dir.resolve(file).toAbsolutePath().toString());
        }*/
    }

    /**
     * Extracts native libraries from a packaged resource and loads them into a specified cache directory.
     * The method performs the following steps:
     * 1. Reads the contents of the packed `natives.pack` file into memory as a sequential operation.
     * 2. Writes the extracted native files to the specified cache directory in parallel, leveraging NIO FileChannels.
     * 3. Loads the native libraries sequentially based on the manifest order.
     *
     * @param files    A {@code LinkedHashSet<String>} containing the names of the native files to be extracted and loaded.
     *                 The order in this set determines the order in which the files are processed in subsequent steps.
     * @param cacheDir A {@code Path} representing the directory where the extracted native files will be stored.
     *                 This directory is used as a cache to prevent redundant operations in future runs.
     * @throws IOException          If an I/O error occurs during the reading, writing, or loading of native files.
     * @throws InterruptedException If the current thread is interrupted while performing parallel write operations.
     * @throws ExecutionException   If a task in the parallel write operation fails with an exception.
     */
    private static void extractAndLoad(final LinkedHashSet<String> files, final Path cacheDir) throws IOException, InterruptedException, ExecutionException {
        final long t0 = System.nanoTime();
        // Step 1 — Single-pass sequential read from natives.pack
        //          One ZipFile open, zero repeated ClassLoader locking.
        final LinkedHashMap<String, byte[]> data = readNativesPack(files);
        long ms = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - t0);
        System.out.printf("[NativeLoader] verified natives.pack in %d ms%n", ms);

        // Step 2 — Write all files to disk in parallel with NIO FileChannel
        writeAllParallel(data, cacheDir);
        ms = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - t0);
        System.out.printf("[NativeLoader] wrote " + files.size() + " natives from natives.pack in %d ms%n", ms);

        // Step 3 — Load in manifest order
        loadSequential(files, cacheDir);
        System.out.printf("[NativeLoader] loaded " + files.size() + " natives in %d ms%n", ms);
    }

    /**
     * Opens /natives.pack once and reads every entry into a byte[].
     */
    private static @NonNull LinkedHashMap<String, byte[]> readNativesPack(final LinkedHashSet<String> wanted) throws IOException {
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
    private static void writeAllParallel(final @NonNull LinkedHashMap<String, byte[]> data, final Path cacheDir) throws InterruptedException, ExecutionException {
        final int nThreads = Math.min(Runtime.getRuntime().availableProcessors() * 2, data.size());

        final ExecutorService pool = Executors.newFixedThreadPool(nThreads, r -> {
            final Thread t = new Thread(r, "native-writer");
            t.setDaemon(true);
            return t;
        });

        final List<CompletableFuture<Void>> futures = data.entrySet().stream()
                .map(e -> CompletableFuture.runAsync(() -> writeAtomic(e.getValue(), cacheDir.resolve(e.getKey())), pool))
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

    /**
     * Determines the current platform based on the operating system and architecture.
     * The platform is identified in the format "os-arch", where:
     * <ul>
     *     <li>"os" is one of "windows", "macos", or "linux".</li>
     *     <li>"arch" is one of "amd64", "arm64", or the raw architecture string if unrecognized.</li>
     * </ul>
     * This method ensures compatibility with supported platforms by returning a standardized
     * identifier that can be used in platform-specific logic.
     *
     * @return A non-null string representing the current platform in the format "os-arch".
     */
    private static @NonNull String currentPlatform() {
        final String os = System.getProperty("os.name").toLowerCase();
        final String arch = System.getProperty("os.arch").toLowerCase();
        final String a = arch.matches("amd64|x86_64") ? "amd64"
                : arch.matches("aarch64|arm64") ? "arm64"
                  : arch;
        if (os.contains("win")) return "windows-" + a;
        if (os.contains("mac") || os.contains("darwin")) return "macos-" + a;
        return "linux-" + a;
    }

    /**
     * Generates a linked hash set of library file names based on the current operating
     * system and architecture. The method determines the appropriate prefix and suffix
     * for library files (e.g., "lib" and ".so" for Linux, or "" and ".dll" for Windows)
     * and normalizes the architecture string to a standard format (e.g., "amd64", "arm64").
     *
     * @return A non-null {@code LinkedHashSet} of library file names specific to the
     * current platform and architecture.
     */
    private static @NonNull LinkedHashSet<String> getOrderSet() {
        final String os = System.getProperty("os.name").toLowerCase();
        String arch = System.getProperty("os.arch").toLowerCase();

        // Normalize arch
        if (arch.equals("x86_64") || arch.equals("amd64")) {
            arch = "amd64";
        }
        else if (arch.equals("aarch64") || arch.equals("arm64")) {
            arch = "arm64";
        }

        final String prefix;
        final String suffix;
        if (os.contains("win")) {
            prefix = "";
            suffix = ".dll";
        }
        else if (os.contains("mac") || os.contains("darwin")) {
            prefix = "lib";
            suffix = ".dylib";
        }
        else {
            prefix = "lib";
            suffix = ".so";
        }

        final StringTokenizer st = new StringTokenizer(libs, ";");
        final LinkedHashSet<String> names = new LinkedHashSet<>();
        while (st.hasMoreTokens()) {
            names.add(prefix + st.nextToken() + suffix);
        }
        return names;
    }

    //private static final String libs = "vtkcgns;vtkChartsCore;vtkChartsCoreJava;vtkCommonColor;vtkCommonColorJava;vtkCommonComputationalGeometry;vtkCommonComputationalGeometryJava;vtkCommonCore;vtkCommonCoreJava;vtkCommonDataModel;vtkCommonDataModelJava;vtkCommonExecutionModel;vtkCommonExecutionModelJava;vtkCommonMath;vtkCommonMathJava;vtkCommonMisc;vtkCommonMiscJava;vtkCommonSystem;vtkCommonSystemJava;vtkCommonTransforms;vtkCommonTransformsJava;vtkDICOMParser;vtkDomainsChemistry;vtkDomainsChemistryJava;vtkDomainsChemistryOpenGL2;vtkDomainsChemistryOpenGL2Java;vtkdoubleconversion;vtkexodusII;vtkexpat;vtkFiltersAMR;vtkFiltersAMRJava;vtkFiltersCellGrid;vtkFiltersCellGridJava;vtkFiltersCore;vtkFiltersCoreJava;vtkFiltersExtraction;vtkFiltersExtractionJava;vtkFiltersFlowPaths;vtkFiltersFlowPathsJava;vtkFiltersGeneral;vtkFiltersGeneralJava;vtkFiltersGeneric;vtkFiltersGenericJava;vtkFiltersGeometry;vtkFiltersGeometryJava;vtkFiltersGeometryPreview;vtkFiltersGeometryPreviewJava;vtkFiltersHybrid;vtkFiltersHybridJava;vtkFiltersHyperTree;vtkFiltersHyperTreeJava;vtkFiltersImaging;vtkFiltersImagingJava;vtkFiltersModeling;vtkFiltersModelingJava;vtkFiltersParallel;vtkFiltersParallelImaging;vtkFiltersParallelImagingJava;vtkFiltersParallelJava;vtkFiltersPoints;vtkFiltersPointsJava;vtkFiltersProgrammable;vtkFiltersProgrammableJava;vtkFiltersReduction;vtkFiltersReductionJava;vtkFiltersSelection;vtkFiltersSelectionJava;vtkFiltersSMP;vtkFiltersSMPJava;vtkFiltersSources;vtkFiltersSourcesJava;vtkFiltersStatistics;vtkFiltersStatisticsJava;vtkFiltersTemporal;vtkFiltersTemporalJava;vtkFiltersTensor;vtkFiltersTensorJava;vtkFiltersTexture;vtkFiltersTextureJava;vtkFiltersTopology;vtkFiltersTopologyJava;vtkFiltersVerdict;vtkFiltersVerdictJava;vtkfmt;vtkfreetype;vtkGeovisCore;vtkGeovisCoreJava;vtkgl2ps;vtkglad;vtkhdf5_hl;vtkhdf5;vtkImagingColor;vtkImagingColorJava;vtkImagingCore;vtkImagingCoreJava;vtkImagingFourier;vtkImagingFourierJava;vtkImagingGeneral;vtkImagingGeneralJava;vtkImagingHybrid;vtkImagingHybridJava;vtkImagingMath;vtkImagingMathJava;vtkImagingMorphological;vtkImagingMorphologicalJava;vtkImagingSources;vtkImagingSourcesJava;vtkImagingStatistics;vtkImagingStatisticsJava;vtkImagingStencil;vtkImagingStencilJava;vtkInfovisCore;vtkInfovisCoreJava;vtkInfovisLayout;vtkInfovisLayoutJava;vtkInteractionImage;vtkInteractionImageJava;vtkInteractionStyle;vtkInteractionStyleJava;vtkInteractionWidgets;vtkInteractionWidgetsJava;vtkIOAMR;vtkIOAMRJava;vtkIOAsynchronous;vtkIOAsynchronousJava;vtkIOCellGrid;vtkIOCellGridJava;vtkIOCesium3DTiles;vtkIOCesium3DTilesJava;vtkIOCGNSReader;vtkIOCGNSReaderJava;vtkIOChemistry;vtkIOChemistryJava;vtkIOCityGML;vtkIOCityGMLJava;vtkIOCONVERGECFD;vtkIOCONVERGECFDJava;vtkIOCore;vtkIOCoreJava;vtkIOEngys;vtkIOEngysJava;vtkIOEnSight;vtkIOEnSightJava;vtkIOERF;vtkIOERFJava;vtkIOExodus;vtkIOExodusJava;vtkIOExport;vtkIOExportGL2PS;vtkIOExportGL2PSJava;vtkIOExportJava;vtkIOExportPDF;vtkIOExportPDFJava;vtkIOFDS;vtkIOFDSJava;vtkIOFLUENTCFF;vtkIOFLUENTCFFJava;vtkIOGeometry;vtkIOGeometryJava;vtkIOHDF;vtkIOHDFJava;vtkIOImage;vtkIOImageJava;vtkIOImport;vtkIOImportJava;vtkIOInfovis;vtkIOInfovisJava;vtkIOIOSS;vtkIOIOSSJava;vtkIOLegacy;vtkIOLegacyJava;vtkIOLSDyna;vtkIOLSDynaJava;vtkIOMINC;vtkIOMINCJava;vtkIOMotionFX;vtkIOMotionFXJava;vtkIOMovie;vtkIOMovieJava;vtkIONetCDF;vtkIONetCDFJava;vtkIOOggTheora;vtkIOOggTheoraJava;vtkIOParallel;vtkIOParallelJava;vtkIOParallelXML;vtkIOParallelXMLJava;vtkIOPLY;vtkIOPLYJava;vtkIOSegY;vtkIOSegYJava;vtkIOSQL;vtkIOSQLJava;vtkioss;vtkIOTecplotTable;vtkIOTecplotTableJava;vtkIOVeraOut;vtkIOVeraOutJava;vtkIOVideo;vtkIOVideoJava;vtkIOXML;vtkIOXMLJava;vtkIOXMLParser;vtkIOXMLParserJava;vtkJava;vtkjpeg;vtkjsoncpp;vtkkissfft;vtklibharu;vtklibproj;vtklibxml2;vtkloguru;vtklz4;vtklzma;vtkmetaio;vtknetcdf;vtkogg;vtkParallelCore;vtkParallelCoreJava;vtkParallelDIY;vtkpng;vtkpugixml;vtkRenderingAnnotation;vtkRenderingAnnotationJava;vtkRenderingCellGrid;vtkRenderingCellGridJava;vtkRenderingContext2D;vtkRenderingContext2DJava;vtkRenderingContextOpenGL2;vtkRenderingContextOpenGL2Java;vtkRenderingCore;vtkRenderingCoreJava;vtkRenderingFreeType;vtkRenderingFreeTypeJava;vtkRenderingGL2PSOpenGL2;vtkRenderingGL2PSOpenGL2Java;vtkRenderingHyperTreeGrid;vtkRenderingHyperTreeGridJava;vtkRenderingImage;vtkRenderingImageJava;vtkRenderingLabel;vtkRenderingLabelJava;vtkRenderingLICOpenGL2;vtkRenderingLICOpenGL2Java;vtkRenderingLOD;vtkRenderingLODJava;vtkRenderingOpenGL2;vtkRenderingOpenGL2Java;vtkRenderingSceneGraph;vtkRenderingSceneGraphJava;vtkRenderingUI;vtkRenderingUIJava;vtkRenderingVolume;vtkRenderingVolumeJava;vtkRenderingVolumeOpenGL2;vtkRenderingVolumeOpenGL2Java;vtkRenderingVtkJS;vtkRenderingVtkJSJava;vtksqlite;vtksys;vtkTestingCore;vtkTestingRendering;vtkTestingRenderingJava;vtktheora;vtktiff;vtktoken;vtkverdict;vtkViewsContext2D;vtkViewsContext2DJava;vtkViewsCore;vtkViewsCoreJava;vtkViewsInfovis;vtkViewsInfovisJava;vtkWrappingTools;vtkzlib";
    private static final String libs = "vtkglad;vtklz4;vtkkissfft;vtklzma;vtkjpeg;vtkexpat;vtkogg;vtktheora;vtkloguru;vtksys;vtkpugixml;vtkWrappingTools;vtksqlite;vtkjsoncpp;vtkverdict;vtkzlib;vtkhdf5;vtktoken;vtkdoubleconversion;vtkfmt;vtklibxml2;vtkCommonCore;vtkJava;vtkhdf5_hl;vtklibproj;vtktiff;vtkfreetype;vtkpng;vtkmetaio;vtkCommonMath;vtkgl2ps;vtkcgns;vtkDICOMParser;vtkCommonSystem;vtkCommonCoreJava;vtklibharu;vtkCommonTransforms;vtknetcdf;vtkCommonMathJava;vtkCommonMisc;vtkCommonSystemJava;vtkexodusII;vtkGeovisCore;vtkCommonTransformsJava;vtkioss;vtkCommonMiscJava;vtkCommonDataModel;vtkGeovisCoreJava;vtkCommonComputationalGeometry;vtkCommonColor;vtkCommonExecutionModel;vtkIOCore;vtkCommonDataModelJava;vtkCommonExecutionModelJava;vtkFiltersSelection;vtkImagingMath;vtkIOPLY;vtkIOVeraOut;vtkFiltersGeometryPreview;vtkFiltersTensor;vtkIONetCDF;vtkIOCoreJava;vtkCommonColorJava;vtkIOCONVERGECFD;vtkIOSQL;vtkIOVideo;vtkIOEngys;vtkIOVideoJava;vtkIOERF;vtkIOVeraOutJava;vtkFiltersProgrammable;vtkIOCONVERGECFDJava;vtkIOFLUENTCFF;vtkFiltersTensorJava;vtkIOMovie;vtkCommonComputationalGeometryJava;vtkImagingCore;vtkIOFLUENTCFFJava;vtkIOSQLJava;vtkIOXMLParser;vtkFiltersReduction;vtkImagingColor;vtkFiltersCore;vtkFiltersTopology;vtkIOTecplotTable;vtkIOImage;vtkIOXMLParserJava;vtkFiltersSelectionJava;vtkImagingStencil;vtkImagingMathJava;vtkIONetCDFJava;vtkFiltersGeometryPreviewJava;vtkImagingFourier;vtkIOTecplotTableJava;vtkFiltersTemporal;vtkIOOggTheora;vtkIOExodus;vtkIOERFJava;vtkFiltersProgrammableJava;vtkIOEngysJava;vtkIOPLYJava;vtkIOXML;vtkImagingStatistics;vtkFiltersReductionJava;vtkImagingHybrid;vtkIOMovieJava;vtkFiltersGeometry;vtkImagingCoreJava;vtkImagingSources;vtkIOSegY;vtkFiltersCellGrid;vtkIOLSDyna;vtkIOOggTheoraJava;vtkFiltersTopologyJava;vtkImagingColorJava;vtkIOImageJava;vtkIOSegYJava;vtkImagingGeneral;vtkIOCellGrid;vtkImagingStatisticsJava;vtkImagingMorphological;vtkImagingHybridJava;vtkFiltersVerdict;vtkIOLSDynaJava;vtkImagingFourierJava;vtkFiltersCoreJava;vtkImagingStencilJava;vtkImagingSourcesJava;vtkIOXMLJava;vtkFiltersTemporalJava;vtkFiltersGeometryJava;vtkIOExodusJava;vtkFiltersGeneral;vtkFiltersCellGridJava;vtkImagingGeneralJava;vtkFiltersSources;vtkFiltersModeling;vtkIOCityGML;vtkIOLegacy;vtkFiltersVerdictJava;vtkParallelCore;vtkFiltersSMP;vtkParallelDIY;vtkIOAsynchronous;vtkFiltersHyperTree;vtkIOParallelXML;vtkFiltersPoints;vtkFiltersTexture;vtkImagingMorphologicalJava;vtkRenderingCore;vtkFiltersHybrid;vtkFiltersStatistics;vtkFiltersGeneric;vtkIOCellGridJava;vtkIOHDF;vtkFiltersExtraction;vtkFiltersAMR;vtkFiltersFlowPaths;vtkInteractionStyle;vtkFiltersGeneralJava;vtkIOEnSight;vtkIOAMR;vtkRenderingHyperTreeGrid;vtkFiltersImaging;vtkIOCGNSReader;vtkRenderingVolume;vtkTestingCore;vtkDomainsChemistry;vtkIOIOSS;vtkFiltersParallel;vtkIOMINC;vtkFiltersSMPJava;vtkIOLegacyJava;vtkRenderingSceneGraph;vtkIOGeometry;vtkRenderingImage;vtkRenderingLOD;vtkFiltersSourcesJava;vtkFiltersStatisticsJava;vtkRenderingCoreJava;vtkFiltersTextureJava;vtkRenderingVtkJS;vtkRenderingUI;vtkIOImport;vtkTestingRendering;vtkRenderingFreeType;vtkIOMotionFX;vtkRenderingFreeTypeJava;vtkFiltersGenericJava;vtkInfovisCore;vtkRenderingLabel;vtkFiltersParallelImaging;vtkIOChemistry;vtkRenderingSceneGraphJava;vtkIOParallel;vtkInfovisLayout;vtkRenderingAnnotation;vtkIOInfovis;vtkFiltersHyperTreeJava;vtkRenderingOpenGL2;vtkRenderingGL2PSOpenGL2;vtkRenderingVtkJSJava;vtkFiltersHybridJava;vtkRenderingVolumeJava;vtkIOCesium3DTiles;vtkIOMINCJava;vtkRenderingUIJava;vtkFiltersExtractionJava;vtkParallelCoreJava;vtkRenderingCellGrid;vtkDomainsChemistryJava;vtkIOChemistryJava;vtkRenderingContext2D;vtkIOFDS;vtkFiltersModelingJava;vtkInteractionWidgets;vtkFiltersPointsJava;vtkFiltersAMRJava;vtkRenderingLabelJava;vtkRenderingImageJava;vtkIOParallelXMLJava;vtkFiltersImagingJava;vtkViewsCore;vtkRenderingAnnotationJava;vtkRenderingLICOpenGL2;vtkTestingRenderingJava;vtkChartsCore;vtkViewsContext2D;vtkFiltersFlowPathsJava;vtkIOAMRJava;vtkIOEnSightJava;vtkRenderingHyperTreeGridJava;vtkIOIOSSJava;vtkInteractionImage;vtkIOGeometryJava;vtkIOCityGMLJava;vtkRenderingContext2DJava;vtkIOHDFJava;vtkRenderingLODJava;vtkIOAsynchronousJava;vtkDomainsChemistryOpenGL2;vtkInteractionStyleJava;vtkIOCGNSReaderJava;vtkRenderingVolumeOpenGL2;vtkFiltersParallelJava;vtkInfovisCoreJava;vtkRenderingOpenGL2Java;vtkIOExport;vtkRenderingVolumeOpenGL2Java;vtkIOImportJava;vtkRenderingContextOpenGL2;vtkIOInfovisJava;vtkRenderingCellGridJava;vtkIOCesium3DTilesJava;vtkInteractionWidgetsJava;vtkViewsInfovis;vtkFiltersParallelImagingJava;vtkRenderingContextOpenGL2Java;vtkIOExportGL2PS;vtkIOMotionFXJava;vtkDomainsChemistryOpenGL2Java;vtkRenderingLICOpenGL2Java;vtkInfovisLayoutJava;vtkIOFDSJava;vtkIOExportPDF;vtkIOParallelJava;vtkViewsCoreJava;vtkChartsCoreJava;vtkIOExportJava;vtkViewsInfovisJava;vtkRenderingGL2PSOpenGL2Java;vtkIOExportGL2PSJava;vtkViewsContext2DJava;vtkInteractionImageJava;vtkIOExportPDFJava";
}
