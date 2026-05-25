// java wrapper for vtkArrayDataWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkArrayDataWriter extends vtkWriter
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

  private native void SetBinary_6(int id0);
  public void SetBinary(int id0)
  {
    SetBinary_6(id0);
  }

  private native int GetBinary_7();
  public int GetBinary()
  {
    return GetBinary_7();
  }

  private native void BinaryOn_8();
  public void BinaryOn()
  {
    BinaryOn_8();
  }

  private native void BinaryOff_9();
  public void BinaryOff()
  {
    BinaryOff_9();
  }

  private native byte[] GetOutputString_10();
  public String GetOutputString()
  {
    return new String(GetOutputString_10(), StandardCharsets.UTF_8);
  }

  private native void SetWriteToOutputString_11(boolean id0);
  public void SetWriteToOutputString(boolean id0)
  {
    SetWriteToOutputString_11(id0);
  }

  private native boolean GetWriteToOutputString_12();
  public boolean GetWriteToOutputString()
  {
    return GetWriteToOutputString_12();
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

  private native int Write_15();
  public int Write()
  {
    return Write_15();
  }

  private native boolean Write_16(byte[] id0, int len0,boolean id1);
  public boolean Write(String id0,boolean id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return Write_16(bytes0, bytes0.length,id1);
  }

  private native boolean Write_17(vtkArrayData id0,byte[] id1, int len1,boolean id2);
  public boolean Write(vtkArrayData id0,String id1,boolean id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return Write_17(id0,bytes1, bytes1.length,id2);
  }

  private native byte[] Write_18(boolean id0);
  public String Write(boolean id0)
  {
    return new String(Write_18(id0), StandardCharsets.UTF_8);
  }

  private native byte[] Write_19(vtkArrayData id0,boolean id1);
  public String Write(vtkArrayData id0,boolean id1)
  {
    return new String(Write_19(id0,id1), StandardCharsets.UTF_8);
  }

  public vtkArrayDataWriter() { super(); }

  public vtkArrayDataWriter(long id) { super(id); }
  public native long   VTKInit();

}
