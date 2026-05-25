// java wrapper for vtkOBBTree object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOBBTree extends vtkAbstractCellLocator
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

  private native int IntersectWithLine_4(double id0[],double id1[],vtkPoints id2,vtkIdList id3);
  public int IntersectWithLine(double id0[],double id1[],vtkPoints id2,vtkIdList id3)
  {
    return IntersectWithLine_4(id0,id1,id2,id3);
  }

  private native void ComputeOBB_5(vtkPoints id0,double id1[],double id2[],double id3[],double id4[],double id5[]);
  public void ComputeOBB(vtkPoints id0,double id1[],double id2[],double id3[],double id4[],double id5[])
  {
    ComputeOBB_5(id0,id1,id2,id3,id4,id5);
  }

  private native void ComputeOBB_6(vtkDataSet id0,double id1[],double id2[],double id3[],double id4[],double id5[]);
  public void ComputeOBB(vtkDataSet id0,double id1[],double id2[],double id3[],double id4[],double id5[])
  {
    ComputeOBB_6(id0,id1,id2,id3,id4,id5);
  }

  private native int InsideOrOutside_7(double id0[]);
  public int InsideOrOutside(double id0[])
  {
    return InsideOrOutside_7(id0);
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

  private native int IntersectWithLine_12(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4);
  public int IntersectWithLine(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4)
  {
    return IntersectWithLine_12(id0,id1,id2,id3,id4);
  }

  private native int IntersectWithLine_13(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4,vtkGenericCell id5);
  public int IntersectWithLine(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4,vtkGenericCell id5)
  {
    return IntersectWithLine_13(id0,id1,id2,id3,id4,id5);
  }

  public vtkOBBTree() { super(); }

  public vtkOBBTree(long id) { super(id); }
  public native long   VTKInit();

}
