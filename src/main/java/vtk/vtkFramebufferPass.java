// java wrapper for vtkFramebufferPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFramebufferPass extends vtkDepthImageProcessingPass
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

  private native void ReleaseGraphicsResources_4(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_4(id0);
  }

  private native void SetDepthFormat_5(int id0);
  public void SetDepthFormat(int id0)
  {
    SetDepthFormat_5(id0);
  }

  private native void SetColorFormat_6(int id0);
  public void SetColorFormat(int id0)
  {
    SetColorFormat_6(id0);
  }

  private native long GetDepthTexture_7();
  public vtkTextureObject GetDepthTexture()
  {
    long temp = GetDepthTexture_7();

    if (temp == 0) return null;
    return (vtkTextureObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetColorTexture_8();
  public vtkTextureObject GetColorTexture()
  {
    long temp = GetColorTexture_8();

    if (temp == 0) return null;
    return (vtkTextureObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkFramebufferPass() { super(); }

  public vtkFramebufferPass(long id) { super(id); }
  public native long   VTKInit();

}
