// java wrapper for vtkPBRLUTTexture object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPBRLUTTexture extends vtkOpenGLTexture
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

  private native void Load_4(vtkRenderer id0);
  public void Load(vtkRenderer id0)
  {
    Load_4(id0);
  }

  private native void Render_5(vtkRenderer id0);
  public void Render(vtkRenderer id0)
  {
    Render_5(id0);
  }

  private native int GetLUTSize_6();
  public int GetLUTSize()
  {
    return GetLUTSize_6();
  }

  private native void SetLUTSize_7(int id0);
  public void SetLUTSize(int id0)
  {
    SetLUTSize_7(id0);
  }

  private native int GetLUTSamples_8();
  public int GetLUTSamples()
  {
    return GetLUTSamples_8();
  }

  private native void SetLUTSamples_9(int id0);
  public void SetLUTSamples(int id0)
  {
    SetLUTSamples_9(id0);
  }

  public vtkPBRLUTTexture() { super(); }

  public vtkPBRLUTTexture(long id) { super(id); }
  public native long   VTKInit();

}
