// java wrapper for vtkArchiver object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkArchiver extends vtkObject
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

  private native byte[] GetArchiveName_4();
  public String GetArchiveName()
  {
    return new String(GetArchiveName_4(), StandardCharsets.UTF_8);
  }

  private native void SetArchiveName_5(byte[] id0, int len0);
  public void SetArchiveName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetArchiveName_5(bytes0, bytes0.length);
  }

  private native void OpenArchive_6();
  public void OpenArchive()
  {
    OpenArchive_6();
  }

  private native void CloseArchive_7();
  public void CloseArchive()
  {
    CloseArchive_7();
  }

  private native boolean Contains_8(byte[] id0, int len0);
  public boolean Contains(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Contains_8(bytes0, bytes0.length);
  }

  public vtkArchiver() { super(); }

  public vtkArchiver(long id) { super(id); }
  public native long   VTKInit();

}
