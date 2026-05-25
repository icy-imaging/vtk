// java wrapper for vtkRowQuery object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRowQuery extends vtkObject
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

  private native boolean Execute_4();
  public boolean Execute()
  {
    return Execute_4();
  }

  private native int GetNumberOfFields_5();
  public int GetNumberOfFields()
  {
    return GetNumberOfFields_5();
  }

  private native byte[] GetFieldName_6(int id0);
  public String GetFieldName(int id0)
  {
    return new String(GetFieldName_6(id0), StandardCharsets.UTF_8);
  }

  private native int GetFieldType_7(int id0);
  public int GetFieldType(int id0)
  {
    return GetFieldType_7(id0);
  }

  private native int GetFieldIndex_8(byte[] id0, int len0);
  public int GetFieldIndex(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetFieldIndex_8(bytes0, bytes0.length);
  }

  private native boolean NextRow_9();
  public boolean NextRow()
  {
    return NextRow_9();
  }

  private native boolean IsActive_10();
  public boolean IsActive()
  {
    return IsActive_10();
  }

  private native boolean NextRow_11(vtkVariantArray id0);
  public boolean NextRow(vtkVariantArray id0)
  {
    return NextRow_11(id0);
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

  private native void SetCaseSensitiveFieldNames_14(boolean id0);
  public void SetCaseSensitiveFieldNames(boolean id0)
  {
    SetCaseSensitiveFieldNames_14(id0);
  }

  private native boolean GetCaseSensitiveFieldNames_15();
  public boolean GetCaseSensitiveFieldNames()
  {
    return GetCaseSensitiveFieldNames_15();
  }

  private native void CaseSensitiveFieldNamesOn_16();
  public void CaseSensitiveFieldNamesOn()
  {
    CaseSensitiveFieldNamesOn_16();
  }

  private native void CaseSensitiveFieldNamesOff_17();
  public void CaseSensitiveFieldNamesOff()
  {
    CaseSensitiveFieldNamesOff_17();
  }

  public vtkRowQuery() { super(); }

  public vtkRowQuery(long id) { super(id); }

}
