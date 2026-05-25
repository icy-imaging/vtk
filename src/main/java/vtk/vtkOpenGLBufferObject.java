// java wrapper for vtkOpenGLBufferObject object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLBufferObject extends vtkObject
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

  private native int GetType_4();
  public int GetType()
  {
    return GetType_4();
  }

  private native void SetType_5(int id0);
  public void SetType(int id0)
  {
    SetType_5(id0);
  }

  private native int GetUsage_6();
  public int GetUsage()
  {
    return GetUsage_6();
  }

  private native void SetUsage_7(int id0);
  public void SetUsage(int id0)
  {
    SetUsage_7(id0);
  }

  private native int GetHandle_8();
  public int GetHandle()
  {
    return GetHandle_8();
  }

  private native boolean IsReady_9();
  public boolean IsReady()
  {
    return IsReady_9();
  }

  private native void FlagBufferAsDirty_10();
  public void FlagBufferAsDirty()
  {
    FlagBufferAsDirty_10();
  }

  private native boolean GenerateBuffer_11(int id0);
  public boolean GenerateBuffer(int id0)
  {
    return GenerateBuffer_11(id0);
  }

  private native boolean Bind_12();
  public boolean Bind()
  {
    return Bind_12();
  }

  private native boolean BindShaderStorage_13(int id0);
  public boolean BindShaderStorage(int id0)
  {
    return BindShaderStorage_13(id0);
  }

  private native boolean Release_14();
  public boolean Release()
  {
    return Release_14();
  }

  private native void ReleaseGraphicsResources_15();
  public void ReleaseGraphicsResources()
  {
    ReleaseGraphicsResources_15();
  }

  private native byte[] GetError_16();
  public String GetError()
  {
    return new String(GetError_16(), StandardCharsets.UTF_8);
  }

  public vtkOpenGLBufferObject() { super(); }

  public vtkOpenGLBufferObject(long id) { super(id); }
  public native long   VTKInit();

}
