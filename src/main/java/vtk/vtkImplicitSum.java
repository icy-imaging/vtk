// java wrapper for vtkImplicitSum object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitSum extends vtkImplicitFunction
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

  private native long GetMTime_6();
  public long GetMTime()
  {
    return GetMTime_6();
  }

  private native void AddFunction_7(vtkImplicitFunction id0,double id1);
  public void AddFunction(vtkImplicitFunction id0,double id1)
  {
    AddFunction_7(id0,id1);
  }

  private native void AddFunction_8(vtkImplicitFunction id0);
  public void AddFunction(vtkImplicitFunction id0)
  {
    AddFunction_8(id0);
  }

  private native void RemoveAllFunctions_9();
  public void RemoveAllFunctions()
  {
    RemoveAllFunctions_9();
  }

  private native void SetFunctionWeight_10(vtkImplicitFunction id0,double id1);
  public void SetFunctionWeight(vtkImplicitFunction id0,double id1)
  {
    SetFunctionWeight_10(id0,id1);
  }

  private native void SetNormalizeByWeight_11(int id0);
  public void SetNormalizeByWeight(int id0)
  {
    SetNormalizeByWeight_11(id0);
  }

  private native int GetNormalizeByWeight_12();
  public int GetNormalizeByWeight()
  {
    return GetNormalizeByWeight_12();
  }

  private native void NormalizeByWeightOn_13();
  public void NormalizeByWeightOn()
  {
    NormalizeByWeightOn_13();
  }

  private native void NormalizeByWeightOff_14();
  public void NormalizeByWeightOff()
  {
    NormalizeByWeightOff_14();
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

  public vtkImplicitSum() { super(); }

  public vtkImplicitSum(long id) { super(id); }
  public native long   VTKInit();

}
