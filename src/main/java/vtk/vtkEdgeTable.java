// java wrapper for vtkEdgeTable object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEdgeTable extends vtkObject
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

  private native void Initialize_4();
  public void Initialize()
  {
    Initialize_4();
  }

  private native int InitEdgeInsertion_5(long id0,int id1);
  public int InitEdgeInsertion(long id0,int id1)
  {
    return InitEdgeInsertion_5(id0,id1);
  }

  private native long InsertEdge_6(long id0,long id1);
  public long InsertEdge(long id0,long id1)
  {
    return InsertEdge_6(id0,id1);
  }

  private native void InsertEdge_7(long id0,long id1,long id2);
  public void InsertEdge(long id0,long id1,long id2)
  {
    InsertEdge_7(id0,id1,id2);
  }

  private native long IsEdge_8(long id0,long id1);
  public long IsEdge(long id0,long id1)
  {
    return IsEdge_8(id0,id1);
  }

  private native int InitPointInsertion_9(vtkPoints id0,long id1);
  public int InitPointInsertion(vtkPoints id0,long id1)
  {
    return InitPointInsertion_9(id0,id1);
  }

  private native long GetNumberOfEdges_10();
  public long GetNumberOfEdges()
  {
    return GetNumberOfEdges_10();
  }

  private native void InitTraversal_11();
  public void InitTraversal()
  {
    InitTraversal_11();
  }

  private native void Reset_12();
  public void Reset()
  {
    Reset_12();
  }

  public vtkEdgeTable() { super(); }

  public vtkEdgeTable(long id) { super(id); }
  public native long   VTKInit();

}
