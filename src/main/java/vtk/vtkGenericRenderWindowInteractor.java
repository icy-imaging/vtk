// java wrapper for vtkGenericRenderWindowInteractor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericRenderWindowInteractor extends vtkRenderWindowInteractor
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

  private native void TimerEvent_4();
  public void TimerEvent()
  {
    TimerEvent_4();
  }

  private native void SetTimerEventResetsTimer_5(int id0);
  public void SetTimerEventResetsTimer(int id0)
  {
    SetTimerEventResetsTimer_5(id0);
  }

  private native int GetTimerEventResetsTimer_6();
  public int GetTimerEventResetsTimer()
  {
    return GetTimerEventResetsTimer_6();
  }

  private native void TimerEventResetsTimerOn_7();
  public void TimerEventResetsTimerOn()
  {
    TimerEventResetsTimerOn_7();
  }

  private native void TimerEventResetsTimerOff_8();
  public void TimerEventResetsTimerOff()
  {
    TimerEventResetsTimerOff_8();
  }

  public vtkGenericRenderWindowInteractor() { super(); }

  public vtkGenericRenderWindowInteractor(long id) { super(id); }
  public native long   VTKInit();

}
