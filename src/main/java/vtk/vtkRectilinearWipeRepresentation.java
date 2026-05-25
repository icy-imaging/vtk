// java wrapper for vtkRectilinearWipeRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRectilinearWipeRepresentation extends vtkWidgetRepresentation
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

  private native void SetRectilinearWipe_4(vtkImageRectilinearWipe id0);
  public void SetRectilinearWipe(vtkImageRectilinearWipe id0)
  {
    SetRectilinearWipe_4(id0);
  }

  private native long GetRectilinearWipe_5();
  public vtkImageRectilinearWipe GetRectilinearWipe()
  {
    long temp = GetRectilinearWipe_5();

    if (temp == 0) return null;
    return (vtkImageRectilinearWipe)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetImageActor_6(vtkImageActor id0);
  public void SetImageActor(vtkImageActor id0)
  {
    SetImageActor_6(id0);
  }

  private native long GetImageActor_7();
  public vtkImageActor GetImageActor()
  {
    long temp = GetImageActor_7();

    if (temp == 0) return null;
    return (vtkImageActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTolerance_8(int id0);
  public void SetTolerance(int id0)
  {
    SetTolerance_8(id0);
  }

  private native int GetToleranceMinValue_9();
  public int GetToleranceMinValue()
  {
    return GetToleranceMinValue_9();
  }

  private native int GetToleranceMaxValue_10();
  public int GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_10();
  }

  private native int GetTolerance_11();
  public int GetTolerance()
  {
    return GetTolerance_11();
  }

  private native long GetProperty_12();
  public vtkProperty2D GetProperty()
  {
    long temp = GetProperty_12();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildRepresentation_13();
  public void BuildRepresentation()
  {
    BuildRepresentation_13();
  }

  private native void StartWidgetInteraction_14(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_14(id0);
  }

  private native void WidgetInteraction_15(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_15(id0);
  }

  private native int ComputeInteractionState_16(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_16(id0,id1,id2);
  }

  private native void GetActors2D_17(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_17(id0);
  }

  private native void ReleaseGraphicsResources_18(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_18(id0);
  }

  private native int RenderOverlay_19(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_19(id0);
  }

  private native int RenderOpaqueGeometry_20(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_20(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_21(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_21(id0);
  }

  private native int HasTranslucentPolygonalGeometry_22();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_22();
  }

  public vtkRectilinearWipeRepresentation() { super(); }

  public vtkRectilinearWipeRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
