// java wrapper for vtkContinuousScatterplot object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContinuousScatterplot extends vtkImageAlgorithm
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

  private native double GetEpsilon_4();
  public double GetEpsilon()
  {
    return GetEpsilon_4();
  }

  private native void SetEpsilon_5(double id0);
  public void SetEpsilon(double id0)
  {
    SetEpsilon_5(id0);
  }

  private native void SetField1_6(byte[] id0, int len0,long id1);
  public void SetField1(String id0,long id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetField1_6(bytes0, bytes0.length,id1);
  }

  private native void SetField2_7(byte[] id0, int len0,long id1);
  public void SetField2(String id0,long id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetField2_7(bytes0, bytes0.length,id1);
  }

  public vtkContinuousScatterplot() { super(); }

  public vtkContinuousScatterplot(long id) { super(id); }
  public native long   VTKInit();

}
