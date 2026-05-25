package vtk;

import java.io.File;

/**
 * Enum used to load native library more easily. If you don't want to set the
 * specific environment variable you can provide the path of the directory that
 * contains the VTK library through a Java Property. Like in the following
 * command line:
 *
 * > java -cp vtk.jar -Dvtk.lib.dir=.../vtk-libs vtk.sample.SimpleVTK
 *
 * The directory .../vtk-libs must contain the so/dll/dylib + the jnilib files
 *
 * @author sebastien jourdain - sebastien.jourdain@kitware.com
 */
public enum vtkNativeLibrary {

  vtkViewsInfovis("vtkViewsInfovisJava"),
  vtkCommonColor("vtkCommonColorJava"),
  vtkViewsContext2D("vtkViewsContext2DJava"),
  vtkViewsCore("vtkViewsCoreJava"),
  vtkTestingRendering("vtkTestingRenderingJava"),
  vtkRenderingLabel("vtkRenderingLabelJava"),
  vtkRenderingLOD("vtkRenderingLODJava"),
  vtkRenderingLICOpenGL2("vtkRenderingLICOpenGL2Java"),
  vtkRenderingImage("vtkRenderingImageJava"),
  vtkRenderingContextOpenGL2("vtkRenderingContextOpenGL2Java"),
  vtkRenderingCellGrid("vtkRenderingCellGridJava"),
  vtkRenderingVolumeOpenGL2("vtkRenderingVolumeOpenGL2Java"),
  vtkIOVeraOut("vtkIOVeraOutJava"),
  vtkIOTecplotTable("vtkIOTecplotTableJava"),
  vtkIOSegY("vtkIOSegYJava"),
  vtkIOParallelXML("vtkIOParallelXMLJava"),
  vtkIOPLY("vtkIOPLYJava"),
  vtkIOOggTheora("vtkIOOggTheoraJava"),
  vtkIONetCDF("vtkIONetCDFJava"),
  vtkIOMotionFX("vtkIOMotionFXJava"),
  vtkIOParallel("vtkIOParallelJava"),
  vtkIOMINC("vtkIOMINCJava"),
  vtkIOLSDyna("vtkIOLSDynaJava"),
  vtkIOImport("vtkIOImportJava"),
  vtkIOIOSS("vtkIOIOSSJava"),
  vtkIOHDF("vtkIOHDFJava"),
  vtkIOFLUENTCFF("vtkIOFLUENTCFFJava"),
  vtkIOVideo("vtkIOVideoJava"),
  vtkIOMovie("vtkIOMovieJava"),
  vtkIOFDS("vtkIOFDSJava"),
  vtkIOInfovis("vtkIOInfovisJava"),
  vtkIOExportPDF("vtkIOExportPDFJava"),
  vtkIOExportGL2PS("vtkIOExportGL2PSJava"),
  vtkRenderingGL2PSOpenGL2("vtkRenderingGL2PSOpenGL2Java"),
  vtkIOExodus("vtkIOExodusJava"),
  vtkIOEngys("vtkIOEngysJava"),
  vtkIOEnSight("vtkIOEnSightJava"),
  vtkIOERF("vtkIOERFJava"),
  vtkIOCityGML("vtkIOCityGMLJava"),
  vtkIOChemistry("vtkIOChemistryJava"),
  vtkIOCesium3DTiles("vtkIOCesium3DTilesJava"),
  vtkIOCONVERGECFD("vtkIOCONVERGECFDJava"),
  vtkIOCGNSReader("vtkIOCGNSReaderJava"),
  vtkIOAsynchronous("vtkIOAsynchronousJava"),
  vtkIOExport("vtkIOExportJava"),
  vtkRenderingVtkJS("vtkRenderingVtkJSJava"),
  vtkIOGeometry("vtkIOGeometryJava"),
  vtkRenderingSceneGraph("vtkRenderingSceneGraphJava"),
  vtkIOAMR("vtkIOAMRJava"),
  vtkInteractionImage("vtkInteractionImageJava"),
  vtkInfovisLayout("vtkInfovisLayoutJava"),
  vtkImagingStencil("vtkImagingStencilJava"),
  vtkImagingStatistics("vtkImagingStatisticsJava"),
  vtkImagingMorphological("vtkImagingMorphologicalJava"),
  vtkImagingMath("vtkImagingMathJava"),
  vtkImagingFourier("vtkImagingFourierJava"),
  vtkIOSQL("vtkIOSQLJava"),
  vtkInteractionWidgets("vtkInteractionWidgetsJava"),
  vtkRenderingVolume("vtkRenderingVolumeJava"),
  vtkRenderingAnnotation("vtkRenderingAnnotationJava"),
  vtkInteractionStyle("vtkInteractionStyleJava"),
  vtkImagingHybrid("vtkImagingHybridJava"),
  vtkImagingColor("vtkImagingColorJava"),
  vtkGeovisCore("vtkGeovisCoreJava"),
  vtkFiltersTopology("vtkFiltersTopologyJava"),
  vtkFiltersTensor("vtkFiltersTensorJava"),
  vtkFiltersSelection("vtkFiltersSelectionJava"),
  vtkFiltersSMP("vtkFiltersSMPJava"),
  vtkFiltersProgrammable("vtkFiltersProgrammableJava"),
  vtkFiltersPoints("vtkFiltersPointsJava"),
  vtkFiltersParallelImaging("vtkFiltersParallelImagingJava"),
  vtkFiltersTemporal("vtkFiltersTemporalJava"),
  vtkFiltersImaging("vtkFiltersImagingJava"),
  vtkImagingGeneral("vtkImagingGeneralJava"),
  vtkFiltersGeometryPreview("vtkFiltersGeometryPreviewJava"),
  vtkFiltersGeneric("vtkFiltersGenericJava"),
  vtkFiltersFlowPaths("vtkFiltersFlowPathsJava"),
  vtkFiltersAMR("vtkFiltersAMRJava"),
  vtkFiltersParallel("vtkFiltersParallelJava"),
  vtkFiltersTexture("vtkFiltersTextureJava"),
  vtkFiltersModeling("vtkFiltersModelingJava"),
  vtkDomainsChemistryOpenGL2("vtkDomainsChemistryOpenGL2Java"),
  vtkRenderingOpenGL2("vtkRenderingOpenGL2Java"),
  vtkRenderingHyperTreeGrid("vtkRenderingHyperTreeGridJava"),
  vtkRenderingUI("vtkRenderingUIJava"),
  vtkFiltersHybrid("vtkFiltersHybridJava"),
  vtkDomainsChemistry("vtkDomainsChemistryJava"),
  vtkChartsCore("vtkChartsCoreJava"),
  vtkInfovisCore("vtkInfovisCoreJava"),
  vtkFiltersExtraction("vtkFiltersExtractionJava"),
  vtkIOXML("vtkIOXMLJava"),
  vtkIOXMLParser("vtkIOXMLParserJava"),
  vtkParallelCore("vtkParallelCoreJava"),
  vtkIOLegacy("vtkIOLegacyJava"),
  vtkIOCellGrid("vtkIOCellGridJava"),
  vtkFiltersCellGrid("vtkFiltersCellGridJava"),
  vtkIOCore("vtkIOCoreJava"),
  vtkFiltersStatistics("vtkFiltersStatisticsJava"),
  vtkFiltersHyperTree("vtkFiltersHyperTreeJava"),
  vtkImagingSources("vtkImagingSourcesJava"),
  vtkIOImage("vtkIOImageJava"),
  vtkRenderingContext2D("vtkRenderingContext2DJava"),
  vtkRenderingFreeType("vtkRenderingFreeTypeJava"),
  vtkRenderingCore("vtkRenderingCoreJava"),
  vtkFiltersSources("vtkFiltersSourcesJava"),
  vtkImagingCore("vtkImagingCoreJava"),
  vtkFiltersGeneral("vtkFiltersGeneralJava"),
  vtkFiltersVerdict("vtkFiltersVerdictJava"),
  vtkFiltersGeometry("vtkFiltersGeometryJava"),
  vtkCommonComputationalGeometry("vtkCommonComputationalGeometryJava"),
  vtkFiltersCore("vtkFiltersCoreJava"),
  vtkFiltersReduction("vtkFiltersReductionJava"),
  vtkCommonExecutionModel("vtkCommonExecutionModelJava"),
  vtkCommonDataModel("vtkCommonDataModelJava"),
  vtkCommonSystem("vtkCommonSystemJava"),
  vtkCommonMisc("vtkCommonMiscJava"),
  vtkCommonTransforms("vtkCommonTransformsJava"),
  vtkCommonMath("vtkCommonMathJava"),
  vtkCommonCore("vtkCommonCoreJava");


