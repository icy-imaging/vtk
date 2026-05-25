// java wrapper for vtkImageNonMaximumSuppression object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageNonMaximumSuppression extends vtkThreadedImageAlgorithm
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

  private native void SetMagnitudeInputData_4(vtkImageData id0);
  public void SetMagnitudeInputData(vtkImageData id0)
  {
    SetMagnitudeInputData_4(id0);
  }

  private native void SetVectorInputData_5(vtkImageData id0);
  public void SetVectorInputData(vtkImageData id0)
  {
    SetVectorInputData_5(id0);
  }

  private native void SetHandleBoundaries_6(int id0);
  public void SetHandleBoundaries(int id0)
  {
    SetHandleBoundaries_6(id0);
  }

  private native int GetHandleBoundaries_7();
  public int GetHandleBoundaries()
  {
    return GetHandleBoundaries_7();
  }

  private native void HandleBoundariesOn_8();
  public void HandleBoundariesOn()
  {
    HandleBoundariesOn_8();
  }

  private native void HandleBoundariesOff_9();
  public void HandleBoundariesOff()
  {
    HandleBoundariesOff_9();
  }

  private native void SetDimensionality_10(int id0);
  public void SetDimensionality(int id0)
  {
    SetDimensionality_10(id0);
  }

  private native int GetDimensionalityMinValue_11();
  public int GetDimensionalityMinValue()
  {
    return GetDimensionalityMinValue_11();
  }

  private native int GetDimensionalityMaxValue_12();
  public int GetDimensionalityMaxValue()
  {
    return GetDimensionalityMaxValue_12();
  }

  private native int GetDimensionality_13();
  public int GetDimensionality()
  {
    return GetDimensionality_13();
  }

  public vtkImageNonMaximumSuppression() { super(); }

  public vtkImageNonMaximumSuppression(long id) { super(id); }
  public native long   VTKInit();

}
