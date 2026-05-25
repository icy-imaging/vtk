// java wrapper for vtkBrownianPoints object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBrownianPoints extends vtkDataSetAlgorithm
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

  private native void SetMinimumSpeed_4(double id0);
  public void SetMinimumSpeed(double id0)
  {
    SetMinimumSpeed_4(id0);
  }

  private native double GetMinimumSpeedMinValue_5();
  public double GetMinimumSpeedMinValue()
  {
    return GetMinimumSpeedMinValue_5();
  }

  private native double GetMinimumSpeedMaxValue_6();
  public double GetMinimumSpeedMaxValue()
  {
    return GetMinimumSpeedMaxValue_6();
  }

  private native double GetMinimumSpeed_7();
  public double GetMinimumSpeed()
  {
    return GetMinimumSpeed_7();
  }

  private native void SetMaximumSpeed_8(double id0);
  public void SetMaximumSpeed(double id0)
  {
    SetMaximumSpeed_8(id0);
  }

  private native double GetMaximumSpeedMinValue_9();
  public double GetMaximumSpeedMinValue()
  {
    return GetMaximumSpeedMinValue_9();
  }

  private native double GetMaximumSpeedMaxValue_10();
  public double GetMaximumSpeedMaxValue()
  {
    return GetMaximumSpeedMaxValue_10();
  }

  private native double GetMaximumSpeed_11();
  public double GetMaximumSpeed()
  {
    return GetMaximumSpeed_11();
  }

  public vtkBrownianPoints() { super(); }

  public vtkBrownianPoints(long id) { super(id); }
  public native long   VTKInit();

}
