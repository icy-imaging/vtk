// java wrapper for vtkImageHistogramStatistics object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageHistogramStatistics extends vtkImageHistogram
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

  private native double GetMinimum_4();
  public double GetMinimum()
  {
    return GetMinimum_4();
  }

  private native double GetMaximum_5();
  public double GetMaximum()
  {
    return GetMaximum_5();
  }

  private native double GetMean_6();
  public double GetMean()
  {
    return GetMean_6();
  }

  private native double GetMedian_7();
  public double GetMedian()
  {
    return GetMedian_7();
  }

  private native double GetStandardDeviation_8();
  public double GetStandardDeviation()
  {
    return GetStandardDeviation_8();
  }

  private native void SetAutoRangePercentiles_9(double id0,double id1);
  public void SetAutoRangePercentiles(double id0,double id1)
  {
    SetAutoRangePercentiles_9(id0,id1);
  }

  private native void SetAutoRangePercentiles_10(double id0[]);
  public void SetAutoRangePercentiles(double id0[])
  {
    SetAutoRangePercentiles_10(id0);
  }

  private native double[] GetAutoRangePercentiles_11();
  public double[] GetAutoRangePercentiles()
  {
    return GetAutoRangePercentiles_11();
  }

  private native void SetAutoRangeExpansionFactors_12(double id0,double id1);
  public void SetAutoRangeExpansionFactors(double id0,double id1)
  {
    SetAutoRangeExpansionFactors_12(id0,id1);
  }

  private native void SetAutoRangeExpansionFactors_13(double id0[]);
  public void SetAutoRangeExpansionFactors(double id0[])
  {
    SetAutoRangeExpansionFactors_13(id0);
  }

  private native double[] GetAutoRangeExpansionFactors_14();
  public double[] GetAutoRangeExpansionFactors()
  {
    return GetAutoRangeExpansionFactors_14();
  }

  private native double[] GetAutoRange_15();
  public double[] GetAutoRange()
  {
    return GetAutoRange_15();
  }

  public vtkImageHistogramStatistics() { super(); }

  public vtkImageHistogramStatistics(long id) { super(id); }
  public native long   VTKInit();

}
