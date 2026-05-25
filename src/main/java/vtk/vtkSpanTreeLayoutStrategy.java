// java wrapper for vtkSpanTreeLayoutStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSpanTreeLayoutStrategy extends vtkGraphLayoutStrategy
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

  private native void SetDepthFirstSpanningTree_4(boolean id0);
  public void SetDepthFirstSpanningTree(boolean id0)
  {
    SetDepthFirstSpanningTree_4(id0);
  }

  private native boolean GetDepthFirstSpanningTree_5();
  public boolean GetDepthFirstSpanningTree()
  {
    return GetDepthFirstSpanningTree_5();
  }

  private native void DepthFirstSpanningTreeOn_6();
  public void DepthFirstSpanningTreeOn()
  {
    DepthFirstSpanningTreeOn_6();
  }

  private native void DepthFirstSpanningTreeOff_7();
  public void DepthFirstSpanningTreeOff()
  {
    DepthFirstSpanningTreeOff_7();
  }

  private native void Layout_8();
  public void Layout()
  {
    Layout_8();
  }

  public vtkSpanTreeLayoutStrategy() { super(); }

  public vtkSpanTreeLayoutStrategy(long id) { super(id); }
  public native long   VTKInit();

}
