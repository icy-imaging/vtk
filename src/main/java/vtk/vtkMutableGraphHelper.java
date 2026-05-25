// java wrapper for vtkMutableGraphHelper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMutableGraphHelper extends vtkObject
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

  private native long GetGraph_5();
  public vtkGraph GetGraph()
  {
    long temp = GetGraph_5();

    if (temp == 0) return null;
    return (vtkGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long AddGraphEdge_6(long id0,long id1);
  public vtkGraphEdge AddGraphEdge(long id0,long id1)
  {
    long temp = AddGraphEdge_6(id0,id1);

    if (temp == 0) return null;
    return (vtkGraphEdge)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long AddVertex_7();
  public long AddVertex()
  {
    return AddVertex_7();
  }

  private native void RemoveVertex_8(long id0);
  public void RemoveVertex(long id0)
  {
    RemoveVertex_8(id0);
  }

  private native void RemoveVertices_9(vtkIdTypeArray id0);
  public void RemoveVertices(vtkIdTypeArray id0)
  {
    RemoveVertices_9(id0);
  }

  private native void RemoveEdge_10(long id0);
  public void RemoveEdge(long id0)
  {
    RemoveEdge_10(id0);
  }

  private native void RemoveEdges_11(vtkIdTypeArray id0);
  public void RemoveEdges(vtkIdTypeArray id0)
  {
    RemoveEdges_11(id0);
  }

  public vtkMutableGraphHelper() { super(); }

  public vtkMutableGraphHelper(long id) { super(id); }
  public native long   VTKInit();

}
