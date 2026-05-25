// java wrapper for vtkLightActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLightActor extends vtkProp3D
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

  private native void SetLight_4(vtkLight id0);
  public void SetLight(vtkLight id0)
  {
    SetLight_4(id0);
  }

  private native long GetLight_5();
  public vtkLight GetLight()
  {
    long temp = GetLight_5();

    if (temp == 0) return null;
    return (vtkLight)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetClippingRange_6(double id0,double id1);
  public void SetClippingRange(double id0,double id1)
  {
    SetClippingRange_6(id0,id1);
  }

  private native void SetClippingRange_7(double id0[]);
  public void SetClippingRange(double id0[])
  {
    SetClippingRange_7(id0);
  }

  private native double[] GetClippingRange_8();
  public double[] GetClippingRange()
  {
    return GetClippingRange_8();
  }

  private native long GetConeProperty_9();
  public vtkProperty GetConeProperty()
  {
    long temp = GetConeProperty_9();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFrustumProperty_10();
  public vtkProperty GetFrustumProperty()
  {
    long temp = GetFrustumProperty_10();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int RenderOpaqueGeometry_11(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_11(id0);
  }

  private native int HasTranslucentPolygonalGeometry_12();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_12();
  }

  private native void ReleaseGraphicsResources_13(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_13(id0);
  }

  private native long GetMTime_14();
  public long GetMTime()
  {
    return GetMTime_14();
  }

  public vtkLightActor() { super(); }

  public vtkLightActor(long id) { super(id); }
  public native long   VTKInit();

}
