// java wrapper for vtkPointHandleRepresentation2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointHandleRepresentation2D extends vtkHandleRepresentation
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

  private native void SetCursorShape_4(vtkPolyData id0);
  public void SetCursorShape(vtkPolyData id0)
  {
    SetCursorShape_4(id0);
  }

  private native long GetCursorShape_5();
  public vtkPolyData GetCursorShape()
  {
    long temp = GetCursorShape_5();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDisplayPosition_6(double id0[]);
  public void SetDisplayPosition(double id0[])
  {
    SetDisplayPosition_6(id0);
  }

  private native void SetProperty_7(vtkProperty2D id0);
  public void SetProperty(vtkProperty2D id0)
  {
    SetProperty_7(id0);
  }

  private native void SetSelectedProperty_8(vtkProperty2D id0);
  public void SetSelectedProperty(vtkProperty2D id0)
  {
    SetSelectedProperty_8(id0);
  }

  private native long GetProperty_9();
  public vtkProperty2D GetProperty()
  {
    long temp = GetProperty_9();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedProperty_10();
  public vtkProperty2D GetSelectedProperty()
  {
    long temp = GetSelectedProperty_10();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double[] GetBounds_11();
  public double[] GetBounds()
  {
    return GetBounds_11();
  }

  private native void BuildRepresentation_12();
  public void BuildRepresentation()
  {
    BuildRepresentation_12();
  }

  private native void StartWidgetInteraction_13(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_13(id0);
  }

  private native void WidgetInteraction_14(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_14(id0);
  }

  private native int ComputeInteractionState_15(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_15(id0,id1,id2);
  }

  private native void ShallowCopy_16(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_16(id0);
  }

  private native void DeepCopy_17(vtkProp id0);
  public void DeepCopy(vtkProp id0)
  {
    DeepCopy_17(id0);
  }

  private native void GetActors2D_18(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_18(id0);
  }

  private native void ReleaseGraphicsResources_19(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_19(id0);
  }

  private native int RenderOverlay_20(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_20(id0);
  }

  private native void Highlight_21(int id0);
  public void Highlight(int id0)
  {
    Highlight_21(id0);
  }

  private native void SetPointPlacer_22(vtkPointPlacer id0);
  public void SetPointPlacer(vtkPointPlacer id0)
  {
    SetPointPlacer_22(id0);
  }

  private native void SetVisibility_23(int id0);
  public void SetVisibility(int id0)
  {
    SetVisibility_23(id0);
  }

  public vtkPointHandleRepresentation2D() { super(); }

  public vtkPointHandleRepresentation2D(long id) { super(id); }
  public native long   VTKInit();

}
