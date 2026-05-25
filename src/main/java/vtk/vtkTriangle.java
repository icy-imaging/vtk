// java wrapper for vtkTriangle object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTriangle extends vtkCell
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

  private native long GetEdge_4(int id0);
  public vtkCell GetEdge(int id0)
  {
    long temp = GetEdge_4(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetCellType_5();
  public int GetCellType()
  {
    return GetCellType_5();
  }

  private native int GetCellDimension_6();
  public int GetCellDimension()
  {
    return GetCellDimension_6();
  }

  private native int GetNumberOfEdges_7();
  public int GetNumberOfEdges()
  {
    return GetNumberOfEdges_7();
  }

  private native int GetNumberOfFaces_8();
  public int GetNumberOfFaces()
  {
    return GetNumberOfFaces_8();
  }

  private native long GetFace_9(int id0);
  public vtkCell GetFace(int id0)
  {
    long temp = GetFace_9(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int CellBoundary_10(int id0,double id1[],vtkIdList id2);
  public int CellBoundary(int id0,double id1[],vtkIdList id2)
  {
    return CellBoundary_10(id0,id1,id2);
  }

  private native void Contour_11(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10);
  public void Contour(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10)
  {
    Contour_11(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10);
  }

  private native int TriangulateLocalIds_12(int id0,vtkIdList id1);
  public int TriangulateLocalIds(int id0,vtkIdList id1)
  {
    return TriangulateLocalIds_12(id0,id1);
  }

  private native double ComputeArea_13();
  public double ComputeArea()
  {
    return ComputeArea_13();
  }

  private native void Clip_14(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9);
  public void Clip(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9)
  {
    Clip_14(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native void InterpolationFunctions_15(double id0[],double id1[]);
  public void InterpolationFunctions(double id0[],double id1[])
  {
    InterpolationFunctions_15(id0,id1);
  }

  private native void InterpolationDerivs_16(double id0[],double id1[]);
  public void InterpolationDerivs(double id0[],double id1[])
  {
    InterpolationDerivs_16(id0,id1);
  }

  private native void InterpolateFunctions_17(double id0[],double id1[]);
  public void InterpolateFunctions(double id0[],double id1[])
  {
    InterpolateFunctions_17(id0,id1);
  }

  private native void InterpolateDerivs_18(double id0[],double id1[]);
  public void InterpolateDerivs(double id0[],double id1[])
  {
    InterpolateDerivs_18(id0,id1);
  }

  private native int GetParametricCenter_19(double id0[]);
  public int GetParametricCenter(double id0[])
  {
    return GetParametricCenter_19(id0);
  }

  private native double GetParametricDistance_20(double id0[]);
  public double GetParametricDistance(double id0[])
  {
    return GetParametricDistance_20(id0);
  }

  private native void TriangleCenter_21(double id0[],double id1[],double id2[],double id3[]);
  public void TriangleCenter(double id0[],double id1[],double id2[],double id3[])
  {
    TriangleCenter_21(id0,id1,id2,id3);
  }

  private native double TriangleArea_22(double id0[],double id1[],double id2[]);
  public double TriangleArea(double id0[],double id1[],double id2[])
  {
    return TriangleArea_22(id0,id1,id2);
  }

  private native double Circumcircle_23(double id0[],double id1[],double id2[],double id3[]);
  public double Circumcircle(double id0[],double id1[],double id2[],double id3[])
  {
    return Circumcircle_23(id0,id1,id2,id3);
  }

  private native int BarycentricCoords_24(double id0[],double id1[],double id2[],double id3[],double id4[]);
  public int BarycentricCoords(double id0[],double id1[],double id2[],double id3[],double id4[])
  {
    return BarycentricCoords_24(id0,id1,id2,id3,id4);
  }

  private native int ProjectTo2D_25(double id0[],double id1[],double id2[],double id3[],double id4[],double id5[]);
  public int ProjectTo2D(double id0[],double id1[],double id2[],double id3[],double id4[],double id5[])
  {
    return ProjectTo2D_25(id0,id1,id2,id3,id4,id5);
  }

  private native void ComputeNormal_26(double id0[],double id1[],double id2[],double id3[]);
  public void ComputeNormal(double id0[],double id1[],double id2[],double id3[])
  {
    ComputeNormal_26(id0,id1,id2,id3);
  }

  private native void ComputeNormalDirection_27(double id0[],double id1[],double id2[],double id3[]);
  public void ComputeNormalDirection(double id0[],double id1[],double id2[],double id3[])
  {
    ComputeNormalDirection_27(id0,id1,id2,id3);
  }

  private native int TrianglesIntersect_28(double id0[],double id1[],double id2[],double id3[],double id4[],double id5[]);
  public int TrianglesIntersect(double id0[],double id1[],double id2[],double id3[],double id4[],double id5[])
  {
    return TrianglesIntersect_28(id0,id1,id2,id3,id4,id5);
  }

  private native int PointInTriangle_29(double id0[],double id1[],double id2[],double id3[],double id4);
  public int PointInTriangle(double id0[],double id1[],double id2[],double id3[],double id4)
  {
    return PointInTriangle_29(id0,id1,id2,id3,id4);
  }

  private native void ComputeQuadric_30(double id0[],double id1[],double id2[],vtkQuadric id3);
  public void ComputeQuadric(double id0[],double id1[],double id2[],vtkQuadric id3)
  {
    ComputeQuadric_30(id0,id1,id2,id3);
  }

  public vtkTriangle() { super(); }

  public vtkTriangle(long id) { super(id); }
  public native long   VTKInit();

}
