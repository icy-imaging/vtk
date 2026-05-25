// java wrapper for vtkInteractorStyleRubberBand3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorStyleRubberBand3D extends vtkInteractorStyleTrackballCamera
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

  private native void OnLeftButtonDown_4();
  public void OnLeftButtonDown()
  {
    OnLeftButtonDown_4();
  }

  private native void OnLeftButtonUp_5();
  public void OnLeftButtonUp()
  {
    OnLeftButtonUp_5();
  }

  private native void OnMiddleButtonDown_6();
  public void OnMiddleButtonDown()
  {
    OnMiddleButtonDown_6();
  }

  private native void OnMiddleButtonUp_7();
  public void OnMiddleButtonUp()
  {
    OnMiddleButtonUp_7();
  }

  private native void OnRightButtonDown_8();
  public void OnRightButtonDown()
  {
    OnRightButtonDown_8();
  }

  private native void OnRightButtonUp_9();
  public void OnRightButtonUp()
  {
    OnRightButtonUp_9();
  }

  private native void OnMouseMove_10();
  public void OnMouseMove()
  {
    OnMouseMove_10();
  }

  private native void OnMouseWheelForward_11();
  public void OnMouseWheelForward()
  {
    OnMouseWheelForward_11();
  }

  private native void OnMouseWheelBackward_12();
  public void OnMouseWheelBackward()
  {
    OnMouseWheelBackward_12();
  }

  private native void SetRenderOnMouseMove_13(boolean id0);
  public void SetRenderOnMouseMove(boolean id0)
  {
    SetRenderOnMouseMove_13(id0);
  }

  private native boolean GetRenderOnMouseMove_14();
  public boolean GetRenderOnMouseMove()
  {
    return GetRenderOnMouseMove_14();
  }

  private native void RenderOnMouseMoveOn_15();
  public void RenderOnMouseMoveOn()
  {
    RenderOnMouseMoveOn_15();
  }

  private native void RenderOnMouseMoveOff_16();
  public void RenderOnMouseMoveOff()
  {
    RenderOnMouseMoveOff_16();
  }

  private native int GetInteraction_17();
  public int GetInteraction()
  {
    return GetInteraction_17();
  }

  private native int[] GetStartPosition_18();
  public int[] GetStartPosition()
  {
    return GetStartPosition_18();
  }

  private native int[] GetEndPosition_19();
  public int[] GetEndPosition()
  {
    return GetEndPosition_19();
  }

  public vtkInteractorStyleRubberBand3D() { super(); }

  public vtkInteractorStyleRubberBand3D(long id) { super(id); }
  public native long   VTKInit();

}
