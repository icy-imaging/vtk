// java wrapper for vtkObject object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkObject extends vtkObjectBase
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

  private native void DebugOn_4();
  public void DebugOn()
  {
    DebugOn_4();
  }

  private native void DebugOff_5();
  public void DebugOff()
  {
    DebugOff_5();
  }

  private native boolean GetDebug_6();
  public boolean GetDebug()
  {
    return GetDebug_6();
  }

  private native void SetDebug_7(boolean id0);
  public void SetDebug(boolean id0)
  {
    SetDebug_7(id0);
  }

  private native void BreakOnError_8();
  public void BreakOnError()
  {
    BreakOnError_8();
  }

  private native void Modified_9();
  public void Modified()
  {
    Modified_9();
  }

  private native long GetMTime_10();
  public long GetMTime()
  {
    return GetMTime_10();
  }

  private native void SetGlobalWarningDisplay_11(int id0);
  public void SetGlobalWarningDisplay(int id0)
  {
    SetGlobalWarningDisplay_11(id0);
  }

  private native void GlobalWarningDisplayOn_12();
  public void GlobalWarningDisplayOn()
  {
    GlobalWarningDisplayOn_12();
  }

  private native void GlobalWarningDisplayOff_13();
  public void GlobalWarningDisplayOff()
  {
    GlobalWarningDisplayOff_13();
  }

  private native int GetGlobalWarningDisplay_14();
  public int GetGlobalWarningDisplay()
  {
    return GetGlobalWarningDisplay_14();
  }

  private native void RemoveObserver_15(long id0);
  public void RemoveObserver(long id0)
  {
    RemoveObserver_15(id0);
  }

  private native void RemoveObservers_16(long id0);
  public void RemoveObservers(long id0)
  {
    RemoveObservers_16(id0);
  }

  private native void RemoveObservers_17(byte[] id0, int len0);
  public void RemoveObservers(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveObservers_17(bytes0, bytes0.length);
  }

  private native void RemoveAllObservers_18();
  public void RemoveAllObservers()
  {
    RemoveAllObservers_18();
  }

  private native int HasObserver_19(long id0);
  public int HasObserver(long id0)
  {
    return HasObserver_19(id0);
  }

  private native int HasObserver_20(byte[] id0, int len0);
  public int HasObserver(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return HasObserver_20(bytes0, bytes0.length);
  }

  private native int InvokeEvent_21(long id0);
  public int InvokeEvent(long id0)
  {
    return InvokeEvent_21(id0);
  }

  private native int InvokeEvent_22(byte[] id0, int len0);
  public int InvokeEvent(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return InvokeEvent_22(bytes0, bytes0.length);
  }

  private native void SetObjectName_23(byte[] id0, int len0);
  public void SetObjectName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetObjectName_23(bytes0, bytes0.length);
  }

  private native byte[] GetObjectName_24();
  public String GetObjectName()
  {
    return new String(GetObjectName_24(), StandardCharsets.UTF_8);
  }

  private native byte[] GetObjectDescription_25();
  public String GetObjectDescription()
  {
    return new String(GetObjectDescription_25(), StandardCharsets.UTF_8);
  }

  public vtkObject() { super(); }

  public vtkObject(long id) { super(id); }
  public native long   VTKInit();

  private native int AddObserver(byte[] id0, int len0, Object id1, byte[] id2, int len2);
  public int AddObserver(String id0, Object id1, String id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return AddObserver(bytes0, bytes0.length, id1, bytes2, bytes2.length);
  }

}
