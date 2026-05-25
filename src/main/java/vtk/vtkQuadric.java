// java wrapper for vtkQuadric object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkQuadric extends vtkImplicitFunction
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

  private native void SetCoefficients_6(double id0[]);
  public void SetCoefficients(double id0[])
  {
    SetCoefficients_6(id0);
  }

  private native void SetCoefficients_7(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8,double id9);
  public void SetCoefficients(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8,double id9)
  {
    SetCoefficients_7(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native double[] GetCoefficients_8();
  public double[] GetCoefficients()
  {
    return GetCoefficients_8();
  }

  private native void EvaluateFunction_9(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_9(id0,id1);
  }

  private native double EvaluateFunction_10(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_10(id0,id1,id2);
  }

  public vtkQuadric() { super(); }

  public vtkQuadric(long id) { super(id); }
  public native long   VTKInit();

}
