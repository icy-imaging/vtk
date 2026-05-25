// java wrapper for vtkMapArrayValues object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMapArrayValues extends vtkPassInputTypeAlgorithm
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

  private native void SetFieldType_4(int id0);
  public void SetFieldType(int id0)
  {
    SetFieldType_4(id0);
  }

  private native int GetFieldType_5();
  public int GetFieldType()
  {
    return GetFieldType_5();
  }

  private native void SetPassArray_6(int id0);
  public void SetPassArray(int id0)
  {
    SetPassArray_6(id0);
  }

  private native int GetPassArray_7();
  public int GetPassArray()
  {
    return GetPassArray_7();
  }

  private native void PassArrayOn_8();
  public void PassArrayOn()
  {
    PassArrayOn_8();
  }

  private native void PassArrayOff_9();
  public void PassArrayOff()
  {
    PassArrayOff_9();
  }

  private native void SetFillValue_10(double id0);
  public void SetFillValue(double id0)
  {
    SetFillValue_10(id0);
  }

  private native double GetFillValue_11();
  public double GetFillValue()
  {
    return GetFillValue_11();
  }

  private native void SetInputArrayName_12(byte[] id0, int len0);
  public void SetInputArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputArrayName_12(bytes0, bytes0.length);
  }

  private native byte[] GetInputArrayName_13();
  public String GetInputArrayName()
  {
    return new String(GetInputArrayName_13(), StandardCharsets.UTF_8);
  }

  private native void SetOutputArrayName_14(byte[] id0, int len0);
  public void SetOutputArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOutputArrayName_14(bytes0, bytes0.length);
  }

  private native byte[] GetOutputArrayName_15();
  public String GetOutputArrayName()
  {
    return new String(GetOutputArrayName_15(), StandardCharsets.UTF_8);
  }

  private native int GetOutputArrayType_16();
  public int GetOutputArrayType()
  {
    return GetOutputArrayType_16();
  }

  private native void SetOutputArrayType_17(int id0);
  public void SetOutputArrayType(int id0)
  {
    SetOutputArrayType_17(id0);
  }

  private native void AddToMap_18(int id0,int id1);
  public void AddToMap(int id0,int id1)
  {
    AddToMap_18(id0,id1);
  }

  private native void AddToMap_19(int id0,byte[] id1, int len1);
  public void AddToMap(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddToMap_19(id0,bytes1, bytes1.length);
  }

  private native void AddToMap_20(byte[] id0, int len0,int id1);
  public void AddToMap(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddToMap_20(bytes0, bytes0.length,id1);
  }

  private native void AddToMap_21(byte[] id0, int len0,byte[] id1, int len1);
  public void AddToMap(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddToMap_21(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void ClearMap_22();
  public void ClearMap()
  {
    ClearMap_22();
  }

  private native int GetMapSize_23();
  public int GetMapSize()
  {
    return GetMapSize_23();
  }

  public vtkMapArrayValues() { super(); }

  public vtkMapArrayValues(long id) { super(id); }
  public native long   VTKInit();

}
