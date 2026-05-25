// java wrapper for vtkWedge object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWedge extends vtkCell3D
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

  private native boolean IsInsideOut_5();
  public boolean IsInsideOut()
  {
    return IsInsideOut_5();
  }

  private native int GetCellType_6();
  public int GetCellType()
  {
    return GetCellType_6();
  }

  private native int GetCellDimension_7();
  public int GetCellDimension()
  {
    return GetCellDimension_7();
  }

  private native int GetNumberOfEdges_8();
  public int GetNumberOfEdges()
  {
    return GetNumberOfEdges_8();
  }

  private native int GetNumberOfFaces_9();
  public int GetNumberOfFaces()
  {
    return GetNumberOfFaces_9();
  }

  private native long GetEdge_10(int id0);
  public vtkCell GetEdge(int id0)
  {
    long temp = GetEdge_10(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFace_11(int id0);
  public vtkCell GetFace(int id0)
  {
    long temp = GetFace_11(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int CellBoundary_12(int id0,double id1[],vtkIdList id2);
  public int CellBoundary(int id0,double id1[],vtkIdList id2)
  {
    return CellBoundary_12(id0,id1,id2);
  }

  private native void Contour_13(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10);
  public void Contour(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10)
  {
    Contour_13(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10);
  }

  private native int TriangulateLocalIds_14(int id0,vtkIdList id1);
  public int TriangulateLocalIds(int id0,vtkIdList id1)
  {
    return TriangulateLocalIds_14(id0,id1);
  }

  private native int GetParametricCenter_15(double id0[]);
  public int GetParametricCenter(double id0[])
  {
    return GetParametricCenter_15(id0);
  }

  private native void InterpolationFunctions_16(double id0[],double id1[]);
  public void InterpolationFunctions(double id0[],double id1[])
  {
    InterpolationFunctions_16(id0,id1);
  }

  private native void InterpolationDerivs_17(double id0[],double id1[]);
  public void InterpolationDerivs(double id0[],double id1[])
  {
    InterpolationDerivs_17(id0,id1);
  }

  private native void InterpolateFunctions_18(double id0[],double id1[]);
  public void InterpolateFunctions(double id0[],double id1[])
  {
    InterpolateFunctions_18(id0,id1);
  }

  private native void InterpolateDerivs_19(double id0[],double id1[]);
  public void InterpolateDerivs(double id0[],double id1[])
  {
    InterpolateDerivs_19(id0,id1);
  }

  private native long[]  GetEdgeArray_20(long id0);
  public long[]  GetEdgeArray(long id0)
  {
    return GetEdgeArray_20(id0);
  }

  private native long[]  GetFaceArray_21(long id0);
  public long[]  GetFaceArray(long id0)
  {
    return GetFaceArray_21(id0);
  }

  private native long[]  GetEdgeToAdjacentFacesArray_22(long id0);
  public long[]  GetEdgeToAdjacentFacesArray(long id0)
  {
    return GetEdgeToAdjacentFacesArray_22(id0);
  }

  private native long[]  GetFaceToAdjacentFacesArray_23(long id0);
  public long[]  GetFaceToAdjacentFacesArray(long id0)
  {
    return GetFaceToAdjacentFacesArray_23(id0);
  }

  private native long[]  GetPointToIncidentEdgesArray_24(long id0);
  public long[]  GetPointToIncidentEdgesArray(long id0)
  {
    return GetPointToIncidentEdgesArray_24(id0);
  }

  private native long[]  GetPointToIncidentFacesArray_25(long id0);
  public long[]  GetPointToIncidentFacesArray(long id0)
  {
    return GetPointToIncidentFacesArray_25(id0);
  }

  private native long[]  GetPointToOneRingPointsArray_26(long id0);
  public long[]  GetPointToOneRingPointsArray(long id0)
  {
    return GetPointToOneRingPointsArray_26(id0);
  }

  public vtkWedge() { super(); }

  public vtkWedge(long id) { super(id); }
  public native long   VTKInit();

}
