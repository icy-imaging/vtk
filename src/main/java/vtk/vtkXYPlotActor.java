// java wrapper for vtkXYPlotActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXYPlotActor extends vtkActor2D
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

  private native void AddDataSetInput_4(vtkDataSet id0,byte[] id1, int len1,int id2);
  public void AddDataSetInput(vtkDataSet id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddDataSetInput_4(id0,bytes1, bytes1.length,id2);
  }

  private native void AddDataSetInput_5(vtkDataSet id0);
  public void AddDataSetInput(vtkDataSet id0)
  {
    AddDataSetInput_5(id0);
  }

  private native void AddDataSetInputConnection_6(vtkAlgorithmOutput id0,byte[] id1, int len1,int id2);
  public void AddDataSetInputConnection(vtkAlgorithmOutput id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddDataSetInputConnection_6(id0,bytes1, bytes1.length,id2);
  }

  private native void AddDataSetInputConnection_7(vtkAlgorithmOutput id0);
  public void AddDataSetInputConnection(vtkAlgorithmOutput id0)
  {
    AddDataSetInputConnection_7(id0);
  }

  private native void RemoveDataSetInput_8(vtkDataSet id0,byte[] id1, int len1,int id2);
  public void RemoveDataSetInput(vtkDataSet id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    RemoveDataSetInput_8(id0,bytes1, bytes1.length,id2);
  }

  private native void RemoveDataSetInput_9(vtkDataSet id0);
  public void RemoveDataSetInput(vtkDataSet id0)
  {
    RemoveDataSetInput_9(id0);
  }

  private native void RemoveDataSetInputConnection_10(vtkAlgorithmOutput id0,byte[] id1, int len1,int id2);
  public void RemoveDataSetInputConnection(vtkAlgorithmOutput id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    RemoveDataSetInputConnection_10(id0,bytes1, bytes1.length,id2);
  }

  private native void RemoveDataSetInputConnection_11(vtkAlgorithmOutput id0);
  public void RemoveDataSetInputConnection(vtkAlgorithmOutput id0)
  {
    RemoveDataSetInputConnection_11(id0);
  }

  private native void RemoveAllDataSetInputConnections_12();
  public void RemoveAllDataSetInputConnections()
  {
    RemoveAllDataSetInputConnections_12();
  }

  private native long GetDataSetInputConnection_13(int id0);
  public vtkAlgorithmOutput GetDataSetInputConnection(int id0)
  {
    long temp = GetDataSetInputConnection_13(id0);

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfDataSetInputConnections_14();
  public int GetNumberOfDataSetInputConnections()
  {
    return GetNumberOfDataSetInputConnections_14();
  }

  private native void SetPointComponent_15(int id0,int id1);
  public void SetPointComponent(int id0,int id1)
  {
    SetPointComponent_15(id0,id1);
  }

  private native int GetPointComponent_16(int id0);
  public int GetPointComponent(int id0)
  {
    return GetPointComponent_16(id0);
  }

  private native void SetXValues_17(int id0);
  public void SetXValues(int id0)
  {
    SetXValues_17(id0);
  }

  private native int GetXValuesMinValue_18();
  public int GetXValuesMinValue()
  {
    return GetXValuesMinValue_18();
  }

  private native int GetXValuesMaxValue_19();
  public int GetXValuesMaxValue()
  {
    return GetXValuesMaxValue_19();
  }

  private native int GetXValues_20();
  public int GetXValues()
  {
    return GetXValues_20();
  }

  private native void SetXValuesToIndex_21();
  public void SetXValuesToIndex()
  {
    SetXValuesToIndex_21();
  }

  private native void SetXValuesToArcLength_22();
  public void SetXValuesToArcLength()
  {
    SetXValuesToArcLength_22();
  }

  private native void SetXValuesToNormalizedArcLength_23();
  public void SetXValuesToNormalizedArcLength()
  {
    SetXValuesToNormalizedArcLength_23();
  }

  private native void SetXValuesToValue_24();
  public void SetXValuesToValue()
  {
    SetXValuesToValue_24();
  }

  private native byte[] GetXValuesAsString_25();
  public String GetXValuesAsString()
  {
    return new String(GetXValuesAsString_25(), StandardCharsets.UTF_8);
  }

  private native void AddDataObjectInput_26(vtkDataObject id0);
  public void AddDataObjectInput(vtkDataObject id0)
  {
    AddDataObjectInput_26(id0);
  }

  private native void AddDataObjectInputConnection_27(vtkAlgorithmOutput id0);
  public void AddDataObjectInputConnection(vtkAlgorithmOutput id0)
  {
    AddDataObjectInputConnection_27(id0);
  }

  private native void RemoveDataObjectInputConnection_28(vtkAlgorithmOutput id0);
  public void RemoveDataObjectInputConnection(vtkAlgorithmOutput id0)
  {
    RemoveDataObjectInputConnection_28(id0);
  }

  private native void RemoveDataObjectInput_29(vtkDataObject id0);
  public void RemoveDataObjectInput(vtkDataObject id0)
  {
    RemoveDataObjectInput_29(id0);
  }

  private native void RemoveAllDataObjectInputConnections_30();
  public void RemoveAllDataObjectInputConnections()
  {
    RemoveAllDataObjectInputConnections_30();
  }

  private native long GetDataObjectInputConnection_31(int id0);
  public vtkAlgorithmOutput GetDataObjectInputConnection(int id0)
  {
    long temp = GetDataObjectInputConnection_31(id0);

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfDataObjectInputConnections_32();
  public int GetNumberOfDataObjectInputConnections()
  {
    return GetNumberOfDataObjectInputConnections_32();
  }

  private native void SetDataObjectPlotMode_33(int id0);
  public void SetDataObjectPlotMode(int id0)
  {
    SetDataObjectPlotMode_33(id0);
  }

  private native int GetDataObjectPlotModeMinValue_34();
  public int GetDataObjectPlotModeMinValue()
  {
    return GetDataObjectPlotModeMinValue_34();
  }

  private native int GetDataObjectPlotModeMaxValue_35();
  public int GetDataObjectPlotModeMaxValue()
  {
    return GetDataObjectPlotModeMaxValue_35();
  }

  private native int GetDataObjectPlotMode_36();
  public int GetDataObjectPlotMode()
  {
    return GetDataObjectPlotMode_36();
  }

  private native void SetDataObjectPlotModeToRows_37();
  public void SetDataObjectPlotModeToRows()
  {
    SetDataObjectPlotModeToRows_37();
  }

  private native void SetDataObjectPlotModeToColumns_38();
  public void SetDataObjectPlotModeToColumns()
  {
    SetDataObjectPlotModeToColumns_38();
  }

  private native byte[] GetDataObjectPlotModeAsString_39();
  public String GetDataObjectPlotModeAsString()
  {
    return new String(GetDataObjectPlotModeAsString_39(), StandardCharsets.UTF_8);
  }

  private native void SetDataObjectXComponent_40(int id0,int id1);
  public void SetDataObjectXComponent(int id0,int id1)
  {
    SetDataObjectXComponent_40(id0,id1);
  }

  private native int GetDataObjectXComponent_41(int id0);
  public int GetDataObjectXComponent(int id0)
  {
    return GetDataObjectXComponent_41(id0);
  }

  private native void SetDataObjectYComponent_42(int id0,int id1);
  public void SetDataObjectYComponent(int id0,int id1)
  {
    SetDataObjectYComponent_42(id0,id1);
  }

  private native int GetDataObjectYComponent_43(int id0);
  public int GetDataObjectYComponent(int id0)
  {
    return GetDataObjectYComponent_43(id0);
  }

  private native void SetPlotColor_44(int id0,double id1,double id2,double id3);
  public void SetPlotColor(int id0,double id1,double id2,double id3)
  {
    SetPlotColor_44(id0,id1,id2,id3);
  }

  private native void SetPlotColor_45(int id0,double id1[]);
  public void SetPlotColor(int id0,double id1[])
  {
    SetPlotColor_45(id0,id1);
  }

  private native double[] GetPlotColor_46(int id0);
  public double[] GetPlotColor(int id0)
  {
    return GetPlotColor_46(id0);
  }

  private native void SetPlotSymbol_47(int id0,vtkPolyData id1);
  public void SetPlotSymbol(int id0,vtkPolyData id1)
  {
    SetPlotSymbol_47(id0,id1);
  }

  private native long GetPlotSymbol_48(int id0);
  public vtkPolyData GetPlotSymbol(int id0)
  {
    long temp = GetPlotSymbol_48(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPlotLabel_49(int id0,byte[] id1, int len1);
  public void SetPlotLabel(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetPlotLabel_49(id0,bytes1, bytes1.length);
  }

  private native byte[] GetPlotLabel_50(int id0);
  public String GetPlotLabel(int id0)
  {
    return new String(GetPlotLabel_50(id0), StandardCharsets.UTF_8);
  }

  private native int GetPlotCurvePoints_51();
  public int GetPlotCurvePoints()
  {
    return GetPlotCurvePoints_51();
  }

  private native void SetPlotCurvePoints_52(int id0);
  public void SetPlotCurvePoints(int id0)
  {
    SetPlotCurvePoints_52(id0);
  }

  private native void PlotCurvePointsOn_53();
  public void PlotCurvePointsOn()
  {
    PlotCurvePointsOn_53();
  }

  private native void PlotCurvePointsOff_54();
  public void PlotCurvePointsOff()
  {
    PlotCurvePointsOff_54();
  }

  private native int GetPlotCurveLines_55();
  public int GetPlotCurveLines()
  {
    return GetPlotCurveLines_55();
  }

  private native void SetPlotCurveLines_56(int id0);
  public void SetPlotCurveLines(int id0)
  {
    SetPlotCurveLines_56(id0);
  }

  private native void PlotCurveLinesOn_57();
  public void PlotCurveLinesOn()
  {
    PlotCurveLinesOn_57();
  }

  private native void PlotCurveLinesOff_58();
  public void PlotCurveLinesOff()
  {
    PlotCurveLinesOff_58();
  }

  private native void SetPlotLines_59(int id0,int id1);
  public void SetPlotLines(int id0,int id1)
  {
    SetPlotLines_59(id0,id1);
  }

  private native int GetPlotLines_60(int id0);
  public int GetPlotLines(int id0)
  {
    return GetPlotLines_60(id0);
  }

  private native void SetPlotPoints_61(int id0,int id1);
  public void SetPlotPoints(int id0,int id1)
  {
    SetPlotPoints_61(id0,id1);
  }

  private native int GetPlotPoints_62(int id0);
  public int GetPlotPoints(int id0)
  {
    return GetPlotPoints_62(id0);
  }

  private native void SetExchangeAxes_63(int id0);
  public void SetExchangeAxes(int id0)
  {
    SetExchangeAxes_63(id0);
  }

  private native int GetExchangeAxes_64();
  public int GetExchangeAxes()
  {
    return GetExchangeAxes_64();
  }

  private native void ExchangeAxesOn_65();
  public void ExchangeAxesOn()
  {
    ExchangeAxesOn_65();
  }

  private native void ExchangeAxesOff_66();
  public void ExchangeAxesOff()
  {
    ExchangeAxesOff_66();
  }

  private native void SetReverseXAxis_67(int id0);
  public void SetReverseXAxis(int id0)
  {
    SetReverseXAxis_67(id0);
  }

  private native int GetReverseXAxis_68();
  public int GetReverseXAxis()
  {
    return GetReverseXAxis_68();
  }

  private native void ReverseXAxisOn_69();
  public void ReverseXAxisOn()
  {
    ReverseXAxisOn_69();
  }

  private native void ReverseXAxisOff_70();
  public void ReverseXAxisOff()
  {
    ReverseXAxisOff_70();
  }

  private native void SetReverseYAxis_71(int id0);
  public void SetReverseYAxis(int id0)
  {
    SetReverseYAxis_71(id0);
  }

  private native int GetReverseYAxis_72();
  public int GetReverseYAxis()
  {
    return GetReverseYAxis_72();
  }

  private native void ReverseYAxisOn_73();
  public void ReverseYAxisOn()
  {
    ReverseYAxisOn_73();
  }

  private native void ReverseYAxisOff_74();
  public void ReverseYAxisOff()
  {
    ReverseYAxisOff_74();
  }

  private native long GetLegendActor_75();
  public vtkLegendBoxActor GetLegendActor()
  {
    long temp = GetLegendActor_75();

    if (temp == 0) return null;
    return (vtkLegendBoxActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGlyphSource_76();
  public vtkGlyphSource2D GetGlyphSource()
  {
    long temp = GetGlyphSource_76();

    if (temp == 0) return null;
    return (vtkGlyphSource2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTitle_77(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_77(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_78();
  public String GetTitle()
  {
    return new String(GetTitle_78(), StandardCharsets.UTF_8);
  }

  private native void SetXTitle_79(byte[] id0, int len0);
  public void SetXTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXTitle_79(bytes0, bytes0.length);
  }

  private native byte[] GetXTitle_80();
  public String GetXTitle()
  {
    return new String(GetXTitle_80(), StandardCharsets.UTF_8);
  }

  private native void SetYTitle_81(byte[] id0, int len0);
  public void SetYTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYTitle_81(bytes0, bytes0.length);
  }

  private native byte[] GetYTitle_82();
  public String GetYTitle()
  {
    return new String(GetYTitle_82(), StandardCharsets.UTF_8);
  }

  private native long GetXAxisActor2D_83();
  public vtkAxisActor2D GetXAxisActor2D()
  {
    long temp = GetXAxisActor2D_83();

    if (temp == 0) return null;
    return (vtkAxisActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetYAxisActor2D_84();
  public vtkAxisActor2D GetYAxisActor2D()
  {
    long temp = GetYAxisActor2D_84();

    if (temp == 0) return null;
    return (vtkAxisActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetXRange_85(double id0,double id1);
  public void SetXRange(double id0,double id1)
  {
    SetXRange_85(id0,id1);
  }

  private native void SetXRange_86(double id0[]);
  public void SetXRange(double id0[])
  {
    SetXRange_86(id0);
  }

  private native double[] GetXRange_87();
  public double[] GetXRange()
  {
    return GetXRange_87();
  }

  private native void SetYRange_88(double id0,double id1);
  public void SetYRange(double id0,double id1)
  {
    SetYRange_88(id0,id1);
  }

  private native void SetYRange_89(double id0[]);
  public void SetYRange(double id0[])
  {
    SetYRange_89(id0);
  }

  private native double[] GetYRange_90();
  public double[] GetYRange()
  {
    return GetYRange_90();
  }

  private native void SetPlotRange_91(double id0,double id1,double id2,double id3);
  public void SetPlotRange(double id0,double id1,double id2,double id3)
  {
    SetPlotRange_91(id0,id1,id2,id3);
  }

  private native void SetNumberOfXLabels_92(int id0);
  public void SetNumberOfXLabels(int id0)
  {
    SetNumberOfXLabels_92(id0);
  }

  private native int GetNumberOfXLabelsMinValue_93();
  public int GetNumberOfXLabelsMinValue()
  {
    return GetNumberOfXLabelsMinValue_93();
  }

  private native int GetNumberOfXLabelsMaxValue_94();
  public int GetNumberOfXLabelsMaxValue()
  {
    return GetNumberOfXLabelsMaxValue_94();
  }

  private native int GetNumberOfXLabels_95();
  public int GetNumberOfXLabels()
  {
    return GetNumberOfXLabels_95();
  }

  private native void SetNumberOfYLabels_96(int id0);
  public void SetNumberOfYLabels(int id0)
  {
    SetNumberOfYLabels_96(id0);
  }

  private native int GetNumberOfYLabelsMinValue_97();
  public int GetNumberOfYLabelsMinValue()
  {
    return GetNumberOfYLabelsMinValue_97();
  }

  private native int GetNumberOfYLabelsMaxValue_98();
  public int GetNumberOfYLabelsMaxValue()
  {
    return GetNumberOfYLabelsMaxValue_98();
  }

  private native int GetNumberOfYLabels_99();
  public int GetNumberOfYLabels()
  {
    return GetNumberOfYLabels_99();
  }

  private native void SetNumberOfLabels_100(int id0);
  public void SetNumberOfLabels(int id0)
  {
    SetNumberOfLabels_100(id0);
  }

  private native void SetAdjustXLabels_101(int id0);
  public void SetAdjustXLabels(int id0)
  {
    SetAdjustXLabels_101(id0);
  }

  private native int GetAdjustXLabels_102();
  public int GetAdjustXLabels()
  {
    return GetAdjustXLabels_102();
  }

  private native void SetAdjustYLabels_103(int id0);
  public void SetAdjustYLabels(int id0)
  {
    SetAdjustYLabels_103(id0);
  }

  private native int GetAdjustYLabels_104();
  public int GetAdjustYLabels()
  {
    return GetAdjustYLabels_104();
  }

  private native void SetNumberOfXMinorTicks_105(int id0);
  public void SetNumberOfXMinorTicks(int id0)
  {
    SetNumberOfXMinorTicks_105(id0);
  }

  private native int GetNumberOfXMinorTicks_106();
  public int GetNumberOfXMinorTicks()
  {
    return GetNumberOfXMinorTicks_106();
  }

  private native void SetNumberOfYMinorTicks_107(int id0);
  public void SetNumberOfYMinorTicks(int id0)
  {
    SetNumberOfYMinorTicks_107(id0);
  }

  private native int GetNumberOfYMinorTicks_108();
  public int GetNumberOfYMinorTicks()
  {
    return GetNumberOfYMinorTicks_108();
  }

  private native void SetLegend_109(int id0);
  public void SetLegend(int id0)
  {
    SetLegend_109(id0);
  }

  private native int GetLegend_110();
  public int GetLegend()
  {
    return GetLegend_110();
  }

  private native void LegendOn_111();
  public void LegendOn()
  {
    LegendOn_111();
  }

  private native void LegendOff_112();
  public void LegendOff()
  {
    LegendOff_112();
  }

  private native void SetTitlePosition_113(double id0,double id1);
  public void SetTitlePosition(double id0,double id1)
  {
    SetTitlePosition_113(id0,id1);
  }

  private native void SetTitlePosition_114(double id0[]);
  public void SetTitlePosition(double id0[])
  {
    SetTitlePosition_114(id0);
  }

  private native double[] GetTitlePosition_115();
  public double[] GetTitlePosition()
  {
    return GetTitlePosition_115();
  }

  private native void SetAdjustTitlePosition_116(int id0);
  public void SetAdjustTitlePosition(int id0)
  {
    SetAdjustTitlePosition_116(id0);
  }

  private native int GetAdjustTitlePosition_117();
  public int GetAdjustTitlePosition()
  {
    return GetAdjustTitlePosition_117();
  }

  private native void AdjustTitlePositionOn_118();
  public void AdjustTitlePositionOn()
  {
    AdjustTitlePositionOn_118();
  }

  private native void AdjustTitlePositionOff_119();
  public void AdjustTitlePositionOff()
  {
    AdjustTitlePositionOff_119();
  }

  private native void SetAdjustTitlePositionMode_120(int id0);
  public void SetAdjustTitlePositionMode(int id0)
  {
    SetAdjustTitlePositionMode_120(id0);
  }

  private native int GetAdjustTitlePositionMode_121();
  public int GetAdjustTitlePositionMode()
  {
    return GetAdjustTitlePositionMode_121();
  }

  private native void SetLegendPosition_122(double id0,double id1);
  public void SetLegendPosition(double id0,double id1)
  {
    SetLegendPosition_122(id0,id1);
  }

  private native void SetLegendPosition_123(double id0[]);
  public void SetLegendPosition(double id0[])
  {
    SetLegendPosition_123(id0);
  }

  private native double[] GetLegendPosition_124();
  public double[] GetLegendPosition()
  {
    return GetLegendPosition_124();
  }

  private native void SetLegendPosition2_125(double id0,double id1);
  public void SetLegendPosition2(double id0,double id1)
  {
    SetLegendPosition2_125(id0,id1);
  }

  private native void SetLegendPosition2_126(double id0[]);
  public void SetLegendPosition2(double id0[])
  {
    SetLegendPosition2_126(id0);
  }

  private native double[] GetLegendPosition2_127();
  public double[] GetLegendPosition2()
  {
    return GetLegendPosition2_127();
  }

  private native void SetTitleTextProperty_128(vtkTextProperty id0);
  public void SetTitleTextProperty(vtkTextProperty id0)
  {
    SetTitleTextProperty_128(id0);
  }

  private native long GetTitleTextProperty_129();
  public vtkTextProperty GetTitleTextProperty()
  {
    long temp = GetTitleTextProperty_129();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxisTitleTextProperty_130(vtkTextProperty id0);
  public void SetAxisTitleTextProperty(vtkTextProperty id0)
  {
    SetAxisTitleTextProperty_130(id0);
  }

  private native long GetAxisTitleTextProperty_131();
  public vtkTextProperty GetAxisTitleTextProperty()
  {
    long temp = GetAxisTitleTextProperty_131();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxisLabelTextProperty_132(vtkTextProperty id0);
  public void SetAxisLabelTextProperty(vtkTextProperty id0)
  {
    SetAxisLabelTextProperty_132(id0);
  }

  private native long GetAxisLabelTextProperty_133();
  public vtkTextProperty GetAxisLabelTextProperty()
  {
    long temp = GetAxisLabelTextProperty_133();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLogx_134(int id0);
  public void SetLogx(int id0)
  {
    SetLogx_134(id0);
  }

  private native int GetLogx_135();
  public int GetLogx()
  {
    return GetLogx_135();
  }

  private native void LogxOn_136();
  public void LogxOn()
  {
    LogxOn_136();
  }

  private native void LogxOff_137();
  public void LogxOff()
  {
    LogxOff_137();
  }

  private native void SetLabelFormat_138(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_138(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_139();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_139(), StandardCharsets.UTF_8);
  }

  private native void SetXLabelFormat_140(byte[] id0, int len0);
  public void SetXLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXLabelFormat_140(bytes0, bytes0.length);
  }

  private native byte[] GetXLabelFormat_141();
  public String GetXLabelFormat()
  {
    return new String(GetXLabelFormat_141(), StandardCharsets.UTF_8);
  }

  private native void SetYLabelFormat_142(byte[] id0, int len0);
  public void SetYLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYLabelFormat_142(bytes0, bytes0.length);
  }

  private native byte[] GetYLabelFormat_143();
  public String GetYLabelFormat()
  {
    return new String(GetYLabelFormat_143(), StandardCharsets.UTF_8);
  }

  private native void SetBorder_144(int id0);
  public void SetBorder(int id0)
  {
    SetBorder_144(id0);
  }

  private native int GetBorderMinValue_145();
  public int GetBorderMinValue()
  {
    return GetBorderMinValue_145();
  }

  private native int GetBorderMaxValue_146();
  public int GetBorderMaxValue()
  {
    return GetBorderMaxValue_146();
  }

  private native int GetBorder_147();
  public int GetBorder()
  {
    return GetBorder_147();
  }

  private native int GetPlotPoints_148();
  public int GetPlotPoints()
  {
    return GetPlotPoints_148();
  }

  private native void SetPlotPoints_149(int id0);
  public void SetPlotPoints(int id0)
  {
    SetPlotPoints_149(id0);
  }

  private native void PlotPointsOn_150();
  public void PlotPointsOn()
  {
    PlotPointsOn_150();
  }

  private native void PlotPointsOff_151();
  public void PlotPointsOff()
  {
    PlotPointsOff_151();
  }

  private native int GetPlotLines_152();
  public int GetPlotLines()
  {
    return GetPlotLines_152();
  }

  private native void SetPlotLines_153(int id0);
  public void SetPlotLines(int id0)
  {
    SetPlotLines_153(id0);
  }

  private native void PlotLinesOn_154();
  public void PlotLinesOn()
  {
    PlotLinesOn_154();
  }

  private native void PlotLinesOff_155();
  public void PlotLinesOff()
  {
    PlotLinesOff_155();
  }

  private native void SetGlyphSize_156(double id0);
  public void SetGlyphSize(double id0)
  {
    SetGlyphSize_156(id0);
  }

  private native double GetGlyphSizeMinValue_157();
  public double GetGlyphSizeMinValue()
  {
    return GetGlyphSizeMinValue_157();
  }

  private native double GetGlyphSizeMaxValue_158();
  public double GetGlyphSizeMaxValue()
  {
    return GetGlyphSizeMaxValue_158();
  }

  private native double GetGlyphSize_159();
  public double GetGlyphSize()
  {
    return GetGlyphSize_159();
  }

  private native void ViewportToPlotCoordinate_160(vtkViewport id0);
  public void ViewportToPlotCoordinate(vtkViewport id0)
  {
    ViewportToPlotCoordinate_160(id0);
  }

  private native void SetPlotCoordinate_161(double id0,double id1);
  public void SetPlotCoordinate(double id0,double id1)
  {
    SetPlotCoordinate_161(id0,id1);
  }

  private native void SetPlotCoordinate_162(double id0[]);
  public void SetPlotCoordinate(double id0[])
  {
    SetPlotCoordinate_162(id0);
  }

  private native double[] GetPlotCoordinate_163();
  public double[] GetPlotCoordinate()
  {
    return GetPlotCoordinate_163();
  }

  private native void PlotToViewportCoordinate_164(vtkViewport id0);
  public void PlotToViewportCoordinate(vtkViewport id0)
  {
    PlotToViewportCoordinate_164(id0);
  }

  private native void SetViewportCoordinate_165(double id0,double id1);
  public void SetViewportCoordinate(double id0,double id1)
  {
    SetViewportCoordinate_165(id0,id1);
  }

  private native void SetViewportCoordinate_166(double id0[]);
  public void SetViewportCoordinate(double id0[])
  {
    SetViewportCoordinate_166(id0);
  }

  private native double[] GetViewportCoordinate_167();
  public double[] GetViewportCoordinate()
  {
    return GetViewportCoordinate_167();
  }

  private native int IsInPlot_168(vtkViewport id0,double id1,double id2);
  public int IsInPlot(vtkViewport id0,double id1,double id2)
  {
    return IsInPlot_168(id0,id1,id2);
  }

  private native void SetChartBox_169(int id0);
  public void SetChartBox(int id0)
  {
    SetChartBox_169(id0);
  }

  private native int GetChartBox_170();
  public int GetChartBox()
  {
    return GetChartBox_170();
  }

  private native void ChartBoxOn_171();
  public void ChartBoxOn()
  {
    ChartBoxOn_171();
  }

  private native void ChartBoxOff_172();
  public void ChartBoxOff()
  {
    ChartBoxOff_172();
  }

  private native void SetChartBorder_173(int id0);
  public void SetChartBorder(int id0)
  {
    SetChartBorder_173(id0);
  }

  private native int GetChartBorder_174();
  public int GetChartBorder()
  {
    return GetChartBorder_174();
  }

  private native void ChartBorderOn_175();
  public void ChartBorderOn()
  {
    ChartBorderOn_175();
  }

  private native void ChartBorderOff_176();
  public void ChartBorderOff()
  {
    ChartBorderOff_176();
  }

  private native long GetChartBoxProperty_177();
  public vtkProperty2D GetChartBoxProperty()
  {
    long temp = GetChartBoxProperty_177();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetShowReferenceXLine_178(int id0);
  public void SetShowReferenceXLine(int id0)
  {
    SetShowReferenceXLine_178(id0);
  }

  private native int GetShowReferenceXLine_179();
  public int GetShowReferenceXLine()
  {
    return GetShowReferenceXLine_179();
  }

  private native void ShowReferenceXLineOn_180();
  public void ShowReferenceXLineOn()
  {
    ShowReferenceXLineOn_180();
  }

  private native void ShowReferenceXLineOff_181();
  public void ShowReferenceXLineOff()
  {
    ShowReferenceXLineOff_181();
  }

  private native void SetReferenceXValue_182(double id0);
  public void SetReferenceXValue(double id0)
  {
    SetReferenceXValue_182(id0);
  }

  private native double GetReferenceXValue_183();
  public double GetReferenceXValue()
  {
    return GetReferenceXValue_183();
  }

  private native void SetShowReferenceYLine_184(int id0);
  public void SetShowReferenceYLine(int id0)
  {
    SetShowReferenceYLine_184(id0);
  }

  private native int GetShowReferenceYLine_185();
  public int GetShowReferenceYLine()
  {
    return GetShowReferenceYLine_185();
  }

  private native void ShowReferenceYLineOn_186();
  public void ShowReferenceYLineOn()
  {
    ShowReferenceYLineOn_186();
  }

  private native void ShowReferenceYLineOff_187();
  public void ShowReferenceYLineOff()
  {
    ShowReferenceYLineOff_187();
  }

  private native void SetReferenceYValue_188(double id0);
  public void SetReferenceYValue(double id0)
  {
    SetReferenceYValue_188(id0);
  }

  private native double GetReferenceYValue_189();
  public double GetReferenceYValue()
  {
    return GetReferenceYValue_189();
  }

  private native long GetMTime_190();
  public long GetMTime()
  {
    return GetMTime_190();
  }

  private native int RenderOpaqueGeometry_191(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_191(id0);
  }

  private native int RenderOverlay_192(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_192(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_193(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_193(id0);
  }

  private native int HasTranslucentPolygonalGeometry_194();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_194();
  }

  private native void ReleaseGraphicsResources_195(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_195(id0);
  }

  private native void SetXTitlePosition_196(double id0);
  public void SetXTitlePosition(double id0)
  {
    SetXTitlePosition_196(id0);
  }

  private native double GetXTitlePosition_197();
  public double GetXTitlePosition()
  {
    return GetXTitlePosition_197();
  }

  private native void SetYTitlePosition_198(int id0);
  public void SetYTitlePosition(int id0)
  {
    SetYTitlePosition_198(id0);
  }

  private native int GetYTitlePosition_199();
  public int GetYTitlePosition()
  {
    return GetYTitlePosition_199();
  }

  private native void SetYTitlePositionToTop_200();
  public void SetYTitlePositionToTop()
  {
    SetYTitlePositionToTop_200();
  }

  private native void SetYTitlePositionToHCenter_201();
  public void SetYTitlePositionToHCenter()
  {
    SetYTitlePositionToHCenter_201();
  }

  private native void SetYTitlePositionToVCenter_202();
  public void SetYTitlePositionToVCenter()
  {
    SetYTitlePositionToVCenter_202();
  }

  private native void SetPlotGlyphType_203(int id0,int id1);
  public void SetPlotGlyphType(int id0,int id1)
  {
    SetPlotGlyphType_203(id0,id1);
  }

  private native void SetLineWidth_204(double id0);
  public void SetLineWidth(double id0)
  {
    SetLineWidth_204(id0);
  }

  private native void AddUserCurvesPoint_205(double id0,double id1,double id2);
  public void AddUserCurvesPoint(double id0,double id1,double id2)
  {
    AddUserCurvesPoint_205(id0,id1,id2);
  }

  private native void RemoveAllActiveCurves_206();
  public void RemoveAllActiveCurves()
  {
    RemoveAllActiveCurves_206();
  }

  private native void SetLegendBorder_207(int id0);
  public void SetLegendBorder(int id0)
  {
    SetLegendBorder_207(id0);
  }

  private native void SetLegendBox_208(int id0);
  public void SetLegendBox(int id0)
  {
    SetLegendBox_208(id0);
  }

  private native void SetLegendUseBackground_209(int id0);
  public void SetLegendUseBackground(int id0)
  {
    SetLegendUseBackground_209(id0);
  }

  private native void SetLegendBackgroundColor_210(double id0,double id1,double id2);
  public void SetLegendBackgroundColor(double id0,double id1,double id2)
  {
    SetLegendBackgroundColor_210(id0,id1,id2);
  }

  private native void SetTitleColor_211(double id0,double id1,double id2);
  public void SetTitleColor(double id0,double id1,double id2)
  {
    SetTitleColor_211(id0,id1,id2);
  }

  private native void SetTitleFontFamily_212(int id0);
  public void SetTitleFontFamily(int id0)
  {
    SetTitleFontFamily_212(id0);
  }

  private native void SetTitleBold_213(int id0);
  public void SetTitleBold(int id0)
  {
    SetTitleBold_213(id0);
  }

  private native void SetTitleItalic_214(int id0);
  public void SetTitleItalic(int id0)
  {
    SetTitleItalic_214(id0);
  }

  private native void SetTitleShadow_215(int id0);
  public void SetTitleShadow(int id0)
  {
    SetTitleShadow_215(id0);
  }

  private native void SetTitleFontSize_216(int id0);
  public void SetTitleFontSize(int id0)
  {
    SetTitleFontSize_216(id0);
  }

  private native void SetTitleJustification_217(int id0);
  public void SetTitleJustification(int id0)
  {
    SetTitleJustification_217(id0);
  }

  private native void SetTitleVerticalJustification_218(int id0);
  public void SetTitleVerticalJustification(int id0)
  {
    SetTitleVerticalJustification_218(id0);
  }

  private native void SetXAxisColor_219(double id0,double id1,double id2);
  public void SetXAxisColor(double id0,double id1,double id2)
  {
    SetXAxisColor_219(id0,id1,id2);
  }

  private native void SetYAxisColor_220(double id0,double id1,double id2);
  public void SetYAxisColor(double id0,double id1,double id2)
  {
    SetYAxisColor_220(id0,id1,id2);
  }

  private native void SetAxisTitleColor_221(double id0,double id1,double id2);
  public void SetAxisTitleColor(double id0,double id1,double id2)
  {
    SetAxisTitleColor_221(id0,id1,id2);
  }

  private native void SetAxisTitleFontFamily_222(int id0);
  public void SetAxisTitleFontFamily(int id0)
  {
    SetAxisTitleFontFamily_222(id0);
  }

  private native void SetAxisTitleBold_223(int id0);
  public void SetAxisTitleBold(int id0)
  {
    SetAxisTitleBold_223(id0);
  }

  private native void SetAxisTitleItalic_224(int id0);
  public void SetAxisTitleItalic(int id0)
  {
    SetAxisTitleItalic_224(id0);
  }

  private native void SetAxisTitleShadow_225(int id0);
  public void SetAxisTitleShadow(int id0)
  {
    SetAxisTitleShadow_225(id0);
  }

  private native void SetAxisTitleFontSize_226(int id0);
  public void SetAxisTitleFontSize(int id0)
  {
    SetAxisTitleFontSize_226(id0);
  }

  private native void SetAxisTitleJustification_227(int id0);
  public void SetAxisTitleJustification(int id0)
  {
    SetAxisTitleJustification_227(id0);
  }

  private native void SetAxisTitleVerticalJustification_228(int id0);
  public void SetAxisTitleVerticalJustification(int id0)
  {
    SetAxisTitleVerticalJustification_228(id0);
  }

  private native void SetAxisLabelColor_229(double id0,double id1,double id2);
  public void SetAxisLabelColor(double id0,double id1,double id2)
  {
    SetAxisLabelColor_229(id0,id1,id2);
  }

  private native void SetAxisLabelFontFamily_230(int id0);
  public void SetAxisLabelFontFamily(int id0)
  {
    SetAxisLabelFontFamily_230(id0);
  }

  private native void SetAxisLabelBold_231(int id0);
  public void SetAxisLabelBold(int id0)
  {
    SetAxisLabelBold_231(id0);
  }

  private native void SetAxisLabelItalic_232(int id0);
  public void SetAxisLabelItalic(int id0)
  {
    SetAxisLabelItalic_232(id0);
  }

  private native void SetAxisLabelShadow_233(int id0);
  public void SetAxisLabelShadow(int id0)
  {
    SetAxisLabelShadow_233(id0);
  }

  private native void SetAxisLabelFontSize_234(int id0);
  public void SetAxisLabelFontSize(int id0)
  {
    SetAxisLabelFontSize_234(id0);
  }

  private native void SetAxisLabelJustification_235(int id0);
  public void SetAxisLabelJustification(int id0)
  {
    SetAxisLabelJustification_235(id0);
  }

  private native void SetAxisLabelVerticalJustification_236(int id0);
  public void SetAxisLabelVerticalJustification(int id0)
  {
    SetAxisLabelVerticalJustification_236(id0);
  }

  public vtkXYPlotActor() { super(); }

  public vtkXYPlotActor(long id) { super(id); }
  public native long   VTKInit();

}
