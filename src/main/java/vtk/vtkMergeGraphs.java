// java wrapper for vtkMergeGraphs object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMergeGraphs extends vtkGraphAlgorithm
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

  private native int ExtendGraph_4(vtkMutableGraphHelper id0,vtkGraph id1);
  public int ExtendGraph(vtkMutableGraphHelper id0,vtkGraph id1)
  {
    return ExtendGraph_4(id0,id1);
  }

  private native void SetUseEdgeWindow_5(boolean id0);
  public void SetUseEdgeWindow(boolean id0)
  {
    SetUseEdgeWindow_5(id0);
  }

  private native boolean GetUseEdgeWindow_6();
  public boolean GetUseEdgeWindow()
  {
    return GetUseEdgeWindow_6();
  }

  private native void UseEdgeWindowOn_7();
  public void UseEdgeWindowOn()
  {
    UseEdgeWindowOn_7();
  }

  private native void UseEdgeWindowOff_8();
  public void UseEdgeWindowOff()
  {
    UseEdgeWindowOff_8();
  }

  private native void SetEdgeWindowArrayName_9(byte[] id0, int len0);
  public void SetEdgeWindowArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeWindowArrayName_9(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeWindowArrayName_10();
  public String GetEdgeWindowArrayName()
  {
    return new String(GetEdgeWindowArrayName_10(), StandardCharsets.UTF_8);
  }

  private native void SetEdgeWindow_11(double id0);
  public void SetEdgeWindow(double id0)
  {
    SetEdgeWindow_11(id0);
  }

  private native double GetEdgeWindow_12();
  public double GetEdgeWindow()
  {
    return GetEdgeWindow_12();
  }

  public vtkMergeGraphs() { super(); }

  public vtkMergeGraphs(long id) { super(id); }
  public native long   VTKInit();

}
