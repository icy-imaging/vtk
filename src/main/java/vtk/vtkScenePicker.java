// java wrapper for vtkScenePicker object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkScenePicker extends vtkObject
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

  private native void SetRenderer_4(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_4(id0);
  }

  private native long GetRenderer_5();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_5();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellId_6(int id0[]);
  public long GetCellId(int id0[])
  {
    return GetCellId_6(id0);
  }

  private native long GetVertexId_7(int id0[]);
  public long GetVertexId(int id0[])
  {
    return GetVertexId_7(id0);
  }

  private native long GetViewProp_8(int id0[]);
  public vtkProp GetViewProp(int id0[])
  {
    long temp = GetViewProp_8(id0);

    if (temp == 0) return null;
    return (vtkProp)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetEnableVertexPicking_9(int id0);
  public void SetEnableVertexPicking(int id0)
  {
    SetEnableVertexPicking_9(id0);
  }

  private native int GetEnableVertexPicking_10();
  public int GetEnableVertexPicking()
  {
    return GetEnableVertexPicking_10();
  }

  private native void EnableVertexPickingOn_11();
  public void EnableVertexPickingOn()
  {
    EnableVertexPickingOn_11();
  }

  private native void EnableVertexPickingOff_12();
  public void EnableVertexPickingOff()
  {
    EnableVertexPickingOff_12();
  }

  public vtkScenePicker() { super(); }

  public vtkScenePicker(long id) { super(id); }
  public native long   VTKInit();

}
