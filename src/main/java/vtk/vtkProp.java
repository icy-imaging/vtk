// java wrapper for vtkProp object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProp extends vtkObject
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

  private native void GetActors_4(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_4(id0);
  }

  private native void GetActors2D_5(vtkPropCollection id0);
  public void GetActors2D(vtkPropCollection id0)
  {
    GetActors2D_5(id0);
  }

  private native void GetVolumes_6(vtkPropCollection id0);
  public void GetVolumes(vtkPropCollection id0)
  {
    GetVolumes_6(id0);
  }

  private native void SetVisibility_7(int id0);
  public void SetVisibility(int id0)
  {
    SetVisibility_7(id0);
  }

  private native int GetVisibility_8();
  public int GetVisibility()
  {
    return GetVisibility_8();
  }

  private native void VisibilityOn_9();
  public void VisibilityOn()
  {
    VisibilityOn_9();
  }

  private native void VisibilityOff_10();
  public void VisibilityOff()
  {
    VisibilityOff_10();
  }

  private native void SetPickable_11(int id0);
  public void SetPickable(int id0)
  {
    SetPickable_11(id0);
  }

  private native int GetPickable_12();
  public int GetPickable()
  {
    return GetPickable_12();
  }

  private native void PickableOn_13();
  public void PickableOn()
  {
    PickableOn_13();
  }

  private native void PickableOff_14();
  public void PickableOff()
  {
    PickableOff_14();
  }

  private native void Pick_15();
  public void Pick()
  {
    Pick_15();
  }

  private native void SetDragable_16(int id0);
  public void SetDragable(int id0)
  {
    SetDragable_16(id0);
  }

  private native int GetDragable_17();
  public int GetDragable()
  {
    return GetDragable_17();
  }

  private native void DragableOn_18();
  public void DragableOn()
  {
    DragableOn_18();
  }

  private native void DragableOff_19();
  public void DragableOff()
  {
    DragableOff_19();
  }

  private native long GetRedrawMTime_20();
  public long GetRedrawMTime()
  {
    return GetRedrawMTime_20();
  }

  private native void SetUseBounds_21(boolean id0);
  public void SetUseBounds(boolean id0)
  {
    SetUseBounds_21(id0);
  }

  private native boolean GetUseBounds_22();
  public boolean GetUseBounds()
  {
    return GetUseBounds_22();
  }

  private native void UseBoundsOn_23();
  public void UseBoundsOn()
  {
    UseBoundsOn_23();
  }

  private native void UseBoundsOff_24();
  public void UseBoundsOff()
  {
    UseBoundsOff_24();
  }

  private native double[] GetBounds_25();
  public double[] GetBounds()
  {
    return GetBounds_25();
  }

  private native void ShallowCopy_26(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_26(id0);
  }

  private native void InitPathTraversal_27();
  public void InitPathTraversal()
  {
    InitPathTraversal_27();
  }

  private native long GetNextPath_28();
  public vtkAssemblyPath GetNextPath()
  {
    long temp = GetNextPath_28();

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfPaths_29();
  public int GetNumberOfPaths()
  {
    return GetNumberOfPaths_29();
  }

  private native void PokeMatrix_30(vtkMatrix4x4 id0);
  public void PokeMatrix(vtkMatrix4x4 id0)
  {
    PokeMatrix_30(id0);
  }

  private native long GetMatrix_31();
  public vtkMatrix4x4 GetMatrix()
  {
    long temp = GetMatrix_31();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPropertyKeys_32();
  public vtkInformation GetPropertyKeys()
  {
    long temp = GetPropertyKeys_32();

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPropertyKeys_33(vtkInformation id0);
  public void SetPropertyKeys(vtkInformation id0)
  {
    SetPropertyKeys_33(id0);
  }

  private native boolean HasKeys_34(vtkInformation id0);
  public boolean HasKeys(vtkInformation id0)
  {
    return HasKeys_34(id0);
  }

  private native long GeneralTextureUnit_35();
  public vtkInformationIntegerKey GeneralTextureUnit()
  {
    long temp = GeneralTextureUnit_35();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GeneralTextureTransform_36();
  public vtkInformationDoubleVectorKey GeneralTextureTransform()
  {
    long temp = GeneralTextureTransform_36();

    if (temp == 0) return null;
    return (vtkInformationDoubleVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int RenderOpaqueGeometry_37(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_37(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_38(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_38(id0);
  }

  private native int RenderVolumetricGeometry_39(vtkViewport id0);
  public int RenderVolumetricGeometry(vtkViewport id0)
  {
    return RenderVolumetricGeometry_39(id0);
  }

  private native int RenderOverlay_40(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_40(id0);
  }

  private native boolean RenderFilteredOpaqueGeometry_41(vtkViewport id0,vtkInformation id1);
  public boolean RenderFilteredOpaqueGeometry(vtkViewport id0,vtkInformation id1)
  {
    return RenderFilteredOpaqueGeometry_41(id0,id1);
  }

  private native boolean RenderFilteredTranslucentPolygonalGeometry_42(vtkViewport id0,vtkInformation id1);
  public boolean RenderFilteredTranslucentPolygonalGeometry(vtkViewport id0,vtkInformation id1)
  {
    return RenderFilteredTranslucentPolygonalGeometry_42(id0,id1);
  }

  private native boolean RenderFilteredVolumetricGeometry_43(vtkViewport id0,vtkInformation id1);
  public boolean RenderFilteredVolumetricGeometry(vtkViewport id0,vtkInformation id1)
  {
    return RenderFilteredVolumetricGeometry_43(id0,id1);
  }

  private native boolean RenderFilteredOverlay_44(vtkViewport id0,vtkInformation id1);
  public boolean RenderFilteredOverlay(vtkViewport id0,vtkInformation id1)
  {
    return RenderFilteredOverlay_44(id0,id1);
  }

  private native int HasTranslucentPolygonalGeometry_45();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_45();
  }

  private native int HasOpaqueGeometry_46();
  public int HasOpaqueGeometry()
  {
    return HasOpaqueGeometry_46();
  }

  private native void ReleaseGraphicsResources_47(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_47(id0);
  }

  private native double GetEstimatedRenderTime_48(vtkViewport id0);
  public double GetEstimatedRenderTime(vtkViewport id0)
  {
    return GetEstimatedRenderTime_48(id0);
  }

  private native double GetEstimatedRenderTime_49();
  public double GetEstimatedRenderTime()
  {
    return GetEstimatedRenderTime_49();
  }

  private native void SetEstimatedRenderTime_50(double id0);
  public void SetEstimatedRenderTime(double id0)
  {
    SetEstimatedRenderTime_50(id0);
  }

  private native void RestoreEstimatedRenderTime_51();
  public void RestoreEstimatedRenderTime()
  {
    RestoreEstimatedRenderTime_51();
  }

  private native void AddEstimatedRenderTime_52(double id0,vtkViewport id1);
  public void AddEstimatedRenderTime(double id0,vtkViewport id1)
  {
    AddEstimatedRenderTime_52(id0,id1);
  }

  private native void SetAllocatedRenderTime_53(double id0,vtkViewport id1);
  public void SetAllocatedRenderTime(double id0,vtkViewport id1)
  {
    SetAllocatedRenderTime_53(id0,id1);
  }

  private native double GetAllocatedRenderTime_54();
  public double GetAllocatedRenderTime()
  {
    return GetAllocatedRenderTime_54();
  }

  private native void SetRenderTimeMultiplier_55(double id0);
  public void SetRenderTimeMultiplier(double id0)
  {
    SetRenderTimeMultiplier_55(id0);
  }

  private native double GetRenderTimeMultiplier_56();
  public double GetRenderTimeMultiplier()
  {
    return GetRenderTimeMultiplier_56();
  }

  private native void BuildPaths_57(vtkAssemblyPaths id0,vtkAssemblyPath id1);
  public void BuildPaths(vtkAssemblyPaths id0,vtkAssemblyPath id1)
  {
    BuildPaths_57(id0,id1);
  }

  private native boolean GetSupportsSelection_58();
  public boolean GetSupportsSelection()
  {
    return GetSupportsSelection_58();
  }

  private native int GetNumberOfConsumers_59();
  public int GetNumberOfConsumers()
  {
    return GetNumberOfConsumers_59();
  }

  private native void AddConsumer_60(vtkObject id0);
  public void AddConsumer(vtkObject id0)
  {
    AddConsumer_60(id0);
  }

  private native void RemoveConsumer_61(vtkObject id0);
  public void RemoveConsumer(vtkObject id0)
  {
    RemoveConsumer_61(id0);
  }

  private native long GetConsumer_62(int id0);
  public vtkObject GetConsumer(int id0)
  {
    long temp = GetConsumer_62(id0);

    if (temp == 0) return null;
    return (vtkObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int IsConsumer_63(vtkObject id0);
  public int IsConsumer(vtkObject id0)
  {
    return IsConsumer_63(id0);
  }

  private native void SetShaderProperty_64(vtkShaderProperty id0);
  public void SetShaderProperty(vtkShaderProperty id0)
  {
    SetShaderProperty_64(id0);
  }

  private native long GetShaderProperty_65();
  public vtkShaderProperty GetShaderProperty()
  {
    long temp = GetShaderProperty_65();

    if (temp == 0) return null;
    return (vtkShaderProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean IsRenderingTranslucentPolygonalGeometry_66();
  public boolean IsRenderingTranslucentPolygonalGeometry()
  {
    return IsRenderingTranslucentPolygonalGeometry_66();
  }

  public vtkProp() { super(); }

  public vtkProp(long id) { super(id); }

}
