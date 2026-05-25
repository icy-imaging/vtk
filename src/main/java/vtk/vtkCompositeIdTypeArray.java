// java wrapper for vtkCompositeIdTypeArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCompositeIdTypeArray extends vtkDataArray
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
  public vtkCompositeIdTypeArray ExtendedNew()
  {
    long temp = ExtendedNew_4();

    if (temp == 0) return null;
    return (vtkCompositeIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native long[]  GetValueRange_7(int id0);
  public long[]  GetValueRange(int id0)
  {
    return GetValueRange_7(id0);
  }

  private native long[]  GetValueRange_8();
  public long[]  GetValueRange()
  {
    return GetValueRange_8();
  }

  private native long FastDownCast_9(vtkAbstractArray id0);
  public vtkCompositeIdTypeArray FastDownCast(vtkAbstractArray id0)
  {
    long temp = FastDownCast_9(id0);

    if (temp == 0) return null;
    return (vtkCompositeIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ConstructBackend_10(vtkDataArrayCollection id0);
  public void ConstructBackend(vtkDataArrayCollection id0)
  {
    ConstructBackend_10(id0);
  }

  public vtkCompositeIdTypeArray() { super(); }

  public vtkCompositeIdTypeArray(long id) { super(id); }
  public native long   VTKInit();

}
