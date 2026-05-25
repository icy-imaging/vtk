// java wrapper for vtkSurfaceLICInterface object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSurfaceLICInterface extends vtkObject
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

  private native void SetNumberOfSteps_4(int id0);
  public void SetNumberOfSteps(int id0)
  {
    SetNumberOfSteps_4(id0);
  }

  private native int GetNumberOfSteps_5();
  public int GetNumberOfSteps()
  {
    return GetNumberOfSteps_5();
  }

  private native void SetStepSize_6(double id0);
  public void SetStepSize(double id0)
  {
    SetStepSize_6(id0);
  }

  private native double GetStepSize_7();
  public double GetStepSize()
  {
    return GetStepSize_7();
  }

  private native void SetNormalizeVectors_8(int id0);
  public void SetNormalizeVectors(int id0)
  {
    SetNormalizeVectors_8(id0);
  }

  private native void NormalizeVectorsOn_9();
  public void NormalizeVectorsOn()
  {
    NormalizeVectorsOn_9();
  }

  private native void NormalizeVectorsOff_10();
  public void NormalizeVectorsOff()
  {
    NormalizeVectorsOff_10();
  }

  private native int GetNormalizeVectors_11();
  public int GetNormalizeVectors()
  {
    return GetNormalizeVectors_11();
  }

  private native void SetMaskOnSurface_12(int id0);
  public void SetMaskOnSurface(int id0)
  {
    SetMaskOnSurface_12(id0);
  }

  private native void MaskOnSurfaceOn_13();
  public void MaskOnSurfaceOn()
  {
    MaskOnSurfaceOn_13();
  }

  private native void MaskOnSurfaceOff_14();
  public void MaskOnSurfaceOff()
  {
    MaskOnSurfaceOff_14();
  }

  private native int GetMaskOnSurface_15();
  public int GetMaskOnSurface()
  {
    return GetMaskOnSurface_15();
  }

  private native void SetMaskThreshold_16(double id0);
  public void SetMaskThreshold(double id0)
  {
    SetMaskThreshold_16(id0);
  }

  private native double GetMaskThreshold_17();
  public double GetMaskThreshold()
  {
    return GetMaskThreshold_17();
  }

  private native void SetMaskColor_18(double id0,double id1,double id2);
  public void SetMaskColor(double id0,double id1,double id2)
  {
    SetMaskColor_18(id0,id1,id2);
  }

  private native double[] GetMaskColor_19();
  public double[] GetMaskColor()
  {
    return GetMaskColor_19();
  }

  private native void SetMaskIntensity_20(double id0);
  public void SetMaskIntensity(double id0)
  {
    SetMaskIntensity_20(id0);
  }

  private native double GetMaskIntensity_21();
  public double GetMaskIntensity()
  {
    return GetMaskIntensity_21();
  }

  private native void SetEnhancedLIC_22(int id0);
  public void SetEnhancedLIC(int id0)
  {
    SetEnhancedLIC_22(id0);
  }

  private native int GetEnhancedLIC_23();
  public int GetEnhancedLIC()
  {
    return GetEnhancedLIC_23();
  }

  private native void EnhancedLICOn_24();
  public void EnhancedLICOn()
  {
    EnhancedLICOn_24();
  }

  private native void EnhancedLICOff_25();
  public void EnhancedLICOff()
  {
    EnhancedLICOff_25();
  }

  private native void SetEnhanceContrast_26(int id0);
  public void SetEnhanceContrast(int id0)
  {
    SetEnhanceContrast_26(id0);
  }

  private native int GetEnhanceContrast_27();
  public int GetEnhanceContrast()
  {
    return GetEnhanceContrast_27();
  }

  private native double GetLowLICContrastEnhancementFactor_28();
  public double GetLowLICContrastEnhancementFactor()
  {
    return GetLowLICContrastEnhancementFactor_28();
  }

  private native double GetHighLICContrastEnhancementFactor_29();
  public double GetHighLICContrastEnhancementFactor()
  {
    return GetHighLICContrastEnhancementFactor_29();
  }

  private native void SetLowLICContrastEnhancementFactor_30(double id0);
  public void SetLowLICContrastEnhancementFactor(double id0)
  {
    SetLowLICContrastEnhancementFactor_30(id0);
  }

  private native void SetHighLICContrastEnhancementFactor_31(double id0);
  public void SetHighLICContrastEnhancementFactor(double id0)
  {
    SetHighLICContrastEnhancementFactor_31(id0);
  }

  private native double GetLowColorContrastEnhancementFactor_32();
  public double GetLowColorContrastEnhancementFactor()
  {
    return GetLowColorContrastEnhancementFactor_32();
  }

  private native double GetHighColorContrastEnhancementFactor_33();
  public double GetHighColorContrastEnhancementFactor()
  {
    return GetHighColorContrastEnhancementFactor_33();
  }

  private native void SetLowColorContrastEnhancementFactor_34(double id0);
  public void SetLowColorContrastEnhancementFactor(double id0)
  {
    SetLowColorContrastEnhancementFactor_34(id0);
  }

  private native void SetHighColorContrastEnhancementFactor_35(double id0);
  public void SetHighColorContrastEnhancementFactor(double id0)
  {
    SetHighColorContrastEnhancementFactor_35(id0);
  }

  private native void SetAntiAlias_36(int id0);
  public void SetAntiAlias(int id0)
  {
    SetAntiAlias_36(id0);
  }

  private native void AntiAliasOn_37();
  public void AntiAliasOn()
  {
    AntiAliasOn_37();
  }

  private native void AntiAliasOff_38();
  public void AntiAliasOff()
  {
    AntiAliasOff_38();
  }

  private native int GetAntiAlias_39();
  public int GetAntiAlias()
  {
    return GetAntiAlias_39();
  }

  private native void SetColorMode_40(int id0);
  public void SetColorMode(int id0)
  {
    SetColorMode_40(id0);
  }

  private native int GetColorMode_41();
  public int GetColorMode()
  {
    return GetColorMode_41();
  }

  private native void SetLICIntensity_42(double id0);
  public void SetLICIntensity(double id0)
  {
    SetLICIntensity_42(id0);
  }

  private native double GetLICIntensity_43();
  public double GetLICIntensity()
  {
    return GetLICIntensity_43();
  }

  private native void SetMapModeBias_44(double id0);
  public void SetMapModeBias(double id0)
  {
    SetMapModeBias_44(id0);
  }

  private native double GetMapModeBias_45();
  public double GetMapModeBias()
  {
    return GetMapModeBias_45();
  }

  private native void SetNoiseDataSet_46(vtkImageData id0);
  public void SetNoiseDataSet(vtkImageData id0)
  {
    SetNoiseDataSet_46(id0);
  }

  private native long GetNoiseDataSet_47();
  public vtkImageData GetNoiseDataSet()
  {
    long temp = GetNoiseDataSet_47();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGenerateNoiseTexture_48(int id0);
  public void SetGenerateNoiseTexture(int id0)
  {
    SetGenerateNoiseTexture_48(id0);
  }

  private native int GetGenerateNoiseTexture_49();
  public int GetGenerateNoiseTexture()
  {
    return GetGenerateNoiseTexture_49();
  }

  private native void SetNoiseType_50(int id0);
  public void SetNoiseType(int id0)
  {
    SetNoiseType_50(id0);
  }

  private native int GetNoiseType_51();
  public int GetNoiseType()
  {
    return GetNoiseType_51();
  }

  private native void SetNoiseTextureSize_52(int id0);
  public void SetNoiseTextureSize(int id0)
  {
    SetNoiseTextureSize_52(id0);
  }

  private native int GetNoiseTextureSize_53();
  public int GetNoiseTextureSize()
  {
    return GetNoiseTextureSize_53();
  }

  private native void SetNoiseGrainSize_54(int id0);
  public void SetNoiseGrainSize(int id0)
  {
    SetNoiseGrainSize_54(id0);
  }

  private native int GetNoiseGrainSize_55();
  public int GetNoiseGrainSize()
  {
    return GetNoiseGrainSize_55();
  }

  private native void SetMinNoiseValue_56(double id0);
  public void SetMinNoiseValue(double id0)
  {
    SetMinNoiseValue_56(id0);
  }

  private native void SetMaxNoiseValue_57(double id0);
  public void SetMaxNoiseValue(double id0)
  {
    SetMaxNoiseValue_57(id0);
  }

  private native double GetMinNoiseValue_58();
  public double GetMinNoiseValue()
  {
    return GetMinNoiseValue_58();
  }

  private native double GetMaxNoiseValue_59();
  public double GetMaxNoiseValue()
  {
    return GetMaxNoiseValue_59();
  }

  private native void SetNumberOfNoiseLevels_60(int id0);
  public void SetNumberOfNoiseLevels(int id0)
  {
    SetNumberOfNoiseLevels_60(id0);
  }

  private native int GetNumberOfNoiseLevels_61();
  public int GetNumberOfNoiseLevels()
  {
    return GetNumberOfNoiseLevels_61();
  }

  private native void SetImpulseNoiseProbability_62(double id0);
  public void SetImpulseNoiseProbability(double id0)
  {
    SetImpulseNoiseProbability_62(id0);
  }

  private native double GetImpulseNoiseProbability_63();
  public double GetImpulseNoiseProbability()
  {
    return GetImpulseNoiseProbability_63();
  }

  private native void SetImpulseNoiseBackgroundValue_64(double id0);
  public void SetImpulseNoiseBackgroundValue(double id0)
  {
    SetImpulseNoiseBackgroundValue_64(id0);
  }

  private native double GetImpulseNoiseBackgroundValue_65();
  public double GetImpulseNoiseBackgroundValue()
  {
    return GetImpulseNoiseBackgroundValue_65();
  }

  private native void SetNoiseGeneratorSeed_66(int id0);
  public void SetNoiseGeneratorSeed(int id0)
  {
    SetNoiseGeneratorSeed_66(id0);
  }

  private native int GetNoiseGeneratorSeed_67();
  public int GetNoiseGeneratorSeed()
  {
    return GetNoiseGeneratorSeed_67();
  }

  private native void SetCompositeStrategy_68(int id0);
  public void SetCompositeStrategy(int id0)
  {
    SetCompositeStrategy_68(id0);
  }

  private native int GetCompositeStrategy_69();
  public int GetCompositeStrategy()
  {
    return GetCompositeStrategy_69();
  }

  private native boolean IsSupported_70(vtkRenderWindow id0);
  public boolean IsSupported(vtkRenderWindow id0)
  {
    return IsSupported_70(id0);
  }

  private native void WriteTimerLog_71(byte[] id0, int len0);
  public void WriteTimerLog(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    WriteTimerLog_71(bytes0, bytes0.length);
  }

  private native void ShallowCopy_72(vtkSurfaceLICInterface id0);
  public void ShallowCopy(vtkSurfaceLICInterface id0)
  {
    ShallowCopy_72(id0);
  }

  private native void ReleaseGraphicsResources_73(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_73(id0);
  }

  private native boolean CanRenderSurfaceLIC_74(vtkActor id0);
  public boolean CanRenderSurfaceLIC(vtkActor id0)
  {
    return CanRenderSurfaceLIC_74(id0);
  }

  private native void ValidateContext_75(vtkRenderer id0);
  public void ValidateContext(vtkRenderer id0)
  {
    ValidateContext_75(id0);
  }

  private native void CreateCommunicator_76(vtkRenderer id0,vtkActor id1,vtkDataObject id2);
  public void CreateCommunicator(vtkRenderer id0,vtkActor id1,vtkDataObject id2)
  {
    CreateCommunicator_76(id0,id1,id2);
  }

  private native void UpdateCommunicator_77(vtkRenderer id0,vtkActor id1,vtkDataObject id2);
  public void UpdateCommunicator(vtkRenderer id0,vtkActor id1,vtkDataObject id2)
  {
    UpdateCommunicator_77(id0,id1,id2);
  }

  private native void SetHasVectors_78(boolean id0);
  public void SetHasVectors(boolean id0)
  {
    SetHasVectors_78(id0);
  }

  private native boolean GetHasVectors_79();
  public boolean GetHasVectors()
  {
    return GetHasVectors_79();
  }

  private native void InitializeResources_80();
  public void InitializeResources()
  {
    InitializeResources_80();
  }

  private native void PrepareForGeometry_81();
  public void PrepareForGeometry()
  {
    PrepareForGeometry_81();
  }

  private native void CompletedGeometry_82();
  public void CompletedGeometry()
  {
    CompletedGeometry_82();
  }

  private native void GatherVectors_83();
  public void GatherVectors()
  {
    GatherVectors_83();
  }

  private native void ApplyLIC_84();
  public void ApplyLIC()
  {
    ApplyLIC_84();
  }

  private native void CombineColorsAndLIC_85();
  public void CombineColorsAndLIC()
  {
    CombineColorsAndLIC_85();
  }

  private native void CopyToScreen_86();
  public void CopyToScreen()
  {
    CopyToScreen_86();
  }

  private native void SetEnable_87(int id0);
  public void SetEnable(int id0)
  {
    SetEnable_87(id0);
  }

  private native int GetEnable_88();
  public int GetEnable()
  {
    return GetEnable_88();
  }

  private native void EnableOn_89();
  public void EnableOn()
  {
    EnableOn_89();
  }

  private native void EnableOff_90();
  public void EnableOff()
  {
    EnableOff_90();
  }

  public vtkSurfaceLICInterface() { super(); }

  public vtkSurfaceLICInterface(long id) { super(id); }
  public native long   VTKInit();

}
