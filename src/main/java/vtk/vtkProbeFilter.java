// java wrapper for vtkProbeFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProbeFilter extends vtkDataSetAlgorithm
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

  private native long GetSource_5();
  public vtkDataObject GetSource()
  {
    long temp = GetSource_5();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSourceConnection_6(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_6(id0);
  }

  private native void SetCategoricalData_7(int id0);
  public void SetCategoricalData(int id0)
  {
    SetCategoricalData_7(id0);
  }

  private native int GetCategoricalData_8();
  public int GetCategoricalData()
  {
    return GetCategoricalData_8();
  }

  private native void CategoricalDataOn_9();
  public void CategoricalDataOn()
  {
    CategoricalDataOn_9();
  }

  private native void CategoricalDataOff_10();
  public void CategoricalDataOff()
  {
    CategoricalDataOff_10();
  }

  private native void SetSpatialMatch_11(int id0);
  public void SetSpatialMatch(int id0)
  {
    SetSpatialMatch_11(id0);
  }

  private native int GetSpatialMatch_12();
  public int GetSpatialMatch()
  {
    return GetSpatialMatch_12();
  }

  private native void SpatialMatchOn_13();
  public void SpatialMatchOn()
  {
    SpatialMatchOn_13();
  }

  private native void SpatialMatchOff_14();
  public void SpatialMatchOff()
  {
    SpatialMatchOff_14();
  }

  private native long GetValidPoints_15();
  public vtkIdTypeArray GetValidPoints()
  {
    long temp = GetValidPoints_15();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetValidPointMaskArrayName_16(byte[] id0, int len0);
  public void SetValidPointMaskArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetValidPointMaskArrayName_16(bytes0, bytes0.length);
  }

  private native byte[] GetValidPointMaskArrayName_17();
  public String GetValidPointMaskArrayName()
  {
    return new String(GetValidPointMaskArrayName_17(), StandardCharsets.UTF_8);
  }

  private native void SetPassCellArrays_18(int id0);
  public void SetPassCellArrays(int id0)
  {
    SetPassCellArrays_18(id0);
  }

  private native void PassCellArraysOn_19();
  public void PassCellArraysOn()
  {
    PassCellArraysOn_19();
  }

  private native void PassCellArraysOff_20();
  public void PassCellArraysOff()
  {
    PassCellArraysOff_20();
  }

  private native int GetPassCellArrays_21();
  public int GetPassCellArrays()
  {
    return GetPassCellArrays_21();
  }

  private native void SetPassPointArrays_22(int id0);
  public void SetPassPointArrays(int id0)
  {
    SetPassPointArrays_22(id0);
  }

  private native void PassPointArraysOn_23();
  public void PassPointArraysOn()
  {
    PassPointArraysOn_23();
  }

  private native void PassPointArraysOff_24();
  public void PassPointArraysOff()
  {
    PassPointArraysOff_24();
  }

  private native int GetPassPointArrays_25();
  public int GetPassPointArrays()
  {
    return GetPassPointArrays_25();
  }

  private native void SetPassFieldArrays_26(int id0);
  public void SetPassFieldArrays(int id0)
  {
    SetPassFieldArrays_26(id0);
  }

  private native void PassFieldArraysOn_27();
  public void PassFieldArraysOn()
  {
    PassFieldArraysOn_27();
  }

  private native void PassFieldArraysOff_28();
  public void PassFieldArraysOff()
  {
    PassFieldArraysOff_28();
  }

  private native int GetPassFieldArrays_29();
  public int GetPassFieldArrays()
  {
    return GetPassFieldArrays_29();
  }

  private native void SetTolerance_30(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_30(id0);
  }

  private native double GetTolerance_31();
  public double GetTolerance()
  {
    return GetTolerance_31();
  }

  private native void SetSnapToCellWithClosestPoint_32(boolean id0);
  public void SetSnapToCellWithClosestPoint(boolean id0)
  {
    SetSnapToCellWithClosestPoint_32(id0);
  }

  private native void SnapToCellWithClosestPointOn_33();
  public void SnapToCellWithClosestPointOn()
  {
    SnapToCellWithClosestPointOn_33();
  }

  private native void SnapToCellWithClosestPointOff_34();
  public void SnapToCellWithClosestPointOff()
  {
    SnapToCellWithClosestPointOff_34();
  }

  private native boolean GetSnapToCellWithClosestPoint_35();
  public boolean GetSnapToCellWithClosestPoint()
  {
    return GetSnapToCellWithClosestPoint_35();
  }

  private native void SetComputeTolerance_36(boolean id0);
  public void SetComputeTolerance(boolean id0)
  {
    SetComputeTolerance_36(id0);
  }

  private native void ComputeToleranceOn_37();
  public void ComputeToleranceOn()
  {
    ComputeToleranceOn_37();
  }

  private native void ComputeToleranceOff_38();
  public void ComputeToleranceOff()
  {
    ComputeToleranceOff_38();
  }

  private native boolean GetComputeTolerance_39();
  public boolean GetComputeTolerance()
  {
    return GetComputeTolerance_39();
  }

  private native void SetFindCellStrategy_40(vtkFindCellStrategy id0);
  public void SetFindCellStrategy(vtkFindCellStrategy id0)
  {
    SetFindCellStrategy_40(id0);
  }

  private native long GetFindCellStrategy_41();
  public vtkFindCellStrategy GetFindCellStrategy()
  {
    long temp = GetFindCellStrategy_41();

    if (temp == 0) return null;
    return (vtkFindCellStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  public vtkProbeFilter() { super(); }

  public vtkProbeFilter(long id) { super(id); }
  public native long   VTKInit();

}
