// java wrapper for vtkRenderViewBase object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRenderViewBase extends vtkView
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

  private native long GetRenderer_4();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_4();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRenderer_5(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_5(id0);
  }

  private native long GetRenderWindow_6();
  public vtkRenderWindow GetRenderWindow()
  {
    long temp = GetRenderWindow_6();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRenderWindow_7(vtkRenderWindow id0);
  public void SetRenderWindow(vtkRenderWindow id0)
  {
    SetRenderWindow_7(id0);
  }

  private native long GetInteractor_8();
  public vtkRenderWindowInteractor GetInteractor()
  {
    long temp = GetInteractor_8();

    if (temp == 0) return null;
    return (vtkRenderWindowInteractor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInteractor_9(vtkRenderWindowInteractor id0);
  public void SetInteractor(vtkRenderWindowInteractor id0)
  {
    SetInteractor_9(id0);
  }

  private native void Render_10();
  public void Render()
  {
    Render_10();
  }

  private native void ResetCamera_11();
  public void ResetCamera()
  {
    ResetCamera_11();
  }

  private native void ResetCameraClippingRange_12();
  public void ResetCameraClippingRange()
  {
    ResetCameraClippingRange_12();
  }

  public vtkRenderViewBase() { super(); }

  public vtkRenderViewBase(long id) { super(id); }
  public native long   VTKInit();

}
