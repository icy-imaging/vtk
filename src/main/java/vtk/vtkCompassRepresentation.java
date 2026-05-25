// java wrapper for vtkCompassRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCompassRepresentation extends vtkContinuousValueWidgetRepresentation
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

  private native long GetPoint1Coordinate_4();
  public vtkCoordinate GetPoint1Coordinate()
  {
    long temp = GetPoint1Coordinate_4();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPoint2Coordinate_5();
  public vtkCoordinate GetPoint2Coordinate()
  {
    long temp = GetPoint2Coordinate_5();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRingProperty_6();
  public vtkProperty2D GetRingProperty()
  {
    long temp = GetRingProperty_6();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedProperty_7();
  public vtkProperty2D GetSelectedProperty()
  {
    long temp = GetSelectedProperty_7();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLabelProperty_8();
  public vtkTextProperty GetLabelProperty()
  {
    long temp = GetLabelProperty_8();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void PlaceWidget_9(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_9(id0);
  }

  private native void BuildRepresentation_10();
  public void BuildRepresentation()
  {
    BuildRepresentation_10();
  }

  private native void StartWidgetInteraction_11(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_11(id0);
  }

  private native void WidgetInteraction_12(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_12(id0);
  }

  private native void TiltWidgetInteraction_13(double id0[]);
  public void TiltWidgetInteraction(double id0[])
  {
    TiltWidgetInteraction_13(id0);
  }

  private native void DistanceWidgetInteraction_14(double id0[]);
  public void DistanceWidgetInteraction(double id0[])
  {
    DistanceWidgetInteraction_14(id0);
  }

  private native int ComputeInteractionState_15(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_15(id0,id1,id2);
  }

  private native void Highlight_16(int id0);
  public void Highlight(int id0)
  {
    Highlight_16(id0);
  }

  private native void GetActors_17(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_17(id0);
  }

  private native void ReleaseGraphicsResources_18(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_18(id0);
  }

  private native int RenderOverlay_19(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_19(id0);
  }

  private native int RenderOpaqueGeometry_20(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_20(id0);
  }

  private native void SetHeading_21(double id0);
  public void SetHeading(double id0)
  {
    SetHeading_21(id0);
  }

  private native double GetHeading_22();
  public double GetHeading()
  {
    return GetHeading_22();
  }

  private native void SetTilt_23(double id0);
  public void SetTilt(double id0)
  {
    SetTilt_23(id0);
  }

  private native double GetTilt_24();
  public double GetTilt()
  {
    return GetTilt_24();
  }

  private native void SetMaximumTiltAngle_25(double id0);
  public void SetMaximumTiltAngle(double id0)
  {
    SetMaximumTiltAngle_25(id0);
  }

  private native double GetMaximumTiltAngle_26();
  public double GetMaximumTiltAngle()
  {
    return GetMaximumTiltAngle_26();
  }

  private native void SetMinimumTiltAngle_27(double id0);
  public void SetMinimumTiltAngle(double id0)
  {
    SetMinimumTiltAngle_27(id0);
  }

  private native double GetMinimumTiltAngle_28();
  public double GetMinimumTiltAngle()
  {
    return GetMinimumTiltAngle_28();
  }

  private native void UpdateTilt_29(double id0);
  public void UpdateTilt(double id0)
  {
    UpdateTilt_29(id0);
  }

  private native void EndTilt_30();
  public void EndTilt()
  {
    EndTilt_30();
  }

  private native void SetDistance_31(double id0);
  public void SetDistance(double id0)
  {
    SetDistance_31(id0);
  }

  private native double GetDistance_32();
  public double GetDistance()
  {
    return GetDistance_32();
  }

  private native void SetMaximumDistance_33(double id0);
  public void SetMaximumDistance(double id0)
  {
    SetMaximumDistance_33(id0);
  }

  private native double GetMaximumDistance_34();
  public double GetMaximumDistance()
  {
    return GetMaximumDistance_34();
  }

  private native void SetMinimumDistance_35(double id0);
  public void SetMinimumDistance(double id0)
  {
    SetMinimumDistance_35(id0);
  }

  private native double GetMinimumDistance_36();
  public double GetMinimumDistance()
  {
    return GetMinimumDistance_36();
  }

  private native void UpdateDistance_37(double id0);
  public void UpdateDistance(double id0)
  {
    UpdateDistance_37(id0);
  }

  private native void EndDistance_38();
  public void EndDistance()
  {
    EndDistance_38();
  }

  private native void SetRenderer_39(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_39(id0);
  }

  public vtkCompassRepresentation() { super(); }

  public vtkCompassRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
