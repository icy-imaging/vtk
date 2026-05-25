// java wrapper for vtkFixedPointVolumeRayCastMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFixedPointVolumeRayCastMapper extends vtkVolumeMapper
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

  private native void SetSampleDistance_4(float id0);
  public void SetSampleDistance(float id0)
  {
    SetSampleDistance_4(id0);
  }

  private native float GetSampleDistance_5();
  public float GetSampleDistance()
  {
    return GetSampleDistance_5();
  }

  private native void SetInteractiveSampleDistance_6(float id0);
  public void SetInteractiveSampleDistance(float id0)
  {
    SetInteractiveSampleDistance_6(id0);
  }

  private native float GetInteractiveSampleDistance_7();
  public float GetInteractiveSampleDistance()
  {
    return GetInteractiveSampleDistance_7();
  }

  private native void SetImageSampleDistance_8(float id0);
  public void SetImageSampleDistance(float id0)
  {
    SetImageSampleDistance_8(id0);
  }

  private native float GetImageSampleDistanceMinValue_9();
  public float GetImageSampleDistanceMinValue()
  {
    return GetImageSampleDistanceMinValue_9();
  }

  private native float GetImageSampleDistanceMaxValue_10();
  public float GetImageSampleDistanceMaxValue()
  {
    return GetImageSampleDistanceMaxValue_10();
  }

  private native float GetImageSampleDistance_11();
  public float GetImageSampleDistance()
  {
    return GetImageSampleDistance_11();
  }

  private native void SetMinimumImageSampleDistance_12(float id0);
  public void SetMinimumImageSampleDistance(float id0)
  {
    SetMinimumImageSampleDistance_12(id0);
  }

  private native float GetMinimumImageSampleDistanceMinValue_13();
  public float GetMinimumImageSampleDistanceMinValue()
  {
    return GetMinimumImageSampleDistanceMinValue_13();
  }

  private native float GetMinimumImageSampleDistanceMaxValue_14();
  public float GetMinimumImageSampleDistanceMaxValue()
  {
    return GetMinimumImageSampleDistanceMaxValue_14();
  }

  private native float GetMinimumImageSampleDistance_15();
  public float GetMinimumImageSampleDistance()
  {
    return GetMinimumImageSampleDistance_15();
  }

  private native void SetMaximumImageSampleDistance_16(float id0);
  public void SetMaximumImageSampleDistance(float id0)
  {
    SetMaximumImageSampleDistance_16(id0);
  }

  private native float GetMaximumImageSampleDistanceMinValue_17();
  public float GetMaximumImageSampleDistanceMinValue()
  {
    return GetMaximumImageSampleDistanceMinValue_17();
  }

  private native float GetMaximumImageSampleDistanceMaxValue_18();
  public float GetMaximumImageSampleDistanceMaxValue()
  {
    return GetMaximumImageSampleDistanceMaxValue_18();
  }

  private native float GetMaximumImageSampleDistance_19();
  public float GetMaximumImageSampleDistance()
  {
    return GetMaximumImageSampleDistance_19();
  }

  private native void SetAutoAdjustSampleDistances_20(int id0);
  public void SetAutoAdjustSampleDistances(int id0)
  {
    SetAutoAdjustSampleDistances_20(id0);
  }

  private native int GetAutoAdjustSampleDistancesMinValue_21();
  public int GetAutoAdjustSampleDistancesMinValue()
  {
    return GetAutoAdjustSampleDistancesMinValue_21();
  }

  private native int GetAutoAdjustSampleDistancesMaxValue_22();
  public int GetAutoAdjustSampleDistancesMaxValue()
  {
    return GetAutoAdjustSampleDistancesMaxValue_22();
  }

  private native int GetAutoAdjustSampleDistances_23();
  public int GetAutoAdjustSampleDistances()
  {
    return GetAutoAdjustSampleDistances_23();
  }

  private native void AutoAdjustSampleDistancesOn_24();
  public void AutoAdjustSampleDistancesOn()
  {
    AutoAdjustSampleDistancesOn_24();
  }

  private native void AutoAdjustSampleDistancesOff_25();
  public void AutoAdjustSampleDistancesOff()
  {
    AutoAdjustSampleDistancesOff_25();
  }

  private native void SetLockSampleDistanceToInputSpacing_26(int id0);
  public void SetLockSampleDistanceToInputSpacing(int id0)
  {
    SetLockSampleDistanceToInputSpacing_26(id0);
  }

  private native int GetLockSampleDistanceToInputSpacingMinValue_27();
  public int GetLockSampleDistanceToInputSpacingMinValue()
  {
    return GetLockSampleDistanceToInputSpacingMinValue_27();
  }

  private native int GetLockSampleDistanceToInputSpacingMaxValue_28();
  public int GetLockSampleDistanceToInputSpacingMaxValue()
  {
    return GetLockSampleDistanceToInputSpacingMaxValue_28();
  }

  private native int GetLockSampleDistanceToInputSpacing_29();
  public int GetLockSampleDistanceToInputSpacing()
  {
    return GetLockSampleDistanceToInputSpacing_29();
  }

  private native void LockSampleDistanceToInputSpacingOn_30();
  public void LockSampleDistanceToInputSpacingOn()
  {
    LockSampleDistanceToInputSpacingOn_30();
  }

  private native void LockSampleDistanceToInputSpacingOff_31();
  public void LockSampleDistanceToInputSpacingOff()
  {
    LockSampleDistanceToInputSpacingOff_31();
  }

  private native void SetNumberOfThreads_32(int id0);
  public void SetNumberOfThreads(int id0)
  {
    SetNumberOfThreads_32(id0);
  }

  private native int GetNumberOfThreads_33();
  public int GetNumberOfThreads()
  {
    return GetNumberOfThreads_33();
  }

  private native void SetIntermixIntersectingGeometry_34(int id0);
  public void SetIntermixIntersectingGeometry(int id0)
  {
    SetIntermixIntersectingGeometry_34(id0);
  }

  private native int GetIntermixIntersectingGeometryMinValue_35();
  public int GetIntermixIntersectingGeometryMinValue()
  {
    return GetIntermixIntersectingGeometryMinValue_35();
  }

  private native int GetIntermixIntersectingGeometryMaxValue_36();
  public int GetIntermixIntersectingGeometryMaxValue()
  {
    return GetIntermixIntersectingGeometryMaxValue_36();
  }

  private native int GetIntermixIntersectingGeometry_37();
  public int GetIntermixIntersectingGeometry()
  {
    return GetIntermixIntersectingGeometry_37();
  }

  private native void IntermixIntersectingGeometryOn_38();
  public void IntermixIntersectingGeometryOn()
  {
    IntermixIntersectingGeometryOn_38();
  }

  private native void IntermixIntersectingGeometryOff_39();
  public void IntermixIntersectingGeometryOff()
  {
    IntermixIntersectingGeometryOff_39();
  }

  private native float ComputeRequiredImageSampleDistance_40(float id0,vtkRenderer id1);
  public float ComputeRequiredImageSampleDistance(float id0,vtkRenderer id1)
  {
    return ComputeRequiredImageSampleDistance_40(id0,id1);
  }

  private native float ComputeRequiredImageSampleDistance_41(float id0,vtkRenderer id1,vtkVolume id2);
  public float ComputeRequiredImageSampleDistance(float id0,vtkRenderer id1,vtkVolume id2)
  {
    return ComputeRequiredImageSampleDistance_41(id0,id1,id2);
  }

  private native void Render_42(vtkRenderer id0,vtkVolume id1);
  public void Render(vtkRenderer id0,vtkVolume id1)
  {
    Render_42(id0,id1);
  }

  private native int ToFixedPointPosition_43(float id0);
  public int ToFixedPointPosition(float id0)
  {
    return ToFixedPointPosition_43(id0);
  }

  private native int ToFixedPointDirection_44(float id0);
  public int ToFixedPointDirection(float id0)
  {
    return ToFixedPointDirection_44(id0);
  }

  private native long GetRenderWindow_45();
  public vtkRenderWindow GetRenderWindow()
  {
    long temp = GetRenderWindow_45();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMIPHelper_46();
  public vtkFixedPointVolumeRayCastMIPHelper GetMIPHelper()
  {
    long temp = GetMIPHelper_46();

    if (temp == 0) return null;
    return (vtkFixedPointVolumeRayCastMIPHelper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCompositeHelper_47();
  public vtkFixedPointVolumeRayCastCompositeHelper GetCompositeHelper()
  {
    long temp = GetCompositeHelper_47();

    if (temp == 0) return null;
    return (vtkFixedPointVolumeRayCastCompositeHelper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCompositeGOHelper_48();
  public vtkFixedPointVolumeRayCastCompositeGOHelper GetCompositeGOHelper()
  {
    long temp = GetCompositeGOHelper_48();

    if (temp == 0) return null;
    return (vtkFixedPointVolumeRayCastCompositeGOHelper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCompositeGOShadeHelper_49();
  public vtkFixedPointVolumeRayCastCompositeGOShadeHelper GetCompositeGOShadeHelper()
  {
    long temp = GetCompositeGOShadeHelper_49();

    if (temp == 0) return null;
    return (vtkFixedPointVolumeRayCastCompositeGOShadeHelper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCompositeShadeHelper_50();
  public vtkFixedPointVolumeRayCastCompositeShadeHelper GetCompositeShadeHelper()
  {
    long temp = GetCompositeShadeHelper_50();

    if (temp == 0) return null;
    return (vtkFixedPointVolumeRayCastCompositeShadeHelper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native float[] GetTableShift_51();
  public float[] GetTableShift()
  {
    return GetTableShift_51();
  }

  private native float[] GetTableScale_52();
  public float[] GetTableScale()
  {
    return GetTableScale_52();
  }

  private native int GetShadingRequired_53();
  public int GetShadingRequired()
  {
    return GetShadingRequired_53();
  }

  private native int GetGradientOpacityRequired_54();
  public int GetGradientOpacityRequired()
  {
    return GetGradientOpacityRequired_54();
  }

  private native long GetCurrentScalars_55();
  public vtkDataArray GetCurrentScalars()
  {
    long temp = GetCurrentScalars_55();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPreviousScalars_56();
  public vtkDataArray GetPreviousScalars()
  {
    long temp = GetPreviousScalars_56();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVolume_57();
  public vtkVolume GetVolume()
  {
    long temp = GetVolume_57();

    if (temp == 0) return null;
    return (vtkVolume)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeRayInfo_58(vtkVolume id0);
  public void InitializeRayInfo(vtkVolume id0)
  {
    InitializeRayInfo_58(id0);
  }

  private native int ShouldUseNearestNeighborInterpolation_59(vtkVolume id0);
  public int ShouldUseNearestNeighborInterpolation(vtkVolume id0)
  {
    return ShouldUseNearestNeighborInterpolation_59(id0);
  }

  private native void SetRayCastImage_60(vtkFixedPointRayCastImage id0);
  public void SetRayCastImage(vtkFixedPointRayCastImage id0)
  {
    SetRayCastImage_60(id0);
  }

  private native long GetRayCastImage_61();
  public vtkFixedPointRayCastImage GetRayCastImage()
  {
    long temp = GetRayCastImage_61();

    if (temp == 0) return null;
    return (vtkFixedPointRayCastImage)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void PerVolumeInitialization_62(vtkRenderer id0,vtkVolume id1);
  public void PerVolumeInitialization(vtkRenderer id0,vtkVolume id1)
  {
    PerVolumeInitialization_62(id0,id1);
  }

  private native void PerSubVolumeInitialization_63(vtkRenderer id0,vtkVolume id1,int id2);
  public void PerSubVolumeInitialization(vtkRenderer id0,vtkVolume id1,int id2)
  {
    PerSubVolumeInitialization_63(id0,id1,id2);
  }

  private native void RenderSubVolume_64();
  public void RenderSubVolume()
  {
    RenderSubVolume_64();
  }

  private native void DisplayRenderedImage_65(vtkRenderer id0,vtkVolume id1);
  public void DisplayRenderedImage(vtkRenderer id0,vtkVolume id1)
  {
    DisplayRenderedImage_65(id0,id1);
  }

  private native void AbortRender_66();
  public void AbortRender()
  {
    AbortRender_66();
  }

  private native void CreateCanonicalView_67(vtkVolume id0,vtkImageData id1,int id2,double id3[],double id4[]);
  public void CreateCanonicalView(vtkVolume id0,vtkImageData id1,int id2,double id3[],double id4[])
  {
    CreateCanonicalView_67(id0,id1,id2,id3,id4);
  }

  private native float GetEstimatedRenderTime_68(vtkRenderer id0,vtkVolume id1);
  public float GetEstimatedRenderTime(vtkRenderer id0,vtkVolume id1)
  {
    return GetEstimatedRenderTime_68(id0,id1);
  }

  private native float GetEstimatedRenderTime_69(vtkRenderer id0);
  public float GetEstimatedRenderTime(vtkRenderer id0)
  {
    return GetEstimatedRenderTime_69(id0);
  }

  private native void SetFinalColorWindow_70(float id0);
  public void SetFinalColorWindow(float id0)
  {
    SetFinalColorWindow_70(id0);
  }

  private native float GetFinalColorWindow_71();
  public float GetFinalColorWindow()
  {
    return GetFinalColorWindow_71();
  }

  private native void SetFinalColorLevel_72(float id0);
  public void SetFinalColorLevel(float id0)
  {
    SetFinalColorLevel_72(id0);
  }

  private native float GetFinalColorLevel_73();
  public float GetFinalColorLevel()
  {
    return GetFinalColorLevel_73();
  }

  private native int GetFlipMIPComparison_74();
  public int GetFlipMIPComparison()
  {
    return GetFlipMIPComparison_74();
  }

  private native void ReleaseGraphicsResources_75(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_75(id0);
  }

  public vtkFixedPointVolumeRayCastMapper() { super(); }

  public vtkFixedPointVolumeRayCastMapper(long id) { super(id); }
  public native long   VTKInit();

}
