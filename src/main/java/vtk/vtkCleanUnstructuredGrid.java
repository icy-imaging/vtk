// java wrapper for vtkCleanUnstructuredGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCleanUnstructuredGrid extends vtkUnstructuredGridAlgorithm
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

  private native void SetToleranceIsAbsolute_4(boolean id0);
  public void SetToleranceIsAbsolute(boolean id0)
  {
    SetToleranceIsAbsolute_4(id0);
  }

  private native void ToleranceIsAbsoluteOn_5();
  public void ToleranceIsAbsoluteOn()
  {
    ToleranceIsAbsoluteOn_5();
  }

  private native void ToleranceIsAbsoluteOff_6();
  public void ToleranceIsAbsoluteOff()
  {
    ToleranceIsAbsoluteOff_6();
  }

  private native boolean GetToleranceIsAbsolute_7();
  public boolean GetToleranceIsAbsolute()
  {
    return GetToleranceIsAbsolute_7();
  }

  private native void SetTolerance_8(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_8(id0);
  }

  private native double GetToleranceMinValue_9();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_9();
  }

  private native double GetToleranceMaxValue_10();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_10();
  }

  private native double GetTolerance_11();
  public double GetTolerance()
  {
    return GetTolerance_11();
  }

  private native void SetAbsoluteTolerance_12(double id0);
  public void SetAbsoluteTolerance(double id0)
  {
    SetAbsoluteTolerance_12(id0);
  }

  private native double GetAbsoluteToleranceMinValue_13();
  public double GetAbsoluteToleranceMinValue()
  {
    return GetAbsoluteToleranceMinValue_13();
  }

  private native double GetAbsoluteToleranceMaxValue_14();
  public double GetAbsoluteToleranceMaxValue()
  {
    return GetAbsoluteToleranceMaxValue_14();
  }

  private native double GetAbsoluteTolerance_15();
  public double GetAbsoluteTolerance()
  {
    return GetAbsoluteTolerance_15();
  }

  private native void SetLocator_16(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_16(id0);
  }

  private native long GetLocator_17();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_17();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_18(vtkDataSet id0);
  public void CreateDefaultLocator(vtkDataSet id0)
  {
    CreateDefaultLocator_18(id0);
  }

  private native void ReleaseLocator_19();
  public void ReleaseLocator()
  {
    ReleaseLocator_19();
  }

  private native void SetOutputPointsPrecision_20(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_20(id0);
  }

  private native int GetOutputPointsPrecision_21();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_21();
  }

  private native void SetRemovePointsWithoutCells_22(boolean id0);
  public void SetRemovePointsWithoutCells(boolean id0)
  {
    SetRemovePointsWithoutCells_22(id0);
  }

  private native boolean GetRemovePointsWithoutCells_23();
  public boolean GetRemovePointsWithoutCells()
  {
    return GetRemovePointsWithoutCells_23();
  }

  private native void RemovePointsWithoutCellsOn_24();
  public void RemovePointsWithoutCellsOn()
  {
    RemovePointsWithoutCellsOn_24();
  }

  private native void RemovePointsWithoutCellsOff_25();
  public void RemovePointsWithoutCellsOff()
  {
    RemovePointsWithoutCellsOff_25();
  }

  private native int GetPointDataWeighingStrategy_26();
  public int GetPointDataWeighingStrategy()
  {
    return GetPointDataWeighingStrategy_26();
  }

  private native void SetPointDataWeighingStrategy_27(int id0);
  public void SetPointDataWeighingStrategy(int id0)
  {
    SetPointDataWeighingStrategy_27(id0);
  }

  private native int GetPointDataWeighingStrategyMinValue_28();
  public int GetPointDataWeighingStrategyMinValue()
  {
    return GetPointDataWeighingStrategyMinValue_28();
  }

  private native int GetPointDataWeighingStrategyMaxValue_29();
  public int GetPointDataWeighingStrategyMaxValue()
  {
    return GetPointDataWeighingStrategyMaxValue_29();
  }

  public vtkCleanUnstructuredGrid() { super(); }

  public vtkCleanUnstructuredGrid(long id) { super(id); }
  public native long   VTKInit();

}
