// java wrapper for vtkTextActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTextActor extends vtkTexturedActor2D
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

  private native void ShallowCopy_4(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_4(id0);
  }

  private native void SetInput_5(byte[] id0, int len0);
  public void SetInput(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInput_5(bytes0, bytes0.length);
  }

  private native byte[] GetInput_6();
  public String GetInput()
  {
    return new String(GetInput_6(), StandardCharsets.UTF_8);
  }

  private native void SetMinimumSize_7(int id0,int id1);
  public void SetMinimumSize(int id0,int id1)
  {
    SetMinimumSize_7(id0,id1);
  }

  private native void SetMinimumSize_8(int id0[]);
  public void SetMinimumSize(int id0[])
  {
    SetMinimumSize_8(id0);
  }

  private native int[] GetMinimumSize_9();
  public int[] GetMinimumSize()
  {
    return GetMinimumSize_9();
  }

  private native void SetMaximumLineHeight_10(float id0);
  public void SetMaximumLineHeight(float id0)
  {
    SetMaximumLineHeight_10(id0);
  }

  private native float GetMaximumLineHeight_11();
  public float GetMaximumLineHeight()
  {
    return GetMaximumLineHeight_11();
  }

  private native void SetTextScaleMode_12(int id0);
  public void SetTextScaleMode(int id0)
  {
    SetTextScaleMode_12(id0);
  }

  private native int GetTextScaleModeMinValue_13();
  public int GetTextScaleModeMinValue()
  {
    return GetTextScaleModeMinValue_13();
  }

  private native int GetTextScaleModeMaxValue_14();
  public int GetTextScaleModeMaxValue()
  {
    return GetTextScaleModeMaxValue_14();
  }

  private native int GetTextScaleMode_15();
  public int GetTextScaleMode()
  {
    return GetTextScaleMode_15();
  }

  private native void SetTextScaleModeToNone_16();
  public void SetTextScaleModeToNone()
  {
    SetTextScaleModeToNone_16();
  }

  private native void SetTextScaleModeToProp_17();
  public void SetTextScaleModeToProp()
  {
    SetTextScaleModeToProp_17();
  }

  private native void SetTextScaleModeToViewport_18();
  public void SetTextScaleModeToViewport()
  {
    SetTextScaleModeToViewport_18();
  }

  private native void SetUseBorderAlign_19(int id0);
  public void SetUseBorderAlign(int id0)
  {
    SetUseBorderAlign_19(id0);
  }

  private native int GetUseBorderAlign_20();
  public int GetUseBorderAlign()
  {
    return GetUseBorderAlign_20();
  }

  private native void UseBorderAlignOn_21();
  public void UseBorderAlignOn()
  {
    UseBorderAlignOn_21();
  }

  private native void UseBorderAlignOff_22();
  public void UseBorderAlignOff()
  {
    UseBorderAlignOff_22();
  }

  private native void SetAlignmentPoint_23(int id0);
  public void SetAlignmentPoint(int id0)
  {
    SetAlignmentPoint_23(id0);
  }

  private native int GetAlignmentPoint_24();
  public int GetAlignmentPoint()
  {
    return GetAlignmentPoint_24();
  }

  private native void SetOrientation_25(float id0);
  public void SetOrientation(float id0)
  {
    SetOrientation_25(id0);
  }

  private native float GetOrientation_26();
  public float GetOrientation()
  {
    return GetOrientation_26();
  }

  private native void SetTextProperty_27(vtkTextProperty id0);
  public void SetTextProperty(vtkTextProperty id0)
  {
    SetTextProperty_27(id0);
  }

  private native long GetTextProperty_28();
  public vtkTextProperty GetTextProperty()
  {
    long temp = GetTextProperty_28();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetBoundingBox_29(vtkViewport id0,double id1[]);
  public void GetBoundingBox(vtkViewport id0,double id1[])
  {
    GetBoundingBox_29(id0,id1);
  }

  private native void GetSize_30(vtkViewport id0,double id1[]);
  public void GetSize(vtkViewport id0,double id1[])
  {
    GetSize_30(id0,id1);
  }

  private native int SetConstrainedFontSize_31(vtkViewport id0,int id1,int id2);
  public int SetConstrainedFontSize(vtkViewport id0,int id1,int id2)
  {
    return SetConstrainedFontSize_31(id0,id1,id2);
  }

  private native int SetConstrainedFontSize_32(vtkTextActor id0,vtkViewport id1,int id2,int id3);
  public int SetConstrainedFontSize(vtkTextActor id0,vtkViewport id1,int id2,int id3)
  {
    return SetConstrainedFontSize_32(id0,id1,id2,id3);
  }

  private native void SetNonLinearFontScale_33(double id0,int id1);
  public void SetNonLinearFontScale(double id0,int id1)
  {
    SetNonLinearFontScale_33(id0,id1);
  }

  private native void ComputeScaledFont_34(vtkViewport id0);
  public void ComputeScaledFont(vtkViewport id0)
  {
    ComputeScaledFont_34(id0);
  }

  private native long GetScaledTextProperty_35();
  public vtkTextProperty GetScaledTextProperty()
  {
    long temp = GetScaledTextProperty_35();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native float GetFontScale_36(vtkViewport id0);
  public float GetFontScale(vtkViewport id0)
  {
    return GetFontScale_36(id0);
  }

  private native void ReleaseGraphicsResources_37(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_37(id0);
  }

  private native int RenderOpaqueGeometry_38(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_38(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_39(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_39(id0);
  }

  private native int RenderOverlay_40(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_40(id0);
  }

  private native int HasTranslucentPolygonalGeometry_41();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_41();
  }

  public vtkTextActor() { super(); }

  public vtkTextActor(long id) { super(id); }
  public native long   VTKInit();

}
