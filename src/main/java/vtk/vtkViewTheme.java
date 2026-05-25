// java wrapper for vtkViewTheme object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkViewTheme extends vtkObject
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

  private native void SetPointSize_4(double id0);
  public void SetPointSize(double id0)
  {
    SetPointSize_4(id0);
  }

  private native double GetPointSize_5();
  public double GetPointSize()
  {
    return GetPointSize_5();
  }

  private native void SetLineWidth_6(double id0);
  public void SetLineWidth(double id0)
  {
    SetLineWidth_6(id0);
  }

  private native double GetLineWidth_7();
  public double GetLineWidth()
  {
    return GetLineWidth_7();
  }

  private native void SetPointColor_8(double id0,double id1,double id2);
  public void SetPointColor(double id0,double id1,double id2)
  {
    SetPointColor_8(id0,id1,id2);
  }

  private native void SetPointColor_9(double id0[]);
  public void SetPointColor(double id0[])
  {
    SetPointColor_9(id0);
  }

  private native double[] GetPointColor_10();
  public double[] GetPointColor()
  {
    return GetPointColor_10();
  }

  private native void SetPointOpacity_11(double id0);
  public void SetPointOpacity(double id0)
  {
    SetPointOpacity_11(id0);
  }

  private native double GetPointOpacity_12();
  public double GetPointOpacity()
  {
    return GetPointOpacity_12();
  }

  private native void SetPointHueRange_13(double id0,double id1);
  public void SetPointHueRange(double id0,double id1)
  {
    SetPointHueRange_13(id0,id1);
  }

  private native void SetPointHueRange_14(double id0[]);
  public void SetPointHueRange(double id0[])
  {
    SetPointHueRange_14(id0);
  }

  private native void GetPointHueRange_15(double id0[]);
  public void GetPointHueRange(double id0[])
  {
    GetPointHueRange_15(id0);
  }

  private native void SetPointSaturationRange_16(double id0,double id1);
  public void SetPointSaturationRange(double id0,double id1)
  {
    SetPointSaturationRange_16(id0,id1);
  }

  private native void SetPointSaturationRange_17(double id0[]);
  public void SetPointSaturationRange(double id0[])
  {
    SetPointSaturationRange_17(id0);
  }

  private native void GetPointSaturationRange_18(double id0[]);
  public void GetPointSaturationRange(double id0[])
  {
    GetPointSaturationRange_18(id0);
  }

  private native void SetPointValueRange_19(double id0,double id1);
  public void SetPointValueRange(double id0,double id1)
  {
    SetPointValueRange_19(id0,id1);
  }

  private native void SetPointValueRange_20(double id0[]);
  public void SetPointValueRange(double id0[])
  {
    SetPointValueRange_20(id0);
  }

  private native void GetPointValueRange_21(double id0[]);
  public void GetPointValueRange(double id0[])
  {
    GetPointValueRange_21(id0);
  }

  private native void SetPointAlphaRange_22(double id0,double id1);
  public void SetPointAlphaRange(double id0,double id1)
  {
    SetPointAlphaRange_22(id0,id1);
  }

  private native void SetPointAlphaRange_23(double id0[]);
  public void SetPointAlphaRange(double id0[])
  {
    SetPointAlphaRange_23(id0);
  }

  private native void GetPointAlphaRange_24(double id0[]);
  public void GetPointAlphaRange(double id0[])
  {
    GetPointAlphaRange_24(id0);
  }

  private native long GetPointLookupTable_25();
  public vtkScalarsToColors GetPointLookupTable()
  {
    long temp = GetPointLookupTable_25();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPointLookupTable_26(vtkScalarsToColors id0);
  public void SetPointLookupTable(vtkScalarsToColors id0)
  {
    SetPointLookupTable_26(id0);
  }

  private native void SetScalePointLookupTable_27(boolean id0);
  public void SetScalePointLookupTable(boolean id0)
  {
    SetScalePointLookupTable_27(id0);
  }

  private native boolean GetScalePointLookupTable_28();
  public boolean GetScalePointLookupTable()
  {
    return GetScalePointLookupTable_28();
  }

  private native void ScalePointLookupTableOn_29();
  public void ScalePointLookupTableOn()
  {
    ScalePointLookupTableOn_29();
  }

  private native void ScalePointLookupTableOff_30();
  public void ScalePointLookupTableOff()
  {
    ScalePointLookupTableOff_30();
  }

  private native void SetCellColor_31(double id0,double id1,double id2);
  public void SetCellColor(double id0,double id1,double id2)
  {
    SetCellColor_31(id0,id1,id2);
  }

  private native void SetCellColor_32(double id0[]);
  public void SetCellColor(double id0[])
  {
    SetCellColor_32(id0);
  }

  private native double[] GetCellColor_33();
  public double[] GetCellColor()
  {
    return GetCellColor_33();
  }

  private native void SetCellOpacity_34(double id0);
  public void SetCellOpacity(double id0)
  {
    SetCellOpacity_34(id0);
  }

  private native double GetCellOpacity_35();
  public double GetCellOpacity()
  {
    return GetCellOpacity_35();
  }

  private native void SetCellHueRange_36(double id0,double id1);
  public void SetCellHueRange(double id0,double id1)
  {
    SetCellHueRange_36(id0,id1);
  }

  private native void SetCellHueRange_37(double id0[]);
  public void SetCellHueRange(double id0[])
  {
    SetCellHueRange_37(id0);
  }

  private native void GetCellHueRange_38(double id0[]);
  public void GetCellHueRange(double id0[])
  {
    GetCellHueRange_38(id0);
  }

  private native void SetCellSaturationRange_39(double id0,double id1);
  public void SetCellSaturationRange(double id0,double id1)
  {
    SetCellSaturationRange_39(id0,id1);
  }

  private native void SetCellSaturationRange_40(double id0[]);
  public void SetCellSaturationRange(double id0[])
  {
    SetCellSaturationRange_40(id0);
  }

  private native void GetCellSaturationRange_41(double id0[]);
  public void GetCellSaturationRange(double id0[])
  {
    GetCellSaturationRange_41(id0);
  }

  private native void SetCellValueRange_42(double id0,double id1);
  public void SetCellValueRange(double id0,double id1)
  {
    SetCellValueRange_42(id0,id1);
  }

  private native void SetCellValueRange_43(double id0[]);
  public void SetCellValueRange(double id0[])
  {
    SetCellValueRange_43(id0);
  }

  private native void GetCellValueRange_44(double id0[]);
  public void GetCellValueRange(double id0[])
  {
    GetCellValueRange_44(id0);
  }

  private native void SetCellAlphaRange_45(double id0,double id1);
  public void SetCellAlphaRange(double id0,double id1)
  {
    SetCellAlphaRange_45(id0,id1);
  }

  private native void SetCellAlphaRange_46(double id0[]);
  public void SetCellAlphaRange(double id0[])
  {
    SetCellAlphaRange_46(id0);
  }

  private native void GetCellAlphaRange_47(double id0[]);
  public void GetCellAlphaRange(double id0[])
  {
    GetCellAlphaRange_47(id0);
  }

  private native long GetCellLookupTable_48();
  public vtkScalarsToColors GetCellLookupTable()
  {
    long temp = GetCellLookupTable_48();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCellLookupTable_49(vtkScalarsToColors id0);
  public void SetCellLookupTable(vtkScalarsToColors id0)
  {
    SetCellLookupTable_49(id0);
  }

  private native void SetScaleCellLookupTable_50(boolean id0);
  public void SetScaleCellLookupTable(boolean id0)
  {
    SetScaleCellLookupTable_50(id0);
  }

  private native boolean GetScaleCellLookupTable_51();
  public boolean GetScaleCellLookupTable()
  {
    return GetScaleCellLookupTable_51();
  }

  private native void ScaleCellLookupTableOn_52();
  public void ScaleCellLookupTableOn()
  {
    ScaleCellLookupTableOn_52();
  }

  private native void ScaleCellLookupTableOff_53();
  public void ScaleCellLookupTableOff()
  {
    ScaleCellLookupTableOff_53();
  }

  private native void SetOutlineColor_54(double id0,double id1,double id2);
  public void SetOutlineColor(double id0,double id1,double id2)
  {
    SetOutlineColor_54(id0,id1,id2);
  }

  private native void SetOutlineColor_55(double id0[]);
  public void SetOutlineColor(double id0[])
  {
    SetOutlineColor_55(id0);
  }

  private native double[] GetOutlineColor_56();
  public double[] GetOutlineColor()
  {
    return GetOutlineColor_56();
  }

  private native void SetSelectedPointColor_57(double id0,double id1,double id2);
  public void SetSelectedPointColor(double id0,double id1,double id2)
  {
    SetSelectedPointColor_57(id0,id1,id2);
  }

  private native void SetSelectedPointColor_58(double id0[]);
  public void SetSelectedPointColor(double id0[])
  {
    SetSelectedPointColor_58(id0);
  }

  private native double[] GetSelectedPointColor_59();
  public double[] GetSelectedPointColor()
  {
    return GetSelectedPointColor_59();
  }

  private native void SetSelectedPointOpacity_60(double id0);
  public void SetSelectedPointOpacity(double id0)
  {
    SetSelectedPointOpacity_60(id0);
  }

  private native double GetSelectedPointOpacity_61();
  public double GetSelectedPointOpacity()
  {
    return GetSelectedPointOpacity_61();
  }

  private native void SetSelectedCellColor_62(double id0,double id1,double id2);
  public void SetSelectedCellColor(double id0,double id1,double id2)
  {
    SetSelectedCellColor_62(id0,id1,id2);
  }

  private native void SetSelectedCellColor_63(double id0[]);
  public void SetSelectedCellColor(double id0[])
  {
    SetSelectedCellColor_63(id0);
  }

  private native double[] GetSelectedCellColor_64();
  public double[] GetSelectedCellColor()
  {
    return GetSelectedCellColor_64();
  }

  private native void SetSelectedCellOpacity_65(double id0);
  public void SetSelectedCellOpacity(double id0)
  {
    SetSelectedCellOpacity_65(id0);
  }

  private native double GetSelectedCellOpacity_66();
  public double GetSelectedCellOpacity()
  {
    return GetSelectedCellOpacity_66();
  }

  private native void SetBackgroundColor_67(double id0,double id1,double id2);
  public void SetBackgroundColor(double id0,double id1,double id2)
  {
    SetBackgroundColor_67(id0,id1,id2);
  }

  private native void SetBackgroundColor_68(double id0[]);
  public void SetBackgroundColor(double id0[])
  {
    SetBackgroundColor_68(id0);
  }

  private native double[] GetBackgroundColor_69();
  public double[] GetBackgroundColor()
  {
    return GetBackgroundColor_69();
  }

  private native void SetBackgroundColor2_70(double id0,double id1,double id2);
  public void SetBackgroundColor2(double id0,double id1,double id2)
  {
    SetBackgroundColor2_70(id0,id1,id2);
  }

  private native void SetBackgroundColor2_71(double id0[]);
  public void SetBackgroundColor2(double id0[])
  {
    SetBackgroundColor2_71(id0);
  }

  private native double[] GetBackgroundColor2_72();
  public double[] GetBackgroundColor2()
  {
    return GetBackgroundColor2_72();
  }

  private native void SetPointTextProperty_73(vtkTextProperty id0);
  public void SetPointTextProperty(vtkTextProperty id0)
  {
    SetPointTextProperty_73(id0);
  }

  private native long GetPointTextProperty_74();
  public vtkTextProperty GetPointTextProperty()
  {
    long temp = GetPointTextProperty_74();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCellTextProperty_75(vtkTextProperty id0);
  public void SetCellTextProperty(vtkTextProperty id0)
  {
    SetCellTextProperty_75(id0);
  }

  private native long GetCellTextProperty_76();
  public vtkTextProperty GetCellTextProperty()
  {
    long temp = GetCellTextProperty_76();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetVertexLabelColor_77(double id0,double id1,double id2);
  public void SetVertexLabelColor(double id0,double id1,double id2)
  {
    SetVertexLabelColor_77(id0,id1,id2);
  }

  private native void SetVertexLabelColor_78(double id0[]);
  public void SetVertexLabelColor(double id0[])
  {
    SetVertexLabelColor_78(id0);
  }

  private native void GetVertexLabelColor_79(double id0[]);
  public void GetVertexLabelColor(double id0[])
  {
    GetVertexLabelColor_79(id0);
  }

  private native void SetEdgeLabelColor_80(double id0,double id1,double id2);
  public void SetEdgeLabelColor(double id0,double id1,double id2)
  {
    SetEdgeLabelColor_80(id0,id1,id2);
  }

  private native void SetEdgeLabelColor_81(double id0[]);
  public void SetEdgeLabelColor(double id0[])
  {
    SetEdgeLabelColor_81(id0);
  }

  private native void GetEdgeLabelColor_82(double id0[]);
  public void GetEdgeLabelColor(double id0[])
  {
    GetEdgeLabelColor_82(id0);
  }

  private native long CreateOceanTheme_83();
  public vtkViewTheme CreateOceanTheme()
  {
    long temp = CreateOceanTheme_83();

    if (temp == 0) return null;
    return (vtkViewTheme)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CreateMellowTheme_84();
  public vtkViewTheme CreateMellowTheme()
  {
    long temp = CreateMellowTheme_84();

    if (temp == 0) return null;
    return (vtkViewTheme)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CreateNeonTheme_85();
  public vtkViewTheme CreateNeonTheme()
  {
    long temp = CreateNeonTheme_85();

    if (temp == 0) return null;
    return (vtkViewTheme)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean LookupMatchesPointTheme_86(vtkScalarsToColors id0);
  public boolean LookupMatchesPointTheme(vtkScalarsToColors id0)
  {
    return LookupMatchesPointTheme_86(id0);
  }

  private native boolean LookupMatchesCellTheme_87(vtkScalarsToColors id0);
  public boolean LookupMatchesCellTheme(vtkScalarsToColors id0)
  {
    return LookupMatchesCellTheme_87(id0);
  }

  public vtkViewTheme() { super(); }

  public vtkViewTheme(long id) { super(id); }
  public native long   VTKInit();

}
