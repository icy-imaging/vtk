// java wrapper for vtkGenericCell object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericCell extends vtkCell
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

  private native void SetPoints_4(vtkPoints id0);
  public void SetPoints(vtkPoints id0)
  {
    SetPoints_4(id0);
  }

  private native void SetPointIds_5(vtkIdList id0);
  public void SetPointIds(vtkIdList id0)
  {
    SetPointIds_5(id0);
  }

  private native void ShallowCopy_6(vtkCell id0);
  public void ShallowCopy(vtkCell id0)
  {
    ShallowCopy_6(id0);
  }

  private native void DeepCopy_7(vtkCell id0);
  public void DeepCopy(vtkCell id0)
  {
    DeepCopy_7(id0);
  }

  private native int GetCellType_8();
  public int GetCellType()
  {
    return GetCellType_8();
  }

  private native int GetCellDimension_9();
  public int GetCellDimension()
  {
    return GetCellDimension_9();
  }

  private native int IsLinear_10();
  public int IsLinear()
  {
    return IsLinear_10();
  }

  private native int RequiresInitialization_11();
  public int RequiresInitialization()
  {
    return RequiresInitialization_11();
  }

  private native void Initialize_12();
  public void Initialize()
  {
    Initialize_12();
  }

  private native int RequiresExplicitFaceRepresentation_13();
  public int RequiresExplicitFaceRepresentation()
  {
    return RequiresExplicitFaceRepresentation_13();
  }

  private native int SetCellFaces_14(vtkCellArray id0);
  public int SetCellFaces(vtkCellArray id0)
  {
    return SetCellFaces_14(id0);
  }

  private native long GetCellFaces_15();
  public vtkCellArray GetCellFaces()
  {
    long temp = GetCellFaces_15();

    if (temp == 0) return null;
    return (vtkCellArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCellFaces_16(vtkCellArray id0);
  public void GetCellFaces(vtkCellArray id0)
  {
    GetCellFaces_16(id0);
  }

  private native int GetNumberOfEdges_17();
  public int GetNumberOfEdges()
  {
    return GetNumberOfEdges_17();
  }

  private native int GetNumberOfFaces_18();
  public int GetNumberOfFaces()
  {
    return GetNumberOfFaces_18();
  }

  private native long GetEdge_19(int id0);
  public vtkCell GetEdge(int id0)
  {
    long temp = GetEdge_19(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFace_20(int id0);
  public vtkCell GetFace(int id0)
  {
    long temp = GetFace_20(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int CellBoundary_21(int id0,double id1[],vtkIdList id2);
  public int CellBoundary(int id0,double id1[],vtkIdList id2)
  {
    return CellBoundary_21(id0,id1,id2);
  }

  private native void Contour_22(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10);
  public void Contour(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10)
  {
    Contour_22(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10);
  }

  private native void Clip_23(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9);
  public void Clip(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9)
  {
    Clip_23(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native int Triangulate_24(int id0,vtkIdList id1,vtkPoints id2);
  public int Triangulate(int id0,vtkIdList id1,vtkPoints id2)
  {
    return Triangulate_24(id0,id1,id2);
  }

  private native int TriangulateLocalIds_25(int id0,vtkIdList id1);
  public int TriangulateLocalIds(int id0,vtkIdList id1)
  {
    return TriangulateLocalIds_25(id0,id1);
  }

  private native int TriangulateIds_26(int id0,vtkIdList id1);
  public int TriangulateIds(int id0,vtkIdList id1)
  {
    return TriangulateIds_26(id0,id1);
  }

  private native int GetParametricCenter_27(double id0[]);
  public int GetParametricCenter(double id0[])
  {
    return GetParametricCenter_27(id0);
  }

  private native int IsPrimaryCell_28();
  public int IsPrimaryCell()
  {
    return IsPrimaryCell_28();
  }

  private native void SetCellType_29(int id0);
  public void SetCellType(int id0)
  {
    SetCellType_29(id0);
  }

  private native void SetCellTypeToEmptyCell_30();
  public void SetCellTypeToEmptyCell()
  {
    SetCellTypeToEmptyCell_30();
  }

  private native void SetCellTypeToVertex_31();
  public void SetCellTypeToVertex()
  {
    SetCellTypeToVertex_31();
  }

  private native void SetCellTypeToPolyVertex_32();
  public void SetCellTypeToPolyVertex()
  {
    SetCellTypeToPolyVertex_32();
  }

  private native void SetCellTypeToLine_33();
  public void SetCellTypeToLine()
  {
    SetCellTypeToLine_33();
  }

  private native void SetCellTypeToPolyLine_34();
  public void SetCellTypeToPolyLine()
  {
    SetCellTypeToPolyLine_34();
  }

  private native void SetCellTypeToTriangle_35();
  public void SetCellTypeToTriangle()
  {
    SetCellTypeToTriangle_35();
  }

  private native void SetCellTypeToTriangleStrip_36();
  public void SetCellTypeToTriangleStrip()
  {
    SetCellTypeToTriangleStrip_36();
  }

  private native void SetCellTypeToPolygon_37();
  public void SetCellTypeToPolygon()
  {
    SetCellTypeToPolygon_37();
  }

  private native void SetCellTypeToPixel_38();
  public void SetCellTypeToPixel()
  {
    SetCellTypeToPixel_38();
  }

  private native void SetCellTypeToQuad_39();
  public void SetCellTypeToQuad()
  {
    SetCellTypeToQuad_39();
  }

  private native void SetCellTypeToTetra_40();
  public void SetCellTypeToTetra()
  {
    SetCellTypeToTetra_40();
  }

  private native void SetCellTypeToVoxel_41();
  public void SetCellTypeToVoxel()
  {
    SetCellTypeToVoxel_41();
  }

  private native void SetCellTypeToHexahedron_42();
  public void SetCellTypeToHexahedron()
  {
    SetCellTypeToHexahedron_42();
  }

  private native void SetCellTypeToWedge_43();
  public void SetCellTypeToWedge()
  {
    SetCellTypeToWedge_43();
  }

  private native void SetCellTypeToPyramid_44();
  public void SetCellTypeToPyramid()
  {
    SetCellTypeToPyramid_44();
  }

  private native void SetCellTypeToPentagonalPrism_45();
  public void SetCellTypeToPentagonalPrism()
  {
    SetCellTypeToPentagonalPrism_45();
  }

  private native void SetCellTypeToHexagonalPrism_46();
  public void SetCellTypeToHexagonalPrism()
  {
    SetCellTypeToHexagonalPrism_46();
  }

  private native void SetCellTypeToPolyhedron_47();
  public void SetCellTypeToPolyhedron()
  {
    SetCellTypeToPolyhedron_47();
  }

  private native void SetCellTypeToConvexPointSet_48();
  public void SetCellTypeToConvexPointSet()
  {
    SetCellTypeToConvexPointSet_48();
  }

  private native void SetCellTypeToQuadraticEdge_49();
  public void SetCellTypeToQuadraticEdge()
  {
    SetCellTypeToQuadraticEdge_49();
  }

  private native void SetCellTypeToCubicLine_50();
  public void SetCellTypeToCubicLine()
  {
    SetCellTypeToCubicLine_50();
  }

  private native void SetCellTypeToQuadraticTriangle_51();
  public void SetCellTypeToQuadraticTriangle()
  {
    SetCellTypeToQuadraticTriangle_51();
  }

  private native void SetCellTypeToBiQuadraticTriangle_52();
  public void SetCellTypeToBiQuadraticTriangle()
  {
    SetCellTypeToBiQuadraticTriangle_52();
  }

  private native void SetCellTypeToQuadraticQuad_53();
  public void SetCellTypeToQuadraticQuad()
  {
    SetCellTypeToQuadraticQuad_53();
  }

  private native void SetCellTypeToQuadraticPolygon_54();
  public void SetCellTypeToQuadraticPolygon()
  {
    SetCellTypeToQuadraticPolygon_54();
  }

  private native void SetCellTypeToQuadraticTetra_55();
  public void SetCellTypeToQuadraticTetra()
  {
    SetCellTypeToQuadraticTetra_55();
  }

  private native void SetCellTypeToQuadraticHexahedron_56();
  public void SetCellTypeToQuadraticHexahedron()
  {
    SetCellTypeToQuadraticHexahedron_56();
  }

  private native void SetCellTypeToQuadraticWedge_57();
  public void SetCellTypeToQuadraticWedge()
  {
    SetCellTypeToQuadraticWedge_57();
  }

  private native void SetCellTypeToQuadraticPyramid_58();
  public void SetCellTypeToQuadraticPyramid()
  {
    SetCellTypeToQuadraticPyramid_58();
  }

  private native void SetCellTypeToQuadraticLinearQuad_59();
  public void SetCellTypeToQuadraticLinearQuad()
  {
    SetCellTypeToQuadraticLinearQuad_59();
  }

  private native void SetCellTypeToBiQuadraticQuad_60();
  public void SetCellTypeToBiQuadraticQuad()
  {
    SetCellTypeToBiQuadraticQuad_60();
  }

  private native void SetCellTypeToQuadraticLinearWedge_61();
  public void SetCellTypeToQuadraticLinearWedge()
  {
    SetCellTypeToQuadraticLinearWedge_61();
  }

  private native void SetCellTypeToBiQuadraticQuadraticWedge_62();
  public void SetCellTypeToBiQuadraticQuadraticWedge()
  {
    SetCellTypeToBiQuadraticQuadraticWedge_62();
  }

  private native void SetCellTypeToTriQuadraticHexahedron_63();
  public void SetCellTypeToTriQuadraticHexahedron()
  {
    SetCellTypeToTriQuadraticHexahedron_63();
  }

  private native void SetCellTypeToTriQuadraticPyramid_64();
  public void SetCellTypeToTriQuadraticPyramid()
  {
    SetCellTypeToTriQuadraticPyramid_64();
  }

  private native void SetCellTypeToBiQuadraticQuadraticHexahedron_65();
  public void SetCellTypeToBiQuadraticQuadraticHexahedron()
  {
    SetCellTypeToBiQuadraticQuadraticHexahedron_65();
  }

  private native void SetCellTypeToLagrangeTriangle_66();
  public void SetCellTypeToLagrangeTriangle()
  {
    SetCellTypeToLagrangeTriangle_66();
  }

  private native void SetCellTypeToLagrangeTetra_67();
  public void SetCellTypeToLagrangeTetra()
  {
    SetCellTypeToLagrangeTetra_67();
  }

  private native void SetCellTypeToLagrangeCurve_68();
  public void SetCellTypeToLagrangeCurve()
  {
    SetCellTypeToLagrangeCurve_68();
  }

  private native void SetCellTypeToLagrangeQuadrilateral_69();
  public void SetCellTypeToLagrangeQuadrilateral()
  {
    SetCellTypeToLagrangeQuadrilateral_69();
  }

  private native void SetCellTypeToLagrangeHexahedron_70();
  public void SetCellTypeToLagrangeHexahedron()
  {
    SetCellTypeToLagrangeHexahedron_70();
  }

  private native void SetCellTypeToLagrangeWedge_71();
  public void SetCellTypeToLagrangeWedge()
  {
    SetCellTypeToLagrangeWedge_71();
  }

  private native void SetCellTypeToBezierTriangle_72();
  public void SetCellTypeToBezierTriangle()
  {
    SetCellTypeToBezierTriangle_72();
  }

  private native void SetCellTypeToBezierTetra_73();
  public void SetCellTypeToBezierTetra()
  {
    SetCellTypeToBezierTetra_73();
  }

  private native void SetCellTypeToBezierCurve_74();
  public void SetCellTypeToBezierCurve()
  {
    SetCellTypeToBezierCurve_74();
  }

  private native void SetCellTypeToBezierQuadrilateral_75();
  public void SetCellTypeToBezierQuadrilateral()
  {
    SetCellTypeToBezierQuadrilateral_75();
  }

  private native void SetCellTypeToBezierHexahedron_76();
  public void SetCellTypeToBezierHexahedron()
  {
    SetCellTypeToBezierHexahedron_76();
  }

  private native void SetCellTypeToBezierWedge_77();
  public void SetCellTypeToBezierWedge()
  {
    SetCellTypeToBezierWedge_77();
  }

  private native long InstantiateCell_78(int id0);
  public vtkCell InstantiateCell(int id0)
  {
    long temp = InstantiateCell_78(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRepresentativeCell_79();
  public vtkCell GetRepresentativeCell()
  {
    long temp = GetRepresentativeCell_79();

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkGenericCell() { super(); }

  public vtkGenericCell(long id) { super(id); }
  public native long   VTKInit();

}
