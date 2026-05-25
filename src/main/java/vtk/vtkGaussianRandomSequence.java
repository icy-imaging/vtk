// java wrapper for vtkGaussianRandomSequence object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGaussianRandomSequence extends vtkRandomSequence
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

  private native double GetScaledValue_4(double id0,double id1);
  public double GetScaledValue(double id0,double id1)
  {
    return GetScaledValue_4(id0,id1);
  }

  private native double GetNextScaledValue_5(double id0,double id1);
  public double GetNextScaledValue(double id0,double id1)
  {
    return GetNextScaledValue_5(id0,id1);
  }

  public vtkGaussianRandomSequence() { super(); }

  public vtkGaussianRandomSequence(long id) { super(id); }

}
