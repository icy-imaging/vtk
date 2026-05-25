// java wrapper for vtkProp3DFollower object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProp3DFollower extends vtkProp3D
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

  private native void SetProp3D_4(vtkProp3D id0);
  public void SetProp3D(vtkProp3D id0)
  {
    SetProp3D_4(id0);
  }

  private native long GetProp3D_5();
  public vtkProp3D GetProp3D()
  {
    long temp = GetProp3D_5();

    if (temp == 0) return null;
    return (vtkProp3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCamera_6(vtkCamera id0);
  public void SetCamera(vtkCamera id0)
  {
    SetCamera_6(id0);
  }

  private native long GetCamera_7();
  public vtkCamera GetCamera()
  {
    long temp = GetCamera_7();

    if (temp == 0) return null;
    return (vtkCamera)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int RenderOpaqueGeometry_8(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_8(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_9(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_9(id0);
  }

  private native int RenderVolumetricGeometry_10(vtkViewport id0);
  public int RenderVolumetricGeometry(vtkViewport id0)
  {
    return RenderVolumetricGeometry_10(id0);
  }

  private native int HasTranslucentPolygonalGeometry_11();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_11();
  }

  private native void ReleaseGraphicsResources_12(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_12(id0);
  }

  private native void ComputeMatrix_13();
  public void ComputeMatrix()
  {
    ComputeMatrix_13();
  }

  private native void ShallowCopy_14(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_14(id0);
  }

  private native void InitPathTraversal_15();
  public void InitPathTraversal()
  {
    InitPathTraversal_15();
  }

  private native long GetNextPath_16();
  public vtkAssemblyPath GetNextPath()
  {
    long temp = GetNextPath_16();

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkProp3DFollower() { super(); }

  public vtkProp3DFollower(long id) { super(id); }
  public native long   VTKInit();

}
