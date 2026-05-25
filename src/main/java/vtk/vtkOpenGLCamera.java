// java wrapper for vtkOpenGLCamera object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLCamera extends vtkCamera
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

  private native void UpdateViewport_5(vtkRenderer id0);
  public void UpdateViewport(vtkRenderer id0)
  {
    UpdateViewport_5(id0);
  }

  public vtkOpenGLCamera() { super(); }

  public vtkOpenGLCamera(long id) { super(id); }
  public native long   VTKInit();

}
