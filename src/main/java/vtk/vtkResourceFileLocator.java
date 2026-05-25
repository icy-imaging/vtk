// java wrapper for vtkResourceFileLocator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkResourceFileLocator extends vtkObject
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

  private native void SetLogVerbosity_4(int id0);
  public void SetLogVerbosity(int id0)
  {
    SetLogVerbosity_4(id0);
  }

  private native int GetLogVerbosity_5();
  public int GetLogVerbosity()
  {
    return GetLogVerbosity_5();
  }

  private native byte[] Locate_6(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2);
  public String Locate(String id0,String id1,String id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return new String(Locate_6(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length), StandardCharsets.UTF_8);
  }

  private native byte[] GetLibraryPathForSymbolUnix_7(byte[] id0, int len0);
  public String GetLibraryPathForSymbolUnix(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(GetLibraryPathForSymbolUnix_7(bytes0, bytes0.length), StandardCharsets.UTF_8);
  }

  public vtkResourceFileLocator() { super(); }

  public vtkResourceFileLocator(long id) { super(id); }
  public native long   VTKInit();

}
