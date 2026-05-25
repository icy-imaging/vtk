// java wrapper for vtkResampleWithDataSet object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkResampleWithDataSet extends vtkPassInputTypeAlgorithm
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

  private native void SetSourceData_4(vtkDataObject id0);
  public void SetSourceData(vtkDataObject id0)
  {
    SetSourceData_4(id0);
  }

  private native void SetSourceConnection_5(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_5(id0);
  }

  private native void SetCategoricalData_6(boolean id0);
  public void SetCategoricalData(boolean id0)
  {
    SetCategoricalData_6(id0);
  }

  private native boolean GetCategoricalData_7();
  public boolean GetCategoricalData()
  {
    return GetCategoricalData_7();
  }

  private native void SetPassCellArrays_8(boolean id0);
  public void SetPassCellArrays(boolean id0)
  {
    SetPassCellArrays_8(id0);
  }

  private native boolean GetPassCellArrays_9();
  public boolean GetPassCellArrays()
  {
    return GetPassCellArrays_9();
  }

  private native void PassCellArraysOn_10();
  public void PassCellArraysOn()
  {
    PassCellArraysOn_10();
  }

  private native void PassCellArraysOff_11();
  public void PassCellArraysOff()
  {
    PassCellArraysOff_11();
  }

  private native void SetPassPointArrays_12(boolean id0);
  public void SetPassPointArrays(boolean id0)
  {
    SetPassPointArrays_12(id0);
  }

  private native boolean GetPassPointArrays_13();
  public boolean GetPassPointArrays()
  {
    return GetPassPointArrays_13();
  }

  private native void PassPointArraysOn_14();
  public void PassPointArraysOn()
  {
    PassPointArraysOn_14();
  }

  private native void PassPointArraysOff_15();
  public void PassPointArraysOff()
  {
    PassPointArraysOff_15();
  }

  private native void SetPassFieldArrays_16(boolean id0);
  public void SetPassFieldArrays(boolean id0)
  {
    SetPassFieldArrays_16(id0);
  }

  private native boolean GetPassFieldArrays_17();
  public boolean GetPassFieldArrays()
  {
    return GetPassFieldArrays_17();
  }

  private native void PassFieldArraysOn_18();
  public void PassFieldArraysOn()
  {
    PassFieldArraysOn_18();
  }

  private native void PassFieldArraysOff_19();
  public void PassFieldArraysOff()
  {
    PassFieldArraysOff_19();
  }

  private native void SetPassPartialArrays_20(boolean id0);
  public void SetPassPartialArrays(boolean id0)
  {
    SetPassPartialArrays_20(id0);
  }

  private native boolean GetPassPartialArrays_21();
  public boolean GetPassPartialArrays()
  {
    return GetPassPartialArrays_21();
  }

  private native void PassPartialArraysOn_22();
  public void PassPartialArraysOn()
  {
    PassPartialArraysOn_22();
  }

  private native void PassPartialArraysOff_23();
  public void PassPartialArraysOff()
  {
    PassPartialArraysOff_23();
  }

  private native void SetTolerance_24(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_24(id0);
  }

  private native double GetTolerance_25();
  public double GetTolerance()
  {
    return GetTolerance_25();
  }

  private native void SetComputeTolerance_26(boolean id0);
  public void SetComputeTolerance(boolean id0)
  {
    SetComputeTolerance_26(id0);
  }

  private native boolean GetComputeTolerance_27();
  public boolean GetComputeTolerance()
  {
    return GetComputeTolerance_27();
  }

  private native void ComputeToleranceOn_28();
  public void ComputeToleranceOn()
  {
    ComputeToleranceOn_28();
  }

  private native void ComputeToleranceOff_29();
  public void ComputeToleranceOff()
  {
    ComputeToleranceOff_29();
  }

  private native void SetMarkBlankPointsAndCells_30(boolean id0);
  public void SetMarkBlankPointsAndCells(boolean id0)
  {
    SetMarkBlankPointsAndCells_30(id0);
  }

  private native boolean GetMarkBlankPointsAndCells_31();
  public boolean GetMarkBlankPointsAndCells()
  {
    return GetMarkBlankPointsAndCells_31();
  }

  private native void MarkBlankPointsAndCellsOn_32();
  public void MarkBlankPointsAndCellsOn()
  {
    MarkBlankPointsAndCellsOn_32();
  }

  private native void MarkBlankPointsAndCellsOff_33();
  public void MarkBlankPointsAndCellsOff()
  {
    MarkBlankPointsAndCellsOff_33();
  }

  private native void SetSnapToCellWithClosestPoint_34(boolean id0);
  public void SetSnapToCellWithClosestPoint(boolean id0)
  {
    SetSnapToCellWithClosestPoint_34(id0);
  }

  private native boolean GetSnapToCellWithClosestPoint_35();
  public boolean GetSnapToCellWithClosestPoint()
  {
    return GetSnapToCellWithClosestPoint_35();
  }

  private native void SnapToCellWithClosestPointOn_36();
  public void SnapToCellWithClosestPointOn()
  {
    SnapToCellWithClosestPointOn_36();
  }

  private native void SnapToCellWithClosestPointOff_37();
  public void SnapToCellWithClosestPointOff()
  {
    SnapToCellWithClosestPointOff_37();
  }

  private native void SetUseImplicitArrays_38(boolean id0);
  public void SetUseImplicitArrays(boolean id0)
  {
    SetUseImplicitArrays_38(id0);
  }

  private native boolean GetUseImplicitArrays_39();
  public boolean GetUseImplicitArrays()
  {
    return GetUseImplicitArrays_39();
  }

  private native void UseImplicitArraysOn_40();
  public void UseImplicitArraysOn()
  {
    UseImplicitArraysOn_40();
  }

  private native void UseImplicitArraysOff_41();
  public void UseImplicitArraysOff()
  {
    UseImplicitArraysOff_41();
  }

  private native void SetCellLocatorPrototype_42(vtkAbstractCellLocator id0);
  public void SetCellLocatorPrototype(vtkAbstractCellLocator id0)
  {
    SetCellLocatorPrototype_42(id0);
  }

  private native long GetCellLocatorPrototype_43();
  public vtkAbstractCellLocator GetCellLocatorPrototype()
  {
    long temp = GetCellLocatorPrototype_43();

    if (temp == 0) return null;
    return (vtkAbstractCellLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_44();
  public long GetMTime()
  {
    return GetMTime_44();
  }

  public vtkResampleWithDataSet() { super(); }

  public vtkResampleWithDataSet(long id) { super(id); }
  public native long   VTKInit();

}
