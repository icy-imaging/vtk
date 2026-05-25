// java wrapper for vtkSQLDatabaseTableSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSQLDatabaseTableSource extends vtkTableAlgorithm
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

  private native byte[] GetURL_4();
  public String GetURL()
  {
    return new String(GetURL_4(), StandardCharsets.UTF_8);
  }

  private native void SetURL_5(byte[] id0, int len0);
  public void SetURL(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetURL_5(bytes0, bytes0.length);
  }

  private native void SetPassword_6(byte[] id0, int len0);
  public void SetPassword(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPassword_6(bytes0, bytes0.length);
  }

  private native byte[] GetQuery_7();
  public String GetQuery()
  {
    return new String(GetQuery_7(), StandardCharsets.UTF_8);
  }

  private native void SetQuery_8(byte[] id0, int len0);
  public void SetQuery(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetQuery_8(bytes0, bytes0.length);
  }

  private native void SetPedigreeIdArrayName_9(byte[] id0, int len0);
  public void SetPedigreeIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPedigreeIdArrayName_9(bytes0, bytes0.length);
  }

  private native byte[] GetPedigreeIdArrayName_10();
  public String GetPedigreeIdArrayName()
  {
    return new String(GetPedigreeIdArrayName_10(), StandardCharsets.UTF_8);
  }

  private native void SetGeneratePedigreeIds_11(boolean id0);
  public void SetGeneratePedigreeIds(boolean id0)
  {
    SetGeneratePedigreeIds_11(id0);
  }

  private native boolean GetGeneratePedigreeIds_12();
  public boolean GetGeneratePedigreeIds()
  {
    return GetGeneratePedigreeIds_12();
  }

  private native void GeneratePedigreeIdsOn_13();
  public void GeneratePedigreeIdsOn()
  {
    GeneratePedigreeIdsOn_13();
  }

  private native void GeneratePedigreeIdsOff_14();
  public void GeneratePedigreeIdsOff()
  {
    GeneratePedigreeIdsOff_14();
  }

  public vtkSQLDatabaseTableSource() { super(); }

  public vtkSQLDatabaseTableSource(long id) { super(id); }
  public native long   VTKInit();

}
