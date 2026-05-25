// java wrapper for vtkExtractPolyDataPiece object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractPolyDataPiece extends vtkPolyDataAlgorithm
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

  private native void SetCreateGhostCells_4(int id0);
  public void SetCreateGhostCells(int id0)
  {
    SetCreateGhostCells_4(id0);
  }

  private native int GetCreateGhostCells_5();
  public int GetCreateGhostCells()
  {
    return GetCreateGhostCells_5();
  }

  private native void CreateGhostCellsOn_6();
  public void CreateGhostCellsOn()
  {
    CreateGhostCellsOn_6();
  }

  private native void CreateGhostCellsOff_7();
  public void CreateGhostCellsOff()
  {
    CreateGhostCellsOff_7();
  }

  public vtkExtractPolyDataPiece() { super(); }

  public vtkExtractPolyDataPiece(long id) { super(id); }
  public native long   VTKInit();

}
