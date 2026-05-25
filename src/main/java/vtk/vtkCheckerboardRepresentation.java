// java wrapper for vtkCheckerboardRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCheckerboardRepresentation extends vtkWidgetRepresentation
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

  private native void SetCheckerboard_4(vtkImageCheckerboard id0);
  public void SetCheckerboard(vtkImageCheckerboard id0)
  {
    SetCheckerboard_4(id0);
  }

  private native long GetCheckerboard_5();
  public vtkImageCheckerboard GetCheckerboard()
  {
    long temp = GetCheckerboard_5();

    if (temp == 0) return null;
    return (vtkImageCheckerboard)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetImageActor_6(vtkImageActor id0);
  public void SetImageActor(vtkImageActor id0)
  {
    SetImageActor_6(id0);
  }

  private native long GetImageActor_7();
  public vtkImageActor GetImageActor()
  {
    long temp = GetImageActor_7();

    if (temp == 0) return null;
    return (vtkImageActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCornerOffset_8(double id0);
  public void SetCornerOffset(double id0)
  {
    SetCornerOffset_8(id0);
  }

  private native double GetCornerOffsetMinValue_9();
  public double GetCornerOffsetMinValue()
  {
    return GetCornerOffsetMinValue_9();
  }

  private native double GetCornerOffsetMaxValue_10();
  public double GetCornerOffsetMaxValue()
  {
    return GetCornerOffsetMaxValue_10();
  }

  private native double GetCornerOffset_11();
  public double GetCornerOffset()
  {
    return GetCornerOffset_11();
  }

  private native void SliderValueChanged_12(int id0);
  public void SliderValueChanged(int id0)
  {
    SliderValueChanged_12(id0);
  }

  private native void SetTopRepresentation_13(vtkSliderRepresentation3D id0);
  public void SetTopRepresentation(vtkSliderRepresentation3D id0)
  {
    SetTopRepresentation_13(id0);
  }

  private native void SetRightRepresentation_14(vtkSliderRepresentation3D id0);
  public void SetRightRepresentation(vtkSliderRepresentation3D id0)
  {
    SetRightRepresentation_14(id0);
  }

  private native void SetBottomRepresentation_15(vtkSliderRepresentation3D id0);
  public void SetBottomRepresentation(vtkSliderRepresentation3D id0)
  {
    SetBottomRepresentation_15(id0);
  }

  private native void SetLeftRepresentation_16(vtkSliderRepresentation3D id0);
  public void SetLeftRepresentation(vtkSliderRepresentation3D id0)
  {
    SetLeftRepresentation_16(id0);
  }

  private native long GetTopRepresentation_17();
  public vtkSliderRepresentation3D GetTopRepresentation()
  {
    long temp = GetTopRepresentation_17();

    if (temp == 0) return null;
    return (vtkSliderRepresentation3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRightRepresentation_18();
  public vtkSliderRepresentation3D GetRightRepresentation()
  {
    long temp = GetRightRepresentation_18();

    if (temp == 0) return null;
    return (vtkSliderRepresentation3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBottomRepresentation_19();
  public vtkSliderRepresentation3D GetBottomRepresentation()
  {
    long temp = GetBottomRepresentation_19();

    if (temp == 0) return null;
    return (vtkSliderRepresentation3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLeftRepresentation_20();
  public vtkSliderRepresentation3D GetLeftRepresentation()
  {
    long temp = GetLeftRepresentation_20();

    if (temp == 0) return null;
    return (vtkSliderRepresentation3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildRepresentation_21();
  public void BuildRepresentation()
  {
    BuildRepresentation_21();
  }

  private native void GetActors_22(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_22(id0);
  }

  private native void ReleaseGraphicsResources_23(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_23(id0);
  }

  private native int RenderOverlay_24(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_24(id0);
  }

  private native int RenderOpaqueGeometry_25(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_25(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_26(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_26(id0);
  }

  private native int HasTranslucentPolygonalGeometry_27();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_27();
  }

  public vtkCheckerboardRepresentation() { super(); }

  public vtkCheckerboardRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
