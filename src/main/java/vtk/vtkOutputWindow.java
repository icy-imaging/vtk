// java wrapper for vtkOutputWindow object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOutputWindow extends vtkObject
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

  private native long GetInstance_4();
  public vtkOutputWindow GetInstance()
  {
    long temp = GetInstance_4();

    if (temp == 0) return null;
    return (vtkOutputWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInstance_5(vtkOutputWindow id0);
  public void SetInstance(vtkOutputWindow id0)
  {
    SetInstance_5(id0);
  }

  private native void DisplayText_6(byte[] id0, int len0);
  public void DisplayText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DisplayText_6(bytes0, bytes0.length);
  }

  private native void DisplayErrorText_7(byte[] id0, int len0);
  public void DisplayErrorText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DisplayErrorText_7(bytes0, bytes0.length);
  }

  private native void DisplayWarningText_8(byte[] id0, int len0);
  public void DisplayWarningText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DisplayWarningText_8(bytes0, bytes0.length);
  }

  private native void DisplayGenericWarningText_9(byte[] id0, int len0);
  public void DisplayGenericWarningText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DisplayGenericWarningText_9(bytes0, bytes0.length);
  }

  private native void DisplayDebugText_10(byte[] id0, int len0);
  public void DisplayDebugText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    DisplayDebugText_10(bytes0, bytes0.length);
  }

  private native void PromptUserOn_11();
  public void PromptUserOn()
  {
    PromptUserOn_11();
  }

  private native void PromptUserOff_12();
  public void PromptUserOff()
  {
    PromptUserOff_12();
  }

  private native void SetPromptUser_13(boolean id0);
  public void SetPromptUser(boolean id0)
  {
    SetPromptUser_13(id0);
  }

  private native void SetDisplayMode_14(int id0);
  public void SetDisplayMode(int id0)
  {
    SetDisplayMode_14(id0);
  }

  private native int GetDisplayModeMinValue_15();
  public int GetDisplayModeMinValue()
  {
    return GetDisplayModeMinValue_15();
  }

  private native int GetDisplayModeMaxValue_16();
  public int GetDisplayModeMaxValue()
  {
    return GetDisplayModeMaxValue_16();
  }

  private native int GetDisplayMode_17();
  public int GetDisplayMode()
  {
    return GetDisplayMode_17();
  }

  private native void SetDisplayModeToDefault_18();
  public void SetDisplayModeToDefault()
  {
    SetDisplayModeToDefault_18();
  }

  private native void SetDisplayModeToNever_19();
  public void SetDisplayModeToNever()
  {
    SetDisplayModeToNever_19();
  }

  private native void SetDisplayModeToAlways_20();
  public void SetDisplayModeToAlways()
  {
    SetDisplayModeToAlways_20();
  }

  private native void SetDisplayModeToAlwaysStdErr_21();
  public void SetDisplayModeToAlwaysStdErr()
  {
    SetDisplayModeToAlwaysStdErr_21();
  }

  public vtkOutputWindow() { super(); }

  public vtkOutputWindow(long id) { super(id); }
  public native long   VTKInit();

}
