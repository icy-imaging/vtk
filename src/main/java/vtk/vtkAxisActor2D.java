// java wrapper for vtkAxisActor2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAxisActor2D extends vtkActor2D
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

  private native long GetPoint1Coordinate_4();
  public vtkCoordinate GetPoint1Coordinate()
  {
    long temp = GetPoint1Coordinate_4();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPoint1_5(double id0[]);
  public void SetPoint1(double id0[])
  {
    SetPoint1_5(id0);
  }

  private native void SetPoint1_6(double id0,double id1);
  public void SetPoint1(double id0,double id1)
  {
    SetPoint1_6(id0,id1);
  }

  private native long GetPoint2Coordinate_7();
  public vtkCoordinate GetPoint2Coordinate()
  {
    long temp = GetPoint2Coordinate_7();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPoint2_8(double id0[]);
  public void SetPoint2(double id0[])
  {
    SetPoint2_8(id0);
  }

  private native void SetPoint2_9(double id0,double id1);
  public void SetPoint2(double id0,double id1)
  {
    SetPoint2_9(id0,id1);
  }

  private native void SetRange_10(double id0,double id1);
  public void SetRange(double id0,double id1)
  {
    SetRange_10(id0,id1);
  }

  private native void SetRange_11(double id0[]);
  public void SetRange(double id0[])
  {
    SetRange_11(id0);
  }

  private native double[] GetRange_12();
  public double[] GetRange()
  {
    return GetRange_12();
  }

  private native void SetRulerMode_13(int id0);
  public void SetRulerMode(int id0)
  {
    SetRulerMode_13(id0);
  }

  private native int GetRulerMode_14();
  public int GetRulerMode()
  {
    return GetRulerMode_14();
  }

  private native void RulerModeOn_15();
  public void RulerModeOn()
  {
    RulerModeOn_15();
  }

  private native void RulerModeOff_16();
  public void RulerModeOff()
  {
    RulerModeOff_16();
  }

  private native void SetRulerDistance_17(double id0);
  public void SetRulerDistance(double id0)
  {
    SetRulerDistance_17(id0);
  }

  private native double GetRulerDistanceMinValue_18();
  public double GetRulerDistanceMinValue()
  {
    return GetRulerDistanceMinValue_18();
  }

  private native double GetRulerDistanceMaxValue_19();
  public double GetRulerDistanceMaxValue()
  {
    return GetRulerDistanceMaxValue_19();
  }

  private native double GetRulerDistance_20();
  public double GetRulerDistance()
  {
    return GetRulerDistance_20();
  }

  private native void SetNumberOfLabels_21(int id0);
  public void SetNumberOfLabels(int id0)
  {
    SetNumberOfLabels_21(id0);
  }

  private native int GetNumberOfLabelsMinValue_22();
  public int GetNumberOfLabelsMinValue()
  {
    return GetNumberOfLabelsMinValue_22();
  }

  private native int GetNumberOfLabelsMaxValue_23();
  public int GetNumberOfLabelsMaxValue()
  {
    return GetNumberOfLabelsMaxValue_23();
  }

  private native int GetNumberOfLabels_24();
  public int GetNumberOfLabels()
  {
    return GetNumberOfLabels_24();
  }

  private native void SetPrecision_25(int id0);
  public void SetPrecision(int id0)
  {
    SetPrecision_25(id0);
  }

  private native int GetPrecisionMinValue_26();
  public int GetPrecisionMinValue()
  {
    return GetPrecisionMinValue_26();
  }

  private native int GetPrecisionMaxValue_27();
  public int GetPrecisionMaxValue()
  {
    return GetPrecisionMaxValue_27();
  }

  private native int GetPrecision_28();
  public int GetPrecision()
  {
    return GetPrecision_28();
  }

  private native void SetNotation_29(int id0);
  public void SetNotation(int id0)
  {
    SetNotation_29(id0);
  }

  private native int GetNotationMinValue_30();
  public int GetNotationMinValue()
  {
    return GetNotationMinValue_30();
  }

  private native int GetNotationMaxValue_31();
  public int GetNotationMaxValue()
  {
    return GetNotationMaxValue_31();
  }

  private native int GetNotation_32();
  public int GetNotation()
  {
    return GetNotation_32();
  }

  private native void SetLabelFormat_33(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_33(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_34();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_34(), StandardCharsets.UTF_8);
  }

  private native void SetSnapLabelsToGrid_35(boolean id0);
  public void SetSnapLabelsToGrid(boolean id0)
  {
    SetSnapLabelsToGrid_35(id0);
  }

  private native boolean GetSnapLabelsToGrid_36();
  public boolean GetSnapLabelsToGrid()
  {
    return GetSnapLabelsToGrid_36();
  }

  private native void SnapLabelsToGridOn_37();
  public void SnapLabelsToGridOn()
  {
    SnapLabelsToGridOn_37();
  }

  private native void SnapLabelsToGridOff_38();
  public void SnapLabelsToGridOff()
  {
    SnapLabelsToGridOff_38();
  }

  private native void SetAdjustLabels_39(int id0);
  public void SetAdjustLabels(int id0)
  {
    SetAdjustLabels_39(id0);
  }

  private native int GetAdjustLabels_40();
  public int GetAdjustLabels()
  {
    return GetAdjustLabels_40();
  }

  private native void AdjustLabelsOn_41();
  public void AdjustLabelsOn()
  {
    AdjustLabelsOn_41();
  }

  private native void AdjustLabelsOff_42();
  public void AdjustLabelsOff()
  {
    AdjustLabelsOff_42();
  }

  private native void SetSkipFirstTick_43(boolean id0);
  public void SetSkipFirstTick(boolean id0)
  {
    SetSkipFirstTick_43(id0);
  }

  private native boolean GetSkipFirstTick_44();
  public boolean GetSkipFirstTick()
  {
    return GetSkipFirstTick_44();
  }

  private native void SkipFirstTickOn_45();
  public void SkipFirstTickOn()
  {
    SkipFirstTickOn_45();
  }

  private native void SkipFirstTickOff_46();
  public void SkipFirstTickOff()
  {
    SkipFirstTickOff_46();
  }

  private native void GetAdjustedRange_47(double id0[]);
  public void GetAdjustedRange(double id0[])
  {
    GetAdjustedRange_47(id0);
  }

  private native int GetAdjustedNumberOfLabels_48();
  public int GetAdjustedNumberOfLabels()
  {
    return GetAdjustedNumberOfLabels_48();
  }

  private native long GetTickPositions_49();
  public vtkPoints GetTickPositions()
  {
    long temp = GetTickPositions_49();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTitle_50(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_50(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_51();
  public String GetTitle()
  {
    return new String(GetTitle_51(), StandardCharsets.UTF_8);
  }

  private native void SetTitleTextProperty_52(vtkTextProperty id0);
  public void SetTitleTextProperty(vtkTextProperty id0)
  {
    SetTitleTextProperty_52(id0);
  }

  private native long GetTitleTextProperty_53();
  public vtkTextProperty GetTitleTextProperty()
  {
    long temp = GetTitleTextProperty_53();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelTextProperty_54(vtkTextProperty id0);
  public void SetLabelTextProperty(vtkTextProperty id0)
  {
    SetLabelTextProperty_54(id0);
  }

  private native long GetLabelTextProperty_55();
  public vtkTextProperty GetLabelTextProperty()
  {
    long temp = GetLabelTextProperty_55();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTickLength_56(int id0);
  public void SetTickLength(int id0)
  {
    SetTickLength_56(id0);
  }

  private native int GetTickLengthMinValue_57();
  public int GetTickLengthMinValue()
  {
    return GetTickLengthMinValue_57();
  }

  private native int GetTickLengthMaxValue_58();
  public int GetTickLengthMaxValue()
  {
    return GetTickLengthMaxValue_58();
  }

  private native int GetTickLength_59();
  public int GetTickLength()
  {
    return GetTickLength_59();
  }

  private native void SetNumberOfMinorTicks_60(int id0);
  public void SetNumberOfMinorTicks(int id0)
  {
    SetNumberOfMinorTicks_60(id0);
  }

  private native int GetNumberOfMinorTicksMinValue_61();
  public int GetNumberOfMinorTicksMinValue()
  {
    return GetNumberOfMinorTicksMinValue_61();
  }

  private native int GetNumberOfMinorTicksMaxValue_62();
  public int GetNumberOfMinorTicksMaxValue()
  {
    return GetNumberOfMinorTicksMaxValue_62();
  }

  private native int GetNumberOfMinorTicks_63();
  public int GetNumberOfMinorTicks()
  {
    return GetNumberOfMinorTicks_63();
  }

  private native void SetMinorTickLength_64(int id0);
  public void SetMinorTickLength(int id0)
  {
    SetMinorTickLength_64(id0);
  }

  private native int GetMinorTickLengthMinValue_65();
  public int GetMinorTickLengthMinValue()
  {
    return GetMinorTickLengthMinValue_65();
  }

  private native int GetMinorTickLengthMaxValue_66();
  public int GetMinorTickLengthMaxValue()
  {
    return GetMinorTickLengthMaxValue_66();
  }

  private native int GetMinorTickLength_67();
  public int GetMinorTickLength()
  {
    return GetMinorTickLength_67();
  }

  private native void SetTickOffset_68(int id0);
  public void SetTickOffset(int id0)
  {
    SetTickOffset_68(id0);
  }

  private native int GetTickOffsetMinValue_69();
  public int GetTickOffsetMinValue()
  {
    return GetTickOffsetMinValue_69();
  }

  private native int GetTickOffsetMaxValue_70();
  public int GetTickOffsetMaxValue()
  {
    return GetTickOffsetMaxValue_70();
  }

  private native int GetTickOffset_71();
  public int GetTickOffset()
  {
    return GetTickOffset_71();
  }

  private native void SetAxisVisibility_72(int id0);
  public void SetAxisVisibility(int id0)
  {
    SetAxisVisibility_72(id0);
  }

  private native int GetAxisVisibility_73();
  public int GetAxisVisibility()
  {
    return GetAxisVisibility_73();
  }

  private native void AxisVisibilityOn_74();
  public void AxisVisibilityOn()
  {
    AxisVisibilityOn_74();
  }

  private native void AxisVisibilityOff_75();
  public void AxisVisibilityOff()
  {
    AxisVisibilityOff_75();
  }

  private native void SetTickVisibility_76(int id0);
  public void SetTickVisibility(int id0)
  {
    SetTickVisibility_76(id0);
  }

  private native int GetTickVisibility_77();
  public int GetTickVisibility()
  {
    return GetTickVisibility_77();
  }

  private native void TickVisibilityOn_78();
  public void TickVisibilityOn()
  {
    TickVisibilityOn_78();
  }

  private native void TickVisibilityOff_79();
  public void TickVisibilityOff()
  {
    TickVisibilityOff_79();
  }

  private native void SetLabelVisibility_80(int id0);
  public void SetLabelVisibility(int id0)
  {
    SetLabelVisibility_80(id0);
  }

  private native int GetLabelVisibility_81();
  public int GetLabelVisibility()
  {
    return GetLabelVisibility_81();
  }

  private native void LabelVisibilityOn_82();
  public void LabelVisibilityOn()
  {
    LabelVisibilityOn_82();
  }

  private native void LabelVisibilityOff_83();
  public void LabelVisibilityOff()
  {
    LabelVisibilityOff_83();
  }

  private native void SetTitleVisibility_84(int id0);
  public void SetTitleVisibility(int id0)
  {
    SetTitleVisibility_84(id0);
  }

  private native int GetTitleVisibility_85();
  public int GetTitleVisibility()
  {
    return GetTitleVisibility_85();
  }

  private native void TitleVisibilityOn_86();
  public void TitleVisibilityOn()
  {
    TitleVisibilityOn_86();
  }

  private native void TitleVisibilityOff_87();
  public void TitleVisibilityOff()
  {
    TitleVisibilityOff_87();
  }

  private native void SetTitlePosition_88(double id0);
  public void SetTitlePosition(double id0)
  {
    SetTitlePosition_88(id0);
  }

  private native double GetTitlePosition_89();
  public double GetTitlePosition()
  {
    return GetTitlePosition_89();
  }

  private native void SetFontFactor_90(double id0);
  public void SetFontFactor(double id0)
  {
    SetFontFactor_90(id0);
  }

  private native double GetFontFactorMinValue_91();
  public double GetFontFactorMinValue()
  {
    return GetFontFactorMinValue_91();
  }

  private native double GetFontFactorMaxValue_92();
  public double GetFontFactorMaxValue()
  {
    return GetFontFactorMaxValue_92();
  }

  private native double GetFontFactor_93();
  public double GetFontFactor()
  {
    return GetFontFactor_93();
  }

  private native void SetLabelFactor_94(double id0);
  public void SetLabelFactor(double id0)
  {
    SetLabelFactor_94(id0);
  }

  private native double GetLabelFactorMinValue_95();
  public double GetLabelFactorMinValue()
  {
    return GetLabelFactorMinValue_95();
  }

  private native double GetLabelFactorMaxValue_96();
  public double GetLabelFactorMaxValue()
  {
    return GetLabelFactorMaxValue_96();
  }

  private native double GetLabelFactor_97();
  public double GetLabelFactor()
  {
    return GetLabelFactor_97();
  }

  private native int UpdateGeometryAndRenderOpaqueGeometry_98(vtkViewport id0,boolean id1);
  public int UpdateGeometryAndRenderOpaqueGeometry(vtkViewport id0,boolean id1)
  {
    return UpdateGeometryAndRenderOpaqueGeometry_98(id0,id1);
  }

  private native int RenderOverlay_99(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_99(id0);
  }

  private native int RenderOpaqueGeometry_100(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_100(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_101(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_101(id0);
  }

  private native int HasTranslucentPolygonalGeometry_102();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_102();
  }

  private native void ReleaseGraphicsResources_103(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_103(id0);
  }

  private native void SetSizeFontRelativeToAxis_104(int id0);
  public void SetSizeFontRelativeToAxis(int id0)
  {
    SetSizeFontRelativeToAxis_104(id0);
  }

  private native int GetSizeFontRelativeToAxis_105();
  public int GetSizeFontRelativeToAxis()
  {
    return GetSizeFontRelativeToAxis_105();
  }

  private native void SizeFontRelativeToAxisOn_106();
  public void SizeFontRelativeToAxisOn()
  {
    SizeFontRelativeToAxisOn_106();
  }

  private native void SizeFontRelativeToAxisOff_107();
  public void SizeFontRelativeToAxisOff()
  {
    SizeFontRelativeToAxisOff_107();
  }

  private native void SetUseFontSizeFromProperty_108(int id0);
  public void SetUseFontSizeFromProperty(int id0)
  {
    SetUseFontSizeFromProperty_108(id0);
  }

  private native int GetUseFontSizeFromProperty_109();
  public int GetUseFontSizeFromProperty()
  {
    return GetUseFontSizeFromProperty_109();
  }

  private native void UseFontSizeFromPropertyOn_110();
  public void UseFontSizeFromPropertyOn()
  {
    UseFontSizeFromPropertyOn_110();
  }

  private native void UseFontSizeFromPropertyOff_111();
  public void UseFontSizeFromPropertyOff()
  {
    UseFontSizeFromPropertyOff_111();
  }

  private native void ShallowCopy_112(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_112(id0);
  }

  public vtkAxisActor2D() { super(); }

  public vtkAxisActor2D(long id) { super(id); }
  public native long   VTKInit();

}
