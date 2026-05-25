// java wrapper for vtkCubeAxesActor2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCubeAxesActor2D extends vtkActor2D
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

  private native int RenderOverlay_4(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_4(id0);
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

  private native int HasTranslucentPolygonalGeometry_7();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_7();
  }

  private native void SetInputConnection_8(vtkAlgorithmOutput id0);
  public void SetInputConnection(vtkAlgorithmOutput id0)
  {
    SetInputConnection_8(id0);
  }

  private native void SetInputData_9(vtkDataSet id0);
  public void SetInputData(vtkDataSet id0)
  {
    SetInputData_9(id0);
  }

  private native long GetInput_10();
  public vtkDataSet GetInput()
  {
    long temp = GetInput_10();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetViewProp_11(vtkProp id0);
  public void SetViewProp(vtkProp id0)
  {
    SetViewProp_11(id0);
  }

  private native long GetViewProp_12();
  public vtkProp GetViewProp()
  {
    long temp = GetViewProp_12();

    if (temp == 0) return null;
    return (vtkProp)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBounds_13(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_13(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_14(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_14(id0);
  }

  private native double[] GetBounds_15();
  public double[] GetBounds()
  {
    return GetBounds_15();
  }

  private native void GetBounds_16(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_16(id0);
  }

  private native void SetRanges_17(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetRanges(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetRanges_17(id0,id1,id2,id3,id4,id5);
  }

  private native void SetRanges_18(double id0[]);
  public void SetRanges(double id0[])
  {
    SetRanges_18(id0);
  }

  private native double[] GetRanges_19();
  public double[] GetRanges()
  {
    return GetRanges_19();
  }

  private native void GetRanges_20(double id0[]);
  public void GetRanges(double id0[])
  {
    GetRanges_20(id0);
  }

  private native void SetXOrigin_21(double id0);
  public void SetXOrigin(double id0)
  {
    SetXOrigin_21(id0);
  }

  private native void SetYOrigin_22(double id0);
  public void SetYOrigin(double id0)
  {
    SetYOrigin_22(id0);
  }

  private native void SetZOrigin_23(double id0);
  public void SetZOrigin(double id0)
  {
    SetZOrigin_23(id0);
  }

  private native void SetUseRanges_24(int id0);
  public void SetUseRanges(int id0)
  {
    SetUseRanges_24(id0);
  }

  private native int GetUseRanges_25();
  public int GetUseRanges()
  {
    return GetUseRanges_25();
  }

  private native void UseRangesOn_26();
  public void UseRangesOn()
  {
    UseRangesOn_26();
  }

  private native void UseRangesOff_27();
  public void UseRangesOff()
  {
    UseRangesOff_27();
  }

  private native void SetCamera_28(vtkCamera id0);
  public void SetCamera(vtkCamera id0)
  {
    SetCamera_28(id0);
  }

  private native long GetCamera_29();
  public vtkCamera GetCamera()
  {
    long temp = GetCamera_29();

    if (temp == 0) return null;
    return (vtkCamera)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFlyMode_30(int id0);
  public void SetFlyMode(int id0)
  {
    SetFlyMode_30(id0);
  }

  private native int GetFlyModeMinValue_31();
  public int GetFlyModeMinValue()
  {
    return GetFlyModeMinValue_31();
  }

  private native int GetFlyModeMaxValue_32();
  public int GetFlyModeMaxValue()
  {
    return GetFlyModeMaxValue_32();
  }

  private native int GetFlyMode_33();
  public int GetFlyMode()
  {
    return GetFlyMode_33();
  }

  private native void SetFlyModeToOuterEdges_34();
  public void SetFlyModeToOuterEdges()
  {
    SetFlyModeToOuterEdges_34();
  }

  private native void SetFlyModeToClosestTriad_35();
  public void SetFlyModeToClosestTriad()
  {
    SetFlyModeToClosestTriad_35();
  }

  private native void SetFlyModeToNone_36();
  public void SetFlyModeToNone()
  {
    SetFlyModeToNone_36();
  }

  private native void SetScaling_37(int id0);
  public void SetScaling(int id0)
  {
    SetScaling_37(id0);
  }

  private native int GetScaling_38();
  public int GetScaling()
  {
    return GetScaling_38();
  }

  private native void ScalingOn_39();
  public void ScalingOn()
  {
    ScalingOn_39();
  }

  private native void ScalingOff_40();
  public void ScalingOff()
  {
    ScalingOff_40();
  }

  private native void SetNumberOfLabels_41(int id0);
  public void SetNumberOfLabels(int id0)
  {
    SetNumberOfLabels_41(id0);
  }

  private native int GetNumberOfLabelsMinValue_42();
  public int GetNumberOfLabelsMinValue()
  {
    return GetNumberOfLabelsMinValue_42();
  }

  private native int GetNumberOfLabelsMaxValue_43();
  public int GetNumberOfLabelsMaxValue()
  {
    return GetNumberOfLabelsMaxValue_43();
  }

  private native int GetNumberOfLabels_44();
  public int GetNumberOfLabels()
  {
    return GetNumberOfLabels_44();
  }

  private native void SetXLabel_45(byte[] id0, int len0);
  public void SetXLabel(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXLabel_45(bytes0, bytes0.length);
  }

  private native byte[] GetXLabel_46();
  public String GetXLabel()
  {
    return new String(GetXLabel_46(), StandardCharsets.UTF_8);
  }

  private native void SetYLabel_47(byte[] id0, int len0);
  public void SetYLabel(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYLabel_47(bytes0, bytes0.length);
  }

  private native byte[] GetYLabel_48();
  public String GetYLabel()
  {
    return new String(GetYLabel_48(), StandardCharsets.UTF_8);
  }

  private native void SetZLabel_49(byte[] id0, int len0);
  public void SetZLabel(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetZLabel_49(bytes0, bytes0.length);
  }

  private native byte[] GetZLabel_50();
  public String GetZLabel()
  {
    return new String(GetZLabel_50(), StandardCharsets.UTF_8);
  }

  private native long GetXAxisActor2D_51();
  public vtkAxisActor2D GetXAxisActor2D()
  {
    long temp = GetXAxisActor2D_51();

    if (temp == 0) return null;
    return (vtkAxisActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetYAxisActor2D_52();
  public vtkAxisActor2D GetYAxisActor2D()
  {
    long temp = GetYAxisActor2D_52();

    if (temp == 0) return null;
    return (vtkAxisActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetZAxisActor2D_53();
  public vtkAxisActor2D GetZAxisActor2D()
  {
    long temp = GetZAxisActor2D_53();

    if (temp == 0) return null;
    return (vtkAxisActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxisTitleTextProperty_54(vtkTextProperty id0);
  public void SetAxisTitleTextProperty(vtkTextProperty id0)
  {
    SetAxisTitleTextProperty_54(id0);
  }

  private native long GetAxisTitleTextProperty_55();
  public vtkTextProperty GetAxisTitleTextProperty()
  {
    long temp = GetAxisTitleTextProperty_55();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxisLabelTextProperty_56(vtkTextProperty id0);
  public void SetAxisLabelTextProperty(vtkTextProperty id0)
  {
    SetAxisLabelTextProperty_56(id0);
  }

  private native long GetAxisLabelTextProperty_57();
  public vtkTextProperty GetAxisLabelTextProperty()
  {
    long temp = GetAxisLabelTextProperty_57();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelFormat_58(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_58(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_59();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_59(), StandardCharsets.UTF_8);
  }

  private native void SetFontFactor_60(double id0);
  public void SetFontFactor(double id0)
  {
    SetFontFactor_60(id0);
  }

  private native double GetFontFactorMinValue_61();
  public double GetFontFactorMinValue()
  {
    return GetFontFactorMinValue_61();
  }

  private native double GetFontFactorMaxValue_62();
  public double GetFontFactorMaxValue()
  {
    return GetFontFactorMaxValue_62();
  }

  private native double GetFontFactor_63();
  public double GetFontFactor()
  {
    return GetFontFactor_63();
  }

  private native void SetInertia_64(int id0);
  public void SetInertia(int id0)
  {
    SetInertia_64(id0);
  }

  private native int GetInertiaMinValue_65();
  public int GetInertiaMinValue()
  {
    return GetInertiaMinValue_65();
  }

  private native int GetInertiaMaxValue_66();
  public int GetInertiaMaxValue()
  {
    return GetInertiaMaxValue_66();
  }

  private native int GetInertia_67();
  public int GetInertia()
  {
    return GetInertia_67();
  }

  private native void SetShowActualBounds_68(int id0);
  public void SetShowActualBounds(int id0)
  {
    SetShowActualBounds_68(id0);
  }

  private native int GetShowActualBoundsMinValue_69();
  public int GetShowActualBoundsMinValue()
  {
    return GetShowActualBoundsMinValue_69();
  }

  private native int GetShowActualBoundsMaxValue_70();
  public int GetShowActualBoundsMaxValue()
  {
    return GetShowActualBoundsMaxValue_70();
  }

  private native int GetShowActualBounds_71();
  public int GetShowActualBounds()
  {
    return GetShowActualBounds_71();
  }

  private native void SetCornerOffset_72(double id0);
  public void SetCornerOffset(double id0)
  {
    SetCornerOffset_72(id0);
  }

  private native double GetCornerOffset_73();
  public double GetCornerOffset()
  {
    return GetCornerOffset_73();
  }

  private native void ReleaseGraphicsResources_74(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_74(id0);
  }

  private native void SetXAxisVisibility_75(int id0);
  public void SetXAxisVisibility(int id0)
  {
    SetXAxisVisibility_75(id0);
  }

  private native int GetXAxisVisibility_76();
  public int GetXAxisVisibility()
  {
    return GetXAxisVisibility_76();
  }

  private native void XAxisVisibilityOn_77();
  public void XAxisVisibilityOn()
  {
    XAxisVisibilityOn_77();
  }

  private native void XAxisVisibilityOff_78();
  public void XAxisVisibilityOff()
  {
    XAxisVisibilityOff_78();
  }

  private native void SetYAxisVisibility_79(int id0);
  public void SetYAxisVisibility(int id0)
  {
    SetYAxisVisibility_79(id0);
  }

  private native int GetYAxisVisibility_80();
  public int GetYAxisVisibility()
  {
    return GetYAxisVisibility_80();
  }

  private native void YAxisVisibilityOn_81();
  public void YAxisVisibilityOn()
  {
    YAxisVisibilityOn_81();
  }

  private native void YAxisVisibilityOff_82();
  public void YAxisVisibilityOff()
  {
    YAxisVisibilityOff_82();
  }

  private native void SetZAxisVisibility_83(int id0);
  public void SetZAxisVisibility(int id0)
  {
    SetZAxisVisibility_83(id0);
  }

  private native int GetZAxisVisibility_84();
  public int GetZAxisVisibility()
  {
    return GetZAxisVisibility_84();
  }

  private native void ZAxisVisibilityOn_85();
  public void ZAxisVisibilityOn()
  {
    ZAxisVisibilityOn_85();
  }

  private native void ZAxisVisibilityOff_86();
  public void ZAxisVisibilityOff()
  {
    ZAxisVisibilityOff_86();
  }

  private native void ShallowCopy_87(vtkCubeAxesActor2D id0);
  public void ShallowCopy(vtkCubeAxesActor2D id0)
  {
    ShallowCopy_87(id0);
  }

  public vtkCubeAxesActor2D() { super(); }

  public vtkCubeAxesActor2D(long id) { super(id); }
  public native long   VTKInit();

}
