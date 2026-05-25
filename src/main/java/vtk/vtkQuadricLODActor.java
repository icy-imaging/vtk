// java wrapper for vtkQuadricLODActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkQuadricLODActor extends vtkActor
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

  private native void SetDeferLODConstruction_4(int id0);
  public void SetDeferLODConstruction(int id0)
  {
    SetDeferLODConstruction_4(id0);
  }

  private native int GetDeferLODConstruction_5();
  public int GetDeferLODConstruction()
  {
    return GetDeferLODConstruction_5();
  }

  private native void DeferLODConstructionOn_6();
  public void DeferLODConstructionOn()
  {
    DeferLODConstructionOn_6();
  }

  private native void DeferLODConstructionOff_7();
  public void DeferLODConstructionOff()
  {
    DeferLODConstructionOff_7();
  }

  private native void SetStatic_8(int id0);
  public void SetStatic(int id0)
  {
    SetStatic_8(id0);
  }

  private native int GetStatic_9();
  public int GetStatic()
  {
    return GetStatic_9();
  }

  private native void StaticOn_10();
  public void StaticOn()
  {
    StaticOn_10();
  }

  private native void StaticOff_11();
  public void StaticOff()
  {
    StaticOff_11();
  }

  private native void SetDataConfiguration_12(int id0);
  public void SetDataConfiguration(int id0)
  {
    SetDataConfiguration_12(id0);
  }

  private native int GetDataConfigurationMinValue_13();
  public int GetDataConfigurationMinValue()
  {
    return GetDataConfigurationMinValue_13();
  }

  private native int GetDataConfigurationMaxValue_14();
  public int GetDataConfigurationMaxValue()
  {
    return GetDataConfigurationMaxValue_14();
  }

  private native int GetDataConfiguration_15();
  public int GetDataConfiguration()
  {
    return GetDataConfiguration_15();
  }

  private native void SetDataConfigurationToUnknown_16();
  public void SetDataConfigurationToUnknown()
  {
    SetDataConfigurationToUnknown_16();
  }

  private native void SetDataConfigurationToXLine_17();
  public void SetDataConfigurationToXLine()
  {
    SetDataConfigurationToXLine_17();
  }

  private native void SetDataConfigurationToYLine_18();
  public void SetDataConfigurationToYLine()
  {
    SetDataConfigurationToYLine_18();
  }

  private native void SetDataConfigurationToZLine_19();
  public void SetDataConfigurationToZLine()
  {
    SetDataConfigurationToZLine_19();
  }

  private native void SetDataConfigurationToXYPlane_20();
  public void SetDataConfigurationToXYPlane()
  {
    SetDataConfigurationToXYPlane_20();
  }

  private native void SetDataConfigurationToYZPlane_21();
  public void SetDataConfigurationToYZPlane()
  {
    SetDataConfigurationToYZPlane_21();
  }

  private native void SetDataConfigurationToXZPlane_22();
  public void SetDataConfigurationToXZPlane()
  {
    SetDataConfigurationToXZPlane_22();
  }

  private native void SetDataConfigurationToXYZVolume_23();
  public void SetDataConfigurationToXYZVolume()
  {
    SetDataConfigurationToXYZVolume_23();
  }

  private native void SetCollapseDimensionRatio_24(double id0);
  public void SetCollapseDimensionRatio(double id0)
  {
    SetCollapseDimensionRatio_24(id0);
  }

  private native double GetCollapseDimensionRatioMinValue_25();
  public double GetCollapseDimensionRatioMinValue()
  {
    return GetCollapseDimensionRatioMinValue_25();
  }

  private native double GetCollapseDimensionRatioMaxValue_26();
  public double GetCollapseDimensionRatioMaxValue()
  {
    return GetCollapseDimensionRatioMaxValue_26();
  }

  private native double GetCollapseDimensionRatio_27();
  public double GetCollapseDimensionRatio()
  {
    return GetCollapseDimensionRatio_27();
  }

  private native void SetLODFilter_28(vtkQuadricClustering id0);
  public void SetLODFilter(vtkQuadricClustering id0)
  {
    SetLODFilter_28(id0);
  }

  private native long GetLODFilter_29();
  public vtkQuadricClustering GetLODFilter()
  {
    long temp = GetLODFilter_29();

    if (temp == 0) return null;
    return (vtkQuadricClustering)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPropType_30(int id0);
  public void SetPropType(int id0)
  {
    SetPropType_30(id0);
  }

  private native int GetPropTypeMinValue_31();
  public int GetPropTypeMinValue()
  {
    return GetPropTypeMinValue_31();
  }

  private native int GetPropTypeMaxValue_32();
  public int GetPropTypeMaxValue()
  {
    return GetPropTypeMaxValue_32();
  }

  private native int GetPropType_33();
  public int GetPropType()
  {
    return GetPropType_33();
  }

  private native void SetPropTypeToFollower_34();
  public void SetPropTypeToFollower()
  {
    SetPropTypeToFollower_34();
  }

  private native void SetPropTypeToActor_35();
  public void SetPropTypeToActor()
  {
    SetPropTypeToActor_35();
  }

  private native void SetCamera_36(vtkCamera id0);
  public void SetCamera(vtkCamera id0)
  {
    SetCamera_36(id0);
  }

  private native long GetCamera_37();
  public vtkCamera GetCamera()
  {
    long temp = GetCamera_37();

    if (temp == 0) return null;
    return (vtkCamera)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Render_38(vtkRenderer id0,vtkMapper id1);
  public void Render(vtkRenderer id0,vtkMapper id1)
  {
    Render_38(id0,id1);
  }

  private native void ReleaseGraphicsResources_39(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_39(id0);
  }

  private native void ShallowCopy_40(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_40(id0);
  }

  public vtkQuadricLODActor() { super(); }

  public vtkQuadricLODActor(long id) { super(id); }
  public native long   VTKInit();

}
