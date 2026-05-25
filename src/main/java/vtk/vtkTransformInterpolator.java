// java wrapper for vtkTransformInterpolator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTransformInterpolator extends vtkObject
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

  private native int GetNumberOfTransforms_4();
  public int GetNumberOfTransforms()
  {
    return GetNumberOfTransforms_4();
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

  private native void AddTransform_8(double id0,vtkTransform id1);
  public void AddTransform(double id0,vtkTransform id1)
  {
    AddTransform_8(id0,id1);
  }

  private native void AddTransform_9(double id0,vtkMatrix4x4 id1);
  public void AddTransform(double id0,vtkMatrix4x4 id1)
  {
    AddTransform_9(id0,id1);
  }

  private native void AddTransform_10(double id0,vtkProp3D id1);
  public void AddTransform(double id0,vtkProp3D id1)
  {
    AddTransform_10(id0,id1);
  }

  private native void RemoveTransform_11(double id0);
  public void RemoveTransform(double id0)
  {
    RemoveTransform_11(id0);
  }

  private native void InterpolateTransform_12(double id0,vtkTransform id1);
  public void InterpolateTransform(double id0,vtkTransform id1)
  {
    InterpolateTransform_12(id0,id1);
  }

  private native void SetInterpolationType_13(int id0);
  public void SetInterpolationType(int id0)
  {
    SetInterpolationType_13(id0);
  }

  private native int GetInterpolationTypeMinValue_14();
  public int GetInterpolationTypeMinValue()
  {
    return GetInterpolationTypeMinValue_14();
  }

  private native int GetInterpolationTypeMaxValue_15();
  public int GetInterpolationTypeMaxValue()
  {
    return GetInterpolationTypeMaxValue_15();
  }

  private native int GetInterpolationType_16();
  public int GetInterpolationType()
  {
    return GetInterpolationType_16();
  }

  private native void SetInterpolationTypeToLinear_17();
  public void SetInterpolationTypeToLinear()
  {
    SetInterpolationTypeToLinear_17();
  }

  private native void SetInterpolationTypeToSpline_18();
  public void SetInterpolationTypeToSpline()
  {
    SetInterpolationTypeToSpline_18();
  }

  private native void SetInterpolationTypeToManual_19();
  public void SetInterpolationTypeToManual()
  {
    SetInterpolationTypeToManual_19();
  }

  private native void SetPositionInterpolator_20(vtkTupleInterpolator id0);
  public void SetPositionInterpolator(vtkTupleInterpolator id0)
  {
    SetPositionInterpolator_20(id0);
  }

  private native long GetPositionInterpolator_21();
  public vtkTupleInterpolator GetPositionInterpolator()
  {
    long temp = GetPositionInterpolator_21();

    if (temp == 0) return null;
    return (vtkTupleInterpolator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScaleInterpolator_22(vtkTupleInterpolator id0);
  public void SetScaleInterpolator(vtkTupleInterpolator id0)
  {
    SetScaleInterpolator_22(id0);
  }

  private native long GetScaleInterpolator_23();
  public vtkTupleInterpolator GetScaleInterpolator()
  {
    long temp = GetScaleInterpolator_23();

    if (temp == 0) return null;
    return (vtkTupleInterpolator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRotationInterpolator_24(vtkQuaternionInterpolator id0);
  public void SetRotationInterpolator(vtkQuaternionInterpolator id0)
  {
    SetRotationInterpolator_24(id0);
  }

  private native long GetRotationInterpolator_25();
  public vtkQuaternionInterpolator GetRotationInterpolator()
  {
    long temp = GetRotationInterpolator_25();

    if (temp == 0) return null;
    return (vtkQuaternionInterpolator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_26();
  public long GetMTime()
  {
    return GetMTime_26();
  }

  public vtkTransformInterpolator() { super(); }

  public vtkTransformInterpolator(long id) { super(id); }
  public native long   VTKInit();

}
