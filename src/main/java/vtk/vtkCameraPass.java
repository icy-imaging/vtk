// java wrapper for vtkCameraPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCameraPass extends vtkRenderPass
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

  private native void ReleaseGraphicsResources_4(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_4(id0);
  }

  private native long GetDelegatePass_5();
  public vtkRenderPass GetDelegatePass()
  {
    long temp = GetDelegatePass_5();

    if (temp == 0) return null;
    return (vtkRenderPass)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDelegatePass_6(vtkRenderPass id0);
  public void SetDelegatePass(vtkRenderPass id0)
  {
    SetDelegatePass_6(id0);
  }

  private native void SetAspectRatioOverride_7(double id0);
  public void SetAspectRatioOverride(double id0)
  {
    SetAspectRatioOverride_7(id0);
  }

  private native double GetAspectRatioOverride_8();
  public double GetAspectRatioOverride()
  {
    return GetAspectRatioOverride_8();
  }

  public vtkCameraPass() { super(); }

  public vtkCameraPass(long id) { super(id); }
  public native long   VTKInit();

}
