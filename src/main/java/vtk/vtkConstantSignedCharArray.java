// java wrapper for vtkConstantSignedCharArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkConstantSignedCharArray extends vtkDataArray
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

  private native int GetDataType_4();
  public int GetDataType()
  {
    return GetDataType_4();
  }

  private native byte GetValue_5(long id0);
  public byte GetValue(long id0)
  {
    return GetValue_5(id0);
  }

  private native byte[]  GetValueRange_6(int id0);
  public byte[]  GetValueRange(int id0)
  {
    return GetValueRange_6(id0);
  }

  private native byte[]  GetValueRange_7();
  public byte[]  GetValueRange()
  {
    return GetValueRange_7();
  }

  private native long ExtendedNew_8();
  public vtkConstantSignedCharArray ExtendedNew()
  {
    long temp = ExtendedNew_8();

    if (temp == 0) return null;
    return (vtkConstantSignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FastDownCast_9(vtkAbstractArray id0);
  public vtkConstantSignedCharArray FastDownCast(vtkAbstractArray id0)
  {
    long temp = FastDownCast_9(id0);

    if (temp == 0) return null;
    return (vtkConstantSignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ConstructBackend_10(byte id0);
  public void ConstructBackend(byte id0)
  {
    ConstructBackend_10(id0);
  }

  public vtkConstantSignedCharArray() { super(); }

  public vtkConstantSignedCharArray(long id) { super(id); }
  public native long   VTKInit();

}
