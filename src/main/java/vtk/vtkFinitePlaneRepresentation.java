// java wrapper for vtkFinitePlaneRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFinitePlaneRepresentation extends vtkWidgetRepresentation
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

  private native void GetPolyData_4(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_4(id0);
  }

  private native long GetV1HandleProperty_5();
  public vtkProperty GetV1HandleProperty()
  {
    long temp = GetV1HandleProperty_5();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetV2HandleProperty_6();
  public vtkProperty GetV2HandleProperty()
  {
    long temp = GetV2HandleProperty_6();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedHandleProperty_7();
  public vtkProperty GetSelectedHandleProperty()
  {
    long temp = GetSelectedHandleProperty_7();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPlaneProperty_8();
  public vtkProperty GetPlaneProperty()
  {
    long temp = GetPlaneProperty_8();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedPlaneProperty_9();
  public vtkProperty GetSelectedPlaneProperty()
  {
    long temp = GetSelectedPlaneProperty_9();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTubing_10(boolean id0);
  public void SetTubing(boolean id0)
  {
    SetTubing_10(id0);
  }

  private native boolean GetTubing_11();
  public boolean GetTubing()
  {
    return GetTubing_11();
  }

  private native void TubingOn_12();
  public void TubingOn()
  {
    TubingOn_12();
  }

  private native void TubingOff_13();
  public void TubingOff()
  {
    TubingOff_13();
  }

  private native void SetRectangularShape_14(boolean id0);
  public void SetRectangularShape(boolean id0)
  {
    SetRectangularShape_14(id0);
  }

  private native boolean GetRectangularShape_15();
  public boolean GetRectangularShape()
  {
    return GetRectangularShape_15();
  }

  private native void RectangularShapeOn_16();
  public void RectangularShapeOn()
  {
    RectangularShapeOn_16();
  }

  private native void RectangularShapeOff_17();
  public void RectangularShapeOff()
  {
    RectangularShapeOff_17();
  }

  private native void SetDrawPlane_18(boolean id0);
  public void SetDrawPlane(boolean id0)
  {
    SetDrawPlane_18(id0);
  }

  private native boolean GetDrawPlane_19();
  public boolean GetDrawPlane()
  {
    return GetDrawPlane_19();
  }

  private native void DrawPlaneOn_20();
  public void DrawPlaneOn()
  {
    DrawPlaneOn_20();
  }

  private native void DrawPlaneOff_21();
  public void DrawPlaneOff()
  {
    DrawPlaneOff_21();
  }

  private native void SetHandles_22(boolean id0);
  public void SetHandles(boolean id0)
  {
    SetHandles_22(id0);
  }

  private native void HandlesOn_23();
  public void HandlesOn()
  {
    HandlesOn_23();
  }

  private native void HandlesOff_24();
  public void HandlesOff()
  {
    HandlesOff_24();
  }

  private native void PlaceWidget_25(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_25(id0);
  }

  private native void BuildRepresentation_26();
  public void BuildRepresentation()
  {
    BuildRepresentation_26();
  }

  private native int ComputeInteractionState_27(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_27(id0,id1,id2);
  }

  private native void StartWidgetInteraction_28(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_28(id0);
  }

  private native void WidgetInteraction_29(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_29(id0);
  }

  private native void ReleaseGraphicsResources_30(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_30(id0);
  }

  private native int RenderOpaqueGeometry_31(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_31(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_32(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_32(id0);
  }

  private native int HasTranslucentPolygonalGeometry_33();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_33();
  }

  private native void SetInteractionState_34(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_34(id0);
  }

  private native int GetInteractionStateMinValue_35();
  public int GetInteractionStateMinValue()
  {
    return GetInteractionStateMinValue_35();
  }

  private native int GetInteractionStateMaxValue_36();
  public int GetInteractionStateMaxValue()
  {
    return GetInteractionStateMaxValue_36();
  }

  private native void SetOrigin_37(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_37(id0,id1,id2);
  }

  private native void SetOrigin_38(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_38(id0);
  }

  private native double[] GetOrigin_39();
  public double[] GetOrigin()
  {
    return GetOrigin_39();
  }

  private native void SetNormal_40(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_40(id0,id1,id2);
  }

  private native void SetNormal_41(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_41(id0);
  }

  private native double[] GetNormal_42();
  public double[] GetNormal()
  {
    return GetNormal_42();
  }

  private native void SetV1_43(double id0,double id1);
  public void SetV1(double id0,double id1)
  {
    SetV1_43(id0,id1);
  }

  private native void SetV1_44(double id0[]);
  public void SetV1(double id0[])
  {
    SetV1_44(id0);
  }

  private native double[] GetV1_45();
  public double[] GetV1()
  {
    return GetV1_45();
  }

  private native void SetV2_46(double id0,double id1);
  public void SetV2(double id0,double id1)
  {
    SetV2_46(id0,id1);
  }

  private native void SetV2_47(double id0[]);
  public void SetV2(double id0[])
  {
    SetV2_47(id0);
  }

  private native double[] GetV2_48();
  public double[] GetV2()
  {
    return GetV2_48();
  }

  private native void SetRepresentationState_49(int id0);
  public void SetRepresentationState(int id0)
  {
    SetRepresentationState_49(id0);
  }

  private native int GetRepresentationState_50();
  public int GetRepresentationState()
  {
    return GetRepresentationState_50();
  }

  private native long GetNormalProperty_51();
  public vtkProperty GetNormalProperty()
  {
    long temp = GetNormalProperty_51();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedNormalProperty_52();
  public vtkProperty GetSelectedNormalProperty()
  {
    long temp = GetSelectedNormalProperty_52();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RegisterPickers_53();
  public void RegisterPickers()
  {
    RegisterPickers_53();
  }

  public vtkFinitePlaneRepresentation() { super(); }

  public vtkFinitePlaneRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
