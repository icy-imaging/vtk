// java wrapper for vtkUndirectedGraph object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUndirectedGraph extends vtkGraph
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

  private native int GetDataObjectType_4();
  public int GetDataObjectType()
  {
    return GetDataObjectType_4();
  }

  private native long GetInDegree_5(long id0);
  public long GetInDegree(long id0)
  {
    return GetInDegree_5(id0);
  }

  private native void GetInEdge_6(long id0,long id1,vtkGraphEdge id2);
  public void GetInEdge(long id0,long id1,vtkGraphEdge id2)
  {
    GetInEdge_6(id0,id1,id2);
  }

  private native long GetData_7(vtkInformation id0);
  public vtkUndirectedGraph GetData(vtkInformation id0)
  {
    long temp = GetData_7(id0);

    if (temp == 0) return null;
    return (vtkUndirectedGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_8(vtkInformationVector id0,int id1);
  public vtkUndirectedGraph GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_8(id0,id1);

    if (temp == 0) return null;
    return (vtkUndirectedGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetInEdges_9(long id0,vtkInEdgeIterator id1);
  public void GetInEdges(long id0,vtkInEdgeIterator id1)
  {
    GetInEdges_9(id0,id1);
  }

  private native boolean IsStructureValid_10(vtkGraph id0);
  public boolean IsStructureValid(vtkGraph id0)
  {
    return IsStructureValid_10(id0);
  }

  public vtkUndirectedGraph() { super(); }

  public vtkUndirectedGraph(long id) { super(id); }
  public native long   VTKInit();

}
