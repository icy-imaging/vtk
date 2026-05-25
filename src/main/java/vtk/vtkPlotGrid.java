// java wrapper for vtkPlotGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlotGrid extends vtkContextItem
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

  private native void SetXAxis_4(vtkAxis id0);
  public void SetXAxis(vtkAxis id0)
  {
    SetXAxis_4(id0);
  }

  private native void SetYAxis_5(vtkAxis id0);
  public void SetYAxis(vtkAxis id0)
  {
    SetYAxis_5(id0);
  }

  private native boolean Paint_6(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_6(id0);
  }

  public vtkPlotGrid() { super(); }

  public vtkPlotGrid(long id) { super(id); }
  public native long   VTKInit();

}
