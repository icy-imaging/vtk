// java wrapper for vtkTupleInterpolator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTupleInterpolator extends vtkObject
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

  private native void SetNumberOfComponents_4(int id0);
  public void SetNumberOfComponents(int id0)
  {
    SetNumberOfComponents_4(id0);
  }

  private native int GetNumberOfComponents_5();
  public int GetNumberOfComponents()
  {
    return GetNumberOfComponents_5();
  }

  private native int GetNumberOfTuples_6();
  public int GetNumberOfTuples()
  {
    return GetNumberOfTuples_6();
  }

  private native double GetMinimumT_7();
  public double GetMinimumT()
  {
    return GetMinimumT_7();
  }

  private native double GetMaximumT_8();
  public double GetMaximumT()
  {
    return GetMaximumT_8();
  }

  private native void Initialize_9();
  public void Initialize()
  {
    Initialize_9();
  }

  private native void RemoveTuple_10(double id0);
  public void RemoveTuple(double id0)
  {
    RemoveTuple_10(id0);
  }

  private native void SetInterpolationType_11(int id0);
  public void SetInterpolationType(int id0)
  {
    SetInterpolationType_11(id0);
  }

  private native int GetInterpolationType_12();
  public int GetInterpolationType()
  {
    return GetInterpolationType_12();
  }

  private native void SetInterpolationTypeToLinear_13();
  public void SetInterpolationTypeToLinear()
  {
    SetInterpolationTypeToLinear_13();
  }

  private native void SetInterpolationTypeToSpline_14();
  public void SetInterpolationTypeToSpline()
  {
    SetInterpolationTypeToSpline_14();
  }

  private native void SetInterpolatingSpline_15(vtkSpline id0);
  public void SetInterpolatingSpline(vtkSpline id0)
  {
    SetInterpolatingSpline_15(id0);
  }

  private native long GetInterpolatingSpline_16();
  public vtkSpline GetInterpolatingSpline()
  {
    long temp = GetInterpolatingSpline_16();

    if (temp == 0) return null;
    return (vtkSpline)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkTupleInterpolator() { super(); }

  public vtkTupleInterpolator(long id) { super(id); }
  public native long   VTKInit();

}
