// java wrapper for vtkXMLWriterBase object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLWriterBase extends vtkAlgorithm
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

  private native void SetByteOrder_4(int id0);
  public void SetByteOrder(int id0)
  {
    SetByteOrder_4(id0);
  }

  private native int GetByteOrder_5();
  public int GetByteOrder()
  {
    return GetByteOrder_5();
  }

  private native void SetByteOrderToBigEndian_6();
  public void SetByteOrderToBigEndian()
  {
    SetByteOrderToBigEndian_6();
  }

  private native void SetByteOrderToLittleEndian_7();
  public void SetByteOrderToLittleEndian()
  {
    SetByteOrderToLittleEndian_7();
  }

  private native void SetHeaderType_8(int id0);
  public void SetHeaderType(int id0)
  {
    SetHeaderType_8(id0);
  }

  private native int GetHeaderType_9();
  public int GetHeaderType()
  {
    return GetHeaderType_9();
  }

  private native void SetHeaderTypeToUInt32_10();
  public void SetHeaderTypeToUInt32()
  {
    SetHeaderTypeToUInt32_10();
  }

  private native void SetHeaderTypeToUInt64_11();
  public void SetHeaderTypeToUInt64()
  {
    SetHeaderTypeToUInt64_11();
  }

  private native void SetIdType_12(int id0);
  public void SetIdType(int id0)
  {
    SetIdType_12(id0);
  }

  private native int GetIdType_13();
  public int GetIdType()
  {
    return GetIdType_13();
  }

  private native void SetIdTypeToInt32_14();
  public void SetIdTypeToInt32()
  {
    SetIdTypeToInt32_14();
  }

  private native void SetIdTypeToInt64_15();
  public void SetIdTypeToInt64()
  {
    SetIdTypeToInt64_15();
  }

  private native void SetFileName_16(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_16(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_17();
  public String GetFileName()
  {
    return new String(GetFileName_17(), StandardCharsets.UTF_8);
  }

  private native void SetWriteToOutputString_18(boolean id0);
  public void SetWriteToOutputString(boolean id0)
  {
    SetWriteToOutputString_18(id0);
  }

  private native boolean GetWriteToOutputString_19();
  public boolean GetWriteToOutputString()
  {
    return GetWriteToOutputString_19();
  }

  private native void WriteToOutputStringOn_20();
  public void WriteToOutputStringOn()
  {
    WriteToOutputStringOn_20();
  }

  private native void WriteToOutputStringOff_21();
  public void WriteToOutputStringOff()
  {
    WriteToOutputStringOff_21();
  }

  private native byte[] GetOutputString_22();
  public String GetOutputString()
  {
    return new String(GetOutputString_22(), StandardCharsets.UTF_8);
  }

  private native void SetCompressor_23(vtkDataCompressor id0);
  public void SetCompressor(vtkDataCompressor id0)
  {
    SetCompressor_23(id0);
  }

  private native long GetCompressor_24();
  public vtkDataCompressor GetCompressor()
  {
    long temp = GetCompressor_24();

    if (temp == 0) return null;
    return (vtkDataCompressor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCompressorType_25(int id0);
  public void SetCompressorType(int id0)
  {
    SetCompressorType_25(id0);
  }

  private native void SetCompressorTypeToNone_26();
  public void SetCompressorTypeToNone()
  {
    SetCompressorTypeToNone_26();
  }

  private native void SetCompressorTypeToLZ4_27();
  public void SetCompressorTypeToLZ4()
  {
    SetCompressorTypeToLZ4_27();
  }

  private native void SetCompressorTypeToZLib_28();
  public void SetCompressorTypeToZLib()
  {
    SetCompressorTypeToZLib_28();
  }

  private native void SetCompressorTypeToLZMA_29();
  public void SetCompressorTypeToLZMA()
  {
    SetCompressorTypeToLZMA_29();
  }

  private native void SetCompressionLevel_30(int id0);
  public void SetCompressionLevel(int id0)
  {
    SetCompressionLevel_30(id0);
  }

  private native int GetCompressionLevel_31();
  public int GetCompressionLevel()
  {
    return GetCompressionLevel_31();
  }

  private native void SetDataMode_32(int id0);
  public void SetDataMode(int id0)
  {
    SetDataMode_32(id0);
  }

  private native int GetDataMode_33();
  public int GetDataMode()
  {
    return GetDataMode_33();
  }

  private native void SetDataModeToAscii_34();
  public void SetDataModeToAscii()
  {
    SetDataModeToAscii_34();
  }

  private native void SetDataModeToBinary_35();
  public void SetDataModeToBinary()
  {
    SetDataModeToBinary_35();
  }

  private native void SetDataModeToAppended_36();
  public void SetDataModeToAppended()
  {
    SetDataModeToAppended_36();
  }

  private native void SetEncodeAppendedData_37(boolean id0);
  public void SetEncodeAppendedData(boolean id0)
  {
    SetEncodeAppendedData_37(id0);
  }

  private native boolean GetEncodeAppendedData_38();
  public boolean GetEncodeAppendedData()
  {
    return GetEncodeAppendedData_38();
  }

  private native void EncodeAppendedDataOn_39();
  public void EncodeAppendedDataOn()
  {
    EncodeAppendedDataOn_39();
  }

  private native void EncodeAppendedDataOff_40();
  public void EncodeAppendedDataOff()
  {
    EncodeAppendedDataOff_40();
  }

  private native boolean GetWriteTimeValue_41();
  public boolean GetWriteTimeValue()
  {
    return GetWriteTimeValue_41();
  }

  private native void SetWriteTimeValue_42(boolean id0);
  public void SetWriteTimeValue(boolean id0)
  {
    SetWriteTimeValue_42(id0);
  }

  private native void WriteTimeValueOn_43();
  public void WriteTimeValueOn()
  {
    WriteTimeValueOn_43();
  }

  private native void WriteTimeValueOff_44();
  public void WriteTimeValueOff()
  {
    WriteTimeValueOff_44();
  }

  private native byte[] GetDefaultFileExtension_45();
  public String GetDefaultFileExtension()
  {
    return new String(GetDefaultFileExtension_45(), StandardCharsets.UTF_8);
  }

  private native int Write_46();
  public int Write()
  {
    return Write_46();
  }

  public vtkXMLWriterBase() { super(); }

  public vtkXMLWriterBase(long id) { super(id); }

}
