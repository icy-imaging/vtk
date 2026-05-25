// java wrapper for vtkAxesActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAxesActor extends vtkProp3D
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

  private native void GetActors_4(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_4(id0);
  }

  private native int RenderOpaqueGeometry_5(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_5(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_6(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_6(id0);
  }

  private native int RenderOverlay_7(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_7(id0);
  }

  private native int HasTranslucentPolygonalGeometry_8();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_8();
  }

  private native void ShallowCopy_9(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_9(id0);
  }

  private native void ReleaseGraphicsResources_10(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_10(id0);
  }

  private native void GetBounds_11(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_11(id0);
  }

  private native double[] GetBounds_12();
  public double[] GetBounds()
  {
    return GetBounds_12();
  }

  private native long GetMTime_13();
  public long GetMTime()
  {
    return GetMTime_13();
  }

  private native long GetRedrawMTime_14();
  public long GetRedrawMTime()
  {
    return GetRedrawMTime_14();
  }

  private native void SetTotalLength_15(double id0[]);
  public void SetTotalLength(double id0[])
  {
    SetTotalLength_15(id0);
  }

  private native void SetTotalLength_16(double id0,double id1,double id2);
  public void SetTotalLength(double id0,double id1,double id2)
  {
    SetTotalLength_16(id0,id1,id2);
  }

  private native double[] GetTotalLength_17();
  public double[] GetTotalLength()
  {
    return GetTotalLength_17();
  }

  private native void SetNormalizedShaftLength_18(double id0[]);
  public void SetNormalizedShaftLength(double id0[])
  {
    SetNormalizedShaftLength_18(id0);
  }

  private native void SetNormalizedShaftLength_19(double id0,double id1,double id2);
  public void SetNormalizedShaftLength(double id0,double id1,double id2)
  {
    SetNormalizedShaftLength_19(id0,id1,id2);
  }

  private native double[] GetNormalizedShaftLength_20();
  public double[] GetNormalizedShaftLength()
  {
    return GetNormalizedShaftLength_20();
  }

  private native void SetNormalizedTipLength_21(double id0[]);
  public void SetNormalizedTipLength(double id0[])
  {
    SetNormalizedTipLength_21(id0);
  }

  private native void SetNormalizedTipLength_22(double id0,double id1,double id2);
  public void SetNormalizedTipLength(double id0,double id1,double id2)
  {
    SetNormalizedTipLength_22(id0,id1,id2);
  }

  private native double[] GetNormalizedTipLength_23();
  public double[] GetNormalizedTipLength()
  {
    return GetNormalizedTipLength_23();
  }

  private native void SetNormalizedLabelPosition_24(double id0[]);
  public void SetNormalizedLabelPosition(double id0[])
  {
    SetNormalizedLabelPosition_24(id0);
  }

  private native void SetNormalizedLabelPosition_25(double id0,double id1,double id2);
  public void SetNormalizedLabelPosition(double id0,double id1,double id2)
  {
    SetNormalizedLabelPosition_25(id0,id1,id2);
  }

  private native double[] GetNormalizedLabelPosition_26();
  public double[] GetNormalizedLabelPosition()
  {
    return GetNormalizedLabelPosition_26();
  }

  private native void SetConeResolution_27(int id0);
  public void SetConeResolution(int id0)
  {
    SetConeResolution_27(id0);
  }

  private native int GetConeResolutionMinValue_28();
  public int GetConeResolutionMinValue()
  {
    return GetConeResolutionMinValue_28();
  }

  private native int GetConeResolutionMaxValue_29();
  public int GetConeResolutionMaxValue()
  {
    return GetConeResolutionMaxValue_29();
  }

  private native int GetConeResolution_30();
  public int GetConeResolution()
  {
    return GetConeResolution_30();
  }

  private native void SetSphereResolution_31(int id0);
  public void SetSphereResolution(int id0)
  {
    SetSphereResolution_31(id0);
  }

  private native int GetSphereResolutionMinValue_32();
  public int GetSphereResolutionMinValue()
  {
    return GetSphereResolutionMinValue_32();
  }

  private native int GetSphereResolutionMaxValue_33();
  public int GetSphereResolutionMaxValue()
  {
    return GetSphereResolutionMaxValue_33();
  }

  private native int GetSphereResolution_34();
  public int GetSphereResolution()
  {
    return GetSphereResolution_34();
  }

  private native void SetCylinderResolution_35(int id0);
  public void SetCylinderResolution(int id0)
  {
    SetCylinderResolution_35(id0);
  }

  private native int GetCylinderResolutionMinValue_36();
  public int GetCylinderResolutionMinValue()
  {
    return GetCylinderResolutionMinValue_36();
  }

  private native int GetCylinderResolutionMaxValue_37();
  public int GetCylinderResolutionMaxValue()
  {
    return GetCylinderResolutionMaxValue_37();
  }

  private native int GetCylinderResolution_38();
  public int GetCylinderResolution()
  {
    return GetCylinderResolution_38();
  }

  private native void SetConeRadius_39(double id0);
  public void SetConeRadius(double id0)
  {
    SetConeRadius_39(id0);
  }

  private native double GetConeRadiusMinValue_40();
  public double GetConeRadiusMinValue()
  {
    return GetConeRadiusMinValue_40();
  }

  private native double GetConeRadiusMaxValue_41();
  public double GetConeRadiusMaxValue()
  {
    return GetConeRadiusMaxValue_41();
  }

  private native double GetConeRadius_42();
  public double GetConeRadius()
  {
    return GetConeRadius_42();
  }

  private native void SetSphereRadius_43(double id0);
  public void SetSphereRadius(double id0)
  {
    SetSphereRadius_43(id0);
  }

  private native double GetSphereRadiusMinValue_44();
  public double GetSphereRadiusMinValue()
  {
    return GetSphereRadiusMinValue_44();
  }

  private native double GetSphereRadiusMaxValue_45();
  public double GetSphereRadiusMaxValue()
  {
    return GetSphereRadiusMaxValue_45();
  }

  private native double GetSphereRadius_46();
  public double GetSphereRadius()
  {
    return GetSphereRadius_46();
  }

  private native void SetCylinderRadius_47(double id0);
  public void SetCylinderRadius(double id0)
  {
    SetCylinderRadius_47(id0);
  }

  private native double GetCylinderRadiusMinValue_48();
  public double GetCylinderRadiusMinValue()
  {
    return GetCylinderRadiusMinValue_48();
  }

  private native double GetCylinderRadiusMaxValue_49();
  public double GetCylinderRadiusMaxValue()
  {
    return GetCylinderRadiusMaxValue_49();
  }

  private native double GetCylinderRadius_50();
  public double GetCylinderRadius()
  {
    return GetCylinderRadius_50();
  }

  private native void SetShaftType_51(int id0);
  public void SetShaftType(int id0)
  {
    SetShaftType_51(id0);
  }

  private native void SetShaftTypeToCylinder_52();
  public void SetShaftTypeToCylinder()
  {
    SetShaftTypeToCylinder_52();
  }

  private native void SetShaftTypeToLine_53();
  public void SetShaftTypeToLine()
  {
    SetShaftTypeToLine_53();
  }

  private native void SetShaftTypeToUserDefined_54();
  public void SetShaftTypeToUserDefined()
  {
    SetShaftTypeToUserDefined_54();
  }

  private native int GetShaftType_55();
  public int GetShaftType()
  {
    return GetShaftType_55();
  }

  private native void SetTipType_56(int id0);
  public void SetTipType(int id0)
  {
    SetTipType_56(id0);
  }

  private native void SetTipTypeToCone_57();
  public void SetTipTypeToCone()
  {
    SetTipTypeToCone_57();
  }

  private native void SetTipTypeToSphere_58();
  public void SetTipTypeToSphere()
  {
    SetTipTypeToSphere_58();
  }

  private native void SetTipTypeToUserDefined_59();
  public void SetTipTypeToUserDefined()
  {
    SetTipTypeToUserDefined_59();
  }

  private native int GetTipType_60();
  public int GetTipType()
  {
    return GetTipType_60();
  }

  private native void SetUserDefinedTip_61(vtkPolyData id0);
  public void SetUserDefinedTip(vtkPolyData id0)
  {
    SetUserDefinedTip_61(id0);
  }

  private native long GetUserDefinedTip_62();
  public vtkPolyData GetUserDefinedTip()
  {
    long temp = GetUserDefinedTip_62();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUserDefinedShaft_63(vtkPolyData id0);
  public void SetUserDefinedShaft(vtkPolyData id0)
  {
    SetUserDefinedShaft_63(id0);
  }

  private native long GetUserDefinedShaft_64();
  public vtkPolyData GetUserDefinedShaft()
  {
    long temp = GetUserDefinedShaft_64();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetXAxisTipProperty_65();
  public vtkProperty GetXAxisTipProperty()
  {
    long temp = GetXAxisTipProperty_65();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetYAxisTipProperty_66();
  public vtkProperty GetYAxisTipProperty()
  {
    long temp = GetYAxisTipProperty_66();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetZAxisTipProperty_67();
  public vtkProperty GetZAxisTipProperty()
  {
    long temp = GetZAxisTipProperty_67();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetXAxisShaftProperty_68();
  public vtkProperty GetXAxisShaftProperty()
  {
    long temp = GetXAxisShaftProperty_68();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetYAxisShaftProperty_69();
  public vtkProperty GetYAxisShaftProperty()
  {
    long temp = GetYAxisShaftProperty_69();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetZAxisShaftProperty_70();
  public vtkProperty GetZAxisShaftProperty()
  {
    long temp = GetZAxisShaftProperty_70();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetXAxisCaptionActor2D_71();
  public vtkCaptionActor2D GetXAxisCaptionActor2D()
  {
    long temp = GetXAxisCaptionActor2D_71();

    if (temp == 0) return null;
    return (vtkCaptionActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetYAxisCaptionActor2D_72();
  public vtkCaptionActor2D GetYAxisCaptionActor2D()
  {
    long temp = GetYAxisCaptionActor2D_72();

    if (temp == 0) return null;
    return (vtkCaptionActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetZAxisCaptionActor2D_73();
  public vtkCaptionActor2D GetZAxisCaptionActor2D()
  {
    long temp = GetZAxisCaptionActor2D_73();

    if (temp == 0) return null;
    return (vtkCaptionActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetXAxisLabelText_74(byte[] id0, int len0);
  public void SetXAxisLabelText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXAxisLabelText_74(bytes0, bytes0.length);
  }

  private native byte[] GetXAxisLabelText_75();
  public String GetXAxisLabelText()
  {
    return new String(GetXAxisLabelText_75(), StandardCharsets.UTF_8);
  }

  private native void SetYAxisLabelText_76(byte[] id0, int len0);
  public void SetYAxisLabelText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYAxisLabelText_76(bytes0, bytes0.length);
  }

  private native byte[] GetYAxisLabelText_77();
  public String GetYAxisLabelText()
  {
    return new String(GetYAxisLabelText_77(), StandardCharsets.UTF_8);
  }

  private native void SetZAxisLabelText_78(byte[] id0, int len0);
  public void SetZAxisLabelText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetZAxisLabelText_78(bytes0, bytes0.length);
  }

  private native byte[] GetZAxisLabelText_79();
  public String GetZAxisLabelText()
  {
    return new String(GetZAxisLabelText_79(), StandardCharsets.UTF_8);
  }

  private native void SetAxisLabels_80(int id0);
  public void SetAxisLabels(int id0)
  {
    SetAxisLabels_80(id0);
  }

  private native int GetAxisLabels_81();
  public int GetAxisLabels()
  {
    return GetAxisLabels_81();
  }

  private native void AxisLabelsOn_82();
  public void AxisLabelsOn()
  {
    AxisLabelsOn_82();
  }

  private native void AxisLabelsOff_83();
  public void AxisLabelsOff()
  {
    AxisLabelsOff_83();
  }

  public vtkAxesActor() { super(); }

  public vtkAxesActor(long id) { super(id); }
  public native long   VTKInit();

}
