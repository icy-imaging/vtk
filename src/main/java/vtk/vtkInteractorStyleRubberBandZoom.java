// java wrapper for vtkInteractorStyleRubberBandZoom object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorStyleRubberBandZoom extends vtkInteractorStyle
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

  private native void SetLockAspectToViewport_4(boolean id0);
  public void SetLockAspectToViewport(boolean id0)
  {
    SetLockAspectToViewport_4(id0);
  }

  private native boolean GetLockAspectToViewport_5();
  public boolean GetLockAspectToViewport()
  {
    return GetLockAspectToViewport_5();
  }

  private native void LockAspectToViewportOn_6();
  public void LockAspectToViewportOn()
  {
    LockAspectToViewportOn_6();
  }

  private native void LockAspectToViewportOff_7();
  public void LockAspectToViewportOff()
  {
    LockAspectToViewportOff_7();
  }

  private native void SetCenterAtStartPosition_8(boolean id0);
  public void SetCenterAtStartPosition(boolean id0)
  {
    SetCenterAtStartPosition_8(id0);
  }

  private native boolean GetCenterAtStartPosition_9();
  public boolean GetCenterAtStartPosition()
  {
    return GetCenterAtStartPosition_9();
  }

  private native void CenterAtStartPositionOn_10();
  public void CenterAtStartPositionOn()
  {
    CenterAtStartPositionOn_10();
  }

  private native void CenterAtStartPositionOff_11();
  public void CenterAtStartPositionOff()
  {
    CenterAtStartPositionOff_11();
  }

  private native void SetUseDollyForPerspectiveProjection_12(boolean id0);
  public void SetUseDollyForPerspectiveProjection(boolean id0)
  {
    SetUseDollyForPerspectiveProjection_12(id0);
  }

  private native boolean GetUseDollyForPerspectiveProjection_13();
  public boolean GetUseDollyForPerspectiveProjection()
  {
    return GetUseDollyForPerspectiveProjection_13();
  }

  private native void UseDollyForPerspectiveProjectionOn_14();
  public void UseDollyForPerspectiveProjectionOn()
  {
    UseDollyForPerspectiveProjectionOn_14();
  }

  private native void UseDollyForPerspectiveProjectionOff_15();
  public void UseDollyForPerspectiveProjectionOff()
  {
    UseDollyForPerspectiveProjectionOff_15();
  }

  private native void OnMouseMove_16();
  public void OnMouseMove()
  {
    OnMouseMove_16();
  }

  private native void OnLeftButtonDown_17();
  public void OnLeftButtonDown()
  {
    OnLeftButtonDown_17();
  }

  private native void OnLeftButtonUp_18();
  public void OnLeftButtonUp()
  {
    OnLeftButtonUp_18();
  }

  public vtkInteractorStyleRubberBandZoom() { super(); }

  public vtkInteractorStyleRubberBandZoom(long id) { super(id); }
  public native long   VTKInit();

}
