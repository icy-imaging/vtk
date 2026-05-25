// java wrapper for vtkGPUInfo object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGPUInfo extends vtkObject
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

  private native void SetDedicatedVideoMemory_4(long id0);
  public void SetDedicatedVideoMemory(long id0)
  {
    SetDedicatedVideoMemory_4(id0);
  }

  private native long GetDedicatedVideoMemory_5();
  public long GetDedicatedVideoMemory()
  {
    return GetDedicatedVideoMemory_5();
  }

  private native void SetDedicatedSystemMemory_6(long id0);
  public void SetDedicatedSystemMemory(long id0)
  {
    SetDedicatedSystemMemory_6(id0);
  }

  private native long GetDedicatedSystemMemory_7();
  public long GetDedicatedSystemMemory()
  {
    return GetDedicatedSystemMemory_7();
  }

  private native void SetSharedSystemMemory_8(long id0);
  public void SetSharedSystemMemory(long id0)
  {
    SetSharedSystemMemory_8(id0);
  }

  private native long GetSharedSystemMemory_9();
  public long GetSharedSystemMemory()
  {
    return GetSharedSystemMemory_9();
  }

  public vtkGPUInfo() { super(); }

  public vtkGPUInfo(long id) { super(id); }
  public native long   VTKInit();

}
