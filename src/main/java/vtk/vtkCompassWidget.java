// java wrapper for vtkCompassWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCompassWidget extends vtkAbstractWidget
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

  private native void SetRepresentation_4(vtkCompassRepresentation id0);
  public void SetRepresentation(vtkCompassRepresentation id0)
  {
    SetRepresentation_4(id0);
  }

  private native void CreateDefaultRepresentation_5();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_5();
  }

  private native double GetHeading_6();
  public double GetHeading()
  {
    return GetHeading_6();
  }

  private native void SetHeading_7(double id0);
  public void SetHeading(double id0)
  {
    SetHeading_7(id0);
  }

  private native double GetTilt_8();
  public double GetTilt()
  {
    return GetTilt_8();
  }

  private native void SetTilt_9(double id0);
  public void SetTilt(double id0)
  {
    SetTilt_9(id0);
  }

  private native double GetDistance_10();
  public double GetDistance()
  {
    return GetDistance_10();
  }

  private native void SetDistance_11(double id0);
  public void SetDistance(double id0)
  {
    SetDistance_11(id0);
  }

  private native int GetTimerDuration_12();
  public int GetTimerDuration()
  {
    return GetTimerDuration_12();
  }

  private native void SetTimerDuration_13(int id0);
  public void SetTimerDuration(int id0)
  {
    SetTimerDuration_13(id0);
  }

  private native double GetTiltSpeed_14();
  public double GetTiltSpeed()
  {
    return GetTiltSpeed_14();
  }

  private native void SetTiltSpeed_15(double id0);
  public void SetTiltSpeed(double id0)
  {
    SetTiltSpeed_15(id0);
  }

  private native double GetDistanceSpeed_16();
  public double GetDistanceSpeed()
  {
    return GetDistanceSpeed_16();
  }

  private native void SetDistanceSpeed_17(double id0);
  public void SetDistanceSpeed(double id0)
  {
    SetDistanceSpeed_17(id0);
  }

  public vtkCompassWidget() { super(); }

  public vtkCompassWidget(long id) { super(id); }
  public native long   VTKInit();

}
