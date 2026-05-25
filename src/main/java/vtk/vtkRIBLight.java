// java wrapper for vtkRIBLight object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRIBLight extends vtkLight
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

  private native void ShadowsOn_4();
  public void ShadowsOn()
  {
    ShadowsOn_4();
  }

  private native void ShadowsOff_5();
  public void ShadowsOff()
  {
    ShadowsOff_5();
  }

  private native void SetShadows_6(int id0);
  public void SetShadows(int id0)
  {
    SetShadows_6(id0);
  }

  private native int GetShadows_7();
  public int GetShadows()
  {
    return GetShadows_7();
  }

  private native void Render_8(vtkRenderer id0,int id1);
  public void Render(vtkRenderer id0,int id1)
  {
    Render_8(id0,id1);
  }

  public vtkRIBLight() { super(); }

  public vtkRIBLight(long id) { super(id); }
  public native long   VTKInit();

}
