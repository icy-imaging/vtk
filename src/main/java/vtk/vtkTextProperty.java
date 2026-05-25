// java wrapper for vtkTextProperty object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTextProperty extends vtkObject
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

  private native void SetColor_4(double id0,double id1,double id2);
  public void SetColor(double id0,double id1,double id2)
  {
    SetColor_4(id0,id1,id2);
  }

  private native void SetColor_5(double id0[]);
  public void SetColor(double id0[])
  {
    SetColor_5(id0);
  }

  private native double[] GetColor_6();
  public double[] GetColor()
  {
    return GetColor_6();
  }

  private native void SetOpacity_7(double id0);
  public void SetOpacity(double id0)
  {
    SetOpacity_7(id0);
  }

  private native double GetOpacityMinValue_8();
  public double GetOpacityMinValue()
  {
    return GetOpacityMinValue_8();
  }

  private native double GetOpacityMaxValue_9();
  public double GetOpacityMaxValue()
  {
    return GetOpacityMaxValue_9();
  }

  private native double GetOpacity_10();
  public double GetOpacity()
  {
    return GetOpacity_10();
  }

  private native void SetBackgroundColor_11(double id0,double id1,double id2);
  public void SetBackgroundColor(double id0,double id1,double id2)
  {
    SetBackgroundColor_11(id0,id1,id2);
  }

  private native void SetBackgroundColor_12(double id0[]);
  public void SetBackgroundColor(double id0[])
  {
    SetBackgroundColor_12(id0);
  }

  private native double[] GetBackgroundColor_13();
  public double[] GetBackgroundColor()
  {
    return GetBackgroundColor_13();
  }

  private native void SetBackgroundOpacity_14(double id0);
  public void SetBackgroundOpacity(double id0)
  {
    SetBackgroundOpacity_14(id0);
  }

  private native double GetBackgroundOpacityMinValue_15();
  public double GetBackgroundOpacityMinValue()
  {
    return GetBackgroundOpacityMinValue_15();
  }

  private native double GetBackgroundOpacityMaxValue_16();
  public double GetBackgroundOpacityMaxValue()
  {
    return GetBackgroundOpacityMaxValue_16();
  }

  private native double GetBackgroundOpacity_17();
  public double GetBackgroundOpacity()
  {
    return GetBackgroundOpacity_17();
  }

  private native void SetBackgroundRGBA_18(double id0[]);
  public void SetBackgroundRGBA(double id0[])
  {
    SetBackgroundRGBA_18(id0);
  }

  private native void SetBackgroundRGBA_19(double id0,double id1,double id2,double id3);
  public void SetBackgroundRGBA(double id0,double id1,double id2,double id3)
  {
    SetBackgroundRGBA_19(id0,id1,id2,id3);
  }

  private native void GetBackgroundRGBA_20(double id0[]);
  public void GetBackgroundRGBA(double id0[])
  {
    GetBackgroundRGBA_20(id0);
  }

  private native void SetFrameColor_21(double id0,double id1,double id2);
  public void SetFrameColor(double id0,double id1,double id2)
  {
    SetFrameColor_21(id0,id1,id2);
  }

  private native void SetFrameColor_22(double id0[]);
  public void SetFrameColor(double id0[])
  {
    SetFrameColor_22(id0);
  }

  private native double[] GetFrameColor_23();
  public double[] GetFrameColor()
  {
    return GetFrameColor_23();
  }

  private native void SetFrame_24(int id0);
  public void SetFrame(int id0)
  {
    SetFrame_24(id0);
  }

  private native int GetFrame_25();
  public int GetFrame()
  {
    return GetFrame_25();
  }

  private native void FrameOn_26();
  public void FrameOn()
  {
    FrameOn_26();
  }

  private native void FrameOff_27();
  public void FrameOff()
  {
    FrameOff_27();
  }

  private native void SetFrameWidth_28(int id0);
  public void SetFrameWidth(int id0)
  {
    SetFrameWidth_28(id0);
  }

  private native int GetFrameWidthMinValue_29();
  public int GetFrameWidthMinValue()
  {
    return GetFrameWidthMinValue_29();
  }

  private native int GetFrameWidthMaxValue_30();
  public int GetFrameWidthMaxValue()
  {
    return GetFrameWidthMaxValue_30();
  }

  private native int GetFrameWidth_31();
  public int GetFrameWidth()
  {
    return GetFrameWidth_31();
  }

  private native byte[] GetFontFamilyAsString_32();
  public String GetFontFamilyAsString()
  {
    return new String(GetFontFamilyAsString_32(), StandardCharsets.UTF_8);
  }

  private native void SetFontFamilyAsString_33(byte[] id0, int len0);
  public void SetFontFamilyAsString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFontFamilyAsString_33(bytes0, bytes0.length);
  }

  private native void SetFontFamily_34(int id0);
  public void SetFontFamily(int id0)
  {
    SetFontFamily_34(id0);
  }

  private native int GetFontFamily_35();
  public int GetFontFamily()
  {
    return GetFontFamily_35();
  }

  private native int GetFontFamilyMinValue_36();
  public int GetFontFamilyMinValue()
  {
    return GetFontFamilyMinValue_36();
  }

  private native void SetFontFamilyToArial_37();
  public void SetFontFamilyToArial()
  {
    SetFontFamilyToArial_37();
  }

  private native void SetFontFamilyToCourier_38();
  public void SetFontFamilyToCourier()
  {
    SetFontFamilyToCourier_38();
  }

  private native void SetFontFamilyToTimes_39();
  public void SetFontFamilyToTimes()
  {
    SetFontFamilyToTimes_39();
  }

  private native int GetFontFamilyFromString_40(byte[] id0, int len0);
  public int GetFontFamilyFromString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetFontFamilyFromString_40(bytes0, bytes0.length);
  }

  private native byte[] GetFontFamilyAsString_41(int id0);
  public String GetFontFamilyAsString(int id0)
  {
    return new String(GetFontFamilyAsString_41(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetFontFile_42();
  public String GetFontFile()
  {
    return new String(GetFontFile_42(), StandardCharsets.UTF_8);
  }

  private native void SetFontFile_43(byte[] id0, int len0);
  public void SetFontFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFontFile_43(bytes0, bytes0.length);
  }

  private native void SetFontSize_44(int id0);
  public void SetFontSize(int id0)
  {
    SetFontSize_44(id0);
  }

  private native int GetFontSizeMinValue_45();
  public int GetFontSizeMinValue()
  {
    return GetFontSizeMinValue_45();
  }

  private native int GetFontSizeMaxValue_46();
  public int GetFontSizeMaxValue()
  {
    return GetFontSizeMaxValue_46();
  }

  private native int GetFontSize_47();
  public int GetFontSize()
  {
    return GetFontSize_47();
  }

  private native void SetBold_48(int id0);
  public void SetBold(int id0)
  {
    SetBold_48(id0);
  }

  private native int GetBold_49();
  public int GetBold()
  {
    return GetBold_49();
  }

  private native void BoldOn_50();
  public void BoldOn()
  {
    BoldOn_50();
  }

  private native void BoldOff_51();
  public void BoldOff()
  {
    BoldOff_51();
  }

  private native void SetItalic_52(int id0);
  public void SetItalic(int id0)
  {
    SetItalic_52(id0);
  }

  private native int GetItalic_53();
  public int GetItalic()
  {
    return GetItalic_53();
  }

  private native void ItalicOn_54();
  public void ItalicOn()
  {
    ItalicOn_54();
  }

  private native void ItalicOff_55();
  public void ItalicOff()
  {
    ItalicOff_55();
  }

  private native void SetShadow_56(int id0);
  public void SetShadow(int id0)
  {
    SetShadow_56(id0);
  }

  private native int GetShadow_57();
  public int GetShadow()
  {
    return GetShadow_57();
  }

  private native void ShadowOn_58();
  public void ShadowOn()
  {
    ShadowOn_58();
  }

  private native void ShadowOff_59();
  public void ShadowOff()
  {
    ShadowOff_59();
  }

  private native void SetShadowOffset_60(int id0,int id1);
  public void SetShadowOffset(int id0,int id1)
  {
    SetShadowOffset_60(id0,id1);
  }

  private native void SetShadowOffset_61(int id0[]);
  public void SetShadowOffset(int id0[])
  {
    SetShadowOffset_61(id0);
  }

  private native int[] GetShadowOffset_62();
  public int[] GetShadowOffset()
  {
    return GetShadowOffset_62();
  }

  private native void GetShadowColor_63(double id0[]);
  public void GetShadowColor(double id0[])
  {
    GetShadowColor_63(id0);
  }

  private native void SetJustification_64(int id0);
  public void SetJustification(int id0)
  {
    SetJustification_64(id0);
  }

  private native int GetJustificationMinValue_65();
  public int GetJustificationMinValue()
  {
    return GetJustificationMinValue_65();
  }

  private native int GetJustificationMaxValue_66();
  public int GetJustificationMaxValue()
  {
    return GetJustificationMaxValue_66();
  }

  private native int GetJustification_67();
  public int GetJustification()
  {
    return GetJustification_67();
  }

  private native void SetJustificationToLeft_68();
  public void SetJustificationToLeft()
  {
    SetJustificationToLeft_68();
  }

  private native void SetJustificationToCentered_69();
  public void SetJustificationToCentered()
  {
    SetJustificationToCentered_69();
  }

  private native void SetJustificationToRight_70();
  public void SetJustificationToRight()
  {
    SetJustificationToRight_70();
  }

  private native byte[] GetJustificationAsString_71();
  public String GetJustificationAsString()
  {
    return new String(GetJustificationAsString_71(), StandardCharsets.UTF_8);
  }

  private native void SetVerticalJustification_72(int id0);
  public void SetVerticalJustification(int id0)
  {
    SetVerticalJustification_72(id0);
  }

  private native int GetVerticalJustificationMinValue_73();
  public int GetVerticalJustificationMinValue()
  {
    return GetVerticalJustificationMinValue_73();
  }

  private native int GetVerticalJustificationMaxValue_74();
  public int GetVerticalJustificationMaxValue()
  {
    return GetVerticalJustificationMaxValue_74();
  }

  private native int GetVerticalJustification_75();
  public int GetVerticalJustification()
  {
    return GetVerticalJustification_75();
  }

  private native void SetVerticalJustificationToBottom_76();
  public void SetVerticalJustificationToBottom()
  {
    SetVerticalJustificationToBottom_76();
  }

  private native void SetVerticalJustificationToCentered_77();
  public void SetVerticalJustificationToCentered()
  {
    SetVerticalJustificationToCentered_77();
  }

  private native void SetVerticalJustificationToTop_78();
  public void SetVerticalJustificationToTop()
  {
    SetVerticalJustificationToTop_78();
  }

  private native byte[] GetVerticalJustificationAsString_79();
  public String GetVerticalJustificationAsString()
  {
    return new String(GetVerticalJustificationAsString_79(), StandardCharsets.UTF_8);
  }

  private native void SetUseTightBoundingBox_80(int id0);
  public void SetUseTightBoundingBox(int id0)
  {
    SetUseTightBoundingBox_80(id0);
  }

  private native int GetUseTightBoundingBox_81();
  public int GetUseTightBoundingBox()
  {
    return GetUseTightBoundingBox_81();
  }

  private native void UseTightBoundingBoxOn_82();
  public void UseTightBoundingBoxOn()
  {
    UseTightBoundingBoxOn_82();
  }

  private native void UseTightBoundingBoxOff_83();
  public void UseTightBoundingBoxOff()
  {
    UseTightBoundingBoxOff_83();
  }

  private native void SetOrientation_84(double id0);
  public void SetOrientation(double id0)
  {
    SetOrientation_84(id0);
  }

  private native double GetOrientation_85();
  public double GetOrientation()
  {
    return GetOrientation_85();
  }

  private native void SetLineSpacing_86(double id0);
  public void SetLineSpacing(double id0)
  {
    SetLineSpacing_86(id0);
  }

  private native double GetLineSpacing_87();
  public double GetLineSpacing()
  {
    return GetLineSpacing_87();
  }

  private native void SetLineOffset_88(double id0);
  public void SetLineOffset(double id0)
  {
    SetLineOffset_88(id0);
  }

  private native double GetLineOffset_89();
  public double GetLineOffset()
  {
    return GetLineOffset_89();
  }

  private native void SetCellOffset_90(double id0);
  public void SetCellOffset(double id0)
  {
    SetCellOffset_90(id0);
  }

  private native double GetCellOffset_91();
  public double GetCellOffset()
  {
    return GetCellOffset_91();
  }

  private native void SetInteriorLinesVisibility_92(boolean id0);
  public void SetInteriorLinesVisibility(boolean id0)
  {
    SetInteriorLinesVisibility_92(id0);
  }

  private native boolean GetInteriorLinesVisibility_93();
  public boolean GetInteriorLinesVisibility()
  {
    return GetInteriorLinesVisibility_93();
  }

  private native void SetInteriorLinesWidth_94(int id0);
  public void SetInteriorLinesWidth(int id0)
  {
    SetInteriorLinesWidth_94(id0);
  }

  private native int GetInteriorLinesWidth_95();
  public int GetInteriorLinesWidth()
  {
    return GetInteriorLinesWidth_95();
  }

  private native void SetInteriorLinesColor_96(double id0,double id1,double id2);
  public void SetInteriorLinesColor(double id0,double id1,double id2)
  {
    SetInteriorLinesColor_96(id0,id1,id2);
  }

  private native void SetInteriorLinesColor_97(double id0[]);
  public void SetInteriorLinesColor(double id0[])
  {
    SetInteriorLinesColor_97(id0);
  }

  private native double[] GetInteriorLinesColor_98();
  public double[] GetInteriorLinesColor()
  {
    return GetInteriorLinesColor_98();
  }

  private native void ShallowCopy_99(vtkTextProperty id0);
  public void ShallowCopy(vtkTextProperty id0)
  {
    ShallowCopy_99(id0);
  }

  public vtkTextProperty() { super(); }

  public vtkTextProperty(long id) { super(id); }
  public native long   VTKInit();

}
