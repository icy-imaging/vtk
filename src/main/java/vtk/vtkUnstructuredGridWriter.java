// java wrapper for vtkUnstructuredGridWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUnstructuredGridWriter extends vtkDataWriter
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

  private native long GetInput_4();
  public vtkUnstructuredGridBase GetInput()
  {
    long temp = GetInput_4();

    if (temp == 0) return null;
    return (vtkUnstructuredGridBase)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_5(int id0);
  public vtkUnstructuredGridBase GetInput(int id0)
  {
    long temp = GetInput_5(id0);

    if (temp == 0) return null;
    return (vtkUnstructuredGridBase)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkUnstructuredGridWriter() { super(); }

  public vtkUnstructuredGridWriter(long id) { super(id); }
  public native long   VTKInit();

}
