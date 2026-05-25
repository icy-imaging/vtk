// java wrapper for vtkPolyhedron object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyhedron extends vtkCell3D
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

  private native int RequiresInitialization_6();
  public int RequiresInitialization()
  {
    return RequiresInitialization_6();
  }

  private native void Initialize_7();
  public void Initialize()
  {
    Initialize_7();
  }

  private native int GetNumberOfEdges_8();
  public int GetNumberOfEdges()
  {
    return GetNumberOfEdges_8();
  }

  private native long GetEdge_9(int id0);
  public vtkCell GetEdge(int id0)
  {
    long temp = GetEdge_9(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfFaces_10();
  public int GetNumberOfFaces()
  {
    return GetNumberOfFaces_10();
  }

  private native long GetFace_11(int id0);
  public vtkCell GetFace(int id0)
  {
    long temp = GetFace_11(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native int TriangulateLocalIds_14(int id0,vtkIdList id1);
  public int TriangulateLocalIds(int id0,vtkIdList id1)
  {
    return TriangulateLocalIds_14(id0,id1);
  }

  private native int TriangulateFaces_15(vtkIdList id0);
  public int TriangulateFaces(vtkIdList id0)
  {
    return TriangulateFaces_15(id0);
  }

  private native int TriangulateFaces_16(vtkCellArray id0);
  public int TriangulateFaces(vtkCellArray id0)
  {
    return TriangulateFaces_16(id0);
  }

  private native int CellBoundary_17(int id0,double id1[],vtkIdList id2);
  public int CellBoundary(int id0,double id1[],vtkIdList id2)
  {
    return CellBoundary_17(id0,id1,id2);
  }

  private native int GetParametricCenter_18(double id0[]);
  public int GetParametricCenter(double id0[])
  {
    return GetParametricCenter_18(id0);
  }

  private native int IsPrimaryCell_19();
  public int IsPrimaryCell()
  {
    return IsPrimaryCell_19();
  }

  private native int RequiresExplicitFaceRepresentation_20();
  public int RequiresExplicitFaceRepresentation()
  {
    return RequiresExplicitFaceRepresentation_20();
  }

  private native int SetCellFaces_21(vtkCellArray id0);
  public int SetCellFaces(vtkCellArray id0)
  {
    return SetCellFaces_21(id0);
  }

  private native long GetCellFaces_22();
  public vtkCellArray GetCellFaces()
  {
    long temp = GetCellFaces_22();

    if (temp == 0) return null;
    return (vtkCellArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCellFaces_23(vtkCellArray id0);
  public void GetCellFaces(vtkCellArray id0)
  {
    GetCellFaces_23(id0);
  }

  private native int IsInside_24(double id0[],double id1);
  public int IsInside(double id0[],double id1)
  {
    return IsInside_24(id0,id1);
  }

  private native boolean IsConvex_25();
  public boolean IsConvex()
  {
    return IsConvex_25();
  }

  private native long GetPolyData_26();
  public vtkPolyData GetPolyData()
  {
    long temp = GetPolyData_26();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ShallowCopy_27(vtkCell id0);
  public void ShallowCopy(vtkCell id0)
  {
    ShallowCopy_27(id0);
  }

  private native void DeepCopy_28(vtkCell id0);
  public void DeepCopy(vtkCell id0)
  {
    DeepCopy_28(id0);
  }

  public vtkPolyhedron() { super(); }

  public vtkPolyhedron(long id) { super(id); }
  public native long   VTKInit();

}
