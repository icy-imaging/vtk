// java wrapper for vtkInteractorStyleTrackballCamera object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorStyleTrackballCamera extends vtkInteractorStyle
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

  private native void Rotate_13();
  public void Rotate()
  {
    Rotate_13();
  }

  private native void Spin_14();
  public void Spin()
  {
    Spin_14();
  }

  private native void Pan_15();
  public void Pan()
  {
    Pan_15();
  }

  private native void Dolly_16();
  public void Dolly()
  {
    Dolly_16();
  }

  private native void EnvironmentRotate_17();
  public void EnvironmentRotate()
  {
    EnvironmentRotate_17();
  }

  private native void SetMotionFactor_18(double id0);
  public void SetMotionFactor(double id0)
  {
    SetMotionFactor_18(id0);
  }

  private native double GetMotionFactor_19();
  public double GetMotionFactor()
  {
    return GetMotionFactor_19();
  }

  public vtkInteractorStyleTrackballCamera() { super(); }

  public vtkInteractorStyleTrackballCamera(long id) { super(id); }
  public native long   VTKInit();

}
