// java wrapper for vtkAggregateDataSetFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAggregateDataSetFilter extends vtkPassInputTypeAlgorithm
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

  private native void SetNumberOfTargetProcesses_4(int id0);
  public void SetNumberOfTargetProcesses(int id0)
  {
    SetNumberOfTargetProcesses_4(id0);
  }

  private native int GetNumberOfTargetProcesses_5();
  public int GetNumberOfTargetProcesses()
  {
    return GetNumberOfTargetProcesses_5();
  }

  private native void SetMergePoints_6(boolean id0);
  public void SetMergePoints(boolean id0)
  {
    SetMergePoints_6(id0);
  }

  private native boolean GetMergePoints_7();
  public boolean GetMergePoints()
  {
    return GetMergePoints_7();
  }

  private native void MergePointsOn_8();
  public void MergePointsOn()
  {
    MergePointsOn_8();
  }

  private native void MergePointsOff_9();
  public void MergePointsOff()
  {
    MergePointsOff_9();
  }

  public vtkAggregateDataSetFilter() { super(); }

  public vtkAggregateDataSetFilter(long id) { super(id); }
  public native long   VTKInit();

}
