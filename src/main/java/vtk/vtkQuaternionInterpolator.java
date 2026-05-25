// java wrapper for vtkQuaternionInterpolator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkQuaternionInterpolator extends vtkObject
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

  private native int GetNumberOfQuaternions_4();
  public int GetNumberOfQuaternions()
  {
    return GetNumberOfQuaternions_4();
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

  private native void AddQuaternion_8(double id0,double id1[]);
  public void AddQuaternion(double id0,double id1[])
  {
    AddQuaternion_8(id0,id1);
  }

  private native void RemoveQuaternion_9(double id0);
  public void RemoveQuaternion(double id0)
  {
    RemoveQuaternion_9(id0);
  }

  private native void InterpolateQuaternion_10(double id0,double id1[]);
  public void InterpolateQuaternion(double id0,double id1[])
  {
    InterpolateQuaternion_10(id0,id1);
  }

  private native int GetSearchMethod_11();
  public int GetSearchMethod()
  {
    return GetSearchMethod_11();
  }

  private native void SetSearchMethod_12(int id0);
  public void SetSearchMethod(int id0)
  {
    SetSearchMethod_12(id0);
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

  public vtkQuaternionInterpolator() { super(); }

  public vtkQuaternionInterpolator(long id) { super(id); }
  public native long   VTKInit();

}
