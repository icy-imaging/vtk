// java wrapper for vtkHyperTreeGridThreshold object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridThreshold extends vtkHyperTreeGridAlgorithm
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

  private native void SetJustCreateNewMask_4(boolean id0);
  public void SetJustCreateNewMask(boolean id0)
  {
    SetJustCreateNewMask_4(id0);
  }

  private native boolean GetJustCreateNewMask_5();
  public boolean GetJustCreateNewMask()
  {
    return GetJustCreateNewMask_5();
  }

  private native void SetLowerThreshold_6(double id0);
  public void SetLowerThreshold(double id0)
  {
    SetLowerThreshold_6(id0);
  }

  private native double GetLowerThreshold_7();
  public double GetLowerThreshold()
  {
    return GetLowerThreshold_7();
  }

  private native void SetUpperThreshold_8(double id0);
  public void SetUpperThreshold(double id0)
  {
    SetUpperThreshold_8(id0);
  }

  private native double GetUpperThreshold_9();
  public double GetUpperThreshold()
  {
    return GetUpperThreshold_9();
  }

  private native void ThresholdBetween_10(double id0,double id1);
  public void ThresholdBetween(double id0,double id1)
  {
    ThresholdBetween_10(id0,id1);
  }

  private native int GetMemoryStrategy_11();
  public int GetMemoryStrategy()
  {
    return GetMemoryStrategy_11();
  }

  private native void SetMemoryStrategy_12(int id0);
  public void SetMemoryStrategy(int id0)
  {
    SetMemoryStrategy_12(id0);
  }

  private native int GetMemoryStrategyMinValue_13();
  public int GetMemoryStrategyMinValue()
  {
    return GetMemoryStrategyMinValue_13();
  }

  private native int GetMemoryStrategyMaxValue_14();
  public int GetMemoryStrategyMaxValue()
  {
    return GetMemoryStrategyMaxValue_14();
  }

  public vtkHyperTreeGridThreshold() { super(); }

  public vtkHyperTreeGridThreshold(long id) { super(id); }
  public native long   VTKInit();

}
