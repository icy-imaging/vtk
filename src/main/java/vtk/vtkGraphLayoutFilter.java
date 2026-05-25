// java wrapper for vtkGraphLayoutFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGraphLayoutFilter extends vtkPolyDataAlgorithm
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

  private native void SetGraphBounds_4(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetGraphBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetGraphBounds_4(id0,id1,id2,id3,id4,id5);
  }

  private native void SetGraphBounds_5(double id0[]);
  public void SetGraphBounds(double id0[])
  {
    SetGraphBounds_5(id0);
  }

  private native double[] GetGraphBounds_6();
  public double[] GetGraphBounds()
  {
    return GetGraphBounds_6();
  }

  private native void SetAutomaticBoundsComputation_7(int id0);
  public void SetAutomaticBoundsComputation(int id0)
  {
    SetAutomaticBoundsComputation_7(id0);
  }

  private native int GetAutomaticBoundsComputation_8();
  public int GetAutomaticBoundsComputation()
  {
    return GetAutomaticBoundsComputation_8();
  }

  private native void AutomaticBoundsComputationOn_9();
  public void AutomaticBoundsComputationOn()
  {
    AutomaticBoundsComputationOn_9();
  }

  private native void AutomaticBoundsComputationOff_10();
  public void AutomaticBoundsComputationOff()
  {
    AutomaticBoundsComputationOff_10();
  }

  private native void SetMaxNumberOfIterations_11(int id0);
  public void SetMaxNumberOfIterations(int id0)
  {
    SetMaxNumberOfIterations_11(id0);
  }

  private native int GetMaxNumberOfIterationsMinValue_12();
  public int GetMaxNumberOfIterationsMinValue()
  {
    return GetMaxNumberOfIterationsMinValue_12();
  }

  private native int GetMaxNumberOfIterationsMaxValue_13();
  public int GetMaxNumberOfIterationsMaxValue()
  {
    return GetMaxNumberOfIterationsMaxValue_13();
  }

  private native int GetMaxNumberOfIterations_14();
  public int GetMaxNumberOfIterations()
  {
    return GetMaxNumberOfIterations_14();
  }

  private native void SetCoolDownRate_15(double id0);
  public void SetCoolDownRate(double id0)
  {
    SetCoolDownRate_15(id0);
  }

  private native double GetCoolDownRateMinValue_16();
  public double GetCoolDownRateMinValue()
  {
    return GetCoolDownRateMinValue_16();
  }

  private native double GetCoolDownRateMaxValue_17();
  public double GetCoolDownRateMaxValue()
  {
    return GetCoolDownRateMaxValue_17();
  }

  private native double GetCoolDownRate_18();
  public double GetCoolDownRate()
  {
    return GetCoolDownRate_18();
  }

  private native void SetThreeDimensionalLayout_19(int id0);
  public void SetThreeDimensionalLayout(int id0)
  {
    SetThreeDimensionalLayout_19(id0);
  }

  private native int GetThreeDimensionalLayout_20();
  public int GetThreeDimensionalLayout()
  {
    return GetThreeDimensionalLayout_20();
  }

  private native void ThreeDimensionalLayoutOn_21();
  public void ThreeDimensionalLayoutOn()
  {
    ThreeDimensionalLayoutOn_21();
  }

  private native void ThreeDimensionalLayoutOff_22();
  public void ThreeDimensionalLayoutOff()
  {
    ThreeDimensionalLayoutOff_22();
  }

  public vtkGraphLayoutFilter() { super(); }

  public vtkGraphLayoutFilter(long id) { super(id); }
  public native long   VTKInit();

}
