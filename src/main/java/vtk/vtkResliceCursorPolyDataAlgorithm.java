// java wrapper for vtkResliceCursorPolyDataAlgorithm object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkResliceCursorPolyDataAlgorithm extends vtkPolyDataAlgorithm
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

  private native void SetReslicePlaneNormal_4(int id0);
  public void SetReslicePlaneNormal(int id0)
  {
    SetReslicePlaneNormal_4(id0);
  }

  private native int GetReslicePlaneNormal_5();
  public int GetReslicePlaneNormal()
  {
    return GetReslicePlaneNormal_5();
  }

  private native void SetReslicePlaneNormalToXAxis_6();
  public void SetReslicePlaneNormalToXAxis()
  {
    SetReslicePlaneNormalToXAxis_6();
  }

  private native void SetReslicePlaneNormalToYAxis_7();
  public void SetReslicePlaneNormalToYAxis()
  {
    SetReslicePlaneNormalToYAxis_7();
  }

  private native void SetReslicePlaneNormalToZAxis_8();
  public void SetReslicePlaneNormalToZAxis()
  {
    SetReslicePlaneNormalToZAxis_8();
  }

  private native void SetResliceCursor_9(vtkResliceCursor id0);
  public void SetResliceCursor(vtkResliceCursor id0)
  {
    SetResliceCursor_9(id0);
  }

  private native long GetResliceCursor_10();
  public vtkResliceCursor GetResliceCursor()
  {
    long temp = GetResliceCursor_10();

    if (temp == 0) return null;
    return (vtkResliceCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSliceBounds_11(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetSliceBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetSliceBounds_11(id0,id1,id2,id3,id4,id5);
  }

  private native void SetSliceBounds_12(double id0[]);
  public void SetSliceBounds(double id0[])
  {
    SetSliceBounds_12(id0);
  }

  private native double[] GetSliceBounds_13();
  public double[] GetSliceBounds()
  {
    return GetSliceBounds_13();
  }

  private native long GetCenterlineAxis1_14();
  public vtkPolyData GetCenterlineAxis1()
  {
    long temp = GetCenterlineAxis1_14();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCenterlineAxis2_15();
  public vtkPolyData GetCenterlineAxis2()
  {
    long temp = GetCenterlineAxis2_15();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetThickSlabAxis1_16();
  public vtkPolyData GetThickSlabAxis1()
  {
    long temp = GetThickSlabAxis1_16();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetThickSlabAxis2_17();
  public vtkPolyData GetThickSlabAxis2()
  {
    long temp = GetThickSlabAxis2_17();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetAxis1_18();
  public int GetAxis1()
  {
    return GetAxis1_18();
  }

  private native int GetAxis2_19();
  public int GetAxis2()
  {
    return GetAxis2_19();
  }

  private native int GetPlaneAxis1_20();
  public int GetPlaneAxis1()
  {
    return GetPlaneAxis1_20();
  }

  private native int GetPlaneAxis2_21();
  public int GetPlaneAxis2()
  {
    return GetPlaneAxis2_21();
  }

  private native int GetOtherPlaneForAxis_22(int id0);
  public int GetOtherPlaneForAxis(int id0)
  {
    return GetOtherPlaneForAxis_22(id0);
  }

  private native long GetMTime_23();
  public long GetMTime()
  {
    return GetMTime_23();
  }

  public vtkResliceCursorPolyDataAlgorithm() { super(); }

  public vtkResliceCursorPolyDataAlgorithm(long id) { super(id); }
  public native long   VTKInit();

}
