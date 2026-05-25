// java wrapper for vtkAngleRepresentation2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAngleRepresentation2D extends vtkAngleRepresentation
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

  private native void SetPoint1DisplayPosition_8(double id0[]);
  public void SetPoint1DisplayPosition(double id0[])
  {
    SetPoint1DisplayPosition_8(id0);
  }

  private native void SetPoint1WorldPosition_9(double id0[]);
  public void SetPoint1WorldPosition(double id0[])
  {
    SetPoint1WorldPosition_9(id0);
  }

  private native void SetCenterDisplayPosition_10(double id0[]);
  public void SetCenterDisplayPosition(double id0[])
  {
    SetCenterDisplayPosition_10(id0);
  }

  private native void SetCenterWorldPosition_11(double id0[]);
  public void SetCenterWorldPosition(double id0[])
  {
    SetCenterWorldPosition_11(id0);
  }

  private native void SetPoint2DisplayPosition_12(double id0[]);
  public void SetPoint2DisplayPosition(double id0[])
  {
    SetPoint2DisplayPosition_12(id0);
  }

  private native void SetPoint2WorldPosition_13(double id0[]);
  public void SetPoint2WorldPosition(double id0[])
  {
    SetPoint2WorldPosition_13(id0);
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
  public vtkLeaderActor2D GetRay1()
  {
    long temp = GetRay1_17();

    if (temp == 0) return null;
    return (vtkLeaderActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRay2_18();
  public vtkLeaderActor2D GetRay2()
  {
    long temp = GetRay2_18();

    if (temp == 0) return null;
    return (vtkLeaderActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetArc_19();
  public vtkLeaderActor2D GetArc()
  {
    long temp = GetArc_19();

    if (temp == 0) return null;
    return (vtkLeaderActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetForce3DArcPlacement_20(boolean id0);
  public void SetForce3DArcPlacement(boolean id0)
  {
    SetForce3DArcPlacement_20(id0);
  }

  private native boolean GetForce3DArcPlacement_21();
  public boolean GetForce3DArcPlacement()
  {
    return GetForce3DArcPlacement_21();
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

  private native int RenderOverlay_24(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_24(id0);
  }

  public vtkAngleRepresentation2D() { super(); }

  public vtkAngleRepresentation2D(long id) { super(id); }
  public native long   VTKInit();

}
