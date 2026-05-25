// java wrapper for vtkInteractorStyleSwitch object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorStyleSwitch extends vtkInteractorStyleSwitchBase
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

  private native void SetInteractor_4(vtkRenderWindowInteractor id0);
  public void SetInteractor(vtkRenderWindowInteractor id0)
  {
    SetInteractor_4(id0);
  }

  private native void SetAutoAdjustCameraClippingRange_5(int id0);
  public void SetAutoAdjustCameraClippingRange(int id0)
  {
    SetAutoAdjustCameraClippingRange_5(id0);
  }

  private native long GetCurrentStyle_6();
  public vtkInteractorStyle GetCurrentStyle()
  {
    long temp = GetCurrentStyle_6();

    if (temp == 0) return null;
    return (vtkInteractorStyle)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCurrentStyleToJoystickActor_7();
  public void SetCurrentStyleToJoystickActor()
  {
    SetCurrentStyleToJoystickActor_7();
  }

  private native void SetCurrentStyleToJoystickCamera_8();
  public void SetCurrentStyleToJoystickCamera()
  {
    SetCurrentStyleToJoystickCamera_8();
  }

  private native void SetCurrentStyleToTrackballActor_9();
  public void SetCurrentStyleToTrackballActor()
  {
    SetCurrentStyleToTrackballActor_9();
  }

  private native void SetCurrentStyleToTrackballCamera_10();
  public void SetCurrentStyleToTrackballCamera()
  {
    SetCurrentStyleToTrackballCamera_10();
  }

  private native void SetCurrentStyleToMultiTouchCamera_11();
  public void SetCurrentStyleToMultiTouchCamera()
  {
    SetCurrentStyleToMultiTouchCamera_11();
  }

  private native void OnChar_12();
  public void OnChar()
  {
    OnChar_12();
  }

  private native void SetDefaultRenderer_13(vtkRenderer id0);
  public void SetDefaultRenderer(vtkRenderer id0)
  {
    SetDefaultRenderer_13(id0);
  }

  private native void SetCurrentRenderer_14(vtkRenderer id0);
  public void SetCurrentRenderer(vtkRenderer id0)
  {
    SetCurrentRenderer_14(id0);
  }

  public vtkInteractorStyleSwitch() { super(); }

  public vtkInteractorStyleSwitch(long id) { super(id); }
  public native long   VTKInit();

}
