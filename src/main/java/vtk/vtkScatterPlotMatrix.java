// java wrapper for vtkScatterPlotMatrix object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkScatterPlotMatrix extends vtkChartMatrix
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

  private native void SetScene_6(vtkContextScene id0);
  public void SetScene(vtkContextScene id0)
  {
    SetScene_6(id0);
  }

  private native long GetAnnotationLink_7();
  public vtkAnnotationLink GetAnnotationLink()
  {
    long temp = GetAnnotationLink_7();

    if (temp == 0) return null;
    return (vtkAnnotationLink)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInput_8(vtkTable id0);
  public void SetInput(vtkTable id0)
  {
    SetInput_8(id0);
  }

  private native void SetColumnVisibility_9(byte[] id0, int len0,boolean id1);
  public void SetColumnVisibility(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetColumnVisibility_9(bytes0, bytes0.length,id1);
  }

  private native void InsertVisibleColumn_10(byte[] id0, int len0,int id1);
  public void InsertVisibleColumn(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    InsertVisibleColumn_10(bytes0, bytes0.length,id1);
  }

  private native boolean GetColumnVisibility_11(byte[] id0, int len0);
  public boolean GetColumnVisibility(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetColumnVisibility_11(bytes0, bytes0.length);
  }

  private native void SetColumnVisibilityAll_12(boolean id0);
  public void SetColumnVisibilityAll(boolean id0)
  {
    SetColumnVisibilityAll_12(id0);
  }

  private native long GetVisibleColumns_13();
  public vtkStringArray GetVisibleColumns()
  {
    long temp = GetVisibleColumns_13();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetVisibleColumns_14(vtkStringArray id0);
  public void SetVisibleColumns(vtkStringArray id0)
  {
    SetVisibleColumns_14(id0);
  }

  private native void SetNumberOfBins_15(int id0);
  public void SetNumberOfBins(int id0)
  {
    SetNumberOfBins_15(id0);
  }

  private native int GetNumberOfBins_16();
  public int GetNumberOfBins()
  {
    return GetNumberOfBins_16();
  }

  private native void SetPlotMarkerStyle_17(int id0,int id1);
  public void SetPlotMarkerStyle(int id0,int id1)
  {
    SetPlotMarkerStyle_17(id0,id1);
  }

  private native void SetPlotMarkerSize_18(int id0,float id1);
  public void SetPlotMarkerSize(int id0,float id1)
  {
    SetPlotMarkerSize_18(id0,id1);
  }

  private native int GetPlotType_19(int id0,int id1);
  public int GetPlotType(int id0,int id1)
  {
    return GetPlotType_19(id0,id1);
  }

  private native void SetTitle_20(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_20(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_21();
  public String GetTitle()
  {
    return new String(GetTitle_21(), StandardCharsets.UTF_8);
  }

  private native void SetTitleProperties_22(vtkTextProperty id0);
  public void SetTitleProperties(vtkTextProperty id0)
  {
    SetTitleProperties_22(id0);
  }

  private native long GetTitleProperties_23();
  public vtkTextProperty GetTitleProperties()
  {
    long temp = GetTitleProperties_23();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGridVisibility_24(int id0,boolean id1);
  public void SetGridVisibility(int id0,boolean id1)
  {
    SetGridVisibility_24(id0,id1);
  }

  private native boolean GetGridVisibility_25(int id0);
  public boolean GetGridVisibility(int id0)
  {
    return GetGridVisibility_25(id0);
  }

  private native void SetAxisLabelVisibility_26(int id0,boolean id1);
  public void SetAxisLabelVisibility(int id0,boolean id1)
  {
    SetAxisLabelVisibility_26(id0,id1);
  }

  private native boolean GetAxisLabelVisibility_27(int id0);
  public boolean GetAxisLabelVisibility(int id0)
  {
    return GetAxisLabelVisibility_27(id0);
  }

  private native void SetAxisLabelProperties_28(int id0,vtkTextProperty id1);
  public void SetAxisLabelProperties(int id0,vtkTextProperty id1)
  {
    SetAxisLabelProperties_28(id0,id1);
  }

  private native long GetAxisLabelProperties_29(int id0);
  public vtkTextProperty GetAxisLabelProperties(int id0)
  {
    long temp = GetAxisLabelProperties_29(id0);

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxisLabelNotation_30(int id0,int id1);
  public void SetAxisLabelNotation(int id0,int id1)
  {
    SetAxisLabelNotation_30(id0,id1);
  }

  private native int GetAxisLabelNotation_31(int id0);
  public int GetAxisLabelNotation(int id0)
  {
    return GetAxisLabelNotation_31(id0);
  }

  private native void SetAxisLabelPrecision_32(int id0,int id1);
  public void SetAxisLabelPrecision(int id0,int id1)
  {
    SetAxisLabelPrecision_32(id0,id1);
  }

  private native int GetAxisLabelPrecision_33(int id0);
  public int GetAxisLabelPrecision(int id0)
  {
    return GetAxisLabelPrecision_33(id0);
  }

  private native void SetTooltipNotation_34(int id0,int id1);
  public void SetTooltipNotation(int id0,int id1)
  {
    SetTooltipNotation_34(id0,id1);
  }

  private native void SetTooltipPrecision_35(int id0,int id1);
  public void SetTooltipPrecision(int id0,int id1)
  {
    SetTooltipPrecision_35(id0,id1);
  }

  private native int GetTooltipNotation_36(int id0);
  public int GetTooltipNotation(int id0)
  {
    return GetTooltipNotation_36(id0);
  }

  private native int GetTooltipPrecision_37(int id0);
  public int GetTooltipPrecision(int id0)
  {
    return GetTooltipPrecision_37(id0);
  }

  private native void SetTooltip_38(vtkTooltipItem id0);
  public void SetTooltip(vtkTooltipItem id0)
  {
    SetTooltip_38(id0);
  }

  private native long GetTooltip_39();
  public vtkTooltipItem GetTooltip()
  {
    long temp = GetTooltip_39();

    if (temp == 0) return null;
    return (vtkTooltipItem)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetIndexedLabels_40(vtkStringArray id0);
  public void SetIndexedLabels(vtkStringArray id0)
  {
    SetIndexedLabels_40(id0);
  }

  private native long GetIndexedLabels_41();
  public vtkStringArray GetIndexedLabels()
  {
    long temp = GetIndexedLabels_41();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void UpdateSettings_42();
  public void UpdateSettings()
  {
    UpdateSettings_42();
  }

  private native void UpdateChartSettings_43(int id0);
  public void UpdateChartSettings(int id0)
  {
    UpdateChartSettings_43(id0);
  }

  private native void SetSelectionMode_44(int id0);
  public void SetSelectionMode(int id0)
  {
    SetSelectionMode_44(id0);
  }

  private native int GetSelectionMode_45();
  public int GetSelectionMode()
  {
    return GetSelectionMode_45();
  }

  private native byte[] GetColumnName_46(int id0);
  public String GetColumnName(int id0)
  {
    return new String(GetColumnName_46(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetRowName_47(int id0);
  public String GetRowName(int id0)
  {
    return new String(GetRowName_47(id0), StandardCharsets.UTF_8);
  }

  private native void SetNumberOfFrames_48(int id0);
  public void SetNumberOfFrames(int id0)
  {
    SetNumberOfFrames_48(id0);
  }

  private native int GetNumberOfFrames_49();
  public int GetNumberOfFrames()
  {
    return GetNumberOfFrames_49();
  }

  private native void ClearAnimationPath_50();
  public void ClearAnimationPath()
  {
    ClearAnimationPath_50();
  }

  private native long GetNumberOfAnimationPathElements_51();
  public long GetNumberOfAnimationPathElements()
  {
    return GetNumberOfAnimationPathElements_51();
  }

  private native boolean BeginAnimationPath_52(vtkRenderWindowInteractor id0);
  public boolean BeginAnimationPath(vtkRenderWindowInteractor id0)
  {
    return BeginAnimationPath_52(id0);
  }

  private native void AdvanceAnimation_53();
  public void AdvanceAnimation()
  {
    AdvanceAnimation_53();
  }

  private native long GetMainChart_54();
  public vtkChart GetMainChart()
  {
    long temp = GetMainChart_54();

    if (temp == 0) return null;
    return (vtkChart)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkScatterPlotMatrix() { super(); }

  public vtkScatterPlotMatrix(long id) { super(id); }
  public native long   VTKInit();

}
