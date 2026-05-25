// java wrapper for vtkImageToPolyDataFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageToPolyDataFilter extends vtkPolyDataAlgorithm
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

  private native void SetOutputStyle_4(int id0);
  public void SetOutputStyle(int id0)
  {
    SetOutputStyle_4(id0);
  }

  private native int GetOutputStyleMinValue_5();
  public int GetOutputStyleMinValue()
  {
    return GetOutputStyleMinValue_5();
  }

  private native int GetOutputStyleMaxValue_6();
  public int GetOutputStyleMaxValue()
  {
    return GetOutputStyleMaxValue_6();
  }

  private native int GetOutputStyle_7();
  public int GetOutputStyle()
  {
    return GetOutputStyle_7();
  }

  private native void SetOutputStyleToPixelize_8();
  public void SetOutputStyleToPixelize()
  {
    SetOutputStyleToPixelize_8();
  }

  private native void SetOutputStyleToPolygonalize_9();
  public void SetOutputStyleToPolygonalize()
  {
    SetOutputStyleToPolygonalize_9();
  }

  private native void SetOutputStyleToRunLength_10();
  public void SetOutputStyleToRunLength()
  {
    SetOutputStyleToRunLength_10();
  }

  private native void SetColorMode_11(int id0);
  public void SetColorMode(int id0)
  {
    SetColorMode_11(id0);
  }

  private native int GetColorModeMinValue_12();
  public int GetColorModeMinValue()
  {
    return GetColorModeMinValue_12();
  }

  private native int GetColorModeMaxValue_13();
  public int GetColorModeMaxValue()
  {
    return GetColorModeMaxValue_13();
  }

  private native int GetColorMode_14();
  public int GetColorMode()
  {
    return GetColorMode_14();
  }

  private native void SetColorModeToLUT_15();
  public void SetColorModeToLUT()
  {
    SetColorModeToLUT_15();
  }

  private native void SetColorModeToLinear256_16();
  public void SetColorModeToLinear256()
  {
    SetColorModeToLinear256_16();
  }

  private native void SetLookupTable_17(vtkScalarsToColors id0);
  public void SetLookupTable(vtkScalarsToColors id0)
  {
    SetLookupTable_17(id0);
  }

  private native long GetLookupTable_18();
  public vtkScalarsToColors GetLookupTable()
  {
    long temp = GetLookupTable_18();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSmoothing_19(int id0);
  public void SetSmoothing(int id0)
  {
    SetSmoothing_19(id0);
  }

  private native int GetSmoothing_20();
  public int GetSmoothing()
  {
    return GetSmoothing_20();
  }

  private native void SmoothingOn_21();
  public void SmoothingOn()
  {
    SmoothingOn_21();
  }

  private native void SmoothingOff_22();
  public void SmoothingOff()
  {
    SmoothingOff_22();
  }

  private native void SetNumberOfSmoothingIterations_23(int id0);
  public void SetNumberOfSmoothingIterations(int id0)
  {
    SetNumberOfSmoothingIterations_23(id0);
  }

  private native int GetNumberOfSmoothingIterationsMinValue_24();
  public int GetNumberOfSmoothingIterationsMinValue()
  {
    return GetNumberOfSmoothingIterationsMinValue_24();
  }

  private native int GetNumberOfSmoothingIterationsMaxValue_25();
  public int GetNumberOfSmoothingIterationsMaxValue()
  {
    return GetNumberOfSmoothingIterationsMaxValue_25();
  }

  private native int GetNumberOfSmoothingIterations_26();
  public int GetNumberOfSmoothingIterations()
  {
    return GetNumberOfSmoothingIterations_26();
  }

  private native void SetDecimation_27(int id0);
  public void SetDecimation(int id0)
  {
    SetDecimation_27(id0);
  }

  private native int GetDecimation_28();
  public int GetDecimation()
  {
    return GetDecimation_28();
  }

  private native void DecimationOn_29();
  public void DecimationOn()
  {
    DecimationOn_29();
  }

  private native void DecimationOff_30();
  public void DecimationOff()
  {
    DecimationOff_30();
  }

  private native void SetDecimationError_31(double id0);
  public void SetDecimationError(double id0)
  {
    SetDecimationError_31(id0);
  }

  private native double GetDecimationErrorMinValue_32();
  public double GetDecimationErrorMinValue()
  {
    return GetDecimationErrorMinValue_32();
  }

  private native double GetDecimationErrorMaxValue_33();
  public double GetDecimationErrorMaxValue()
  {
    return GetDecimationErrorMaxValue_33();
  }

  private native double GetDecimationError_34();
  public double GetDecimationError()
  {
    return GetDecimationError_34();
  }

  private native void SetError_35(int id0);
  public void SetError(int id0)
  {
    SetError_35(id0);
  }

  private native int GetErrorMinValue_36();
  public int GetErrorMinValue()
  {
    return GetErrorMinValue_36();
  }

  private native int GetErrorMaxValue_37();
  public int GetErrorMaxValue()
  {
    return GetErrorMaxValue_37();
  }

  private native int GetError_38();
  public int GetError()
  {
    return GetError_38();
  }

  private native void SetSubImageSize_39(int id0);
  public void SetSubImageSize(int id0)
  {
    SetSubImageSize_39(id0);
  }

  private native int GetSubImageSizeMinValue_40();
  public int GetSubImageSizeMinValue()
  {
    return GetSubImageSizeMinValue_40();
  }

  private native int GetSubImageSizeMaxValue_41();
  public int GetSubImageSizeMaxValue()
  {
    return GetSubImageSizeMaxValue_41();
  }

  private native int GetSubImageSize_42();
  public int GetSubImageSize()
  {
    return GetSubImageSize_42();
  }

  public vtkImageToPolyDataFilter() { super(); }

  public vtkImageToPolyDataFilter(long id) { super(id); }
  public native long   VTKInit();

}
