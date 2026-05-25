// java wrapper for vtkOpenGLRenderTimerLog object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLRenderTimerLog extends vtkRenderTimerLog
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

  private native boolean GetLoggingEnabled_5();
  public boolean GetLoggingEnabled()
  {
    return GetLoggingEnabled_5();
  }

  private native void MarkFrame_6();
  public void MarkFrame()
  {
    MarkFrame_6();
  }

  private native void MarkStartEvent_7(byte[] id0, int len0);
  public void MarkStartEvent(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    MarkStartEvent_7(bytes0, bytes0.length);
  }

  private native void MarkEndEvent_8();
  public void MarkEndEvent()
  {
    MarkEndEvent_8();
  }

  private native boolean FrameReady_9();
  public boolean FrameReady()
  {
    return FrameReady_9();
  }

  private native void ReleaseGraphicsResources_10();
  public void ReleaseGraphicsResources()
  {
    ReleaseGraphicsResources_10();
  }

  public vtkOpenGLRenderTimerLog() { super(); }

  public vtkOpenGLRenderTimerLog(long id) { super(id); }
  public native long   VTKInit();

}
