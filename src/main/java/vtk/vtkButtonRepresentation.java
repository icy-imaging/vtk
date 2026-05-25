// java wrapper for vtkButtonRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkButtonRepresentation extends vtkWidgetRepresentation
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

  private native void SetNumberOfStates_4(int id0);
  public void SetNumberOfStates(int id0)
  {
    SetNumberOfStates_4(id0);
  }

  private native int GetNumberOfStatesMinValue_5();
  public int GetNumberOfStatesMinValue()
  {
    return GetNumberOfStatesMinValue_5();
  }

  private native int GetNumberOfStatesMaxValue_6();
  public int GetNumberOfStatesMaxValue()
  {
    return GetNumberOfStatesMaxValue_6();
  }

  private native int GetState_7();
  public int GetState()
  {
    return GetState_7();
  }

  private native void SetState_8(int id0);
  public void SetState(int id0)
  {
    SetState_8(id0);
  }

  private native void NextState_9();
  public void NextState()
  {
    NextState_9();
  }

  private native void PreviousState_10();
  public void PreviousState()
  {
    PreviousState_10();
  }

  private native void Highlight_11(int id0);
  public void Highlight(int id0)
  {
    Highlight_11(id0);
  }

  private native int GetHighlightState_12();
  public int GetHighlightState()
  {
    return GetHighlightState_12();
  }

  private native void ShallowCopy_13(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_13(id0);
  }

  public vtkButtonRepresentation() { super(); }

  public vtkButtonRepresentation(long id) { super(id); }

}
