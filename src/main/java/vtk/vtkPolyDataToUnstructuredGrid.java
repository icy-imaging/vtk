// java wrapper for vtkPolyDataToUnstructuredGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyDataToUnstructuredGrid extends vtkUnstructuredGridAlgorithm
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

  private native boolean CanBeProcessedFast_4(vtkPolyData id0);
  public boolean CanBeProcessedFast(vtkPolyData id0)
  {
    return CanBeProcessedFast_4(id0);
  }

  public vtkPolyDataToUnstructuredGrid() { super(); }

  public vtkPolyDataToUnstructuredGrid(long id) { super(id); }
  public native long   VTKInit();

}
