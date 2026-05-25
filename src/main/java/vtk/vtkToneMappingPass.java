// java wrapper for vtkToneMappingPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkToneMappingPass extends vtkImageProcessingPass
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

  private native void ReleaseGraphicsResources_4(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_4(id0);
  }

  private native void SetGenericFilmicDefaultPresets_5();
  public void SetGenericFilmicDefaultPresets()
  {
    SetGenericFilmicDefaultPresets_5();
  }

  private native void SetGenericFilmicUncharted2Presets_6();
  public void SetGenericFilmicUncharted2Presets()
  {
    SetGenericFilmicUncharted2Presets_6();
  }

  private native void SetToneMappingType_7(int id0);
  public void SetToneMappingType(int id0)
  {
    SetToneMappingType_7(id0);
  }

  private native int GetToneMappingTypeMinValue_8();
  public int GetToneMappingTypeMinValue()
  {
    return GetToneMappingTypeMinValue_8();
  }

  private native int GetToneMappingTypeMaxValue_9();
  public int GetToneMappingTypeMaxValue()
  {
    return GetToneMappingTypeMaxValue_9();
  }

  private native int GetToneMappingType_10();
  public int GetToneMappingType()
  {
    return GetToneMappingType_10();
  }

  private native float GetExposure_11();
  public float GetExposure()
  {
    return GetExposure_11();
  }

  private native void SetExposure_12(float id0);
  public void SetExposure(float id0)
  {
    SetExposure_12(id0);
  }

  private native void SetContrast_13(float id0);
  public void SetContrast(float id0)
  {
    SetContrast_13(id0);
  }

  private native float GetContrastMinValue_14();
  public float GetContrastMinValue()
  {
    return GetContrastMinValue_14();
  }

  private native float GetContrastMaxValue_15();
  public float GetContrastMaxValue()
  {
    return GetContrastMaxValue_15();
  }

  private native float GetContrast_16();
  public float GetContrast()
  {
    return GetContrast_16();
  }

  private native void SetShoulder_17(float id0);
  public void SetShoulder(float id0)
  {
    SetShoulder_17(id0);
  }

  private native float GetShoulderMinValue_18();
  public float GetShoulderMinValue()
  {
    return GetShoulderMinValue_18();
  }

  private native float GetShoulderMaxValue_19();
  public float GetShoulderMaxValue()
  {
    return GetShoulderMaxValue_19();
  }

  private native float GetShoulder_20();
  public float GetShoulder()
  {
    return GetShoulder_20();
  }

  private native void SetMidIn_21(float id0);
  public void SetMidIn(float id0)
  {
    SetMidIn_21(id0);
  }

  private native float GetMidInMinValue_22();
  public float GetMidInMinValue()
  {
    return GetMidInMinValue_22();
  }

  private native float GetMidInMaxValue_23();
  public float GetMidInMaxValue()
  {
    return GetMidInMaxValue_23();
  }

  private native float GetMidIn_24();
  public float GetMidIn()
  {
    return GetMidIn_24();
  }

  private native void SetMidOut_25(float id0);
  public void SetMidOut(float id0)
  {
    SetMidOut_25(id0);
  }

  private native float GetMidOutMinValue_26();
  public float GetMidOutMinValue()
  {
    return GetMidOutMinValue_26();
  }

  private native float GetMidOutMaxValue_27();
  public float GetMidOutMaxValue()
  {
    return GetMidOutMaxValue_27();
  }

  private native float GetMidOut_28();
  public float GetMidOut()
  {
    return GetMidOut_28();
  }

  private native void SetHdrMax_29(float id0);
  public void SetHdrMax(float id0)
  {
    SetHdrMax_29(id0);
  }

  private native float GetHdrMaxMinValue_30();
  public float GetHdrMaxMinValue()
  {
    return GetHdrMaxMinValue_30();
  }

  private native float GetHdrMaxMaxValue_31();
  public float GetHdrMaxMaxValue()
  {
    return GetHdrMaxMaxValue_31();
  }

  private native float GetHdrMax_32();
  public float GetHdrMax()
  {
    return GetHdrMax_32();
  }

  private native void SetUseACES_33(boolean id0);
  public void SetUseACES(boolean id0)
  {
    SetUseACES_33(id0);
  }

  private native boolean GetUseACES_34();
  public boolean GetUseACES()
  {
    return GetUseACES_34();
  }

  public vtkToneMappingPass() { super(); }

  public vtkToneMappingPass(long id) { super(id); }
  public native long   VTKInit();

}
