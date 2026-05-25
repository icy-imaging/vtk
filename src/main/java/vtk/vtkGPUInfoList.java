// java wrapper for vtkGPUInfoList object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGPUInfoList extends vtkObject
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

  private native void Probe_4();
  public void Probe()
  {
    Probe_4();
  }

  private native boolean IsProbed_5();
  public boolean IsProbed()
  {
    return IsProbed_5();
  }

  private native int GetNumberOfGPUs_6();
  public int GetNumberOfGPUs()
  {
    return GetNumberOfGPUs_6();
  }

  private native long GetGPUInfo_7(int id0);
  public vtkGPUInfo GetGPUInfo(int id0)
  {
    long temp = GetGPUInfo_7(id0);

    if (temp == 0) return null;
    return (vtkGPUInfo)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkGPUInfoList() { super(); }

  public vtkGPUInfoList(long id) { super(id); }
  public native long   VTKInit();

}
