// java wrapper for vtkParallelCoordinatesInteractorStyle object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParallelCoordinatesInteractorStyle extends vtkInteractorStyleTrackballCamera
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

  private native int[] GetCursorStartPosition_4();
  public int[] GetCursorStartPosition()
  {
    return GetCursorStartPosition_4();
  }

  private native int[] GetCursorCurrentPosition_5();
  public int[] GetCursorCurrentPosition()
  {
    return GetCursorCurrentPosition_5();
  }

  private native int[] GetCursorLastPosition_6();
  public int[] GetCursorLastPosition()
  {
    return GetCursorLastPosition_6();
  }

  private native void GetCursorStartPosition_7(vtkViewport id0,double id1[]);
  public void GetCursorStartPosition(vtkViewport id0,double id1[])
  {
    GetCursorStartPosition_7(id0,id1);
  }

  private native void GetCursorCurrentPosition_8(vtkViewport id0,double id1[]);
  public void GetCursorCurrentPosition(vtkViewport id0,double id1[])
  {
    GetCursorCurrentPosition_8(id0,id1);
  }

  private native void GetCursorLastPosition_9(vtkViewport id0,double id1[]);
  public void GetCursorLastPosition(vtkViewport id0,double id1[])
  {
    GetCursorLastPosition_9(id0,id1);
  }

  private native void OnMouseMove_10();
  public void OnMouseMove()
  {
    OnMouseMove_10();
  }

  private native void OnLeftButtonDown_11();
  public void OnLeftButtonDown()
  {
    OnLeftButtonDown_11();
  }

  private native void OnLeftButtonUp_12();
  public void OnLeftButtonUp()
  {
    OnLeftButtonUp_12();
  }

  private native void OnMiddleButtonDown_13();
  public void OnMiddleButtonDown()
  {
    OnMiddleButtonDown_13();
  }

  private native void OnMiddleButtonUp_14();
  public void OnMiddleButtonUp()
  {
    OnMiddleButtonUp_14();
  }

  private native void OnRightButtonDown_15();
  public void OnRightButtonDown()
  {
    OnRightButtonDown_15();
  }

  private native void OnRightButtonUp_16();
  public void OnRightButtonUp()
  {
    OnRightButtonUp_16();
  }

  private native void OnLeave_17();
  public void OnLeave()
  {
    OnLeave_17();
  }

  private native void StartInspect_18(int id0,int id1);
  public void StartInspect(int id0,int id1)
  {
    StartInspect_18(id0,id1);
  }

  private native void Inspect_19(int id0,int id1);
  public void Inspect(int id0,int id1)
  {
    Inspect_19(id0,id1);
  }

  private native void EndInspect_20();
  public void EndInspect()
  {
    EndInspect_20();
  }

  private native void StartZoom_21();
  public void StartZoom()
  {
    StartZoom_21();
  }

  private native void Zoom_22();
  public void Zoom()
  {
    Zoom_22();
  }

  private native void EndZoom_23();
  public void EndZoom()
  {
    EndZoom_23();
  }

  private native void StartPan_24();
  public void StartPan()
  {
    StartPan_24();
  }

  private native void Pan_25();
  public void Pan()
  {
    Pan_25();
  }

  private native void EndPan_26();
  public void EndPan()
  {
    EndPan_26();
  }

  private native void OnChar_27();
  public void OnChar()
  {
    OnChar_27();
  }

  public vtkParallelCoordinatesInteractorStyle() { super(); }

  public vtkParallelCoordinatesInteractorStyle(long id) { super(id); }
  public native long   VTKInit();

}
