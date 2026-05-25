// java wrapper for vtkImplicitModeller object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitModeller extends vtkImageAlgorithm
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

  private native double ComputeModelBounds_4(vtkDataSet id0);
  public double ComputeModelBounds(vtkDataSet id0)
  {
    return ComputeModelBounds_4(id0);
  }

  private native int[] GetSampleDimensions_5();
  public int[] GetSampleDimensions()
  {
    return GetSampleDimensions_5();
  }

  private native void SetSampleDimensions_6(int id0,int id1,int id2);
  public void SetSampleDimensions(int id0,int id1,int id2)
  {
    SetSampleDimensions_6(id0,id1,id2);
  }

  private native void SetSampleDimensions_7(int id0[]);
  public void SetSampleDimensions(int id0[])
  {
    SetSampleDimensions_7(id0);
  }

  private native void SetMaximumDistance_8(double id0);
  public void SetMaximumDistance(double id0)
  {
    SetMaximumDistance_8(id0);
  }

  private native double GetMaximumDistanceMinValue_9();
  public double GetMaximumDistanceMinValue()
  {
    return GetMaximumDistanceMinValue_9();
  }

  private native double GetMaximumDistanceMaxValue_10();
  public double GetMaximumDistanceMaxValue()
  {
    return GetMaximumDistanceMaxValue_10();
  }

  private native double GetMaximumDistance_11();
  public double GetMaximumDistance()
  {
    return GetMaximumDistance_11();
  }

  private native void SetModelBounds_12(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetModelBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetModelBounds_12(id0,id1,id2,id3,id4,id5);
  }

  private native void SetModelBounds_13(double id0[]);
  public void SetModelBounds(double id0[])
  {
    SetModelBounds_13(id0);
  }

  private native double[] GetModelBounds_14();
  public double[] GetModelBounds()
  {
    return GetModelBounds_14();
  }

  private native void SetAdjustBounds_15(int id0);
  public void SetAdjustBounds(int id0)
  {
    SetAdjustBounds_15(id0);
  }

  private native int GetAdjustBounds_16();
  public int GetAdjustBounds()
  {
    return GetAdjustBounds_16();
  }

  private native void AdjustBoundsOn_17();
  public void AdjustBoundsOn()
  {
    AdjustBoundsOn_17();
  }

  private native void AdjustBoundsOff_18();
  public void AdjustBoundsOff()
  {
    AdjustBoundsOff_18();
  }

  private native void SetAdjustDistance_19(double id0);
  public void SetAdjustDistance(double id0)
  {
    SetAdjustDistance_19(id0);
  }

  private native double GetAdjustDistanceMinValue_20();
  public double GetAdjustDistanceMinValue()
  {
    return GetAdjustDistanceMinValue_20();
  }

  private native double GetAdjustDistanceMaxValue_21();
  public double GetAdjustDistanceMaxValue()
  {
    return GetAdjustDistanceMaxValue_21();
  }

  private native double GetAdjustDistance_22();
  public double GetAdjustDistance()
  {
    return GetAdjustDistance_22();
  }

  private native void SetCapping_23(int id0);
  public void SetCapping(int id0)
  {
    SetCapping_23(id0);
  }

  private native int GetCapping_24();
  public int GetCapping()
  {
    return GetCapping_24();
  }

  private native void CappingOn_25();
  public void CappingOn()
  {
    CappingOn_25();
  }

  private native void CappingOff_26();
  public void CappingOff()
  {
    CappingOff_26();
  }

  private native void SetCapValue_27(double id0);
  public void SetCapValue(double id0)
  {
    SetCapValue_27(id0);
  }

  private native double GetCapValue_28();
  public double GetCapValue()
  {
    return GetCapValue_28();
  }

  private native void SetScaleToMaximumDistance_29(int id0);
  public void SetScaleToMaximumDistance(int id0)
  {
    SetScaleToMaximumDistance_29(id0);
  }

  private native int GetScaleToMaximumDistance_30();
  public int GetScaleToMaximumDistance()
  {
    return GetScaleToMaximumDistance_30();
  }

  private native void ScaleToMaximumDistanceOn_31();
  public void ScaleToMaximumDistanceOn()
  {
    ScaleToMaximumDistanceOn_31();
  }

  private native void ScaleToMaximumDistanceOff_32();
  public void ScaleToMaximumDistanceOff()
  {
    ScaleToMaximumDistanceOff_32();
  }

  private native void SetProcessMode_33(int id0);
  public void SetProcessMode(int id0)
  {
    SetProcessMode_33(id0);
  }

  private native int GetProcessModeMinValue_34();
  public int GetProcessModeMinValue()
  {
    return GetProcessModeMinValue_34();
  }

  private native int GetProcessModeMaxValue_35();
  public int GetProcessModeMaxValue()
  {
    return GetProcessModeMaxValue_35();
  }

  private native int GetProcessMode_36();
  public int GetProcessMode()
  {
    return GetProcessMode_36();
  }

  private native void SetProcessModeToPerVoxel_37();
  public void SetProcessModeToPerVoxel()
  {
    SetProcessModeToPerVoxel_37();
  }

  private native void SetProcessModeToPerCell_38();
  public void SetProcessModeToPerCell()
  {
    SetProcessModeToPerCell_38();
  }

  private native byte[] GetProcessModeAsString_39();
  public String GetProcessModeAsString()
  {
    return new String(GetProcessModeAsString_39(), StandardCharsets.UTF_8);
  }

  private native void SetLocatorMaxLevel_40(int id0);
  public void SetLocatorMaxLevel(int id0)
  {
    SetLocatorMaxLevel_40(id0);
  }

  private native int GetLocatorMaxLevel_41();
  public int GetLocatorMaxLevel()
  {
    return GetLocatorMaxLevel_41();
  }

  private native void SetNumberOfThreads_42(int id0);
  public void SetNumberOfThreads(int id0)
  {
    SetNumberOfThreads_42(id0);
  }

  private native int GetNumberOfThreadsMinValue_43();
  public int GetNumberOfThreadsMinValue()
  {
    return GetNumberOfThreadsMinValue_43();
  }

  private native int GetNumberOfThreadsMaxValue_44();
  public int GetNumberOfThreadsMaxValue()
  {
    return GetNumberOfThreadsMaxValue_44();
  }

  private native int GetNumberOfThreads_45();
  public int GetNumberOfThreads()
  {
    return GetNumberOfThreads_45();
  }

  private native void SetOutputScalarType_46(int id0);
  public void SetOutputScalarType(int id0)
  {
    SetOutputScalarType_46(id0);
  }

  private native int GetOutputScalarType_47();
  public int GetOutputScalarType()
  {
    return GetOutputScalarType_47();
  }

  private native void SetOutputScalarTypeToFloat_48();
  public void SetOutputScalarTypeToFloat()
  {
    SetOutputScalarTypeToFloat_48();
  }

  private native void SetOutputScalarTypeToDouble_49();
  public void SetOutputScalarTypeToDouble()
  {
    SetOutputScalarTypeToDouble_49();
  }

  private native void SetOutputScalarTypeToInt_50();
  public void SetOutputScalarTypeToInt()
  {
    SetOutputScalarTypeToInt_50();
  }

  private native void SetOutputScalarTypeToUnsignedInt_51();
  public void SetOutputScalarTypeToUnsignedInt()
  {
    SetOutputScalarTypeToUnsignedInt_51();
  }

  private native void SetOutputScalarTypeToLong_52();
  public void SetOutputScalarTypeToLong()
  {
    SetOutputScalarTypeToLong_52();
  }

  private native void SetOutputScalarTypeToUnsignedLong_53();
  public void SetOutputScalarTypeToUnsignedLong()
  {
    SetOutputScalarTypeToUnsignedLong_53();
  }

  private native void SetOutputScalarTypeToShort_54();
  public void SetOutputScalarTypeToShort()
  {
    SetOutputScalarTypeToShort_54();
  }

  private native void SetOutputScalarTypeToUnsignedShort_55();
  public void SetOutputScalarTypeToUnsignedShort()
  {
    SetOutputScalarTypeToUnsignedShort_55();
  }

  private native void SetOutputScalarTypeToUnsignedChar_56();
  public void SetOutputScalarTypeToUnsignedChar()
  {
    SetOutputScalarTypeToUnsignedChar_56();
  }

  private native void SetOutputScalarTypeToChar_57();
  public void SetOutputScalarTypeToChar()
  {
    SetOutputScalarTypeToChar_57();
  }

  private native void StartAppend_58();
  public void StartAppend()
  {
    StartAppend_58();
  }

  private native void Append_59(vtkDataSet id0);
  public void Append(vtkDataSet id0)
  {
    Append_59(id0);
  }

  private native void EndAppend_60();
  public void EndAppend()
  {
    EndAppend_60();
  }

  public vtkImplicitModeller() { super(); }

  public vtkImplicitModeller(long id) { super(id); }
  public native long   VTKInit();

}
