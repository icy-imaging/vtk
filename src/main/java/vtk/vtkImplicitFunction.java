// java wrapper for vtkImplicitFunction object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitFunction extends vtkObject
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void FunctionValue_5(vtkDataArray id0,vtkDataArray id1);
  public void FunctionValue(vtkDataArray id0,vtkDataArray id1)
  {
    FunctionValue_5(id0,id1);
  }

  private native double FunctionValue_6(double id0[]);
  public double FunctionValue(double id0[])
  {
    return FunctionValue_6(id0);
  }

  private native double FunctionValue_7(double id0,double id1,double id2);
  public double FunctionValue(double id0,double id1,double id2)
  {
    return FunctionValue_7(id0,id1,id2);
  }

  private native void FunctionGradient_8(double id0[],double id1[]);
  public void FunctionGradient(double id0[],double id1[])
  {
    FunctionGradient_8(id0,id1);
  }

  private native double[] FunctionGradient_9(double id0[]);
  public double[] FunctionGradient(double id0[])
  {
    return FunctionGradient_9(id0);
  }

  private native double[] FunctionGradient_10(double id0,double id1,double id2);
  public double[] FunctionGradient(double id0,double id1,double id2)
  {
    return FunctionGradient_10(id0,id1,id2);
  }

  private native void SetTransform_11(vtkAbstractTransform id0);
  public void SetTransform(vtkAbstractTransform id0)
  {
    SetTransform_11(id0);
  }

  private native void SetTransform_12(double id0[]);
  public void SetTransform(double id0[])
  {
    SetTransform_12(id0);
  }

  private native long GetTransform_13();
  public vtkAbstractTransform GetTransform()
  {
    long temp = GetTransform_13();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double EvaluateFunction_14(double id0[]);
  public double EvaluateFunction(double id0[])
  {
    return EvaluateFunction_14(id0);
  }

  private native void EvaluateFunction_15(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_15(id0,id1);
  }

  private native double EvaluateFunction_16(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_16(id0,id1,id2);
  }

  private native void EvaluateGradient_17(double id0[],double id1[]);
  public void EvaluateGradient(double id0[],double id1[])
  {
    EvaluateGradient_17(id0,id1);
  }

  public vtkImplicitFunction() { super(); }

  public vtkImplicitFunction(long id) { super(id); }

}
