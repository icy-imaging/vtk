// java wrapper for vtkPolarAxesActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolarAxesActor extends vtkActor
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

  private native int RenderOverlay_5(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_5(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_6(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_6(id0);
  }

  private native void SetPole_7(double id0[]);
  public void SetPole(double id0[])
  {
    SetPole_7(id0);
  }

  private native void SetPole_8(double id0,double id1,double id2);
  public void SetPole(double id0,double id1,double id2)
  {
    SetPole_8(id0,id1,id2);
  }

  private native double[] GetPole_9();
  public double[] GetPole()
  {
    return GetPole_9();
  }

  private native void SetLog_10(boolean id0);
  public void SetLog(boolean id0)
  {
    SetLog_10(id0);
  }

  private native boolean GetLog_11();
  public boolean GetLog()
  {
    return GetLog_11();
  }

  private native void LogOn_12();
  public void LogOn()
  {
    LogOn_12();
  }

  private native void LogOff_13();
  public void LogOff()
  {
    LogOff_13();
  }

  private native void SetRequestedNumberOfRadialAxes_14(long id0);
  public void SetRequestedNumberOfRadialAxes(long id0)
  {
    SetRequestedNumberOfRadialAxes_14(id0);
  }

  private native long GetRequestedNumberOfRadialAxesMinValue_15();
  public long GetRequestedNumberOfRadialAxesMinValue()
  {
    return GetRequestedNumberOfRadialAxesMinValue_15();
  }

  private native long GetRequestedNumberOfRadialAxesMaxValue_16();
  public long GetRequestedNumberOfRadialAxesMaxValue()
  {
    return GetRequestedNumberOfRadialAxesMaxValue_16();
  }

  private native long GetRequestedNumberOfRadialAxes_17();
  public long GetRequestedNumberOfRadialAxes()
  {
    return GetRequestedNumberOfRadialAxes_17();
  }

  private native void SetRequestedNumberOfPolarAxes_18(long id0);
  public void SetRequestedNumberOfPolarAxes(long id0)
  {
    SetRequestedNumberOfPolarAxes_18(id0);
  }

  private native long GetRequestedNumberOfPolarAxesMinValue_19();
  public long GetRequestedNumberOfPolarAxesMinValue()
  {
    return GetRequestedNumberOfPolarAxesMinValue_19();
  }

  private native long GetRequestedNumberOfPolarAxesMaxValue_20();
  public long GetRequestedNumberOfPolarAxesMaxValue()
  {
    return GetRequestedNumberOfPolarAxesMaxValue_20();
  }

  private native long GetRequestedNumberOfPolarAxes_21();
  public long GetRequestedNumberOfPolarAxes()
  {
    return GetRequestedNumberOfPolarAxes_21();
  }

  private native void SetAutoSubdividePolarAxis_22(boolean id0);
  public void SetAutoSubdividePolarAxis(boolean id0)
  {
    SetAutoSubdividePolarAxis_22(id0);
  }

  private native boolean GetAutoSubdividePolarAxis_23();
  public boolean GetAutoSubdividePolarAxis()
  {
    return GetAutoSubdividePolarAxis_23();
  }

  private native void AutoSubdividePolarAxisOn_24();
  public void AutoSubdividePolarAxisOn()
  {
    AutoSubdividePolarAxisOn_24();
  }

  private native void AutoSubdividePolarAxisOff_25();
  public void AutoSubdividePolarAxisOff()
  {
    AutoSubdividePolarAxisOff_25();
  }

  private native void SetNumberOfPolarAxisTicks_26(int id0);
  public void SetNumberOfPolarAxisTicks(int id0)
  {
    SetNumberOfPolarAxisTicks_26(id0);
  }

  private native int GetNumberOfPolarAxisTicks_27();
  public int GetNumberOfPolarAxisTicks()
  {
    return GetNumberOfPolarAxisTicks_27();
  }

  private native void SetRange_28(double id0,double id1);
  public void SetRange(double id0,double id1)
  {
    SetRange_28(id0,id1);
  }

  private native void SetRange_29(double id0[]);
  public void SetRange(double id0[])
  {
    SetRange_29(id0);
  }

  private native double[] GetRange_30();
  public double[] GetRange()
  {
    return GetRange_30();
  }

  private native void SetMinimumRadius_31(double id0);
  public void SetMinimumRadius(double id0)
  {
    SetMinimumRadius_31(id0);
  }

  private native double GetMinimumRadius_32();
  public double GetMinimumRadius()
  {
    return GetMinimumRadius_32();
  }

  private native void SetMaximumRadius_33(double id0);
  public void SetMaximumRadius(double id0)
  {
    SetMaximumRadius_33(id0);
  }

  private native double GetMaximumRadius_34();
  public double GetMaximumRadius()
  {
    return GetMaximumRadius_34();
  }

  private native void SetMinimumAngle_35(double id0);
  public void SetMinimumAngle(double id0)
  {
    SetMinimumAngle_35(id0);
  }

  private native double GetMinimumAngle_36();
  public double GetMinimumAngle()
  {
    return GetMinimumAngle_36();
  }

  private native void SetMaximumAngle_37(double id0);
  public void SetMaximumAngle(double id0)
  {
    SetMaximumAngle_37(id0);
  }

  private native double GetMaximumAngle_38();
  public double GetMaximumAngle()
  {
    return GetMaximumAngle_38();
  }

  private native void SetSmallestVisiblePolarAngle_39(double id0);
  public void SetSmallestVisiblePolarAngle(double id0)
  {
    SetSmallestVisiblePolarAngle_39(id0);
  }

  private native double GetSmallestVisiblePolarAngleMinValue_40();
  public double GetSmallestVisiblePolarAngleMinValue()
  {
    return GetSmallestVisiblePolarAngleMinValue_40();
  }

  private native double GetSmallestVisiblePolarAngleMaxValue_41();
  public double GetSmallestVisiblePolarAngleMaxValue()
  {
    return GetSmallestVisiblePolarAngleMaxValue_41();
  }

  private native double GetSmallestVisiblePolarAngle_42();
  public double GetSmallestVisiblePolarAngle()
  {
    return GetSmallestVisiblePolarAngle_42();
  }

  private native void SetTickLocation_43(int id0);
  public void SetTickLocation(int id0)
  {
    SetTickLocation_43(id0);
  }

  private native int GetTickLocationMinValue_44();
  public int GetTickLocationMinValue()
  {
    return GetTickLocationMinValue_44();
  }

  private native int GetTickLocationMaxValue_45();
  public int GetTickLocationMaxValue()
  {
    return GetTickLocationMaxValue_45();
  }

  private native int GetTickLocation_46();
  public int GetTickLocation()
  {
    return GetTickLocation_46();
  }

  private native void SetRadialUnits_47(boolean id0);
  public void SetRadialUnits(boolean id0)
  {
    SetRadialUnits_47(id0);
  }

  private native boolean GetRadialUnits_48();
  public boolean GetRadialUnits()
  {
    return GetRadialUnits_48();
  }

  private native void SetScreenSize_49(double id0);
  public void SetScreenSize(double id0)
  {
    SetScreenSize_49(id0);
  }

  private native double GetScreenSize_50();
  public double GetScreenSize()
  {
    return GetScreenSize_50();
  }

  private native void SetPolarTitleOffset_51(double id0,double id1);
  public void SetPolarTitleOffset(double id0,double id1)
  {
    SetPolarTitleOffset_51(id0,id1);
  }

  private native void SetPolarTitleOffset_52(double id0[]);
  public void SetPolarTitleOffset(double id0[])
  {
    SetPolarTitleOffset_52(id0);
  }

  private native double[] GetPolarTitleOffset_53();
  public double[] GetPolarTitleOffset()
  {
    return GetPolarTitleOffset_53();
  }

  private native void SetRadialTitleOffset_54(double id0,double id1);
  public void SetRadialTitleOffset(double id0,double id1)
  {
    SetRadialTitleOffset_54(id0,id1);
  }

  private native void SetRadialTitleOffset_55(double id0[]);
  public void SetRadialTitleOffset(double id0[])
  {
    SetRadialTitleOffset_55(id0);
  }

  private native double[] GetRadialTitleOffset_56();
  public double[] GetRadialTitleOffset()
  {
    return GetRadialTitleOffset_56();
  }

  private native double GetPolarLabelOffset_57();
  public double GetPolarLabelOffset()
  {
    return GetPolarLabelOffset_57();
  }

  private native void SetPolarLabelOffset_58(double id0);
  public void SetPolarLabelOffset(double id0)
  {
    SetPolarLabelOffset_58(id0);
  }

  private native double GetPolarExponentOffset_59();
  public double GetPolarExponentOffset()
  {
    return GetPolarExponentOffset_59();
  }

  private native void SetPolarExponentOffset_60(double id0);
  public void SetPolarExponentOffset(double id0)
  {
    SetPolarExponentOffset_60(id0);
  }

  private native void SetCamera_61(vtkCamera id0);
  public void SetCamera(vtkCamera id0)
  {
    SetCamera_61(id0);
  }

  private native long GetCamera_62();
  public vtkCamera GetCamera()
  {
    long temp = GetCamera_62();

    if (temp == 0) return null;
    return (vtkCamera)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPolarAxisTitle_63(byte[] id0, int len0);
  public void SetPolarAxisTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPolarAxisTitle_63(bytes0, bytes0.length);
  }

  private native byte[] GetPolarAxisTitle_64();
  public String GetPolarAxisTitle()
  {
    return new String(GetPolarAxisTitle_64(), StandardCharsets.UTF_8);
  }

  private native void SetPolarLabelFormat_65(byte[] id0, int len0);
  public void SetPolarLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPolarLabelFormat_65(bytes0, bytes0.length);
  }

  private native byte[] GetPolarLabelFormat_66();
  public String GetPolarLabelFormat()
  {
    return new String(GetPolarLabelFormat_66(), StandardCharsets.UTF_8);
  }

  private native void SetExponentLocation_67(int id0);
  public void SetExponentLocation(int id0)
  {
    SetExponentLocation_67(id0);
  }

  private native int GetExponentLocationMinValue_68();
  public int GetExponentLocationMinValue()
  {
    return GetExponentLocationMinValue_68();
  }

  private native int GetExponentLocationMaxValue_69();
  public int GetExponentLocationMaxValue()
  {
    return GetExponentLocationMaxValue_69();
  }

  private native int GetExponentLocation_70();
  public int GetExponentLocation()
  {
    return GetExponentLocation_70();
  }

  private native void SetRadialAngleFormat_71(byte[] id0, int len0);
  public void SetRadialAngleFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetRadialAngleFormat_71(bytes0, bytes0.length);
  }

  private native byte[] GetRadialAngleFormat_72();
  public String GetRadialAngleFormat()
  {
    return new String(GetRadialAngleFormat_72(), StandardCharsets.UTF_8);
  }

  private native void ReleaseGraphicsResources_73(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_73(id0);
  }

  private native void SetEnableDistanceLOD_74(boolean id0);
  public void SetEnableDistanceLOD(boolean id0)
  {
    SetEnableDistanceLOD_74(id0);
  }

  private native boolean GetEnableDistanceLOD_75();
  public boolean GetEnableDistanceLOD()
  {
    return GetEnableDistanceLOD_75();
  }

  private native void SetDistanceLODThreshold_76(double id0);
  public void SetDistanceLODThreshold(double id0)
  {
    SetDistanceLODThreshold_76(id0);
  }

  private native double GetDistanceLODThresholdMinValue_77();
  public double GetDistanceLODThresholdMinValue()
  {
    return GetDistanceLODThresholdMinValue_77();
  }

  private native double GetDistanceLODThresholdMaxValue_78();
  public double GetDistanceLODThresholdMaxValue()
  {
    return GetDistanceLODThresholdMaxValue_78();
  }

  private native double GetDistanceLODThreshold_79();
  public double GetDistanceLODThreshold()
  {
    return GetDistanceLODThreshold_79();
  }

  private native void SetEnableViewAngleLOD_80(boolean id0);
  public void SetEnableViewAngleLOD(boolean id0)
  {
    SetEnableViewAngleLOD_80(id0);
  }

  private native boolean GetEnableViewAngleLOD_81();
  public boolean GetEnableViewAngleLOD()
  {
    return GetEnableViewAngleLOD_81();
  }

  private native void SetViewAngleLODThreshold_82(double id0);
  public void SetViewAngleLODThreshold(double id0)
  {
    SetViewAngleLODThreshold_82(id0);
  }

  private native double GetViewAngleLODThresholdMinValue_83();
  public double GetViewAngleLODThresholdMinValue()
  {
    return GetViewAngleLODThresholdMinValue_83();
  }

  private native double GetViewAngleLODThresholdMaxValue_84();
  public double GetViewAngleLODThresholdMaxValue()
  {
    return GetViewAngleLODThresholdMaxValue_84();
  }

  private native double GetViewAngleLODThreshold_85();
  public double GetViewAngleLODThreshold()
  {
    return GetViewAngleLODThreshold_85();
  }

  private native void SetPolarAxisVisibility_86(boolean id0);
  public void SetPolarAxisVisibility(boolean id0)
  {
    SetPolarAxisVisibility_86(id0);
  }

  private native boolean GetPolarAxisVisibility_87();
  public boolean GetPolarAxisVisibility()
  {
    return GetPolarAxisVisibility_87();
  }

  private native void PolarAxisVisibilityOn_88();
  public void PolarAxisVisibilityOn()
  {
    PolarAxisVisibilityOn_88();
  }

  private native void PolarAxisVisibilityOff_89();
  public void PolarAxisVisibilityOff()
  {
    PolarAxisVisibilityOff_89();
  }

  private native void SetDrawRadialGridlines_90(boolean id0);
  public void SetDrawRadialGridlines(boolean id0)
  {
    SetDrawRadialGridlines_90(id0);
  }

  private native boolean GetDrawRadialGridlines_91();
  public boolean GetDrawRadialGridlines()
  {
    return GetDrawRadialGridlines_91();
  }

  private native void DrawRadialGridlinesOn_92();
  public void DrawRadialGridlinesOn()
  {
    DrawRadialGridlinesOn_92();
  }

  private native void DrawRadialGridlinesOff_93();
  public void DrawRadialGridlinesOff()
  {
    DrawRadialGridlinesOff_93();
  }

  private native void SetDrawPolarArcsGridlines_94(boolean id0);
  public void SetDrawPolarArcsGridlines(boolean id0)
  {
    SetDrawPolarArcsGridlines_94(id0);
  }

  private native boolean GetDrawPolarArcsGridlines_95();
  public boolean GetDrawPolarArcsGridlines()
  {
    return GetDrawPolarArcsGridlines_95();
  }

  private native void DrawPolarArcsGridlinesOn_96();
  public void DrawPolarArcsGridlinesOn()
  {
    DrawPolarArcsGridlinesOn_96();
  }

  private native void DrawPolarArcsGridlinesOff_97();
  public void DrawPolarArcsGridlinesOff()
  {
    DrawPolarArcsGridlinesOff_97();
  }

  private native void SetPolarTitleVisibility_98(boolean id0);
  public void SetPolarTitleVisibility(boolean id0)
  {
    SetPolarTitleVisibility_98(id0);
  }

  private native boolean GetPolarTitleVisibility_99();
  public boolean GetPolarTitleVisibility()
  {
    return GetPolarTitleVisibility_99();
  }

  private native void PolarTitleVisibilityOn_100();
  public void PolarTitleVisibilityOn()
  {
    PolarTitleVisibilityOn_100();
  }

  private native void PolarTitleVisibilityOff_101();
  public void PolarTitleVisibilityOff()
  {
    PolarTitleVisibilityOff_101();
  }

  private native void SetRadialAxisTitleLocation_102(int id0);
  public void SetRadialAxisTitleLocation(int id0)
  {
    SetRadialAxisTitleLocation_102(id0);
  }

  private native int GetRadialAxisTitleLocationMinValue_103();
  public int GetRadialAxisTitleLocationMinValue()
  {
    return GetRadialAxisTitleLocationMinValue_103();
  }

  private native int GetRadialAxisTitleLocationMaxValue_104();
  public int GetRadialAxisTitleLocationMaxValue()
  {
    return GetRadialAxisTitleLocationMaxValue_104();
  }

  private native int GetRadialAxisTitleLocation_105();
  public int GetRadialAxisTitleLocation()
  {
    return GetRadialAxisTitleLocation_105();
  }

  private native void SetPolarAxisTitleLocation_106(int id0);
  public void SetPolarAxisTitleLocation(int id0)
  {
    SetPolarAxisTitleLocation_106(id0);
  }

  private native int GetPolarAxisTitleLocationMinValue_107();
  public int GetPolarAxisTitleLocationMinValue()
  {
    return GetPolarAxisTitleLocationMinValue_107();
  }

  private native int GetPolarAxisTitleLocationMaxValue_108();
  public int GetPolarAxisTitleLocationMaxValue()
  {
    return GetPolarAxisTitleLocationMaxValue_108();
  }

  private native int GetPolarAxisTitleLocation_109();
  public int GetPolarAxisTitleLocation()
  {
    return GetPolarAxisTitleLocation_109();
  }

  private native void SetPolarLabelVisibility_110(boolean id0);
  public void SetPolarLabelVisibility(boolean id0)
  {
    SetPolarLabelVisibility_110(id0);
  }

  private native boolean GetPolarLabelVisibility_111();
  public boolean GetPolarLabelVisibility()
  {
    return GetPolarLabelVisibility_111();
  }

  private native void PolarLabelVisibilityOn_112();
  public void PolarLabelVisibilityOn()
  {
    PolarLabelVisibilityOn_112();
  }

  private native void PolarLabelVisibilityOff_113();
  public void PolarLabelVisibilityOff()
  {
    PolarLabelVisibilityOff_113();
  }

  private native void SetArcTicksOriginToPolarAxis_114(boolean id0);
  public void SetArcTicksOriginToPolarAxis(boolean id0)
  {
    SetArcTicksOriginToPolarAxis_114(id0);
  }

  private native boolean GetArcTicksOriginToPolarAxis_115();
  public boolean GetArcTicksOriginToPolarAxis()
  {
    return GetArcTicksOriginToPolarAxis_115();
  }

  private native void ArcTicksOriginToPolarAxisOn_116();
  public void ArcTicksOriginToPolarAxisOn()
  {
    ArcTicksOriginToPolarAxisOn_116();
  }

  private native void ArcTicksOriginToPolarAxisOff_117();
  public void ArcTicksOriginToPolarAxisOff()
  {
    ArcTicksOriginToPolarAxisOff_117();
  }

  private native void SetRadialAxesOriginToPolarAxis_118(boolean id0);
  public void SetRadialAxesOriginToPolarAxis(boolean id0)
  {
    SetRadialAxesOriginToPolarAxis_118(id0);
  }

  private native boolean GetRadialAxesOriginToPolarAxis_119();
  public boolean GetRadialAxesOriginToPolarAxis()
  {
    return GetRadialAxesOriginToPolarAxis_119();
  }

  private native void RadialAxesOriginToPolarAxisOn_120();
  public void RadialAxesOriginToPolarAxisOn()
  {
    RadialAxesOriginToPolarAxisOn_120();
  }

  private native void RadialAxesOriginToPolarAxisOff_121();
  public void RadialAxesOriginToPolarAxisOff()
  {
    RadialAxesOriginToPolarAxisOff_121();
  }

  private native void SetPolarTickVisibility_122(boolean id0);
  public void SetPolarTickVisibility(boolean id0)
  {
    SetPolarTickVisibility_122(id0);
  }

  private native boolean GetPolarTickVisibility_123();
  public boolean GetPolarTickVisibility()
  {
    return GetPolarTickVisibility_123();
  }

  private native void PolarTickVisibilityOn_124();
  public void PolarTickVisibilityOn()
  {
    PolarTickVisibilityOn_124();
  }

  private native void PolarTickVisibilityOff_125();
  public void PolarTickVisibilityOff()
  {
    PolarTickVisibilityOff_125();
  }

  private native void SetAxisTickVisibility_126(boolean id0);
  public void SetAxisTickVisibility(boolean id0)
  {
    SetAxisTickVisibility_126(id0);
  }

  private native boolean GetAxisTickVisibility_127();
  public boolean GetAxisTickVisibility()
  {
    return GetAxisTickVisibility_127();
  }

  private native void AxisTickVisibilityOn_128();
  public void AxisTickVisibilityOn()
  {
    AxisTickVisibilityOn_128();
  }

  private native void AxisTickVisibilityOff_129();
  public void AxisTickVisibilityOff()
  {
    AxisTickVisibilityOff_129();
  }

  private native void SetAxisMinorTickVisibility_130(boolean id0);
  public void SetAxisMinorTickVisibility(boolean id0)
  {
    SetAxisMinorTickVisibility_130(id0);
  }

  private native boolean GetAxisMinorTickVisibility_131();
  public boolean GetAxisMinorTickVisibility()
  {
    return GetAxisMinorTickVisibility_131();
  }

  private native void AxisMinorTickVisibilityOn_132();
  public void AxisMinorTickVisibilityOn()
  {
    AxisMinorTickVisibilityOn_132();
  }

  private native void AxisMinorTickVisibilityOff_133();
  public void AxisMinorTickVisibilityOff()
  {
    AxisMinorTickVisibilityOff_133();
  }

  private native void SetAxisTickMatchesPolarAxes_134(boolean id0);
  public void SetAxisTickMatchesPolarAxes(boolean id0)
  {
    SetAxisTickMatchesPolarAxes_134(id0);
  }

  private native boolean GetAxisTickMatchesPolarAxes_135();
  public boolean GetAxisTickMatchesPolarAxes()
  {
    return GetAxisTickMatchesPolarAxes_135();
  }

  private native void AxisTickMatchesPolarAxesOn_136();
  public void AxisTickMatchesPolarAxesOn()
  {
    AxisTickMatchesPolarAxesOn_136();
  }

  private native void AxisTickMatchesPolarAxesOff_137();
  public void AxisTickMatchesPolarAxesOff()
  {
    AxisTickMatchesPolarAxesOff_137();
  }

  private native void SetArcTickVisibility_138(boolean id0);
  public void SetArcTickVisibility(boolean id0)
  {
    SetArcTickVisibility_138(id0);
  }

  private native boolean GetArcTickVisibility_139();
  public boolean GetArcTickVisibility()
  {
    return GetArcTickVisibility_139();
  }

  private native void ArcTickVisibilityOn_140();
  public void ArcTickVisibilityOn()
  {
    ArcTickVisibilityOn_140();
  }

  private native void ArcTickVisibilityOff_141();
  public void ArcTickVisibilityOff()
  {
    ArcTickVisibilityOff_141();
  }

  private native void SetArcMinorTickVisibility_142(boolean id0);
  public void SetArcMinorTickVisibility(boolean id0)
  {
    SetArcMinorTickVisibility_142(id0);
  }

  private native boolean GetArcMinorTickVisibility_143();
  public boolean GetArcMinorTickVisibility()
  {
    return GetArcMinorTickVisibility_143();
  }

  private native void ArcMinorTickVisibilityOn_144();
  public void ArcMinorTickVisibilityOn()
  {
    ArcMinorTickVisibilityOn_144();
  }

  private native void ArcMinorTickVisibilityOff_145();
  public void ArcMinorTickVisibilityOff()
  {
    ArcMinorTickVisibilityOff_145();
  }

  private native void SetArcTickMatchesRadialAxes_146(boolean id0);
  public void SetArcTickMatchesRadialAxes(boolean id0)
  {
    SetArcTickMatchesRadialAxes_146(id0);
  }

  private native boolean GetArcTickMatchesRadialAxes_147();
  public boolean GetArcTickMatchesRadialAxes()
  {
    return GetArcTickMatchesRadialAxes_147();
  }

  private native void ArcTickMatchesRadialAxesOn_148();
  public void ArcTickMatchesRadialAxesOn()
  {
    ArcTickMatchesRadialAxesOn_148();
  }

  private native void ArcTickMatchesRadialAxesOff_149();
  public void ArcTickMatchesRadialAxesOff()
  {
    ArcTickMatchesRadialAxesOff_149();
  }

  private native void SetArcMajorTickSize_150(double id0);
  public void SetArcMajorTickSize(double id0)
  {
    SetArcMajorTickSize_150(id0);
  }

  private native double GetArcMajorTickSize_151();
  public double GetArcMajorTickSize()
  {
    return GetArcMajorTickSize_151();
  }

  private native void SetPolarAxisMajorTickSize_152(double id0);
  public void SetPolarAxisMajorTickSize(double id0)
  {
    SetPolarAxisMajorTickSize_152(id0);
  }

  private native double GetPolarAxisMajorTickSize_153();
  public double GetPolarAxisMajorTickSize()
  {
    return GetPolarAxisMajorTickSize_153();
  }

  private native void SetLastRadialAxisMajorTickSize_154(double id0);
  public void SetLastRadialAxisMajorTickSize(double id0)
  {
    SetLastRadialAxisMajorTickSize_154(id0);
  }

  private native double GetLastRadialAxisMajorTickSize_155();
  public double GetLastRadialAxisMajorTickSize()
  {
    return GetLastRadialAxisMajorTickSize_155();
  }

  private native void SetPolarAxisTickRatioSize_156(double id0);
  public void SetPolarAxisTickRatioSize(double id0)
  {
    SetPolarAxisTickRatioSize_156(id0);
  }

  private native double GetPolarAxisTickRatioSize_157();
  public double GetPolarAxisTickRatioSize()
  {
    return GetPolarAxisTickRatioSize_157();
  }

  private native void SetLastAxisTickRatioSize_158(double id0);
  public void SetLastAxisTickRatioSize(double id0)
  {
    SetLastAxisTickRatioSize_158(id0);
  }

  private native double GetLastAxisTickRatioSize_159();
  public double GetLastAxisTickRatioSize()
  {
    return GetLastAxisTickRatioSize_159();
  }

  private native void SetArcTickRatioSize_160(double id0);
  public void SetArcTickRatioSize(double id0)
  {
    SetArcTickRatioSize_160(id0);
  }

  private native double GetArcTickRatioSize_161();
  public double GetArcTickRatioSize()
  {
    return GetArcTickRatioSize_161();
  }

  private native void SetTickRatioRadiusSize_162(double id0);
  public void SetTickRatioRadiusSize(double id0)
  {
    SetTickRatioRadiusSize_162(id0);
  }

  private native double GetTickRatioRadiusSize_163();
  public double GetTickRatioRadiusSize()
  {
    return GetTickRatioRadiusSize_163();
  }

  private native void SetPolarAxisMajorTickThickness_164(double id0);
  public void SetPolarAxisMajorTickThickness(double id0)
  {
    SetPolarAxisMajorTickThickness_164(id0);
  }

  private native double GetPolarAxisMajorTickThickness_165();
  public double GetPolarAxisMajorTickThickness()
  {
    return GetPolarAxisMajorTickThickness_165();
  }

  private native void SetLastRadialAxisMajorTickThickness_166(double id0);
  public void SetLastRadialAxisMajorTickThickness(double id0)
  {
    SetLastRadialAxisMajorTickThickness_166(id0);
  }

  private native double GetLastRadialAxisMajorTickThickness_167();
  public double GetLastRadialAxisMajorTickThickness()
  {
    return GetLastRadialAxisMajorTickThickness_167();
  }

  private native void SetArcMajorTickThickness_168(double id0);
  public void SetArcMajorTickThickness(double id0)
  {
    SetArcMajorTickThickness_168(id0);
  }

  private native double GetArcMajorTickThickness_169();
  public double GetArcMajorTickThickness()
  {
    return GetArcMajorTickThickness_169();
  }

  private native void SetPolarAxisTickRatioThickness_170(double id0);
  public void SetPolarAxisTickRatioThickness(double id0)
  {
    SetPolarAxisTickRatioThickness_170(id0);
  }

  private native double GetPolarAxisTickRatioThickness_171();
  public double GetPolarAxisTickRatioThickness()
  {
    return GetPolarAxisTickRatioThickness_171();
  }

  private native void SetLastAxisTickRatioThickness_172(double id0);
  public void SetLastAxisTickRatioThickness(double id0)
  {
    SetLastAxisTickRatioThickness_172(id0);
  }

  private native double GetLastAxisTickRatioThickness_173();
  public double GetLastAxisTickRatioThickness()
  {
    return GetLastAxisTickRatioThickness_173();
  }

  private native void SetArcTickRatioThickness_174(double id0);
  public void SetArcTickRatioThickness(double id0)
  {
    SetArcTickRatioThickness_174(id0);
  }

  private native double GetArcTickRatioThickness_175();
  public double GetArcTickRatioThickness()
  {
    return GetArcTickRatioThickness_175();
  }

  private native void SetDeltaRangeMajor_176(double id0);
  public void SetDeltaRangeMajor(double id0)
  {
    SetDeltaRangeMajor_176(id0);
  }

  private native double GetDeltaRangeMajor_177();
  public double GetDeltaRangeMajor()
  {
    return GetDeltaRangeMajor_177();
  }

  private native void SetDeltaRangeMinor_178(double id0);
  public void SetDeltaRangeMinor(double id0)
  {
    SetDeltaRangeMinor_178(id0);
  }

  private native double GetDeltaRangeMinor_179();
  public double GetDeltaRangeMinor()
  {
    return GetDeltaRangeMinor_179();
  }

  private native void SetRequestedDeltaRangePolarAxes_180(double id0);
  public void SetRequestedDeltaRangePolarAxes(double id0)
  {
    SetRequestedDeltaRangePolarAxes_180(id0);
  }

  private native double GetRequestedDeltaRangePolarAxes_181();
  public double GetRequestedDeltaRangePolarAxes()
  {
    return GetRequestedDeltaRangePolarAxes_181();
  }

  private native void SetDeltaAngleMajor_182(double id0);
  public void SetDeltaAngleMajor(double id0)
  {
    SetDeltaAngleMajor_182(id0);
  }

  private native double GetDeltaAngleMajor_183();
  public double GetDeltaAngleMajor()
  {
    return GetDeltaAngleMajor_183();
  }

  private native void SetDeltaAngleMinor_184(double id0);
  public void SetDeltaAngleMinor(double id0)
  {
    SetDeltaAngleMinor_184(id0);
  }

  private native double GetDeltaAngleMinor_185();
  public double GetDeltaAngleMinor()
  {
    return GetDeltaAngleMinor_185();
  }

  private native void SetRequestedDeltaAngleRadialAxes_186(double id0);
  public void SetRequestedDeltaAngleRadialAxes(double id0)
  {
    SetRequestedDeltaAngleRadialAxes_186(id0);
  }

  private native double GetRequestedDeltaAngleRadialAxes_187();
  public double GetRequestedDeltaAngleRadialAxes()
  {
    return GetRequestedDeltaAngleRadialAxes_187();
  }

  private native void SetRadialAxesVisibility_188(boolean id0);
  public void SetRadialAxesVisibility(boolean id0)
  {
    SetRadialAxesVisibility_188(id0);
  }

  private native boolean GetRadialAxesVisibility_189();
  public boolean GetRadialAxesVisibility()
  {
    return GetRadialAxesVisibility_189();
  }

  private native void RadialAxesVisibilityOn_190();
  public void RadialAxesVisibilityOn()
  {
    RadialAxesVisibilityOn_190();
  }

  private native void RadialAxesVisibilityOff_191();
  public void RadialAxesVisibilityOff()
  {
    RadialAxesVisibilityOff_191();
  }

  private native void SetRadialTitleVisibility_192(boolean id0);
  public void SetRadialTitleVisibility(boolean id0)
  {
    SetRadialTitleVisibility_192(id0);
  }

  private native boolean GetRadialTitleVisibility_193();
  public boolean GetRadialTitleVisibility()
  {
    return GetRadialTitleVisibility_193();
  }

  private native void RadialTitleVisibilityOn_194();
  public void RadialTitleVisibilityOn()
  {
    RadialTitleVisibilityOn_194();
  }

  private native void RadialTitleVisibilityOff_195();
  public void RadialTitleVisibilityOff()
  {
    RadialTitleVisibilityOff_195();
  }

  private native void SetPolarArcsVisibility_196(boolean id0);
  public void SetPolarArcsVisibility(boolean id0)
  {
    SetPolarArcsVisibility_196(id0);
  }

  private native boolean GetPolarArcsVisibility_197();
  public boolean GetPolarArcsVisibility()
  {
    return GetPolarArcsVisibility_197();
  }

  private native void PolarArcsVisibilityOn_198();
  public void PolarArcsVisibilityOn()
  {
    PolarArcsVisibilityOn_198();
  }

  private native void PolarArcsVisibilityOff_199();
  public void PolarArcsVisibilityOff()
  {
    PolarArcsVisibilityOff_199();
  }

  private native void SetUse2DMode_200(boolean id0);
  public void SetUse2DMode(boolean id0)
  {
    SetUse2DMode_200(id0);
  }

  private native boolean GetUse2DMode_201();
  public boolean GetUse2DMode()
  {
    return GetUse2DMode_201();
  }

  private native void SetPolarAxisTitleTextProperty_202(vtkTextProperty id0);
  public void SetPolarAxisTitleTextProperty(vtkTextProperty id0)
  {
    SetPolarAxisTitleTextProperty_202(id0);
  }

  private native long GetPolarAxisTitleTextProperty_203();
  public vtkTextProperty GetPolarAxisTitleTextProperty()
  {
    long temp = GetPolarAxisTitleTextProperty_203();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPolarAxisLabelTextProperty_204(vtkTextProperty id0);
  public void SetPolarAxisLabelTextProperty(vtkTextProperty id0)
  {
    SetPolarAxisLabelTextProperty_204(id0);
  }

  private native long GetPolarAxisLabelTextProperty_205();
  public vtkTextProperty GetPolarAxisLabelTextProperty()
  {
    long temp = GetPolarAxisLabelTextProperty_205();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLastRadialAxisTextProperty_206(vtkTextProperty id0);
  public void SetLastRadialAxisTextProperty(vtkTextProperty id0)
  {
    SetLastRadialAxisTextProperty_206(id0);
  }

  private native long GetLastRadialAxisTextProperty_207();
  public vtkTextProperty GetLastRadialAxisTextProperty()
  {
    long temp = GetLastRadialAxisTextProperty_207();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSecondaryRadialAxesTextProperty_208(vtkTextProperty id0);
  public void SetSecondaryRadialAxesTextProperty(vtkTextProperty id0)
  {
    SetSecondaryRadialAxesTextProperty_208(id0);
  }

  private native long GetSecondaryRadialAxesTextProperty_209();
  public vtkTextProperty GetSecondaryRadialAxesTextProperty()
  {
    long temp = GetSecondaryRadialAxesTextProperty_209();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPolarAxisProperty_210(vtkProperty id0);
  public void SetPolarAxisProperty(vtkProperty id0)
  {
    SetPolarAxisProperty_210(id0);
  }

  private native long GetPolarAxisProperty_211();
  public vtkProperty GetPolarAxisProperty()
  {
    long temp = GetPolarAxisProperty_211();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLastRadialAxisProperty_212(vtkProperty id0);
  public void SetLastRadialAxisProperty(vtkProperty id0)
  {
    SetLastRadialAxisProperty_212(id0);
  }

  private native long GetLastRadialAxisProperty_213();
  public vtkProperty GetLastRadialAxisProperty()
  {
    long temp = GetLastRadialAxisProperty_213();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSecondaryRadialAxesProperty_214(vtkProperty id0);
  public void SetSecondaryRadialAxesProperty(vtkProperty id0)
  {
    SetSecondaryRadialAxesProperty_214(id0);
  }

  private native long GetSecondaryRadialAxesProperty_215();
  public vtkProperty GetSecondaryRadialAxesProperty()
  {
    long temp = GetSecondaryRadialAxesProperty_215();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPolarArcsProperty_216(vtkProperty id0);
  public void SetPolarArcsProperty(vtkProperty id0)
  {
    SetPolarArcsProperty_216(id0);
  }

  private native long GetPolarArcsProperty_217();
  public vtkProperty GetPolarArcsProperty()
  {
    long temp = GetPolarArcsProperty_217();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSecondaryPolarArcsProperty_218(vtkProperty id0);
  public void SetSecondaryPolarArcsProperty(vtkProperty id0)
  {
    SetSecondaryPolarArcsProperty_218(id0);
  }

  private native long GetSecondaryPolarArcsProperty_219();
  public vtkProperty GetSecondaryPolarArcsProperty()
  {
    long temp = GetSecondaryPolarArcsProperty_219();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBounds_220(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_220(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_221(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_221(id0);
  }

  private native void GetBounds_222(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_222(id0);
  }

  private native void SetRatio_223(double id0);
  public void SetRatio(double id0)
  {
    SetRatio_223(id0);
  }

  private native double GetRatioMinValue_224();
  public double GetRatioMinValue()
  {
    return GetRatioMinValue_224();
  }

  private native double GetRatioMaxValue_225();
  public double GetRatioMaxValue()
  {
    return GetRatioMaxValue_225();
  }

  private native double GetRatio_226();
  public double GetRatio()
  {
    return GetRatio_226();
  }

  private native void SetPolarArcResolutionPerDegree_227(double id0);
  public void SetPolarArcResolutionPerDegree(double id0)
  {
    SetPolarArcResolutionPerDegree_227(id0);
  }

  private native double GetPolarArcResolutionPerDegreeMinValue_228();
  public double GetPolarArcResolutionPerDegreeMinValue()
  {
    return GetPolarArcResolutionPerDegreeMinValue_228();
  }

  private native double GetPolarArcResolutionPerDegreeMaxValue_229();
  public double GetPolarArcResolutionPerDegreeMaxValue()
  {
    return GetPolarArcResolutionPerDegreeMaxValue_229();
  }

  private native double GetPolarArcResolutionPerDegree_230();
  public double GetPolarArcResolutionPerDegree()
  {
    return GetPolarArcResolutionPerDegree_230();
  }

  public vtkPolarAxesActor() { super(); }

  public vtkPolarAxesActor(long id) { super(id); }
  public native long   VTKInit();

}
