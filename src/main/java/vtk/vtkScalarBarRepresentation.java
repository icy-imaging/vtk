// java wrapper for vtkScalarBarRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkScalarBarRepresentation extends vtkBorderRepresentation
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

  private native long GetScalarBarActor_4();
  public vtkScalarBarActor GetScalarBarActor()
  {
    long temp = GetScalarBarActor_4();

    if (temp == 0) return null;
    return (vtkScalarBarActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScalarBarActor_5(vtkScalarBarActor id0);
  public void SetScalarBarActor(vtkScalarBarActor id0)
  {
    SetScalarBarActor_5(id0);
  }

  private native void BuildRepresentation_6();
  public void BuildRepresentation()
  {
    BuildRepresentation_6();
  }

  private native void WidgetInteraction_7(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_7(id0);
  }

  private native void GetSize_8(double id0[]);
  public void GetSize(double id0[])
  {
    GetSize_8(id0);
  }

  private native int GetVisibility_9();
  public int GetVisibility()
  {
    return GetVisibility_9();
  }

  private native void SetVisibility_10(int id0);
  public void SetVisibility(int id0)
  {
    SetVisibility_10(id0);
  }

  private native void GetActors2D_11(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_11(id0);
  }

  private native void ReleaseGraphicsResources_12(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_12(id0);
  }

  private native int RenderOverlay_13(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_13(id0);
  }

  private native int RenderOpaqueGeometry_14(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_14(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_15(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_15(id0);
  }

  private native int HasTranslucentPolygonalGeometry_16();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_16();
  }

  private native void SetAutoOrient_17(boolean id0);
  public void SetAutoOrient(boolean id0)
  {
    SetAutoOrient_17(id0);
  }

  private native boolean GetAutoOrient_18();
  public boolean GetAutoOrient()
  {
    return GetAutoOrient_18();
  }

  private native void SetOrientation_19(int id0);
  public void SetOrientation(int id0)
  {
    SetOrientation_19(id0);
  }

  private native int GetOrientation_20();
  public int GetOrientation()
  {
    return GetOrientation_20();
  }

  public vtkScalarBarRepresentation() { super(); }

  public vtkScalarBarRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
