// java wrapper for vtkSliderRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSliderRepresentation extends vtkWidgetRepresentation
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

  private native void SetValue_4(double id0);
  public void SetValue(double id0)
  {
    SetValue_4(id0);
  }

  private native double GetValue_5();
  public double GetValue()
  {
    return GetValue_5();
  }

  private native void SetMinimumValue_6(double id0);
  public void SetMinimumValue(double id0)
  {
    SetMinimumValue_6(id0);
  }

  private native double GetMinimumValue_7();
  public double GetMinimumValue()
  {
    return GetMinimumValue_7();
  }

  private native void SetMaximumValue_8(double id0);
  public void SetMaximumValue(double id0)
  {
    SetMaximumValue_8(id0);
  }

  private native double GetMaximumValue_9();
  public double GetMaximumValue()
  {
    return GetMaximumValue_9();
  }

  private native void SetSliderLength_10(double id0);
  public void SetSliderLength(double id0)
  {
    SetSliderLength_10(id0);
  }

  private native double GetSliderLengthMinValue_11();
  public double GetSliderLengthMinValue()
  {
    return GetSliderLengthMinValue_11();
  }

  private native double GetSliderLengthMaxValue_12();
  public double GetSliderLengthMaxValue()
  {
    return GetSliderLengthMaxValue_12();
  }

  private native double GetSliderLength_13();
  public double GetSliderLength()
  {
    return GetSliderLength_13();
  }

  private native void SetSliderWidth_14(double id0);
  public void SetSliderWidth(double id0)
  {
    SetSliderWidth_14(id0);
  }

  private native double GetSliderWidthMinValue_15();
  public double GetSliderWidthMinValue()
  {
    return GetSliderWidthMinValue_15();
  }

  private native double GetSliderWidthMaxValue_16();
  public double GetSliderWidthMaxValue()
  {
    return GetSliderWidthMaxValue_16();
  }

  private native double GetSliderWidth_17();
  public double GetSliderWidth()
  {
    return GetSliderWidth_17();
  }

  private native void SetTubeWidth_18(double id0);
  public void SetTubeWidth(double id0)
  {
    SetTubeWidth_18(id0);
  }

  private native double GetTubeWidthMinValue_19();
  public double GetTubeWidthMinValue()
  {
    return GetTubeWidthMinValue_19();
  }

  private native double GetTubeWidthMaxValue_20();
  public double GetTubeWidthMaxValue()
  {
    return GetTubeWidthMaxValue_20();
  }

  private native double GetTubeWidth_21();
  public double GetTubeWidth()
  {
    return GetTubeWidth_21();
  }

  private native void SetEndCapLength_22(double id0);
  public void SetEndCapLength(double id0)
  {
    SetEndCapLength_22(id0);
  }

  private native double GetEndCapLengthMinValue_23();
  public double GetEndCapLengthMinValue()
  {
    return GetEndCapLengthMinValue_23();
  }

  private native double GetEndCapLengthMaxValue_24();
  public double GetEndCapLengthMaxValue()
  {
    return GetEndCapLengthMaxValue_24();
  }

  private native double GetEndCapLength_25();
  public double GetEndCapLength()
  {
    return GetEndCapLength_25();
  }

  private native void SetEndCapWidth_26(double id0);
  public void SetEndCapWidth(double id0)
  {
    SetEndCapWidth_26(id0);
  }

  private native double GetEndCapWidthMinValue_27();
  public double GetEndCapWidthMinValue()
  {
    return GetEndCapWidthMinValue_27();
  }

  private native double GetEndCapWidthMaxValue_28();
  public double GetEndCapWidthMaxValue()
  {
    return GetEndCapWidthMaxValue_28();
  }

  private native double GetEndCapWidth_29();
  public double GetEndCapWidth()
  {
    return GetEndCapWidth_29();
  }

  private native void SetTitleText_30(byte[] id0, int len0);
  public void SetTitleText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitleText_30(bytes0, bytes0.length);
  }

  private native byte[] GetTitleText_31();
  public String GetTitleText()
  {
    return new String(GetTitleText_31(), StandardCharsets.UTF_8);
  }

  private native void SetLabelFormat_32(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_32(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_33();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_33(), StandardCharsets.UTF_8);
  }

  private native void SetLabelHeight_34(double id0);
  public void SetLabelHeight(double id0)
  {
    SetLabelHeight_34(id0);
  }

  private native double GetLabelHeightMinValue_35();
  public double GetLabelHeightMinValue()
  {
    return GetLabelHeightMinValue_35();
  }

  private native double GetLabelHeightMaxValue_36();
  public double GetLabelHeightMaxValue()
  {
    return GetLabelHeightMaxValue_36();
  }

  private native double GetLabelHeight_37();
  public double GetLabelHeight()
  {
    return GetLabelHeight_37();
  }

  private native void SetTitleHeight_38(double id0);
  public void SetTitleHeight(double id0)
  {
    SetTitleHeight_38(id0);
  }

  private native double GetTitleHeightMinValue_39();
  public double GetTitleHeightMinValue()
  {
    return GetTitleHeightMinValue_39();
  }

  private native double GetTitleHeightMaxValue_40();
  public double GetTitleHeightMaxValue()
  {
    return GetTitleHeightMaxValue_40();
  }

  private native double GetTitleHeight_41();
  public double GetTitleHeight()
  {
    return GetTitleHeight_41();
  }

  private native void SetShowSliderLabel_42(int id0);
  public void SetShowSliderLabel(int id0)
  {
    SetShowSliderLabel_42(id0);
  }

  private native int GetShowSliderLabel_43();
  public int GetShowSliderLabel()
  {
    return GetShowSliderLabel_43();
  }

  private native void ShowSliderLabelOn_44();
  public void ShowSliderLabelOn()
  {
    ShowSliderLabelOn_44();
  }

  private native void ShowSliderLabelOff_45();
  public void ShowSliderLabelOff()
  {
    ShowSliderLabelOff_45();
  }

  private native double GetCurrentT_46();
  public double GetCurrentT()
  {
    return GetCurrentT_46();
  }

  private native double GetPickedT_47();
  public double GetPickedT()
  {
    return GetPickedT_47();
  }

  public vtkSliderRepresentation() { super(); }

  public vtkSliderRepresentation(long id) { super(id); }

}
