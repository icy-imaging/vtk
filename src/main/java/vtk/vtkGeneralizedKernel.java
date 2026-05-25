// java wrapper for vtkGeneralizedKernel object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGeneralizedKernel extends vtkInterpolationKernel
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

  private native long ComputeBasis_4(double id0[],vtkIdList id1,long id2);
  public long ComputeBasis(double id0[],vtkIdList id1,long id2)
  {
    return ComputeBasis_4(id0,id1,id2);
  }

  private native long ComputeWeights_5(double id0[],vtkIdList id1,vtkDoubleArray id2,vtkDoubleArray id3);
  public long ComputeWeights(double id0[],vtkIdList id1,vtkDoubleArray id2,vtkDoubleArray id3)
  {
    return ComputeWeights_5(id0,id1,id2,id3);
  }

  private native long ComputeWeights_6(double id0[],vtkIdList id1,vtkDoubleArray id2);
  public long ComputeWeights(double id0[],vtkIdList id1,vtkDoubleArray id2)
  {
    return ComputeWeights_6(id0,id1,id2);
  }

  private native void SetKernelFootprint_7(int id0);
  public void SetKernelFootprint(int id0)
  {
    SetKernelFootprint_7(id0);
  }

  private native int GetKernelFootprint_8();
  public int GetKernelFootprint()
  {
    return GetKernelFootprint_8();
  }

  private native void SetKernelFootprintToRadius_9();
  public void SetKernelFootprintToRadius()
  {
    SetKernelFootprintToRadius_9();
  }

  private native void SetKernelFootprintToNClosest_10();
  public void SetKernelFootprintToNClosest()
  {
    SetKernelFootprintToNClosest_10();
  }

  private native void SetRadius_11(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_11(id0);
  }

  private native double GetRadiusMinValue_12();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_12();
  }

  private native double GetRadiusMaxValue_13();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_13();
  }

  private native double GetRadius_14();
  public double GetRadius()
  {
    return GetRadius_14();
  }

  private native void SetNumberOfPoints_15(int id0);
  public void SetNumberOfPoints(int id0)
  {
    SetNumberOfPoints_15(id0);
  }

  private native int GetNumberOfPointsMinValue_16();
  public int GetNumberOfPointsMinValue()
  {
    return GetNumberOfPointsMinValue_16();
  }

  private native int GetNumberOfPointsMaxValue_17();
  public int GetNumberOfPointsMaxValue()
  {
    return GetNumberOfPointsMaxValue_17();
  }

  private native int GetNumberOfPoints_18();
  public int GetNumberOfPoints()
  {
    return GetNumberOfPoints_18();
  }

  private native void SetNormalizeWeights_19(boolean id0);
  public void SetNormalizeWeights(boolean id0)
  {
    SetNormalizeWeights_19(id0);
  }

  private native boolean GetNormalizeWeights_20();
  public boolean GetNormalizeWeights()
  {
    return GetNormalizeWeights_20();
  }

  private native void NormalizeWeightsOn_21();
  public void NormalizeWeightsOn()
  {
    NormalizeWeightsOn_21();
  }

  private native void NormalizeWeightsOff_22();
  public void NormalizeWeightsOff()
  {
    NormalizeWeightsOff_22();
  }

  public vtkGeneralizedKernel() { super(); }

  public vtkGeneralizedKernel(long id) { super(id); }

}
