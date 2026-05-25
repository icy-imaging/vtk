// java wrapper for vtkTexturedButtonRepresentation2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTexturedButtonRepresentation2D extends vtkButtonRepresentation
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

  private native void SetProperty_4(vtkProperty2D id0);
  public void SetProperty(vtkProperty2D id0)
  {
    SetProperty_4(id0);
  }

  private native long GetProperty_5();
  public vtkProperty2D GetProperty()
  {
    long temp = GetProperty_5();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetHoveringProperty_6(vtkProperty2D id0);
  public void SetHoveringProperty(vtkProperty2D id0)
  {
    SetHoveringProperty_6(id0);
  }

  private native long GetHoveringProperty_7();
  public vtkProperty2D GetHoveringProperty()
  {
    long temp = GetHoveringProperty_7();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectingProperty_8(vtkProperty2D id0);
  public void SetSelectingProperty(vtkProperty2D id0)
  {
    SetSelectingProperty_8(id0);
  }

  private native long GetSelectingProperty_9();
  public vtkProperty2D GetSelectingProperty()
  {
    long temp = GetSelectingProperty_9();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetButtonTexture_10(int id0,vtkImageData id1);
  public void SetButtonTexture(int id0,vtkImageData id1)
  {
    SetButtonTexture_10(id0,id1);
  }

  private native long GetButtonTexture_11(int id0);
  public vtkImageData GetButtonTexture(int id0)
  {
    long temp = GetButtonTexture_11(id0);

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBalloon_12();
  public vtkBalloonRepresentation GetBalloon()
  {
    long temp = GetBalloon_12();

    if (temp == 0) return null;
    return (vtkBalloonRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int ComputeInteractionState_13(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_13(id0,id1,id2);
  }

  private native void BuildRepresentation_14();
  public void BuildRepresentation()
  {
    BuildRepresentation_14();
  }

  private native void Highlight_15(int id0);
  public void Highlight(int id0)
  {
    Highlight_15(id0);
  }

  private native void PlaceWidget_16(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_16(id0);
  }

  private native void PlaceWidget_17(double id0[],int id1[]);
  public void PlaceWidget(double id0[],int id1[])
  {
    PlaceWidget_17(id0,id1);
  }

  private native void ShallowCopy_18(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_18(id0);
  }

  private native void GetActors_19(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_19(id0);
  }

  private native void ReleaseGraphicsResources_20(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_20(id0);
  }

  private native int RenderOverlay_21(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_21(id0);
  }

  private native int HasTranslucentPolygonalGeometry_22();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_22();
  }

  public vtkTexturedButtonRepresentation2D() { super(); }

  public vtkTexturedButtonRepresentation2D(long id) { super(id); }
  public native long   VTKInit();

}
