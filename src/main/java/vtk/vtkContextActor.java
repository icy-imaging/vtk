// java wrapper for vtkContextActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContextActor extends vtkProp
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

  private native int RenderOverlay_4(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_4(id0);
  }

  private native long GetContext_5();
  public vtkContext2D GetContext()
  {
    long temp = GetContext_5();

    if (temp == 0) return null;
    return (vtkContext2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetScene_6();
  public vtkContextScene GetScene()
  {
    long temp = GetScene_6();

    if (temp == 0) return null;
    return (vtkContextScene)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScene_7(vtkContextScene id0);
  public void SetScene(vtkContextScene id0)
  {
    SetScene_7(id0);
  }

  private native void SetForceDevice_8(vtkContextDevice2D id0);
  public void SetForceDevice(vtkContextDevice2D id0)
  {
    SetForceDevice_8(id0);
  }

  private native long GetForceDevice_9();
  public vtkContextDevice2D GetForceDevice()
  {
    long temp = GetForceDevice_9();

    if (temp == 0) return null;
    return (vtkContextDevice2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ReleaseGraphicsResources_10(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_10(id0);
  }

  public vtkContextActor() { super(); }

  public vtkContextActor(long id) { super(id); }
  public native long   VTKInit();

}
