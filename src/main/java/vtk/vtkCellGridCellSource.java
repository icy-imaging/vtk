// java wrapper for vtkCellGridCellSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellGridCellSource extends vtkCellGridAlgorithm
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

  private native void SetCellType_4(byte[] id0, int len0);
  public void SetCellType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellType_4(bytes0, bytes0.length);
  }

  private native byte[] GetCellType_5();
  public String GetCellType()
  {
    return new String(GetCellType_5(), StandardCharsets.UTF_8);
  }

  public vtkCellGridCellSource() { super(); }

  public vtkCellGridCellSource(long id) { super(id); }
  public native long   VTKInit();

}
