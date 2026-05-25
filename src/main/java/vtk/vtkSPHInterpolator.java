// java wrapper for vtkSPHInterpolator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSPHInterpolator extends vtkDataSetAlgorithm
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

  private native void SetSourceData_4(vtkDataObject id0);
  public void SetSourceData(vtkDataObject id0)
  {
    SetSourceData_4(id0);
  }

  private native long GetSource_5();
  public vtkDataObject GetSource()
  {
    long temp = GetSource_5();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSourceConnection_6(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_6(id0);
  }

  private native void SetLocator_7(vtkAbstractPointLocator id0);
  public void SetLocator(vtkAbstractPointLocator id0)
  {
    SetLocator_7(id0);
  }

  private native long GetLocator_8();
  public vtkAbstractPointLocator GetLocator()
  {
    long temp = GetLocator_8();

    if (temp == 0) return null;
    return (vtkAbstractPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetKernel_9(vtkSPHKernel id0);
  public void SetKernel(vtkSPHKernel id0)
  {
    SetKernel_9(id0);
  }

  private native long GetKernel_10();
  public vtkSPHKernel GetKernel()
  {
    long temp = GetKernel_10();

    if (temp == 0) return null;
    return (vtkSPHKernel)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCutoffArrayName_11(byte[] id0, int len0);
  public void SetCutoffArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCutoffArrayName_11(bytes0, bytes0.length);
  }

  private native byte[] GetCutoffArrayName_12();
  public String GetCutoffArrayName()
  {
    return new String(GetCutoffArrayName_12(), StandardCharsets.UTF_8);
  }

  private native void SetDensityArrayName_13(byte[] id0, int len0);
  public void SetDensityArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDensityArrayName_13(bytes0, bytes0.length);
  }

  private native byte[] GetDensityArrayName_14();
  public String GetDensityArrayName()
  {
    return new String(GetDensityArrayName_14(), StandardCharsets.UTF_8);
  }

  private native void SetMassArrayName_15(byte[] id0, int len0);
  public void SetMassArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMassArrayName_15(bytes0, bytes0.length);
  }

  private native byte[] GetMassArrayName_16();
  public String GetMassArrayName()
  {
    return new String(GetMassArrayName_16(), StandardCharsets.UTF_8);
  }

  private native void AddExcludedArray_17(byte[] id0, int len0);
  public void AddExcludedArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddExcludedArray_17(bytes0, bytes0.length);
  }

  private native void ClearExcludedArrays_18();
  public void ClearExcludedArrays()
  {
    ClearExcludedArrays_18();
  }

  private native int GetNumberOfExcludedArrays_19();
  public int GetNumberOfExcludedArrays()
  {
    return GetNumberOfExcludedArrays_19();
  }

  private native byte[] GetExcludedArray_20(int id0);
  public String GetExcludedArray(int id0)
  {
    return new String(GetExcludedArray_20(id0), StandardCharsets.UTF_8);
  }

  private native void AddDerivativeArray_21(byte[] id0, int len0);
  public void AddDerivativeArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddDerivativeArray_21(bytes0, bytes0.length);
  }

  private native void ClearDerivativeArrays_22();
  public void ClearDerivativeArrays()
  {
    ClearDerivativeArrays_22();
  }

  private native int GetNumberOfDerivativeArrays_23();
  public int GetNumberOfDerivativeArrays()
  {
    return GetNumberOfDerivativeArrays_23();
  }

  private native byte[] GetDerivativeArray_24(int id0);
  public String GetDerivativeArray(int id0)
  {
    return new String(GetDerivativeArray_24(id0), StandardCharsets.UTF_8);
  }

  private native void SetNullPointsStrategy_25(int id0);
  public void SetNullPointsStrategy(int id0)
  {
    SetNullPointsStrategy_25(id0);
  }

  private native int GetNullPointsStrategy_26();
  public int GetNullPointsStrategy()
  {
    return GetNullPointsStrategy_26();
  }

  private native void SetNullPointsStrategyToMaskPoints_27();
  public void SetNullPointsStrategyToMaskPoints()
  {
    SetNullPointsStrategyToMaskPoints_27();
  }

  private native void SetNullPointsStrategyToNullValue_28();
  public void SetNullPointsStrategyToNullValue()
  {
    SetNullPointsStrategyToNullValue_28();
  }

  private native void SetValidPointsMaskArrayName_29(byte[] id0, int len0);
  public void SetValidPointsMaskArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetValidPointsMaskArrayName_29(bytes0, bytes0.length);
  }

  private native byte[] GetValidPointsMaskArrayName_30();
  public String GetValidPointsMaskArrayName()
  {
    return new String(GetValidPointsMaskArrayName_30(), StandardCharsets.UTF_8);
  }

  private native void SetNullValue_31(double id0);
  public void SetNullValue(double id0)
  {
    SetNullValue_31(id0);
  }

  private native double GetNullValue_32();
  public double GetNullValue()
  {
    return GetNullValue_32();
  }

  private native void SetComputeShepardSum_33(int id0);
  public void SetComputeShepardSum(int id0)
  {
    SetComputeShepardSum_33(id0);
  }

  private native void ComputeShepardSumOn_34();
  public void ComputeShepardSumOn()
  {
    ComputeShepardSumOn_34();
  }

  private native void ComputeShepardSumOff_35();
  public void ComputeShepardSumOff()
  {
    ComputeShepardSumOff_35();
  }

  private native int GetComputeShepardSum_36();
  public int GetComputeShepardSum()
  {
    return GetComputeShepardSum_36();
  }

  private native void SetShepardSumArrayName_37(byte[] id0, int len0);
  public void SetShepardSumArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetShepardSumArrayName_37(bytes0, bytes0.length);
  }

  private native byte[] GetShepardSumArrayName_38();
  public String GetShepardSumArrayName()
  {
    return new String(GetShepardSumArrayName_38(), StandardCharsets.UTF_8);
  }

  private native void SetPromoteOutputArrays_39(int id0);
  public void SetPromoteOutputArrays(int id0)
  {
    SetPromoteOutputArrays_39(id0);
  }

  private native void PromoteOutputArraysOn_40();
  public void PromoteOutputArraysOn()
  {
    PromoteOutputArraysOn_40();
  }

  private native void PromoteOutputArraysOff_41();
  public void PromoteOutputArraysOff()
  {
    PromoteOutputArraysOff_41();
  }

  private native int GetPromoteOutputArrays_42();
  public int GetPromoteOutputArrays()
  {
    return GetPromoteOutputArrays_42();
  }

  private native void SetPassPointArrays_43(int id0);
  public void SetPassPointArrays(int id0)
  {
    SetPassPointArrays_43(id0);
  }

  private native void PassPointArraysOn_44();
  public void PassPointArraysOn()
  {
    PassPointArraysOn_44();
  }

  private native void PassPointArraysOff_45();
  public void PassPointArraysOff()
  {
    PassPointArraysOff_45();
  }

  private native int GetPassPointArrays_46();
  public int GetPassPointArrays()
  {
    return GetPassPointArrays_46();
  }

  private native void SetPassCellArrays_47(int id0);
  public void SetPassCellArrays(int id0)
  {
    SetPassCellArrays_47(id0);
  }

  private native void PassCellArraysOn_48();
  public void PassCellArraysOn()
  {
    PassCellArraysOn_48();
  }

  private native void PassCellArraysOff_49();
  public void PassCellArraysOff()
  {
    PassCellArraysOff_49();
  }

  private native int GetPassCellArrays_50();
  public int GetPassCellArrays()
  {
    return GetPassCellArrays_50();
  }

  private native void SetPassFieldArrays_51(int id0);
  public void SetPassFieldArrays(int id0)
  {
    SetPassFieldArrays_51(id0);
  }

  private native void PassFieldArraysOn_52();
  public void PassFieldArraysOn()
  {
    PassFieldArraysOn_52();
  }

  private native void PassFieldArraysOff_53();
  public void PassFieldArraysOff()
  {
    PassFieldArraysOff_53();
  }

  private native int GetPassFieldArrays_54();
  public int GetPassFieldArrays()
  {
    return GetPassFieldArrays_54();
  }

  private native void SetShepardNormalization_55(int id0);
  public void SetShepardNormalization(int id0)
  {
    SetShepardNormalization_55(id0);
  }

  private native void ShepardNormalizationOn_56();
  public void ShepardNormalizationOn()
  {
    ShepardNormalizationOn_56();
  }

  private native void ShepardNormalizationOff_57();
  public void ShepardNormalizationOff()
  {
    ShepardNormalizationOff_57();
  }

  private native int GetShepardNormalization_58();
  public int GetShepardNormalization()
  {
    return GetShepardNormalization_58();
  }

  private native long GetMTime_59();
  public long GetMTime()
  {
    return GetMTime_59();
  }

  public vtkSPHInterpolator() { super(); }

  public vtkSPHInterpolator(long id) { super(id); }
  public native long   VTKInit();

}
