// java wrapper for vtkStatisticalOutlierRemoval object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStatisticalOutlierRemoval extends vtkPointCloudFilter
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

  private native void SetSampleSize_4(int id0);
  public void SetSampleSize(int id0)
  {
    SetSampleSize_4(id0);
  }

  private native int GetSampleSizeMinValue_5();
  public int GetSampleSizeMinValue()
  {
    return GetSampleSizeMinValue_5();
  }

  private native int GetSampleSizeMaxValue_6();
  public int GetSampleSizeMaxValue()
  {
    return GetSampleSizeMaxValue_6();
  }

  private native int GetSampleSize_7();
  public int GetSampleSize()
  {
    return GetSampleSize_7();
  }

  private native void SetStandardDeviationFactor_8(double id0);
  public void SetStandardDeviationFactor(double id0)
  {
    SetStandardDeviationFactor_8(id0);
  }

  private native double GetStandardDeviationFactorMinValue_9();
  public double GetStandardDeviationFactorMinValue()
  {
    return GetStandardDeviationFactorMinValue_9();
  }

  private native double GetStandardDeviationFactorMaxValue_10();
  public double GetStandardDeviationFactorMaxValue()
  {
    return GetStandardDeviationFactorMaxValue_10();
  }

  private native double GetStandardDeviationFactor_11();
  public double GetStandardDeviationFactor()
  {
    return GetStandardDeviationFactor_11();
  }

  private native void SetLocator_12(vtkAbstractPointLocator id0);
  public void SetLocator(vtkAbstractPointLocator id0)
  {
    SetLocator_12(id0);
  }

  private native long GetLocator_13();
  public vtkAbstractPointLocator GetLocator()
  {
    long temp = GetLocator_13();

    if (temp == 0) return null;
    return (vtkAbstractPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetComputedMean_14(double id0);
  public void SetComputedMean(double id0)
  {
    SetComputedMean_14(id0);
  }

  private native double GetComputedMeanMinValue_15();
  public double GetComputedMeanMinValue()
  {
    return GetComputedMeanMinValue_15();
  }

  private native double GetComputedMeanMaxValue_16();
  public double GetComputedMeanMaxValue()
  {
    return GetComputedMeanMaxValue_16();
  }

  private native double GetComputedMean_17();
  public double GetComputedMean()
  {
    return GetComputedMean_17();
  }

  private native void SetComputedStandardDeviation_18(double id0);
  public void SetComputedStandardDeviation(double id0)
  {
    SetComputedStandardDeviation_18(id0);
  }

  private native double GetComputedStandardDeviationMinValue_19();
  public double GetComputedStandardDeviationMinValue()
  {
    return GetComputedStandardDeviationMinValue_19();
  }

  private native double GetComputedStandardDeviationMaxValue_20();
  public double GetComputedStandardDeviationMaxValue()
  {
    return GetComputedStandardDeviationMaxValue_20();
  }

  private native double GetComputedStandardDeviation_21();
  public double GetComputedStandardDeviation()
  {
    return GetComputedStandardDeviation_21();
  }

  public vtkStatisticalOutlierRemoval() { super(); }

  public vtkStatisticalOutlierRemoval(long id) { super(id); }
  public native long   VTKInit();

}
