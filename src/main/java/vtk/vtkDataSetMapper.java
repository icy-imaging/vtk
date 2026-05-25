// java wrapper for vtkDataSetMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataSetMapper extends vtkMapper
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

  private native void Render_4(vtkRenderer id0,vtkActor id1);
  public void Render(vtkRenderer id0,vtkActor id1)
  {
    Render_4(id0,id1);
  }

  private native long GetPolyDataMapper_5();
  public vtkPolyDataMapper GetPolyDataMapper()
  {
    long temp = GetPolyDataMapper_5();

    if (temp == 0) return null;
    return (vtkPolyDataMapper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ReleaseGraphicsResources_6(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_6(id0);
  }

  private native long GetMTime_7();
  public long GetMTime()
  {
    return GetMTime_7();
  }

  private native void SetInputData_8(vtkDataSet id0);
  public void SetInputData(vtkDataSet id0)
  {
    SetInputData_8(id0);
  }

  private native long GetInput_9();
  public vtkDataSet GetInput()
  {
    long temp = GetInput_9();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkDataSetMapper() { super(); }

  public vtkDataSetMapper(long id) { super(id); }
  public native long   VTKInit();

}
