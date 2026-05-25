// java wrapper for vtkStripper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStripper extends vtkPolyDataAlgorithm
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

  private native void SetMaximumLength_4(int id0);
  public void SetMaximumLength(int id0)
  {
    SetMaximumLength_4(id0);
  }

  private native int GetMaximumLengthMinValue_5();
  public int GetMaximumLengthMinValue()
  {
    return GetMaximumLengthMinValue_5();
  }

  private native int GetMaximumLengthMaxValue_6();
  public int GetMaximumLengthMaxValue()
  {
    return GetMaximumLengthMaxValue_6();
  }

  private native int GetMaximumLength_7();
  public int GetMaximumLength()
  {
    return GetMaximumLength_7();
  }

  private native void PassCellDataAsFieldDataOn_8();
  public void PassCellDataAsFieldDataOn()
  {
    PassCellDataAsFieldDataOn_8();
  }

  private native void PassCellDataAsFieldDataOff_9();
  public void PassCellDataAsFieldDataOff()
  {
    PassCellDataAsFieldDataOff_9();
  }

  private native void SetPassCellDataAsFieldData_10(int id0);
  public void SetPassCellDataAsFieldData(int id0)
  {
    SetPassCellDataAsFieldData_10(id0);
  }

  private native int GetPassCellDataAsFieldData_11();
  public int GetPassCellDataAsFieldData()
  {
    return GetPassCellDataAsFieldData_11();
  }

  private native void SetPassThroughCellIds_12(int id0);
  public void SetPassThroughCellIds(int id0)
  {
    SetPassThroughCellIds_12(id0);
  }

  private native int GetPassThroughCellIds_13();
  public int GetPassThroughCellIds()
  {
    return GetPassThroughCellIds_13();
  }

  private native void PassThroughCellIdsOn_14();
  public void PassThroughCellIdsOn()
  {
    PassThroughCellIdsOn_14();
  }

  private native void PassThroughCellIdsOff_15();
  public void PassThroughCellIdsOff()
  {
    PassThroughCellIdsOff_15();
  }

  private native void SetPassThroughPointIds_16(int id0);
  public void SetPassThroughPointIds(int id0)
  {
    SetPassThroughPointIds_16(id0);
  }

  private native int GetPassThroughPointIds_17();
  public int GetPassThroughPointIds()
  {
    return GetPassThroughPointIds_17();
  }

  private native void PassThroughPointIdsOn_18();
  public void PassThroughPointIdsOn()
  {
    PassThroughPointIdsOn_18();
  }

  private native void PassThroughPointIdsOff_19();
  public void PassThroughPointIdsOff()
  {
    PassThroughPointIdsOff_19();
  }

  private native void SetJoinContiguousSegments_20(int id0);
  public void SetJoinContiguousSegments(int id0)
  {
    SetJoinContiguousSegments_20(id0);
  }

  private native int GetJoinContiguousSegments_21();
  public int GetJoinContiguousSegments()
  {
    return GetJoinContiguousSegments_21();
  }

  private native void JoinContiguousSegmentsOn_22();
  public void JoinContiguousSegmentsOn()
  {
    JoinContiguousSegmentsOn_22();
  }

  private native void JoinContiguousSegmentsOff_23();
  public void JoinContiguousSegmentsOff()
  {
    JoinContiguousSegmentsOff_23();
  }

  public vtkStripper() { super(); }

  public vtkStripper(long id) { super(id); }
  public native long   VTKInit();

}
