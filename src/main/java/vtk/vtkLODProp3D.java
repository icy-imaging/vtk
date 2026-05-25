// java wrapper for vtkLODProp3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLODProp3D extends vtkProp3D
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

  private native double[] GetBounds_4();
  public double[] GetBounds()
  {
    return GetBounds_4();
  }

  private native void GetBounds_5(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_5(id0);
  }

  private native int AddLOD_6(vtkMapper id0,vtkProperty id1,vtkProperty id2,vtkTexture id3,double id4);
  public int AddLOD(vtkMapper id0,vtkProperty id1,vtkProperty id2,vtkTexture id3,double id4)
  {
    return AddLOD_6(id0,id1,id2,id3,id4);
  }

  private native int AddLOD_7(vtkMapper id0,vtkProperty id1,vtkTexture id2,double id3);
  public int AddLOD(vtkMapper id0,vtkProperty id1,vtkTexture id2,double id3)
  {
    return AddLOD_7(id0,id1,id2,id3);
  }

  private native int AddLOD_8(vtkMapper id0,vtkProperty id1,vtkProperty id2,double id3);
  public int AddLOD(vtkMapper id0,vtkProperty id1,vtkProperty id2,double id3)
  {
    return AddLOD_8(id0,id1,id2,id3);
  }

  private native int AddLOD_9(vtkMapper id0,vtkProperty id1,double id2);
  public int AddLOD(vtkMapper id0,vtkProperty id1,double id2)
  {
    return AddLOD_9(id0,id1,id2);
  }

  private native int AddLOD_10(vtkMapper id0,vtkTexture id1,double id2);
  public int AddLOD(vtkMapper id0,vtkTexture id1,double id2)
  {
    return AddLOD_10(id0,id1,id2);
  }

  private native int AddLOD_11(vtkMapper id0,double id1);
  public int AddLOD(vtkMapper id0,double id1)
  {
    return AddLOD_11(id0,id1);
  }

  private native int AddLOD_12(vtkAbstractVolumeMapper id0,vtkVolumeProperty id1,double id2);
  public int AddLOD(vtkAbstractVolumeMapper id0,vtkVolumeProperty id1,double id2)
  {
    return AddLOD_12(id0,id1,id2);
  }

  private native int AddLOD_13(vtkAbstractVolumeMapper id0,double id1);
  public int AddLOD(vtkAbstractVolumeMapper id0,double id1)
  {
    return AddLOD_13(id0,id1);
  }

  private native int AddLOD_14(vtkImageMapper3D id0,vtkImageProperty id1,double id2);
  public int AddLOD(vtkImageMapper3D id0,vtkImageProperty id1,double id2)
  {
    return AddLOD_14(id0,id1,id2);
  }

  private native int AddLOD_15(vtkImageMapper3D id0,double id1);
  public int AddLOD(vtkImageMapper3D id0,double id1)
  {
    return AddLOD_15(id0,id1);
  }

  private native int GetNumberOfLODs_16();
  public int GetNumberOfLODs()
  {
    return GetNumberOfLODs_16();
  }

  private native int GetCurrentIndex_17();
  public int GetCurrentIndex()
  {
    return GetCurrentIndex_17();
  }

  private native void RemoveLOD_18(int id0);
  public void RemoveLOD(int id0)
  {
    RemoveLOD_18(id0);
  }

  private native void SetLODProperty_19(int id0,vtkProperty id1);
  public void SetLODProperty(int id0,vtkProperty id1)
  {
    SetLODProperty_19(id0,id1);
  }

  private native void SetLODProperty_20(int id0,vtkVolumeProperty id1);
  public void SetLODProperty(int id0,vtkVolumeProperty id1)
  {
    SetLODProperty_20(id0,id1);
  }

  private native void SetLODProperty_21(int id0,vtkImageProperty id1);
  public void SetLODProperty(int id0,vtkImageProperty id1)
  {
    SetLODProperty_21(id0,id1);
  }

  private native void SetLODMapper_22(int id0,vtkMapper id1);
  public void SetLODMapper(int id0,vtkMapper id1)
  {
    SetLODMapper_22(id0,id1);
  }

  private native void SetLODMapper_23(int id0,vtkAbstractVolumeMapper id1);
  public void SetLODMapper(int id0,vtkAbstractVolumeMapper id1)
  {
    SetLODMapper_23(id0,id1);
  }

  private native void SetLODMapper_24(int id0,vtkImageMapper3D id1);
  public void SetLODMapper(int id0,vtkImageMapper3D id1)
  {
    SetLODMapper_24(id0,id1);
  }

  private native long GetLODMapper_25(int id0);
  public vtkAbstractMapper3D GetLODMapper(int id0)
  {
    long temp = GetLODMapper_25(id0);

    if (temp == 0) return null;
    return (vtkAbstractMapper3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLODBackfaceProperty_26(int id0,vtkProperty id1);
  public void SetLODBackfaceProperty(int id0,vtkProperty id1)
  {
    SetLODBackfaceProperty_26(id0,id1);
  }

  private native void SetLODTexture_27(int id0,vtkTexture id1);
  public void SetLODTexture(int id0,vtkTexture id1)
  {
    SetLODTexture_27(id0,id1);
  }

  private native void EnableLOD_28(int id0);
  public void EnableLOD(int id0)
  {
    EnableLOD_28(id0);
  }

  private native void DisableLOD_29(int id0);
  public void DisableLOD(int id0)
  {
    DisableLOD_29(id0);
  }

  private native int IsLODEnabled_30(int id0);
  public int IsLODEnabled(int id0)
  {
    return IsLODEnabled_30(id0);
  }

  private native void SetLODLevel_31(int id0,double id1);
  public void SetLODLevel(int id0,double id1)
  {
    SetLODLevel_31(id0,id1);
  }

  private native double GetLODLevel_32(int id0);
  public double GetLODLevel(int id0)
  {
    return GetLODLevel_32(id0);
  }

  private native double GetLODIndexLevel_33(int id0);
  public double GetLODIndexLevel(int id0)
  {
    return GetLODIndexLevel_33(id0);
  }

  private native double GetLODEstimatedRenderTime_34(int id0);
  public double GetLODEstimatedRenderTime(int id0)
  {
    return GetLODEstimatedRenderTime_34(id0);
  }

  private native double GetLODIndexEstimatedRenderTime_35(int id0);
  public double GetLODIndexEstimatedRenderTime(int id0)
  {
    return GetLODIndexEstimatedRenderTime_35(id0);
  }

  private native void SetAutomaticLODSelection_36(int id0);
  public void SetAutomaticLODSelection(int id0)
  {
    SetAutomaticLODSelection_36(id0);
  }

  private native int GetAutomaticLODSelectionMinValue_37();
  public int GetAutomaticLODSelectionMinValue()
  {
    return GetAutomaticLODSelectionMinValue_37();
  }

  private native int GetAutomaticLODSelectionMaxValue_38();
  public int GetAutomaticLODSelectionMaxValue()
  {
    return GetAutomaticLODSelectionMaxValue_38();
  }

  private native int GetAutomaticLODSelection_39();
  public int GetAutomaticLODSelection()
  {
    return GetAutomaticLODSelection_39();
  }

  private native void AutomaticLODSelectionOn_40();
  public void AutomaticLODSelectionOn()
  {
    AutomaticLODSelectionOn_40();
  }

  private native void AutomaticLODSelectionOff_41();
  public void AutomaticLODSelectionOff()
  {
    AutomaticLODSelectionOff_41();
  }

  private native void SetSelectedLODID_42(int id0);
  public void SetSelectedLODID(int id0)
  {
    SetSelectedLODID_42(id0);
  }

  private native int GetSelectedLODID_43();
  public int GetSelectedLODID()
  {
    return GetSelectedLODID_43();
  }

  private native int GetLastRenderedLODID_44();
  public int GetLastRenderedLODID()
  {
    return GetLastRenderedLODID_44();
  }

  private native int GetPickLODID_45();
  public int GetPickLODID()
  {
    return GetPickLODID_45();
  }

  private native void GetActors_46(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_46(id0);
  }

  private native void GetVolumes_47(vtkPropCollection id0);
  public void GetVolumes(vtkPropCollection id0)
  {
    GetVolumes_47(id0);
  }

  private native void SetSelectedPickLODID_48(int id0);
  public void SetSelectedPickLODID(int id0)
  {
    SetSelectedPickLODID_48(id0);
  }

  private native int GetSelectedPickLODID_49();
  public int GetSelectedPickLODID()
  {
    return GetSelectedPickLODID_49();
  }

  private native void SetAutomaticPickLODSelection_50(int id0);
  public void SetAutomaticPickLODSelection(int id0)
  {
    SetAutomaticPickLODSelection_50(id0);
  }

  private native int GetAutomaticPickLODSelectionMinValue_51();
  public int GetAutomaticPickLODSelectionMinValue()
  {
    return GetAutomaticPickLODSelectionMinValue_51();
  }

  private native int GetAutomaticPickLODSelectionMaxValue_52();
  public int GetAutomaticPickLODSelectionMaxValue()
  {
    return GetAutomaticPickLODSelectionMaxValue_52();
  }

  private native int GetAutomaticPickLODSelection_53();
  public int GetAutomaticPickLODSelection()
  {
    return GetAutomaticPickLODSelection_53();
  }

  private native void AutomaticPickLODSelectionOn_54();
  public void AutomaticPickLODSelectionOn()
  {
    AutomaticPickLODSelectionOn_54();
  }

  private native void AutomaticPickLODSelectionOff_55();
  public void AutomaticPickLODSelectionOff()
  {
    AutomaticPickLODSelectionOff_55();
  }

  private native void ShallowCopy_56(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_56(id0);
  }

  private native int RenderOpaqueGeometry_57(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_57(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_58(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_58(id0);
  }

  private native int RenderVolumetricGeometry_59(vtkViewport id0);
  public int RenderVolumetricGeometry(vtkViewport id0)
  {
    return RenderVolumetricGeometry_59(id0);
  }

  private native int HasTranslucentPolygonalGeometry_60();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_60();
  }

  private native void ReleaseGraphicsResources_61(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_61(id0);
  }

  private native void SetAllocatedRenderTime_62(double id0,vtkViewport id1);
  public void SetAllocatedRenderTime(double id0,vtkViewport id1)
  {
    SetAllocatedRenderTime_62(id0,id1);
  }

  private native void RestoreEstimatedRenderTime_63();
  public void RestoreEstimatedRenderTime()
  {
    RestoreEstimatedRenderTime_63();
  }

  private native void AddEstimatedRenderTime_64(double id0,vtkViewport id1);
  public void AddEstimatedRenderTime(double id0,vtkViewport id1)
  {
    AddEstimatedRenderTime_64(id0,id1);
  }

  public vtkLODProp3D() { super(); }

  public vtkLODProp3D(long id) { super(id); }
  public native long   VTKInit();

}
