// java wrapper for vtkDecimatePolylineFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDecimatePolylineFilter extends vtkPolyDataAlgorithm
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

  private native void SetTargetReduction_4(double id0);
  public void SetTargetReduction(double id0)
  {
    SetTargetReduction_4(id0);
  }

  private native double GetTargetReductionMinValue_5();
  public double GetTargetReductionMinValue()
  {
    return GetTargetReductionMinValue_5();
  }

  private native double GetTargetReductionMaxValue_6();
  public double GetTargetReductionMaxValue()
  {
    return GetTargetReductionMaxValue_6();
  }

  private native double GetTargetReduction_7();
  public double GetTargetReduction()
  {
    return GetTargetReduction_7();
  }

  private native void SetMaximumError_8(double id0);
  public void SetMaximumError(double id0)
  {
    SetMaximumError_8(id0);
  }

  private native double GetMaximumErrorMinValue_9();
  public double GetMaximumErrorMinValue()
  {
    return GetMaximumErrorMinValue_9();
  }

  private native double GetMaximumErrorMaxValue_10();
  public double GetMaximumErrorMaxValue()
  {
    return GetMaximumErrorMaxValue_10();
  }

  private native double GetMaximumError_11();
  public double GetMaximumError()
  {
    return GetMaximumError_11();
  }

  private native void SetOutputPointsPrecision_12(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_12(id0);
  }

  private native int GetOutputPointsPrecision_13();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_13();
  }

  private native void SetDecimationStrategy_14(vtkDecimatePolylineStrategy id0);
  public void SetDecimationStrategy(vtkDecimatePolylineStrategy id0)
  {
    SetDecimationStrategy_14(id0);
  }

  private native long GetDecimationStrategy_15();
  public vtkDecimatePolylineStrategy GetDecimationStrategy()
  {
    long temp = GetDecimationStrategy_15();

    if (temp == 0) return null;
    return (vtkDecimatePolylineStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_16();
  public long GetMTime()
  {
    return GetMTime_16();
  }

  public vtkDecimatePolylineFilter() { super(); }

  public vtkDecimatePolylineFilter(long id) { super(id); }
  public native long   VTKInit();

}
