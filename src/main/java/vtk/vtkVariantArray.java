// java wrapper for vtkVariantArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVariantArray extends vtkAbstractArray
{

  private native long ExtendedNew_0();
  public vtkVariantArray ExtendedNew()
  {
    long temp = ExtendedNew_0();

    if (temp == 0) return null;
    return (vtkVariantArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native int Allocate_5(long id0,long id1);
  public int Allocate(long id0,long id1)
  {
    return Allocate_5(id0,id1);
  }

  private native void Initialize_6();
  public void Initialize()
  {
    Initialize_6();
  }

  private native int GetDataType_7();
  public int GetDataType()
  {
    return GetDataType_7();
  }

  private native int GetDataTypeSize_8();
  public int GetDataTypeSize()
  {
    return GetDataTypeSize_8();
  }

  private native int GetElementComponentSize_9();
  public int GetElementComponentSize()
  {
    return GetElementComponentSize_9();
  }

  private native void SetNumberOfTuples_10(long id0);
  public void SetNumberOfTuples(long id0)
  {
    SetNumberOfTuples_10(id0);
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

  private native void DeepCopy_17(vtkAbstractArray id0);
  public void DeepCopy(vtkAbstractArray id0)
  {
    DeepCopy_17(id0);
  }

  private native void InterpolateTuple_18(long id0,long id1,vtkAbstractArray id2,long id3,vtkAbstractArray id4,double id5);
  public void InterpolateTuple(long id0,long id1,vtkAbstractArray id2,long id3,vtkAbstractArray id4,double id5)
  {
    InterpolateTuple_18(id0,id1,id2,id3,id4,id5);
  }

  private native void Squeeze_19();
  public void Squeeze()
  {
    Squeeze_19();
  }

  private native int Resize_20(long id0);
  public int Resize(long id0)
  {
    return Resize_20(id0);
  }

  private native long GetActualMemorySize_21();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_21();
  }

  private native int IsNumeric_22();
  public int IsNumeric()
  {
    return IsNumeric_22();
  }

  private native long NewIterator_23();
  public vtkArrayIterator NewIterator()
  {
    long temp = NewIterator_23();

    if (temp == 0) return null;
    return (vtkArrayIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfValues_24();
  public long GetNumberOfValues()
  {
    return GetNumberOfValues_24();
  }

  private native void DataChanged_25();
  public void DataChanged()
  {
    DataChanged_25();
  }

  private native void DataElementChanged_26(long id0);
  public void DataElementChanged(long id0)
  {
    DataElementChanged_26(id0);
  }

  private native void ClearLookup_27();
  public void ClearLookup()
  {
    ClearLookup_27();
  }

  public vtkVariantArray() { super(); }

  public vtkVariantArray(long id) { super(id); }
  public native long   VTKInit();

}
