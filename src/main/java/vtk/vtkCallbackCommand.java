// java wrapper for vtkCallbackCommand object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCallbackCommand extends vtkCommand
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

  private native void SetAbortFlagOnExecute_4(int id0);
  public void SetAbortFlagOnExecute(int id0)
  {
    SetAbortFlagOnExecute_4(id0);
  }

  private native int GetAbortFlagOnExecute_5();
  public int GetAbortFlagOnExecute()
  {
    return GetAbortFlagOnExecute_5();
  }

  private native void AbortFlagOnExecuteOn_6();
  public void AbortFlagOnExecuteOn()
  {
    AbortFlagOnExecuteOn_6();
  }

  private native void AbortFlagOnExecuteOff_7();
  public void AbortFlagOnExecuteOff()
  {
    AbortFlagOnExecuteOff_7();
  }

  public vtkCallbackCommand() { super(); }

  public vtkCallbackCommand(long id) { super(id); }
  public native long   VTKInit();

}
