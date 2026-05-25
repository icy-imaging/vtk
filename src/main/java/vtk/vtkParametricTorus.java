// java wrapper for vtkParametricTorus object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParametricTorus extends vtkParametricFunction
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

  private native void SetRingRadius_4(double id0);
  public void SetRingRadius(double id0)
  {
    SetRingRadius_4(id0);
  }

  private native double GetRingRadius_5();
  public double GetRingRadius()
  {
    return GetRingRadius_5();
  }

  private native void SetCrossSectionRadius_6(double id0);
  public void SetCrossSectionRadius(double id0)
  {
    SetCrossSectionRadius_6(id0);
  }

  private native double GetCrossSectionRadius_7();
  public double GetCrossSectionRadius()
  {
    return GetCrossSectionRadius_7();
  }

  private native int GetDimension_8();
  public int GetDimension()
  {
    return GetDimension_8();
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

  public vtkParametricTorus() { super(); }

  public vtkParametricTorus(long id) { super(id); }
  public native long   VTKInit();

}
