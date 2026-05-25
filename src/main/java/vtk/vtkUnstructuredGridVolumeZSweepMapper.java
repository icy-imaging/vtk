// java wrapper for vtkUnstructuredGridVolumeZSweepMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUnstructuredGridVolumeZSweepMapper extends vtkUnstructuredGridVolumeMapper
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

  private native void SetImageSampleDistance_4(float id0);
  public void SetImageSampleDistance(float id0)
  {
    SetImageSampleDistance_4(id0);
  }

  private native float GetImageSampleDistanceMinValue_5();
  public float GetImageSampleDistanceMinValue()
  {
    return GetImageSampleDistanceMinValue_5();
  }

  private native float GetImageSampleDistanceMaxValue_6();
  public float GetImageSampleDistanceMaxValue()
  {
    return GetImageSampleDistanceMaxValue_6();
  }

  private native float GetImageSampleDistance_7();
  public float GetImageSampleDistance()
  {
    return GetImageSampleDistance_7();
  }

  private native void SetMinimumImageSampleDistance_8(float id0);
  public void SetMinimumImageSampleDistance(float id0)
  {
    SetMinimumImageSampleDistance_8(id0);
  }

  private native float GetMinimumImageSampleDistanceMinValue_9();
  public float GetMinimumImageSampleDistanceMinValue()
  {
    return GetMinimumImageSampleDistanceMinValue_9();
  }

  private native float GetMinimumImageSampleDistanceMaxValue_10();
  public float GetMinimumImageSampleDistanceMaxValue()
  {
    return GetMinimumImageSampleDistanceMaxValue_10();
  }

  private native float GetMinimumImageSampleDistance_11();
  public float GetMinimumImageSampleDistance()
  {
    return GetMinimumImageSampleDistance_11();
  }

  private native void SetMaximumImageSampleDistance_12(float id0);
  public void SetMaximumImageSampleDistance(float id0)
  {
    SetMaximumImageSampleDistance_12(id0);
  }

  private native float GetMaximumImageSampleDistanceMinValue_13();
  public float GetMaximumImageSampleDistanceMinValue()
  {
    return GetMaximumImageSampleDistanceMinValue_13();
  }

  private native float GetMaximumImageSampleDistanceMaxValue_14();
  public float GetMaximumImageSampleDistanceMaxValue()
  {
    return GetMaximumImageSampleDistanceMaxValue_14();
  }

  private native float GetMaximumImageSampleDistance_15();
  public float GetMaximumImageSampleDistance()
  {
    return GetMaximumImageSampleDistance_15();
  }

  private native void SetAutoAdjustSampleDistances_16(int id0);
  public void SetAutoAdjustSampleDistances(int id0)
  {
    SetAutoAdjustSampleDistances_16(id0);
  }

  private native int GetAutoAdjustSampleDistancesMinValue_17();
  public int GetAutoAdjustSampleDistancesMinValue()
  {
    return GetAutoAdjustSampleDistancesMinValue_17();
  }

  private native int GetAutoAdjustSampleDistancesMaxValue_18();
  public int GetAutoAdjustSampleDistancesMaxValue()
  {
    return GetAutoAdjustSampleDistancesMaxValue_18();
  }

  private native int GetAutoAdjustSampleDistances_19();
  public int GetAutoAdjustSampleDistances()
  {
    return GetAutoAdjustSampleDistances_19();
  }

  private native void AutoAdjustSampleDistancesOn_20();
  public void AutoAdjustSampleDistancesOn()
  {
    AutoAdjustSampleDistancesOn_20();
  }

  private native void AutoAdjustSampleDistancesOff_21();
  public void AutoAdjustSampleDistancesOff()
  {
    AutoAdjustSampleDistancesOff_21();
  }

  private native void SetIntermixIntersectingGeometry_22(int id0);
  public void SetIntermixIntersectingGeometry(int id0)
  {
    SetIntermixIntersectingGeometry_22(id0);
  }

  private native int GetIntermixIntersectingGeometryMinValue_23();
  public int GetIntermixIntersectingGeometryMinValue()
  {
    return GetIntermixIntersectingGeometryMinValue_23();
  }

  private native int GetIntermixIntersectingGeometryMaxValue_24();
  public int GetIntermixIntersectingGeometryMaxValue()
  {
    return GetIntermixIntersectingGeometryMaxValue_24();
  }

  private native int GetIntermixIntersectingGeometry_25();
  public int GetIntermixIntersectingGeometry()
  {
    return GetIntermixIntersectingGeometry_25();
  }

  private native void IntermixIntersectingGeometryOn_26();
  public void IntermixIntersectingGeometryOn()
  {
    IntermixIntersectingGeometryOn_26();
  }

  private native void IntermixIntersectingGeometryOff_27();
  public void IntermixIntersectingGeometryOff()
  {
    IntermixIntersectingGeometryOff_27();
  }

  private native int GetMaxPixelListSize_28();
  public int GetMaxPixelListSize()
  {
    return GetMaxPixelListSize_28();
  }

  private native void SetMaxPixelListSize_29(int id0);
  public void SetMaxPixelListSize(int id0)
  {
    SetMaxPixelListSize_29(id0);
  }

  private native void SetRayIntegrator_30(vtkUnstructuredGridVolumeRayIntegrator id0);
  public void SetRayIntegrator(vtkUnstructuredGridVolumeRayIntegrator id0)
  {
    SetRayIntegrator_30(id0);
  }

  private native long GetRayIntegrator_31();
  public vtkUnstructuredGridVolumeRayIntegrator GetRayIntegrator()
  {
    long temp = GetRayIntegrator_31();

    if (temp == 0) return null;
    return (vtkUnstructuredGridVolumeRayIntegrator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Render_32(vtkRenderer id0,vtkVolume id1);
  public void Render(vtkRenderer id0,vtkVolume id1)
  {
    Render_32(id0,id1);
  }

  private native int[] GetImageInUseSize_33();
  public int[] GetImageInUseSize()
  {
    return GetImageInUseSize_33();
  }

  private native int[] GetImageOrigin_34();
  public int[] GetImageOrigin()
  {
    return GetImageOrigin_34();
  }

  private native int[] GetImageViewportSize_35();
  public int[] GetImageViewportSize()
  {
    return GetImageViewportSize_35();
  }

  public vtkUnstructuredGridVolumeZSweepMapper() { super(); }

  public vtkUnstructuredGridVolumeZSweepMapper(long id) { super(id); }
  public native long   VTKInit();

}
