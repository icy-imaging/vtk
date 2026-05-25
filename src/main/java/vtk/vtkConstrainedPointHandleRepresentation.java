// java wrapper for vtkConstrainedPointHandleRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkConstrainedPointHandleRepresentation extends vtkHandleRepresentation
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

  private native void SetCursorShape_4(vtkPolyData id0);
  public void SetCursorShape(vtkPolyData id0)
  {
    SetCursorShape_4(id0);
  }

  private native long GetCursorShape_5();
  public vtkPolyData GetCursorShape()
  {
    long temp = GetCursorShape_5();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetActiveCursorShape_6(vtkPolyData id0);
  public void SetActiveCursorShape(vtkPolyData id0)
  {
    SetActiveCursorShape_6(id0);
  }

  private native long GetActiveCursorShape_7();
  public vtkPolyData GetActiveCursorShape()
  {
    long temp = GetActiveCursorShape_7();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetProjectionNormal_8(int id0);
  public void SetProjectionNormal(int id0)
  {
    SetProjectionNormal_8(id0);
  }

  private native int GetProjectionNormalMinValue_9();
  public int GetProjectionNormalMinValue()
  {
    return GetProjectionNormalMinValue_9();
  }

  private native int GetProjectionNormalMaxValue_10();
  public int GetProjectionNormalMaxValue()
  {
    return GetProjectionNormalMaxValue_10();
  }

  private native int GetProjectionNormal_11();
  public int GetProjectionNormal()
  {
    return GetProjectionNormal_11();
  }

  private native void SetProjectionNormalToXAxis_12();
  public void SetProjectionNormalToXAxis()
  {
    SetProjectionNormalToXAxis_12();
  }

  private native void SetProjectionNormalToYAxis_13();
  public void SetProjectionNormalToYAxis()
  {
    SetProjectionNormalToYAxis_13();
  }

  private native void SetProjectionNormalToZAxis_14();
  public void SetProjectionNormalToZAxis()
  {
    SetProjectionNormalToZAxis_14();
  }

  private native void SetProjectionNormalToOblique_15();
  public void SetProjectionNormalToOblique()
  {
    SetProjectionNormalToOblique_15();
  }

  private native void SetObliquePlane_16(vtkPlane id0);
  public void SetObliquePlane(vtkPlane id0)
  {
    SetObliquePlane_16(id0);
  }

  private native long GetObliquePlane_17();
  public vtkPlane GetObliquePlane()
  {
    long temp = GetObliquePlane_17();

    if (temp == 0) return null;
    return (vtkPlane)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetProjectionPosition_18(double id0);
  public void SetProjectionPosition(double id0)
  {
    SetProjectionPosition_18(id0);
  }

  private native double GetProjectionPosition_19();
  public double GetProjectionPosition()
  {
    return GetProjectionPosition_19();
  }

  private native void AddBoundingPlane_20(vtkPlane id0);
  public void AddBoundingPlane(vtkPlane id0)
  {
    AddBoundingPlane_20(id0);
  }

  private native void RemoveBoundingPlane_21(vtkPlane id0);
  public void RemoveBoundingPlane(vtkPlane id0)
  {
    RemoveBoundingPlane_21(id0);
  }

  private native void RemoveAllBoundingPlanes_22();
  public void RemoveAllBoundingPlanes()
  {
    RemoveAllBoundingPlanes_22();
  }

  private native void SetBoundingPlanes_23(vtkPlaneCollection id0);
  public void SetBoundingPlanes(vtkPlaneCollection id0)
  {
    SetBoundingPlanes_23(id0);
  }

  private native long GetBoundingPlanes_24();
  public vtkPlaneCollection GetBoundingPlanes()
  {
    long temp = GetBoundingPlanes_24();

    if (temp == 0) return null;
    return (vtkPlaneCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBoundingPlanes_25(vtkPlanes id0);
  public void SetBoundingPlanes(vtkPlanes id0)
  {
    SetBoundingPlanes_25(id0);
  }

  private native int CheckConstraint_26(vtkRenderer id0,double id1[]);
  public int CheckConstraint(vtkRenderer id0,double id1[])
  {
    return CheckConstraint_26(id0,id1);
  }

  private native void SetPosition_27(double id0,double id1,double id2);
  public void SetPosition(double id0,double id1,double id2)
  {
    SetPosition_27(id0,id1,id2);
  }

  private native void SetPosition_28(double id0[]);
  public void SetPosition(double id0[])
  {
    SetPosition_28(id0);
  }

  private native void GetPosition_29(double id0[]);
  public void GetPosition(double id0[])
  {
    GetPosition_29(id0);
  }

  private native long GetProperty_30();
  public vtkProperty GetProperty()
  {
    long temp = GetProperty_30();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedProperty_31();
  public vtkProperty GetSelectedProperty()
  {
    long temp = GetSelectedProperty_31();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetActiveProperty_32();
  public vtkProperty GetActiveProperty()
  {
    long temp = GetActiveProperty_32();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRenderer_33(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_33(id0);
  }

  private native void BuildRepresentation_34();
  public void BuildRepresentation()
  {
    BuildRepresentation_34();
  }

  private native void StartWidgetInteraction_35(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_35(id0);
  }

  private native void WidgetInteraction_36(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_36(id0);
  }

  private native int ComputeInteractionState_37(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_37(id0,id1,id2);
  }

  private native void SetDisplayPosition_38(double id0[]);
  public void SetDisplayPosition(double id0[])
  {
    SetDisplayPosition_38(id0);
  }

  private native void GetActors_39(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_39(id0);
  }

  private native void ReleaseGraphicsResources_40(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_40(id0);
  }

  private native int RenderOverlay_41(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_41(id0);
  }

  private native int RenderOpaqueGeometry_42(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_42(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_43(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_43(id0);
  }

  private native int HasTranslucentPolygonalGeometry_44();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_44();
  }

  private native void ShallowCopy_45(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_45(id0);
  }

  private native void Highlight_46(int id0);
  public void Highlight(int id0)
  {
    Highlight_46(id0);
  }

  public vtkConstrainedPointHandleRepresentation() { super(); }

  public vtkConstrainedPointHandleRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
