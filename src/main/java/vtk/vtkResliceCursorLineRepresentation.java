// java wrapper for vtkResliceCursorLineRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkResliceCursorLineRepresentation extends vtkResliceCursorRepresentation
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

  private native void BuildRepresentation_4();
  public void BuildRepresentation()
  {
    BuildRepresentation_4();
  }

  private native int ComputeInteractionState_5(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_5(id0,id1,id2);
  }

  private native void StartWidgetInteraction_6(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_6(id0);
  }

  private native void WidgetInteraction_7(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_7(id0);
  }

  private native void Highlight_8(int id0);
  public void Highlight(int id0)
  {
    Highlight_8(id0);
  }

  private native void ReleaseGraphicsResources_9(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_9(id0);
  }

  private native int RenderOverlay_10(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_10(id0);
  }

  private native int RenderOpaqueGeometry_11(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_11(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_12(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_12(id0);
  }

  private native int HasTranslucentPolygonalGeometry_13();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_13();
  }

  private native long GetResliceCursorActor_14();
  public vtkResliceCursorActor GetResliceCursorActor()
  {
    long temp = GetResliceCursorActor_14();

    if (temp == 0) return null;
    return (vtkResliceCursorActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetResliceCursor_15();
  public vtkResliceCursor GetResliceCursor()
  {
    long temp = GetResliceCursor_15();

    if (temp == 0) return null;
    return (vtkResliceCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUserMatrix_16(vtkMatrix4x4 id0);
  public void SetUserMatrix(vtkMatrix4x4 id0)
  {
    SetUserMatrix_16(id0);
  }

  private native void SetTolerance_17(int id0);
  public void SetTolerance(int id0)
  {
    SetTolerance_17(id0);
  }

  public vtkResliceCursorLineRepresentation() { super(); }

  public vtkResliceCursorLineRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
