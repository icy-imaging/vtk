// java wrapper for vtkLegendScaleActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLegendScaleActor extends vtkProp
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

  private native void SetLabelMode_4(int id0);
  public void SetLabelMode(int id0)
  {
    SetLabelMode_4(id0);
  }

  private native int GetLabelModeMinValue_5();
  public int GetLabelModeMinValue()
  {
    return GetLabelModeMinValue_5();
  }

  private native int GetLabelModeMaxValue_6();
  public int GetLabelModeMaxValue()
  {
    return GetLabelModeMaxValue_6();
  }

  private native int GetLabelMode_7();
  public int GetLabelMode()
  {
    return GetLabelMode_7();
  }

  private native void SetLabelModeToDistance_8();
  public void SetLabelModeToDistance()
  {
    SetLabelModeToDistance_8();
  }

  private native void SetLabelModeToXYCoordinates_9();
  public void SetLabelModeToXYCoordinates()
  {
    SetLabelModeToXYCoordinates_9();
  }

  private native void SetLabelModeToCoordinates_10();
  public void SetLabelModeToCoordinates()
  {
    SetLabelModeToCoordinates_10();
  }

  private native void SetRightAxisVisibility_11(int id0);
  public void SetRightAxisVisibility(int id0)
  {
    SetRightAxisVisibility_11(id0);
  }

  private native int GetRightAxisVisibility_12();
  public int GetRightAxisVisibility()
  {
    return GetRightAxisVisibility_12();
  }

  private native void RightAxisVisibilityOn_13();
  public void RightAxisVisibilityOn()
  {
    RightAxisVisibilityOn_13();
  }

  private native void RightAxisVisibilityOff_14();
  public void RightAxisVisibilityOff()
  {
    RightAxisVisibilityOff_14();
  }

  private native void SetTopAxisVisibility_15(int id0);
  public void SetTopAxisVisibility(int id0)
  {
    SetTopAxisVisibility_15(id0);
  }

  private native int GetTopAxisVisibility_16();
  public int GetTopAxisVisibility()
  {
    return GetTopAxisVisibility_16();
  }

  private native void TopAxisVisibilityOn_17();
  public void TopAxisVisibilityOn()
  {
    TopAxisVisibilityOn_17();
  }

  private native void TopAxisVisibilityOff_18();
  public void TopAxisVisibilityOff()
  {
    TopAxisVisibilityOff_18();
  }

  private native void SetLeftAxisVisibility_19(int id0);
  public void SetLeftAxisVisibility(int id0)
  {
    SetLeftAxisVisibility_19(id0);
  }

  private native int GetLeftAxisVisibility_20();
  public int GetLeftAxisVisibility()
  {
    return GetLeftAxisVisibility_20();
  }

  private native void LeftAxisVisibilityOn_21();
  public void LeftAxisVisibilityOn()
  {
    LeftAxisVisibilityOn_21();
  }

  private native void LeftAxisVisibilityOff_22();
  public void LeftAxisVisibilityOff()
  {
    LeftAxisVisibilityOff_22();
  }

  private native void SetBottomAxisVisibility_23(int id0);
  public void SetBottomAxisVisibility(int id0)
  {
    SetBottomAxisVisibility_23(id0);
  }

  private native int GetBottomAxisVisibility_24();
  public int GetBottomAxisVisibility()
  {
    return GetBottomAxisVisibility_24();
  }

  private native void BottomAxisVisibilityOn_25();
  public void BottomAxisVisibilityOn()
  {
    BottomAxisVisibilityOn_25();
  }

  private native void BottomAxisVisibilityOff_26();
  public void BottomAxisVisibilityOff()
  {
    BottomAxisVisibilityOff_26();
  }

  private native void SetLegendVisibility_27(int id0);
  public void SetLegendVisibility(int id0)
  {
    SetLegendVisibility_27(id0);
  }

  private native int GetLegendVisibility_28();
  public int GetLegendVisibility()
  {
    return GetLegendVisibility_28();
  }

  private native void LegendVisibilityOn_29();
  public void LegendVisibilityOn()
  {
    LegendVisibilityOn_29();
  }

  private native void LegendVisibilityOff_30();
  public void LegendVisibilityOff()
  {
    LegendVisibilityOff_30();
  }

  private native void AllAxesOn_31();
  public void AllAxesOn()
  {
    AllAxesOn_31();
  }

  private native void AllAxesOff_32();
  public void AllAxesOff()
  {
    AllAxesOff_32();
  }

  private native void AllAnnotationsOn_33();
  public void AllAnnotationsOn()
  {
    AllAnnotationsOn_33();
  }

  private native void AllAnnotationsOff_34();
  public void AllAnnotationsOff()
  {
    AllAnnotationsOff_34();
  }

  private native void SetGridVisibility_35(boolean id0);
  public void SetGridVisibility(boolean id0)
  {
    SetGridVisibility_35(id0);
  }

  private native boolean GetGridVisibility_36();
  public boolean GetGridVisibility()
  {
    return GetGridVisibility_36();
  }

  private native void GridVisibilityOn_37();
  public void GridVisibilityOn()
  {
    GridVisibilityOn_37();
  }

  private native void GridVisibilityOff_38();
  public void GridVisibilityOff()
  {
    GridVisibilityOff_38();
  }

  private native void SetRightBorderOffset_39(int id0);
  public void SetRightBorderOffset(int id0)
  {
    SetRightBorderOffset_39(id0);
  }

  private native int GetRightBorderOffsetMinValue_40();
  public int GetRightBorderOffsetMinValue()
  {
    return GetRightBorderOffsetMinValue_40();
  }

  private native int GetRightBorderOffsetMaxValue_41();
  public int GetRightBorderOffsetMaxValue()
  {
    return GetRightBorderOffsetMaxValue_41();
  }

  private native int GetRightBorderOffset_42();
  public int GetRightBorderOffset()
  {
    return GetRightBorderOffset_42();
  }

  private native void SetTopBorderOffset_43(int id0);
  public void SetTopBorderOffset(int id0)
  {
    SetTopBorderOffset_43(id0);
  }

  private native int GetTopBorderOffsetMinValue_44();
  public int GetTopBorderOffsetMinValue()
  {
    return GetTopBorderOffsetMinValue_44();
  }

  private native int GetTopBorderOffsetMaxValue_45();
  public int GetTopBorderOffsetMaxValue()
  {
    return GetTopBorderOffsetMaxValue_45();
  }

  private native int GetTopBorderOffset_46();
  public int GetTopBorderOffset()
  {
    return GetTopBorderOffset_46();
  }

  private native void SetLeftBorderOffset_47(int id0);
  public void SetLeftBorderOffset(int id0)
  {
    SetLeftBorderOffset_47(id0);
  }

  private native int GetLeftBorderOffsetMinValue_48();
  public int GetLeftBorderOffsetMinValue()
  {
    return GetLeftBorderOffsetMinValue_48();
  }

  private native int GetLeftBorderOffsetMaxValue_49();
  public int GetLeftBorderOffsetMaxValue()
  {
    return GetLeftBorderOffsetMaxValue_49();
  }

  private native int GetLeftBorderOffset_50();
  public int GetLeftBorderOffset()
  {
    return GetLeftBorderOffset_50();
  }

  private native void SetBottomBorderOffset_51(int id0);
  public void SetBottomBorderOffset(int id0)
  {
    SetBottomBorderOffset_51(id0);
  }

  private native int GetBottomBorderOffsetMinValue_52();
  public int GetBottomBorderOffsetMinValue()
  {
    return GetBottomBorderOffsetMinValue_52();
  }

  private native int GetBottomBorderOffsetMaxValue_53();
  public int GetBottomBorderOffsetMaxValue()
  {
    return GetBottomBorderOffsetMaxValue_53();
  }

  private native int GetBottomBorderOffset_54();
  public int GetBottomBorderOffset()
  {
    return GetBottomBorderOffset_54();
  }

  private native void SetCornerOffsetFactor_55(double id0);
  public void SetCornerOffsetFactor(double id0)
  {
    SetCornerOffsetFactor_55(id0);
  }

  private native double GetCornerOffsetFactorMinValue_56();
  public double GetCornerOffsetFactorMinValue()
  {
    return GetCornerOffsetFactorMinValue_56();
  }

  private native double GetCornerOffsetFactorMaxValue_57();
  public double GetCornerOffsetFactorMaxValue()
  {
    return GetCornerOffsetFactorMaxValue_57();
  }

  private native double GetCornerOffsetFactor_58();
  public double GetCornerOffsetFactor()
  {
    return GetCornerOffsetFactor_58();
  }

  private native void SetNotation_59(int id0);
  public void SetNotation(int id0)
  {
    SetNotation_59(id0);
  }

  private native int GetNotation_60();
  public int GetNotation()
  {
    return GetNotation_60();
  }

  private native void SetPrecision_61(int id0);
  public void SetPrecision(int id0)
  {
    SetPrecision_61(id0);
  }

  private native int GetPrecision_62();
  public int GetPrecision()
  {
    return GetPrecision_62();
  }

  private native void SetNumberOfHorizontalLabels_63(int id0);
  public void SetNumberOfHorizontalLabels(int id0)
  {
    SetNumberOfHorizontalLabels_63(id0);
  }

  private native int GetNumberOfHorizontalLabels_64();
  public int GetNumberOfHorizontalLabels()
  {
    return GetNumberOfHorizontalLabels_64();
  }

  private native void SetNumberOfVerticalLabels_65(int id0);
  public void SetNumberOfVerticalLabels(int id0)
  {
    SetNumberOfVerticalLabels_65(id0);
  }

  private native int GetNumberOfVerticalLabels_66();
  public int GetNumberOfVerticalLabels()
  {
    return GetNumberOfVerticalLabels_66();
  }

  private native void SetOrigin_67(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_67(id0,id1,id2);
  }

  private native void SetOrigin_68(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_68(id0);
  }

  private native double[] GetOrigin_69();
  public double[] GetOrigin()
  {
    return GetOrigin_69();
  }

  private native long GetLegendTitleProperty_70();
  public vtkTextProperty GetLegendTitleProperty()
  {
    long temp = GetLegendTitleProperty_70();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLegendLabelProperty_71();
  public vtkTextProperty GetLegendLabelProperty()
  {
    long temp = GetLegendLabelProperty_71();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAxesTextProperty_72(vtkTextProperty id0);
  public void SetAxesTextProperty(vtkTextProperty id0)
  {
    SetAxesTextProperty_72(id0);
  }

  private native void SetAxesProperty_73(vtkProperty2D id0);
  public void SetAxesProperty(vtkProperty2D id0)
  {
    SetAxesProperty_73(id0);
  }

  private native long GetAxesProperty_74();
  public vtkProperty2D GetAxesProperty()
  {
    long temp = GetAxesProperty_74();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseFontSizeFromProperty_75(boolean id0);
  public void SetUseFontSizeFromProperty(boolean id0)
  {
    SetUseFontSizeFromProperty_75(id0);
  }

  private native void SetAdjustLabels_76(boolean id0);
  public void SetAdjustLabels(boolean id0)
  {
    SetAdjustLabels_76(id0);
  }

  private native void SetSnapToGrid_77(boolean id0);
  public void SetSnapToGrid(boolean id0)
  {
    SetSnapToGrid_77(id0);
  }

  private native long GetRightAxis_78();
  public vtkAxisActor2D GetRightAxis()
  {
    long temp = GetRightAxis_78();

    if (temp == 0) return null;
    return (vtkAxisActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTopAxis_79();
  public vtkAxisActor2D GetTopAxis()
  {
    long temp = GetTopAxis_79();

    if (temp == 0) return null;
    return (vtkAxisActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLeftAxis_80();
  public vtkAxisActor2D GetLeftAxis()
  {
    long temp = GetLeftAxis_80();

    if (temp == 0) return null;
    return (vtkAxisActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBottomAxis_81();
  public vtkAxisActor2D GetBottomAxis()
  {
    long temp = GetBottomAxis_81();

    if (temp == 0) return null;
    return (vtkAxisActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildRepresentation_82(vtkViewport id0);
  public void BuildRepresentation(vtkViewport id0)
  {
    BuildRepresentation_82(id0);
  }

  private native void GetActors2D_83(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_83(id0);
  }

  private native void ReleaseGraphicsResources_84(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_84(id0);
  }

  private native int RenderOverlay_85(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_85(id0);
  }

  private native int RenderOpaqueGeometry_86(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_86(id0);
  }

  public vtkLegendScaleActor() { super(); }

  public vtkLegendScaleActor(long id) { super(id); }
  public native long   VTKInit();

}
