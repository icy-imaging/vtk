// java wrapper for vtkPDirectory object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPDirectory extends vtkObject
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

  private native boolean Load_4(byte[] id0, int len0);
  public boolean Load(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Load_4(bytes0, bytes0.length);
  }

  private native int Open_5(byte[] id0, int len0);
  public int Open(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Open_5(bytes0, bytes0.length);
  }

  private native long GetNumberOfFiles_6();
  public long GetNumberOfFiles()
  {
    return GetNumberOfFiles_6();
  }

  private native byte[] GetFile_7(long id0);
  public String GetFile(long id0)
  {
    return new String(GetFile_7(id0), StandardCharsets.UTF_8);
  }

  private native int FileIsDirectory_8(byte[] id0, int len0);
  public int FileIsDirectory(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return FileIsDirectory_8(bytes0, bytes0.length);
  }

  private native long GetFiles_9();
  public vtkStringArray GetFiles()
  {
    long temp = GetFiles_9();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetPath_10();
  public String GetPath()
  {
    return new String(GetPath_10(), StandardCharsets.UTF_8);
  }

  private native void Clear_11();
  public void Clear()
  {
    Clear_11();
  }

  private native byte[] GetCurrentWorkingDirectory_12(byte[] id0, int len0,int id1);
  public String GetCurrentWorkingDirectory(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(GetCurrentWorkingDirectory_12(bytes0, bytes0.length,id1), StandardCharsets.UTF_8);
  }

  private native int MakeDirectory_13(byte[] id0, int len0);
  public int MakeDirectory(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return MakeDirectory_13(bytes0, bytes0.length);
  }

  private native int DeleteDirectory_14(byte[] id0, int len0);
  public int DeleteDirectory(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return DeleteDirectory_14(bytes0, bytes0.length);
  }

  private native int Rename_15(byte[] id0, int len0,byte[] id1, int len1);
  public int Rename(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return Rename_15(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  public vtkPDirectory() { super(); }

  public vtkPDirectory(long id) { super(id); }
  public native long   VTKInit();

}
