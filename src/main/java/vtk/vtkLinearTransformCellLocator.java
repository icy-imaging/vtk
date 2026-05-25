// java wrapper for vtkLinearTransformCellLocator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLinearTransformCellLocator extends vtkAbstractCellLocator
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

  private native void SetCellLocator_4(vtkAbstractCellLocator id0);
  public void SetCellLocator(vtkAbstractCellLocator id0)
  {
    SetCellLocator_4(id0);
  }

  private native long GetCellLocator_5();
  public vtkAbstractCellLocator GetCellLocator()
  {
    long temp = GetCellLocator_5();

    if (temp == 0) return null;
    return (vtkAbstractCellLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseAllPoints_6(boolean id0);
  public void SetUseAllPoints(boolean id0)
  {
    SetUseAllPoints_6(id0);
  }

  private native void UseAllPointsOn_7();
  public void UseAllPointsOn()
  {
    UseAllPointsOn_7();
  }

  private native void UseAllPointsOff_8();
  public void UseAllPointsOff()
  {
    UseAllPointsOff_8();
  }

  private native boolean GetUseAllPoints_9();
  public boolean GetUseAllPoints()
  {
    return GetUseAllPoints_9();
  }

  private native boolean GetIsLinearTransformation_10();
  public boolean GetIsLinearTransformation()
  {
    return GetIsLinearTransformation_10();
  }

  private native int IntersectWithLine_11(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4,vtkGenericCell id5);
  public int IntersectWithLine(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4,vtkGenericCell id5)
  {
    return IntersectWithLine_11(id0,id1,id2,id3,id4,id5);
  }

  private native void FindCellsAlongLine_12(double id0[],double id1[],double id2,vtkIdList id3);
  public void FindCellsAlongLine(double id0[],double id1[],double id2,vtkIdList id3)
  {
    FindCellsAlongLine_12(id0,id1,id2,id3);
  }

  private native void FindCellsAlongPlane_13(double id0[],double id1[],double id2,vtkIdList id3);
  public void FindCellsAlongPlane(double id0[],double id1[],double id2,vtkIdList id3)
  {
    FindCellsAlongPlane_13(id0,id1,id2,id3);
  }

  private native boolean InsideCellBounds_14(double id0[],long id1);
  public boolean InsideCellBounds(double id0[],long id1)
  {
    return InsideCellBounds_14(id0,id1);
  }

  private native void GenerateRepresentation_15(int id0,vtkPolyData id1);
  public void GenerateRepresentation(int id0,vtkPolyData id1)
  {
    GenerateRepresentation_15(id0,id1);
  }

  private native void FreeSearchStructure_16();
  public void FreeSearchStructure()
  {
    FreeSearchStructure_16();
  }

  private native void BuildLocator_17();
  public void BuildLocator()
  {
    BuildLocator_17();
  }

  private native void ForceBuildLocator_18();
  public void ForceBuildLocator()
  {
    ForceBuildLocator_18();
  }

  private native void ShallowCopy_19(vtkAbstractCellLocator id0);
  public void ShallowCopy(vtkAbstractCellLocator id0)
  {
    ShallowCopy_19(id0);
  }

  private native int IntersectWithLine_20(double id0[],double id1[],vtkPoints id2,vtkIdList id3);
  public int IntersectWithLine(double id0[],double id1[],vtkPoints id2,vtkIdList id3)
  {
    return IntersectWithLine_20(id0,id1,id2,id3);
  }

  private native int IntersectWithLine_21(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4);
  public int IntersectWithLine(double id0[],double id1[],double id2,vtkPoints id3,vtkIdList id4)
  {
    return IntersectWithLine_21(id0,id1,id2,id3,id4);
  }

  private native long FindCell_22(double id0[]);
  public long FindCell(double id0[])
  {
    return FindCell_22(id0);
  }

  public vtkLinearTransformCellLocator() { super(); }

  public vtkLinearTransformCellLocator(long id) { super(id); }
  public native long   VTKInit();

}
