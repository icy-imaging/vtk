// java wrapper for vtkMutableDirectedGraph object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMutableDirectedGraph extends vtkDirectedGraph
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

  private native long SetNumberOfVertices_4(long id0);
  public long SetNumberOfVertices(long id0)
  {
    return SetNumberOfVertices_4(id0);
  }

  private native long AddVertex_5();
  public long AddVertex()
  {
    return AddVertex_5();
  }

  private native long AddVertex_6(vtkVariantArray id0);
  public long AddVertex(vtkVariantArray id0)
  {
    return AddVertex_6(id0);
  }

  private native void LazyAddVertex_7();
  public void LazyAddVertex()
  {
    LazyAddVertex_7();
  }

  private native void LazyAddVertex_8(vtkVariantArray id0);
  public void LazyAddVertex(vtkVariantArray id0)
  {
    LazyAddVertex_8(id0);
  }

  private native void LazyAddEdge_9(long id0,long id1,vtkVariantArray id2);
  public void LazyAddEdge(long id0,long id1,vtkVariantArray id2)
  {
    LazyAddEdge_9(id0,id1,id2);
  }

  private native long AddGraphEdge_10(long id0,long id1);
  public vtkGraphEdge AddGraphEdge(long id0,long id1)
  {
    long temp = AddGraphEdge_10(id0,id1);

    if (temp == 0) return null;
    return (vtkGraphEdge)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long AddChild_11(long id0,vtkVariantArray id1);
  public long AddChild(long id0,vtkVariantArray id1)
  {
    return AddChild_11(id0,id1);
  }

  private native long AddChild_12(long id0);
  public long AddChild(long id0)
  {
    return AddChild_12(id0);
  }

  private native void RemoveVertex_13(long id0);
  public void RemoveVertex(long id0)
  {
    RemoveVertex_13(id0);
  }

  private native void RemoveEdge_14(long id0);
  public void RemoveEdge(long id0)
  {
    RemoveEdge_14(id0);
  }

  private native void RemoveVertices_15(vtkIdTypeArray id0);
  public void RemoveVertices(vtkIdTypeArray id0)
  {
    RemoveVertices_15(id0);
  }

  private native void RemoveEdges_16(vtkIdTypeArray id0);
  public void RemoveEdges(vtkIdTypeArray id0)
  {
    RemoveEdges_16(id0);
  }

  public vtkMutableDirectedGraph() { super(); }

  public vtkMutableDirectedGraph(long id) { super(id); }
  public native long   VTKInit();

}
