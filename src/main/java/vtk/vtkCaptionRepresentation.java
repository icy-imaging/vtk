// java wrapper for vtkCaptionRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCaptionRepresentation extends vtkBorderRepresentation
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

  private native void SetAnchorPosition_4(double id0[]);
  public void SetAnchorPosition(double id0[])
  {
    SetAnchorPosition_4(id0);
  }

  private native void GetAnchorPosition_5(double id0[]);
  public void GetAnchorPosition(double id0[])
  {
    GetAnchorPosition_5(id0);
  }

  private native void SetCaptionActor2D_6(vtkCaptionActor2D id0);
  public void SetCaptionActor2D(vtkCaptionActor2D id0)
  {
    SetCaptionActor2D_6(id0);
  }

  private native long GetCaptionActor2D_7();
  public vtkCaptionActor2D GetCaptionActor2D()
  {
    long temp = GetCaptionActor2D_7();

    if (temp == 0) return null;
    return (vtkCaptionActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAnchorRepresentation_8(vtkPointHandleRepresentation3D id0);
  public void SetAnchorRepresentation(vtkPointHandleRepresentation3D id0)
  {
    SetAnchorRepresentation_8(id0);
  }

  private native long GetAnchorRepresentation_9();
  public vtkPointHandleRepresentation3D GetAnchorRepresentation()
  {
    long temp = GetAnchorRepresentation_9();

    if (temp == 0) return null;
    return (vtkPointHandleRepresentation3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildRepresentation_10();
  public void BuildRepresentation()
  {
    BuildRepresentation_10();
  }

  private native void GetSize_11(double id0[]);
  public void GetSize(double id0[])
  {
    GetSize_11(id0);
  }

  private native void GetActors2D_12(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_12(id0);
  }

  private native void ReleaseGraphicsResources_13(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_13(id0);
  }

  private native int RenderOverlay_14(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_14(id0);
  }

  private native int RenderOpaqueGeometry_15(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_15(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_16(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_16(id0);
  }

  private native int HasTranslucentPolygonalGeometry_17();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_17();
  }

  private native void SetFontFactor_18(double id0);
  public void SetFontFactor(double id0)
  {
    SetFontFactor_18(id0);
  }

  private native double GetFontFactorMinValue_19();
  public double GetFontFactorMinValue()
  {
    return GetFontFactorMinValue_19();
  }

  private native double GetFontFactorMaxValue_20();
  public double GetFontFactorMaxValue()
  {
    return GetFontFactorMaxValue_20();
  }

  private native double GetFontFactor_21();
  public double GetFontFactor()
  {
    return GetFontFactor_21();
  }

  private native void SetFit_22(int id0);
  public void SetFit(int id0)
  {
    SetFit_22(id0);
  }

  private native int GetFitMinValue_23();
  public int GetFitMinValue()
  {
    return GetFitMinValue_23();
  }

  private native int GetFitMaxValue_24();
  public int GetFitMaxValue()
  {
    return GetFitMaxValue_24();
  }

  private native int GetFit_25();
  public int GetFit()
  {
    return GetFit_25();
  }

  private native void SetFitToBorder_26();
  public void SetFitToBorder()
  {
    SetFitToBorder_26();
  }

  private native void SetFitToText_27();
  public void SetFitToText()
  {
    SetFitToText_27();
  }

  private native byte[] GetFitAsString_28();
  public String GetFitAsString()
  {
    return new String(GetFitAsString_28(), StandardCharsets.UTF_8);
  }

  public vtkCaptionRepresentation() { super(); }

  public vtkCaptionRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
