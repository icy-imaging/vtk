// java wrapper for vtkFileOutputWindow object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFileOutputWindow extends vtkOutputWindow
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

  private native void DisplayText_4(byte[] id0, int len0);
  public void DisplayText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DisplayText_4(bytes0, bytes0.length);
  }

  private native void SetFileName_5(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_5(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_6();
  public String GetFileName()
  {
    return new String(GetFileName_6(), StandardCharsets.UTF_8);
  }

  private native void SetFlush_7(int id0);
  public void SetFlush(int id0)
  {
    SetFlush_7(id0);
  }

  private native int GetFlush_8();
  public int GetFlush()
  {
    return GetFlush_8();
  }

  private native void FlushOn_9();
  public void FlushOn()
  {
    FlushOn_9();
  }

  private native void FlushOff_10();
  public void FlushOff()
  {
    FlushOff_10();
  }

  private native void SetAppend_11(int id0);
  public void SetAppend(int id0)
  {
    SetAppend_11(id0);
  }

  private native int GetAppend_12();
  public int GetAppend()
  {
    return GetAppend_12();
  }

  private native void AppendOn_13();
  public void AppendOn()
  {
    AppendOn_13();
  }

  private native void AppendOff_14();
  public void AppendOff()
  {
    AppendOff_14();
  }

  public vtkFileOutputWindow() { super(); }

  public vtkFileOutputWindow(long id) { super(id); }
  public native long   VTKInit();

}
