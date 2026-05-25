// java wrapper for vtkAmoebaMinimizer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAmoebaMinimizer extends vtkObject
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

  private native void SetFunction_4( Object id0, byte[] id1, int len1);
  public void SetFunction( Object id0, String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetFunction_4(id0, bytes1, bytes1.length);
  }

  private native void SetParameterValue_5(byte[] id0, int len0,double id1);
  public void SetParameterValue(String id0,double id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetParameterValue_5(bytes0, bytes0.length,id1);
  }

  private native void SetParameterValue_6(int id0,double id1);
  public void SetParameterValue(int id0,double id1)
  {
    SetParameterValue_6(id0,id1);
  }

  private native void SetParameterScale_7(byte[] id0, int len0,double id1);
  public void SetParameterScale(String id0,double id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetParameterScale_7(bytes0, bytes0.length,id1);
  }

  private native double GetParameterScale_8(byte[] id0, int len0);
  public double GetParameterScale(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetParameterScale_8(bytes0, bytes0.length);
  }

  private native void SetParameterScale_9(int id0,double id1);
  public void SetParameterScale(int id0,double id1)
  {
    SetParameterScale_9(id0,id1);
  }

  private native double GetParameterScale_10(int id0);
  public double GetParameterScale(int id0)
  {
    return GetParameterScale_10(id0);
  }

  private native double GetParameterValue_11(byte[] id0, int len0);
  public double GetParameterValue(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetParameterValue_11(bytes0, bytes0.length);
  }

  private native double GetParameterValue_12(int id0);
  public double GetParameterValue(int id0)
  {
    return GetParameterValue_12(id0);
  }

  private native byte[] GetParameterName_13(int id0);
  public String GetParameterName(int id0)
  {
    return new String(GetParameterName_13(id0), StandardCharsets.UTF_8);
  }

  private native int GetNumberOfParameters_14();
  public int GetNumberOfParameters()
  {
    return GetNumberOfParameters_14();
  }

  private native void Initialize_15();
  public void Initialize()
  {
    Initialize_15();
  }

  private native void Minimize_16();
  public void Minimize()
  {
    Minimize_16();
  }

  private native int Iterate_17();
  public int Iterate()
  {
    return Iterate_17();
  }

  private native void SetFunctionValue_18(double id0);
  public void SetFunctionValue(double id0)
  {
    SetFunctionValue_18(id0);
  }

  private native double GetFunctionValue_19();
  public double GetFunctionValue()
  {
    return GetFunctionValue_19();
  }

  private native void SetContractionRatio_20(double id0);
  public void SetContractionRatio(double id0)
  {
    SetContractionRatio_20(id0);
  }

  private native double GetContractionRatioMinValue_21();
  public double GetContractionRatioMinValue()
  {
    return GetContractionRatioMinValue_21();
  }

  private native double GetContractionRatioMaxValue_22();
  public double GetContractionRatioMaxValue()
  {
    return GetContractionRatioMaxValue_22();
  }

  private native double GetContractionRatio_23();
  public double GetContractionRatio()
  {
    return GetContractionRatio_23();
  }

  private native void SetExpansionRatio_24(double id0);
  public void SetExpansionRatio(double id0)
  {
    SetExpansionRatio_24(id0);
  }

  private native double GetExpansionRatioMinValue_25();
  public double GetExpansionRatioMinValue()
  {
    return GetExpansionRatioMinValue_25();
  }

  private native double GetExpansionRatioMaxValue_26();
  public double GetExpansionRatioMaxValue()
  {
    return GetExpansionRatioMaxValue_26();
  }

  private native double GetExpansionRatio_27();
  public double GetExpansionRatio()
  {
    return GetExpansionRatio_27();
  }

  private native void SetTolerance_28(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_28(id0);
  }

  private native double GetTolerance_29();
  public double GetTolerance()
  {
    return GetTolerance_29();
  }

  private native void SetParameterTolerance_30(double id0);
  public void SetParameterTolerance(double id0)
  {
    SetParameterTolerance_30(id0);
  }

  private native double GetParameterTolerance_31();
  public double GetParameterTolerance()
  {
    return GetParameterTolerance_31();
  }

  private native void SetMaxIterations_32(int id0);
  public void SetMaxIterations(int id0)
  {
    SetMaxIterations_32(id0);
  }

  private native int GetMaxIterations_33();
  public int GetMaxIterations()
  {
    return GetMaxIterations_33();
  }

  private native int GetIterations_34();
  public int GetIterations()
  {
    return GetIterations_34();
  }

  private native int GetFunctionEvaluations_35();
  public int GetFunctionEvaluations()
  {
    return GetFunctionEvaluations_35();
  }

  private native void EvaluateFunction_36();
  public void EvaluateFunction()
  {
    EvaluateFunction_36();
  }

  public vtkAmoebaMinimizer() { super(); }

  public vtkAmoebaMinimizer(long id) { super(id); }
  public native long   VTKInit();

}
