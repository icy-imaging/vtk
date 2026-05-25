// java wrapper for vtkRendererDelegate object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRendererDelegate extends vtkObject
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

  private native void Render_4(vtkRenderer id0);
  public void Render(vtkRenderer id0)
  {
    Render_4(id0);
  }

  private native void SetUsed_5(boolean id0);
  public void SetUsed(boolean id0)
  {
    SetUsed_5(id0);
  }

  private native boolean GetUsed_6();
  public boolean GetUsed()
  {
    return GetUsed_6();
  }

  private native void UsedOn_7();
  public void UsedOn()
  {
    UsedOn_7();
  }

  private native void UsedOff_8();
  public void UsedOff()
  {
    UsedOff_8();
  }

  public vtkRendererDelegate() { super(); }

  public vtkRendererDelegate(long id) { super(id); }

}
