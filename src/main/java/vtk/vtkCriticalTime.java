// java wrapper for vtkCriticalTime object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCriticalTime extends vtkPassInputTypeAlgorithm
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

  private native double GetLowerThreshold_5();
  public double GetLowerThreshold()
  {
    return GetLowerThreshold_5();
  }

  private native void SetLowerThreshold_6(double id0);
  public void SetLowerThreshold(double id0)
  {
    SetLowerThreshold_6(id0);
  }

  private native double GetUpperThreshold_7();
  public double GetUpperThreshold()
  {
    return GetUpperThreshold_7();
  }

  private native void SetUpperThreshold_8(double id0);
  public void SetUpperThreshold(double id0)
  {
    SetUpperThreshold_8(id0);
  }

  private native void SetThresholdCriterion_9(int id0);
  public void SetThresholdCriterion(int id0)
  {
    SetThresholdCriterion_9(id0);
  }

  private native int GetThresholdCriterionMinValue_10();
  public int GetThresholdCriterionMinValue()
  {
    return GetThresholdCriterionMinValue_10();
  }

  private native int GetThresholdCriterionMaxValue_11();
  public int GetThresholdCriterionMaxValue()
  {
    return GetThresholdCriterionMaxValue_11();
  }

  private native int GetThresholdCriterion_12();
  public int GetThresholdCriterion()
  {
    return GetThresholdCriterion_12();
  }

  private native void SetThresholdCriterionToBetween_13();
  public void SetThresholdCriterionToBetween()
  {
    SetThresholdCriterionToBetween_13();
  }

  private native void SetThresholdCriterionToLower_14();
  public void SetThresholdCriterionToLower()
  {
    SetThresholdCriterionToLower_14();
  }

  private native void SetThresholdCriterionToUpper_15();
  public void SetThresholdCriterionToUpper()
  {
    SetThresholdCriterionToUpper_15();
  }

  private native byte[] GetThresholdFunctionAsString_16();
  public String GetThresholdFunctionAsString()
  {
    return new String(GetThresholdFunctionAsString_16(), StandardCharsets.UTF_8);
  }

  private native void SetComponentMode_17(int id0);
  public void SetComponentMode(int id0)
  {
    SetComponentMode_17(id0);
  }

  private native int GetComponentModeMinValue_18();
  public int GetComponentModeMinValue()
  {
    return GetComponentModeMinValue_18();
  }

  private native int GetComponentModeMaxValue_19();
  public int GetComponentModeMaxValue()
  {
    return GetComponentModeMaxValue_19();
  }

  private native int GetComponentMode_20();
  public int GetComponentMode()
  {
    return GetComponentMode_20();
  }

  private native void SetComponentModeToUseSelected_21();
  public void SetComponentModeToUseSelected()
  {
    SetComponentModeToUseSelected_21();
  }

  private native void SetComponentModeToUseAll_22();
  public void SetComponentModeToUseAll()
  {
    SetComponentModeToUseAll_22();
  }

  private native void SetComponentModeToUseAny_23();
  public void SetComponentModeToUseAny()
  {
    SetComponentModeToUseAny_23();
  }

  private native byte[] GetComponentModeAsString_24();
  public String GetComponentModeAsString()
  {
    return new String(GetComponentModeAsString_24(), StandardCharsets.UTF_8);
  }

  private native void SetSelectedComponent_25(int id0);
  public void SetSelectedComponent(int id0)
  {
    SetSelectedComponent_25(id0);
  }

  private native int GetSelectedComponentMinValue_26();
  public int GetSelectedComponentMinValue()
  {
    return GetSelectedComponentMinValue_26();
  }

  private native int GetSelectedComponentMaxValue_27();
  public int GetSelectedComponentMaxValue()
  {
    return GetSelectedComponentMaxValue_27();
  }

  private native int GetSelectedComponent_28();
  public int GetSelectedComponent()
  {
    return GetSelectedComponent_28();
  }

  public vtkCriticalTime() { super(); }

  public vtkCriticalTime(long id) { super(id); }
  public native long   VTKInit();

}
