// java wrapper for vtkSliderWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSliderWidget extends vtkAbstractWidget
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

  private native void SetRepresentation_4(vtkSliderRepresentation id0);
  public void SetRepresentation(vtkSliderRepresentation id0)
  {
    SetRepresentation_4(id0);
  }

  private native long GetSliderRepresentation_5();
  public vtkSliderRepresentation GetSliderRepresentation()
  {
    long temp = GetSliderRepresentation_5();

    if (temp == 0) return null;
    return (vtkSliderRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAnimationMode_6(int id0);
  public void SetAnimationMode(int id0)
  {
    SetAnimationMode_6(id0);
  }

  private native int GetAnimationModeMinValue_7();
  public int GetAnimationModeMinValue()
  {
    return GetAnimationModeMinValue_7();
  }

  private native int GetAnimationModeMaxValue_8();
  public int GetAnimationModeMaxValue()
  {
    return GetAnimationModeMaxValue_8();
  }

  private native int GetAnimationMode_9();
  public int GetAnimationMode()
  {
    return GetAnimationMode_9();
  }

  private native void SetAnimationModeToOff_10();
  public void SetAnimationModeToOff()
  {
    SetAnimationModeToOff_10();
  }

  private native void SetAnimationModeToJump_11();
  public void SetAnimationModeToJump()
  {
    SetAnimationModeToJump_11();
  }

  private native void SetAnimationModeToAnimate_12();
  public void SetAnimationModeToAnimate()
  {
    SetAnimationModeToAnimate_12();
  }

  private native void SetNumberOfAnimationSteps_13(int id0);
  public void SetNumberOfAnimationSteps(int id0)
  {
    SetNumberOfAnimationSteps_13(id0);
  }

  private native int GetNumberOfAnimationStepsMinValue_14();
  public int GetNumberOfAnimationStepsMinValue()
  {
    return GetNumberOfAnimationStepsMinValue_14();
  }

  private native int GetNumberOfAnimationStepsMaxValue_15();
  public int GetNumberOfAnimationStepsMaxValue()
  {
    return GetNumberOfAnimationStepsMaxValue_15();
  }

  private native int GetNumberOfAnimationSteps_16();
  public int GetNumberOfAnimationSteps()
  {
    return GetNumberOfAnimationSteps_16();
  }

  private native void CreateDefaultRepresentation_17();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_17();
  }

  public vtkSliderWidget() { super(); }

  public vtkSliderWidget(long id) { super(id); }
  public native long   VTKInit();

}
