// java wrapper for vtkContextView object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContextView extends vtkRenderViewBase
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

  private native void SetContext_4(vtkContext2D id0);
  public void SetContext(vtkContext2D id0)
  {
    SetContext_4(id0);
  }

  private native long GetContext_5();
  public vtkContext2D GetContext()
  {
    long temp = GetContext_5();

    if (temp == 0) return null;
    return (vtkContext2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScene_6(vtkContextScene id0);
  public void SetScene(vtkContextScene id0)
  {
    SetScene_6(id0);
  }

  private native long GetScene_7();
  public vtkContextScene GetScene()
  {
    long temp = GetScene_7();

    if (temp == 0) return null;
    return (vtkContextScene)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkContextView() { super(); }

  public vtkContextView(long id) { super(id); }
  public native long   VTKInit();

}
