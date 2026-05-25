// java wrapper for vtkIntArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkIntArray extends vtkDataArray
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
  public vtkIntArray ExtendedNew()
  {
    long temp = ExtendedNew_4();

    if (temp == 0) return null;
    return (vtkIntArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDataType_5();
  public int GetDataType()
  {
    return GetDataType_5();
  }

  private native int GetValue_6(long id0);
  public int GetValue(long id0)
  {
    return GetValue_6(id0);
  }

  private native int[] GetValueRange_7(int id0);
  public int[] GetValueRange(int id0)
  {
    return GetValueRange_7(id0);
  }

  private native int[] GetValueRange_8();
  public int[] GetValueRange()
  {
    return GetValueRange_8();
  }

  private native void SetValue_9(long id0,int id1);
  public void SetValue(long id0,int id1)
  {
    SetValue_9(id0,id1);
  }

  private native boolean SetNumberOfValues_10(long id0);
  public boolean SetNumberOfValues(long id0)
  {
    return SetNumberOfValues_10(id0);
  }

  private native void InsertValue_11(long id0,int id1);
  public void InsertValue(long id0,int id1)
  {
    InsertValue_11(id0,id1);
  }

  private native long InsertNextValue_12(int id0);
  public long InsertNextValue(int id0)
  {
    return InsertNextValue_12(id0);
  }

  private native long FastDownCast_13(vtkAbstractArray id0);
  public vtkIntArray FastDownCast(vtkAbstractArray id0)
  {
    long temp = FastDownCast_13(id0);

    if (temp == 0) return null;
    return (vtkIntArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDataTypeValueMin_14();
  public int GetDataTypeValueMin()
  {
    return GetDataTypeValueMin_14();
  }

  private native int GetDataTypeValueMax_15();
  public int GetDataTypeValueMax()
  {
    return GetDataTypeValueMax_15();
  }

  private native int[] GetJavaArray_0();
  public int[] GetJavaArray()
  {
    return GetJavaArray_0();
  }

  private native void SetJavaArray_0(int[] arr, int length);
  public void SetJavaArray(int[] arr)
  {
    SetJavaArray_0(arr,arr.length);
  }

  public vtkIntArray() { super(); }

  public vtkIntArray(long id) { super(id); }
  public native long   VTKInit();

}
