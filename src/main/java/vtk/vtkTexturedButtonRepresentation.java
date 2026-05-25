// java wrapper for vtkTexturedButtonRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTexturedButtonRepresentation extends vtkButtonRepresentation
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

  private native void SetButtonGeometry_4(vtkPolyData id0);
  public void SetButtonGeometry(vtkPolyData id0)
  {
    SetButtonGeometry_4(id0);
  }

  private native void SetButtonGeometryConnection_5(vtkAlgorithmOutput id0);
  public void SetButtonGeometryConnection(vtkAlgorithmOutput id0)
  {
    SetButtonGeometryConnection_5(id0);
  }

  private native long GetButtonGeometry_6();
  public vtkPolyData GetButtonGeometry()
  {
    long temp = GetButtonGeometry_6();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFollowCamera_7(int id0);
  public void SetFollowCamera(int id0)
  {
    SetFollowCamera_7(id0);
  }

  private native int GetFollowCamera_8();
  public int GetFollowCamera()
  {
    return GetFollowCamera_8();
  }

  private native void FollowCameraOn_9();
  public void FollowCameraOn()
  {
    FollowCameraOn_9();
  }

  private native void FollowCameraOff_10();
  public void FollowCameraOff()
  {
    FollowCameraOff_10();
  }

  private native void SetProperty_11(vtkProperty id0);
  public void SetProperty(vtkProperty id0)
  {
    SetProperty_11(id0);
  }

  private native long GetProperty_12();
  public vtkProperty GetProperty()
  {
    long temp = GetProperty_12();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetHoveringProperty_13(vtkProperty id0);
  public void SetHoveringProperty(vtkProperty id0)
  {
    SetHoveringProperty_13(id0);
  }

  private native long GetHoveringProperty_14();
  public vtkProperty GetHoveringProperty()
  {
    long temp = GetHoveringProperty_14();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectingProperty_15(vtkProperty id0);
  public void SetSelectingProperty(vtkProperty id0)
  {
    SetSelectingProperty_15(id0);
  }

  private native long GetSelectingProperty_16();
  public vtkProperty GetSelectingProperty()
  {
    long temp = GetSelectingProperty_16();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetButtonTexture_17(int id0,vtkImageData id1);
  public void SetButtonTexture(int id0,vtkImageData id1)
  {
    SetButtonTexture_17(id0,id1);
  }

  private native long GetButtonTexture_18(int id0);
  public vtkImageData GetButtonTexture(int id0)
  {
    long temp = GetButtonTexture_18(id0);

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void PlaceWidget_19(double id0,double id1[],double id2[]);
  public void PlaceWidget(double id0,double id1[],double id2[])
  {
    PlaceWidget_19(id0,id1,id2);
  }

  private native int ComputeInteractionState_20(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_20(id0,id1,id2);
  }

  private native void PlaceWidget_21(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_21(id0);
  }

  private native void BuildRepresentation_22();
  public void BuildRepresentation()
  {
    BuildRepresentation_22();
  }

  private native void Highlight_23(int id0);
  public void Highlight(int id0)
  {
    Highlight_23(id0);
  }

  private native void ShallowCopy_24(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_24(id0);
  }

  private native void GetActors_25(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_25(id0);
  }

  private native void ReleaseGraphicsResources_26(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_26(id0);
  }

  private native int RenderOpaqueGeometry_27(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_27(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_28(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_28(id0);
  }

  private native int HasTranslucentPolygonalGeometry_29();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_29();
  }

  private native void RegisterPickers_30();
  public void RegisterPickers()
  {
    RegisterPickers_30();
  }

  public vtkTexturedButtonRepresentation() { super(); }

  public vtkTexturedButtonRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
