// java wrapper for vtkSparseArrayToTable object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSparseArrayToTable extends vtkTableAlgorithm
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

  private native byte[] GetValueColumn_4();
  public String GetValueColumn()
  {
    return new String(GetValueColumn_4(), StandardCharsets.UTF_8);
  }

  private native void SetValueColumn_5(byte[] id0, int len0);
  public void SetValueColumn(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetValueColumn_5(bytes0, bytes0.length);
  }

  public vtkSparseArrayToTable() { super(); }

  public vtkSparseArrayToTable(long id) { super(id); }
  public native long   VTKInit();

}
