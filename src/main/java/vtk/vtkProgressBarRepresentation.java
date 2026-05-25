// java wrapper for vtkProgressBarRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProgressBarRepresentation extends vtkBorderRepresentation
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

  private native long GetProperty_4();
  public vtkProperty2D GetProperty()
  {
    long temp = GetProperty_4();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetProgressRate_5(double id0);
  public void SetProgressRate(double id0)
  {
    SetProgressRate_5(id0);
  }

  private native double GetProgressRateMinValue_6();
  public double GetProgressRateMinValue()
  {
    return GetProgressRateMinValue_6();
  }

  private native double GetProgressRateMaxValue_7();
  public double GetProgressRateMaxValue()
  {
    return GetProgressRateMaxValue_7();
  }

  private native double GetProgressRate_8();
  public double GetProgressRate()
  {
    return GetProgressRate_8();
  }

  private native void SetPadding_9(double id0,double id1);
  public void SetPadding(double id0,double id1)
  {
    SetPadding_9(id0,id1);
  }

  private native void SetPadding_10(double id0[]);
  public void SetPadding(double id0[])
  {
    SetPadding_10(id0);
  }

  private native double[] GetPadding_11();
  public double[] GetPadding()
  {
    return GetPadding_11();
  }

  private native void SetDrawFrame_12(boolean id0);
  public void SetDrawFrame(boolean id0)
  {
    SetDrawFrame_12(id0);
  }

  private native boolean GetDrawFrame_13();
  public boolean GetDrawFrame()
  {
    return GetDrawFrame_13();
  }

  private native void DrawFrameOn_14();
  public void DrawFrameOn()
  {
    DrawFrameOn_14();
  }

  private native void DrawFrameOff_15();
  public void DrawFrameOff()
  {
    DrawFrameOff_15();
  }

  private native void SetProgressBarColor_16(double id0,double id1,double id2);
  public void SetProgressBarColor(double id0,double id1,double id2)
  {
    SetProgressBarColor_16(id0,id1,id2);
  }

  private native void SetProgressBarColor_17(double id0[]);
  public void SetProgressBarColor(double id0[])
  {
    SetProgressBarColor_17(id0);
  }

  private native double[] GetProgressBarColor_18();
  public double[] GetProgressBarColor()
  {
    return GetProgressBarColor_18();
  }

  private native void SetBackgroundColor_19(double id0,double id1,double id2);
  public void SetBackgroundColor(double id0,double id1,double id2)
  {
    SetBackgroundColor_19(id0,id1,id2);
  }

  private native void SetBackgroundColor_20(double id0[]);
  public void SetBackgroundColor(double id0[])
  {
    SetBackgroundColor_20(id0);
  }

  private native double[] GetBackgroundColor_21();
  public double[] GetBackgroundColor()
  {
    return GetBackgroundColor_21();
  }

  private native void SetDrawBackground_22(boolean id0);
  public void SetDrawBackground(boolean id0)
  {
    SetDrawBackground_22(id0);
  }

  private native boolean GetDrawBackground_23();
  public boolean GetDrawBackground()
  {
    return GetDrawBackground_23();
  }

  private native void DrawBackgroundOn_24();
  public void DrawBackgroundOn()
  {
    DrawBackgroundOn_24();
  }

  private native void DrawBackgroundOff_25();
  public void DrawBackgroundOff()
  {
    DrawBackgroundOff_25();
  }

  private native void BuildRepresentation_26();
  public void BuildRepresentation()
  {
    BuildRepresentation_26();
  }

  private native void GetActors2D_27(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_27(id0);
  }

  private native void ReleaseGraphicsResources_28(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_28(id0);
  }

  private native int RenderOverlay_29(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_29(id0);
  }

  private native int RenderOpaqueGeometry_30(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_30(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_31(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_31(id0);
  }

  private native int HasTranslucentPolygonalGeometry_32();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_32();
  }

  public vtkProgressBarRepresentation() { super(); }

  public vtkProgressBarRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
