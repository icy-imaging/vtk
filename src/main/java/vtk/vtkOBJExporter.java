// java wrapper for vtkOBJExporter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOBJExporter extends vtkExporter
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

  private native void SetFilePrefix_4(byte[] id0, int len0);
  public void SetFilePrefix(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFilePrefix_4(bytes0, bytes0.length);
  }

  private native byte[] GetFilePrefix_5();
  public String GetFilePrefix()
  {
    return new String(GetFilePrefix_5(), StandardCharsets.UTF_8);
  }

  private native void SetOBJFileComment_6(byte[] id0, int len0);
  public void SetOBJFileComment(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOBJFileComment_6(bytes0, bytes0.length);
  }

  private native byte[] GetOBJFileComment_7();
  public String GetOBJFileComment()
  {
    return new String(GetOBJFileComment_7(), StandardCharsets.UTF_8);
  }

  private native void SetMTLFileComment_8(byte[] id0, int len0);
  public void SetMTLFileComment(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMTLFileComment_8(bytes0, bytes0.length);
  }

  private native byte[] GetMTLFileComment_9();
  public String GetMTLFileComment()
  {
    return new String(GetMTLFileComment_9(), StandardCharsets.UTF_8);
  }

  public vtkOBJExporter() { super(); }

  public vtkOBJExporter(long id) { super(id); }
  public native long   VTKInit();

}
