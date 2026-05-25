// java wrapper for vtkCornerAnnotation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCornerAnnotation extends vtkActor2D
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

  private native int RenderOpaqueGeometry_4(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_4(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_5(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_5(id0);
  }

  private native int RenderOverlay_6(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_6(id0);
  }

  private native int HasTranslucentPolygonalGeometry_7();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_7();
  }

  private native void SetMaximumLineHeight_8(double id0);
  public void SetMaximumLineHeight(double id0)
  {
    SetMaximumLineHeight_8(id0);
  }

  private native double GetMaximumLineHeight_9();
  public double GetMaximumLineHeight()
  {
    return GetMaximumLineHeight_9();
  }

  private native void SetMinimumFontSize_10(int id0);
  public void SetMinimumFontSize(int id0)
  {
    SetMinimumFontSize_10(id0);
  }

  private native int GetMinimumFontSize_11();
  public int GetMinimumFontSize()
  {
    return GetMinimumFontSize_11();
  }

  private native void SetMaximumFontSize_12(int id0);
  public void SetMaximumFontSize(int id0)
  {
    SetMaximumFontSize_12(id0);
  }

  private native int GetMaximumFontSize_13();
  public int GetMaximumFontSize()
  {
    return GetMaximumFontSize_13();
  }

  private native void SetLinearFontScaleFactor_14(double id0);
  public void SetLinearFontScaleFactor(double id0)
  {
    SetLinearFontScaleFactor_14(id0);
  }

  private native double GetLinearFontScaleFactor_15();
  public double GetLinearFontScaleFactor()
  {
    return GetLinearFontScaleFactor_15();
  }

  private native void SetNonlinearFontScaleFactor_16(double id0);
  public void SetNonlinearFontScaleFactor(double id0)
  {
    SetNonlinearFontScaleFactor_16(id0);
  }

  private native double GetNonlinearFontScaleFactor_17();
  public double GetNonlinearFontScaleFactor()
  {
    return GetNonlinearFontScaleFactor_17();
  }

  private native void ReleaseGraphicsResources_18(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_18(id0);
  }

  private native void SetText_19(int id0,byte[] id1, int len1);
  public void SetText(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetText_19(id0,bytes1, bytes1.length);
  }

  private native byte[] GetText_20(int id0);
  public String GetText(int id0)
  {
    return new String(GetText_20(id0), StandardCharsets.UTF_8);
  }

  private native void ClearAllTexts_21();
  public void ClearAllTexts()
  {
    ClearAllTexts_21();
  }

  private native void CopyAllTextsFrom_22(vtkCornerAnnotation id0);
  public void CopyAllTextsFrom(vtkCornerAnnotation id0)
  {
    CopyAllTextsFrom_22(id0);
  }

  private native void SetImageActor_23(vtkImageActor id0);
  public void SetImageActor(vtkImageActor id0)
  {
    SetImageActor_23(id0);
  }

  private native long GetImageActor_24();
  public vtkImageActor GetImageActor()
  {
    long temp = GetImageActor_24();

    if (temp == 0) return null;
    return (vtkImageActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetWindowLevel_25(vtkImageMapToWindowLevelColors id0);
  public void SetWindowLevel(vtkImageMapToWindowLevelColors id0)
  {
    SetWindowLevel_25(id0);
  }

  private native long GetWindowLevel_26();
  public vtkImageMapToWindowLevelColors GetWindowLevel()
  {
    long temp = GetWindowLevel_26();

    if (temp == 0) return null;
    return (vtkImageMapToWindowLevelColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLevelShift_27(double id0);
  public void SetLevelShift(double id0)
  {
    SetLevelShift_27(id0);
  }

  private native double GetLevelShift_28();
  public double GetLevelShift()
  {
    return GetLevelShift_28();
  }

  private native void SetLevelScale_29(double id0);
  public void SetLevelScale(double id0)
  {
    SetLevelScale_29(id0);
  }

  private native double GetLevelScale_30();
  public double GetLevelScale()
  {
    return GetLevelScale_30();
  }

  private native void SetTextProperty_31(vtkTextProperty id0);
  public void SetTextProperty(vtkTextProperty id0)
  {
    SetTextProperty_31(id0);
  }

  private native long GetTextProperty_32();
  public vtkTextProperty GetTextProperty()
  {
    long temp = GetTextProperty_32();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ShowSliceAndImageOn_33();
  public void ShowSliceAndImageOn()
  {
    ShowSliceAndImageOn_33();
  }

  private native void ShowSliceAndImageOff_34();
  public void ShowSliceAndImageOff()
  {
    ShowSliceAndImageOff_34();
  }

  private native void SetShowSliceAndImage_35(int id0);
  public void SetShowSliceAndImage(int id0)
  {
    SetShowSliceAndImage_35(id0);
  }

  private native int GetShowSliceAndImage_36();
  public int GetShowSliceAndImage()
  {
    return GetShowSliceAndImage_36();
  }

  public vtkCornerAnnotation() { super(); }

  public vtkCornerAnnotation(long id) { super(id); }
  public native long   VTKInit();

}
