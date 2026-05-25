// java wrapper for vtkParametricRandomHills object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParametricRandomHills extends vtkParametricFunction
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

  private native int GetDimension_4();
  public int GetDimension()
  {
    return GetDimension_4();
  }

  private native void SetNumberOfHills_5(int id0);
  public void SetNumberOfHills(int id0)
  {
    SetNumberOfHills_5(id0);
  }

  private native int GetNumberOfHills_6();
  public int GetNumberOfHills()
  {
    return GetNumberOfHills_6();
  }

  private native void SetHillXVariance_7(double id0);
  public void SetHillXVariance(double id0)
  {
    SetHillXVariance_7(id0);
  }

  private native double GetHillXVariance_8();
  public double GetHillXVariance()
  {
    return GetHillXVariance_8();
  }

  private native void SetHillYVariance_9(double id0);
  public void SetHillYVariance(double id0)
  {
    SetHillYVariance_9(id0);
  }

  private native double GetHillYVariance_10();
  public double GetHillYVariance()
  {
    return GetHillYVariance_10();
  }

  private native void SetHillAmplitude_11(double id0);
  public void SetHillAmplitude(double id0)
  {
    SetHillAmplitude_11(id0);
  }

  private native double GetHillAmplitude_12();
  public double GetHillAmplitude()
  {
    return GetHillAmplitude_12();
  }

  private native void SetRandomSeed_13(int id0);
  public void SetRandomSeed(int id0)
  {
    SetRandomSeed_13(id0);
  }

  private native int GetRandomSeed_14();
  public int GetRandomSeed()
  {
    return GetRandomSeed_14();
  }

  private native void SetAllowRandomGeneration_15(int id0);
  public void SetAllowRandomGeneration(int id0)
  {
    SetAllowRandomGeneration_15(id0);
  }

  private native int GetAllowRandomGenerationMinValue_16();
  public int GetAllowRandomGenerationMinValue()
  {
    return GetAllowRandomGenerationMinValue_16();
  }

  private native int GetAllowRandomGenerationMaxValue_17();
  public int GetAllowRandomGenerationMaxValue()
  {
    return GetAllowRandomGenerationMaxValue_17();
  }

  private native int GetAllowRandomGeneration_18();
  public int GetAllowRandomGeneration()
  {
    return GetAllowRandomGeneration_18();
  }

  private native void AllowRandomGenerationOn_19();
  public void AllowRandomGenerationOn()
  {
    AllowRandomGenerationOn_19();
  }

  private native void AllowRandomGenerationOff_20();
  public void AllowRandomGenerationOff()
  {
    AllowRandomGenerationOff_20();
  }

  private native void SetXVarianceScaleFactor_21(double id0);
  public void SetXVarianceScaleFactor(double id0)
  {
    SetXVarianceScaleFactor_21(id0);
  }

  private native double GetXVarianceScaleFactor_22();
  public double GetXVarianceScaleFactor()
  {
    return GetXVarianceScaleFactor_22();
  }

  private native void SetYVarianceScaleFactor_23(double id0);
  public void SetYVarianceScaleFactor(double id0)
  {
    SetYVarianceScaleFactor_23(id0);
  }

  private native double GetYVarianceScaleFactor_24();
  public double GetYVarianceScaleFactor()
  {
    return GetYVarianceScaleFactor_24();
  }

  private native void SetAmplitudeScaleFactor_25(double id0);
  public void SetAmplitudeScaleFactor(double id0)
  {
    SetAmplitudeScaleFactor_25(id0);
  }

  private native double GetAmplitudeScaleFactor_26();
  public double GetAmplitudeScaleFactor()
  {
    return GetAmplitudeScaleFactor_26();
  }

  private native void Evaluate_27(double id0[],double id1[],double id2[]);
  public void Evaluate(double id0[],double id1[],double id2[])
  {
    Evaluate_27(id0,id1,id2);
  }

  private native double EvaluateScalar_28(double id0[],double id1[],double id2[]);
  public double EvaluateScalar(double id0[],double id1[],double id2[])
  {
    return EvaluateScalar_28(id0,id1,id2);
  }

  public vtkParametricRandomHills() { super(); }

  public vtkParametricRandomHills(long id) { super(id); }
  public native long   VTKInit();

}
