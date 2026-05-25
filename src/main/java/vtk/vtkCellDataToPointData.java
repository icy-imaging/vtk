// java wrapper for vtkCellDataToPointData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellDataToPointData extends vtkDataSetAlgorithm
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

  private native void SetPassCellData_4(boolean id0);
  public void SetPassCellData(boolean id0)
  {
    SetPassCellData_4(id0);
  }

  private native boolean GetPassCellData_5();
  public boolean GetPassCellData()
  {
    return GetPassCellData_5();
  }

  private native void PassCellDataOn_6();
  public void PassCellDataOn()
  {
    PassCellDataOn_6();
  }

  private native void PassCellDataOff_7();
  public void PassCellDataOff()
  {
    PassCellDataOff_7();
  }

  private native void SetContributingCellOption_8(int id0);
  public void SetContributingCellOption(int id0)
  {
    SetContributingCellOption_8(id0);
  }

  private native int GetContributingCellOptionMinValue_9();
  public int GetContributingCellOptionMinValue()
  {
    return GetContributingCellOptionMinValue_9();
  }

  private native int GetContributingCellOptionMaxValue_10();
  public int GetContributingCellOptionMaxValue()
  {
    return GetContributingCellOptionMaxValue_10();
  }

  private native int GetContributingCellOption_11();
  public int GetContributingCellOption()
  {
    return GetContributingCellOption_11();
  }

  private native void SetProcessAllArrays_12(boolean id0);
  public void SetProcessAllArrays(boolean id0)
  {
    SetProcessAllArrays_12(id0);
  }

  private native boolean GetProcessAllArrays_13();
  public boolean GetProcessAllArrays()
  {
    return GetProcessAllArrays_13();
  }

  private native void ProcessAllArraysOn_14();
  public void ProcessAllArraysOn()
  {
    ProcessAllArraysOn_14();
  }

  private native void ProcessAllArraysOff_15();
  public void ProcessAllArraysOff()
  {
    ProcessAllArraysOff_15();
  }

  private native void SetPieceInvariant_16(boolean id0);
  public void SetPieceInvariant(boolean id0)
  {
    SetPieceInvariant_16(id0);
  }

  private native boolean GetPieceInvariant_17();
  public boolean GetPieceInvariant()
  {
    return GetPieceInvariant_17();
  }

  private native void PieceInvariantOn_18();
  public void PieceInvariantOn()
  {
    PieceInvariantOn_18();
  }

  private native void PieceInvariantOff_19();
  public void PieceInvariantOff()
  {
    PieceInvariantOff_19();
  }

  private native void AddCellDataArray_20(byte[] id0, int len0);
  public void AddCellDataArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddCellDataArray_20(bytes0, bytes0.length);
  }

  private native void RemoveCellDataArray_21(byte[] id0, int len0);
  public void RemoveCellDataArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveCellDataArray_21(bytes0, bytes0.length);
  }

  private native void ClearCellDataArrays_22();
  public void ClearCellDataArrays()
  {
    ClearCellDataArrays_22();
  }

  public vtkCellDataToPointData() { super(); }

  public vtkCellDataToPointData(long id) { super(id); }
  public native long   VTKInit();

}
