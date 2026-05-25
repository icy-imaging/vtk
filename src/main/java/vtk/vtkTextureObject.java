// java wrapper for vtkTextureObject object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTextureObject extends vtkObject
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

  private native void SetContext_4(vtkOpenGLRenderWindow id0);
  public void SetContext(vtkOpenGLRenderWindow id0)
  {
    SetContext_4(id0);
  }

  private native long GetContext_5();
  public vtkOpenGLRenderWindow GetContext()
  {
    long temp = GetContext_5();

    if (temp == 0) return null;
    return (vtkOpenGLRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetWidth_6();
  public int GetWidth()
  {
    return GetWidth_6();
  }

  private native int GetHeight_7();
  public int GetHeight()
  {
    return GetHeight_7();
  }

  private native int GetDepth_8();
  public int GetDepth()
  {
    return GetDepth_8();
  }

  private native int GetSamples_9();
  public int GetSamples()
  {
    return GetSamples_9();
  }

  private native int GetComponents_10();
  public int GetComponents()
  {
    return GetComponents_10();
  }

  private native int GetTuples_11();
  public int GetTuples()
  {
    return GetTuples_11();
  }

  private native int GetNumberOfDimensions_12();
  public int GetNumberOfDimensions()
  {
    return GetNumberOfDimensions_12();
  }

  private native void SetSamples_13(int id0);
  public void SetSamples(int id0)
  {
    SetSamples_13(id0);
  }

  private native int GetTarget_14();
  public int GetTarget()
  {
    return GetTarget_14();
  }

  private native int GetHandle_15();
  public int GetHandle()
  {
    return GetHandle_15();
  }

  private native int GetTextureUnit_16();
  public int GetTextureUnit()
  {
    return GetTextureUnit_16();
  }

  private native void Bind_17();
  public void Bind()
  {
    Bind_17();
  }

  private native void Activate_18();
  public void Activate()
  {
    Activate_18();
  }

  private native void Deactivate_19();
  public void Deactivate()
  {
    Deactivate_19();
  }

  private native void ReleaseGraphicsResources_20(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_20(id0);
  }

  private native boolean IsBound_21();
  public boolean IsBound()
  {
    return IsBound_21();
  }

  private native void SendParameters_22();
  public void SendParameters()
  {
    SendParameters_22();
  }

  private native void SetAutoParameters_23(int id0);
  public void SetAutoParameters(int id0)
  {
    SetAutoParameters_23(id0);
  }

  private native int GetAutoParameters_24();
  public int GetAutoParameters()
  {
    return GetAutoParameters_24();
  }

  private native void AutoParametersOn_25();
  public void AutoParametersOn()
  {
    AutoParametersOn_25();
  }

  private native void AutoParametersOff_26();
  public void AutoParametersOff()
  {
    AutoParametersOff_26();
  }

  private native boolean CreateTextureBuffer_27(int id0,int id1,int id2,vtkOpenGLBufferObject id3);
  public boolean CreateTextureBuffer(int id0,int id1,int id2,vtkOpenGLBufferObject id3)
  {
    return CreateTextureBuffer_27(id0,id1,id2,id3);
  }

  private native boolean EmulateTextureBufferWith2DTextures_28(int id0,int id1,int id2,vtkOpenGLBufferObject id3);
  public boolean EmulateTextureBufferWith2DTextures(int id0,int id1,int id2,vtkOpenGLBufferObject id3)
  {
    return EmulateTextureBufferWith2DTextures_28(id0,id1,id2,id3);
  }

  private native boolean Create1D_29(int id0,vtkPixelBufferObject id1,boolean id2);
  public boolean Create1D(int id0,vtkPixelBufferObject id1,boolean id2)
  {
    return Create1D_29(id0,id1,id2);
  }

  private native boolean Create2D_30(int id0,int id1,int id2,vtkPixelBufferObject id3,boolean id4);
  public boolean Create2D(int id0,int id1,int id2,vtkPixelBufferObject id3,boolean id4)
  {
    return Create2D_30(id0,id1,id2,id3,id4);
  }

  private native boolean Create3D_31(int id0,int id1,int id2,int id3,vtkPixelBufferObject id4,boolean id5);
  public boolean Create3D(int id0,int id1,int id2,int id3,vtkPixelBufferObject id4,boolean id5)
  {
    return Create3D_31(id0,id1,id2,id3,id4,id5);
  }

  private native boolean AllocateProxyTexture3D_32(int id0,int id1,int id2,int id3,int id4);
  public boolean AllocateProxyTexture3D(int id0,int id1,int id2,int id3,int id4)
  {
    return AllocateProxyTexture3D_32(id0,id1,id2,id3,id4);
  }

  private native long Download_33();
  public vtkPixelBufferObject Download()
  {
    long temp = Download_33();

    if (temp == 0) return null;
    return (vtkPixelBufferObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long Download_34(int id0,int id1);
  public vtkPixelBufferObject Download(int id0,int id1)
  {
    long temp = Download_34(id0,id1);

    if (temp == 0) return null;
    return (vtkPixelBufferObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean CreateDepth_35(int id0,int id1,int id2,vtkPixelBufferObject id3);
  public boolean CreateDepth(int id0,int id1,int id2,vtkPixelBufferObject id3)
  {
    return CreateDepth_35(id0,id1,id2,id3);
  }

  private native boolean AllocateDepth_36(int id0,int id1,int id2);
  public boolean AllocateDepth(int id0,int id1,int id2)
  {
    return AllocateDepth_36(id0,id1,id2);
  }

  private native boolean AllocateDepthStencil_37(int id0,int id1);
  public boolean AllocateDepthStencil(int id0,int id1)
  {
    return AllocateDepthStencil_37(id0,id1);
  }

  private native boolean Allocate1D_38(int id0,int id1,int id2);
  public boolean Allocate1D(int id0,int id1,int id2)
  {
    return Allocate1D_38(id0,id1,id2);
  }

  private native boolean Allocate2D_39(int id0,int id1,int id2,int id3,int id4);
  public boolean Allocate2D(int id0,int id1,int id2,int id3,int id4)
  {
    return Allocate2D_39(id0,id1,id2,id3,id4);
  }

  private native boolean Allocate3D_40(int id0,int id1,int id2,int id3,int id4);
  public boolean Allocate3D(int id0,int id1,int id2,int id3,int id4)
  {
    return Allocate3D_40(id0,id1,id2,id3,id4);
  }

  private native boolean Create2D_41(int id0,int id1,int id2,int id3,boolean id4);
  public boolean Create2D(int id0,int id1,int id2,int id3,boolean id4)
  {
    return Create2D_41(id0,id1,id2,id3,id4);
  }

  private native boolean Create3D_42(int id0,int id1,int id2,int id3,int id4,boolean id5);
  public boolean Create3D(int id0,int id1,int id2,int id3,int id4,boolean id5)
  {
    return Create3D_42(id0,id1,id2,id3,id4,id5);
  }

  private native int GetVTKDataType_43();
  public int GetVTKDataType()
  {
    return GetVTKDataType_43();
  }

  private native int GetDataType_44(int id0);
  public int GetDataType(int id0)
  {
    return GetDataType_44(id0);
  }

  private native void SetDataType_45(int id0);
  public void SetDataType(int id0)
  {
    SetDataType_45(id0);
  }

  private native int GetDefaultDataType_46(int id0);
  public int GetDefaultDataType(int id0)
  {
    return GetDefaultDataType_46(id0);
  }

  private native int GetInternalFormat_47(int id0,int id1,boolean id2);
  public int GetInternalFormat(int id0,int id1,boolean id2)
  {
    return GetInternalFormat_47(id0,id1,id2);
  }

  private native void SetInternalFormat_48(int id0);
  public void SetInternalFormat(int id0)
  {
    SetInternalFormat_48(id0);
  }

  private native int GetDefaultInternalFormat_49(int id0,int id1,boolean id2);
  public int GetDefaultInternalFormat(int id0,int id1,boolean id2)
  {
    return GetDefaultInternalFormat_49(id0,id1,id2);
  }

  private native int GetFormat_50(int id0,int id1,boolean id2);
  public int GetFormat(int id0,int id1,boolean id2)
  {
    return GetFormat_50(id0,id1,id2);
  }

  private native void SetFormat_51(int id0);
  public void SetFormat(int id0)
  {
    SetFormat_51(id0);
  }

  private native int GetDefaultFormat_52(int id0,int id1,boolean id2);
  public int GetDefaultFormat(int id0,int id1,boolean id2)
  {
    return GetDefaultFormat_52(id0,id1,id2);
  }

  private native void ResetFormatAndType_53();
  public void ResetFormatAndType()
  {
    ResetFormatAndType_53();
  }

  private native int GetMinificationFilterMode_54(int id0);
  public int GetMinificationFilterMode(int id0)
  {
    return GetMinificationFilterMode_54(id0);
  }

  private native int GetMagnificationFilterMode_55(int id0);
  public int GetMagnificationFilterMode(int id0)
  {
    return GetMagnificationFilterMode_55(id0);
  }

  private native int GetWrapSMode_56(int id0);
  public int GetWrapSMode(int id0)
  {
    return GetWrapSMode_56(id0);
  }

  private native int GetWrapTMode_57(int id0);
  public int GetWrapTMode(int id0)
  {
    return GetWrapTMode_57(id0);
  }

  private native int GetWrapRMode_58(int id0);
  public int GetWrapRMode(int id0)
  {
    return GetWrapRMode_58(id0);
  }

  private native void SetRequireDepthBufferFloat_59(boolean id0);
  public void SetRequireDepthBufferFloat(boolean id0)
  {
    SetRequireDepthBufferFloat_59(id0);
  }

  private native boolean GetRequireDepthBufferFloat_60();
  public boolean GetRequireDepthBufferFloat()
  {
    return GetRequireDepthBufferFloat_60();
  }

  private native boolean GetSupportsDepthBufferFloat_61();
  public boolean GetSupportsDepthBufferFloat()
  {
    return GetSupportsDepthBufferFloat_61();
  }

  private native void SetRequireTextureFloat_62(boolean id0);
  public void SetRequireTextureFloat(boolean id0)
  {
    SetRequireTextureFloat_62(id0);
  }

  private native boolean GetRequireTextureFloat_63();
  public boolean GetRequireTextureFloat()
  {
    return GetRequireTextureFloat_63();
  }

  private native boolean GetSupportsTextureFloat_64();
  public boolean GetSupportsTextureFloat()
  {
    return GetSupportsTextureFloat_64();
  }

  private native void SetRequireTextureInteger_65(boolean id0);
  public void SetRequireTextureInteger(boolean id0)
  {
    SetRequireTextureInteger_65(id0);
  }

  private native boolean GetRequireTextureInteger_66();
  public boolean GetRequireTextureInteger()
  {
    return GetRequireTextureInteger_66();
  }

  private native boolean GetSupportsTextureInteger_67();
  public boolean GetSupportsTextureInteger()
  {
    return GetSupportsTextureInteger_67();
  }

  private native int GetWrapS_68();
  public int GetWrapS()
  {
    return GetWrapS_68();
  }

  private native void SetWrapS_69(int id0);
  public void SetWrapS(int id0)
  {
    SetWrapS_69(id0);
  }

  private native int GetWrapT_70();
  public int GetWrapT()
  {
    return GetWrapT_70();
  }

  private native void SetWrapT_71(int id0);
  public void SetWrapT(int id0)
  {
    SetWrapT_71(id0);
  }

  private native int GetWrapR_72();
  public int GetWrapR()
  {
    return GetWrapR_72();
  }

  private native void SetWrapR_73(int id0);
  public void SetWrapR(int id0)
  {
    SetWrapR_73(id0);
  }

  private native int GetMinificationFilter_74();
  public int GetMinificationFilter()
  {
    return GetMinificationFilter_74();
  }

  private native void SetMinificationFilter_75(int id0);
  public void SetMinificationFilter(int id0)
  {
    SetMinificationFilter_75(id0);
  }

  private native int GetMagnificationFilter_76();
  public int GetMagnificationFilter()
  {
    return GetMagnificationFilter_76();
  }

  private native void SetMagnificationFilter_77(int id0);
  public void SetMagnificationFilter(int id0)
  {
    SetMagnificationFilter_77(id0);
  }

  private native void SetLinearMagnification_78(boolean id0);
  public void SetLinearMagnification(boolean id0)
  {
    SetLinearMagnification_78(id0);
  }

  private native boolean GetLinearMagnification_79();
  public boolean GetLinearMagnification()
  {
    return GetLinearMagnification_79();
  }

  private native void SetBorderColor_80(float id0,float id1,float id2,float id3);
  public void SetBorderColor(float id0,float id1,float id2,float id3)
  {
    SetBorderColor_80(id0,id1,id2,id3);
  }

  private native void SetBorderColor_81(float id0[]);
  public void SetBorderColor(float id0[])
  {
    SetBorderColor_81(id0);
  }

  private native float[] GetBorderColor_82();
  public float[] GetBorderColor()
  {
    return GetBorderColor_82();
  }

  private native void SetMinLOD_83(float id0);
  public void SetMinLOD(float id0)
  {
    SetMinLOD_83(id0);
  }

  private native float GetMinLOD_84();
  public float GetMinLOD()
  {
    return GetMinLOD_84();
  }

  private native void SetMaxLOD_85(float id0);
  public void SetMaxLOD(float id0)
  {
    SetMaxLOD_85(id0);
  }

  private native float GetMaxLOD_86();
  public float GetMaxLOD()
  {
    return GetMaxLOD_86();
  }

  private native void SetBaseLevel_87(int id0);
  public void SetBaseLevel(int id0)
  {
    SetBaseLevel_87(id0);
  }

  private native int GetBaseLevel_88();
  public int GetBaseLevel()
  {
    return GetBaseLevel_88();
  }

  private native void SetMaxLevel_89(int id0);
  public void SetMaxLevel(int id0)
  {
    SetMaxLevel_89(id0);
  }

  private native int GetMaxLevel_90();
  public int GetMaxLevel()
  {
    return GetMaxLevel_90();
  }

  private native boolean GetDepthTextureCompare_91();
  public boolean GetDepthTextureCompare()
  {
    return GetDepthTextureCompare_91();
  }

  private native void SetDepthTextureCompare_92(boolean id0);
  public void SetDepthTextureCompare(boolean id0)
  {
    SetDepthTextureCompare_92(id0);
  }

  private native int GetDepthTextureCompareFunction_93();
  public int GetDepthTextureCompareFunction()
  {
    return GetDepthTextureCompareFunction_93();
  }

  private native void SetDepthTextureCompareFunction_94(int id0);
  public void SetDepthTextureCompareFunction(int id0)
  {
    SetDepthTextureCompareFunction_94(id0);
  }

  private native boolean GetGenerateMipmap_95();
  public boolean GetGenerateMipmap()
  {
    return GetGenerateMipmap_95();
  }

  private native void SetGenerateMipmap_96(boolean id0);
  public void SetGenerateMipmap(boolean id0)
  {
    SetGenerateMipmap_96(id0);
  }

  private native void SetMaximumAnisotropicFiltering_97(float id0);
  public void SetMaximumAnisotropicFiltering(float id0)
  {
    SetMaximumAnisotropicFiltering_97(id0);
  }

  private native float GetMaximumAnisotropicFiltering_98();
  public float GetMaximumAnisotropicFiltering()
  {
    return GetMaximumAnisotropicFiltering_98();
  }

  private native int GetMaximumTextureSize_99(vtkOpenGLRenderWindow id0);
  public int GetMaximumTextureSize(vtkOpenGLRenderWindow id0)
  {
    return GetMaximumTextureSize_99(id0);
  }

  private native int GetMaximumTextureSize3D_100(vtkOpenGLRenderWindow id0);
  public int GetMaximumTextureSize3D(vtkOpenGLRenderWindow id0)
  {
    return GetMaximumTextureSize3D_100(id0);
  }

  private native int GetMaximumTextureSize3D_101();
  public int GetMaximumTextureSize3D()
  {
    return GetMaximumTextureSize3D_101();
  }

  private native boolean IsSupported_102(vtkOpenGLRenderWindow id0,boolean id1,boolean id2,boolean id3);
  public boolean IsSupported(vtkOpenGLRenderWindow id0,boolean id1,boolean id2,boolean id3)
  {
    return IsSupported_102(id0,id1,id2,id3);
  }

  private native boolean IsSupported_103(vtkOpenGLRenderWindow id0);
  public boolean IsSupported(vtkOpenGLRenderWindow id0)
  {
    return IsSupported_103(id0);
  }

  private native void CopyToFrameBuffer_104(vtkShaderProgram id0,vtkOpenGLVertexArrayObject id1);
  public void CopyToFrameBuffer(vtkShaderProgram id0,vtkOpenGLVertexArrayObject id1)
  {
    CopyToFrameBuffer_104(id0,id1);
  }

  private native void CopyToFrameBuffer_105(int id0,int id1,int id2,int id3,int id4,int id5,int id6,int id7,int id8,int id9,vtkShaderProgram id10,vtkOpenGLVertexArrayObject id11);
  public void CopyToFrameBuffer(int id0,int id1,int id2,int id3,int id4,int id5,int id6,int id7,int id8,int id9,vtkShaderProgram id10,vtkOpenGLVertexArrayObject id11)
  {
    CopyToFrameBuffer_105(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11);
  }

  private native void CopyToFrameBuffer_106(int id0,int id1,int id2,int id3,int id4,int id5,int id6,int id7,vtkShaderProgram id8,vtkOpenGLVertexArrayObject id9);
  public void CopyToFrameBuffer(int id0,int id1,int id2,int id3,int id4,int id5,int id6,int id7,vtkShaderProgram id8,vtkOpenGLVertexArrayObject id9)
  {
    CopyToFrameBuffer_106(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native void CopyFromFrameBuffer_107(int id0,int id1,int id2,int id3,int id4,int id5);
  public void CopyFromFrameBuffer(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    CopyFromFrameBuffer_107(id0,id1,id2,id3,id4,id5);
  }

  private native void Resize_108(int id0,int id1);
  public void Resize(int id0,int id1)
  {
    Resize_108(id0,id1);
  }

  private native boolean GetUseSRGBColorSpace_109();
  public boolean GetUseSRGBColorSpace()
  {
    return GetUseSRGBColorSpace_109();
  }

  private native void SetUseSRGBColorSpace_110(boolean id0);
  public void SetUseSRGBColorSpace(boolean id0)
  {
    SetUseSRGBColorSpace_110(id0);
  }

  private native void UseSRGBColorSpaceOn_111();
  public void UseSRGBColorSpaceOn()
  {
    UseSRGBColorSpaceOn_111();
  }

  private native void UseSRGBColorSpaceOff_112();
  public void UseSRGBColorSpaceOff()
  {
    UseSRGBColorSpaceOff_112();
  }

  private native void AssignToExistingTexture_113(int id0,int id1);
  public void AssignToExistingTexture(int id0,int id1)
  {
    AssignToExistingTexture_113(id0,id1);
  }

  public vtkTextureObject() { super(); }

  public vtkTextureObject(long id) { super(id); }
  public native long   VTKInit();

}
