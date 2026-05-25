// java wrapper for vtkStreamGraph object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStreamGraph extends vtkGraphAlgorithm
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

  private native void SetUseEdgeWindow_4(boolean id0);
  public void SetUseEdgeWindow(boolean id0)
  {
    SetUseEdgeWindow_4(id0);
  }

  private native boolean GetUseEdgeWindow_5();
  public boolean GetUseEdgeWindow()
  {
    return GetUseEdgeWindow_5();
  }

  private native void UseEdgeWindowOn_6();
  public void UseEdgeWindowOn()
  {
    UseEdgeWindowOn_6();
  }

  private native void UseEdgeWindowOff_7();
  public void UseEdgeWindowOff()
  {
    UseEdgeWindowOff_7();
  }

  private native void SetEdgeWindowArrayName_8(byte[] id0, int len0);
  public void SetEdgeWindowArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeWindowArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeWindowArrayName_9();
  public String GetEdgeWindowArrayName()
  {
    return new String(GetEdgeWindowArrayName_9(), StandardCharsets.UTF_8);
  }

  private native void SetEdgeWindow_10(double id0);
  public void SetEdgeWindow(double id0)
  {
    SetEdgeWindow_10(id0);
  }

  private native double GetEdgeWindow_11();
  public double GetEdgeWindow()
  {
    return GetEdgeWindow_11();
  }

  public vtkStreamGraph() { super(); }

  public vtkStreamGraph(long id) { super(id); }
  public native long   VTKInit();

}
