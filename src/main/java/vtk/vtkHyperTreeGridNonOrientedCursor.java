// java wrapper for vtkHyperTreeGridNonOrientedCursor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridNonOrientedCursor extends vtkObject
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
  public vtkHyperTreeGridNonOrientedCursor Clone()
  {
    long temp = Clone_4();

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CloneFromCurrentEntry_5();
  public vtkHyperTreeGridNonOrientedCursor CloneFromCurrentEntry()
  {
    long temp = CloneFromCurrentEntry_5();

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Initialize_6(vtkHyperTreeGrid id0,long id1,boolean id2);
  public void Initialize(vtkHyperTreeGrid id0,long id1,boolean id2)
  {
    Initialize_6(id0,id1,id2);
  }

  private native void Initialize_7(vtkHyperTreeGrid id0,vtkHyperTree id1,int id2,long id3);
  public void Initialize(vtkHyperTreeGrid id0,vtkHyperTree id1,int id2,long id3)
  {
    Initialize_7(id0,id1,id2,id3);
  }

  private native long GetGrid_8();
  public vtkHyperTreeGrid GetGrid()
  {
    long temp = GetGrid_8();

    if (temp == 0) return null;
    return (vtkHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean HasTree_9();
  public boolean HasTree()
  {
    return HasTree_9();
  }

  private native long GetTree_10();
  public vtkHyperTree GetTree()
  {
    long temp = GetTree_10();

    if (temp == 0) return null;
    return (vtkHyperTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVertexId_11();
  public long GetVertexId()
  {
    return GetVertexId_11();
  }

  private native long GetGlobalNodeIndex_12();
  public long GetGlobalNodeIndex()
  {
    return GetGlobalNodeIndex_12();
  }

  private native byte GetDimension_13();
  public byte GetDimension()
  {
    return GetDimension_13();
  }

  private native byte GetNumberOfChildren_14();
  public byte GetNumberOfChildren()
  {
    return GetNumberOfChildren_14();
  }

  private native void SetGlobalIndexStart_15(long id0);
  public void SetGlobalIndexStart(long id0)
  {
    SetGlobalIndexStart_15(id0);
  }

  private native void SetGlobalIndexFromLocal_16(long id0);
  public void SetGlobalIndexFromLocal(long id0)
  {
    SetGlobalIndexFromLocal_16(id0);
  }

  private native void SetMask_17(boolean id0);
  public void SetMask(boolean id0)
  {
    SetMask_17(id0);
  }

  private native boolean IsMasked_18();
  public boolean IsMasked()
  {
    return IsMasked_18();
  }

  private native boolean IsLeaf_19();
  public boolean IsLeaf()
  {
    return IsLeaf_19();
  }

  private native void SubdivideLeaf_20();
  public void SubdivideLeaf()
  {
    SubdivideLeaf_20();
  }

  private native boolean IsRoot_21();
  public boolean IsRoot()
  {
    return IsRoot_21();
  }

  private native int GetLevel_22();
  public int GetLevel()
  {
    return GetLevel_22();
  }

  private native void ToChild_23(byte id0);
  public void ToChild(byte id0)
  {
    ToChild_23(id0);
  }

  private native void ToRoot_24();
  public void ToRoot()
  {
    ToRoot_24();
  }

  private native void ToParent_25();
  public void ToParent()
  {
    ToParent_25();
  }

  public vtkHyperTreeGridNonOrientedCursor() { super(); }

  public vtkHyperTreeGridNonOrientedCursor(long id) { super(id); }
  public native long   VTKInit();

}
