package fr.icy.lib.vtk;

import fr.icy.lib.task.Task;
import org.jspecify.annotations.NonNull;

import java.nio.file.Path;
import java.util.Set;

public final class NativesLoadTask extends Task {
    private final @NonNull Set<String> natives;
    private final @NonNull Path path;

    public NativesLoadTask(final @NonNull Set<String> natives, final @NonNull Path path) {
        super(1L, "VTK Natives Loader");
        this.natives = natives;
        this.path = path;
    }

    @Override
    public void execute() throws Exception {
        final int n = natives.size();
        int i = 0;
        for (final String file : natives) {
            System.load(path.resolve(file).toAbsolutePath().toString());
            i ++;
            reportProgress((i / n) * 100, "Loading VTK (" + i + " / " + n + ")");
        }

        reportProgress(100, "VTK loaded");
    }
}
