// java wrapper for vtkResourceStream object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkResourceStream extends vtkObject
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

  private native boolean EndOfStream_4();
  public boolean EndOfStream()
  {
    return EndOfStream_4();
  }

  private native long Seek_5(long id0,int id1);
  public long Seek(long id0,int id1)
  {
    return Seek_5(id0,id1);
  }

  private native long Tell_6();
  public long Tell()
  {
    return Tell_6();
  }

  private native boolean SupportSeek_7();
  public boolean SupportSeek()
  {
    return SupportSeek_7();
  }

  public vtkResourceStream() { super(); }

  public vtkResourceStream(long id) { super(id); }

}
