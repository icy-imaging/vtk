// java wrapper for vtkColorTransferFunction object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkColorTransferFunction extends vtkScalarsToColors
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

  private native void DeepCopy_4(vtkScalarsToColors id0);
  public void DeepCopy(vtkScalarsToColors id0)
  {
    DeepCopy_4(id0);
  }

  private native void ShallowCopy_5(vtkColorTransferFunction id0);
  public void ShallowCopy(vtkColorTransferFunction id0)
  {
    ShallowCopy_5(id0);
  }

  private native int GetSize_6();
  public int GetSize()
  {
    return GetSize_6();
  }

  private native int AddRGBPoint_7(double id0,double id1,double id2,double id3);
  public int AddRGBPoint(double id0,double id1,double id2,double id3)
  {
    return AddRGBPoint_7(id0,id1,id2,id3);
  }

  private native int AddRGBPoint_8(double id0,double id1,double id2,double id3,double id4,double id5);
  public int AddRGBPoint(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    return AddRGBPoint_8(id0,id1,id2,id3,id4,id5);
  }

  private native int AddRGBPoints_9(vtkDoubleArray id0,vtkDoubleArray id1);
  public int AddRGBPoints(vtkDoubleArray id0,vtkDoubleArray id1)
  {
    return AddRGBPoints_9(id0,id1);
  }

  private native int AddRGBPoints_10(vtkDoubleArray id0,vtkDoubleArray id1,double id2,double id3);
  public int AddRGBPoints(vtkDoubleArray id0,vtkDoubleArray id1,double id2,double id3)
  {
    return AddRGBPoints_10(id0,id1,id2,id3);
  }

  private native int AddHSVPoint_11(double id0,double id1,double id2,double id3);
  public int AddHSVPoint(double id0,double id1,double id2,double id3)
  {
    return AddHSVPoint_11(id0,id1,id2,id3);
  }

  private native int AddHSVPoint_12(double id0,double id1,double id2,double id3,double id4,double id5);
  public int AddHSVPoint(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    return AddHSVPoint_12(id0,id1,id2,id3,id4,id5);
  }

  private native int RemovePoint_13(double id0);
  public int RemovePoint(double id0)
  {
    return RemovePoint_13(id0);
  }

  private native void AddRGBSegment_14(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7);
  public void AddRGBSegment(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7)
  {
    AddRGBSegment_14(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native void AddHSVSegment_15(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7);
  public void AddHSVSegment(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7)
  {
    AddHSVSegment_15(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native void RemoveAllPoints_16();
  public void RemoveAllPoints()
  {
    RemoveAllPoints_16();
  }

  private native double[] GetColor_17(double id0);
  public double[] GetColor(double id0)
  {
    return GetColor_17(id0);
  }

  private native void GetColor_18(double id0,double id1[]);
  public void GetColor(double id0,double id1[])
  {
    GetColor_18(id0,id1);
  }

  private native double GetRedValue_19(double id0);
  public double GetRedValue(double id0)
  {
    return GetRedValue_19(id0);
  }

  private native double GetGreenValue_20(double id0);
  public double GetGreenValue(double id0)
  {
    return GetGreenValue_20(id0);
  }

  private native double GetBlueValue_21(double id0);
  public double GetBlueValue(double id0)
  {
    return GetBlueValue_21(id0);
  }

  private native int GetNodeValue_22(int id0,double id1[]);
  public int GetNodeValue(int id0,double id1[])
  {
    return GetNodeValue_22(id0,id1);
  }

  private native int SetNodeValue_23(int id0,double id1[]);
  public int SetNodeValue(int id0,double id1[])
  {
    return SetNodeValue_23(id0,id1);
  }

  private native double[] GetRange_24();
  public double[] GetRange()
  {
    return GetRange_24();
  }

  private native void GetRange_25(double id0[]);
  public void GetRange(double id0[])
  {
    GetRange_25(id0);
  }

  private native int AdjustRange_26(double id0[]);
  public int AdjustRange(double id0[])
  {
    return AdjustRange_26(id0);
  }

  private native void SetClamping_27(int id0);
  public void SetClamping(int id0)
  {
    SetClamping_27(id0);
  }

  private native int GetClampingMinValue_28();
  public int GetClampingMinValue()
  {
    return GetClampingMinValue_28();
  }

  private native int GetClampingMaxValue_29();
  public int GetClampingMaxValue()
  {
    return GetClampingMaxValue_29();
  }

  private native int GetClamping_30();
  public int GetClamping()
  {
    return GetClamping_30();
  }

  private native void ClampingOn_31();
  public void ClampingOn()
  {
    ClampingOn_31();
  }

  private native void ClampingOff_32();
  public void ClampingOff()
  {
    ClampingOff_32();
  }

  private native void SetColorSpace_33(int id0);
  public void SetColorSpace(int id0)
  {
    SetColorSpace_33(id0);
  }

  private native int GetColorSpaceMinValue_34();
  public int GetColorSpaceMinValue()
  {
    return GetColorSpaceMinValue_34();
  }

  private native int GetColorSpaceMaxValue_35();
  public int GetColorSpaceMaxValue()
  {
    return GetColorSpaceMaxValue_35();
  }

  private native void SetColorSpaceToRGB_36();
  public void SetColorSpaceToRGB()
  {
    SetColorSpaceToRGB_36();
  }

  private native void SetColorSpaceToHSV_37();
  public void SetColorSpaceToHSV()
  {
    SetColorSpaceToHSV_37();
  }

  private native void SetColorSpaceToLab_38();
  public void SetColorSpaceToLab()
  {
    SetColorSpaceToLab_38();
  }

  private native void SetColorSpaceToLabCIEDE2000_39();
  public void SetColorSpaceToLabCIEDE2000()
  {
    SetColorSpaceToLabCIEDE2000_39();
  }

  private native void SetColorSpaceToDiverging_40();
  public void SetColorSpaceToDiverging()
  {
    SetColorSpaceToDiverging_40();
  }

  private native void SetColorSpaceToStep_41();
  public void SetColorSpaceToStep()
  {
    SetColorSpaceToStep_41();
  }

  private native int GetColorSpace_42();
  public int GetColorSpace()
  {
    return GetColorSpace_42();
  }

  private native void SetHSVWrap_43(int id0);
  public void SetHSVWrap(int id0)
  {
    SetHSVWrap_43(id0);
  }

  private native int GetHSVWrap_44();
  public int GetHSVWrap()
  {
    return GetHSVWrap_44();
  }

  private native void HSVWrapOn_45();
  public void HSVWrapOn()
  {
    HSVWrapOn_45();
  }

  private native void HSVWrapOff_46();
  public void HSVWrapOff()
  {
    HSVWrapOff_46();
  }

  private native void SetScale_47(int id0);
  public void SetScale(int id0)
  {
    SetScale_47(id0);
  }

  private native void SetScaleToLinear_48();
  public void SetScaleToLinear()
  {
    SetScaleToLinear_48();
  }

  private native void SetScaleToLog10_49();
  public void SetScaleToLog10()
  {
    SetScaleToLog10_49();
  }

  private native int GetScale_50();
  public int GetScale()
  {
    return GetScale_50();
  }

  private native void SetNanColor_51(double id0,double id1,double id2);
  public void SetNanColor(double id0,double id1,double id2)
  {
    SetNanColor_51(id0,id1,id2);
  }

  private native void SetNanColor_52(double id0[]);
  public void SetNanColor(double id0[])
  {
    SetNanColor_52(id0);
  }

  private native double[] GetNanColor_53();
  public double[] GetNanColor()
  {
    return GetNanColor_53();
  }

  private native void SetNanOpacity_54(double id0);
  public void SetNanOpacity(double id0)
  {
    SetNanOpacity_54(id0);
  }

  private native double GetNanOpacity_55();
  public double GetNanOpacity()
  {
    return GetNanOpacity_55();
  }

  private native void SetNanColorRGBA_56(double id0,double id1,double id2,double id3);
  public void SetNanColorRGBA(double id0,double id1,double id2,double id3)
  {
    SetNanColorRGBA_56(id0,id1,id2,id3);
  }

  private native void SetNanColorRGBA_57(double id0[]);
  public void SetNanColorRGBA(double id0[])
  {
    SetNanColorRGBA_57(id0);
  }

  private native void SetBelowRangeColor_58(double id0,double id1,double id2);
  public void SetBelowRangeColor(double id0,double id1,double id2)
  {
    SetBelowRangeColor_58(id0,id1,id2);
  }

  private native void SetBelowRangeColor_59(double id0[]);
  public void SetBelowRangeColor(double id0[])
  {
    SetBelowRangeColor_59(id0);
  }

  private native double[] GetBelowRangeColor_60();
  public double[] GetBelowRangeColor()
  {
    return GetBelowRangeColor_60();
  }

  private native void SetUseBelowRangeColor_61(int id0);
  public void SetUseBelowRangeColor(int id0)
  {
    SetUseBelowRangeColor_61(id0);
  }

  private native int GetUseBelowRangeColor_62();
  public int GetUseBelowRangeColor()
  {
    return GetUseBelowRangeColor_62();
  }

  private native void UseBelowRangeColorOn_63();
  public void UseBelowRangeColorOn()
  {
    UseBelowRangeColorOn_63();
  }

  private native void UseBelowRangeColorOff_64();
  public void UseBelowRangeColorOff()
  {
    UseBelowRangeColorOff_64();
  }

  private native void SetAboveRangeColor_65(double id0,double id1,double id2);
  public void SetAboveRangeColor(double id0,double id1,double id2)
  {
    SetAboveRangeColor_65(id0,id1,id2);
  }

  private native void SetAboveRangeColor_66(double id0[]);
  public void SetAboveRangeColor(double id0[])
  {
    SetAboveRangeColor_66(id0);
  }

  private native double[] GetAboveRangeColor_67();
  public double[] GetAboveRangeColor()
  {
    return GetAboveRangeColor_67();
  }

  private native void SetUseAboveRangeColor_68(int id0);
  public void SetUseAboveRangeColor(int id0)
  {
    SetUseAboveRangeColor_68(id0);
  }

  private native int GetUseAboveRangeColor_69();
  public int GetUseAboveRangeColor()
  {
    return GetUseAboveRangeColor_69();
  }

  private native void UseAboveRangeColorOn_70();
  public void UseAboveRangeColorOn()
  {
    UseAboveRangeColorOn_70();
  }

  private native void UseAboveRangeColorOff_71();
  public void UseAboveRangeColorOff()
  {
    UseAboveRangeColorOff_71();
  }

  private native void SetAllowDuplicateScalars_72(int id0);
  public void SetAllowDuplicateScalars(int id0)
  {
    SetAllowDuplicateScalars_72(id0);
  }

  private native int GetAllowDuplicateScalars_73();
  public int GetAllowDuplicateScalars()
  {
    return GetAllowDuplicateScalars_73();
  }

  private native void AllowDuplicateScalarsOn_74();
  public void AllowDuplicateScalarsOn()
  {
    AllowDuplicateScalarsOn_74();
  }

  private native void AllowDuplicateScalarsOff_75();
  public void AllowDuplicateScalarsOff()
  {
    AllowDuplicateScalarsOff_75();
  }

  private native long GetNumberOfAvailableColors_76();
  public long GetNumberOfAvailableColors()
  {
    return GetNumberOfAvailableColors_76();
  }

  private native void GetIndexedColor_77(long id0,double id1[]);
  public void GetIndexedColor(long id0,double id1[])
  {
    GetIndexedColor_77(id0,id1);
  }

  public vtkColorTransferFunction() { super(); }

  public vtkColorTransferFunction(long id) { super(id); }
  public native long   VTKInit();

}
