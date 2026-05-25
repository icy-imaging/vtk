// java wrapper for vtkGaussianSplatter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGaussianSplatter extends vtkImageAlgorithm
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

  private native void SetSampleDimensions_4(int id0,int id1,int id2);
  public void SetSampleDimensions(int id0,int id1,int id2)
  {
    SetSampleDimensions_4(id0,id1,id2);
  }

  private native void SetSampleDimensions_5(int id0[]);
  public void SetSampleDimensions(int id0[])
  {
    SetSampleDimensions_5(id0);
  }

  private native int[] GetSampleDimensions_6();
  public int[] GetSampleDimensions()
  {
    return GetSampleDimensions_6();
  }

  private native void SetModelBounds_7(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetModelBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetModelBounds_7(id0,id1,id2,id3,id4,id5);
  }

  private native void SetModelBounds_8(double id0[]);
  public void SetModelBounds(double id0[])
  {
    SetModelBounds_8(id0);
  }

  private native double[] GetModelBounds_9();
  public double[] GetModelBounds()
  {
    return GetModelBounds_9();
  }

  private native void SetRadius_10(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_10(id0);
  }

  private native double GetRadiusMinValue_11();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_11();
  }

  private native double GetRadiusMaxValue_12();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_12();
  }

  private native double GetRadius_13();
  public double GetRadius()
  {
    return GetRadius_13();
  }

  private native void SetScaleFactor_14(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_14(id0);
  }

  private native double GetScaleFactorMinValue_15();
  public double GetScaleFactorMinValue()
  {
    return GetScaleFactorMinValue_15();
  }

  private native double GetScaleFactorMaxValue_16();
  public double GetScaleFactorMaxValue()
  {
    return GetScaleFactorMaxValue_16();
  }

  private native double GetScaleFactor_17();
  public double GetScaleFactor()
  {
    return GetScaleFactor_17();
  }

  private native void SetExponentFactor_18(double id0);
  public void SetExponentFactor(double id0)
  {
    SetExponentFactor_18(id0);
  }

  private native double GetExponentFactor_19();
  public double GetExponentFactor()
  {
    return GetExponentFactor_19();
  }

  private native void SetNormalWarping_20(int id0);
  public void SetNormalWarping(int id0)
  {
    SetNormalWarping_20(id0);
  }

  private native int GetNormalWarping_21();
  public int GetNormalWarping()
  {
    return GetNormalWarping_21();
  }

  private native void NormalWarpingOn_22();
  public void NormalWarpingOn()
  {
    NormalWarpingOn_22();
  }

  private native void NormalWarpingOff_23();
  public void NormalWarpingOff()
  {
    NormalWarpingOff_23();
  }

  private native void SetEccentricity_24(double id0);
  public void SetEccentricity(double id0)
  {
    SetEccentricity_24(id0);
  }

  private native double GetEccentricityMinValue_25();
  public double GetEccentricityMinValue()
  {
    return GetEccentricityMinValue_25();
  }

  private native double GetEccentricityMaxValue_26();
  public double GetEccentricityMaxValue()
  {
    return GetEccentricityMaxValue_26();
  }

  private native double GetEccentricity_27();
  public double GetEccentricity()
  {
    return GetEccentricity_27();
  }

  private native void SetScalarWarping_28(int id0);
  public void SetScalarWarping(int id0)
  {
    SetScalarWarping_28(id0);
  }

  private native int GetScalarWarping_29();
  public int GetScalarWarping()
  {
    return GetScalarWarping_29();
  }

  private native void ScalarWarpingOn_30();
  public void ScalarWarpingOn()
  {
    ScalarWarpingOn_30();
  }

  private native void ScalarWarpingOff_31();
  public void ScalarWarpingOff()
  {
    ScalarWarpingOff_31();
  }

  private native void SetCapping_32(int id0);
  public void SetCapping(int id0)
  {
    SetCapping_32(id0);
  }

  private native int GetCapping_33();
  public int GetCapping()
  {
    return GetCapping_33();
  }

  private native void CappingOn_34();
  public void CappingOn()
  {
    CappingOn_34();
  }

  private native void CappingOff_35();
  public void CappingOff()
  {
    CappingOff_35();
  }

  private native void SetCapValue_36(double id0);
  public void SetCapValue(double id0)
  {
    SetCapValue_36(id0);
  }

  private native double GetCapValue_37();
  public double GetCapValue()
  {
    return GetCapValue_37();
  }

  private native void SetAccumulationMode_38(int id0);
  public void SetAccumulationMode(int id0)
  {
    SetAccumulationMode_38(id0);
  }

  private native int GetAccumulationModeMinValue_39();
  public int GetAccumulationModeMinValue()
  {
    return GetAccumulationModeMinValue_39();
  }

  private native int GetAccumulationModeMaxValue_40();
  public int GetAccumulationModeMaxValue()
  {
    return GetAccumulationModeMaxValue_40();
  }

  private native int GetAccumulationMode_41();
  public int GetAccumulationMode()
  {
    return GetAccumulationMode_41();
  }

  private native void SetAccumulationModeToMin_42();
  public void SetAccumulationModeToMin()
  {
    SetAccumulationModeToMin_42();
  }

  private native void SetAccumulationModeToMax_43();
  public void SetAccumulationModeToMax()
  {
    SetAccumulationModeToMax_43();
  }

  private native void SetAccumulationModeToSum_44();
  public void SetAccumulationModeToSum()
  {
    SetAccumulationModeToSum_44();
  }

  private native byte[] GetAccumulationModeAsString_45();
  public String GetAccumulationModeAsString()
  {
    return new String(GetAccumulationModeAsString_45(), StandardCharsets.UTF_8);
  }

  private native void SetNullValue_46(double id0);
  public void SetNullValue(double id0)
  {
    SetNullValue_46(id0);
  }

  private native double GetNullValue_47();
  public double GetNullValue()
  {
    return GetNullValue_47();
  }

  private native void ComputeModelBounds_48(vtkDataSet id0,vtkImageData id1,vtkInformation id2);
  public void ComputeModelBounds(vtkDataSet id0,vtkImageData id1,vtkInformation id2)
  {
    ComputeModelBounds_48(id0,id1,id2);
  }

  private native void ComputeModelBounds_49(vtkCompositeDataSet id0,vtkImageData id1,vtkInformation id2);
  public void ComputeModelBounds(vtkCompositeDataSet id0,vtkImageData id1,vtkInformation id2)
  {
    ComputeModelBounds_49(id0,id1,id2);
  }

  private native double SamplePoint_50(double id0[]);
  public double SamplePoint(double id0[])
  {
    return SamplePoint_50(id0);
  }

  public vtkGaussianSplatter() { super(); }

  public vtkGaussianSplatter(long id) { super(id); }
  public native long   VTKInit();

}
