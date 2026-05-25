// java wrapper for vtkAxisActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAxisActor extends vtkActor
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

  private native void SetPoint1_6(double id0,double id1,double id2);
  public void SetPoint1(double id0,double id1,double id2)
  {
    SetPoint1_6(id0,id1,id2);
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

  private native void SetPoint2_9(double id0,double id1,double id2);
  public void SetPoint2(double id0,double id1,double id2)
  {
    SetPoint2_9(id0,id1,id2);
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

  private native void SetBounds_13(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_13(id0);
  }

  private native void SetBounds_14(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_14(id0,id1,id2,id3,id4,id5);
  }

  private native double[] GetBounds_15();
  public double[] GetBounds()
  {
    return GetBounds_15();
  }

  private native void GetBounds_16(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_16(id0);
  }

  private native void SetLabelFormat_17(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_17(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_18();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_18(), StandardCharsets.UTF_8);
  }

  private native void SetUseTextActor3D_19(boolean id0);
  public void SetUseTextActor3D(boolean id0)
  {
    SetUseTextActor3D_19(id0);
  }

  private native boolean GetUseTextActor3D_20();
  public boolean GetUseTextActor3D()
  {
    return GetUseTextActor3D_20();
  }

  private native void SetMinorTicksVisible_21(boolean id0);
  public void SetMinorTicksVisible(boolean id0)
  {
    SetMinorTicksVisible_21(id0);
  }

  private native boolean GetMinorTicksVisible_22();
  public boolean GetMinorTicksVisible()
  {
    return GetMinorTicksVisible_22();
  }

  private native void MinorTicksVisibleOn_23();
  public void MinorTicksVisibleOn()
  {
    MinorTicksVisibleOn_23();
  }

  private native void MinorTicksVisibleOff_24();
  public void MinorTicksVisibleOff()
  {
    MinorTicksVisibleOff_24();
  }

  private native void SetTitle_25(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_25(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_26();
  public String GetTitle()
  {
    return new String(GetTitle_26(), StandardCharsets.UTF_8);
  }

  private native void SetExponent_27(byte[] id0, int len0);
  public void SetExponent(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetExponent_27(bytes0, bytes0.length);
  }

  private native byte[] GetExponent_28();
  public String GetExponent()
  {
    return new String(GetExponent_28(), StandardCharsets.UTF_8);
  }

  private native void SetMajorTickSize_29(double id0);
  public void SetMajorTickSize(double id0)
  {
    SetMajorTickSize_29(id0);
  }

  private native double GetMajorTickSize_30();
  public double GetMajorTickSize()
  {
    return GetMajorTickSize_30();
  }

  private native void SetMinorTickSize_31(double id0);
  public void SetMinorTickSize(double id0)
  {
    SetMinorTickSize_31(id0);
  }

  private native double GetMinorTickSize_32();
  public double GetMinorTickSize()
  {
    return GetMinorTickSize_32();
  }

  private native void SetTickLocation_33(int id0);
  public void SetTickLocation(int id0)
  {
    SetTickLocation_33(id0);
  }

  private native int GetTickLocationMinValue_34();
  public int GetTickLocationMinValue()
  {
    return GetTickLocationMinValue_34();
  }

  private native int GetTickLocationMaxValue_35();
  public int GetTickLocationMaxValue()
  {
    return GetTickLocationMaxValue_35();
  }

  private native int GetTickLocation_36();
  public int GetTickLocation()
  {
    return GetTickLocation_36();
  }

  private native void SetTickLocationToInside_37();
  public void SetTickLocationToInside()
  {
    SetTickLocationToInside_37();
  }

  private native void SetTickLocationToOutside_38();
  public void SetTickLocationToOutside()
  {
    SetTickLocationToOutside_38();
  }

  private native void SetTickLocationToBoth_39();
  public void SetTickLocationToBoth()
  {
    SetTickLocationToBoth_39();
  }

  private native void SetAxisVisibility_40(boolean id0);
  public void SetAxisVisibility(boolean id0)
  {
    SetAxisVisibility_40(id0);
  }

  private native boolean GetAxisVisibility_41();
  public boolean GetAxisVisibility()
  {
    return GetAxisVisibility_41();
  }

  private native void AxisVisibilityOn_42();
  public void AxisVisibilityOn()
  {
    AxisVisibilityOn_42();
  }

  private native void AxisVisibilityOff_43();
  public void AxisVisibilityOff()
  {
    AxisVisibilityOff_43();
  }

  private native void SetTickVisibility_44(boolean id0);
  public void SetTickVisibility(boolean id0)
  {
    SetTickVisibility_44(id0);
  }

  private native boolean GetTickVisibility_45();
  public boolean GetTickVisibility()
  {
    return GetTickVisibility_45();
  }

  private native void TickVisibilityOn_46();
  public void TickVisibilityOn()
  {
    TickVisibilityOn_46();
  }

  private native void TickVisibilityOff_47();
  public void TickVisibilityOff()
  {
    TickVisibilityOff_47();
  }

  private native void SetLabelVisibility_48(boolean id0);
  public void SetLabelVisibility(boolean id0)
  {
    SetLabelVisibility_48(id0);
  }

  private native boolean GetLabelVisibility_49();
  public boolean GetLabelVisibility()
  {
    return GetLabelVisibility_49();
  }

  private native void LabelVisibilityOn_50();
  public void LabelVisibilityOn()
  {
    LabelVisibilityOn_50();
  }

  private native void LabelVisibilityOff_51();
  public void LabelVisibilityOff()
  {
    LabelVisibilityOff_51();
  }

  private native void SetTitleVisibility_52(boolean id0);
  public void SetTitleVisibility(boolean id0)
  {
    SetTitleVisibility_52(id0);
  }

  private native boolean GetTitleVisibility_53();
  public boolean GetTitleVisibility()
  {
    return GetTitleVisibility_53();
  }

  private native void TitleVisibilityOn_54();
  public void TitleVisibilityOn()
  {
    TitleVisibilityOn_54();
  }

  private native void TitleVisibilityOff_55();
  public void TitleVisibilityOff()
  {
    TitleVisibilityOff_55();
  }

  private native void SetExponentVisibility_56(boolean id0);
  public void SetExponentVisibility(boolean id0)
  {
    SetExponentVisibility_56(id0);
  }

  private native boolean GetExponentVisibility_57();
  public boolean GetExponentVisibility()
  {
    return GetExponentVisibility_57();
  }

  private native void ExponentVisibilityOn_58();
  public void ExponentVisibilityOn()
  {
    ExponentVisibilityOn_58();
  }

  private native void ExponentVisibilityOff_59();
  public void ExponentVisibilityOff()
  {
    ExponentVisibilityOff_59();
  }

  private native void SetLastMajorTickPointCorrection_60(boolean id0);
  public void SetLastMajorTickPointCorrection(boolean id0)
  {
    SetLastMajorTickPointCorrection_60(id0);
  }

  private native boolean GetLastMajorTickPointCorrection_61();
  public boolean GetLastMajorTickPointCorrection()
  {
    return GetLastMajorTickPointCorrection_61();
  }

  private native void LastMajorTickPointCorrectionOn_62();
  public void LastMajorTickPointCorrectionOn()
  {
    LastMajorTickPointCorrectionOn_62();
  }

  private native void LastMajorTickPointCorrectionOff_63();
  public void LastMajorTickPointCorrectionOff()
  {
    LastMajorTickPointCorrectionOff_63();
  }

  private native void SetTitleAlignLocation_64(int id0);
  public void SetTitleAlignLocation(int id0)
  {
    SetTitleAlignLocation_64(id0);
  }

  private native int GetTitleAlignLocation_65();
  public int GetTitleAlignLocation()
  {
    return GetTitleAlignLocation_65();
  }

  private native void SetExponentLocation_66(int id0);
  public void SetExponentLocation(int id0)
  {
    SetExponentLocation_66(id0);
  }

  private native int GetExponentLocation_67();
  public int GetExponentLocation()
  {
    return GetExponentLocation_67();
  }

  private native void SetTitleTextProperty_68(vtkTextProperty id0);
  public void SetTitleTextProperty(vtkTextProperty id0)
  {
    SetTitleTextProperty_68(id0);
  }

  private native long GetTitleTextProperty_69();
  public vtkTextProperty GetTitleTextProperty()
  {
    long temp = GetTitleTextProperty_69();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelTextProperty_70(vtkTextProperty id0);
  public void SetLabelTextProperty(vtkTextProperty id0)
  {
    SetLabelTextProperty_70(id0);
  }

  private native long GetLabelTextProperty_71();
  public vtkTextProperty GetLabelTextProperty()
  {
    long temp = GetLabelTextProperty_71();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxisLinesProperty_72(vtkProperty id0);
  public void SetAxisLinesProperty(vtkProperty id0)
  {
    SetAxisLinesProperty_72(id0);
  }

  private native long GetAxisLinesProperty_73();
  public vtkProperty GetAxisLinesProperty()
  {
    long temp = GetAxisLinesProperty_73();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxisMainLineProperty_74(vtkProperty id0);
  public void SetAxisMainLineProperty(vtkProperty id0)
  {
    SetAxisMainLineProperty_74(id0);
  }

  private native long GetAxisMainLineProperty_75();
  public vtkProperty GetAxisMainLineProperty()
  {
    long temp = GetAxisMainLineProperty_75();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxisMajorTicksProperty_76(vtkProperty id0);
  public void SetAxisMajorTicksProperty(vtkProperty id0)
  {
    SetAxisMajorTicksProperty_76(id0);
  }

  private native long GetAxisMajorTicksProperty_77();
  public vtkProperty GetAxisMajorTicksProperty()
  {
    long temp = GetAxisMajorTicksProperty_77();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxisMinorTicksProperty_78(vtkProperty id0);
  public void SetAxisMinorTicksProperty(vtkProperty id0)
  {
    SetAxisMinorTicksProperty_78(id0);
  }

  private native long GetAxisMinorTicksProperty_79();
  public vtkProperty GetAxisMinorTicksProperty()
  {
    long temp = GetAxisMinorTicksProperty_79();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGridlinesProperty_80(vtkProperty id0);
  public void SetGridlinesProperty(vtkProperty id0)
  {
    SetGridlinesProperty_80(id0);
  }

  private native long GetGridlinesProperty_81();
  public vtkProperty GetGridlinesProperty()
  {
    long temp = GetGridlinesProperty_81();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInnerGridlinesProperty_82(vtkProperty id0);
  public void SetInnerGridlinesProperty(vtkProperty id0)
  {
    SetInnerGridlinesProperty_82(id0);
  }

  private native long GetInnerGridlinesProperty_83();
  public vtkProperty GetInnerGridlinesProperty()
  {
    long temp = GetInnerGridlinesProperty_83();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGridpolysProperty_84(vtkProperty id0);
  public void SetGridpolysProperty(vtkProperty id0)
  {
    SetGridpolysProperty_84(id0);
  }

  private native long GetGridpolysProperty_85();
  public vtkProperty GetGridpolysProperty()
  {
    long temp = GetGridpolysProperty_85();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDrawGridlines_86(boolean id0);
  public void SetDrawGridlines(boolean id0)
  {
    SetDrawGridlines_86(id0);
  }

  private native boolean GetDrawGridlines_87();
  public boolean GetDrawGridlines()
  {
    return GetDrawGridlines_87();
  }

  private native void DrawGridlinesOn_88();
  public void DrawGridlinesOn()
  {
    DrawGridlinesOn_88();
  }

  private native void DrawGridlinesOff_89();
  public void DrawGridlinesOff()
  {
    DrawGridlinesOff_89();
  }

  private native void SetDrawGridlinesOnly_90(boolean id0);
  public void SetDrawGridlinesOnly(boolean id0)
  {
    SetDrawGridlinesOnly_90(id0);
  }

  private native boolean GetDrawGridlinesOnly_91();
  public boolean GetDrawGridlinesOnly()
  {
    return GetDrawGridlinesOnly_91();
  }

  private native void DrawGridlinesOnlyOn_92();
  public void DrawGridlinesOnlyOn()
  {
    DrawGridlinesOnlyOn_92();
  }

  private native void DrawGridlinesOnlyOff_93();
  public void DrawGridlinesOnlyOff()
  {
    DrawGridlinesOnlyOff_93();
  }

  private native void SetDrawGridlinesLocation_94(int id0);
  public void SetDrawGridlinesLocation(int id0)
  {
    SetDrawGridlinesLocation_94(id0);
  }

  private native int GetDrawGridlinesLocation_95();
  public int GetDrawGridlinesLocation()
  {
    return GetDrawGridlinesLocation_95();
  }

  private native void SetDrawInnerGridlines_96(boolean id0);
  public void SetDrawInnerGridlines(boolean id0)
  {
    SetDrawInnerGridlines_96(id0);
  }

  private native boolean GetDrawInnerGridlines_97();
  public boolean GetDrawInnerGridlines()
  {
    return GetDrawInnerGridlines_97();
  }

  private native void DrawInnerGridlinesOn_98();
  public void DrawInnerGridlinesOn()
  {
    DrawInnerGridlinesOn_98();
  }

  private native void DrawInnerGridlinesOff_99();
  public void DrawInnerGridlinesOff()
  {
    DrawInnerGridlinesOff_99();
  }

  private native void SetGridlineXLength_100(double id0);
  public void SetGridlineXLength(double id0)
  {
    SetGridlineXLength_100(id0);
  }

  private native double GetGridlineXLength_101();
  public double GetGridlineXLength()
  {
    return GetGridlineXLength_101();
  }

  private native void SetGridlineYLength_102(double id0);
  public void SetGridlineYLength(double id0)
  {
    SetGridlineYLength_102(id0);
  }

  private native double GetGridlineYLength_103();
  public double GetGridlineYLength()
  {
    return GetGridlineYLength_103();
  }

  private native void SetGridlineZLength_104(double id0);
  public void SetGridlineZLength(double id0)
  {
    SetGridlineZLength_104(id0);
  }

  private native double GetGridlineZLength_105();
  public double GetGridlineZLength()
  {
    return GetGridlineZLength_105();
  }

  private native void SetDrawGridpolys_106(boolean id0);
  public void SetDrawGridpolys(boolean id0)
  {
    SetDrawGridpolys_106(id0);
  }

  private native boolean GetDrawGridpolys_107();
  public boolean GetDrawGridpolys()
  {
    return GetDrawGridpolys_107();
  }

  private native void DrawGridpolysOn_108();
  public void DrawGridpolysOn()
  {
    DrawGridpolysOn_108();
  }

  private native void DrawGridpolysOff_109();
  public void DrawGridpolysOff()
  {
    DrawGridpolysOff_109();
  }

  private native void SetAxisType_110(int id0);
  public void SetAxisType(int id0)
  {
    SetAxisType_110(id0);
  }

  private native int GetAxisTypeMinValue_111();
  public int GetAxisTypeMinValue()
  {
    return GetAxisTypeMinValue_111();
  }

  private native int GetAxisTypeMaxValue_112();
  public int GetAxisTypeMaxValue()
  {
    return GetAxisTypeMaxValue_112();
  }

  private native int GetAxisType_113();
  public int GetAxisType()
  {
    return GetAxisType_113();
  }

  private native void SetAxisTypeToX_114();
  public void SetAxisTypeToX()
  {
    SetAxisTypeToX_114();
  }

  private native void SetAxisTypeToY_115();
  public void SetAxisTypeToY()
  {
    SetAxisTypeToY_115();
  }

  private native void SetAxisTypeToZ_116();
  public void SetAxisTypeToZ()
  {
    SetAxisTypeToZ_116();
  }

  private native void SetLog_117(boolean id0);
  public void SetLog(boolean id0)
  {
    SetLog_117(id0);
  }

  private native boolean GetLog_118();
  public boolean GetLog()
  {
    return GetLog_118();
  }

  private native void LogOn_119();
  public void LogOn()
  {
    LogOn_119();
  }

  private native void LogOff_120();
  public void LogOff()
  {
    LogOff_120();
  }

  private native void SetAxisPosition_121(int id0);
  public void SetAxisPosition(int id0)
  {
    SetAxisPosition_121(id0);
  }

  private native int GetAxisPositionMinValue_122();
  public int GetAxisPositionMinValue()
  {
    return GetAxisPositionMinValue_122();
  }

  private native int GetAxisPositionMaxValue_123();
  public int GetAxisPositionMaxValue()
  {
    return GetAxisPositionMaxValue_123();
  }

  private native int GetAxisPosition_124();
  public int GetAxisPosition()
  {
    return GetAxisPosition_124();
  }

  private native void SetAxisPositionToMinMin_125();
  public void SetAxisPositionToMinMin()
  {
    SetAxisPositionToMinMin_125();
  }

  private native void SetAxisPositionToMinMax_126();
  public void SetAxisPositionToMinMax()
  {
    SetAxisPositionToMinMax_126();
  }

  private native void SetAxisPositionToMaxMax_127();
  public void SetAxisPositionToMaxMax()
  {
    SetAxisPositionToMaxMax_127();
  }

  private native void SetAxisPositionToMaxMin_128();
  public void SetAxisPositionToMaxMin()
  {
    SetAxisPositionToMaxMin_128();
  }

  private native void SetCamera_129(vtkCamera id0);
  public void SetCamera(vtkCamera id0)
  {
    SetCamera_129(id0);
  }

  private native long GetCamera_130();
  public vtkCamera GetCamera()
  {
    long temp = GetCamera_130();

    if (temp == 0) return null;
    return (vtkCamera)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int RenderOpaqueGeometry_131(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_131(id0);
  }

  private native int RenderTranslucentGeometry_132(vtkViewport id0);
  public int RenderTranslucentGeometry(vtkViewport id0)
  {
    return RenderTranslucentGeometry_132(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_133(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_133(id0);
  }

  private native int RenderOverlay_134(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_134(id0);
  }

  private native int HasTranslucentPolygonalGeometry_135();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_135();
  }

  private native void ReleaseGraphicsResources_136(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_136(id0);
  }

  private native double ComputeMaxLabelLength_137(double id0[]);
  public double ComputeMaxLabelLength(double id0[])
  {
    return ComputeMaxLabelLength_137(id0);
  }

  private native double ComputeTitleLength_138(double id0[]);
  public double ComputeTitleLength(double id0[])
  {
    return ComputeTitleLength_138(id0);
  }

  private native void SetLabelScale_139(double id0);
  public void SetLabelScale(double id0)
  {
    SetLabelScale_139(id0);
  }

  private native void SetLabelScale_140(int id0,double id1);
  public void SetLabelScale(int id0,double id1)
  {
    SetLabelScale_140(id0,id1);
  }

  private native void SetTitleScale_141(double id0);
  public void SetTitleScale(double id0)
  {
    SetTitleScale_141(id0);
  }

  private native void SetMinorStart_142(double id0);
  public void SetMinorStart(double id0)
  {
    SetMinorStart_142(id0);
  }

  private native double GetMinorStart_143();
  public double GetMinorStart()
  {
    return GetMinorStart_143();
  }

  private native double GetMajorStart_144(int id0);
  public double GetMajorStart(int id0)
  {
    return GetMajorStart_144(id0);
  }

  private native void SetMajorStart_145(int id0,double id1);
  public void SetMajorStart(int id0,double id1)
  {
    SetMajorStart_145(id0,id1);
  }

  private native void SetDeltaMinor_146(double id0);
  public void SetDeltaMinor(double id0)
  {
    SetDeltaMinor_146(id0);
  }

  private native double GetDeltaMinor_147();
  public double GetDeltaMinor()
  {
    return GetDeltaMinor_147();
  }

  private native double GetDeltaMajor_148(int id0);
  public double GetDeltaMajor(int id0)
  {
    return GetDeltaMajor_148(id0);
  }

  private native void SetDeltaMajor_149(int id0,double id1);
  public void SetDeltaMajor(int id0,double id1)
  {
    SetDeltaMajor_149(id0,id1);
  }

  private native void SetMinorRangeStart_150(double id0);
  public void SetMinorRangeStart(double id0)
  {
    SetMinorRangeStart_150(id0);
  }

  private native double GetMinorRangeStart_151();
  public double GetMinorRangeStart()
  {
    return GetMinorRangeStart_151();
  }

  private native void SetMajorRangeStart_152(double id0);
  public void SetMajorRangeStart(double id0)
  {
    SetMajorRangeStart_152(id0);
  }

  private native double GetMajorRangeStart_153();
  public double GetMajorRangeStart()
  {
    return GetMajorRangeStart_153();
  }

  private native void SetDeltaRangeMinor_154(double id0);
  public void SetDeltaRangeMinor(double id0)
  {
    SetDeltaRangeMinor_154(id0);
  }

  private native double GetDeltaRangeMinor_155();
  public double GetDeltaRangeMinor()
  {
    return GetDeltaRangeMinor_155();
  }

  private native void SetDeltaRangeMajor_156(double id0);
  public void SetDeltaRangeMajor(double id0)
  {
    SetDeltaRangeMajor_156(id0);
  }

  private native double GetDeltaRangeMajor_157();
  public double GetDeltaRangeMajor()
  {
    return GetDeltaRangeMajor_157();
  }

  private native void SetLabels_158(vtkStringArray id0);
  public void SetLabels(vtkStringArray id0)
  {
    SetLabels_158(id0);
  }

  private native void BuildAxis_159(vtkViewport id0,boolean id1);
  public void BuildAxis(vtkViewport id0,boolean id1)
  {
    BuildAxis_159(id0,id1);
  }

  private native long GetTitleActor_160();
  public vtkAxisFollower GetTitleActor()
  {
    long temp = GetTitleActor_160();

    if (temp == 0) return null;
    return (vtkAxisFollower)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetExponentActor_161();
  public vtkAxisFollower GetExponentActor()
  {
    long temp = GetExponentActor_161();

    if (temp == 0) return null;
    return (vtkAxisFollower)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTitleProp3D_162();
  public vtkProp3DAxisFollower GetTitleProp3D()
  {
    long temp = GetTitleProp3D_162();

    if (temp == 0) return null;
    return (vtkProp3DAxisFollower)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetExponentProp3D_163();
  public vtkProp3DAxisFollower GetExponentProp3D()
  {
    long temp = GetExponentProp3D_163();

    if (temp == 0) return null;
    return (vtkProp3DAxisFollower)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfLabelsBuilt_164();
  public int GetNumberOfLabelsBuilt()
  {
    return GetNumberOfLabelsBuilt_164();
  }

  private native void SetCalculateTitleOffset_165(boolean id0);
  public void SetCalculateTitleOffset(boolean id0)
  {
    SetCalculateTitleOffset_165(id0);
  }

  private native boolean GetCalculateTitleOffset_166();
  public boolean GetCalculateTitleOffset()
  {
    return GetCalculateTitleOffset_166();
  }

  private native void CalculateTitleOffsetOn_167();
  public void CalculateTitleOffsetOn()
  {
    CalculateTitleOffsetOn_167();
  }

  private native void CalculateTitleOffsetOff_168();
  public void CalculateTitleOffsetOff()
  {
    CalculateTitleOffsetOff_168();
  }

  private native void SetCalculateLabelOffset_169(boolean id0);
  public void SetCalculateLabelOffset(boolean id0)
  {
    SetCalculateLabelOffset_169(id0);
  }

  private native boolean GetCalculateLabelOffset_170();
  public boolean GetCalculateLabelOffset()
  {
    return GetCalculateLabelOffset_170();
  }

  private native void CalculateLabelOffsetOn_171();
  public void CalculateLabelOffsetOn()
  {
    CalculateLabelOffsetOn_171();
  }

  private native void CalculateLabelOffsetOff_172();
  public void CalculateLabelOffsetOff()
  {
    CalculateLabelOffsetOff_172();
  }

  private native void SetUse2DMode_173(boolean id0);
  public void SetUse2DMode(boolean id0)
  {
    SetUse2DMode_173(id0);
  }

  private native boolean GetUse2DMode_174();
  public boolean GetUse2DMode()
  {
    return GetUse2DMode_174();
  }

  private native void SetVerticalOffsetXTitle2D_175(double id0);
  public void SetVerticalOffsetXTitle2D(double id0)
  {
    SetVerticalOffsetXTitle2D_175(id0);
  }

  private native double GetVerticalOffsetXTitle2D_176();
  public double GetVerticalOffsetXTitle2D()
  {
    return GetVerticalOffsetXTitle2D_176();
  }

  private native void SetHorizontalOffsetYTitle2D_177(double id0);
  public void SetHorizontalOffsetYTitle2D(double id0)
  {
    SetHorizontalOffsetYTitle2D_177(id0);
  }

  private native double GetHorizontalOffsetYTitle2D_178();
  public double GetHorizontalOffsetYTitle2D()
  {
    return GetHorizontalOffsetYTitle2D_178();
  }

  private native void SetSaveTitlePosition_179(int id0);
  public void SetSaveTitlePosition(int id0)
  {
    SetSaveTitlePosition_179(id0);
  }

  private native int GetSaveTitlePosition_180();
  public int GetSaveTitlePosition()
  {
    return GetSaveTitlePosition_180();
  }

  private native void SetAxisBaseForX_181(double id0,double id1,double id2);
  public void SetAxisBaseForX(double id0,double id1,double id2)
  {
    SetAxisBaseForX_181(id0,id1,id2);
  }

  private native void SetAxisBaseForX_182(double id0[]);
  public void SetAxisBaseForX(double id0[])
  {
    SetAxisBaseForX_182(id0);
  }

  private native double[] GetAxisBaseForX_183();
  public double[] GetAxisBaseForX()
  {
    return GetAxisBaseForX_183();
  }

  private native void SetAxisBaseForY_184(double id0,double id1,double id2);
  public void SetAxisBaseForY(double id0,double id1,double id2)
  {
    SetAxisBaseForY_184(id0,id1,id2);
  }

  private native void SetAxisBaseForY_185(double id0[]);
  public void SetAxisBaseForY(double id0[])
  {
    SetAxisBaseForY_185(id0);
  }

  private native double[] GetAxisBaseForY_186();
  public double[] GetAxisBaseForY()
  {
    return GetAxisBaseForY_186();
  }

  private native void SetAxisBaseForZ_187(double id0,double id1,double id2);
  public void SetAxisBaseForZ(double id0,double id1,double id2)
  {
    SetAxisBaseForZ_187(id0,id1,id2);
  }

  private native void SetAxisBaseForZ_188(double id0[]);
  public void SetAxisBaseForZ(double id0[])
  {
    SetAxisBaseForZ_188(id0);
  }

  private native double[] GetAxisBaseForZ_189();
  public double[] GetAxisBaseForZ()
  {
    return GetAxisBaseForZ_189();
  }

  private native void SetAxisOnOrigin_190(boolean id0);
  public void SetAxisOnOrigin(boolean id0)
  {
    SetAxisOnOrigin_190(id0);
  }

  private native boolean GetAxisOnOrigin_191();
  public boolean GetAxisOnOrigin()
  {
    return GetAxisOnOrigin_191();
  }

  private native void SetScreenSize_192(double id0);
  public void SetScreenSize(double id0)
  {
    SetScreenSize_192(id0);
  }

  private native double GetScreenSize_193();
  public double GetScreenSize()
  {
    return GetScreenSize_193();
  }

  private native void SetLabelOffset_194(double id0);
  public void SetLabelOffset(double id0)
  {
    SetLabelOffset_194(id0);
  }

  private native double GetLabelOffset_195();
  public double GetLabelOffset()
  {
    return GetLabelOffset_195();
  }

  private native void SetExponentOffset_196(double id0);
  public void SetExponentOffset(double id0)
  {
    SetExponentOffset_196(id0);
  }

  private native double GetExponentOffset_197();
  public double GetExponentOffset()
  {
    return GetExponentOffset_197();
  }

  private native void SetTitleOffset_198(double id0);
  public void SetTitleOffset(double id0)
  {
    SetTitleOffset_198(id0);
  }

  private native double GetTitleOffset_199();
  public double GetTitleOffset()
  {
    return GetTitleOffset_199();
  }

  private native void SetTitleOffset_200(double id0,double id1);
  public void SetTitleOffset(double id0,double id1)
  {
    SetTitleOffset_200(id0,id1);
  }

  private native void SetTitleOffset_201(double id0[]);
  public void SetTitleOffset(double id0[])
  {
    SetTitleOffset_201(id0);
  }

  public vtkAxisActor() { super(); }

  public vtkAxisActor(long id) { super(id); }
  public native long   VTKInit();

}
