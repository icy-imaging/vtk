// java wrapper for vtkThresholdPoints object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkThresholdPoints extends vtkPolyDataAlgorithm
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

  private native void ThresholdByLower_4(double id0);
  public void ThresholdByLower(double id0)
  {
    ThresholdByLower_4(id0);
  }

  private native void ThresholdByUpper_5(double id0);
  public void ThresholdByUpper(double id0)
  {
    ThresholdByUpper_5(id0);
  }

  private native void ThresholdBetween_6(double id0,double id1);
  public void ThresholdBetween(double id0,double id1)
  {
    ThresholdBetween_6(id0,id1);
  }

  private native void SetUpperThreshold_7(double id0);
  public void SetUpperThreshold(double id0)
  {
    SetUpperThreshold_7(id0);
  }

  private native double GetUpperThreshold_8();
  public double GetUpperThreshold()
  {
    return GetUpperThreshold_8();
  }

  private native void SetLowerThreshold_9(double id0);
  public void SetLowerThreshold(double id0)
  {
    SetLowerThreshold_9(id0);
  }

  private native double GetLowerThreshold_10();
  public double GetLowerThreshold()
  {
    return GetLowerThreshold_10();
  }

  private native void SetInputArrayComponent_11(int id0);
  public void SetInputArrayComponent(int id0)
  {
    SetInputArrayComponent_11(id0);
  }

  private native int GetInputArrayComponent_12();
  public int GetInputArrayComponent()
  {
    return GetInputArrayComponent_12();
  }

  private native void SetOutputPointsPrecision_13(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_13(id0);
  }

  private native int GetOutputPointsPrecision_14();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_14();
  }

  public vtkThresholdPoints() { super(); }

  public vtkThresholdPoints(long id) { super(id); }
  public native long   VTKInit();

}
