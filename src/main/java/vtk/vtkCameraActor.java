// java wrapper for vtkCameraActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCameraActor extends vtkProp3D
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

  private native void SetWidthByHeightRatio_6(double id0);
  public void SetWidthByHeightRatio(double id0)
  {
    SetWidthByHeightRatio_6(id0);
  }

  private native double GetWidthByHeightRatio_7();
  public double GetWidthByHeightRatio()
  {
    return GetWidthByHeightRatio_7();
  }

  private native int RenderOpaqueGeometry_8(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_8(id0);
  }

  private native int HasTranslucentPolygonalGeometry_9();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_9();
  }

  private native void ReleaseGraphicsResources_10(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_10(id0);
  }

  private native long GetMTime_11();
  public long GetMTime()
  {
    return GetMTime_11();
  }

  private native long GetProperty_12();
  public vtkProperty GetProperty()
  {
    long temp = GetProperty_12();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetProperty_13(vtkProperty id0);
  public void SetProperty(vtkProperty id0)
  {
    SetProperty_13(id0);
  }

  public vtkCameraActor() { super(); }

  public vtkCameraActor(long id) { super(id); }
  public native long   VTKInit();

}
