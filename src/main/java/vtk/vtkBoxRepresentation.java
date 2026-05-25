// java wrapper for vtkBoxRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBoxRepresentation extends vtkWidgetRepresentation
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

  private native void GetPlanes_4(vtkPlanes id0);
  public void GetPlanes(vtkPlanes id0)
  {
    GetPlanes_4(id0);
  }

  private native long GetUnderlyingPlane_5(int id0);
  public vtkPlane GetUnderlyingPlane(int id0)
  {
    long temp = GetUnderlyingPlane_5(id0);

    if (temp == 0) return null;
    return (vtkPlane)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInsideOut_6(int id0);
  public void SetInsideOut(int id0)
  {
    SetInsideOut_6(id0);
  }

  private native int GetInsideOut_7();
  public int GetInsideOut()
  {
    return GetInsideOut_7();
  }

  private native void InsideOutOn_8();
  public void InsideOutOn()
  {
    InsideOutOn_8();
  }

  private native void InsideOutOff_9();
  public void InsideOutOff()
  {
    InsideOutOff_9();
  }

  private native void GetTransform_10(vtkTransform id0);
  public void GetTransform(vtkTransform id0)
  {
    GetTransform_10(id0);
  }

  private native void SetTransform_11(vtkTransform id0);
  public void SetTransform(vtkTransform id0)
  {
    SetTransform_11(id0);
  }

  private native void GetPolyData_12(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_12(id0);
  }

  private native long GetHandleProperty_13();
  public vtkProperty GetHandleProperty()
  {
    long temp = GetHandleProperty_13();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedHandleProperty_14();
  public vtkProperty GetSelectedHandleProperty()
  {
    long temp = GetSelectedHandleProperty_14();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaceProperty_15();
  public vtkProperty GetFaceProperty()
  {
    long temp = GetFaceProperty_15();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedFaceProperty_16();
  public vtkProperty GetSelectedFaceProperty()
  {
    long temp = GetSelectedFaceProperty_16();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutlineProperty_17();
  public vtkProperty GetOutlineProperty()
  {
    long temp = GetOutlineProperty_17();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedOutlineProperty_18();
  public vtkProperty GetSelectedOutlineProperty()
  {
    long temp = GetSelectedOutlineProperty_18();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetForegroundColor_19(double id0,double id1,double id2);
  public void SetForegroundColor(double id0,double id1,double id2)
  {
    SetForegroundColor_19(id0,id1,id2);
  }

  private native void SetForegroundColor_20(double id0[]);
  public void SetForegroundColor(double id0[])
  {
    SetForegroundColor_20(id0);
  }

  private native void SetInteractionColor_21(double id0,double id1,double id2);
  public void SetInteractionColor(double id0,double id1,double id2)
  {
    SetInteractionColor_21(id0,id1,id2);
  }

  private native void SetInteractionColor_22(double id0[]);
  public void SetInteractionColor(double id0[])
  {
    SetInteractionColor_22(id0);
  }

  private native void SetOutlineFaceWires_23(int id0);
  public void SetOutlineFaceWires(int id0)
  {
    SetOutlineFaceWires_23(id0);
  }

  private native int GetOutlineFaceWires_24();
  public int GetOutlineFaceWires()
  {
    return GetOutlineFaceWires_24();
  }

  private native void OutlineFaceWiresOn_25();
  public void OutlineFaceWiresOn()
  {
    OutlineFaceWiresOn_25();
  }

  private native void OutlineFaceWiresOff_26();
  public void OutlineFaceWiresOff()
  {
    OutlineFaceWiresOff_26();
  }

  private native void SetOutlineCursorWires_27(int id0);
  public void SetOutlineCursorWires(int id0)
  {
    SetOutlineCursorWires_27(id0);
  }

  private native int GetOutlineCursorWires_28();
  public int GetOutlineCursorWires()
  {
    return GetOutlineCursorWires_28();
  }

  private native void OutlineCursorWiresOn_29();
  public void OutlineCursorWiresOn()
  {
    OutlineCursorWiresOn_29();
  }

  private native void OutlineCursorWiresOff_30();
  public void OutlineCursorWiresOff()
  {
    OutlineCursorWiresOff_30();
  }

  private native void HandlesOn_31();
  public void HandlesOn()
  {
    HandlesOn_31();
  }

  private native void HandlesOff_32();
  public void HandlesOff()
  {
    HandlesOff_32();
  }

  private native void PlaceWidget_33(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_33(id0);
  }

  private native void BuildRepresentation_34();
  public void BuildRepresentation()
  {
    BuildRepresentation_34();
  }

  private native int ComputeInteractionState_35(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_35(id0,id1,id2);
  }

  private native void StartWidgetInteraction_36(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_36(id0);
  }

  private native void WidgetInteraction_37(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_37(id0);
  }

  private native double[] GetBounds_38();
  public double[] GetBounds()
  {
    return GetBounds_38();
  }

  private native void ReleaseGraphicsResources_39(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_39(id0);
  }

  private native int RenderOpaqueGeometry_40(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_40(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_41(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_41(id0);
  }

  private native int HasTranslucentPolygonalGeometry_42();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_42();
  }

  private native void SetInteractionState_43(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_43(id0);
  }

  private native boolean GetTwoPlaneMode_44();
  public boolean GetTwoPlaneMode()
  {
    return GetTwoPlaneMode_44();
  }

  private native void SetTwoPlaneMode_45(boolean id0);
  public void SetTwoPlaneMode(boolean id0)
  {
    SetTwoPlaneMode_45(id0);
  }

  private native boolean GetSnapToAxes_46();
  public boolean GetSnapToAxes()
  {
    return GetSnapToAxes_46();
  }

  private native void SetSnapToAxes_47(boolean id0);
  public void SetSnapToAxes(boolean id0)
  {
    SetSnapToAxes_47(id0);
  }

  private native void StepForward_48();
  public void StepForward()
  {
    StepForward_48();
  }

  private native void StepBackward_49();
  public void StepBackward()
  {
    StepBackward_49();
  }

  private native void RegisterPickers_50();
  public void RegisterPickers()
  {
    RegisterPickers_50();
  }

  private native int GetTranslationAxis_51();
  public int GetTranslationAxis()
  {
    return GetTranslationAxis_51();
  }

  private native void SetTranslationAxis_52(int id0);
  public void SetTranslationAxis(int id0)
  {
    SetTranslationAxis_52(id0);
  }

  private native int GetTranslationAxisMinValue_53();
  public int GetTranslationAxisMinValue()
  {
    return GetTranslationAxisMinValue_53();
  }

  private native int GetTranslationAxisMaxValue_54();
  public int GetTranslationAxisMaxValue()
  {
    return GetTranslationAxisMaxValue_54();
  }

  private native void SetXTranslationAxisOn_55();
  public void SetXTranslationAxisOn()
  {
    SetXTranslationAxisOn_55();
  }

  private native void SetYTranslationAxisOn_56();
  public void SetYTranslationAxisOn()
  {
    SetYTranslationAxisOn_56();
  }

  private native void SetZTranslationAxisOn_57();
  public void SetZTranslationAxisOn()
  {
    SetZTranslationAxisOn_57();
  }

  private native void SetTranslationAxisOff_58();
  public void SetTranslationAxisOff()
  {
    SetTranslationAxisOff_58();
  }

  private native boolean IsTranslationConstrained_59();
  public boolean IsTranslationConstrained()
  {
    return IsTranslationConstrained_59();
  }

  private native void GetActors_60(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_60(id0);
  }

  public vtkBoxRepresentation() { super(); }

  public vtkBoxRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
