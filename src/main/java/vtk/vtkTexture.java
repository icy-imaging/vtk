// java wrapper for vtkTexture object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTexture extends vtkImageAlgorithm
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

  private native void Render_4(vtkRenderer id0);
  public void Render(vtkRenderer id0)
  {
    Render_4(id0);
  }

  private native void PostRender_5(vtkRenderer id0);
  public void PostRender(vtkRenderer id0)
  {
    PostRender_5(id0);
  }

  private native void ReleaseGraphicsResources_6(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_6(id0);
  }

  private native void Load_7(vtkRenderer id0);
  public void Load(vtkRenderer id0)
  {
    Load_7(id0);
  }

  private native int GetInterpolate_8();
  public int GetInterpolate()
  {
    return GetInterpolate_8();
  }

  private native void SetInterpolate_9(int id0);
  public void SetInterpolate(int id0)
  {
    SetInterpolate_9(id0);
  }

  private native void InterpolateOn_10();
  public void InterpolateOn()
  {
    InterpolateOn_10();
  }

  private native void InterpolateOff_11();
  public void InterpolateOff()
  {
    InterpolateOff_11();
  }

  private native boolean GetMipmap_12();
  public boolean GetMipmap()
  {
    return GetMipmap_12();
  }

  private native void SetMipmap_13(boolean id0);
  public void SetMipmap(boolean id0)
  {
    SetMipmap_13(id0);
  }

  private native void MipmapOn_14();
  public void MipmapOn()
  {
    MipmapOn_14();
  }

  private native void MipmapOff_15();
  public void MipmapOff()
  {
    MipmapOff_15();
  }

  private native void SetMaximumAnisotropicFiltering_16(float id0);
  public void SetMaximumAnisotropicFiltering(float id0)
  {
    SetMaximumAnisotropicFiltering_16(id0);
  }

  private native float GetMaximumAnisotropicFiltering_17();
  public float GetMaximumAnisotropicFiltering()
  {
    return GetMaximumAnisotropicFiltering_17();
  }

  private native void SetQuality_18(int id0);
  public void SetQuality(int id0)
  {
    SetQuality_18(id0);
  }

  private native int GetQuality_19();
  public int GetQuality()
  {
    return GetQuality_19();
  }

  private native void SetQualityToDefault_20();
  public void SetQualityToDefault()
  {
    SetQualityToDefault_20();
  }

  private native void SetQualityTo16Bit_21();
  public void SetQualityTo16Bit()
  {
    SetQualityTo16Bit_21();
  }

  private native void SetQualityTo32Bit_22();
  public void SetQualityTo32Bit()
  {
    SetQualityTo32Bit_22();
  }

  private native void SetColorMode_23(int id0);
  public void SetColorMode(int id0)
  {
    SetColorMode_23(id0);
  }

  private native int GetColorMode_24();
  public int GetColorMode()
  {
    return GetColorMode_24();
  }

  private native void SetColorModeToDefault_25();
  public void SetColorModeToDefault()
  {
    SetColorModeToDefault_25();
  }

  private native void SetColorModeToMapScalars_26();
  public void SetColorModeToMapScalars()
  {
    SetColorModeToMapScalars_26();
  }

  private native void SetColorModeToDirectScalars_27();
  public void SetColorModeToDirectScalars()
  {
    SetColorModeToDirectScalars_27();
  }

  private native long GetInput_28();
  public vtkImageData GetInput()
  {
    long temp = GetInput_28();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLookupTable_29(vtkScalarsToColors id0);
  public void SetLookupTable(vtkScalarsToColors id0)
  {
    SetLookupTable_29(id0);
  }

  private native long GetLookupTable_30();
  public vtkScalarsToColors GetLookupTable()
  {
    long temp = GetLookupTable_30();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMappedScalars_31();
  public vtkUnsignedCharArray GetMappedScalars()
  {
    long temp = GetMappedScalars_31();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTransform_32(vtkTransform id0);
  public void SetTransform(vtkTransform id0)
  {
    SetTransform_32(id0);
  }

  private native long GetTransform_33();
  public vtkTransform GetTransform()
  {
    long temp = GetTransform_33();

    if (temp == 0) return null;
    return (vtkTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetBlendingMode_34();
  public int GetBlendingMode()
  {
    return GetBlendingMode_34();
  }

  private native void SetBlendingMode_35(int id0);
  public void SetBlendingMode(int id0)
  {
    SetBlendingMode_35(id0);
  }

  private native boolean GetPremultipliedAlpha_36();
  public boolean GetPremultipliedAlpha()
  {
    return GetPremultipliedAlpha_36();
  }

  private native void SetPremultipliedAlpha_37(boolean id0);
  public void SetPremultipliedAlpha(boolean id0)
  {
    SetPremultipliedAlpha_37(id0);
  }

  private native void PremultipliedAlphaOn_38();
  public void PremultipliedAlphaOn()
  {
    PremultipliedAlphaOn_38();
  }

  private native void PremultipliedAlphaOff_39();
  public void PremultipliedAlphaOff()
  {
    PremultipliedAlphaOff_39();
  }

  private native int GetRestrictPowerOf2ImageSmaller_40();
  public int GetRestrictPowerOf2ImageSmaller()
  {
    return GetRestrictPowerOf2ImageSmaller_40();
  }

  private native void SetRestrictPowerOf2ImageSmaller_41(int id0);
  public void SetRestrictPowerOf2ImageSmaller(int id0)
  {
    SetRestrictPowerOf2ImageSmaller_41(id0);
  }

  private native void RestrictPowerOf2ImageSmallerOn_42();
  public void RestrictPowerOf2ImageSmallerOn()
  {
    RestrictPowerOf2ImageSmallerOn_42();
  }

  private native void RestrictPowerOf2ImageSmallerOff_43();
  public void RestrictPowerOf2ImageSmallerOff()
  {
    RestrictPowerOf2ImageSmallerOff_43();
  }

  private native int IsTranslucent_44();
  public int IsTranslucent()
  {
    return IsTranslucent_44();
  }

  private native int GetTextureUnit_45();
  public int GetTextureUnit()
  {
    return GetTextureUnit_45();
  }

  private native boolean GetCubeMap_46();
  public boolean GetCubeMap()
  {
    return GetCubeMap_46();
  }

  private native void CubeMapOn_47();
  public void CubeMapOn()
  {
    CubeMapOn_47();
  }

  private native void CubeMapOff_48();
  public void CubeMapOff()
  {
    CubeMapOff_48();
  }

  private native void SetCubeMap_49(boolean id0);
  public void SetCubeMap(boolean id0)
  {
    SetCubeMap_49(id0);
  }

  private native boolean GetUseSRGBColorSpace_50();
  public boolean GetUseSRGBColorSpace()
  {
    return GetUseSRGBColorSpace_50();
  }

  private native void SetUseSRGBColorSpace_51(boolean id0);
  public void SetUseSRGBColorSpace(boolean id0)
  {
    SetUseSRGBColorSpace_51(id0);
  }

  private native void UseSRGBColorSpaceOn_52();
  public void UseSRGBColorSpaceOn()
  {
    UseSRGBColorSpaceOn_52();
  }

  private native void UseSRGBColorSpaceOff_53();
  public void UseSRGBColorSpaceOff()
  {
    UseSRGBColorSpaceOff_53();
  }

  private native void SetBorderColor_54(float id0,float id1,float id2,float id3);
  public void SetBorderColor(float id0,float id1,float id2,float id3)
  {
    SetBorderColor_54(id0,id1,id2,id3);
  }

  private native void SetBorderColor_55(float id0[]);
  public void SetBorderColor(float id0[])
  {
    SetBorderColor_55(id0);
  }

  private native float[] GetBorderColor_56();
  public float[] GetBorderColor()
  {
    return GetBorderColor_56();
  }

  private native int GetWrap_57();
  public int GetWrap()
  {
    return GetWrap_57();
  }

  private native void SetWrap_58(int id0);
  public void SetWrap(int id0)
  {
    SetWrap_58(id0);
  }

  private native int GetWrapMinValue_59();
  public int GetWrapMinValue()
  {
    return GetWrapMinValue_59();
  }

  private native int GetWrapMaxValue_60();
  public int GetWrapMaxValue()
  {
    return GetWrapMaxValue_60();
  }

  private native void SetRepeat_61(int id0);
  public void SetRepeat(int id0)
  {
    SetRepeat_61(id0);
  }

  private native int GetRepeat_62();
  public int GetRepeat()
  {
    return GetRepeat_62();
  }

  private native void RepeatOn_63();
  public void RepeatOn()
  {
    RepeatOn_63();
  }

  private native void RepeatOff_64();
  public void RepeatOff()
  {
    RepeatOff_64();
  }

  private native void SetEdgeClamp_65(int id0);
  public void SetEdgeClamp(int id0)
  {
    SetEdgeClamp_65(id0);
  }

  private native int GetEdgeClamp_66();
  public int GetEdgeClamp()
  {
    return GetEdgeClamp_66();
  }

  private native void EdgeClampOn_67();
  public void EdgeClampOn()
  {
    EdgeClampOn_67();
  }

  private native void EdgeClampOff_68();
  public void EdgeClampOff()
  {
    EdgeClampOff_68();
  }

  public vtkTexture() { super(); }

  public vtkTexture(long id) { super(id); }
  public native long   VTKInit();

}
