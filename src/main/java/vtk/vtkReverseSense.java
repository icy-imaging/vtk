// java wrapper for vtkReverseSense object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkReverseSense extends vtkPolyDataAlgorithm
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

  private native void SetReverseCells_4(int id0);
  public void SetReverseCells(int id0)
  {
    SetReverseCells_4(id0);
  }

  private native int GetReverseCells_5();
  public int GetReverseCells()
  {
    return GetReverseCells_5();
  }

  private native void ReverseCellsOn_6();
  public void ReverseCellsOn()
  {
    ReverseCellsOn_6();
  }

  private native void ReverseCellsOff_7();
  public void ReverseCellsOff()
  {
    ReverseCellsOff_7();
  }

  private native void SetReverseNormals_8(int id0);
  public void SetReverseNormals(int id0)
  {
    SetReverseNormals_8(id0);
  }

  private native int GetReverseNormals_9();
  public int GetReverseNormals()
  {
    return GetReverseNormals_9();
  }

  private native void ReverseNormalsOn_10();
  public void ReverseNormalsOn()
  {
    ReverseNormalsOn_10();
  }

  private native void ReverseNormalsOff_11();
  public void ReverseNormalsOff()
  {
    ReverseNormalsOff_11();
  }

  public vtkReverseSense() { super(); }

  public vtkReverseSense(long id) { super(id); }
  public native long   VTKInit();

}
