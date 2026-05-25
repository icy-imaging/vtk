// java wrapper for vtkTypeFloat32Array object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTypeFloat32Array extends vtkFloatArray
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

  private native long FastDownCast_4(vtkAbstractArray id0);
  public vtkTypeFloat32Array FastDownCast(vtkAbstractArray id0)
  {
    long temp = FastDownCast_4(id0);

    if (temp == 0) return null;
    return (vtkTypeFloat32Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkTypeFloat32Array() { super(); }

  public vtkTypeFloat32Array(long id) { super(id); }
  public native long   VTKInit();

}
