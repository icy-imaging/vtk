// java wrapper for vtkHyperTreeGridNonOrientedSuperCursorLight object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridNonOrientedSuperCursorLight extends vtkObject
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
  public vtkHyperTreeGridNonOrientedSuperCursorLight Clone()
  {
    long temp = Clone_4();

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedSuperCursorLight)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Initialize_5(vtkHyperTreeGrid id0,long id1,boolean id2);
  public void Initialize(vtkHyperTreeGrid id0,long id1,boolean id2)
  {
    Initialize_5(id0,id1,id2);
  }

  private native long GetGrid_6();
  public vtkHyperTreeGrid GetGrid()
  {
    long temp = GetGrid_6();

    if (temp == 0) return null;
    return (vtkHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean HasTree_7();
  public boolean HasTree()
  {
    return HasTree_7();
  }

  private native boolean HasTree_8(int id0);
  public boolean HasTree(int id0)
  {
    return HasTree_8(id0);
  }

  private native long GetTree_9();
  public vtkHyperTree GetTree()
  {
    long temp = GetTree_9();

    if (temp == 0) return null;
    return (vtkHyperTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTree_10(int id0);
  public vtkHyperTree GetTree(int id0)
  {
    long temp = GetTree_10(id0);

    if (temp == 0) return null;
    return (vtkHyperTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVertexId_11();
  public long GetVertexId()
  {
    return GetVertexId_11();
  }

  private native long GetVertexId_12(int id0);
  public long GetVertexId(int id0)
  {
    return GetVertexId_12(id0);
  }

  private native long GetGlobalNodeIndex_13();
  public long GetGlobalNodeIndex()
  {
    return GetGlobalNodeIndex_13();
  }

  private native long GetGlobalNodeIndex_14(int id0);
  public long GetGlobalNodeIndex(int id0)
  {
    return GetGlobalNodeIndex_14(id0);
  }

  private native byte GetDimension_15();
  public byte GetDimension()
  {
    return GetDimension_15();
  }

  private native byte GetNumberOfChildren_16();
  public byte GetNumberOfChildren()
  {
    return GetNumberOfChildren_16();
  }

  private native void SetGlobalIndexStart_17(long id0);
  public void SetGlobalIndexStart(long id0)
  {
    SetGlobalIndexStart_17(id0);
  }

  private native void SetGlobalIndexFromLocal_18(long id0);
  public void SetGlobalIndexFromLocal(long id0)
  {
    SetGlobalIndexFromLocal_18(id0);
  }

  private native void SetMask_19(boolean id0);
  public void SetMask(boolean id0)
  {
    SetMask_19(id0);
  }

  private native void SetMask_20(int id0,boolean id1);
  public void SetMask(int id0,boolean id1)
  {
    SetMask_20(id0,id1);
  }

  private native boolean IsMasked_21();
  public boolean IsMasked()
  {
    return IsMasked_21();
  }

  private native boolean IsMasked_22(int id0);
  public boolean IsMasked(int id0)
  {
    return IsMasked_22(id0);
  }

  private native void GetBounds_23(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_23(id0);
  }

  private native void GetPoint_24(double id0[]);
  public void GetPoint(double id0[])
  {
    GetPoint_24(id0);
  }

  private native boolean IsLeaf_25();
  public boolean IsLeaf()
  {
    return IsLeaf_25();
  }

  private native boolean IsLeaf_26(int id0);
  public boolean IsLeaf(int id0)
  {
    return IsLeaf_26(id0);
  }

  private native void SubdivideLeaf_27();
  public void SubdivideLeaf()
  {
    SubdivideLeaf_27();
  }

  private native boolean IsRoot_28();
  public boolean IsRoot()
  {
    return IsRoot_28();
  }

  private native int GetLevel_29();
  public int GetLevel()
  {
    return GetLevel_29();
  }

  private native int GetLevel_30(int id0);
  public int GetLevel(int id0)
  {
    return GetLevel_30(id0);
  }

  private native void ToChild_31(byte id0);
  public void ToChild(byte id0)
  {
    ToChild_31(id0);
  }

  private native void ToRoot_32();
  public void ToRoot()
  {
    ToRoot_32();
  }

  private native void ToParent_33();
  public void ToParent()
  {
    ToParent_33();
  }

  private native int GetNumberOfCursors_34();
  public int GetNumberOfCursors()
  {
    return GetNumberOfCursors_34();
  }

  public vtkHyperTreeGridNonOrientedSuperCursorLight() { super(); }

  public vtkHyperTreeGridNonOrientedSuperCursorLight(long id) { super(id); }

}
