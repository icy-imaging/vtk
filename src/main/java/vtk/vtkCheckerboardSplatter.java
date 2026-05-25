// java wrapper for vtkCheckerboardSplatter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCheckerboardSplatter extends vtkImageAlgorithm
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

  private native void SetFootprint_10(int id0);
  public void SetFootprint(int id0)
  {
    SetFootprint_10(id0);
  }

  private native int GetFootprintMinValue_11();
  public int GetFootprintMinValue()
  {
    return GetFootprintMinValue_11();
  }

  private native int GetFootprintMaxValue_12();
  public int GetFootprintMaxValue()
  {
    return GetFootprintMaxValue_12();
  }

  private native int GetFootprint_13();
  public int GetFootprint()
  {
    return GetFootprint_13();
  }

  private native void SetRadius_14(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_14(id0);
  }

  private native double GetRadiusMinValue_15();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_15();
  }

  private native double GetRadiusMaxValue_16();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_16();
  }

  private native double GetRadius_17();
  public double GetRadius()
  {
    return GetRadius_17();
  }

  private native void SetScaleFactor_18(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_18(id0);
  }

  private native double GetScaleFactorMinValue_19();
  public double GetScaleFactorMinValue()
  {
    return GetScaleFactorMinValue_19();
  }

  private native double GetScaleFactorMaxValue_20();
  public double GetScaleFactorMaxValue()
  {
    return GetScaleFactorMaxValue_20();
  }

  private native double GetScaleFactor_21();
  public double GetScaleFactor()
  {
    return GetScaleFactor_21();
  }

  private native void SetExponentFactor_22(double id0);
  public void SetExponentFactor(double id0)
  {
    SetExponentFactor_22(id0);
  }

  private native double GetExponentFactor_23();
  public double GetExponentFactor()
  {
    return GetExponentFactor_23();
  }

  private native void SetScalarWarping_24(int id0);
  public void SetScalarWarping(int id0)
  {
    SetScalarWarping_24(id0);
  }

  private native int GetScalarWarping_25();
  public int GetScalarWarping()
  {
    return GetScalarWarping_25();
  }

  private native void ScalarWarpingOn_26();
  public void ScalarWarpingOn()
  {
    ScalarWarpingOn_26();
  }

  private native void ScalarWarpingOff_27();
  public void ScalarWarpingOff()
  {
    ScalarWarpingOff_27();
  }

  private native void SetNormalWarping_28(int id0);
  public void SetNormalWarping(int id0)
  {
    SetNormalWarping_28(id0);
  }

  private native int GetNormalWarping_29();
  public int GetNormalWarping()
  {
    return GetNormalWarping_29();
  }

  private native void NormalWarpingOn_30();
  public void NormalWarpingOn()
  {
    NormalWarpingOn_30();
  }

  private native void NormalWarpingOff_31();
  public void NormalWarpingOff()
  {
    NormalWarpingOff_31();
  }

  private native void SetEccentricity_32(double id0);
  public void SetEccentricity(double id0)
  {
    SetEccentricity_32(id0);
  }

  private native double GetEccentricityMinValue_33();
  public double GetEccentricityMinValue()
  {
    return GetEccentricityMinValue_33();
  }

  private native double GetEccentricityMaxValue_34();
  public double GetEccentricityMaxValue()
  {
    return GetEccentricityMaxValue_34();
  }

  private native double GetEccentricity_35();
  public double GetEccentricity()
  {
    return GetEccentricity_35();
  }

  private native void SetAccumulationMode_36(int id0);
  public void SetAccumulationMode(int id0)
  {
    SetAccumulationMode_36(id0);
  }

  private native int GetAccumulationModeMinValue_37();
  public int GetAccumulationModeMinValue()
  {
    return GetAccumulationModeMinValue_37();
  }

  private native int GetAccumulationModeMaxValue_38();
  public int GetAccumulationModeMaxValue()
  {
    return GetAccumulationModeMaxValue_38();
  }

  private native int GetAccumulationMode_39();
  public int GetAccumulationMode()
  {
    return GetAccumulationMode_39();
  }

  private native void SetAccumulationModeToMin_40();
  public void SetAccumulationModeToMin()
  {
    SetAccumulationModeToMin_40();
  }

  private native void SetAccumulationModeToMax_41();
  public void SetAccumulationModeToMax()
  {
    SetAccumulationModeToMax_41();
  }

  private native void SetAccumulationModeToSum_42();
  public void SetAccumulationModeToSum()
  {
    SetAccumulationModeToSum_42();
  }

  private native byte[] GetAccumulationModeAsString_43();
  public String GetAccumulationModeAsString()
  {
    return new String(GetAccumulationModeAsString_43(), StandardCharsets.UTF_8);
  }

  private native void SetOutputScalarType_44(int id0);
  public void SetOutputScalarType(int id0)
  {
    SetOutputScalarType_44(id0);
  }

  private native int GetOutputScalarType_45();
  public int GetOutputScalarType()
  {
    return GetOutputScalarType_45();
  }

  private native void SetOutputScalarTypeToDouble_46();
  public void SetOutputScalarTypeToDouble()
  {
    SetOutputScalarTypeToDouble_46();
  }

  private native void SetOutputScalarTypeToFloat_47();
  public void SetOutputScalarTypeToFloat()
  {
    SetOutputScalarTypeToFloat_47();
  }

  private native void SetCapping_48(int id0);
  public void SetCapping(int id0)
  {
    SetCapping_48(id0);
  }

  private native int GetCapping_49();
  public int GetCapping()
  {
    return GetCapping_49();
  }

  private native void CappingOn_50();
  public void CappingOn()
  {
    CappingOn_50();
  }

  private native void CappingOff_51();
  public void CappingOff()
  {
    CappingOff_51();
  }

  private native void SetCapValue_52(double id0);
  public void SetCapValue(double id0)
  {
    SetCapValue_52(id0);
  }

  private native double GetCapValue_53();
  public double GetCapValue()
  {
    return GetCapValue_53();
  }

  private native void SetNullValue_54(double id0);
  public void SetNullValue(double id0)
  {
    SetNullValue_54(id0);
  }

  private native double GetNullValue_55();
  public double GetNullValue()
  {
    return GetNullValue_55();
  }

  private native void SetMaximumDimension_56(int id0);
  public void SetMaximumDimension(int id0)
  {
    SetMaximumDimension_56(id0);
  }

  private native int GetMaximumDimensionMinValue_57();
  public int GetMaximumDimensionMinValue()
  {
    return GetMaximumDimensionMinValue_57();
  }

  private native int GetMaximumDimensionMaxValue_58();
  public int GetMaximumDimensionMaxValue()
  {
    return GetMaximumDimensionMaxValue_58();
  }

  private native int GetMaximumDimension_59();
  public int GetMaximumDimension()
  {
    return GetMaximumDimension_59();
  }

  private native void SetParallelSplatCrossover_60(int id0);
  public void SetParallelSplatCrossover(int id0)
  {
    SetParallelSplatCrossover_60(id0);
  }

  private native int GetParallelSplatCrossoverMinValue_61();
  public int GetParallelSplatCrossoverMinValue()
  {
    return GetParallelSplatCrossoverMinValue_61();
  }

  private native int GetParallelSplatCrossoverMaxValue_62();
  public int GetParallelSplatCrossoverMaxValue()
  {
    return GetParallelSplatCrossoverMaxValue_62();
  }

  private native int GetParallelSplatCrossover_63();
  public int GetParallelSplatCrossover()
  {
    return GetParallelSplatCrossover_63();
  }

  private native void ComputeModelBounds_64(vtkDataSet id0,vtkImageData id1,vtkInformation id2);
  public void ComputeModelBounds(vtkDataSet id0,vtkImageData id1,vtkInformation id2)
  {
    ComputeModelBounds_64(id0,id1,id2);
  }

  public vtkCheckerboardSplatter() { super(); }

  public vtkCheckerboardSplatter(long id) { super(id); }
  public native long   VTKInit();

}
