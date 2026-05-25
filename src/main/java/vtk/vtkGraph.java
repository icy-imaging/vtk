// java wrapper for vtkGraph object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGraph extends vtkDataObject
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

  private native long GetVertexData_4();
  public vtkDataSetAttributes GetVertexData()
  {
    long temp = GetVertexData_4();

    if (temp == 0) return null;
    return (vtkDataSetAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeData_5();
  public vtkDataSetAttributes GetEdgeData()
  {
    long temp = GetEdgeData_5();

    if (temp == 0) return null;
    return (vtkDataSetAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDataObjectType_6();
  public int GetDataObjectType()
  {
    return GetDataObjectType_6();
  }

  private native void Initialize_7();
  public void Initialize()
  {
    Initialize_7();
  }

  private native void GetPoint_8(long id0,double id1[]);
  public void GetPoint(long id0,double id1[])
  {
    GetPoint_8(id0,id1);
  }

  private native long GetPoints_9();
  public vtkPoints GetPoints()
  {
    long temp = GetPoints_9();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPoints_10(vtkPoints id0);
  public void SetPoints(vtkPoints id0)
  {
    SetPoints_10(id0);
  }

  private native void ComputeBounds_11();
  public void ComputeBounds()
  {
    ComputeBounds_11();
  }

  private native void GetBounds_12(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_12(id0);
  }

  private native long GetMTime_13();
  public long GetMTime()
  {
    return GetMTime_13();
  }

  private native void GetOutEdges_14(long id0,vtkOutEdgeIterator id1);
  public void GetOutEdges(long id0,vtkOutEdgeIterator id1)
  {
    GetOutEdges_14(id0,id1);
  }

  private native long GetDegree_15(long id0);
  public long GetDegree(long id0)
  {
    return GetDegree_15(id0);
  }

  private native long GetOutDegree_16(long id0);
  public long GetOutDegree(long id0)
  {
    return GetOutDegree_16(id0);
  }

  private native void GetOutEdge_17(long id0,long id1,vtkGraphEdge id2);
  public void GetOutEdge(long id0,long id1,vtkGraphEdge id2)
  {
    GetOutEdge_17(id0,id1,id2);
  }

  private native void GetInEdges_18(long id0,vtkInEdgeIterator id1);
  public void GetInEdges(long id0,vtkInEdgeIterator id1)
  {
    GetInEdges_18(id0,id1);
  }

  private native long GetInDegree_19(long id0);
  public long GetInDegree(long id0)
  {
    return GetInDegree_19(id0);
  }

  private native void GetInEdge_20(long id0,long id1,vtkGraphEdge id2);
  public void GetInEdge(long id0,long id1,vtkGraphEdge id2)
  {
    GetInEdge_20(id0,id1,id2);
  }

  private native void GetAdjacentVertices_21(long id0,vtkAdjacentVertexIterator id1);
  public void GetAdjacentVertices(long id0,vtkAdjacentVertexIterator id1)
  {
    GetAdjacentVertices_21(id0,id1);
  }

  private native void GetEdges_22(vtkEdgeListIterator id0);
  public void GetEdges(vtkEdgeListIterator id0)
  {
    GetEdges_22(id0);
  }

  private native long GetNumberOfEdges_23();
  public long GetNumberOfEdges()
  {
    return GetNumberOfEdges_23();
  }

  private native void GetVertices_24(vtkVertexListIterator id0);
  public void GetVertices(vtkVertexListIterator id0)
  {
    GetVertices_24(id0);
  }

  private native long GetNumberOfVertices_25();
  public long GetNumberOfVertices()
  {
    return GetNumberOfVertices_25();
  }

  private native void SetDistributedGraphHelper_26(vtkDistributedGraphHelper id0);
  public void SetDistributedGraphHelper(vtkDistributedGraphHelper id0)
  {
    SetDistributedGraphHelper_26(id0);
  }

  private native long GetDistributedGraphHelper_27();
  public vtkDistributedGraphHelper GetDistributedGraphHelper()
  {
    long temp = GetDistributedGraphHelper_27();

    if (temp == 0) return null;
    return (vtkDistributedGraphHelper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ShallowCopy_28(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_28(id0);
  }

  private native void DeepCopy_29(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_29(id0);
  }

  private native void CopyStructure_30(vtkGraph id0);
  public void CopyStructure(vtkGraph id0)
  {
    CopyStructure_30(id0);
  }

  private native boolean CheckedShallowCopy_31(vtkGraph id0);
  public boolean CheckedShallowCopy(vtkGraph id0)
  {
    return CheckedShallowCopy_31(id0);
  }

  private native boolean CheckedDeepCopy_32(vtkGraph id0);
  public boolean CheckedDeepCopy(vtkGraph id0)
  {
    return CheckedDeepCopy_32(id0);
  }

  private native void Squeeze_33();
  public void Squeeze()
  {
    Squeeze_33();
  }

  private native long GetActualMemorySize_34();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_34();
  }

  private native long GetData_35(vtkInformation id0);
  public vtkGraph GetData(vtkInformation id0)
  {
    long temp = GetData_35(id0);

    if (temp == 0) return null;
    return (vtkGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_36(vtkInformationVector id0,int id1);
  public vtkGraph GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_36(id0,id1);

    if (temp == 0) return null;
    return (vtkGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ReorderOutVertices_37(long id0,vtkIdTypeArray id1);
  public void ReorderOutVertices(long id0,vtkIdTypeArray id1)
  {
    ReorderOutVertices_37(id0,id1);
  }

  private native boolean IsSameStructure_38(vtkGraph id0);
  public boolean IsSameStructure(vtkGraph id0)
  {
    return IsSameStructure_38(id0);
  }

  private native long GetSourceVertex_39(long id0);
  public long GetSourceVertex(long id0)
  {
    return GetSourceVertex_39(id0);
  }

  private native long GetTargetVertex_40(long id0);
  public long GetTargetVertex(long id0)
  {
    return GetTargetVertex_40(id0);
  }

  private native long GetNumberOfEdgePoints_41(long id0);
  public long GetNumberOfEdgePoints(long id0)
  {
    return GetNumberOfEdgePoints_41(id0);
  }

  private native double[] GetEdgePoint_42(long id0,long id1);
  public double[] GetEdgePoint(long id0,long id1)
  {
    return GetEdgePoint_42(id0,id1);
  }

  private native void ClearEdgePoints_43(long id0);
  public void ClearEdgePoints(long id0)
  {
    ClearEdgePoints_43(id0);
  }

  private native void SetEdgePoint_44(long id0,long id1,double id2[]);
  public void SetEdgePoint(long id0,long id1,double id2[])
  {
    SetEdgePoint_44(id0,id1,id2);
  }

  private native void SetEdgePoint_45(long id0,long id1,double id2,double id3,double id4);
  public void SetEdgePoint(long id0,long id1,double id2,double id3,double id4)
  {
    SetEdgePoint_45(id0,id1,id2,id3,id4);
  }

  private native void AddEdgePoint_46(long id0,double id1[]);
  public void AddEdgePoint(long id0,double id1[])
  {
    AddEdgePoint_46(id0,id1);
  }

  private native void AddEdgePoint_47(long id0,double id1,double id2,double id3);
  public void AddEdgePoint(long id0,double id1,double id2,double id3)
  {
    AddEdgePoint_47(id0,id1,id2,id3);
  }

  private native void ShallowCopyEdgePoints_48(vtkGraph id0);
  public void ShallowCopyEdgePoints(vtkGraph id0)
  {
    ShallowCopyEdgePoints_48(id0);
  }

  private native void DeepCopyEdgePoints_49(vtkGraph id0);
  public void DeepCopyEdgePoints(vtkGraph id0)
  {
    DeepCopyEdgePoints_49(id0);
  }

  private native long GetGraphInternals_50(boolean id0);
  public vtkGraphInternals GetGraphInternals(boolean id0)
  {
    long temp = GetGraphInternals_50(id0);

    if (temp == 0) return null;
    return (vtkGraphInternals)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetInducedEdges_51(vtkIdTypeArray id0,vtkIdTypeArray id1);
  public void GetInducedEdges(vtkIdTypeArray id0,vtkIdTypeArray id1)
  {
    GetInducedEdges_51(id0,id1);
  }

  private native long GetAttributesAsFieldData_52(int id0);
  public vtkFieldData GetAttributesAsFieldData(int id0)
  {
    long temp = GetAttributesAsFieldData_52(id0);

    if (temp == 0) return null;
    return (vtkFieldData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfElements_53(int id0);
  public long GetNumberOfElements(int id0)
  {
    return GetNumberOfElements_53(id0);
  }

  private native void Dump_54();
  public void Dump()
  {
    Dump_54();
  }

  private native long GetEdgeId_55(long id0,long id1);
  public long GetEdgeId(long id0,long id1)
  {
    return GetEdgeId_55(id0,id1);
  }

  private native boolean ToDirectedGraph_56(vtkDirectedGraph id0);
  public boolean ToDirectedGraph(vtkDirectedGraph id0)
  {
    return ToDirectedGraph_56(id0);
  }

  private native boolean ToUndirectedGraph_57(vtkUndirectedGraph id0);
  public boolean ToUndirectedGraph(vtkUndirectedGraph id0)
  {
    return ToUndirectedGraph_57(id0);
  }

  public vtkGraph() { super(); }

  public vtkGraph(long id) { super(id); }

}
