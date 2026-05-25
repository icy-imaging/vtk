// java wrapper for vtkUTF16TextCodec object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUTF16TextCodec extends vtkTextCodec
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

  private native byte[] Name_4();
  public String Name()
  {
    return new String(Name_4(), StandardCharsets.UTF_8);
  }

  private native boolean CanHandle_5(byte[] id0, int len0);
  public boolean CanHandle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanHandle_5(bytes0, bytes0.length);
  }

  private native void SetBigEndian_6(boolean id0);
  public void SetBigEndian(boolean id0)
  {
    SetBigEndian_6(id0);
  }

  public vtkUTF16TextCodec() { super(); }

  public vtkUTF16TextCodec(long id) { super(id); }
  public native long   VTKInit();

}
