// java wrapper for vtkImageHistogram object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageHistogram extends vtkThreadedImageAlgorithm
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

  private native void SetActiveComponent_4(int id0);
  public void SetActiveComponent(int id0)
  {
    SetActiveComponent_4(id0);
  }

  private native int GetActiveComponent_5();
  public int GetActiveComponent()
  {
    return GetActiveComponent_5();
  }

  private native void SetAutomaticBinning_6(int id0);
  public void SetAutomaticBinning(int id0)
  {
    SetAutomaticBinning_6(id0);
  }

  private native void AutomaticBinningOn_7();
  public void AutomaticBinningOn()
  {
    AutomaticBinningOn_7();
  }

  private native void AutomaticBinningOff_8();
  public void AutomaticBinningOff()
  {
    AutomaticBinningOff_8();
  }

  private native int GetAutomaticBinning_9();
  public int GetAutomaticBinning()
  {
    return GetAutomaticBinning_9();
  }

  private native void SetMaximumNumberOfBins_10(int id0);
  public void SetMaximumNumberOfBins(int id0)
  {
    SetMaximumNumberOfBins_10(id0);
  }

  private native int GetMaximumNumberOfBins_11();
  public int GetMaximumNumberOfBins()
  {
    return GetMaximumNumberOfBins_11();
  }

  private native void SetNumberOfBins_12(int id0);
  public void SetNumberOfBins(int id0)
  {
    SetNumberOfBins_12(id0);
  }

  private native int GetNumberOfBins_13();
  public int GetNumberOfBins()
  {
    return GetNumberOfBins_13();
  }

  private native void SetBinOrigin_14(double id0);
  public void SetBinOrigin(double id0)
  {
    SetBinOrigin_14(id0);
  }

  private native double GetBinOrigin_15();
  public double GetBinOrigin()
  {
    return GetBinOrigin_15();
  }

  private native void SetBinSpacing_16(double id0);
  public void SetBinSpacing(double id0)
  {
    SetBinSpacing_16(id0);
  }

  private native double GetBinSpacing_17();
  public double GetBinSpacing()
  {
    return GetBinSpacing_17();
  }

  private native void SetStencilData_18(vtkImageStencilData id0);
  public void SetStencilData(vtkImageStencilData id0)
  {
    SetStencilData_18(id0);
  }

  private native long GetStencil_19();
  public vtkImageStencilData GetStencil()
  {
    long temp = GetStencil_19();

    if (temp == 0) return null;
    return (vtkImageStencilData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetStencilConnection_20(vtkAlgorithmOutput id0);
  public void SetStencilConnection(vtkAlgorithmOutput id0)
  {
    SetStencilConnection_20(id0);
  }

  private native void SetGenerateHistogramImage_21(int id0);
  public void SetGenerateHistogramImage(int id0)
  {
    SetGenerateHistogramImage_21(id0);
  }

  private native void GenerateHistogramImageOn_22();
  public void GenerateHistogramImageOn()
  {
    GenerateHistogramImageOn_22();
  }

  private native void GenerateHistogramImageOff_23();
  public void GenerateHistogramImageOff()
  {
    GenerateHistogramImageOff_23();
  }

  private native int GetGenerateHistogramImage_24();
  public int GetGenerateHistogramImage()
  {
    return GetGenerateHistogramImage_24();
  }

  private native void SetHistogramImageSize_25(int id0,int id1);
  public void SetHistogramImageSize(int id0,int id1)
  {
    SetHistogramImageSize_25(id0,id1);
  }

  private native void SetHistogramImageSize_26(int id0[]);
  public void SetHistogramImageSize(int id0[])
  {
    SetHistogramImageSize_26(id0);
  }

  private native int[] GetHistogramImageSize_27();
  public int[] GetHistogramImageSize()
  {
    return GetHistogramImageSize_27();
  }

  private native void SetHistogramImageScale_28(int id0);
  public void SetHistogramImageScale(int id0)
  {
    SetHistogramImageScale_28(id0);
  }

  private native int GetHistogramImageScaleMinValue_29();
  public int GetHistogramImageScaleMinValue()
  {
    return GetHistogramImageScaleMinValue_29();
  }

  private native int GetHistogramImageScaleMaxValue_30();
  public int GetHistogramImageScaleMaxValue()
  {
    return GetHistogramImageScaleMaxValue_30();
  }

  private native void SetHistogramImageScaleToLinear_31();
  public void SetHistogramImageScaleToLinear()
  {
    SetHistogramImageScaleToLinear_31();
  }

  private native void SetHistogramImageScaleToLog_32();
  public void SetHistogramImageScaleToLog()
  {
    SetHistogramImageScaleToLog_32();
  }

  private native void SetHistogramImageScaleToSqrt_33();
  public void SetHistogramImageScaleToSqrt()
  {
    SetHistogramImageScaleToSqrt_33();
  }

  private native int GetHistogramImageScale_34();
  public int GetHistogramImageScale()
  {
    return GetHistogramImageScale_34();
  }

  private native byte[] GetHistogramImageScaleAsString_35();
  public String GetHistogramImageScaleAsString()
  {
    return new String(GetHistogramImageScaleAsString_35(), StandardCharsets.UTF_8);
  }

  private native long GetHistogram_36();
  public vtkIdTypeArray GetHistogram()
  {
    long temp = GetHistogram_36();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTotal_37();
  public long GetTotal()
  {
    return GetTotal_37();
  }

  public vtkImageHistogram() { super(); }

  public vtkImageHistogram(long id) { super(id); }
  public native long   VTKInit();

}
