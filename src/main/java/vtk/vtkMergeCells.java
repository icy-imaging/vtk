// java wrapper for vtkMergeCells object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMergeCells extends vtkObject
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

  private native void SetUnstructuredGrid_4(vtkUnstructuredGrid id0);
  public void SetUnstructuredGrid(vtkUnstructuredGrid id0)
  {
    SetUnstructuredGrid_4(id0);
  }

  private native long GetUnstructuredGrid_5();
  public vtkUnstructuredGrid GetUnstructuredGrid()
  {
    long temp = GetUnstructuredGrid_5();

    if (temp == 0) return null;
    return (vtkUnstructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTotalNumberOfCells_6(long id0);
  public void SetTotalNumberOfCells(long id0)
  {
    SetTotalNumberOfCells_6(id0);
  }

  private native long GetTotalNumberOfCells_7();
  public long GetTotalNumberOfCells()
  {
    return GetTotalNumberOfCells_7();
  }

  private native void SetTotalNumberOfPoints_8(long id0);
  public void SetTotalNumberOfPoints(long id0)
  {
    SetTotalNumberOfPoints_8(id0);
  }

  private native long GetTotalNumberOfPoints_9();
  public long GetTotalNumberOfPoints()
  {
    return GetTotalNumberOfPoints_9();
  }

  private native void SetUseGlobalIds_10(int id0);
  public void SetUseGlobalIds(int id0)
  {
    SetUseGlobalIds_10(id0);
  }

  private native int GetUseGlobalIds_11();
  public int GetUseGlobalIds()
  {
    return GetUseGlobalIds_11();
  }

  private native void UseGlobalIdsOn_12();
  public void UseGlobalIdsOn()
  {
    UseGlobalIdsOn_12();
  }

  private native void UseGlobalIdsOff_13();
  public void UseGlobalIdsOff()
  {
    UseGlobalIdsOff_13();
  }

  private native void SetPointMergeTolerance_14(double id0);
  public void SetPointMergeTolerance(double id0)
  {
    SetPointMergeTolerance_14(id0);
  }

  private native double GetPointMergeToleranceMinValue_15();
  public double GetPointMergeToleranceMinValue()
  {
    return GetPointMergeToleranceMinValue_15();
  }

  private native double GetPointMergeToleranceMaxValue_16();
  public double GetPointMergeToleranceMaxValue()
  {
    return GetPointMergeToleranceMaxValue_16();
  }

  private native double GetPointMergeTolerance_17();
  public double GetPointMergeTolerance()
  {
    return GetPointMergeTolerance_17();
  }

  private native void SetUseGlobalCellIds_18(int id0);
  public void SetUseGlobalCellIds(int id0)
  {
    SetUseGlobalCellIds_18(id0);
  }

  private native int GetUseGlobalCellIds_19();
  public int GetUseGlobalCellIds()
  {
    return GetUseGlobalCellIds_19();
  }

  private native void UseGlobalCellIdsOn_20();
  public void UseGlobalCellIdsOn()
  {
    UseGlobalCellIdsOn_20();
  }

  private native void UseGlobalCellIdsOff_21();
  public void UseGlobalCellIdsOff()
  {
    UseGlobalCellIdsOff_21();
  }

  private native void SetMergeDuplicatePoints_22(boolean id0);
  public void SetMergeDuplicatePoints(boolean id0)
  {
    SetMergeDuplicatePoints_22(id0);
  }

  private native boolean GetMergeDuplicatePoints_23();
  public boolean GetMergeDuplicatePoints()
  {
    return GetMergeDuplicatePoints_23();
  }

  private native void MergeDuplicatePointsOn_24();
  public void MergeDuplicatePointsOn()
  {
    MergeDuplicatePointsOn_24();
  }

  private native void MergeDuplicatePointsOff_25();
  public void MergeDuplicatePointsOff()
  {
    MergeDuplicatePointsOff_25();
  }

  private native void InvalidateCachedLocator_26();
  public void InvalidateCachedLocator()
  {
    InvalidateCachedLocator_26();
  }

  private native void SetTotalNumberOfDataSets_27(int id0);
  public void SetTotalNumberOfDataSets(int id0)
  {
    SetTotalNumberOfDataSets_27(id0);
  }

  private native int GetTotalNumberOfDataSets_28();
  public int GetTotalNumberOfDataSets()
  {
    return GetTotalNumberOfDataSets_28();
  }

  private native int MergeDataSet_29(vtkDataSet id0);
  public int MergeDataSet(vtkDataSet id0)
  {
    return MergeDataSet_29(id0);
  }

  private native void SetOutputPointsPrecision_30(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_30(id0);
  }

  private native int GetOutputPointsPrecision_31();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_31();
  }

  private native void Finish_32();
  public void Finish()
  {
    Finish_32();
  }

  public vtkMergeCells() { super(); }

  public vtkMergeCells(long id) { super(id); }
  public native long   VTKInit();

}
