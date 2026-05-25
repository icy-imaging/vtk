// java wrapper for vtkGraphLayoutStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGraphLayoutStrategy extends vtkObject
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

  private native void SetGraph_4(vtkGraph id0);
  public void SetGraph(vtkGraph id0)
  {
    SetGraph_4(id0);
  }

  private native void Initialize_5();
  public void Initialize()
  {
    Initialize_5();
  }

  private native void Layout_6();
  public void Layout()
  {
    Layout_6();
  }

  private native int IsLayoutComplete_7();
  public int IsLayoutComplete()
  {
    return IsLayoutComplete_7();
  }

  private native void SetWeightEdges_8(boolean id0);
  public void SetWeightEdges(boolean id0)
  {
    SetWeightEdges_8(id0);
  }

  private native boolean GetWeightEdges_9();
  public boolean GetWeightEdges()
  {
    return GetWeightEdges_9();
  }

  private native void SetEdgeWeightField_10(byte[] id0, int len0);
  public void SetEdgeWeightField(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeWeightField_10(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeWeightField_11();
  public String GetEdgeWeightField()
  {
    return new String(GetEdgeWeightField_11(), StandardCharsets.UTF_8);
  }

  public vtkGraphLayoutStrategy() { super(); }

  public vtkGraphLayoutStrategy(long id) { super(id); }

}
