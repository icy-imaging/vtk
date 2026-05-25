// java wrapper for vtkRenderStepsPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRenderStepsPass extends vtkRenderPass
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

  private native long GetCameraPass_5();
  public vtkCameraPass GetCameraPass()
  {
    long temp = GetCameraPass_5();

    if (temp == 0) return null;
    return (vtkCameraPass)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCameraPass_6(vtkCameraPass id0);
  public void SetCameraPass(vtkCameraPass id0)
  {
    SetCameraPass_6(id0);
  }

  private native long GetLightsPass_7();
  public vtkRenderPass GetLightsPass()
  {
    long temp = GetLightsPass_7();

    if (temp == 0) return null;
    return (vtkRenderPass)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLightsPass_8(vtkRenderPass id0);
  public void SetLightsPass(vtkRenderPass id0)
  {
    SetLightsPass_8(id0);
  }

  private native long GetOpaquePass_9();
  public vtkRenderPass GetOpaquePass()
  {
    long temp = GetOpaquePass_9();

    if (temp == 0) return null;
    return (vtkRenderPass)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOpaquePass_10(vtkRenderPass id0);
  public void SetOpaquePass(vtkRenderPass id0)
  {
    SetOpaquePass_10(id0);
  }

  private native long GetTranslucentPass_11();
  public vtkRenderPass GetTranslucentPass()
  {
    long temp = GetTranslucentPass_11();

    if (temp == 0) return null;
    return (vtkRenderPass)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTranslucentPass_12(vtkRenderPass id0);
  public void SetTranslucentPass(vtkRenderPass id0)
  {
    SetTranslucentPass_12(id0);
  }

  private native long GetVolumetricPass_13();
  public vtkRenderPass GetVolumetricPass()
  {
    long temp = GetVolumetricPass_13();

    if (temp == 0) return null;
    return (vtkRenderPass)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetVolumetricPass_14(vtkRenderPass id0);
  public void SetVolumetricPass(vtkRenderPass id0)
  {
    SetVolumetricPass_14(id0);
  }

  private native long GetOverlayPass_15();
  public vtkRenderPass GetOverlayPass()
  {
    long temp = GetOverlayPass_15();

    if (temp == 0) return null;
    return (vtkRenderPass)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOverlayPass_16(vtkRenderPass id0);
  public void SetOverlayPass(vtkRenderPass id0)
  {
    SetOverlayPass_16(id0);
  }

  private native long GetPostProcessPass_17();
  public vtkRenderPass GetPostProcessPass()
  {
    long temp = GetPostProcessPass_17();

    if (temp == 0) return null;
    return (vtkRenderPass)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPostProcessPass_18(vtkRenderPass id0);
  public void SetPostProcessPass(vtkRenderPass id0)
  {
    SetPostProcessPass_18(id0);
  }

  public vtkRenderStepsPass() { super(); }

  public vtkRenderStepsPass(long id) { super(id); }
  public native long   VTKInit();

}
