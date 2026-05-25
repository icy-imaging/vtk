// java wrapper for vtkChart object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkChart extends vtkContextItem
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

  private native boolean Paint_4(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_4(id0);
  }

  private native long AddPlot_5(int id0);
  public vtkPlot AddPlot(int id0)
  {
    long temp = AddPlot_5(id0);

    if (temp == 0) return null;
    return (vtkPlot)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long AddPlot_6(vtkPlot id0);
  public long AddPlot(vtkPlot id0)
  {
    return AddPlot_6(id0);
  }

  private native boolean RemovePlot_7(long id0);
  public boolean RemovePlot(long id0)
  {
    return RemovePlot_7(id0);
  }

  private native boolean RemovePlotInstance_8(vtkPlot id0);
  public boolean RemovePlotInstance(vtkPlot id0)
  {
    return RemovePlotInstance_8(id0);
  }

  private native boolean RemovePlot_9(vtkPlot id0);
  public boolean RemovePlot(vtkPlot id0)
  {
    return RemovePlot_9(id0);
  }

  private native void ClearPlots_10();
  public void ClearPlots()
  {
    ClearPlots_10();
  }

  private native void RemoveAllPlots_11();
  public void RemoveAllPlots()
  {
    RemoveAllPlots_11();
  }

  private native long GetPlot_12(long id0);
  public vtkPlot GetPlot(long id0)
  {
    long temp = GetPlot_12(id0);

    if (temp == 0) return null;
    return (vtkPlot)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfPlots_13();
  public long GetNumberOfPlots()
  {
    return GetNumberOfPlots_13();
  }

  private native long GetAxis_14(int id0);
  public vtkAxis GetAxis(int id0)
  {
    long temp = GetAxis_14(id0);

    if (temp == 0) return null;
    return (vtkAxis)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxis_15(int id0,vtkAxis id1);
  public void SetAxis(int id0,vtkAxis id1)
  {
    SetAxis_15(id0,id1);
  }

  private native long GetNumberOfAxes_16();
  public long GetNumberOfAxes()
  {
    return GetNumberOfAxes_16();
  }

  private native void RecalculateBounds_17();
  public void RecalculateBounds()
  {
    RecalculateBounds_17();
  }

  private native void SetSelectionMethod_18(int id0);
  public void SetSelectionMethod(int id0)
  {
    SetSelectionMethod_18(id0);
  }

  private native int GetSelectionMethod_19();
  public int GetSelectionMethod()
  {
    return GetSelectionMethod_19();
  }

  private native void SetAnnotationLink_20(vtkAnnotationLink id0);
  public void SetAnnotationLink(vtkAnnotationLink id0)
  {
    SetAnnotationLink_20(id0);
  }

  private native long GetAnnotationLink_21();
  public vtkAnnotationLink GetAnnotationLink()
  {
    long temp = GetAnnotationLink_21();

    if (temp == 0) return null;
    return (vtkAnnotationLink)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGeometry_22(int id0,int id1);
  public void SetGeometry(int id0,int id1)
  {
    SetGeometry_22(id0,id1);
  }

  private native void SetGeometry_23(int id0[]);
  public void SetGeometry(int id0[])
  {
    SetGeometry_23(id0);
  }

  private native int[] GetGeometry_24();
  public int[] GetGeometry()
  {
    return GetGeometry_24();
  }

  private native void SetPoint1_25(int id0,int id1);
  public void SetPoint1(int id0,int id1)
  {
    SetPoint1_25(id0,id1);
  }

  private native void SetPoint1_26(int id0[]);
  public void SetPoint1(int id0[])
  {
    SetPoint1_26(id0);
  }

  private native int[] GetPoint1_27();
  public int[] GetPoint1()
  {
    return GetPoint1_27();
  }

  private native void SetPoint2_28(int id0,int id1);
  public void SetPoint2(int id0,int id1)
  {
    SetPoint2_28(id0,id1);
  }

  private native void SetPoint2_29(int id0[]);
  public void SetPoint2(int id0[])
  {
    SetPoint2_29(id0);
  }

  private native int[] GetPoint2_30();
  public int[] GetPoint2()
  {
    return GetPoint2_30();
  }

  private native void SetShowLegend_31(boolean id0);
  public void SetShowLegend(boolean id0)
  {
    SetShowLegend_31(id0);
  }

  private native boolean GetShowLegend_32();
  public boolean GetShowLegend()
  {
    return GetShowLegend_32();
  }

  private native long GetLegend_33();
  public vtkChartLegend GetLegend()
  {
    long temp = GetLegend_33();

    if (temp == 0) return null;
    return (vtkChartLegend)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTitle_34(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_34(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_35();
  public String GetTitle()
  {
    return new String(GetTitle_35(), StandardCharsets.UTF_8);
  }

  private native long GetTitleProperties_36();
  public vtkTextProperty GetTitleProperties()
  {
    long temp = GetTitleProperties_36();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBottomBorder_37(int id0);
  public void SetBottomBorder(int id0)
  {
    SetBottomBorder_37(id0);
  }

  private native void SetTopBorder_38(int id0);
  public void SetTopBorder(int id0)
  {
    SetTopBorder_38(id0);
  }

  private native void SetLeftBorder_39(int id0);
  public void SetLeftBorder(int id0)
  {
    SetLeftBorder_39(id0);
  }

  private native void SetRightBorder_40(int id0);
  public void SetRightBorder(int id0)
  {
    SetRightBorder_40(id0);
  }

  private native void SetBorders_41(int id0,int id1,int id2,int id3);
  public void SetBorders(int id0,int id1,int id2,int id3)
  {
    SetBorders_41(id0,id1,id2,id3);
  }

  private native void SetLayoutStrategy_42(int id0);
  public void SetLayoutStrategy(int id0)
  {
    SetLayoutStrategy_42(id0);
  }

  private native int GetLayoutStrategy_43();
  public int GetLayoutStrategy()
  {
    return GetLayoutStrategy_43();
  }

  private native void SetAutoSize_44(boolean id0);
  public void SetAutoSize(boolean id0)
  {
    SetAutoSize_44(id0);
  }

  private native boolean GetAutoSize_45();
  public boolean GetAutoSize()
  {
    return GetAutoSize_45();
  }

  private native void SetRenderEmpty_46(boolean id0);
  public void SetRenderEmpty(boolean id0)
  {
    SetRenderEmpty_46(id0);
  }

  private native boolean GetRenderEmpty_47();
  public boolean GetRenderEmpty()
  {
    return GetRenderEmpty_47();
  }

  private native void SetActionToButton_48(int id0,int id1);
  public void SetActionToButton(int id0,int id1)
  {
    SetActionToButton_48(id0,id1);
  }

  private native int GetActionToButton_49(int id0);
  public int GetActionToButton(int id0)
  {
    return GetActionToButton_49(id0);
  }

  private native void SetClickActionToButton_50(int id0,int id1);
  public void SetClickActionToButton(int id0,int id1)
  {
    SetClickActionToButton_50(id0,id1);
  }

  private native int GetClickActionToButton_51(int id0);
  public int GetClickActionToButton(int id0)
  {
    return GetClickActionToButton_51(id0);
  }

  private native void SetBackgroundBrush_52(vtkBrush id0);
  public void SetBackgroundBrush(vtkBrush id0)
  {
    SetBackgroundBrush_52(id0);
  }

  private native long GetBackgroundBrush_53();
  public vtkBrush GetBackgroundBrush()
  {
    long temp = GetBackgroundBrush_53();

    if (temp == 0) return null;
    return (vtkBrush)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectionMode_54(int id0);
  public void SetSelectionMode(int id0)
  {
    SetSelectionMode_54(id0);
  }

  private native int GetSelectionModeMinValue_55();
  public int GetSelectionModeMinValue()
  {
    return GetSelectionModeMinValue_55();
  }

  private native int GetSelectionModeMaxValue_56();
  public int GetSelectionModeMaxValue()
  {
    return GetSelectionModeMaxValue_56();
  }

  private native int GetSelectionMode_57();
  public int GetSelectionMode()
  {
    return GetSelectionMode_57();
  }

  public vtkChart() { super(); }

  public vtkChart(long id) { super(id); }

}
