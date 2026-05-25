// java wrapper for vtk3DCursorRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtk3DCursorRepresentation extends vtkWidgetRepresentation
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

  private native void WidgetInteraction_5(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_5(id0);
  }

  private native void ReleaseGraphicsResources_6(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_6(id0);
  }

  private native int RenderOpaqueGeometry_7(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_7(id0);
  }

  private native void SetCursorShape_8(int id0);
  public void SetCursorShape(int id0)
  {
    SetCursorShape_8(id0);
  }

  private native int GetShape_9();
  public int GetShape()
  {
    return GetShape_9();
  }

  private native void SetCustomCursor_10(vtkActor id0);
  public void SetCustomCursor(vtkActor id0)
  {
    SetCustomCursor_10(id0);
  }

  private native long GetCustomCursor_11();
  public vtkActor GetCustomCursor()
  {
    long temp = GetCustomCursor_11();

    if (temp == 0) return null;
    return (vtkActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCursor_12(vtkActor id0);
  public void SetCursor(vtkActor id0)
  {
    SetCursor_12(id0);
  }

  private native long GetCursor_13();
  public vtkActor GetCursor()
  {
    long temp = GetCursor_13();

    if (temp == 0) return null;
    return (vtkActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtk3DCursorRepresentation() { super(); }

  public vtk3DCursorRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
