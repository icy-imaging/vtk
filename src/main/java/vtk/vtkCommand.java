// java wrapper for vtkCommand object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCommand extends vtkObjectBase
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

  private native void UnRegister_4();
  public void UnRegister()
  {
    UnRegister_4();
  }

  private native byte[] GetStringFromEventId_5(long id0);
  public String GetStringFromEventId(long id0)
  {
    return new String(GetStringFromEventId_5(id0), StandardCharsets.UTF_8);
  }

  private native long GetEventIdFromString_6(byte[] id0, int len0);
  public long GetEventIdFromString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetEventIdFromString_6(bytes0, bytes0.length);
  }

  private native boolean EventHasData_7(long id0);
  public boolean EventHasData(long id0)
  {
    return EventHasData_7(id0);
  }

  private native void SetAbortFlag_8(int id0);
  public void SetAbortFlag(int id0)
  {
    SetAbortFlag_8(id0);
  }

  private native int GetAbortFlag_9();
  public int GetAbortFlag()
  {
    return GetAbortFlag_9();
  }

  private native void AbortFlagOn_10();
  public void AbortFlagOn()
  {
    AbortFlagOn_10();
  }

  private native void AbortFlagOff_11();
  public void AbortFlagOff()
  {
    AbortFlagOff_11();
  }

  private native void SetPassiveObserver_12(int id0);
  public void SetPassiveObserver(int id0)
  {
    SetPassiveObserver_12(id0);
  }

  private native int GetPassiveObserver_13();
  public int GetPassiveObserver()
  {
    return GetPassiveObserver_13();
  }

  private native void PassiveObserverOn_14();
  public void PassiveObserverOn()
  {
    PassiveObserverOn_14();
  }

  private native void PassiveObserverOff_15();
  public void PassiveObserverOff()
  {
    PassiveObserverOff_15();
  }

  private native void UnRegister_16(vtkObjectBase id0);
  public void UnRegister(vtkObjectBase id0)
  {
    UnRegister_16(id0);
  }

  public vtkCommand() { super(); }

  public vtkCommand(long id) { super(id); }

}
