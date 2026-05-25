// java wrapper for vtkDelimitedTextWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDelimitedTextWriter extends vtkWriter
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

  private native void SetFieldDelimiter_4(byte[] id0, int len0);
  public void SetFieldDelimiter(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFieldDelimiter_4(bytes0, bytes0.length);
  }

  private native byte[] GetFieldDelimiter_5();
  public String GetFieldDelimiter()
  {
    return new String(GetFieldDelimiter_5(), StandardCharsets.UTF_8);
  }

  private native void SetStringDelimiter_6(byte[] id0, int len0);
  public void SetStringDelimiter(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetStringDelimiter_6(bytes0, bytes0.length);
  }

  private native byte[] GetStringDelimiter_7();
  public String GetStringDelimiter()
  {
    return new String(GetStringDelimiter_7(), StandardCharsets.UTF_8);
  }

  private native void SetFileName_8(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_8(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_9();
  public String GetFileName()
  {
    return new String(GetFileName_9(), StandardCharsets.UTF_8);
  }

  private native void SetUseStringDelimiter_10(boolean id0);
  public void SetUseStringDelimiter(boolean id0)
  {
    SetUseStringDelimiter_10(id0);
  }

  private native boolean GetUseStringDelimiter_11();
  public boolean GetUseStringDelimiter()
  {
    return GetUseStringDelimiter_11();
  }

  private native void SetWriteToOutputString_12(boolean id0);
  public void SetWriteToOutputString(boolean id0)
  {
    SetWriteToOutputString_12(id0);
  }

  private native boolean GetWriteToOutputString_13();
  public boolean GetWriteToOutputString()
  {
    return GetWriteToOutputString_13();
  }

  private native void WriteToOutputStringOn_14();
  public void WriteToOutputStringOn()
  {
    WriteToOutputStringOn_14();
  }

  private native void WriteToOutputStringOff_15();
  public void WriteToOutputStringOff()
  {
    WriteToOutputStringOff_15();
  }

  private native byte[] RegisterAndGetOutputString_16();
  public String RegisterAndGetOutputString()
  {
    return new String(RegisterAndGetOutputString_16(), StandardCharsets.UTF_8);
  }

  private native byte[] GetString_17(byte[] id0, int len0);
  public String GetString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(GetString_17(bytes0, bytes0.length), StandardCharsets.UTF_8);
  }

  public vtkDelimitedTextWriter() { super(); }

  public vtkDelimitedTextWriter(long id) { super(id); }
  public native long   VTKInit();

}
