// java wrapper for vtkSQLDatabase object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSQLDatabase extends vtkObject
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

  private native void Close_5();
  public void Close()
  {
    Close_5();
  }

  private native boolean IsOpen_6();
  public boolean IsOpen()
  {
    return IsOpen_6();
  }

  private native long GetQueryInstance_7();
  public vtkSQLQuery GetQueryInstance()
  {
    long temp = GetQueryInstance_7();

    if (temp == 0) return null;
    return (vtkSQLQuery)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean HasError_8();
  public boolean HasError()
  {
    return HasError_8();
  }

  private native byte[] GetLastErrorText_9();
  public String GetLastErrorText()
  {
    return new String(GetLastErrorText_9(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDatabaseType_10();
  public String GetDatabaseType()
  {
    return new String(GetDatabaseType_10(), StandardCharsets.UTF_8);
  }

  private native long GetTables_11();
  public vtkStringArray GetTables()
  {
    long temp = GetTables_11();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRecord_12(byte[] id0, int len0);
  public vtkStringArray GetRecord(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetRecord_12(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean IsSupported_13(int id0);
  public boolean IsSupported(int id0)
  {
    return IsSupported_13(id0);
  }

  private native byte[] GetURL_14();
  public String GetURL()
  {
    return new String(GetURL_14(), StandardCharsets.UTF_8);
  }

  private native byte[] GetTablePreamble_15(boolean id0);
  public String GetTablePreamble(boolean id0)
  {
    return new String(GetTablePreamble_15(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetColumnSpecification_16(vtkSQLDatabaseSchema id0,int id1,int id2);
  public String GetColumnSpecification(vtkSQLDatabaseSchema id0,int id1,int id2)
  {
    return new String(GetColumnSpecification_16(id0,id1,id2), StandardCharsets.UTF_8);
  }

  private native byte[] GetTriggerSpecification_17(vtkSQLDatabaseSchema id0,int id1,int id2);
  public String GetTriggerSpecification(vtkSQLDatabaseSchema id0,int id1,int id2)
  {
    return new String(GetTriggerSpecification_17(id0,id1,id2), StandardCharsets.UTF_8);
  }

  private native long CreateFromURL_18(byte[] id0, int len0);
  public vtkSQLDatabase CreateFromURL(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = CreateFromURL_18(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkSQLDatabase)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean EffectSchema_19(vtkSQLDatabaseSchema id0,boolean id1);
  public boolean EffectSchema(vtkSQLDatabaseSchema id0,boolean id1)
  {
    return EffectSchema_19(id0,id1);
  }

  private native void UnRegisterAllCreateFromURLCallbacks_20();
  public void UnRegisterAllCreateFromURLCallbacks()
  {
    UnRegisterAllCreateFromURLCallbacks_20();
  }

  private native long DATABASE_21();
  public vtkInformationObjectBaseKey DATABASE()
  {
    long temp = DATABASE_21();

    if (temp == 0) return null;
    return (vtkInformationObjectBaseKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkSQLDatabase() { super(); }

  public vtkSQLDatabase(long id) { super(id); }

}
