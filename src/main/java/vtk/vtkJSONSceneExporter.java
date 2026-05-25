// java wrapper for vtkJSONSceneExporter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkJSONSceneExporter extends vtkExporter
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

  private native void SetWriteTextures_6(boolean id0);
  public void SetWriteTextures(boolean id0)
  {
    SetWriteTextures_6(id0);
  }

  private native boolean GetWriteTextures_7();
  public boolean GetWriteTextures()
  {
    return GetWriteTextures_7();
  }

  private native void SetWriteTextureLODs_8(boolean id0);
  public void SetWriteTextureLODs(boolean id0)
  {
    SetWriteTextureLODs_8(id0);
  }

  private native boolean GetWriteTextureLODs_9();
  public boolean GetWriteTextureLODs()
  {
    return GetWriteTextureLODs_9();
  }

  private native void SetTextureLODsBaseUrl_10(byte[] id0, int len0);
  public void SetTextureLODsBaseUrl(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTextureLODsBaseUrl_10(bytes0, bytes0.length);
  }

  private native byte[] GetTextureLODsBaseUrl_11();
  public String GetTextureLODsBaseUrl()
  {
    return new String(GetTextureLODsBaseUrl_11(), StandardCharsets.UTF_8);
  }

  private native void SetWritePolyLODs_12(boolean id0);
  public void SetWritePolyLODs(boolean id0)
  {
    SetWritePolyLODs_12(id0);
  }

  private native boolean GetWritePolyLODs_13();
  public boolean GetWritePolyLODs()
  {
    return GetWritePolyLODs_13();
  }

  private native void SetPolyLODsBaseUrl_14(byte[] id0, int len0);
  public void SetPolyLODsBaseUrl(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPolyLODsBaseUrl_14(bytes0, bytes0.length);
  }

  private native byte[] GetPolyLODsBaseUrl_15();
  public String GetPolyLODsBaseUrl()
  {
    return new String(GetPolyLODsBaseUrl_15(), StandardCharsets.UTF_8);
  }

  public vtkJSONSceneExporter() { super(); }

  public vtkJSONSceneExporter(long id) { super(id); }
  public native long   VTKInit();

}
