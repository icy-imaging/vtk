// java wrapper for vtkOrientedGlyphFocalPlaneContourRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOrientedGlyphFocalPlaneContourRepresentation extends vtkFocalPlaneContourRepresentation
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
  public vtkProperty2D GetProperty()
  {
    long temp = GetProperty_8();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetActiveProperty_9();
  public vtkProperty2D GetActiveProperty()
  {
    long temp = GetActiveProperty_9();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLinesProperty_10();
  public vtkProperty2D GetLinesProperty()
  {
    long temp = GetLinesProperty_10();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native void GetActors2D_16(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_16(id0);
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

  private native long GetContourPlaneDirectionCosines_23(double id0[]);
  public vtkMatrix4x4 GetContourPlaneDirectionCosines(double id0[])
  {
    long temp = GetContourPlaneDirectionCosines_23(id0);

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkOrientedGlyphFocalPlaneContourRepresentation() { super(); }

  public vtkOrientedGlyphFocalPlaneContourRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
