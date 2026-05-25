// java wrapper for vtkSQLQuery object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSQLQuery extends vtkRowQuery
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

  private native byte[] GetQuery_5();
  public String GetQuery()
  {
    return new String(GetQuery_5(), StandardCharsets.UTF_8);
  }

  private native boolean IsActive_6();
  public boolean IsActive()
  {
    return IsActive_6();
  }

  private native boolean Execute_7();
  public boolean Execute()
  {
    return Execute_7();
  }

  private native boolean BeginTransaction_8();
  public boolean BeginTransaction()
  {
    return BeginTransaction_8();
  }

  private native boolean CommitTransaction_9();
  public boolean CommitTransaction()
  {
    return CommitTransaction_9();
  }

  private native boolean RollbackTransaction_10();
  public boolean RollbackTransaction()
  {
    return RollbackTransaction_10();
  }

  private native long GetDatabase_11();
  public vtkSQLDatabase GetDatabase()
  {
    long temp = GetDatabase_11();

    if (temp == 0) return null;
    return (vtkSQLDatabase)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean BindParameter_12(int id0,byte id1);
  public boolean BindParameter(int id0,byte id1)
  {
    return BindParameter_12(id0,id1);
  }

  private native boolean BindParameter_13(int id0,short id1);
  public boolean BindParameter(int id0,short id1)
  {
    return BindParameter_13(id0,id1);
  }

  private native boolean BindParameter_14(int id0,int id1);
  public boolean BindParameter(int id0,int id1)
  {
    return BindParameter_14(id0,id1);
  }

  private native boolean BindParameter_15(int id0,long id1);
  public boolean BindParameter(int id0,long id1)
  {
    return BindParameter_15(id0,id1);
  }

  private native boolean BindParameter_16(int id0,float id1);
  public boolean BindParameter(int id0,float id1)
  {
    return BindParameter_16(id0,id1);
  }

  private native boolean BindParameter_17(int id0,double id1);
  public boolean BindParameter(int id0,double id1)
  {
    return BindParameter_17(id0,id1);
  }

  private native boolean BindParameter_18(int id0,byte[] id1, int len1);
  public boolean BindParameter(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return BindParameter_18(id0,bytes1, bytes1.length);
  }

  private native boolean ClearParameterBindings_19();
  public boolean ClearParameterBindings()
  {
    return ClearParameterBindings_19();
  }

  private native byte[] EscapeString_20(byte[] id0, int len0,boolean id1);
  public String EscapeString(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(EscapeString_20(bytes0, bytes0.length,id1), StandardCharsets.UTF_8);
  }

  public vtkSQLQuery() { super(); }

  public vtkSQLQuery(long id) { super(id); }

}
