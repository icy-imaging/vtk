// java wrapper for vtkScalarBarActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkScalarBarActor extends vtkActor2D
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

  private native int RenderOpaqueGeometry_4(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_4(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_5(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_5(id0);
  }

  private native int RenderOverlay_6(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_6(id0);
  }

  private native int HasTranslucentPolygonalGeometry_7();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_7();
  }

  private native void ReleaseGraphicsResources_8(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_8(id0);
  }

  private native void GetScalarBarRect_9(int id0[],vtkViewport id1);
  public void GetScalarBarRect(int id0[],vtkViewport id1)
  {
    GetScalarBarRect_9(id0,id1);
  }

  private native void SetLookupTable_10(vtkScalarsToColors id0);
  public void SetLookupTable(vtkScalarsToColors id0)
  {
    SetLookupTable_10(id0);
  }

  private native long GetLookupTable_11();
  public vtkScalarsToColors GetLookupTable()
  {
    long temp = GetLookupTable_11();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOpacityFunction_12(vtkPiecewiseFunction id0);
  public void SetOpacityFunction(vtkPiecewiseFunction id0)
  {
    SetOpacityFunction_12(id0);
  }

  private native long GetOpacityFunction_13();
  public vtkPiecewiseFunction GetOpacityFunction()
  {
    long temp = GetOpacityFunction_13();

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseOpacity_14(int id0);
  public void SetUseOpacity(int id0)
  {
    SetUseOpacity_14(id0);
  }

  private native int GetUseOpacity_15();
  public int GetUseOpacity()
  {
    return GetUseOpacity_15();
  }

  private native void UseOpacityOn_16();
  public void UseOpacityOn()
  {
    UseOpacityOn_16();
  }

  private native void UseOpacityOff_17();
  public void UseOpacityOff()
  {
    UseOpacityOff_17();
  }

  private native void SetMaximumNumberOfColors_18(int id0);
  public void SetMaximumNumberOfColors(int id0)
  {
    SetMaximumNumberOfColors_18(id0);
  }

  private native int GetMaximumNumberOfColorsMinValue_19();
  public int GetMaximumNumberOfColorsMinValue()
  {
    return GetMaximumNumberOfColorsMinValue_19();
  }

  private native int GetMaximumNumberOfColorsMaxValue_20();
  public int GetMaximumNumberOfColorsMaxValue()
  {
    return GetMaximumNumberOfColorsMaxValue_20();
  }

  private native int GetMaximumNumberOfColors_21();
  public int GetMaximumNumberOfColors()
  {
    return GetMaximumNumberOfColors_21();
  }

  private native void SetNumberOfLabels_22(int id0);
  public void SetNumberOfLabels(int id0)
  {
    SetNumberOfLabels_22(id0);
  }

  private native int GetNumberOfLabelsMinValue_23();
  public int GetNumberOfLabelsMinValue()
  {
    return GetNumberOfLabelsMinValue_23();
  }

  private native int GetNumberOfLabelsMaxValue_24();
  public int GetNumberOfLabelsMaxValue()
  {
    return GetNumberOfLabelsMaxValue_24();
  }

  private native int GetNumberOfLabels_25();
  public int GetNumberOfLabels()
  {
    return GetNumberOfLabels_25();
  }

  private native void SetCustomLabels_26(vtkDoubleArray id0);
  public void SetCustomLabels(vtkDoubleArray id0)
  {
    SetCustomLabels_26(id0);
  }

  private native long GetCustomLabels_27();
  public vtkDoubleArray GetCustomLabels()
  {
    long temp = GetCustomLabels_27();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetUseCustomLabels_28();
  public boolean GetUseCustomLabels()
  {
    return GetUseCustomLabels_28();
  }

  private native void SetUseCustomLabels_29(boolean id0);
  public void SetUseCustomLabels(boolean id0)
  {
    SetUseCustomLabels_29(id0);
  }

  private native void UseCustomLabelsOn_30();
  public void UseCustomLabelsOn()
  {
    UseCustomLabelsOn_30();
  }

  private native void UseCustomLabelsOff_31();
  public void UseCustomLabelsOff()
  {
    UseCustomLabelsOff_31();
  }

  private native void SetOrientation_32(int id0);
  public void SetOrientation(int id0)
  {
    SetOrientation_32(id0);
  }

  private native int GetOrientationMinValue_33();
  public int GetOrientationMinValue()
  {
    return GetOrientationMinValue_33();
  }

  private native int GetOrientationMaxValue_34();
  public int GetOrientationMaxValue()
  {
    return GetOrientationMaxValue_34();
  }

  private native int GetOrientation_35();
  public int GetOrientation()
  {
    return GetOrientation_35();
  }

  private native void SetOrientationToHorizontal_36();
  public void SetOrientationToHorizontal()
  {
    SetOrientationToHorizontal_36();
  }

  private native void SetOrientationToVertical_37();
  public void SetOrientationToVertical()
  {
    SetOrientationToVertical_37();
  }

  private native boolean GetForceVerticalTitle_38();
  public boolean GetForceVerticalTitle()
  {
    return GetForceVerticalTitle_38();
  }

  private native void SetForceVerticalTitle_39(boolean id0);
  public void SetForceVerticalTitle(boolean id0)
  {
    SetForceVerticalTitle_39(id0);
  }

  private native void SetTitleTextProperty_40(vtkTextProperty id0);
  public void SetTitleTextProperty(vtkTextProperty id0)
  {
    SetTitleTextProperty_40(id0);
  }

  private native long GetTitleTextProperty_41();
  public vtkTextProperty GetTitleTextProperty()
  {
    long temp = GetTitleTextProperty_41();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelTextProperty_42(vtkTextProperty id0);
  public void SetLabelTextProperty(vtkTextProperty id0)
  {
    SetLabelTextProperty_42(id0);
  }

  private native long GetLabelTextProperty_43();
  public vtkTextProperty GetLabelTextProperty()
  {
    long temp = GetLabelTextProperty_43();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAnnotationTextProperty_44(vtkTextProperty id0);
  public void SetAnnotationTextProperty(vtkTextProperty id0)
  {
    SetAnnotationTextProperty_44(id0);
  }

  private native long GetAnnotationTextProperty_45();
  public vtkTextProperty GetAnnotationTextProperty()
  {
    long temp = GetAnnotationTextProperty_45();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelFormat_46(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_46(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_47();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_47(), StandardCharsets.UTF_8);
  }

  private native void SetTitle_48(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_48(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_49();
  public String GetTitle()
  {
    return new String(GetTitle_49(), StandardCharsets.UTF_8);
  }

  private native void SetComponentTitle_50(byte[] id0, int len0);
  public void SetComponentTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetComponentTitle_50(bytes0, bytes0.length);
  }

  private native byte[] GetComponentTitle_51();
  public String GetComponentTitle()
  {
    return new String(GetComponentTitle_51(), StandardCharsets.UTF_8);
  }

  private native void ShallowCopy_52(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_52(id0);
  }

  private native void SetTextureGridWidth_53(double id0);
  public void SetTextureGridWidth(double id0)
  {
    SetTextureGridWidth_53(id0);
  }

  private native double GetTextureGridWidth_54();
  public double GetTextureGridWidth()
  {
    return GetTextureGridWidth_54();
  }

  private native long GetTextureActor_55();
  public vtkTexturedActor2D GetTextureActor()
  {
    long temp = GetTextureActor_55();

    if (temp == 0) return null;
    return (vtkTexturedActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTextPosition_56(int id0);
  public void SetTextPosition(int id0)
  {
    SetTextPosition_56(id0);
  }

  private native int GetTextPositionMinValue_57();
  public int GetTextPositionMinValue()
  {
    return GetTextPositionMinValue_57();
  }

  private native int GetTextPositionMaxValue_58();
  public int GetTextPositionMaxValue()
  {
    return GetTextPositionMaxValue_58();
  }

  private native int GetTextPosition_59();
  public int GetTextPosition()
  {
    return GetTextPosition_59();
  }

  private native void SetTextPositionToPrecedeScalarBar_60();
  public void SetTextPositionToPrecedeScalarBar()
  {
    SetTextPositionToPrecedeScalarBar_60();
  }

  private native void SetTextPositionToSucceedScalarBar_61();
  public void SetTextPositionToSucceedScalarBar()
  {
    SetTextPositionToSucceedScalarBar_61();
  }

  private native void SetMaximumWidthInPixels_62(int id0);
  public void SetMaximumWidthInPixels(int id0)
  {
    SetMaximumWidthInPixels_62(id0);
  }

  private native int GetMaximumWidthInPixels_63();
  public int GetMaximumWidthInPixels()
  {
    return GetMaximumWidthInPixels_63();
  }

  private native void SetMaximumHeightInPixels_64(int id0);
  public void SetMaximumHeightInPixels(int id0)
  {
    SetMaximumHeightInPixels_64(id0);
  }

  private native int GetMaximumHeightInPixels_65();
  public int GetMaximumHeightInPixels()
  {
    return GetMaximumHeightInPixels_65();
  }

  private native void SetAnnotationLeaderPadding_66(double id0);
  public void SetAnnotationLeaderPadding(double id0)
  {
    SetAnnotationLeaderPadding_66(id0);
  }

  private native double GetAnnotationLeaderPadding_67();
  public double GetAnnotationLeaderPadding()
  {
    return GetAnnotationLeaderPadding_67();
  }

  private native void SetDrawAnnotations_68(int id0);
  public void SetDrawAnnotations(int id0)
  {
    SetDrawAnnotations_68(id0);
  }

  private native int GetDrawAnnotations_69();
  public int GetDrawAnnotations()
  {
    return GetDrawAnnotations_69();
  }

  private native void DrawAnnotationsOn_70();
  public void DrawAnnotationsOn()
  {
    DrawAnnotationsOn_70();
  }

  private native void DrawAnnotationsOff_71();
  public void DrawAnnotationsOff()
  {
    DrawAnnotationsOff_71();
  }

  private native void SetDrawNanAnnotation_72(int id0);
  public void SetDrawNanAnnotation(int id0)
  {
    SetDrawNanAnnotation_72(id0);
  }

  private native int GetDrawNanAnnotation_73();
  public int GetDrawNanAnnotation()
  {
    return GetDrawNanAnnotation_73();
  }

  private native void DrawNanAnnotationOn_74();
  public void DrawNanAnnotationOn()
  {
    DrawNanAnnotationOn_74();
  }

  private native void DrawNanAnnotationOff_75();
  public void DrawNanAnnotationOff()
  {
    DrawNanAnnotationOff_75();
  }

  private native void SetDrawBelowRangeSwatch_76(boolean id0);
  public void SetDrawBelowRangeSwatch(boolean id0)
  {
    SetDrawBelowRangeSwatch_76(id0);
  }

  private native boolean GetDrawBelowRangeSwatch_77();
  public boolean GetDrawBelowRangeSwatch()
  {
    return GetDrawBelowRangeSwatch_77();
  }

  private native void DrawBelowRangeSwatchOn_78();
  public void DrawBelowRangeSwatchOn()
  {
    DrawBelowRangeSwatchOn_78();
  }

  private native void DrawBelowRangeSwatchOff_79();
  public void DrawBelowRangeSwatchOff()
  {
    DrawBelowRangeSwatchOff_79();
  }

  private native void SetBelowRangeAnnotation_80(byte[] id0, int len0);
  public void SetBelowRangeAnnotation(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBelowRangeAnnotation_80(bytes0, bytes0.length);
  }

  private native byte[] GetBelowRangeAnnotation_81();
  public String GetBelowRangeAnnotation()
  {
    return new String(GetBelowRangeAnnotation_81(), StandardCharsets.UTF_8);
  }

  private native void SetDrawAboveRangeSwatch_82(boolean id0);
  public void SetDrawAboveRangeSwatch(boolean id0)
  {
    SetDrawAboveRangeSwatch_82(id0);
  }

  private native boolean GetDrawAboveRangeSwatch_83();
  public boolean GetDrawAboveRangeSwatch()
  {
    return GetDrawAboveRangeSwatch_83();
  }

  private native void DrawAboveRangeSwatchOn_84();
  public void DrawAboveRangeSwatchOn()
  {
    DrawAboveRangeSwatchOn_84();
  }

  private native void DrawAboveRangeSwatchOff_85();
  public void DrawAboveRangeSwatchOff()
  {
    DrawAboveRangeSwatchOff_85();
  }

  private native void SetAboveRangeAnnotation_86(byte[] id0, int len0);
  public void SetAboveRangeAnnotation(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAboveRangeAnnotation_86(bytes0, bytes0.length);
  }

  private native byte[] GetAboveRangeAnnotation_87();
  public String GetAboveRangeAnnotation()
  {
    return new String(GetAboveRangeAnnotation_87(), StandardCharsets.UTF_8);
  }

  private native void SetFixedAnnotationLeaderLineColor_88(int id0);
  public void SetFixedAnnotationLeaderLineColor(int id0)
  {
    SetFixedAnnotationLeaderLineColor_88(id0);
  }

  private native int GetFixedAnnotationLeaderLineColor_89();
  public int GetFixedAnnotationLeaderLineColor()
  {
    return GetFixedAnnotationLeaderLineColor_89();
  }

  private native void FixedAnnotationLeaderLineColorOn_90();
  public void FixedAnnotationLeaderLineColorOn()
  {
    FixedAnnotationLeaderLineColorOn_90();
  }

  private native void FixedAnnotationLeaderLineColorOff_91();
  public void FixedAnnotationLeaderLineColorOff()
  {
    FixedAnnotationLeaderLineColorOff_91();
  }

  private native void SetNanAnnotation_92(byte[] id0, int len0);
  public void SetNanAnnotation(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNanAnnotation_92(bytes0, bytes0.length);
  }

  private native byte[] GetNanAnnotation_93();
  public String GetNanAnnotation()
  {
    return new String(GetNanAnnotation_93(), StandardCharsets.UTF_8);
  }

  private native void SetAnnotationTextScaling_94(int id0);
  public void SetAnnotationTextScaling(int id0)
  {
    SetAnnotationTextScaling_94(id0);
  }

  private native int GetAnnotationTextScaling_95();
  public int GetAnnotationTextScaling()
  {
    return GetAnnotationTextScaling_95();
  }

  private native void AnnotationTextScalingOn_96();
  public void AnnotationTextScalingOn()
  {
    AnnotationTextScalingOn_96();
  }

  private native void AnnotationTextScalingOff_97();
  public void AnnotationTextScalingOff()
  {
    AnnotationTextScalingOff_97();
  }

  private native void SetDrawBackground_98(int id0);
  public void SetDrawBackground(int id0)
  {
    SetDrawBackground_98(id0);
  }

  private native int GetDrawBackground_99();
  public int GetDrawBackground()
  {
    return GetDrawBackground_99();
  }

  private native void DrawBackgroundOn_100();
  public void DrawBackgroundOn()
  {
    DrawBackgroundOn_100();
  }

  private native void DrawBackgroundOff_101();
  public void DrawBackgroundOff()
  {
    DrawBackgroundOff_101();
  }

  private native void SetDrawFrame_102(int id0);
  public void SetDrawFrame(int id0)
  {
    SetDrawFrame_102(id0);
  }

  private native int GetDrawFrame_103();
  public int GetDrawFrame()
  {
    return GetDrawFrame_103();
  }

  private native void DrawFrameOn_104();
  public void DrawFrameOn()
  {
    DrawFrameOn_104();
  }

  private native void DrawFrameOff_105();
  public void DrawFrameOff()
  {
    DrawFrameOff_105();
  }

  private native void SetDrawColorBar_106(int id0);
  public void SetDrawColorBar(int id0)
  {
    SetDrawColorBar_106(id0);
  }

  private native int GetDrawColorBar_107();
  public int GetDrawColorBar()
  {
    return GetDrawColorBar_107();
  }

  private native void DrawColorBarOn_108();
  public void DrawColorBarOn()
  {
    DrawColorBarOn_108();
  }

  private native void DrawColorBarOff_109();
  public void DrawColorBarOff()
  {
    DrawColorBarOff_109();
  }

  private native void SetDrawTickLabels_110(int id0);
  public void SetDrawTickLabels(int id0)
  {
    SetDrawTickLabels_110(id0);
  }

  private native int GetDrawTickLabels_111();
  public int GetDrawTickLabels()
  {
    return GetDrawTickLabels_111();
  }

  private native void DrawTickLabelsOn_112();
  public void DrawTickLabelsOn()
  {
    DrawTickLabelsOn_112();
  }

  private native void DrawTickLabelsOff_113();
  public void DrawTickLabelsOff()
  {
    DrawTickLabelsOff_113();
  }

  private native void SetBackgroundProperty_114(vtkProperty2D id0);
  public void SetBackgroundProperty(vtkProperty2D id0)
  {
    SetBackgroundProperty_114(id0);
  }

  private native long GetBackgroundProperty_115();
  public vtkProperty2D GetBackgroundProperty()
  {
    long temp = GetBackgroundProperty_115();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFrameProperty_116(vtkProperty2D id0);
  public void SetFrameProperty(vtkProperty2D id0)
  {
    SetFrameProperty_116(id0);
  }

  private native long GetFrameProperty_117();
  public vtkProperty2D GetFrameProperty()
  {
    long temp = GetFrameProperty_117();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetTextPad_118();
  public int GetTextPad()
  {
    return GetTextPad_118();
  }

  private native void SetTextPad_119(int id0);
  public void SetTextPad(int id0)
  {
    SetTextPad_119(id0);
  }

  private native int GetVerticalTitleSeparation_120();
  public int GetVerticalTitleSeparation()
  {
    return GetVerticalTitleSeparation_120();
  }

  private native void SetVerticalTitleSeparation_121(int id0);
  public void SetVerticalTitleSeparation(int id0)
  {
    SetVerticalTitleSeparation_121(id0);
  }

  private native double GetBarRatio_122();
  public double GetBarRatio()
  {
    return GetBarRatio_122();
  }

  private native void SetBarRatio_123(double id0);
  public void SetBarRatio(double id0)
  {
    SetBarRatio_123(id0);
  }

  private native double GetBarRatioMinValue_124();
  public double GetBarRatioMinValue()
  {
    return GetBarRatioMinValue_124();
  }

  private native double GetBarRatioMaxValue_125();
  public double GetBarRatioMaxValue()
  {
    return GetBarRatioMaxValue_125();
  }

  private native double GetTitleRatio_126();
  public double GetTitleRatio()
  {
    return GetTitleRatio_126();
  }

  private native void SetTitleRatio_127(double id0);
  public void SetTitleRatio(double id0)
  {
    SetTitleRatio_127(id0);
  }

  private native double GetTitleRatioMinValue_128();
  public double GetTitleRatioMinValue()
  {
    return GetTitleRatioMinValue_128();
  }

  private native double GetTitleRatioMaxValue_129();
  public double GetTitleRatioMaxValue()
  {
    return GetTitleRatioMaxValue_129();
  }

  private native void SetUnconstrainedFontSize_130(boolean id0);
  public void SetUnconstrainedFontSize(boolean id0)
  {
    SetUnconstrainedFontSize_130(id0);
  }

  private native boolean GetUnconstrainedFontSize_131();
  public boolean GetUnconstrainedFontSize()
  {
    return GetUnconstrainedFontSize_131();
  }

  private native void UnconstrainedFontSizeOn_132();
  public void UnconstrainedFontSizeOn()
  {
    UnconstrainedFontSizeOn_132();
  }

  private native void UnconstrainedFontSizeOff_133();
  public void UnconstrainedFontSizeOff()
  {
    UnconstrainedFontSizeOff_133();
  }

  public vtkScalarBarActor() { super(); }

  public vtkScalarBarActor(long id) { super(id); }
  public native long   VTKInit();

}
