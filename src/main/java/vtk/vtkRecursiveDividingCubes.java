// java wrapper for vtkRecursiveDividingCubes object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRecursiveDividingCubes extends vtkPolyDataAlgorithm
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

  private native void SetValue_4(double id0);
  public void SetValue(double id0)
  {
    SetValue_4(id0);
  }

  private native double GetValue_5();
  public double GetValue()
  {
    return GetValue_5();
  }

  private native void SetDistance_6(double id0);
  public void SetDistance(double id0)
  {
    SetDistance_6(id0);
  }

  private native double GetDistanceMinValue_7();
  public double GetDistanceMinValue()
  {
    return GetDistanceMinValue_7();
  }

  private native double GetDistanceMaxValue_8();
  public double GetDistanceMaxValue()
  {
    return GetDistanceMaxValue_8();
  }

  private native double GetDistance_9();
  public double GetDistance()
  {
    return GetDistance_9();
  }

  private native void SetIncrement_10(int id0);
  public void SetIncrement(int id0)
  {
    SetIncrement_10(id0);
  }

  private native int GetIncrementMinValue_11();
  public int GetIncrementMinValue()
  {
    return GetIncrementMinValue_11();
  }

  private native int GetIncrementMaxValue_12();
  public int GetIncrementMaxValue()
  {
    return GetIncrementMaxValue_12();
  }

  private native int GetIncrement_13();
  public int GetIncrement()
  {
    return GetIncrement_13();
  }

  public vtkRecursiveDividingCubes() { super(); }

  public vtkRecursiveDividingCubes(long id) { super(id); }
  public native long   VTKInit();

}
