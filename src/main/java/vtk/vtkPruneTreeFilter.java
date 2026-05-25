// java wrapper for vtkPruneTreeFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPruneTreeFilter extends vtkTreeAlgorithm
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

  private native long GetParentVertex_4();
  public long GetParentVertex()
  {
    return GetParentVertex_4();
  }

  private native void SetParentVertex_5(long id0);
  public void SetParentVertex(long id0)
  {
    SetParentVertex_5(id0);
  }

  private native boolean GetShouldPruneParentVertex_6();
  public boolean GetShouldPruneParentVertex()
  {
    return GetShouldPruneParentVertex_6();
  }

  private native void SetShouldPruneParentVertex_7(boolean id0);
  public void SetShouldPruneParentVertex(boolean id0)
  {
    SetShouldPruneParentVertex_7(id0);
  }

  public vtkPruneTreeFilter() { super(); }

  public vtkPruneTreeFilter(long id) { super(id); }
  public native long   VTKInit();

}
