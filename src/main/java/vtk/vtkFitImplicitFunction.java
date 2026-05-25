// java wrapper for vtkFitImplicitFunction object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFitImplicitFunction extends vtkPointCloudFilter
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

  private native void SetImplicitFunction_4(vtkImplicitFunction id0);
  public void SetImplicitFunction(vtkImplicitFunction id0)
  {
    SetImplicitFunction_4(id0);
  }

  private native long GetImplicitFunction_5();
  public vtkImplicitFunction GetImplicitFunction()
  {
    long temp = GetImplicitFunction_5();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetThreshold_6(double id0);
  public void SetThreshold(double id0)
  {
    SetThreshold_6(id0);
  }

  private native double GetThresholdMinValue_7();
  public double GetThresholdMinValue()
  {
    return GetThresholdMinValue_7();
  }

  private native double GetThresholdMaxValue_8();
  public double GetThresholdMaxValue()
  {
    return GetThresholdMaxValue_8();
  }

  private native double GetThreshold_9();
  public double GetThreshold()
  {
    return GetThreshold_9();
  }

  private native long GetMTime_10();
  public long GetMTime()
  {
    return GetMTime_10();
  }

  public vtkFitImplicitFunction() { super(); }

  public vtkFitImplicitFunction(long id) { super(id); }
  public native long   VTKInit();

}
