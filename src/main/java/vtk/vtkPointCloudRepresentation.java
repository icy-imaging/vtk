// java wrapper for vtkPointCloudRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointCloudRepresentation extends vtkWidgetRepresentation
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

  private native void PlacePointCloud_4(vtkActor id0);
  public void PlacePointCloud(vtkActor id0)
  {
    PlacePointCloud_4(id0);
  }

  private native void PlacePointCloud_5(vtkPointSet id0);
  public void PlacePointCloud(vtkPointSet id0)
  {
    PlacePointCloud_5(id0);
  }

  private native long GetPointCloudActor_6();
  public vtkActor GetPointCloudActor()
  {
    long temp = GetPointCloudActor_6();

    if (temp == 0) return null;
    return (vtkActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPointCloudMapper_7();
  public vtkPolyDataMapper GetPointCloudMapper()
  {
    long temp = GetPointCloudMapper_7();

    if (temp == 0) return null;
    return (vtkPolyDataMapper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPointId_8();
  public long GetPointId()
  {
    return GetPointId_8();
  }

  private native void GetPointCoordinates_9(double id0[]);
  public void GetPointCoordinates(double id0[])
  {
    GetPointCoordinates_9(id0);
  }

  private native void SetHighlighting_10(boolean id0);
  public void SetHighlighting(boolean id0)
  {
    SetHighlighting_10(id0);
  }

  private native boolean GetHighlighting_11();
  public boolean GetHighlighting()
  {
    return GetHighlighting_11();
  }

  private native void HighlightingOn_12();
  public void HighlightingOn()
  {
    HighlightingOn_12();
  }

  private native void HighlightingOff_13();
  public void HighlightingOff()
  {
    HighlightingOff_13();
  }

  private native void SetInteractionState_14(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_14(id0);
  }

  private native int GetInteractionStateMinValue_15();
  public int GetInteractionStateMinValue()
  {
    return GetInteractionStateMinValue_15();
  }

  private native int GetInteractionStateMaxValue_16();
  public int GetInteractionStateMaxValue()
  {
    return GetInteractionStateMaxValue_16();
  }

  private native double[] GetBounds_17();
  public double[] GetBounds()
  {
    return GetBounds_17();
  }

  private native void BuildRepresentation_18();
  public void BuildRepresentation()
  {
    BuildRepresentation_18();
  }

  private native int ComputeInteractionState_19(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_19(id0,id1,id2);
  }

  private native void GetActors_20(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_20(id0);
  }

  private native void GetActors2D_21(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_21(id0);
  }

  private native int RenderOpaqueGeometry_22(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_22(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_23(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_23(id0);
  }

  private native int HasTranslucentPolygonalGeometry_24();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_24();
  }

  private native void ReleaseGraphicsResources_25(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_25(id0);
  }

  private native int RenderOverlay_26(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_26(id0);
  }

  private native void SetPickingMode_27(int id0);
  public void SetPickingMode(int id0)
  {
    SetPickingMode_27(id0);
  }

  private native int GetPickingModeMinValue_28();
  public int GetPickingModeMinValue()
  {
    return GetPickingModeMinValue_28();
  }

  private native int GetPickingModeMaxValue_29();
  public int GetPickingModeMaxValue()
  {
    return GetPickingModeMaxValue_29();
  }

  private native int GetPickingMode_30();
  public int GetPickingMode()
  {
    return GetPickingMode_30();
  }

  private native void SetPickingModeToHardware_31();
  public void SetPickingModeToHardware()
  {
    SetPickingModeToHardware_31();
  }

  private native void SetPickingModeToSoftware_32();
  public void SetPickingModeToSoftware()
  {
    SetPickingModeToSoftware_32();
  }

  private native void SetHardwarePickingTolerance_33(int id0);
  public void SetHardwarePickingTolerance(int id0)
  {
    SetHardwarePickingTolerance_33(id0);
  }

  private native int GetHardwarePickingTolerance_34();
  public int GetHardwarePickingTolerance()
  {
    return GetHardwarePickingTolerance_34();
  }

  private native void SetSoftwarePickingTolerance_35(double id0);
  public void SetSoftwarePickingTolerance(double id0)
  {
    SetSoftwarePickingTolerance_35(id0);
  }

  private native double GetSoftwarePickingToleranceMinValue_36();
  public double GetSoftwarePickingToleranceMinValue()
  {
    return GetSoftwarePickingToleranceMinValue_36();
  }

  private native double GetSoftwarePickingToleranceMaxValue_37();
  public double GetSoftwarePickingToleranceMaxValue()
  {
    return GetSoftwarePickingToleranceMaxValue_37();
  }

  private native double GetSoftwarePickingTolerance_38();
  public double GetSoftwarePickingTolerance()
  {
    return GetSoftwarePickingTolerance_38();
  }

  private native void RegisterPickers_39();
  public void RegisterPickers()
  {
    RegisterPickers_39();
  }

  public vtkPointCloudRepresentation() { super(); }

  public vtkPointCloudRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
