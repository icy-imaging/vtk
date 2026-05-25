// java wrapper for vtkPlotLine object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlotLine extends vtkPlotPoints
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

  private native void SetPolyLine_5(boolean id0);
  public void SetPolyLine(boolean id0)
  {
    SetPolyLine_5(id0);
  }

  private native boolean GetPolyLine_6();
  public boolean GetPolyLine()
  {
    return GetPolyLine_6();
  }

  private native void PolyLineOn_7();
  public void PolyLineOn()
  {
    PolyLineOn_7();
  }

  private native void PolyLineOff_8();
  public void PolyLineOff()
  {
    PolyLineOff_8();
  }

  public vtkPlotLine() { super(); }

  public vtkPlotLine(long id) { super(id); }
  public native long   VTKInit();

}
