// java wrapper for vtkExtractCells object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractCells extends vtkUnstructuredGridAlgorithm
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

  private native void SetCellList_4(vtkIdList id0);
  public void SetCellList(vtkIdList id0)
  {
    SetCellList_4(id0);
  }

  private native void AddCellList_5(vtkIdList id0);
  public void AddCellList(vtkIdList id0)
  {
    AddCellList_5(id0);
  }

  private native void AddCellRange_6(long id0,long id1);
  public void AddCellRange(long id0,long id1)
  {
    AddCellRange_6(id0,id1);
  }

  private native void SetExtractAllCells_7(boolean id0);
  public void SetExtractAllCells(boolean id0)
  {
    SetExtractAllCells_7(id0);
  }

  private native boolean GetExtractAllCells_8();
  public boolean GetExtractAllCells()
  {
    return GetExtractAllCells_8();
  }

  private native void ExtractAllCellsOn_9();
  public void ExtractAllCellsOn()
  {
    ExtractAllCellsOn_9();
  }

  private native void ExtractAllCellsOff_10();
  public void ExtractAllCellsOff()
  {
    ExtractAllCellsOff_10();
  }

  private native void SetAssumeSortedAndUniqueIds_11(boolean id0);
  public void SetAssumeSortedAndUniqueIds(boolean id0)
  {
    SetAssumeSortedAndUniqueIds_11(id0);
  }

  private native boolean GetAssumeSortedAndUniqueIds_12();
  public boolean GetAssumeSortedAndUniqueIds()
  {
    return GetAssumeSortedAndUniqueIds_12();
  }

  private native void AssumeSortedAndUniqueIdsOn_13();
  public void AssumeSortedAndUniqueIdsOn()
  {
    AssumeSortedAndUniqueIdsOn_13();
  }

  private native void AssumeSortedAndUniqueIdsOff_14();
  public void AssumeSortedAndUniqueIdsOff()
  {
    AssumeSortedAndUniqueIdsOff_14();
  }

  private native void SetPassThroughCellIds_15(boolean id0);
  public void SetPassThroughCellIds(boolean id0)
  {
    SetPassThroughCellIds_15(id0);
  }

  private native boolean GetPassThroughCellIds_16();
  public boolean GetPassThroughCellIds()
  {
    return GetPassThroughCellIds_16();
  }

  private native void PassThroughCellIdsOn_17();
  public void PassThroughCellIdsOn()
  {
    PassThroughCellIdsOn_17();
  }

  private native void PassThroughCellIdsOff_18();
  public void PassThroughCellIdsOff()
  {
    PassThroughCellIdsOff_18();
  }

  private native void SetOutputPointsPrecision_19(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_19(id0);
  }

  private native int GetOutputPointsPrecision_20();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_20();
  }

  private native void SetBatchSize_21(int id0);
  public void SetBatchSize(int id0)
  {
    SetBatchSize_21(id0);
  }

  private native int GetBatchSizeMinValue_22();
  public int GetBatchSizeMinValue()
  {
    return GetBatchSizeMinValue_22();
  }

  private native int GetBatchSizeMaxValue_23();
  public int GetBatchSizeMaxValue()
  {
    return GetBatchSizeMaxValue_23();
  }

  private native int GetBatchSize_24();
  public int GetBatchSize()
  {
    return GetBatchSize_24();
  }

  public vtkExtractCells() { super(); }

  public vtkExtractCells(long id) { super(id); }
  public native long   VTKInit();

}
