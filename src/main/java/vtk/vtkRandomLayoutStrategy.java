// java wrapper for vtkRandomLayoutStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRandomLayoutStrategy extends vtkGraphLayoutStrategy
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

  private native void SetThreeDimensionalLayout_15(int id0);
  public void SetThreeDimensionalLayout(int id0)
  {
    SetThreeDimensionalLayout_15(id0);
  }

  private native int GetThreeDimensionalLayout_16();
  public int GetThreeDimensionalLayout()
  {
    return GetThreeDimensionalLayout_16();
  }

  private native void ThreeDimensionalLayoutOn_17();
  public void ThreeDimensionalLayoutOn()
  {
    ThreeDimensionalLayoutOn_17();
  }

  private native void ThreeDimensionalLayoutOff_18();
  public void ThreeDimensionalLayoutOff()
  {
    ThreeDimensionalLayoutOff_18();
  }

  private native void SetGraph_19(vtkGraph id0);
  public void SetGraph(vtkGraph id0)
  {
    SetGraph_19(id0);
  }

  private native void Layout_20();
  public void Layout()
  {
    Layout_20();
  }

  public vtkRandomLayoutStrategy() { super(); }

  public vtkRandomLayoutStrategy(long id) { super(id); }
  public native long   VTKInit();

}
