// java wrapper for vtkEllipticalButtonSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEllipticalButtonSource extends vtkButtonSource
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

  private native void SetWidth_4(double id0);
  public void SetWidth(double id0)
  {
    SetWidth_4(id0);
  }

  private native double GetWidthMinValue_5();
  public double GetWidthMinValue()
  {
    return GetWidthMinValue_5();
  }

  private native double GetWidthMaxValue_6();
  public double GetWidthMaxValue()
  {
    return GetWidthMaxValue_6();
  }

  private native double GetWidth_7();
  public double GetWidth()
  {
    return GetWidth_7();
  }

  private native void SetHeight_8(double id0);
  public void SetHeight(double id0)
  {
    SetHeight_8(id0);
  }

  private native double GetHeightMinValue_9();
  public double GetHeightMinValue()
  {
    return GetHeightMinValue_9();
  }

  private native double GetHeightMaxValue_10();
  public double GetHeightMaxValue()
  {
    return GetHeightMaxValue_10();
  }

  private native double GetHeight_11();
  public double GetHeight()
  {
    return GetHeight_11();
  }

  private native void SetDepth_12(double id0);
  public void SetDepth(double id0)
  {
    SetDepth_12(id0);
  }

  private native double GetDepthMinValue_13();
  public double GetDepthMinValue()
  {
    return GetDepthMinValue_13();
  }

  private native double GetDepthMaxValue_14();
  public double GetDepthMaxValue()
  {
    return GetDepthMaxValue_14();
  }

  private native double GetDepth_15();
  public double GetDepth()
  {
    return GetDepth_15();
  }

  private native void SetCircumferentialResolution_16(int id0);
  public void SetCircumferentialResolution(int id0)
  {
    SetCircumferentialResolution_16(id0);
  }

  private native int GetCircumferentialResolutionMinValue_17();
  public int GetCircumferentialResolutionMinValue()
  {
    return GetCircumferentialResolutionMinValue_17();
  }

  private native int GetCircumferentialResolutionMaxValue_18();
  public int GetCircumferentialResolutionMaxValue()
  {
    return GetCircumferentialResolutionMaxValue_18();
  }

  private native int GetCircumferentialResolution_19();
  public int GetCircumferentialResolution()
  {
    return GetCircumferentialResolution_19();
  }

  private native void SetTextureResolution_20(int id0);
  public void SetTextureResolution(int id0)
  {
    SetTextureResolution_20(id0);
  }

  private native int GetTextureResolutionMinValue_21();
  public int GetTextureResolutionMinValue()
  {
    return GetTextureResolutionMinValue_21();
  }

  private native int GetTextureResolutionMaxValue_22();
  public int GetTextureResolutionMaxValue()
  {
    return GetTextureResolutionMaxValue_22();
  }

  private native int GetTextureResolution_23();
  public int GetTextureResolution()
  {
    return GetTextureResolution_23();
  }

  private native void SetShoulderResolution_24(int id0);
  public void SetShoulderResolution(int id0)
  {
    SetShoulderResolution_24(id0);
  }

  private native int GetShoulderResolutionMinValue_25();
  public int GetShoulderResolutionMinValue()
  {
    return GetShoulderResolutionMinValue_25();
  }

  private native int GetShoulderResolutionMaxValue_26();
  public int GetShoulderResolutionMaxValue()
  {
    return GetShoulderResolutionMaxValue_26();
  }

  private native int GetShoulderResolution_27();
  public int GetShoulderResolution()
  {
    return GetShoulderResolution_27();
  }

  private native void SetRadialRatio_28(double id0);
  public void SetRadialRatio(double id0)
  {
    SetRadialRatio_28(id0);
  }

  private native double GetRadialRatioMinValue_29();
  public double GetRadialRatioMinValue()
  {
    return GetRadialRatioMinValue_29();
  }

  private native double GetRadialRatioMaxValue_30();
  public double GetRadialRatioMaxValue()
  {
    return GetRadialRatioMaxValue_30();
  }

  private native double GetRadialRatio_31();
  public double GetRadialRatio()
  {
    return GetRadialRatio_31();
  }

  private native void SetOutputPointsPrecision_32(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_32(id0);
  }

  private native int GetOutputPointsPrecision_33();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_33();
  }

  public vtkEllipticalButtonSource() { super(); }

  public vtkEllipticalButtonSource(long id) { super(id); }
  public native long   VTKInit();

}
