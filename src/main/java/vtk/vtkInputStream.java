// java wrapper for vtkInputStream object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInputStream extends vtkObject
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

  private native void StartReading_4();
  public void StartReading()
  {
    StartReading_4();
  }

  private native int Seek_5(long id0);
  public int Seek(long id0)
  {
    return Seek_5(id0);
  }

  private native void EndReading_6();
  public void EndReading()
  {
    EndReading_6();
  }

  public vtkInputStream() { super(); }

  public vtkInputStream(long id) { super(id); }
  public native long   VTKInit();

}
