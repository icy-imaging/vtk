// java wrapper for vtkContextInteractorStyle object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContextInteractorStyle extends vtkInteractorStyle
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

  private native void SetScene_4(vtkContextScene id0);
  public void SetScene(vtkContextScene id0)
  {
    SetScene_4(id0);
  }

  private native long GetScene_5();
  public vtkContextScene GetScene()
  {
    long temp = GetScene_5();

    if (temp == 0) return null;
    return (vtkContextScene)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void OnSceneModified_6();
  public void OnSceneModified()
  {
    OnSceneModified_6();
  }

  private native void OnMouseMove_7();
  public void OnMouseMove()
  {
    OnMouseMove_7();
  }

  private native void OnLeftButtonDown_8();
  public void OnLeftButtonDown()
  {
    OnLeftButtonDown_8();
  }

  private native void OnLeftButtonUp_9();
  public void OnLeftButtonUp()
  {
    OnLeftButtonUp_9();
  }

  private native void OnLeftButtonDoubleClick_10();
  public void OnLeftButtonDoubleClick()
  {
    OnLeftButtonDoubleClick_10();
  }

  private native void OnMiddleButtonDown_11();
  public void OnMiddleButtonDown()
  {
    OnMiddleButtonDown_11();
  }

  private native void OnMiddleButtonUp_12();
  public void OnMiddleButtonUp()
  {
    OnMiddleButtonUp_12();
  }

  private native void OnMiddleButtonDoubleClick_13();
  public void OnMiddleButtonDoubleClick()
  {
    OnMiddleButtonDoubleClick_13();
  }

  private native void OnRightButtonDown_14();
  public void OnRightButtonDown()
  {
    OnRightButtonDown_14();
  }

  private native void OnRightButtonUp_15();
  public void OnRightButtonUp()
  {
    OnRightButtonUp_15();
  }

  private native void OnRightButtonDoubleClick_16();
  public void OnRightButtonDoubleClick()
  {
    OnRightButtonDoubleClick_16();
  }

  private native void OnMouseWheelForward_17();
  public void OnMouseWheelForward()
  {
    OnMouseWheelForward_17();
  }

  private native void OnMouseWheelBackward_18();
  public void OnMouseWheelBackward()
  {
    OnMouseWheelBackward_18();
  }

  private native void OnChar_19();
  public void OnChar()
  {
    OnChar_19();
  }

  private native void OnKeyPress_20();
  public void OnKeyPress()
  {
    OnKeyPress_20();
  }

  private native void OnKeyRelease_21();
  public void OnKeyRelease()
  {
    OnKeyRelease_21();
  }

  public vtkContextInteractorStyle() { super(); }

  public vtkContextInteractorStyle(long id) { super(id); }
  public native long   VTKInit();

}
