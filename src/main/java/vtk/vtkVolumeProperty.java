// java wrapper for vtkVolumeProperty object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVolumeProperty extends vtkObject
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

  private native void DeepCopy_4(vtkVolumeProperty id0);
  public void DeepCopy(vtkVolumeProperty id0)
  {
    DeepCopy_4(id0);
  }

  private native long GetMTime_5();
  public long GetMTime()
  {
    return GetMTime_5();
  }

  private native void SetIndependentComponents_6(int id0);
  public void SetIndependentComponents(int id0)
  {
    SetIndependentComponents_6(id0);
  }

  private native int GetIndependentComponentsMinValue_7();
  public int GetIndependentComponentsMinValue()
  {
    return GetIndependentComponentsMinValue_7();
  }

  private native int GetIndependentComponentsMaxValue_8();
  public int GetIndependentComponentsMaxValue()
  {
    return GetIndependentComponentsMaxValue_8();
  }

  private native int GetIndependentComponents_9();
  public int GetIndependentComponents()
  {
    return GetIndependentComponents_9();
  }

  private native void IndependentComponentsOn_10();
  public void IndependentComponentsOn()
  {
    IndependentComponentsOn_10();
  }

  private native void IndependentComponentsOff_11();
  public void IndependentComponentsOff()
  {
    IndependentComponentsOff_11();
  }

  private native void SetInterpolationType_12(int id0);
  public void SetInterpolationType(int id0)
  {
    SetInterpolationType_12(id0);
  }

  private native int GetInterpolationTypeMinValue_13();
  public int GetInterpolationTypeMinValue()
  {
    return GetInterpolationTypeMinValue_13();
  }

  private native int GetInterpolationTypeMaxValue_14();
  public int GetInterpolationTypeMaxValue()
  {
    return GetInterpolationTypeMaxValue_14();
  }

  private native int GetInterpolationType_15();
  public int GetInterpolationType()
  {
    return GetInterpolationType_15();
  }

  private native void SetInterpolationTypeToNearest_16();
  public void SetInterpolationTypeToNearest()
  {
    SetInterpolationTypeToNearest_16();
  }

  private native void SetInterpolationTypeToLinear_17();
  public void SetInterpolationTypeToLinear()
  {
    SetInterpolationTypeToLinear_17();
  }

  private native byte[] GetInterpolationTypeAsString_18();
  public String GetInterpolationTypeAsString()
  {
    return new String(GetInterpolationTypeAsString_18(), StandardCharsets.UTF_8);
  }

  private native void SetComponentWeight_19(int id0,double id1);
  public void SetComponentWeight(int id0,double id1)
  {
    SetComponentWeight_19(id0,id1);
  }

  private native double GetComponentWeight_20(int id0);
  public double GetComponentWeight(int id0)
  {
    return GetComponentWeight_20(id0);
  }

  private native void SetColor_21(int id0,vtkPiecewiseFunction id1);
  public void SetColor(int id0,vtkPiecewiseFunction id1)
  {
    SetColor_21(id0,id1);
  }

  private native void SetColor_22(vtkPiecewiseFunction id0);
  public void SetColor(vtkPiecewiseFunction id0)
  {
    SetColor_22(id0);
  }

  private native void SetColor_23(int id0,vtkColorTransferFunction id1);
  public void SetColor(int id0,vtkColorTransferFunction id1)
  {
    SetColor_23(id0,id1);
  }

  private native void SetColor_24(vtkColorTransferFunction id0);
  public void SetColor(vtkColorTransferFunction id0)
  {
    SetColor_24(id0);
  }

  private native int GetColorChannels_25(int id0);
  public int GetColorChannels(int id0)
  {
    return GetColorChannels_25(id0);
  }

  private native int GetColorChannels_26();
  public int GetColorChannels()
  {
    return GetColorChannels_26();
  }

  private native long GetGrayTransferFunction_27(int id0);
  public vtkPiecewiseFunction GetGrayTransferFunction(int id0)
  {
    long temp = GetGrayTransferFunction_27(id0);

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGrayTransferFunction_28();
  public vtkPiecewiseFunction GetGrayTransferFunction()
  {
    long temp = GetGrayTransferFunction_28();

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRGBTransferFunction_29(int id0);
  public vtkColorTransferFunction GetRGBTransferFunction(int id0)
  {
    long temp = GetRGBTransferFunction_29(id0);

    if (temp == 0) return null;
    return (vtkColorTransferFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRGBTransferFunction_30();
  public vtkColorTransferFunction GetRGBTransferFunction()
  {
    long temp = GetRGBTransferFunction_30();

    if (temp == 0) return null;
    return (vtkColorTransferFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScalarOpacity_31(int id0,vtkPiecewiseFunction id1);
  public void SetScalarOpacity(int id0,vtkPiecewiseFunction id1)
  {
    SetScalarOpacity_31(id0,id1);
  }

  private native void SetScalarOpacity_32(vtkPiecewiseFunction id0);
  public void SetScalarOpacity(vtkPiecewiseFunction id0)
  {
    SetScalarOpacity_32(id0);
  }

  private native long GetScalarOpacity_33(int id0);
  public vtkPiecewiseFunction GetScalarOpacity(int id0)
  {
    long temp = GetScalarOpacity_33(id0);

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetScalarOpacity_34();
  public vtkPiecewiseFunction GetScalarOpacity()
  {
    long temp = GetScalarOpacity_34();

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScalarOpacityUnitDistance_35(int id0,double id1);
  public void SetScalarOpacityUnitDistance(int id0,double id1)
  {
    SetScalarOpacityUnitDistance_35(id0,id1);
  }

  private native void SetScalarOpacityUnitDistance_36(double id0);
  public void SetScalarOpacityUnitDistance(double id0)
  {
    SetScalarOpacityUnitDistance_36(id0);
  }

  private native double GetScalarOpacityUnitDistance_37(int id0);
  public double GetScalarOpacityUnitDistance(int id0)
  {
    return GetScalarOpacityUnitDistance_37(id0);
  }

  private native double GetScalarOpacityUnitDistance_38();
  public double GetScalarOpacityUnitDistance()
  {
    return GetScalarOpacityUnitDistance_38();
  }

  private native void SetGradientOpacity_39(int id0,vtkPiecewiseFunction id1);
  public void SetGradientOpacity(int id0,vtkPiecewiseFunction id1)
  {
    SetGradientOpacity_39(id0,id1);
  }

  private native void SetGradientOpacity_40(vtkPiecewiseFunction id0);
  public void SetGradientOpacity(vtkPiecewiseFunction id0)
  {
    SetGradientOpacity_40(id0);
  }

  private native void SetTransferFunction2D_41(int id0,vtkImageData id1);
  public void SetTransferFunction2D(int id0,vtkImageData id1)
  {
    SetTransferFunction2D_41(id0,id1);
  }

  private native void SetTransferFunction2D_42(vtkImageData id0);
  public void SetTransferFunction2D(vtkImageData id0)
  {
    SetTransferFunction2D_42(id0);
  }

  private native long GetTransferFunction2D_43(int id0);
  public vtkImageData GetTransferFunction2D(int id0)
  {
    long temp = GetTransferFunction2D_43(id0);

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTransferFunction2D_44();
  public vtkImageData GetTransferFunction2D()
  {
    long temp = GetTransferFunction2D_44();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTransferFunctionMode_45(int id0);
  public void SetTransferFunctionMode(int id0)
  {
    SetTransferFunctionMode_45(id0);
  }

  private native int GetTransferFunctionModeMinValue_46();
  public int GetTransferFunctionModeMinValue()
  {
    return GetTransferFunctionModeMinValue_46();
  }

  private native int GetTransferFunctionModeMaxValue_47();
  public int GetTransferFunctionModeMaxValue()
  {
    return GetTransferFunctionModeMaxValue_47();
  }

  private native int GetTransferFunctionMode_48();
  public int GetTransferFunctionMode()
  {
    return GetTransferFunctionMode_48();
  }

  private native void SetTransferFunctionModeTo1D_49();
  public void SetTransferFunctionModeTo1D()
  {
    SetTransferFunctionModeTo1D_49();
  }

  private native void SetTransferFunctionModeTo2D_50();
  public void SetTransferFunctionModeTo2D()
  {
    SetTransferFunctionModeTo2D_50();
  }

  private native long GetGradientOpacity_51(int id0);
  public vtkPiecewiseFunction GetGradientOpacity(int id0)
  {
    long temp = GetGradientOpacity_51(id0);

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGradientOpacity_52();
  public vtkPiecewiseFunction GetGradientOpacity()
  {
    long temp = GetGradientOpacity_52();

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDisableGradientOpacity_53(int id0,int id1);
  public void SetDisableGradientOpacity(int id0,int id1)
  {
    SetDisableGradientOpacity_53(id0,id1);
  }

  private native void SetDisableGradientOpacity_54(int id0);
  public void SetDisableGradientOpacity(int id0)
  {
    SetDisableGradientOpacity_54(id0);
  }

  private native void DisableGradientOpacityOn_55(int id0);
  public void DisableGradientOpacityOn(int id0)
  {
    DisableGradientOpacityOn_55(id0);
  }

  private native void DisableGradientOpacityOn_56();
  public void DisableGradientOpacityOn()
  {
    DisableGradientOpacityOn_56();
  }

  private native void DisableGradientOpacityOff_57(int id0);
  public void DisableGradientOpacityOff(int id0)
  {
    DisableGradientOpacityOff_57(id0);
  }

  private native void DisableGradientOpacityOff_58();
  public void DisableGradientOpacityOff()
  {
    DisableGradientOpacityOff_58();
  }

  private native int GetDisableGradientOpacity_59(int id0);
  public int GetDisableGradientOpacity(int id0)
  {
    return GetDisableGradientOpacity_59(id0);
  }

  private native int GetDisableGradientOpacity_60();
  public int GetDisableGradientOpacity()
  {
    return GetDisableGradientOpacity_60();
  }

  private native long GetStoredGradientOpacity_61(int id0);
  public vtkPiecewiseFunction GetStoredGradientOpacity(int id0)
  {
    long temp = GetStoredGradientOpacity_61(id0);

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStoredGradientOpacity_62();
  public vtkPiecewiseFunction GetStoredGradientOpacity()
  {
    long temp = GetStoredGradientOpacity_62();

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean HasGradientOpacity_63(int id0);
  public boolean HasGradientOpacity(int id0)
  {
    return HasGradientOpacity_63(id0);
  }

  private native boolean HasLabelGradientOpacity_64();
  public boolean HasLabelGradientOpacity()
  {
    return HasLabelGradientOpacity_64();
  }

  private native void SetShade_65(int id0,int id1);
  public void SetShade(int id0,int id1)
  {
    SetShade_65(id0,id1);
  }

  private native void SetShade_66(int id0);
  public void SetShade(int id0)
  {
    SetShade_66(id0);
  }

  private native int GetShade_67(int id0);
  public int GetShade(int id0)
  {
    return GetShade_67(id0);
  }

  private native int GetShade_68();
  public int GetShade()
  {
    return GetShade_68();
  }

  private native void ShadeOn_69(int id0);
  public void ShadeOn(int id0)
  {
    ShadeOn_69(id0);
  }

  private native void ShadeOn_70();
  public void ShadeOn()
  {
    ShadeOn_70();
  }

  private native void ShadeOff_71(int id0);
  public void ShadeOff(int id0)
  {
    ShadeOff_71(id0);
  }

  private native void ShadeOff_72();
  public void ShadeOff()
  {
    ShadeOff_72();
  }

  private native void SetAmbient_73(int id0,double id1);
  public void SetAmbient(int id0,double id1)
  {
    SetAmbient_73(id0,id1);
  }

  private native void SetAmbient_74(double id0);
  public void SetAmbient(double id0)
  {
    SetAmbient_74(id0);
  }

  private native double GetAmbient_75(int id0);
  public double GetAmbient(int id0)
  {
    return GetAmbient_75(id0);
  }

  private native double GetAmbient_76();
  public double GetAmbient()
  {
    return GetAmbient_76();
  }

  private native void SetDiffuse_77(int id0,double id1);
  public void SetDiffuse(int id0,double id1)
  {
    SetDiffuse_77(id0,id1);
  }

  private native void SetDiffuse_78(double id0);
  public void SetDiffuse(double id0)
  {
    SetDiffuse_78(id0);
  }

  private native double GetDiffuse_79(int id0);
  public double GetDiffuse(int id0)
  {
    return GetDiffuse_79(id0);
  }

  private native double GetDiffuse_80();
  public double GetDiffuse()
  {
    return GetDiffuse_80();
  }

  private native void SetSpecular_81(int id0,double id1);
  public void SetSpecular(int id0,double id1)
  {
    SetSpecular_81(id0,id1);
  }

  private native void SetSpecular_82(double id0);
  public void SetSpecular(double id0)
  {
    SetSpecular_82(id0);
  }

  private native double GetSpecular_83(int id0);
  public double GetSpecular(int id0)
  {
    return GetSpecular_83(id0);
  }

  private native double GetSpecular_84();
  public double GetSpecular()
  {
    return GetSpecular_84();
  }

  private native void SetSpecularPower_85(int id0,double id1);
  public void SetSpecularPower(int id0,double id1)
  {
    SetSpecularPower_85(id0,id1);
  }

  private native void SetSpecularPower_86(double id0);
  public void SetSpecularPower(double id0)
  {
    SetSpecularPower_86(id0);
  }

  private native double GetSpecularPower_87(int id0);
  public double GetSpecularPower(int id0)
  {
    return GetSpecularPower_87(id0);
  }

  private native double GetSpecularPower_88();
  public double GetSpecularPower()
  {
    return GetSpecularPower_88();
  }

  private native long GetIsoSurfaceValues_89();
  public vtkContourValues GetIsoSurfaceValues()
  {
    long temp = GetIsoSurfaceValues_89();

    if (temp == 0) return null;
    return (vtkContourValues)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSliceFunction_90(vtkImplicitFunction id0);
  public void SetSliceFunction(vtkImplicitFunction id0)
  {
    SetSliceFunction_90(id0);
  }

  private native long GetSliceFunction_91();
  public vtkImplicitFunction GetSliceFunction()
  {
    long temp = GetSliceFunction_91();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScatteringAnisotropy_92(float id0);
  public void SetScatteringAnisotropy(float id0)
  {
    SetScatteringAnisotropy_92(id0);
  }

  private native float GetScatteringAnisotropyMinValue_93();
  public float GetScatteringAnisotropyMinValue()
  {
    return GetScatteringAnisotropyMinValue_93();
  }

  private native float GetScatteringAnisotropyMaxValue_94();
  public float GetScatteringAnisotropyMaxValue()
  {
    return GetScatteringAnisotropyMaxValue_94();
  }

  private native float GetScatteringAnisotropy_95();
  public float GetScatteringAnisotropy()
  {
    return GetScatteringAnisotropy_95();
  }

  private native void UpdateMTimes_96();
  public void UpdateMTimes()
  {
    UpdateMTimes_96();
  }

  private native void SetUseClippedVoxelIntensity_97(int id0);
  public void SetUseClippedVoxelIntensity(int id0)
  {
    SetUseClippedVoxelIntensity_97(id0);
  }

  private native int GetUseClippedVoxelIntensity_98();
  public int GetUseClippedVoxelIntensity()
  {
    return GetUseClippedVoxelIntensity_98();
  }

  private native void UseClippedVoxelIntensityOn_99();
  public void UseClippedVoxelIntensityOn()
  {
    UseClippedVoxelIntensityOn_99();
  }

  private native void UseClippedVoxelIntensityOff_100();
  public void UseClippedVoxelIntensityOff()
  {
    UseClippedVoxelIntensityOff_100();
  }

  private native void SetClippedVoxelIntensity_101(double id0);
  public void SetClippedVoxelIntensity(double id0)
  {
    SetClippedVoxelIntensity_101(id0);
  }

  private native double GetClippedVoxelIntensity_102();
  public double GetClippedVoxelIntensity()
  {
    return GetClippedVoxelIntensity_102();
  }

  private native void SetLabelColor_103(int id0,vtkColorTransferFunction id1);
  public void SetLabelColor(int id0,vtkColorTransferFunction id1)
  {
    SetLabelColor_103(id0,id1);
  }

  private native long GetLabelColor_104(int id0);
  public vtkColorTransferFunction GetLabelColor(int id0)
  {
    long temp = GetLabelColor_104(id0);

    if (temp == 0) return null;
    return (vtkColorTransferFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelScalarOpacity_105(int id0,vtkPiecewiseFunction id1);
  public void SetLabelScalarOpacity(int id0,vtkPiecewiseFunction id1)
  {
    SetLabelScalarOpacity_105(id0,id1);
  }

  private native long GetLabelScalarOpacity_106(int id0);
  public vtkPiecewiseFunction GetLabelScalarOpacity(int id0)
  {
    long temp = GetLabelScalarOpacity_106(id0);

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelGradientOpacity_107(int id0,vtkPiecewiseFunction id1);
  public void SetLabelGradientOpacity(int id0,vtkPiecewiseFunction id1)
  {
    SetLabelGradientOpacity_107(id0,id1);
  }

  private native long GetLabelGradientOpacity_108(int id0);
  public vtkPiecewiseFunction GetLabelGradientOpacity(int id0)
  {
    long temp = GetLabelGradientOpacity_108(id0);

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkVolumeProperty() { super(); }

  public vtkVolumeProperty(long id) { super(id); }
  public native long   VTKInit();

}
