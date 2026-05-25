// java wrapper for vtkImplicitHalo object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitHalo extends vtkImplicitFunction
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

  private native void SetRadius_6(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_6(id0);
  }

  private native double GetRadius_7();
  public double GetRadius()
  {
    return GetRadius_7();
  }

  private native void SetCenter_8(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_8(id0,id1,id2);
  }

  private native void SetCenter_9(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_9(id0);
  }

  private native double[] GetCenter_10();
  public double[] GetCenter()
  {
    return GetCenter_10();
  }

  private native void SetFadeOut_11(double id0);
  public void SetFadeOut(double id0)
  {
    SetFadeOut_11(id0);
  }

  private native double GetFadeOut_12();
  public double GetFadeOut()
  {
    return GetFadeOut_12();
  }

  private native void EvaluateFunction_13(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_13(id0,id1);
  }

  private native double EvaluateFunction_14(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_14(id0,id1,id2);
  }

  public vtkImplicitHalo() { super(); }

  public vtkImplicitHalo(long id) { super(id); }
  public native long   VTKInit();

}
