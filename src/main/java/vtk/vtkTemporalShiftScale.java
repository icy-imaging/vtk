// java wrapper for vtkTemporalShiftScale object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTemporalShiftScale extends vtkAlgorithm
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

  private native void SetPreShift_4(double id0);
  public void SetPreShift(double id0)
  {
    SetPreShift_4(id0);
  }

  private native double GetPreShift_5();
  public double GetPreShift()
  {
    return GetPreShift_5();
  }

  private native void SetPostShift_6(double id0);
  public void SetPostShift(double id0)
  {
    SetPostShift_6(id0);
  }

  private native double GetPostShift_7();
  public double GetPostShift()
  {
    return GetPostShift_7();
  }

  private native void SetScale_8(double id0);
  public void SetScale(double id0)
  {
    SetScale_8(id0);
  }

  private native double GetScale_9();
  public double GetScale()
  {
    return GetScale_9();
  }

  private native void SetPeriodic_10(int id0);
  public void SetPeriodic(int id0)
  {
    SetPeriodic_10(id0);
  }

  private native int GetPeriodic_11();
  public int GetPeriodic()
  {
    return GetPeriodic_11();
  }

  private native void PeriodicOn_12();
  public void PeriodicOn()
  {
    PeriodicOn_12();
  }

  private native void PeriodicOff_13();
  public void PeriodicOff()
  {
    PeriodicOff_13();
  }

  private native void SetPeriodicEndCorrection_14(int id0);
  public void SetPeriodicEndCorrection(int id0)
  {
    SetPeriodicEndCorrection_14(id0);
  }

  private native int GetPeriodicEndCorrection_15();
  public int GetPeriodicEndCorrection()
  {
    return GetPeriodicEndCorrection_15();
  }

  private native void PeriodicEndCorrectionOn_16();
  public void PeriodicEndCorrectionOn()
  {
    PeriodicEndCorrectionOn_16();
  }

  private native void PeriodicEndCorrectionOff_17();
  public void PeriodicEndCorrectionOff()
  {
    PeriodicEndCorrectionOff_17();
  }

  private native void SetMaximumNumberOfPeriods_18(double id0);
  public void SetMaximumNumberOfPeriods(double id0)
  {
    SetMaximumNumberOfPeriods_18(id0);
  }

  private native double GetMaximumNumberOfPeriods_19();
  public double GetMaximumNumberOfPeriods()
  {
    return GetMaximumNumberOfPeriods_19();
  }

  public vtkTemporalShiftScale() { super(); }

  public vtkTemporalShiftScale(long id) { super(id); }
  public native long   VTKInit();

}
