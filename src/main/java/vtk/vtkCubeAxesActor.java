// java wrapper for vtkCubeAxesActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCubeAxesActor extends vtkActor
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

  private native int RenderTranslucentGeometry_5(vtkViewport id0);
  public int RenderTranslucentGeometry(vtkViewport id0)
  {
    return RenderTranslucentGeometry_5(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_6(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_6(id0);
  }

  private native int RenderOverlay_7(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_7(id0);
  }

  private native int HasTranslucentPolygonalGeometry_8();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_8();
  }

  private native void SetRebuildAxes_9(boolean id0);
  public void SetRebuildAxes(boolean id0)
  {
    SetRebuildAxes_9(id0);
  }

  private native boolean GetRebuildAxes_10();
  public boolean GetRebuildAxes()
  {
    return GetRebuildAxes_10();
  }

  private native void SetBounds_11(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_11(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_12(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_12(id0);
  }

  private native double[] GetBounds_13();
  public double[] GetBounds()
  {
    return GetBounds_13();
  }

  private native void GetRenderedBounds_14(double id0[]);
  public void GetRenderedBounds(double id0[])
  {
    GetRenderedBounds_14(id0);
  }

  private native void SetXAxisRange_15(double id0,double id1);
  public void SetXAxisRange(double id0,double id1)
  {
    SetXAxisRange_15(id0,id1);
  }

  private native void SetXAxisRange_16(double id0[]);
  public void SetXAxisRange(double id0[])
  {
    SetXAxisRange_16(id0);
  }

  private native void SetYAxisRange_17(double id0,double id1);
  public void SetYAxisRange(double id0,double id1)
  {
    SetYAxisRange_17(id0,id1);
  }

  private native void SetYAxisRange_18(double id0[]);
  public void SetYAxisRange(double id0[])
  {
    SetYAxisRange_18(id0);
  }

  private native void SetZAxisRange_19(double id0,double id1);
  public void SetZAxisRange(double id0,double id1)
  {
    SetZAxisRange_19(id0,id1);
  }

  private native void SetZAxisRange_20(double id0[]);
  public void SetZAxisRange(double id0[])
  {
    SetZAxisRange_20(id0);
  }

  private native double[] GetXAxisRange_21();
  public double[] GetXAxisRange()
  {
    return GetXAxisRange_21();
  }

  private native double[] GetYAxisRange_22();
  public double[] GetYAxisRange()
  {
    return GetYAxisRange_22();
  }

  private native long GetAxisLabels_23(int id0);
  public vtkStringArray GetAxisLabels(int id0)
  {
    long temp = GetAxisLabels_23(id0);

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxisLabels_24(int id0,vtkStringArray id1);
  public void SetAxisLabels(int id0,vtkStringArray id1)
  {
    SetAxisLabels_24(id0,id1);
  }

  private native double[] GetZAxisRange_25();
  public double[] GetZAxisRange()
  {
    return GetZAxisRange_25();
  }

  private native void SetScreenSize_26(double id0);
  public void SetScreenSize(double id0)
  {
    SetScreenSize_26(id0);
  }

  private native double GetScreenSize_27();
  public double GetScreenSize()
  {
    return GetScreenSize_27();
  }

  private native void SetLabelOffset_28(double id0);
  public void SetLabelOffset(double id0)
  {
    SetLabelOffset_28(id0);
  }

  private native double GetLabelOffset_29();
  public double GetLabelOffset()
  {
    return GetLabelOffset_29();
  }

  private native void SetTitleOffset_30(double id0);
  public void SetTitleOffset(double id0)
  {
    SetTitleOffset_30(id0);
  }

  private native double GetTitleOffset_31();
  public double GetTitleOffset()
  {
    return GetTitleOffset_31();
  }

  private native void SetTitleOffset_32(double id0[]);
  public void SetTitleOffset(double id0[])
  {
    SetTitleOffset_32(id0);
  }

  private native void SetCamera_33(vtkCamera id0);
  public void SetCamera(vtkCamera id0)
  {
    SetCamera_33(id0);
  }

  private native long GetCamera_34();
  public vtkCamera GetCamera()
  {
    long temp = GetCamera_34();

    if (temp == 0) return null;
    return (vtkCamera)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFlyMode_35(int id0);
  public void SetFlyMode(int id0)
  {
    SetFlyMode_35(id0);
  }

  private native int GetFlyModeMinValue_36();
  public int GetFlyModeMinValue()
  {
    return GetFlyModeMinValue_36();
  }

  private native int GetFlyModeMaxValue_37();
  public int GetFlyModeMaxValue()
  {
    return GetFlyModeMaxValue_37();
  }

  private native int GetFlyMode_38();
  public int GetFlyMode()
  {
    return GetFlyMode_38();
  }

  private native void SetFlyModeToOuterEdges_39();
  public void SetFlyModeToOuterEdges()
  {
    SetFlyModeToOuterEdges_39();
  }

  private native void SetFlyModeToClosestTriad_40();
  public void SetFlyModeToClosestTriad()
  {
    SetFlyModeToClosestTriad_40();
  }

  private native void SetFlyModeToFurthestTriad_41();
  public void SetFlyModeToFurthestTriad()
  {
    SetFlyModeToFurthestTriad_41();
  }

  private native void SetFlyModeToStaticTriad_42();
  public void SetFlyModeToStaticTriad()
  {
    SetFlyModeToStaticTriad_42();
  }

  private native void SetFlyModeToStaticEdges_43();
  public void SetFlyModeToStaticEdges()
  {
    SetFlyModeToStaticEdges_43();
  }

  private native void SetXTitle_44(byte[] id0, int len0);
  public void SetXTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXTitle_44(bytes0, bytes0.length);
  }

  private native byte[] GetXTitle_45();
  public String GetXTitle()
  {
    return new String(GetXTitle_45(), StandardCharsets.UTF_8);
  }

  private native void SetXUnits_46(byte[] id0, int len0);
  public void SetXUnits(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXUnits_46(bytes0, bytes0.length);
  }

  private native byte[] GetXUnits_47();
  public String GetXUnits()
  {
    return new String(GetXUnits_47(), StandardCharsets.UTF_8);
  }

  private native void SetYTitle_48(byte[] id0, int len0);
  public void SetYTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYTitle_48(bytes0, bytes0.length);
  }

  private native byte[] GetYTitle_49();
  public String GetYTitle()
  {
    return new String(GetYTitle_49(), StandardCharsets.UTF_8);
  }

  private native void SetYUnits_50(byte[] id0, int len0);
  public void SetYUnits(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYUnits_50(bytes0, bytes0.length);
  }

  private native byte[] GetYUnits_51();
  public String GetYUnits()
  {
    return new String(GetYUnits_51(), StandardCharsets.UTF_8);
  }

  private native void SetZTitle_52(byte[] id0, int len0);
  public void SetZTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetZTitle_52(bytes0, bytes0.length);
  }

  private native byte[] GetZTitle_53();
  public String GetZTitle()
  {
    return new String(GetZTitle_53(), StandardCharsets.UTF_8);
  }

  private native void SetZUnits_54(byte[] id0, int len0);
  public void SetZUnits(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetZUnits_54(bytes0, bytes0.length);
  }

  private native byte[] GetZUnits_55();
  public String GetZUnits()
  {
    return new String(GetZUnits_55(), StandardCharsets.UTF_8);
  }

  private native void SetXLabelFormat_56(byte[] id0, int len0);
  public void SetXLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXLabelFormat_56(bytes0, bytes0.length);
  }

  private native byte[] GetXLabelFormat_57();
  public String GetXLabelFormat()
  {
    return new String(GetXLabelFormat_57(), StandardCharsets.UTF_8);
  }

  private native void SetYLabelFormat_58(byte[] id0, int len0);
  public void SetYLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYLabelFormat_58(bytes0, bytes0.length);
  }

  private native byte[] GetYLabelFormat_59();
  public String GetYLabelFormat()
  {
    return new String(GetYLabelFormat_59(), StandardCharsets.UTF_8);
  }

  private native void SetZLabelFormat_60(byte[] id0, int len0);
  public void SetZLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetZLabelFormat_60(bytes0, bytes0.length);
  }

  private native byte[] GetZLabelFormat_61();
  public String GetZLabelFormat()
  {
    return new String(GetZLabelFormat_61(), StandardCharsets.UTF_8);
  }

  private native void SetInertia_62(int id0);
  public void SetInertia(int id0)
  {
    SetInertia_62(id0);
  }

  private native int GetInertiaMinValue_63();
  public int GetInertiaMinValue()
  {
    return GetInertiaMinValue_63();
  }

  private native int GetInertiaMaxValue_64();
  public int GetInertiaMaxValue()
  {
    return GetInertiaMaxValue_64();
  }

  private native int GetInertia_65();
  public int GetInertia()
  {
    return GetInertia_65();
  }

  private native void SetCornerOffset_66(double id0);
  public void SetCornerOffset(double id0)
  {
    SetCornerOffset_66(id0);
  }

  private native double GetCornerOffset_67();
  public double GetCornerOffset()
  {
    return GetCornerOffset_67();
  }

  private native void ReleaseGraphicsResources_68(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_68(id0);
  }

  private native void SetEnableDistanceLOD_69(boolean id0);
  public void SetEnableDistanceLOD(boolean id0)
  {
    SetEnableDistanceLOD_69(id0);
  }

  private native boolean GetEnableDistanceLOD_70();
  public boolean GetEnableDistanceLOD()
  {
    return GetEnableDistanceLOD_70();
  }

  private native void SetDistanceLODThreshold_71(double id0);
  public void SetDistanceLODThreshold(double id0)
  {
    SetDistanceLODThreshold_71(id0);
  }

  private native double GetDistanceLODThresholdMinValue_72();
  public double GetDistanceLODThresholdMinValue()
  {
    return GetDistanceLODThresholdMinValue_72();
  }

  private native double GetDistanceLODThresholdMaxValue_73();
  public double GetDistanceLODThresholdMaxValue()
  {
    return GetDistanceLODThresholdMaxValue_73();
  }

  private native double GetDistanceLODThreshold_74();
  public double GetDistanceLODThreshold()
  {
    return GetDistanceLODThreshold_74();
  }

  private native void SetEnableViewAngleLOD_75(boolean id0);
  public void SetEnableViewAngleLOD(boolean id0)
  {
    SetEnableViewAngleLOD_75(id0);
  }

  private native boolean GetEnableViewAngleLOD_76();
  public boolean GetEnableViewAngleLOD()
  {
    return GetEnableViewAngleLOD_76();
  }

  private native void SetViewAngleLODThreshold_77(double id0);
  public void SetViewAngleLODThreshold(double id0)
  {
    SetViewAngleLODThreshold_77(id0);
  }

  private native double GetViewAngleLODThresholdMinValue_78();
  public double GetViewAngleLODThresholdMinValue()
  {
    return GetViewAngleLODThresholdMinValue_78();
  }

  private native double GetViewAngleLODThresholdMaxValue_79();
  public double GetViewAngleLODThresholdMaxValue()
  {
    return GetViewAngleLODThresholdMaxValue_79();
  }

  private native double GetViewAngleLODThreshold_80();
  public double GetViewAngleLODThreshold()
  {
    return GetViewAngleLODThreshold_80();
  }

  private native void SetXAxisVisibility_81(boolean id0);
  public void SetXAxisVisibility(boolean id0)
  {
    SetXAxisVisibility_81(id0);
  }

  private native boolean GetXAxisVisibility_82();
  public boolean GetXAxisVisibility()
  {
    return GetXAxisVisibility_82();
  }

  private native void XAxisVisibilityOn_83();
  public void XAxisVisibilityOn()
  {
    XAxisVisibilityOn_83();
  }

  private native void XAxisVisibilityOff_84();
  public void XAxisVisibilityOff()
  {
    XAxisVisibilityOff_84();
  }

  private native void SetYAxisVisibility_85(boolean id0);
  public void SetYAxisVisibility(boolean id0)
  {
    SetYAxisVisibility_85(id0);
  }

  private native boolean GetYAxisVisibility_86();
  public boolean GetYAxisVisibility()
  {
    return GetYAxisVisibility_86();
  }

  private native void YAxisVisibilityOn_87();
  public void YAxisVisibilityOn()
  {
    YAxisVisibilityOn_87();
  }

  private native void YAxisVisibilityOff_88();
  public void YAxisVisibilityOff()
  {
    YAxisVisibilityOff_88();
  }

  private native void SetZAxisVisibility_89(boolean id0);
  public void SetZAxisVisibility(boolean id0)
  {
    SetZAxisVisibility_89(id0);
  }

  private native boolean GetZAxisVisibility_90();
  public boolean GetZAxisVisibility()
  {
    return GetZAxisVisibility_90();
  }

  private native void ZAxisVisibilityOn_91();
  public void ZAxisVisibilityOn()
  {
    ZAxisVisibilityOn_91();
  }

  private native void ZAxisVisibilityOff_92();
  public void ZAxisVisibilityOff()
  {
    ZAxisVisibilityOff_92();
  }

  private native void SetXAxisLabelVisibility_93(boolean id0);
  public void SetXAxisLabelVisibility(boolean id0)
  {
    SetXAxisLabelVisibility_93(id0);
  }

  private native boolean GetXAxisLabelVisibility_94();
  public boolean GetXAxisLabelVisibility()
  {
    return GetXAxisLabelVisibility_94();
  }

  private native void XAxisLabelVisibilityOn_95();
  public void XAxisLabelVisibilityOn()
  {
    XAxisLabelVisibilityOn_95();
  }

  private native void XAxisLabelVisibilityOff_96();
  public void XAxisLabelVisibilityOff()
  {
    XAxisLabelVisibilityOff_96();
  }

  private native void SetYAxisLabelVisibility_97(boolean id0);
  public void SetYAxisLabelVisibility(boolean id0)
  {
    SetYAxisLabelVisibility_97(id0);
  }

  private native boolean GetYAxisLabelVisibility_98();
  public boolean GetYAxisLabelVisibility()
  {
    return GetYAxisLabelVisibility_98();
  }

  private native void YAxisLabelVisibilityOn_99();
  public void YAxisLabelVisibilityOn()
  {
    YAxisLabelVisibilityOn_99();
  }

  private native void YAxisLabelVisibilityOff_100();
  public void YAxisLabelVisibilityOff()
  {
    YAxisLabelVisibilityOff_100();
  }

  private native void SetZAxisLabelVisibility_101(boolean id0);
  public void SetZAxisLabelVisibility(boolean id0)
  {
    SetZAxisLabelVisibility_101(id0);
  }

  private native boolean GetZAxisLabelVisibility_102();
  public boolean GetZAxisLabelVisibility()
  {
    return GetZAxisLabelVisibility_102();
  }

  private native void ZAxisLabelVisibilityOn_103();
  public void ZAxisLabelVisibilityOn()
  {
    ZAxisLabelVisibilityOn_103();
  }

  private native void ZAxisLabelVisibilityOff_104();
  public void ZAxisLabelVisibilityOff()
  {
    ZAxisLabelVisibilityOff_104();
  }

  private native void SetXAxisTickVisibility_105(boolean id0);
  public void SetXAxisTickVisibility(boolean id0)
  {
    SetXAxisTickVisibility_105(id0);
  }

  private native boolean GetXAxisTickVisibility_106();
  public boolean GetXAxisTickVisibility()
  {
    return GetXAxisTickVisibility_106();
  }

  private native void XAxisTickVisibilityOn_107();
  public void XAxisTickVisibilityOn()
  {
    XAxisTickVisibilityOn_107();
  }

  private native void XAxisTickVisibilityOff_108();
  public void XAxisTickVisibilityOff()
  {
    XAxisTickVisibilityOff_108();
  }

  private native void SetYAxisTickVisibility_109(boolean id0);
  public void SetYAxisTickVisibility(boolean id0)
  {
    SetYAxisTickVisibility_109(id0);
  }

  private native boolean GetYAxisTickVisibility_110();
  public boolean GetYAxisTickVisibility()
  {
    return GetYAxisTickVisibility_110();
  }

  private native void YAxisTickVisibilityOn_111();
  public void YAxisTickVisibilityOn()
  {
    YAxisTickVisibilityOn_111();
  }

  private native void YAxisTickVisibilityOff_112();
  public void YAxisTickVisibilityOff()
  {
    YAxisTickVisibilityOff_112();
  }

  private native void SetZAxisTickVisibility_113(boolean id0);
  public void SetZAxisTickVisibility(boolean id0)
  {
    SetZAxisTickVisibility_113(id0);
  }

  private native boolean GetZAxisTickVisibility_114();
  public boolean GetZAxisTickVisibility()
  {
    return GetZAxisTickVisibility_114();
  }

  private native void ZAxisTickVisibilityOn_115();
  public void ZAxisTickVisibilityOn()
  {
    ZAxisTickVisibilityOn_115();
  }

  private native void ZAxisTickVisibilityOff_116();
  public void ZAxisTickVisibilityOff()
  {
    ZAxisTickVisibilityOff_116();
  }

  private native void SetXAxisMinorTickVisibility_117(boolean id0);
  public void SetXAxisMinorTickVisibility(boolean id0)
  {
    SetXAxisMinorTickVisibility_117(id0);
  }

  private native boolean GetXAxisMinorTickVisibility_118();
  public boolean GetXAxisMinorTickVisibility()
  {
    return GetXAxisMinorTickVisibility_118();
  }

  private native void XAxisMinorTickVisibilityOn_119();
  public void XAxisMinorTickVisibilityOn()
  {
    XAxisMinorTickVisibilityOn_119();
  }

  private native void XAxisMinorTickVisibilityOff_120();
  public void XAxisMinorTickVisibilityOff()
  {
    XAxisMinorTickVisibilityOff_120();
  }

  private native void SetYAxisMinorTickVisibility_121(boolean id0);
  public void SetYAxisMinorTickVisibility(boolean id0)
  {
    SetYAxisMinorTickVisibility_121(id0);
  }

  private native boolean GetYAxisMinorTickVisibility_122();
  public boolean GetYAxisMinorTickVisibility()
  {
    return GetYAxisMinorTickVisibility_122();
  }

  private native void YAxisMinorTickVisibilityOn_123();
  public void YAxisMinorTickVisibilityOn()
  {
    YAxisMinorTickVisibilityOn_123();
  }

  private native void YAxisMinorTickVisibilityOff_124();
  public void YAxisMinorTickVisibilityOff()
  {
    YAxisMinorTickVisibilityOff_124();
  }

  private native void SetZAxisMinorTickVisibility_125(boolean id0);
  public void SetZAxisMinorTickVisibility(boolean id0)
  {
    SetZAxisMinorTickVisibility_125(id0);
  }

  private native boolean GetZAxisMinorTickVisibility_126();
  public boolean GetZAxisMinorTickVisibility()
  {
    return GetZAxisMinorTickVisibility_126();
  }

  private native void ZAxisMinorTickVisibilityOn_127();
  public void ZAxisMinorTickVisibilityOn()
  {
    ZAxisMinorTickVisibilityOn_127();
  }

  private native void ZAxisMinorTickVisibilityOff_128();
  public void ZAxisMinorTickVisibilityOff()
  {
    ZAxisMinorTickVisibilityOff_128();
  }

  private native void SetDrawXGridlines_129(boolean id0);
  public void SetDrawXGridlines(boolean id0)
  {
    SetDrawXGridlines_129(id0);
  }

  private native boolean GetDrawXGridlines_130();
  public boolean GetDrawXGridlines()
  {
    return GetDrawXGridlines_130();
  }

  private native void DrawXGridlinesOn_131();
  public void DrawXGridlinesOn()
  {
    DrawXGridlinesOn_131();
  }

  private native void DrawXGridlinesOff_132();
  public void DrawXGridlinesOff()
  {
    DrawXGridlinesOff_132();
  }

  private native void SetDrawYGridlines_133(boolean id0);
  public void SetDrawYGridlines(boolean id0)
  {
    SetDrawYGridlines_133(id0);
  }

  private native boolean GetDrawYGridlines_134();
  public boolean GetDrawYGridlines()
  {
    return GetDrawYGridlines_134();
  }

  private native void DrawYGridlinesOn_135();
  public void DrawYGridlinesOn()
  {
    DrawYGridlinesOn_135();
  }

  private native void DrawYGridlinesOff_136();
  public void DrawYGridlinesOff()
  {
    DrawYGridlinesOff_136();
  }

  private native void SetDrawZGridlines_137(boolean id0);
  public void SetDrawZGridlines(boolean id0)
  {
    SetDrawZGridlines_137(id0);
  }

  private native boolean GetDrawZGridlines_138();
  public boolean GetDrawZGridlines()
  {
    return GetDrawZGridlines_138();
  }

  private native void DrawZGridlinesOn_139();
  public void DrawZGridlinesOn()
  {
    DrawZGridlinesOn_139();
  }

  private native void DrawZGridlinesOff_140();
  public void DrawZGridlinesOff()
  {
    DrawZGridlinesOff_140();
  }

  private native void SetDrawXInnerGridlines_141(boolean id0);
  public void SetDrawXInnerGridlines(boolean id0)
  {
    SetDrawXInnerGridlines_141(id0);
  }

  private native boolean GetDrawXInnerGridlines_142();
  public boolean GetDrawXInnerGridlines()
  {
    return GetDrawXInnerGridlines_142();
  }

  private native void DrawXInnerGridlinesOn_143();
  public void DrawXInnerGridlinesOn()
  {
    DrawXInnerGridlinesOn_143();
  }

  private native void DrawXInnerGridlinesOff_144();
  public void DrawXInnerGridlinesOff()
  {
    DrawXInnerGridlinesOff_144();
  }

  private native void SetDrawYInnerGridlines_145(boolean id0);
  public void SetDrawYInnerGridlines(boolean id0)
  {
    SetDrawYInnerGridlines_145(id0);
  }

  private native boolean GetDrawYInnerGridlines_146();
  public boolean GetDrawYInnerGridlines()
  {
    return GetDrawYInnerGridlines_146();
  }

  private native void DrawYInnerGridlinesOn_147();
  public void DrawYInnerGridlinesOn()
  {
    DrawYInnerGridlinesOn_147();
  }

  private native void DrawYInnerGridlinesOff_148();
  public void DrawYInnerGridlinesOff()
  {
    DrawYInnerGridlinesOff_148();
  }

  private native void SetDrawZInnerGridlines_149(boolean id0);
  public void SetDrawZInnerGridlines(boolean id0)
  {
    SetDrawZInnerGridlines_149(id0);
  }

  private native boolean GetDrawZInnerGridlines_150();
  public boolean GetDrawZInnerGridlines()
  {
    return GetDrawZInnerGridlines_150();
  }

  private native void DrawZInnerGridlinesOn_151();
  public void DrawZInnerGridlinesOn()
  {
    DrawZInnerGridlinesOn_151();
  }

  private native void DrawZInnerGridlinesOff_152();
  public void DrawZInnerGridlinesOff()
  {
    DrawZInnerGridlinesOff_152();
  }

  private native void SetDrawXGridpolys_153(boolean id0);
  public void SetDrawXGridpolys(boolean id0)
  {
    SetDrawXGridpolys_153(id0);
  }

  private native boolean GetDrawXGridpolys_154();
  public boolean GetDrawXGridpolys()
  {
    return GetDrawXGridpolys_154();
  }

  private native void DrawXGridpolysOn_155();
  public void DrawXGridpolysOn()
  {
    DrawXGridpolysOn_155();
  }

  private native void DrawXGridpolysOff_156();
  public void DrawXGridpolysOff()
  {
    DrawXGridpolysOff_156();
  }

  private native void SetDrawYGridpolys_157(boolean id0);
  public void SetDrawYGridpolys(boolean id0)
  {
    SetDrawYGridpolys_157(id0);
  }

  private native boolean GetDrawYGridpolys_158();
  public boolean GetDrawYGridpolys()
  {
    return GetDrawYGridpolys_158();
  }

  private native void DrawYGridpolysOn_159();
  public void DrawYGridpolysOn()
  {
    DrawYGridpolysOn_159();
  }

  private native void DrawYGridpolysOff_160();
  public void DrawYGridpolysOff()
  {
    DrawYGridpolysOff_160();
  }

  private native void SetDrawZGridpolys_161(boolean id0);
  public void SetDrawZGridpolys(boolean id0)
  {
    SetDrawZGridpolys_161(id0);
  }

  private native boolean GetDrawZGridpolys_162();
  public boolean GetDrawZGridpolys()
  {
    return GetDrawZGridpolys_162();
  }

  private native void DrawZGridpolysOn_163();
  public void DrawZGridpolysOn()
  {
    DrawZGridpolysOn_163();
  }

  private native void DrawZGridpolysOff_164();
  public void DrawZGridpolysOff()
  {
    DrawZGridpolysOff_164();
  }

  private native long GetTitleTextProperty_165(int id0);
  public vtkTextProperty GetTitleTextProperty(int id0)
  {
    long temp = GetTitleTextProperty_165(id0);

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetXAxesTitleProperty_166(vtkTextProperty id0);
  public void SetXAxesTitleProperty(vtkTextProperty id0)
  {
    SetXAxesTitleProperty_166(id0);
  }

  private native long GetXAxesTitleProperty_167();
  public vtkTextProperty GetXAxesTitleProperty()
  {
    long temp = GetXAxesTitleProperty_167();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetYAxesTitleProperty_168(vtkTextProperty id0);
  public void SetYAxesTitleProperty(vtkTextProperty id0)
  {
    SetYAxesTitleProperty_168(id0);
  }

  private native long GetYAxesTitleProperty_169();
  public vtkTextProperty GetYAxesTitleProperty()
  {
    long temp = GetYAxesTitleProperty_169();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetZAxesTitleProperty_170(vtkTextProperty id0);
  public void SetZAxesTitleProperty(vtkTextProperty id0)
  {
    SetZAxesTitleProperty_170(id0);
  }

  private native long GetZAxesTitleProperty_171();
  public vtkTextProperty GetZAxesTitleProperty()
  {
    long temp = GetZAxesTitleProperty_171();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLabelTextProperty_172(int id0);
  public vtkTextProperty GetLabelTextProperty(int id0)
  {
    long temp = GetLabelTextProperty_172(id0);

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetXAxesLabelProperty_173(vtkTextProperty id0);
  public void SetXAxesLabelProperty(vtkTextProperty id0)
  {
    SetXAxesLabelProperty_173(id0);
  }

  private native long GetXAxesLabelProperty_174();
  public vtkTextProperty GetXAxesLabelProperty()
  {
    long temp = GetXAxesLabelProperty_174();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetYAxesLabelProperty_175(vtkTextProperty id0);
  public void SetYAxesLabelProperty(vtkTextProperty id0)
  {
    SetYAxesLabelProperty_175(id0);
  }

  private native long GetYAxesLabelProperty_176();
  public vtkTextProperty GetYAxesLabelProperty()
  {
    long temp = GetYAxesLabelProperty_176();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetZAxesLabelProperty_177(vtkTextProperty id0);
  public void SetZAxesLabelProperty(vtkTextProperty id0)
  {
    SetZAxesLabelProperty_177(id0);
  }

  private native long GetZAxesLabelProperty_178();
  public vtkTextProperty GetZAxesLabelProperty()
  {
    long temp = GetZAxesLabelProperty_178();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetXAxesLinesProperty_179(vtkProperty id0);
  public void SetXAxesLinesProperty(vtkProperty id0)
  {
    SetXAxesLinesProperty_179(id0);
  }

  private native long GetXAxesLinesProperty_180();
  public vtkProperty GetXAxesLinesProperty()
  {
    long temp = GetXAxesLinesProperty_180();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetYAxesLinesProperty_181(vtkProperty id0);
  public void SetYAxesLinesProperty(vtkProperty id0)
  {
    SetYAxesLinesProperty_181(id0);
  }

  private native long GetYAxesLinesProperty_182();
  public vtkProperty GetYAxesLinesProperty()
  {
    long temp = GetYAxesLinesProperty_182();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetZAxesLinesProperty_183(vtkProperty id0);
  public void SetZAxesLinesProperty(vtkProperty id0)
  {
    SetZAxesLinesProperty_183(id0);
  }

  private native long GetZAxesLinesProperty_184();
  public vtkProperty GetZAxesLinesProperty()
  {
    long temp = GetZAxesLinesProperty_184();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetXAxesGridlinesProperty_185(vtkProperty id0);
  public void SetXAxesGridlinesProperty(vtkProperty id0)
  {
    SetXAxesGridlinesProperty_185(id0);
  }

  private native long GetXAxesGridlinesProperty_186();
  public vtkProperty GetXAxesGridlinesProperty()
  {
    long temp = GetXAxesGridlinesProperty_186();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetYAxesGridlinesProperty_187(vtkProperty id0);
  public void SetYAxesGridlinesProperty(vtkProperty id0)
  {
    SetYAxesGridlinesProperty_187(id0);
  }

  private native long GetYAxesGridlinesProperty_188();
  public vtkProperty GetYAxesGridlinesProperty()
  {
    long temp = GetYAxesGridlinesProperty_188();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetZAxesGridlinesProperty_189(vtkProperty id0);
  public void SetZAxesGridlinesProperty(vtkProperty id0)
  {
    SetZAxesGridlinesProperty_189(id0);
  }

  private native long GetZAxesGridlinesProperty_190();
  public vtkProperty GetZAxesGridlinesProperty()
  {
    long temp = GetZAxesGridlinesProperty_190();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetXAxesInnerGridlinesProperty_191(vtkProperty id0);
  public void SetXAxesInnerGridlinesProperty(vtkProperty id0)
  {
    SetXAxesInnerGridlinesProperty_191(id0);
  }

  private native long GetXAxesInnerGridlinesProperty_192();
  public vtkProperty GetXAxesInnerGridlinesProperty()
  {
    long temp = GetXAxesInnerGridlinesProperty_192();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetYAxesInnerGridlinesProperty_193(vtkProperty id0);
  public void SetYAxesInnerGridlinesProperty(vtkProperty id0)
  {
    SetYAxesInnerGridlinesProperty_193(id0);
  }

  private native long GetYAxesInnerGridlinesProperty_194();
  public vtkProperty GetYAxesInnerGridlinesProperty()
  {
    long temp = GetYAxesInnerGridlinesProperty_194();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetZAxesInnerGridlinesProperty_195(vtkProperty id0);
  public void SetZAxesInnerGridlinesProperty(vtkProperty id0)
  {
    SetZAxesInnerGridlinesProperty_195(id0);
  }

  private native long GetZAxesInnerGridlinesProperty_196();
  public vtkProperty GetZAxesInnerGridlinesProperty()
  {
    long temp = GetZAxesInnerGridlinesProperty_196();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetXAxesGridpolysProperty_197(vtkProperty id0);
  public void SetXAxesGridpolysProperty(vtkProperty id0)
  {
    SetXAxesGridpolysProperty_197(id0);
  }

  private native long GetXAxesGridpolysProperty_198();
  public vtkProperty GetXAxesGridpolysProperty()
  {
    long temp = GetXAxesGridpolysProperty_198();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetYAxesGridpolysProperty_199(vtkProperty id0);
  public void SetYAxesGridpolysProperty(vtkProperty id0)
  {
    SetYAxesGridpolysProperty_199(id0);
  }

  private native long GetYAxesGridpolysProperty_200();
  public vtkProperty GetYAxesGridpolysProperty()
  {
    long temp = GetYAxesGridpolysProperty_200();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetZAxesGridpolysProperty_201(vtkProperty id0);
  public void SetZAxesGridpolysProperty(vtkProperty id0)
  {
    SetZAxesGridpolysProperty_201(id0);
  }

  private native long GetZAxesGridpolysProperty_202();
  public vtkProperty GetZAxesGridpolysProperty()
  {
    long temp = GetZAxesGridpolysProperty_202();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTickLocation_203(int id0);
  public void SetTickLocation(int id0)
  {
    SetTickLocation_203(id0);
  }

  private native int GetTickLocationMinValue_204();
  public int GetTickLocationMinValue()
  {
    return GetTickLocationMinValue_204();
  }

  private native int GetTickLocationMaxValue_205();
  public int GetTickLocationMaxValue()
  {
    return GetTickLocationMaxValue_205();
  }

  private native int GetTickLocation_206();
  public int GetTickLocation()
  {
    return GetTickLocation_206();
  }

  private native void SetTickLocationToInside_207();
  public void SetTickLocationToInside()
  {
    SetTickLocationToInside_207();
  }

  private native void SetTickLocationToOutside_208();
  public void SetTickLocationToOutside()
  {
    SetTickLocationToOutside_208();
  }

  private native void SetTickLocationToBoth_209();
  public void SetTickLocationToBoth()
  {
    SetTickLocationToBoth_209();
  }

  private native void SetLabelScaling_210(boolean id0,int id1,int id2,int id3);
  public void SetLabelScaling(boolean id0,int id1,int id2,int id3)
  {
    SetLabelScaling_210(id0,id1,id2,id3);
  }

  private native void SetUseTextActor3D_211(boolean id0);
  public void SetUseTextActor3D(boolean id0)
  {
    SetUseTextActor3D_211(id0);
  }

  private native boolean GetUseTextActor3D_212();
  public boolean GetUseTextActor3D()
  {
    return GetUseTextActor3D_212();
  }

  private native void SetUse2DMode_213(boolean id0);
  public void SetUse2DMode(boolean id0)
  {
    SetUse2DMode_213(id0);
  }

  private native boolean GetUse2DMode_214();
  public boolean GetUse2DMode()
  {
    return GetUse2DMode_214();
  }

  private native void SetSaveTitlePosition_215(int id0);
  public void SetSaveTitlePosition(int id0)
  {
    SetSaveTitlePosition_215(id0);
  }

  private native void SetOrientedBounds_216(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetOrientedBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetOrientedBounds_216(id0,id1,id2,id3,id4,id5);
  }

  private native void SetOrientedBounds_217(double id0[]);
  public void SetOrientedBounds(double id0[])
  {
    SetOrientedBounds_217(id0);
  }

  private native double[] GetOrientedBounds_218();
  public double[] GetOrientedBounds()
  {
    return GetOrientedBounds_218();
  }

  private native void SetUseOrientedBounds_219(boolean id0);
  public void SetUseOrientedBounds(boolean id0)
  {
    SetUseOrientedBounds_219(id0);
  }

  private native boolean GetUseOrientedBounds_220();
  public boolean GetUseOrientedBounds()
  {
    return GetUseOrientedBounds_220();
  }

  private native void SetAxisBaseForX_221(double id0,double id1,double id2);
  public void SetAxisBaseForX(double id0,double id1,double id2)
  {
    SetAxisBaseForX_221(id0,id1,id2);
  }

  private native void SetAxisBaseForX_222(double id0[]);
  public void SetAxisBaseForX(double id0[])
  {
    SetAxisBaseForX_222(id0);
  }

  private native double[] GetAxisBaseForX_223();
  public double[] GetAxisBaseForX()
  {
    return GetAxisBaseForX_223();
  }

  private native void SetAxisBaseForY_224(double id0,double id1,double id2);
  public void SetAxisBaseForY(double id0,double id1,double id2)
  {
    SetAxisBaseForY_224(id0,id1,id2);
  }

  private native void SetAxisBaseForY_225(double id0[]);
  public void SetAxisBaseForY(double id0[])
  {
    SetAxisBaseForY_225(id0);
  }

  private native double[] GetAxisBaseForY_226();
  public double[] GetAxisBaseForY()
  {
    return GetAxisBaseForY_226();
  }

  private native void SetAxisBaseForZ_227(double id0,double id1,double id2);
  public void SetAxisBaseForZ(double id0,double id1,double id2)
  {
    SetAxisBaseForZ_227(id0,id1,id2);
  }

  private native void SetAxisBaseForZ_228(double id0[]);
  public void SetAxisBaseForZ(double id0[])
  {
    SetAxisBaseForZ_228(id0);
  }

  private native double[] GetAxisBaseForZ_229();
  public double[] GetAxisBaseForZ()
  {
    return GetAxisBaseForZ_229();
  }

  private native void SetAxisOrigin_230(double id0,double id1,double id2);
  public void SetAxisOrigin(double id0,double id1,double id2)
  {
    SetAxisOrigin_230(id0,id1,id2);
  }

  private native void SetAxisOrigin_231(double id0[]);
  public void SetAxisOrigin(double id0[])
  {
    SetAxisOrigin_231(id0);
  }

  private native double[] GetAxisOrigin_232();
  public double[] GetAxisOrigin()
  {
    return GetAxisOrigin_232();
  }

  private native void SetUseAxisOrigin_233(boolean id0);
  public void SetUseAxisOrigin(boolean id0)
  {
    SetUseAxisOrigin_233(id0);
  }

  private native boolean GetUseAxisOrigin_234();
  public boolean GetUseAxisOrigin()
  {
    return GetUseAxisOrigin_234();
  }

  private native void SetGridLineLocation_235(int id0);
  public void SetGridLineLocation(int id0)
  {
    SetGridLineLocation_235(id0);
  }

  private native int GetGridLineLocation_236();
  public int GetGridLineLocation()
  {
    return GetGridLineLocation_236();
  }

  private native void SetStickyAxes_237(boolean id0);
  public void SetStickyAxes(boolean id0)
  {
    SetStickyAxes_237(id0);
  }

  private native boolean GetStickyAxes_238();
  public boolean GetStickyAxes()
  {
    return GetStickyAxes_238();
  }

  private native void StickyAxesOn_239();
  public void StickyAxesOn()
  {
    StickyAxesOn_239();
  }

  private native void StickyAxesOff_240();
  public void StickyAxesOff()
  {
    StickyAxesOff_240();
  }

  private native void SetCenterStickyAxes_241(boolean id0);
  public void SetCenterStickyAxes(boolean id0)
  {
    SetCenterStickyAxes_241(id0);
  }

  private native boolean GetCenterStickyAxes_242();
  public boolean GetCenterStickyAxes()
  {
    return GetCenterStickyAxes_242();
  }

  private native void CenterStickyAxesOn_243();
  public void CenterStickyAxesOn()
  {
    CenterStickyAxesOn_243();
  }

  private native void CenterStickyAxesOff_244();
  public void CenterStickyAxesOff()
  {
    CenterStickyAxesOff_244();
  }

  private native void GetBounds_245(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_245(id0);
  }

  public vtkCubeAxesActor() { super(); }

  public vtkCubeAxesActor(long id) { super(id); }
  public native long   VTKInit();

}
