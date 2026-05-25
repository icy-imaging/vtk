// java wrapper for vtkSliderRepresentation3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSliderRepresentation3D extends vtkSliderRepresentation
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

  private native void SetPoint1InWorldCoordinates_5(double id0,double id1,double id2);
  public void SetPoint1InWorldCoordinates(double id0,double id1,double id2)
  {
    SetPoint1InWorldCoordinates_5(id0,id1,id2);
  }

  private native long GetPoint2Coordinate_6();
  public vtkCoordinate GetPoint2Coordinate()
  {
    long temp = GetPoint2Coordinate_6();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPoint2InWorldCoordinates_7(double id0,double id1,double id2);
  public void SetPoint2InWorldCoordinates(double id0,double id1,double id2)
  {
    SetPoint2InWorldCoordinates_7(id0,id1,id2);
  }

  private native void SetTitleText_8(byte[] id0, int len0);
  public void SetTitleText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitleText_8(bytes0, bytes0.length);
  }

  private native byte[] GetTitleText_9();
  public String GetTitleText()
  {
    return new String(GetTitleText_9(), StandardCharsets.UTF_8);
  }

  private native void SetSliderShape_10(int id0);
  public void SetSliderShape(int id0)
  {
    SetSliderShape_10(id0);
  }

  private native int GetSliderShapeMinValue_11();
  public int GetSliderShapeMinValue()
  {
    return GetSliderShapeMinValue_11();
  }

  private native int GetSliderShapeMaxValue_12();
  public int GetSliderShapeMaxValue()
  {
    return GetSliderShapeMaxValue_12();
  }

  private native int GetSliderShape_13();
  public int GetSliderShape()
  {
    return GetSliderShape_13();
  }

  private native void SetSliderShapeToSphere_14();
  public void SetSliderShapeToSphere()
  {
    SetSliderShapeToSphere_14();
  }

  private native void SetSliderShapeToCylinder_15();
  public void SetSliderShapeToCylinder()
  {
    SetSliderShapeToCylinder_15();
  }

  private native void SetRotation_16(double id0);
  public void SetRotation(double id0)
  {
    SetRotation_16(id0);
  }

  private native double GetRotation_17();
  public double GetRotation()
  {
    return GetRotation_17();
  }

  private native long GetSliderProperty_18();
  public vtkProperty GetSliderProperty()
  {
    long temp = GetSliderProperty_18();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTubeProperty_19();
  public vtkProperty GetTubeProperty()
  {
    long temp = GetTubeProperty_19();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCapProperty_20();
  public vtkProperty GetCapProperty()
  {
    long temp = GetCapProperty_20();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedProperty_21();
  public vtkProperty GetSelectedProperty()
  {
    long temp = GetSelectedProperty_21();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void PlaceWidget_22(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_22(id0);
  }

  private native void BuildRepresentation_23();
  public void BuildRepresentation()
  {
    BuildRepresentation_23();
  }

  private native void StartWidgetInteraction_24(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_24(id0);
  }

  private native void WidgetInteraction_25(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_25(id0);
  }

  private native void Highlight_26(int id0);
  public void Highlight(int id0)
  {
    Highlight_26(id0);
  }

  private native double[] GetBounds_27();
  public double[] GetBounds()
  {
    return GetBounds_27();
  }

  private native void GetActors_28(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_28(id0);
  }

  private native void ReleaseGraphicsResources_29(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_29(id0);
  }

  private native int RenderOpaqueGeometry_30(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_30(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_31(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_31(id0);
  }

  private native int HasTranslucentPolygonalGeometry_32();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_32();
  }

  private native long GetMTime_33();
  public long GetMTime()
  {
    return GetMTime_33();
  }

  private native void RegisterPickers_34();
  public void RegisterPickers()
  {
    RegisterPickers_34();
  }

  public vtkSliderRepresentation3D() { super(); }

  public vtkSliderRepresentation3D(long id) { super(id); }
  public native long   VTKInit();

}
