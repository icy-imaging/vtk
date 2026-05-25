// java wrapper for vtkTableToGraph object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTableToGraph extends vtkGraphAlgorithm
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

  private native void AddLinkVertex_4(byte[] id0, int len0,byte[] id1, int len1,int id2);
  public void AddLinkVertex(String id0,String id1,int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddLinkVertex_4(bytes0, bytes0.length,bytes1, bytes1.length,id2);
  }

  private native void ClearLinkVertices_5();
  public void ClearLinkVertices()
  {
    ClearLinkVertices_5();
  }

  private native void AddLinkEdge_6(byte[] id0, int len0,byte[] id1, int len1);
  public void AddLinkEdge(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddLinkEdge_6(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void ClearLinkEdges_7();
  public void ClearLinkEdges()
  {
    ClearLinkEdges_7();
  }

  private native long GetLinkGraph_8();
  public vtkMutableDirectedGraph GetLinkGraph()
  {
    long temp = GetLinkGraph_8();

    if (temp == 0) return null;
    return (vtkMutableDirectedGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLinkGraph_9(vtkMutableDirectedGraph id0);
  public void SetLinkGraph(vtkMutableDirectedGraph id0)
  {
    SetLinkGraph_9(id0);
  }

  private native void LinkColumnPath_10(vtkStringArray id0,vtkStringArray id1,vtkBitArray id2);
  public void LinkColumnPath(vtkStringArray id0,vtkStringArray id1,vtkBitArray id2)
  {
    LinkColumnPath_10(id0,id1,id2);
  }

  private native void SetDirected_11(boolean id0);
  public void SetDirected(boolean id0)
  {
    SetDirected_11(id0);
  }

  private native boolean GetDirected_12();
  public boolean GetDirected()
  {
    return GetDirected_12();
  }

  private native void DirectedOn_13();
  public void DirectedOn()
  {
    DirectedOn_13();
  }

  private native void DirectedOff_14();
  public void DirectedOff()
  {
    DirectedOff_14();
  }

  private native long GetMTime_15();
  public long GetMTime()
  {
    return GetMTime_15();
  }

  private native void SetVertexTableConnection_16(vtkAlgorithmOutput id0);
  public void SetVertexTableConnection(vtkAlgorithmOutput id0)
  {
    SetVertexTableConnection_16(id0);
  }

  public vtkTableToGraph() { super(); }

  public vtkTableToGraph(long id) { super(id); }
  public native long   VTKInit();

}
