// java wrapper for vtkTree object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTree extends vtkDirectedAcyclicGraph
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

  private native long GetRoot_5();
  public long GetRoot()
  {
    return GetRoot_5();
  }

  private native long GetNumberOfChildren_6(long id0);
  public long GetNumberOfChildren(long id0)
  {
    return GetNumberOfChildren_6(id0);
  }

  private native long GetChild_7(long id0,long id1);
  public long GetChild(long id0,long id1)
  {
    return GetChild_7(id0,id1);
  }

  private native void GetChildren_8(long id0,vtkAdjacentVertexIterator id1);
  public void GetChildren(long id0,vtkAdjacentVertexIterator id1)
  {
    GetChildren_8(id0,id1);
  }

  private native long GetParent_9(long id0);
  public long GetParent(long id0)
  {
    return GetParent_9(id0);
  }

  private native long GetLevel_10(long id0);
  public long GetLevel(long id0)
  {
    return GetLevel_10(id0);
  }

  private native boolean IsLeaf_11(long id0);
  public boolean IsLeaf(long id0)
  {
    return IsLeaf_11(id0);
  }

  private native long GetData_12(vtkInformation id0);
  public vtkTree GetData(vtkInformation id0)
  {
    long temp = GetData_12(id0);

    if (temp == 0) return null;
    return (vtkTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_13(vtkInformationVector id0,int id1);
  public vtkTree GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_13(id0,id1);

    if (temp == 0) return null;
    return (vtkTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ReorderChildren_14(long id0,vtkIdTypeArray id1);
  public void ReorderChildren(long id0,vtkIdTypeArray id1)
  {
    ReorderChildren_14(id0,id1);
  }

  public vtkTree() { super(); }

  public vtkTree(long id) { super(id); }
  public native long   VTKInit();

}
