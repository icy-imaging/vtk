// java wrapper for vtkCameraRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCameraRepresentation extends vtkBorderRepresentation
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

  private native void SetInterpolator_6(vtkCameraInterpolator id0);
  public void SetInterpolator(vtkCameraInterpolator id0)
  {
    SetInterpolator_6(id0);
  }

  private native long GetInterpolator_7();
  public vtkCameraInterpolator GetInterpolator()
  {
    long temp = GetInterpolator_7();

    if (temp == 0) return null;
    return (vtkCameraInterpolator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNumberOfFrames_8(int id0);
  public void SetNumberOfFrames(int id0)
  {
    SetNumberOfFrames_8(id0);
  }

  private native int GetNumberOfFramesMinValue_9();
  public int GetNumberOfFramesMinValue()
  {
    return GetNumberOfFramesMinValue_9();
  }

  private native int GetNumberOfFramesMaxValue_10();
  public int GetNumberOfFramesMaxValue()
  {
    return GetNumberOfFramesMaxValue_10();
  }

  private native int GetNumberOfFrames_11();
  public int GetNumberOfFrames()
  {
    return GetNumberOfFrames_11();
  }

  private native long GetProperty_12();
  public vtkProperty2D GetProperty()
  {
    long temp = GetProperty_12();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AddCameraToPath_13();
  public void AddCameraToPath()
  {
    AddCameraToPath_13();
  }

  private native void AnimatePath_14(vtkRenderWindowInteractor id0);
  public void AnimatePath(vtkRenderWindowInteractor id0)
  {
    AnimatePath_14(id0);
  }

  private native void InitializePath_15();
  public void InitializePath()
  {
    InitializePath_15();
  }

  private native void BuildRepresentation_16();
  public void BuildRepresentation()
  {
    BuildRepresentation_16();
  }

  private native void GetSize_17(double id0[]);
  public void GetSize(double id0[])
  {
    GetSize_17(id0);
  }

  private native void GetActors2D_18(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_18(id0);
  }

  private native void ReleaseGraphicsResources_19(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_19(id0);
  }

  private native int RenderOverlay_20(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_20(id0);
  }

  private native int RenderOpaqueGeometry_21(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_21(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_22(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_22(id0);
  }

  private native int HasTranslucentPolygonalGeometry_23();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_23();
  }

  public vtkCameraRepresentation() { super(); }

  public vtkCameraRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
