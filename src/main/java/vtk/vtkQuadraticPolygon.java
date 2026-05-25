// java wrapper for vtkQuadraticPolygon object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkQuadraticPolygon extends vtkNonLinearCell
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

  private native int GetCellType_4();
  public int GetCellType()
  {
    return GetCellType_4();
  }

  private native int GetCellDimension_5();
  public int GetCellDimension()
  {
    return GetCellDimension_5();
  }

  private native int GetNumberOfEdges_6();
  public int GetNumberOfEdges()
  {
    return GetNumberOfEdges_6();
  }

  private native int GetNumberOfFaces_7();
  public int GetNumberOfFaces()
  {
    return GetNumberOfFaces_7();
  }

  private native long GetEdge_8(int id0);
  public vtkCell GetEdge(int id0)
  {
    long temp = GetEdge_8(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFace_9(int id0);
  public vtkCell GetFace(int id0)
  {
    long temp = GetFace_9(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int IsPrimaryCell_10();
  public int IsPrimaryCell()
  {
    return IsPrimaryCell_10();
  }

  private native int CellBoundary_11(int id0,double id1[],vtkIdList id2);
  public int CellBoundary(int id0,double id1[],vtkIdList id2)
  {
    return CellBoundary_11(id0,id1,id2);
  }

  private native void Contour_12(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10);
  public void Contour(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10)
  {
    Contour_12(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10);
  }

  private native void Clip_13(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9);
  public void Clip(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9)
  {
    Clip_13(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native void ComputeCentroid_14(vtkIdTypeArray id0,vtkPoints id1,double id2[]);
  public void ComputeCentroid(vtkIdTypeArray id0,vtkPoints id1,double id2[])
  {
    ComputeCentroid_14(id0,id1,id2);
  }

  private native int Triangulate_15(int id0,vtkIdList id1,vtkPoints id2);
  public int Triangulate(int id0,vtkIdList id1,vtkPoints id2)
  {
    return Triangulate_15(id0,id1,id2);
  }

  private native int Triangulate_16(vtkIdList id0);
  public int Triangulate(vtkIdList id0)
  {
    return Triangulate_16(id0);
  }

  private native int TriangulateLocalIds_17(int id0,vtkIdList id1);
  public int TriangulateLocalIds(int id0,vtkIdList id1)
  {
    return TriangulateLocalIds_17(id0,id1);
  }

  private native int NonDegenerateTriangulate_18(vtkIdList id0);
  public int NonDegenerateTriangulate(vtkIdList id0)
  {
    return NonDegenerateTriangulate_18(id0);
  }

  private native int IntersectConvex2DCells_19(vtkCell id0,vtkCell id1,double id2,double id3[],double id4[]);
  public int IntersectConvex2DCells(vtkCell id0,vtkCell id1,double id2,double id3[],double id4[])
  {
    return IntersectConvex2DCells_19(id0,id1,id2,id3,id4);
  }

  private native boolean GetUseMVCInterpolation_20();
  public boolean GetUseMVCInterpolation()
  {
    return GetUseMVCInterpolation_20();
  }

  private native void SetUseMVCInterpolation_21(boolean id0);
  public void SetUseMVCInterpolation(boolean id0)
  {
    SetUseMVCInterpolation_21(id0);
  }

  public vtkQuadraticPolygon() { super(); }

  public vtkQuadraticPolygon(long id) { super(id); }
  public native long   VTKInit();

}
