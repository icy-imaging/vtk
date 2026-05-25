// java wrapper for vtkMeasurementCubeHandleRepresentation3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMeasurementCubeHandleRepresentation3D extends vtkHandleRepresentation
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

  private native void SetWorldPosition_4(double id0[]);
  public void SetWorldPosition(double id0[])
  {
    SetWorldPosition_4(id0);
  }

  private native void SetDisplayPosition_5(double id0[]);
  public void SetDisplayPosition(double id0[])
  {
    SetDisplayPosition_5(id0);
  }

  private native long GetHandle_6();
  public vtkPolyData GetHandle()
  {
    long temp = GetHandle_6();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetProperty_7(vtkProperty id0);
  public void SetProperty(vtkProperty id0)
  {
    SetProperty_7(id0);
  }

  private native void SetSelectedProperty_8(vtkProperty id0);
  public void SetSelectedProperty(vtkProperty id0)
  {
    SetSelectedProperty_8(id0);
  }

  private native long GetProperty_9();
  public vtkProperty GetProperty()
  {
    long temp = GetProperty_9();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedProperty_10();
  public vtkProperty GetSelectedProperty()
  {
    long temp = GetSelectedProperty_10();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTransform_11();
  public vtkAbstractTransform GetTransform()
  {
    long temp = GetTransform_11();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildRepresentation_12();
  public void BuildRepresentation()
  {
    BuildRepresentation_12();
  }

  private native void StartWidgetInteraction_13(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_13(id0);
  }

  private native void WidgetInteraction_14(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_14(id0);
  }

  private native int ComputeInteractionState_15(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_15(id0,id1,id2);
  }

  private native void ShallowCopy_16(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_16(id0);
  }

  private native void DeepCopy_17(vtkProp id0);
  public void DeepCopy(vtkProp id0)
  {
    DeepCopy_17(id0);
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

  private native int RenderOpaqueGeometry_20(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_20(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_21(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_21(id0);
  }

  private native int HasTranslucentPolygonalGeometry_22();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_22();
  }

  private native void SetLabelVisibility_23(int id0);
  public void SetLabelVisibility(int id0)
  {
    SetLabelVisibility_23(id0);
  }

  private native int GetLabelVisibility_24();
  public int GetLabelVisibility()
  {
    return GetLabelVisibility_24();
  }

  private native void LabelVisibilityOn_25();
  public void LabelVisibilityOn()
  {
    LabelVisibilityOn_25();
  }

  private native void LabelVisibilityOff_26();
  public void LabelVisibilityOff()
  {
    LabelVisibilityOff_26();
  }

  private native void SetSelectedLabelVisibility_27(int id0);
  public void SetSelectedLabelVisibility(int id0)
  {
    SetSelectedLabelVisibility_27(id0);
  }

  private native int GetSelectedLabelVisibility_28();
  public int GetSelectedLabelVisibility()
  {
    return GetSelectedLabelVisibility_28();
  }

  private native void SelectedLabelVisibilityOn_29();
  public void SelectedLabelVisibilityOn()
  {
    SelectedLabelVisibilityOn_29();
  }

  private native void SelectedLabelVisibilityOff_30();
  public void SelectedLabelVisibilityOff()
  {
    SelectedLabelVisibilityOff_30();
  }

  private native void SetLabelTextInput_31(byte[] id0, int len0);
  public void SetLabelTextInput(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelTextInput_31(bytes0, bytes0.length);
  }

  private native byte[] GetLabelTextInput_32();
  public String GetLabelTextInput()
  {
    return new String(GetLabelTextInput_32(), StandardCharsets.UTF_8);
  }

  private native long GetLabelText_33();
  public vtkBillboardTextActor3D GetLabelText()
  {
    long temp = GetLabelText_33();

    if (temp == 0) return null;
    return (vtkBillboardTextActor3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetHandleVisibility_34(int id0);
  public void SetHandleVisibility(int id0)
  {
    SetHandleVisibility_34(id0);
  }

  private native int GetHandleVisibility_35();
  public int GetHandleVisibility()
  {
    return GetHandleVisibility_35();
  }

  private native void HandleVisibilityOn_36();
  public void HandleVisibilityOn()
  {
    HandleVisibilityOn_36();
  }

  private native void HandleVisibilityOff_37();
  public void HandleVisibilityOff()
  {
    HandleVisibilityOff_37();
  }

  private native void Highlight_38(int id0);
  public void Highlight(int id0)
  {
    Highlight_38(id0);
  }

  private native void SetSmoothMotion_39(int id0);
  public void SetSmoothMotion(int id0)
  {
    SetSmoothMotion_39(id0);
  }

  private native int GetSmoothMotion_40();
  public int GetSmoothMotion()
  {
    return GetSmoothMotion_40();
  }

  private native void SmoothMotionOn_41();
  public void SmoothMotionOn()
  {
    SmoothMotionOn_41();
  }

  private native void SmoothMotionOff_42();
  public void SmoothMotionOff()
  {
    SmoothMotionOff_42();
  }

  private native void SetSideLength_43(double id0);
  public void SetSideLength(double id0)
  {
    SetSideLength_43(id0);
  }

  private native double GetSideLength_44();
  public double GetSideLength()
  {
    return GetSideLength_44();
  }

  private native void SetAdaptiveScaling_45(int id0);
  public void SetAdaptiveScaling(int id0)
  {
    SetAdaptiveScaling_45(id0);
  }

  private native int GetAdaptiveScaling_46();
  public int GetAdaptiveScaling()
  {
    return GetAdaptiveScaling_46();
  }

  private native void AdaptiveScalingOn_47();
  public void AdaptiveScalingOn()
  {
    AdaptiveScalingOn_47();
  }

  private native void AdaptiveScalingOff_48();
  public void AdaptiveScalingOff()
  {
    AdaptiveScalingOff_48();
  }

  private native void SetRescaleFactor_49(double id0);
  public void SetRescaleFactor(double id0)
  {
    SetRescaleFactor_49(id0);
  }

  private native double GetRescaleFactorMinValue_50();
  public double GetRescaleFactorMinValue()
  {
    return GetRescaleFactorMinValue_50();
  }

  private native double GetRescaleFactorMaxValue_51();
  public double GetRescaleFactorMaxValue()
  {
    return GetRescaleFactorMaxValue_51();
  }

  private native double GetRescaleFactor_52();
  public double GetRescaleFactor()
  {
    return GetRescaleFactor_52();
  }

  private native void SetMinRelativeCubeScreenArea_53(double id0);
  public void SetMinRelativeCubeScreenArea(double id0)
  {
    SetMinRelativeCubeScreenArea_53(id0);
  }

  private native double GetMinRelativeCubeScreenArea_54();
  public double GetMinRelativeCubeScreenArea()
  {
    return GetMinRelativeCubeScreenArea_54();
  }

  private native void SetMaxRelativeCubeScreenArea_55(double id0);
  public void SetMaxRelativeCubeScreenArea(double id0)
  {
    SetMaxRelativeCubeScreenArea_55(id0);
  }

  private native double GetMaxRelativeCubeScreenArea_56();
  public double GetMaxRelativeCubeScreenArea()
  {
    return GetMaxRelativeCubeScreenArea_56();
  }

  private native void SetLengthUnit_57(byte[] id0, int len0);
  public void SetLengthUnit(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLengthUnit_57(bytes0, bytes0.length);
  }

  private native byte[] GetLengthUnit_58();
  public String GetLengthUnit()
  {
    return new String(GetLengthUnit_58(), StandardCharsets.UTF_8);
  }

  private native void RegisterPickers_59();
  public void RegisterPickers()
  {
    RegisterPickers_59();
  }

  public vtkMeasurementCubeHandleRepresentation3D() { super(); }

  public vtkMeasurementCubeHandleRepresentation3D(long id) { super(id); }
  public native long   VTKInit();

}
