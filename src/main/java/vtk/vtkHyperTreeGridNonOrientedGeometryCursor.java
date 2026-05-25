// java wrapper for vtkHyperTreeGridNonOrientedGeometryCursor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridNonOrientedGeometryCursor extends vtkObject
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
  public vtkHyperTreeGridNonOrientedGeometryCursor Clone()
  {
    long temp = Clone_4();

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedGeometryCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Initialize_5(vtkHyperTreeGrid id0,long id1,boolean id2);
  public void Initialize(vtkHyperTreeGrid id0,long id1,boolean id2)
  {
    Initialize_5(id0,id1,id2);
  }

  private native void Initialize_6(vtkHyperTreeGridNonOrientedGeometryCursor id0);
  public void Initialize(vtkHyperTreeGridNonOrientedGeometryCursor id0)
  {
    Initialize_6(id0);
  }

  private native boolean HasTree_7();
  public boolean HasTree()
  {
    return HasTree_7();
  }

  private native long GetTree_8();
  public vtkHyperTree GetTree()
  {
    long temp = GetTree_8();

    if (temp == 0) return null;
    return (vtkHyperTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVertexId_9();
  public long GetVertexId()
  {
    return GetVertexId_9();
  }

  private native long GetGlobalNodeIndex_10();
  public long GetGlobalNodeIndex()
  {
    return GetGlobalNodeIndex_10();
  }

  private native byte GetDimension_11();
  public byte GetDimension()
  {
    return GetDimension_11();
  }

  private native byte GetNumberOfChildren_12();
  public byte GetNumberOfChildren()
  {
    return GetNumberOfChildren_12();
  }

  private native void SetGlobalIndexStart_13(long id0);
  public void SetGlobalIndexStart(long id0)
  {
    SetGlobalIndexStart_13(id0);
  }

  private native void SetGlobalIndexFromLocal_14(long id0);
  public void SetGlobalIndexFromLocal(long id0)
  {
    SetGlobalIndexFromLocal_14(id0);
  }

  private native void GetBounds_15(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_15(id0);
  }

  private native void GetPoint_16(double id0[]);
  public void GetPoint(double id0[])
  {
    GetPoint_16(id0);
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

  public vtkHyperTreeGridNonOrientedGeometryCursor() { super(); }

  public vtkHyperTreeGridNonOrientedGeometryCursor(long id) { super(id); }
  public native long   VTKInit();

}
