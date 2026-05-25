// java wrapper for vtkForceStaticMesh object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkForceStaticMesh extends vtkPassThrough
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

  private native void SetForceCacheComputation_4(boolean id0);
  public void SetForceCacheComputation(boolean id0)
  {
    SetForceCacheComputation_4(id0);
  }

  private native boolean GetForceCacheComputation_5();
  public boolean GetForceCacheComputation()
  {
    return GetForceCacheComputation_5();
  }

  private native void ForceCacheComputationOn_6();
  public void ForceCacheComputationOn()
  {
    ForceCacheComputationOn_6();
  }

  private native void ForceCacheComputationOff_7();
  public void ForceCacheComputationOff()
  {
    ForceCacheComputationOff_7();
  }

  public vtkForceStaticMesh() { super(); }

  public vtkForceStaticMesh(long id) { super(id); }
  public native long   VTKInit();

}