  /**
   * Try to load all library
   *
   * @return true if all library have been successfully loaded
   */
  public static boolean LoadAllNativeLibraries() {
    boolean isEveryThingLoaded = true;
    for (vtkNativeLibrary lib : values()) {
      try {
        lib.LoadLibrary();
      } catch (UnsatisfiedLinkError e) {
        isEveryThingLoaded = false;
        e.printStackTrace();
      }
    }

    return isEveryThingLoaded;
  }

  /**
   * Load the set of given library and trows runtime exception if any given
   * library failed in the loading process
   *
   * @param nativeLibraries
   */
  public static void LoadNativeLibraries(vtkNativeLibrary... nativeLibraries) {
    for (vtkNativeLibrary lib : nativeLibraries) {
      lib.LoadLibrary();
    }
  }

  /**
   * Disable the pop-in vtkErrorWindow by writing the error to a log file.
   * If the provided logFile is null the default "vtkError.txt" file will be
   * used.
   *
   * @param logFile
   */
  public static void DisableOutputWindow(File logFile) {
    if(logFile == null) {
      logFile = new File("vtkError.txt");
    }
    vtkFileOutputWindow outputError = new vtkFileOutputWindow();
    outputError.SetFileName(logFile.getAbsolutePath());
    outputError.SetInstance(outputError);
  }

