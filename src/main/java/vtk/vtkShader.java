// java wrapper for vtkShader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkShader extends vtkObject
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

  private native void SetType_4(int id0);
  public void SetType(int id0)
  {
    SetType_4(id0);
  }

  private native int GetType_5();
  public int GetType()
  {
    return GetType_5();
  }

  private native void SetSource_6(byte[] id0, int len0);
  public void SetSource(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSource_6(bytes0, bytes0.length);
  }

  private native byte[] GetSource_7();
  public String GetSource()
  {
    return new String(GetSource_7(), StandardCharsets.UTF_8);
  }

  private native byte[] GetError_8();
  public String GetError()
  {
    return new String(GetError_8(), StandardCharsets.UTF_8);
  }

  private native int GetHandle_9();
  public int GetHandle()
  {
    return GetHandle_9();
  }

  private native boolean Compile_10();
  public boolean Compile()
  {
    return Compile_10();
  }

  private native void Cleanup_11();
  public void Cleanup()
  {
    Cleanup_11();
  }

  private native boolean IsComputeShaderSupported_12();
  public boolean IsComputeShaderSupported()
  {
    return IsComputeShaderSupported_12();
  }

  private native boolean IsTessellationShaderSupported_13();
  public boolean IsTessellationShaderSupported()
  {
    return IsTessellationShaderSupported_13();
  }

  public vtkShader() { super(); }

  public vtkShader(long id) { super(id); }
  public native long   VTKInit();

}
