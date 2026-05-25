// java wrapper for vtkInteractorStyleRubberBandPick object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorStyleRubberBandPick extends vtkInteractorStyleTrackballCamera
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

  private native void StartSelect_4();
  public void StartSelect()
  {
    StartSelect_4();
  }

  private native void OnMouseMove_5();
  public void OnMouseMove()
  {
    OnMouseMove_5();
  }

  private native void OnLeftButtonDown_6();
  public void OnLeftButtonDown()
  {
    OnLeftButtonDown_6();
  }

  private native void OnLeftButtonUp_7();
  public void OnLeftButtonUp()
  {
    OnLeftButtonUp_7();
  }

  private native void OnChar_8();
  public void OnChar()
  {
    OnChar_8();
  }

  public vtkInteractorStyleRubberBandPick() { super(); }

  public vtkInteractorStyleRubberBandPick(long id) { super(id); }
  public native long   VTKInit();

}
