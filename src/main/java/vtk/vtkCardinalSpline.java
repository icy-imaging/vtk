// java wrapper for vtkCardinalSpline object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCardinalSpline extends vtkSpline
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

  private native void DeepCopy_6(vtkSpline id0);
  public void DeepCopy(vtkSpline id0)
  {
    DeepCopy_6(id0);
  }

  public vtkCardinalSpline() { super(); }

  public vtkCardinalSpline(long id) { super(id); }
  public native long   VTKInit();

}
