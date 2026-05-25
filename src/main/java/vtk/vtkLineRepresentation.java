// java wrapper for vtkLineRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLineRepresentation extends vtkWidgetRepresentation
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

  private native void GetPoint1WorldPosition_4(double id0[]);
  public void GetPoint1WorldPosition(double id0[])
  {
    GetPoint1WorldPosition_4(id0);
  }

  private native double[] GetPoint1WorldPosition_5();
  public double[] GetPoint1WorldPosition()
  {
    return GetPoint1WorldPosition_5();
  }

  private native void GetPoint1DisplayPosition_6(double id0[]);
  public void GetPoint1DisplayPosition(double id0[])
  {
    GetPoint1DisplayPosition_6(id0);
  }

  private native double[] GetPoint1DisplayPosition_7();
  public double[] GetPoint1DisplayPosition()
  {
    return GetPoint1DisplayPosition_7();
  }

  private native void SetPoint1WorldPosition_8(double id0[]);
  public void SetPoint1WorldPosition(double id0[])
  {
    SetPoint1WorldPosition_8(id0);
  }

  private native void SetPoint1DisplayPosition_9(double id0[]);
  public void SetPoint1DisplayPosition(double id0[])
  {
    SetPoint1DisplayPosition_9(id0);
  }

  private native void GetPoint2DisplayPosition_10(double id0[]);
  public void GetPoint2DisplayPosition(double id0[])
  {
    GetPoint2DisplayPosition_10(id0);
  }

  private native double[] GetPoint2DisplayPosition_11();
  public double[] GetPoint2DisplayPosition()
  {
    return GetPoint2DisplayPosition_11();
  }

  private native void GetPoint2WorldPosition_12(double id0[]);
  public void GetPoint2WorldPosition(double id0[])
  {
    GetPoint2WorldPosition_12(id0);
  }

  private native double[] GetPoint2WorldPosition_13();
  public double[] GetPoint2WorldPosition()
  {
    return GetPoint2WorldPosition_13();
  }

  private native void SetPoint2WorldPosition_14(double id0[]);
  public void SetPoint2WorldPosition(double id0[])
  {
    SetPoint2WorldPosition_14(id0);
  }

  private native void SetPoint2DisplayPosition_15(double id0[]);
  public void SetPoint2DisplayPosition(double id0[])
  {
    SetPoint2DisplayPosition_15(id0);
  }

  private native void SetHandleRepresentation_16(vtkPointHandleRepresentation3D id0);
  public void SetHandleRepresentation(vtkPointHandleRepresentation3D id0)
  {
    SetHandleRepresentation_16(id0);
  }

  private native void InstantiateHandleRepresentation_17();
  public void InstantiateHandleRepresentation()
  {
    InstantiateHandleRepresentation_17();
  }

  private native long GetPoint1Representation_18();
  public vtkPointHandleRepresentation3D GetPoint1Representation()
  {
    long temp = GetPoint1Representation_18();

    if (temp == 0) return null;
    return (vtkPointHandleRepresentation3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPoint2Representation_19();
  public vtkPointHandleRepresentation3D GetPoint2Representation()
  {
    long temp = GetPoint2Representation_19();

    if (temp == 0) return null;
    return (vtkPointHandleRepresentation3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLineHandleRepresentation_20();
  public vtkPointHandleRepresentation3D GetLineHandleRepresentation()
  {
    long temp = GetLineHandleRepresentation_20();

    if (temp == 0) return null;
    return (vtkPointHandleRepresentation3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEndPointProperty_21();
  public vtkProperty GetEndPointProperty()
  {
    long temp = GetEndPointProperty_21();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedEndPointProperty_22();
  public vtkProperty GetSelectedEndPointProperty()
  {
    long temp = GetSelectedEndPointProperty_22();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEndPoint2Property_23();
  public vtkProperty GetEndPoint2Property()
  {
    long temp = GetEndPoint2Property_23();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedEndPoint2Property_24();
  public vtkProperty GetSelectedEndPoint2Property()
  {
    long temp = GetSelectedEndPoint2Property_24();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLineProperty_25();
  public vtkProperty GetLineProperty()
  {
    long temp = GetLineProperty_25();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedLineProperty_26();
  public vtkProperty GetSelectedLineProperty()
  {
    long temp = GetSelectedLineProperty_26();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTolerance_27(int id0);
  public void SetTolerance(int id0)
  {
    SetTolerance_27(id0);
  }

  private native int GetToleranceMinValue_28();
  public int GetToleranceMinValue()
  {
    return GetToleranceMinValue_28();
  }

  private native int GetToleranceMaxValue_29();
  public int GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_29();
  }

  private native int GetTolerance_30();
  public int GetTolerance()
  {
    return GetTolerance_30();
  }

  private native void SetResolution_31(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_31(id0);
  }

  private native int GetResolution_32();
  public int GetResolution()
  {
    return GetResolution_32();
  }

  private native void GetPolyData_33(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_33(id0);
  }

  private native void PlaceWidget_34(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_34(id0);
  }

  private native void BuildRepresentation_35();
  public void BuildRepresentation()
  {
    BuildRepresentation_35();
  }

  private native int ComputeInteractionState_36(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_36(id0,id1,id2);
  }

  private native void StartWidgetInteraction_37(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_37(id0);
  }

  private native void WidgetInteraction_38(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_38(id0);
  }

  private native double[] GetBounds_39();
  public double[] GetBounds()
  {
    return GetBounds_39();
  }

  private native void GetActors_40(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_40(id0);
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

  private native int GetInteractionStateMinValue_46();
  public int GetInteractionStateMinValue()
  {
    return GetInteractionStateMinValue_46();
  }

  private native int GetInteractionStateMaxValue_47();
  public int GetInteractionStateMaxValue()
  {
    return GetInteractionStateMaxValue_47();
  }

  private native void SetRepresentationState_48(int id0);
  public void SetRepresentationState(int id0)
  {
    SetRepresentationState_48(id0);
  }

  private native int GetRepresentationState_49();
  public int GetRepresentationState()
  {
    return GetRepresentationState_49();
  }

  private native void SetDirectionalLine_50(boolean id0);
  public void SetDirectionalLine(boolean id0)
  {
    SetDirectionalLine_50(id0);
  }

  private native boolean GetDirectionalLine_51();
  public boolean GetDirectionalLine()
  {
    return GetDirectionalLine_51();
  }

  private native void DirectionalLineOn_52();
  public void DirectionalLineOn()
  {
    DirectionalLineOn_52();
  }

  private native void DirectionalLineOff_53();
  public void DirectionalLineOff()
  {
    DirectionalLineOff_53();
  }

  private native long GetMTime_54();
  public long GetMTime()
  {
    return GetMTime_54();
  }

  private native void SetRenderer_55(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_55(id0);
  }

  private native void SetDistanceAnnotationVisibility_56(int id0);
  public void SetDistanceAnnotationVisibility(int id0)
  {
    SetDistanceAnnotationVisibility_56(id0);
  }

  private native int GetDistanceAnnotationVisibility_57();
  public int GetDistanceAnnotationVisibility()
  {
    return GetDistanceAnnotationVisibility_57();
  }

  private native void DistanceAnnotationVisibilityOn_58();
  public void DistanceAnnotationVisibilityOn()
  {
    DistanceAnnotationVisibilityOn_58();
  }

  private native void DistanceAnnotationVisibilityOff_59();
  public void DistanceAnnotationVisibilityOff()
  {
    DistanceAnnotationVisibilityOff_59();
  }

  private native void SetDistanceAnnotationFormat_60(byte[] id0, int len0);
  public void SetDistanceAnnotationFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDistanceAnnotationFormat_60(bytes0, bytes0.length);
  }

  private native byte[] GetDistanceAnnotationFormat_61();
  public String GetDistanceAnnotationFormat()
  {
    return new String(GetDistanceAnnotationFormat_61(), StandardCharsets.UTF_8);
  }

  private native void SetDistanceAnnotationScale_62(double id0,double id1,double id2);
  public void SetDistanceAnnotationScale(double id0,double id1,double id2)
  {
    SetDistanceAnnotationScale_62(id0,id1,id2);
  }

  private native void SetDistanceAnnotationScale_63(double id0[]);
  public void SetDistanceAnnotationScale(double id0[])
  {
    SetDistanceAnnotationScale_63(id0);
  }

  private native double[] GetDistanceAnnotationScale_64();
  public double[] GetDistanceAnnotationScale()
  {
    return GetDistanceAnnotationScale_64();
  }

  private native double GetDistance_65();
  public double GetDistance()
  {
    return GetDistance_65();
  }

  private native void SetLineColor_66(double id0,double id1,double id2);
  public void SetLineColor(double id0,double id1,double id2)
  {
    SetLineColor_66(id0,id1,id2);
  }

  private native void SetInteractionColor_67(double id0,double id1,double id2);
  public void SetInteractionColor(double id0,double id1,double id2)
  {
    SetInteractionColor_67(id0,id1,id2);
  }

  private native void SetInteractionColor_68(double id0[]);
  public void SetInteractionColor(double id0[])
  {
    SetInteractionColor_68(id0);
  }

  private native void SetForegroundColor_69(double id0,double id1,double id2);
  public void SetForegroundColor(double id0,double id1,double id2)
  {
    SetForegroundColor_69(id0,id1,id2);
  }

  private native void SetForegroundColor_70(double id0[]);
  public void SetForegroundColor(double id0[])
  {
    SetForegroundColor_70(id0);
  }

  private native long GetDistanceAnnotationProperty_71();
  public vtkProperty GetDistanceAnnotationProperty()
  {
    long temp = GetDistanceAnnotationProperty_71();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTextActor_72();
  public vtkFollower GetTextActor()
  {
    long temp = GetTextActor_72();

    if (temp == 0) return null;
    return (vtkFollower)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkLineRepresentation() { super(); }

  public vtkLineRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
