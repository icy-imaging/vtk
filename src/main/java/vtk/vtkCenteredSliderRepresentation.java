// java wrapper for vtkCenteredSliderRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCenteredSliderRepresentation extends vtkSliderRepresentation
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

  private native long GetTubeProperty_8();
  public vtkProperty2D GetTubeProperty()
  {
    long temp = GetTubeProperty_8();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSliderProperty_9();
  public vtkProperty2D GetSliderProperty()
  {
    long temp = GetSliderProperty_9();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedProperty_10();
  public vtkProperty2D GetSelectedProperty()
  {
    long temp = GetSelectedProperty_10();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLabelProperty_11();
  public vtkTextProperty GetLabelProperty()
  {
    long temp = GetLabelProperty_11();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void PlaceWidget_12(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_12(id0);
  }

  private native void BuildRepresentation_13();
  public void BuildRepresentation()
  {
    BuildRepresentation_13();
  }

  private native void StartWidgetInteraction_14(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_14(id0);
  }

  private native int ComputeInteractionState_15(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_15(id0,id1,id2);
  }

  private native void WidgetInteraction_16(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_16(id0);
  }

  private native void Highlight_17(int id0);
  public void Highlight(int id0)
  {
    Highlight_17(id0);
  }

  private native void GetActors_18(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_18(id0);
  }

  private native void ReleaseGraphicsResources_19(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_19(id0);
  }

  private native int RenderOverlay_20(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_20(id0);
  }

  private native int RenderOpaqueGeometry_21(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_21(id0);
  }

  public vtkCenteredSliderRepresentation() { super(); }

  public vtkCenteredSliderRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
