// java wrapper for vtkAnimateModes object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAnimateModes extends vtkPassInputTypeAlgorithm
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

  private native void SetAnimateVibrations_4(boolean id0);
  public void SetAnimateVibrations(boolean id0)
  {
    SetAnimateVibrations_4(id0);
  }

  private native boolean GetAnimateVibrations_5();
  public boolean GetAnimateVibrations()
  {
    return GetAnimateVibrations_5();
  }

  private native void AnimateVibrationsOn_6();
  public void AnimateVibrationsOn()
  {
    AnimateVibrationsOn_6();
  }

  private native void AnimateVibrationsOff_7();
  public void AnimateVibrationsOff()
  {
    AnimateVibrationsOff_7();
  }

  private native int[] GetModeShapesRange_8();
  public int[] GetModeShapesRange()
  {
    return GetModeShapesRange_8();
  }

  private native void SetModeShape_9(int id0);
  public void SetModeShape(int id0)
  {
    SetModeShape_9(id0);
  }

  private native int GetModeShapeMinValue_10();
  public int GetModeShapeMinValue()
  {
    return GetModeShapeMinValue_10();
  }

  private native int GetModeShapeMaxValue_11();
  public int GetModeShapeMaxValue()
  {
    return GetModeShapeMaxValue_11();
  }

  private native int GetModeShape_12();
  public int GetModeShape()
  {
    return GetModeShape_12();
  }

  private native void SetDisplacementPreapplied_13(boolean id0);
  public void SetDisplacementPreapplied(boolean id0)
  {
    SetDisplacementPreapplied_13(id0);
  }

  private native boolean GetDisplacementPreapplied_14();
  public boolean GetDisplacementPreapplied()
  {
    return GetDisplacementPreapplied_14();
  }

  private native void DisplacementPreappliedOn_15();
  public void DisplacementPreappliedOn()
  {
    DisplacementPreappliedOn_15();
  }

  private native void DisplacementPreappliedOff_16();
  public void DisplacementPreappliedOff()
  {
    DisplacementPreappliedOff_16();
  }

  private native void SetDisplacementMagnitude_17(double id0);
  public void SetDisplacementMagnitude(double id0)
  {
    SetDisplacementMagnitude_17(id0);
  }

  private native double GetDisplacementMagnitude_18();
  public double GetDisplacementMagnitude()
  {
    return GetDisplacementMagnitude_18();
  }

  private native double[] GetTimeRange_19();
  public double[] GetTimeRange()
  {
    return GetTimeRange_19();
  }

  public vtkAnimateModes() { super(); }

  public vtkAnimateModes(long id) { super(id); }
  public native long   VTKInit();

}
