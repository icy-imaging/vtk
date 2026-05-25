// java wrapper for vtkCameraOrientationWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCameraOrientationWidget extends vtkAbstractWidget
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

  private native void SetAnimate_4(boolean id0);
  public void SetAnimate(boolean id0)
  {
    SetAnimate_4(id0);
  }

  private native boolean GetAnimate_5();
  public boolean GetAnimate()
  {
    return GetAnimate_5();
  }

  private native void AnimateOn_6();
  public void AnimateOn()
  {
    AnimateOn_6();
  }

  private native void AnimateOff_7();
  public void AnimateOff()
  {
    AnimateOff_7();
  }

  private native void SetAnimatorTotalFrames_8(int id0);
  public void SetAnimatorTotalFrames(int id0)
  {
    SetAnimatorTotalFrames_8(id0);
  }

  private native int GetAnimatorTotalFramesMinValue_9();
  public int GetAnimatorTotalFramesMinValue()
  {
    return GetAnimatorTotalFramesMinValue_9();
  }

  private native int GetAnimatorTotalFramesMaxValue_10();
  public int GetAnimatorTotalFramesMaxValue()
  {
    return GetAnimatorTotalFramesMaxValue_10();
  }

  private native int GetAnimatorTotalFrames_11();
  public int GetAnimatorTotalFrames()
  {
    return GetAnimatorTotalFrames_11();
  }

  private native void CreateDefaultRepresentation_12();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_12();
  }

  private native void SquareResize_13();
  public void SquareResize()
  {
    SquareResize_13();
  }

  private native void SetParentRenderer_14(vtkRenderer id0);
  public void SetParentRenderer(vtkRenderer id0)
  {
    SetParentRenderer_14(id0);
  }

  private native long GetParentRenderer_15();
  public vtkRenderer GetParentRenderer()
  {
    long temp = GetParentRenderer_15();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkCameraOrientationWidget() { super(); }

  public vtkCameraOrientationWidget(long id) { super(id); }
  public native long   VTKInit();

}
