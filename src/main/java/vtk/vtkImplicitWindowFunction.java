// java wrapper for vtkImplicitWindowFunction object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitWindowFunction extends vtkImplicitFunction
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

  private native void SetImplicitFunction_6(vtkImplicitFunction id0);
  public void SetImplicitFunction(vtkImplicitFunction id0)
  {
    SetImplicitFunction_6(id0);
  }

  private native long GetImplicitFunction_7();
  public vtkImplicitFunction GetImplicitFunction()
  {
    long temp = GetImplicitFunction_7();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetWindowRange_8(double id0,double id1);
  public void SetWindowRange(double id0,double id1)
  {
    SetWindowRange_8(id0,id1);
  }

  private native void SetWindowRange_9(double id0[]);
  public void SetWindowRange(double id0[])
  {
    SetWindowRange_9(id0);
  }

  private native double[] GetWindowRange_10();
  public double[] GetWindowRange()
  {
    return GetWindowRange_10();
  }

  private native void SetWindowValues_11(double id0,double id1);
  public void SetWindowValues(double id0,double id1)
  {
    SetWindowValues_11(id0,id1);
  }

  private native void SetWindowValues_12(double id0[]);
  public void SetWindowValues(double id0[])
  {
    SetWindowValues_12(id0);
  }

  private native double[] GetWindowValues_13();
  public double[] GetWindowValues()
  {
    return GetWindowValues_13();
  }

  private native long GetMTime_14();
  public long GetMTime()
  {
    return GetMTime_14();
  }

  private native boolean UsesGarbageCollector_15();
  public boolean UsesGarbageCollector()
  {
    return UsesGarbageCollector_15();
  }

  private native void EvaluateFunction_16(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_16(id0,id1);
  }

  private native double EvaluateFunction_17(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_17(id0,id1,id2);
  }

  public vtkImplicitWindowFunction() { super(); }

  public vtkImplicitWindowFunction(long id) { super(id); }
  public native long   VTKInit();

}
