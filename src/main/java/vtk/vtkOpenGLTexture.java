// java wrapper for vtkOpenGLTexture object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLTexture extends vtkTexture
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

  private native void Load_5(vtkRenderer id0);
  public void Load(vtkRenderer id0)
  {
    Load_5(id0);
  }

  private native void PostRender_6(vtkRenderer id0);
  public void PostRender(vtkRenderer id0)
  {
    PostRender_6(id0);
  }

  private native void ReleaseGraphicsResources_7(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_7(id0);
  }

  private native void CopyTexImage_8(int id0,int id1,int id2,int id3);
  public void CopyTexImage(int id0,int id1,int id2,int id3)
  {
    CopyTexImage_8(id0,id1,id2,id3);
  }

  private native int GetIsDepthTexture_9();
  public int GetIsDepthTexture()
  {
    return GetIsDepthTexture_9();
  }

  private native void SetIsDepthTexture_10(int id0);
  public void SetIsDepthTexture(int id0)
  {
    SetIsDepthTexture_10(id0);
  }

  private native int GetTextureType_11();
  public int GetTextureType()
  {
    return GetTextureType_11();
  }

  private native void SetTextureType_12(int id0);
  public void SetTextureType(int id0)
  {
    SetTextureType_12(id0);
  }

  private native long GetTextureObject_13();
  public vtkTextureObject GetTextureObject()
  {
    long temp = GetTextureObject_13();

    if (temp == 0) return null;
    return (vtkTextureObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTextureObject_14(vtkTextureObject id0);
  public void SetTextureObject(vtkTextureObject id0)
  {
    SetTextureObject_14(id0);
  }

  private native int GetTextureUnit_15();
  public int GetTextureUnit()
  {
    return GetTextureUnit_15();
  }

  private native int IsTranslucent_16();
  public int IsTranslucent()
  {
    return IsTranslucent_16();
  }

  public vtkOpenGLTexture() { super(); }

  public vtkOpenGLTexture(long id) { super(id); }
  public native long   VTKInit();

}
