// java wrapper for vtkAbstractPolygonalHandleRepresentation3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractPolygonalHandleRepresentation3D extends vtkHandleRepresentation
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

  private native void SetHandle_6(vtkPolyData id0);
  public void SetHandle(vtkPolyData id0)
  {
    SetHandle_6(id0);
  }

  private native long GetHandle_7();
  public vtkPolyData GetHandle()
  {
    long temp = GetHandle_7();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetProperty_8(vtkProperty id0);
  public void SetProperty(vtkProperty id0)
  {
    SetProperty_8(id0);
  }

  private native void SetSelectedProperty_9(vtkProperty id0);
  public void SetSelectedProperty(vtkProperty id0)
  {
    SetSelectedProperty_9(id0);
  }

  private native long GetProperty_10();
  public vtkProperty GetProperty()
  {
    long temp = GetProperty_10();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedProperty_11();
  public vtkProperty GetSelectedProperty()
  {
    long temp = GetSelectedProperty_11();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTransform_12();
  public vtkAbstractTransform GetTransform()
  {
    long temp = GetTransform_12();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native void WidgetInteraction_15(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_15(id0);
  }

  private native int ComputeInteractionState_16(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_16(id0,id1,id2);
  }

  private native void ShallowCopy_17(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_17(id0);
  }

  private native void DeepCopy_18(vtkProp id0);
  public void DeepCopy(vtkProp id0)
  {
    DeepCopy_18(id0);
  }

  private native void GetActors_19(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_19(id0);
  }

  private native void ReleaseGraphicsResources_20(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_20(id0);
  }

  private native int RenderOpaqueGeometry_21(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_21(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_22(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_22(id0);
  }

  private native int HasTranslucentPolygonalGeometry_23();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_23();
  }

  private native void SetLabelVisibility_24(int id0);
  public void SetLabelVisibility(int id0)
  {
    SetLabelVisibility_24(id0);
  }

  private native int GetLabelVisibility_25();
  public int GetLabelVisibility()
  {
    return GetLabelVisibility_25();
  }

  private native void LabelVisibilityOn_26();
  public void LabelVisibilityOn()
  {
    LabelVisibilityOn_26();
  }

  private native void LabelVisibilityOff_27();
  public void LabelVisibilityOff()
  {
    LabelVisibilityOff_27();
  }

  private native void SetLabelText_28(byte[] id0, int len0);
  public void SetLabelText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelText_28(bytes0, bytes0.length);
  }

  private native byte[] GetLabelText_29();
  public String GetLabelText()
  {
    return new String(GetLabelText_29(), StandardCharsets.UTF_8);
  }

  private native void SetLabelTextScale_30(double id0[]);
  public void SetLabelTextScale(double id0[])
  {
    SetLabelTextScale_30(id0);
  }

  private native void SetLabelTextScale_31(double id0,double id1,double id2);
  public void SetLabelTextScale(double id0,double id1,double id2)
  {
    SetLabelTextScale_31(id0,id1,id2);
  }

  private native long GetLabelTextActor_32();
  public vtkFollower GetLabelTextActor()
  {
    long temp = GetLabelTextActor_32();

    if (temp == 0) return null;
    return (vtkFollower)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUniformScale_33(double id0);
  public void SetUniformScale(double id0)
  {
    SetUniformScale_33(id0);
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

  private native void RegisterPickers_43();
  public void RegisterPickers()
  {
    RegisterPickers_43();
  }

  public vtkAbstractPolygonalHandleRepresentation3D() { super(); }

  public vtkAbstractPolygonalHandleRepresentation3D(long id) { super(id); }

}
