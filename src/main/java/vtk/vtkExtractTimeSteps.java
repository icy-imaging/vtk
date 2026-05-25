// java wrapper for vtkExtractTimeSteps object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractTimeSteps extends vtkPassInputTypeAlgorithm
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

  private native int GetNumberOfTimeSteps_4();
  public int GetNumberOfTimeSteps()
  {
    return GetNumberOfTimeSteps_4();
  }

  private native void AddTimeStepIndex_5(int id0);
  public void AddTimeStepIndex(int id0)
  {
    AddTimeStepIndex_5(id0);
  }

  private native void GenerateTimeStepIndices_6(int id0,int id1,int id2);
  public void GenerateTimeStepIndices(int id0,int id1,int id2)
  {
    GenerateTimeStepIndices_6(id0,id1,id2);
  }

  private native void ClearTimeStepIndices_7();
  public void ClearTimeStepIndices()
  {
    ClearTimeStepIndices_7();
  }

  private native boolean GetUseRange_8();
  public boolean GetUseRange()
  {
    return GetUseRange_8();
  }

  private native void SetUseRange_9(boolean id0);
  public void SetUseRange(boolean id0)
  {
    SetUseRange_9(id0);
  }

  private native void UseRangeOn_10();
  public void UseRangeOn()
  {
    UseRangeOn_10();
  }

  private native void UseRangeOff_11();
  public void UseRangeOff()
  {
    UseRangeOff_11();
  }

  private native int[] GetRange_12();
  public int[] GetRange()
  {
    return GetRange_12();
  }

  private native void SetRange_13(int id0,int id1);
  public void SetRange(int id0,int id1)
  {
    SetRange_13(id0,id1);
  }

  private native void SetRange_14(int id0[]);
  public void SetRange(int id0[])
  {
    SetRange_14(id0);
  }

  private native int GetTimeStepInterval_15();
  public int GetTimeStepInterval()
  {
    return GetTimeStepInterval_15();
  }

  private native void SetTimeStepInterval_16(int id0);
  public void SetTimeStepInterval(int id0)
  {
    SetTimeStepInterval_16(id0);
  }

  private native int GetTimeStepIntervalMinValue_17();
  public int GetTimeStepIntervalMinValue()
  {
    return GetTimeStepIntervalMinValue_17();
  }

  private native int GetTimeStepIntervalMaxValue_18();
  public int GetTimeStepIntervalMaxValue()
  {
    return GetTimeStepIntervalMaxValue_18();
  }

  private native int GetTimeEstimationMode_19();
  public int GetTimeEstimationMode()
  {
    return GetTimeEstimationMode_19();
  }

  private native void SetTimeEstimationMode_20(int id0);
  public void SetTimeEstimationMode(int id0)
  {
    SetTimeEstimationMode_20(id0);
  }

  private native void SetTimeEstimationModeToPrevious_21();
  public void SetTimeEstimationModeToPrevious()
  {
    SetTimeEstimationModeToPrevious_21();
  }

  private native void SetTimeEstimationModeToNext_22();
  public void SetTimeEstimationModeToNext()
  {
    SetTimeEstimationModeToNext_22();
  }

  private native void SetTimeEstimationModeToNearest_23();
  public void SetTimeEstimationModeToNearest()
  {
    SetTimeEstimationModeToNearest_23();
  }

  public vtkExtractTimeSteps() { super(); }

  public vtkExtractTimeSteps(long id) { super(id); }
  public native long   VTKInit();

}
