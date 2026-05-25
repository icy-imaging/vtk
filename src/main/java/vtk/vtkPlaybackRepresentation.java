// java wrapper for vtkPlaybackRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlaybackRepresentation extends vtkBorderRepresentation
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

  private native long GetProperty_4();
  public vtkProperty2D GetProperty()
  {
    long temp = GetProperty_4();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Play_5();
  public void Play()
  {
    Play_5();
  }

  private native void Stop_6();
  public void Stop()
  {
    Stop_6();
  }

  private native void ForwardOneFrame_7();
  public void ForwardOneFrame()
  {
    ForwardOneFrame_7();
  }

  private native void BackwardOneFrame_8();
  public void BackwardOneFrame()
  {
    BackwardOneFrame_8();
  }

  private native void JumpToBeginning_9();
  public void JumpToBeginning()
  {
    JumpToBeginning_9();
  }

  private native void JumpToEnd_10();
  public void JumpToEnd()
  {
    JumpToEnd_10();
  }

  private native void BuildRepresentation_11();
  public void BuildRepresentation()
  {
    BuildRepresentation_11();
  }

  private native void GetSize_12(double id0[]);
  public void GetSize(double id0[])
  {
    GetSize_12(id0);
  }

  private native void GetActors2D_13(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_13(id0);
  }

  private native void ReleaseGraphicsResources_14(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_14(id0);
  }

  private native int RenderOverlay_15(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_15(id0);
  }

  private native int RenderOpaqueGeometry_16(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_16(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_17(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_17(id0);
  }

  private native int HasTranslucentPolygonalGeometry_18();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_18();
  }

  public vtkPlaybackRepresentation() { super(); }

  public vtkPlaybackRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
