// java wrapper for vtkFollower object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFollower extends vtkActor
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

  private native void SetCamera_4(vtkCamera id0);
  public void SetCamera(vtkCamera id0)
  {
    SetCamera_4(id0);
  }

  private native long GetCamera_5();
  public vtkCamera GetCamera()
  {
    long temp = GetCamera_5();

    if (temp == 0) return null;
    return (vtkCamera)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int RenderOpaqueGeometry_6(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_6(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_7(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_7(id0);
  }

  private native void Render_8(vtkRenderer id0);
  public void Render(vtkRenderer id0)
  {
    Render_8(id0);
  }

  private native void ReleaseGraphicsResources_9(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_9(id0);
  }

  private native void ComputeMatrix_10();
  public void ComputeMatrix()
  {
    ComputeMatrix_10();
  }

  private native void ShallowCopy_11(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_11(id0);
  }

  public vtkFollower() { super(); }

  public vtkFollower(long id) { super(id); }
  public native long   VTKInit();

}
