// java wrapper for vtkPointInterpolator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointInterpolator extends vtkDataSetAlgorithm
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

  private native void SetLocator_7(vtkAbstractPointLocator id0);
  public void SetLocator(vtkAbstractPointLocator id0)
  {
    SetLocator_7(id0);
  }

  private native long GetLocator_8();
  public vtkAbstractPointLocator GetLocator()
  {
    long temp = GetLocator_8();

    if (temp == 0) return null;
    return (vtkAbstractPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetKernel_9(vtkInterpolationKernel id0);
  public void SetKernel(vtkInterpolationKernel id0)
  {
    SetKernel_9(id0);
  }

  private native long GetKernel_10();
  public vtkInterpolationKernel GetKernel()
  {
    long temp = GetKernel_10();

    if (temp == 0) return null;
    return (vtkInterpolationKernel)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNullPointsStrategy_11(int id0);
  public void SetNullPointsStrategy(int id0)
  {
    SetNullPointsStrategy_11(id0);
  }

  private native int GetNullPointsStrategy_12();
  public int GetNullPointsStrategy()
  {
    return GetNullPointsStrategy_12();
  }

  private native void SetNullPointsStrategyToMaskPoints_13();
  public void SetNullPointsStrategyToMaskPoints()
  {
    SetNullPointsStrategyToMaskPoints_13();
  }

  private native void SetNullPointsStrategyToNullValue_14();
  public void SetNullPointsStrategyToNullValue()
  {
    SetNullPointsStrategyToNullValue_14();
  }

  private native void SetNullPointsStrategyToClosestPoint_15();
  public void SetNullPointsStrategyToClosestPoint()
  {
    SetNullPointsStrategyToClosestPoint_15();
  }

  private native void SetValidPointsMaskArrayName_16(byte[] id0, int len0);
  public void SetValidPointsMaskArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetValidPointsMaskArrayName_16(bytes0, bytes0.length);
  }

  private native byte[] GetValidPointsMaskArrayName_17();
  public String GetValidPointsMaskArrayName()
  {
    return new String(GetValidPointsMaskArrayName_17(), StandardCharsets.UTF_8);
  }

  private native void SetNullValue_18(double id0);
  public void SetNullValue(double id0)
  {
    SetNullValue_18(id0);
  }

  private native double GetNullValue_19();
  public double GetNullValue()
  {
    return GetNullValue_19();
  }

  private native void AddExcludedArray_20(byte[] id0, int len0);
  public void AddExcludedArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddExcludedArray_20(bytes0, bytes0.length);
  }

  private native void ClearExcludedArrays_21();
  public void ClearExcludedArrays()
  {
    ClearExcludedArrays_21();
  }

  private native int GetNumberOfExcludedArrays_22();
  public int GetNumberOfExcludedArrays()
  {
    return GetNumberOfExcludedArrays_22();
  }

  private native byte[] GetExcludedArray_23(int id0);
  public String GetExcludedArray(int id0)
  {
    return new String(GetExcludedArray_23(id0), StandardCharsets.UTF_8);
  }

  private native void SetPromoteOutputArrays_24(boolean id0);
  public void SetPromoteOutputArrays(boolean id0)
  {
    SetPromoteOutputArrays_24(id0);
  }

  private native void PromoteOutputArraysOn_25();
  public void PromoteOutputArraysOn()
  {
    PromoteOutputArraysOn_25();
  }

  private native void PromoteOutputArraysOff_26();
  public void PromoteOutputArraysOff()
  {
    PromoteOutputArraysOff_26();
  }

  private native boolean GetPromoteOutputArrays_27();
  public boolean GetPromoteOutputArrays()
  {
    return GetPromoteOutputArrays_27();
  }

  private native void SetPassPointArrays_28(boolean id0);
  public void SetPassPointArrays(boolean id0)
  {
    SetPassPointArrays_28(id0);
  }

  private native void PassPointArraysOn_29();
  public void PassPointArraysOn()
  {
    PassPointArraysOn_29();
  }

  private native void PassPointArraysOff_30();
  public void PassPointArraysOff()
  {
    PassPointArraysOff_30();
  }

  private native boolean GetPassPointArrays_31();
  public boolean GetPassPointArrays()
  {
    return GetPassPointArrays_31();
  }

  private native void SetPassCellArrays_32(boolean id0);
  public void SetPassCellArrays(boolean id0)
  {
    SetPassCellArrays_32(id0);
  }

  private native void PassCellArraysOn_33();
  public void PassCellArraysOn()
  {
    PassCellArraysOn_33();
  }

  private native void PassCellArraysOff_34();
  public void PassCellArraysOff()
  {
    PassCellArraysOff_34();
  }

  private native boolean GetPassCellArrays_35();
  public boolean GetPassCellArrays()
  {
    return GetPassCellArrays_35();
  }

  private native void SetPassFieldArrays_36(boolean id0);
  public void SetPassFieldArrays(boolean id0)
  {
    SetPassFieldArrays_36(id0);
  }

  private native void PassFieldArraysOn_37();
  public void PassFieldArraysOn()
  {
    PassFieldArraysOn_37();
  }

  private native void PassFieldArraysOff_38();
  public void PassFieldArraysOff()
  {
    PassFieldArraysOff_38();
  }

  private native boolean GetPassFieldArrays_39();
  public boolean GetPassFieldArrays()
  {
    return GetPassFieldArrays_39();
  }

  private native long GetMTime_40();
  public long GetMTime()
  {
    return GetMTime_40();
  }

  public vtkPointInterpolator() { super(); }

  public vtkPointInterpolator(long id) { super(id); }
  public native long   VTKInit();

}
