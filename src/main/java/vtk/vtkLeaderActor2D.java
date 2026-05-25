// java wrapper for vtkLeaderActor2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLeaderActor2D extends vtkActor2D
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

  private native void SetRadius_4(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_4(id0);
  }

  private native double GetRadius_5();
  public double GetRadius()
  {
    return GetRadius_5();
  }

  private native void SetLabel_6(byte[] id0, int len0);
  public void SetLabel(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabel_6(bytes0, bytes0.length);
  }

  private native byte[] GetLabel_7();
  public String GetLabel()
  {
    return new String(GetLabel_7(), StandardCharsets.UTF_8);
  }

  private native void SetLabelTextProperty_8(vtkTextProperty id0);
  public void SetLabelTextProperty(vtkTextProperty id0)
  {
    SetLabelTextProperty_8(id0);
  }

  private native long GetLabelTextProperty_9();
  public vtkTextProperty GetLabelTextProperty()
  {
    long temp = GetLabelTextProperty_9();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelFactor_10(double id0);
  public void SetLabelFactor(double id0)
  {
    SetLabelFactor_10(id0);
  }

  private native double GetLabelFactorMinValue_11();
  public double GetLabelFactorMinValue()
  {
    return GetLabelFactorMinValue_11();
  }

  private native double GetLabelFactorMaxValue_12();
  public double GetLabelFactorMaxValue()
  {
    return GetLabelFactorMaxValue_12();
  }

  private native double GetLabelFactor_13();
  public double GetLabelFactor()
  {
    return GetLabelFactor_13();
  }

  private native void SetArrowPlacement_14(int id0);
  public void SetArrowPlacement(int id0)
  {
    SetArrowPlacement_14(id0);
  }

  private native int GetArrowPlacementMinValue_15();
  public int GetArrowPlacementMinValue()
  {
    return GetArrowPlacementMinValue_15();
  }

  private native int GetArrowPlacementMaxValue_16();
  public int GetArrowPlacementMaxValue()
  {
    return GetArrowPlacementMaxValue_16();
  }

  private native int GetArrowPlacement_17();
  public int GetArrowPlacement()
  {
    return GetArrowPlacement_17();
  }

  private native void SetArrowPlacementToNone_18();
  public void SetArrowPlacementToNone()
  {
    SetArrowPlacementToNone_18();
  }

  private native void SetArrowPlacementToPoint1_19();
  public void SetArrowPlacementToPoint1()
  {
    SetArrowPlacementToPoint1_19();
  }

  private native void SetArrowPlacementToPoint2_20();
  public void SetArrowPlacementToPoint2()
  {
    SetArrowPlacementToPoint2_20();
  }

  private native void SetArrowPlacementToBoth_21();
  public void SetArrowPlacementToBoth()
  {
    SetArrowPlacementToBoth_21();
  }

  private native void SetArrowStyle_22(int id0);
  public void SetArrowStyle(int id0)
  {
    SetArrowStyle_22(id0);
  }

  private native int GetArrowStyleMinValue_23();
  public int GetArrowStyleMinValue()
  {
    return GetArrowStyleMinValue_23();
  }

  private native int GetArrowStyleMaxValue_24();
  public int GetArrowStyleMaxValue()
  {
    return GetArrowStyleMaxValue_24();
  }

  private native int GetArrowStyle_25();
  public int GetArrowStyle()
  {
    return GetArrowStyle_25();
  }

  private native void SetArrowStyleToFilled_26();
  public void SetArrowStyleToFilled()
  {
    SetArrowStyleToFilled_26();
  }

  private native void SetArrowStyleToOpen_27();
  public void SetArrowStyleToOpen()
  {
    SetArrowStyleToOpen_27();
  }

  private native void SetArrowStyleToHollow_28();
  public void SetArrowStyleToHollow()
  {
    SetArrowStyleToHollow_28();
  }

  private native void SetArrowLength_29(double id0);
  public void SetArrowLength(double id0)
  {
    SetArrowLength_29(id0);
  }

  private native double GetArrowLengthMinValue_30();
  public double GetArrowLengthMinValue()
  {
    return GetArrowLengthMinValue_30();
  }

  private native double GetArrowLengthMaxValue_31();
  public double GetArrowLengthMaxValue()
  {
    return GetArrowLengthMaxValue_31();
  }

  private native double GetArrowLength_32();
  public double GetArrowLength()
  {
    return GetArrowLength_32();
  }

  private native void SetArrowWidth_33(double id0);
  public void SetArrowWidth(double id0)
  {
    SetArrowWidth_33(id0);
  }

  private native double GetArrowWidthMinValue_34();
  public double GetArrowWidthMinValue()
  {
    return GetArrowWidthMinValue_34();
  }

  private native double GetArrowWidthMaxValue_35();
  public double GetArrowWidthMaxValue()
  {
    return GetArrowWidthMaxValue_35();
  }

  private native double GetArrowWidth_36();
  public double GetArrowWidth()
  {
    return GetArrowWidth_36();
  }

  private native void SetMinimumArrowSize_37(double id0);
  public void SetMinimumArrowSize(double id0)
  {
    SetMinimumArrowSize_37(id0);
  }

  private native double GetMinimumArrowSizeMinValue_38();
  public double GetMinimumArrowSizeMinValue()
  {
    return GetMinimumArrowSizeMinValue_38();
  }

  private native double GetMinimumArrowSizeMaxValue_39();
  public double GetMinimumArrowSizeMaxValue()
  {
    return GetMinimumArrowSizeMaxValue_39();
  }

  private native double GetMinimumArrowSize_40();
  public double GetMinimumArrowSize()
  {
    return GetMinimumArrowSize_40();
  }

  private native void SetMaximumArrowSize_41(double id0);
  public void SetMaximumArrowSize(double id0)
  {
    SetMaximumArrowSize_41(id0);
  }

  private native double GetMaximumArrowSizeMinValue_42();
  public double GetMaximumArrowSizeMinValue()
  {
    return GetMaximumArrowSizeMinValue_42();
  }

  private native double GetMaximumArrowSizeMaxValue_43();
  public double GetMaximumArrowSizeMaxValue()
  {
    return GetMaximumArrowSizeMaxValue_43();
  }

  private native double GetMaximumArrowSize_44();
  public double GetMaximumArrowSize()
  {
    return GetMaximumArrowSize_44();
  }

  private native void SetAutoLabel_45(int id0);
  public void SetAutoLabel(int id0)
  {
    SetAutoLabel_45(id0);
  }

  private native int GetAutoLabel_46();
  public int GetAutoLabel()
  {
    return GetAutoLabel_46();
  }

  private native void AutoLabelOn_47();
  public void AutoLabelOn()
  {
    AutoLabelOn_47();
  }

  private native void AutoLabelOff_48();
  public void AutoLabelOff()
  {
    AutoLabelOff_48();
  }

  private native void SetLabelFormat_49(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_49(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_50();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_50(), StandardCharsets.UTF_8);
  }

  private native double GetLength_51();
  public double GetLength()
  {
    return GetLength_51();
  }

  private native double GetAngle_52();
  public double GetAngle()
  {
    return GetAngle_52();
  }

  private native int RenderOverlay_53(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_53(id0);
  }

  private native int RenderOpaqueGeometry_54(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_54(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_55(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_55(id0);
  }

  private native int HasTranslucentPolygonalGeometry_56();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_56();
  }

  private native void ReleaseGraphicsResources_57(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_57(id0);
  }

  private native void ShallowCopy_58(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_58(id0);
  }

  private native void SetUseFontSizeFromProperty_59(int id0);
  public void SetUseFontSizeFromProperty(int id0)
  {
    SetUseFontSizeFromProperty_59(id0);
  }

  private native int GetUseFontSizeFromProperty_60();
  public int GetUseFontSizeFromProperty()
  {
    return GetUseFontSizeFromProperty_60();
  }

  private native void UseFontSizeFromPropertyOn_61();
  public void UseFontSizeFromPropertyOn()
  {
    UseFontSizeFromPropertyOn_61();
  }

  private native void UseFontSizeFromPropertyOff_62();
  public void UseFontSizeFromPropertyOff()
  {
    UseFontSizeFromPropertyOff_62();
  }

  public vtkLeaderActor2D() { super(); }

  public vtkLeaderActor2D(long id) { super(id); }
  public native long   VTKInit();

}
