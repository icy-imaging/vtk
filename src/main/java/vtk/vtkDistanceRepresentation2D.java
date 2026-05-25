// java wrapper for vtkDistanceRepresentation2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDistanceRepresentation2D extends vtkDistanceRepresentation
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

  private native double GetDistance_4();
  public double GetDistance()
  {
    return GetDistance_4();
  }

  private native void GetPoint1WorldPosition_5(double id0[]);
  public void GetPoint1WorldPosition(double id0[])
  {
    GetPoint1WorldPosition_5(id0);
  }

  private native void GetPoint2WorldPosition_6(double id0[]);
  public void GetPoint2WorldPosition(double id0[])
  {
    GetPoint2WorldPosition_6(id0);
  }

  private native void SetPoint1WorldPosition_7(double id0[]);
  public void SetPoint1WorldPosition(double id0[])
  {
    SetPoint1WorldPosition_7(id0);
  }

  private native void SetPoint2WorldPosition_8(double id0[]);
  public void SetPoint2WorldPosition(double id0[])
  {
    SetPoint2WorldPosition_8(id0);
  }

  private native void SetPoint1DisplayPosition_9(double id0[]);
  public void SetPoint1DisplayPosition(double id0[])
  {
    SetPoint1DisplayPosition_9(id0);
  }

  private native void SetPoint2DisplayPosition_10(double id0[]);
  public void SetPoint2DisplayPosition(double id0[])
  {
    SetPoint2DisplayPosition_10(id0);
  }

  private native void GetPoint1DisplayPosition_11(double id0[]);
  public void GetPoint1DisplayPosition(double id0[])
  {
    GetPoint1DisplayPosition_11(id0);
  }

  private native void GetPoint2DisplayPosition_12(double id0[]);
  public void GetPoint2DisplayPosition(double id0[])
  {
    GetPoint2DisplayPosition_12(id0);
  }

  private native long GetAxis_13();
  public vtkAxisActor2D GetAxis()
  {
    long temp = GetAxis_13();

    if (temp == 0) return null;
    return (vtkAxisActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAxisProperty_14();
  public vtkProperty2D GetAxisProperty()
  {
    long temp = GetAxisProperty_14();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildRepresentation_15();
  public void BuildRepresentation()
  {
    BuildRepresentation_15();
  }

  private native void ReleaseGraphicsResources_16(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_16(id0);
  }

  private native int RenderOverlay_17(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_17(id0);
  }

  private native int RenderOpaqueGeometry_18(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_18(id0);
  }

  public vtkDistanceRepresentation2D() { super(); }

  public vtkDistanceRepresentation2D(long id) { super(id); }
  public native long   VTKInit();

}
