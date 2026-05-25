// java wrapper for vtkBoundedPlanePointPlacer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBoundedPlanePointPlacer extends vtkPointPlacer
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

  private native void SetProjectionNormal_4(int id0);
  public void SetProjectionNormal(int id0)
  {
    SetProjectionNormal_4(id0);
  }

  private native int GetProjectionNormalMinValue_5();
  public int GetProjectionNormalMinValue()
  {
    return GetProjectionNormalMinValue_5();
  }

  private native int GetProjectionNormalMaxValue_6();
  public int GetProjectionNormalMaxValue()
  {
    return GetProjectionNormalMaxValue_6();
  }

  private native int GetProjectionNormal_7();
  public int GetProjectionNormal()
  {
    return GetProjectionNormal_7();
  }

  private native void SetProjectionNormalToXAxis_8();
  public void SetProjectionNormalToXAxis()
  {
    SetProjectionNormalToXAxis_8();
  }

  private native void SetProjectionNormalToYAxis_9();
  public void SetProjectionNormalToYAxis()
  {
    SetProjectionNormalToYAxis_9();
  }

  private native void SetProjectionNormalToZAxis_10();
  public void SetProjectionNormalToZAxis()
  {
    SetProjectionNormalToZAxis_10();
  }

  private native void SetProjectionNormalToOblique_11();
  public void SetProjectionNormalToOblique()
  {
    SetProjectionNormalToOblique_11();
  }

  private native void SetObliquePlane_12(vtkPlane id0);
  public void SetObliquePlane(vtkPlane id0)
  {
    SetObliquePlane_12(id0);
  }

  private native long GetObliquePlane_13();
  public vtkPlane GetObliquePlane()
  {
    long temp = GetObliquePlane_13();

    if (temp == 0) return null;
    return (vtkPlane)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetProjectionPosition_14(double id0);
  public void SetProjectionPosition(double id0)
  {
    SetProjectionPosition_14(id0);
  }

  private native double GetProjectionPosition_15();
  public double GetProjectionPosition()
  {
    return GetProjectionPosition_15();
  }

  private native void AddBoundingPlane_16(vtkPlane id0);
  public void AddBoundingPlane(vtkPlane id0)
  {
    AddBoundingPlane_16(id0);
  }

  private native void RemoveBoundingPlane_17(vtkPlane id0);
  public void RemoveBoundingPlane(vtkPlane id0)
  {
    RemoveBoundingPlane_17(id0);
  }

  private native void RemoveAllBoundingPlanes_18();
  public void RemoveAllBoundingPlanes()
  {
    RemoveAllBoundingPlanes_18();
  }

  private native void SetBoundingPlanes_19(vtkPlaneCollection id0);
  public void SetBoundingPlanes(vtkPlaneCollection id0)
  {
    SetBoundingPlanes_19(id0);
  }

  private native long GetBoundingPlanes_20();
  public vtkPlaneCollection GetBoundingPlanes()
  {
    long temp = GetBoundingPlanes_20();

    if (temp == 0) return null;
    return (vtkPlaneCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBoundingPlanes_21(vtkPlanes id0);
  public void SetBoundingPlanes(vtkPlanes id0)
  {
    SetBoundingPlanes_21(id0);
  }

  private native int ComputeWorldPosition_22(vtkRenderer id0,double id1[],double id2[],double id3[]);
  public int ComputeWorldPosition(vtkRenderer id0,double id1[],double id2[],double id3[])
  {
    return ComputeWorldPosition_22(id0,id1,id2,id3);
  }

  private native int ComputeWorldPosition_23(vtkRenderer id0,double id1[],double id2[],double id3[],double id4[]);
  public int ComputeWorldPosition(vtkRenderer id0,double id1[],double id2[],double id3[],double id4[])
  {
    return ComputeWorldPosition_23(id0,id1,id2,id3,id4);
  }

  private native int ValidateWorldPosition_24(double id0[]);
  public int ValidateWorldPosition(double id0[])
  {
    return ValidateWorldPosition_24(id0);
  }

  private native int ValidateWorldPosition_25(double id0[],double id1[]);
  public int ValidateWorldPosition(double id0[],double id1[])
  {
    return ValidateWorldPosition_25(id0,id1);
  }

  private native int UpdateWorldPosition_26(vtkRenderer id0,double id1[],double id2[]);
  public int UpdateWorldPosition(vtkRenderer id0,double id1[],double id2[])
  {
    return UpdateWorldPosition_26(id0,id1,id2);
  }

  public vtkBoundedPlanePointPlacer() { super(); }

  public vtkBoundedPlanePointPlacer(long id) { super(id); }
  public native long   VTKInit();

}
