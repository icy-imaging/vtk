// java wrapper for vtkAbstractInteractionDevice object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractInteractionDevice extends vtkObject
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

  private native void Initialize_4();
  public void Initialize()
  {
    Initialize_4();
  }

  private native void Start_5();
  public void Start()
  {
    Start_5();
  }

  private native void ProcessEvents_6();
  public void ProcessEvents()
  {
    ProcessEvents_6();
  }

  private native void SetRenderWidget_7(vtkRenderWidget id0);
  public void SetRenderWidget(vtkRenderWidget id0)
  {
    SetRenderWidget_7(id0);
  }

  private native long GetRenderWidget_8();
  public vtkRenderWidget GetRenderWidget()
  {
    long temp = GetRenderWidget_8();

    if (temp == 0) return null;
    return (vtkRenderWidget)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRenderDevice_9(vtkAbstractRenderDevice id0);
  public void SetRenderDevice(vtkAbstractRenderDevice id0)
  {
    SetRenderDevice_9(id0);
  }

  private native long GetRenderDevice_10();
  public vtkAbstractRenderDevice GetRenderDevice()
  {
    long temp = GetRenderDevice_10();

    if (temp == 0) return null;
    return (vtkAbstractRenderDevice)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkAbstractInteractionDevice() { super(); }

  public vtkAbstractInteractionDevice(long id) { super(id); }
  public native long   VTKInit();

}
