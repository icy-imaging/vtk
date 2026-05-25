// java wrapper for vtkCameraInterpolator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCameraInterpolator extends vtkObject
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

  private native int GetNumberOfCameras_4();
  public int GetNumberOfCameras()
  {
    return GetNumberOfCameras_4();
  }

  private native double GetMinimumT_5();
  public double GetMinimumT()
  {
    return GetMinimumT_5();
  }

  private native double GetMaximumT_6();
  public double GetMaximumT()
  {
    return GetMaximumT_6();
  }

  private native void Initialize_7();
  public void Initialize()
  {
    Initialize_7();
  }

  private native void AddCamera_8(double id0,vtkCamera id1);
  public void AddCamera(double id0,vtkCamera id1)
  {
    AddCamera_8(id0,id1);
  }

  private native void RemoveCamera_9(double id0);
  public void RemoveCamera(double id0)
  {
    RemoveCamera_9(id0);
  }

  private native void InterpolateCamera_10(double id0,vtkCamera id1);
  public void InterpolateCamera(double id0,vtkCamera id1)
  {
    InterpolateCamera_10(id0,id1);
  }

  private native void SetInterpolationType_11(int id0);
  public void SetInterpolationType(int id0)
  {
    SetInterpolationType_11(id0);
  }

  private native int GetInterpolationTypeMinValue_12();
  public int GetInterpolationTypeMinValue()
  {
    return GetInterpolationTypeMinValue_12();
  }

  private native int GetInterpolationTypeMaxValue_13();
  public int GetInterpolationTypeMaxValue()
  {
    return GetInterpolationTypeMaxValue_13();
  }

  private native int GetInterpolationType_14();
  public int GetInterpolationType()
  {
    return GetInterpolationType_14();
  }

  private native void SetInterpolationTypeToLinear_15();
  public void SetInterpolationTypeToLinear()
  {
    SetInterpolationTypeToLinear_15();
  }

  private native void SetInterpolationTypeToSpline_16();
  public void SetInterpolationTypeToSpline()
  {
    SetInterpolationTypeToSpline_16();
  }

  private native void SetInterpolationTypeToManual_17();
  public void SetInterpolationTypeToManual()
  {
    SetInterpolationTypeToManual_17();
  }

  private native void SetPositionInterpolator_18(vtkTupleInterpolator id0);
  public void SetPositionInterpolator(vtkTupleInterpolator id0)
  {
    SetPositionInterpolator_18(id0);
  }

  private native long GetPositionInterpolator_19();
  public vtkTupleInterpolator GetPositionInterpolator()
  {
    long temp = GetPositionInterpolator_19();

    if (temp == 0) return null;
    return (vtkTupleInterpolator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFocalPointInterpolator_20(vtkTupleInterpolator id0);
  public void SetFocalPointInterpolator(vtkTupleInterpolator id0)
  {
    SetFocalPointInterpolator_20(id0);
  }

  private native long GetFocalPointInterpolator_21();
  public vtkTupleInterpolator GetFocalPointInterpolator()
  {
    long temp = GetFocalPointInterpolator_21();

    if (temp == 0) return null;
    return (vtkTupleInterpolator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetViewUpInterpolator_22(vtkTupleInterpolator id0);
  public void SetViewUpInterpolator(vtkTupleInterpolator id0)
  {
    SetViewUpInterpolator_22(id0);
  }

  private native long GetViewUpInterpolator_23();
  public vtkTupleInterpolator GetViewUpInterpolator()
  {
    long temp = GetViewUpInterpolator_23();

    if (temp == 0) return null;
    return (vtkTupleInterpolator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetViewAngleInterpolator_24(vtkTupleInterpolator id0);
  public void SetViewAngleInterpolator(vtkTupleInterpolator id0)
  {
    SetViewAngleInterpolator_24(id0);
  }

  private native long GetViewAngleInterpolator_25();
  public vtkTupleInterpolator GetViewAngleInterpolator()
  {
    long temp = GetViewAngleInterpolator_25();

    if (temp == 0) return null;
    return (vtkTupleInterpolator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetParallelScaleInterpolator_26(vtkTupleInterpolator id0);
  public void SetParallelScaleInterpolator(vtkTupleInterpolator id0)
  {
    SetParallelScaleInterpolator_26(id0);
  }

  private native long GetParallelScaleInterpolator_27();
  public vtkTupleInterpolator GetParallelScaleInterpolator()
  {
    long temp = GetParallelScaleInterpolator_27();

    if (temp == 0) return null;
    return (vtkTupleInterpolator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetClippingRangeInterpolator_28(vtkTupleInterpolator id0);
  public void SetClippingRangeInterpolator(vtkTupleInterpolator id0)
  {
    SetClippingRangeInterpolator_28(id0);
  }

  private native long GetClippingRangeInterpolator_29();
  public vtkTupleInterpolator GetClippingRangeInterpolator()
  {
    long temp = GetClippingRangeInterpolator_29();

    if (temp == 0) return null;
    return (vtkTupleInterpolator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_30();
  public long GetMTime()
  {
    return GetMTime_30();
  }

  public vtkCameraInterpolator() { super(); }

  public vtkCameraInterpolator(long id) { super(id); }
  public native long   VTKInit();

}
