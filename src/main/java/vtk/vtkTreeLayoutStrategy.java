// java wrapper for vtkTreeLayoutStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTreeLayoutStrategy extends vtkGraphLayoutStrategy
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

  private native void Layout_4();
  public void Layout()
  {
    Layout_4();
  }

  private native void SetAngle_5(double id0);
  public void SetAngle(double id0)
  {
    SetAngle_5(id0);
  }

  private native double GetAngleMinValue_6();
  public double GetAngleMinValue()
  {
    return GetAngleMinValue_6();
  }

  private native double GetAngleMaxValue_7();
  public double GetAngleMaxValue()
  {
    return GetAngleMaxValue_7();
  }

  private native double GetAngle_8();
  public double GetAngle()
  {
    return GetAngle_8();
  }

  private native void SetRadial_9(boolean id0);
  public void SetRadial(boolean id0)
  {
    SetRadial_9(id0);
  }

  private native boolean GetRadial_10();
  public boolean GetRadial()
  {
    return GetRadial_10();
  }

  private native void RadialOn_11();
  public void RadialOn()
  {
    RadialOn_11();
  }

  private native void RadialOff_12();
  public void RadialOff()
  {
    RadialOff_12();
  }

  private native void SetLogSpacingValue_13(double id0);
  public void SetLogSpacingValue(double id0)
  {
    SetLogSpacingValue_13(id0);
  }

  private native double GetLogSpacingValue_14();
  public double GetLogSpacingValue()
  {
    return GetLogSpacingValue_14();
  }

  private native void SetLeafSpacing_15(double id0);
  public void SetLeafSpacing(double id0)
  {
    SetLeafSpacing_15(id0);
  }

  private native double GetLeafSpacingMinValue_16();
  public double GetLeafSpacingMinValue()
  {
    return GetLeafSpacingMinValue_16();
  }

  private native double GetLeafSpacingMaxValue_17();
  public double GetLeafSpacingMaxValue()
  {
    return GetLeafSpacingMaxValue_17();
  }

  private native double GetLeafSpacing_18();
  public double GetLeafSpacing()
  {
    return GetLeafSpacing_18();
  }

  private native void SetDistanceArrayName_19(byte[] id0, int len0);
  public void SetDistanceArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDistanceArrayName_19(bytes0, bytes0.length);
  }

  private native byte[] GetDistanceArrayName_20();
  public String GetDistanceArrayName()
  {
    return new String(GetDistanceArrayName_20(), StandardCharsets.UTF_8);
  }

  private native void SetRotation_21(double id0);
  public void SetRotation(double id0)
  {
    SetRotation_21(id0);
  }

  private native double GetRotation_22();
  public double GetRotation()
  {
    return GetRotation_22();
  }

  private native void SetReverseEdges_23(boolean id0);
  public void SetReverseEdges(boolean id0)
  {
    SetReverseEdges_23(id0);
  }

  private native boolean GetReverseEdges_24();
  public boolean GetReverseEdges()
  {
    return GetReverseEdges_24();
  }

  private native void ReverseEdgesOn_25();
  public void ReverseEdgesOn()
  {
    ReverseEdgesOn_25();
  }

  private native void ReverseEdgesOff_26();
  public void ReverseEdgesOff()
  {
    ReverseEdgesOff_26();
  }

  public vtkTreeLayoutStrategy() { super(); }

  public vtkTreeLayoutStrategy(long id) { super(id); }
  public native long   VTKInit();

}
