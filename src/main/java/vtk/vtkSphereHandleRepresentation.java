// java wrapper for vtkSphereHandleRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSphereHandleRepresentation extends vtkHandleRepresentation
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

  private native void SetWorldPosition_4(double id0[]);
  public void SetWorldPosition(double id0[])
  {
    SetWorldPosition_4(id0);
  }

  private native void SetDisplayPosition_5(double id0[]);
  public void SetDisplayPosition(double id0[])
  {
    SetDisplayPosition_5(id0);
  }

  private native void SetTranslationMode_6(int id0);
  public void SetTranslationMode(int id0)
  {
    SetTranslationMode_6(id0);
  }

  private native int GetTranslationMode_7();
  public int GetTranslationMode()
  {
    return GetTranslationMode_7();
  }

  private native void TranslationModeOn_8();
  public void TranslationModeOn()
  {
    TranslationModeOn_8();
  }

  private native void TranslationModeOff_9();
  public void TranslationModeOff()
  {
    TranslationModeOff_9();
  }

  private native void SetSphereRadius_10(double id0);
  public void SetSphereRadius(double id0)
  {
    SetSphereRadius_10(id0);
  }

  private native double GetSphereRadius_11();
  public double GetSphereRadius()
  {
    return GetSphereRadius_11();
  }

  private native void SetProperty_12(vtkProperty id0);
  public void SetProperty(vtkProperty id0)
  {
    SetProperty_12(id0);
  }

  private native void SetSelectedProperty_13(vtkProperty id0);
  public void SetSelectedProperty(vtkProperty id0)
  {
    SetSelectedProperty_13(id0);
  }

  private native long GetProperty_14();
  public vtkProperty GetProperty()
  {
    long temp = GetProperty_14();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedProperty_15();
  public vtkProperty GetSelectedProperty()
  {
    long temp = GetSelectedProperty_15();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetHotSpotSize_16(double id0);
  public void SetHotSpotSize(double id0)
  {
    SetHotSpotSize_16(id0);
  }

  private native double GetHotSpotSizeMinValue_17();
  public double GetHotSpotSizeMinValue()
  {
    return GetHotSpotSizeMinValue_17();
  }

  private native double GetHotSpotSizeMaxValue_18();
  public double GetHotSpotSizeMaxValue()
  {
    return GetHotSpotSizeMaxValue_18();
  }

  private native double GetHotSpotSize_19();
  public double GetHotSpotSize()
  {
    return GetHotSpotSize_19();
  }

  private native void SetHandleSize_20(double id0);
  public void SetHandleSize(double id0)
  {
    SetHandleSize_20(id0);
  }

  private native double[] GetBounds_21();
  public double[] GetBounds()
  {
    return GetBounds_21();
  }

  private native void BuildRepresentation_22();
  public void BuildRepresentation()
  {
    BuildRepresentation_22();
  }

  private native void StartWidgetInteraction_23(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_23(id0);
  }

  private native void WidgetInteraction_24(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_24(id0);
  }

  private native int ComputeInteractionState_25(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_25(id0,id1,id2);
  }

  private native void PlaceWidget_26(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_26(id0);
  }

  private native void ShallowCopy_27(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_27(id0);
  }

  private native void DeepCopy_28(vtkProp id0);
  public void DeepCopy(vtkProp id0)
  {
    DeepCopy_28(id0);
  }

  private native void GetActors_29(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_29(id0);
  }

  private native void ReleaseGraphicsResources_30(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_30(id0);
  }

  private native int RenderOpaqueGeometry_31(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_31(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_32(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_32(id0);
  }

  private native int HasTranslucentPolygonalGeometry_33();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_33();
  }

  private native void Highlight_34(int id0);
  public void Highlight(int id0)
  {
    Highlight_34(id0);
  }

  private native void RegisterPickers_35();
  public void RegisterPickers()
  {
    RegisterPickers_35();
  }

  private native void SetVisibility_36(int id0);
  public void SetVisibility(int id0)
  {
    SetVisibility_36(id0);
  }

  public vtkSphereHandleRepresentation() { super(); }

  public vtkSphereHandleRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
