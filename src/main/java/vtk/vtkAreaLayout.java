// java wrapper for vtkAreaLayout object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAreaLayout extends vtkTreeAlgorithm
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

  private native void SetSizeArrayName_4(byte[] id0, int len0);
  public void SetSizeArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSizeArrayName_4(bytes0, bytes0.length);
  }

  private native byte[] GetAreaArrayName_5();
  public String GetAreaArrayName()
  {
    return new String(GetAreaArrayName_5(), StandardCharsets.UTF_8);
  }

  private native void SetAreaArrayName_6(byte[] id0, int len0);
  public void SetAreaArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAreaArrayName_6(bytes0, bytes0.length);
  }

  private native boolean GetEdgeRoutingPoints_7();
  public boolean GetEdgeRoutingPoints()
  {
    return GetEdgeRoutingPoints_7();
  }

  private native void SetEdgeRoutingPoints_8(boolean id0);
  public void SetEdgeRoutingPoints(boolean id0)
  {
    SetEdgeRoutingPoints_8(id0);
  }

  private native void EdgeRoutingPointsOn_9();
  public void EdgeRoutingPointsOn()
  {
    EdgeRoutingPointsOn_9();
  }

  private native void EdgeRoutingPointsOff_10();
  public void EdgeRoutingPointsOff()
  {
    EdgeRoutingPointsOff_10();
  }

  private native long GetLayoutStrategy_11();
  public vtkAreaLayoutStrategy GetLayoutStrategy()
  {
    long temp = GetLayoutStrategy_11();

    if (temp == 0) return null;
    return (vtkAreaLayoutStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLayoutStrategy_12(vtkAreaLayoutStrategy id0);
  public void SetLayoutStrategy(vtkAreaLayoutStrategy id0)
  {
    SetLayoutStrategy_12(id0);
  }

  private native long GetMTime_13();
  public long GetMTime()
  {
    return GetMTime_13();
  }

  private native long FindVertex_14(float id0[]);
  public long FindVertex(float id0[])
  {
    return FindVertex_14(id0);
  }

  public vtkAreaLayout() { super(); }

  public vtkAreaLayout(long id) { super(id); }
  public native long   VTKInit();

}
