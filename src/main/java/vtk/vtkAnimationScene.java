// java wrapper for vtkAnimationScene object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAnimationScene extends vtkAnimationCue
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

  private native void SetPlayMode_4(int id0);
  public void SetPlayMode(int id0)
  {
    SetPlayMode_4(id0);
  }

  private native void SetModeToSequence_5();
  public void SetModeToSequence()
  {
    SetModeToSequence_5();
  }

  private native void SetModeToRealTime_6();
  public void SetModeToRealTime()
  {
    SetModeToRealTime_6();
  }

  private native int GetPlayMode_7();
  public int GetPlayMode()
  {
    return GetPlayMode_7();
  }

  private native void SetFrameRate_8(double id0);
  public void SetFrameRate(double id0)
  {
    SetFrameRate_8(id0);
  }

  private native double GetFrameRate_9();
  public double GetFrameRate()
  {
    return GetFrameRate_9();
  }

  private native void AddCue_10(vtkAnimationCue id0);
  public void AddCue(vtkAnimationCue id0)
  {
    AddCue_10(id0);
  }

  private native void RemoveCue_11(vtkAnimationCue id0);
  public void RemoveCue(vtkAnimationCue id0)
  {
    RemoveCue_11(id0);
  }

  private native void RemoveAllCues_12();
  public void RemoveAllCues()
  {
    RemoveAllCues_12();
  }

  private native int GetNumberOfCues_13();
  public int GetNumberOfCues()
  {
    return GetNumberOfCues_13();
  }

  private native void Play_14();
  public void Play()
  {
    Play_14();
  }

  private native void Stop_15();
  public void Stop()
  {
    Stop_15();
  }

  private native void SetLoop_16(int id0);
  public void SetLoop(int id0)
  {
    SetLoop_16(id0);
  }

  private native int GetLoop_17();
  public int GetLoop()
  {
    return GetLoop_17();
  }

  private native void SetAnimationTime_18(double id0);
  public void SetAnimationTime(double id0)
  {
    SetAnimationTime_18(id0);
  }

  private native void SetTimeMode_19(int id0);
  public void SetTimeMode(int id0)
  {
    SetTimeMode_19(id0);
  }

  private native int IsInPlay_20();
  public int IsInPlay()
  {
    return IsInPlay_20();
  }

  public vtkAnimationScene() { super(); }

  public vtkAnimationScene(long id) { super(id); }
  public native long   VTKInit();

}
