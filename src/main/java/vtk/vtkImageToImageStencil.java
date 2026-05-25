// java wrapper for vtkImageToImageStencil object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageToImageStencil extends vtkImageStencilAlgorithm
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

  private native void SetInputData_4(vtkImageData id0);
  public void SetInputData(vtkImageData id0)
  {
    SetInputData_4(id0);
  }

  private native long GetInput_5();
  public vtkImageData GetInput()
  {
    long temp = GetInput_5();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ThresholdByUpper_6(double id0);
  public void ThresholdByUpper(double id0)
  {
    ThresholdByUpper_6(id0);
  }

  private native void ThresholdByLower_7(double id0);
  public void ThresholdByLower(double id0)
  {
    ThresholdByLower_7(id0);
  }

  private native void ThresholdBetween_8(double id0,double id1);
  public void ThresholdBetween(double id0,double id1)
  {
    ThresholdBetween_8(id0,id1);
  }

  private native void SetUpperThreshold_9(double id0);
  public void SetUpperThreshold(double id0)
  {
    SetUpperThreshold_9(id0);
  }

  private native double GetUpperThreshold_10();
  public double GetUpperThreshold()
  {
    return GetUpperThreshold_10();
  }

  private native void SetLowerThreshold_11(double id0);
  public void SetLowerThreshold(double id0)
  {
    SetLowerThreshold_11(id0);
  }

  private native double GetLowerThreshold_12();
  public double GetLowerThreshold()
  {
    return GetLowerThreshold_12();
  }

  public vtkImageToImageStencil() { super(); }

  public vtkImageToImageStencil(long id) { super(id); }
  public native long   VTKInit();

}
