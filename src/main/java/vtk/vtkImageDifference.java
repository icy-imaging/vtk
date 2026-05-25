// java wrapper for vtkImageDifference object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageDifference extends vtkThreadedImageAlgorithm
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

  private native void SetImageConnection_4(vtkAlgorithmOutput id0);
  public void SetImageConnection(vtkAlgorithmOutput id0)
  {
    SetImageConnection_4(id0);
  }

  private native void SetImageData_5(vtkDataObject id0);
  public void SetImageData(vtkDataObject id0)
  {
    SetImageData_5(id0);
  }

  private native long GetImage_6();
  public vtkImageData GetImage()
  {
    long temp = GetImage_6();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double GetError_7();
  public double GetError()
  {
    return GetError_7();
  }

  private native double GetThresholdedError_8();
  public double GetThresholdedError()
  {
    return GetThresholdedError_8();
  }

  private native void SetThreshold_9(int id0);
  public void SetThreshold(int id0)
  {
    SetThreshold_9(id0);
  }

  private native int GetThreshold_10();
  public int GetThreshold()
  {
    return GetThreshold_10();
  }

  private native void SetAllowShift_11(boolean id0);
  public void SetAllowShift(boolean id0)
  {
    SetAllowShift_11(id0);
  }

  private native boolean GetAllowShift_12();
  public boolean GetAllowShift()
  {
    return GetAllowShift_12();
  }

  private native void AllowShiftOn_13();
  public void AllowShiftOn()
  {
    AllowShiftOn_13();
  }

  private native void AllowShiftOff_14();
  public void AllowShiftOff()
  {
    AllowShiftOff_14();
  }

  private native void SetAveraging_15(boolean id0);
  public void SetAveraging(boolean id0)
  {
    SetAveraging_15(id0);
  }

  private native boolean GetAveraging_16();
  public boolean GetAveraging()
  {
    return GetAveraging_16();
  }

  private native void AveragingOn_17();
  public void AveragingOn()
  {
    AveragingOn_17();
  }

  private native void AveragingOff_18();
  public void AveragingOff()
  {
    AveragingOff_18();
  }

  private native void SetAverageThresholdFactor_19(double id0);
  public void SetAverageThresholdFactor(double id0)
  {
    SetAverageThresholdFactor_19(id0);
  }

  private native double GetAverageThresholdFactor_20();
  public double GetAverageThresholdFactor()
  {
    return GetAverageThresholdFactor_20();
  }

  public vtkImageDifference() { super(); }

  public vtkImageDifference(long id) { super(id); }
  public native long   VTKInit();

}
