// java wrapper for vtkCellGridSidesQuery object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellGridSidesQuery extends vtkCellGridQuery
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

  private native void SetPreserveRenderableInputs_4(int id0);
  public void SetPreserveRenderableInputs(int id0)
  {
    SetPreserveRenderableInputs_4(id0);
  }

  private native int GetPreserveRenderableInputs_5();
  public int GetPreserveRenderableInputs()
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

  private native void SetOmitSidesForRenderableInputs_8(int id0);
  public void SetOmitSidesForRenderableInputs(int id0)
  {
    SetOmitSidesForRenderableInputs_8(id0);
  }

  private native int GetOmitSidesForRenderableInputs_9();
  public int GetOmitSidesForRenderableInputs()
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

  private native void OutputDimensionControlOn_14();
  public void OutputDimensionControlOn()
  {
    OutputDimensionControlOn_14();
  }

  private native void OutputDimensionControlOff_15();
  public void OutputDimensionControlOff()
  {
    OutputDimensionControlOff_15();
  }

  private native void SetStrategy_16(int id0);
  public void SetStrategy(int id0)
  {
    SetStrategy_16(id0);
  }

  private native int GetStrategy_17();
  public int GetStrategy()
  {
    return GetStrategy_17();
  }

  private native void SetStrategyToWinding_18();
  public void SetStrategyToWinding()
  {
    SetStrategyToWinding_18();
  }

  private native void SetStrategyToAnyOccurrence_19();
  public void SetStrategyToAnyOccurrence()
  {
    SetStrategyToAnyOccurrence_19();
  }

  private native void SetStrategyToBoundary_20();
  public void SetStrategyToBoundary()
  {
    SetStrategyToBoundary_20();
  }

  private native void SetSelectionType_21(int id0);
  public void SetSelectionType(int id0)
  {
    SetSelectionType_21(id0);
  }

  private native int GetSelectionType_22();
  public int GetSelectionType()
  {
    return GetSelectionType_22();
  }

  private native boolean Initialize_23();
  public boolean Initialize()
  {
    return Initialize_23();
  }

  private native void StartPass_24();
  public void StartPass()
  {
    StartPass_24();
  }

  private native boolean IsAnotherPassRequired_25();
  public boolean IsAnotherPassRequired()
  {
    return IsAnotherPassRequired_25();
  }

  private native boolean Finalize_26();
  public boolean Finalize()
  {
    return Finalize_26();
  }

  private native long GetSideCache_27();
  public vtkCellGridSidesCache GetSideCache()
  {
    long temp = GetSideCache_27();

    if (temp == 0) return null;
    return (vtkCellGridSidesCache)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSideCache_28(vtkCellGridSidesCache id0);
  public void SetSideCache(vtkCellGridSidesCache id0)
  {
    SetSideCache_28(id0);
  }

  public vtkCellGridSidesQuery() { super(); }

  public vtkCellGridSidesQuery(long id) { super(id); }
  public native long   VTKInit();

}
