// java wrapper for vtkSurfaceReconstructionFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSurfaceReconstructionFilter extends vtkImageAlgorithm
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

  private native int GetNeighborhoodSize_4();
  public int GetNeighborhoodSize()
  {
    return GetNeighborhoodSize_4();
  }

  private native void SetNeighborhoodSize_5(int id0);
  public void SetNeighborhoodSize(int id0)
  {
    SetNeighborhoodSize_5(id0);
  }

  private native double GetSampleSpacing_6();
  public double GetSampleSpacing()
  {
    return GetSampleSpacing_6();
  }

  private native void SetSampleSpacing_7(double id0);
  public void SetSampleSpacing(double id0)
  {
    SetSampleSpacing_7(id0);
  }

  public vtkSurfaceReconstructionFilter() { super(); }

  public vtkSurfaceReconstructionFilter(long id) { super(id); }
  public native long   VTKInit();

}
