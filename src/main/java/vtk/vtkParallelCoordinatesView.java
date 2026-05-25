// java wrapper for vtkParallelCoordinatesView object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParallelCoordinatesView extends vtkRenderView
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

  private native void SetBrushMode_4(int id0);
  public void SetBrushMode(int id0)
  {
    SetBrushMode_4(id0);
  }

  private native void SetBrushModeToLasso_5();
  public void SetBrushModeToLasso()
  {
    SetBrushModeToLasso_5();
  }

  private native void SetBrushModeToAngle_6();
  public void SetBrushModeToAngle()
  {
    SetBrushModeToAngle_6();
  }

  private native void SetBrushModeToFunction_7();
  public void SetBrushModeToFunction()
  {
    SetBrushModeToFunction_7();
  }

  private native void SetBrushModeToAxisThreshold_8();
  public void SetBrushModeToAxisThreshold()
  {
    SetBrushModeToAxisThreshold_8();
  }

  private native int GetBrushMode_9();
  public int GetBrushMode()
  {
    return GetBrushMode_9();
  }

  private native void SetBrushOperator_10(int id0);
  public void SetBrushOperator(int id0)
  {
    SetBrushOperator_10(id0);
  }

  private native void SetBrushOperatorToAdd_11();
  public void SetBrushOperatorToAdd()
  {
    SetBrushOperatorToAdd_11();
  }

  private native void SetBrushOperatorToSubtract_12();
  public void SetBrushOperatorToSubtract()
  {
    SetBrushOperatorToSubtract_12();
  }

  private native void SetBrushOperatorToIntersect_13();
  public void SetBrushOperatorToIntersect()
  {
    SetBrushOperatorToIntersect_13();
  }

  private native void SetBrushOperatorToReplace_14();
  public void SetBrushOperatorToReplace()
  {
    SetBrushOperatorToReplace_14();
  }

  private native int GetBrushOperator_15();
  public int GetBrushOperator()
  {
    return GetBrushOperator_15();
  }

  private native void SetInspectMode_16(int id0);
  public void SetInspectMode(int id0)
  {
    SetInspectMode_16(id0);
  }

  private native void SetInspectModeToManipulateAxes_17();
  public void SetInspectModeToManipulateAxes()
  {
    SetInspectModeToManipulateAxes_17();
  }

  private native void SetInpsectModeToSelectData_18();
  public void SetInpsectModeToSelectData()
  {
    SetInpsectModeToSelectData_18();
  }

  private native int GetInspectMode_19();
  public int GetInspectMode()
  {
    return GetInspectMode_19();
  }

  private native void SetMaximumNumberOfBrushPoints_20(int id0);
  public void SetMaximumNumberOfBrushPoints(int id0)
  {
    SetMaximumNumberOfBrushPoints_20(id0);
  }

  private native int GetMaximumNumberOfBrushPoints_21();
  public int GetMaximumNumberOfBrushPoints()
  {
    return GetMaximumNumberOfBrushPoints_21();
  }

  private native void SetCurrentBrushClass_22(int id0);
  public void SetCurrentBrushClass(int id0)
  {
    SetCurrentBrushClass_22(id0);
  }

  private native int GetCurrentBrushClass_23();
  public int GetCurrentBrushClass()
  {
    return GetCurrentBrushClass_23();
  }

  private native void ApplyViewTheme_24(vtkViewTheme id0);
  public void ApplyViewTheme(vtkViewTheme id0)
  {
    ApplyViewTheme_24(id0);
  }

  public vtkParallelCoordinatesView() { super(); }

  public vtkParallelCoordinatesView(long id) { super(id); }
  public native long   VTKInit();

}
