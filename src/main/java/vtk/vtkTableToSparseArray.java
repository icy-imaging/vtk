// java wrapper for vtkTableToSparseArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTableToSparseArray extends vtkArrayDataAlgorithm
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

  private native void ClearCoordinateColumns_4();
  public void ClearCoordinateColumns()
  {
    ClearCoordinateColumns_4();
  }

  private native void AddCoordinateColumn_5(byte[] id0, int len0);
  public void AddCoordinateColumn(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddCoordinateColumn_5(bytes0, bytes0.length);
  }

  private native void SetValueColumn_6(byte[] id0, int len0);
  public void SetValueColumn(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetValueColumn_6(bytes0, bytes0.length);
  }

  private native byte[] GetValueColumn_7();
  public String GetValueColumn()
  {
    return new String(GetValueColumn_7(), StandardCharsets.UTF_8);
  }

  private native void ClearOutputExtents_8();
  public void ClearOutputExtents()
  {
    ClearOutputExtents_8();
  }

  public vtkTableToSparseArray() { super(); }

  public vtkTableToSparseArray(long id) { super(id); }
  public native long   VTKInit();

}
