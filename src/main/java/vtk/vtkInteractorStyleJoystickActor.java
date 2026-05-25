// java wrapper for vtkInteractorStyleJoystickActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorStyleJoystickActor extends vtkInteractorStyle
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

  private native void OnMouseMove_4();
  public void OnMouseMove()
  {
    OnMouseMove_4();
  }

  private native void OnLeftButtonDown_5();
  public void OnLeftButtonDown()
  {
    OnLeftButtonDown_5();
  }

  private native void OnLeftButtonUp_6();
  public void OnLeftButtonUp()
  {
    OnLeftButtonUp_6();
  }

  private native void OnMiddleButtonDown_7();
  public void OnMiddleButtonDown()
  {
    OnMiddleButtonDown_7();
  }

  private native void OnMiddleButtonUp_8();
  public void OnMiddleButtonUp()
  {
    OnMiddleButtonUp_8();
  }

  private native void OnRightButtonDown_9();
  public void OnRightButtonDown()
  {
    OnRightButtonDown_9();
  }

  private native void OnRightButtonUp_10();
  public void OnRightButtonUp()
  {
    OnRightButtonUp_10();
  }

  private native void Rotate_11();
  public void Rotate()
  {
    Rotate_11();
  }

  private native void Spin_12();
  public void Spin()
  {
    Spin_12();
  }

  private native void Pan_13();
  public void Pan()
  {
    Pan_13();
  }

  private native void Dolly_14();
  public void Dolly()
  {
    Dolly_14();
  }

  private native void UniformScale_15();
  public void UniformScale()
  {
    UniformScale_15();
  }

  public vtkInteractorStyleJoystickActor() { super(); }

  public vtkInteractorStyleJoystickActor(long id) { super(id); }
  public native long   VTKInit();

}
