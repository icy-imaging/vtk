// java wrapper for vtkAttributeClustering2DLayoutStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAttributeClustering2DLayoutStrategy extends vtkGraphLayoutStrategy
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

  private native byte[] GetVertexAttribute_4();
  public String GetVertexAttribute()
  {
    return new String(GetVertexAttribute_4(), StandardCharsets.UTF_8);
  }

  private native void SetVertexAttribute_5(byte[] id0, int len0);
  public void SetVertexAttribute(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexAttribute_5(bytes0, bytes0.length);
  }

  private native void SetRandomSeed_6(int id0);
  public void SetRandomSeed(int id0)
  {
    SetRandomSeed_6(id0);
  }

  private native int GetRandomSeedMinValue_7();
  public int GetRandomSeedMinValue()
  {
    return GetRandomSeedMinValue_7();
  }

  private native int GetRandomSeedMaxValue_8();
  public int GetRandomSeedMaxValue()
  {
    return GetRandomSeedMaxValue_8();
  }

  private native int GetRandomSeed_9();
  public int GetRandomSeed()
  {
    return GetRandomSeed_9();
  }

  private native void SetMaxNumberOfIterations_10(int id0);
  public void SetMaxNumberOfIterations(int id0)
  {
    SetMaxNumberOfIterations_10(id0);
  }

  private native int GetMaxNumberOfIterationsMinValue_11();
  public int GetMaxNumberOfIterationsMinValue()
  {
    return GetMaxNumberOfIterationsMinValue_11();
  }

  private native int GetMaxNumberOfIterationsMaxValue_12();
  public int GetMaxNumberOfIterationsMaxValue()
  {
    return GetMaxNumberOfIterationsMaxValue_12();
  }

  private native int GetMaxNumberOfIterations_13();
  public int GetMaxNumberOfIterations()
  {
    return GetMaxNumberOfIterations_13();
  }

  private native void SetIterationsPerLayout_14(int id0);
  public void SetIterationsPerLayout(int id0)
  {
    SetIterationsPerLayout_14(id0);
  }

  private native int GetIterationsPerLayoutMinValue_15();
  public int GetIterationsPerLayoutMinValue()
  {
    return GetIterationsPerLayoutMinValue_15();
  }

  private native int GetIterationsPerLayoutMaxValue_16();
  public int GetIterationsPerLayoutMaxValue()
  {
    return GetIterationsPerLayoutMaxValue_16();
  }

  private native int GetIterationsPerLayout_17();
  public int GetIterationsPerLayout()
  {
    return GetIterationsPerLayout_17();
  }

  private native void SetInitialTemperature_18(float id0);
  public void SetInitialTemperature(float id0)
  {
    SetInitialTemperature_18(id0);
  }

  private native float GetInitialTemperatureMinValue_19();
  public float GetInitialTemperatureMinValue()
  {
    return GetInitialTemperatureMinValue_19();
  }

  private native float GetInitialTemperatureMaxValue_20();
  public float GetInitialTemperatureMaxValue()
  {
    return GetInitialTemperatureMaxValue_20();
  }

  private native float GetInitialTemperature_21();
  public float GetInitialTemperature()
  {
    return GetInitialTemperature_21();
  }

  private native void SetCoolDownRate_22(double id0);
  public void SetCoolDownRate(double id0)
  {
    SetCoolDownRate_22(id0);
  }

  private native double GetCoolDownRateMinValue_23();
  public double GetCoolDownRateMinValue()
  {
    return GetCoolDownRateMinValue_23();
  }

  private native double GetCoolDownRateMaxValue_24();
  public double GetCoolDownRateMaxValue()
  {
    return GetCoolDownRateMaxValue_24();
  }

  private native double GetCoolDownRate_25();
  public double GetCoolDownRate()
  {
    return GetCoolDownRate_25();
  }

  private native void SetRestDistance_26(float id0);
  public void SetRestDistance(float id0)
  {
    SetRestDistance_26(id0);
  }

  private native float GetRestDistance_27();
  public float GetRestDistance()
  {
    return GetRestDistance_27();
  }

  private native void Initialize_28();
  public void Initialize()
  {
    Initialize_28();
  }

  private native void Layout_29();
  public void Layout()
  {
    Layout_29();
  }

  private native int IsLayoutComplete_30();
  public int IsLayoutComplete()
  {
    return IsLayoutComplete_30();
  }

  public vtkAttributeClustering2DLayoutStrategy() { super(); }

  public vtkAttributeClustering2DLayoutStrategy(long id) { super(id); }
  public native long   VTKInit();

}
