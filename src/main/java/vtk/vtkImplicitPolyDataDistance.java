// java wrapper for vtkImplicitPolyDataDistance object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitPolyDataDistance extends vtkImplicitFunction
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

  private native double EvaluateFunction_5(double id0[]);
  public double EvaluateFunction(double id0[])
  {
    return EvaluateFunction_5(id0);
  }

  private native void EvaluateGradient_6(double id0[],double id1[]);
  public void EvaluateGradient(double id0[],double id1[])
  {
    EvaluateGradient_6(id0,id1);
  }

  private native double EvaluateFunctionAndGetClosestPoint_7(double id0[],double id1[]);
  public double EvaluateFunctionAndGetClosestPoint(double id0[],double id1[])
  {
    return EvaluateFunctionAndGetClosestPoint_7(id0,id1);
  }

  private native void SetInput_8(vtkPolyData id0);
  public void SetInput(vtkPolyData id0)
  {
    SetInput_8(id0);
  }

  private native void SetNoValue_9(double id0);
  public void SetNoValue(double id0)
  {
    SetNoValue_9(id0);
  }

  private native double GetNoValue_10();
  public double GetNoValue()
  {
    return GetNoValue_10();
  }

  private native void SetNoGradient_11(double id0,double id1,double id2);
  public void SetNoGradient(double id0,double id1,double id2)
  {
    SetNoGradient_11(id0,id1,id2);
  }

  private native void SetNoGradient_12(double id0[]);
  public void SetNoGradient(double id0[])
  {
    SetNoGradient_12(id0);
  }

  private native double[] GetNoGradient_13();
  public double[] GetNoGradient()
  {
    return GetNoGradient_13();
  }

  private native void SetNoClosestPoint_14(double id0,double id1,double id2);
  public void SetNoClosestPoint(double id0,double id1,double id2)
  {
    SetNoClosestPoint_14(id0,id1,id2);
  }

  private native void SetNoClosestPoint_15(double id0[]);
  public void SetNoClosestPoint(double id0[])
  {
    SetNoClosestPoint_15(id0);
  }

  private native double[] GetNoClosestPoint_16();
  public double[] GetNoClosestPoint()
  {
    return GetNoClosestPoint_16();
  }

  private native double GetTolerance_17();
  public double GetTolerance()
  {
    return GetTolerance_17();
  }

  private native void SetTolerance_18(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_18(id0);
  }

  private native void EvaluateFunction_19(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_19(id0,id1);
  }

  private native double EvaluateFunction_20(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_20(id0,id1,id2);
  }

  public vtkImplicitPolyDataDistance() { super(); }

  public vtkImplicitPolyDataDistance(long id) { super(id); }
  public native long   VTKInit();

}
