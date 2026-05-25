// java wrapper for vtkBorderRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBorderRepresentation extends vtkWidgetRepresentation
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

  private native long GetPositionCoordinate_4();
  public vtkCoordinate GetPositionCoordinate()
  {
    long temp = GetPositionCoordinate_4();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPosition_5(double id0[]);
  public void SetPosition(double id0[])
  {
    SetPosition_5(id0);
  }

  private native void SetPosition_6(double id0,double id1);
  public void SetPosition(double id0,double id1)
  {
    SetPosition_6(id0,id1);
  }

  private native double[] GetPosition_7();
  public double[] GetPosition()
  {
    return GetPosition_7();
  }

  private native long GetPosition2Coordinate_8();
  public vtkCoordinate GetPosition2Coordinate()
  {
    long temp = GetPosition2Coordinate_8();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPosition2_9(double id0[]);
  public void SetPosition2(double id0[])
  {
    SetPosition2_9(id0);
  }

  private native void SetPosition2_10(double id0,double id1);
  public void SetPosition2(double id0,double id1)
  {
    SetPosition2_10(id0,id1);
  }

  private native double[] GetPosition2_11();
  public double[] GetPosition2()
  {
    return GetPosition2_11();
  }

  private native void SetShowBorder_12(int id0);
  public void SetShowBorder(int id0)
  {
    SetShowBorder_12(id0);
  }

  private native int GetShowBorderMinValue_13();
  public int GetShowBorderMinValue()
  {
    return GetShowBorderMinValue_13();
  }

  private native int GetShowBorderMaxValue_14();
  public int GetShowBorderMaxValue()
  {
    return GetShowBorderMaxValue_14();
  }

  private native int GetShowBorder_15();
  public int GetShowBorder()
  {
    return GetShowBorder_15();
  }

  private native void SetShowBorderToOff_16();
  public void SetShowBorderToOff()
  {
    SetShowBorderToOff_16();
  }

  private native void SetShowBorderToOn_17();
  public void SetShowBorderToOn()
  {
    SetShowBorderToOn_17();
  }

  private native void SetShowBorderToActive_18();
  public void SetShowBorderToActive()
  {
    SetShowBorderToActive_18();
  }

  private native void SetShowVerticalBorder_19(int id0);
  public void SetShowVerticalBorder(int id0)
  {
    SetShowVerticalBorder_19(id0);
  }

  private native int GetShowVerticalBorderMinValue_20();
  public int GetShowVerticalBorderMinValue()
  {
    return GetShowVerticalBorderMinValue_20();
  }

  private native int GetShowVerticalBorderMaxValue_21();
  public int GetShowVerticalBorderMaxValue()
  {
    return GetShowVerticalBorderMaxValue_21();
  }

  private native int GetShowVerticalBorder_22();
  public int GetShowVerticalBorder()
  {
    return GetShowVerticalBorder_22();
  }

  private native void SetShowHorizontalBorder_23(int id0);
  public void SetShowHorizontalBorder(int id0)
  {
    SetShowHorizontalBorder_23(id0);
  }

  private native int GetShowHorizontalBorderMinValue_24();
  public int GetShowHorizontalBorderMinValue()
  {
    return GetShowHorizontalBorderMinValue_24();
  }

  private native int GetShowHorizontalBorderMaxValue_25();
  public int GetShowHorizontalBorderMaxValue()
  {
    return GetShowHorizontalBorderMaxValue_25();
  }

  private native int GetShowHorizontalBorder_26();
  public int GetShowHorizontalBorder()
  {
    return GetShowHorizontalBorder_26();
  }

  private native long GetBorderProperty_27();
  public vtkProperty2D GetBorderProperty()
  {
    long temp = GetBorderProperty_27();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetShowPolygon_28(int id0);
  public void SetShowPolygon(int id0)
  {
    SetShowPolygon_28(id0);
  }

  private native int GetShowPolygon_29();
  public int GetShowPolygon()
  {
    return GetShowPolygon_29();
  }

  private native void SetShowPolygonToOff_30();
  public void SetShowPolygonToOff()
  {
    SetShowPolygonToOff_30();
  }

  private native void SetShowPolygonToOn_31();
  public void SetShowPolygonToOn()
  {
    SetShowPolygonToOn_31();
  }

  private native void SetShowPolygonToActive_32();
  public void SetShowPolygonToActive()
  {
    SetShowPolygonToActive_32();
  }

  private native void SetShowPolygonBackground_33(int id0);
  public void SetShowPolygonBackground(int id0)
  {
    SetShowPolygonBackground_33(id0);
  }

  private native int GetShowPolygonBackgroundMinValue_34();
  public int GetShowPolygonBackgroundMinValue()
  {
    return GetShowPolygonBackgroundMinValue_34();
  }

  private native int GetShowPolygonBackgroundMaxValue_35();
  public int GetShowPolygonBackgroundMaxValue()
  {
    return GetShowPolygonBackgroundMaxValue_35();
  }

  private native int GetShowPolygonBackground_36();
  public int GetShowPolygonBackground()
  {
    return GetShowPolygonBackground_36();
  }

  private native void SetEnforceNormalizedViewportBounds_37(int id0);
  public void SetEnforceNormalizedViewportBounds(int id0)
  {
    SetEnforceNormalizedViewportBounds_37(id0);
  }

  private native int GetEnforceNormalizedViewportBounds_38();
  public int GetEnforceNormalizedViewportBounds()
  {
    return GetEnforceNormalizedViewportBounds_38();
  }

  private native void EnforceNormalizedViewportBoundsOn_39();
  public void EnforceNormalizedViewportBoundsOn()
  {
    EnforceNormalizedViewportBoundsOn_39();
  }

  private native void EnforceNormalizedViewportBoundsOff_40();
  public void EnforceNormalizedViewportBoundsOff()
  {
    EnforceNormalizedViewportBoundsOff_40();
  }

  private native void SetProportionalResize_41(int id0);
  public void SetProportionalResize(int id0)
  {
    SetProportionalResize_41(id0);
  }

  private native int GetProportionalResize_42();
  public int GetProportionalResize()
  {
    return GetProportionalResize_42();
  }

  private native void ProportionalResizeOn_43();
  public void ProportionalResizeOn()
  {
    ProportionalResizeOn_43();
  }

  private native void ProportionalResizeOff_44();
  public void ProportionalResizeOff()
  {
    ProportionalResizeOff_44();
  }

  private native void SetMinimumNormalizedViewportSize_45(double id0,double id1);
  public void SetMinimumNormalizedViewportSize(double id0,double id1)
  {
    SetMinimumNormalizedViewportSize_45(id0,id1);
  }

  private native void SetMinimumNormalizedViewportSize_46(double id0[]);
  public void SetMinimumNormalizedViewportSize(double id0[])
  {
    SetMinimumNormalizedViewportSize_46(id0);
  }

  private native double[] GetMinimumNormalizedViewportSize_47();
  public double[] GetMinimumNormalizedViewportSize()
  {
    return GetMinimumNormalizedViewportSize_47();
  }

  private native void SetMinimumSize_48(int id0,int id1);
  public void SetMinimumSize(int id0,int id1)
  {
    SetMinimumSize_48(id0,id1);
  }

  private native void SetMinimumSize_49(int id0[]);
  public void SetMinimumSize(int id0[])
  {
    SetMinimumSize_49(id0);
  }

  private native int[] GetMinimumSize_50();
  public int[] GetMinimumSize()
  {
    return GetMinimumSize_50();
  }

  private native void SetMaximumSize_51(int id0,int id1);
  public void SetMaximumSize(int id0,int id1)
  {
    SetMaximumSize_51(id0,id1);
  }

  private native void SetMaximumSize_52(int id0[]);
  public void SetMaximumSize(int id0[])
  {
    SetMaximumSize_52(id0);
  }

  private native int[] GetMaximumSize_53();
  public int[] GetMaximumSize()
  {
    return GetMaximumSize_53();
  }

  private native void SetTolerance_54(int id0);
  public void SetTolerance(int id0)
  {
    SetTolerance_54(id0);
  }

  private native int GetToleranceMinValue_55();
  public int GetToleranceMinValue()
  {
    return GetToleranceMinValue_55();
  }

  private native int GetToleranceMaxValue_56();
  public int GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_56();
  }

  private native int GetTolerance_57();
  public int GetTolerance()
  {
    return GetTolerance_57();
  }

  private native double[] GetSelectionPoint_58();
  public double[] GetSelectionPoint()
  {
    return GetSelectionPoint_58();
  }

  private native void SetMoving_59(int id0);
  public void SetMoving(int id0)
  {
    SetMoving_59(id0);
  }

  private native int GetMoving_60();
  public int GetMoving()
  {
    return GetMoving_60();
  }

  private native void MovingOn_61();
  public void MovingOn()
  {
    MovingOn_61();
  }

  private native void MovingOff_62();
  public void MovingOff()
  {
    MovingOff_62();
  }

  private native void SetWindowLocation_63(int id0);
  public void SetWindowLocation(int id0)
  {
    SetWindowLocation_63(id0);
  }

  private native int GetWindowLocation_64();
  public int GetWindowLocation()
  {
    return GetWindowLocation_64();
  }

  private native void UpdateWindowLocation_65();
  public void UpdateWindowLocation()
  {
    UpdateWindowLocation_65();
  }

  private native void SetInteractionState_66(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_66(id0);
  }

  private native int GetInteractionStateMinValue_67();
  public int GetInteractionStateMinValue()
  {
    return GetInteractionStateMinValue_67();
  }

  private native int GetInteractionStateMaxValue_68();
  public int GetInteractionStateMaxValue()
  {
    return GetInteractionStateMaxValue_68();
  }

  private native long GetMTime_69();
  public long GetMTime()
  {
    return GetMTime_69();
  }

  private native void BuildRepresentation_70();
  public void BuildRepresentation()
  {
    BuildRepresentation_70();
  }

  private native void StartWidgetInteraction_71(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_71(id0);
  }

  private native void WidgetInteraction_72(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_72(id0);
  }

  private native void GetSize_73(double id0[]);
  public void GetSize(double id0[])
  {
    GetSize_73(id0);
  }

  private native int ComputeInteractionState_74(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_74(id0,id1,id2);
  }

  private native void GetActors2D_75(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_75(id0);
  }

  private native void ReleaseGraphicsResources_76(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_76(id0);
  }

  private native int RenderOverlay_77(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_77(id0);
  }

  private native int RenderOpaqueGeometry_78(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_78(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_79(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_79(id0);
  }

  private native int HasTranslucentPolygonalGeometry_80();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_80();
  }

  private native void SetBWActorDisplayOverlayEdges_81(boolean id0);
  public void SetBWActorDisplayOverlayEdges(boolean id0)
  {
    SetBWActorDisplayOverlayEdges_81(id0);
  }

  private native void SetBWActorDisplayOverlayPolygon_82(boolean id0);
  public void SetBWActorDisplayOverlayPolygon(boolean id0)
  {
    SetBWActorDisplayOverlayPolygon_82(id0);
  }

  private native void SetBorderColor_83(double id0,double id1,double id2);
  public void SetBorderColor(double id0,double id1,double id2)
  {
    SetBorderColor_83(id0,id1,id2);
  }

  private native void SetBorderColor_84(double id0[]);
  public void SetBorderColor(double id0[])
  {
    SetBorderColor_84(id0);
  }

  private native double[] GetBorderColor_85();
  public double[] GetBorderColor()
  {
    return GetBorderColor_85();
  }

  private native void SetBorderThickness_86(float id0);
  public void SetBorderThickness(float id0)
  {
    SetBorderThickness_86(id0);
  }

  private native float GetBorderThicknessMinValue_87();
  public float GetBorderThicknessMinValue()
  {
    return GetBorderThicknessMinValue_87();
  }

  private native float GetBorderThicknessMaxValue_88();
  public float GetBorderThicknessMaxValue()
  {
    return GetBorderThicknessMaxValue_88();
  }

  private native float GetBorderThickness_89();
  public float GetBorderThickness()
  {
    return GetBorderThickness_89();
  }

  private native void SetCornerRadiusStrength_90(double id0);
  public void SetCornerRadiusStrength(double id0)
  {
    SetCornerRadiusStrength_90(id0);
  }

  private native double GetCornerRadiusStrengthMinValue_91();
  public double GetCornerRadiusStrengthMinValue()
  {
    return GetCornerRadiusStrengthMinValue_91();
  }

  private native double GetCornerRadiusStrengthMaxValue_92();
  public double GetCornerRadiusStrengthMaxValue()
  {
    return GetCornerRadiusStrengthMaxValue_92();
  }

  private native double GetCornerRadiusStrength_93();
  public double GetCornerRadiusStrength()
  {
    return GetCornerRadiusStrength_93();
  }

  private native void SetCornerResolution_94(int id0);
  public void SetCornerResolution(int id0)
  {
    SetCornerResolution_94(id0);
  }

  private native int GetCornerResolutionMinValue_95();
  public int GetCornerResolutionMinValue()
  {
    return GetCornerResolutionMinValue_95();
  }

  private native int GetCornerResolutionMaxValue_96();
  public int GetCornerResolutionMaxValue()
  {
    return GetCornerResolutionMaxValue_96();
  }

  private native int GetCornerResolution_97();
  public int GetCornerResolution()
  {
    return GetCornerResolution_97();
  }

  private native void SetPolygonColor_98(double id0,double id1,double id2);
  public void SetPolygonColor(double id0,double id1,double id2)
  {
    SetPolygonColor_98(id0,id1,id2);
  }

  private native void SetPolygonColor_99(double id0[]);
  public void SetPolygonColor(double id0[])
  {
    SetPolygonColor_99(id0);
  }

  private native double[] GetPolygonColor_100();
  public double[] GetPolygonColor()
  {
    return GetPolygonColor_100();
  }

  private native void SetPolygonOpacity_101(double id0);
  public void SetPolygonOpacity(double id0)
  {
    SetPolygonOpacity_101(id0);
  }

  private native double GetPolygonOpacityMinValue_102();
  public double GetPolygonOpacityMinValue()
  {
    return GetPolygonOpacityMinValue_102();
  }

  private native double GetPolygonOpacityMaxValue_103();
  public double GetPolygonOpacityMaxValue()
  {
    return GetPolygonOpacityMaxValue_103();
  }

  private native double GetPolygonOpacity_104();
  public double GetPolygonOpacity()
  {
    return GetPolygonOpacity_104();
  }

  private native void SetPolygonRGBA_105(double id0[]);
  public void SetPolygonRGBA(double id0[])
  {
    SetPolygonRGBA_105(id0);
  }

  private native void SetPolygonRGBA_106(double id0,double id1,double id2,double id3);
  public void SetPolygonRGBA(double id0,double id1,double id2,double id3)
  {
    SetPolygonRGBA_106(id0,id1,id2,id3);
  }

  private native void GetPolygonRGBA_107(double id0[]);
  public void GetPolygonRGBA(double id0[])
  {
    GetPolygonRGBA_107(id0);
  }

  public vtkBorderRepresentation() { super(); }

  public vtkBorderRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
