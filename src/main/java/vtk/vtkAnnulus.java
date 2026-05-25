// java wrapper for vtkAnnulus object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAnnulus extends vtkImplicitFunction
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

  private native void SetInnerRadius_6(double id0);
  public void SetInnerRadius(double id0)
  {
    SetInnerRadius_6(id0);
  }

  private native double GetInnerRadius_7();
  public double GetInnerRadius()
  {
    return GetInnerRadius_7();
  }

  private native void SetOuterRadius_8(double id0);
  public void SetOuterRadius(double id0)
  {
    SetOuterRadius_8(id0);
  }

  private native double GetOuterRadius_9();
  public double GetOuterRadius()
  {
    return GetOuterRadius_9();
  }

  private native void SetCenter_10(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_10(id0,id1,id2);
  }

  private native void SetCenter_11(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_11(id0);
  }

  private native void GetCenter_12(double id0[]);
  public void GetCenter(double id0[])
  {
    GetCenter_12(id0);
  }

  private native double[] GetCenter_13();
  public double[] GetCenter()
  {
    return GetCenter_13();
  }

  private native void SetAxis_14(double id0,double id1,double id2);
  public void SetAxis(double id0,double id1,double id2)
  {
    SetAxis_14(id0,id1,id2);
  }

  private native void SetAxis_15(double id0[]);
  public void SetAxis(double id0[])
  {
    SetAxis_15(id0);
  }

  private native void GetAxis_16(double id0[]);
  public void GetAxis(double id0[])
  {
    GetAxis_16(id0);
  }

  private native double[] GetAxis_17();
  public double[] GetAxis()
  {
    return GetAxis_17();
  }

  private native void EvaluateFunction_18(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_18(id0,id1);
  }

  private native double EvaluateFunction_19(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_19(id0,id1,id2);
  }

  public vtkAnnulus() { super(); }

  public vtkAnnulus(long id) { super(id); }
  public native long   VTKInit();

}
