// java wrapper for vtkAffineRepresentation2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAffineRepresentation2D extends vtkAffineRepresentation
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

  private native void SetBoxWidth_4(int id0);
  public void SetBoxWidth(int id0)
  {
    SetBoxWidth_4(id0);
  }

  private native int GetBoxWidthMinValue_5();
  public int GetBoxWidthMinValue()
  {
    return GetBoxWidthMinValue_5();
  }

  private native int GetBoxWidthMaxValue_6();
  public int GetBoxWidthMaxValue()
  {
    return GetBoxWidthMaxValue_6();
  }

  private native int GetBoxWidth_7();
  public int GetBoxWidth()
  {
    return GetBoxWidth_7();
  }

  private native void SetCircleWidth_8(int id0);
  public void SetCircleWidth(int id0)
  {
    SetCircleWidth_8(id0);
  }

  private native int GetCircleWidthMinValue_9();
  public int GetCircleWidthMinValue()
  {
    return GetCircleWidthMinValue_9();
  }

  private native int GetCircleWidthMaxValue_10();
  public int GetCircleWidthMaxValue()
  {
    return GetCircleWidthMaxValue_10();
  }

  private native int GetCircleWidth_11();
  public int GetCircleWidth()
  {
    return GetCircleWidth_11();
  }

  private native void SetAxesWidth_12(int id0);
  public void SetAxesWidth(int id0)
  {
    SetAxesWidth_12(id0);
  }

  private native int GetAxesWidthMinValue_13();
  public int GetAxesWidthMinValue()
  {
    return GetAxesWidthMinValue_13();
  }

  private native int GetAxesWidthMaxValue_14();
  public int GetAxesWidthMaxValue()
  {
    return GetAxesWidthMaxValue_14();
  }

  private native int GetAxesWidth_15();
  public int GetAxesWidth()
  {
    return GetAxesWidth_15();
  }

  private native void SetOrigin_16(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_16(id0);
  }

  private native void SetOrigin_17(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_17(id0,id1,id2);
  }

  private native double[] GetOrigin_18();
  public double[] GetOrigin()
  {
    return GetOrigin_18();
  }

  private native void GetTransform_19(vtkTransform id0);
  public void GetTransform(vtkTransform id0)
  {
    GetTransform_19(id0);
  }

  private native void SetProperty_20(vtkProperty2D id0);
  public void SetProperty(vtkProperty2D id0)
  {
    SetProperty_20(id0);
  }

  private native void SetSelectedProperty_21(vtkProperty2D id0);
  public void SetSelectedProperty(vtkProperty2D id0)
  {
    SetSelectedProperty_21(id0);
  }

  private native void SetTextProperty_22(vtkTextProperty id0);
  public void SetTextProperty(vtkTextProperty id0)
  {
    SetTextProperty_22(id0);
  }

  private native long GetProperty_23();
  public vtkProperty2D GetProperty()
  {
    long temp = GetProperty_23();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedProperty_24();
  public vtkProperty2D GetSelectedProperty()
  {
    long temp = GetSelectedProperty_24();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTextProperty_25();
  public vtkTextProperty GetTextProperty()
  {
    long temp = GetTextProperty_25();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDisplayText_26(int id0);
  public void SetDisplayText(int id0)
  {
    SetDisplayText_26(id0);
  }

  private native int GetDisplayText_27();
  public int GetDisplayText()
  {
    return GetDisplayText_27();
  }

  private native void DisplayTextOn_28();
  public void DisplayTextOn()
  {
    DisplayTextOn_28();
  }

  private native void DisplayTextOff_29();
  public void DisplayTextOff()
  {
    DisplayTextOff_29();
  }

  private native void PlaceWidget_30(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_30(id0);
  }

  private native void StartWidgetInteraction_31(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_31(id0);
  }

  private native void WidgetInteraction_32(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_32(id0);
  }

  private native void EndWidgetInteraction_33(double id0[]);
  public void EndWidgetInteraction(double id0[])
  {
    EndWidgetInteraction_33(id0);
  }

  private native int ComputeInteractionState_34(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_34(id0,id1,id2);
  }

  private native void BuildRepresentation_35();
  public void BuildRepresentation()
  {
    BuildRepresentation_35();
  }

  private native void ShallowCopy_36(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_36(id0);
  }

  private native void GetActors2D_37(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_37(id0);
  }

  private native void ReleaseGraphicsResources_38(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_38(id0);
  }

  private native int RenderOverlay_39(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_39(id0);
  }

  public vtkAffineRepresentation2D() { super(); }

  public vtkAffineRepresentation2D(long id) { super(id); }
  public native long   VTKInit();

}
