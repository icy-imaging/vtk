// java wrapper for vtkBMPWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBMPWriter extends vtkImageWriter
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

  private native void SetWriteToMemory_4(int id0);
  public void SetWriteToMemory(int id0)
  {
    SetWriteToMemory_4(id0);
  }

  private native int GetWriteToMemory_5();
  public int GetWriteToMemory()
  {
    return GetWriteToMemory_5();
  }

  private native void WriteToMemoryOn_6();
  public void WriteToMemoryOn()
  {
    WriteToMemoryOn_6();
  }

  private native void WriteToMemoryOff_7();
  public void WriteToMemoryOff()
  {
    WriteToMemoryOff_7();
  }

  private native void SetResult_8(vtkUnsignedCharArray id0);
  public void SetResult(vtkUnsignedCharArray id0)
  {
    SetResult_8(id0);
  }

  private native long GetResult_9();
  public vtkUnsignedCharArray GetResult()
  {
    long temp = GetResult_9();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkBMPWriter() { super(); }

  public vtkBMPWriter(long id) { super(id); }
  public native long   VTKInit();

}
