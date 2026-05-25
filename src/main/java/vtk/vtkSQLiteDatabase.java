// java wrapper for vtkSQLiteDatabase object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSQLiteDatabase extends vtkSQLDatabase
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

  private native boolean Open_4(byte[] id0, int len0);
  public boolean Open(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Open_4(bytes0, bytes0.length);
  }

  private native boolean Open_5(byte[] id0, int len0,int id1);
  public boolean Open(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Open_5(bytes0, bytes0.length,id1);
  }

  private native void Close_6();
  public void Close()
  {
    Close_6();
  }

  private native boolean IsOpen_7();
  public boolean IsOpen()
  {
    return IsOpen_7();
  }

  private native long GetQueryInstance_8();
  public vtkSQLQuery GetQueryInstance()
  {
    long temp = GetQueryInstance_8();

    if (temp == 0) return null;
    return (vtkSQLQuery)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTables_9();
  public vtkStringArray GetTables()
  {
    long temp = GetTables_9();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRecord_10(byte[] id0, int len0);
  public vtkStringArray GetRecord(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetRecord_10(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean IsSupported_11(int id0);
  public boolean IsSupported(int id0)
  {
    return IsSupported_11(id0);
  }

  private native boolean HasError_12();
  public boolean HasError()
  {
    return HasError_12();
  }

  private native byte[] GetLastErrorText_13();
  public String GetLastErrorText()
  {
    return new String(GetLastErrorText_13(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDatabaseType_14();
  public String GetDatabaseType()
  {
    return new String(GetDatabaseType_14(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDatabaseFileName_15();
  public String GetDatabaseFileName()
  {
    return new String(GetDatabaseFileName_15(), StandardCharsets.UTF_8);
  }

  private native void SetDatabaseFileName_16(byte[] id0, int len0);
  public void SetDatabaseFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDatabaseFileName_16(bytes0, bytes0.length);
  }

  private native byte[] GetURL_17();
  public String GetURL()
  {
    return new String(GetURL_17(), StandardCharsets.UTF_8);
  }

  private native byte[] GetColumnSpecification_18(vtkSQLDatabaseSchema id0,int id1,int id2);
  public String GetColumnSpecification(vtkSQLDatabaseSchema id0,int id1,int id2)
  {
    return new String(GetColumnSpecification_18(id0,id1,id2), StandardCharsets.UTF_8);
  }

  public vtkSQLiteDatabase() { super(); }

  public vtkSQLiteDatabase(long id) { super(id); }
  public native long   VTKInit();

}
