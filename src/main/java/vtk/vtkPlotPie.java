// java wrapper for vtkPlotPie object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlotPie extends vtkPlot
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

  private native void SetDimensions_5(int id0,int id1,int id2,int id3);
  public void SetDimensions(int id0,int id1,int id2,int id3)
  {
    SetDimensions_5(id0,id1,id2,id3);
  }

  private native void SetDimensions_6(int id0[]);
  public void SetDimensions(int id0[])
  {
    SetDimensions_6(id0);
  }

  private native int[] GetDimensions_7();
  public int[] GetDimensions()
  {
    return GetDimensions_7();
  }

  private native void SetColorSeries_8(vtkColorSeries id0);
  public void SetColorSeries(vtkColorSeries id0)
  {
    SetColorSeries_8(id0);
  }

  private native long GetColorSeries_9();
  public vtkColorSeries GetColorSeries()
  {
    long temp = GetColorSeries_9();

    if (temp == 0) return null;
    return (vtkColorSeries)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean UpdateCache_10();
  public boolean UpdateCache()
  {
    return UpdateCache_10();
  }

  public vtkPlotPie() { super(); }

  public vtkPlotPie(long id) { super(id); }
  public native long   VTKInit();

}
