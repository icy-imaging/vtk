// java wrapper for vtkThresholdTable object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkThresholdTable extends vtkTableAlgorithm
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

  private native void SetMode_4(int id0);
  public void SetMode(int id0)
  {
    SetMode_4(id0);
  }

  private native int GetModeMinValue_5();
  public int GetModeMinValue()
  {
    return GetModeMinValue_5();
  }

  private native int GetModeMaxValue_6();
  public int GetModeMaxValue()
  {
    return GetModeMaxValue_6();
  }

  private native int GetMode_7();
  public int GetMode()
  {
    return GetMode_7();
  }

  private native void SetMinValue_8(double id0);
  public void SetMinValue(double id0)
  {
    SetMinValue_8(id0);
  }

  private native void SetMaxValue_9(double id0);
  public void SetMaxValue(double id0)
  {
    SetMaxValue_9(id0);
  }

  private native void ThresholdBetween_10(double id0,double id1);
  public void ThresholdBetween(double id0,double id1)
  {
    ThresholdBetween_10(id0,id1);
  }

  public vtkThresholdTable() { super(); }

  public vtkThresholdTable(long id) { super(id); }
  public native long   VTKInit();

}
