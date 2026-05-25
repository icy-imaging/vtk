// java wrapper for vtkRenderWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRenderWidget extends vtkObject
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

  private native void SetName_4(byte[] id0, int len0);
  public void SetName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetName_4(bytes0, bytes0.length);
  }

  private native byte[] GetName_5();
  public String GetName()
  {
    return new String(GetName_5(), StandardCharsets.UTF_8);
  }

  private native void Render_6();
  public void Render()
  {
    Render_6();
  }

  private native void MakeCurrent_7();
  public void MakeCurrent()
  {
    MakeCurrent_7();
  }

  private native void Initialize_8();
  public void Initialize()
  {
    Initialize_8();
  }

  private native void Start_9();
  public void Start()
  {
    Start_9();
  }

  public vtkRenderWidget() { super(); }

  public vtkRenderWidget(long id) { super(id); }
  public native long   VTKInit();

}
