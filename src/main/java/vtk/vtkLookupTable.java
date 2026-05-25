// java wrapper for vtkLookupTable object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLookupTable extends vtkScalarsToColors
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

  private native int IsOpaque_4();
  public int IsOpaque()
  {
    return IsOpaque_4();
  }

  private native int IsOpaque_5(vtkAbstractArray id0,int id1,int id2);
  public int IsOpaque(vtkAbstractArray id0,int id1,int id2)
  {
    return IsOpaque_5(id0,id1,id2);
  }

  private native int IsOpaque_6(vtkAbstractArray id0,int id1,int id2,vtkUnsignedCharArray id3,byte id4);
  public int IsOpaque(vtkAbstractArray id0,int id1,int id2,vtkUnsignedCharArray id3,byte id4)
  {
    return IsOpaque_6(id0,id1,id2,id3,id4);
  }

  private native int Allocate_7(int id0,int id1);
  public int Allocate(int id0,int id1)
  {
    return Allocate_7(id0,id1);
  }

  private native void Build_8();
  public void Build()
  {
    Build_8();
  }

  private native void ForceBuild_9();
  public void ForceBuild()
  {
    ForceBuild_9();
  }

  private native void BuildSpecialColors_10();
  public void BuildSpecialColors()
  {
    BuildSpecialColors_10();
  }

  private native void SetRamp_11(int id0);
  public void SetRamp(int id0)
  {
    SetRamp_11(id0);
  }

  private native void SetRampToLinear_12();
  public void SetRampToLinear()
  {
    SetRampToLinear_12();
  }

  private native void SetRampToSCurve_13();
  public void SetRampToSCurve()
  {
    SetRampToSCurve_13();
  }

  private native void SetRampToSQRT_14();
  public void SetRampToSQRT()
  {
    SetRampToSQRT_14();
  }

  private native int GetRamp_15();
  public int GetRamp()
  {
    return GetRamp_15();
  }

  private native void SetScale_16(int id0);
  public void SetScale(int id0)
  {
    SetScale_16(id0);
  }

  private native void SetScaleToLinear_17();
  public void SetScaleToLinear()
  {
    SetScaleToLinear_17();
  }

  private native void SetScaleToLog10_18();
  public void SetScaleToLog10()
  {
    SetScaleToLog10_18();
  }

  private native int GetScale_19();
  public int GetScale()
  {
    return GetScale_19();
  }

  private native void SetTableRange_20(double id0[]);
  public void SetTableRange(double id0[])
  {
    SetTableRange_20(id0);
  }

  private native void SetTableRange_21(double id0,double id1);
  public void SetTableRange(double id0,double id1)
  {
    SetTableRange_21(id0,id1);
  }

  private native double[] GetTableRange_22();
  public double[] GetTableRange()
  {
    return GetTableRange_22();
  }

  private native void SetHueRange_23(double id0,double id1);
  public void SetHueRange(double id0,double id1)
  {
    SetHueRange_23(id0,id1);
  }

  private native void SetHueRange_24(double id0[]);
  public void SetHueRange(double id0[])
  {
    SetHueRange_24(id0);
  }

  private native double[] GetHueRange_25();
  public double[] GetHueRange()
  {
    return GetHueRange_25();
  }

  private native void SetSaturationRange_26(double id0,double id1);
  public void SetSaturationRange(double id0,double id1)
  {
    SetSaturationRange_26(id0,id1);
  }

  private native void SetSaturationRange_27(double id0[]);
  public void SetSaturationRange(double id0[])
  {
    SetSaturationRange_27(id0);
  }

  private native double[] GetSaturationRange_28();
  public double[] GetSaturationRange()
  {
    return GetSaturationRange_28();
  }

  private native void SetValueRange_29(double id0,double id1);
  public void SetValueRange(double id0,double id1)
  {
    SetValueRange_29(id0,id1);
  }

  private native void SetValueRange_30(double id0[]);
  public void SetValueRange(double id0[])
  {
    SetValueRange_30(id0);
  }

  private native double[] GetValueRange_31();
  public double[] GetValueRange()
  {
    return GetValueRange_31();
  }

  private native void SetAlphaRange_32(double id0,double id1);
  public void SetAlphaRange(double id0,double id1)
  {
    SetAlphaRange_32(id0,id1);
  }

  private native void SetAlphaRange_33(double id0[]);
  public void SetAlphaRange(double id0[])
  {
    SetAlphaRange_33(id0);
  }

  private native double[] GetAlphaRange_34();
  public double[] GetAlphaRange()
  {
    return GetAlphaRange_34();
  }

  private native void SetNanColor_35(double id0,double id1,double id2,double id3);
  public void SetNanColor(double id0,double id1,double id2,double id3)
  {
    SetNanColor_35(id0,id1,id2,id3);
  }

  private native void SetNanColor_36(double id0[]);
  public void SetNanColor(double id0[])
  {
    SetNanColor_36(id0);
  }

  private native double[] GetNanColor_37();
  public double[] GetNanColor()
  {
    return GetNanColor_37();
  }

  private native void SetBelowRangeColor_38(double id0,double id1,double id2,double id3);
  public void SetBelowRangeColor(double id0,double id1,double id2,double id3)
  {
    SetBelowRangeColor_38(id0,id1,id2,id3);
  }

  private native void SetBelowRangeColor_39(double id0[]);
  public void SetBelowRangeColor(double id0[])
  {
    SetBelowRangeColor_39(id0);
  }

  private native double[] GetBelowRangeColor_40();
  public double[] GetBelowRangeColor()
  {
    return GetBelowRangeColor_40();
  }

  private native void SetUseBelowRangeColor_41(int id0);
  public void SetUseBelowRangeColor(int id0)
  {
    SetUseBelowRangeColor_41(id0);
  }

  private native int GetUseBelowRangeColor_42();
  public int GetUseBelowRangeColor()
  {
    return GetUseBelowRangeColor_42();
  }

  private native void UseBelowRangeColorOn_43();
  public void UseBelowRangeColorOn()
  {
    UseBelowRangeColorOn_43();
  }

  private native void UseBelowRangeColorOff_44();
  public void UseBelowRangeColorOff()
  {
    UseBelowRangeColorOff_44();
  }

  private native void SetAboveRangeColor_45(double id0,double id1,double id2,double id3);
  public void SetAboveRangeColor(double id0,double id1,double id2,double id3)
  {
    SetAboveRangeColor_45(id0,id1,id2,id3);
  }

  private native void SetAboveRangeColor_46(double id0[]);
  public void SetAboveRangeColor(double id0[])
  {
    SetAboveRangeColor_46(id0);
  }

  private native double[] GetAboveRangeColor_47();
  public double[] GetAboveRangeColor()
  {
    return GetAboveRangeColor_47();
  }

  private native void SetUseAboveRangeColor_48(int id0);
  public void SetUseAboveRangeColor(int id0)
  {
    SetUseAboveRangeColor_48(id0);
  }

  private native int GetUseAboveRangeColor_49();
  public int GetUseAboveRangeColor()
  {
    return GetUseAboveRangeColor_49();
  }

  private native void UseAboveRangeColorOn_50();
  public void UseAboveRangeColorOn()
  {
    UseAboveRangeColorOn_50();
  }

  private native void UseAboveRangeColorOff_51();
  public void UseAboveRangeColorOff()
  {
    UseAboveRangeColorOff_51();
  }

  private native void GetColor_52(double id0,double id1[]);
  public void GetColor(double id0,double id1[])
  {
    GetColor_52(id0,id1);
  }

  private native double GetOpacity_53(double id0);
  public double GetOpacity(double id0)
  {
    return GetOpacity_53(id0);
  }

  private native long GetIndex_54(double id0);
  public long GetIndex(double id0)
  {
    return GetIndex_54(id0);
  }

  private native void SetNumberOfTableValues_55(long id0);
  public void SetNumberOfTableValues(long id0)
  {
    SetNumberOfTableValues_55(id0);
  }

  private native long GetNumberOfTableValues_56();
  public long GetNumberOfTableValues()
  {
    return GetNumberOfTableValues_56();
  }

  private native void SetTableValue_57(long id0,double id1[]);
  public void SetTableValue(long id0,double id1[])
  {
    SetTableValue_57(id0,id1);
  }

  private native void SetTableValue_58(long id0,double id1,double id2,double id3,double id4);
  public void SetTableValue(long id0,double id1,double id2,double id3,double id4)
  {
    SetTableValue_58(id0,id1,id2,id3,id4);
  }

  private native double[] GetTableValue_59(long id0);
  public double[] GetTableValue(long id0)
  {
    return GetTableValue_59(id0);
  }

  private native void GetTableValue_60(long id0,double id1[]);
  public void GetTableValue(long id0,double id1[])
  {
    GetTableValue_60(id0,id1);
  }

  private native double[] GetRange_61();
  public double[] GetRange()
  {
    return GetRange_61();
  }

  private native void SetRange_62(double id0,double id1);
  public void SetRange(double id0,double id1)
  {
    SetRange_62(id0,id1);
  }

  private native void SetRange_63(double id0[]);
  public void SetRange(double id0[])
  {
    SetRange_63(id0);
  }

  private native void GetLogRange_64(double id0[],double id1[]);
  public void GetLogRange(double id0[],double id1[])
  {
    GetLogRange_64(id0,id1);
  }

  private native double ApplyLogScale_65(double id0,double id1[],double id2[]);
  public double ApplyLogScale(double id0,double id1[],double id2[])
  {
    return ApplyLogScale_65(id0,id1,id2);
  }

  private native void SetNumberOfColors_66(long id0);
  public void SetNumberOfColors(long id0)
  {
    SetNumberOfColors_66(id0);
  }

  private native long GetNumberOfColorsMinValue_67();
  public long GetNumberOfColorsMinValue()
  {
    return GetNumberOfColorsMinValue_67();
  }

  private native long GetNumberOfColorsMaxValue_68();
  public long GetNumberOfColorsMaxValue()
  {
    return GetNumberOfColorsMaxValue_68();
  }

  private native long GetNumberOfColors_69();
  public long GetNumberOfColors()
  {
    return GetNumberOfColors_69();
  }

  private native void SetTable_70(vtkUnsignedCharArray id0);
  public void SetTable(vtkUnsignedCharArray id0)
  {
    SetTable_70(id0);
  }

  private native long GetTable_71();
  public vtkUnsignedCharArray GetTable()
  {
    long temp = GetTable_71();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void DeepCopy_72(vtkScalarsToColors id0);
  public void DeepCopy(vtkScalarsToColors id0)
  {
    DeepCopy_72(id0);
  }

  private native int UsingLogScale_73();
  public int UsingLogScale()
  {
    return UsingLogScale_73();
  }

  private native long GetNumberOfAvailableColors_74();
  public long GetNumberOfAvailableColors()
  {
    return GetNumberOfAvailableColors_74();
  }

  private native void GetIndexedColor_75(long id0,double id1[]);
  public void GetIndexedColor(long id0,double id1[])
  {
    GetIndexedColor_75(id0,id1);
  }

  public vtkLookupTable() { super(); }

  public vtkLookupTable(long id) { super(id); }
  public native long   VTKInit();

}
