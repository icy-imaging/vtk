// java wrapper for vtkCurveRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCurveRepresentation extends vtkWidgetRepresentation
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

  private native void SetInteractionState_4(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_4(id0);
  }

  private native void SetProjectToPlane_5(int id0);
  public void SetProjectToPlane(int id0)
  {
    SetProjectToPlane_5(id0);
  }

  private native int GetProjectToPlane_6();
  public int GetProjectToPlane()
  {
    return GetProjectToPlane_6();
  }

  private native void ProjectToPlaneOn_7();
  public void ProjectToPlaneOn()
  {
    ProjectToPlaneOn_7();
  }

  private native void ProjectToPlaneOff_8();
  public void ProjectToPlaneOff()
  {
    ProjectToPlaneOff_8();
  }

  private native void SetPlaneSource_9(vtkPlaneSource id0);
  public void SetPlaneSource(vtkPlaneSource id0)
  {
    SetPlaneSource_9(id0);
  }

  private native void SetProjectionNormal_10(int id0);
  public void SetProjectionNormal(int id0)
  {
    SetProjectionNormal_10(id0);
  }

  private native int GetProjectionNormalMinValue_11();
  public int GetProjectionNormalMinValue()
  {
    return GetProjectionNormalMinValue_11();
  }

  private native int GetProjectionNormalMaxValue_12();
  public int GetProjectionNormalMaxValue()
  {
    return GetProjectionNormalMaxValue_12();
  }

  private native int GetProjectionNormal_13();
  public int GetProjectionNormal()
  {
    return GetProjectionNormal_13();
  }

  private native void SetProjectionNormalToXAxes_14();
  public void SetProjectionNormalToXAxes()
  {
    SetProjectionNormalToXAxes_14();
  }

  private native void SetProjectionNormalToYAxes_15();
  public void SetProjectionNormalToYAxes()
  {
    SetProjectionNormalToYAxes_15();
  }

  private native void SetProjectionNormalToZAxes_16();
  public void SetProjectionNormalToZAxes()
  {
    SetProjectionNormalToZAxes_16();
  }

  private native void SetProjectionNormalToOblique_17();
  public void SetProjectionNormalToOblique()
  {
    SetProjectionNormalToOblique_17();
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

  private native void GetPolyData_20(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_20(id0);
  }

  private native long GetHandleProperty_21();
  public vtkProperty GetHandleProperty()
  {
    long temp = GetHandleProperty_21();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedHandleProperty_22();
  public vtkProperty GetSelectedHandleProperty()
  {
    long temp = GetSelectedHandleProperty_22();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLineProperty_23();
  public vtkProperty GetLineProperty()
  {
    long temp = GetLineProperty_23();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedLineProperty_24();
  public vtkProperty GetSelectedLineProperty()
  {
    long temp = GetSelectedLineProperty_24();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNumberOfHandles_25(int id0);
  public void SetNumberOfHandles(int id0)
  {
    SetNumberOfHandles_25(id0);
  }

  private native int GetNumberOfHandles_26();
  public int GetNumberOfHandles()
  {
    return GetNumberOfHandles_26();
  }

  private native void SetDirectional_27(boolean id0);
  public void SetDirectional(boolean id0)
  {
    SetDirectional_27(id0);
  }

  private native boolean GetDirectional_28();
  public boolean GetDirectional()
  {
    return GetDirectional_28();
  }

  private native void DirectionalOn_29();
  public void DirectionalOn()
  {
    DirectionalOn_29();
  }

  private native void DirectionalOff_30();
  public void DirectionalOff()
  {
    DirectionalOff_30();
  }

  private native void SetHandlePosition_31(int id0,double id1,double id2,double id3);
  public void SetHandlePosition(int id0,double id1,double id2,double id3)
  {
    SetHandlePosition_31(id0,id1,id2,id3);
  }

  private native void SetHandlePosition_32(int id0,double id1[]);
  public void SetHandlePosition(int id0,double id1[])
  {
    SetHandlePosition_32(id0,id1);
  }

  private native void GetHandlePosition_33(int id0,double id1[]);
  public void GetHandlePosition(int id0,double id1[])
  {
    GetHandlePosition_33(id0,id1);
  }

  private native long GetHandlePositions_34();
  public vtkDoubleArray GetHandlePositions()
  {
    long temp = GetHandlePositions_34();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetClosed_35(int id0);
  public void SetClosed(int id0)
  {
    SetClosed_35(id0);
  }

  private native int GetClosed_36();
  public int GetClosed()
  {
    return GetClosed_36();
  }

  private native void ClosedOn_37();
  public void ClosedOn()
  {
    ClosedOn_37();
  }

  private native void ClosedOff_38();
  public void ClosedOff()
  {
    ClosedOff_38();
  }

  private native int IsClosed_39();
  public int IsClosed()
  {
    return IsClosed_39();
  }

  private native double GetSummedLength_40();
  public double GetSummedLength()
  {
    return GetSummedLength_40();
  }

  private native void InitializeHandles_41(vtkPoints id0);
  public void InitializeHandles(vtkPoints id0)
  {
    InitializeHandles_41(id0);
  }

  private native void BuildRepresentation_42();
  public void BuildRepresentation()
  {
    BuildRepresentation_42();
  }

  private native int ComputeInteractionState_43(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_43(id0,id1,id2);
  }

  private native void StartWidgetInteraction_44(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_44(id0);
  }

  private native void WidgetInteraction_45(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_45(id0);
  }

  private native void EndWidgetInteraction_46(double id0[]);
  public void EndWidgetInteraction(double id0[])
  {
    EndWidgetInteraction_46(id0);
  }

  private native void ReleaseGraphicsResources_47(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_47(id0);
  }

  private native int RenderOpaqueGeometry_48(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_48(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_49(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_49(id0);
  }

  private native int RenderOverlay_50(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_50(id0);
  }

  private native int HasTranslucentPolygonalGeometry_51();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_51();
  }

  private native void SetLineColor_52(double id0,double id1,double id2);
  public void SetLineColor(double id0,double id1,double id2)
  {
    SetLineColor_52(id0,id1,id2);
  }

  private native void SetInteractionColor_53(double id0,double id1,double id2);
  public void SetInteractionColor(double id0,double id1,double id2)
  {
    SetInteractionColor_53(id0,id1,id2);
  }

  private native void SetInteractionColor_54(double id0[]);
  public void SetInteractionColor(double id0[])
  {
    SetInteractionColor_54(id0);
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

  private native void RegisterPickers_57();
  public void RegisterPickers()
  {
    RegisterPickers_57();
  }

  private native void SetCurrentHandleIndex_58(int id0);
  public void SetCurrentHandleIndex(int id0)
  {
    SetCurrentHandleIndex_58(id0);
  }

  private native int GetCurrentHandleIndex_59();
  public int GetCurrentHandleIndex()
  {
    return GetCurrentHandleIndex_59();
  }

  private native int GetTranslationAxis_60();
  public int GetTranslationAxis()
  {
    return GetTranslationAxis_60();
  }

  private native void SetTranslationAxis_61(int id0);
  public void SetTranslationAxis(int id0)
  {
    SetTranslationAxis_61(id0);
  }

  private native int GetTranslationAxisMinValue_62();
  public int GetTranslationAxisMinValue()
  {
    return GetTranslationAxisMinValue_62();
  }

  private native int GetTranslationAxisMaxValue_63();
  public int GetTranslationAxisMaxValue()
  {
    return GetTranslationAxisMaxValue_63();
  }

  private native void SetXTranslationAxisOn_64();
  public void SetXTranslationAxisOn()
  {
    SetXTranslationAxisOn_64();
  }

  private native void SetYTranslationAxisOn_65();
  public void SetYTranslationAxisOn()
  {
    SetYTranslationAxisOn_65();
  }

  private native void SetZTranslationAxisOn_66();
  public void SetZTranslationAxisOn()
  {
    SetZTranslationAxisOn_66();
  }

  private native void SetTranslationAxisOff_67();
  public void SetTranslationAxisOff()
  {
    SetTranslationAxisOff_67();
  }

  private native boolean IsTranslationConstrained_68();
  public boolean IsTranslationConstrained()
  {
    return IsTranslationConstrained_68();
  }

  private native void GetActors_69(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_69(id0);
  }

  public vtkCurveRepresentation() { super(); }

  public vtkCurveRepresentation(long id) { super(id); }

}
