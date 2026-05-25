// java wrapper for vtkFieldData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFieldData extends vtkObject
{

  private native long ExtendedNew_0();
  public vtkFieldData ExtendedNew()
  {
    long temp = ExtendedNew_0();

    if (temp == 0) return null;
    return (vtkFieldData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native void Initialize_5();
  public void Initialize()
  {
    Initialize_5();
  }

  private native int Allocate_6(long id0,long id1);
  public int Allocate(long id0,long id1)
  {
    return Allocate_6(id0,id1);
  }

  private native void CopyStructure_7(vtkFieldData id0);
  public void CopyStructure(vtkFieldData id0)
  {
    CopyStructure_7(id0);
  }

  private native void AllocateArrays_8(int id0);
  public void AllocateArrays(int id0)
  {
    AllocateArrays_8(id0);
  }

  private native int GetNumberOfArrays_9();
  public int GetNumberOfArrays()
  {
    return GetNumberOfArrays_9();
  }

  private native int AddArray_10(vtkAbstractArray id0);
  public int AddArray(vtkAbstractArray id0)
  {
    return AddArray_10(id0);
  }

  private native void NullData_11(long id0);
  public void NullData(long id0)
  {
    NullData_11(id0);
  }

  private native void RemoveArray_12(byte[] id0, int len0);
  public void RemoveArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveArray_12(bytes0, bytes0.length);
  }

  private native void RemoveArray_13(int id0);
  public void RemoveArray(int id0)
  {
    RemoveArray_13(id0);
  }

  private native long GetArray_14(int id0);
  public vtkDataArray GetArray(int id0)
  {
    long temp = GetArray_14(id0);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetArray_15(byte[] id0, int len0);
  public vtkDataArray GetArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetArray_15(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAbstractArray_16(int id0);
  public vtkAbstractArray GetAbstractArray(int id0)
  {
    long temp = GetAbstractArray_16(id0);

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAbstractArray_17(byte[] id0, int len0);
  public vtkAbstractArray GetAbstractArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetAbstractArray_17(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int HasArray_18(byte[] id0, int len0);
  public int HasArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return HasArray_18(bytes0, bytes0.length);
  }

  private native byte[] GetArrayName_19(int id0);
  public String GetArrayName(int id0)
  {
    return new String(GetArrayName_19(id0), StandardCharsets.UTF_8);
  }

  private native void PassData_20(vtkFieldData id0);
  public void PassData(vtkFieldData id0)
  {
    PassData_20(id0);
  }

  private native void CopyFieldOn_21(byte[] id0, int len0);
  public void CopyFieldOn(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    CopyFieldOn_21(bytes0, bytes0.length);
  }

  private native void CopyFieldOff_22(byte[] id0, int len0);
  public void CopyFieldOff(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    CopyFieldOff_22(bytes0, bytes0.length);
  }

  private native void CopyAllOn_23(int id0);
  public void CopyAllOn(int id0)
  {
    CopyAllOn_23(id0);
  }

  private native void CopyAllOff_24(int id0);
  public void CopyAllOff(int id0)
  {
    CopyAllOff_24(id0);
  }

  private native void DeepCopy_25(vtkFieldData id0);
  public void DeepCopy(vtkFieldData id0)
  {
    DeepCopy_25(id0);
  }

  private native void ShallowCopy_26(vtkFieldData id0);
  public void ShallowCopy(vtkFieldData id0)
  {
    ShallowCopy_26(id0);
  }

  private native void Squeeze_27();
  public void Squeeze()
  {
    Squeeze_27();
  }

  private native void Reset_28();
  public void Reset()
  {
    Reset_28();
  }

  private native long GetActualMemorySize_29();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_29();
  }

  private native long GetMTime_30();
  public long GetMTime()
  {
    return GetMTime_30();
  }

  private native void GetField_31(vtkIdList id0,vtkFieldData id1);
  public void GetField(vtkIdList id0,vtkFieldData id1)
  {
    GetField_31(id0,id1);
  }

  private native int GetNumberOfComponents_32();
  public int GetNumberOfComponents()
  {
    return GetNumberOfComponents_32();
  }

  private native long GetNumberOfTuples_33();
  public long GetNumberOfTuples()
  {
    return GetNumberOfTuples_33();
  }

  private native void SetNumberOfTuples_34(long id0);
  public void SetNumberOfTuples(long id0)
  {
    SetNumberOfTuples_34(id0);
  }

  private native void SetTuple_35(long id0,long id1,vtkFieldData id2);
  public void SetTuple(long id0,long id1,vtkFieldData id2)
  {
    SetTuple_35(id0,id1,id2);
  }

  private native void InsertTuple_36(long id0,long id1,vtkFieldData id2);
  public void InsertTuple(long id0,long id1,vtkFieldData id2)
  {
    InsertTuple_36(id0,id1,id2);
  }

  private native long InsertNextTuple_37(long id0,vtkFieldData id1);
  public long InsertNextTuple(long id0,vtkFieldData id1)
  {
    return InsertNextTuple_37(id0,id1);
  }

  private native boolean GetRange_38(byte[] id0, int len0,double id1[],int id2);
  public boolean GetRange(String id0,double id1[],int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetRange_38(bytes0, bytes0.length,id1,id2);
  }

  private native boolean GetRange_39(int id0,double id1[],int id2);
  public boolean GetRange(int id0,double id1[],int id2)
  {
    return GetRange_39(id0,id1,id2);
  }

  private native boolean GetFiniteRange_40(byte[] id0, int len0,double id1[],int id2);
  public boolean GetFiniteRange(String id0,double id1[],int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetFiniteRange_40(bytes0, bytes0.length,id1,id2);
  }

  private native boolean GetFiniteRange_41(int id0,double id1[],int id2);
  public boolean GetFiniteRange(int id0,double id1[],int id2)
  {
    return GetFiniteRange_41(id0,id1,id2);
  }

  private native byte GetGhostsToSkip_42();
  public byte GetGhostsToSkip()
  {
    return GetGhostsToSkip_42();
  }

  private native void SetGhostsToSkip_43(byte id0);
  public void SetGhostsToSkip(byte id0)
  {
    SetGhostsToSkip_43(id0);
  }

  private native boolean HasAnyGhostBitSet_44(int id0);
  public boolean HasAnyGhostBitSet(int id0)
  {
    return HasAnyGhostBitSet_44(id0);
  }

  private native long GetGhostArray_45();
  public vtkUnsignedCharArray GetGhostArray()
  {
    long temp = GetGhostArray_45();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkFieldData() { super(); }

  public vtkFieldData(long id) { super(id); }
  public native long   VTKInit();

}
