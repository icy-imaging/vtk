// java wrapper for vtkTableFFT object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTableFFT extends vtkTableAlgorithm
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

  private native boolean GetCreateFrequencyColumn_4();
  public boolean GetCreateFrequencyColumn()
  {
    return GetCreateFrequencyColumn_4();
  }

  private native void SetCreateFrequencyColumn_5(boolean id0);
  public void SetCreateFrequencyColumn(boolean id0)
  {
    SetCreateFrequencyColumn_5(id0);
  }

  private native void CreateFrequencyColumnOn_6();
  public void CreateFrequencyColumnOn()
  {
    CreateFrequencyColumnOn_6();
  }

  private native void CreateFrequencyColumnOff_7();
  public void CreateFrequencyColumnOff()
  {
    CreateFrequencyColumnOff_7();
  }

  private native double GetDefaultSampleRate_8();
  public double GetDefaultSampleRate()
  {
    return GetDefaultSampleRate_8();
  }

  private native void SetDefaultSampleRate_9(double id0);
  public void SetDefaultSampleRate(double id0)
  {
    SetDefaultSampleRate_9(id0);
  }

  private native int GetWindowingFunction_10();
  public int GetWindowingFunction()
  {
    return GetWindowingFunction_10();
  }

  private native void SetWindowingFunction_11(int id0);
  public void SetWindowingFunction(int id0)
  {
    SetWindowingFunction_11(id0);
  }

  private native boolean GetReturnOnesided_12();
  public boolean GetReturnOnesided()
  {
    return GetReturnOnesided_12();
  }

  private native void SetReturnOnesided_13(boolean id0);
  public void SetReturnOnesided(boolean id0)
  {
    SetReturnOnesided_13(id0);
  }

  private native void ReturnOnesidedOn_14();
  public void ReturnOnesidedOn()
  {
    ReturnOnesidedOn_14();
  }

  private native void ReturnOnesidedOff_15();
  public void ReturnOnesidedOff()
  {
    ReturnOnesidedOff_15();
  }

  private native boolean GetAverageFft_16();
  public boolean GetAverageFft()
  {
    return GetAverageFft_16();
  }

  private native void SetAverageFft_17(boolean id0);
  public void SetAverageFft(boolean id0)
  {
    SetAverageFft_17(id0);
  }

  private native void AverageFftOn_18();
  public void AverageFftOn()
  {
    AverageFftOn_18();
  }

  private native void AverageFftOff_19();
  public void AverageFftOff()
  {
    AverageFftOff_19();
  }

  private native boolean GetNormalize_20();
  public boolean GetNormalize()
  {
    return GetNormalize_20();
  }

  private native void SetNormalize_21(boolean id0);
  public void SetNormalize(boolean id0)
  {
    SetNormalize_21(id0);
  }

  private native void NormalizeOn_22();
  public void NormalizeOn()
  {
    NormalizeOn_22();
  }

  private native void NormalizeOff_23();
  public void NormalizeOff()
  {
    NormalizeOff_23();
  }

  private native int GetBlockSize_24();
  public int GetBlockSize()
  {
    return GetBlockSize_24();
  }

  private native void SetBlockSize_25(int id0);
  public void SetBlockSize(int id0)
  {
    SetBlockSize_25(id0);
  }

  private native int GetBlockOverlap_26();
  public int GetBlockOverlap()
  {
    return GetBlockOverlap_26();
  }

  private native void SetBlockOverlap_27(int id0);
  public void SetBlockOverlap(int id0)
  {
    SetBlockOverlap_27(id0);
  }

  private native int GetScalingMethod_28();
  public int GetScalingMethod()
  {
    return GetScalingMethod_28();
  }

  private native void SetScalingMethod_29(int id0);
  public void SetScalingMethod(int id0)
  {
    SetScalingMethod_29(id0);
  }

  private native int GetScalingMethodMinValue_30();
  public int GetScalingMethodMinValue()
  {
    return GetScalingMethodMinValue_30();
  }

  private native int GetScalingMethodMaxValue_31();
  public int GetScalingMethodMaxValue()
  {
    return GetScalingMethodMaxValue_31();
  }

  private native boolean GetDetrend_32();
  public boolean GetDetrend()
  {
    return GetDetrend_32();
  }

  private native void SetDetrend_33(boolean id0);
  public void SetDetrend(boolean id0)
  {
    SetDetrend_33(id0);
  }

  private native void DetrendOn_34();
  public void DetrendOn()
  {
    DetrendOn_34();
  }

  private native void DetrendOff_35();
  public void DetrendOff()
  {
    DetrendOff_35();
  }

  private native boolean GetOptimizeForRealInput_36();
  public boolean GetOptimizeForRealInput()
  {
    return GetOptimizeForRealInput_36();
  }

  private native void SetOptimizeForRealInput_37(boolean id0);
  public void SetOptimizeForRealInput(boolean id0)
  {
    SetOptimizeForRealInput_37(id0);
  }

  private native void OptimizeForRealInputOn_38();
  public void OptimizeForRealInputOn()
  {
    OptimizeForRealInputOn_38();
  }

  private native void OptimizeForRealInputOff_39();
  public void OptimizeForRealInputOff()
  {
    OptimizeForRealInputOff_39();
  }

  private native int GetNumberOfBlock_40();
  public int GetNumberOfBlock()
  {
    return GetNumberOfBlock_40();
  }

  private native void SetNumberOfBlock_41(int id0);
  public void SetNumberOfBlock(int id0)
  {
    SetNumberOfBlock_41(id0);
  }

  public vtkTableFFT() { super(); }

  public vtkTableFFT(long id) { super(id); }
  public native long   VTKInit();

}
