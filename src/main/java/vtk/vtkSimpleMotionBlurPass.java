// java wrapper for vtkSimpleMotionBlurPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSimpleMotionBlurPass extends vtkDepthImageProcessingPass
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

  private native int GetSubFrames_5();
  public int GetSubFrames()
  {
    return GetSubFrames_5();
  }

  private native void SetSubFrames_6(int id0);
  public void SetSubFrames(int id0)
  {
    SetSubFrames_6(id0);
  }

  private native void SetDepthFormat_7(int id0);
  public void SetDepthFormat(int id0)
  {
    SetDepthFormat_7(id0);
  }

  private native void SetColorFormat_8(int id0);
  public void SetColorFormat(int id0)
  {
    SetColorFormat_8(id0);
  }

  private native long GetDepthTexture_9();
  public vtkTextureObject GetDepthTexture()
  {
    long temp = GetDepthTexture_9();

    if (temp == 0) return null;
    return (vtkTextureObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetColorTexture_10();
  public vtkTextureObject GetColorTexture()
  {
    long temp = GetColorTexture_10();

    if (temp == 0) return null;
    return (vtkTextureObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkSimpleMotionBlurPass() { super(); }

  public vtkSimpleMotionBlurPass(long id) { super(id); }
  public native long   VTKInit();

}
