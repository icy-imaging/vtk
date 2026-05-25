// java wrapper for vtkOpenGLFluidMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLFluidMapper extends vtkAbstractVolumeMapper
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

  private native void SetInputData_4(vtkPolyData id0);
  public void SetInputData(vtkPolyData id0)
  {
    SetInputData_4(id0);
  }

  private native long GetInput_5();
  public vtkPolyData GetInput()
  {
    long temp = GetInput_5();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScalarVisibility_6(boolean id0);
  public void SetScalarVisibility(boolean id0)
  {
    SetScalarVisibility_6(id0);
  }

  private native boolean GetScalarVisibility_7();
  public boolean GetScalarVisibility()
  {
    return GetScalarVisibility_7();
  }

  private native void ScalarVisibilityOn_8();
  public void ScalarVisibilityOn()
  {
    ScalarVisibilityOn_8();
  }

  private native void ScalarVisibilityOff_9();
  public void ScalarVisibilityOff()
  {
    ScalarVisibilityOff_9();
  }

  private native void SetParticleRadius_10(float id0);
  public void SetParticleRadius(float id0)
  {
    SetParticleRadius_10(id0);
  }

  private native float GetParticleRadius_11();
  public float GetParticleRadius()
  {
    return GetParticleRadius_11();
  }

  private native void SetThicknessAndVolumeColorFilterRadius_12(float id0);
  public void SetThicknessAndVolumeColorFilterRadius(float id0)
  {
    SetThicknessAndVolumeColorFilterRadius_12(id0);
  }

  private native float GetThicknessAndVolumeColorFilterRadius_13();
  public float GetThicknessAndVolumeColorFilterRadius()
  {
    return GetThicknessAndVolumeColorFilterRadius_13();
  }

  private native void SetSurfaceFilterMethod_14(int id0);
  public void SetSurfaceFilterMethod(int id0)
  {
    SetSurfaceFilterMethod_14(id0);
  }

  private native int GetSurfaceFilterMethod_15();
  public int GetSurfaceFilterMethod()
  {
    return GetSurfaceFilterMethod_15();
  }

  private native void SetNarrowRangeFilterParameters_16(float id0,float id1);
  public void SetNarrowRangeFilterParameters(float id0,float id1)
  {
    SetNarrowRangeFilterParameters_16(id0,id1);
  }

  private native void SetBilateralGaussianFilterParameter_17(float id0);
  public void SetBilateralGaussianFilterParameter(float id0)
  {
    SetBilateralGaussianFilterParameter_17(id0);
  }

  private native void SetDisplayMode_18(int id0);
  public void SetDisplayMode(int id0)
  {
    SetDisplayMode_18(id0);
  }

  private native int GetDisplayMode_19();
  public int GetDisplayMode()
  {
    return GetDisplayMode_19();
  }

  private native void SetAttenuationColor_20(float id0,float id1,float id2);
  public void SetAttenuationColor(float id0,float id1,float id2)
  {
    SetAttenuationColor_20(id0,id1,id2);
  }

  private native void SetAttenuationColor_21(float id0[]);
  public void SetAttenuationColor(float id0[])
  {
    SetAttenuationColor_21(id0);
  }

  private native float[] GetAttenuationColor_22();
  public float[] GetAttenuationColor()
  {
    return GetAttenuationColor_22();
  }

  private native void SetOpaqueColor_23(float id0,float id1,float id2);
  public void SetOpaqueColor(float id0,float id1,float id2)
  {
    SetOpaqueColor_23(id0,id1,id2);
  }

  private native void SetOpaqueColor_24(float id0[]);
  public void SetOpaqueColor(float id0[])
  {
    SetOpaqueColor_24(id0);
  }

  private native float[] GetOpaqueColor_25();
  public float[] GetOpaqueColor()
  {
    return GetOpaqueColor_25();
  }

  private native void SetParticleColorPower_26(float id0);
  public void SetParticleColorPower(float id0)
  {
    SetParticleColorPower_26(id0);
  }

  private native float GetParticleColorPower_27();
  public float GetParticleColorPower()
  {
    return GetParticleColorPower_27();
  }

  private native void SetParticleColorScale_28(float id0);
  public void SetParticleColorScale(float id0)
  {
    SetParticleColorScale_28(id0);
  }

  private native float GetParticleColorScale_29();
  public float GetParticleColorScale()
  {
    return GetParticleColorScale_29();
  }

  private native void SetAttenuationScale_30(float id0);
  public void SetAttenuationScale(float id0)
  {
    SetAttenuationScale_30(id0);
  }

  private native float GetAttenuationScale_31();
  public float GetAttenuationScale()
  {
    return GetAttenuationScale_31();
  }

  private native void SetAdditionalReflection_32(float id0);
  public void SetAdditionalReflection(float id0)
  {
    SetAdditionalReflection_32(id0);
  }

  private native float GetAdditionalReflection_33();
  public float GetAdditionalReflection()
  {
    return GetAdditionalReflection_33();
  }

  private native void SetRefractionScale_34(float id0);
  public void SetRefractionScale(float id0)
  {
    SetRefractionScale_34(id0);
  }

  private native float GetRefractionScale_35();
  public float GetRefractionScale()
  {
    return GetRefractionScale_35();
  }

  private native void SetRefractiveIndex_36(float id0);
  public void SetRefractiveIndex(float id0)
  {
    SetRefractiveIndex_36(id0);
  }

  private native float GetRefractiveIndex_37();
  public float GetRefractiveIndex()
  {
    return GetRefractiveIndex_37();
  }

  private native void Render_38(vtkRenderer id0,vtkVolume id1);
  public void Render(vtkRenderer id0,vtkVolume id1)
  {
    Render_38(id0,id1);
  }

  private native void ReleaseGraphicsResources_39(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_39(id0);
  }

  public vtkOpenGLFluidMapper() { super(); }

  public vtkOpenGLFluidMapper(long id) { super(id); }
  public native long   VTKInit();

}
