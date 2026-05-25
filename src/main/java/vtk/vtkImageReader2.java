// java wrapper for vtkImageReader2 object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageReader2 extends vtkImageAlgorithm
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

  private native void SetFileNames_6(vtkStringArray id0);
  public void SetFileNames(vtkStringArray id0)
  {
    SetFileNames_6(id0);
  }

  private native long GetFileNames_7();
  public vtkStringArray GetFileNames()
  {
    long temp = GetFileNames_7();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFilePrefix_8(byte[] id0, int len0);
  public void SetFilePrefix(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFilePrefix_8(bytes0, bytes0.length);
  }

  private native byte[] GetFilePrefix_9();
  public String GetFilePrefix()
  {
    return new String(GetFilePrefix_9(), StandardCharsets.UTF_8);
  }

  private native void SetFilePattern_10(byte[] id0, int len0);
  public void SetFilePattern(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFilePattern_10(bytes0, bytes0.length);
  }

  private native byte[] GetFilePattern_11();
  public String GetFilePattern()
  {
    return new String(GetFilePattern_11(), StandardCharsets.UTF_8);
  }

  private native void SetMemoryBufferLength_12(long id0);
  public void SetMemoryBufferLength(long id0)
  {
    SetMemoryBufferLength_12(id0);
  }

  private native long GetMemoryBufferLength_13();
  public long GetMemoryBufferLength()
  {
    return GetMemoryBufferLength_13();
  }

  private native void SetDataScalarType_14(int id0);
  public void SetDataScalarType(int id0)
  {
    SetDataScalarType_14(id0);
  }

  private native void SetDataScalarTypeToFloat_15();
  public void SetDataScalarTypeToFloat()
  {
    SetDataScalarTypeToFloat_15();
  }

  private native void SetDataScalarTypeToDouble_16();
  public void SetDataScalarTypeToDouble()
  {
    SetDataScalarTypeToDouble_16();
  }

  private native void SetDataScalarTypeToInt_17();
  public void SetDataScalarTypeToInt()
  {
    SetDataScalarTypeToInt_17();
  }

  private native void SetDataScalarTypeToUnsignedInt_18();
  public void SetDataScalarTypeToUnsignedInt()
  {
    SetDataScalarTypeToUnsignedInt_18();
  }

  private native void SetDataScalarTypeToShort_19();
  public void SetDataScalarTypeToShort()
  {
    SetDataScalarTypeToShort_19();
  }

  private native void SetDataScalarTypeToUnsignedShort_20();
  public void SetDataScalarTypeToUnsignedShort()
  {
    SetDataScalarTypeToUnsignedShort_20();
  }

  private native void SetDataScalarTypeToChar_21();
  public void SetDataScalarTypeToChar()
  {
    SetDataScalarTypeToChar_21();
  }

  private native void SetDataScalarTypeToSignedChar_22();
  public void SetDataScalarTypeToSignedChar()
  {
    SetDataScalarTypeToSignedChar_22();
  }

  private native void SetDataScalarTypeToUnsignedChar_23();
  public void SetDataScalarTypeToUnsignedChar()
  {
    SetDataScalarTypeToUnsignedChar_23();
  }

  private native int GetDataScalarType_24();
  public int GetDataScalarType()
  {
    return GetDataScalarType_24();
  }

  private native void SetNumberOfScalarComponents_25(int id0);
  public void SetNumberOfScalarComponents(int id0)
  {
    SetNumberOfScalarComponents_25(id0);
  }

  private native int GetNumberOfScalarComponents_26();
  public int GetNumberOfScalarComponents()
  {
    return GetNumberOfScalarComponents_26();
  }

  private native void SetDataExtent_27(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetDataExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetDataExtent_27(id0,id1,id2,id3,id4,id5);
  }

  private native void SetDataExtent_28(int id0[]);
  public void SetDataExtent(int id0[])
  {
    SetDataExtent_28(id0);
  }

  private native int[] GetDataExtent_29();
  public int[] GetDataExtent()
  {
    return GetDataExtent_29();
  }

  private native void SetFileDimensionality_30(int id0);
  public void SetFileDimensionality(int id0)
  {
    SetFileDimensionality_30(id0);
  }

  private native int GetFileDimensionality_31();
  public int GetFileDimensionality()
  {
    return GetFileDimensionality_31();
  }

  private native void SetDataSpacing_32(double id0,double id1,double id2);
  public void SetDataSpacing(double id0,double id1,double id2)
  {
    SetDataSpacing_32(id0,id1,id2);
  }

  private native void SetDataSpacing_33(double id0[]);
  public void SetDataSpacing(double id0[])
  {
    SetDataSpacing_33(id0);
  }

  private native double[] GetDataSpacing_34();
  public double[] GetDataSpacing()
  {
    return GetDataSpacing_34();
  }

  private native void SetDataOrigin_35(double id0,double id1,double id2);
  public void SetDataOrigin(double id0,double id1,double id2)
  {
    SetDataOrigin_35(id0,id1,id2);
  }

  private native void SetDataOrigin_36(double id0[]);
  public void SetDataOrigin(double id0[])
  {
    SetDataOrigin_36(id0);
  }

  private native double[] GetDataOrigin_37();
  public double[] GetDataOrigin()
  {
    return GetDataOrigin_37();
  }

  private native double[] GetDataDirection_38();
  public double[] GetDataDirection()
  {
    return GetDataDirection_38();
  }

  private native long GetHeaderSize_39();
  public long GetHeaderSize()
  {
    return GetHeaderSize_39();
  }

  private native long GetHeaderSize_40(long id0);
  public long GetHeaderSize(long id0)
  {
    return GetHeaderSize_40(id0);
  }

  private native void SetHeaderSize_41(long id0);
  public void SetHeaderSize(long id0)
  {
    SetHeaderSize_41(id0);
  }

  private native void SetDataByteOrderToBigEndian_42();
  public void SetDataByteOrderToBigEndian()
  {
    SetDataByteOrderToBigEndian_42();
  }

  private native void SetDataByteOrderToLittleEndian_43();
  public void SetDataByteOrderToLittleEndian()
  {
    SetDataByteOrderToLittleEndian_43();
  }

  private native int GetDataByteOrder_44();
  public int GetDataByteOrder()
  {
    return GetDataByteOrder_44();
  }

  private native void SetDataByteOrder_45(int id0);
  public void SetDataByteOrder(int id0)
  {
    SetDataByteOrder_45(id0);
  }

  private native byte[] GetDataByteOrderAsString_46();
  public String GetDataByteOrderAsString()
  {
    return new String(GetDataByteOrderAsString_46(), StandardCharsets.UTF_8);
  }

  private native void SetFileNameSliceOffset_47(int id0);
  public void SetFileNameSliceOffset(int id0)
  {
    SetFileNameSliceOffset_47(id0);
  }

  private native int GetFileNameSliceOffset_48();
  public int GetFileNameSliceOffset()
  {
    return GetFileNameSliceOffset_48();
  }

  private native void SetFileNameSliceSpacing_49(int id0);
  public void SetFileNameSliceSpacing(int id0)
  {
    SetFileNameSliceSpacing_49(id0);
  }

  private native int GetFileNameSliceSpacing_50();
  public int GetFileNameSliceSpacing()
  {
    return GetFileNameSliceSpacing_50();
  }

  private native void SetSwapBytes_51(int id0);
  public void SetSwapBytes(int id0)
  {
    SetSwapBytes_51(id0);
  }

  private native int GetSwapBytes_52();
  public int GetSwapBytes()
  {
    return GetSwapBytes_52();
  }

  private native void SwapBytesOn_53();
  public void SwapBytesOn()
  {
    SwapBytesOn_53();
  }

  private native void SwapBytesOff_54();
  public void SwapBytesOff()
  {
    SwapBytesOff_54();
  }

  private native int OpenFile_55();
  public int OpenFile()
  {
    return OpenFile_55();
  }

  private native void CloseFile_56();
  public void CloseFile()
  {
    CloseFile_56();
  }

  private native void SeekFile_57(int id0,int id1,int id2);
  public void SeekFile(int id0,int id1,int id2)
  {
    SeekFile_57(id0,id1,id2);
  }

  private native void FileLowerLeftOn_58();
  public void FileLowerLeftOn()
  {
    FileLowerLeftOn_58();
  }

  private native void FileLowerLeftOff_59();
  public void FileLowerLeftOff()
  {
    FileLowerLeftOff_59();
  }

  private native int GetFileLowerLeft_60();
  public int GetFileLowerLeft()
  {
    return GetFileLowerLeft_60();
  }

  private native void SetFileLowerLeft_61(int id0);
  public void SetFileLowerLeft(int id0)
  {
    SetFileLowerLeft_61(id0);
  }

  private native void ComputeInternalFileName_62(int id0);
  public void ComputeInternalFileName(int id0)
  {
    ComputeInternalFileName_62(id0);
  }

  private native byte[] GetInternalFileName_63();
  public String GetInternalFileName()
  {
    return new String(GetInternalFileName_63(), StandardCharsets.UTF_8);
  }

  private native int CanReadFile_64(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_64(bytes0, bytes0.length);
  }

  private native byte[] GetFileExtensions_65();
  public String GetFileExtensions()
  {
    return new String(GetFileExtensions_65(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDescriptiveName_66();
  public String GetDescriptiveName()
  {
    return new String(GetDescriptiveName_66(), StandardCharsets.UTF_8);
  }

  public vtkImageReader2() { super(); }

  public vtkImageReader2(long id) { super(id); }
  public native long   VTKInit();

}
