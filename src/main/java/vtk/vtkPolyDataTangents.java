// java wrapper for vtkPolyDataTangents object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyDataTangents extends vtkPolyDataAlgorithm
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

  private native void SetComputePointTangents_4(boolean id0);
  public void SetComputePointTangents(boolean id0)
  {
    SetComputePointTangents_4(id0);
  }

  private native boolean GetComputePointTangents_5();
  public boolean GetComputePointTangents()
  {
    return GetComputePointTangents_5();
  }

  private native void ComputePointTangentsOn_6();
  public void ComputePointTangentsOn()
  {
    ComputePointTangentsOn_6();
  }

  private native void ComputePointTangentsOff_7();
  public void ComputePointTangentsOff()
  {
    ComputePointTangentsOff_7();
  }

  private native void SetComputeCellTangents_8(boolean id0);
  public void SetComputeCellTangents(boolean id0)
  {
    SetComputeCellTangents_8(id0);
  }

  private native boolean GetComputeCellTangents_9();
  public boolean GetComputeCellTangents()
  {
    return GetComputeCellTangents_9();
  }

  private native void ComputeCellTangentsOn_10();
  public void ComputeCellTangentsOn()
  {
    ComputeCellTangentsOn_10();
  }

  private native void ComputeCellTangentsOff_11();
  public void ComputeCellTangentsOff()
  {
    ComputeCellTangentsOff_11();
  }

  public vtkPolyDataTangents() { super(); }

  public vtkPolyDataTangents(long id) { super(id); }
  public native long   VTKInit();

}
