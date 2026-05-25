// java wrapper for vtkChartXY object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkChartXY extends vtkChart
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

  private native void Update_4();
  public void Update()
  {
    Update_4();
  }

  private native boolean Paint_5(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_5(id0);
  }

  private native long AddPlot_6(int id0);
  public vtkPlot AddPlot(int id0)
  {
    long temp = AddPlot_6(id0);

    if (temp == 0) return null;
    return (vtkPlot)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long AddPlot_7(int id0,int id1);
  public vtkPlot AddPlot(int id0,int id1)
  {
    long temp = AddPlot_7(id0,id1);

    if (temp == 0) return null;
    return (vtkPlot)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long AddPlot_8(vtkPlot id0);
  public long AddPlot(vtkPlot id0)
  {
    return AddPlot_8(id0);
  }

  private native long AddPlot_9(vtkPlot id0,int id1);
  public long AddPlot(vtkPlot id0,int id1)
  {
    return AddPlot_9(id0,id1);
  }

  private native boolean RemovePlot_10(long id0);
  public boolean RemovePlot(long id0)
  {
    return RemovePlot_10(id0);
  }

  private native void ClearPlots_11();
  public void ClearPlots()
  {
    ClearPlots_11();
  }

  private native long GetPlot_12(long id0);
  public vtkPlot GetPlot(long id0)
  {
    long temp = GetPlot_12(id0);

    if (temp == 0) return null;
    return (vtkPlot)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPlotIndex_13(vtkPlot id0);
  public long GetPlotIndex(vtkPlot id0)
  {
    return GetPlotIndex_13(id0);
  }

  private native long RaisePlot_14(vtkPlot id0);
  public long RaisePlot(vtkPlot id0)
  {
    return RaisePlot_14(id0);
  }

  private native long StackPlotAbove_15(vtkPlot id0,vtkPlot id1);
  public long StackPlotAbove(vtkPlot id0,vtkPlot id1)
  {
    return StackPlotAbove_15(id0,id1);
  }

  private native long LowerPlot_16(vtkPlot id0);
  public long LowerPlot(vtkPlot id0)
  {
    return LowerPlot_16(id0);
  }

  private native long StackPlotUnder_17(vtkPlot id0,vtkPlot id1);
  public long StackPlotUnder(vtkPlot id0,vtkPlot id1)
  {
    return StackPlotUnder_17(id0,id1);
  }

  private native long GetNumberOfPlots_18();
  public long GetNumberOfPlots()
  {
    return GetNumberOfPlots_18();
  }

  private native int GetPlotCorner_19(vtkPlot id0);
  public int GetPlotCorner(vtkPlot id0)
  {
    return GetPlotCorner_19(id0);
  }

  private native void SetPlotCorner_20(vtkPlot id0,int id1);
  public void SetPlotCorner(vtkPlot id0,int id1)
  {
    SetPlotCorner_20(id0,id1);
  }

  private native long GetAxis_21(int id0);
  public vtkAxis GetAxis(int id0)
  {
    long temp = GetAxis_21(id0);

    if (temp == 0) return null;
    return (vtkAxis)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxis_22(int id0,vtkAxis id1);
  public void SetAxis(int id0,vtkAxis id1)
  {
    SetAxis_22(id0,id1);
  }

  private native void SetShowLegend_23(boolean id0);
  public void SetShowLegend(boolean id0)
  {
    SetShowLegend_23(id0);
  }

  private native long GetLegend_24();
  public vtkChartLegend GetLegend()
  {
    long temp = GetLegend_24();

    if (temp == 0) return null;
    return (vtkChartLegend)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTooltip_25(vtkTooltipItem id0);
  public void SetTooltip(vtkTooltipItem id0)
  {
    SetTooltip_25(id0);
  }

  private native long GetTooltip_26();
  public vtkTooltipItem GetTooltip()
  {
    long temp = GetTooltip_26();

    if (temp == 0) return null;
    return (vtkTooltipItem)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfAxes_27();
  public long GetNumberOfAxes()
  {
    return GetNumberOfAxes_27();
  }

  private native void RecalculateBounds_28();
  public void RecalculateBounds()
  {
    RecalculateBounds_28();
  }

  private native void SetSelectionMethod_29(int id0);
  public void SetSelectionMethod(int id0)
  {
    SetSelectionMethod_29(id0);
  }

  private native void RemovePlotSelections_30();
  public void RemovePlotSelections()
  {
    RemovePlotSelections_30();
  }

  private native void SetDrawAxesAtOrigin_31(boolean id0);
  public void SetDrawAxesAtOrigin(boolean id0)
  {
    SetDrawAxesAtOrigin_31(id0);
  }

  private native boolean GetDrawAxesAtOrigin_32();
  public boolean GetDrawAxesAtOrigin()
  {
    return GetDrawAxesAtOrigin_32();
  }

  private native void DrawAxesAtOriginOn_33();
  public void DrawAxesAtOriginOn()
  {
    DrawAxesAtOriginOn_33();
  }

  private native void DrawAxesAtOriginOff_34();
  public void DrawAxesAtOriginOff()
  {
    DrawAxesAtOriginOff_34();
  }

  private native void SetAutoAxes_35(boolean id0);
  public void SetAutoAxes(boolean id0)
  {
    SetAutoAxes_35(id0);
  }

  private native boolean GetAutoAxes_36();
  public boolean GetAutoAxes()
  {
    return GetAutoAxes_36();
  }

  private native void AutoAxesOn_37();
  public void AutoAxesOn()
  {
    AutoAxesOn_37();
  }

  private native void AutoAxesOff_38();
  public void AutoAxesOff()
  {
    AutoAxesOff_38();
  }

  private native void SetHiddenAxisBorder_39(int id0);
  public void SetHiddenAxisBorder(int id0)
  {
    SetHiddenAxisBorder_39(id0);
  }

  private native int GetHiddenAxisBorder_40();
  public int GetHiddenAxisBorder()
  {
    return GetHiddenAxisBorder_40();
  }

  private native void SetForceAxesToBounds_41(boolean id0);
  public void SetForceAxesToBounds(boolean id0)
  {
    SetForceAxesToBounds_41(id0);
  }

  private native boolean GetForceAxesToBounds_42();
  public boolean GetForceAxesToBounds()
  {
    return GetForceAxesToBounds_42();
  }

  private native void ForceAxesToBoundsOn_43();
  public void ForceAxesToBoundsOn()
  {
    ForceAxesToBoundsOn_43();
  }

  private native void ForceAxesToBoundsOff_44();
  public void ForceAxesToBoundsOff()
  {
    ForceAxesToBoundsOff_44();
  }

  private native void SetIgnoreNanInBounds_45(boolean id0);
  public void SetIgnoreNanInBounds(boolean id0)
  {
    SetIgnoreNanInBounds_45(id0);
  }

  private native boolean GetIgnoreNanInBounds_46();
  public boolean GetIgnoreNanInBounds()
  {
    return GetIgnoreNanInBounds_46();
  }

  private native void IgnoreNanInBoundsOn_47();
  public void IgnoreNanInBoundsOn()
  {
    IgnoreNanInBoundsOn_47();
  }

  private native void IgnoreNanInBoundsOff_48();
  public void IgnoreNanInBoundsOff()
  {
    IgnoreNanInBoundsOff_48();
  }

  private native void SetBarWidthFraction_49(float id0);
  public void SetBarWidthFraction(float id0)
  {
    SetBarWidthFraction_49(id0);
  }

  private native float GetBarWidthFraction_50();
  public float GetBarWidthFraction()
  {
    return GetBarWidthFraction_50();
  }

  private native void SetZoomWithMouseWheel_51(boolean id0);
  public void SetZoomWithMouseWheel(boolean id0)
  {
    SetZoomWithMouseWheel_51(id0);
  }

  private native boolean GetZoomWithMouseWheel_52();
  public boolean GetZoomWithMouseWheel()
  {
    return GetZoomWithMouseWheel_52();
  }

  private native void ZoomWithMouseWheelOn_53();
  public void ZoomWithMouseWheelOn()
  {
    ZoomWithMouseWheelOn_53();
  }

  private native void ZoomWithMouseWheelOff_54();
  public void ZoomWithMouseWheelOff()
  {
    ZoomWithMouseWheelOff_54();
  }

  private native void SetAxisZoom_55(int id0,boolean id1);
  public void SetAxisZoom(int id0,boolean id1)
  {
    SetAxisZoom_55(id0,id1);
  }

  private native boolean GetAxisZoom_56(int id0);
  public boolean GetAxisZoom(int id0)
  {
    return GetAxisZoom_56(id0);
  }

  private native void SetAdjustLowerBoundForLogPlot_57(boolean id0);
  public void SetAdjustLowerBoundForLogPlot(boolean id0)
  {
    SetAdjustLowerBoundForLogPlot_57(id0);
  }

  private native boolean GetAdjustLowerBoundForLogPlot_58();
  public boolean GetAdjustLowerBoundForLogPlot()
  {
    return GetAdjustLowerBoundForLogPlot_58();
  }

  private native void AdjustLowerBoundForLogPlotOn_59();
  public void AdjustLowerBoundForLogPlotOn()
  {
    AdjustLowerBoundForLogPlotOn_59();
  }

  private native void AdjustLowerBoundForLogPlotOff_60();
  public void AdjustLowerBoundForLogPlotOff()
  {
    AdjustLowerBoundForLogPlotOff_60();
  }

  private native void SetDragPointAlongX_61(boolean id0);
  public void SetDragPointAlongX(boolean id0)
  {
    SetDragPointAlongX_61(id0);
  }

  private native boolean GetDragPointAlongX_62();
  public boolean GetDragPointAlongX()
  {
    return GetDragPointAlongX_62();
  }

  private native void DragPointAlongXOn_63();
  public void DragPointAlongXOn()
  {
    DragPointAlongXOn_63();
  }

  private native void DragPointAlongXOff_64();
  public void DragPointAlongXOff()
  {
    DragPointAlongXOff_64();
  }

  private native void SetDragPointAlongY_65(boolean id0);
  public void SetDragPointAlongY(boolean id0)
  {
    SetDragPointAlongY_65(id0);
  }

  private native boolean GetDragPointAlongY_66();
  public boolean GetDragPointAlongY()
  {
    return GetDragPointAlongY_66();
  }

  private native void DragPointAlongYOn_67();
  public void DragPointAlongYOn()
  {
    DragPointAlongYOn_67();
  }

  private native void DragPointAlongYOff_68();
  public void DragPointAlongYOff()
  {
    DragPointAlongYOff_68();
  }

  private native void MakeSelection_69(vtkAnnotationLink id0,vtkIdTypeArray id1,vtkPlot id2);
  public void MakeSelection(vtkAnnotationLink id0,vtkIdTypeArray id1,vtkPlot id2)
  {
    MakeSelection_69(id0,id1,id2);
  }

  private native void MinusSelection_70(vtkIdTypeArray id0,vtkIdTypeArray id1);
  public void MinusSelection(vtkIdTypeArray id0,vtkIdTypeArray id1)
  {
    MinusSelection_70(id0,id1);
  }

  private native void AddSelection_71(vtkIdTypeArray id0,vtkIdTypeArray id1);
  public void AddSelection(vtkIdTypeArray id0,vtkIdTypeArray id1)
  {
    AddSelection_71(id0,id1);
  }

  private native void ToggleSelection_72(vtkIdTypeArray id0,vtkIdTypeArray id1);
  public void ToggleSelection(vtkIdTypeArray id0,vtkIdTypeArray id1)
  {
    ToggleSelection_72(id0,id1);
  }

  private native void BuildSelection_73(vtkAnnotationLink id0,int id1,vtkIdTypeArray id2,vtkIdTypeArray id3,vtkPlot id4);
  public void BuildSelection(vtkAnnotationLink id0,int id1,vtkIdTypeArray id2,vtkIdTypeArray id3,vtkPlot id4)
  {
    BuildSelection_73(id0,id1,id2,id3,id4);
  }

  public vtkChartXY() { super(); }

  public vtkChartXY(long id) { super(id); }
  public native long   VTKInit();

}
