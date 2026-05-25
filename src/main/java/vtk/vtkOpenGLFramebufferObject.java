// java wrapper for vtkOpenGLFramebufferObject object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLFramebufferObject extends vtkFrameBufferObjectBase
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

  private native void SetContext_4(vtkRenderWindow id0);
  public void SetContext(vtkRenderWindow id0)
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

  private native void Bind_6();
  public void Bind()
  {
    Bind_6();
  }

  private native void Bind_7(int id0);
  public void Bind(int id0)
  {
    Bind_7(id0);
  }

  private native void UnBind_8();
  public void UnBind()
  {
    UnBind_8();
  }

  private native void UnBind_9(int id0);
  public void UnBind(int id0)
  {
    UnBind_9(id0);
  }

  private native void SaveCurrentBindingsAndBuffers_10();
  public void SaveCurrentBindingsAndBuffers()
  {
    SaveCurrentBindingsAndBuffers_10();
  }

  private native void SaveCurrentBindingsAndBuffers_11(int id0);
  public void SaveCurrentBindingsAndBuffers(int id0)
  {
    SaveCurrentBindingsAndBuffers_11(id0);
  }

  private native void RestorePreviousBindingsAndBuffers_12();
  public void RestorePreviousBindingsAndBuffers()
  {
    RestorePreviousBindingsAndBuffers_12();
  }

  private native void RestorePreviousBindingsAndBuffers_13(int id0);
  public void RestorePreviousBindingsAndBuffers(int id0)
  {
    RestorePreviousBindingsAndBuffers_13(id0);
  }

  private native boolean Start_14(int id0,int id1);
  public boolean Start(int id0,int id1)
  {
    return Start_14(id0,id1);
  }

  private native boolean StartNonOrtho_15(int id0,int id1);
  public boolean StartNonOrtho(int id0,int id1)
  {
    return StartNonOrtho_15(id0,id1);
  }

  private native void InitializeViewport_16(int id0,int id1);
  public void InitializeViewport(int id0,int id1)
  {
    InitializeViewport_16(id0,id1);
  }

  private native void ActivateDrawBuffers_17(int id0);
  public void ActivateDrawBuffers(int id0)
  {
    ActivateDrawBuffers_17(id0);
  }

  private native void ActivateDrawBuffer_18(int id0);
  public void ActivateDrawBuffer(int id0)
  {
    ActivateDrawBuffer_18(id0);
  }

  private native void ActivateReadBuffer_19(int id0);
  public void ActivateReadBuffer(int id0)
  {
    ActivateReadBuffer_19(id0);
  }

  private native void ActivateBuffer_20(int id0);
  public void ActivateBuffer(int id0)
  {
    ActivateBuffer_20(id0);
  }

  private native void DeactivateDrawBuffers_21();
  public void DeactivateDrawBuffers()
  {
    DeactivateDrawBuffers_21();
  }

  private native void DeactivateReadBuffer_22();
  public void DeactivateReadBuffer()
  {
    DeactivateReadBuffer_22();
  }

  private native int GetActiveReadBuffer_23();
  public int GetActiveReadBuffer()
  {
    return GetActiveReadBuffer_23();
  }

  private native int GetActiveDrawBuffer_24(int id0);
  public int GetActiveDrawBuffer(int id0)
  {
    return GetActiveDrawBuffer_24(id0);
  }

  private native void RenderQuad_25(int id0,int id1,int id2,int id3,vtkShaderProgram id4,vtkOpenGLVertexArrayObject id5);
  public void RenderQuad(int id0,int id1,int id2,int id3,vtkShaderProgram id4,vtkOpenGLVertexArrayObject id5)
  {
    RenderQuad_25(id0,id1,id2,id3,id4,id5);
  }

  private native void AddColorAttachment_26(int id0,vtkTextureObject id1,int id2,int id3,int id4);
  public void AddColorAttachment(int id0,vtkTextureObject id1,int id2,int id3,int id4)
  {
    AddColorAttachment_26(id0,id1,id2,id3,id4);
  }

  private native void AddColorAttachment_27(int id0,vtkRenderbuffer id1);
  public void AddColorAttachment(int id0,vtkRenderbuffer id1)
  {
    AddColorAttachment_27(id0,id1);
  }

  private native void RemoveColorAttachment_28(int id0);
  public void RemoveColorAttachment(int id0)
  {
    RemoveColorAttachment_28(id0);
  }

  private native void RemoveColorAttachments_29(int id0);
  public void RemoveColorAttachments(int id0)
  {
    RemoveColorAttachments_29(id0);
  }

  private native long GetColorAttachmentAsTextureObject_30(int id0);
  public vtkTextureObject GetColorAttachmentAsTextureObject(int id0)
  {
    long temp = GetColorAttachmentAsTextureObject_30(id0);

    if (temp == 0) return null;
    return (vtkTextureObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfColorAttachments_31();
  public int GetNumberOfColorAttachments()
  {
    return GetNumberOfColorAttachments_31();
  }

  private native void AddDepthAttachment_32();
  public void AddDepthAttachment()
  {
    AddDepthAttachment_32();
  }

  private native void AddDepthAttachment_33(vtkTextureObject id0);
  public void AddDepthAttachment(vtkTextureObject id0)
  {
    AddDepthAttachment_33(id0);
  }

  private native void AddDepthAttachment_34(vtkRenderbuffer id0);
  public void AddDepthAttachment(vtkRenderbuffer id0)
  {
    AddDepthAttachment_34(id0);
  }

  private native void RemoveDepthAttachment_35();
  public void RemoveDepthAttachment()
  {
    RemoveDepthAttachment_35();
  }

  private native long GetDepthAttachmentAsTextureObject_36();
  public vtkTextureObject GetDepthAttachmentAsTextureObject()
  {
    long temp = GetDepthAttachmentAsTextureObject_36();

    if (temp == 0) return null;
    return (vtkTextureObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean PopulateFramebuffer_37(int id0,int id1);
  public boolean PopulateFramebuffer(int id0,int id1)
  {
    return PopulateFramebuffer_37(id0,id1);
  }

  private native boolean PopulateFramebuffer_38(int id0,int id1,boolean id2,int id3,int id4,boolean id5,int id6,int id7,boolean id8);
  public boolean PopulateFramebuffer(int id0,int id1,boolean id2,int id3,int id4,boolean id5,int id6,int id7,boolean id8)
  {
    return PopulateFramebuffer_38(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native int GetMaximumNumberOfActiveTargets_39();
  public int GetMaximumNumberOfActiveTargets()
  {
    return GetMaximumNumberOfActiveTargets_39();
  }

  private native int GetMaximumNumberOfRenderTargets_40();
  public int GetMaximumNumberOfRenderTargets()
  {
    return GetMaximumNumberOfRenderTargets_40();
  }

  private native void GetLastSize_41(int id0[]);
  public void GetLastSize(int id0[])
  {
    GetLastSize_41(id0);
  }

  private native boolean IsSupported_42(vtkOpenGLRenderWindow id0);
  public boolean IsSupported(vtkOpenGLRenderWindow id0)
  {
    return IsSupported_42(id0);
  }

  private native int CheckFrameBufferStatus_43(int id0);
  public int CheckFrameBufferStatus(int id0)
  {
    return CheckFrameBufferStatus_43(id0);
  }

  private native void ReleaseGraphicsResources_44(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_44(id0);
  }

  private native int GetFBOIndex_45();
  public int GetFBOIndex()
  {
    return GetFBOIndex_45();
  }

  private native int Blit_46(int id0[],int id1[],int id2,int id3);
  public int Blit(int id0[],int id1[],int id2,int id3)
  {
    return Blit_46(id0,id1,id2,id3);
  }

  private native long DownloadColor1_47(int id0[],int id1,int id2);
  public vtkPixelBufferObject DownloadColor1(int id0[],int id1,int id2)
  {
    long temp = DownloadColor1_47(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkPixelBufferObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DownloadColor3_48(int id0[],int id1);
  public vtkPixelBufferObject DownloadColor3(int id0[],int id1)
  {
    long temp = DownloadColor3_48(id0,id1);

    if (temp == 0) return null;
    return (vtkPixelBufferObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DownloadColor4_49(int id0[],int id1);
  public vtkPixelBufferObject DownloadColor4(int id0[],int id1)
  {
    long temp = DownloadColor4_49(id0,id1);

    if (temp == 0) return null;
    return (vtkPixelBufferObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DownloadDepth_50(int id0[],int id1);
  public vtkPixelBufferObject DownloadDepth(int id0[],int id1)
  {
    long temp = DownloadDepth_50(id0,id1);

    if (temp == 0) return null;
    return (vtkPixelBufferObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long Download_51(int id0[],int id1,int id2,int id3,int id4);
  public vtkPixelBufferObject Download(int id0[],int id1,int id2,int id3,int id4)
  {
    long temp = Download_51(id0,id1,id2,id3,id4);

    if (temp == 0) return null;
    return (vtkPixelBufferObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Download_52(int id0[],int id1,int id2,int id3,int id4,vtkPixelBufferObject id5);
  public void Download(int id0[],int id1,int id2,int id3,int id4,vtkPixelBufferObject id5)
  {
    Download_52(id0,id1,id2,id3,id4,id5);
  }

  private native int GetDrawMode_53();
  public int GetDrawMode()
  {
    return GetDrawMode_53();
  }

  private native int GetReadMode_54();
  public int GetReadMode()
  {
    return GetReadMode_54();
  }

  private native int GetBothMode_55();
  public int GetBothMode()
  {
    return GetBothMode_55();
  }

  private native void Resize_56(int id0,int id1);
  public void Resize(int id0,int id1)
  {
    Resize_56(id0,id1);
  }

  private native int GetMultiSamples_57();
  public int GetMultiSamples()
  {
    return GetMultiSamples_57();
  }

  public vtkOpenGLFramebufferObject() { super(); }

  public vtkOpenGLFramebufferObject(long id) { super(id); }
  public native long   VTKInit();

}
