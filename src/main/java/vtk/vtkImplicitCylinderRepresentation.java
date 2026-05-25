// java wrapper for vtkImplicitCylinderRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitCylinderRepresentation extends vtkWidgetRepresentation
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

  private native void SetCenter_4(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_4(id0,id1,id2);
  }

  private native void SetCenter_5(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_5(id0);
  }

  private native double[] GetCenter_6();
  public double[] GetCenter()
  {
    return GetCenter_6();
  }

  private native void GetCenter_7(double id0[]);
  public void GetCenter(double id0[])
  {
    GetCenter_7(id0);
  }

  private native void SetAxis_8(double id0,double id1,double id2);
  public void SetAxis(double id0,double id1,double id2)
  {
    SetAxis_8(id0,id1,id2);
  }

  private native void SetAxis_9(double id0[]);
  public void SetAxis(double id0[])
  {
    SetAxis_9(id0);
  }

  private native double[] GetAxis_10();
  public double[] GetAxis()
  {
    return GetAxis_10();
  }

  private native void GetAxis_11(double id0[]);
  public void GetAxis(double id0[])
  {
    GetAxis_11(id0);
  }

  private native void SetRadius_12(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_12(id0);
  }

  private native double GetRadius_13();
  public double GetRadius()
  {
    return GetRadius_13();
  }

  private native void SetMinRadius_14(double id0);
  public void SetMinRadius(double id0)
  {
    SetMinRadius_14(id0);
  }

  private native double GetMinRadiusMinValue_15();
  public double GetMinRadiusMinValue()
  {
    return GetMinRadiusMinValue_15();
  }

  private native double GetMinRadiusMaxValue_16();
  public double GetMinRadiusMaxValue()
  {
    return GetMinRadiusMaxValue_16();
  }

  private native double GetMinRadius_17();
  public double GetMinRadius()
  {
    return GetMinRadius_17();
  }

  private native void SetMaxRadius_18(double id0);
  public void SetMaxRadius(double id0)
  {
    SetMaxRadius_18(id0);
  }

  private native double GetMaxRadiusMinValue_19();
  public double GetMaxRadiusMinValue()
  {
    return GetMaxRadiusMinValue_19();
  }

  private native double GetMaxRadiusMaxValue_20();
  public double GetMaxRadiusMaxValue()
  {
    return GetMaxRadiusMaxValue_20();
  }

  private native double GetMaxRadius_21();
  public double GetMaxRadius()
  {
    return GetMaxRadius_21();
  }

  private native void SetAlongXAxis_22(int id0);
  public void SetAlongXAxis(int id0)
  {
    SetAlongXAxis_22(id0);
  }

  private native int GetAlongXAxis_23();
  public int GetAlongXAxis()
  {
    return GetAlongXAxis_23();
  }

  private native void AlongXAxisOn_24();
  public void AlongXAxisOn()
  {
    AlongXAxisOn_24();
  }

  private native void AlongXAxisOff_25();
  public void AlongXAxisOff()
  {
    AlongXAxisOff_25();
  }

  private native void SetAlongYAxis_26(int id0);
  public void SetAlongYAxis(int id0)
  {
    SetAlongYAxis_26(id0);
  }

  private native int GetAlongYAxis_27();
  public int GetAlongYAxis()
  {
    return GetAlongYAxis_27();
  }

  private native void AlongYAxisOn_28();
  public void AlongYAxisOn()
  {
    AlongYAxisOn_28();
  }

  private native void AlongYAxisOff_29();
  public void AlongYAxisOff()
  {
    AlongYAxisOff_29();
  }

  private native void SetAlongZAxis_30(int id0);
  public void SetAlongZAxis(int id0)
  {
    SetAlongZAxis_30(id0);
  }

  private native int GetAlongZAxis_31();
  public int GetAlongZAxis()
  {
    return GetAlongZAxis_31();
  }

  private native void AlongZAxisOn_32();
  public void AlongZAxisOn()
  {
    AlongZAxisOn_32();
  }

  private native void AlongZAxisOff_33();
  public void AlongZAxisOff()
  {
    AlongZAxisOff_33();
  }

  private native void SetDrawCylinder_34(int id0);
  public void SetDrawCylinder(int id0)
  {
    SetDrawCylinder_34(id0);
  }

  private native int GetDrawCylinder_35();
  public int GetDrawCylinder()
  {
    return GetDrawCylinder_35();
  }

  private native void DrawCylinderOn_36();
  public void DrawCylinderOn()
  {
    DrawCylinderOn_36();
  }

  private native void DrawCylinderOff_37();
  public void DrawCylinderOff()
  {
    DrawCylinderOff_37();
  }

  private native void SetResolution_38(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_38(id0);
  }

  private native int GetResolutionMinValue_39();
  public int GetResolutionMinValue()
  {
    return GetResolutionMinValue_39();
  }

  private native int GetResolutionMaxValue_40();
  public int GetResolutionMaxValue()
  {
    return GetResolutionMaxValue_40();
  }

  private native int GetResolution_41();
  public int GetResolution()
  {
    return GetResolution_41();
  }

  private native void SetTubing_42(int id0);
  public void SetTubing(int id0)
  {
    SetTubing_42(id0);
  }

  private native int GetTubing_43();
  public int GetTubing()
  {
    return GetTubing_43();
  }

  private native void TubingOn_44();
  public void TubingOn()
  {
    TubingOn_44();
  }

  private native void TubingOff_45();
  public void TubingOff()
  {
    TubingOff_45();
  }

  private native void SetOutlineTranslation_46(int id0);
  public void SetOutlineTranslation(int id0)
  {
    SetOutlineTranslation_46(id0);
  }

  private native int GetOutlineTranslation_47();
  public int GetOutlineTranslation()
  {
    return GetOutlineTranslation_47();
  }

  private native void OutlineTranslationOn_48();
  public void OutlineTranslationOn()
  {
    OutlineTranslationOn_48();
  }

  private native void OutlineTranslationOff_49();
  public void OutlineTranslationOff()
  {
    OutlineTranslationOff_49();
  }

  private native void SetOutsideBounds_50(int id0);
  public void SetOutsideBounds(int id0)
  {
    SetOutsideBounds_50(id0);
  }

  private native int GetOutsideBounds_51();
  public int GetOutsideBounds()
  {
    return GetOutsideBounds_51();
  }

  private native void OutsideBoundsOn_52();
  public void OutsideBoundsOn()
  {
    OutsideBoundsOn_52();
  }

  private native void OutsideBoundsOff_53();
  public void OutsideBoundsOff()
  {
    OutsideBoundsOff_53();
  }

  private native void SetWidgetBounds_54(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetWidgetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetWidgetBounds_54(id0,id1,id2,id3,id4,id5);
  }

  private native void SetWidgetBounds_55(double id0[]);
  public void SetWidgetBounds(double id0[])
  {
    SetWidgetBounds_55(id0);
  }

  private native double[] GetWidgetBounds_56();
  public double[] GetWidgetBounds()
  {
    return GetWidgetBounds_56();
  }

  private native void SetConstrainToWidgetBounds_57(int id0);
  public void SetConstrainToWidgetBounds(int id0)
  {
    SetConstrainToWidgetBounds_57(id0);
  }

  private native int GetConstrainToWidgetBounds_58();
  public int GetConstrainToWidgetBounds()
  {
    return GetConstrainToWidgetBounds_58();
  }

  private native void ConstrainToWidgetBoundsOn_59();
  public void ConstrainToWidgetBoundsOn()
  {
    ConstrainToWidgetBoundsOn_59();
  }

  private native void ConstrainToWidgetBoundsOff_60();
  public void ConstrainToWidgetBoundsOff()
  {
    ConstrainToWidgetBoundsOff_60();
  }

  private native void SetScaleEnabled_61(int id0);
  public void SetScaleEnabled(int id0)
  {
    SetScaleEnabled_61(id0);
  }

  private native int GetScaleEnabled_62();
  public int GetScaleEnabled()
  {
    return GetScaleEnabled_62();
  }

  private native void ScaleEnabledOn_63();
  public void ScaleEnabledOn()
  {
    ScaleEnabledOn_63();
  }

  private native void ScaleEnabledOff_64();
  public void ScaleEnabledOff()
  {
    ScaleEnabledOff_64();
  }

  private native void GetCylinder_65(vtkCylinder id0);
  public void GetCylinder(vtkCylinder id0)
  {
    GetCylinder_65(id0);
  }

  private native void GetPolyData_66(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_66(id0);
  }

  private native void UpdatePlacement_67();
  public void UpdatePlacement()
  {
    UpdatePlacement_67();
  }

  private native long GetAxisProperty_68();
  public vtkProperty GetAxisProperty()
  {
    long temp = GetAxisProperty_68();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedAxisProperty_69();
  public vtkProperty GetSelectedAxisProperty()
  {
    long temp = GetSelectedAxisProperty_69();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCylinderProperty_70();
  public vtkProperty GetCylinderProperty()
  {
    long temp = GetCylinderProperty_70();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedCylinderProperty_71();
  public vtkProperty GetSelectedCylinderProperty()
  {
    long temp = GetSelectedCylinderProperty_71();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutlineProperty_72();
  public vtkProperty GetOutlineProperty()
  {
    long temp = GetOutlineProperty_72();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedOutlineProperty_73();
  public vtkProperty GetSelectedOutlineProperty()
  {
    long temp = GetSelectedOutlineProperty_73();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgesProperty_74();
  public vtkProperty GetEdgesProperty()
  {
    long temp = GetEdgesProperty_74();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInteractionColor_75(double id0,double id1,double id2);
  public void SetInteractionColor(double id0,double id1,double id2)
  {
    SetInteractionColor_75(id0,id1,id2);
  }

  private native void SetInteractionColor_76(double id0[]);
  public void SetInteractionColor(double id0[])
  {
    SetInteractionColor_76(id0);
  }

  private native void SetHandleColor_77(double id0,double id1,double id2);
  public void SetHandleColor(double id0,double id1,double id2)
  {
    SetHandleColor_77(id0,id1,id2);
  }

  private native void SetHandleColor_78(double id0[]);
  public void SetHandleColor(double id0[])
  {
    SetHandleColor_78(id0);
  }

  private native void SetForegroundColor_79(double id0,double id1,double id2);
  public void SetForegroundColor(double id0,double id1,double id2)
  {
    SetForegroundColor_79(id0,id1,id2);
  }

  private native void SetForegroundColor_80(double id0[]);
  public void SetForegroundColor(double id0[])
  {
    SetForegroundColor_80(id0);
  }

  private native void SetEdgeColor_81(vtkLookupTable id0);
  public void SetEdgeColor(vtkLookupTable id0)
  {
    SetEdgeColor_81(id0);
  }

  private native void SetEdgeColor_82(double id0,double id1,double id2);
  public void SetEdgeColor(double id0,double id1,double id2)
  {
    SetEdgeColor_82(id0,id1,id2);
  }

  private native void SetEdgeColor_83(double id0[]);
  public void SetEdgeColor(double id0[])
  {
    SetEdgeColor_83(id0);
  }

  private native int ComputeInteractionState_84(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_84(id0,id1,id2);
  }

  private native void PlaceWidget_85(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_85(id0);
  }

  private native void BuildRepresentation_86();
  public void BuildRepresentation()
  {
    BuildRepresentation_86();
  }

  private native void StartWidgetInteraction_87(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_87(id0);
  }

  private native void WidgetInteraction_88(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_88(id0);
  }

  private native void EndWidgetInteraction_89(double id0[]);
  public void EndWidgetInteraction(double id0[])
  {
    EndWidgetInteraction_89(id0);
  }

  private native void GetActors_90(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_90(id0);
  }

  private native void ReleaseGraphicsResources_91(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_91(id0);
  }

  private native int RenderOpaqueGeometry_92(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_92(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_93(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_93(id0);
  }

  private native int HasTranslucentPolygonalGeometry_94();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_94();
  }

  private native void SetBumpDistance_95(double id0);
  public void SetBumpDistance(double id0)
  {
    SetBumpDistance_95(id0);
  }

  private native double GetBumpDistanceMinValue_96();
  public double GetBumpDistanceMinValue()
  {
    return GetBumpDistanceMinValue_96();
  }

  private native double GetBumpDistanceMaxValue_97();
  public double GetBumpDistanceMaxValue()
  {
    return GetBumpDistanceMaxValue_97();
  }

  private native double GetBumpDistance_98();
  public double GetBumpDistance()
  {
    return GetBumpDistance_98();
  }

  private native void BumpCylinder_99(int id0,double id1);
  public void BumpCylinder(int id0,double id1)
  {
    BumpCylinder_99(id0,id1);
  }

  private native void PushCylinder_100(double id0);
  public void PushCylinder(double id0)
  {
    PushCylinder_100(id0);
  }

  private native void SetInteractionState_101(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_101(id0);
  }

  private native int GetInteractionStateMinValue_102();
  public int GetInteractionStateMinValue()
  {
    return GetInteractionStateMinValue_102();
  }

  private native int GetInteractionStateMaxValue_103();
  public int GetInteractionStateMaxValue()
  {
    return GetInteractionStateMaxValue_103();
  }

  private native void SetRepresentationState_104(int id0);
  public void SetRepresentationState(int id0)
  {
    SetRepresentationState_104(id0);
  }

  private native int GetRepresentationState_105();
  public int GetRepresentationState()
  {
    return GetRepresentationState_105();
  }

  private native void RegisterPickers_106();
  public void RegisterPickers()
  {
    RegisterPickers_106();
  }

  private native int GetTranslationAxis_107();
  public int GetTranslationAxis()
  {
    return GetTranslationAxis_107();
  }

  private native void SetTranslationAxis_108(int id0);
  public void SetTranslationAxis(int id0)
  {
    SetTranslationAxis_108(id0);
  }

  private native int GetTranslationAxisMinValue_109();
  public int GetTranslationAxisMinValue()
  {
    return GetTranslationAxisMinValue_109();
  }

  private native int GetTranslationAxisMaxValue_110();
  public int GetTranslationAxisMaxValue()
  {
    return GetTranslationAxisMaxValue_110();
  }

  private native void SetXTranslationAxisOn_111();
  public void SetXTranslationAxisOn()
  {
    SetXTranslationAxisOn_111();
  }

  private native void SetYTranslationAxisOn_112();
  public void SetYTranslationAxisOn()
  {
    SetYTranslationAxisOn_112();
  }

  private native void SetZTranslationAxisOn_113();
  public void SetZTranslationAxisOn()
  {
    SetZTranslationAxisOn_113();
  }

  private native void SetTranslationAxisOff_114();
  public void SetTranslationAxisOff()
  {
    SetTranslationAxisOff_114();
  }

  private native boolean IsTranslationConstrained_115();
  public boolean IsTranslationConstrained()
  {
    return IsTranslationConstrained_115();
  }

  public vtkImplicitCylinderRepresentation() { super(); }

  public vtkImplicitCylinderRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
