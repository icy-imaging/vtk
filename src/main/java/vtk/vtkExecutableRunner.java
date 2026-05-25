// java wrapper for vtkExecutableRunner object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExecutableRunner extends vtkObject
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

  private native void Execute_4();
  public void Execute()
  {
    Execute_4();
  }

  private native void SetTimeout_5(double id0);
  public void SetTimeout(double id0)
  {
    SetTimeout_5(id0);
  }

  private native double GetTimeout_6();
  public double GetTimeout()
  {
    return GetTimeout_6();
  }

  private native void SetRightTrimResult_7(boolean id0);
  public void SetRightTrimResult(boolean id0)
  {
    SetRightTrimResult_7(id0);
  }

  private native boolean GetRightTrimResult_8();
  public boolean GetRightTrimResult()
  {
    return GetRightTrimResult_8();
  }

  private native void RightTrimResultOn_9();
  public void RightTrimResultOn()
  {
    RightTrimResultOn_9();
  }

  private native void RightTrimResultOff_10();
  public void RightTrimResultOff()
  {
    RightTrimResultOff_10();
  }

  private native byte[] GetCommand_11();
  public String GetCommand()
  {
    return new String(GetCommand_11(), StandardCharsets.UTF_8);
  }

  private native void SetCommand_12(byte[] id0, int len0);
  public void SetCommand(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCommand_12(bytes0, bytes0.length);
  }

  private native void SetExecuteInSystemShell_13(boolean id0);
  public void SetExecuteInSystemShell(boolean id0)
  {
    SetExecuteInSystemShell_13(id0);
  }

  private native boolean GetExecuteInSystemShell_14();
  public boolean GetExecuteInSystemShell()
  {
    return GetExecuteInSystemShell_14();
  }

  private native void ExecuteInSystemShellOn_15();
  public void ExecuteInSystemShellOn()
  {
    ExecuteInSystemShellOn_15();
  }

  private native void ExecuteInSystemShellOff_16();
  public void ExecuteInSystemShellOff()
  {
    ExecuteInSystemShellOff_16();
  }

  private native void AddArgument_17(byte[] id0, int len0);
  public void AddArgument(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddArgument_17(bytes0, bytes0.length);
  }

  private native void ClearArguments_18();
  public void ClearArguments()
  {
    ClearArguments_18();
  }

  private native long GetNumberOfArguments_19();
  public long GetNumberOfArguments()
  {
    return GetNumberOfArguments_19();
  }

  private native byte[] GetStdOut_20();
  public String GetStdOut()
  {
    return new String(GetStdOut_20(), StandardCharsets.UTF_8);
  }

  private native byte[] GetStdErr_21();
  public String GetStdErr()
  {
    return new String(GetStdErr_21(), StandardCharsets.UTF_8);
  }

  private native int GetReturnValue_22();
  public int GetReturnValue()
  {
    return GetReturnValue_22();
  }

  public vtkExecutableRunner() { super(); }

  public vtkExecutableRunner(long id) { super(id); }
  public native long   VTKInit();

}
