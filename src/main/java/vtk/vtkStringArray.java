// java wrapper for vtkStringArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStringArray extends vtkAbstractArray
{

  private native long ExtendedNew_0();
  public vtkStringArray ExtendedNew()
  {
    long temp = ExtendedNew_0();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int IsTypeOf_1(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_1(bytes0, bytes0.length);
  }

  private native int IsA_2(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_3(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_4(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_4(bytes0, bytes0.length);
  }

  private native int GetDataType_5();
  public int GetDataType()
  {
    return GetDataType_5();
  }

  private native int IsNumeric_6();
  public int IsNumeric()
  {
    return IsNumeric_6();
  }

  private native void Initialize_7();
  public void Initialize()
  {
    Initialize_7();
  }

  private native int GetDataTypeSize_8();
  public int GetDataTypeSize()
  {
    return GetDataTypeSize_8();
  }

  private native void Squeeze_9();
  public void Squeeze()
  {
    Squeeze_9();
  }

  private native int Resize_10(long id0);
  public int Resize(long id0)
  {
    return Resize_10(id0);
  }

  private native void SetTuple_11(long id0,long id1,vtkAbstractArray id2);
  public void SetTuple(long id0,long id1,vtkAbstractArray id2)
  {
    SetTuple_11(id0,id1,id2);
  }

  private native void InsertTuple_12(long id0,long id1,vtkAbstractArray id2);
  public void InsertTuple(long id0,long id1,vtkAbstractArray id2)
  {
    InsertTuple_12(id0,id1,id2);
  }

  private native void InsertTuples_13(vtkIdList id0,vtkIdList id1,vtkAbstractArray id2);
  public void InsertTuples(vtkIdList id0,vtkIdList id1,vtkAbstractArray id2)
  {
    InsertTuples_13(id0,id1,id2);
  }

  private native void InsertTuplesStartingAt_14(long id0,vtkIdList id1,vtkAbstractArray id2);
  public void InsertTuplesStartingAt(long id0,vtkIdList id1,vtkAbstractArray id2)
  {
    InsertTuplesStartingAt_14(id0,id1,id2);
  }

  private native void InsertTuples_15(long id0,long id1,long id2,vtkAbstractArray id3);
  public void InsertTuples(long id0,long id1,long id2,vtkAbstractArray id3)
  {
    InsertTuples_15(id0,id1,id2,id3);
  }

  private native long InsertNextTuple_16(long id0,vtkAbstractArray id1);
  public long InsertNextTuple(long id0,vtkAbstractArray id1)
  {
    return InsertNextTuple_16(id0,id1);
  }

  private native void InterpolateTuple_17(long id0,long id1,vtkAbstractArray id2,long id3,vtkAbstractArray id4,double id5);
  public void InterpolateTuple(long id0,long id1,vtkAbstractArray id2,long id3,vtkAbstractArray id4,double id5)
  {
    InterpolateTuple_17(id0,id1,id2,id3,id4,id5);
  }

  private native void GetTuples_18(vtkIdList id0,vtkAbstractArray id1);
  public void GetTuples(vtkIdList id0,vtkAbstractArray id1)
  {
    GetTuples_18(id0,id1);
  }

  private native void GetTuples_19(long id0,long id1,vtkAbstractArray id2);
  public void GetTuples(long id0,long id1,vtkAbstractArray id2)
  {
    GetTuples_19(id0,id1,id2);
  }

  private native int Allocate_20(long id0,long id1);
  public int Allocate(long id0,long id1)
  {
    return Allocate_20(id0,id1);
  }

  private native byte[] GetValue_21(long id0);
  public String GetValue(long id0)
  {
    return new String(GetValue_21(id0), StandardCharsets.UTF_8);
  }

  private native void SetValue_22(long id0,byte[] id1, int len1);
  public void SetValue(long id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetValue_22(id0,bytes1, bytes1.length);
  }

  private native void SetNumberOfTuples_23(long id0);
  public void SetNumberOfTuples(long id0)
  {
    SetNumberOfTuples_23(id0);
  }

  private native long GetNumberOfValues_24();
  public long GetNumberOfValues()
  {
    return GetNumberOfValues_24();
  }

  private native int GetNumberOfElementComponents_25();
  public int GetNumberOfElementComponents()
  {
    return GetNumberOfElementComponents_25();
  }

  private native int GetElementComponentSize_26();
  public int GetElementComponentSize()
  {
    return GetElementComponentSize_26();
  }

  private native void InsertValue_27(long id0,byte[] id1, int len1);
  public void InsertValue(long id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    InsertValue_27(id0,bytes1, bytes1.length);
  }

  private native long InsertNextValue_28(byte[] id0, int len0);
  public long InsertNextValue(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return InsertNextValue_28(bytes0, bytes0.length);
  }

  private native void DeepCopy_29(vtkAbstractArray id0);
  public void DeepCopy(vtkAbstractArray id0)
  {
    DeepCopy_29(id0);
  }

  private native long GetActualMemorySize_30();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_30();
  }

  private native long NewIterator_31();
  public vtkArrayIterator NewIterator()
  {
    long temp = NewIterator_31();

    if (temp == 0) return null;
    return (vtkArrayIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataSize_32();
  public long GetDataSize()
  {
    return GetDataSize_32();
  }

  private native long LookupValue_33(byte[] id0, int len0);
  public long LookupValue(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return LookupValue_33(bytes0, bytes0.length);
  }

  private native void LookupValue_34(byte[] id0, int len0,vtkIdList id1);
  public void LookupValue(String id0,vtkIdList id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    LookupValue_34(bytes0, bytes0.length,id1);
  }

  private native void DataChanged_35();
  public void DataChanged()
  {
    DataChanged_35();
  }

  private native void DataElementChanged_36(long id0);
  public void DataElementChanged(long id0)
  {
    DataElementChanged_36(id0);
  }

  private native void ClearLookup_37();
  public void ClearLookup()
  {
    ClearLookup_37();
  }

  public vtkStringArray() { super(); }

  public vtkStringArray(long id) { super(id); }
  public native long   VTKInit();

}
