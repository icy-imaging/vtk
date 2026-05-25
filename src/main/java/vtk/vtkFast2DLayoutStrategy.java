// java wrapper for vtkFast2DLayoutStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFast2DLayoutStrategy extends vtkGraphLayoutStrategy
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

  private native void SetRandomSeed_4(int id0);
  public void SetRandomSeed(int id0)
  {
    SetRandomSeed_4(id0);
  }

  private native int GetRandomSeedMinValue_5();
  public int GetRandomSeedMinValue()
  {
    return GetRandomSeedMinValue_5();
  }

  private native int GetRandomSeedMaxValue_6();
  public int GetRandomSeedMaxValue()
  {
    return GetRandomSeedMaxValue_6();
  }

  private native int GetRandomSeed_7();
  public int GetRandomSeed()
  {
    return GetRandomSeed_7();
  }

  private native void SetMaxNumberOfIterations_8(int id0);
  public void SetMaxNumberOfIterations(int id0)
  {
    SetMaxNumberOfIterations_8(id0);
  }

  private native int GetMaxNumberOfIterationsMinValue_9();
  public int GetMaxNumberOfIterationsMinValue()
  {
    return GetMaxNumberOfIterationsMinValue_9();
  }

  private native int GetMaxNumberOfIterationsMaxValue_10();
  public int GetMaxNumberOfIterationsMaxValue()
  {
    return GetMaxNumberOfIterationsMaxValue_10();
  }

  private native int GetMaxNumberOfIterations_11();
  public int GetMaxNumberOfIterations()
  {
    return GetMaxNumberOfIterations_11();
  }

  private native void SetIterationsPerLayout_12(int id0);
  public void SetIterationsPerLayout(int id0)
  {
    SetIterationsPerLayout_12(id0);
  }

  private native int GetIterationsPerLayoutMinValue_13();
  public int GetIterationsPerLayoutMinValue()
  {
    return GetIterationsPerLayoutMinValue_13();
  }

  private native int GetIterationsPerLayoutMaxValue_14();
  public int GetIterationsPerLayoutMaxValue()
  {
    return GetIterationsPerLayoutMaxValue_14();
  }

  private native int GetIterationsPerLayout_15();
  public int GetIterationsPerLayout()
  {
    return GetIterationsPerLayout_15();
  }

  private native void SetInitialTemperature_16(float id0);
  public void SetInitialTemperature(float id0)
  {
    SetInitialTemperature_16(id0);
  }

  private native float GetInitialTemperatureMinValue_17();
  public float GetInitialTemperatureMinValue()
  {
    return GetInitialTemperatureMinValue_17();
  }

  private native float GetInitialTemperatureMaxValue_18();
  public float GetInitialTemperatureMaxValue()
  {
    return GetInitialTemperatureMaxValue_18();
  }

  private native float GetInitialTemperature_19();
  public float GetInitialTemperature()
  {
    return GetInitialTemperature_19();
  }

  private native void SetCoolDownRate_20(double id0);
  public void SetCoolDownRate(double id0)
  {
    SetCoolDownRate_20(id0);
  }

  private native double GetCoolDownRateMinValue_21();
  public double GetCoolDownRateMinValue()
  {
    return GetCoolDownRateMinValue_21();
  }

  private native double GetCoolDownRateMaxValue_22();
  public double GetCoolDownRateMaxValue()
  {
    return GetCoolDownRateMaxValue_22();
  }

  private native double GetCoolDownRate_23();
  public double GetCoolDownRate()
  {
    return GetCoolDownRate_23();
  }

  private native void SetRestDistance_24(float id0);
  public void SetRestDistance(float id0)
  {
    SetRestDistance_24(id0);
  }

  private native float GetRestDistance_25();
  public float GetRestDistance()
  {
    return GetRestDistance_25();
  }

  private native void Initialize_26();
  public void Initialize()
  {
    Initialize_26();
  }

  private native void Layout_27();
  public void Layout()
  {
    Layout_27();
  }

  private native int IsLayoutComplete_28();
  public int IsLayoutComplete()
  {
    return IsLayoutComplete_28();
  }

  public vtkFast2DLayoutStrategy() { super(); }

  public vtkFast2DLayoutStrategy(long id) { super(id); }
  public native long   VTKInit();

}
