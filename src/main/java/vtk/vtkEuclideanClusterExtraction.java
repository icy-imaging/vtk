// java wrapper for vtkEuclideanClusterExtraction object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEuclideanClusterExtraction extends vtkPolyDataAlgorithm
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetRadius_4(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_4(id0);
  }

  private native double GetRadiusMinValue_5();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_5();
  }

  private native double GetRadiusMaxValue_6();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_6();
  }

  private native double GetRadius_7();
  public double GetRadius()
  {
    return GetRadius_7();
  }

  private native void SetScalarConnectivity_8(boolean id0);
  public void SetScalarConnectivity(boolean id0)
  {
    SetScalarConnectivity_8(id0);
  }

  private native boolean GetScalarConnectivity_9();
  public boolean GetScalarConnectivity()
  {
    return GetScalarConnectivity_9();
  }

  private native void ScalarConnectivityOn_10();
  public void ScalarConnectivityOn()
  {
    ScalarConnectivityOn_10();
  }

  private native void ScalarConnectivityOff_11();
  public void ScalarConnectivityOff()
  {
    ScalarConnectivityOff_11();
  }

  private native void SetScalarRange_12(double id0,double id1);
  public void SetScalarRange(double id0,double id1)
  {
    SetScalarRange_12(id0,id1);
  }

  private native void SetScalarRange_13(double id0[]);
  public void SetScalarRange(double id0[])
  {
    SetScalarRange_13(id0);
  }

  private native double[] GetScalarRange_14();
  public double[] GetScalarRange()
  {
    return GetScalarRange_14();
  }

  private native void SetExtractionMode_15(int id0);
  public void SetExtractionMode(int id0)
  {
    SetExtractionMode_15(id0);
  }

  private native int GetExtractionModeMinValue_16();
  public int GetExtractionModeMinValue()
  {
    return GetExtractionModeMinValue_16();
  }

  private native int GetExtractionModeMaxValue_17();
  public int GetExtractionModeMaxValue()
  {
    return GetExtractionModeMaxValue_17();
  }

  private native int GetExtractionMode_18();
  public int GetExtractionMode()
  {
    return GetExtractionMode_18();
  }

  private native void SetExtractionModeToPointSeededClusters_19();
  public void SetExtractionModeToPointSeededClusters()
  {
    SetExtractionModeToPointSeededClusters_19();
  }

  private native void SetExtractionModeToLargestCluster_20();
  public void SetExtractionModeToLargestCluster()
  {
    SetExtractionModeToLargestCluster_20();
  }

  private native void SetExtractionModeToSpecifiedClusters_21();
  public void SetExtractionModeToSpecifiedClusters()
  {
    SetExtractionModeToSpecifiedClusters_21();
  }

  private native void SetExtractionModeToClosestPointCluster_22();
  public void SetExtractionModeToClosestPointCluster()
  {
    SetExtractionModeToClosestPointCluster_22();
  }

  private native void SetExtractionModeToAllClusters_23();
  public void SetExtractionModeToAllClusters()
  {
    SetExtractionModeToAllClusters_23();
  }

  private native byte[] GetExtractionModeAsString_24();
  public String GetExtractionModeAsString()
  {
    return new String(GetExtractionModeAsString_24(), StandardCharsets.UTF_8);
  }

  private native void InitializeSeedList_25();
  public void InitializeSeedList()
  {
    InitializeSeedList_25();
  }

  private native void AddSeed_26(long id0);
  public void AddSeed(long id0)
  {
    AddSeed_26(id0);
  }

  private native void DeleteSeed_27(long id0);
  public void DeleteSeed(long id0)
  {
    DeleteSeed_27(id0);
  }

  private native void InitializeSpecifiedClusterList_28();
  public void InitializeSpecifiedClusterList()
  {
    InitializeSpecifiedClusterList_28();
  }

  private native void AddSpecifiedCluster_29(int id0);
  public void AddSpecifiedCluster(int id0)
  {
    AddSpecifiedCluster_29(id0);
  }

  private native void DeleteSpecifiedCluster_30(int id0);
  public void DeleteSpecifiedCluster(int id0)
  {
    DeleteSpecifiedCluster_30(id0);
  }

  private native void SetClosestPoint_31(double id0,double id1,double id2);
  public void SetClosestPoint(double id0,double id1,double id2)
  {
    SetClosestPoint_31(id0,id1,id2);
  }

  private native void SetClosestPoint_32(double id0[]);
  public void SetClosestPoint(double id0[])
  {
    SetClosestPoint_32(id0);
  }

  private native double[] GetClosestPoint_33();
  public double[] GetClosestPoint()
  {
    return GetClosestPoint_33();
  }

  private native int GetNumberOfExtractedClusters_34();
  public int GetNumberOfExtractedClusters()
  {
    return GetNumberOfExtractedClusters_34();
  }

  private native void SetColorClusters_35(boolean id0);
  public void SetColorClusters(boolean id0)
  {
    SetColorClusters_35(id0);
  }

  private native boolean GetColorClusters_36();
  public boolean GetColorClusters()
  {
    return GetColorClusters_36();
  }

  private native void ColorClustersOn_37();
  public void ColorClustersOn()
  {
    ColorClustersOn_37();
  }

  private native void ColorClustersOff_38();
  public void ColorClustersOff()
  {
    ColorClustersOff_38();
  }

  private native void SetLocator_39(vtkAbstractPointLocator id0);
  public void SetLocator(vtkAbstractPointLocator id0)
  {
    SetLocator_39(id0);
  }

  private native long GetLocator_40();
  public vtkAbstractPointLocator GetLocator()
  {
    long temp = GetLocator_40();

    if (temp == 0) return null;
    return (vtkAbstractPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkEuclideanClusterExtraction() { super(); }

  public vtkEuclideanClusterExtraction(long id) { super(id); }
  public native long   VTKInit();

}
