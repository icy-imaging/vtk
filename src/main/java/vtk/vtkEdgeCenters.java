// java wrapper for vtkEdgeCenters object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEdgeCenters extends vtkPolyDataAlgorithm
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

  private native void SetVertexCells_4(int id0);
  public void SetVertexCells(int id0)
  {
    SetVertexCells_4(id0);
  }

  private native int GetVertexCells_5();
  public int GetVertexCells()
  {
    return GetVertexCells_5();
  }

  private native void VertexCellsOn_6();
  public void VertexCellsOn()
  {
    VertexCellsOn_6();
  }

  private native void VertexCellsOff_7();
  public void VertexCellsOff()
  {
    VertexCellsOff_7();
  }

  public vtkEdgeCenters() { super(); }

  public vtkEdgeCenters(long id) { super(id); }
  public native long   VTKInit();

}
