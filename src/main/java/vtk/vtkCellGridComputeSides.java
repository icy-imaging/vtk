// java wrapper for vtkCellGridComputeSides object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellGridComputeSides extends vtkCellGridAlgorithm
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

  private native void SetPreserveRenderableInputs_4(boolean id0);
  public void SetPreserveRenderableInputs(boolean id0)
  {
    SetPreserveRenderableInputs_4(id0);
  }

  private native boolean GetPreserveRenderableInputs_5();
  public boolean GetPreserveRenderableInputs()
  {
    return GetPreserveRenderableInputs_5();
  }

  private native void PreserveRenderableInputsOn_6();
  public void PreserveRenderableInputsOn()
  {
    PreserveRenderableInputsOn_6();
  }

  private native void PreserveRenderableInputsOff_7();
  public void PreserveRenderableInputsOff()
  {
    PreserveRenderableInputsOff_7();
  }

  private native void SetOmitSidesForRenderableInputs_8(boolean id0);
  public void SetOmitSidesForRenderableInputs(boolean id0)
  {
    SetOmitSidesForRenderableInputs_8(id0);
  }

  private native boolean GetOmitSidesForRenderableInputs_9();
  public boolean GetOmitSidesForRenderableInputs()
  {
    return GetOmitSidesForRenderableInputs_9();
  }

  private native void OmitSidesForRenderableInputsOn_10();
  public void OmitSidesForRenderableInputsOn()
  {
    OmitSidesForRenderableInputsOn_10();
  }

  private native void OmitSidesForRenderableInputsOff_11();
  public void OmitSidesForRenderableInputsOff()
  {
    OmitSidesForRenderableInputsOff_11();
  }

  private native void SetOutputDimensionControl_12(int id0);
  public void SetOutputDimensionControl(int id0)
  {
    SetOutputDimensionControl_12(id0);
  }

  private native int GetOutputDimensionControl_13();
  public int GetOutputDimensionControl()
  {
    return GetOutputDimensionControl_13();
  }

  private native void SetStrategy_14(int id0);
  public void SetStrategy(int id0)
  {
    SetStrategy_14(id0);
  }

  private native int GetStrategy_15();
  public int GetStrategy()
  {
    return GetStrategy_15();
  }

  private native void SetSelectionType_16(int id0);
  public void SetSelectionType(int id0)
  {
    SetSelectionType_16(id0);
  }

  private native int GetSelectionType_17();
  public int GetSelectionType()
  {
    return GetSelectionType_17();
  }

  public vtkCellGridComputeSides() { super(); }

  public vtkCellGridComputeSides(long id) { super(id); }
  public native long   VTKInit();

}
