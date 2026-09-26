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

import fr.icy.shared.task.Pipeline;
import fr.icy.shared.task.TaskExecutionException;
import fr.icy.shared.task.TaskExecutor;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.NonNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

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
     * 3. Gets the ordered set of native libraries specific to the current platform using
     * {@link #getOrderSet()}.
     * 4. Determines whether the required native libraries are already present in the cache
     * directory by calling {@link #isCacheComplete(LinkedHashSet, Path)}:
     * - If the cache is complete, the libraries are loaded sequentially.
     * - Otherwise, libraries are extracted and loaded.
     * 5. Marks the system as initialized to avoid redundant operations in further calls.
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
        final Logger logger = Logger.getLogger(Loader.class.getName());
        if (!isCurrentPlatformSupported())
            throw new RuntimeException("Platform (" + currentPlatform() + ") not supported by VTK");
        try {
            final Path cacheDir = setupCacheDir();
            final LinkedHashSet<String> natives = getOrderSet();

            final TaskExecutor executor = TaskExecutor.getInstance();
            final Pipeline pipeline = new Pipeline("VTK loader");

            if (isCacheComplete(natives, cacheDir)) {
                // Fast path
                // All files already on disk → just load, no extraction needed
                pipeline.addTask(new NativesLoadTask(natives, cacheDir));
            }
            else {
                // Slow path (first run only)
                // Extract in parallel, load as soon as each file is ready
                pipeline.addTask(new NativesExtractionTask(natives, cacheDir));
                pipeline.addTask(new NativesLoadTask(natives, cacheDir));
            }

            try {
                executor.execute(pipeline);
            }
            catch (final TaskExecutionException e) {
                e.getFailedTasks().forEach(task ->
                        task.getError().ifPresent(err -> {
                            if (err instanceof InterruptedException)
                                logger.log(Level.WARNING, "VTK loading interrupted");
                            else
                                logger.log(Level.SEVERE, "Failed to load VTK", err);
                        })
                );
                throw e;
            }

            initialized = true;
        }
        catch (final Exception e) {
            initialized = false;
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
    static @NonNull String currentPlatform() {
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

    private static final String libs = "vtkglad;vtklz4;vtkkissfft;vtklzma;vtkjpeg;vtkexpat;vtkogg;vtktheora;vtkloguru;vtksys;vtkpugixml;vtkWrappingTools;vtksqlite;vtkjsoncpp;vtkverdict;vtkzlib;vtkhdf5;vtktoken;vtkdoubleconversion;vtkfmt;vtklibxml2;vtkCommonCore;vtkJava;vtkhdf5_hl;vtklibproj;vtktiff;vtkfreetype;vtkpng;vtkmetaio;vtkCommonMath;vtkgl2ps;vtkcgns;vtkDICOMParser;vtkCommonSystem;vtkCommonCoreJava;vtklibharu;vtkCommonTransforms;vtknetcdf;vtkCommonMathJava;vtkCommonMisc;vtkCommonSystemJava;vtkexodusII;vtkGeovisCore;vtkCommonTransformsJava;vtkioss;vtkCommonMiscJava;vtkCommonDataModel;vtkGeovisCoreJava;vtkCommonComputationalGeometry;vtkCommonColor;vtkCommonExecutionModel;vtkIOCore;vtkCommonDataModelJava;vtkCommonExecutionModelJava;vtkFiltersSelection;vtkImagingMath;vtkIOPLY;vtkIOVeraOut;vtkFiltersGeometryPreview;vtkFiltersTensor;vtkIONetCDF;vtkIOCoreJava;vtkCommonColorJava;vtkIOCONVERGECFD;vtkIOSQL;vtkIOVideo;vtkIOEngys;vtkIOVideoJava;vtkIOERF;vtkIOVeraOutJava;vtkFiltersProgrammable;vtkIOCONVERGECFDJava;vtkIOFLUENTCFF;vtkFiltersTensorJava;vtkIOMovie;vtkCommonComputationalGeometryJava;vtkImagingCore;vtkIOFLUENTCFFJava;vtkIOSQLJava;vtkIOXMLParser;vtkFiltersReduction;vtkImagingColor;vtkFiltersCore;vtkFiltersTopology;vtkIOTecplotTable;vtkIOImage;vtkIOXMLParserJava;vtkFiltersSelectionJava;vtkImagingStencil;vtkImagingMathJava;vtkIONetCDFJava;vtkFiltersGeometryPreviewJava;vtkImagingFourier;vtkIOTecplotTableJava;vtkFiltersTemporal;vtkIOOggTheora;vtkIOExodus;vtkIOERFJava;vtkFiltersProgrammableJava;vtkIOEngysJava;vtkIOPLYJava;vtkIOXML;vtkImagingStatistics;vtkFiltersReductionJava;vtkImagingHybrid;vtkIOMovieJava;vtkFiltersGeometry;vtkImagingCoreJava;vtkImagingSources;vtkIOSegY;vtkFiltersCellGrid;vtkIOLSDyna;vtkIOOggTheoraJava;vtkFiltersTopologyJava;vtkImagingColorJava;vtkIOImageJava;vtkIOSegYJava;vtkImagingGeneral;vtkIOCellGrid;vtkImagingStatisticsJava;vtkImagingMorphological;vtkImagingHybridJava;vtkFiltersVerdict;vtkIOLSDynaJava;vtkImagingFourierJava;vtkFiltersCoreJava;vtkImagingStencilJava;vtkImagingSourcesJava;vtkIOXMLJava;vtkFiltersTemporalJava;vtkFiltersGeometryJava;vtkIOExodusJava;vtkFiltersGeneral;vtkFiltersCellGridJava;vtkImagingGeneralJava;vtkFiltersSources;vtkFiltersModeling;vtkIOCityGML;vtkIOLegacy;vtkFiltersVerdictJava;vtkParallelCore;vtkFiltersSMP;vtkParallelDIY;vtkIOAsynchronous;vtkFiltersHyperTree;vtkIOParallelXML;vtkFiltersPoints;vtkFiltersTexture;vtkImagingMorphologicalJava;vtkRenderingCore;vtkFiltersHybrid;vtkFiltersStatistics;vtkFiltersGeneric;vtkIOCellGridJava;vtkIOHDF;vtkFiltersExtraction;vtkFiltersAMR;vtkFiltersFlowPaths;vtkInteractionStyle;vtkFiltersGeneralJava;vtkIOEnSight;vtkIOAMR;vtkRenderingHyperTreeGrid;vtkFiltersImaging;vtkIOCGNSReader;vtkRenderingVolume;vtkTestingCore;vtkDomainsChemistry;vtkIOIOSS;vtkFiltersParallel;vtkIOMINC;vtkFiltersSMPJava;vtkIOLegacyJava;vtkRenderingSceneGraph;vtkIOGeometry;vtkRenderingImage;vtkRenderingLOD;vtkFiltersSourcesJava;vtkFiltersStatisticsJava;vtkRenderingCoreJava;vtkFiltersTextureJava;vtkRenderingVtkJS;vtkRenderingUI;vtkIOImport;vtkTestingRendering;vtkRenderingFreeType;vtkIOMotionFX;vtkRenderingFreeTypeJava;vtkFiltersGenericJava;vtkInfovisCore;vtkRenderingLabel;vtkFiltersParallelImaging;vtkIOChemistry;vtkRenderingSceneGraphJava;vtkIOParallel;vtkInfovisLayout;vtkRenderingAnnotation;vtkIOInfovis;vtkFiltersHyperTreeJava;vtkRenderingOpenGL2;vtkRenderingGL2PSOpenGL2;vtkRenderingVtkJSJava;vtkFiltersHybridJava;vtkRenderingVolumeJava;vtkIOCesium3DTiles;vtkIOMINCJava;vtkRenderingUIJava;vtkFiltersExtractionJava;vtkParallelCoreJava;vtkRenderingCellGrid;vtkDomainsChemistryJava;vtkIOChemistryJava;vtkRenderingContext2D;vtkIOFDS;vtkFiltersModelingJava;vtkInteractionWidgets;vtkFiltersPointsJava;vtkFiltersAMRJava;vtkRenderingLabelJava;vtkRenderingImageJava;vtkIOParallelXMLJava;vtkFiltersImagingJava;vtkViewsCore;vtkRenderingAnnotationJava;vtkRenderingLICOpenGL2;vtkTestingRenderingJava;vtkChartsCore;vtkViewsContext2D;vtkFiltersFlowPathsJava;vtkIOAMRJava;vtkIOEnSightJava;vtkRenderingHyperTreeGridJava;vtkIOIOSSJava;vtkInteractionImage;vtkIOGeometryJava;vtkIOCityGMLJava;vtkRenderingContext2DJava;vtkIOHDFJava;vtkRenderingLODJava;vtkIOAsynchronousJava;vtkDomainsChemistryOpenGL2;vtkInteractionStyleJava;vtkIOCGNSReaderJava;vtkRenderingVolumeOpenGL2;vtkFiltersParallelJava;vtkInfovisCoreJava;vtkRenderingOpenGL2Java;vtkIOExport;vtkRenderingVolumeOpenGL2Java;vtkIOImportJava;vtkRenderingContextOpenGL2;vtkIOInfovisJava;vtkRenderingCellGridJava;vtkIOCesium3DTilesJava;vtkInteractionWidgetsJava;vtkViewsInfovis;vtkFiltersParallelImagingJava;vtkRenderingContextOpenGL2Java;vtkIOExportGL2PS;vtkIOMotionFXJava;vtkDomainsChemistryOpenGL2Java;vtkRenderingLICOpenGL2Java;vtkInfovisLayoutJava;vtkIOFDSJava;vtkIOExportPDF;vtkIOParallelJava;vtkViewsCoreJava;vtkChartsCoreJava;vtkIOExportJava;vtkViewsInfovisJava;vtkRenderingGL2PSOpenGL2Java;vtkIOExportGL2PSJava;vtkViewsContext2DJava;vtkInteractionImageJava;vtkIOExportPDFJava";
}
