// java wrapper for vtkOpenGLRenderer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLRenderer extends vtkRenderer
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

  private native void DeviceRender_4();
  public void DeviceRender()
  {
    DeviceRender_4();
  }

  private native void DeviceRenderOpaqueGeometry_5(vtkFrameBufferObjectBase id0);
  public void DeviceRenderOpaqueGeometry(vtkFrameBufferObjectBase id0)
  {
    DeviceRenderOpaqueGeometry_5(id0);
  }

  private native void DeviceRenderTranslucentPolygonalGeometry_6(vtkFrameBufferObjectBase id0);
  public void DeviceRenderTranslucentPolygonalGeometry(vtkFrameBufferObjectBase id0)
  {
    DeviceRenderTranslucentPolygonalGeometry_6(id0);
  }

  private native void Clear_7();
  public void Clear()
  {
    Clear_7();
  }

  private native int UpdateLights_8();
  public int UpdateLights()
  {
    return UpdateLights_8();
  }

  private native int GetDepthPeelingHigherLayer_9();
  public int GetDepthPeelingHigherLayer()
  {
    return GetDepthPeelingHigherLayer_9();
  }

  private native boolean HaveAppleQueryAllocationBug_10();
  public boolean HaveAppleQueryAllocationBug()
  {
    return HaveAppleQueryAllocationBug_10();
  }

  private native boolean IsDualDepthPeelingSupported_11();
  public boolean IsDualDepthPeelingSupported()
  {
    return IsDualDepthPeelingSupported_11();
  }

  private native long GetState_12();
  public vtkOpenGLState GetState()
  {
    long temp = GetState_12();

    if (temp == 0) return null;
    return (vtkOpenGLState)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetLightingUniforms_13();
  public String GetLightingUniforms()
  {
    return new String(GetLightingUniforms_13(), StandardCharsets.UTF_8);
  }

  private native void UpdateLightingUniforms_14(vtkShaderProgram id0);
  public void UpdateLightingUniforms(vtkShaderProgram id0)
  {
    UpdateLightingUniforms_14(id0);
  }

  private native int GetLightingComplexity_15();
  public int GetLightingComplexity()
  {
    return GetLightingComplexity_15();
  }

  private native int GetLightingCount_16();
  public int GetLightingCount()
  {
    return GetLightingCount_16();
  }

  private native void SetUserLightTransform_17(vtkTransform id0);
  public void SetUserLightTransform(vtkTransform id0)
  {
    SetUserLightTransform_17(id0);
  }

  private native long GetUserLightTransform_18();
  public vtkTransform GetUserLightTransform()
  {
    long temp = GetUserLightTransform_18();

    if (temp == 0) return null;
    return (vtkTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetEnvMapLookupTable_19(vtkPBRLUTTexture id0);
  public void SetEnvMapLookupTable(vtkPBRLUTTexture id0)
  {
    SetEnvMapLookupTable_19(id0);
  }

  private native long GetEnvMapLookupTable_20();
  public vtkPBRLUTTexture GetEnvMapLookupTable()
  {
    long temp = GetEnvMapLookupTable_20();

    if (temp == 0) return null;
    return (vtkPBRLUTTexture)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetEnvMapIrradiance_21(vtkPBRIrradianceTexture id0);
  public void SetEnvMapIrradiance(vtkPBRIrradianceTexture id0)
  {
    SetEnvMapIrradiance_21(id0);
  }

  private native long GetEnvMapIrradiance_22();
  public vtkPBRIrradianceTexture GetEnvMapIrradiance()
  {
    long temp = GetEnvMapIrradiance_22();

    if (temp == 0) return null;
    return (vtkPBRIrradianceTexture)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetEnvMapPrefiltered_23(vtkPBRPrefilterTexture id0);
  public void SetEnvMapPrefiltered(vtkPBRPrefilterTexture id0)
  {
    SetEnvMapPrefiltered_23(id0);
  }

  private native long GetEnvMapPrefiltered_24();
  public vtkPBRPrefilterTexture GetEnvMapPrefiltered()
  {
    long temp = GetEnvMapPrefiltered_24();

    if (temp == 0) return null;
    return (vtkPBRPrefilterTexture)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSphericalHarmonics_25();
  public vtkFloatArray GetSphericalHarmonics()
  {
    long temp = GetSphericalHarmonics_25();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseSphericalHarmonics_26(boolean id0);
  public void SetUseSphericalHarmonics(boolean id0)
  {
    SetUseSphericalHarmonics_26(id0);
  }

  private native boolean GetUseSphericalHarmonics_27();
  public boolean GetUseSphericalHarmonics()
  {
    return GetUseSphericalHarmonics_27();
  }

  private native void UseSphericalHarmonicsOn_28();
  public void UseSphericalHarmonicsOn()
  {
    UseSphericalHarmonicsOn_28();
  }

  private native void UseSphericalHarmonicsOff_29();
  public void UseSphericalHarmonicsOff()
  {
    UseSphericalHarmonicsOff_29();
  }

  private native void SetEnvironmentTexture_30(vtkTexture id0,boolean id1);
  public void SetEnvironmentTexture(vtkTexture id0,boolean id1)
  {
    SetEnvironmentTexture_30(id0,id1);
  }

  private native void ReleaseGraphicsResources_31(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_31(id0);
  }

  public vtkOpenGLRenderer() { super(); }

  public vtkOpenGLRenderer(long id) { super(id); }
  public native long   VTKInit();

}
