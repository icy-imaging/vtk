package vtk;

import java.util.Properties;
import java.util.StringTokenizer;

public class vtkSettings
{
  private static String GetVTKInstallLibDir() { return "/usr/local/"; }

  private static String[] Split(String str, String sep)
    {
    StringTokenizer st = new StringTokenizer(str, sep);
    int size = st.countTokens();
    String[] res = new String[size];
    int cnt = 0;
    while (st.hasMoreTokens())
      {
      res[cnt] = st.nextToken();
      cnt ++;
      }
    return res;
    }

  public static String GetVTKLibraryDir()
    {
    String lpath = null;
    Properties p = System.getProperties();
    String path_separator = p.getProperty("path.separator");
    String s = p.getProperty("java.class.path");
    String[] paths = vtkSettings.Split(s, path_separator);
    int cc;
    for ( cc = 0; cc < paths.length; cc ++ )
      {
      if ( paths[cc].endsWith("vtk.jar") )
        {
        lpath = paths[cc].substring(0, paths[cc].length()-"vtk.jar".length());
        lpath = lpath + "vtk-Darwin-arm64";
        }
      }
    if ( lpath == null )
      {
      lpath = vtkSettings.GetVTKInstallLibDir();
      }
    return lpath;
    }

  public static String[] GetKits()
    {
    return vtkSettings.Split("vtkViewsInfovis;vtkCommonColor;vtkViewsContext2D;vtkViewsCore;vtkTestingRendering;vtkRenderingLabel;vtkRenderingLOD;vtkRenderingLICOpenGL2;vtkRenderingImage;vtkRenderingContextOpenGL2;vtkRenderingCellGrid;vtkRenderingVolumeOpenGL2;vtkIOVeraOut;vtkIOTecplotTable;vtkIOSegY;vtkIOParallelXML;vtkIOPLY;vtkIOOggTheora;vtkIONetCDF;vtkIOMotionFX;vtkIOParallel;vtkIOMINC;vtkIOLSDyna;vtkIOImport;vtkIOIOSS;vtkIOHDF;vtkIOFLUENTCFF;vtkIOVideo;vtkIOMovie;vtkIOFDS;vtkIOInfovis;vtkIOExportPDF;vtkIOExportGL2PS;vtkRenderingGL2PSOpenGL2;vtkIOExodus;vtkIOEngys;vtkIOEnSight;vtkIOERF;vtkIOCityGML;vtkIOChemistry;vtkIOCesium3DTiles;vtkIOCONVERGECFD;vtkIOCGNSReader;vtkIOAsynchronous;vtkIOExport;vtkRenderingVtkJS;vtkIOGeometry;vtkRenderingSceneGraph;vtkIOAMR;vtkInteractionImage;vtkInfovisLayout;vtkImagingStencil;vtkImagingStatistics;vtkImagingMorphological;vtkImagingMath;vtkImagingFourier;vtkIOSQL;vtkInteractionWidgets;vtkRenderingVolume;vtkRenderingAnnotation;vtkInteractionStyle;vtkImagingHybrid;vtkImagingColor;vtkGeovisCore;vtkFiltersTopology;vtkFiltersTensor;vtkFiltersSelection;vtkFiltersSMP;vtkFiltersProgrammable;vtkFiltersPoints;vtkFiltersParallelImaging;vtkFiltersTemporal;vtkFiltersImaging;vtkImagingGeneral;vtkFiltersGeometryPreview;vtkFiltersGeneric;vtkFiltersFlowPaths;vtkFiltersAMR;vtkFiltersParallel;vtkFiltersTexture;vtkFiltersModeling;vtkDomainsChemistryOpenGL2;vtkRenderingOpenGL2;vtkRenderingHyperTreeGrid;vtkRenderingUI;vtkFiltersHybrid;vtkDomainsChemistry;vtkChartsCore;vtkInfovisCore;vtkFiltersExtraction;vtkIOXML;vtkIOXMLParser;vtkParallelCore;vtkIOLegacy;vtkIOCellGrid;vtkFiltersCellGrid;vtkIOCore;vtkFiltersStatistics;vtkFiltersHyperTree;vtkImagingSources;vtkIOImage;vtkRenderingContext2D;vtkRenderingFreeType;vtkRenderingCore;vtkFiltersSources;vtkImagingCore;vtkFiltersGeneral;vtkFiltersVerdict;vtkFiltersGeometry;vtkCommonComputationalGeometry;vtkFiltersCore;vtkFiltersReduction;vtkCommonExecutionModel;vtkCommonDataModel;vtkCommonSystem;vtkCommonMisc;vtkCommonTransforms;vtkCommonMath;vtkCommonCore", ";");
    }
}
