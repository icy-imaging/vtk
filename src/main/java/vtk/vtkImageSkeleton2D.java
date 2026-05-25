// java wrapper for vtkImageSkeleton2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageSkeleton2D extends vtkImageIterateFilter
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

  private native void SetPrune_4(int id0);
  public void SetPrune(int id0)
  {
    SetPrune_4(id0);
  }

  private native int GetPrune_5();
  public int GetPrune()
  {
    return GetPrune_5();
  }

  private native void PruneOn_6();
  public void PruneOn()
  {
    PruneOn_6();
  }

  private native void PruneOff_7();
  public void PruneOff()
  {
    PruneOff_7();
  }

  private native void SetNumberOfIterations_8(int id0);
  public void SetNumberOfIterations(int id0)
  {
    SetNumberOfIterations_8(id0);
  }

  public vtkImageSkeleton2D() { super(); }

  public vtkImageSkeleton2D(long id) { super(id); }
  public native long   VTKInit();

}
