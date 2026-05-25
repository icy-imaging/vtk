// java wrapper for vtkAttributeSmoothingFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAttributeSmoothingFilter extends vtkDataSetAlgorithm
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

  private native void SetNumberOfIterations_4(int id0);
  public void SetNumberOfIterations(int id0)
  {
    SetNumberOfIterations_4(id0);
  }

  private native int GetNumberOfIterationsMinValue_5();
  public int GetNumberOfIterationsMinValue()
  {
    return GetNumberOfIterationsMinValue_5();
  }

  private native int GetNumberOfIterationsMaxValue_6();
  public int GetNumberOfIterationsMaxValue()
  {
    return GetNumberOfIterationsMaxValue_6();
  }

  private native int GetNumberOfIterations_7();
  public int GetNumberOfIterations()
  {
    return GetNumberOfIterations_7();
  }

  private native void SetRelaxationFactor_8(double id0);
  public void SetRelaxationFactor(double id0)
  {
    SetRelaxationFactor_8(id0);
  }

  private native double GetRelaxationFactorMinValue_9();
  public double GetRelaxationFactorMinValue()
  {
    return GetRelaxationFactorMinValue_9();
  }

  private native double GetRelaxationFactorMaxValue_10();
  public double GetRelaxationFactorMaxValue()
  {
    return GetRelaxationFactorMaxValue_10();
  }

  private native double GetRelaxationFactor_11();
  public double GetRelaxationFactor()
  {
    return GetRelaxationFactor_11();
  }

  private native void SetSmoothingStrategy_12(int id0);
  public void SetSmoothingStrategy(int id0)
  {
    SetSmoothingStrategy_12(id0);
  }

  private native int GetSmoothingStrategyMinValue_13();
  public int GetSmoothingStrategyMinValue()
  {
    return GetSmoothingStrategyMinValue_13();
  }

  private native int GetSmoothingStrategyMaxValue_14();
  public int GetSmoothingStrategyMaxValue()
  {
    return GetSmoothingStrategyMaxValue_14();
  }

  private native int GetSmoothingStrategy_15();
  public int GetSmoothingStrategy()
  {
    return GetSmoothingStrategy_15();
  }

  private native void SetSmoothingStrategyToAllPoints_16();
  public void SetSmoothingStrategyToAllPoints()
  {
    SetSmoothingStrategyToAllPoints_16();
  }

  private native void SetSmoothingStrategyToAllButBoundary_17();
  public void SetSmoothingStrategyToAllButBoundary()
  {
    SetSmoothingStrategyToAllButBoundary_17();
  }

  private native void SetSmoothingStrategyToAdjacentToBoundary_18();
  public void SetSmoothingStrategyToAdjacentToBoundary()
  {
    SetSmoothingStrategyToAdjacentToBoundary_18();
  }

  private native void SetSmoothingStrategyToSmoothingMask_19();
  public void SetSmoothingStrategyToSmoothingMask()
  {
    SetSmoothingStrategyToSmoothingMask_19();
  }

  private native void SetSmoothingMask_20(vtkUnsignedCharArray id0);
  public void SetSmoothingMask(vtkUnsignedCharArray id0)
  {
    SetSmoothingMask_20(id0);
  }

  private native long GetSmoothingMask_21();
  public vtkUnsignedCharArray GetSmoothingMask()
  {
    long temp = GetSmoothingMask_21();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetWeightsType_22(int id0);
  public void SetWeightsType(int id0)
  {
    SetWeightsType_22(id0);
  }

  private native int GetWeightsTypeMinValue_23();
  public int GetWeightsTypeMinValue()
  {
    return GetWeightsTypeMinValue_23();
  }

  private native int GetWeightsTypeMaxValue_24();
  public int GetWeightsTypeMaxValue()
  {
    return GetWeightsTypeMaxValue_24();
  }

  private native int GetWeightsType_25();
  public int GetWeightsType()
  {
    return GetWeightsType_25();
  }

  private native void SetWeightsTypeToAverage_26();
  public void SetWeightsTypeToAverage()
  {
    SetWeightsTypeToAverage_26();
  }

  private native void SetWeightsTypeToDistance_27();
  public void SetWeightsTypeToDistance()
  {
    SetWeightsTypeToDistance_27();
  }

  private native void SetWeightsTypeToDistance2_28();
  public void SetWeightsTypeToDistance2()
  {
    SetWeightsTypeToDistance2_28();
  }

  private native void AddExcludedArray_29(byte[] id0, int len0);
  public void AddExcludedArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddExcludedArray_29(bytes0, bytes0.length);
  }

  private native void ClearExcludedArrays_30();
  public void ClearExcludedArrays()
  {
    ClearExcludedArrays_30();
  }

  private native int GetNumberOfExcludedArrays_31();
  public int GetNumberOfExcludedArrays()
  {
    return GetNumberOfExcludedArrays_31();
  }

  private native byte[] GetExcludedArray_32(int id0);
  public String GetExcludedArray(int id0)
  {
    return new String(GetExcludedArray_32(id0), StandardCharsets.UTF_8);
  }

  public vtkAttributeSmoothingFilter() { super(); }

  public vtkAttributeSmoothingFilter(long id) { super(id); }
  public native long   VTKInit();

}
