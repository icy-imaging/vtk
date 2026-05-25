// java wrapper for vtkTimerLog object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTimerLog extends vtkObject
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

  private native void SetLogging_4(int id0);
  public void SetLogging(int id0)
  {
    SetLogging_4(id0);
  }

  private native int GetLogging_5();
  public int GetLogging()
  {
    return GetLogging_5();
  }

  private native void LoggingOn_6();
  public void LoggingOn()
  {
    LoggingOn_6();
  }

  private native void LoggingOff_7();
  public void LoggingOff()
  {
    LoggingOff_7();
  }

  private native void SetMaxEntries_8(int id0);
  public void SetMaxEntries(int id0)
  {
    SetMaxEntries_8(id0);
  }

  private native int GetMaxEntries_9();
  public int GetMaxEntries()
  {
    return GetMaxEntries_9();
  }

  private native void DumpLog_10(byte[] id0, int len0);
  public void DumpLog(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DumpLog_10(bytes0, bytes0.length);
  }

  private native void MarkStartEvent_11(byte[] id0, int len0);
  public void MarkStartEvent(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    MarkStartEvent_11(bytes0, bytes0.length);
  }

  private native void MarkEndEvent_12(byte[] id0, int len0);
  public void MarkEndEvent(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    MarkEndEvent_12(bytes0, bytes0.length);
  }

  private native void InsertTimedEvent_13(byte[] id0, int len0,double id1,int id2);
  public void InsertTimedEvent(String id0,double id1,int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    InsertTimedEvent_13(bytes0, bytes0.length,id1,id2);
  }

  private native int GetNumberOfEvents_14();
  public int GetNumberOfEvents()
  {
    return GetNumberOfEvents_14();
  }

  private native int GetEventIndent_15(int id0);
  public int GetEventIndent(int id0)
  {
    return GetEventIndent_15(id0);
  }

  private native double GetEventWallTime_16(int id0);
  public double GetEventWallTime(int id0)
  {
    return GetEventWallTime_16(id0);
  }

  private native byte[] GetEventString_17(int id0);
  public String GetEventString(int id0)
  {
    return new String(GetEventString_17(id0), StandardCharsets.UTF_8);
  }

  private native int GetEventType_18(int id0);
  public int GetEventType(int id0)
  {
    return GetEventType_18(id0);
  }

  private native void MarkEvent_19(byte[] id0, int len0);
  public void MarkEvent(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    MarkEvent_19(bytes0, bytes0.length);
  }

  private native void ResetLog_20();
  public void ResetLog()
  {
    ResetLog_20();
  }

  private native void CleanupLog_21();
  public void CleanupLog()
  {
    CleanupLog_21();
  }

  private native double GetUniversalTime_22();
  public double GetUniversalTime()
  {
    return GetUniversalTime_22();
  }

  private native double GetCPUTime_23();
  public double GetCPUTime()
  {
    return GetCPUTime_23();
  }

  private native void StartTimer_24();
  public void StartTimer()
  {
    StartTimer_24();
  }

  private native void StopTimer_25();
  public void StopTimer()
  {
    StopTimer_25();
  }

  private native double GetElapsedTime_26();
  public double GetElapsedTime()
  {
    return GetElapsedTime_26();
  }

  public vtkTimerLog() { super(); }

  public vtkTimerLog(long id) { super(id); }
  public native long   VTKInit();

}
