// java wrapper for vtkPolygonalSurfacePointPlacer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolygonalSurfacePointPlacer extends vtkPolyDataPointPlacer
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

  private native void AddProp_4(vtkProp id0);
  public void AddProp(vtkProp id0)
  {
    AddProp_4(id0);
  }

  private native void RemoveViewProp_5(vtkProp id0);
  public void RemoveViewProp(vtkProp id0)
  {
    RemoveViewProp_5(id0);
  }

  private native void RemoveAllProps_6();
  public void RemoveAllProps()
  {
    RemoveAllProps_6();
  }

  private native int ComputeWorldPosition_7(vtkRenderer id0,double id1[],double id2[],double id3[]);
  public int ComputeWorldPosition(vtkRenderer id0,double id1[],double id2[],double id3[])
  {
    return ComputeWorldPosition_7(id0,id1,id2,id3);
  }

  private native int ComputeWorldPosition_8(vtkRenderer id0,double id1[],double id2[],double id3[],double id4[]);
  public int ComputeWorldPosition(vtkRenderer id0,double id1[],double id2[],double id3[],double id4[])
  {
    return ComputeWorldPosition_8(id0,id1,id2,id3,id4);
  }

  private native int ValidateWorldPosition_9(double id0[]);
  public int ValidateWorldPosition(double id0[])
  {
    return ValidateWorldPosition_9(id0);
  }

  private native int UpdateNodeWorldPosition_10(double id0[],long id1);
  public int UpdateNodeWorldPosition(double id0[],long id1)
  {
    return UpdateNodeWorldPosition_10(id0,id1);
  }

  private native int ValidateDisplayPosition_11(vtkRenderer id0,double id1[]);
  public int ValidateDisplayPosition(vtkRenderer id0,double id1[])
  {
    return ValidateDisplayPosition_11(id0,id1);
  }

  private native int ValidateWorldPosition_12(double id0[],double id1[]);
  public int ValidateWorldPosition(double id0[],double id1[])
  {
    return ValidateWorldPosition_12(id0,id1);
  }

  private native long GetCellPicker_13();
  public vtkCellPicker GetCellPicker()
  {
    long temp = GetCellPicker_13();

    if (temp == 0) return null;
    return (vtkCellPicker)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPolys_14();
  public vtkPolyDataCollection GetPolys()
  {
    long temp = GetPolys_14();

    if (temp == 0) return null;
    return (vtkPolyDataCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDistanceOffset_15(double id0);
  public void SetDistanceOffset(double id0)
  {
    SetDistanceOffset_15(id0);
  }

  private native double GetDistanceOffset_16();
  public double GetDistanceOffset()
  {
    return GetDistanceOffset_16();
  }

  private native void SetSnapToClosestPoint_17(int id0);
  public void SetSnapToClosestPoint(int id0)
  {
    SetSnapToClosestPoint_17(id0);
  }

  private native int GetSnapToClosestPoint_18();
  public int GetSnapToClosestPoint()
  {
    return GetSnapToClosestPoint_18();
  }

  private native void SnapToClosestPointOn_19();
  public void SnapToClosestPointOn()
  {
    SnapToClosestPointOn_19();
  }

  private native void SnapToClosestPointOff_20();
  public void SnapToClosestPointOff()
  {
    SnapToClosestPointOff_20();
  }

  public vtkPolygonalSurfacePointPlacer() { super(); }

  public vtkPolygonalSurfacePointPlacer(long id) { super(id); }
  public native long   VTKInit();

}
