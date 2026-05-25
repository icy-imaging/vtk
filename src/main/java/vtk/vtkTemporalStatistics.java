// java wrapper for vtkTemporalStatistics object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTemporalStatistics extends vtkPassInputTypeAlgorithm
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

  private native byte[] TimeStepsArrayName_4();
  public String TimeStepsArrayName()
  {
    return new String(TimeStepsArrayName_4(), StandardCharsets.UTF_8);
  }

  private native int GetComputeAverage_5();
  public int GetComputeAverage()
  {
    return GetComputeAverage_5();
  }

  private native void SetComputeAverage_6(int id0);
  public void SetComputeAverage(int id0)
  {
    SetComputeAverage_6(id0);
  }

  private native void ComputeAverageOn_7();
  public void ComputeAverageOn()
  {
    ComputeAverageOn_7();
  }

  private native void ComputeAverageOff_8();
  public void ComputeAverageOff()
  {
    ComputeAverageOff_8();
  }

  private native int GetComputeMinimum_9();
  public int GetComputeMinimum()
  {
    return GetComputeMinimum_9();
  }

  private native void SetComputeMinimum_10(int id0);
  public void SetComputeMinimum(int id0)
  {
    SetComputeMinimum_10(id0);
  }

  private native void ComputeMinimumOn_11();
  public void ComputeMinimumOn()
  {
    ComputeMinimumOn_11();
  }

  private native void ComputeMinimumOff_12();
  public void ComputeMinimumOff()
  {
    ComputeMinimumOff_12();
  }

  private native int GetComputeMaximum_13();
  public int GetComputeMaximum()
  {
    return GetComputeMaximum_13();
  }

  private native void SetComputeMaximum_14(int id0);
  public void SetComputeMaximum(int id0)
  {
    SetComputeMaximum_14(id0);
  }

  private native void ComputeMaximumOn_15();
  public void ComputeMaximumOn()
  {
    ComputeMaximumOn_15();
  }

  private native void ComputeMaximumOff_16();
  public void ComputeMaximumOff()
  {
    ComputeMaximumOff_16();
  }

  private native int GetComputeStandardDeviation_17();
  public int GetComputeStandardDeviation()
  {
    return GetComputeStandardDeviation_17();
  }

  private native void SetComputeStandardDeviation_18(int id0);
  public void SetComputeStandardDeviation(int id0)
  {
    SetComputeStandardDeviation_18(id0);
  }

  private native void ComputeStandardDeviationOn_19();
  public void ComputeStandardDeviationOn()
  {
    ComputeStandardDeviationOn_19();
  }

  private native void ComputeStandardDeviationOff_20();
  public void ComputeStandardDeviationOff()
  {
    ComputeStandardDeviationOff_20();
  }

  public vtkTemporalStatistics() { super(); }

  public vtkTemporalStatistics(long id) { super(id); }
  public native long   VTKInit();

}
