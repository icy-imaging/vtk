// java wrapper for vtkSliderRepresentation2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSliderRepresentation2D extends vtkSliderRepresentation
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

  private native long GetPoint1Coordinate_4();
  public vtkCoordinate GetPoint1Coordinate()
  {
    long temp = GetPoint1Coordinate_4();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPoint2Coordinate_5();
  public vtkCoordinate GetPoint2Coordinate()
  {
    long temp = GetPoint2Coordinate_5();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTitleText_6(byte[] id0, int len0);
  public void SetTitleText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitleText_6(bytes0, bytes0.length);
  }

  private native byte[] GetTitleText_7();
  public String GetTitleText()
  {
    return new String(GetTitleText_7(), StandardCharsets.UTF_8);
  }

  private native long GetSliderProperty_8();
  public vtkProperty2D GetSliderProperty()
  {
    long temp = GetSliderProperty_8();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTubeProperty_9();
  public vtkProperty2D GetTubeProperty()
  {
    long temp = GetTubeProperty_9();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCapProperty_10();
  public vtkProperty2D GetCapProperty()
  {
    long temp = GetCapProperty_10();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedProperty_11();
  public vtkProperty2D GetSelectedProperty()
  {
    long temp = GetSelectedProperty_11();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLabelProperty_12();
  public vtkTextProperty GetLabelProperty()
  {
    long temp = GetLabelProperty_12();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTitleProperty_13();
  public vtkTextProperty GetTitleProperty()
  {
    long temp = GetTitleProperty_13();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void PlaceWidget_14(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_14(id0);
  }

  private native void BuildRepresentation_15();
  public void BuildRepresentation()
  {
    BuildRepresentation_15();
  }

  private native void StartWidgetInteraction_16(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_16(id0);
  }

  private native void WidgetInteraction_17(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_17(id0);
  }

  private native void Highlight_18(int id0);
  public void Highlight(int id0)
  {
    Highlight_18(id0);
  }

  private native void GetActors2D_19(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_19(id0);
  }

  private native void ReleaseGraphicsResources_20(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_20(id0);
  }

  private native int RenderOverlay_21(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_21(id0);
  }

  private native int RenderOpaqueGeometry_22(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_22(id0);
  }

  public vtkSliderRepresentation2D() { super(); }

  public vtkSliderRepresentation2D(long id) { super(id); }
  public native long   VTKInit();

}
