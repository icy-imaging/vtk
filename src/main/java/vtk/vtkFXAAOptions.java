// java wrapper for vtkFXAAOptions object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFXAAOptions extends vtkObject
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

  private native void SetRelativeContrastThreshold_4(float id0);
  public void SetRelativeContrastThreshold(float id0)
  {
    SetRelativeContrastThreshold_4(id0);
  }

  private native float GetRelativeContrastThresholdMinValue_5();
  public float GetRelativeContrastThresholdMinValue()
  {
    return GetRelativeContrastThresholdMinValue_5();
  }

  private native float GetRelativeContrastThresholdMaxValue_6();
  public float GetRelativeContrastThresholdMaxValue()
  {
    return GetRelativeContrastThresholdMaxValue_6();
  }

  private native float GetRelativeContrastThreshold_7();
  public float GetRelativeContrastThreshold()
  {
    return GetRelativeContrastThreshold_7();
  }

  private native void SetHardContrastThreshold_8(float id0);
  public void SetHardContrastThreshold(float id0)
  {
    SetHardContrastThreshold_8(id0);
  }

  private native float GetHardContrastThresholdMinValue_9();
  public float GetHardContrastThresholdMinValue()
  {
    return GetHardContrastThresholdMinValue_9();
  }

  private native float GetHardContrastThresholdMaxValue_10();
  public float GetHardContrastThresholdMaxValue()
  {
    return GetHardContrastThresholdMaxValue_10();
  }

  private native float GetHardContrastThreshold_11();
  public float GetHardContrastThreshold()
  {
    return GetHardContrastThreshold_11();
  }

  private native void SetSubpixelBlendLimit_12(float id0);
  public void SetSubpixelBlendLimit(float id0)
  {
    SetSubpixelBlendLimit_12(id0);
  }

  private native float GetSubpixelBlendLimitMinValue_13();
  public float GetSubpixelBlendLimitMinValue()
  {
    return GetSubpixelBlendLimitMinValue_13();
  }

  private native float GetSubpixelBlendLimitMaxValue_14();
  public float GetSubpixelBlendLimitMaxValue()
  {
    return GetSubpixelBlendLimitMaxValue_14();
  }

  private native float GetSubpixelBlendLimit_15();
  public float GetSubpixelBlendLimit()
  {
    return GetSubpixelBlendLimit_15();
  }

  private native void SetSubpixelContrastThreshold_16(float id0);
  public void SetSubpixelContrastThreshold(float id0)
  {
    SetSubpixelContrastThreshold_16(id0);
  }

  private native float GetSubpixelContrastThresholdMinValue_17();
  public float GetSubpixelContrastThresholdMinValue()
  {
    return GetSubpixelContrastThresholdMinValue_17();
  }

  private native float GetSubpixelContrastThresholdMaxValue_18();
  public float GetSubpixelContrastThresholdMaxValue()
  {
    return GetSubpixelContrastThresholdMaxValue_18();
  }

  private native float GetSubpixelContrastThreshold_19();
  public float GetSubpixelContrastThreshold()
  {
    return GetSubpixelContrastThreshold_19();
  }

  private native void SetUseHighQualityEndpoints_20(boolean id0);
  public void SetUseHighQualityEndpoints(boolean id0)
  {
    SetUseHighQualityEndpoints_20(id0);
  }

  private native boolean GetUseHighQualityEndpoints_21();
  public boolean GetUseHighQualityEndpoints()
  {
    return GetUseHighQualityEndpoints_21();
  }

  private native void UseHighQualityEndpointsOn_22();
  public void UseHighQualityEndpointsOn()
  {
    UseHighQualityEndpointsOn_22();
  }

  private native void UseHighQualityEndpointsOff_23();
  public void UseHighQualityEndpointsOff()
  {
    UseHighQualityEndpointsOff_23();
  }

  private native void SetEndpointSearchIterations_24(int id0);
  public void SetEndpointSearchIterations(int id0)
  {
    SetEndpointSearchIterations_24(id0);
  }

  private native int GetEndpointSearchIterationsMinValue_25();
  public int GetEndpointSearchIterationsMinValue()
  {
    return GetEndpointSearchIterationsMinValue_25();
  }

  private native int GetEndpointSearchIterationsMaxValue_26();
  public int GetEndpointSearchIterationsMaxValue()
  {
    return GetEndpointSearchIterationsMaxValue_26();
  }

  private native int GetEndpointSearchIterations_27();
  public int GetEndpointSearchIterations()
  {
    return GetEndpointSearchIterations_27();
  }

  private native void SetDebugOptionValue_28(int id0);
  public void SetDebugOptionValue(int id0)
  {
    SetDebugOptionValue_28(id0);
  }

  private native int GetDebugOptionValue_29();
  public int GetDebugOptionValue()
  {
    return GetDebugOptionValue_29();
  }

  public vtkFXAAOptions() { super(); }

  public vtkFXAAOptions(long id) { super(id); }
  public native long   VTKInit();

}
