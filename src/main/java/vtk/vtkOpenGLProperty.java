// java wrapper for vtkOpenGLProperty object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLProperty extends vtkProperty
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

  private native void Render_4(vtkActor id0,vtkRenderer id1);
  public void Render(vtkActor id0,vtkRenderer id1)
  {
    Render_4(id0,id1);
  }

  private native void BackfaceRender_5(vtkActor id0,vtkRenderer id1);
  public void BackfaceRender(vtkActor id0,vtkRenderer id1)
  {
    BackfaceRender_5(id0,id1);
  }

  private native void PostRender_6(vtkActor id0,vtkRenderer id1);
  public void PostRender(vtkActor id0,vtkRenderer id1)
  {
    PostRender_6(id0,id1);
  }

  private native void ReleaseGraphicsResources_7(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_7(id0);
  }

  public vtkOpenGLProperty() { super(); }

  public vtkOpenGLProperty(long id) { super(id); }
  public native long   VTKInit();

}
