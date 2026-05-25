// java wrapper for vtkHyperTreeGridOrientedCursor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridOrientedCursor extends vtkObject
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

  private native long Clone_4();
  public vtkHyperTreeGridOrientedCursor Clone()
  {
    long temp = Clone_4();

    if (temp == 0) return null;
    return (vtkHyperTreeGridOrientedCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Initialize_5(vtkHyperTreeGrid id0,long id1,boolean id2);
  public void Initialize(vtkHyperTreeGrid id0,long id1,boolean id2)
  {
    Initialize_5(id0,id1,id2);
  }

  private native void Initialize_6(vtkHyperTreeGrid id0,vtkHyperTree id1,int id2,long id3);
  public void Initialize(vtkHyperTreeGrid id0,vtkHyperTree id1,int id2,long id3)
  {
    Initialize_6(id0,id1,id2,id3);
  }

  private native long GetGrid_7();
  public vtkHyperTreeGrid GetGrid()
  {
    long temp = GetGrid_7();

    if (temp == 0) return null;
    return (vtkHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean HasTree_8();
  public boolean HasTree()
  {
    return HasTree_8();
  }

  private native long GetTree_9();
  public vtkHyperTree GetTree()
  {
    long temp = GetTree_9();

    if (temp == 0) return null;
    return (vtkHyperTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVertexId_10();
  public long GetVertexId()
  {
    return GetVertexId_10();
  }

  private native long GetGlobalNodeIndex_11();
  public long GetGlobalNodeIndex()
  {
    return GetGlobalNodeIndex_11();
  }

  private native byte GetDimension_12();
  public byte GetDimension()
  {
    return GetDimension_12();
  }

  private native byte GetNumberOfChildren_13();
  public byte GetNumberOfChildren()
  {
    return GetNumberOfChildren_13();
  }

  private native void SetGlobalIndexStart_14(long id0);
  public void SetGlobalIndexStart(long id0)
  {
    SetGlobalIndexStart_14(id0);
  }

  private native void SetGlobalIndexFromLocal_15(long id0);
  public void SetGlobalIndexFromLocal(long id0)
  {
    SetGlobalIndexFromLocal_15(id0);
  }

  private native void SetMask_16(boolean id0);
  public void SetMask(boolean id0)
  {
    SetMask_16(id0);
  }

  private native boolean IsMasked_17();
  public boolean IsMasked()
  {
    return IsMasked_17();
  }

  private native boolean IsLeaf_18();
  public boolean IsLeaf()
  {
    return IsLeaf_18();
  }

  private native void SubdivideLeaf_19();
  public void SubdivideLeaf()
  {
    SubdivideLeaf_19();
  }

  private native boolean IsRoot_20();
  public boolean IsRoot()
  {
    return IsRoot_20();
  }

  private native int GetLevel_21();
  public int GetLevel()
  {
    return GetLevel_21();
  }

  private native void ToChild_22(byte id0);
  public void ToChild(byte id0)
  {
    ToChild_22(id0);
  }

  public vtkHyperTreeGridOrientedCursor() { super(); }

  public vtkHyperTreeGridOrientedCursor(long id) { super(id); }
  public native long   VTKInit();

}
