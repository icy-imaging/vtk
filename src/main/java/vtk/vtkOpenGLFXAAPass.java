// java wrapper for vtkOpenGLFXAAPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLFXAAPass extends vtkImageProcessingPass
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

  private native long GetFXAAOptions_5();
  public vtkFXAAOptions GetFXAAOptions()
  {
    long temp = GetFXAAOptions_5();

    if (temp == 0) return null;
    return (vtkFXAAOptions)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFXAAOptions_6(vtkFXAAOptions id0);
  public void SetFXAAOptions(vtkFXAAOptions id0)
  {
    SetFXAAOptions_6(id0);
  }

  public vtkOpenGLFXAAPass() { super(); }

  public vtkOpenGLFXAAPass(long id) { super(id); }
  public native long   VTKInit();

}
