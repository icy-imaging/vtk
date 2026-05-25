// java wrapper for vtkAbstractCellLocator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractCellLocator extends vtkLocator
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

  private native void SetNumberOfCellsPerNode_4(int id0);
  public void SetNumberOfCellsPerNode(int id0)
  {
    SetNumberOfCellsPerNode_4(id0);
  }

  private native int GetNumberOfCellsPerNodeMinValue_5();
  public int GetNumberOfCellsPerNodeMinValue()
  {
    return GetNumberOfCellsPerNodeMinValue_5();
  }

  private native int GetNumberOfCellsPerNodeMaxValue_6();
  public int GetNumberOfCellsPerNodeMaxValue()
  {
    return GetNumberOfCellsPerNodeMaxValue_6();
  }

  private native int GetNumberOfCellsPerNode_7();
  public int GetNumberOfCellsPerNode()
  {
    return GetNumberOfCellsPerNode_7();
  }

  private native void SetCacheCellBounds_8(int id0);
  public void SetCacheCellBounds(int id0)
  {
    SetCacheCellBounds_8(id0);
  }

  private native int GetCacheCellBounds_9();
  public int GetCacheCellBounds()
  {
    return GetCacheCellBounds_9();
  }

  private native void CacheCellBoundsOn_10();
  public void CacheCellBoundsOn()
  {
    CacheCellBoundsOn_10();
  }

  private native void CacheCellBoundsOff_11();
  public void CacheCellBoundsOff()
  {
    CacheCellBoundsOff_11();
  }

  private native void ComputeCellBounds_12();
  public void ComputeCellBounds()
  {
    ComputeCellBounds_12();
  }

  private native void SetRetainCellLists_13(int id0);
  public void SetRetainCellLists(int id0)
  {
    SetRetainCellLists_13(id0);
  }

  private native int GetRetainCellLists_14();
  public int GetRetainCellLists()
  {
    return GetRetainCellLists_14();
  }

  private native void RetainCellListsOn_15();
  public void RetainCellListsOn()
  {
    RetainCellListsOn_15();
  }

  private native void RetainCellListsOff_16();
  public void RetainCellListsOff()
  {
    RetainCellListsOff_16();
  }

  private native int IntersectWithLine_17(double id0[],double id1[],vtkPoints id2,vtkIdList id3);
  public int IntersectWithLine(double id0[],double id1[],vtkPoints id2,vtkIdList id3)
  {
    return IntersectWithLine_17(id0,id1,id2,id3);
  }

  private native int IntersectWithLine_18(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4);
  public int IntersectWithLine(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4)
  {
    return IntersectWithLine_18(id0,id1,id2,id3,id4);
  }

  private native int IntersectWithLine_19(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4,vtkGenericCell id5);
  public int IntersectWithLine(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4,vtkGenericCell id5)
  {
    return IntersectWithLine_19(id0,id1,id2,id3,id4,id5);
  }

  private native void FindCellsAlongLine_20(double id0[],double id1[],double id2,vtkIdList id3);
  public void FindCellsAlongLine(double id0[],double id1[],double id2,vtkIdList id3)
  {
    FindCellsAlongLine_20(id0,id1,id2,id3);
  }

  private native void FindCellsAlongPlane_21(double id0[],double id1[],double id2,vtkIdList id3);
  public void FindCellsAlongPlane(double id0[],double id1[],double id2,vtkIdList id3)
  {
    FindCellsAlongPlane_21(id0,id1,id2,id3);
  }

  private native long FindCell_22(double id0[]);
  public long FindCell(double id0[])
  {
    return FindCell_22(id0);
  }

  private native boolean InsideCellBounds_23(double id0[],long id1);
  public boolean InsideCellBounds(double id0[],long id1)
  {
    return InsideCellBounds_23(id0,id1);
  }

  private native void ShallowCopy_24(vtkAbstractCellLocator id0);
  public void ShallowCopy(vtkAbstractCellLocator id0)
  {
    ShallowCopy_24(id0);
  }

  public vtkAbstractCellLocator() { super(); }

  public vtkAbstractCellLocator(long id) { super(id); }

}
