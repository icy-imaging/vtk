// java wrapper for vtkX3DExporter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkX3DExporter extends vtkExporter
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

  private native void SetSpeed_6(double id0);
  public void SetSpeed(double id0)
  {
    SetSpeed_6(id0);
  }

  private native double GetSpeed_7();
  public double GetSpeed()
  {
    return GetSpeed_7();
  }

  private native void SetBinary_8(int id0);
  public void SetBinary(int id0)
  {
    SetBinary_8(id0);
  }

  private native int GetBinaryMinValue_9();
  public int GetBinaryMinValue()
  {
    return GetBinaryMinValue_9();
  }

  private native int GetBinaryMaxValue_10();
  public int GetBinaryMaxValue()
  {
    return GetBinaryMaxValue_10();
  }

  private native void BinaryOn_11();
  public void BinaryOn()
  {
    BinaryOn_11();
  }

  private native void BinaryOff_12();
  public void BinaryOff()
  {
    BinaryOff_12();
  }

  private native int GetBinary_13();
  public int GetBinary()
  {
    return GetBinary_13();
  }

  private native void SetFastest_14(int id0);
  public void SetFastest(int id0)
  {
    SetFastest_14(id0);
  }

  private native int GetFastestMinValue_15();
  public int GetFastestMinValue()
  {
    return GetFastestMinValue_15();
  }

  private native int GetFastestMaxValue_16();
  public int GetFastestMaxValue()
  {
    return GetFastestMaxValue_16();
  }

  private native void FastestOn_17();
  public void FastestOn()
  {
    FastestOn_17();
  }

  private native void FastestOff_18();
  public void FastestOff()
  {
    FastestOff_18();
  }

  private native int GetFastest_19();
  public int GetFastest()
  {
    return GetFastest_19();
  }

  private native void SetWriteToOutputString_20(int id0);
  public void SetWriteToOutputString(int id0)
  {
    SetWriteToOutputString_20(id0);
  }

  private native int GetWriteToOutputString_21();
  public int GetWriteToOutputString()
  {
    return GetWriteToOutputString_21();
  }

  private native void WriteToOutputStringOn_22();
  public void WriteToOutputStringOn()
  {
    WriteToOutputStringOn_22();
  }

  private native void WriteToOutputStringOff_23();
  public void WriteToOutputStringOff()
  {
    WriteToOutputStringOff_23();
  }

  private native long GetOutputStringLength_24();
  public long GetOutputStringLength()
  {
    return GetOutputStringLength_24();
  }

  private native byte[] GetOutputString_25();
  public String GetOutputString()
  {
    return new String(GetOutputString_25(), StandardCharsets.UTF_8);
  }

  private native byte[] RegisterAndGetOutputString_26();
  public String RegisterAndGetOutputString()
  {
    return new String(RegisterAndGetOutputString_26(), StandardCharsets.UTF_8);
  }

  public vtkX3DExporter() { super(); }

  public vtkX3DExporter(long id) { super(id); }
  public native long   VTKInit();

}
