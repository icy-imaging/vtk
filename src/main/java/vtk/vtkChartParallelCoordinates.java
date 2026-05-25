// java wrapper for vtkChartParallelCoordinates object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkChartParallelCoordinates extends vtkChart
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

  private native boolean PaintRect_6(vtkContext2D id0,int id1,float id2,float id3);
  public boolean PaintRect(vtkContext2D id0,int id1,float id2,float id3)
  {
    return PaintRect_6(id0,id1,id2,id3);
  }

  private native void SetColumnVisibility_7(byte[] id0, int len0,boolean id1);
  public void SetColumnVisibility(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetColumnVisibility_7(bytes0, bytes0.length,id1);
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

  private native long GetVisibleColumns_10();
  public vtkStringArray GetVisibleColumns()
  {
    long temp = GetVisibleColumns_10();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetVisibleColumns_11(vtkStringArray id0);
  public void SetVisibleColumns(vtkStringArray id0)
  {
    SetVisibleColumns_11(id0);
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

  private native void SetShowLegend_14(boolean id0);
  public void SetShowLegend(boolean id0)
  {
    SetShowLegend_14(id0);
  }

  private native long GetLegend_15();
  public vtkChartLegend GetLegend()
  {
    long temp = GetLegend_15();

    if (temp == 0) return null;
    return (vtkChartLegend)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAxis_16(int id0);
  public vtkAxis GetAxis(int id0)
  {
    long temp = GetAxis_16(id0);

    if (temp == 0) return null;
    return (vtkAxis)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfAxes_17();
  public long GetNumberOfAxes()
  {
    return GetNumberOfAxes_17();
  }

  private native void RecalculateBounds_18();
  public void RecalculateBounds()
  {
    RecalculateBounds_18();
  }

  private native void SetPlot_19(vtkPlotParallelCoordinates id0);
  public void SetPlot(vtkPlotParallelCoordinates id0)
  {
    SetPlot_19(id0);
  }

  private native void UpdateCurrentAxisSelection_20(int id0);
  public void UpdateCurrentAxisSelection(int id0)
  {
    UpdateCurrentAxisSelection_20(id0);
  }

  public vtkChartParallelCoordinates() { super(); }

  public vtkChartParallelCoordinates(long id) { super(id); }
  public native long   VTKInit();

}
