// java wrapper for vtkModifiedBSPTree object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkModifiedBSPTree extends vtkAbstractCellLocator
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

  private native int IntersectWithLine_4(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4,vtkGenericCell id5);
  public int IntersectWithLine(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4,vtkGenericCell id5)
  {
    return IntersectWithLine_4(id0,id1,id2,id3,id4,id5);
  }

  private native void FindCellsAlongLine_5(double id0[],double id1[],double id2,vtkIdList id3);
  public void FindCellsAlongLine(double id0[],double id1[],double id2,vtkIdList id3)
  {
    FindCellsAlongLine_5(id0,id1,id2,id3);
  }

  private native long GetLeafNodeCellInformation_6();
  public vtkIdListCollection GetLeafNodeCellInformation()
  {
    long temp = GetLeafNodeCellInformation_6();

    if (temp == 0) return null;
    return (vtkIdListCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GenerateRepresentationLeafs_7(vtkPolyData id0);
  public void GenerateRepresentationLeafs(vtkPolyData id0)
  {
    GenerateRepresentationLeafs_7(id0);
  }

  private native void GenerateRepresentation_8(int id0,vtkPolyData id1);
  public void GenerateRepresentation(int id0,vtkPolyData id1)
  {
    GenerateRepresentation_8(id0,id1);
  }

  private native void FreeSearchStructure_9();
  public void FreeSearchStructure()
  {
    FreeSearchStructure_9();
  }

  private native void BuildLocator_10();
  public void BuildLocator()
  {
    BuildLocator_10();
  }

  private native void ForceBuildLocator_11();
  public void ForceBuildLocator()
  {
    ForceBuildLocator_11();
  }

  private native void ShallowCopy_12(vtkAbstractCellLocator id0);
  public void ShallowCopy(vtkAbstractCellLocator id0)
  {
    ShallowCopy_12(id0);
  }

  private native int IntersectWithLine_13(double id0[],double id1[],vtkPoints id2,vtkIdList id3);
  public int IntersectWithLine(double id0[],double id1[],vtkPoints id2,vtkIdList id3)
  {
    return IntersectWithLine_13(id0,id1,id2,id3);
  }

  private native int IntersectWithLine_14(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4);
  public int IntersectWithLine(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4)
  {
    return IntersectWithLine_14(id0,id1,id2,id3,id4);
  }

  private native long FindCell_15(double id0[]);
  public long FindCell(double id0[])
  {
    return FindCell_15(id0);
  }

  public vtkModifiedBSPTree() { super(); }

  public vtkModifiedBSPTree(long id) { super(id); }
  public native long   VTKInit();

}
