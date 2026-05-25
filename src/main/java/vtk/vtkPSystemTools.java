// java wrapper for vtkPSystemTools object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPSystemTools extends vtkObject
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

  private native void BroadcastString_4(byte[] id0, int len0,int id1);
  public void BroadcastString(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    BroadcastString_4(bytes0, bytes0.length,id1);
  }

  private native byte[] CollapseFullPath_5(byte[] id0, int len0);
  public String CollapseFullPath(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(CollapseFullPath_5(bytes0, bytes0.length), StandardCharsets.UTF_8);
  }

  private native byte[] CollapseFullPath_6(byte[] id0, int len0,byte[] id1, int len1);
  public String CollapseFullPath(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return new String(CollapseFullPath_6(bytes0, bytes0.length,bytes1, bytes1.length), StandardCharsets.UTF_8);
  }

  private native boolean FileExists_7(byte[] id0, int len0,boolean id1);
  public boolean FileExists(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return FileExists_7(bytes0, bytes0.length,id1);
  }

  private native boolean FileExists_8(byte[] id0, int len0);
  public boolean FileExists(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return FileExists_8(bytes0, bytes0.length);
  }

  private native boolean FileIsDirectory_9(byte[] id0, int len0);
  public boolean FileIsDirectory(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return FileIsDirectory_9(bytes0, bytes0.length);
  }

  private native boolean FindProgramPath_10(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2,byte[] id3, int len3,byte[] id4, int len4,byte[] id5, int len5);
  public boolean FindProgramPath(String id0,String id1,String id2,String id3,String id4,String id5)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    byte[] bytes5 = id5.getBytes(StandardCharsets.UTF_8);
    return FindProgramPath_10(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length,bytes3, bytes3.length,bytes4, bytes4.length,bytes5, bytes5.length);
  }

  private native byte[] GetCurrentWorkingDirectory_11(boolean id0);
  public String GetCurrentWorkingDirectory(boolean id0)
  {
    return new String(GetCurrentWorkingDirectory_11(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetProgramPath_12(byte[] id0, int len0);
  public String GetProgramPath(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(GetProgramPath_12(bytes0, bytes0.length), StandardCharsets.UTF_8);
  }

  public vtkPSystemTools() { super(); }

  public vtkPSystemTools(long id) { super(id); }
  public native long   VTKInit();

}
