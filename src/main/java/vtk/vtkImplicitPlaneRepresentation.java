// java wrapper for vtkImplicitPlaneRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitPlaneRepresentation extends vtkWidgetRepresentation
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

  private native void SetOrigin_4(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_4(id0,id1,id2);
  }

  private native void SetOrigin_5(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_5(id0);
  }

  private native double[] GetOrigin_6();
  public double[] GetOrigin()
  {
    return GetOrigin_6();
  }

  private native void GetOrigin_7(double id0[]);
  public void GetOrigin(double id0[])
  {
    GetOrigin_7(id0);
  }

  private native void SetNormal_8(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_8(id0,id1,id2);
  }

  private native void SetNormal_9(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_9(id0);
  }

  private native void SetNormalToCamera_10();
  public void SetNormalToCamera()
  {
    SetNormalToCamera_10();
  }

  private native double[] GetNormal_11();
  public double[] GetNormal()
  {
    return GetNormal_11();
  }

  private native void GetNormal_12(double id0[]);
  public void GetNormal(double id0[])
  {
    GetNormal_12(id0);
  }

  private native void SetNormalToXAxis_13(int id0);
  public void SetNormalToXAxis(int id0)
  {
    SetNormalToXAxis_13(id0);
  }

  private native int GetNormalToXAxis_14();
  public int GetNormalToXAxis()
  {
    return GetNormalToXAxis_14();
  }

  private native void NormalToXAxisOn_15();
  public void NormalToXAxisOn()
  {
    NormalToXAxisOn_15();
  }

  private native void NormalToXAxisOff_16();
  public void NormalToXAxisOff()
  {
    NormalToXAxisOff_16();
  }

  private native void SetNormalToYAxis_17(int id0);
  public void SetNormalToYAxis(int id0)
  {
    SetNormalToYAxis_17(id0);
  }

  private native int GetNormalToYAxis_18();
  public int GetNormalToYAxis()
  {
    return GetNormalToYAxis_18();
  }

  private native void NormalToYAxisOn_19();
  public void NormalToYAxisOn()
  {
    NormalToYAxisOn_19();
  }

  private native void NormalToYAxisOff_20();
  public void NormalToYAxisOff()
  {
    NormalToYAxisOff_20();
  }

  private native void SetNormalToZAxis_21(int id0);
  public void SetNormalToZAxis(int id0)
  {
    SetNormalToZAxis_21(id0);
  }

  private native int GetNormalToZAxis_22();
  public int GetNormalToZAxis()
  {
    return GetNormalToZAxis_22();
  }

  private native void NormalToZAxisOn_23();
  public void NormalToZAxisOn()
  {
    NormalToZAxisOn_23();
  }

  private native void NormalToZAxisOff_24();
  public void NormalToZAxisOff()
  {
    NormalToZAxisOff_24();
  }

  private native void SetLockNormalToCamera_25(int id0);
  public void SetLockNormalToCamera(int id0)
  {
    SetLockNormalToCamera_25(id0);
  }

  private native int GetLockNormalToCamera_26();
  public int GetLockNormalToCamera()
  {
    return GetLockNormalToCamera_26();
  }

  private native void LockNormalToCameraOn_27();
  public void LockNormalToCameraOn()
  {
    LockNormalToCameraOn_27();
  }

  private native void LockNormalToCameraOff_28();
  public void LockNormalToCameraOff()
  {
    LockNormalToCameraOff_28();
  }

  private native void SetTubing_29(int id0);
  public void SetTubing(int id0)
  {
    SetTubing_29(id0);
  }

  private native int GetTubing_30();
  public int GetTubing()
  {
    return GetTubing_30();
  }

  private native void TubingOn_31();
  public void TubingOn()
  {
    TubingOn_31();
  }

  private native void TubingOff_32();
  public void TubingOff()
  {
    TubingOff_32();
  }

  private native void SetDrawPlane_33(int id0);
  public void SetDrawPlane(int id0)
  {
    SetDrawPlane_33(id0);
  }

  private native int GetDrawPlane_34();
  public int GetDrawPlane()
  {
    return GetDrawPlane_34();
  }

  private native void DrawPlaneOn_35();
  public void DrawPlaneOn()
  {
    DrawPlaneOn_35();
  }

  private native void DrawPlaneOff_36();
  public void DrawPlaneOff()
  {
    DrawPlaneOff_36();
  }

  private native void SetDrawOutline_37(int id0);
  public void SetDrawOutline(int id0)
  {
    SetDrawOutline_37(id0);
  }

  private native int GetDrawOutline_38();
  public int GetDrawOutline()
  {
    return GetDrawOutline_38();
  }

  private native void DrawOutlineOn_39();
  public void DrawOutlineOn()
  {
    DrawOutlineOn_39();
  }

  private native void DrawOutlineOff_40();
  public void DrawOutlineOff()
  {
    DrawOutlineOff_40();
  }

  private native void SetOutlineTranslation_41(int id0);
  public void SetOutlineTranslation(int id0)
  {
    SetOutlineTranslation_41(id0);
  }

  private native int GetOutlineTranslation_42();
  public int GetOutlineTranslation()
  {
    return GetOutlineTranslation_42();
  }

  private native void OutlineTranslationOn_43();
  public void OutlineTranslationOn()
  {
    OutlineTranslationOn_43();
  }

  private native void OutlineTranslationOff_44();
  public void OutlineTranslationOff()
  {
    OutlineTranslationOff_44();
  }

  private native void SetOutsideBounds_45(int id0);
  public void SetOutsideBounds(int id0)
  {
    SetOutsideBounds_45(id0);
  }

  private native int GetOutsideBounds_46();
  public int GetOutsideBounds()
  {
    return GetOutsideBounds_46();
  }

  private native void OutsideBoundsOn_47();
  public void OutsideBoundsOn()
  {
    OutsideBoundsOn_47();
  }

  private native void OutsideBoundsOff_48();
  public void OutsideBoundsOff()
  {
    OutsideBoundsOff_48();
  }

  private native void SetXTranslationAxisOn_49();
  public void SetXTranslationAxisOn()
  {
    SetXTranslationAxisOn_49();
  }

  private native void SetYTranslationAxisOn_50();
  public void SetYTranslationAxisOn()
  {
    SetYTranslationAxisOn_50();
  }

  private native void SetZTranslationAxisOn_51();
  public void SetZTranslationAxisOn()
  {
    SetZTranslationAxisOn_51();
  }

  private native void SetTranslationAxisOff_52();
  public void SetTranslationAxisOff()
  {
    SetTranslationAxisOff_52();
  }

  private native boolean IsTranslationConstrained_53();
  public boolean IsTranslationConstrained()
  {
    return IsTranslationConstrained_53();
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

  private native void GetPolyData_65(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_65(id0);
  }

  private native long GetPolyDataAlgorithm_66();
  public vtkPolyDataAlgorithm GetPolyDataAlgorithm()
  {
    long temp = GetPolyDataAlgorithm_66();

    if (temp == 0) return null;
    return (vtkPolyDataAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetPlane_67(vtkPlane id0);
  public void GetPlane(vtkPlane id0)
  {
    GetPlane_67(id0);
  }

  private native void SetPlane_68(vtkPlane id0);
  public void SetPlane(vtkPlane id0)
  {
    SetPlane_68(id0);
  }

  private native void UpdatePlacement_69();
  public void UpdatePlacement()
  {
    UpdatePlacement_69();
  }

  private native long GetNormalProperty_70();
  public vtkProperty GetNormalProperty()
  {
    long temp = GetNormalProperty_70();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedNormalProperty_71();
  public vtkProperty GetSelectedNormalProperty()
  {
    long temp = GetSelectedNormalProperty_71();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPlaneProperty_72();
  public vtkProperty GetPlaneProperty()
  {
    long temp = GetPlaneProperty_72();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedPlaneProperty_73();
  public vtkProperty GetSelectedPlaneProperty()
  {
    long temp = GetSelectedPlaneProperty_73();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutlineProperty_74();
  public vtkProperty GetOutlineProperty()
  {
    long temp = GetOutlineProperty_74();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedOutlineProperty_75();
  public vtkProperty GetSelectedOutlineProperty()
  {
    long temp = GetSelectedOutlineProperty_75();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgesProperty_76();
  public vtkProperty GetEdgesProperty()
  {
    long temp = GetEdgesProperty_76();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInteractionColor_77(double id0,double id1,double id2);
  public void SetInteractionColor(double id0,double id1,double id2)
  {
    SetInteractionColor_77(id0,id1,id2);
  }

  private native void SetInteractionColor_78(double id0[]);
  public void SetInteractionColor(double id0[])
  {
    SetInteractionColor_78(id0);
  }

  private native void SetHandleColor_79(double id0,double id1,double id2);
  public void SetHandleColor(double id0,double id1,double id2)
  {
    SetHandleColor_79(id0,id1,id2);
  }

  private native void SetHandleColor_80(double id0[]);
  public void SetHandleColor(double id0[])
  {
    SetHandleColor_80(id0);
  }

  private native void SetForegroundColor_81(double id0,double id1,double id2);
  public void SetForegroundColor(double id0,double id1,double id2)
  {
    SetForegroundColor_81(id0,id1,id2);
  }

  private native void SetForegroundColor_82(double id0[]);
  public void SetForegroundColor(double id0[])
  {
    SetForegroundColor_82(id0);
  }

  private native void SetEdgeColor_83(vtkLookupTable id0);
  public void SetEdgeColor(vtkLookupTable id0)
  {
    SetEdgeColor_83(id0);
  }

  private native void SetEdgeColor_84(double id0,double id1,double id2);
  public void SetEdgeColor(double id0,double id1,double id2)
  {
    SetEdgeColor_84(id0,id1,id2);
  }

  private native void SetEdgeColor_85(double id0[]);
  public void SetEdgeColor(double id0[])
  {
    SetEdgeColor_85(id0);
  }

  private native void SetBumpDistance_86(double id0);
  public void SetBumpDistance(double id0)
  {
    SetBumpDistance_86(id0);
  }

  private native double GetBumpDistanceMinValue_87();
  public double GetBumpDistanceMinValue()
  {
    return GetBumpDistanceMinValue_87();
  }

  private native double GetBumpDistanceMaxValue_88();
  public double GetBumpDistanceMaxValue()
  {
    return GetBumpDistanceMaxValue_88();
  }

  private native double GetBumpDistance_89();
  public double GetBumpDistance()
  {
    return GetBumpDistance_89();
  }

  private native void BumpPlane_90(int id0,double id1);
  public void BumpPlane(int id0,double id1)
  {
    BumpPlane_90(id0,id1);
  }

  private native void PushPlane_91(double id0);
  public void PushPlane(double id0)
  {
    PushPlane_91(id0);
  }

  private native int ComputeInteractionState_92(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_92(id0,id1,id2);
  }

  private native void PlaceWidget_93(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_93(id0);
  }

  private native void BuildRepresentation_94();
  public void BuildRepresentation()
  {
    BuildRepresentation_94();
  }

  private native void StartWidgetInteraction_95(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_95(id0);
  }

  private native void WidgetInteraction_96(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_96(id0);
  }

  private native void EndWidgetInteraction_97(double id0[]);
  public void EndWidgetInteraction(double id0[])
  {
    EndWidgetInteraction_97(id0);
  }

  private native double[] GetBounds_98();
  public double[] GetBounds()
  {
    return GetBounds_98();
  }

  private native void GetActors_99(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_99(id0);
  }

  private native void ReleaseGraphicsResources_100(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_100(id0);
  }

  private native int RenderOpaqueGeometry_101(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_101(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_102(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_102(id0);
  }

  private native int HasTranslucentPolygonalGeometry_103();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_103();
  }

  private native void SetInteractionState_104(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_104(id0);
  }

  private native int GetInteractionStateMinValue_105();
  public int GetInteractionStateMinValue()
  {
    return GetInteractionStateMinValue_105();
  }

  private native int GetInteractionStateMaxValue_106();
  public int GetInteractionStateMaxValue()
  {
    return GetInteractionStateMaxValue_106();
  }

  private native void SetRepresentationState_107(int id0);
  public void SetRepresentationState(int id0)
  {
    SetRepresentationState_107(id0);
  }

  private native int GetRepresentationState_108();
  public int GetRepresentationState()
  {
    return GetRepresentationState_108();
  }

  private native long GetUnderlyingPlane_109();
  public vtkPlane GetUnderlyingPlane()
  {
    long temp = GetUnderlyingPlane_109();

    if (temp == 0) return null;
    return (vtkPlane)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCropPlaneToBoundingBox_110(boolean id0);
  public void SetCropPlaneToBoundingBox(boolean id0)
  {
    SetCropPlaneToBoundingBox_110(id0);
  }

  private native boolean GetCropPlaneToBoundingBox_111();
  public boolean GetCropPlaneToBoundingBox()
  {
    return GetCropPlaneToBoundingBox_111();
  }

  private native void CropPlaneToBoundingBoxOn_112();
  public void CropPlaneToBoundingBoxOn()
  {
    CropPlaneToBoundingBoxOn_112();
  }

  private native void CropPlaneToBoundingBoxOff_113();
  public void CropPlaneToBoundingBoxOff()
  {
    CropPlaneToBoundingBoxOff_113();
  }

  private native boolean GetSnapToAxes_114();
  public boolean GetSnapToAxes()
  {
    return GetSnapToAxes_114();
  }

  private native void SetSnapToAxes_115(boolean id0);
  public void SetSnapToAxes(boolean id0)
  {
    SetSnapToAxes_115(id0);
  }

  private native boolean GetAlwaysSnapToNearestAxis_116();
  public boolean GetAlwaysSnapToNearestAxis()
  {
    return GetAlwaysSnapToNearestAxis_116();
  }

  private native void SetAlwaysSnapToNearestAxis_117(boolean id0);
  public void SetAlwaysSnapToNearestAxis(boolean id0)
  {
    SetAlwaysSnapToNearestAxis_117(id0);
  }

  public vtkImplicitPlaneRepresentation() { super(); }

  public vtkImplicitPlaneRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
