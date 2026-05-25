// java wrapper for vtkPointLoad object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointLoad extends vtkImageAlgorithm
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

  private native void SetLoadValue_4(double id0);
  public void SetLoadValue(double id0)
  {
    SetLoadValue_4(id0);
  }

  private native double GetLoadValue_5();
  public double GetLoadValue()
  {
    return GetLoadValue_5();
  }

  private native void SetSampleDimensions_6(int id0[]);
  public void SetSampleDimensions(int id0[])
  {
    SetSampleDimensions_6(id0);
  }

  private native void SetSampleDimensions_7(int id0,int id1,int id2);
  public void SetSampleDimensions(int id0,int id1,int id2)
  {
    SetSampleDimensions_7(id0,id1,id2);
  }

  private native int[] GetSampleDimensions_8();
  public int[] GetSampleDimensions()
  {
    return GetSampleDimensions_8();
  }

  private native void SetModelBounds_9(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetModelBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetModelBounds_9(id0,id1,id2,id3,id4,id5);
  }

  private native void SetModelBounds_10(double id0[]);
  public void SetModelBounds(double id0[])
  {
    SetModelBounds_10(id0);
  }

  private native double[] GetModelBounds_11();
  public double[] GetModelBounds()
  {
    return GetModelBounds_11();
  }

  private native void SetPoissonsRatio_12(double id0);
  public void SetPoissonsRatio(double id0)
  {
    SetPoissonsRatio_12(id0);
  }

  private native double GetPoissonsRatio_13();
  public double GetPoissonsRatio()
  {
    return GetPoissonsRatio_13();
  }

  private native void SetComputeEffectiveStress_14(int id0);
  public void SetComputeEffectiveStress(int id0)
  {
    SetComputeEffectiveStress_14(id0);
  }

  private native int GetComputeEffectiveStress_15();
  public int GetComputeEffectiveStress()
  {
    return GetComputeEffectiveStress_15();
  }

  private native void ComputeEffectiveStressOn_16();
  public void ComputeEffectiveStressOn()
  {
    ComputeEffectiveStressOn_16();
  }

  private native void ComputeEffectiveStressOff_17();
  public void ComputeEffectiveStressOff()
  {
    ComputeEffectiveStressOff_17();
  }

  public vtkPointLoad() { super(); }

  public vtkPointLoad(long id) { super(id); }
  public native long   VTKInit();

}
