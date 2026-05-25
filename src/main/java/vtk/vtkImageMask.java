// java wrapper for vtkImageMask object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageMask extends vtkThreadedImageAlgorithm
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

  private native void SetMaskedOutputValue_4(double id0);
  public void SetMaskedOutputValue(double id0)
  {
    SetMaskedOutputValue_4(id0);
  }

  private native void SetMaskedOutputValue_5(double id0,double id1);
  public void SetMaskedOutputValue(double id0,double id1)
  {
    SetMaskedOutputValue_5(id0,id1);
  }

  private native void SetMaskedOutputValue_6(double id0,double id1,double id2);
  public void SetMaskedOutputValue(double id0,double id1,double id2)
  {
    SetMaskedOutputValue_6(id0,id1,id2);
  }

  private native int GetMaskedOutputValueLength_7();
  public int GetMaskedOutputValueLength()
  {
    return GetMaskedOutputValueLength_7();
  }

  private native void SetMaskAlpha_8(double id0);
  public void SetMaskAlpha(double id0)
  {
    SetMaskAlpha_8(id0);
  }

  private native double GetMaskAlphaMinValue_9();
  public double GetMaskAlphaMinValue()
  {
    return GetMaskAlphaMinValue_9();
  }

  private native double GetMaskAlphaMaxValue_10();
  public double GetMaskAlphaMaxValue()
  {
    return GetMaskAlphaMaxValue_10();
  }

  private native double GetMaskAlpha_11();
  public double GetMaskAlpha()
  {
    return GetMaskAlpha_11();
  }

  private native void SetImageInputData_12(vtkImageData id0);
  public void SetImageInputData(vtkImageData id0)
  {
    SetImageInputData_12(id0);
  }

  private native void SetMaskInputData_13(vtkImageData id0);
  public void SetMaskInputData(vtkImageData id0)
  {
    SetMaskInputData_13(id0);
  }

  private native void SetNotMask_14(int id0);
  public void SetNotMask(int id0)
  {
    SetNotMask_14(id0);
  }

  private native int GetNotMask_15();
  public int GetNotMask()
  {
    return GetNotMask_15();
  }

  private native void NotMaskOn_16();
  public void NotMaskOn()
  {
    NotMaskOn_16();
  }

  private native void NotMaskOff_17();
  public void NotMaskOff()
  {
    NotMaskOff_17();
  }

  private native void SetInput1Data_18(vtkDataObject id0);
  public void SetInput1Data(vtkDataObject id0)
  {
    SetInput1Data_18(id0);
  }

  private native void SetInput2Data_19(vtkDataObject id0);
  public void SetInput2Data(vtkDataObject id0)
  {
    SetInput2Data_19(id0);
  }

  public vtkImageMask() { super(); }

  public vtkImageMask(long id) { super(id); }
  public native long   VTKInit();

}
