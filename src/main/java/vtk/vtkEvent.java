// java wrapper for vtkEvent object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEvent extends vtkObject
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

  private native void SetEventId_4(long id0);
  public void SetEventId(long id0)
  {
    SetEventId_4(id0);
  }

  private native long GetEventId_5();
  public long GetEventId()
  {
    return GetEventId_5();
  }

  private native void SetModifier_6(int id0);
  public void SetModifier(int id0)
  {
    SetModifier_6(id0);
  }

  private native int GetModifier_7();
  public int GetModifier()
  {
    return GetModifier_7();
  }

  private native void SetKeyCode_8(char id0);
  public void SetKeyCode(char id0)
  {
    SetKeyCode_8(id0);
  }

  private native char GetKeyCode_9();
  public char GetKeyCode()
  {
    return GetKeyCode_9();
  }

  private native void SetRepeatCount_10(int id0);
  public void SetRepeatCount(int id0)
  {
    SetRepeatCount_10(id0);
  }

  private native int GetRepeatCount_11();
  public int GetRepeatCount()
  {
    return GetRepeatCount_11();
  }

  private native void SetKeySym_12(byte[] id0, int len0);
  public void SetKeySym(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetKeySym_12(bytes0, bytes0.length);
  }

  private native byte[] GetKeySym_13();
  public String GetKeySym()
  {
    return new String(GetKeySym_13(), StandardCharsets.UTF_8);
  }

  private native int GetModifier_14(vtkRenderWindowInteractor id0);
  public int GetModifier(vtkRenderWindowInteractor id0)
  {
    return GetModifier_14(id0);
  }

  public vtkEvent() { super(); }

  public vtkEvent(long id) { super(id); }
  public native long   VTKInit();

}
