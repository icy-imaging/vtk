// java wrapper for vtkInteractorStyleUser object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorStyleUser extends vtkInteractorStyle
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

  private native int[] GetLastPos_4();
  public int[] GetLastPos()
  {
    return GetLastPos_4();
  }

  private native int[] GetOldPos_5();
  public int[] GetOldPos()
  {
    return GetOldPos_5();
  }

  private native int GetShiftKey_6();
  public int GetShiftKey()
  {
    return GetShiftKey_6();
  }

  private native int GetCtrlKey_7();
  public int GetCtrlKey()
  {
    return GetCtrlKey_7();
  }

  private native int GetChar_8();
  public int GetChar()
  {
    return GetChar_8();
  }

  private native byte[] GetKeySym_9();
  public String GetKeySym()
  {
    return new String(GetKeySym_9(), StandardCharsets.UTF_8);
  }

  private native int GetButton_10();
  public int GetButton()
  {
    return GetButton_10();
  }

  private native void OnMouseMove_11();
  public void OnMouseMove()
  {
    OnMouseMove_11();
  }

  private native void OnLeftButtonDown_12();
  public void OnLeftButtonDown()
  {
    OnLeftButtonDown_12();
  }

  private native void OnLeftButtonUp_13();
  public void OnLeftButtonUp()
  {
    OnLeftButtonUp_13();
  }

  private native void OnMiddleButtonDown_14();
  public void OnMiddleButtonDown()
  {
    OnMiddleButtonDown_14();
  }

  private native void OnMiddleButtonUp_15();
  public void OnMiddleButtonUp()
  {
    OnMiddleButtonUp_15();
  }

  private native void OnRightButtonDown_16();
  public void OnRightButtonDown()
  {
    OnRightButtonDown_16();
  }

  private native void OnRightButtonUp_17();
  public void OnRightButtonUp()
  {
    OnRightButtonUp_17();
  }

  private native void OnMouseWheelForward_18();
  public void OnMouseWheelForward()
  {
    OnMouseWheelForward_18();
  }

  private native void OnMouseWheelBackward_19();
  public void OnMouseWheelBackward()
  {
    OnMouseWheelBackward_19();
  }

  private native void OnChar_20();
  public void OnChar()
  {
    OnChar_20();
  }

  private native void OnKeyPress_21();
  public void OnKeyPress()
  {
    OnKeyPress_21();
  }

  private native void OnKeyRelease_22();
  public void OnKeyRelease()
  {
    OnKeyRelease_22();
  }

  private native void OnExpose_23();
  public void OnExpose()
  {
    OnExpose_23();
  }

  private native void OnConfigure_24();
  public void OnConfigure()
  {
    OnConfigure_24();
  }

  private native void OnEnter_25();
  public void OnEnter()
  {
    OnEnter_25();
  }

  private native void OnLeave_26();
  public void OnLeave()
  {
    OnLeave_26();
  }

  private native void OnTimer_27();
  public void OnTimer()
  {
    OnTimer_27();
  }

  public vtkInteractorStyleUser() { super(); }

  public vtkInteractorStyleUser(long id) { super(id); }
  public native long   VTKInit();

}
