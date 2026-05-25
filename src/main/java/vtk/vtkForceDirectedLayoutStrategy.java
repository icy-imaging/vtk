// java wrapper for vtkForceDirectedLayoutStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkForceDirectedLayoutStrategy extends vtkGraphLayoutStrategy
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

  private native void SetGraphBounds_8(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetGraphBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetGraphBounds_8(id0,id1,id2,id3,id4,id5);
  }

  private native void SetGraphBounds_9(double id0[]);
  public void SetGraphBounds(double id0[])
  {
    SetGraphBounds_9(id0);
  }

  private native double[] GetGraphBounds_10();
  public double[] GetGraphBounds()
  {
    return GetGraphBounds_10();
  }

  private native void SetAutomaticBoundsComputation_11(int id0);
  public void SetAutomaticBoundsComputation(int id0)
  {
    SetAutomaticBoundsComputation_11(id0);
  }

  private native int GetAutomaticBoundsComputation_12();
  public int GetAutomaticBoundsComputation()
  {
    return GetAutomaticBoundsComputation_12();
  }

  private native void AutomaticBoundsComputationOn_13();
  public void AutomaticBoundsComputationOn()
  {
    AutomaticBoundsComputationOn_13();
  }

  private native void AutomaticBoundsComputationOff_14();
  public void AutomaticBoundsComputationOff()
  {
    AutomaticBoundsComputationOff_14();
  }

  private native void SetMaxNumberOfIterations_15(int id0);
  public void SetMaxNumberOfIterations(int id0)
  {
    SetMaxNumberOfIterations_15(id0);
  }

  private native int GetMaxNumberOfIterationsMinValue_16();
  public int GetMaxNumberOfIterationsMinValue()
  {
    return GetMaxNumberOfIterationsMinValue_16();
  }

  private native int GetMaxNumberOfIterationsMaxValue_17();
  public int GetMaxNumberOfIterationsMaxValue()
  {
    return GetMaxNumberOfIterationsMaxValue_17();
  }

  private native int GetMaxNumberOfIterations_18();
  public int GetMaxNumberOfIterations()
  {
    return GetMaxNumberOfIterations_18();
  }

  private native void SetIterationsPerLayout_19(int id0);
  public void SetIterationsPerLayout(int id0)
  {
    SetIterationsPerLayout_19(id0);
  }

  private native int GetIterationsPerLayoutMinValue_20();
  public int GetIterationsPerLayoutMinValue()
  {
    return GetIterationsPerLayoutMinValue_20();
  }

  private native int GetIterationsPerLayoutMaxValue_21();
  public int GetIterationsPerLayoutMaxValue()
  {
    return GetIterationsPerLayoutMaxValue_21();
  }

  private native int GetIterationsPerLayout_22();
  public int GetIterationsPerLayout()
  {
    return GetIterationsPerLayout_22();
  }

  private native void SetCoolDownRate_23(double id0);
  public void SetCoolDownRate(double id0)
  {
    SetCoolDownRate_23(id0);
  }

  private native double GetCoolDownRateMinValue_24();
  public double GetCoolDownRateMinValue()
  {
    return GetCoolDownRateMinValue_24();
  }

  private native double GetCoolDownRateMaxValue_25();
  public double GetCoolDownRateMaxValue()
  {
    return GetCoolDownRateMaxValue_25();
  }

  private native double GetCoolDownRate_26();
  public double GetCoolDownRate()
  {
    return GetCoolDownRate_26();
  }

  private native void SetThreeDimensionalLayout_27(int id0);
  public void SetThreeDimensionalLayout(int id0)
  {
    SetThreeDimensionalLayout_27(id0);
  }

  private native int GetThreeDimensionalLayout_28();
  public int GetThreeDimensionalLayout()
  {
    return GetThreeDimensionalLayout_28();
  }

  private native void ThreeDimensionalLayoutOn_29();
  public void ThreeDimensionalLayoutOn()
  {
    ThreeDimensionalLayoutOn_29();
  }

  private native void ThreeDimensionalLayoutOff_30();
  public void ThreeDimensionalLayoutOff()
  {
    ThreeDimensionalLayoutOff_30();
  }

  private native void SetRandomInitialPoints_31(int id0);
  public void SetRandomInitialPoints(int id0)
  {
    SetRandomInitialPoints_31(id0);
  }

  private native int GetRandomInitialPoints_32();
  public int GetRandomInitialPoints()
  {
    return GetRandomInitialPoints_32();
  }

  private native void RandomInitialPointsOn_33();
  public void RandomInitialPointsOn()
  {
    RandomInitialPointsOn_33();
  }

  private native void RandomInitialPointsOff_34();
  public void RandomInitialPointsOff()
  {
    RandomInitialPointsOff_34();
  }

  private native void SetInitialTemperature_35(float id0);
  public void SetInitialTemperature(float id0)
  {
    SetInitialTemperature_35(id0);
  }

  private native float GetInitialTemperatureMinValue_36();
  public float GetInitialTemperatureMinValue()
  {
    return GetInitialTemperatureMinValue_36();
  }

  private native float GetInitialTemperatureMaxValue_37();
  public float GetInitialTemperatureMaxValue()
  {
    return GetInitialTemperatureMaxValue_37();
  }

  private native float GetInitialTemperature_38();
  public float GetInitialTemperature()
  {
    return GetInitialTemperature_38();
  }

  private native void Initialize_39();
  public void Initialize()
  {
    Initialize_39();
  }

  private native void Layout_40();
  public void Layout()
  {
    Layout_40();
  }

  private native int IsLayoutComplete_41();
  public int IsLayoutComplete()
  {
    return IsLayoutComplete_41();
  }

  public vtkForceDirectedLayoutStrategy() { super(); }

  public vtkForceDirectedLayoutStrategy(long id) { super(id); }
  public native long   VTKInit();

}
