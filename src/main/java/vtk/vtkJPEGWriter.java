// java wrapper for vtkJPEGWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkJPEGWriter extends vtkImageWriter
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

  private native void Write_4();
  public void Write()
  {
    Write_4();
  }

  private native void SetQuality_5(int id0);
  public void SetQuality(int id0)
  {
    SetQuality_5(id0);
  }

  private native int GetQualityMinValue_6();
  public int GetQualityMinValue()
  {
    return GetQualityMinValue_6();
  }

  private native int GetQualityMaxValue_7();
  public int GetQualityMaxValue()
  {
    return GetQualityMaxValue_7();
  }

  private native int GetQuality_8();
  public int GetQuality()
  {
    return GetQuality_8();
  }

  private native void SetProgressive_9(int id0);
  public void SetProgressive(int id0)
  {
    SetProgressive_9(id0);
  }

  private native int GetProgressive_10();
  public int GetProgressive()
  {
    return GetProgressive_10();
  }

  private native void ProgressiveOn_11();
  public void ProgressiveOn()
  {
    ProgressiveOn_11();
  }

  private native void ProgressiveOff_12();
  public void ProgressiveOff()
  {
    ProgressiveOff_12();
  }

  private native void SetWriteToMemory_13(int id0);
  public void SetWriteToMemory(int id0)
  {
    SetWriteToMemory_13(id0);
  }

  private native int GetWriteToMemory_14();
  public int GetWriteToMemory()
  {
    return GetWriteToMemory_14();
  }

  private native void WriteToMemoryOn_15();
  public void WriteToMemoryOn()
  {
    WriteToMemoryOn_15();
  }

  private native void WriteToMemoryOff_16();
  public void WriteToMemoryOff()
  {
    WriteToMemoryOff_16();
  }

  private native void SetResult_17(vtkUnsignedCharArray id0);
  public void SetResult(vtkUnsignedCharArray id0)
  {
    SetResult_17(id0);
  }

  private native long GetResult_18();
  public vtkUnsignedCharArray GetResult()
  {
    long temp = GetResult_18();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkJPEGWriter() { super(); }

  public vtkJPEGWriter(long id) { super(id); }
  public native long   VTKInit();

}
