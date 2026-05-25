// java wrapper for vtkMagnifierRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMagnifierRepresentation extends vtkWidgetRepresentation
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

  private native void SetRenderer_4(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_4(id0);
  }

  private native void SetMagnificationFactor_5(double id0);
  public void SetMagnificationFactor(double id0)
  {
    SetMagnificationFactor_5(id0);
  }

  private native double GetMagnificationFactorMinValue_6();
  public double GetMagnificationFactorMinValue()
  {
    return GetMagnificationFactorMinValue_6();
  }

  private native double GetMagnificationFactorMaxValue_7();
  public double GetMagnificationFactorMaxValue()
  {
    return GetMagnificationFactorMaxValue_7();
  }

  private native double GetMagnificationFactor_8();
  public double GetMagnificationFactor()
  {
    return GetMagnificationFactor_8();
  }

  private native void AddViewProp_9(vtkProp id0);
  public void AddViewProp(vtkProp id0)
  {
    AddViewProp_9(id0);
  }

  private native long GetViewProps_10();
  public vtkPropCollection GetViewProps()
  {
    long temp = GetViewProps_10();

    if (temp == 0) return null;
    return (vtkPropCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int HasViewProp_11(vtkProp id0);
  public int HasViewProp(vtkProp id0)
  {
    return HasViewProp_11(id0);
  }

  private native void RemoveViewProp_12(vtkProp id0);
  public void RemoveViewProp(vtkProp id0)
  {
    RemoveViewProp_12(id0);
  }

  private native void RemoveAllViewProps_13();
  public void RemoveAllViewProps()
  {
    RemoveAllViewProps_13();
  }

  private native void SetSize_14(int id0,int id1);
  public void SetSize(int id0,int id1)
  {
    SetSize_14(id0,id1);
  }

  private native void SetSize_15(int id0[]);
  public void SetSize(int id0[])
  {
    SetSize_15(id0);
  }

  private native int[] GetSize_16();
  public int[] GetSize()
  {
    return GetSize_16();
  }

  private native void SetBorder_17(boolean id0);
  public void SetBorder(boolean id0)
  {
    SetBorder_17(id0);
  }

  private native boolean GetBorder_18();
  public boolean GetBorder()
  {
    return GetBorder_18();
  }

  private native void BorderOn_19();
  public void BorderOn()
  {
    BorderOn_19();
  }

  private native void BorderOff_20();
  public void BorderOff()
  {
    BorderOff_20();
  }

  private native long GetBorderProperty_21();
  public vtkProperty2D GetBorderProperty()
  {
    long temp = GetBorderProperty_21();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildRepresentation_22();
  public void BuildRepresentation()
  {
    BuildRepresentation_22();
  }

  private native void WidgetInteraction_23(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_23(id0);
  }

  private native void SetInteractionState_24(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_24(id0);
  }

  private native int GetInteractionStateMinValue_25();
  public int GetInteractionStateMinValue()
  {
    return GetInteractionStateMinValue_25();
  }

  private native int GetInteractionStateMaxValue_26();
  public int GetInteractionStateMaxValue()
  {
    return GetInteractionStateMaxValue_26();
  }

  private native long GetMagnificationRenderer_27();
  public vtkRenderer GetMagnificationRenderer()
  {
    long temp = GetMagnificationRenderer_27();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native long GetMTime_33();
  public long GetMTime()
  {
    return GetMTime_33();
  }

  public vtkMagnifierRepresentation() { super(); }

  public vtkMagnifierRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