  private vtkNativeLibrary(String nativeLibraryName) {
    this.nativeLibraryName = nativeLibraryName;
    this.loaded = false;
  }

  /**
   * Load the library and throws runtime exception if the library failed in
   * the loading process
   */
  public void LoadLibrary() throws UnsatisfiedLinkError {
    if (!loaded) {
      if (System.getProperty("vtk.lib.dir") != null) {
        File dir = new File(System.getProperty("vtk.lib.dir"));
        patchJavaLibraryPath(dir.getAbsolutePath());
        File libPath = new File(dir, System.mapLibraryName(nativeLibraryName));
        if (libPath.exists()) {
          try {
            Runtime.getRuntime().load(libPath.getAbsolutePath());
            loaded = true;
            return;
          } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
          }
        }
      }
      System.loadLibrary(nativeLibraryName);
    }
    loaded = true;
  }

  /**
   * @return true if the library has already been successfully loaded
   */
  public boolean IsLoaded() {
    return loaded;
  }

  /**
   * @return the library name
   */
  public String GetLibraryName() {
    return nativeLibraryName;
  }

  private static void patchJavaLibraryPath(String vtkLibDir) {
    if (vtkLibDir != null) {
      String path_separator = System.getProperty("path.separator");
      String s = System.getProperty("java.library.path");
      if (!s.contains(vtkLibDir)) {
        s = s + path_separator + vtkLibDir;
        System.setProperty("java.library.path", s);
      }
    }
  }

  private String nativeLibraryName;
  private boolean loaded;
}
