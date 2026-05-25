// java wrapper for vtkParticleReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParticleReader extends vtkPolyDataAlgorithm
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

  private native void SetDataByteOrderToBigEndian_6();
  public void SetDataByteOrderToBigEndian()
  {
    SetDataByteOrderToBigEndian_6();
  }

  private native void SetDataByteOrderToLittleEndian_7();
  public void SetDataByteOrderToLittleEndian()
  {
    SetDataByteOrderToLittleEndian_7();
  }

  private native int GetDataByteOrder_8();
  public int GetDataByteOrder()
  {
    return GetDataByteOrder_8();
  }

  private native void SetDataByteOrder_9(int id0);
  public void SetDataByteOrder(int id0)
  {
    SetDataByteOrder_9(id0);
  }

  private native byte[] GetDataByteOrderAsString_10();
  public String GetDataByteOrderAsString()
  {
    return new String(GetDataByteOrderAsString_10(), StandardCharsets.UTF_8);
  }

  private native void SetSwapBytes_11(int id0);
  public void SetSwapBytes(int id0)
  {
    SetSwapBytes_11(id0);
  }

  private native int GetSwapBytes_12();
  public int GetSwapBytes()
  {
    return GetSwapBytes_12();
  }

  private native void SwapBytesOn_13();
  public void SwapBytesOn()
  {
    SwapBytesOn_13();
  }

  private native void SwapBytesOff_14();
  public void SwapBytesOff()
  {
    SwapBytesOff_14();
  }

  private native void SetHasScalar_15(int id0);
  public void SetHasScalar(int id0)
  {
    SetHasScalar_15(id0);
  }

  private native int GetHasScalar_16();
  public int GetHasScalar()
  {
    return GetHasScalar_16();
  }

  private native void HasScalarOn_17();
  public void HasScalarOn()
  {
    HasScalarOn_17();
  }

  private native void HasScalarOff_18();
  public void HasScalarOff()
  {
    HasScalarOff_18();
  }

  private native void SetFileType_19(int id0);
  public void SetFileType(int id0)
  {
    SetFileType_19(id0);
  }

  private native int GetFileTypeMinValue_20();
  public int GetFileTypeMinValue()
  {
    return GetFileTypeMinValue_20();
  }

  private native int GetFileTypeMaxValue_21();
  public int GetFileTypeMaxValue()
  {
    return GetFileTypeMaxValue_21();
  }

  private native int GetFileType_22();
  public int GetFileType()
  {
    return GetFileType_22();
  }

  private native void SetFileTypeToUnknown_23();
  public void SetFileTypeToUnknown()
  {
    SetFileTypeToUnknown_23();
  }

  private native void SetFileTypeToText_24();
  public void SetFileTypeToText()
  {
    SetFileTypeToText_24();
  }

  private native void SetFileTypeToBinary_25();
  public void SetFileTypeToBinary()
  {
    SetFileTypeToBinary_25();
  }

  private native void SetDataType_26(int id0);
  public void SetDataType(int id0)
  {
    SetDataType_26(id0);
  }

  private native int GetDataTypeMinValue_27();
  public int GetDataTypeMinValue()
  {
    return GetDataTypeMinValue_27();
  }

  private native int GetDataTypeMaxValue_28();
  public int GetDataTypeMaxValue()
  {
    return GetDataTypeMaxValue_28();
  }

  private native int GetDataType_29();
  public int GetDataType()
  {
    return GetDataType_29();
  }

  private native void SetDataTypeToFloat_30();
  public void SetDataTypeToFloat()
  {
    SetDataTypeToFloat_30();
  }

  private native void SetDataTypeToDouble_31();
  public void SetDataTypeToDouble()
  {
    SetDataTypeToDouble_31();
  }

  public vtkParticleReader() { super(); }

  public vtkParticleReader(long id) { super(id); }
  public native long   VTKInit();

}
