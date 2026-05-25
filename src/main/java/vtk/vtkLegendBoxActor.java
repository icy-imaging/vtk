// java wrapper for vtkLegendBoxActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLegendBoxActor extends vtkActor2D
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

  private native void SetNumberOfEntries_4(int id0);
  public void SetNumberOfEntries(int id0)
  {
    SetNumberOfEntries_4(id0);
  }

  private native int GetNumberOfEntries_5();
  public int GetNumberOfEntries()
  {
    return GetNumberOfEntries_5();
  }

  private native void SetEntry_6(int id0,vtkPolyData id1,byte[] id2, int len2,double id3[]);
  public void SetEntry(int id0,vtkPolyData id1,String id2,double id3[])
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetEntry_6(id0,id1,bytes2, bytes2.length,id3);
  }

  private native void SetEntry_7(int id0,vtkImageData id1,byte[] id2, int len2,double id3[]);
  public void SetEntry(int id0,vtkImageData id1,String id2,double id3[])
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetEntry_7(id0,id1,bytes2, bytes2.length,id3);
  }

  private native void SetEntry_8(int id0,vtkPolyData id1,vtkImageData id2,byte[] id3, int len3,double id4[]);
  public void SetEntry(int id0,vtkPolyData id1,vtkImageData id2,String id3,double id4[])
  {
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    SetEntry_8(id0,id1,id2,bytes3, bytes3.length,id4);
  }

  private native void SetEntrySymbol_9(int id0,vtkPolyData id1);
  public void SetEntrySymbol(int id0,vtkPolyData id1)
  {
    SetEntrySymbol_9(id0,id1);
  }

  private native void SetEntryIcon_10(int id0,vtkImageData id1);
  public void SetEntryIcon(int id0,vtkImageData id1)
  {
    SetEntryIcon_10(id0,id1);
  }

  private native void SetEntryString_11(int id0,byte[] id1, int len1);
  public void SetEntryString(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetEntryString_11(id0,bytes1, bytes1.length);
  }

  private native void SetEntryColor_12(int id0,double id1[]);
  public void SetEntryColor(int id0,double id1[])
  {
    SetEntryColor_12(id0,id1);
  }

  private native void SetEntryColor_13(int id0,double id1,double id2,double id3);
  public void SetEntryColor(int id0,double id1,double id2,double id3)
  {
    SetEntryColor_13(id0,id1,id2,id3);
  }

  private native long GetEntrySymbol_14(int id0);
  public vtkPolyData GetEntrySymbol(int id0)
  {
    long temp = GetEntrySymbol_14(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEntryIcon_15(int id0);
  public vtkImageData GetEntryIcon(int id0)
  {
    long temp = GetEntryIcon_15(id0);

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetEntryString_16(int id0);
  public String GetEntryString(int id0)
  {
    return new String(GetEntryString_16(id0), StandardCharsets.UTF_8);
  }

  private native double[] GetEntryColor_17(int id0);
  public double[] GetEntryColor(int id0)
  {
    return GetEntryColor_17(id0);
  }

  private native void SetEntryTextProperty_18(vtkTextProperty id0);
  public void SetEntryTextProperty(vtkTextProperty id0)
  {
    SetEntryTextProperty_18(id0);
  }

  private native long GetEntryTextProperty_19();
  public vtkTextProperty GetEntryTextProperty()
  {
    long temp = GetEntryTextProperty_19();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBorder_20(int id0);
  public void SetBorder(int id0)
  {
    SetBorder_20(id0);
  }

  private native int GetBorder_21();
  public int GetBorder()
  {
    return GetBorder_21();
  }

  private native void BorderOn_22();
  public void BorderOn()
  {
    BorderOn_22();
  }

  private native void BorderOff_23();
  public void BorderOff()
  {
    BorderOff_23();
  }

  private native void SetLockBorder_24(int id0);
  public void SetLockBorder(int id0)
  {
    SetLockBorder_24(id0);
  }

  private native int GetLockBorder_25();
  public int GetLockBorder()
  {
    return GetLockBorder_25();
  }

  private native void LockBorderOn_26();
  public void LockBorderOn()
  {
    LockBorderOn_26();
  }

  private native void LockBorderOff_27();
  public void LockBorderOff()
  {
    LockBorderOff_27();
  }

  private native void SetBox_28(int id0);
  public void SetBox(int id0)
  {
    SetBox_28(id0);
  }

  private native int GetBox_29();
  public int GetBox()
  {
    return GetBox_29();
  }

  private native void BoxOn_30();
  public void BoxOn()
  {
    BoxOn_30();
  }

  private native void BoxOff_31();
  public void BoxOff()
  {
    BoxOff_31();
  }

  private native long GetBoxProperty_32();
  public vtkProperty2D GetBoxProperty()
  {
    long temp = GetBoxProperty_32();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPadding_33(int id0);
  public void SetPadding(int id0)
  {
    SetPadding_33(id0);
  }

  private native int GetPaddingMinValue_34();
  public int GetPaddingMinValue()
  {
    return GetPaddingMinValue_34();
  }

  private native int GetPaddingMaxValue_35();
  public int GetPaddingMaxValue()
  {
    return GetPaddingMaxValue_35();
  }

  private native int GetPadding_36();
  public int GetPadding()
  {
    return GetPadding_36();
  }

  private native void SetScalarVisibility_37(int id0);
  public void SetScalarVisibility(int id0)
  {
    SetScalarVisibility_37(id0);
  }

  private native int GetScalarVisibility_38();
  public int GetScalarVisibility()
  {
    return GetScalarVisibility_38();
  }

  private native void ScalarVisibilityOn_39();
  public void ScalarVisibilityOn()
  {
    ScalarVisibilityOn_39();
  }

  private native void ScalarVisibilityOff_40();
  public void ScalarVisibilityOff()
  {
    ScalarVisibilityOff_40();
  }

  private native void SetUseBackground_41(int id0);
  public void SetUseBackground(int id0)
  {
    SetUseBackground_41(id0);
  }

  private native int GetUseBackground_42();
  public int GetUseBackground()
  {
    return GetUseBackground_42();
  }

  private native void UseBackgroundOn_43();
  public void UseBackgroundOn()
  {
    UseBackgroundOn_43();
  }

  private native void UseBackgroundOff_44();
  public void UseBackgroundOff()
  {
    UseBackgroundOff_44();
  }

  private native void SetBackgroundColor_45(double id0,double id1,double id2);
  public void SetBackgroundColor(double id0,double id1,double id2)
  {
    SetBackgroundColor_45(id0,id1,id2);
  }

  private native void SetBackgroundColor_46(double id0[]);
  public void SetBackgroundColor(double id0[])
  {
    SetBackgroundColor_46(id0);
  }

  private native double[] GetBackgroundColor_47();
  public double[] GetBackgroundColor()
  {
    return GetBackgroundColor_47();
  }

  private native void SetBackgroundOpacity_48(double id0);
  public void SetBackgroundOpacity(double id0)
  {
    SetBackgroundOpacity_48(id0);
  }

  private native double GetBackgroundOpacityMinValue_49();
  public double GetBackgroundOpacityMinValue()
  {
    return GetBackgroundOpacityMinValue_49();
  }

  private native double GetBackgroundOpacityMaxValue_50();
  public double GetBackgroundOpacityMaxValue()
  {
    return GetBackgroundOpacityMaxValue_50();
  }

  private native double GetBackgroundOpacity_51();
  public double GetBackgroundOpacity()
  {
    return GetBackgroundOpacity_51();
  }

  private native void ShallowCopy_52(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_52(id0);
  }

  private native void ReleaseGraphicsResources_53(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_53(id0);
  }

  private native int RenderOpaqueGeometry_54(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_54(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_55(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_55(id0);
  }

  private native int RenderOverlay_56(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_56(id0);
  }

  private native int HasTranslucentPolygonalGeometry_57();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_57();
  }

  public vtkLegendBoxActor() { super(); }

  public vtkLegendBoxActor(long id) { super(id); }
  public native long   VTKInit();

}
