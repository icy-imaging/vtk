// java wrapper for vtkStaticCellLocator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStaticCellLocator extends vtkAbstractCellLocator
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

  private native void SetDivisions_4(int id0,int id1,int id2);
  public void SetDivisions(int id0,int id1,int id2)
  {
    SetDivisions_4(id0,id1,id2);
  }

  private native void SetDivisions_5(int id0[]);
  public void SetDivisions(int id0[])
  {
    SetDivisions_5(id0);
  }

  private native int[] GetDivisions_6();
  public int[] GetDivisions()
  {
    return GetDivisions_6();
  }

  private native void SetMaxNumberOfBuckets_7(long id0);
  public void SetMaxNumberOfBuckets(long id0)
  {
    SetMaxNumberOfBuckets_7(id0);
  }

  private native long GetMaxNumberOfBucketsMinValue_8();
  public long GetMaxNumberOfBucketsMinValue()
  {
    return GetMaxNumberOfBucketsMinValue_8();
  }

  private native long GetMaxNumberOfBucketsMaxValue_9();
  public long GetMaxNumberOfBucketsMaxValue()
  {
    return GetMaxNumberOfBucketsMaxValue_9();
  }

  private native long GetMaxNumberOfBuckets_10();
  public long GetMaxNumberOfBuckets()
  {
    return GetMaxNumberOfBuckets_10();
  }

  private native boolean GetLargeIds_11();
  public boolean GetLargeIds()
  {
    return GetLargeIds_11();
  }

  private native int IntersectWithLine_12(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4,vtkGenericCell id5);
  public int IntersectWithLine(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4,vtkGenericCell id5)
  {
    return IntersectWithLine_12(id0,id1,id2,id3,id4,id5);
  }

  private native void FindCellsAlongLine_13(double id0[],double id1[],double id2,vtkIdList id3);
  public void FindCellsAlongLine(double id0[],double id1[],double id2,vtkIdList id3)
  {
    FindCellsAlongLine_13(id0,id1,id2,id3);
  }

  private native void FindCellsAlongPlane_14(double id0[],double id1[],double id2,vtkIdList id3);
  public void FindCellsAlongPlane(double id0[],double id1[],double id2,vtkIdList id3)
  {
    FindCellsAlongPlane_14(id0,id1,id2,id3);
  }

  private native boolean InsideCellBounds_15(double id0[],long id1);
  public boolean InsideCellBounds(double id0[],long id1)
  {
    return InsideCellBounds_15(id0,id1);
  }

  private native void GenerateRepresentation_16(int id0,vtkPolyData id1);
  public void GenerateRepresentation(int id0,vtkPolyData id1)
  {
    GenerateRepresentation_16(id0,id1);
  }

  private native void FreeSearchStructure_17();
  public void FreeSearchStructure()
  {
    FreeSearchStructure_17();
  }

  private native void BuildLocator_18();
  public void BuildLocator()
  {
    BuildLocator_18();
  }

  private native void ForceBuildLocator_19();
  public void ForceBuildLocator()
  {
    ForceBuildLocator_19();
  }

  private native void ShallowCopy_20(vtkAbstractCellLocator id0);
  public void ShallowCopy(vtkAbstractCellLocator id0)
  {
    ShallowCopy_20(id0);
  }

  private native int IntersectWithLine_21(double id0[],double id1[],vtkPoints id2,vtkIdList id3);
  public int IntersectWithLine(double id0[],double id1[],vtkPoints id2,vtkIdList id3)
  {
    return IntersectWithLine_21(id0,id1,id2,id3);
  }

  private native int IntersectWithLine_22(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4);
  public int IntersectWithLine(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4)
  {
    return IntersectWithLine_22(id0,id1,id2,id3,id4);
  }

  private native long FindCell_23(double id0[]);
  public long FindCell(double id0[])
  {
    return FindCell_23(id0);
  }

  public vtkStaticCellLocator() { super(); }

  public vtkStaticCellLocator(long id) { super(id); }
  public native long   VTKInit();

}
