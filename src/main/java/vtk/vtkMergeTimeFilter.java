// java wrapper for vtkMergeTimeFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMergeTimeFilter extends vtkMultiBlockDataSetAlgorithm
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

  private native void SetTolerance_4(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_4(id0);
  }

  private native double GetToleranceMinValue_5();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_5();
  }

  private native double GetToleranceMaxValue_6();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_6();
  }

  private native double GetTolerance_7();
  public double GetTolerance()
  {
    return GetTolerance_7();
  }

  private native void SetUseRelativeTolerance_8(boolean id0);
  public void SetUseRelativeTolerance(boolean id0)
  {
    SetUseRelativeTolerance_8(id0);
  }

  private native boolean GetUseRelativeTolerance_9();
  public boolean GetUseRelativeTolerance()
  {
    return GetUseRelativeTolerance_9();
  }

  private native void UseRelativeToleranceOn_10();
  public void UseRelativeToleranceOn()
  {
    UseRelativeToleranceOn_10();
  }

  private native void UseRelativeToleranceOff_11();
  public void UseRelativeToleranceOff()
  {
    UseRelativeToleranceOff_11();
  }

  private native void SetUseIntersection_12(boolean id0);
  public void SetUseIntersection(boolean id0)
  {
    SetUseIntersection_12(id0);
  }

  private native boolean GetUseIntersection_13();
  public boolean GetUseIntersection()
  {
    return GetUseIntersection_13();
  }

  private native void UseIntersectionOn_14();
  public void UseIntersectionOn()
  {
    UseIntersectionOn_14();
  }

  private native void UseIntersectionOff_15();
  public void UseIntersectionOff()
  {
    UseIntersectionOff_15();
  }

  public vtkMergeTimeFilter() { super(); }

  public vtkMergeTimeFilter(long id) { super(id); }
  public native long   VTKInit();

}
