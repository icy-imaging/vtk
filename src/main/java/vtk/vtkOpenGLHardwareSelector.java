// java wrapper for vtkOpenGLHardwareSelector object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLHardwareSelector extends vtkHardwareSelector
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

  private native void BeginRenderProp_4();
  public void BeginRenderProp()
  {
    BeginRenderProp_4();
  }

  private native void EndRenderProp_5();
  public void EndRenderProp()
  {
    EndRenderProp_5();
  }

  private native void RenderCompositeIndex_6(int id0);
  public void RenderCompositeIndex(int id0)
  {
    RenderCompositeIndex_6(id0);
  }

  private native void RenderProcessId_7(int id0);
  public void RenderProcessId(int id0)
  {
    RenderProcessId_7(id0);
  }

  private native void BeginSelection_8();
  public void BeginSelection()
  {
    BeginSelection_8();
  }

  private native void EndSelection_9();
  public void EndSelection()
  {
    EndSelection_9();
  }

  public vtkOpenGLHardwareSelector() { super(); }

  public vtkOpenGLHardwareSelector(long id) { super(id); }
  public native long   VTKInit();

}
