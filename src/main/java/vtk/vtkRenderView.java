// java wrapper for vtkRenderView object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRenderView extends vtkRenderViewBase
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

  private native void SetInteractor_4(vtkRenderWindowInteractor id0);
  public void SetInteractor(vtkRenderWindowInteractor id0)
  {
    SetInteractor_4(id0);
  }

  private native void SetInteractorStyle_5(vtkInteractorObserver id0);
  public void SetInteractorStyle(vtkInteractorObserver id0)
  {
    SetInteractorStyle_5(id0);
  }

  private native long GetInteractorStyle_6();
  public vtkInteractorObserver GetInteractorStyle()
  {
    long temp = GetInteractorStyle_6();

    if (temp == 0) return null;
    return (vtkInteractorObserver)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRenderWindow_7(vtkRenderWindow id0);
  public void SetRenderWindow(vtkRenderWindow id0)
  {
    SetRenderWindow_7(id0);
  }

  private native void SetInteractionMode_8(int id0);
  public void SetInteractionMode(int id0)
  {
    SetInteractionMode_8(id0);
  }

  private native int GetInteractionMode_9();
  public int GetInteractionMode()
  {
    return GetInteractionMode_9();
  }

  private native void SetInteractionModeTo2D_10();
  public void SetInteractionModeTo2D()
  {
    SetInteractionModeTo2D_10();
  }

  private native void SetInteractionModeTo3D_11();
  public void SetInteractionModeTo3D()
  {
    SetInteractionModeTo3D_11();
  }

  private native void Render_12();
  public void Render()
  {
    Render_12();
  }

  private native void ApplyViewTheme_13(vtkViewTheme id0);
  public void ApplyViewTheme(vtkViewTheme id0)
  {
    ApplyViewTheme_13(id0);
  }

  private native void SetTransform_14(vtkAbstractTransform id0);
  public void SetTransform(vtkAbstractTransform id0)
  {
    SetTransform_14(id0);
  }

  private native long GetTransform_15();
  public vtkAbstractTransform GetTransform()
  {
    long temp = GetTransform_15();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDisplayHoverText_16(boolean id0);
  public void SetDisplayHoverText(boolean id0)
  {
    SetDisplayHoverText_16(id0);
  }

  private native boolean GetDisplayHoverText_17();
  public boolean GetDisplayHoverText()
  {
    return GetDisplayHoverText_17();
  }

  private native void DisplayHoverTextOn_18();
  public void DisplayHoverTextOn()
  {
    DisplayHoverTextOn_18();
  }

  private native void DisplayHoverTextOff_19();
  public void DisplayHoverTextOff()
  {
    DisplayHoverTextOff_19();
  }

  private native void SetSelectionMode_20(int id0);
  public void SetSelectionMode(int id0)
  {
    SetSelectionMode_20(id0);
  }

  private native int GetSelectionModeMinValue_21();
  public int GetSelectionModeMinValue()
  {
    return GetSelectionModeMinValue_21();
  }

  private native int GetSelectionModeMaxValue_22();
  public int GetSelectionModeMaxValue()
  {
    return GetSelectionModeMaxValue_22();
  }

  private native int GetSelectionMode_23();
  public int GetSelectionMode()
  {
    return GetSelectionMode_23();
  }

  private native void SetSelectionModeToSurface_24();
  public void SetSelectionModeToSurface()
  {
    SetSelectionModeToSurface_24();
  }

  private native void SetSelectionModeToFrustum_25();
  public void SetSelectionModeToFrustum()
  {
    SetSelectionModeToFrustum_25();
  }

  private native void AddLabels_26(vtkAlgorithmOutput id0);
  public void AddLabels(vtkAlgorithmOutput id0)
  {
    AddLabels_26(id0);
  }

  private native void RemoveLabels_27(vtkAlgorithmOutput id0);
  public void RemoveLabels(vtkAlgorithmOutput id0)
  {
    RemoveLabels_27(id0);
  }

  private native void SetIconTexture_28(vtkTexture id0);
  public void SetIconTexture(vtkTexture id0)
  {
    SetIconTexture_28(id0);
  }

  private native long GetIconTexture_29();
  public vtkTexture GetIconTexture()
  {
    long temp = GetIconTexture_29();

    if (temp == 0) return null;
    return (vtkTexture)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetIconSize_30(int id0,int id1);
  public void SetIconSize(int id0,int id1)
  {
    SetIconSize_30(id0,id1);
  }

  private native void SetIconSize_31(int id0[]);
  public void SetIconSize(int id0[])
  {
    SetIconSize_31(id0);
  }

  private native int[] GetIconSize_32();
  public int[] GetIconSize()
  {
    return GetIconSize_32();
  }

  private native void SetDisplaySize_33(int id0,int id1);
  public void SetDisplaySize(int id0,int id1)
  {
    SetDisplaySize_33(id0,id1);
  }

  private native void SetDisplaySize_34(int id0[]);
  public void SetDisplaySize(int id0[])
  {
    SetDisplaySize_34(id0);
  }

  private native void SetLabelPlacementMode_35(int id0);
  public void SetLabelPlacementMode(int id0)
  {
    SetLabelPlacementMode_35(id0);
  }

  private native int GetLabelPlacementMode_36();
  public int GetLabelPlacementMode()
  {
    return GetLabelPlacementMode_36();
  }

  private native void SetLabelPlacementModeToNoOverlap_37();
  public void SetLabelPlacementModeToNoOverlap()
  {
    SetLabelPlacementModeToNoOverlap_37();
  }

  private native void SetLabelPlacementModeToAll_38();
  public void SetLabelPlacementModeToAll()
  {
    SetLabelPlacementModeToAll_38();
  }

  private native void SetLabelRenderMode_39(int id0);
  public void SetLabelRenderMode(int id0)
  {
    SetLabelRenderMode_39(id0);
  }

  private native int GetLabelRenderMode_40();
  public int GetLabelRenderMode()
  {
    return GetLabelRenderMode_40();
  }

  private native void SetLabelRenderModeToFreetype_41();
  public void SetLabelRenderModeToFreetype()
  {
    SetLabelRenderModeToFreetype_41();
  }

  private native void SetLabelRenderModeToQt_42();
  public void SetLabelRenderModeToQt()
  {
    SetLabelRenderModeToQt_42();
  }

  private native void SetRenderOnMouseMove_43(boolean id0);
  public void SetRenderOnMouseMove(boolean id0)
  {
    SetRenderOnMouseMove_43(id0);
  }

  private native boolean GetRenderOnMouseMove_44();
  public boolean GetRenderOnMouseMove()
  {
    return GetRenderOnMouseMove_44();
  }

  private native void RenderOnMouseMoveOn_45();
  public void RenderOnMouseMoveOn()
  {
    RenderOnMouseMoveOn_45();
  }

  private native void RenderOnMouseMoveOff_46();
  public void RenderOnMouseMoveOff()
  {
    RenderOnMouseMoveOff_46();
  }

  public vtkRenderView() { super(); }

  public vtkRenderView(long id) { super(id); }
  public native long   VTKInit();

}
