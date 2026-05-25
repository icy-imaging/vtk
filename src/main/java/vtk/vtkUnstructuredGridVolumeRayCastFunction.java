// java wrapper for vtkUnstructuredGridVolumeRayCastFunction object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUnstructuredGridVolumeRayCastFunction extends vtkObject
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

  private native void Initialize_4(vtkRenderer id0,vtkVolume id1);
  public void Initialize(vtkRenderer id0,vtkVolume id1)
  {
    Initialize_4(id0,id1);
  }

  private native void Finalize_5();
  public void Finalize()
  {
    Finalize_5();
  }

  private native long NewIterator_6();
  public vtkUnstructuredGridVolumeRayCastIterator NewIterator()
  {
    long temp = NewIterator_6();

    if (temp == 0) return null;
    return (vtkUnstructuredGridVolumeRayCastIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkUnstructuredGridVolumeRayCastFunction() { super(); }

  public vtkUnstructuredGridVolumeRayCastFunction(long id) { super(id); }

}
