// java wrapper for vtkExtractHistogram object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractHistogram extends vtkTableAlgorithm
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

  private native void SetComponent_4(int id0);
  public void SetComponent(int id0)
  {
    SetComponent_4(id0);
  }

  private native int GetComponentMinValue_5();
  public int GetComponentMinValue()
  {
    return GetComponentMinValue_5();
  }

  private native int GetComponentMaxValue_6();
  public int GetComponentMaxValue()
  {
    return GetComponentMaxValue_6();
  }

  private native int GetComponent_7();
  public int GetComponent()
  {
    return GetComponent_7();
  }

  private native void SetBinCount_8(int id0);
  public void SetBinCount(int id0)
  {
    SetBinCount_8(id0);
  }

  private native int GetBinCountMinValue_9();
  public int GetBinCountMinValue()
  {
    return GetBinCountMinValue_9();
  }

  private native int GetBinCountMaxValue_10();
  public int GetBinCountMaxValue()
  {
    return GetBinCountMaxValue_10();
  }

  private native int GetBinCount_11();
  public int GetBinCount()
  {
    return GetBinCount_11();
  }

  private native void SetCenterBinsAroundMinAndMax_12(boolean id0);
  public void SetCenterBinsAroundMinAndMax(boolean id0)
  {
    SetCenterBinsAroundMinAndMax_12(id0);
  }

  private native boolean GetCenterBinsAroundMinAndMax_13();
  public boolean GetCenterBinsAroundMinAndMax()
  {
    return GetCenterBinsAroundMinAndMax_13();
  }

  private native void CenterBinsAroundMinAndMaxOn_14();
  public void CenterBinsAroundMinAndMaxOn()
  {
    CenterBinsAroundMinAndMaxOn_14();
  }

  private native void CenterBinsAroundMinAndMaxOff_15();
  public void CenterBinsAroundMinAndMaxOff()
  {
    CenterBinsAroundMinAndMaxOff_15();
  }

  private native void SetCustomBinRanges_16(double id0,double id1);
  public void SetCustomBinRanges(double id0,double id1)
  {
    SetCustomBinRanges_16(id0,id1);
  }

  private native void SetCustomBinRanges_17(double id0[]);
  public void SetCustomBinRanges(double id0[])
  {
    SetCustomBinRanges_17(id0);
  }

  private native double[] GetCustomBinRanges_18();
  public double[] GetCustomBinRanges()
  {
    return GetCustomBinRanges_18();
  }

  private native void SetUseCustomBinRanges_19(boolean id0);
  public void SetUseCustomBinRanges(boolean id0)
  {
    SetUseCustomBinRanges_19(id0);
  }

  private native boolean GetUseCustomBinRanges_20();
  public boolean GetUseCustomBinRanges()
  {
    return GetUseCustomBinRanges_20();
  }

  private native void UseCustomBinRangesOn_21();
  public void UseCustomBinRangesOn()
  {
    UseCustomBinRangesOn_21();
  }

  private native void UseCustomBinRangesOff_22();
  public void UseCustomBinRangesOff()
  {
    UseCustomBinRangesOff_22();
  }

  private native void SetCalculateAverages_23(boolean id0);
  public void SetCalculateAverages(boolean id0)
  {
    SetCalculateAverages_23(id0);
  }

  private native boolean GetCalculateAverages_24();
  public boolean GetCalculateAverages()
  {
    return GetCalculateAverages_24();
  }

  private native void CalculateAveragesOn_25();
  public void CalculateAveragesOn()
  {
    CalculateAveragesOn_25();
  }

  private native void CalculateAveragesOff_26();
  public void CalculateAveragesOff()
  {
    CalculateAveragesOff_26();
  }

  private native void SetBinExtentsArrayName_27(byte[] id0, int len0);
  public void SetBinExtentsArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBinExtentsArrayName_27(bytes0, bytes0.length);
  }

  private native byte[] GetBinExtentsArrayName_28();
  public String GetBinExtentsArrayName()
  {
    return new String(GetBinExtentsArrayName_28(), StandardCharsets.UTF_8);
  }

  private native void SetBinValuesArrayName_29(byte[] id0, int len0);
  public void SetBinValuesArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBinValuesArrayName_29(bytes0, bytes0.length);
  }

  private native byte[] GetBinValuesArrayName_30();
  public String GetBinValuesArrayName()
  {
    return new String(GetBinValuesArrayName_30(), StandardCharsets.UTF_8);
  }

  private native void SetNormalize_31(boolean id0);
  public void SetNormalize(boolean id0)
  {
    SetNormalize_31(id0);
  }

  private native void NormalizeOn_32();
  public void NormalizeOn()
  {
    NormalizeOn_32();
  }

  private native void NormalizeOff_33();
  public void NormalizeOff()
  {
    NormalizeOff_33();
  }

  private native boolean GetNormalize_34();
  public boolean GetNormalize()
  {
    return GetNormalize_34();
  }

  private native void SetAccumulation_35(boolean id0);
  public void SetAccumulation(boolean id0)
  {
    SetAccumulation_35(id0);
  }

  private native void AccumulationOn_36();
  public void AccumulationOn()
  {
    AccumulationOn_36();
  }

  private native void AccumulationOff_37();
  public void AccumulationOff()
  {
    AccumulationOff_37();
  }

  private native boolean GetAccumulation_38();
  public boolean GetAccumulation()
  {
    return GetAccumulation_38();
  }

  private native void SetBinAccumulationArrayName_39(byte[] id0, int len0);
  public void SetBinAccumulationArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBinAccumulationArrayName_39(bytes0, bytes0.length);
  }

  private native byte[] GetBinAccumulationArrayName_40();
  public String GetBinAccumulationArrayName()
  {
    return new String(GetBinAccumulationArrayName_40(), StandardCharsets.UTF_8);
  }

  private native double[] GetBinRange_41();
  public double[] GetBinRange()
  {
    return GetBinRange_41();
  }

  public vtkExtractHistogram() { super(); }

  public vtkExtractHistogram(long id) { super(id); }
  public native long   VTKInit();

}
