// java wrapper for vtkHyperTreeGridToUnstructuredGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridToUnstructuredGrid extends vtkHyperTreeGridAlgorithm
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

  private native boolean GetAddOriginalIds_4();
  public boolean GetAddOriginalIds()
  {
    return GetAddOriginalIds_4();
  }

  private native void SetAddOriginalIds_5(boolean id0);
  public void SetAddOriginalIds(boolean id0)
  {
    SetAddOriginalIds_5(id0);
  }

  private native void AddOriginalIdsOn_6();
  public void AddOriginalIdsOn()
  {
    AddOriginalIdsOn_6();
  }

  private native void AddOriginalIdsOff_7();
  public void AddOriginalIdsOff()
  {
    AddOriginalIdsOff_7();
  }

  public vtkHyperTreeGridToUnstructuredGrid() { super(); }

  public vtkHyperTreeGridToUnstructuredGrid(long id) { super(id); }
  public native long   VTKInit();

}
