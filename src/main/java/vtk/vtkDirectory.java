// java wrapper for vtkDirectory object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDirectory extends vtkObject
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

  private native int Open_4(byte[] id0, int len0);
  public int Open(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Open_4(bytes0, bytes0.length);
  }

  private native long GetNumberOfFiles_5();
  public long GetNumberOfFiles()
  {
    return GetNumberOfFiles_5();
  }

  private native byte[] GetFile_6(long id0);
  public String GetFile(long id0)
  {
    return new String(GetFile_6(id0), StandardCharsets.UTF_8);
  }

  private native int FileIsDirectory_7(byte[] id0, int len0);
  public int FileIsDirectory(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return FileIsDirectory_7(bytes0, bytes0.length);
  }

  private native long GetFiles_8();
  public vtkStringArray GetFiles()
  {
    long temp = GetFiles_8();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetCurrentWorkingDirectory_9(byte[] id0, int len0,int id1);
  public String GetCurrentWorkingDirectory(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(GetCurrentWorkingDirectory_9(bytes0, bytes0.length,id1), StandardCharsets.UTF_8);
  }

  private native int MakeDirectory_10(byte[] id0, int len0);
  public int MakeDirectory(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return MakeDirectory_10(bytes0, bytes0.length);
  }

  private native int DeleteDirectory_11(byte[] id0, int len0);
  public int DeleteDirectory(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return DeleteDirectory_11(bytes0, bytes0.length);
  }

  private native int Rename_12(byte[] id0, int len0,byte[] id1, int len1);
  public int Rename(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return Rename_12(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  public vtkDirectory() { super(); }

  public vtkDirectory(long id) { super(id); }
  public native long   VTKInit();

}
