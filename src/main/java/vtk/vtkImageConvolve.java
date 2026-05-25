// java wrapper for vtkImageConvolve object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageConvolve extends vtkThreadedImageAlgorithm
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

  private native int[] GetKernelSize_4();
  public int[] GetKernelSize()
  {
    return GetKernelSize_4();
  }

  private native void SetKernel3x3_5(double id0[]);
  public void SetKernel3x3(double id0[])
  {
    SetKernel3x3_5(id0);
  }

  private native void SetKernel5x5_6(double id0[]);
  public void SetKernel5x5(double id0[])
  {
    SetKernel5x5_6(id0);
  }

  private native void SetKernel7x7_7(double id0[]);
  public void SetKernel7x7(double id0[])
  {
    SetKernel7x7_7(id0);
  }

  private native double[] GetKernel3x3_8();
  public double[] GetKernel3x3()
  {
    return GetKernel3x3_8();
  }

  private native void GetKernel3x3_9(double id0[]);
  public void GetKernel3x3(double id0[])
  {
    GetKernel3x3_9(id0);
  }

  private native double[] GetKernel5x5_10();
  public double[] GetKernel5x5()
  {
    return GetKernel5x5_10();
  }

  private native void GetKernel5x5_11(double id0[]);
  public void GetKernel5x5(double id0[])
  {
    GetKernel5x5_11(id0);
  }

  private native double[] GetKernel7x7_12();
  public double[] GetKernel7x7()
  {
    return GetKernel7x7_12();
  }

  private native void GetKernel7x7_13(double id0[]);
  public void GetKernel7x7(double id0[])
  {
    GetKernel7x7_13(id0);
  }

  private native void SetKernel3x3x3_14(double id0[]);
  public void SetKernel3x3x3(double id0[])
  {
    SetKernel3x3x3_14(id0);
  }

  private native void SetKernel5x5x5_15(double id0[]);
  public void SetKernel5x5x5(double id0[])
  {
    SetKernel5x5x5_15(id0);
  }

  private native void SetKernel7x7x7_16(double id0[]);
  public void SetKernel7x7x7(double id0[])
  {
    SetKernel7x7x7_16(id0);
  }

  private native double[] GetKernel3x3x3_17();
  public double[] GetKernel3x3x3()
  {
    return GetKernel3x3x3_17();
  }

  private native void GetKernel3x3x3_18(double id0[]);
  public void GetKernel3x3x3(double id0[])
  {
    GetKernel3x3x3_18(id0);
  }

  private native double[] GetKernel5x5x5_19();
  public double[] GetKernel5x5x5()
  {
    return GetKernel5x5x5_19();
  }

  private native void GetKernel5x5x5_20(double id0[]);
  public void GetKernel5x5x5(double id0[])
  {
    GetKernel5x5x5_20(id0);
  }

  private native void GetKernel7x7x7_21(double id0[]);
  public void GetKernel7x7x7(double id0[])
  {
    GetKernel7x7x7_21(id0);
  }

  public vtkImageConvolve() { super(); }

  public vtkImageConvolve(long id) { super(id); }
  public native long   VTKInit();

}
