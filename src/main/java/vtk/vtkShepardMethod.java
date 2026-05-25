// java wrapper for vtkShepardMethod object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkShepardMethod extends vtkImageAlgorithm
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

  private native void SetMaximumDistance_7(double id0);
  public void SetMaximumDistance(double id0)
  {
    SetMaximumDistance_7(id0);
  }

  private native double GetMaximumDistanceMinValue_8();
  public double GetMaximumDistanceMinValue()
  {
    return GetMaximumDistanceMinValue_8();
  }

  private native double GetMaximumDistanceMaxValue_9();
  public double GetMaximumDistanceMaxValue()
  {
    return GetMaximumDistanceMaxValue_9();
  }

  private native double GetMaximumDistance_10();
  public double GetMaximumDistance()
  {
    return GetMaximumDistance_10();
  }

  private native void SetNullValue_11(double id0);
  public void SetNullValue(double id0)
  {
    SetNullValue_11(id0);
  }

  private native double GetNullValue_12();
  public double GetNullValue()
  {
    return GetNullValue_12();
  }

  private native void SetModelBounds_13(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetModelBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetModelBounds_13(id0,id1,id2,id3,id4,id5);
  }

  private native void SetModelBounds_14(double id0[]);
  public void SetModelBounds(double id0[])
  {
    SetModelBounds_14(id0);
  }

  private native double[] GetModelBounds_15();
  public double[] GetModelBounds()
  {
    return GetModelBounds_15();
  }

  private native void SetPowerParameter_16(double id0);
  public void SetPowerParameter(double id0)
  {
    SetPowerParameter_16(id0);
  }

  private native double GetPowerParameterMinValue_17();
  public double GetPowerParameterMinValue()
  {
    return GetPowerParameterMinValue_17();
  }

  private native double GetPowerParameterMaxValue_18();
  public double GetPowerParameterMaxValue()
  {
    return GetPowerParameterMaxValue_18();
  }

  private native double GetPowerParameter_19();
  public double GetPowerParameter()
  {
    return GetPowerParameter_19();
  }

  private native double ComputeModelBounds_20(double id0[],double id1[]);
  public double ComputeModelBounds(double id0[],double id1[])
  {
    return ComputeModelBounds_20(id0,id1);
  }

  public vtkShepardMethod() { super(); }

  public vtkShepardMethod(long id) { super(id); }
  public native long   VTKInit();

}
