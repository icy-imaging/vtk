// java wrapper for vtkMapper2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMapper2D extends vtkAbstractMapper
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

  private native void RenderOpaqueGeometry_5(vtkViewport id0,vtkActor2D id1);
  public void RenderOpaqueGeometry(vtkViewport id0,vtkActor2D id1)
  {
    RenderOpaqueGeometry_5(id0,id1);
  }

  private native void RenderTranslucentPolygonalGeometry_6(vtkViewport id0,vtkActor2D id1);
  public void RenderTranslucentPolygonalGeometry(vtkViewport id0,vtkActor2D id1)
  {
    RenderTranslucentPolygonalGeometry_6(id0,id1);
  }

  private native int HasTranslucentPolygonalGeometry_7();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_7();
  }

  public vtkMapper2D() { super(); }

  public vtkMapper2D(long id) { super(id); }

}
