// java wrapper for vtkSQLiteQuery object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSQLiteQuery extends vtkSQLQuery
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

  private native boolean SetQuery_4(byte[] id0, int len0);
  public boolean SetQuery(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetQuery_4(bytes0, bytes0.length);
  }

  private native boolean Execute_5();
  public boolean Execute()
  {
    return Execute_5();
  }

  private native int GetNumberOfFields_6();
  public int GetNumberOfFields()
  {
    return GetNumberOfFields_6();
  }

  private native byte[] GetFieldName_7(int id0);
  public String GetFieldName(int id0)
  {
    return new String(GetFieldName_7(id0), StandardCharsets.UTF_8);
  }

  private native int GetFieldType_8(int id0);
  public int GetFieldType(int id0)
  {
    return GetFieldType_8(id0);
  }

  private native boolean NextRow_9();
  public boolean NextRow()
  {
    return NextRow_9();
  }

  private native boolean HasError_10();
  public boolean HasError()
  {
    return HasError_10();
  }

  private native boolean BeginTransaction_11();
  public boolean BeginTransaction()
  {
    return BeginTransaction_11();
  }

  private native boolean RollbackTransaction_12();
  public boolean RollbackTransaction()
  {
    return RollbackTransaction_12();
  }

  private native boolean CommitTransaction_13();
  public boolean CommitTransaction()
  {
    return CommitTransaction_13();
  }

  private native byte[] GetLastErrorText_14();
  public String GetLastErrorText()
  {
    return new String(GetLastErrorText_14(), StandardCharsets.UTF_8);
  }

  private native boolean BindParameter_15(int id0,byte id1);
  public boolean BindParameter(int id0,byte id1)
  {
    return BindParameter_15(id0,id1);
  }

  private native boolean BindParameter_16(int id0,short id1);
  public boolean BindParameter(int id0,short id1)
  {
    return BindParameter_16(id0,id1);
  }

  private native boolean BindParameter_17(int id0,int id1);
  public boolean BindParameter(int id0,int id1)
  {
    return BindParameter_17(id0,id1);
  }

  private native boolean BindParameter_18(int id0,long id1);
  public boolean BindParameter(int id0,long id1)
  {
    return BindParameter_18(id0,id1);
  }

  private native boolean BindParameter_19(int id0,float id1);
  public boolean BindParameter(int id0,float id1)
  {
    return BindParameter_19(id0,id1);
  }

  private native boolean BindParameter_20(int id0,double id1);
  public boolean BindParameter(int id0,double id1)
  {
    return BindParameter_20(id0,id1);
  }

  private native boolean BindParameter_21(int id0,byte[] id1, int len1);
  public boolean BindParameter(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return BindParameter_21(id0,bytes1, bytes1.length);
  }

  private native boolean ClearParameterBindings_22();
  public boolean ClearParameterBindings()
  {
    return ClearParameterBindings_22();
  }

  public vtkSQLiteQuery() { super(); }

  public vtkSQLiteQuery(long id) { super(id); }
  public native long   VTKInit();

}
