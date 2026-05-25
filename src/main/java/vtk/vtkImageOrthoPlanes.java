// java wrapper for vtkImageOrthoPlanes object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageOrthoPlanes extends vtkObject
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

  private native void SetPlane_4(int id0,vtkImagePlaneWidget id1);
  public void SetPlane(int id0,vtkImagePlaneWidget id1)
  {
    SetPlane_4(id0,id1);
  }

  private native long GetPlane_5(int id0);
  public vtkImagePlaneWidget GetPlane(int id0)
  {
    long temp = GetPlane_5(id0);

    if (temp == 0) return null;
    return (vtkImagePlaneWidget)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ResetPlanes_6();
  public void ResetPlanes()
  {
    ResetPlanes_6();
  }

  private native long GetTransform_7();
  public vtkTransform GetTransform()
  {
    long temp = GetTransform_7();

    if (temp == 0) return null;
    return (vtkTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void HandlePlaneEvent_8(vtkImagePlaneWidget id0);
  public void HandlePlaneEvent(vtkImagePlaneWidget id0)
  {
    HandlePlaneEvent_8(id0);
  }

  public vtkImageOrthoPlanes() { super(); }

  public vtkImageOrthoPlanes(long id) { super(id); }
  public native long   VTKInit();

}
