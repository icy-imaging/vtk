// java wrapper for vtkWidgetRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWidgetRepresentation extends vtkProp
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

  private native void PickingManagedOn_4();
  public void PickingManagedOn()
  {
    PickingManagedOn_4();
  }

  private native void PickingManagedOff_5();
  public void PickingManagedOff()
  {
    PickingManagedOff_5();
  }

  private native void SetPickingManaged_6(boolean id0);
  public void SetPickingManaged(boolean id0)
  {
    SetPickingManaged_6(id0);
  }

  private native boolean GetPickingManaged_7();
  public boolean GetPickingManaged()
  {
    return GetPickingManaged_7();
  }

  private native void SetRenderer_8(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_8(id0);
  }

  private native long GetRenderer_9();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_9();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildRepresentation_10();
  public void BuildRepresentation()
  {
    BuildRepresentation_10();
  }

  private native void PlaceWidget_11(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_11(id0);
  }

  private native void StartWidgetInteraction_12(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_12(id0);
  }

  private native void WidgetInteraction_13(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_13(id0);
  }

  private native void EndWidgetInteraction_14(double id0[]);
  public void EndWidgetInteraction(double id0[])
  {
    EndWidgetInteraction_14(id0);
  }

  private native int ComputeInteractionState_15(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_15(id0,id1,id2);
  }

  private native int GetInteractionState_16();
  public int GetInteractionState()
  {
    return GetInteractionState_16();
  }

  private native void Highlight_17(int id0);
  public void Highlight(int id0)
  {
    Highlight_17(id0);
  }

  private native void SetPlaceFactor_18(double id0);
  public void SetPlaceFactor(double id0)
  {
    SetPlaceFactor_18(id0);
  }

  private native double GetPlaceFactorMinValue_19();
  public double GetPlaceFactorMinValue()
  {
    return GetPlaceFactorMinValue_19();
  }

  private native double GetPlaceFactorMaxValue_20();
  public double GetPlaceFactorMaxValue()
  {
    return GetPlaceFactorMaxValue_20();
  }

  private native double GetPlaceFactor_21();
  public double GetPlaceFactor()
  {
    return GetPlaceFactor_21();
  }

  private native void SetHandleSize_22(double id0);
  public void SetHandleSize(double id0)
  {
    SetHandleSize_22(id0);
  }

  private native double GetHandleSizeMinValue_23();
  public double GetHandleSizeMinValue()
  {
    return GetHandleSizeMinValue_23();
  }

  private native double GetHandleSizeMaxValue_24();
  public double GetHandleSizeMaxValue()
  {
    return GetHandleSizeMaxValue_24();
  }

  private native double GetHandleSize_25();
  public double GetHandleSize()
  {
    return GetHandleSize_25();
  }

  private native int GetNeedToRender_26();
  public int GetNeedToRender()
  {
    return GetNeedToRender_26();
  }

  private native void SetNeedToRender_27(int id0);
  public void SetNeedToRender(int id0)
  {
    SetNeedToRender_27(id0);
  }

  private native int GetNeedToRenderMinValue_28();
  public int GetNeedToRenderMinValue()
  {
    return GetNeedToRenderMinValue_28();
  }

  private native int GetNeedToRenderMaxValue_29();
  public int GetNeedToRenderMaxValue()
  {
    return GetNeedToRenderMaxValue_29();
  }

  private native void NeedToRenderOn_30();
  public void NeedToRenderOn()
  {
    NeedToRenderOn_30();
  }

  private native void NeedToRenderOff_31();
  public void NeedToRenderOff()
  {
    NeedToRenderOff_31();
  }

  private native double[] GetBounds_32();
  public double[] GetBounds()
  {
    return GetBounds_32();
  }

  private native void ShallowCopy_33(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_33(id0);
  }

  private native void GetActors_34(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_34(id0);
  }

  private native void GetActors2D_35(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_35(id0);
  }

  private native void GetVolumes_36(vtkPropCollection id0);
  public void GetVolumes(vtkPropCollection id0)
  {
    GetVolumes_36(id0);
  }

  private native void ReleaseGraphicsResources_37(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_37(id0);
  }

  private native int RenderOverlay_38(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_38(id0);
  }

  private native int RenderOpaqueGeometry_39(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_39(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_40(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_40(id0);
  }

  private native int RenderVolumetricGeometry_41(vtkViewport id0);
  public int RenderVolumetricGeometry(vtkViewport id0)
  {
    return RenderVolumetricGeometry_41(id0);
  }

  private native int HasTranslucentPolygonalGeometry_42();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_42();
  }

  private native void RegisterPickers_43();
  public void RegisterPickers()
  {
    RegisterPickers_43();
  }

  private native void UnRegisterPickers_44();
  public void UnRegisterPickers()
  {
    UnRegisterPickers_44();
  }

  public vtkWidgetRepresentation() { super(); }

  public vtkWidgetRepresentation(long id) { super(id); }

}
