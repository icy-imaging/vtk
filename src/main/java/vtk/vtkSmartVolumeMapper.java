// java wrapper for vtkSmartVolumeMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSmartVolumeMapper extends vtkVolumeMapper
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

  private native void SetFinalColorWindow_4(float id0);
  public void SetFinalColorWindow(float id0)
  {
    SetFinalColorWindow_4(id0);
  }

  private native float GetFinalColorWindow_5();
  public float GetFinalColorWindow()
  {
    return GetFinalColorWindow_5();
  }

  private native void SetFinalColorLevel_6(float id0);
  public void SetFinalColorLevel(float id0)
  {
    SetFinalColorLevel_6(id0);
  }

  private native float GetFinalColorLevel_7();
  public float GetFinalColorLevel()
  {
    return GetFinalColorLevel_7();
  }

  private native void SetRequestedRenderMode_8(int id0);
  public void SetRequestedRenderMode(int id0)
  {
    SetRequestedRenderMode_8(id0);
  }

  private native void SetRequestedRenderModeToDefault_9();
  public void SetRequestedRenderModeToDefault()
  {
    SetRequestedRenderModeToDefault_9();
  }

  private native void SetRequestedRenderModeToRayCast_10();
  public void SetRequestedRenderModeToRayCast()
  {
    SetRequestedRenderModeToRayCast_10();
  }

  private native void SetRequestedRenderModeToGPU_11();
  public void SetRequestedRenderModeToGPU()
  {
    SetRequestedRenderModeToGPU_11();
  }

  private native void SetRequestedRenderModeToOSPRay_12();
  public void SetRequestedRenderModeToOSPRay()
  {
    SetRequestedRenderModeToOSPRay_12();
  }

  private native void SetRequestedRenderModeToAnari_13();
  public void SetRequestedRenderModeToAnari()
  {
    SetRequestedRenderModeToAnari_13();
  }

  private native int GetRequestedRenderMode_14();
  public int GetRequestedRenderMode()
  {
    return GetRequestedRenderMode_14();
  }

  private native int GetLastUsedRenderMode_15();
  public int GetLastUsedRenderMode()
  {
    return GetLastUsedRenderMode_15();
  }

  private native void SetMaxMemoryInBytes_16(long id0);
  public void SetMaxMemoryInBytes(long id0)
  {
    SetMaxMemoryInBytes_16(id0);
  }

  private native long GetMaxMemoryInBytes_17();
  public long GetMaxMemoryInBytes()
  {
    return GetMaxMemoryInBytes_17();
  }

  private native void SetMaxMemoryFraction_18(float id0);
  public void SetMaxMemoryFraction(float id0)
  {
    SetMaxMemoryFraction_18(id0);
  }

  private native float GetMaxMemoryFractionMinValue_19();
  public float GetMaxMemoryFractionMinValue()
  {
    return GetMaxMemoryFractionMinValue_19();
  }

  private native float GetMaxMemoryFractionMaxValue_20();
  public float GetMaxMemoryFractionMaxValue()
  {
    return GetMaxMemoryFractionMaxValue_20();
  }

  private native float GetMaxMemoryFraction_21();
  public float GetMaxMemoryFraction()
  {
    return GetMaxMemoryFraction_21();
  }

  private native void SetInterpolationMode_22(int id0);
  public void SetInterpolationMode(int id0)
  {
    SetInterpolationMode_22(id0);
  }

  private native int GetInterpolationModeMinValue_23();
  public int GetInterpolationModeMinValue()
  {
    return GetInterpolationModeMinValue_23();
  }

  private native int GetInterpolationModeMaxValue_24();
  public int GetInterpolationModeMaxValue()
  {
    return GetInterpolationModeMaxValue_24();
  }

  private native int GetInterpolationMode_25();
  public int GetInterpolationMode()
  {
    return GetInterpolationMode_25();
  }

  private native void SetInterpolationModeToNearestNeighbor_26();
  public void SetInterpolationModeToNearestNeighbor()
  {
    SetInterpolationModeToNearestNeighbor_26();
  }

  private native void SetInterpolationModeToLinear_27();
  public void SetInterpolationModeToLinear()
  {
    SetInterpolationModeToLinear_27();
  }

  private native void SetInterpolationModeToCubic_28();
  public void SetInterpolationModeToCubic()
  {
    SetInterpolationModeToCubic_28();
  }

  private native void CreateCanonicalView_29(vtkRenderer id0,vtkVolume id1,vtkVolume id2,vtkImageData id3,int id4,double id5[],double id6[]);
  public void CreateCanonicalView(vtkRenderer id0,vtkVolume id1,vtkVolume id2,vtkImageData id3,int id4,double id5[],double id6[])
  {
    CreateCanonicalView_29(id0,id1,id2,id3,id4,id5,id6);
  }

  private native void SetUseJittering_30(int id0);
  public void SetUseJittering(int id0)
  {
    SetUseJittering_30(id0);
  }

  private native int GetUseJitteringMinValue_31();
  public int GetUseJitteringMinValue()
  {
    return GetUseJitteringMinValue_31();
  }

  private native int GetUseJitteringMaxValue_32();
  public int GetUseJitteringMaxValue()
  {
    return GetUseJitteringMaxValue_32();
  }

  private native int GetUseJittering_33();
  public int GetUseJittering()
  {
    return GetUseJittering_33();
  }

  private native void UseJitteringOn_34();
  public void UseJitteringOn()
  {
    UseJitteringOn_34();
  }

  private native void UseJitteringOff_35();
  public void UseJitteringOff()
  {
    UseJitteringOff_35();
  }

  private native void SetInteractiveUpdateRate_36(double id0);
  public void SetInteractiveUpdateRate(double id0)
  {
    SetInteractiveUpdateRate_36(id0);
  }

  private native double GetInteractiveUpdateRateMinValue_37();
  public double GetInteractiveUpdateRateMinValue()
  {
    return GetInteractiveUpdateRateMinValue_37();
  }

  private native double GetInteractiveUpdateRateMaxValue_38();
  public double GetInteractiveUpdateRateMaxValue()
  {
    return GetInteractiveUpdateRateMaxValue_38();
  }

  private native double GetInteractiveUpdateRate_39();
  public double GetInteractiveUpdateRate()
  {
    return GetInteractiveUpdateRate_39();
  }

  private native void SetInteractiveAdjustSampleDistances_40(int id0);
  public void SetInteractiveAdjustSampleDistances(int id0)
  {
    SetInteractiveAdjustSampleDistances_40(id0);
  }

  private native int GetInteractiveAdjustSampleDistancesMinValue_41();
  public int GetInteractiveAdjustSampleDistancesMinValue()
  {
    return GetInteractiveAdjustSampleDistancesMinValue_41();
  }

  private native int GetInteractiveAdjustSampleDistancesMaxValue_42();
  public int GetInteractiveAdjustSampleDistancesMaxValue()
  {
    return GetInteractiveAdjustSampleDistancesMaxValue_42();
  }

  private native int GetInteractiveAdjustSampleDistances_43();
  public int GetInteractiveAdjustSampleDistances()
  {
    return GetInteractiveAdjustSampleDistances_43();
  }

  private native void InteractiveAdjustSampleDistancesOn_44();
  public void InteractiveAdjustSampleDistancesOn()
  {
    InteractiveAdjustSampleDistancesOn_44();
  }

  private native void InteractiveAdjustSampleDistancesOff_45();
  public void InteractiveAdjustSampleDistancesOff()
  {
    InteractiveAdjustSampleDistancesOff_45();
  }

  private native void SetAutoAdjustSampleDistances_46(int id0);
  public void SetAutoAdjustSampleDistances(int id0)
  {
    SetAutoAdjustSampleDistances_46(id0);
  }

  private native int GetAutoAdjustSampleDistancesMinValue_47();
  public int GetAutoAdjustSampleDistancesMinValue()
  {
    return GetAutoAdjustSampleDistancesMinValue_47();
  }

  private native int GetAutoAdjustSampleDistancesMaxValue_48();
  public int GetAutoAdjustSampleDistancesMaxValue()
  {
    return GetAutoAdjustSampleDistancesMaxValue_48();
  }

  private native int GetAutoAdjustSampleDistances_49();
  public int GetAutoAdjustSampleDistances()
  {
    return GetAutoAdjustSampleDistances_49();
  }

  private native void AutoAdjustSampleDistancesOn_50();
  public void AutoAdjustSampleDistancesOn()
  {
    AutoAdjustSampleDistancesOn_50();
  }

  private native void AutoAdjustSampleDistancesOff_51();
  public void AutoAdjustSampleDistancesOff()
  {
    AutoAdjustSampleDistancesOff_51();
  }

  private native void SetSampleDistance_52(float id0);
  public void SetSampleDistance(float id0)
  {
    SetSampleDistance_52(id0);
  }

  private native float GetSampleDistance_53();
  public float GetSampleDistance()
  {
    return GetSampleDistance_53();
  }

  private native void SetGlobalIlluminationReach_54(float id0);
  public void SetGlobalIlluminationReach(float id0)
  {
    SetGlobalIlluminationReach_54(id0);
  }

  private native float GetGlobalIlluminationReachMinValue_55();
  public float GetGlobalIlluminationReachMinValue()
  {
    return GetGlobalIlluminationReachMinValue_55();
  }

  private native float GetGlobalIlluminationReachMaxValue_56();
  public float GetGlobalIlluminationReachMaxValue()
  {
    return GetGlobalIlluminationReachMaxValue_56();
  }

  private native float GetGlobalIlluminationReach_57();
  public float GetGlobalIlluminationReach()
  {
    return GetGlobalIlluminationReach_57();
  }

  private native void SetVolumetricScatteringBlending_58(float id0);
  public void SetVolumetricScatteringBlending(float id0)
  {
    SetVolumetricScatteringBlending_58(id0);
  }

  private native float GetVolumetricScatteringBlendingMinValue_59();
  public float GetVolumetricScatteringBlendingMinValue()
  {
    return GetVolumetricScatteringBlendingMinValue_59();
  }

  private native float GetVolumetricScatteringBlendingMaxValue_60();
  public float GetVolumetricScatteringBlendingMaxValue()
  {
    return GetVolumetricScatteringBlendingMaxValue_60();
  }

  private native float GetVolumetricScatteringBlending_61();
  public float GetVolumetricScatteringBlending()
  {
    return GetVolumetricScatteringBlending_61();
  }

  private native void Render_62(vtkRenderer id0,vtkVolume id1);
  public void Render(vtkRenderer id0,vtkVolume id1)
  {
    Render_62(id0,id1);
  }

  private native void ReleaseGraphicsResources_63(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_63(id0);
  }

  private native void SetVectorMode_64(int id0);
  public void SetVectorMode(int id0)
  {
    SetVectorMode_64(id0);
  }

  private native int GetVectorMode_65();
  public int GetVectorMode()
  {
    return GetVectorMode_65();
  }

  private native void SetVectorComponent_66(int id0);
  public void SetVectorComponent(int id0)
  {
    SetVectorComponent_66(id0);
  }

  private native int GetVectorComponentMinValue_67();
  public int GetVectorComponentMinValue()
  {
    return GetVectorComponentMinValue_67();
  }

  private native int GetVectorComponentMaxValue_68();
  public int GetVectorComponentMaxValue()
  {
    return GetVectorComponentMaxValue_68();
  }

  private native int GetVectorComponent_69();
  public int GetVectorComponent()
  {
    return GetVectorComponent_69();
  }

  private native void SetTransfer2DYAxisArray_70(byte[] id0, int len0);
  public void SetTransfer2DYAxisArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTransfer2DYAxisArray_70(bytes0, bytes0.length);
  }

  private native byte[] GetTransfer2DYAxisArray_71();
  public String GetTransfer2DYAxisArray()
  {
    return new String(GetTransfer2DYAxisArray_71(), StandardCharsets.UTF_8);
  }

  private native void SetLowResMode_72(int id0);
  public void SetLowResMode(int id0)
  {
    SetLowResMode_72(id0);
  }

  private native int GetLowResMode_73();
  public int GetLowResMode()
  {
    return GetLowResMode_73();
  }

  public vtkSmartVolumeMapper() { super(); }

  public vtkSmartVolumeMapper(long id) { super(id); }
  public native long   VTKInit();

}
