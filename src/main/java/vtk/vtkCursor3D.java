// java wrapper for vtkCursor3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCursor3D extends vtkPolyDataAlgorithm
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

  private native void SetXShadows_18(int id0);
  public void SetXShadows(int id0)
  {
    SetXShadows_18(id0);
  }

  private native int GetXShadows_19();
  public int GetXShadows()
  {
    return GetXShadows_19();
  }

  private native void XShadowsOn_20();
  public void XShadowsOn()
  {
    XShadowsOn_20();
  }

  private native void XShadowsOff_21();
  public void XShadowsOff()
  {
    XShadowsOff_21();
  }

  private native void SetYShadows_22(int id0);
  public void SetYShadows(int id0)
  {
    SetYShadows_22(id0);
  }

  private native int GetYShadows_23();
  public int GetYShadows()
  {
    return GetYShadows_23();
  }

  private native void YShadowsOn_24();
  public void YShadowsOn()
  {
    YShadowsOn_24();
  }

  private native void YShadowsOff_25();
  public void YShadowsOff()
  {
    YShadowsOff_25();
  }

  private native void SetZShadows_26(int id0);
  public void SetZShadows(int id0)
  {
    SetZShadows_26(id0);
  }

  private native int GetZShadows_27();
  public int GetZShadows()
  {
    return GetZShadows_27();
  }

  private native void ZShadowsOn_28();
  public void ZShadowsOn()
  {
    ZShadowsOn_28();
  }

  private native void ZShadowsOff_29();
  public void ZShadowsOff()
  {
    ZShadowsOff_29();
  }

  private native void SetTranslationMode_30(int id0);
  public void SetTranslationMode(int id0)
  {
    SetTranslationMode_30(id0);
  }

  private native int GetTranslationMode_31();
  public int GetTranslationMode()
  {
    return GetTranslationMode_31();
  }

  private native void TranslationModeOn_32();
  public void TranslationModeOn()
  {
    TranslationModeOn_32();
  }

  private native void TranslationModeOff_33();
  public void TranslationModeOff()
  {
    TranslationModeOff_33();
  }

  private native void SetWrap_34(int id0);
  public void SetWrap(int id0)
  {
    SetWrap_34(id0);
  }

  private native int GetWrap_35();
  public int GetWrap()
  {
    return GetWrap_35();
  }

  private native void WrapOn_36();
  public void WrapOn()
  {
    WrapOn_36();
  }

  private native void WrapOff_37();
  public void WrapOff()
  {
    WrapOff_37();
  }

  private native long GetFocus_38();
  public vtkPolyData GetFocus()
  {
    long temp = GetFocus_38();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AllOn_39();
  public void AllOn()
  {
    AllOn_39();
  }

  private native void AllOff_40();
  public void AllOff()
  {
    AllOff_40();
  }

  public vtkCursor3D() { super(); }

  public vtkCursor3D(long id) { super(id); }
  public native long   VTKInit();

}
