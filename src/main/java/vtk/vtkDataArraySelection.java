// java wrapper for vtkDataArraySelection object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataArraySelection extends vtkObject
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

  private native void EnableArray_4(byte[] id0, int len0);
  public void EnableArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    EnableArray_4(bytes0, bytes0.length);
  }

  private native void DisableArray_5(byte[] id0, int len0);
  public void DisableArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DisableArray_5(bytes0, bytes0.length);
  }

  private native int ArrayIsEnabled_6(byte[] id0, int len0);
  public int ArrayIsEnabled(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ArrayIsEnabled_6(bytes0, bytes0.length);
  }

  private native int ArrayExists_7(byte[] id0, int len0);
  public int ArrayExists(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ArrayExists_7(bytes0, bytes0.length);
  }

  private native void EnableAllArrays_8();
  public void EnableAllArrays()
  {
    EnableAllArrays_8();
  }

  private native void DisableAllArrays_9();
  public void DisableAllArrays()
  {
    DisableAllArrays_9();
  }

  private native int GetNumberOfArrays_10();
  public int GetNumberOfArrays()
  {
    return GetNumberOfArrays_10();
  }

  private native int GetNumberOfArraysEnabled_11();
  public int GetNumberOfArraysEnabled()
  {
    return GetNumberOfArraysEnabled_11();
  }

  private native byte[] GetArrayName_12(int id0);
  public String GetArrayName(int id0)
  {
    return new String(GetArrayName_12(id0), StandardCharsets.UTF_8);
  }

  private native int GetArrayIndex_13(byte[] id0, int len0);
  public int GetArrayIndex(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetArrayIndex_13(bytes0, bytes0.length);
  }

  private native int GetEnabledArrayIndex_14(byte[] id0, int len0);
  public int GetEnabledArrayIndex(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetEnabledArrayIndex_14(bytes0, bytes0.length);
  }

  private native int GetArraySetting_15(int id0);
  public int GetArraySetting(int id0)
  {
    return GetArraySetting_15(id0);
  }

  private native int GetArraySetting_16(byte[] id0, int len0);
  public int GetArraySetting(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetArraySetting_16(bytes0, bytes0.length);
  }

  private native void SetArraySetting_17(byte[] id0, int len0,int id1);
  public void SetArraySetting(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetArraySetting_17(bytes0, bytes0.length,id1);
  }

  private native void RemoveAllArrays_18();
  public void RemoveAllArrays()
  {
    RemoveAllArrays_18();
  }

  private native int AddArray_19(byte[] id0, int len0,boolean id1);
  public int AddArray(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddArray_19(bytes0, bytes0.length,id1);
  }

  private native void RemoveArrayByIndex_20(int id0);
  public void RemoveArrayByIndex(int id0)
  {
    RemoveArrayByIndex_20(id0);
  }

  private native void RemoveArrayByName_21(byte[] id0, int len0);
  public void RemoveArrayByName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveArrayByName_21(bytes0, bytes0.length);
  }

  private native void CopySelections_22(vtkDataArraySelection id0);
  public void CopySelections(vtkDataArraySelection id0)
  {
    CopySelections_22(id0);
  }

  private native void Union_23(vtkDataArraySelection id0);
  public void Union(vtkDataArraySelection id0)
  {
    Union_23(id0);
  }

  private native void Union_24(vtkDataArraySelection id0,boolean id1);
  public void Union(vtkDataArraySelection id0,boolean id1)
  {
    Union_24(id0,id1);
  }

  private native void SetUnknownArraySetting_25(int id0);
  public void SetUnknownArraySetting(int id0)
  {
    SetUnknownArraySetting_25(id0);
  }

  private native int GetUnknownArraySetting_26();
  public int GetUnknownArraySetting()
  {
    return GetUnknownArraySetting_26();
  }

  private native void DeepCopy_27(vtkDataArraySelection id0);
  public void DeepCopy(vtkDataArraySelection id0)
  {
    DeepCopy_27(id0);
  }

  private native boolean IsEqual_28(vtkDataArraySelection id0);
  public boolean IsEqual(vtkDataArraySelection id0)
  {
    return IsEqual_28(id0);
  }

  public vtkDataArraySelection() { super(); }

  public vtkDataArraySelection(long id) { super(id); }
  public native long   VTKInit();

}
