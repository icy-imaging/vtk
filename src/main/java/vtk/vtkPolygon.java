// java wrapper for vtkPolygon object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolygon extends vtkCell
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

  private native void Clip_12(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9);
  public void Clip(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9)
  {
    Clip_12(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native int TriangulateLocalIds_13(int id0,vtkIdList id1);
  public int TriangulateLocalIds(int id0,vtkIdList id1)
  {
    return TriangulateLocalIds_13(id0,id1);
  }

  private native int IsPrimaryCell_14();
  public int IsPrimaryCell()
  {
    return IsPrimaryCell_14();
  }

  private native double ComputeArea_15();
  public double ComputeArea()
  {
    return ComputeArea_15();
  }

  private native void ComputeNormal_16(vtkPoints id0,double id1[]);
  public void ComputeNormal(vtkPoints id0,double id1[])
  {
    ComputeNormal_16(id0,id1);
  }

  private native void ComputeNormal_17(vtkIdTypeArray id0,vtkPoints id1,double id2[]);
  public void ComputeNormal(vtkIdTypeArray id0,vtkPoints id1,double id2[])
  {
    ComputeNormal_17(id0,id1,id2);
  }

  private native boolean IsConvex_18();
  public boolean IsConvex()
  {
    return IsConvex_18();
  }

  private native boolean IsConvex_19(vtkIdTypeArray id0,vtkPoints id1);
  public boolean IsConvex(vtkIdTypeArray id0,vtkPoints id1)
  {
    return IsConvex_19(id0,id1);
  }

  private native boolean IsConvex_20(vtkPoints id0);
  public boolean IsConvex(vtkPoints id0)
  {
    return IsConvex_20(id0);
  }

  private native boolean ComputeCentroid_21(vtkIdTypeArray id0,vtkPoints id1,double id2[]);
  public boolean ComputeCentroid(vtkIdTypeArray id0,vtkPoints id1,double id2[])
  {
    return ComputeCentroid_21(id0,id1,id2);
  }

  private native int Triangulate_22(int id0,vtkIdList id1,vtkPoints id2);
  public int Triangulate(int id0,vtkIdList id1,vtkPoints id2)
  {
    return Triangulate_22(id0,id1,id2);
  }

  private native int Triangulate_23(vtkIdList id0);
  public int Triangulate(vtkIdList id0)
  {
    return Triangulate_23(id0);
  }

  private native int NonDegenerateTriangulate_24(vtkIdList id0);
  public int NonDegenerateTriangulate(vtkIdList id0)
  {
    return NonDegenerateTriangulate_24(id0);
  }

  private native int BoundedTriangulate_25(vtkIdList id0,double id1);
  public int BoundedTriangulate(vtkIdList id0,double id1)
  {
    return BoundedTriangulate_25(id0,id1);
  }

  private native int IntersectConvex2DCells_26(vtkCell id0,vtkCell id1,double id2,double id3[],double id4[]);
  public int IntersectConvex2DCells(vtkCell id0,vtkCell id1,double id2,double id3[],double id4[])
  {
    return IntersectConvex2DCells_26(id0,id1,id2,id3,id4);
  }

  private native boolean GetUseMVCInterpolation_27();
  public boolean GetUseMVCInterpolation()
  {
    return GetUseMVCInterpolation_27();
  }

  private native void SetUseMVCInterpolation_28(boolean id0);
  public void SetUseMVCInterpolation(boolean id0)
  {
    SetUseMVCInterpolation_28(id0);
  }

  private native void SetTolerance_29(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_29(id0);
  }

  private native double GetToleranceMinValue_30();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_30();
  }

  private native double GetToleranceMaxValue_31();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_31();
  }

  private native double GetTolerance_32();
  public double GetTolerance()
  {
    return GetTolerance_32();
  }

  private native int EarCutTriangulation_33(int id0);
  public int EarCutTriangulation(int id0)
  {
    return EarCutTriangulation_33(id0);
  }

  private native int EarCutTriangulation_34(vtkIdList id0,int id1);
  public int EarCutTriangulation(vtkIdList id0,int id1)
  {
    return EarCutTriangulation_34(id0,id1);
  }

  private native int UnbiasedEarCutTriangulation_35(int id0,int id1);
  public int UnbiasedEarCutTriangulation(int id0,int id1)
  {
    return UnbiasedEarCutTriangulation_35(id0,id1);
  }

  private native int UnbiasedEarCutTriangulation_36(int id0,vtkIdList id1,int id2);
  public int UnbiasedEarCutTriangulation(int id0,vtkIdList id1,int id2)
  {
    return UnbiasedEarCutTriangulation_36(id0,id1,id2);
  }

  public vtkPolygon() { super(); }

  public vtkPolygon(long id) { super(id); }
  public native long   VTKInit();

}
