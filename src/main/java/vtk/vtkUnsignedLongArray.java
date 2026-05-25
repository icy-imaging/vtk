// java wrapper for vtkUnsignedLongArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUnsignedLongArray extends vtkDataArray
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
  public vtkUnsignedLongArray ExtendedNew()
  {
    long temp = ExtendedNew_4();

    if (temp == 0) return null;
    return (vtkUnsignedLongArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDataType_5();
  public int GetDataType()
  {
    return GetDataType_5();
  }

  private native long GetValue_6(long id0);
  public long GetValue(long id0)
  {
    return GetValue_6(id0);
  }

  private native void SetValue_7(long id0,long id1);
  public void SetValue(long id0,long id1)
  {
    SetValue_7(id0,id1);
  }

  private native boolean SetNumberOfValues_8(long id0);
  public boolean SetNumberOfValues(long id0)
  {
    return SetNumberOfValues_8(id0);
  }

  private native void InsertValue_9(long id0,long id1);
  public void InsertValue(long id0,long id1)
  {
    InsertValue_9(id0,id1);
  }

  private native long InsertNextValue_10(long id0);
  public long InsertNextValue(long id0)
  {
    return InsertNextValue_10(id0);
  }

  private native long FastDownCast_11(vtkAbstractArray id0);
  public vtkUnsignedLongArray FastDownCast(vtkAbstractArray id0)
  {
    long temp = FastDownCast_11(id0);

    if (temp == 0) return null;
    return (vtkUnsignedLongArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataTypeValueMin_12();
  public long GetDataTypeValueMin()
  {
    return GetDataTypeValueMin_12();
  }

  private native long GetDataTypeValueMax_13();
  public long GetDataTypeValueMax()
  {
    return GetDataTypeValueMax_13();
  }

  private native long[] GetJavaArray_0();
  public long[] GetJavaArray()
  {
    return GetJavaArray_0();
  }

  private native void SetJavaArray_0(long[] arr, int length);
  public void SetJavaArray(long[] arr)
  {
    SetJavaArray_0(arr,arr.length);
  }

  public vtkUnsignedLongArray() { super(); }

  public vtkUnsignedLongArray(long id) { super(id); }
  public native long   VTKInit();

}
