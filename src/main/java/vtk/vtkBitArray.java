// java wrapper for vtkBitArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBitArray extends vtkDataArray
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

  private native int Allocate_4(long id0,long id1);
  public int Allocate(long id0,long id1)
  {
    return Allocate_4(id0,id1);
  }

  private native void Initialize_5();
  public void Initialize()
  {
    Initialize_5();
  }

  private native int GetDataType_6();
  public int GetDataType()
  {
    return GetDataType_6();
  }

  private native int GetDataTypeSize_7();
  public int GetDataTypeSize()
  {
    return GetDataTypeSize_7();
  }

  private native void SetNumberOfTuples_8(long id0);
  public void SetNumberOfTuples(long id0)
  {
    SetNumberOfTuples_8(id0);
  }

  private native boolean SetNumberOfValues_9(long id0);
  public boolean SetNumberOfValues(long id0)
  {
    return SetNumberOfValues_9(id0);
  }

  private native void SetTuple_10(long id0,long id1,vtkAbstractArray id2);
  public void SetTuple(long id0,long id1,vtkAbstractArray id2)
  {
    SetTuple_10(id0,id1,id2);
  }

  private native void InsertTuple_11(long id0,long id1,vtkAbstractArray id2);
  public void InsertTuple(long id0,long id1,vtkAbstractArray id2)
  {
    InsertTuple_11(id0,id1,id2);
  }

  private native void InsertTuples_12(vtkIdList id0,vtkIdList id1,vtkAbstractArray id2);
  public void InsertTuples(vtkIdList id0,vtkIdList id1,vtkAbstractArray id2)
  {
    InsertTuples_12(id0,id1,id2);
  }

  private native void InsertTuplesStartingAt_13(long id0,vtkIdList id1,vtkAbstractArray id2);
  public void InsertTuplesStartingAt(long id0,vtkIdList id1,vtkAbstractArray id2)
  {
    InsertTuplesStartingAt_13(id0,id1,id2);
  }

  private native void InsertTuples_14(long id0,long id1,long id2,vtkAbstractArray id3);
  public void InsertTuples(long id0,long id1,long id2,vtkAbstractArray id3)
  {
    InsertTuples_14(id0,id1,id2,id3);
  }

  private native long InsertNextTuple_15(long id0,vtkAbstractArray id1);
  public long InsertNextTuple(long id0,vtkAbstractArray id1)
  {
    return InsertNextTuple_15(id0,id1);
  }

  private native void RemoveTuple_16(long id0);
  public void RemoveTuple(long id0)
  {
    RemoveTuple_16(id0);
  }

  private native void RemoveFirstTuple_17();
  public void RemoveFirstTuple()
  {
    RemoveFirstTuple_17();
  }

  private native void RemoveLastTuple_18();
  public void RemoveLastTuple()
  {
    RemoveLastTuple_18();
  }

  private native void SetComponent_19(long id0,int id1,double id2);
  public void SetComponent(long id0,int id1,double id2)
  {
    SetComponent_19(id0,id1,id2);
  }

  private native void Squeeze_20();
  public void Squeeze()
  {
    Squeeze_20();
  }

  private native int Resize_21(long id0);
  public int Resize(long id0)
  {
    return Resize_21(id0);
  }

  private native int GetValue_22(long id0);
  public int GetValue(long id0)
  {
    return GetValue_22(id0);
  }

  private native void SetValue_23(long id0,int id1);
  public void SetValue(long id0,int id1)
  {
    SetValue_23(id0,id1);
  }

  private native void InsertValue_24(long id0,int id1);
  public void InsertValue(long id0,int id1)
  {
    InsertValue_24(id0,id1);
  }

  private native long InsertNextValue_25(int id0);
  public long InsertNextValue(int id0)
  {
    return InsertNextValue_25(id0);
  }

  private native void InsertComponent_26(long id0,int id1,double id2);
  public void InsertComponent(long id0,int id1,double id2)
  {
    InsertComponent_26(id0,id1,id2);
  }

  private native void DeepCopy_27(vtkDataArray id0);
  public void DeepCopy(vtkDataArray id0)
  {
    DeepCopy_27(id0);
  }

  private native void DeepCopy_28(vtkAbstractArray id0);
  public void DeepCopy(vtkAbstractArray id0)
  {
    DeepCopy_28(id0);
  }

  private native long NewIterator_29();
  public vtkArrayIterator NewIterator()
  {
    long temp = NewIterator_29();

    if (temp == 0) return null;
    return (vtkArrayIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long LookupValue_30(int id0);
  public long LookupValue(int id0)
  {
    return LookupValue_30(id0);
  }

  private native void LookupValue_31(int id0,vtkIdList id1);
  public void LookupValue(int id0,vtkIdList id1)
  {
    LookupValue_31(id0,id1);
  }

  private native void DataChanged_32();
  public void DataChanged()
  {
    DataChanged_32();
  }

  private native void ClearLookup_33();
  public void ClearLookup()
  {
    ClearLookup_33();
  }

  public vtkBitArray() { super(); }

  public vtkBitArray(long id) { super(id); }
  public native long   VTKInit();

}
