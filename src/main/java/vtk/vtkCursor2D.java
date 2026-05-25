// java wrapper for vtkCursor2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCursor2D extends vtkPolyDataAlgorithm
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

  private native void SetModelBounds_4(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetModelBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetModelBounds_4(id0,id1,id2,id3,id4,id5);
  }

  private native void SetModelBounds_5(double id0[]);
  public void SetModelBounds(double id0[])
  {
    SetModelBounds_5(id0);
  }

  private native double[] GetModelBounds_6();
  public double[] GetModelBounds()
  {
    return GetModelBounds_6();
  }

  private native void SetFocalPoint_7(double id0[]);
  public void SetFocalPoint(double id0[])
  {
    SetFocalPoint_7(id0);
  }

  private native void SetFocalPoint_8(double id0,double id1,double id2);
  public void SetFocalPoint(double id0,double id1,double id2)
  {
    SetFocalPoint_8(id0,id1,id2);
  }

  private native double[] GetFocalPoint_9();
  public double[] GetFocalPoint()
  {
    return GetFocalPoint_9();
  }

  private native void SetOutline_10(int id0);
  public void SetOutline(int id0)
  {
    SetOutline_10(id0);
  }

  private native int GetOutline_11();
  public int GetOutline()
  {
    return GetOutline_11();
  }

  private native void OutlineOn_12();
  public void OutlineOn()
  {
    OutlineOn_12();
  }

  private native void OutlineOff_13();
  public void OutlineOff()
  {
    OutlineOff_13();
  }

  private native void SetAxes_14(int id0);
  public void SetAxes(int id0)
  {
    SetAxes_14(id0);
  }

  private native int GetAxes_15();
  public int GetAxes()
  {
    return GetAxes_15();
  }

  private native void AxesOn_16();
  public void AxesOn()
  {
    AxesOn_16();
  }

  private native void AxesOff_17();
  public void AxesOff()
  {
    AxesOff_17();
  }

  private native void SetRadius_18(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_18(id0);
  }

  private native double GetRadiusMinValue_19();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_19();
  }

  private native double GetRadiusMaxValue_20();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_20();
  }

  private native double GetRadius_21();
  public double GetRadius()
  {
    return GetRadius_21();
  }

  private native void SetPoint_22(int id0);
  public void SetPoint(int id0)
  {
    SetPoint_22(id0);
  }

  private native int GetPoint_23();
  public int GetPoint()
  {
    return GetPoint_23();
  }

  private native void PointOn_24();
  public void PointOn()
  {
    PointOn_24();
  }

  private native void PointOff_25();
  public void PointOff()
  {
    PointOff_25();
  }

  private native void SetTranslationMode_26(int id0);
  public void SetTranslationMode(int id0)
  {
    SetTranslationMode_26(id0);
  }

  private native int GetTranslationMode_27();
  public int GetTranslationMode()
  {
    return GetTranslationMode_27();
  }

  private native void TranslationModeOn_28();
  public void TranslationModeOn()
  {
    TranslationModeOn_28();
  }

  private native void TranslationModeOff_29();
  public void TranslationModeOff()
  {
    TranslationModeOff_29();
  }

  private native void SetWrap_30(int id0);
  public void SetWrap(int id0)
  {
    SetWrap_30(id0);
  }

  private native int GetWrap_31();
  public int GetWrap()
  {
    return GetWrap_31();
  }

  private native void WrapOn_32();
  public void WrapOn()
  {
    WrapOn_32();
  }

  private native void WrapOff_33();
  public void WrapOff()
  {
    WrapOff_33();
  }

  private native void AllOn_34();
  public void AllOn()
  {
    AllOn_34();
  }

  private native void AllOff_35();
  public void AllOff()
  {
    AllOff_35();
  }

  public vtkCursor2D() { super(); }

  public vtkCursor2D(long id) { super(id); }
  public native long   VTKInit();

}
