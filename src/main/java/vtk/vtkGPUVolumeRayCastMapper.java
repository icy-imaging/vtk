// java wrapper for vtkGPUVolumeRayCastMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGPUVolumeRayCastMapper extends vtkVolumeMapper
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

  private native void SetAutoAdjustSampleDistances_4(int id0);
  public void SetAutoAdjustSampleDistances(int id0)
  {
    SetAutoAdjustSampleDistances_4(id0);
  }

  private native int GetAutoAdjustSampleDistancesMinValue_5();
  public int GetAutoAdjustSampleDistancesMinValue()
  {
    return GetAutoAdjustSampleDistancesMinValue_5();
  }

  private native int GetAutoAdjustSampleDistancesMaxValue_6();
  public int GetAutoAdjustSampleDistancesMaxValue()
  {
    return GetAutoAdjustSampleDistancesMaxValue_6();
  }

  private native int GetAutoAdjustSampleDistances_7();
  public int GetAutoAdjustSampleDistances()
  {
    return GetAutoAdjustSampleDistances_7();
  }

  private native void AutoAdjustSampleDistancesOn_8();
  public void AutoAdjustSampleDistancesOn()
  {
    AutoAdjustSampleDistancesOn_8();
  }

  private native void AutoAdjustSampleDistancesOff_9();
  public void AutoAdjustSampleDistancesOff()
  {
    AutoAdjustSampleDistancesOff_9();
  }

  private native void SetLockSampleDistanceToInputSpacing_10(int id0);
  public void SetLockSampleDistanceToInputSpacing(int id0)
  {
    SetLockSampleDistanceToInputSpacing_10(id0);
  }

  private native int GetLockSampleDistanceToInputSpacingMinValue_11();
  public int GetLockSampleDistanceToInputSpacingMinValue()
  {
    return GetLockSampleDistanceToInputSpacingMinValue_11();
  }

  private native int GetLockSampleDistanceToInputSpacingMaxValue_12();
  public int GetLockSampleDistanceToInputSpacingMaxValue()
  {
    return GetLockSampleDistanceToInputSpacingMaxValue_12();
  }

  private native int GetLockSampleDistanceToInputSpacing_13();
  public int GetLockSampleDistanceToInputSpacing()
  {
    return GetLockSampleDistanceToInputSpacing_13();
  }

  private native void LockSampleDistanceToInputSpacingOn_14();
  public void LockSampleDistanceToInputSpacingOn()
  {
    LockSampleDistanceToInputSpacingOn_14();
  }

  private native void LockSampleDistanceToInputSpacingOff_15();
  public void LockSampleDistanceToInputSpacingOff()
  {
    LockSampleDistanceToInputSpacingOff_15();
  }

  private native void SetUseJittering_16(int id0);
  public void SetUseJittering(int id0)
  {
    SetUseJittering_16(id0);
  }

  private native int GetUseJitteringMinValue_17();
  public int GetUseJitteringMinValue()
  {
    return GetUseJitteringMinValue_17();
  }

  private native int GetUseJitteringMaxValue_18();
  public int GetUseJitteringMaxValue()
  {
    return GetUseJitteringMaxValue_18();
  }

  private native int GetUseJittering_19();
  public int GetUseJittering()
  {
    return GetUseJittering_19();
  }

  private native void UseJitteringOn_20();
  public void UseJitteringOn()
  {
    UseJitteringOn_20();
  }

  private native void UseJitteringOff_21();
  public void UseJitteringOff()
  {
    UseJitteringOff_21();
  }

  private native void SetUseDepthPass_22(int id0);
  public void SetUseDepthPass(int id0)
  {
    SetUseDepthPass_22(id0);
  }

  private native int GetUseDepthPassMinValue_23();
  public int GetUseDepthPassMinValue()
  {
    return GetUseDepthPassMinValue_23();
  }

  private native int GetUseDepthPassMaxValue_24();
  public int GetUseDepthPassMaxValue()
  {
    return GetUseDepthPassMaxValue_24();
  }

  private native int GetUseDepthPass_25();
  public int GetUseDepthPass()
  {
    return GetUseDepthPass_25();
  }

  private native void UseDepthPassOn_26();
  public void UseDepthPassOn()
  {
    UseDepthPassOn_26();
  }

  private native void UseDepthPassOff_27();
  public void UseDepthPassOff()
  {
    UseDepthPassOff_27();
  }

  private native long GetDepthPassContourValues_28();
  public vtkContourValues GetDepthPassContourValues()
  {
    long temp = GetDepthPassContourValues_28();

    if (temp == 0) return null;
    return (vtkContourValues)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSampleDistance_29(float id0);
  public void SetSampleDistance(float id0)
  {
    SetSampleDistance_29(id0);
  }

  private native float GetSampleDistance_30();
  public float GetSampleDistance()
  {
    return GetSampleDistance_30();
  }

  private native void SetImageSampleDistance_31(float id0);
  public void SetImageSampleDistance(float id0)
  {
    SetImageSampleDistance_31(id0);
  }

  private native float GetImageSampleDistanceMinValue_32();
  public float GetImageSampleDistanceMinValue()
  {
    return GetImageSampleDistanceMinValue_32();
  }

  private native float GetImageSampleDistanceMaxValue_33();
  public float GetImageSampleDistanceMaxValue()
  {
    return GetImageSampleDistanceMaxValue_33();
  }

  private native float GetImageSampleDistance_34();
  public float GetImageSampleDistance()
  {
    return GetImageSampleDistance_34();
  }

  private native void SetMinimumImageSampleDistance_35(float id0);
  public void SetMinimumImageSampleDistance(float id0)
  {
    SetMinimumImageSampleDistance_35(id0);
  }

  private native float GetMinimumImageSampleDistanceMinValue_36();
  public float GetMinimumImageSampleDistanceMinValue()
  {
    return GetMinimumImageSampleDistanceMinValue_36();
  }

  private native float GetMinimumImageSampleDistanceMaxValue_37();
  public float GetMinimumImageSampleDistanceMaxValue()
  {
    return GetMinimumImageSampleDistanceMaxValue_37();
  }

  private native float GetMinimumImageSampleDistance_38();
  public float GetMinimumImageSampleDistance()
  {
    return GetMinimumImageSampleDistance_38();
  }

  private native void SetMaximumImageSampleDistance_39(float id0);
  public void SetMaximumImageSampleDistance(float id0)
  {
    SetMaximumImageSampleDistance_39(id0);
  }

  private native float GetMaximumImageSampleDistanceMinValue_40();
  public float GetMaximumImageSampleDistanceMinValue()
  {
    return GetMaximumImageSampleDistanceMinValue_40();
  }

  private native float GetMaximumImageSampleDistanceMaxValue_41();
  public float GetMaximumImageSampleDistanceMaxValue()
  {
    return GetMaximumImageSampleDistanceMaxValue_41();
  }

  private native float GetMaximumImageSampleDistance_42();
  public float GetMaximumImageSampleDistance()
  {
    return GetMaximumImageSampleDistance_42();
  }

  private native void SetFinalColorWindow_43(float id0);
  public void SetFinalColorWindow(float id0)
  {
    SetFinalColorWindow_43(id0);
  }

  private native float GetFinalColorWindow_44();
  public float GetFinalColorWindow()
  {
    return GetFinalColorWindow_44();
  }

  private native void SetFinalColorLevel_45(float id0);
  public void SetFinalColorLevel(float id0)
  {
    SetFinalColorLevel_45(id0);
  }

  private native float GetFinalColorLevel_46();
  public float GetFinalColorLevel()
  {
    return GetFinalColorLevel_46();
  }

  private native void SetMaxMemoryInBytes_47(long id0);
  public void SetMaxMemoryInBytes(long id0)
  {
    SetMaxMemoryInBytes_47(id0);
  }

  private native long GetMaxMemoryInBytes_48();
  public long GetMaxMemoryInBytes()
  {
    return GetMaxMemoryInBytes_48();
  }

  private native void SetMaxMemoryFraction_49(float id0);
  public void SetMaxMemoryFraction(float id0)
  {
    SetMaxMemoryFraction_49(id0);
  }

  private native float GetMaxMemoryFractionMinValue_50();
  public float GetMaxMemoryFractionMinValue()
  {
    return GetMaxMemoryFractionMinValue_50();
  }

  private native float GetMaxMemoryFractionMaxValue_51();
  public float GetMaxMemoryFractionMaxValue()
  {
    return GetMaxMemoryFractionMaxValue_51();
  }

  private native float GetMaxMemoryFraction_52();
  public float GetMaxMemoryFraction()
  {
    return GetMaxMemoryFraction_52();
  }

  private native void SetReportProgress_53(boolean id0);
  public void SetReportProgress(boolean id0)
  {
    SetReportProgress_53(id0);
  }

  private native boolean GetReportProgress_54();
  public boolean GetReportProgress()
  {
    return GetReportProgress_54();
  }

  private native int IsRenderSupported_55(vtkRenderWindow id0,vtkVolumeProperty id1);
  public int IsRenderSupported(vtkRenderWindow id0,vtkVolumeProperty id1)
  {
    return IsRenderSupported_55(id0,id1);
  }

  private native void CreateCanonicalView_56(vtkRenderer id0,vtkVolume id1,vtkImageData id2,int id3,double id4[],double id5[]);
  public void CreateCanonicalView(vtkRenderer id0,vtkVolume id1,vtkImageData id2,int id3,double id4[],double id5[])
  {
    CreateCanonicalView_56(id0,id1,id2,id3,id4,id5);
  }

  private native void SetMaskInput_57(vtkImageData id0);
  public void SetMaskInput(vtkImageData id0)
  {
    SetMaskInput_57(id0);
  }

  private native long GetMaskInput_58();
  public vtkImageData GetMaskInput()
  {
    long temp = GetMaskInput_58();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMaskType_59(int id0);
  public void SetMaskType(int id0)
  {
    SetMaskType_59(id0);
  }

  private native int GetMaskType_60();
  public int GetMaskType()
  {
    return GetMaskType_60();
  }

  private native void SetMaskTypeToBinary_61();
  public void SetMaskTypeToBinary()
  {
    SetMaskTypeToBinary_61();
  }

  private native void SetMaskTypeToLabelMap_62();
  public void SetMaskTypeToLabelMap()
  {
    SetMaskTypeToLabelMap_62();
  }

  private native void SetMaskBlendFactor_63(float id0);
  public void SetMaskBlendFactor(float id0)
  {
    SetMaskBlendFactor_63(id0);
  }

  private native float GetMaskBlendFactorMinValue_64();
  public float GetMaskBlendFactorMinValue()
  {
    return GetMaskBlendFactorMinValue_64();
  }

  private native float GetMaskBlendFactorMaxValue_65();
  public float GetMaskBlendFactorMaxValue()
  {
    return GetMaskBlendFactorMaxValue_65();
  }

  private native float GetMaskBlendFactor_66();
  public float GetMaskBlendFactor()
  {
    return GetMaskBlendFactor_66();
  }

  private native void SetGlobalIlluminationReach_67(float id0);
  public void SetGlobalIlluminationReach(float id0)
  {
    SetGlobalIlluminationReach_67(id0);
  }

  private native float GetGlobalIlluminationReachMinValue_68();
  public float GetGlobalIlluminationReachMinValue()
  {
    return GetGlobalIlluminationReachMinValue_68();
  }

  private native float GetGlobalIlluminationReachMaxValue_69();
  public float GetGlobalIlluminationReachMaxValue()
  {
    return GetGlobalIlluminationReachMaxValue_69();
  }

  private native float GetGlobalIlluminationReach_70();
  public float GetGlobalIlluminationReach()
  {
    return GetGlobalIlluminationReach_70();
  }

  private native void SetVolumetricScatteringBlending_71(float id0);
  public void SetVolumetricScatteringBlending(float id0)
  {
    SetVolumetricScatteringBlending_71(id0);
  }

  private native float GetVolumetricScatteringBlendingMinValue_72();
  public float GetVolumetricScatteringBlendingMinValue()
  {
    return GetVolumetricScatteringBlendingMinValue_72();
  }

  private native float GetVolumetricScatteringBlendingMaxValue_73();
  public float GetVolumetricScatteringBlendingMaxValue()
  {
    return GetVolumetricScatteringBlendingMaxValue_73();
  }

  private native float GetVolumetricScatteringBlending_74();
  public float GetVolumetricScatteringBlending()
  {
    return GetVolumetricScatteringBlending_74();
  }

  private native void SetRenderToImage_75(int id0);
  public void SetRenderToImage(int id0)
  {
    SetRenderToImage_75(id0);
  }

  private native int GetRenderToImage_76();
  public int GetRenderToImage()
  {
    return GetRenderToImage_76();
  }

  private native void RenderToImageOn_77();
  public void RenderToImageOn()
  {
    RenderToImageOn_77();
  }

  private native void RenderToImageOff_78();
  public void RenderToImageOff()
  {
    RenderToImageOff_78();
  }

  private native void SetDepthImageScalarType_79(int id0);
  public void SetDepthImageScalarType(int id0)
  {
    SetDepthImageScalarType_79(id0);
  }

  private native int GetDepthImageScalarType_80();
  public int GetDepthImageScalarType()
  {
    return GetDepthImageScalarType_80();
  }

  private native void SetDepthImageScalarTypeToUnsignedChar_81();
  public void SetDepthImageScalarTypeToUnsignedChar()
  {
    SetDepthImageScalarTypeToUnsignedChar_81();
  }

  private native void SetDepthImageScalarTypeToUnsignedShort_82();
  public void SetDepthImageScalarTypeToUnsignedShort()
  {
    SetDepthImageScalarTypeToUnsignedShort_82();
  }

  private native void SetDepthImageScalarTypeToFloat_83();
  public void SetDepthImageScalarTypeToFloat()
  {
    SetDepthImageScalarTypeToFloat_83();
  }

  private native void SetClampDepthToBackface_84(int id0);
  public void SetClampDepthToBackface(int id0)
  {
    SetClampDepthToBackface_84(id0);
  }

  private native int GetClampDepthToBackface_85();
  public int GetClampDepthToBackface()
  {
    return GetClampDepthToBackface_85();
  }

  private native void ClampDepthToBackfaceOn_86();
  public void ClampDepthToBackfaceOn()
  {
    ClampDepthToBackfaceOn_86();
  }

  private native void ClampDepthToBackfaceOff_87();
  public void ClampDepthToBackfaceOff()
  {
    ClampDepthToBackfaceOff_87();
  }

  private native void GetDepthImage_88(vtkImageData id0);
  public void GetDepthImage(vtkImageData id0)
  {
    GetDepthImage_88(id0);
  }

  private native void GetColorImage_89(vtkImageData id0);
  public void GetColorImage(vtkImageData id0)
  {
    GetColorImage_89(id0);
  }

  private native void Render_90(vtkRenderer id0,vtkVolume id1);
  public void Render(vtkRenderer id0,vtkVolume id1)
  {
    Render_90(id0,id1);
  }

  private native void GPURender_91(vtkRenderer id0,vtkVolume id1);
  public void GPURender(vtkRenderer id0,vtkVolume id1)
  {
    GPURender_91(id0,id1);
  }

  private native void ReleaseGraphicsResources_92(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_92(id0);
  }

  private native void GetReductionRatio_93(double id0[]);
  public void GetReductionRatio(double id0[])
  {
    GetReductionRatio_93(id0);
  }

  private native void SetColorRangeType_94(int id0);
  public void SetColorRangeType(int id0)
  {
    SetColorRangeType_94(id0);
  }

  private native int GetColorRangeType_95();
  public int GetColorRangeType()
  {
    return GetColorRangeType_95();
  }

  private native void SetScalarOpacityRangeType_96(int id0);
  public void SetScalarOpacityRangeType(int id0)
  {
    SetScalarOpacityRangeType_96(id0);
  }

  private native int GetScalarOpacityRangeType_97();
  public int GetScalarOpacityRangeType()
  {
    return GetScalarOpacityRangeType_97();
  }

  private native void SetGradientOpacityRangeType_98(int id0);
  public void SetGradientOpacityRangeType(int id0)
  {
    SetGradientOpacityRangeType_98(id0);
  }

  private native int GetGradientOpacityRangeType_99();
  public int GetGradientOpacityRangeType()
  {
    return GetGradientOpacityRangeType_99();
  }

  private native long GetInput_100();
  public vtkDataSet GetInput()
  {
    long temp = GetInput_100();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RemoveInputConnection_101(int id0,vtkAlgorithmOutput id1);
  public void RemoveInputConnection(int id0,vtkAlgorithmOutput id1)
  {
    RemoveInputConnection_101(id0,id1);
  }

  private native void RemoveInputConnection_102(int id0,int id1);
  public void RemoveInputConnection(int id0,int id1)
  {
    RemoveInputConnection_102(id0,id1);
  }

  private native void SetInputConnection_103(int id0,vtkAlgorithmOutput id1);
  public void SetInputConnection(int id0,vtkAlgorithmOutput id1)
  {
    SetInputConnection_103(id0,id1);
  }

  private native void SetInputConnection_104(vtkAlgorithmOutput id0);
  public void SetInputConnection(vtkAlgorithmOutput id0)
  {
    SetInputConnection_104(id0);
  }

  private native int GetInputCount_105();
  public int GetInputCount()
  {
    return GetInputCount_105();
  }

  private native long GetTransformedInput_106(int id0);
  public vtkDataSet GetTransformedInput(int id0)
  {
    long temp = GetTransformedInput_106(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double[] GetBoundsFromPort_107(int id0);
  public double[] GetBoundsFromPort(int id0)
  {
    return GetBoundsFromPort_107(id0);
  }

  private native void SetTransfer2DYAxisArray_108(byte[] id0, int len0);
  public void SetTransfer2DYAxisArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTransfer2DYAxisArray_108(bytes0, bytes0.length);
  }

  private native byte[] GetTransfer2DYAxisArray_109();
  public String GetTransfer2DYAxisArray()
  {
    return new String(GetTransfer2DYAxisArray_109(), StandardCharsets.UTF_8);
  }

  public vtkGPUVolumeRayCastMapper() { super(); }

  public vtkGPUVolumeRayCastMapper(long id) { super(id); }
  public native long   VTKInit();

}
