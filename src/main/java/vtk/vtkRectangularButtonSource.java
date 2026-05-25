// java wrapper for vtkRectangularButtonSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRectangularButtonSource extends vtkButtonSource
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

  private native void SetBoxRatio_16(double id0);
  public void SetBoxRatio(double id0)
  {
    SetBoxRatio_16(id0);
  }

  private native double GetBoxRatioMinValue_17();
  public double GetBoxRatioMinValue()
  {
    return GetBoxRatioMinValue_17();
  }

  private native double GetBoxRatioMaxValue_18();
  public double GetBoxRatioMaxValue()
  {
    return GetBoxRatioMaxValue_18();
  }

  private native double GetBoxRatio_19();
  public double GetBoxRatio()
  {
    return GetBoxRatio_19();
  }

  private native void SetTextureRatio_20(double id0);
  public void SetTextureRatio(double id0)
  {
    SetTextureRatio_20(id0);
  }

  private native double GetTextureRatioMinValue_21();
  public double GetTextureRatioMinValue()
  {
    return GetTextureRatioMinValue_21();
  }

  private native double GetTextureRatioMaxValue_22();
  public double GetTextureRatioMaxValue()
  {
    return GetTextureRatioMaxValue_22();
  }

  private native double GetTextureRatio_23();
  public double GetTextureRatio()
  {
    return GetTextureRatio_23();
  }

  private native void SetTextureHeightRatio_24(double id0);
  public void SetTextureHeightRatio(double id0)
  {
    SetTextureHeightRatio_24(id0);
  }

  private native double GetTextureHeightRatioMinValue_25();
  public double GetTextureHeightRatioMinValue()
  {
    return GetTextureHeightRatioMinValue_25();
  }

  private native double GetTextureHeightRatioMaxValue_26();
  public double GetTextureHeightRatioMaxValue()
  {
    return GetTextureHeightRatioMaxValue_26();
  }

  private native double GetTextureHeightRatio_27();
  public double GetTextureHeightRatio()
  {
    return GetTextureHeightRatio_27();
  }

  private native void SetOutputPointsPrecision_28(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_28(id0);
  }

  private native int GetOutputPointsPrecision_29();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_29();
  }

  public vtkRectangularButtonSource() { super(); }

  public vtkRectangularButtonSource(long id) { super(id); }
  public native long   VTKInit();

}
