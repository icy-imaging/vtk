// java wrapper for vtkOpenGLCellGridMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLCellGridMapper extends vtkCellGridMapper
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

  private native void ReleaseGraphicsResources_5(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_5(id0);
  }

  private native boolean GetSupportsSelection_6();
  public boolean GetSupportsSelection()
  {
    return GetSupportsSelection_6();
  }

  private native void ShallowCopy_7(vtkAbstractMapper id0);
  public void ShallowCopy(vtkAbstractMapper id0)
  {
    ShallowCopy_7(id0);
  }

  public vtkOpenGLCellGridMapper() { super(); }

  public vtkOpenGLCellGridMapper(long id) { super(id); }
  public native long   VTKInit();

}
