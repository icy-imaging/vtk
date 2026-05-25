// java wrapper for vtkTensorRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTensorRepresentation extends vtkWidgetRepresentation
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

  private native void SetTensor_4(double id0[]);
  public void SetTensor(double id0[])
  {
    SetTensor_4(id0);
  }

  private native void SetSymmetricTensor_5(double id0[]);
  public void SetSymmetricTensor(double id0[])
  {
    SetSymmetricTensor_5(id0);
  }

  private native void GetTensor_6(double id0[]);
  public void GetTensor(double id0[])
  {
    GetTensor_6(id0);
  }

  private native void GetSymmetricTensor_7(double id0[]);
  public void GetSymmetricTensor(double id0[])
  {
    GetSymmetricTensor_7(id0);
  }

  private native void GetEigenvalues_8(double id0[]);
  public void GetEigenvalues(double id0[])
  {
    GetEigenvalues_8(id0);
  }

  private native void GetEigenvector_9(int id0,double id1[]);
  public void GetEigenvector(int id0,double id1[])
  {
    GetEigenvector_9(id0,id1);
  }

  private native void SetPosition_10(double id0[]);
  public void SetPosition(double id0[])
  {
    SetPosition_10(id0);
  }

  private native void GetPosition_11(double id0[]);
  public void GetPosition(double id0[])
  {
    GetPosition_11(id0);
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

  private native long GetEllipsoidProperty_19();
  public vtkProperty GetEllipsoidProperty()
  {
    long temp = GetEllipsoidProperty_19();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutlineFaceWires_20(boolean id0);
  public void SetOutlineFaceWires(boolean id0)
  {
    SetOutlineFaceWires_20(id0);
  }

  private native boolean GetOutlineFaceWires_21();
  public boolean GetOutlineFaceWires()
  {
    return GetOutlineFaceWires_21();
  }

  private native void OutlineFaceWiresOn_22();
  public void OutlineFaceWiresOn()
  {
    OutlineFaceWiresOn_22();
  }

  private native void OutlineFaceWiresOff_23();
  public void OutlineFaceWiresOff()
  {
    OutlineFaceWiresOff_23();
  }

  private native void SetOutlineCursorWires_24(boolean id0);
  public void SetOutlineCursorWires(boolean id0)
  {
    SetOutlineCursorWires_24(id0);
  }

  private native boolean GetOutlineCursorWires_25();
  public boolean GetOutlineCursorWires()
  {
    return GetOutlineCursorWires_25();
  }

  private native void OutlineCursorWiresOn_26();
  public void OutlineCursorWiresOn()
  {
    OutlineCursorWiresOn_26();
  }

  private native void OutlineCursorWiresOff_27();
  public void OutlineCursorWiresOff()
  {
    OutlineCursorWiresOff_27();
  }

  private native void HandlesOn_28();
  public void HandlesOn()
  {
    HandlesOn_28();
  }

  private native void HandlesOff_29();
  public void HandlesOff()
  {
    HandlesOff_29();
  }

  private native void SetTensorEllipsoid_30(boolean id0);
  public void SetTensorEllipsoid(boolean id0)
  {
    SetTensorEllipsoid_30(id0);
  }

  private native boolean GetTensorEllipsoid_31();
  public boolean GetTensorEllipsoid()
  {
    return GetTensorEllipsoid_31();
  }

  private native void TensorEllipsoidOn_32();
  public void TensorEllipsoidOn()
  {
    TensorEllipsoidOn_32();
  }

  private native void TensorEllipsoidOff_33();
  public void TensorEllipsoidOff()
  {
    TensorEllipsoidOff_33();
  }

  private native void PlaceTensor_34(double id0[],double id1[]);
  public void PlaceTensor(double id0[],double id1[])
  {
    PlaceTensor_34(id0,id1);
  }

  private native void PlaceWidget_35(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_35(id0);
  }

  private native void BuildRepresentation_36();
  public void BuildRepresentation()
  {
    BuildRepresentation_36();
  }

  private native int ComputeInteractionState_37(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_37(id0,id1,id2);
  }

  private native void StartWidgetInteraction_38(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_38(id0);
  }

  private native void WidgetInteraction_39(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_39(id0);
  }

  private native double[] GetBounds_40();
  public double[] GetBounds()
  {
    return GetBounds_40();
  }

  private native void ReleaseGraphicsResources_41(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_41(id0);
  }

  private native int RenderOpaqueGeometry_42(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_42(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_43(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_43(id0);
  }

  private native int HasTranslucentPolygonalGeometry_44();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_44();
  }

  private native void SetInteractionState_45(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_45(id0);
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

  public vtkTensorRepresentation() { super(); }

  public vtkTensorRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
