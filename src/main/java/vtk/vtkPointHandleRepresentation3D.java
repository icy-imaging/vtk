// java wrapper for vtkPointHandleRepresentation3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointHandleRepresentation3D extends vtkHandleRepresentation
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

  private native void SetOutline_6(int id0);
  public void SetOutline(int id0)
  {
    SetOutline_6(id0);
  }

  private native int GetOutline_7();
  public int GetOutline()
  {
    return GetOutline_7();
  }

  private native void OutlineOn_8();
  public void OutlineOn()
  {
    OutlineOn_8();
  }

  private native void OutlineOff_9();
  public void OutlineOff()
  {
    OutlineOff_9();
  }

  private native void SetXShadows_10(int id0);
  public void SetXShadows(int id0)
  {
    SetXShadows_10(id0);
  }

  private native int GetXShadows_11();
  public int GetXShadows()
  {
    return GetXShadows_11();
  }

  private native void XShadowsOn_12();
  public void XShadowsOn()
  {
    XShadowsOn_12();
  }

  private native void XShadowsOff_13();
  public void XShadowsOff()
  {
    XShadowsOff_13();
  }

  private native void SetYShadows_14(int id0);
  public void SetYShadows(int id0)
  {
    SetYShadows_14(id0);
  }

  private native int GetYShadows_15();
  public int GetYShadows()
  {
    return GetYShadows_15();
  }

  private native void YShadowsOn_16();
  public void YShadowsOn()
  {
    YShadowsOn_16();
  }

  private native void YShadowsOff_17();
  public void YShadowsOff()
  {
    YShadowsOff_17();
  }

  private native void SetZShadows_18(int id0);
  public void SetZShadows(int id0)
  {
    SetZShadows_18(id0);
  }

  private native int GetZShadows_19();
  public int GetZShadows()
  {
    return GetZShadows_19();
  }

  private native void ZShadowsOn_20();
  public void ZShadowsOn()
  {
    ZShadowsOn_20();
  }

  private native void ZShadowsOff_21();
  public void ZShadowsOff()
  {
    ZShadowsOff_21();
  }

  private native void SetTranslationMode_22(int id0);
  public void SetTranslationMode(int id0)
  {
    SetTranslationMode_22(id0);
  }

  private native int GetTranslationMode_23();
  public int GetTranslationMode()
  {
    return GetTranslationMode_23();
  }

  private native void TranslationModeOn_24();
  public void TranslationModeOn()
  {
    TranslationModeOn_24();
  }

  private native void TranslationModeOff_25();
  public void TranslationModeOff()
  {
    TranslationModeOff_25();
  }

  private native void AllOn_26();
  public void AllOn()
  {
    AllOn_26();
  }

  private native void AllOff_27();
  public void AllOff()
  {
    AllOff_27();
  }

  private native void SetProperty_28(vtkProperty id0);
  public void SetProperty(vtkProperty id0)
  {
    SetProperty_28(id0);
  }

  private native void SetSelectedProperty_29(vtkProperty id0);
  public void SetSelectedProperty(vtkProperty id0)
  {
    SetSelectedProperty_29(id0);
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

  private native void SetInteractionColor_32(double id0,double id1,double id2);
  public void SetInteractionColor(double id0,double id1,double id2)
  {
    SetInteractionColor_32(id0,id1,id2);
  }

  private native void SetInteractionColor_33(double id0[]);
  public void SetInteractionColor(double id0[])
  {
    SetInteractionColor_33(id0);
  }

  private native void SetForegroundColor_34(double id0,double id1,double id2);
  public void SetForegroundColor(double id0,double id1,double id2)
  {
    SetForegroundColor_34(id0,id1,id2);
  }

  private native void SetForegroundColor_35(double id0[]);
  public void SetForegroundColor(double id0[])
  {
    SetForegroundColor_35(id0);
  }

  private native void SetHotSpotSize_36(double id0);
  public void SetHotSpotSize(double id0)
  {
    SetHotSpotSize_36(id0);
  }

  private native double GetHotSpotSizeMinValue_37();
  public double GetHotSpotSizeMinValue()
  {
    return GetHotSpotSizeMinValue_37();
  }

  private native double GetHotSpotSizeMaxValue_38();
  public double GetHotSpotSizeMaxValue()
  {
    return GetHotSpotSizeMaxValue_38();
  }

  private native double GetHotSpotSize_39();
  public double GetHotSpotSize()
  {
    return GetHotSpotSize_39();
  }

  private native void SetHandleSize_40(double id0);
  public void SetHandleSize(double id0)
  {
    SetHandleSize_40(id0);
  }

  private native double[] GetBounds_41();
  public double[] GetBounds()
  {
    return GetBounds_41();
  }

  private native void BuildRepresentation_42();
  public void BuildRepresentation()
  {
    BuildRepresentation_42();
  }

  private native void StartWidgetInteraction_43(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_43(id0);
  }

  private native void WidgetInteraction_44(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_44(id0);
  }

  private native int ComputeInteractionState_45(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_45(id0,id1,id2);
  }

  private native void PlaceWidget_46(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_46(id0);
  }

  private native void ShallowCopy_47(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_47(id0);
  }

  private native void DeepCopy_48(vtkProp id0);
  public void DeepCopy(vtkProp id0)
  {
    DeepCopy_48(id0);
  }

  private native void GetActors_49(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_49(id0);
  }

  private native void ReleaseGraphicsResources_50(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_50(id0);
  }

  private native int RenderOpaqueGeometry_51(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_51(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_52(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_52(id0);
  }

  private native int HasTranslucentPolygonalGeometry_53();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_53();
  }

  private native void Highlight_54(int id0);
  public void Highlight(int id0)
  {
    Highlight_54(id0);
  }

  private native void SetSmoothMotion_55(int id0);
  public void SetSmoothMotion(int id0)
  {
    SetSmoothMotion_55(id0);
  }

  private native int GetSmoothMotion_56();
  public int GetSmoothMotion()
  {
    return GetSmoothMotion_56();
  }

  private native void SmoothMotionOn_57();
  public void SmoothMotionOn()
  {
    SmoothMotionOn_57();
  }

  private native void SmoothMotionOff_58();
  public void SmoothMotionOff()
  {
    SmoothMotionOff_58();
  }

  private native void RegisterPickers_59();
  public void RegisterPickers()
  {
    RegisterPickers_59();
  }

  private native void SetVisibility_60(int id0);
  public void SetVisibility(int id0)
  {
    SetVisibility_60(id0);
  }

  public vtkPointHandleRepresentation3D() { super(); }

  public vtkPointHandleRepresentation3D(long id) { super(id); }
  public native long   VTKInit();

}
