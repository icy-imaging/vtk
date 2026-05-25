// java wrapper for vtkPointDataToCellData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointDataToCellData extends vtkDataSetAlgorithm
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

  private native void SetPassPointData_4(boolean id0);
  public void SetPassPointData(boolean id0)
  {
    SetPassPointData_4(id0);
  }

  private native boolean GetPassPointData_5();
  public boolean GetPassPointData()
  {
    return GetPassPointData_5();
  }

  private native void PassPointDataOn_6();
  public void PassPointDataOn()
  {
    PassPointDataOn_6();
  }

  private native void PassPointDataOff_7();
  public void PassPointDataOff()
  {
    PassPointDataOff_7();
  }

  private native void SetCategoricalData_8(boolean id0);
  public void SetCategoricalData(boolean id0)
  {
    SetCategoricalData_8(id0);
  }

  private native boolean GetCategoricalData_9();
  public boolean GetCategoricalData()
  {
    return GetCategoricalData_9();
  }

  private native void CategoricalDataOn_10();
  public void CategoricalDataOn()
  {
    CategoricalDataOn_10();
  }

  private native void CategoricalDataOff_11();
  public void CategoricalDataOff()
  {
    CategoricalDataOff_11();
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

  private native void AddPointDataArray_16(byte[] id0, int len0);
  public void AddPointDataArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddPointDataArray_16(bytes0, bytes0.length);
  }

  private native void RemovePointDataArray_17(byte[] id0, int len0);
  public void RemovePointDataArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemovePointDataArray_17(bytes0, bytes0.length);
  }

  private native void ClearPointDataArrays_18();
  public void ClearPointDataArrays()
  {
    ClearPointDataArrays_18();
  }

  public vtkPointDataToCellData() { super(); }

  public vtkPointDataToCellData(long id) { super(id); }
  public native long   VTKInit();

}
