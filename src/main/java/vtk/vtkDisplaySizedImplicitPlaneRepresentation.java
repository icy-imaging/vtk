// java wrapper for vtkDisplaySizedImplicitPlaneRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDisplaySizedImplicitPlaneRepresentation extends vtkWidgetRepresentation
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

  private native void SetRadiusMultiplier_29(double id0);
  public void SetRadiusMultiplier(double id0)
  {
    SetRadiusMultiplier_29(id0);
  }

  private native double GetRadiusMultiplierMinValue_30();
  public double GetRadiusMultiplierMinValue()
  {
    return GetRadiusMultiplierMinValue_30();
  }

  private native double GetRadiusMultiplierMaxValue_31();
  public double GetRadiusMultiplierMaxValue()
  {
    return GetRadiusMultiplierMaxValue_31();
  }

  private native double GetRadiusMultiplier_32();
  public double GetRadiusMultiplier()
  {
    return GetRadiusMultiplier_32();
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

  private native void SetDrawIntersectionEdges_41(int id0);
  public void SetDrawIntersectionEdges(int id0)
  {
    SetDrawIntersectionEdges_41(id0);
  }

  private native int GetDrawIntersectionEdges_42();
  public int GetDrawIntersectionEdges()
  {
    return GetDrawIntersectionEdges_42();
  }

  private native void DrawIntersectionEdgesOn_43();
  public void DrawIntersectionEdgesOn()
  {
    DrawIntersectionEdgesOn_43();
  }

  private native void DrawIntersectionEdgesOff_44();
  public void DrawIntersectionEdgesOff()
  {
    DrawIntersectionEdgesOff_44();
  }

  private native void SetOutlineTranslation_45(int id0);
  public void SetOutlineTranslation(int id0)
  {
    SetOutlineTranslation_45(id0);
  }

  private native int GetOutlineTranslation_46();
  public int GetOutlineTranslation()
  {
    return GetOutlineTranslation_46();
  }

  private native void OutlineTranslationOn_47();
  public void OutlineTranslationOn()
  {
    OutlineTranslationOn_47();
  }

  private native void OutlineTranslationOff_48();
  public void OutlineTranslationOff()
  {
    OutlineTranslationOff_48();
  }

  private native void SetOutsideBounds_49(int id0);
  public void SetOutsideBounds(int id0)
  {
    SetOutsideBounds_49(id0);
  }

  private native int GetOutsideBounds_50();
  public int GetOutsideBounds()
  {
    return GetOutsideBounds_50();
  }

  private native void OutsideBoundsOn_51();
  public void OutsideBoundsOn()
  {
    OutsideBoundsOn_51();
  }

  private native void OutsideBoundsOff_52();
  public void OutsideBoundsOff()
  {
    OutsideBoundsOff_52();
  }

  private native void SetXTranslationAxisOn_53();
  public void SetXTranslationAxisOn()
  {
    SetXTranslationAxisOn_53();
  }

  private native void SetYTranslationAxisOn_54();
  public void SetYTranslationAxisOn()
  {
    SetYTranslationAxisOn_54();
  }

  private native void SetZTranslationAxisOn_55();
  public void SetZTranslationAxisOn()
  {
    SetZTranslationAxisOn_55();
  }

  private native void SetTranslationAxisOff_56();
  public void SetTranslationAxisOff()
  {
    SetTranslationAxisOff_56();
  }

  private native boolean IsTranslationConstrained_57();
  public boolean IsTranslationConstrained()
  {
    return IsTranslationConstrained_57();
  }

  private native void SetWidgetBounds_58(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetWidgetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetWidgetBounds_58(id0,id1,id2,id3,id4,id5);
  }

  private native void SetWidgetBounds_59(double id0[]);
  public void SetWidgetBounds(double id0[])
  {
    SetWidgetBounds_59(id0);
  }

  private native double[] GetWidgetBounds_60();
  public double[] GetWidgetBounds()
  {
    return GetWidgetBounds_60();
  }

  private native void SetConstrainToWidgetBounds_61(int id0);
  public void SetConstrainToWidgetBounds(int id0)
  {
    SetConstrainToWidgetBounds_61(id0);
  }

  private native int GetConstrainToWidgetBounds_62();
  public int GetConstrainToWidgetBounds()
  {
    return GetConstrainToWidgetBounds_62();
  }

  private native void ConstrainToWidgetBoundsOn_63();
  public void ConstrainToWidgetBoundsOn()
  {
    ConstrainToWidgetBoundsOn_63();
  }

  private native void ConstrainToWidgetBoundsOff_64();
  public void ConstrainToWidgetBoundsOff()
  {
    ConstrainToWidgetBoundsOff_64();
  }

  private native void SetConstrainMaximumSizeToWidgetBounds_65(int id0);
  public void SetConstrainMaximumSizeToWidgetBounds(int id0)
  {
    SetConstrainMaximumSizeToWidgetBounds_65(id0);
  }

  private native int GetConstrainMaximumSizeToWidgetBounds_66();
  public int GetConstrainMaximumSizeToWidgetBounds()
  {
    return GetConstrainMaximumSizeToWidgetBounds_66();
  }

  private native void ConstrainMaximumSizeToWidgetBoundsOn_67();
  public void ConstrainMaximumSizeToWidgetBoundsOn()
  {
    ConstrainMaximumSizeToWidgetBoundsOn_67();
  }

  private native void ConstrainMaximumSizeToWidgetBoundsOff_68();
  public void ConstrainMaximumSizeToWidgetBoundsOff()
  {
    ConstrainMaximumSizeToWidgetBoundsOff_68();
  }

  private native void SetScaleEnabled_69(int id0);
  public void SetScaleEnabled(int id0)
  {
    SetScaleEnabled_69(id0);
  }

  private native int GetScaleEnabled_70();
  public int GetScaleEnabled()
  {
    return GetScaleEnabled_70();
  }

  private native void ScaleEnabledOn_71();
  public void ScaleEnabledOn()
  {
    ScaleEnabledOn_71();
  }

  private native void ScaleEnabledOff_72();
  public void ScaleEnabledOff()
  {
    ScaleEnabledOff_72();
  }

  private native void GetPolyData_73(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_73(id0);
  }

  private native long GetPolyDataAlgorithm_74();
  public vtkPolyDataAlgorithm GetPolyDataAlgorithm()
  {
    long temp = GetPolyDataAlgorithm_74();

    if (temp == 0) return null;
    return (vtkPolyDataAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetPlane_75(vtkPlane id0);
  public void GetPlane(vtkPlane id0)
  {
    GetPlane_75(id0);
  }

  private native void SetPlane_76(vtkPlane id0);
  public void SetPlane(vtkPlane id0)
  {
    SetPlane_76(id0);
  }

  private native void UpdatePlacement_77();
  public void UpdatePlacement()
  {
    UpdatePlacement_77();
  }

  private native long GetNormalProperty_78();
  public vtkProperty GetNormalProperty()
  {
    long temp = GetNormalProperty_78();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedNormalProperty_79();
  public vtkProperty GetSelectedNormalProperty()
  {
    long temp = GetSelectedNormalProperty_79();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSphereProperty_80();
  public vtkProperty GetSphereProperty()
  {
    long temp = GetSphereProperty_80();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedSphereProperty_81();
  public vtkProperty GetSelectedSphereProperty()
  {
    long temp = GetSelectedSphereProperty_81();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPlaneProperty_82();
  public vtkProperty GetPlaneProperty()
  {
    long temp = GetPlaneProperty_82();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedPlaneProperty_83();
  public vtkProperty GetSelectedPlaneProperty()
  {
    long temp = GetSelectedPlaneProperty_83();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutlineProperty_84();
  public vtkProperty GetOutlineProperty()
  {
    long temp = GetOutlineProperty_84();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedOutlineProperty_85();
  public vtkProperty GetSelectedOutlineProperty()
  {
    long temp = GetSelectedOutlineProperty_85();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgesProperty_86();
  public vtkProperty GetEdgesProperty()
  {
    long temp = GetEdgesProperty_86();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedEdgesProperty_87();
  public vtkProperty GetSelectedEdgesProperty()
  {
    long temp = GetSelectedEdgesProperty_87();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetIntersectionEdgesProperty_88();
  public vtkProperty GetIntersectionEdgesProperty()
  {
    long temp = GetIntersectionEdgesProperty_88();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInteractionColor_89(double id0,double id1,double id2);
  public void SetInteractionColor(double id0,double id1,double id2)
  {
    SetInteractionColor_89(id0,id1,id2);
  }

  private native void SetInteractionColor_90(double id0[]);
  public void SetInteractionColor(double id0[])
  {
    SetInteractionColor_90(id0);
  }

  private native void SetHandleColor_91(double id0,double id1,double id2);
  public void SetHandleColor(double id0,double id1,double id2)
  {
    SetHandleColor_91(id0,id1,id2);
  }

  private native void SetHandleColor_92(double id0[]);
  public void SetHandleColor(double id0[])
  {
    SetHandleColor_92(id0);
  }

  private native void SetForegroundColor_93(double id0,double id1,double id2);
  public void SetForegroundColor(double id0,double id1,double id2)
  {
    SetForegroundColor_93(id0,id1,id2);
  }

  private native void SetForegroundColor_94(double id0[]);
  public void SetForegroundColor(double id0[])
  {
    SetForegroundColor_94(id0);
  }

  private native void SetSelectedWidgetColor_95(double id0,double id1,double id2);
  public void SetSelectedWidgetColor(double id0,double id1,double id2)
  {
    SetSelectedWidgetColor_95(id0,id1,id2);
  }

  private native void SetSelectedWidgetColor_96(double id0[]);
  public void SetSelectedWidgetColor(double id0[])
  {
    SetSelectedWidgetColor_96(id0);
  }

  private native void SetUnselectedWidgetColor_97(double id0,double id1,double id2);
  public void SetUnselectedWidgetColor(double id0,double id1,double id2)
  {
    SetUnselectedWidgetColor_97(id0,id1,id2);
  }

  private native void SetUnselectedWidgetColor_98(double id0[]);
  public void SetUnselectedWidgetColor(double id0[])
  {
    SetUnselectedWidgetColor_98(id0);
  }

  private native void SetBumpDistance_99(double id0);
  public void SetBumpDistance(double id0)
  {
    SetBumpDistance_99(id0);
  }

  private native double GetBumpDistanceMinValue_100();
  public double GetBumpDistanceMinValue()
  {
    return GetBumpDistanceMinValue_100();
  }

  private native double GetBumpDistanceMaxValue_101();
  public double GetBumpDistanceMaxValue()
  {
    return GetBumpDistanceMaxValue_101();
  }

  private native double GetBumpDistance_102();
  public double GetBumpDistance()
  {
    return GetBumpDistance_102();
  }

  private native void BumpPlane_103(int id0,double id1);
  public void BumpPlane(int id0,double id1)
  {
    BumpPlane_103(id0,id1);
  }

  private native void PushPlane_104(double id0);
  public void PushPlane(double id0)
  {
    PushPlane_104(id0);
  }

  private native boolean GetPickCameraFocalInfo_105();
  public boolean GetPickCameraFocalInfo()
  {
    return GetPickCameraFocalInfo_105();
  }

  private native void SetPickCameraFocalInfo_106(boolean id0);
  public void SetPickCameraFocalInfo(boolean id0)
  {
    SetPickCameraFocalInfo_106(id0);
  }

  private native void PickCameraFocalInfoOn_107();
  public void PickCameraFocalInfoOn()
  {
    PickCameraFocalInfoOn_107();
  }

  private native void PickCameraFocalInfoOff_108();
  public void PickCameraFocalInfoOff()
  {
    PickCameraFocalInfoOff_108();
  }

  private native boolean PickOrigin_109(int id0,int id1,boolean id2);
  public boolean PickOrigin(int id0,int id1,boolean id2)
  {
    return PickOrigin_109(id0,id1,id2);
  }

  private native boolean PickNormal_110(int id0,int id1,boolean id2);
  public boolean PickNormal(int id0,int id1,boolean id2)
  {
    return PickNormal_110(id0,id1,id2);
  }

  private native int ComputeInteractionState_111(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_111(id0,id1,id2);
  }

  private native void PlaceWidget_112(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_112(id0);
  }

  private native void BuildRepresentation_113();
  public void BuildRepresentation()
  {
    BuildRepresentation_113();
  }

  private native void StartWidgetInteraction_114(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_114(id0);
  }

  private native void WidgetInteraction_115(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_115(id0);
  }

  private native void EndWidgetInteraction_116(double id0[]);
  public void EndWidgetInteraction(double id0[])
  {
    EndWidgetInteraction_116(id0);
  }

  private native double[] GetBounds_117();
  public double[] GetBounds()
  {
    return GetBounds_117();
  }

  private native void GetActors_118(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_118(id0);
  }

  private native void ReleaseGraphicsResources_119(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_119(id0);
  }

  private native int RenderOpaqueGeometry_120(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_120(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_121(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_121(id0);
  }

  private native int HasTranslucentPolygonalGeometry_122();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_122();
  }

  private native void SetInteractionState_123(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_123(id0);
  }

  private native int GetInteractionStateMinValue_124();
  public int GetInteractionStateMinValue()
  {
    return GetInteractionStateMinValue_124();
  }

  private native int GetInteractionStateMaxValue_125();
  public int GetInteractionStateMaxValue()
  {
    return GetInteractionStateMaxValue_125();
  }

  private native void SetRepresentationState_126(int id0);
  public void SetRepresentationState(int id0)
  {
    SetRepresentationState_126(id0);
  }

  private native int GetRepresentationState_127();
  public int GetRepresentationState()
  {
    return GetRepresentationState_127();
  }

  private native long GetUnderlyingPlane_128();
  public vtkPlane GetUnderlyingPlane()
  {
    long temp = GetUnderlyingPlane_128();

    if (temp == 0) return null;
    return (vtkPlane)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetSnapToAxes_129();
  public boolean GetSnapToAxes()
  {
    return GetSnapToAxes_129();
  }

  private native void SetSnapToAxes_130(boolean id0);
  public void SetSnapToAxes(boolean id0)
  {
    SetSnapToAxes_130(id0);
  }

  private native void SnapToAxesOn_131();
  public void SnapToAxesOn()
  {
    SnapToAxesOn_131();
  }

  private native void SnapToAxesOff_132();
  public void SnapToAxesOff()
  {
    SnapToAxesOff_132();
  }

  private native boolean GetAlwaysSnapToNearestAxis_133();
  public boolean GetAlwaysSnapToNearestAxis()
  {
    return GetAlwaysSnapToNearestAxis_133();
  }

  private native void SetAlwaysSnapToNearestAxis_134(boolean id0);
  public void SetAlwaysSnapToNearestAxis(boolean id0)
  {
    SetAlwaysSnapToNearestAxis_134(id0);
  }

  public vtkDisplaySizedImplicitPlaneRepresentation() { super(); }

  public vtkDisplaySizedImplicitPlaneRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
