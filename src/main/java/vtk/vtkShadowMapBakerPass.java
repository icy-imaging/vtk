// java wrapper for vtkShadowMapBakerPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkShadowMapBakerPass extends vtkOpenGLRenderPass
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

  private native long GetOpaqueSequence_5();
  public vtkRenderPass GetOpaqueSequence()
  {
    long temp = GetOpaqueSequence_5();

    if (temp == 0) return null;
    return (vtkRenderPass)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOpaqueSequence_6(vtkRenderPass id0);
  public void SetOpaqueSequence(vtkRenderPass id0)
  {
    SetOpaqueSequence_6(id0);
  }

  private native long GetCompositeZPass_7();
  public vtkRenderPass GetCompositeZPass()
  {
    long temp = GetCompositeZPass_7();

    if (temp == 0) return null;
    return (vtkRenderPass)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCompositeZPass_8(vtkRenderPass id0);
  public void SetCompositeZPass(vtkRenderPass id0)
  {
    SetCompositeZPass_8(id0);
  }

  private native void SetResolution_9(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_9(id0);
  }

  private native int GetResolution_10();
  public int GetResolution()
  {
    return GetResolution_10();
  }

  private native void SetExponentialConstant_11(float id0);
  public void SetExponentialConstant(float id0)
  {
    SetExponentialConstant_11(id0);
  }

  private native float GetExponentialConstant_12();
  public float GetExponentialConstant()
  {
    return GetExponentialConstant_12();
  }

  private native boolean GetHasShadows_13();
  public boolean GetHasShadows()
  {
    return GetHasShadows_13();
  }

  private native boolean LightCreatesShadow_14(vtkLight id0);
  public boolean LightCreatesShadow(vtkLight id0)
  {
    return LightCreatesShadow_14(id0);
  }

  private native boolean GetNeedUpdate_15();
  public boolean GetNeedUpdate()
  {
    return GetNeedUpdate_15();
  }

  private native void SetUpToDate_16();
  public void SetUpToDate()
  {
    SetUpToDate_16();
  }

  public vtkShadowMapBakerPass() { super(); }

  public vtkShadowMapBakerPass(long id) { super(id); }
  public native long   VTKInit();

}
