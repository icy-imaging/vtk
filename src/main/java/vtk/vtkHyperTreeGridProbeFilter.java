// java wrapper for vtkHyperTreeGridProbeFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridProbeFilter extends vtkDataSetAlgorithm
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

  private native void SetSourceData_4(vtkHyperTreeGrid id0);
  public void SetSourceData(vtkHyperTreeGrid id0)
  {
    SetSourceData_4(id0);
  }

  private native long GetSource_5();
  public vtkHyperTreeGrid GetSource()
  {
    long temp = GetSource_5();

    if (temp == 0) return null;
    return (vtkHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSourceConnection_6(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_6(id0);
  }

  private native long GetLocator_7();
  public vtkHyperTreeGridLocator GetLocator()
  {
    long temp = GetLocator_7();

    if (temp == 0) return null;
    return (vtkHyperTreeGridLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLocator_8(vtkHyperTreeGridLocator id0);
  public void SetLocator(vtkHyperTreeGridLocator id0)
  {
    SetLocator_8(id0);
  }

  private native void SetPassCellArrays_9(boolean id0);
  public void SetPassCellArrays(boolean id0)
  {
    SetPassCellArrays_9(id0);
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

  private native boolean GetPassCellArrays_12();
  public boolean GetPassCellArrays()
  {
    return GetPassCellArrays_12();
  }

  private native void SetPassPointArrays_13(boolean id0);
  public void SetPassPointArrays(boolean id0)
  {
    SetPassPointArrays_13(id0);
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

  private native boolean GetPassPointArrays_16();
  public boolean GetPassPointArrays()
  {
    return GetPassPointArrays_16();
  }

  private native void SetPassFieldArrays_17(boolean id0);
  public void SetPassFieldArrays(boolean id0)
  {
    SetPassFieldArrays_17(id0);
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

  private native boolean GetPassFieldArrays_20();
  public boolean GetPassFieldArrays()
  {
    return GetPassFieldArrays_20();
  }

  private native void SetValidPointMaskArrayName_21(byte[] id0, int len0);
  public void SetValidPointMaskArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetValidPointMaskArrayName_21(bytes0, bytes0.length);
  }

  private native byte[] GetValidPointMaskArrayName_22();
  public String GetValidPointMaskArrayName()
  {
    return new String(GetValidPointMaskArrayName_22(), StandardCharsets.UTF_8);
  }

  private native long GetValidPoints_23();
  public vtkIdTypeArray GetValidPoints()
  {
    long temp = GetValidPoints_23();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native void SetUseImplicitArrays_28(boolean id0);
  public void SetUseImplicitArrays(boolean id0)
  {
    SetUseImplicitArrays_28(id0);
  }

  private native boolean GetUseImplicitArrays_29();
  public boolean GetUseImplicitArrays()
  {
    return GetUseImplicitArrays_29();
  }

  private native void UseImplicitArraysOn_30();
  public void UseImplicitArraysOn()
  {
    UseImplicitArraysOn_30();
  }

  private native void UseImplicitArraysOff_31();
  public void UseImplicitArraysOff()
  {
    UseImplicitArraysOff_31();
  }

  public vtkHyperTreeGridProbeFilter() { super(); }

  public vtkHyperTreeGridProbeFilter(long id) { super(id); }
  public native long   VTKInit();

}
