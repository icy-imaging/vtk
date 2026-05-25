// java wrapper for vtkOpenGLState object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLState extends vtkObject
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

  private native void vtkglClearColor_4(float id0,float id1,float id2,float id3);
  public void vtkglClearColor(float id0,float id1,float id2,float id3)
  {
    vtkglClearColor_4(id0,id1,id2,id3);
  }

  private native void vtkglClearDepth_5(double id0);
  public void vtkglClearDepth(double id0)
  {
    vtkglClearDepth_5(id0);
  }

  private native void vtkglDepthFunc_6(int id0);
  public void vtkglDepthFunc(int id0)
  {
    vtkglDepthFunc_6(id0);
  }

  private native void vtkglDepthMask_7(byte id0);
  public void vtkglDepthMask(byte id0)
  {
    vtkglDepthMask_7(id0);
  }

  private native void vtkglColorMask_8(byte id0,byte id1,byte id2,byte id3);
  public void vtkglColorMask(byte id0,byte id1,byte id2,byte id3)
  {
    vtkglColorMask_8(id0,id1,id2,id3);
  }

  private native void vtkglViewport_9(int id0,int id1,int id2,int id3);
  public void vtkglViewport(int id0,int id1,int id2,int id3)
  {
    vtkglViewport_9(id0,id1,id2,id3);
  }

  private native void vtkglScissor_10(int id0,int id1,int id2,int id3);
  public void vtkglScissor(int id0,int id1,int id2,int id3)
  {
    vtkglScissor_10(id0,id1,id2,id3);
  }

  private native void vtkglEnable_11(int id0);
  public void vtkglEnable(int id0)
  {
    vtkglEnable_11(id0);
  }

  private native void vtkglDisable_12(int id0);
  public void vtkglDisable(int id0)
  {
    vtkglDisable_12(id0);
  }

  private native void vtkglBlendFunc_13(int id0,int id1);
  public void vtkglBlendFunc(int id0,int id1)
  {
    vtkglBlendFunc_13(id0,id1);
  }

  private native void vtkglBlendFuncSeparate_14(int id0,int id1,int id2,int id3);
  public void vtkglBlendFuncSeparate(int id0,int id1,int id2,int id3)
  {
    vtkglBlendFuncSeparate_14(id0,id1,id2,id3);
  }

  private native void vtkglBlendEquation_15(int id0);
  public void vtkglBlendEquation(int id0)
  {
    vtkglBlendEquation_15(id0);
  }

  private native void vtkglBlendEquationSeparate_16(int id0,int id1);
  public void vtkglBlendEquationSeparate(int id0,int id1)
  {
    vtkglBlendEquationSeparate_16(id0,id1);
  }

  private native void vtkglCullFace_17(int id0);
  public void vtkglCullFace(int id0)
  {
    vtkglCullFace_17(id0);
  }

  private native void vtkglActiveTexture_18(int id0);
  public void vtkglActiveTexture(int id0)
  {
    vtkglActiveTexture_18(id0);
  }

  private native void vtkglBindFramebuffer_19(int id0,int id1);
  public void vtkglBindFramebuffer(int id0,int id1)
  {
    vtkglBindFramebuffer_19(id0,id1);
  }

  private native void vtkglDrawBuffer_20(int id0);
  public void vtkglDrawBuffer(int id0)
  {
    vtkglDrawBuffer_20(id0);
  }

  private native void vtkglReadBuffer_21(int id0);
  public void vtkglReadBuffer(int id0)
  {
    vtkglReadBuffer_21(id0);
  }

  private native void vtkglPointSize_22(float id0);
  public void vtkglPointSize(float id0)
  {
    vtkglPointSize_22(id0);
  }

  private native void vtkglLineWidth_23(float id0);
  public void vtkglLineWidth(float id0)
  {
    vtkglLineWidth_23(id0);
  }

  private native void vtkglStencilMaskSeparate_24(int id0,int id1);
  public void vtkglStencilMaskSeparate(int id0,int id1)
  {
    vtkglStencilMaskSeparate_24(id0,id1);
  }

  private native void vtkglStencilMask_25(int id0);
  public void vtkglStencilMask(int id0)
  {
    vtkglStencilMask_25(id0);
  }

  private native void vtkglStencilOpSeparate_26(int id0,int id1,int id2,int id3);
  public void vtkglStencilOpSeparate(int id0,int id1,int id2,int id3)
  {
    vtkglStencilOpSeparate_26(id0,id1,id2,id3);
  }

  private native void vtkglStencilOp_27(int id0,int id1,int id2);
  public void vtkglStencilOp(int id0,int id1,int id2)
  {
    vtkglStencilOp_27(id0,id1,id2);
  }

  private native void vtkglStencilFuncSeparate_28(int id0,int id1,int id2,int id3);
  public void vtkglStencilFuncSeparate(int id0,int id1,int id2,int id3)
  {
    vtkglStencilFuncSeparate_28(id0,id1,id2,id3);
  }

  private native void vtkglStencilFunc_29(int id0,int id1,int id2);
  public void vtkglStencilFunc(int id0,int id1,int id2)
  {
    vtkglStencilFunc_29(id0,id1,id2);
  }

  private native void vtkBindFramebuffer_30(int id0,vtkOpenGLFramebufferObject id1);
  public void vtkBindFramebuffer(int id0,vtkOpenGLFramebufferObject id1)
  {
    vtkBindFramebuffer_30(id0,id1);
  }

  private native void vtkReadBuffer_31(int id0,vtkOpenGLFramebufferObject id1);
  public void vtkReadBuffer(int id0,vtkOpenGLFramebufferObject id1)
  {
    vtkReadBuffer_31(id0,id1);
  }

  private native void vtkglPixelStorei_32(int id0,int id1);
  public void vtkglPixelStorei(int id0,int id1)
  {
    vtkglPixelStorei_32(id0,id1);
  }

  private native void ResetGLClearColorState_33();
  public void ResetGLClearColorState()
  {
    ResetGLClearColorState_33();
  }

  private native void ResetGLClearDepthState_34();
  public void ResetGLClearDepthState()
  {
    ResetGLClearDepthState_34();
  }

  private native void ResetGLDepthFuncState_35();
  public void ResetGLDepthFuncState()
  {
    ResetGLDepthFuncState_35();
  }

  private native void ResetGLDepthMaskState_36();
  public void ResetGLDepthMaskState()
  {
    ResetGLDepthMaskState_36();
  }

  private native void ResetGLColorMaskState_37();
  public void ResetGLColorMaskState()
  {
    ResetGLColorMaskState_37();
  }

  private native void ResetGLViewportState_38();
  public void ResetGLViewportState()
  {
    ResetGLViewportState_38();
  }

  private native void ResetGLScissorState_39();
  public void ResetGLScissorState()
  {
    ResetGLScissorState_39();
  }

  private native void ResetGLBlendFuncState_40();
  public void ResetGLBlendFuncState()
  {
    ResetGLBlendFuncState_40();
  }

  private native void ResetGLBlendEquationState_41();
  public void ResetGLBlendEquationState()
  {
    ResetGLBlendEquationState_41();
  }

  private native void ResetGLCullFaceState_42();
  public void ResetGLCullFaceState()
  {
    ResetGLCullFaceState_42();
  }

  private native void ResetGLActiveTexture_43();
  public void ResetGLActiveTexture()
  {
    ResetGLActiveTexture_43();
  }

  private native void vtkglClear_44(int id0);
  public void vtkglClear(int id0)
  {
    vtkglClear_44(id0);
  }

  private native boolean GetEnumState_45(int id0);
  public boolean GetEnumState(int id0)
  {
    return GetEnumState_45(id0);
  }

  private native void SetEnumState_46(int id0,boolean id1);
  public void SetEnumState(int id0,boolean id1)
  {
    SetEnumState_46(id0,id1);
  }

  private native void ResetEnumState_47(int id0);
  public void ResetEnumState(int id0)
  {
    ResetEnumState_47(id0);
  }

  private native void ActivateTexture_48(vtkTextureObject id0);
  public void ActivateTexture(vtkTextureObject id0)
  {
    ActivateTexture_48(id0);
  }

  private native void DeactivateTexture_49(vtkTextureObject id0);
  public void DeactivateTexture(vtkTextureObject id0)
  {
    DeactivateTexture_49(id0);
  }

  private native int GetTextureUnitForTexture_50(vtkTextureObject id0);
  public int GetTextureUnitForTexture(vtkTextureObject id0)
  {
    return GetTextureUnitForTexture_50(id0);
  }

  private native void VerifyNoActiveTextures_51();
  public void VerifyNoActiveTextures()
  {
    VerifyNoActiveTextures_51();
  }

  private native void PushFramebufferBindings_52();
  public void PushFramebufferBindings()
  {
    PushFramebufferBindings_52();
  }

  private native void PushDrawFramebufferBinding_53();
  public void PushDrawFramebufferBinding()
  {
    PushDrawFramebufferBinding_53();
  }

  private native void PushReadFramebufferBinding_54();
  public void PushReadFramebufferBinding()
  {
    PushReadFramebufferBinding_54();
  }

  private native void PopFramebufferBindings_55();
  public void PopFramebufferBindings()
  {
    PopFramebufferBindings_55();
  }

  private native void PopDrawFramebufferBinding_56();
  public void PopDrawFramebufferBinding()
  {
    PopDrawFramebufferBinding_56();
  }

  private native void PopReadFramebufferBinding_57();
  public void PopReadFramebufferBinding()
  {
    PopReadFramebufferBinding_57();
  }

  private native void ResetFramebufferBindings_58();
  public void ResetFramebufferBindings()
  {
    ResetFramebufferBindings_58();
  }

  private native void Initialize_59(vtkOpenGLRenderWindow id0);
  public void Initialize(vtkOpenGLRenderWindow id0)
  {
    Initialize_59(id0);
  }

  private native void SetTextureUnitManager_60(vtkTextureUnitManager id0);
  public void SetTextureUnitManager(vtkTextureUnitManager id0)
  {
    SetTextureUnitManager_60(id0);
  }

  private native long GetTextureUnitManager_61();
  public vtkTextureUnitManager GetTextureUnitManager()
  {
    long temp = GetTextureUnitManager_61();

    if (temp == 0) return null;
    return (vtkTextureUnitManager)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetShaderCache_62();
  public vtkOpenGLShaderCache GetShaderCache()
  {
    long temp = GetShaderCache_62();

    if (temp == 0) return null;
    return (vtkOpenGLShaderCache)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVBOCache_63();
  public vtkOpenGLVertexBufferObjectCache GetVBOCache()
  {
    long temp = GetVBOCache_63();

    if (temp == 0) return null;
    return (vtkOpenGLVertexBufferObjectCache)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetVBOCache_64(vtkOpenGLVertexBufferObjectCache id0);
  public void SetVBOCache(vtkOpenGLVertexBufferObjectCache id0)
  {
    SetVBOCache_64(id0);
  }

  private native int GetDefaultTextureInternalFormat_65(int id0,int id1,boolean id2,boolean id3,boolean id4);
  public int GetDefaultTextureInternalFormat(int id0,int id1,boolean id2,boolean id3,boolean id4)
  {
    return GetDefaultTextureInternalFormat_65(id0,id1,id2,id3,id4);
  }

  private native void vtkglBlitFramebuffer_66(int id0,int id1,int id2,int id3,int id4,int id5,int id6,int id7,int id8,int id9);
  public void vtkglBlitFramebuffer(int id0,int id1,int id2,int id3,int id4,int id5,int id6,int id7,int id8,int id9)
  {
    vtkglBlitFramebuffer_66(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native void Reset_67();
  public void Reset()
  {
    Reset_67();
  }

  private native void Push_68();
  public void Push()
  {
    Push_68();
  }

  private native void Pop_69();
  public void Pop()
  {
    Pop_69();
  }

  private native byte[] GetVersion_70();
  public String GetVersion()
  {
    return new String(GetVersion_70(), StandardCharsets.UTF_8);
  }

  private native byte[] GetVendor_71();
  public String GetVendor()
  {
    return new String(GetVendor_71(), StandardCharsets.UTF_8);
  }

  private native byte[] GetRenderer_72();
  public String GetRenderer()
  {
    return new String(GetRenderer_72(), StandardCharsets.UTF_8);
  }

  public vtkOpenGLState() { super(); }

  public vtkOpenGLState(long id) { super(id); }
  public native long   VTKInit();

}
