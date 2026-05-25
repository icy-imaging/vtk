// java wrapper for vtkChartPie object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkChartPie extends vtkChart
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

  private native void SetPlot_7(vtkPlotPie id0);
  public void SetPlot(vtkPlotPie id0)
  {
    SetPlot_7(id0);
  }

  private native long GetPlot_8(long id0);
  public vtkPlot GetPlot(long id0)
  {
    long temp = GetPlot_8(id0);

    if (temp == 0) return null;
    return (vtkPlot)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfPlots_9();
  public long GetNumberOfPlots()
  {
    return GetNumberOfPlots_9();
  }

  private native void SetShowLegend_10(boolean id0);
  public void SetShowLegend(boolean id0)
  {
    SetShowLegend_10(id0);
  }

  private native long GetLegend_11();
  public vtkChartLegend GetLegend()
  {
    long temp = GetLegend_11();

    if (temp == 0) return null;
    return (vtkChartLegend)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScene_12(vtkContextScene id0);
  public void SetScene(vtkContextScene id0)
  {
    SetScene_12(id0);
  }

  private native long AddPlot_13(vtkPlot id0);
  public long AddPlot(vtkPlot id0)
  {
    return AddPlot_13(id0);
  }

  public vtkChartPie() { super(); }

  public vtkChartPie(long id) { super(id); }
  public native long   VTKInit();

}
