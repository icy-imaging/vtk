// java wrapper for vtkAffineUnsignedShortArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAffineUnsignedShortArray extends vtkDataArray
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
  public vtkAffineUnsignedShortArray ExtendedNew()
  {
    long temp = ExtendedNew_4();

    if (temp == 0) return null;
    return (vtkAffineUnsignedShortArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDataType_5();
  public int GetDataType()
  {
    return GetDataType_5();
  }

  private native short GetValue_6(long id0);
  public short GetValue(long id0)
  {
    return GetValue_6(id0);
  }

  private native long FastDownCast_7(vtkAbstractArray id0);
  public vtkAffineUnsignedShortArray FastDownCast(vtkAbstractArray id0)
  {
    long temp = FastDownCast_7(id0);

    if (temp == 0) return null;
    return (vtkAffineUnsignedShortArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ConstructBackend_8(short id0,short id1);
  public void ConstructBackend(short id0,short id1)
  {
    ConstructBackend_8(id0,id1);
  }

  public vtkAffineUnsignedShortArray() { super(); }

  public vtkAffineUnsignedShortArray(long id) { super(id); }
  public native long   VTKInit();

}
