// java wrapper for vtkProp3DButtonRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProp3DButtonRepresentation extends vtkButtonRepresentation
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

  private native void SetButtonProp_4(int id0,vtkProp3D id1);
  public void SetButtonProp(int id0,vtkProp3D id1)
  {
    SetButtonProp_4(id0,id1);
  }

  private native long GetButtonProp_5(int id0);
  public vtkProp3D GetButtonProp(int id0)
  {
    long temp = GetButtonProp_5(id0);

    if (temp == 0) return null;
    return (vtkProp3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFollowCamera_6(int id0);
  public void SetFollowCamera(int id0)
  {
    SetFollowCamera_6(id0);
  }

  private native int GetFollowCamera_7();
  public int GetFollowCamera()
  {
    return GetFollowCamera_7();
  }

  private native void FollowCameraOn_8();
  public void FollowCameraOn()
  {
    FollowCameraOn_8();
  }

  private native void FollowCameraOff_9();
  public void FollowCameraOff()
  {
    FollowCameraOff_9();
  }

  private native void SetState_10(int id0);
  public void SetState(int id0)
  {
    SetState_10(id0);
  }

  private native int ComputeInteractionState_11(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_11(id0,id1,id2);
  }

  private native void BuildRepresentation_12();
  public void BuildRepresentation()
  {
    BuildRepresentation_12();
  }

  private native void PlaceWidget_13(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_13(id0);
  }

  private native void ShallowCopy_14(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_14(id0);
  }

  private native void GetActors_15(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_15(id0);
  }

  private native void ReleaseGraphicsResources_16(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_16(id0);
  }

  private native int RenderOpaqueGeometry_17(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_17(id0);
  }

  private native int RenderVolumetricGeometry_18(vtkViewport id0);
  public int RenderVolumetricGeometry(vtkViewport id0)
  {
    return RenderVolumetricGeometry_18(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_19(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_19(id0);
  }

  private native int HasTranslucentPolygonalGeometry_20();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_20();
  }

  private native void RegisterPickers_21();
  public void RegisterPickers()
  {
    RegisterPickers_21();
  }

  public vtkProp3DButtonRepresentation() { super(); }

  public vtkProp3DButtonRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
