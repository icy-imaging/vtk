// java wrapper for vtkClosedSurfacePointPlacer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkClosedSurfacePointPlacer extends vtkPointPlacer
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

  private native void AddBoundingPlane_4(vtkPlane id0);
  public void AddBoundingPlane(vtkPlane id0)
  {
    AddBoundingPlane_4(id0);
  }

  private native void RemoveBoundingPlane_5(vtkPlane id0);
  public void RemoveBoundingPlane(vtkPlane id0)
  {
    RemoveBoundingPlane_5(id0);
  }

  private native void RemoveAllBoundingPlanes_6();
  public void RemoveAllBoundingPlanes()
  {
    RemoveAllBoundingPlanes_6();
  }

  private native void SetBoundingPlanes_7(vtkPlaneCollection id0);
  public void SetBoundingPlanes(vtkPlaneCollection id0)
  {
    SetBoundingPlanes_7(id0);
  }

  private native long GetBoundingPlanes_8();
  public vtkPlaneCollection GetBoundingPlanes()
  {
    long temp = GetBoundingPlanes_8();

    if (temp == 0) return null;
    return (vtkPlaneCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBoundingPlanes_9(vtkPlanes id0);
  public void SetBoundingPlanes(vtkPlanes id0)
  {
    SetBoundingPlanes_9(id0);
  }

  private native int ComputeWorldPosition_10(vtkRenderer id0,double id1[],double id2[],double id3[]);
  public int ComputeWorldPosition(vtkRenderer id0,double id1[],double id2[],double id3[])
  {
    return ComputeWorldPosition_10(id0,id1,id2,id3);
  }

  private native int ComputeWorldPosition_11(vtkRenderer id0,double id1[],double id2[],double id3[],double id4[]);
  public int ComputeWorldPosition(vtkRenderer id0,double id1[],double id2[],double id3[],double id4[])
  {
    return ComputeWorldPosition_11(id0,id1,id2,id3,id4);
  }

  private native int ValidateWorldPosition_12(double id0[]);
  public int ValidateWorldPosition(double id0[])
  {
    return ValidateWorldPosition_12(id0);
  }

  private native int ValidateWorldPosition_13(double id0[],double id1[]);
  public int ValidateWorldPosition(double id0[],double id1[])
  {
    return ValidateWorldPosition_13(id0,id1);
  }

  private native void SetMinimumDistance_14(double id0);
  public void SetMinimumDistance(double id0)
  {
    SetMinimumDistance_14(id0);
  }

  private native double GetMinimumDistanceMinValue_15();
  public double GetMinimumDistanceMinValue()
  {
    return GetMinimumDistanceMinValue_15();
  }

  private native double GetMinimumDistanceMaxValue_16();
  public double GetMinimumDistanceMaxValue()
  {
    return GetMinimumDistanceMaxValue_16();
  }

  private native double GetMinimumDistance_17();
  public double GetMinimumDistance()
  {
    return GetMinimumDistance_17();
  }

  public vtkClosedSurfacePointPlacer() { super(); }

  public vtkClosedSurfacePointPlacer(long id) { super(id); }
  public native long   VTKInit();

}
