// java wrapper for vtkEncodedGradientShader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEncodedGradientShader extends vtkObject
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

  private native void SetZeroNormalDiffuseIntensity_4(float id0);
  public void SetZeroNormalDiffuseIntensity(float id0)
  {
    SetZeroNormalDiffuseIntensity_4(id0);
  }

  private native float GetZeroNormalDiffuseIntensityMinValue_5();
  public float GetZeroNormalDiffuseIntensityMinValue()
  {
    return GetZeroNormalDiffuseIntensityMinValue_5();
  }

  private native float GetZeroNormalDiffuseIntensityMaxValue_6();
  public float GetZeroNormalDiffuseIntensityMaxValue()
  {
    return GetZeroNormalDiffuseIntensityMaxValue_6();
  }

  private native float GetZeroNormalDiffuseIntensity_7();
  public float GetZeroNormalDiffuseIntensity()
  {
    return GetZeroNormalDiffuseIntensity_7();
  }

  private native void SetZeroNormalSpecularIntensity_8(float id0);
  public void SetZeroNormalSpecularIntensity(float id0)
  {
    SetZeroNormalSpecularIntensity_8(id0);
  }

  private native float GetZeroNormalSpecularIntensityMinValue_9();
  public float GetZeroNormalSpecularIntensityMinValue()
  {
    return GetZeroNormalSpecularIntensityMinValue_9();
  }

  private native float GetZeroNormalSpecularIntensityMaxValue_10();
  public float GetZeroNormalSpecularIntensityMaxValue()
  {
    return GetZeroNormalSpecularIntensityMaxValue_10();
  }

  private native float GetZeroNormalSpecularIntensity_11();
  public float GetZeroNormalSpecularIntensity()
  {
    return GetZeroNormalSpecularIntensity_11();
  }

  private native void UpdateShadingTable_12(vtkRenderer id0,vtkVolume id1,vtkEncodedGradientEstimator id2);
  public void UpdateShadingTable(vtkRenderer id0,vtkVolume id1,vtkEncodedGradientEstimator id2)
  {
    UpdateShadingTable_12(id0,id1,id2);
  }

  private native void SetActiveComponent_13(int id0);
  public void SetActiveComponent(int id0)
  {
    SetActiveComponent_13(id0);
  }

  private native int GetActiveComponentMinValue_14();
  public int GetActiveComponentMinValue()
  {
    return GetActiveComponentMinValue_14();
  }

  private native int GetActiveComponentMaxValue_15();
  public int GetActiveComponentMaxValue()
  {
    return GetActiveComponentMaxValue_15();
  }

  private native int GetActiveComponent_16();
  public int GetActiveComponent()
  {
    return GetActiveComponent_16();
  }

  public vtkEncodedGradientShader() { super(); }

  public vtkEncodedGradientShader(long id) { super(id); }
  public native long   VTKInit();

}
