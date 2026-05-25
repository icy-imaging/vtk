// java wrapper for vtkTableToArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTableToArray extends vtkArrayDataAlgorithm
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

  private native void ClearColumns_4();
  public void ClearColumns()
  {
    ClearColumns_4();
  }

  private native void AddColumn_5(byte[] id0, int len0);
  public void AddColumn(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddColumn_5(bytes0, bytes0.length);
  }

  private native void AddColumn_6(long id0);
  public void AddColumn(long id0)
  {
    AddColumn_6(id0);
  }

  private native void AddAllColumns_7();
  public void AddAllColumns()
  {
    AddAllColumns_7();
  }

  public vtkTableToArray() { super(); }

  public vtkTableToArray(long id) { super(id); }
  public native long   VTKInit();

}
