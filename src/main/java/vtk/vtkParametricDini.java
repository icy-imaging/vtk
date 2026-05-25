// java wrapper for vtkParametricDini object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParametricDini extends vtkParametricFunction
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

  private native void SetA_5(double id0);
  public void SetA(double id0)
  {
    SetA_5(id0);
  }

  private native double GetA_6();
  public double GetA()
  {
    return GetA_6();
  }

  private native void SetB_7(double id0);
  public void SetB(double id0)
  {
    SetB_7(id0);
  }

  private native double GetB_8();
  public double GetB()
  {
    return GetB_8();
  }

  private native void Evaluate_9(double id0[],double id1[],double id2[]);
  public void Evaluate(double id0[],double id1[],double id2[])
  {
    Evaluate_9(id0,id1,id2);
  }

  private native double EvaluateScalar_10(double id0[],double id1[],double id2[]);
  public double EvaluateScalar(double id0[],double id1[],double id2[])
  {
    return EvaluateScalar_10(id0,id1,id2);
  }

  public vtkParametricDini() { super(); }

  public vtkParametricDini(long id) { super(id); }
  public native long   VTKInit();

}
