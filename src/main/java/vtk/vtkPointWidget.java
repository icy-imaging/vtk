// java wrapper for vtkPointWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointWidget extends vtk3DWidget
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

  private native void SetEnabled_4(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_4(id0);
  }

  private native void PlaceWidget_5(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_5(id0);
  }

  private native void PlaceWidget_6();
  public void PlaceWidget()
  {
    PlaceWidget_6();
  }

  private native void PlaceWidget_7(double id0,double id1,double id2,double id3,double id4,double id5);
  public void PlaceWidget(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    PlaceWidget_7(id0,id1,id2,id3,id4,id5);
  }

  private native void GetPolyData_8(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_8(id0);
  }

  private native void SetPosition_9(double id0,double id1,double id2);
  public void SetPosition(double id0,double id1,double id2)
  {
    SetPosition_9(id0,id1,id2);
  }

  private native void SetPosition_10(double id0[]);
  public void SetPosition(double id0[])
  {
    SetPosition_10(id0);
  }

  private native double[] GetPosition_11();
  public double[] GetPosition()
  {
    return GetPosition_11();
  }

  private native void GetPosition_12(double id0[]);
  public void GetPosition(double id0[])
  {
    GetPosition_12(id0);
  }

  private native void SetOutline_13(int id0);
  public void SetOutline(int id0)
  {
    SetOutline_13(id0);
  }

  private native int GetOutline_14();
  public int GetOutline()
  {
    return GetOutline_14();
  }

  private native void OutlineOn_15();
  public void OutlineOn()
  {
    OutlineOn_15();
  }

  private native void OutlineOff_16();
  public void OutlineOff()
  {
    OutlineOff_16();
  }

  private native void SetXShadows_17(int id0);
  public void SetXShadows(int id0)
  {
    SetXShadows_17(id0);
  }

  private native int GetXShadows_18();
  public int GetXShadows()
  {
    return GetXShadows_18();
  }

  private native void XShadowsOn_19();
  public void XShadowsOn()
  {
    XShadowsOn_19();
  }

  private native void XShadowsOff_20();
  public void XShadowsOff()
  {
    XShadowsOff_20();
  }

  private native void SetYShadows_21(int id0);
  public void SetYShadows(int id0)
  {
    SetYShadows_21(id0);
  }

  private native int GetYShadows_22();
  public int GetYShadows()
  {
    return GetYShadows_22();
  }

  private native void YShadowsOn_23();
  public void YShadowsOn()
  {
    YShadowsOn_23();
  }

  private native void YShadowsOff_24();
  public void YShadowsOff()
  {
    YShadowsOff_24();
  }

  private native void SetZShadows_25(int id0);
  public void SetZShadows(int id0)
  {
    SetZShadows_25(id0);
  }

  private native int GetZShadows_26();
  public int GetZShadows()
  {
    return GetZShadows_26();
  }

  private native void ZShadowsOn_27();
  public void ZShadowsOn()
  {
    ZShadowsOn_27();
  }

  private native void ZShadowsOff_28();
  public void ZShadowsOff()
  {
    ZShadowsOff_28();
  }

  private native void SetTranslationMode_29(int id0);
  public void SetTranslationMode(int id0)
  {
    SetTranslationMode_29(id0);
  }

  private native int GetTranslationMode_30();
  public int GetTranslationMode()
  {
    return GetTranslationMode_30();
  }

  private native void TranslationModeOn_31();
  public void TranslationModeOn()
  {
    TranslationModeOn_31();
  }

  private native void TranslationModeOff_32();
  public void TranslationModeOff()
  {
    TranslationModeOff_32();
  }

  private native void AllOn_33();
  public void AllOn()
  {
    AllOn_33();
  }

  private native void AllOff_34();
  public void AllOff()
  {
    AllOff_34();
  }

  private native long GetProperty_35();
  public vtkProperty GetProperty()
  {
    long temp = GetProperty_35();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedProperty_36();
  public vtkProperty GetSelectedProperty()
  {
    long temp = GetSelectedProperty_36();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetHotSpotSize_37(double id0);
  public void SetHotSpotSize(double id0)
  {
    SetHotSpotSize_37(id0);
  }

  private native double GetHotSpotSizeMinValue_38();
  public double GetHotSpotSizeMinValue()
  {
    return GetHotSpotSizeMinValue_38();
  }

  private native double GetHotSpotSizeMaxValue_39();
  public double GetHotSpotSizeMaxValue()
  {
    return GetHotSpotSizeMaxValue_39();
  }

  private native double GetHotSpotSize_40();
  public double GetHotSpotSize()
  {
    return GetHotSpotSize_40();
  }

  public vtkPointWidget() { super(); }

  public vtkPointWidget(long id) { super(id); }
  public native long   VTKInit();

}
