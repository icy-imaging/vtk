// java wrapper for vtkImageGradientMagnitude object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageGradientMagnitude extends vtkThreadedImageAlgorithm
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

  private native void SetHandleBoundaries_4(int id0);
  public void SetHandleBoundaries(int id0)
  {
    SetHandleBoundaries_4(id0);
  }

  private native int GetHandleBoundaries_5();
  public int GetHandleBoundaries()
  {
    return GetHandleBoundaries_5();
  }

  private native void HandleBoundariesOn_6();
  public void HandleBoundariesOn()
  {
    HandleBoundariesOn_6();
  }

  private native void HandleBoundariesOff_7();
  public void HandleBoundariesOff()
  {
    HandleBoundariesOff_7();
  }

  private native void SetDimensionality_8(int id0);
  public void SetDimensionality(int id0)
  {
    SetDimensionality_8(id0);
  }

  private native int GetDimensionalityMinValue_9();
  public int GetDimensionalityMinValue()
  {
    return GetDimensionalityMinValue_9();
  }

  private native int GetDimensionalityMaxValue_10();
  public int GetDimensionalityMaxValue()
  {
    return GetDimensionalityMaxValue_10();
  }

  private native int GetDimensionality_11();
  public int GetDimensionality()
  {
    return GetDimensionality_11();
  }

  public vtkImageGradientMagnitude() { super(); }

  public vtkImageGradientMagnitude(long id) { super(id); }
  public native long   VTKInit();

}
