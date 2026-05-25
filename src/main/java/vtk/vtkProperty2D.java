// java wrapper for vtkProperty2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProperty2D extends vtkObject
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

  private native void DeepCopy_4(vtkProperty2D id0);
  public void DeepCopy(vtkProperty2D id0)
  {
    DeepCopy_4(id0);
  }

  private native void SetColor_5(double id0,double id1,double id2);
  public void SetColor(double id0,double id1,double id2)
  {
    SetColor_5(id0,id1,id2);
  }

  private native void SetColor_6(double id0[]);
  public void SetColor(double id0[])
  {
    SetColor_6(id0);
  }

  private native double[] GetColor_7();
  public double[] GetColor()
  {
    return GetColor_7();
  }

  private native double GetOpacity_8();
  public double GetOpacity()
  {
    return GetOpacity_8();
  }

  private native void SetOpacity_9(double id0);
  public void SetOpacity(double id0)
  {
    SetOpacity_9(id0);
  }

  private native void SetPointSize_10(float id0);
  public void SetPointSize(float id0)
  {
    SetPointSize_10(id0);
  }

  private native float GetPointSizeMinValue_11();
  public float GetPointSizeMinValue()
  {
    return GetPointSizeMinValue_11();
  }

  private native float GetPointSizeMaxValue_12();
  public float GetPointSizeMaxValue()
  {
    return GetPointSizeMaxValue_12();
  }

  private native float GetPointSize_13();
  public float GetPointSize()
  {
    return GetPointSize_13();
  }

  private native void SetLineWidth_14(float id0);
  public void SetLineWidth(float id0)
  {
    SetLineWidth_14(id0);
  }

  private native float GetLineWidthMinValue_15();
  public float GetLineWidthMinValue()
  {
    return GetLineWidthMinValue_15();
  }

  private native float GetLineWidthMaxValue_16();
  public float GetLineWidthMaxValue()
  {
    return GetLineWidthMaxValue_16();
  }

  private native float GetLineWidth_17();
  public float GetLineWidth()
  {
    return GetLineWidth_17();
  }

  private native void SetLineStipplePattern_18(int id0);
  public void SetLineStipplePattern(int id0)
  {
    SetLineStipplePattern_18(id0);
  }

  private native int GetLineStipplePattern_19();
  public int GetLineStipplePattern()
  {
    return GetLineStipplePattern_19();
  }

  private native void SetLineStippleRepeatFactor_20(int id0);
  public void SetLineStippleRepeatFactor(int id0)
  {
    SetLineStippleRepeatFactor_20(id0);
  }

  private native int GetLineStippleRepeatFactorMinValue_21();
  public int GetLineStippleRepeatFactorMinValue()
  {
    return GetLineStippleRepeatFactorMinValue_21();
  }

  private native int GetLineStippleRepeatFactorMaxValue_22();
  public int GetLineStippleRepeatFactorMaxValue()
  {
    return GetLineStippleRepeatFactorMaxValue_22();
  }

  private native int GetLineStippleRepeatFactor_23();
  public int GetLineStippleRepeatFactor()
  {
    return GetLineStippleRepeatFactor_23();
  }

  private native void SetDisplayLocation_24(int id0);
  public void SetDisplayLocation(int id0)
  {
    SetDisplayLocation_24(id0);
  }

  private native int GetDisplayLocationMinValue_25();
  public int GetDisplayLocationMinValue()
  {
    return GetDisplayLocationMinValue_25();
  }

  private native int GetDisplayLocationMaxValue_26();
  public int GetDisplayLocationMaxValue()
  {
    return GetDisplayLocationMaxValue_26();
  }

  private native int GetDisplayLocation_27();
  public int GetDisplayLocation()
  {
    return GetDisplayLocation_27();
  }

  private native void SetDisplayLocationToBackground_28();
  public void SetDisplayLocationToBackground()
  {
    SetDisplayLocationToBackground_28();
  }

  private native void SetDisplayLocationToForeground_29();
  public void SetDisplayLocationToForeground()
  {
    SetDisplayLocationToForeground_29();
  }

  private native void Render_30(vtkViewport id0);
  public void Render(vtkViewport id0)
  {
    Render_30(id0);
  }

  public vtkProperty2D() { super(); }

  public vtkProperty2D(long id) { super(id); }
  public native long   VTKInit();

}
