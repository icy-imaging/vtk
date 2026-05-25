// java wrapper for vtkDijkstraGraphGeodesicPath object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDijkstraGraphGeodesicPath extends vtkGraphGeodesicPath
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

  private native long GetIdList_4();
  public vtkIdList GetIdList()
  {
    long temp = GetIdList_4();

    if (temp == 0) return null;
    return (vtkIdList)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetStopWhenEndReached_5(int id0);
  public void SetStopWhenEndReached(int id0)
  {
    SetStopWhenEndReached_5(id0);
  }

  private native int GetStopWhenEndReached_6();
  public int GetStopWhenEndReached()
  {
    return GetStopWhenEndReached_6();
  }

  private native void StopWhenEndReachedOn_7();
  public void StopWhenEndReachedOn()
  {
    StopWhenEndReachedOn_7();
  }

  private native void StopWhenEndReachedOff_8();
  public void StopWhenEndReachedOff()
  {
    StopWhenEndReachedOff_8();
  }

  private native void SetUseScalarWeights_9(int id0);
  public void SetUseScalarWeights(int id0)
  {
    SetUseScalarWeights_9(id0);
  }

  private native int GetUseScalarWeights_10();
  public int GetUseScalarWeights()
  {
    return GetUseScalarWeights_10();
  }

  private native void UseScalarWeightsOn_11();
  public void UseScalarWeightsOn()
  {
    UseScalarWeightsOn_11();
  }

  private native void UseScalarWeightsOff_12();
  public void UseScalarWeightsOff()
  {
    UseScalarWeightsOff_12();
  }

  private native void SetRepelPathFromVertices_13(int id0);
  public void SetRepelPathFromVertices(int id0)
  {
    SetRepelPathFromVertices_13(id0);
  }

  private native int GetRepelPathFromVertices_14();
  public int GetRepelPathFromVertices()
  {
    return GetRepelPathFromVertices_14();
  }

  private native void RepelPathFromVerticesOn_15();
  public void RepelPathFromVerticesOn()
  {
    RepelPathFromVerticesOn_15();
  }

  private native void RepelPathFromVerticesOff_16();
  public void RepelPathFromVerticesOff()
  {
    RepelPathFromVerticesOff_16();
  }

  private native void SetRepelVertices_17(vtkPoints id0);
  public void SetRepelVertices(vtkPoints id0)
  {
    SetRepelVertices_17(id0);
  }

  private native long GetRepelVertices_18();
  public vtkPoints GetRepelVertices()
  {
    long temp = GetRepelVertices_18();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCumulativeWeights_19(vtkDoubleArray id0);
  public void GetCumulativeWeights(vtkDoubleArray id0)
  {
    GetCumulativeWeights_19(id0);
  }

  public vtkDijkstraGraphGeodesicPath() { super(); }

  public vtkDijkstraGraphGeodesicPath(long id) { super(id); }
  public native long   VTKInit();

}
