// java wrapper for vtkImageGaussianSmooth object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageGaussianSmooth extends vtkThreadedImageAlgorithm
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

  private native void SetStandardDeviations_4(double id0,double id1,double id2);
  public void SetStandardDeviations(double id0,double id1,double id2)
  {
    SetStandardDeviations_4(id0,id1,id2);
  }

  private native void SetStandardDeviations_5(double id0[]);
  public void SetStandardDeviations(double id0[])
  {
    SetStandardDeviations_5(id0);
  }

  private native void SetStandardDeviation_6(double id0);
  public void SetStandardDeviation(double id0)
  {
    SetStandardDeviation_6(id0);
  }

  private native void SetStandardDeviations_7(double id0,double id1);
  public void SetStandardDeviations(double id0,double id1)
  {
    SetStandardDeviations_7(id0,id1);
  }

  private native double[] GetStandardDeviations_8();
  public double[] GetStandardDeviations()
  {
    return GetStandardDeviations_8();
  }

  private native void SetStandardDeviation_9(double id0,double id1);
  public void SetStandardDeviation(double id0,double id1)
  {
    SetStandardDeviation_9(id0,id1);
  }

  private native void SetStandardDeviation_10(double id0,double id1,double id2);
  public void SetStandardDeviation(double id0,double id1,double id2)
  {
    SetStandardDeviation_10(id0,id1,id2);
  }

  private native void SetRadiusFactors_11(double id0,double id1,double id2);
  public void SetRadiusFactors(double id0,double id1,double id2)
  {
    SetRadiusFactors_11(id0,id1,id2);
  }

  private native void SetRadiusFactors_12(double id0[]);
  public void SetRadiusFactors(double id0[])
  {
    SetRadiusFactors_12(id0);
  }

  private native void SetRadiusFactors_13(double id0,double id1);
  public void SetRadiusFactors(double id0,double id1)
  {
    SetRadiusFactors_13(id0,id1);
  }

  private native void SetRadiusFactor_14(double id0);
  public void SetRadiusFactor(double id0)
  {
    SetRadiusFactor_14(id0);
  }

  private native double[] GetRadiusFactors_15();
  public double[] GetRadiusFactors()
  {
    return GetRadiusFactors_15();
  }

  private native void SetDimensionality_16(int id0);
  public void SetDimensionality(int id0)
  {
    SetDimensionality_16(id0);
  }

  private native int GetDimensionality_17();
  public int GetDimensionality()
  {
    return GetDimensionality_17();
  }

  public vtkImageGaussianSmooth() { super(); }

  public vtkImageGaussianSmooth(long id) { super(id); }
  public native long   VTKInit();

}
