// java wrapper for vtkPerlinNoise object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPerlinNoise extends vtkImplicitFunction
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

  private native double EvaluateFunction_4(double id0[]);
  public double EvaluateFunction(double id0[])
  {
    return EvaluateFunction_4(id0);
  }

  private native void EvaluateGradient_5(double id0[],double id1[]);
  public void EvaluateGradient(double id0[],double id1[])
  {
    EvaluateGradient_5(id0,id1);
  }

  private native void SetFrequency_6(double id0,double id1,double id2);
  public void SetFrequency(double id0,double id1,double id2)
  {
    SetFrequency_6(id0,id1,id2);
  }

  private native void SetFrequency_7(double id0[]);
  public void SetFrequency(double id0[])
  {
    SetFrequency_7(id0);
  }

  private native double[] GetFrequency_8();
  public double[] GetFrequency()
  {
    return GetFrequency_8();
  }

  private native void SetPhase_9(double id0,double id1,double id2);
  public void SetPhase(double id0,double id1,double id2)
  {
    SetPhase_9(id0,id1,id2);
  }

  private native void SetPhase_10(double id0[]);
  public void SetPhase(double id0[])
  {
    SetPhase_10(id0);
  }

  private native double[] GetPhase_11();
  public double[] GetPhase()
  {
    return GetPhase_11();
  }

  private native void SetAmplitude_12(double id0);
  public void SetAmplitude(double id0)
  {
    SetAmplitude_12(id0);
  }

  private native double GetAmplitude_13();
  public double GetAmplitude()
  {
    return GetAmplitude_13();
  }

  private native void EvaluateFunction_14(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_14(id0,id1);
  }

  private native double EvaluateFunction_15(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_15(id0,id1,id2);
  }

  public vtkPerlinNoise() { super(); }

  public vtkPerlinNoise(long id) { super(id); }
  public native long   VTKInit();

}
