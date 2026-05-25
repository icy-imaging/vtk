// java wrapper for vtkDatabaseToTableReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDatabaseToTableReader extends vtkTableAlgorithm
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

  private native boolean SetDatabase_4(vtkSQLDatabase id0);
  public boolean SetDatabase(vtkSQLDatabase id0)
  {
    return SetDatabase_4(id0);
  }

  private native boolean SetTableName_5(byte[] id0, int len0);
  public boolean SetTableName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetTableName_5(bytes0, bytes0.length);
  }

  private native boolean CheckIfTableExists_6();
  public boolean CheckIfTableExists()
  {
    return CheckIfTableExists_6();
  }

  private native long GetDatabase_7();
  public vtkSQLDatabase GetDatabase()
  {
    long temp = GetDatabase_7();

    if (temp == 0) return null;
    return (vtkSQLDatabase)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkDatabaseToTableReader() { super(); }

  public vtkDatabaseToTableReader(long id) { super(id); }

}
