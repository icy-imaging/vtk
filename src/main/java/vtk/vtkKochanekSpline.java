// java wrapper for vtkKochanekSpline object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkKochanekSpline extends vtkSpline
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

  private native void Compute_4();
  public void Compute()
  {
    Compute_4();
  }

  private native double Evaluate_5(double id0);
  public double Evaluate(double id0)
  {
    return Evaluate_5(id0);
  }

  private native void SetDefaultBias_6(double id0);
  public void SetDefaultBias(double id0)
  {
    SetDefaultBias_6(id0);
  }

  private native double GetDefaultBias_7();
  public double GetDefaultBias()
  {
    return GetDefaultBias_7();
  }

  private native void SetDefaultTension_8(double id0);
  public void SetDefaultTension(double id0)
  {
    SetDefaultTension_8(id0);
  }

  private native double GetDefaultTension_9();
  public double GetDefaultTension()
  {
    return GetDefaultTension_9();
  }

  private native void SetDefaultContinuity_10(double id0);
  public void SetDefaultContinuity(double id0)
  {
    SetDefaultContinuity_10(id0);
  }

  private native double GetDefaultContinuity_11();
  public double GetDefaultContinuity()
  {
    return GetDefaultContinuity_11();
  }

  private native void DeepCopy_12(vtkSpline id0);
  public void DeepCopy(vtkSpline id0)
  {
    DeepCopy_12(id0);
  }

  public vtkKochanekSpline() { super(); }

  public vtkKochanekSpline(long id) { super(id); }
  public native long   VTKInit();

}
