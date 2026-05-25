// java wrapper for vtkAngularPeriodicFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAngularPeriodicFilter extends vtkPeriodicFilter
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

  private native void SetComputeRotationsOnTheFly_4(boolean id0);
  public void SetComputeRotationsOnTheFly(boolean id0)
  {
    SetComputeRotationsOnTheFly_4(id0);
  }

  private native boolean GetComputeRotationsOnTheFly_5();
  public boolean GetComputeRotationsOnTheFly()
  {
    return GetComputeRotationsOnTheFly_5();
  }

  private native void ComputeRotationsOnTheFlyOn_6();
  public void ComputeRotationsOnTheFlyOn()
  {
    ComputeRotationsOnTheFlyOn_6();
  }

  private native void ComputeRotationsOnTheFlyOff_7();
  public void ComputeRotationsOnTheFlyOff()
  {
    ComputeRotationsOnTheFlyOff_7();
  }

  private native void SetRotationMode_8(int id0);
  public void SetRotationMode(int id0)
  {
    SetRotationMode_8(id0);
  }

  private native int GetRotationModeMinValue_9();
  public int GetRotationModeMinValue()
  {
    return GetRotationModeMinValue_9();
  }

  private native int GetRotationModeMaxValue_10();
  public int GetRotationModeMaxValue()
  {
    return GetRotationModeMaxValue_10();
  }

  private native int GetRotationMode_11();
  public int GetRotationMode()
  {
    return GetRotationMode_11();
  }

  private native void SetRotationModeToDirectAngle_12();
  public void SetRotationModeToDirectAngle()
  {
    SetRotationModeToDirectAngle_12();
  }

  private native void SetRotationModeToArrayValue_13();
  public void SetRotationModeToArrayValue()
  {
    SetRotationModeToArrayValue_13();
  }

  private native void SetRotationAngle_14(double id0);
  public void SetRotationAngle(double id0)
  {
    SetRotationAngle_14(id0);
  }

  private native double GetRotationAngle_15();
  public double GetRotationAngle()
  {
    return GetRotationAngle_15();
  }

  private native void SetRotationArrayName_16(byte[] id0, int len0);
  public void SetRotationArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetRotationArrayName_16(bytes0, bytes0.length);
  }

  private native byte[] GetRotationArrayName_17();
  public String GetRotationArrayName()
  {
    return new String(GetRotationArrayName_17(), StandardCharsets.UTF_8);
  }

  private native void SetRotationAxis_18(int id0);
  public void SetRotationAxis(int id0)
  {
    SetRotationAxis_18(id0);
  }

  private native int GetRotationAxisMinValue_19();
  public int GetRotationAxisMinValue()
  {
    return GetRotationAxisMinValue_19();
  }

  private native int GetRotationAxisMaxValue_20();
  public int GetRotationAxisMaxValue()
  {
    return GetRotationAxisMaxValue_20();
  }

  private native int GetRotationAxis_21();
  public int GetRotationAxis()
  {
    return GetRotationAxis_21();
  }

  private native void SetRotationAxisToX_22();
  public void SetRotationAxisToX()
  {
    SetRotationAxisToX_22();
  }

  private native void SetRotationAxisToY_23();
  public void SetRotationAxisToY()
  {
    SetRotationAxisToY_23();
  }

  private native void SetRotationAxisToZ_24();
  public void SetRotationAxisToZ()
  {
    SetRotationAxisToZ_24();
  }

  private native void SetCenter_25(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_25(id0,id1,id2);
  }

  private native void SetCenter_26(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_26(id0);
  }

  private native double[] GetCenter_27();
  public double[] GetCenter()
  {
    return GetCenter_27();
  }

  public vtkAngularPeriodicFilter() { super(); }

  public vtkAngularPeriodicFilter(long id) { super(id); }
  public native long   VTKInit();

}
