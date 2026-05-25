// java wrapper for vtkInteractorEventRecorder object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInteractorEventRecorder extends vtkInteractorObserver
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

  private native void SetEnabled_4(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_4(id0);
  }

  private native void SetInteractor_5(vtkRenderWindowInteractor id0);
  public void SetInteractor(vtkRenderWindowInteractor id0)
  {
    SetInteractor_5(id0);
  }

  private native void SetFileName_6(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_6(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_7();
  public String GetFileName()
  {
    return new String(GetFileName_7(), StandardCharsets.UTF_8);
  }

  private native void Record_8();
  public void Record()
  {
    Record_8();
  }

  private native void Play_9();
  public void Play()
  {
    Play_9();
  }

  private native void Stop_10();
  public void Stop()
  {
    Stop_10();
  }

  private native void Clear_11();
  public void Clear()
  {
    Clear_11();
  }

  private native void Rewind_12();
  public void Rewind()
  {
    Rewind_12();
  }

  private native void SetReadFromInputString_13(int id0);
  public void SetReadFromInputString(int id0)
  {
    SetReadFromInputString_13(id0);
  }

  private native int GetReadFromInputString_14();
  public int GetReadFromInputString()
  {
    return GetReadFromInputString_14();
  }

  private native void ReadFromInputStringOn_15();
  public void ReadFromInputStringOn()
  {
    ReadFromInputStringOn_15();
  }

  private native void ReadFromInputStringOff_16();
  public void ReadFromInputStringOff()
  {
    ReadFromInputStringOff_16();
  }

  private native void SetInputString_17(byte[] id0, int len0);
  public void SetInputString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputString_17(bytes0, bytes0.length);
  }

  private native byte[] GetInputString_18();
  public String GetInputString()
  {
    return new String(GetInputString_18(), StandardCharsets.UTF_8);
  }

  public vtkInteractorEventRecorder() { super(); }

  public vtkInteractorEventRecorder(long id) { super(id); }
  public native long   VTKInit();

}
