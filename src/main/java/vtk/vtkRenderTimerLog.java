// java wrapper for vtkRenderTimerLog object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRenderTimerLog extends vtkObject
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

  private native boolean IsSupported_4();
  public boolean IsSupported()
  {
    return IsSupported_4();
  }

  private native void MarkFrame_5();
  public void MarkFrame()
  {
    MarkFrame_5();
  }

  private native void MarkStartEvent_6(byte[] id0, int len0);
  public void MarkStartEvent(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    MarkStartEvent_6(bytes0, bytes0.length);
  }

  private native void MarkEndEvent_7();
  public void MarkEndEvent()
  {
    MarkEndEvent_7();
  }

  private native boolean FrameReady_8();
  public boolean FrameReady()
  {
    return FrameReady_8();
  }

  private native void SetLoggingEnabled_9(boolean id0);
  public void SetLoggingEnabled(boolean id0)
  {
    SetLoggingEnabled_9(id0);
  }

  private native boolean GetLoggingEnabled_10();
  public boolean GetLoggingEnabled()
  {
    return GetLoggingEnabled_10();
  }

  private native void LoggingEnabledOn_11();
  public void LoggingEnabledOn()
  {
    LoggingEnabledOn_11();
  }

  private native void LoggingEnabledOff_12();
  public void LoggingEnabledOff()
  {
    LoggingEnabledOff_12();
  }

  private native void SetFrameLimit_13(int id0);
  public void SetFrameLimit(int id0)
  {
    SetFrameLimit_13(id0);
  }

  private native int GetFrameLimit_14();
  public int GetFrameLimit()
  {
    return GetFrameLimit_14();
  }

  private native void ReleaseGraphicsResources_15();
  public void ReleaseGraphicsResources()
  {
    ReleaseGraphicsResources_15();
  }

  public vtkRenderTimerLog() { super(); }

  public vtkRenderTimerLog(long id) { super(id); }
  public native long   VTKInit();

}
