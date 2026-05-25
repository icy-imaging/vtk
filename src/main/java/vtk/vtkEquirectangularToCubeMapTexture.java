// java wrapper for vtkEquirectangularToCubeMapTexture object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEquirectangularToCubeMapTexture extends vtkOpenGLTexture
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

  private native void SetInputTexture_4(vtkOpenGLTexture id0);
  public void SetInputTexture(vtkOpenGLTexture id0)
  {
    SetInputTexture_4(id0);
  }

  private native long GetInputTexture_5();
  public vtkOpenGLTexture GetInputTexture()
  {
    long temp = GetInputTexture_5();

    if (temp == 0) return null;
    return (vtkOpenGLTexture)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Load_6(vtkRenderer id0);
  public void Load(vtkRenderer id0)
  {
    Load_6(id0);
  }

  private native void Render_7(vtkRenderer id0);
  public void Render(vtkRenderer id0)
  {
    Render_7(id0);
  }

  private native int GetCubeMapSize_8();
  public int GetCubeMapSize()
  {
    return GetCubeMapSize_8();
  }

  private native void SetCubeMapSize_9(int id0);
  public void SetCubeMapSize(int id0)
  {
    SetCubeMapSize_9(id0);
  }

  private native void ReleaseGraphicsResources_10(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_10(id0);
  }

  public vtkEquirectangularToCubeMapTexture() { super(); }

  public vtkEquirectangularToCubeMapTexture(long id) { super(id); }
  public native long   VTKInit();

}
