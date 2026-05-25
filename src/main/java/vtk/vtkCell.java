// java wrapper for vtkCell object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCell extends vtkObject
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

  private native void Initialize_4(int id0,vtkPoints id1);
  public void Initialize(int id0,vtkPoints id1)
  {
    Initialize_4(id0,id1);
  }

  private native void ShallowCopy_5(vtkCell id0);
  public void ShallowCopy(vtkCell id0)
  {
    ShallowCopy_5(id0);
  }

  private native void DeepCopy_6(vtkCell id0);
  public void DeepCopy(vtkCell id0)
  {
    DeepCopy_6(id0);
  }

  private native int GetCellType_7();
  public int GetCellType()
  {
    return GetCellType_7();
  }

  private native int GetCellDimension_8();
  public int GetCellDimension()
  {
    return GetCellDimension_8();
  }

  private native int IsLinear_9();
  public int IsLinear()
  {
    return IsLinear_9();
  }

  private native int RequiresInitialization_10();
  public int RequiresInitialization()
  {
    return RequiresInitialization_10();
  }

  private native void Initialize_11();
  public void Initialize()
  {
    Initialize_11();
  }

  private native int IsExplicitCell_12();
  public int IsExplicitCell()
  {
    return IsExplicitCell_12();
  }

  private native int RequiresExplicitFaceRepresentation_13();
  public int RequiresExplicitFaceRepresentation()
  {
    return RequiresExplicitFaceRepresentation_13();
  }

  private native long GetPoints_14();
  public vtkPoints GetPoints()
  {
    long temp = GetPoints_14();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfPoints_15();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_15();
  }

  private native int GetNumberOfEdges_16();
  public int GetNumberOfEdges()
  {
    return GetNumberOfEdges_16();
  }

  private native int GetNumberOfFaces_17();
  public int GetNumberOfFaces()
  {
    return GetNumberOfFaces_17();
  }

  private native long GetPointIds_18();
  public vtkIdList GetPointIds()
  {
    long temp = GetPointIds_18();

    if (temp == 0) return null;
    return (vtkIdList)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPointId_19(int id0);
  public long GetPointId(int id0)
  {
    return GetPointId_19(id0);
  }

  private native long GetEdge_20(int id0);
  public vtkCell GetEdge(int id0)
  {
    long temp = GetEdge_20(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFace_21(int id0);
  public vtkCell GetFace(int id0)
  {
    long temp = GetFace_21(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int CellBoundary_22(int id0,double id1[],vtkIdList id2);
  public int CellBoundary(int id0,double id1[],vtkIdList id2)
  {
    return CellBoundary_22(id0,id1,id2);
  }

  private native void Contour_23(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10);
  public void Contour(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10)
  {
    Contour_23(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10);
  }

  private native void Clip_24(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9);
  public void Clip(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9)
  {
    Clip_24(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native int Inflate_25(double id0);
  public int Inflate(double id0)
  {
    return Inflate_25(id0);
  }

  private native double ComputeBoundingSphere_26(double id0[]);
  public double ComputeBoundingSphere(double id0[])
  {
    return ComputeBoundingSphere_26(id0);
  }

  private native int IntersectWithCell_27(vtkCell id0,double id1);
  public int IntersectWithCell(vtkCell id0,double id1)
  {
    return IntersectWithCell_27(id0,id1);
  }

  private native int Triangulate_28(int id0,vtkIdList id1,vtkPoints id2);
  public int Triangulate(int id0,vtkIdList id1,vtkPoints id2)
  {
    return Triangulate_28(id0,id1,id2);
  }

  private native int TriangulateIds_29(int id0,vtkIdList id1);
  public int TriangulateIds(int id0,vtkIdList id1)
  {
    return TriangulateIds_29(id0,id1);
  }

  private native int TriangulateLocalIds_30(int id0,vtkIdList id1);
  public int TriangulateLocalIds(int id0,vtkIdList id1)
  {
    return TriangulateLocalIds_30(id0,id1);
  }

  private native void GetBounds_31(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_31(id0);
  }

  private native double[] GetBounds_32();
  public double[] GetBounds()
  {
    return GetBounds_32();
  }

  private native double GetLength2_33();
  public double GetLength2()
  {
    return GetLength2_33();
  }

  private native int GetParametricCenter_34(double id0[]);
  public int GetParametricCenter(double id0[])
  {
    return GetParametricCenter_34(id0);
  }

  private native double GetParametricDistance_35(double id0[]);
  public double GetParametricDistance(double id0[])
  {
    return GetParametricDistance_35(id0);
  }

  private native int IsPrimaryCell_36();
  public int IsPrimaryCell()
  {
    return IsPrimaryCell_36();
  }

  public vtkCell() { super(); }

  public vtkCell(long id) { super(id); }

}
