// java wrapper for vtkConvexPointSet object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkConvexPointSet extends vtkCell3D
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

  private native int HasFixedTopology_4();
  public int HasFixedTopology()
  {
    return HasFixedTopology_4();
  }

  private native boolean GetCentroid_5(double id0[]);
  public boolean GetCentroid(double id0[])
  {
    return GetCentroid_5(id0);
  }

  private native int GetCellType_6();
  public int GetCellType()
  {
    return GetCellType_6();
  }

  private native int RequiresInitialization_7();
  public int RequiresInitialization()
  {
    return RequiresInitialization_7();
  }

  private native void Initialize_8();
  public void Initialize()
  {
    Initialize_8();
  }

  private native int GetNumberOfEdges_9();
  public int GetNumberOfEdges()
  {
    return GetNumberOfEdges_9();
  }

  private native long GetEdge_10(int id0);
  public vtkCell GetEdge(int id0)
  {
    long temp = GetEdge_10(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfFaces_11();
  public int GetNumberOfFaces()
  {
    return GetNumberOfFaces_11();
  }

  private native long GetFace_12(int id0);
  public vtkCell GetFace(int id0)
  {
    long temp = GetFace_12(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Contour_13(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10);
  public void Contour(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkCellArray id4,vtkCellArray id5,vtkPointData id6,vtkPointData id7,vtkCellData id8,long id9,vtkCellData id10)
  {
    Contour_13(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10);
  }

  private native void Clip_14(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9);
  public void Clip(double id0,vtkDataArray id1,vtkIncrementalPointLocator id2,vtkCellArray id3,vtkPointData id4,vtkPointData id5,vtkCellData id6,long id7,vtkCellData id8,int id9)
  {
    Clip_14(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native int TriangulateLocalIds_15(int id0,vtkIdList id1);
  public int TriangulateLocalIds(int id0,vtkIdList id1)
  {
    return TriangulateLocalIds_15(id0,id1);
  }

  private native int CellBoundary_16(int id0,double id1[],vtkIdList id2);
  public int CellBoundary(int id0,double id1[],vtkIdList id2)
  {
    return CellBoundary_16(id0,id1,id2);
  }

  private native int GetParametricCenter_17(double id0[]);
  public int GetParametricCenter(double id0[])
  {
    return GetParametricCenter_17(id0);
  }

  private native int IsPrimaryCell_18();
  public int IsPrimaryCell()
  {
    return IsPrimaryCell_18();
  }

  public vtkConvexPointSet() { super(); }

  public vtkConvexPointSet(long id) { super(id); }
  public native long   VTKInit();

}
