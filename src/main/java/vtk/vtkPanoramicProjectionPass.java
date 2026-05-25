// java wrapper for vtkPanoramicProjectionPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPanoramicProjectionPass extends vtkImageProcessingPass
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

  private native void ReleaseGraphicsResources_4(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_4(id0);
  }

  private native int GetCubeResolution_5();
  public int GetCubeResolution()
  {
    return GetCubeResolution_5();
  }

  private native void SetCubeResolution_6(int id0);
  public void SetCubeResolution(int id0)
  {
    SetCubeResolution_6(id0);
  }

  private native int GetProjectionType_7();
  public int GetProjectionType()
  {
    return GetProjectionType_7();
  }

  private native void SetProjectionType_8(int id0);
  public void SetProjectionType(int id0)
  {
    SetProjectionType_8(id0);
  }

  private native int GetProjectionTypeMinValue_9();
  public int GetProjectionTypeMinValue()
  {
    return GetProjectionTypeMinValue_9();
  }

  private native int GetProjectionTypeMaxValue_10();
  public int GetProjectionTypeMaxValue()
  {
    return GetProjectionTypeMaxValue_10();
  }

  private native void SetProjectionTypeToEquirectangular_11();
  public void SetProjectionTypeToEquirectangular()
  {
    SetProjectionTypeToEquirectangular_11();
  }

  private native void SetProjectionTypeToAzimuthal_12();
  public void SetProjectionTypeToAzimuthal()
  {
    SetProjectionTypeToAzimuthal_12();
  }

  private native double GetAngle_13();
  public double GetAngle()
  {
    return GetAngle_13();
  }

  private native void SetAngle_14(double id0);
  public void SetAngle(double id0)
  {
    SetAngle_14(id0);
  }

  private native double GetAngleMinValue_15();
  public double GetAngleMinValue()
  {
    return GetAngleMinValue_15();
  }

  private native double GetAngleMaxValue_16();
  public double GetAngleMaxValue()
  {
    return GetAngleMaxValue_16();
  }

  private native boolean GetInterpolate_17();
  public boolean GetInterpolate()
  {
    return GetInterpolate_17();
  }

  private native void SetInterpolate_18(boolean id0);
  public void SetInterpolate(boolean id0)
  {
    SetInterpolate_18(id0);
  }

  private native void InterpolateOn_19();
  public void InterpolateOn()
  {
    InterpolateOn_19();
  }

  private native void InterpolateOff_20();
  public void InterpolateOff()
  {
    InterpolateOff_20();
  }

  public vtkPanoramicProjectionPass() { super(); }

  public vtkPanoramicProjectionPass(long id) { super(id); }
  public native long   VTKInit();

}
