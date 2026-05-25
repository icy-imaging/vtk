// java wrapper for vtkPNGWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPNGWriter extends vtkImageWriter
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

  private native void SetCompressionLevel_5(int id0);
  public void SetCompressionLevel(int id0)
  {
    SetCompressionLevel_5(id0);
  }

  private native int GetCompressionLevelMinValue_6();
  public int GetCompressionLevelMinValue()
  {
    return GetCompressionLevelMinValue_6();
  }

  private native int GetCompressionLevelMaxValue_7();
  public int GetCompressionLevelMaxValue()
  {
    return GetCompressionLevelMaxValue_7();
  }

  private native int GetCompressionLevel_8();
  public int GetCompressionLevel()
  {
    return GetCompressionLevel_8();
  }

  private native void SetWriteToMemory_9(int id0);
  public void SetWriteToMemory(int id0)
  {
    SetWriteToMemory_9(id0);
  }

  private native int GetWriteToMemory_10();
  public int GetWriteToMemory()
  {
    return GetWriteToMemory_10();
  }

  private native void WriteToMemoryOn_11();
  public void WriteToMemoryOn()
  {
    WriteToMemoryOn_11();
  }

  private native void WriteToMemoryOff_12();
  public void WriteToMemoryOff()
  {
    WriteToMemoryOff_12();
  }

  private native void SetResult_13(vtkUnsignedCharArray id0);
  public void SetResult(vtkUnsignedCharArray id0)
  {
    SetResult_13(id0);
  }

  private native long GetResult_14();
  public vtkUnsignedCharArray GetResult()
  {
    long temp = GetResult_14();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AddText_15(byte[] id0, int len0,byte[] id1, int len1);
  public void AddText(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddText_15(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void ClearText_16();
  public void ClearText()
  {
    ClearText_16();
  }

  public vtkPNGWriter() { super(); }

  public vtkPNGWriter(long id) { super(id); }
  public native long   VTKInit();

}
