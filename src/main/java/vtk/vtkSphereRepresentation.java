// java wrapper for vtkSphereRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSphereRepresentation extends vtkWidgetRepresentation
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

  private native void SetRepresentation_4(int id0);
  public void SetRepresentation(int id0)
  {
    SetRepresentation_4(id0);
  }

  private native int GetRepresentationMinValue_5();
  public int GetRepresentationMinValue()
  {
    return GetRepresentationMinValue_5();
  }

  private native int GetRepresentationMaxValue_6();
  public int GetRepresentationMaxValue()
  {
    return GetRepresentationMaxValue_6();
  }

  private native int GetRepresentation_7();
  public int GetRepresentation()
  {
    return GetRepresentation_7();
  }

  private native void SetRepresentationToOff_8();
  public void SetRepresentationToOff()
  {
    SetRepresentationToOff_8();
  }

  private native void SetRepresentationToWireframe_9();
  public void SetRepresentationToWireframe()
  {
    SetRepresentationToWireframe_9();
  }

  private native void SetRepresentationToSurface_10();
  public void SetRepresentationToSurface()
  {
    SetRepresentationToSurface_10();
  }

  private native void SetThetaResolution_11(int id0);
  public void SetThetaResolution(int id0)
  {
    SetThetaResolution_11(id0);
  }

  private native int GetThetaResolution_12();
  public int GetThetaResolution()
  {
    return GetThetaResolution_12();
  }

  private native void SetPhiResolution_13(int id0);
  public void SetPhiResolution(int id0)
  {
    SetPhiResolution_13(id0);
  }

  private native int GetPhiResolution_14();
  public int GetPhiResolution()
  {
    return GetPhiResolution_14();
  }

  private native void SetCenter_15(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_15(id0);
  }

  private native void SetCenter_16(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_16(id0,id1,id2);
  }

  private native double[] GetCenter_17();
  public double[] GetCenter()
  {
    return GetCenter_17();
  }

  private native void GetCenter_18(double id0[]);
  public void GetCenter(double id0[])
  {
    GetCenter_18(id0);
  }

  private native void SetRadius_19(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_19(id0);
  }

  private native double GetRadius_20();
  public double GetRadius()
  {
    return GetRadius_20();
  }

  private native void SetHandleVisibility_21(int id0);
  public void SetHandleVisibility(int id0)
  {
    SetHandleVisibility_21(id0);
  }

  private native int GetHandleVisibility_22();
  public int GetHandleVisibility()
  {
    return GetHandleVisibility_22();
  }

  private native void HandleVisibilityOn_23();
  public void HandleVisibilityOn()
  {
    HandleVisibilityOn_23();
  }

  private native void HandleVisibilityOff_24();
  public void HandleVisibilityOff()
  {
    HandleVisibilityOff_24();
  }

  private native void SetHandlePosition_25(double id0[]);
  public void SetHandlePosition(double id0[])
  {
    SetHandlePosition_25(id0);
  }

  private native void SetHandlePosition_26(double id0,double id1,double id2);
  public void SetHandlePosition(double id0,double id1,double id2)
  {
    SetHandlePosition_26(id0,id1,id2);
  }

  private native double[] GetHandlePosition_27();
  public double[] GetHandlePosition()
  {
    return GetHandlePosition_27();
  }

  private native void SetHandleDirection_28(double id0[]);
  public void SetHandleDirection(double id0[])
  {
    SetHandleDirection_28(id0);
  }

  private native void SetHandleDirection_29(double id0,double id1,double id2);
  public void SetHandleDirection(double id0,double id1,double id2)
  {
    SetHandleDirection_29(id0,id1,id2);
  }

  private native double[] GetHandleDirection_30();
  public double[] GetHandleDirection()
  {
    return GetHandleDirection_30();
  }

  private native void SetHandleText_31(int id0);
  public void SetHandleText(int id0)
  {
    SetHandleText_31(id0);
  }

  private native int GetHandleText_32();
  public int GetHandleText()
  {
    return GetHandleText_32();
  }

  private native void HandleTextOn_33();
  public void HandleTextOn()
  {
    HandleTextOn_33();
  }

  private native void HandleTextOff_34();
  public void HandleTextOff()
  {
    HandleTextOff_34();
  }

  private native void SetRadialLine_35(int id0);
  public void SetRadialLine(int id0)
  {
    SetRadialLine_35(id0);
  }

  private native int GetRadialLine_36();
  public int GetRadialLine()
  {
    return GetRadialLine_36();
  }

  private native void RadialLineOn_37();
  public void RadialLineOn()
  {
    RadialLineOn_37();
  }

  private native void RadialLineOff_38();
  public void RadialLineOff()
  {
    RadialLineOff_38();
  }

  private native void SetCenterCursor_39(boolean id0);
  public void SetCenterCursor(boolean id0)
  {
    SetCenterCursor_39(id0);
  }

  private native boolean GetCenterCursor_40();
  public boolean GetCenterCursor()
  {
    return GetCenterCursor_40();
  }

  private native void CenterCursorOn_41();
  public void CenterCursorOn()
  {
    CenterCursorOn_41();
  }

  private native void CenterCursorOff_42();
  public void CenterCursorOff()
  {
    CenterCursorOff_42();
  }

  private native void GetPolyData_43(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_43(id0);
  }

  private native void GetSphere_44(vtkSphere id0);
  public void GetSphere(vtkSphere id0)
  {
    GetSphere_44(id0);
  }

  private native long GetSphereProperty_45();
  public vtkProperty GetSphereProperty()
  {
    long temp = GetSphereProperty_45();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedSphereProperty_46();
  public vtkProperty GetSelectedSphereProperty()
  {
    long temp = GetSelectedSphereProperty_46();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetHandleProperty_47();
  public vtkProperty GetHandleProperty()
  {
    long temp = GetHandleProperty_47();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedHandleProperty_48();
  public vtkProperty GetSelectedHandleProperty()
  {
    long temp = GetSelectedHandleProperty_48();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetHandleTextProperty_49();
  public vtkTextProperty GetHandleTextProperty()
  {
    long temp = GetHandleTextProperty_49();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRadialLineProperty_50();
  public vtkProperty GetRadialLineProperty()
  {
    long temp = GetRadialLineProperty_50();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInteractionColor_51(double id0,double id1,double id2);
  public void SetInteractionColor(double id0,double id1,double id2)
  {
    SetInteractionColor_51(id0,id1,id2);
  }

  private native void SetInteractionColor_52(double id0[]);
  public void SetInteractionColor(double id0[])
  {
    SetInteractionColor_52(id0);
  }

  private native void SetHandleColor_53(double id0,double id1,double id2);
  public void SetHandleColor(double id0,double id1,double id2)
  {
    SetHandleColor_53(id0,id1,id2);
  }

  private native void SetHandleColor_54(double id0[]);
  public void SetHandleColor(double id0[])
  {
    SetHandleColor_54(id0);
  }

  private native void SetForegroundColor_55(double id0,double id1,double id2);
  public void SetForegroundColor(double id0,double id1,double id2)
  {
    SetForegroundColor_55(id0,id1,id2);
  }

  private native void SetForegroundColor_56(double id0[]);
  public void SetForegroundColor(double id0[])
  {
    SetForegroundColor_56(id0);
  }

  private native void SetInteractionState_57(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_57(id0);
  }

  private native void PlaceWidget_58(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_58(id0);
  }

  private native void PlaceWidget_59(double id0[],double id1[]);
  public void PlaceWidget(double id0[],double id1[])
  {
    PlaceWidget_59(id0,id1);
  }

  private native void BuildRepresentation_60();
  public void BuildRepresentation()
  {
    BuildRepresentation_60();
  }

  private native int ComputeInteractionState_61(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_61(id0,id1,id2);
  }

  private native void StartWidgetInteraction_62(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_62(id0);
  }

  private native void WidgetInteraction_63(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_63(id0);
  }

  private native void ReleaseGraphicsResources_64(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_64(id0);
  }

  private native int RenderOpaqueGeometry_65(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_65(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_66(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_66(id0);
  }

  private native int RenderOverlay_67(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_67(id0);
  }

  private native int HasTranslucentPolygonalGeometry_68();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_68();
  }

  private native void RegisterPickers_69();
  public void RegisterPickers()
  {
    RegisterPickers_69();
  }

  private native int GetTranslationAxis_70();
  public int GetTranslationAxis()
  {
    return GetTranslationAxis_70();
  }

  private native void SetTranslationAxis_71(int id0);
  public void SetTranslationAxis(int id0)
  {
    SetTranslationAxis_71(id0);
  }

  private native int GetTranslationAxisMinValue_72();
  public int GetTranslationAxisMinValue()
  {
    return GetTranslationAxisMinValue_72();
  }

  private native int GetTranslationAxisMaxValue_73();
  public int GetTranslationAxisMaxValue()
  {
    return GetTranslationAxisMaxValue_73();
  }

  private native void SetXTranslationAxisOn_74();
  public void SetXTranslationAxisOn()
  {
    SetXTranslationAxisOn_74();
  }

  private native void SetYTranslationAxisOn_75();
  public void SetYTranslationAxisOn()
  {
    SetYTranslationAxisOn_75();
  }

  private native void SetZTranslationAxisOn_76();
  public void SetZTranslationAxisOn()
  {
    SetZTranslationAxisOn_76();
  }

  private native void SetTranslationAxisOff_77();
  public void SetTranslationAxisOff()
  {
    SetTranslationAxisOff_77();
  }

  private native boolean IsTranslationConstrained_78();
  public boolean IsTranslationConstrained()
  {
    return IsTranslationConstrained_78();
  }

  public vtkSphereRepresentation() { super(); }

  public vtkSphereRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
