// java wrapper for vtkAxisFollower object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAxisFollower extends vtkFollower
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

  private native void SetAxis_4(vtkAxisActor id0);
  public void SetAxis(vtkAxisActor id0)
  {
    SetAxis_4(id0);
  }

  private native long GetAxis_5();
  public vtkAxisActor GetAxis()
  {
    long temp = GetAxis_5();

    if (temp == 0) return null;
    return (vtkAxisActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAutoCenter_6(int id0);
  public void SetAutoCenter(int id0)
  {
    SetAutoCenter_6(id0);
  }

  private native int GetAutoCenter_7();
  public int GetAutoCenter()
  {
    return GetAutoCenter_7();
  }

  private native void AutoCenterOn_8();
  public void AutoCenterOn()
  {
    AutoCenterOn_8();
  }

  private native void AutoCenterOff_9();
  public void AutoCenterOff()
  {
    AutoCenterOff_9();
  }

  private native void SetEnableDistanceLOD_10(int id0);
  public void SetEnableDistanceLOD(int id0)
  {
    SetEnableDistanceLOD_10(id0);
  }

  private native int GetEnableDistanceLOD_11();
  public int GetEnableDistanceLOD()
  {
    return GetEnableDistanceLOD_11();
  }

  private native void SetDistanceLODThreshold_12(double id0);
  public void SetDistanceLODThreshold(double id0)
  {
    SetDistanceLODThreshold_12(id0);
  }

  private native double GetDistanceLODThresholdMinValue_13();
  public double GetDistanceLODThresholdMinValue()
  {
    return GetDistanceLODThresholdMinValue_13();
  }

  private native double GetDistanceLODThresholdMaxValue_14();
  public double GetDistanceLODThresholdMaxValue()
  {
    return GetDistanceLODThresholdMaxValue_14();
  }

  private native double GetDistanceLODThreshold_15();
  public double GetDistanceLODThreshold()
  {
    return GetDistanceLODThreshold_15();
  }

  private native void SetEnableViewAngleLOD_16(int id0);
  public void SetEnableViewAngleLOD(int id0)
  {
    SetEnableViewAngleLOD_16(id0);
  }

  private native int GetEnableViewAngleLOD_17();
  public int GetEnableViewAngleLOD()
  {
    return GetEnableViewAngleLOD_17();
  }

  private native void SetViewAngleLODThreshold_18(double id0);
  public void SetViewAngleLODThreshold(double id0)
  {
    SetViewAngleLODThreshold_18(id0);
  }

  private native double GetViewAngleLODThresholdMinValue_19();
  public double GetViewAngleLODThresholdMinValue()
  {
    return GetViewAngleLODThresholdMinValue_19();
  }

  private native double GetViewAngleLODThresholdMaxValue_20();
  public double GetViewAngleLODThresholdMaxValue()
  {
    return GetViewAngleLODThresholdMaxValue_20();
  }

  private native double GetViewAngleLODThreshold_21();
  public double GetViewAngleLODThreshold()
  {
    return GetViewAngleLODThreshold_21();
  }

  private native double GetScreenOffset_22();
  public double GetScreenOffset()
  {
    return GetScreenOffset_22();
  }

  private native void SetScreenOffset_23(double id0);
  public void SetScreenOffset(double id0)
  {
    SetScreenOffset_23(id0);
  }

  private native void SetScreenOffsetVector_24(double id0,double id1);
  public void SetScreenOffsetVector(double id0,double id1)
  {
    SetScreenOffsetVector_24(id0,id1);
  }

  private native void SetScreenOffsetVector_25(double id0[]);
  public void SetScreenOffsetVector(double id0[])
  {
    SetScreenOffsetVector_25(id0);
  }

  private native double[] GetScreenOffsetVector_26();
  public double[] GetScreenOffsetVector()
  {
    return GetScreenOffsetVector_26();
  }

  private native void Render_27(vtkRenderer id0);
  public void Render(vtkRenderer id0)
  {
    Render_27(id0);
  }

  private native void ComputeMatrix_28();
  public void ComputeMatrix()
  {
    ComputeMatrix_28();
  }

  private native void ComputeTransformMatrix_29(vtkRenderer id0);
  public void ComputeTransformMatrix(vtkRenderer id0)
  {
    ComputeTransformMatrix_29(id0);
  }

  private native void ShallowCopy_30(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_30(id0);
  }

  private native double AutoScale_31(vtkViewport id0,vtkCamera id1,double id2,double id3[]);
  public double AutoScale(vtkViewport id0,vtkCamera id1,double id2,double id3[])
  {
    return AutoScale_31(id0,id1,id2,id3);
  }

  public vtkAxisFollower() { super(); }

  public vtkAxisFollower(long id) { super(id); }
  public native long   VTKInit();

}
