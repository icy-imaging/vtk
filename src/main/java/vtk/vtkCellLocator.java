// java wrapper for vtkCellLocator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellLocator extends vtkAbstractCellLocator
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

  private native void SetNumberOfCellsPerBucket_4(int id0);
  public void SetNumberOfCellsPerBucket(int id0)
  {
    SetNumberOfCellsPerBucket_4(id0);
  }

  private native int GetNumberOfCellsPerBucket_5();
  public int GetNumberOfCellsPerBucket()
  {
    return GetNumberOfCellsPerBucket_5();
  }

  private native int IntersectWithLine_6(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4,vtkGenericCell id5);
  public int IntersectWithLine(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4,vtkGenericCell id5)
  {
    return IntersectWithLine_6(id0,id1,id2,id3,id4,id5);
  }

  private native void FindCellsAlongLine_7(double id0[],double id1[],double id2,vtkIdList id3);
  public void FindCellsAlongLine(double id0[],double id1[],double id2,vtkIdList id3)
  {
    FindCellsAlongLine_7(id0,id1,id2,id3);
  }

  private native void FreeSearchStructure_8();
  public void FreeSearchStructure()
  {
    FreeSearchStructure_8();
  }

  private native void BuildLocator_9();
  public void BuildLocator()
  {
    BuildLocator_9();
  }

  private native void ForceBuildLocator_10();
  public void ForceBuildLocator()
  {
    ForceBuildLocator_10();
  }

  private native void GenerateRepresentation_11(int id0,vtkPolyData id1);
  public void GenerateRepresentation(int id0,vtkPolyData id1)
  {
    GenerateRepresentation_11(id0,id1);
  }

  private native long GetCells_12(int id0);
  public vtkIdList GetCells(int id0)
  {
    long temp = GetCells_12(id0);

    if (temp == 0) return null;
    return (vtkIdList)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfBuckets_13();
  public int GetNumberOfBuckets()
  {
    return GetNumberOfBuckets_13();
  }

  private native void ShallowCopy_14(vtkAbstractCellLocator id0);
  public void ShallowCopy(vtkAbstractCellLocator id0)
  {
    ShallowCopy_14(id0);
  }

  private native int IntersectWithLine_15(double id0[],double id1[],vtkPoints id2,vtkIdList id3);
  public int IntersectWithLine(double id0[],double id1[],vtkPoints id2,vtkIdList id3)
  {
    return IntersectWithLine_15(id0,id1,id2,id3);
  }

  private native int IntersectWithLine_16(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4);
  public int IntersectWithLine(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4)
  {
    return IntersectWithLine_16(id0,id1,id2,id3,id4);
  }

  private native long FindCell_17(double id0[]);
  public long FindCell(double id0[])
  {
    return FindCell_17(id0);
  }

  public vtkCellLocator() { super(); }

  public vtkCellLocator(long id) { super(id); }
  public native long   VTKInit();

}
