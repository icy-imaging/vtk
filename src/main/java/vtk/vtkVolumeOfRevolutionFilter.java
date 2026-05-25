// java wrapper for vtkVolumeOfRevolutionFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVolumeOfRevolutionFilter extends vtkUnstructuredGridAlgorithm
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

  private native void SetResolution_4(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_4(id0);
  }

  private native int GetResolutionMinValue_5();
  public int GetResolutionMinValue()
  {
    return GetResolutionMinValue_5();
  }

  private native int GetResolutionMaxValue_6();
  public int GetResolutionMaxValue()
  {
    return GetResolutionMaxValue_6();
  }

  private native int GetResolution_7();
  public int GetResolution()
  {
    return GetResolution_7();
  }

  private native void SetSweepAngle_8(double id0);
  public void SetSweepAngle(double id0)
  {
    SetSweepAngle_8(id0);
  }

  private native double GetSweepAngleMinValue_9();
  public double GetSweepAngleMinValue()
  {
    return GetSweepAngleMinValue_9();
  }

  private native double GetSweepAngleMaxValue_10();
  public double GetSweepAngleMaxValue()
  {
    return GetSweepAngleMaxValue_10();
  }

  private native double GetSweepAngle_11();
  public double GetSweepAngle()
  {
    return GetSweepAngle_11();
  }

  private native void SetAxisPosition_12(double id0,double id1,double id2);
  public void SetAxisPosition(double id0,double id1,double id2)
  {
    SetAxisPosition_12(id0,id1,id2);
  }

  private native void SetAxisPosition_13(double id0[]);
  public void SetAxisPosition(double id0[])
  {
    SetAxisPosition_13(id0);
  }

  private native double[] GetAxisPosition_14();
  public double[] GetAxisPosition()
  {
    return GetAxisPosition_14();
  }

  private native void SetAxisDirection_15(double id0,double id1,double id2);
  public void SetAxisDirection(double id0,double id1,double id2)
  {
    SetAxisDirection_15(id0,id1,id2);
  }

  private native void SetAxisDirection_16(double id0[]);
  public void SetAxisDirection(double id0[])
  {
    SetAxisDirection_16(id0);
  }

  private native double[] GetAxisDirection_17();
  public double[] GetAxisDirection()
  {
    return GetAxisDirection_17();
  }

  private native void SetOutputPointsPrecision_18(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_18(id0);
  }

  private native int GetOutputPointsPrecisionMinValue_19();
  public int GetOutputPointsPrecisionMinValue()
  {
    return GetOutputPointsPrecisionMinValue_19();
  }

  private native int GetOutputPointsPrecisionMaxValue_20();
  public int GetOutputPointsPrecisionMaxValue()
  {
    return GetOutputPointsPrecisionMaxValue_20();
  }

  private native int GetOutputPointsPrecision_21();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_21();
  }

  public vtkVolumeOfRevolutionFilter() { super(); }

  public vtkVolumeOfRevolutionFilter(long id) { super(id); }
  public native long   VTKInit();

}
