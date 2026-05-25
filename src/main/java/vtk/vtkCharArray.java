// java wrapper for vtkCharArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCharArray extends vtkDataArray
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

  private native long ExtendedNew_4();
  public vtkCharArray ExtendedNew()
  {
    long temp = ExtendedNew_4();

    if (temp == 0) return null;
    return (vtkCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDataType_5();
  public int GetDataType()
  {
    return GetDataType_5();
  }

  private native void GetTypedTuple_6(long id0,byte[] id1, int len1);
  public void GetTypedTuple(long id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    GetTypedTuple_6(id0,bytes1, bytes1.length);
  }

  private native char GetValue_7(long id0);
  public char GetValue(long id0)
  {
    return GetValue_7(id0);
  }

  private native byte[] GetValueRange_8(int id0);
  public String GetValueRange(int id0)
  {
    return new String(GetValueRange_8(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetValueRange_9();
  public String GetValueRange()
  {
    return new String(GetValueRange_9(), StandardCharsets.UTF_8);
  }

  private native void SetTypedTuple_10(long id0,byte[] id1, int len1);
  public void SetTypedTuple(long id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetTypedTuple_10(id0,bytes1, bytes1.length);
  }

  private native void InsertTypedTuple_11(long id0,byte[] id1, int len1);
  public void InsertTypedTuple(long id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    InsertTypedTuple_11(id0,bytes1, bytes1.length);
  }

  private native long InsertNextTypedTuple_12(byte[] id0, int len0);
  public long InsertNextTypedTuple(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return InsertNextTypedTuple_12(bytes0, bytes0.length);
  }

  private native void SetValue_13(long id0,char id1);
  public void SetValue(long id0,char id1)
  {
    SetValue_13(id0,id1);
  }

  private native boolean SetNumberOfValues_14(long id0);
  public boolean SetNumberOfValues(long id0)
  {
    return SetNumberOfValues_14(id0);
  }

  private native void InsertValue_15(long id0,char id1);
  public void InsertValue(long id0,char id1)
  {
    InsertValue_15(id0,id1);
  }

  private native long InsertNextValue_16(char id0);
  public long InsertNextValue(char id0)
  {
    return InsertNextValue_16(id0);
  }

  private native byte[] WritePointer_17(long id0,long id1);
  public String WritePointer(long id0,long id1)
  {
    return new String(WritePointer_17(id0,id1), StandardCharsets.UTF_8);
  }

  private native byte[] GetPointer_18(long id0);
  public String GetPointer(long id0)
  {
    return new String(GetPointer_18(id0), StandardCharsets.UTF_8);
  }

  private native void SetArray_19(byte[] id0, int len0,long id1,int id2);
  public void SetArray(String id0,long id1,int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetArray_19(bytes0, bytes0.length,id1,id2);
  }

  private native void SetArray_20(byte[] id0, int len0,long id1,int id2,int id3);
  public void SetArray(String id0,long id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetArray_20(bytes0, bytes0.length,id1,id2,id3);
  }

  private native long FastDownCast_21(vtkAbstractArray id0);
  public vtkCharArray FastDownCast(vtkAbstractArray id0)
  {
    long temp = FastDownCast_21(id0);

    if (temp == 0) return null;
    return (vtkCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native char GetDataTypeValueMin_22();
  public char GetDataTypeValueMin()
  {
    return GetDataTypeValueMin_22();
  }

  private native char GetDataTypeValueMax_23();
  public char GetDataTypeValueMax()
  {
    return GetDataTypeValueMax_23();
  }

  private native char[] GetJavaArray_0();
  public char[] GetJavaArray()
  {
    return GetJavaArray_0();
  }

  private native void SetJavaArray_0(char[] arr, int length);
  public void SetJavaArray(char[] arr)
  {
    SetJavaArray_0(arr,arr.length);
  }

  public vtkCharArray() { super(); }

  public vtkCharArray(long id) { super(id); }
  public native long   VTKInit();

}
