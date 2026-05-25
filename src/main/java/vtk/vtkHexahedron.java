// java wrapper for vtkHexahedron object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHexahedron extends vtkCell3D
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

  private native boolean GetCentroid_4(double id0[]);
  public boolean GetCentroid(double id0[])
  {
    return GetCentroid_4(id0);
  }

  private native int GetCellType_5();
  public int GetCellType()
  {
    return GetCellType_5();
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

  private native int TriangulateLocalIds_12(int id0,vtkIdList id1);
  public int TriangulateLocalIds(int id0,vtkIdList id1)
  {
    return TriangulateLocalIds_12(id0,id1);
  }

  private native void InterpolationFunctions_13(double id0[],double id1[]);
  public void InterpolationFunctions(double id0[],double id1[])
  {
    InterpolationFunctions_13(id0,id1);
  }

  private native void InterpolationDerivs_14(double id0[],double id1[]);
  public void InterpolationDerivs(double id0[],double id1[])
  {
    InterpolationDerivs_14(id0,id1);
  }

  private native void InterpolateFunctions_15(double id0[],double id1[]);
  public void InterpolateFunctions(double id0[],double id1[])
  {
    InterpolateFunctions_15(id0,id1);
  }

  private native void InterpolateDerivs_16(double id0[],double id1[]);
  public void InterpolateDerivs(double id0[],double id1[])
  {
    InterpolateDerivs_16(id0,id1);
  }

  private native long[]  GetEdgeArray_17(long id0);
  public long[]  GetEdgeArray(long id0)
  {
    return GetEdgeArray_17(id0);
  }

  private native long[]  GetFaceArray_18(long id0);
  public long[]  GetFaceArray(long id0)
  {
    return GetFaceArray_18(id0);
  }

  private native long[]  GetEdgeToAdjacentFacesArray_19(long id0);
  public long[]  GetEdgeToAdjacentFacesArray(long id0)
  {
    return GetEdgeToAdjacentFacesArray_19(id0);
  }

  private native long[]  GetFaceToAdjacentFacesArray_20(long id0);
  public long[]  GetFaceToAdjacentFacesArray(long id0)
  {
    return GetFaceToAdjacentFacesArray_20(id0);
  }

  private native long[]  GetPointToIncidentEdgesArray_21(long id0);
  public long[]  GetPointToIncidentEdgesArray(long id0)
  {
    return GetPointToIncidentEdgesArray_21(id0);
  }

  private native long[]  GetPointToIncidentFacesArray_22(long id0);
  public long[]  GetPointToIncidentFacesArray(long id0)
  {
    return GetPointToIncidentFacesArray_22(id0);
  }

  private native long[]  GetPointToOneRingPointsArray_23(long id0);
  public long[]  GetPointToOneRingPointsArray(long id0)
  {
    return GetPointToOneRingPointsArray_23(id0);
  }

  public vtkHexahedron() { super(); }

  public vtkHexahedron(long id) { super(id); }
  public native long   VTKInit();

}
