// java wrapper for vtkReduceTable object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkReduceTable extends vtkTableAlgorithm
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

  private native long GetIndexColumn_4();
  public long GetIndexColumn()
  {
    return GetIndexColumn_4();
  }

  private native void SetIndexColumn_5(long id0);
  public void SetIndexColumn(long id0)
  {
    SetIndexColumn_5(id0);
  }

  private native int GetNumericalReductionMethod_6();
  public int GetNumericalReductionMethod()
  {
    return GetNumericalReductionMethod_6();
  }

  private native void SetNumericalReductionMethod_7(int id0);
  public void SetNumericalReductionMethod(int id0)
  {
    SetNumericalReductionMethod_7(id0);
  }

  private native int GetNonNumericalReductionMethod_8();
  public int GetNonNumericalReductionMethod()
  {
    return GetNonNumericalReductionMethod_8();
  }

  private native void SetNonNumericalReductionMethod_9(int id0);
  public void SetNonNumericalReductionMethod(int id0)
  {
    SetNonNumericalReductionMethod_9(id0);
  }

  private native int GetReductionMethodForColumn_10(long id0);
  public int GetReductionMethodForColumn(long id0)
  {
    return GetReductionMethodForColumn_10(id0);
  }

  private native void SetReductionMethodForColumn_11(long id0,int id1);
  public void SetReductionMethodForColumn(long id0,int id1)
  {
    SetReductionMethodForColumn_11(id0,id1);
  }

  public vtkReduceTable() { super(); }

  public vtkReduceTable(long id) { super(id); }
  public native long   VTKInit();

}
