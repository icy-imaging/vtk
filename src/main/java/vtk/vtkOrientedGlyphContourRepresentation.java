// java wrapper for vtkOrientedGlyphContourRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOrientedGlyphContourRepresentation extends vtkContourRepresentation
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

  private native void SetActiveCursorShape_6(vtkPolyData id0);
  public void SetActiveCursorShape(vtkPolyData id0)
  {
    SetActiveCursorShape_6(id0);
  }

  private native long GetActiveCursorShape_7();
  public vtkPolyData GetActiveCursorShape()
  {
    long temp = GetActiveCursorShape_7();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetProperty_8();
  public vtkProperty GetProperty()
  {
    long temp = GetProperty_8();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetActiveProperty_9();
  public vtkProperty GetActiveProperty()
  {
    long temp = GetActiveProperty_9();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLinesProperty_10();
  public vtkProperty GetLinesProperty()
  {
    long temp = GetLinesProperty_10();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRenderer_11(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_11(id0);
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

  private native void GetActors_16(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_16(id0);
  }

  private native void ReleaseGraphicsResources_17(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_17(id0);
  }

  private native int RenderOverlay_18(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_18(id0);
  }

  private native int RenderOpaqueGeometry_19(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_19(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_20(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_20(id0);
  }

  private native int HasTranslucentPolygonalGeometry_21();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_21();
  }

  private native long GetContourRepresentationAsPolyData_22();
  public vtkPolyData GetContourRepresentationAsPolyData()
  {
    long temp = GetContourRepresentationAsPolyData_22();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAlwaysOnTop_23(int id0);
  public void SetAlwaysOnTop(int id0)
  {
    SetAlwaysOnTop_23(id0);
  }

  private native int GetAlwaysOnTop_24();
  public int GetAlwaysOnTop()
  {
    return GetAlwaysOnTop_24();
  }

  private native void AlwaysOnTopOn_25();
  public void AlwaysOnTopOn()
  {
    AlwaysOnTopOn_25();
  }

  private native void AlwaysOnTopOff_26();
  public void AlwaysOnTopOff()
  {
    AlwaysOnTopOff_26();
  }

  private native void SetLineColor_27(double id0,double id1,double id2);
  public void SetLineColor(double id0,double id1,double id2)
  {
    SetLineColor_27(id0,id1,id2);
  }

  private native void SetShowSelectedNodes_28(int id0);
  public void SetShowSelectedNodes(int id0)
  {
    SetShowSelectedNodes_28(id0);
  }

  public vtkOrientedGlyphContourRepresentation() { super(); }

  public vtkOrientedGlyphContourRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
