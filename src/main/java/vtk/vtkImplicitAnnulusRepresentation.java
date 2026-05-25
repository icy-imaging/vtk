// java wrapper for vtkImplicitAnnulusRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitAnnulusRepresentation extends vtkWidgetRepresentation
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

  private native void SetInnerRadius_12(double id0);
  public void SetInnerRadius(double id0)
  {
    SetInnerRadius_12(id0);
  }

  private native double GetInnerRadius_13();
  public double GetInnerRadius()
  {
    return GetInnerRadius_13();
  }

  private native void SetOuterRadius_14(double id0);
  public void SetOuterRadius(double id0)
  {
    SetOuterRadius_14(id0);
  }

  private native double GetOuterRadius_15();
  public double GetOuterRadius()
  {
    return GetOuterRadius_15();
  }

  private native void SetAlongXAxis_16(boolean id0);
  public void SetAlongXAxis(boolean id0)
  {
    SetAlongXAxis_16(id0);
  }

  private native boolean GetAlongXAxis_17();
  public boolean GetAlongXAxis()
  {
    return GetAlongXAxis_17();
  }

  private native void AlongXAxisOn_18();
  public void AlongXAxisOn()
  {
    AlongXAxisOn_18();
  }

  private native void AlongXAxisOff_19();
  public void AlongXAxisOff()
  {
    AlongXAxisOff_19();
  }

  private native void SetAlongYAxis_20(boolean id0);
  public void SetAlongYAxis(boolean id0)
  {
    SetAlongYAxis_20(id0);
  }

  private native boolean GetAlongYAxis_21();
  public boolean GetAlongYAxis()
  {
    return GetAlongYAxis_21();
  }

  private native void AlongYAxisOn_22();
  public void AlongYAxisOn()
  {
    AlongYAxisOn_22();
  }

  private native void AlongYAxisOff_23();
  public void AlongYAxisOff()
  {
    AlongYAxisOff_23();
  }

  private native void SetAlongZAxis_24(boolean id0);
  public void SetAlongZAxis(boolean id0)
  {
    SetAlongZAxis_24(id0);
  }

  private native boolean GetAlongZAxis_25();
  public boolean GetAlongZAxis()
  {
    return GetAlongZAxis_25();
  }

  private native void AlongZAxisOn_26();
  public void AlongZAxisOn()
  {
    AlongZAxisOn_26();
  }

  private native void AlongZAxisOff_27();
  public void AlongZAxisOff()
  {
    AlongZAxisOff_27();
  }

  private native void SetDrawAnnulus_28(boolean id0);
  public void SetDrawAnnulus(boolean id0)
  {
    SetDrawAnnulus_28(id0);
  }

  private native boolean GetDrawAnnulus_29();
  public boolean GetDrawAnnulus()
  {
    return GetDrawAnnulus_29();
  }

  private native void DrawAnnulusOn_30();
  public void DrawAnnulusOn()
  {
    DrawAnnulusOn_30();
  }

  private native void DrawAnnulusOff_31();
  public void DrawAnnulusOff()
  {
    DrawAnnulusOff_31();
  }

  private native void SetResolution_32(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_32(id0);
  }

  private native int GetResolutionMinValue_33();
  public int GetResolutionMinValue()
  {
    return GetResolutionMinValue_33();
  }

  private native int GetResolutionMaxValue_34();
  public int GetResolutionMaxValue()
  {
    return GetResolutionMaxValue_34();
  }

  private native int GetResolution_35();
  public int GetResolution()
  {
    return GetResolution_35();
  }

  private native void SetTubing_36(boolean id0);
  public void SetTubing(boolean id0)
  {
    SetTubing_36(id0);
  }

  private native boolean GetTubing_37();
  public boolean GetTubing()
  {
    return GetTubing_37();
  }

  private native void TubingOn_38();
  public void TubingOn()
  {
    TubingOn_38();
  }

  private native void TubingOff_39();
  public void TubingOff()
  {
    TubingOff_39();
  }

  private native void SetOutlineTranslation_40(boolean id0);
  public void SetOutlineTranslation(boolean id0)
  {
    SetOutlineTranslation_40(id0);
  }

  private native boolean GetOutlineTranslation_41();
  public boolean GetOutlineTranslation()
  {
    return GetOutlineTranslation_41();
  }

  private native void OutlineTranslationOn_42();
  public void OutlineTranslationOn()
  {
    OutlineTranslationOn_42();
  }

  private native void OutlineTranslationOff_43();
  public void OutlineTranslationOff()
  {
    OutlineTranslationOff_43();
  }

  private native void SetOutsideBounds_44(boolean id0);
  public void SetOutsideBounds(boolean id0)
  {
    SetOutsideBounds_44(id0);
  }

  private native boolean GetOutsideBounds_45();
  public boolean GetOutsideBounds()
  {
    return GetOutsideBounds_45();
  }

  private native void OutsideBoundsOn_46();
  public void OutsideBoundsOn()
  {
    OutsideBoundsOn_46();
  }

  private native void OutsideBoundsOff_47();
  public void OutsideBoundsOff()
  {
    OutsideBoundsOff_47();
  }

  private native void SetWidgetBounds_48(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetWidgetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetWidgetBounds_48(id0,id1,id2,id3,id4,id5);
  }

  private native void SetWidgetBounds_49(double id0[]);
  public void SetWidgetBounds(double id0[])
  {
    SetWidgetBounds_49(id0);
  }

  private native void SetConstrainToWidgetBounds_50(boolean id0);
  public void SetConstrainToWidgetBounds(boolean id0)
  {
    SetConstrainToWidgetBounds_50(id0);
  }

  private native boolean GetConstrainToWidgetBounds_51();
  public boolean GetConstrainToWidgetBounds()
  {
    return GetConstrainToWidgetBounds_51();
  }

  private native void ConstrainToWidgetBoundsOn_52();
  public void ConstrainToWidgetBoundsOn()
  {
    ConstrainToWidgetBoundsOn_52();
  }

  private native void ConstrainToWidgetBoundsOff_53();
  public void ConstrainToWidgetBoundsOff()
  {
    ConstrainToWidgetBoundsOff_53();
  }

  private native void SetScaleEnabled_54(boolean id0);
  public void SetScaleEnabled(boolean id0)
  {
    SetScaleEnabled_54(id0);
  }

  private native boolean GetScaleEnabled_55();
  public boolean GetScaleEnabled()
  {
    return GetScaleEnabled_55();
  }

  private native void ScaleEnabledOn_56();
  public void ScaleEnabledOn()
  {
    ScaleEnabledOn_56();
  }

  private native void ScaleEnabledOff_57();
  public void ScaleEnabledOff()
  {
    ScaleEnabledOff_57();
  }

  private native void GetPolyData_58(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_58(id0);
  }

  private native void UpdatePlacement_59();
  public void UpdatePlacement()
  {
    UpdatePlacement_59();
  }

  private native long GetAxisProperty_60();
  public vtkProperty GetAxisProperty()
  {
    long temp = GetAxisProperty_60();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedAxisProperty_61();
  public vtkProperty GetSelectedAxisProperty()
  {
    long temp = GetSelectedAxisProperty_61();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAnnulusProperty_62();
  public vtkProperty GetAnnulusProperty()
  {
    long temp = GetAnnulusProperty_62();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedAnnulusProperty_63();
  public vtkProperty GetSelectedAnnulusProperty()
  {
    long temp = GetSelectedAnnulusProperty_63();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRadiusHandleProperty_64();
  public vtkProperty GetRadiusHandleProperty()
  {
    long temp = GetRadiusHandleProperty_64();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedRadiusHandleProperty_65();
  public vtkProperty GetSelectedRadiusHandleProperty()
  {
    long temp = GetSelectedRadiusHandleProperty_65();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutlineProperty_66();
  public vtkProperty GetOutlineProperty()
  {
    long temp = GetOutlineProperty_66();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedOutlineProperty_67();
  public vtkProperty GetSelectedOutlineProperty()
  {
    long temp = GetSelectedOutlineProperty_67();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInteractionColor_68(double id0,double id1,double id2);
  public void SetInteractionColor(double id0,double id1,double id2)
  {
    SetInteractionColor_68(id0,id1,id2);
  }

  private native void SetInteractionColor_69(double id0[]);
  public void SetInteractionColor(double id0[])
  {
    SetInteractionColor_69(id0);
  }

  private native void SetHandleColor_70(double id0,double id1,double id2);
  public void SetHandleColor(double id0,double id1,double id2)
  {
    SetHandleColor_70(id0,id1,id2);
  }

  private native void SetHandleColor_71(double id0[]);
  public void SetHandleColor(double id0[])
  {
    SetHandleColor_71(id0);
  }

  private native void SetForegroundColor_72(double id0,double id1,double id2);
  public void SetForegroundColor(double id0,double id1,double id2)
  {
    SetForegroundColor_72(id0,id1,id2);
  }

  private native void SetForegroundColor_73(double id0[]);
  public void SetForegroundColor(double id0[])
  {
    SetForegroundColor_73(id0);
  }

  private native int ComputeInteractionState_74(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_74(id0,id1,id2);
  }

  private native void PlaceWidget_75(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_75(id0);
  }

  private native void BuildRepresentation_76();
  public void BuildRepresentation()
  {
    BuildRepresentation_76();
  }

  private native void StartWidgetInteraction_77(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_77(id0);
  }

  private native void WidgetInteraction_78(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_78(id0);
  }

  private native void EndWidgetInteraction_79(double id0[]);
  public void EndWidgetInteraction(double id0[])
  {
    EndWidgetInteraction_79(id0);
  }

  private native void GetActors_80(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_80(id0);
  }

  private native void ReleaseGraphicsResources_81(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_81(id0);
  }

  private native int RenderOpaqueGeometry_82(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_82(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_83(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_83(id0);
  }

  private native int HasTranslucentPolygonalGeometry_84();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_84();
  }

  private native void SetBumpDistance_85(double id0);
  public void SetBumpDistance(double id0)
  {
    SetBumpDistance_85(id0);
  }

  private native double GetBumpDistanceMinValue_86();
  public double GetBumpDistanceMinValue()
  {
    return GetBumpDistanceMinValue_86();
  }

  private native double GetBumpDistanceMaxValue_87();
  public double GetBumpDistanceMaxValue()
  {
    return GetBumpDistanceMaxValue_87();
  }

  private native double GetBumpDistance_88();
  public double GetBumpDistance()
  {
    return GetBumpDistance_88();
  }

  private native void BumpAnnulus_89(int id0,double id1);
  public void BumpAnnulus(int id0,double id1)
  {
    BumpAnnulus_89(id0,id1);
  }

  private native void PushAnnulus_90(double id0);
  public void PushAnnulus(double id0)
  {
    PushAnnulus_90(id0);
  }

  private native void SetInteractionState_91(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_91(id0);
  }

  private native int GetInteractionStateMinValue_92();
  public int GetInteractionStateMinValue()
  {
    return GetInteractionStateMinValue_92();
  }

  private native int GetInteractionStateMaxValue_93();
  public int GetInteractionStateMaxValue()
  {
    return GetInteractionStateMaxValue_93();
  }

  private native void SetRepresentationState_94(int id0);
  public void SetRepresentationState(int id0)
  {
    SetRepresentationState_94(id0);
  }

  private native int GetRepresentationState_95();
  public int GetRepresentationState()
  {
    return GetRepresentationState_95();
  }

  private native void RegisterPickers_96();
  public void RegisterPickers()
  {
    RegisterPickers_96();
  }

  private native int GetTranslationAxis_97();
  public int GetTranslationAxis()
  {
    return GetTranslationAxis_97();
  }

  private native void SetTranslationAxis_98(int id0);
  public void SetTranslationAxis(int id0)
  {
    SetTranslationAxis_98(id0);
  }

  private native int GetTranslationAxisMinValue_99();
  public int GetTranslationAxisMinValue()
  {
    return GetTranslationAxisMinValue_99();
  }

  private native int GetTranslationAxisMaxValue_100();
  public int GetTranslationAxisMaxValue()
  {
    return GetTranslationAxisMaxValue_100();
  }

  private native void SetXTranslationAxisOn_101();
  public void SetXTranslationAxisOn()
  {
    SetXTranslationAxisOn_101();
  }

  private native void SetYTranslationAxisOn_102();
  public void SetYTranslationAxisOn()
  {
    SetYTranslationAxisOn_102();
  }

  private native void SetZTranslationAxisOn_103();
  public void SetZTranslationAxisOn()
  {
    SetZTranslationAxisOn_103();
  }

  private native void SetTranslationAxisOff_104();
  public void SetTranslationAxisOff()
  {
    SetTranslationAxisOff_104();
  }

  private native boolean IsTranslationConstrained_105();
  public boolean IsTranslationConstrained()
  {
    return IsTranslationConstrained_105();
  }

  private native void GetAnnulus_106(vtkAnnulus id0);
  public void GetAnnulus(vtkAnnulus id0)
  {
    GetAnnulus_106(id0);
  }

  public vtkImplicitAnnulusRepresentation() { super(); }

  public vtkImplicitAnnulusRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
