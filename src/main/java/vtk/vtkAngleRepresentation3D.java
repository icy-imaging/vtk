// java wrapper for vtkAngleRepresentation3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAngleRepresentation3D extends vtkAngleRepresentation
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

  private native double GetAngle_4();
  public double GetAngle()
  {
    return GetAngle_4();
  }

  private native void GetPoint1WorldPosition_5(double id0[]);
  public void GetPoint1WorldPosition(double id0[])
  {
    GetPoint1WorldPosition_5(id0);
  }

  private native void GetCenterWorldPosition_6(double id0[]);
  public void GetCenterWorldPosition(double id0[])
  {
    GetCenterWorldPosition_6(id0);
  }

  private native void GetPoint2WorldPosition_7(double id0[]);
  public void GetPoint2WorldPosition(double id0[])
  {
    GetPoint2WorldPosition_7(id0);
  }

  private native void SetPoint1WorldPosition_8(double id0[]);
  public void SetPoint1WorldPosition(double id0[])
  {
    SetPoint1WorldPosition_8(id0);
  }

  private native void SetPoint1DisplayPosition_9(double id0[]);
  public void SetPoint1DisplayPosition(double id0[])
  {
    SetPoint1DisplayPosition_9(id0);
  }

  private native void SetCenterWorldPosition_10(double id0[]);
  public void SetCenterWorldPosition(double id0[])
  {
    SetCenterWorldPosition_10(id0);
  }

  private native void SetCenterDisplayPosition_11(double id0[]);
  public void SetCenterDisplayPosition(double id0[])
  {
    SetCenterDisplayPosition_11(id0);
  }

  private native void SetPoint2WorldPosition_12(double id0[]);
  public void SetPoint2WorldPosition(double id0[])
  {
    SetPoint2WorldPosition_12(id0);
  }

  private native void SetPoint2DisplayPosition_13(double id0[]);
  public void SetPoint2DisplayPosition(double id0[])
  {
    SetPoint2DisplayPosition_13(id0);
  }

  private native void GetPoint1DisplayPosition_14(double id0[]);
  public void GetPoint1DisplayPosition(double id0[])
  {
    GetPoint1DisplayPosition_14(id0);
  }

  private native void GetCenterDisplayPosition_15(double id0[]);
  public void GetCenterDisplayPosition(double id0[])
  {
    GetCenterDisplayPosition_15(id0);
  }

  private native void GetPoint2DisplayPosition_16(double id0[]);
  public void GetPoint2DisplayPosition(double id0[])
  {
    GetPoint2DisplayPosition_16(id0);
  }

  private native long GetRay1_17();
  public vtkActor GetRay1()
  {
    long temp = GetRay1_17();

    if (temp == 0) return null;
    return (vtkActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRay2_18();
  public vtkActor GetRay2()
  {
    long temp = GetRay2_18();

    if (temp == 0) return null;
    return (vtkActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetArc_19();
  public vtkActor GetArc()
  {
    long temp = GetArc_19();

    if (temp == 0) return null;
    return (vtkActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTextActor_20();
  public vtkFollower GetTextActor()
  {
    long temp = GetTextActor_20();

    if (temp == 0) return null;
    return (vtkFollower)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTextActorScale_21(double id0[]);
  public void SetTextActorScale(double id0[])
  {
    SetTextActorScale_21(id0);
  }

  private native void BuildRepresentation_22();
  public void BuildRepresentation()
  {
    BuildRepresentation_22();
  }

  private native void ReleaseGraphicsResources_23(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_23(id0);
  }

  private native int RenderOpaqueGeometry_24(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_24(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_25(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_25(id0);
  }

  private native int HasTranslucentPolygonalGeometry_26();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_26();
  }

  public vtkAngleRepresentation3D() { super(); }

  public vtkAngleRepresentation3D(long id) { super(id); }
  public native long   VTKInit();

}
