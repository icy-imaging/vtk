// java wrapper for vtkVoronoi2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVoronoi2D extends vtkPolyDataAlgorithm
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

  private native void SetPadding_4(double id0);
  public void SetPadding(double id0)
  {
    SetPadding_4(id0);
  }

  private native double GetPaddingMinValue_5();
  public double GetPaddingMinValue()
  {
    return GetPaddingMinValue_5();
  }

  private native double GetPaddingMaxValue_6();
  public double GetPaddingMaxValue()
  {
    return GetPaddingMaxValue_6();
  }

  private native double GetPadding_7();
  public double GetPadding()
  {
    return GetPadding_7();
  }

  private native void SetGenerateScalars_8(int id0);
  public void SetGenerateScalars(int id0)
  {
    SetGenerateScalars_8(id0);
  }

  private native int GetGenerateScalars_9();
  public int GetGenerateScalars()
  {
    return GetGenerateScalars_9();
  }

  private native void SetGenerateScalarsToNone_10();
  public void SetGenerateScalarsToNone()
  {
    SetGenerateScalarsToNone_10();
  }

  private native void SetGenerateScalarsToPointIds_11();
  public void SetGenerateScalarsToPointIds()
  {
    SetGenerateScalarsToPointIds_11();
  }

  private native void SetGenerateScalarsToThreadIds_12();
  public void SetGenerateScalarsToThreadIds()
  {
    SetGenerateScalarsToThreadIds_12();
  }

  private native void SetTransform_13(vtkAbstractTransform id0);
  public void SetTransform(vtkAbstractTransform id0)
  {
    SetTransform_13(id0);
  }

  private native long GetTransform_14();
  public vtkAbstractTransform GetTransform()
  {
    long temp = GetTransform_14();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetProjectionPlaneMode_15(int id0);
  public void SetProjectionPlaneMode(int id0)
  {
    SetProjectionPlaneMode_15(id0);
  }

  private native int GetProjectionPlaneModeMinValue_16();
  public int GetProjectionPlaneModeMinValue()
  {
    return GetProjectionPlaneModeMinValue_16();
  }

  private native int GetProjectionPlaneModeMaxValue_17();
  public int GetProjectionPlaneModeMaxValue()
  {
    return GetProjectionPlaneModeMaxValue_17();
  }

  private native int GetProjectionPlaneMode_18();
  public int GetProjectionPlaneMode()
  {
    return GetProjectionPlaneMode_18();
  }

  private native void SetProjectionPlaneModeToXYPlane_19();
  public void SetProjectionPlaneModeToXYPlane()
  {
    SetProjectionPlaneModeToXYPlane_19();
  }

  private native void SetProjectionPlaneModeToSpecifiedTransformPlane_20();
  public void SetProjectionPlaneModeToSpecifiedTransformPlane()
  {
    SetProjectionPlaneModeToSpecifiedTransformPlane_20();
  }

  private native void SetProjectionPlaneModeToBestFittingPlane_21();
  public void SetProjectionPlaneModeToBestFittingPlane()
  {
    SetProjectionPlaneModeToBestFittingPlane_21();
  }

  private native void SetPointOfInterest_22(long id0);
  public void SetPointOfInterest(long id0)
  {
    SetPointOfInterest_22(id0);
  }

  private native long GetPointOfInterestMinValue_23();
  public long GetPointOfInterestMinValue()
  {
    return GetPointOfInterestMinValue_23();
  }

  private native long GetPointOfInterestMaxValue_24();
  public long GetPointOfInterestMaxValue()
  {
    return GetPointOfInterestMaxValue_24();
  }

  private native long GetPointOfInterest_25();
  public long GetPointOfInterest()
  {
    return GetPointOfInterest_25();
  }

  private native void SetMaximumNumberOfTileClips_26(long id0);
  public void SetMaximumNumberOfTileClips(long id0)
  {
    SetMaximumNumberOfTileClips_26(id0);
  }

  private native long GetMaximumNumberOfTileClipsMinValue_27();
  public long GetMaximumNumberOfTileClipsMinValue()
  {
    return GetMaximumNumberOfTileClipsMinValue_27();
  }

  private native long GetMaximumNumberOfTileClipsMaxValue_28();
  public long GetMaximumNumberOfTileClipsMaxValue()
  {
    return GetMaximumNumberOfTileClipsMaxValue_28();
  }

  private native long GetMaximumNumberOfTileClips_29();
  public long GetMaximumNumberOfTileClips()
  {
    return GetMaximumNumberOfTileClips_29();
  }

  private native long GetLocator_30();
  public vtkStaticPointLocator2D GetLocator()
  {
    long temp = GetLocator_30();

    if (temp == 0) return null;
    return (vtkStaticPointLocator2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGenerateVoronoiFlower_31(int id0);
  public void SetGenerateVoronoiFlower(int id0)
  {
    SetGenerateVoronoiFlower_31(id0);
  }

  private native int GetGenerateVoronoiFlower_32();
  public int GetGenerateVoronoiFlower()
  {
    return GetGenerateVoronoiFlower_32();
  }

  private native void GenerateVoronoiFlowerOn_33();
  public void GenerateVoronoiFlowerOn()
  {
    GenerateVoronoiFlowerOn_33();
  }

  private native void GenerateVoronoiFlowerOff_34();
  public void GenerateVoronoiFlowerOff()
  {
    GenerateVoronoiFlowerOff_34();
  }

  private native long GetSpheres_35();
  public vtkSpheres GetSpheres()
  {
    long temp = GetSpheres_35();

    if (temp == 0) return null;
    return (vtkSpheres)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfThreadsUsed_36();
  public int GetNumberOfThreadsUsed()
  {
    return GetNumberOfThreadsUsed_36();
  }

  private native long GetMTime_37();
  public long GetMTime()
  {
    return GetMTime_37();
  }

  public vtkVoronoi2D() { super(); }

  public vtkVoronoi2D(long id) { super(id); }
  public native long   VTKInit();

}
