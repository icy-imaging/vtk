// java wrapper for vtkAnimationCue object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAnimationCue extends vtkObject
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

  private native void SetTimeMode_4(int id0);
  public void SetTimeMode(int id0)
  {
    SetTimeMode_4(id0);
  }

  private native int GetTimeMode_5();
  public int GetTimeMode()
  {
    return GetTimeMode_5();
  }

  private native void SetTimeModeToRelative_6();
  public void SetTimeModeToRelative()
  {
    SetTimeModeToRelative_6();
  }

  private native void SetTimeModeToNormalized_7();
  public void SetTimeModeToNormalized()
  {
    SetTimeModeToNormalized_7();
  }

  private native void SetStartTime_8(double id0);
  public void SetStartTime(double id0)
  {
    SetStartTime_8(id0);
  }

  private native double GetStartTime_9();
  public double GetStartTime()
  {
    return GetStartTime_9();
  }

  private native void SetEndTime_10(double id0);
  public void SetEndTime(double id0)
  {
    SetEndTime_10(id0);
  }

  private native double GetEndTime_11();
  public double GetEndTime()
  {
    return GetEndTime_11();
  }

  private native void Tick_12(double id0,double id1,double id2);
  public void Tick(double id0,double id1,double id2)
  {
    Tick_12(id0,id1,id2);
  }

  private native void Initialize_13();
  public void Initialize()
  {
    Initialize_13();
  }

  private native void Finalize_14();
  public void Finalize()
  {
    Finalize_14();
  }

  private native double GetAnimationTime_15();
  public double GetAnimationTime()
  {
    return GetAnimationTime_15();
  }

  private native double GetDeltaTime_16();
  public double GetDeltaTime()
  {
    return GetDeltaTime_16();
  }

  private native double GetClockTime_17();
  public double GetClockTime()
  {
    return GetClockTime_17();
  }

  private native void SetDirection_18(int id0);
  public void SetDirection(int id0)
  {
    SetDirection_18(id0);
  }

  private native int GetDirection_19();
  public int GetDirection()
  {
    return GetDirection_19();
  }

  public vtkAnimationCue() { super(); }

  public vtkAnimationCue(long id) { super(id); }
  public native long   VTKInit();

}
