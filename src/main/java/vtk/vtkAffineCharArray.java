// java wrapper for vtkAffineCharArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAffineCharArray extends vtkDataArray
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
  public vtkAffineCharArray ExtendedNew()
  {
    long temp = ExtendedNew_4();

    if (temp == 0) return null;
    return (vtkAffineCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native long FastDownCast_10(vtkAbstractArray id0);
  public vtkAffineCharArray FastDownCast(vtkAbstractArray id0)
  {
    long temp = FastDownCast_10(id0);

    if (temp == 0) return null;
    return (vtkAffineCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ConstructBackend_11(char id0,char id1);
  public void ConstructBackend(char id0,char id1)
  {
    ConstructBackend_11(id0,id1);
  }

  public vtkAffineCharArray() { super(); }

  public vtkAffineCharArray(long id) { super(id); }
  public native long   VTKInit();

}
