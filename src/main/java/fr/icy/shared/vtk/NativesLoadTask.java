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

import java.nio.file.Path;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class NativesLoadTask extends Task {
    private static final Logger LOGGER = Logger.getLogger(NativesLoadTask.class.getName());

    private final @NonNull Set<String> natives;
    private final @NonNull Path path;

    public NativesLoadTask(final @NonNull Set<String> natives, final @NonNull Path path) {
        super(2L, "VTK Natives Loader");
        this.natives = natives;
        this.path = path;
    }

    @Override
    public void execute() throws Exception {
        final float n = natives.size();
        float i = 0;
        for (final String file : natives) {
            if (LOGGER.isLoggable(Level.CONFIG))
                LOGGER.log(Level.CONFIG, "Trying to load VTK native: " + file);
            System.load(path.resolve(file).toAbsolutePath().toString());
            i++;
            reportProgress((int) ((i / n) * 100f));
            if (LOGGER.isLoggable(Level.FINE))
                LOGGER.log(Level.FINE, "Loading VTK (" + (int) i + " / " + (int) n + ")");
        }

        reportProgress(100, "VTK loaded");
    }
}
