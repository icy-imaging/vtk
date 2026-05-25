// java wrapper for vtkVoidArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVoidArray extends vtkObject
{

  private native long ExtendedNew_0();
  public vtkVoidArray ExtendedNew()
  {
    long temp = ExtendedNew_0();

    if (temp == 0) return null;
    return (vtkVoidArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native void SetNumberOfPointers_9(long id0);
  public void SetNumberOfPointers(long id0)
  {
    SetNumberOfPointers_9(id0);
  }

  private native long GetNumberOfPointers_10();
  public long GetNumberOfPointers()
  {
    return GetNumberOfPointers_10();
  }

  private native void Reset_11();
  public void Reset()
  {
    Reset_11();
  }

  private native void Squeeze_12();
  public void Squeeze()
  {
    Squeeze_12();
  }

  private native void DeepCopy_13(vtkVoidArray id0);
  public void DeepCopy(vtkVoidArray id0)
  {
    DeepCopy_13(id0);
  }

  public vtkVoidArray() { super(); }

  public vtkVoidArray(long id) { super(id); }
  public native long   VTKInit();

}
