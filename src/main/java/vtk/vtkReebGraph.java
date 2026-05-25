// java wrapper for vtkReebGraph object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkReebGraph extends vtkMutableDirectedGraph
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

  private native int GetDataObjectType_4();
  public int GetDataObjectType()
  {
    return GetDataObjectType_4();
  }

  private native int Build_5(vtkPolyData id0,vtkDataArray id1);
  public int Build(vtkPolyData id0,vtkDataArray id1)
  {
    return Build_5(id0,id1);
  }

  private native int Build_6(vtkUnstructuredGrid id0,vtkDataArray id1);
  public int Build(vtkUnstructuredGrid id0,vtkDataArray id1)
  {
    return Build_6(id0,id1);
  }

  private native int Build_7(vtkPolyData id0,long id1);
  public int Build(vtkPolyData id0,long id1)
  {
    return Build_7(id0,id1);
  }

  private native int Build_8(vtkUnstructuredGrid id0,long id1);
  public int Build(vtkUnstructuredGrid id0,long id1)
  {
    return Build_8(id0,id1);
  }

  private native int Build_9(vtkPolyData id0,byte[] id1, int len1);
  public int Build(vtkPolyData id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return Build_9(id0,bytes1, bytes1.length);
  }

  private native int Build_10(vtkUnstructuredGrid id0,byte[] id1, int len1);
  public int Build(vtkUnstructuredGrid id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return Build_10(id0,bytes1, bytes1.length);
  }

  private native int StreamTriangle_11(long id0,double id1,long id2,double id3,long id4,double id5);
  public int StreamTriangle(long id0,double id1,long id2,double id3,long id4,double id5)
  {
    return StreamTriangle_11(id0,id1,id2,id3,id4,id5);
  }

  private native int StreamTetrahedron_12(long id0,double id1,long id2,double id3,long id4,double id5,long id6,double id7);
  public int StreamTetrahedron(long id0,double id1,long id2,double id3,long id4,double id5,long id6,double id7)
  {
    return StreamTetrahedron_12(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native void CloseStream_13();
  public void CloseStream()
  {
    CloseStream_13();
  }

  private native void DeepCopy_14(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_14(id0);
  }

  private native int Simplify_15(double id0,vtkReebGraphSimplificationMetric id1);
  public int Simplify(double id0,vtkReebGraphSimplificationMetric id1)
  {
    return Simplify_15(id0,id1);
  }

  private native void Set_16(vtkMutableDirectedGraph id0);
  public void Set(vtkMutableDirectedGraph id0)
  {
    Set_16(id0);
  }

  public vtkReebGraph() { super(); }

  public vtkReebGraph(long id) { super(id); }
  public native long   VTKInit();

}
