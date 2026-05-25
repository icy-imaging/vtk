// java wrapper for vtkCellCenters object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellCenters extends vtkPolyDataAlgorithm
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

  private native void SetVertexCells_4(boolean id0);
  public void SetVertexCells(boolean id0)
  {
    SetVertexCells_4(id0);
  }

  private native boolean GetVertexCells_5();
  public boolean GetVertexCells()
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

  private native void SetCopyArrays_8(boolean id0);
  public void SetCopyArrays(boolean id0)
  {
    SetCopyArrays_8(id0);
  }

  private native boolean GetCopyArrays_9();
  public boolean GetCopyArrays()
  {
    return GetCopyArrays_9();
  }

  private native void CopyArraysOn_10();
  public void CopyArraysOn()
  {
    CopyArraysOn_10();
  }

  private native void CopyArraysOff_11();
  public void CopyArraysOff()
  {
    CopyArraysOff_11();
  }

  private native void SetConvertGhostCellsToGhostPoints_12(boolean id0);
  public void SetConvertGhostCellsToGhostPoints(boolean id0)
  {
    SetConvertGhostCellsToGhostPoints_12(id0);
  }

  private native boolean GetConvertGhostCellsToGhostPoints_13();
  public boolean GetConvertGhostCellsToGhostPoints()
  {
    return GetConvertGhostCellsToGhostPoints_13();
  }

  private native void ConvertGhostCellsToGhostPointsOn_14();
  public void ConvertGhostCellsToGhostPointsOn()
  {
    ConvertGhostCellsToGhostPointsOn_14();
  }

  private native void ConvertGhostCellsToGhostPointsOff_15();
  public void ConvertGhostCellsToGhostPointsOff()
  {
    ConvertGhostCellsToGhostPointsOff_15();
  }

  private native void ComputeCellCenters_16(vtkDataSet id0,vtkDoubleArray id1);
  public void ComputeCellCenters(vtkDataSet id0,vtkDoubleArray id1)
  {
    ComputeCellCenters_16(id0,id1);
  }

  public vtkCellCenters() { super(); }

  public vtkCellCenters(long id) { super(id); }
  public native long   VTKInit();

}
