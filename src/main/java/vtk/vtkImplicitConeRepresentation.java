// java wrapper for vtkImplicitConeRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitConeRepresentation extends vtkWidgetRepresentation
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

  private native void SetAngle_12(double id0);
  public void SetAngle(double id0)
  {
    SetAngle_12(id0);
  }

  private native double GetAngle_13();
  public double GetAngle()
  {
    return GetAngle_13();
  }

  private native void SetAlongXAxis_14(boolean id0);
  public void SetAlongXAxis(boolean id0)
  {
    SetAlongXAxis_14(id0);
  }

  private native boolean GetAlongXAxis_15();
  public boolean GetAlongXAxis()
  {
    return GetAlongXAxis_15();
  }

  private native void AlongXAxisOn_16();
  public void AlongXAxisOn()
  {
    AlongXAxisOn_16();
  }

  private native void AlongXAxisOff_17();
  public void AlongXAxisOff()
  {
    AlongXAxisOff_17();
  }

  private native void SetAlongYAxis_18(boolean id0);
  public void SetAlongYAxis(boolean id0)
  {
    SetAlongYAxis_18(id0);
  }

  private native boolean GetAlongYAxis_19();
  public boolean GetAlongYAxis()
  {
    return GetAlongYAxis_19();
  }

  private native void AlongYAxisOn_20();
  public void AlongYAxisOn()
  {
    AlongYAxisOn_20();
  }

  private native void AlongYAxisOff_21();
  public void AlongYAxisOff()
  {
    AlongYAxisOff_21();
  }

  private native void SetAlongZAxis_22(boolean id0);
  public void SetAlongZAxis(boolean id0)
  {
    SetAlongZAxis_22(id0);
  }

  private native boolean GetAlongZAxis_23();
  public boolean GetAlongZAxis()
  {
    return GetAlongZAxis_23();
  }

  private native void AlongZAxisOn_24();
  public void AlongZAxisOn()
  {
    AlongZAxisOn_24();
  }

  private native void AlongZAxisOff_25();
  public void AlongZAxisOff()
  {
    AlongZAxisOff_25();
  }

  private native void SetDrawCone_26(boolean id0);
  public void SetDrawCone(boolean id0)
  {
    SetDrawCone_26(id0);
  }

  private native boolean GetDrawCone_27();
  public boolean GetDrawCone()
  {
    return GetDrawCone_27();
  }

  private native void DrawConeOn_28();
  public void DrawConeOn()
  {
    DrawConeOn_28();
  }

  private native void DrawConeOff_29();
  public void DrawConeOff()
  {
    DrawConeOff_29();
  }

  private native void SetResolution_30(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_30(id0);
  }

  private native int GetResolutionMinValue_31();
  public int GetResolutionMinValue()
  {
    return GetResolutionMinValue_31();
  }

  private native int GetResolutionMaxValue_32();
  public int GetResolutionMaxValue()
  {
    return GetResolutionMaxValue_32();
  }

  private native int GetResolution_33();
  public int GetResolution()
  {
    return GetResolution_33();
  }

  private native void SetTubing_34(boolean id0);
  public void SetTubing(boolean id0)
  {
    SetTubing_34(id0);
  }

  private native boolean GetTubing_35();
  public boolean GetTubing()
  {
    return GetTubing_35();
  }

  private native void TubingOn_36();
  public void TubingOn()
  {
    TubingOn_36();
  }

  private native void TubingOff_37();
  public void TubingOff()
  {
    TubingOff_37();
  }

  private native void SetOutlineTranslation_38(boolean id0);
  public void SetOutlineTranslation(boolean id0)
  {
    SetOutlineTranslation_38(id0);
  }

  private native boolean GetOutlineTranslation_39();
  public boolean GetOutlineTranslation()
  {
    return GetOutlineTranslation_39();
  }

  private native void OutlineTranslationOn_40();
  public void OutlineTranslationOn()
  {
    OutlineTranslationOn_40();
  }

  private native void OutlineTranslationOff_41();
  public void OutlineTranslationOff()
  {
    OutlineTranslationOff_41();
  }

  private native void SetOutsideBounds_42(boolean id0);
  public void SetOutsideBounds(boolean id0)
  {
    SetOutsideBounds_42(id0);
  }

  private native boolean GetOutsideBounds_43();
  public boolean GetOutsideBounds()
  {
    return GetOutsideBounds_43();
  }

  private native void OutsideBoundsOn_44();
  public void OutsideBoundsOn()
  {
    OutsideBoundsOn_44();
  }

  private native void OutsideBoundsOff_45();
  public void OutsideBoundsOff()
  {
    OutsideBoundsOff_45();
  }

  private native void SetWidgetBounds_46(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetWidgetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetWidgetBounds_46(id0,id1,id2,id3,id4,id5);
  }

  private native void SetWidgetBounds_47(double id0[]);
  public void SetWidgetBounds(double id0[])
  {
    SetWidgetBounds_47(id0);
  }

  private native double[] GetWidgetBounds_48();
  public double[] GetWidgetBounds()
  {
    return GetWidgetBounds_48();
  }

  private native void SetConstrainToWidgetBounds_49(boolean id0);
  public void SetConstrainToWidgetBounds(boolean id0)
  {
    SetConstrainToWidgetBounds_49(id0);
  }

  private native boolean GetConstrainToWidgetBounds_50();
  public boolean GetConstrainToWidgetBounds()
  {
    return GetConstrainToWidgetBounds_50();
  }

  private native void ConstrainToWidgetBoundsOn_51();
  public void ConstrainToWidgetBoundsOn()
  {
    ConstrainToWidgetBoundsOn_51();
  }

  private native void ConstrainToWidgetBoundsOff_52();
  public void ConstrainToWidgetBoundsOff()
  {
    ConstrainToWidgetBoundsOff_52();
  }

  private native void SetScaleEnabled_53(boolean id0);
  public void SetScaleEnabled(boolean id0)
  {
    SetScaleEnabled_53(id0);
  }

  private native boolean GetScaleEnabled_54();
  public boolean GetScaleEnabled()
  {
    return GetScaleEnabled_54();
  }

  private native void ScaleEnabledOn_55();
  public void ScaleEnabledOn()
  {
    ScaleEnabledOn_55();
  }

  private native void ScaleEnabledOff_56();
  public void ScaleEnabledOff()
  {
    ScaleEnabledOff_56();
  }

  private native void GetPolyData_57(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_57(id0);
  }

  private native void UpdatePlacement_58();
  public void UpdatePlacement()
  {
    UpdatePlacement_58();
  }

  private native long GetAxisProperty_59();
  public vtkProperty GetAxisProperty()
  {
    long temp = GetAxisProperty_59();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedAxisProperty_60();
  public vtkProperty GetSelectedAxisProperty()
  {
    long temp = GetSelectedAxisProperty_60();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetConeProperty_61();
  public vtkProperty GetConeProperty()
  {
    long temp = GetConeProperty_61();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedConeProperty_62();
  public vtkProperty GetSelectedConeProperty()
  {
    long temp = GetSelectedConeProperty_62();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutlineProperty_63();
  public vtkProperty GetOutlineProperty()
  {
    long temp = GetOutlineProperty_63();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedOutlineProperty_64();
  public vtkProperty GetSelectedOutlineProperty()
  {
    long temp = GetSelectedOutlineProperty_64();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgesProperty_65();
  public vtkProperty GetEdgesProperty()
  {
    long temp = GetEdgesProperty_65();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInteractionColor_66(double id0,double id1,double id2);
  public void SetInteractionColor(double id0,double id1,double id2)
  {
    SetInteractionColor_66(id0,id1,id2);
  }

  private native void SetInteractionColor_67(double id0[]);
  public void SetInteractionColor(double id0[])
  {
    SetInteractionColor_67(id0);
  }

  private native void SetHandleColor_68(double id0,double id1,double id2);
  public void SetHandleColor(double id0,double id1,double id2)
  {
    SetHandleColor_68(id0,id1,id2);
  }

  private native void SetHandleColor_69(double id0[]);
  public void SetHandleColor(double id0[])
  {
    SetHandleColor_69(id0);
  }

  private native void SetForegroundColor_70(double id0,double id1,double id2);
  public void SetForegroundColor(double id0,double id1,double id2)
  {
    SetForegroundColor_70(id0,id1,id2);
  }

  private native void SetForegroundColor_71(double id0[]);
  public void SetForegroundColor(double id0[])
  {
    SetForegroundColor_71(id0);
  }

  private native int ComputeInteractionState_72(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_72(id0,id1,id2);
  }

  private native void PlaceWidget_73(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_73(id0);
  }

  private native void BuildRepresentation_74();
  public void BuildRepresentation()
  {
    BuildRepresentation_74();
  }

  private native void StartWidgetInteraction_75(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_75(id0);
  }

  private native void WidgetInteraction_76(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_76(id0);
  }

  private native void EndWidgetInteraction_77(double id0[]);
  public void EndWidgetInteraction(double id0[])
  {
    EndWidgetInteraction_77(id0);
  }

  private native void GetActors_78(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_78(id0);
  }

  private native void ReleaseGraphicsResources_79(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_79(id0);
  }

  private native int RenderOpaqueGeometry_80(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_80(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_81(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_81(id0);
  }

  private native int HasTranslucentPolygonalGeometry_82();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_82();
  }

  private native void SetBumpDistance_83(double id0);
  public void SetBumpDistance(double id0)
  {
    SetBumpDistance_83(id0);
  }

  private native double GetBumpDistanceMinValue_84();
  public double GetBumpDistanceMinValue()
  {
    return GetBumpDistanceMinValue_84();
  }

  private native double GetBumpDistanceMaxValue_85();
  public double GetBumpDistanceMaxValue()
  {
    return GetBumpDistanceMaxValue_85();
  }

  private native double GetBumpDistance_86();
  public double GetBumpDistance()
  {
    return GetBumpDistance_86();
  }

  private native void BumpCone_87(int id0,double id1);
  public void BumpCone(int id0,double id1)
  {
    BumpCone_87(id0,id1);
  }

  private native void PushCone_88(double id0);
  public void PushCone(double id0)
  {
    PushCone_88(id0);
  }

  private native void SetInteractionState_89(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_89(id0);
  }

  private native int GetInteractionStateMinValue_90();
  public int GetInteractionStateMinValue()
  {
    return GetInteractionStateMinValue_90();
  }

  private native int GetInteractionStateMaxValue_91();
  public int GetInteractionStateMaxValue()
  {
    return GetInteractionStateMaxValue_91();
  }

  private native void SetRepresentationState_92(int id0);
  public void SetRepresentationState(int id0)
  {
    SetRepresentationState_92(id0);
  }

  private native int GetRepresentationState_93();
  public int GetRepresentationState()
  {
    return GetRepresentationState_93();
  }

  private native void RegisterPickers_94();
  public void RegisterPickers()
  {
    RegisterPickers_94();
  }

  private native int GetTranslationAxis_95();
  public int GetTranslationAxis()
  {
    return GetTranslationAxis_95();
  }

  private native void SetTranslationAxis_96(int id0);
  public void SetTranslationAxis(int id0)
  {
    SetTranslationAxis_96(id0);
  }

  private native int GetTranslationAxisMinValue_97();
  public int GetTranslationAxisMinValue()
  {
    return GetTranslationAxisMinValue_97();
  }

  private native int GetTranslationAxisMaxValue_98();
  public int GetTranslationAxisMaxValue()
  {
    return GetTranslationAxisMaxValue_98();
  }

  private native void SetXTranslationAxisOn_99();
  public void SetXTranslationAxisOn()
  {
    SetXTranslationAxisOn_99();
  }

  private native void SetYTranslationAxisOn_100();
  public void SetYTranslationAxisOn()
  {
    SetYTranslationAxisOn_100();
  }

  private native void SetZTranslationAxisOn_101();
  public void SetZTranslationAxisOn()
  {
    SetZTranslationAxisOn_101();
  }

  private native void SetTranslationAxisOff_102();
  public void SetTranslationAxisOff()
  {
    SetTranslationAxisOff_102();
  }

  private native boolean IsTranslationConstrained_103();
  public boolean IsTranslationConstrained()
  {
    return IsTranslationConstrained_103();
  }

  private native void GetCone_104(vtkCone id0);
  public void GetCone(vtkCone id0)
  {
    GetCone_104(id0);
  }

  public vtkImplicitConeRepresentation() { super(); }

  public vtkImplicitConeRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
