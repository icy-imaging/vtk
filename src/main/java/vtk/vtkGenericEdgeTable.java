// java wrapper for vtkGenericEdgeTable object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericEdgeTable extends vtkObject
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

  private native void InsertEdge_4(long id0,long id1,long id2,int id3);
  public void InsertEdge(long id0,long id1,long id2,int id3)
  {
    InsertEdge_4(id0,id1,id2,id3);
  }

  private native int RemoveEdge_5(long id0,long id1);
  public int RemoveEdge(long id0,long id1)
  {
    return RemoveEdge_5(id0,id1);
  }

  private native int IncrementEdgeReferenceCount_6(long id0,long id1,long id2);
  public int IncrementEdgeReferenceCount(long id0,long id1,long id2)
  {
    return IncrementEdgeReferenceCount_6(id0,id1,id2);
  }

  private native int CheckEdgeReferenceCount_7(long id0,long id1);
  public int CheckEdgeReferenceCount(long id0,long id1)
  {
    return CheckEdgeReferenceCount_7(id0,id1);
  }

  private native void Initialize_8(long id0);
  public void Initialize(long id0)
  {
    Initialize_8(id0);
  }

  private native int GetNumberOfComponents_9();
  public int GetNumberOfComponents()
  {
    return GetNumberOfComponents_9();
  }

  private native void SetNumberOfComponents_10(int id0);
  public void SetNumberOfComponents(int id0)
  {
    SetNumberOfComponents_10(id0);
  }

  private native int CheckPoint_11(long id0);
  public int CheckPoint(long id0)
  {
    return CheckPoint_11(id0);
  }

  private native void InsertPoint_12(long id0,double id1[]);
  public void InsertPoint(long id0,double id1[])
  {
    InsertPoint_12(id0,id1);
  }

  private native void RemovePoint_13(long id0);
  public void RemovePoint(long id0)
  {
    RemovePoint_13(id0);
  }

  private native void IncrementPointReferenceCount_14(long id0);
  public void IncrementPointReferenceCount(long id0)
  {
    IncrementPointReferenceCount_14(id0);
  }

  private native void DumpTable_15();
  public void DumpTable()
  {
    DumpTable_15();
  }

  private native void LoadFactor_16();
  public void LoadFactor()
  {
    LoadFactor_16();
  }

  public vtkGenericEdgeTable() { super(); }

  public vtkGenericEdgeTable(long id) { super(id); }
  public native long   VTKInit();

}
