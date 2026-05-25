// java wrapper for vtkImageSincInterpolator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageSincInterpolator extends vtkAbstractImageInterpolator
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

  private native void SetWindowFunction_4(int id0);
  public void SetWindowFunction(int id0)
  {
    SetWindowFunction_4(id0);
  }

  private native void SetWindowFunctionToLanczos_5();
  public void SetWindowFunctionToLanczos()
  {
    SetWindowFunctionToLanczos_5();
  }

  private native void SetWindowFunctionToKaiser_6();
  public void SetWindowFunctionToKaiser()
  {
    SetWindowFunctionToKaiser_6();
  }

  private native void SetWindowFunctionToCosine_7();
  public void SetWindowFunctionToCosine()
  {
    SetWindowFunctionToCosine_7();
  }

  private native void SetWindowFunctionToHann_8();
  public void SetWindowFunctionToHann()
  {
    SetWindowFunctionToHann_8();
  }

  private native void SetWindowFunctionToHamming_9();
  public void SetWindowFunctionToHamming()
  {
    SetWindowFunctionToHamming_9();
  }

  private native void SetWindowFunctionToBlackman_10();
  public void SetWindowFunctionToBlackman()
  {
    SetWindowFunctionToBlackman_10();
  }

  private native void SetWindowFunctionToBlackmanHarris3_11();
  public void SetWindowFunctionToBlackmanHarris3()
  {
    SetWindowFunctionToBlackmanHarris3_11();
  }

  private native void SetWindowFunctionToBlackmanHarris4_12();
  public void SetWindowFunctionToBlackmanHarris4()
  {
    SetWindowFunctionToBlackmanHarris4_12();
  }

  private native void SetWindowFunctionToNuttall_13();
  public void SetWindowFunctionToNuttall()
  {
    SetWindowFunctionToNuttall_13();
  }

  private native void SetWindowFunctionToBlackmanNuttall3_14();
  public void SetWindowFunctionToBlackmanNuttall3()
  {
    SetWindowFunctionToBlackmanNuttall3_14();
  }

  private native void SetWindowFunctionToBlackmanNuttall4_15();
  public void SetWindowFunctionToBlackmanNuttall4()
  {
    SetWindowFunctionToBlackmanNuttall4_15();
  }

  private native int GetWindowFunction_16();
  public int GetWindowFunction()
  {
    return GetWindowFunction_16();
  }

  private native byte[] GetWindowFunctionAsString_17();
  public String GetWindowFunctionAsString()
  {
    return new String(GetWindowFunctionAsString_17(), StandardCharsets.UTF_8);
  }

  private native void SetWindowHalfWidth_18(int id0);
  public void SetWindowHalfWidth(int id0)
  {
    SetWindowHalfWidth_18(id0);
  }

  private native int GetWindowHalfWidth_19();
  public int GetWindowHalfWidth()
  {
    return GetWindowHalfWidth_19();
  }

  private native void SetUseWindowParameter_20(int id0);
  public void SetUseWindowParameter(int id0)
  {
    SetUseWindowParameter_20(id0);
  }

  private native void UseWindowParameterOn_21();
  public void UseWindowParameterOn()
  {
    UseWindowParameterOn_21();
  }

  private native void UseWindowParameterOff_22();
  public void UseWindowParameterOff()
  {
    UseWindowParameterOff_22();
  }

  private native int GetUseWindowParameter_23();
  public int GetUseWindowParameter()
  {
    return GetUseWindowParameter_23();
  }

  private native void SetWindowParameter_24(double id0);
  public void SetWindowParameter(double id0)
  {
    SetWindowParameter_24(id0);
  }

  private native double GetWindowParameter_25();
  public double GetWindowParameter()
  {
    return GetWindowParameter_25();
  }

  private native void ComputeSupportSize_26(double id0[],int id1[]);
  public void ComputeSupportSize(double id0[],int id1[])
  {
    ComputeSupportSize_26(id0,id1);
  }

  private native void SetBlurFactors_27(double id0,double id1,double id2);
  public void SetBlurFactors(double id0,double id1,double id2)
  {
    SetBlurFactors_27(id0,id1,id2);
  }

  private native void SetBlurFactors_28(double id0[]);
  public void SetBlurFactors(double id0[])
  {
    SetBlurFactors_28(id0);
  }

  private native void GetBlurFactors_29(double id0[]);
  public void GetBlurFactors(double id0[])
  {
    GetBlurFactors_29(id0);
  }

  private native double[] GetBlurFactors_30();
  public double[] GetBlurFactors()
  {
    return GetBlurFactors_30();
  }

  private native void SetAntialiasing_31(int id0);
  public void SetAntialiasing(int id0)
  {
    SetAntialiasing_31(id0);
  }

  private native void AntialiasingOn_32();
  public void AntialiasingOn()
  {
    AntialiasingOn_32();
  }

  private native void AntialiasingOff_33();
  public void AntialiasingOff()
  {
    AntialiasingOff_33();
  }

  private native int GetAntialiasing_34();
  public int GetAntialiasing()
  {
    return GetAntialiasing_34();
  }

  private native void SetRenormalization_35(int id0);
  public void SetRenormalization(int id0)
  {
    SetRenormalization_35(id0);
  }

  private native void RenormalizationOn_36();
  public void RenormalizationOn()
  {
    RenormalizationOn_36();
  }

  private native void RenormalizationOff_37();
  public void RenormalizationOff()
  {
    RenormalizationOff_37();
  }

  private native int GetRenormalization_38();
  public int GetRenormalization()
  {
    return GetRenormalization_38();
  }

  private native boolean IsSeparable_39();
  public boolean IsSeparable()
  {
    return IsSeparable_39();
  }

  public vtkImageSincInterpolator() { super(); }

  public vtkImageSincInterpolator(long id) { super(id); }
  public native long   VTKInit();

}
