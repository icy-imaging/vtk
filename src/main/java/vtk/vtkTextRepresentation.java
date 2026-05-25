// java wrapper for vtkTextRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTextRepresentation extends vtkBorderRepresentation
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

  private native void SetTextActor_4(vtkTextActor id0);
  public void SetTextActor(vtkTextActor id0)
  {
    SetTextActor_4(id0);
  }

  private native long GetTextActor_5();
  public vtkTextActor GetTextActor()
  {
    long temp = GetTextActor_5();

    if (temp == 0) return null;
    return (vtkTextActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetText_6(byte[] id0, int len0);
  public void SetText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetText_6(bytes0, bytes0.length);
  }

  private native byte[] GetText_7();
  public String GetText()
  {
    return new String(GetText_7(), StandardCharsets.UTF_8);
  }

  private native void BuildRepresentation_8();
  public void BuildRepresentation()
  {
    BuildRepresentation_8();
  }

  private native void GetSize_9(double id0[]);
  public void GetSize(double id0[])
  {
    GetSize_9(id0);
  }

  private native void GetActors2D_10(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_10(id0);
  }

  private native void ReleaseGraphicsResources_11(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_11(id0);
  }

  private native int RenderOverlay_12(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_12(id0);
  }

  private native int RenderOpaqueGeometry_13(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_13(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_14(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_14(id0);
  }

  private native int HasTranslucentPolygonalGeometry_15();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_15();
  }

  private native void SetWindowLocation_16(int id0);
  public void SetWindowLocation(int id0)
  {
    SetWindowLocation_16(id0);
  }

  private native void SetPosition_17(double id0,double id1);
  public void SetPosition(double id0,double id1)
  {
    SetPosition_17(id0,id1);
  }

  private native void SetPosition_18(double id0[]);
  public void SetPosition(double id0[])
  {
    SetPosition_18(id0);
  }

  private native void SetPaddingLeft_19(int id0);
  public void SetPaddingLeft(int id0)
  {
    SetPaddingLeft_19(id0);
  }

  private native int GetPaddingLeftMinValue_20();
  public int GetPaddingLeftMinValue()
  {
    return GetPaddingLeftMinValue_20();
  }

  private native int GetPaddingLeftMaxValue_21();
  public int GetPaddingLeftMaxValue()
  {
    return GetPaddingLeftMaxValue_21();
  }

  private native int GetPaddingLeft_22();
  public int GetPaddingLeft()
  {
    return GetPaddingLeft_22();
  }

  private native void SetPaddingRight_23(int id0);
  public void SetPaddingRight(int id0)
  {
    SetPaddingRight_23(id0);
  }

  private native int GetPaddingRightMinValue_24();
  public int GetPaddingRightMinValue()
  {
    return GetPaddingRightMinValue_24();
  }

  private native int GetPaddingRightMaxValue_25();
  public int GetPaddingRightMaxValue()
  {
    return GetPaddingRightMaxValue_25();
  }

  private native int GetPaddingRight_26();
  public int GetPaddingRight()
  {
    return GetPaddingRight_26();
  }

  private native void SetPaddingTop_27(int id0);
  public void SetPaddingTop(int id0)
  {
    SetPaddingTop_27(id0);
  }

  private native int GetPaddingTopMinValue_28();
  public int GetPaddingTopMinValue()
  {
    return GetPaddingTopMinValue_28();
  }

  private native int GetPaddingTopMaxValue_29();
  public int GetPaddingTopMaxValue()
  {
    return GetPaddingTopMaxValue_29();
  }

  private native int GetPaddingTop_30();
  public int GetPaddingTop()
  {
    return GetPaddingTop_30();
  }

  private native void SetPaddingBottom_31(int id0);
  public void SetPaddingBottom(int id0)
  {
    SetPaddingBottom_31(id0);
  }

  private native int GetPaddingBottomMinValue_32();
  public int GetPaddingBottomMinValue()
  {
    return GetPaddingBottomMinValue_32();
  }

  private native int GetPaddingBottomMaxValue_33();
  public int GetPaddingBottomMaxValue()
  {
    return GetPaddingBottomMaxValue_33();
  }

  private native int GetPaddingBottom_34();
  public int GetPaddingBottom()
  {
    return GetPaddingBottom_34();
  }

  private native void SetPadding_35(int id0);
  public void SetPadding(int id0)
  {
    SetPadding_35(id0);
  }

  public vtkTextRepresentation() { super(); }

  public vtkTextRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
