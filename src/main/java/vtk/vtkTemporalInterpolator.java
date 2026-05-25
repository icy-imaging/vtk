// java wrapper for vtkTemporalInterpolator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTemporalInterpolator extends vtkMultiTimeStepAlgorithm
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

  private native void SetDiscreteTimeStepInterval_4(double id0);
  public void SetDiscreteTimeStepInterval(double id0)
  {
    SetDiscreteTimeStepInterval_4(id0);
  }

  private native double GetDiscreteTimeStepInterval_5();
  public double GetDiscreteTimeStepInterval()
  {
    return GetDiscreteTimeStepInterval_5();
  }

  private native void SetResampleFactor_6(int id0);
  public void SetResampleFactor(int id0)
  {
    SetResampleFactor_6(id0);
  }

  private native int GetResampleFactor_7();
  public int GetResampleFactor()
  {
    return GetResampleFactor_7();
  }

  private native void SetCacheData_8(boolean id0);
  public void SetCacheData(boolean id0)
  {
    SetCacheData_8(id0);
  }

  private native boolean GetCacheData_9();
  public boolean GetCacheData()
  {
    return GetCacheData_9();
  }

  public vtkTemporalInterpolator() { super(); }

  public vtkTemporalInterpolator(long id) { super(id); }
  public native long   VTKInit();

}
