// java wrapper for vtkChartBox object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkChartBox extends vtkChart
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

  private native void SetColumnVisibility_6(byte[] id0, int len0,boolean id1);
  public void SetColumnVisibility(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetColumnVisibility_6(bytes0, bytes0.length,id1);
  }

  private native void SetColumnVisibility_7(long id0,boolean id1);
  public void SetColumnVisibility(long id0,boolean id1)
  {
    SetColumnVisibility_7(id0,id1);
  }

  private native void SetColumnVisibilityAll_8(boolean id0);
  public void SetColumnVisibilityAll(boolean id0)
  {
    SetColumnVisibilityAll_8(id0);
  }

  private native boolean GetColumnVisibility_9(byte[] id0, int len0);
  public boolean GetColumnVisibility(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetColumnVisibility_9(bytes0, bytes0.length);
  }

  private native boolean GetColumnVisibility_10(long id0);
  public boolean GetColumnVisibility(long id0)
  {
    return GetColumnVisibility_10(id0);
  }

  private native long GetColumnId_11(byte[] id0, int len0);
  public long GetColumnId(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetColumnId_11(bytes0, bytes0.length);
  }

  private native long GetVisibleColumns_12();
  public vtkStringArray GetVisibleColumns()
  {
    long temp = GetVisibleColumns_12();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetSelectedColumn_13();
  public int GetSelectedColumn()
  {
    return GetSelectedColumn_13();
  }

  private native void SetSelectedColumn_14(int id0);
  public void SetSelectedColumn(int id0)
  {
    SetSelectedColumn_14(id0);
  }

  private native long GetPlot_15(long id0);
  public vtkPlot GetPlot(long id0)
  {
    long temp = GetPlot_15(id0);

    if (temp == 0) return null;
    return (vtkPlot)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfPlots_16();
  public long GetNumberOfPlots()
  {
    return GetNumberOfPlots_16();
  }

  private native long GetYAxis_17();
  public vtkAxis GetYAxis()
  {
    long temp = GetYAxis_17();

    if (temp == 0) return null;
    return (vtkAxis)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native float GetXPosition_18(int id0);
  public float GetXPosition(int id0)
  {
    return GetXPosition_18(id0);
  }

  private native long GetNumberOfVisibleColumns_19();
  public long GetNumberOfVisibleColumns()
  {
    return GetNumberOfVisibleColumns_19();
  }

  private native void SetPlot_20(vtkPlotBox id0);
  public void SetPlot(vtkPlotBox id0)
  {
    SetPlot_20(id0);
  }

  private native void SetTooltip_21(vtkTooltipItem id0);
  public void SetTooltip(vtkTooltipItem id0)
  {
    SetTooltip_21(id0);
  }

  private native long GetTooltip_22();
  public vtkTooltipItem GetTooltip()
  {
    long temp = GetTooltip_22();

    if (temp == 0) return null;
    return (vtkTooltipItem)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGeometry_23(int id0,int id1);
  public void SetGeometry(int id0,int id1)
  {
    SetGeometry_23(id0,id1);
  }

  private native void SetLayoutStrategy_24(int id0);
  public void SetLayoutStrategy(int id0)
  {
    SetLayoutStrategy_24(id0);
  }

  public vtkChartBox() { super(); }

  public vtkChartBox(long id) { super(id); }
  public native long   VTKInit();

}
