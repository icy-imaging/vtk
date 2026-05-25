// java wrapper for vtkOrientationRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOrientationRepresentation extends vtkWidgetRepresentation
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

  private native long GetTransform_4();
  public vtkTransform GetTransform()
  {
    long temp = GetTransform_4();

    if (temp == 0) return null;
    return (vtkTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOrientation_5(double id0[]);
  public void SetOrientation(double id0[])
  {
    SetOrientation_5(id0);
  }

  private native void SetOrientationX_6(double id0);
  public void SetOrientationX(double id0)
  {
    SetOrientationX_6(id0);
  }

  private native void SetOrientationY_7(double id0);
  public void SetOrientationY(double id0)
  {
    SetOrientationY_7(id0);
  }

  private native void SetOrientationZ_8(double id0);
  public void SetOrientationZ(double id0)
  {
    SetOrientationZ_8(id0);
  }

  private native double GetOrientationX_9();
  public double GetOrientationX()
  {
    return GetOrientationX_9();
  }

  private native double GetOrientationY_10();
  public double GetOrientationY()
  {
    return GetOrientationY_10();
  }

  private native double GetOrientationZ_11();
  public double GetOrientationZ()
  {
    return GetOrientationZ_11();
  }

  private native void SetProperty_12(int id0,boolean id1,vtkProperty id2);
  public void SetProperty(int id0,boolean id1,vtkProperty id2)
  {
    SetProperty_12(id0,id1,id2);
  }

  private native void SetPropertyX_13(boolean id0,vtkProperty id1);
  public void SetPropertyX(boolean id0,vtkProperty id1)
  {
    SetPropertyX_13(id0,id1);
  }

  private native void SetPropertyY_14(boolean id0,vtkProperty id1);
  public void SetPropertyY(boolean id0,vtkProperty id1)
  {
    SetPropertyY_14(id0,id1);
  }

  private native void SetPropertyZ_15(boolean id0,vtkProperty id1);
  public void SetPropertyZ(boolean id0,vtkProperty id1)
  {
    SetPropertyZ_15(id0,id1);
  }

  private native long GetProperty_16(int id0,boolean id1);
  public vtkProperty GetProperty(int id0,boolean id1)
  {
    long temp = GetProperty_16(id0,id1);

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPropertyX_17(boolean id0);
  public vtkProperty GetPropertyX(boolean id0)
  {
    long temp = GetPropertyX_17(id0);

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPropertyY_18(boolean id0);
  public vtkProperty GetPropertyY(boolean id0)
  {
    long temp = GetPropertyY_18(id0);

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPropertyZ_19(boolean id0);
  public vtkProperty GetPropertyZ(boolean id0)
  {
    long temp = GetPropertyZ_19(id0);

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTorusLength_20(double id0);
  public void SetTorusLength(double id0)
  {
    SetTorusLength_20(id0);
  }

  private native double GetTorusLengthMinValue_21();
  public double GetTorusLengthMinValue()
  {
    return GetTorusLengthMinValue_21();
  }

  private native double GetTorusLengthMaxValue_22();
  public double GetTorusLengthMaxValue()
  {
    return GetTorusLengthMaxValue_22();
  }

  private native double GetTorusLength_23();
  public double GetTorusLength()
  {
    return GetTorusLength_23();
  }

  private native void SetTorusThickness_24(double id0);
  public void SetTorusThickness(double id0)
  {
    SetTorusThickness_24(id0);
  }

  private native double GetTorusThicknessMinValue_25();
  public double GetTorusThicknessMinValue()
  {
    return GetTorusThicknessMinValue_25();
  }

  private native double GetTorusThicknessMaxValue_26();
  public double GetTorusThicknessMaxValue()
  {
    return GetTorusThicknessMaxValue_26();
  }

  private native double GetTorusThickness_27();
  public double GetTorusThickness()
  {
    return GetTorusThickness_27();
  }

  private native void SetShowArrows_28(boolean id0);
  public void SetShowArrows(boolean id0)
  {
    SetShowArrows_28(id0);
  }

  private native boolean GetShowArrows_29();
  public boolean GetShowArrows()
  {
    return GetShowArrows_29();
  }

  private native void ShowArrowsOn_30();
  public void ShowArrowsOn()
  {
    ShowArrowsOn_30();
  }

  private native void ShowArrowsOff_31();
  public void ShowArrowsOff()
  {
    ShowArrowsOff_31();
  }

  private native void SetArrowDistance_32(double id0);
  public void SetArrowDistance(double id0)
  {
    SetArrowDistance_32(id0);
  }

  private native double GetArrowDistanceMinValue_33();
  public double GetArrowDistanceMinValue()
  {
    return GetArrowDistanceMinValue_33();
  }

  private native double GetArrowDistanceMaxValue_34();
  public double GetArrowDistanceMaxValue()
  {
    return GetArrowDistanceMaxValue_34();
  }

  private native double GetArrowDistance_35();
  public double GetArrowDistance()
  {
    return GetArrowDistance_35();
  }

  private native void SetArrowLength_36(double id0);
  public void SetArrowLength(double id0)
  {
    SetArrowLength_36(id0);
  }

  private native double GetArrowLengthMinValue_37();
  public double GetArrowLengthMinValue()
  {
    return GetArrowLengthMinValue_37();
  }

  private native double GetArrowLengthMaxValue_38();
  public double GetArrowLengthMaxValue()
  {
    return GetArrowLengthMaxValue_38();
  }

  private native double GetArrowLength_39();
  public double GetArrowLength()
  {
    return GetArrowLength_39();
  }

  private native void SetArrowTipLength_40(double id0);
  public void SetArrowTipLength(double id0)
  {
    SetArrowTipLength_40(id0);
  }

  private native double GetArrowTipLength_41();
  public double GetArrowTipLength()
  {
    return GetArrowTipLength_41();
  }

  private native void SetArrowTipRadius_42(double id0);
  public void SetArrowTipRadius(double id0)
  {
    SetArrowTipRadius_42(id0);
  }

  private native double GetArrowTipRadiusMinValue_43();
  public double GetArrowTipRadiusMinValue()
  {
    return GetArrowTipRadiusMinValue_43();
  }

  private native double GetArrowTipRadiusMaxValue_44();
  public double GetArrowTipRadiusMaxValue()
  {
    return GetArrowTipRadiusMaxValue_44();
  }

  private native double GetArrowTipRadius_45();
  public double GetArrowTipRadius()
  {
    return GetArrowTipRadius_45();
  }

  private native void SetArrowShaftRadius_46(double id0);
  public void SetArrowShaftRadius(double id0)
  {
    SetArrowShaftRadius_46(id0);
  }

  private native double GetArrowShaftRadiusMinValue_47();
  public double GetArrowShaftRadiusMinValue()
  {
    return GetArrowShaftRadiusMinValue_47();
  }

  private native double GetArrowShaftRadiusMaxValue_48();
  public double GetArrowShaftRadiusMaxValue()
  {
    return GetArrowShaftRadiusMaxValue_48();
  }

  private native double GetArrowShaftRadius_49();
  public double GetArrowShaftRadius()
  {
    return GetArrowShaftRadius_49();
  }

  private native void PlaceWidget_50(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_50(id0);
  }

  private native void BuildRepresentation_51();
  public void BuildRepresentation()
  {
    BuildRepresentation_51();
  }

  private native int ComputeInteractionState_52(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_52(id0,id1,id2);
  }

  private native void StartWidgetInteraction_53(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_53(id0);
  }

  private native void WidgetInteraction_54(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_54(id0);
  }

  private native double[] GetBounds_55();
  public double[] GetBounds()
  {
    return GetBounds_55();
  }

  private native void ReleaseGraphicsResources_56(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_56(id0);
  }

  private native int RenderOpaqueGeometry_57(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_57(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_58(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_58(id0);
  }

  private native int HasTranslucentPolygonalGeometry_59();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_59();
  }

  private native void SetInteractionState_60(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_60(id0);
  }

  private native void RegisterPickers_61();
  public void RegisterPickers()
  {
    RegisterPickers_61();
  }

  private native void GetActors_62(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_62(id0);
  }

  public vtkOrientationRepresentation() { super(); }

  public vtkOrientationRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
