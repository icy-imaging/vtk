// java wrapper for vtkConvertToPolyhedra object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkConvertToPolyhedra extends vtkUnstructuredGridAlgorithm
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

  private native void SetOutputAllCells_4(boolean id0);
  public void SetOutputAllCells(boolean id0)
  {
    SetOutputAllCells_4(id0);
  }

  private native boolean GetOutputAllCells_5();
  public boolean GetOutputAllCells()
  {
    return GetOutputAllCells_5();
  }

  private native void OutputAllCellsOn_6();
  public void OutputAllCellsOn()
  {
    OutputAllCellsOn_6();
  }

  private native void OutputAllCellsOff_7();
  public void OutputAllCellsOff()
  {
    OutputAllCellsOff_7();
  }

  public vtkConvertToPolyhedra() { super(); }

  public vtkConvertToPolyhedra(long id) { super(id); }
  public native long   VTKInit();

}
