// java wrapper for vtkInteractorStyleMultiTouchCamera object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorStyleMultiTouchCamera extends vtkInteractorStyleTrackballCamera
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

  private native void OnStartRotate_4();
  public void OnStartRotate()
  {
    OnStartRotate_4();
  }

  private native void OnRotate_5();
  public void OnRotate()
  {
    OnRotate_5();
  }

  private native void OnEndRotate_6();
  public void OnEndRotate()
  {
    OnEndRotate_6();
  }

  private native void OnStartPinch_7();
  public void OnStartPinch()
  {
    OnStartPinch_7();
  }

  private native void OnPinch_8();
  public void OnPinch()
  {
    OnPinch_8();
  }

  private native void OnEndPinch_9();
  public void OnEndPinch()
  {
    OnEndPinch_9();
  }

  private native void OnStartPan_10();
  public void OnStartPan()
  {
    OnStartPan_10();
  }

  private native void OnPan_11();
  public void OnPan()
  {
    OnPan_11();
  }

  private native void OnEndPan_12();
  public void OnEndPan()
  {
    OnEndPan_12();
  }

  public vtkInteractorStyleMultiTouchCamera() { super(); }

  public vtkInteractorStyleMultiTouchCamera(long id) { super(id); }
  public native long   VTKInit();

}
