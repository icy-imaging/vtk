// java wrapper for vtkMetaImageWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMetaImageWriter extends vtkImageWriter
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetRAWFileName_6(byte[] id0, int len0);
  public void SetRAWFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetRAWFileName_6(bytes0, bytes0.length);
  }

  private native byte[] GetRAWFileName_7();
  public String GetRAWFileName()
  {
    return new String(GetRAWFileName_7(), StandardCharsets.UTF_8);
  }

  private native void SetCompression_8(boolean id0);
  public void SetCompression(boolean id0)
  {
    SetCompression_8(id0);
  }

  private native boolean GetCompression_9();
  public boolean GetCompression()
  {
    return GetCompression_9();
  }

  private native void Write_10();
  public void Write()
  {
    Write_10();
  }

  public vtkMetaImageWriter() { super(); }

  public vtkMetaImageWriter(long id) { super(id); }
  public native long   VTKInit();

}
