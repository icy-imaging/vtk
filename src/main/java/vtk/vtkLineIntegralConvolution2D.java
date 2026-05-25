// java wrapper for vtkLineIntegralConvolution2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLineIntegralConvolution2D extends vtkObject
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

  private native boolean IsSupported_4(vtkRenderWindow id0);
  public boolean IsSupported(vtkRenderWindow id0)
  {
    return IsSupported_4(id0);
  }

  private native void SetContext_5(vtkOpenGLRenderWindow id0);
  public void SetContext(vtkOpenGLRenderWindow id0)
  {
    SetContext_5(id0);
  }

  private native long GetContext_6();
  public vtkOpenGLRenderWindow GetContext()
  {
    long temp = GetContext_6();

    if (temp == 0) return null;
    return (vtkOpenGLRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetEnhancedLIC_7(int id0);
  public void SetEnhancedLIC(int id0)
  {
    SetEnhancedLIC_7(id0);
  }

  private native int GetEnhancedLICMinValue_8();
  public int GetEnhancedLICMinValue()
  {
    return GetEnhancedLICMinValue_8();
  }

  private native int GetEnhancedLICMaxValue_9();
  public int GetEnhancedLICMaxValue()
  {
    return GetEnhancedLICMaxValue_9();
  }

  private native int GetEnhancedLIC_10();
  public int GetEnhancedLIC()
  {
    return GetEnhancedLIC_10();
  }

  private native void EnhancedLICOn_11();
  public void EnhancedLICOn()
  {
    EnhancedLICOn_11();
  }

  private native void EnhancedLICOff_12();
  public void EnhancedLICOff()
  {
    EnhancedLICOff_12();
  }

  private native void SetEnhanceContrast_13(int id0);
  public void SetEnhanceContrast(int id0)
  {
    SetEnhanceContrast_13(id0);
  }

  private native int GetEnhanceContrastMinValue_14();
  public int GetEnhanceContrastMinValue()
  {
    return GetEnhanceContrastMinValue_14();
  }

  private native int GetEnhanceContrastMaxValue_15();
  public int GetEnhanceContrastMaxValue()
  {
    return GetEnhanceContrastMaxValue_15();
  }

  private native int GetEnhanceContrast_16();
  public int GetEnhanceContrast()
  {
    return GetEnhanceContrast_16();
  }

  private native void EnhanceContrastOn_17();
  public void EnhanceContrastOn()
  {
    EnhanceContrastOn_17();
  }

  private native void EnhanceContrastOff_18();
  public void EnhanceContrastOff()
  {
    EnhanceContrastOff_18();
  }

  private native void SetLowContrastEnhancementFactor_19(double id0);
  public void SetLowContrastEnhancementFactor(double id0)
  {
    SetLowContrastEnhancementFactor_19(id0);
  }

  private native double GetLowContrastEnhancementFactorMinValue_20();
  public double GetLowContrastEnhancementFactorMinValue()
  {
    return GetLowContrastEnhancementFactorMinValue_20();
  }

  private native double GetLowContrastEnhancementFactorMaxValue_21();
  public double GetLowContrastEnhancementFactorMaxValue()
  {
    return GetLowContrastEnhancementFactorMaxValue_21();
  }

  private native double GetLowContrastEnhancementFactor_22();
  public double GetLowContrastEnhancementFactor()
  {
    return GetLowContrastEnhancementFactor_22();
  }

  private native void SetHighContrastEnhancementFactor_23(double id0);
  public void SetHighContrastEnhancementFactor(double id0)
  {
    SetHighContrastEnhancementFactor_23(id0);
  }

  private native double GetHighContrastEnhancementFactorMinValue_24();
  public double GetHighContrastEnhancementFactorMinValue()
  {
    return GetHighContrastEnhancementFactorMinValue_24();
  }

  private native double GetHighContrastEnhancementFactorMaxValue_25();
  public double GetHighContrastEnhancementFactorMaxValue()
  {
    return GetHighContrastEnhancementFactorMaxValue_25();
  }

  private native double GetHighContrastEnhancementFactor_26();
  public double GetHighContrastEnhancementFactor()
  {
    return GetHighContrastEnhancementFactor_26();
  }

  private native void SetAntiAlias_27(int id0);
  public void SetAntiAlias(int id0)
  {
    SetAntiAlias_27(id0);
  }

  private native int GetAntiAliasMinValue_28();
  public int GetAntiAliasMinValue()
  {
    return GetAntiAliasMinValue_28();
  }

  private native int GetAntiAliasMaxValue_29();
  public int GetAntiAliasMaxValue()
  {
    return GetAntiAliasMaxValue_29();
  }

  private native int GetAntiAlias_30();
  public int GetAntiAlias()
  {
    return GetAntiAlias_30();
  }

  private native void AntiAliasOn_31();
  public void AntiAliasOn()
  {
    AntiAliasOn_31();
  }

  private native void AntiAliasOff_32();
  public void AntiAliasOff()
  {
    AntiAliasOff_32();
  }

  private native void SetNumberOfSteps_33(int id0);
  public void SetNumberOfSteps(int id0)
  {
    SetNumberOfSteps_33(id0);
  }

  private native int GetNumberOfStepsMinValue_34();
  public int GetNumberOfStepsMinValue()
  {
    return GetNumberOfStepsMinValue_34();
  }

  private native int GetNumberOfStepsMaxValue_35();
  public int GetNumberOfStepsMaxValue()
  {
    return GetNumberOfStepsMaxValue_35();
  }

  private native int GetNumberOfSteps_36();
  public int GetNumberOfSteps()
  {
    return GetNumberOfSteps_36();
  }

  private native void SetStepSize_37(double id0);
  public void SetStepSize(double id0)
  {
    SetStepSize_37(id0);
  }

  private native double GetStepSizeMinValue_38();
  public double GetStepSizeMinValue()
  {
    return GetStepSizeMinValue_38();
  }

  private native double GetStepSizeMaxValue_39();
  public double GetStepSizeMaxValue()
  {
    return GetStepSizeMaxValue_39();
  }

  private native double GetStepSize_40();
  public double GetStepSize()
  {
    return GetStepSize_40();
  }

  private native void SetComponentIds_41(int id0,int id1);
  public void SetComponentIds(int id0,int id1)
  {
    SetComponentIds_41(id0,id1);
  }

  private native void SetComponentIds_42(int id0[]);
  public void SetComponentIds(int id0[])
  {
    SetComponentIds_42(id0);
  }

  private native int[] GetComponentIds_43();
  public int[] GetComponentIds()
  {
    return GetComponentIds_43();
  }

  private native void SetMaxNoiseValue_44(double id0);
  public void SetMaxNoiseValue(double id0)
  {
    SetMaxNoiseValue_44(id0);
  }

  private native double GetMaxNoiseValueMinValue_45();
  public double GetMaxNoiseValueMinValue()
  {
    return GetMaxNoiseValueMinValue_45();
  }

  private native double GetMaxNoiseValueMaxValue_46();
  public double GetMaxNoiseValueMaxValue()
  {
    return GetMaxNoiseValueMaxValue_46();
  }

  private native double GetMaxNoiseValue_47();
  public double GetMaxNoiseValue()
  {
    return GetMaxNoiseValue_47();
  }

  private native void SetTransformVectors_48(int id0);
  public void SetTransformVectors(int id0)
  {
    SetTransformVectors_48(id0);
  }

  private native int GetTransformVectors_49();
  public int GetTransformVectors()
  {
    return GetTransformVectors_49();
  }

  private native void SetNormalizeVectors_50(int id0);
  public void SetNormalizeVectors(int id0)
  {
    SetNormalizeVectors_50(id0);
  }

  private native int GetNormalizeVectors_51();
  public int GetNormalizeVectors()
  {
    return GetNormalizeVectors_51();
  }

  private native void SetMaskThreshold_52(double id0);
  public void SetMaskThreshold(double id0)
  {
    SetMaskThreshold_52(id0);
  }

  private native double GetMaskThresholdMinValue_53();
  public double GetMaskThresholdMinValue()
  {
    return GetMaskThresholdMinValue_53();
  }

  private native double GetMaskThresholdMaxValue_54();
  public double GetMaskThresholdMaxValue()
  {
    return GetMaskThresholdMaxValue_54();
  }

  private native double GetMaskThreshold_55();
  public double GetMaskThreshold()
  {
    return GetMaskThreshold_55();
  }

  private native long Execute_56(vtkTextureObject id0,vtkTextureObject id1);
  public vtkTextureObject Execute(vtkTextureObject id0,vtkTextureObject id1)
  {
    long temp = Execute_56(id0,id1);

    if (temp == 0) return null;
    return (vtkTextureObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long Execute_57(int id0[],vtkTextureObject id1,vtkTextureObject id2);
  public vtkTextureObject Execute(int id0[],vtkTextureObject id1,vtkTextureObject id2)
  {
    long temp = Execute_57(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkTextureObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetVectorTexParameters_58(vtkTextureObject id0);
  public void SetVectorTexParameters(vtkTextureObject id0)
  {
    SetVectorTexParameters_58(id0);
  }

  private native void SetNoiseTexParameters_59(vtkTextureObject id0);
  public void SetNoiseTexParameters(vtkTextureObject id0)
  {
    SetNoiseTexParameters_59(id0);
  }

  private native void WriteTimerLog_60(byte[] id0, int len0);
  public void WriteTimerLog(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    WriteTimerLog_60(bytes0, bytes0.length);
  }

  public vtkLineIntegralConvolution2D() { super(); }

  public vtkLineIntegralConvolution2D(long id) { super(id); }
  public native long   VTKInit();

}
