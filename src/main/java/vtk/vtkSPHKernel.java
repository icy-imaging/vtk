// java wrapper for vtkSPHKernel object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSPHKernel extends vtkInterpolationKernel
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

  private native void SetSpatialStep_4(double id0);
  public void SetSpatialStep(double id0)
  {
    SetSpatialStep_4(id0);
  }

  private native double GetSpatialStepMinValue_5();
  public double GetSpatialStepMinValue()
  {
    return GetSpatialStepMinValue_5();
  }

  private native double GetSpatialStepMaxValue_6();
  public double GetSpatialStepMaxValue()
  {
    return GetSpatialStepMaxValue_6();
  }

  private native double GetSpatialStep_7();
  public double GetSpatialStep()
  {
    return GetSpatialStep_7();
  }

  private native void SetDimension_8(int id0);
  public void SetDimension(int id0)
  {
    SetDimension_8(id0);
  }

  private native int GetDimensionMinValue_9();
  public int GetDimensionMinValue()
  {
    return GetDimensionMinValue_9();
  }

  private native int GetDimensionMaxValue_10();
  public int GetDimensionMaxValue()
  {
    return GetDimensionMaxValue_10();
  }

  private native int GetDimension_11();
  public int GetDimension()
  {
    return GetDimension_11();
  }

  private native double GetCutoffFactor_12();
  public double GetCutoffFactor()
  {
    return GetCutoffFactor_12();
  }

  private native void SetCutoffArray_13(vtkDataArray id0);
  public void SetCutoffArray(vtkDataArray id0)
  {
    SetCutoffArray_13(id0);
  }

  private native long GetCutoffArray_14();
  public vtkDataArray GetCutoffArray()
  {
    long temp = GetCutoffArray_14();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDensityArray_15(vtkDataArray id0);
  public void SetDensityArray(vtkDataArray id0)
  {
    SetDensityArray_15(id0);
  }

  private native long GetDensityArray_16();
  public vtkDataArray GetDensityArray()
  {
    long temp = GetDensityArray_16();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMassArray_17(vtkDataArray id0);
  public void SetMassArray(vtkDataArray id0)
  {
    SetMassArray_17(id0);
  }

  private native long GetMassArray_18();
  public vtkDataArray GetMassArray()
  {
    long temp = GetMassArray_18();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Initialize_19(vtkAbstractPointLocator id0,vtkDataSet id1,vtkPointData id2);
  public void Initialize(vtkAbstractPointLocator id0,vtkDataSet id1,vtkPointData id2)
  {
    Initialize_19(id0,id1,id2);
  }

  private native long ComputeBasis_20(double id0[],vtkIdList id1,long id2);
  public long ComputeBasis(double id0[],vtkIdList id1,long id2)
  {
    return ComputeBasis_20(id0,id1,id2);
  }

  private native long ComputeWeights_21(double id0[],vtkIdList id1,vtkDoubleArray id2);
  public long ComputeWeights(double id0[],vtkIdList id1,vtkDoubleArray id2)
  {
    return ComputeWeights_21(id0,id1,id2);
  }

  private native long ComputeDerivWeights_22(double id0[],vtkIdList id1,vtkDoubleArray id2,vtkDoubleArray id3);
  public long ComputeDerivWeights(double id0[],vtkIdList id1,vtkDoubleArray id2,vtkDoubleArray id3)
  {
    return ComputeDerivWeights_22(id0,id1,id2,id3);
  }

  private native double ComputeFunctionWeight_23(double id0);
  public double ComputeFunctionWeight(double id0)
  {
    return ComputeFunctionWeight_23(id0);
  }

  private native double ComputeDerivWeight_24(double id0);
  public double ComputeDerivWeight(double id0)
  {
    return ComputeDerivWeight_24(id0);
  }

  private native double GetNormFactor_25();
  public double GetNormFactor()
  {
    return GetNormFactor_25();
  }

  public vtkSPHKernel() { super(); }

  public vtkSPHKernel(long id) { super(id); }

}
