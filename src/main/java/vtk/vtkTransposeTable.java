// java wrapper for vtkTransposeTable object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTransposeTable extends vtkTableAlgorithm
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

  private native boolean GetAddIdColumn_4();
  public boolean GetAddIdColumn()
  {
    return GetAddIdColumn_4();
  }

  private native void SetAddIdColumn_5(boolean id0);
  public void SetAddIdColumn(boolean id0)
  {
    SetAddIdColumn_5(id0);
  }

  private native void AddIdColumnOn_6();
  public void AddIdColumnOn()
  {
    AddIdColumnOn_6();
  }

  private native void AddIdColumnOff_7();
  public void AddIdColumnOff()
  {
    AddIdColumnOff_7();
  }

  private native boolean GetUseIdColumn_8();
  public boolean GetUseIdColumn()
  {
    return GetUseIdColumn_8();
  }

  private native void SetUseIdColumn_9(boolean id0);
  public void SetUseIdColumn(boolean id0)
  {
    SetUseIdColumn_9(id0);
  }

  private native void UseIdColumnOn_10();
  public void UseIdColumnOn()
  {
    UseIdColumnOn_10();
  }

  private native void UseIdColumnOff_11();
  public void UseIdColumnOff()
  {
    UseIdColumnOff_11();
  }

  private native byte[] GetIdColumnName_12();
  public String GetIdColumnName()
  {
    return new String(GetIdColumnName_12(), StandardCharsets.UTF_8);
  }

  private native void SetIdColumnName_13(byte[] id0, int len0);
  public void SetIdColumnName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetIdColumnName_13(bytes0, bytes0.length);
  }

  public vtkTransposeTable() { super(); }

  public vtkTransposeTable(long id) { super(id); }
  public native long   VTKInit();

}
