// java wrapper for vtkHull object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHull extends vtkPointSetAlgorithm
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

  private native void RemoveAllPlanes_4();
  public void RemoveAllPlanes()
  {
    RemoveAllPlanes_4();
  }

  private native int AddPlane_5(double id0,double id1,double id2);
  public int AddPlane(double id0,double id1,double id2)
  {
    return AddPlane_5(id0,id1,id2);
  }

  private native int AddPlane_6(double id0[]);
  public int AddPlane(double id0[])
  {
    return AddPlane_6(id0);
  }

  private native void SetPlane_7(int id0,double id1,double id2,double id3);
  public void SetPlane(int id0,double id1,double id2,double id3)
  {
    SetPlane_7(id0,id1,id2,id3);
  }

  private native void SetPlane_8(int id0,double id1[]);
  public void SetPlane(int id0,double id1[])
  {
    SetPlane_8(id0,id1);
  }

  private native int AddPlane_9(double id0,double id1,double id2,double id3);
  public int AddPlane(double id0,double id1,double id2,double id3)
  {
    return AddPlane_9(id0,id1,id2,id3);
  }

  private native int AddPlane_10(double id0[],double id1);
  public int AddPlane(double id0[],double id1)
  {
    return AddPlane_10(id0,id1);
  }

  private native void SetPlane_11(int id0,double id1,double id2,double id3,double id4);
  public void SetPlane(int id0,double id1,double id2,double id3,double id4)
  {
    SetPlane_11(id0,id1,id2,id3,id4);
  }

  private native void SetPlane_12(int id0,double id1[],double id2);
  public void SetPlane(int id0,double id1[],double id2)
  {
    SetPlane_12(id0,id1,id2);
  }

  private native void SetPlanes_13(vtkPlanes id0);
  public void SetPlanes(vtkPlanes id0)
  {
    SetPlanes_13(id0);
  }

  private native int GetNumberOfPlanes_14();
  public int GetNumberOfPlanes()
  {
    return GetNumberOfPlanes_14();
  }

  private native void AddCubeVertexPlanes_15();
  public void AddCubeVertexPlanes()
  {
    AddCubeVertexPlanes_15();
  }

  private native void AddCubeEdgePlanes_16();
  public void AddCubeEdgePlanes()
  {
    AddCubeEdgePlanes_16();
  }

  private native void AddCubeFacePlanes_17();
  public void AddCubeFacePlanes()
  {
    AddCubeFacePlanes_17();
  }

  private native void AddRecursiveSpherePlanes_18(int id0);
  public void AddRecursiveSpherePlanes(int id0)
  {
    AddRecursiveSpherePlanes_18(id0);
  }

  private native void GenerateHull_19(vtkPolyData id0,double id1,double id2,double id3,double id4,double id5,double id6);
  public void GenerateHull(vtkPolyData id0,double id1,double id2,double id3,double id4,double id5,double id6)
  {
    GenerateHull_19(id0,id1,id2,id3,id4,id5,id6);
  }

  public vtkHull() { super(); }

  public vtkHull(long id) { super(id); }
  public native long   VTKInit();

}
