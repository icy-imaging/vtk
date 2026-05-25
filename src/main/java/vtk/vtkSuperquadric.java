// java wrapper for vtkSuperquadric object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSuperquadric extends vtkImplicitFunction
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

  private native void SetCenter_6(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_6(id0,id1,id2);
  }

  private native void SetCenter_7(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_7(id0);
  }

  private native double[] GetCenter_8();
  public double[] GetCenter()
  {
    return GetCenter_8();
  }

  private native void SetScale_9(double id0,double id1,double id2);
  public void SetScale(double id0,double id1,double id2)
  {
    SetScale_9(id0,id1,id2);
  }

  private native void SetScale_10(double id0[]);
  public void SetScale(double id0[])
  {
    SetScale_10(id0);
  }

  private native double[] GetScale_11();
  public double[] GetScale()
  {
    return GetScale_11();
  }

  private native double GetThickness_12();
  public double GetThickness()
  {
    return GetThickness_12();
  }

  private native void SetThickness_13(double id0);
  public void SetThickness(double id0)
  {
    SetThickness_13(id0);
  }

  private native double GetThicknessMinValue_14();
  public double GetThicknessMinValue()
  {
    return GetThicknessMinValue_14();
  }

  private native double GetThicknessMaxValue_15();
  public double GetThicknessMaxValue()
  {
    return GetThicknessMaxValue_15();
  }

  private native double GetPhiRoundness_16();
  public double GetPhiRoundness()
  {
    return GetPhiRoundness_16();
  }

  private native void SetPhiRoundness_17(double id0);
  public void SetPhiRoundness(double id0)
  {
    SetPhiRoundness_17(id0);
  }

  private native double GetThetaRoundness_18();
  public double GetThetaRoundness()
  {
    return GetThetaRoundness_18();
  }

  private native void SetThetaRoundness_19(double id0);
  public void SetThetaRoundness(double id0)
  {
    SetThetaRoundness_19(id0);
  }

  private native void SetSize_20(double id0);
  public void SetSize(double id0)
  {
    SetSize_20(id0);
  }

  private native double GetSize_21();
  public double GetSize()
  {
    return GetSize_21();
  }

  private native void ToroidalOn_22();
  public void ToroidalOn()
  {
    ToroidalOn_22();
  }

  private native void ToroidalOff_23();
  public void ToroidalOff()
  {
    ToroidalOff_23();
  }

  private native int GetToroidal_24();
  public int GetToroidal()
  {
    return GetToroidal_24();
  }

  private native void SetToroidal_25(int id0);
  public void SetToroidal(int id0)
  {
    SetToroidal_25(id0);
  }

  private native void EvaluateFunction_26(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_26(id0,id1);
  }

  private native double EvaluateFunction_27(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_27(id0,id1,id2);
  }

  public vtkSuperquadric() { super(); }

  public vtkSuperquadric(long id) { super(id); }
  public native long   VTKInit();

}
