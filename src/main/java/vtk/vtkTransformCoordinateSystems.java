// java wrapper for vtkTransformCoordinateSystems object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTransformCoordinateSystems extends vtkPointSetAlgorithm
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

  private native void SetInputCoordinateSystem_4(int id0);
  public void SetInputCoordinateSystem(int id0)
  {
    SetInputCoordinateSystem_4(id0);
  }

  private native int GetInputCoordinateSystem_5();
  public int GetInputCoordinateSystem()
  {
    return GetInputCoordinateSystem_5();
  }

  private native void SetInputCoordinateSystemToDisplay_6();
  public void SetInputCoordinateSystemToDisplay()
  {
    SetInputCoordinateSystemToDisplay_6();
  }

  private native void SetInputCoordinateSystemToViewport_7();
  public void SetInputCoordinateSystemToViewport()
  {
    SetInputCoordinateSystemToViewport_7();
  }

  private native void SetInputCoordinateSystemToWorld_8();
  public void SetInputCoordinateSystemToWorld()
  {
    SetInputCoordinateSystemToWorld_8();
  }

  private native void SetOutputCoordinateSystem_9(int id0);
  public void SetOutputCoordinateSystem(int id0)
  {
    SetOutputCoordinateSystem_9(id0);
  }

  private native int GetOutputCoordinateSystem_10();
  public int GetOutputCoordinateSystem()
  {
    return GetOutputCoordinateSystem_10();
  }

  private native void SetOutputCoordinateSystemToDisplay_11();
  public void SetOutputCoordinateSystemToDisplay()
  {
    SetOutputCoordinateSystemToDisplay_11();
  }

  private native void SetOutputCoordinateSystemToViewport_12();
  public void SetOutputCoordinateSystemToViewport()
  {
    SetOutputCoordinateSystemToViewport_12();
  }

  private native void SetOutputCoordinateSystemToWorld_13();
  public void SetOutputCoordinateSystemToWorld()
  {
    SetOutputCoordinateSystemToWorld_13();
  }

  private native long GetMTime_14();
  public long GetMTime()
  {
    return GetMTime_14();
  }

  private native void SetViewport_15(vtkViewport id0);
  public void SetViewport(vtkViewport id0)
  {
    SetViewport_15(id0);
  }

  private native long GetViewport_16();
  public vtkViewport GetViewport()
  {
    long temp = GetViewport_16();

    if (temp == 0) return null;
    return (vtkViewport)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkTransformCoordinateSystems() { super(); }

  public vtkTransformCoordinateSystems(long id) { super(id); }
  public native long   VTKInit();

}
