// java wrapper for vtkOpenGLImageMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLImageMapper extends vtkImageMapper
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

  private native void RenderOverlay_4(vtkViewport id0,vtkActor2D id1);
  public void RenderOverlay(vtkViewport id0,vtkActor2D id1)
  {
    RenderOverlay_4(id0,id1);
  }

  private native void RenderData_5(vtkViewport id0,vtkImageData id1,vtkActor2D id2);
  public void RenderData(vtkViewport id0,vtkImageData id1,vtkActor2D id2)
  {
    RenderData_5(id0,id1,id2);
  }

  private native void ReleaseGraphicsResources_6(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_6(id0);
  }

  public vtkOpenGLImageMapper() { super(); }

  public vtkOpenGLImageMapper(long id) { super(id); }
  public native long   VTKInit();

}
