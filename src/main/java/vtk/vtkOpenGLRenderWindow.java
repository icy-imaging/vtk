// java wrapper for vtkOpenGLRenderWindow object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLRenderWindow extends vtkRenderWindow
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

  private native void Start_4();
  public void Start()
  {
    Start_4();
  }

  private native void Frame_5();
  public void Frame()
  {
    Frame_5();
  }

  private native byte[] GetRenderingBackend_6();
  public String GetRenderingBackend()
  {
    return new String(GetRenderingBackend_6(), StandardCharsets.UTF_8);
  }

  private native void SetGlobalMaximumNumberOfMultiSamples_7(int id0);
  public void SetGlobalMaximumNumberOfMultiSamples(int id0)
  {
    SetGlobalMaximumNumberOfMultiSamples_7(id0);
  }

  private native int GetGlobalMaximumNumberOfMultiSamples_8();
  public int GetGlobalMaximumNumberOfMultiSamples()
  {
    return GetGlobalMaximumNumberOfMultiSamples_8();
  }

  private native int GetPixelData_9(int id0,int id1,int id2,int id3,int id4,vtkUnsignedCharArray id5,int id6);
  public int GetPixelData(int id0,int id1,int id2,int id3,int id4,vtkUnsignedCharArray id5,int id6)
  {
    return GetPixelData_9(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int SetPixelData_10(int id0,int id1,int id2,int id3,vtkUnsignedCharArray id4,int id5,int id6);
  public int SetPixelData(int id0,int id1,int id2,int id3,vtkUnsignedCharArray id4,int id5,int id6)
  {
    return SetPixelData_10(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int GetRGBAPixelData_11(int id0,int id1,int id2,int id3,int id4,vtkFloatArray id5,int id6);
  public int GetRGBAPixelData(int id0,int id1,int id2,int id3,int id4,vtkFloatArray id5,int id6)
  {
    return GetRGBAPixelData_11(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int SetRGBAPixelData_12(int id0,int id1,int id2,int id3,vtkFloatArray id4,int id5,int id6,int id7);
  public int SetRGBAPixelData(int id0,int id1,int id2,int id3,vtkFloatArray id4,int id5,int id6,int id7)
  {
    return SetRGBAPixelData_12(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native int GetRGBACharPixelData_13(int id0,int id1,int id2,int id3,int id4,vtkUnsignedCharArray id5,int id6);
  public int GetRGBACharPixelData(int id0,int id1,int id2,int id3,int id4,vtkUnsignedCharArray id5,int id6)
  {
    return GetRGBACharPixelData_13(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int SetRGBACharPixelData_14(int id0,int id1,int id2,int id3,vtkUnsignedCharArray id4,int id5,int id6,int id7);
  public int SetRGBACharPixelData(int id0,int id1,int id2,int id3,vtkUnsignedCharArray id4,int id5,int id6,int id7)
  {
    return SetRGBACharPixelData_14(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native int GetZbufferData_15(int id0,int id1,int id2,int id3,vtkFloatArray id4);
  public int GetZbufferData(int id0,int id1,int id2,int id3,vtkFloatArray id4)
  {
    return GetZbufferData_15(id0,id1,id2,id3,id4);
  }

  private native int SetZbufferData_16(int id0,int id1,int id2,int id3,vtkFloatArray id4);
  public int SetZbufferData(int id0,int id1,int id2,int id3,vtkFloatArray id4)
  {
    return SetZbufferData_16(id0,id1,id2,id3,id4);
  }

  private native void ActivateTexture_17(vtkTextureObject id0);
  public void ActivateTexture(vtkTextureObject id0)
  {
    ActivateTexture_17(id0);
  }

  private native void DeactivateTexture_18(vtkTextureObject id0);
  public void DeactivateTexture(vtkTextureObject id0)
  {
    DeactivateTexture_18(id0);
  }

  private native int GetTextureUnitForTexture_19(vtkTextureObject id0);
  public int GetTextureUnitForTexture(vtkTextureObject id0)
  {
    return GetTextureUnitForTexture_19(id0);
  }

  private native int GetDepthBufferSize_20();
  public int GetDepthBufferSize()
  {
    return GetDepthBufferSize_20();
  }

  private native boolean GetUsingSRGBColorSpace_21();
  public boolean GetUsingSRGBColorSpace()
  {
    return GetUsingSRGBColorSpace_21();
  }

  private native int GetColorBufferInternalFormat_22(int id0);
  public int GetColorBufferInternalFormat(int id0)
  {
    return GetColorBufferInternalFormat_22(id0);
  }

  private native void OpenGLInit_23();
  public void OpenGLInit()
  {
    OpenGLInit_23();
  }

  private native void OpenGLInitState_24();
  public void OpenGLInitState()
  {
    OpenGLInitState_24();
  }

  private native void OpenGLInitContext_25();
  public void OpenGLInitContext()
  {
    OpenGLInitContext_25();
  }

  private native long GetContextCreationTime_26();
  public long GetContextCreationTime()
  {
    return GetContextCreationTime_26();
  }

  private native long GetShaderCache_27();
  public vtkOpenGLShaderCache GetShaderCache()
  {
    long temp = GetShaderCache_27();

    if (temp == 0) return null;
    return (vtkOpenGLShaderCache)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVBOCache_28();
  public vtkOpenGLVertexBufferObjectCache GetVBOCache()
  {
    long temp = GetVBOCache_28();

    if (temp == 0) return null;
    return (vtkOpenGLVertexBufferObjectCache)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRenderFramebuffer_29();
  public vtkOpenGLFramebufferObject GetRenderFramebuffer()
  {
    long temp = GetRenderFramebuffer_29();

    if (temp == 0) return null;
    return (vtkOpenGLFramebufferObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDisplayFramebuffer_30();
  public vtkOpenGLFramebufferObject GetDisplayFramebuffer()
  {
    long temp = GetDisplayFramebuffer_30();

    if (temp == 0) return null;
    return (vtkOpenGLFramebufferObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTextureUnitManager_31();
  public vtkTextureUnitManager GetTextureUnitManager()
  {
    long temp = GetTextureUnitManager_31();

    if (temp == 0) return null;
    return (vtkTextureUnitManager)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void WaitForCompletion_32();
  public void WaitForCompletion()
  {
    WaitForCompletion_32();
  }

  private native float GetMaximumHardwareLineWidth_33();
  public float GetMaximumHardwareLineWidth()
  {
    return GetMaximumHardwareLineWidth_33();
  }

  private native boolean IsPointSpriteBugPresent_34();
  public boolean IsPointSpriteBugPresent()
  {
    return IsPointSpriteBugPresent_34();
  }

  private native int GetDefaultTextureInternalFormat_35(int id0,int id1,boolean id2,boolean id3,boolean id4);
  public int GetDefaultTextureInternalFormat(int id0,int id1,boolean id2,boolean id3,boolean id4)
  {
    return GetDefaultTextureInternalFormat_35(id0,id1,id2,id3,id4);
  }

  private native byte[] GetOpenGLSupportMessage_36();
  public String GetOpenGLSupportMessage()
  {
    return new String(GetOpenGLSupportMessage_36(), StandardCharsets.UTF_8);
  }

  private native int SupportsOpenGL_37();
  public int SupportsOpenGL()
  {
    return SupportsOpenGL_37();
  }

  private native byte[] ReportCapabilities_38();
  public String ReportCapabilities()
  {
    return new String(ReportCapabilities_38(), StandardCharsets.UTF_8);
  }

  private native void Initialize_39();
  public void Initialize()
  {
    Initialize_39();
  }

  private native void PushContext_40();
  public void PushContext()
  {
    PushContext_40();
  }

  private native void PopContext_41();
  public void PopContext()
  {
    PopContext_41();
  }

  private native boolean InitializeFromCurrentContext_42();
  public boolean InitializeFromCurrentContext()
  {
    return InitializeFromCurrentContext_42();
  }

  private native boolean SetSwapControl_43(int id0);
  public boolean SetSwapControl(int id0)
  {
    return SetSwapControl_43(id0);
  }

  private native long GetState_44();
  public vtkOpenGLState GetState()
  {
    long temp = GetState_44();

    if (temp == 0) return null;
    return (vtkOpenGLState)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTQuad2DVBO_45();
  public vtkOpenGLBufferObject GetTQuad2DVBO()
  {
    long temp = GetTQuad2DVBO_45();

    if (temp == 0) return null;
    return (vtkOpenGLBufferObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNoiseTextureUnit_46();
  public int GetNoiseTextureUnit()
  {
    return GetNoiseTextureUnit_46();
  }

  private native void End_47();
  public void End()
  {
    End_47();
  }

  private native void Render_48();
  public void Render()
  {
    Render_48();
  }

  private native void StereoMidpoint_49();
  public void StereoMidpoint()
  {
    StereoMidpoint_49();
  }

  private native boolean GetBufferNeedsResolving_50();
  public boolean GetBufferNeedsResolving()
  {
    return GetBufferNeedsResolving_50();
  }

  private native void ReleaseGraphicsResources_51(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_51(id0);
  }

  private native void BlitDisplayFramebuffer_52();
  public void BlitDisplayFramebuffer()
  {
    BlitDisplayFramebuffer_52();
  }

  private native void BlitDisplayFramebufferColorAndDepth_53();
  public void BlitDisplayFramebufferColorAndDepth()
  {
    BlitDisplayFramebufferColorAndDepth_53();
  }

  private native void BlitDisplayFramebuffer_54(int id0,int id1,int id2,int id3,int id4,int id5,int id6,int id7,int id8,int id9,int id10);
  public void BlitDisplayFramebuffer(int id0,int id1,int id2,int id3,int id4,int id5,int id6,int id7,int id8,int id9,int id10)
  {
    BlitDisplayFramebuffer_54(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10);
  }

  private native void BlitToRenderFramebuffer_55(boolean id0);
  public void BlitToRenderFramebuffer(boolean id0)
  {
    BlitToRenderFramebuffer_55(id0);
  }

  private native void BlitToRenderFramebuffer_56(int id0,int id1,int id2,int id3,int id4,int id5,int id6,int id7,int id8,int id9);
  public void BlitToRenderFramebuffer(int id0,int id1,int id2,int id3,int id4,int id5,int id6,int id7,int id8,int id9)
  {
    BlitToRenderFramebuffer_56(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native void SetFrameBlitMode_57(int id0);
  public void SetFrameBlitMode(int id0)
  {
    SetFrameBlitMode_57(id0);
  }

  private native int GetFrameBlitModeMinValue_58();
  public int GetFrameBlitModeMinValue()
  {
    return GetFrameBlitModeMinValue_58();
  }

  private native int GetFrameBlitModeMaxValue_59();
  public int GetFrameBlitModeMaxValue()
  {
    return GetFrameBlitModeMaxValue_59();
  }

  private native int GetFrameBlitMode_60();
  public int GetFrameBlitMode()
  {
    return GetFrameBlitMode_60();
  }

  private native void SetFrameBlitModeToBlitToHardware_61();
  public void SetFrameBlitModeToBlitToHardware()
  {
    SetFrameBlitModeToBlitToHardware_61();
  }

  private native void SetFrameBlitModeToBlitToCurrent_62();
  public void SetFrameBlitModeToBlitToCurrent()
  {
    SetFrameBlitModeToBlitToCurrent_62();
  }

  private native void SetFrameBlitModeToBlitToCurrentWithDepth_63();
  public void SetFrameBlitModeToBlitToCurrentWithDepth()
  {
    SetFrameBlitModeToBlitToCurrentWithDepth_63();
  }

  private native void SetFrameBlitModeToNoBlit_64();
  public void SetFrameBlitModeToNoBlit()
  {
    SetFrameBlitModeToNoBlit_64();
  }

  private native void SetFramebufferFlipY_65(boolean id0);
  public void SetFramebufferFlipY(boolean id0)
  {
    SetFramebufferFlipY_65(id0);
  }

  private native boolean GetFramebufferFlipY_66();
  public boolean GetFramebufferFlipY()
  {
    return GetFramebufferFlipY_66();
  }

  private native void FramebufferFlipYOn_67();
  public void FramebufferFlipYOn()
  {
    FramebufferFlipYOn_67();
  }

  private native void FramebufferFlipYOff_68();
  public void FramebufferFlipYOff()
  {
    FramebufferFlipYOff_68();
  }

  private native void SetRenderBufferTargetDepthSize_69(int id0);
  public void SetRenderBufferTargetDepthSize(int id0)
  {
    SetRenderBufferTargetDepthSize_69(id0);
  }

  private native int GetRenderBufferTargetDepthSize_70();
  public int GetRenderBufferTargetDepthSize()
  {
    return GetRenderBufferTargetDepthSize_70();
  }

  private native void TextureDepthBlit_71(vtkTextureObject id0);
  public void TextureDepthBlit(vtkTextureObject id0)
  {
    TextureDepthBlit_71(id0);
  }

  private native void TextureDepthBlit_72(vtkTextureObject id0,int id1,int id2,int id3,int id4);
  public void TextureDepthBlit(vtkTextureObject id0,int id1,int id2,int id3,int id4)
  {
    TextureDepthBlit_72(id0,id1,id2,id3,id4);
  }

  private native void TextureDepthBlit_73(vtkTextureObject id0,int id1,int id2,int id3,int id4,int id5,int id6,int id7,int id8);
  public void TextureDepthBlit(vtkTextureObject id0,int id1,int id2,int id3,int id4,int id5,int id6,int id7,int id8)
  {
    TextureDepthBlit_73(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  public vtkOpenGLRenderWindow() { super(); }

  public vtkOpenGLRenderWindow(long id) { super(id); }

}
