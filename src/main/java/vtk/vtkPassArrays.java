// java wrapper for vtkPassArrays object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPassArrays extends vtkDataObjectAlgorithm
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

  private native void AddArray_4(int id0,byte[] id1, int len1);
  public void AddArray(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddArray_4(id0,bytes1, bytes1.length);
  }

  private native void AddPointDataArray_5(byte[] id0, int len0);
  public void AddPointDataArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddPointDataArray_5(bytes0, bytes0.length);
  }

  private native void AddCellDataArray_6(byte[] id0, int len0);
  public void AddCellDataArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddCellDataArray_6(bytes0, bytes0.length);
  }

  private native void AddFieldDataArray_7(byte[] id0, int len0);
  public void AddFieldDataArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddFieldDataArray_7(bytes0, bytes0.length);
  }

  private native void RemoveArray_8(int id0,byte[] id1, int len1);
  public void RemoveArray(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    RemoveArray_8(id0,bytes1, bytes1.length);
  }

  private native void RemovePointDataArray_9(byte[] id0, int len0);
  public void RemovePointDataArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemovePointDataArray_9(bytes0, bytes0.length);
  }

  private native void RemoveCellDataArray_10(byte[] id0, int len0);
  public void RemoveCellDataArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveCellDataArray_10(bytes0, bytes0.length);
  }

  private native void RemoveFieldDataArray_11(byte[] id0, int len0);
  public void RemoveFieldDataArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveFieldDataArray_11(bytes0, bytes0.length);
  }

  private native void ClearArrays_12();
  public void ClearArrays()
  {
    ClearArrays_12();
  }

  private native void ClearPointDataArrays_13();
  public void ClearPointDataArrays()
  {
    ClearPointDataArrays_13();
  }

  private native void ClearCellDataArrays_14();
  public void ClearCellDataArrays()
  {
    ClearCellDataArrays_14();
  }

  private native void ClearFieldDataArrays_15();
  public void ClearFieldDataArrays()
  {
    ClearFieldDataArrays_15();
  }

  private native void SetRemoveArrays_16(boolean id0);
  public void SetRemoveArrays(boolean id0)
  {
    SetRemoveArrays_16(id0);
  }

  private native boolean GetRemoveArrays_17();
  public boolean GetRemoveArrays()
  {
    return GetRemoveArrays_17();
  }

  private native void RemoveArraysOn_18();
  public void RemoveArraysOn()
  {
    RemoveArraysOn_18();
  }

  private native void RemoveArraysOff_19();
  public void RemoveArraysOff()
  {
    RemoveArraysOff_19();
  }

  private native void SetUseFieldTypes_20(boolean id0);
  public void SetUseFieldTypes(boolean id0)
  {
    SetUseFieldTypes_20(id0);
  }

  private native boolean GetUseFieldTypes_21();
  public boolean GetUseFieldTypes()
  {
    return GetUseFieldTypes_21();
  }

  private native void UseFieldTypesOn_22();
  public void UseFieldTypesOn()
  {
    UseFieldTypesOn_22();
  }

  private native void UseFieldTypesOff_23();
  public void UseFieldTypesOff()
  {
    UseFieldTypesOff_23();
  }

  private native void AddFieldType_24(int id0);
  public void AddFieldType(int id0)
  {
    AddFieldType_24(id0);
  }

  private native void ClearFieldTypes_25();
  public void ClearFieldTypes()
  {
    ClearFieldTypes_25();
  }

  public vtkPassArrays() { super(); }

  public vtkPassArrays(long id) { super(id); }
  public native long   VTKInit();

}
