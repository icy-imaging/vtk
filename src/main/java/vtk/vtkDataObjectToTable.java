// java wrapper for vtkDataObjectToTable object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataObjectToTable extends vtkTableAlgorithm
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

  private native int GetFieldType_4();
  public int GetFieldType()
  {
    return GetFieldType_4();
  }

  private native void SetFieldType_5(int id0);
  public void SetFieldType(int id0)
  {
    SetFieldType_5(id0);
  }

  private native int GetFieldTypeMinValue_6();
  public int GetFieldTypeMinValue()
  {
    return GetFieldTypeMinValue_6();
  }

  private native int GetFieldTypeMaxValue_7();
  public int GetFieldTypeMaxValue()
  {
    return GetFieldTypeMaxValue_7();
  }

  public vtkDataObjectToTable() { super(); }

  public vtkDataObjectToTable(long id) { super(id); }
  public native long   VTKInit();

}
