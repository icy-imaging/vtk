// java wrapper for vtkCameraOrientationRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCameraOrientationRepresentation extends vtkWidgetRepresentation
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

  private native int GetInteractionStateAsEnum_4();
  public int GetInteractionStateAsEnum()
  {
    return GetInteractionStateAsEnum_4();
  }

  private native void SetSize_5(int id0,int id1);
  public void SetSize(int id0,int id1)
  {
    SetSize_5(id0,id1);
  }

  private native void SetSize_6(int id0[]);
  public void SetSize(int id0[])
  {
    SetSize_6(id0);
  }

  private native int[] GetSize_7();
  public int[] GetSize()
  {
    return GetSize_7();
  }

  private native void SetPadding_8(int id0,int id1);
  public void SetPadding(int id0,int id1)
  {
    SetPadding_8(id0,id1);
  }

  private native void SetPadding_9(int id0[]);
  public void SetPadding(int id0[])
  {
    SetPadding_9(id0);
  }

  private native int[] GetPadding_10();
  public int[] GetPadding()
  {
    return GetPadding_10();
  }

  private native int GetAnchorPosition_11();
  public int GetAnchorPosition()
  {
    return GetAnchorPosition_11();
  }

  private native void AnchorToLowerLeft_12();
  public void AnchorToLowerLeft()
  {
    AnchorToLowerLeft_12();
  }

  private native void AnchorToUpperLeft_13();
  public void AnchorToUpperLeft()
  {
    AnchorToUpperLeft_13();
  }

  private native void AnchorToLowerRight_14();
  public void AnchorToLowerRight()
  {
    AnchorToLowerRight_14();
  }

  private native void AnchorToUpperRight_15();
  public void AnchorToUpperRight()
  {
    AnchorToUpperRight_15();
  }

  private native void SetTotalLength_16(double id0);
  public void SetTotalLength(double id0)
  {
    SetTotalLength_16(id0);
  }

  private native double GetTotalLength_17();
  public double GetTotalLength()
  {
    return GetTotalLength_17();
  }

  private native void SetNormalizedHandleDia_18(double id0);
  public void SetNormalizedHandleDia(double id0)
  {
    SetNormalizedHandleDia_18(id0);
  }

  private native double GetNormalizedHandleDia_19();
  public double GetNormalizedHandleDia()
  {
    return GetNormalizedHandleDia_19();
  }

  private native double GetAzimuth_20();
  public double GetAzimuth()
  {
    return GetAzimuth_20();
  }

  private native double[] GetBack_21();
  public double[] GetBack()
  {
    return GetBack_21();
  }

  private native double GetElevation_22();
  public double GetElevation()
  {
    return GetElevation_22();
  }

  private native double[] GetUp_23();
  public double[] GetUp()
  {
    return GetUp_23();
  }

  private native void SetShaftResolution_24(int id0);
  public void SetShaftResolution(int id0)
  {
    SetShaftResolution_24(id0);
  }

  private native int GetShaftResolutionMinValue_25();
  public int GetShaftResolutionMinValue()
  {
    return GetShaftResolutionMinValue_25();
  }

  private native int GetShaftResolutionMaxValue_26();
  public int GetShaftResolutionMaxValue()
  {
    return GetShaftResolutionMaxValue_26();
  }

  private native int GetShaftResolution_27();
  public int GetShaftResolution()
  {
    return GetShaftResolution_27();
  }

  private native void SetHandleCircumferentialResolution_28(int id0);
  public void SetHandleCircumferentialResolution(int id0)
  {
    SetHandleCircumferentialResolution_28(id0);
  }

  private native int GetHandleCircumferentialResolutionMinValue_29();
  public int GetHandleCircumferentialResolutionMinValue()
  {
    return GetHandleCircumferentialResolutionMinValue_29();
  }

  private native int GetHandleCircumferentialResolutionMaxValue_30();
  public int GetHandleCircumferentialResolutionMaxValue()
  {
    return GetHandleCircumferentialResolutionMaxValue_30();
  }

  private native int GetHandleCircumferentialResolution_31();
  public int GetHandleCircumferentialResolution()
  {
    return GetHandleCircumferentialResolution_31();
  }

  private native void SetContainerCircumferentialResolution_32(int id0);
  public void SetContainerCircumferentialResolution(int id0)
  {
    SetContainerCircumferentialResolution_32(id0);
  }

  private native int GetContainerCircumferentialResolutionMinValue_33();
  public int GetContainerCircumferentialResolutionMinValue()
  {
    return GetContainerCircumferentialResolutionMinValue_33();
  }

  private native int GetContainerCircumferentialResolutionMaxValue_34();
  public int GetContainerCircumferentialResolutionMaxValue()
  {
    return GetContainerCircumferentialResolutionMaxValue_34();
  }

  private native int GetContainerCircumferentialResolution_35();
  public int GetContainerCircumferentialResolution()
  {
    return GetContainerCircumferentialResolution_35();
  }

  private native void SetContainerRadialResolution_36(int id0);
  public void SetContainerRadialResolution(int id0)
  {
    SetContainerRadialResolution_36(id0);
  }

  private native int GetContainerRadialResolutionMinValue_37();
  public int GetContainerRadialResolutionMinValue()
  {
    return GetContainerRadialResolutionMinValue_37();
  }

  private native int GetContainerRadialResolutionMaxValue_38();
  public int GetContainerRadialResolutionMaxValue()
  {
    return GetContainerRadialResolutionMaxValue_38();
  }

  private native int GetContainerRadialResolution_39();
  public int GetContainerRadialResolution()
  {
    return GetContainerRadialResolution_39();
  }

  private native int GetPickedAxis_40();
  public int GetPickedAxis()
  {
    return GetPickedAxis_40();
  }

  private native int GetPickedDir_41();
  public int GetPickedDir()
  {
    return GetPickedDir_41();
  }

  private native long GetXPlusLabelProperty_42();
  public vtkTextProperty GetXPlusLabelProperty()
  {
    long temp = GetXPlusLabelProperty_42();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetYPlusLabelProperty_43();
  public vtkTextProperty GetYPlusLabelProperty()
  {
    long temp = GetYPlusLabelProperty_43();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetZPlusLabelProperty_44();
  public vtkTextProperty GetZPlusLabelProperty()
  {
    long temp = GetZPlusLabelProperty_44();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetXMinusLabelProperty_45();
  public vtkTextProperty GetXMinusLabelProperty()
  {
    long temp = GetXMinusLabelProperty_45();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetYMinusLabelProperty_46();
  public vtkTextProperty GetYMinusLabelProperty()
  {
    long temp = GetYMinusLabelProperty_46();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetZMinusLabelProperty_47();
  public vtkTextProperty GetZMinusLabelProperty()
  {
    long temp = GetZMinusLabelProperty_47();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetContainerProperty_48();
  public vtkProperty GetContainerProperty()
  {
    long temp = GetContainerProperty_48();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetContainerVisibility_49(boolean id0);
  public void SetContainerVisibility(boolean id0)
  {
    SetContainerVisibility_49(id0);
  }

  private native void ContainerVisibilityOn_50();
  public void ContainerVisibilityOn()
  {
    ContainerVisibilityOn_50();
  }

  private native void ContainerVisibilityOff_51();
  public void ContainerVisibilityOff()
  {
    ContainerVisibilityOff_51();
  }

  private native boolean GetContainerVisibility_52();
  public boolean GetContainerVisibility()
  {
    return GetContainerVisibility_52();
  }

  private native void GetActors_53(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_53(id0);
  }

  private native long GetTransform_54();
  public vtkTransform GetTransform()
  {
    long temp = GetTransform_54();

    if (temp == 0) return null;
    return (vtkTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildRepresentation_55();
  public void BuildRepresentation()
  {
    BuildRepresentation_55();
  }

  private native void StartWidgetInteraction_56(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_56(id0);
  }

  private native void WidgetInteraction_57(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_57(id0);
  }

  private native void EndWidgetInteraction_58(double id0[]);
  public void EndWidgetInteraction(double id0[])
  {
    EndWidgetInteraction_58(id0);
  }

  private native int ComputeInteractionState_59(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_59(id0,id1,id2);
  }

  private native double[] GetBounds_60();
  public double[] GetBounds()
  {
    return GetBounds_60();
  }

  private native void ReleaseGraphicsResources_61(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_61(id0);
  }

  private native int RenderOpaqueGeometry_62(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_62(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_63(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_63(id0);
  }

  private native int HasTranslucentPolygonalGeometry_64();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_64();
  }

  private native void ShallowCopy_65(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_65(id0);
  }

  private native boolean IsAnyHandleSelected_66();
  public boolean IsAnyHandleSelected()
  {
    return IsAnyHandleSelected_66();
  }

  public vtkCameraOrientationRepresentation() { super(); }

  public vtkCameraOrientationRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
