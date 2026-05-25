// java wrapper for vtkImageLaplacian object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageLaplacian extends vtkThreadedImageAlgorithm
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

  private native void SetDimensionality_4(int id0);
  public void SetDimensionality(int id0)
  {
    SetDimensionality_4(id0);
  }

  private native int GetDimensionalityMinValue_5();
  public int GetDimensionalityMinValue()
  {
    return GetDimensionalityMinValue_5();
  }

  private native int GetDimensionalityMaxValue_6();
  public int GetDimensionalityMaxValue()
  {
    return GetDimensionalityMaxValue_6();
  }

  private native int GetDimensionality_7();
  public int GetDimensionality()
  {
    return GetDimensionality_7();
  }

  public vtkImageLaplacian() { super(); }

  public vtkImageLaplacian(long id) { super(id); }
  public native long   VTKInit();

}
