// java wrapper for vtkGenerateIndexArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenerateIndexArray extends vtkDataObjectAlgorithm
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

  private native void SetArrayName_4(byte[] id0, int len0);
  public void SetArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetArrayName_4(bytes0, bytes0.length);
  }

  private native byte[] GetArrayName_5();
  public String GetArrayName()
  {
    return new String(GetArrayName_5(), StandardCharsets.UTF_8);
  }

  private native void SetFieldType_6(int id0);
  public void SetFieldType(int id0)
  {
    SetFieldType_6(id0);
  }

  private native int GetFieldType_7();
  public int GetFieldType()
  {
    return GetFieldType_7();
  }

  private native void SetReferenceArrayName_8(byte[] id0, int len0);
  public void SetReferenceArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetReferenceArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetReferenceArrayName_9();
  public String GetReferenceArrayName()
  {
    return new String(GetReferenceArrayName_9(), StandardCharsets.UTF_8);
  }

  private native void SetPedigreeID_10(int id0);
  public void SetPedigreeID(int id0)
  {
    SetPedigreeID_10(id0);
  }

  private native int GetPedigreeID_11();
  public int GetPedigreeID()
  {
    return GetPedigreeID_11();
  }

  public vtkGenerateIndexArray() { super(); }

  public vtkGenerateIndexArray(long id) { super(id); }
  public native long   VTKInit();

}
