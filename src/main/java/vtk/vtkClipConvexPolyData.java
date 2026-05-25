// java wrapper for vtkClipConvexPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkClipConvexPolyData extends vtkPolyDataAlgorithm
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

  private native void SetPlanes_4(vtkPlaneCollection id0);
  public void SetPlanes(vtkPlaneCollection id0)
  {
    SetPlanes_4(id0);
  }

  private native long GetPlanes_5();
  public vtkPlaneCollection GetPlanes()
  {
    long temp = GetPlanes_5();

    if (temp == 0) return null;
    return (vtkPlaneCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_6();
  public long GetMTime()
  {
    return GetMTime_6();
  }

  public vtkClipConvexPolyData() { super(); }

  public vtkClipConvexPolyData(long id) { super(id); }
  public native long   VTKInit();

}
