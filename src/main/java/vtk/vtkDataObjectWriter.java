// java wrapper for vtkDataObjectWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataObjectWriter extends vtkWriter
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

  private native void SetHeader_6(byte[] id0, int len0);
  public void SetHeader(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetHeader_6(bytes0, bytes0.length);
  }

  private native byte[] GetHeader_7();
  public String GetHeader()
  {
    return new String(GetHeader_7(), StandardCharsets.UTF_8);
  }

  private native void SetFileType_8(int id0);
  public void SetFileType(int id0)
  {
    SetFileType_8(id0);
  }

  private native int GetFileType_9();
  public int GetFileType()
  {
    return GetFileType_9();
  }

  private native void SetFileTypeToASCII_10();
  public void SetFileTypeToASCII()
  {
    SetFileTypeToASCII_10();
  }

  private native void SetFileTypeToBinary_11();
  public void SetFileTypeToBinary()
  {
    SetFileTypeToBinary_11();
  }

  private native void SetWriteToOutputString_12(int id0);
  public void SetWriteToOutputString(int id0)
  {
    SetWriteToOutputString_12(id0);
  }

  private native void WriteToOutputStringOn_13();
  public void WriteToOutputStringOn()
  {
    WriteToOutputStringOn_13();
  }

  private native void WriteToOutputStringOff_14();
  public void WriteToOutputStringOff()
  {
    WriteToOutputStringOff_14();
  }

  private native int GetWriteToOutputString_15();
  public int GetWriteToOutputString()
  {
    return GetWriteToOutputString_15();
  }

  private native byte[] GetOutputString_16();
  public String GetOutputString()
  {
    return new String(GetOutputString_16(), StandardCharsets.UTF_8);
  }

  private native byte[] GetOutputStdString_17();
  public String GetOutputStdString()
  {
    return new String(GetOutputStdString_17(), StandardCharsets.UTF_8);
  }

  private native long GetOutputStringLength_18();
  public long GetOutputStringLength()
  {
    return GetOutputStringLength_18();
  }

  private native void SetFieldDataName_19(byte[] id0, int len0);
  public void SetFieldDataName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFieldDataName_19(bytes0, bytes0.length);
  }

  private native byte[] GetFieldDataName_20();
  public String GetFieldDataName()
  {
    return new String(GetFieldDataName_20(), StandardCharsets.UTF_8);
  }

  public vtkDataObjectWriter() { super(); }

  public vtkDataObjectWriter(long id) { super(id); }
  public native long   VTKInit();

}
