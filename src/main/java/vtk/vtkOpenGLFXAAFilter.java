// java wrapper for vtkOpenGLFXAAFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLFXAAFilter extends vtkObject
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

  private native void Execute_4(vtkOpenGLRenderer id0);
  public void Execute(vtkOpenGLRenderer id0)
  {
    Execute_4(id0);
  }

  private native void ReleaseGraphicsResources_5();
  public void ReleaseGraphicsResources()
  {
    ReleaseGraphicsResources_5();
  }

  private native void UpdateConfiguration_6(vtkFXAAOptions id0);
  public void UpdateConfiguration(vtkFXAAOptions id0)
  {
    UpdateConfiguration_6(id0);
  }

  private native void SetRelativeContrastThreshold_7(float id0);
  public void SetRelativeContrastThreshold(float id0)
  {
    SetRelativeContrastThreshold_7(id0);
  }

  private native float GetRelativeContrastThresholdMinValue_8();
  public float GetRelativeContrastThresholdMinValue()
  {
    return GetRelativeContrastThresholdMinValue_8();
  }

  private native float GetRelativeContrastThresholdMaxValue_9();
  public float GetRelativeContrastThresholdMaxValue()
  {
    return GetRelativeContrastThresholdMaxValue_9();
  }

  private native float GetRelativeContrastThreshold_10();
  public float GetRelativeContrastThreshold()
  {
    return GetRelativeContrastThreshold_10();
  }

  private native void SetHardContrastThreshold_11(float id0);
  public void SetHardContrastThreshold(float id0)
  {
    SetHardContrastThreshold_11(id0);
  }

  private native float GetHardContrastThresholdMinValue_12();
  public float GetHardContrastThresholdMinValue()
  {
    return GetHardContrastThresholdMinValue_12();
  }

  private native float GetHardContrastThresholdMaxValue_13();
  public float GetHardContrastThresholdMaxValue()
  {
    return GetHardContrastThresholdMaxValue_13();
  }

  private native float GetHardContrastThreshold_14();
  public float GetHardContrastThreshold()
  {
    return GetHardContrastThreshold_14();
  }

  private native void SetSubpixelBlendLimit_15(float id0);
  public void SetSubpixelBlendLimit(float id0)
  {
    SetSubpixelBlendLimit_15(id0);
  }

  private native float GetSubpixelBlendLimitMinValue_16();
  public float GetSubpixelBlendLimitMinValue()
  {
    return GetSubpixelBlendLimitMinValue_16();
  }

  private native float GetSubpixelBlendLimitMaxValue_17();
  public float GetSubpixelBlendLimitMaxValue()
  {
    return GetSubpixelBlendLimitMaxValue_17();
  }

  private native float GetSubpixelBlendLimit_18();
  public float GetSubpixelBlendLimit()
  {
    return GetSubpixelBlendLimit_18();
  }

  private native void SetSubpixelContrastThreshold_19(float id0);
  public void SetSubpixelContrastThreshold(float id0)
  {
    SetSubpixelContrastThreshold_19(id0);
  }

  private native float GetSubpixelContrastThresholdMinValue_20();
  public float GetSubpixelContrastThresholdMinValue()
  {
    return GetSubpixelContrastThresholdMinValue_20();
  }

  private native float GetSubpixelContrastThresholdMaxValue_21();
  public float GetSubpixelContrastThresholdMaxValue()
  {
    return GetSubpixelContrastThresholdMaxValue_21();
  }

  private native float GetSubpixelContrastThreshold_22();
  public float GetSubpixelContrastThreshold()
  {
    return GetSubpixelContrastThreshold_22();
  }

  private native void SetUseHighQualityEndpoints_23(boolean id0);
  public void SetUseHighQualityEndpoints(boolean id0)
  {
    SetUseHighQualityEndpoints_23(id0);
  }

  private native boolean GetUseHighQualityEndpoints_24();
  public boolean GetUseHighQualityEndpoints()
  {
    return GetUseHighQualityEndpoints_24();
  }

  private native void UseHighQualityEndpointsOn_25();
  public void UseHighQualityEndpointsOn()
  {
    UseHighQualityEndpointsOn_25();
  }

  private native void UseHighQualityEndpointsOff_26();
  public void UseHighQualityEndpointsOff()
  {
    UseHighQualityEndpointsOff_26();
  }

  private native void SetEndpointSearchIterations_27(int id0);
  public void SetEndpointSearchIterations(int id0)
  {
    SetEndpointSearchIterations_27(id0);
  }

  private native int GetEndpointSearchIterationsMinValue_28();
  public int GetEndpointSearchIterationsMinValue()
  {
    return GetEndpointSearchIterationsMinValue_28();
  }

  private native int GetEndpointSearchIterationsMaxValue_29();
  public int GetEndpointSearchIterationsMaxValue()
  {
    return GetEndpointSearchIterationsMaxValue_29();
  }

  private native int GetEndpointSearchIterations_30();
  public int GetEndpointSearchIterations()
  {
    return GetEndpointSearchIterations_30();
  }

  private native void SetDebugOptionValue_31(int id0);
  public void SetDebugOptionValue(int id0)
  {
    SetDebugOptionValue_31(id0);
  }

  private native int GetDebugOptionValue_32();
  public int GetDebugOptionValue()
  {
    return GetDebugOptionValue_32();
  }

  public vtkOpenGLFXAAFilter() { super(); }

  public vtkOpenGLFXAAFilter(long id) { super(id); }
  public native long   VTKInit();

}
