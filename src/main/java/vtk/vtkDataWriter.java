// java wrapper for vtkDataWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataWriter extends vtkWriter
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

  private native void SetFileVersion_6(int id0);
  public void SetFileVersion(int id0)
  {
    SetFileVersion_6(id0);
  }

  private native int GetFileVersion_7();
  public int GetFileVersion()
  {
    return GetFileVersion_7();
  }

  private native int GetFileMajorVersion_8();
  public int GetFileMajorVersion()
  {
    return GetFileMajorVersion_8();
  }

  private native int GetFileMinorVersion_9();
  public int GetFileMinorVersion()
  {
    return GetFileMinorVersion_9();
  }

  private native void SetWriteToOutputString_10(int id0);
  public void SetWriteToOutputString(int id0)
  {
    SetWriteToOutputString_10(id0);
  }

  private native int GetWriteToOutputString_11();
  public int GetWriteToOutputString()
  {
    return GetWriteToOutputString_11();
  }

  private native void WriteToOutputStringOn_12();
  public void WriteToOutputStringOn()
  {
    WriteToOutputStringOn_12();
  }

  private native void WriteToOutputStringOff_13();
  public void WriteToOutputStringOff()
  {
    WriteToOutputStringOff_13();
  }

  private native long GetOutputStringLength_14();
  public long GetOutputStringLength()
  {
    return GetOutputStringLength_14();
  }

  private native byte[] GetOutputString_15();
  public String GetOutputString()
  {
    return new String(GetOutputString_15(), StandardCharsets.UTF_8);
  }

  private native byte[] GetOutputStdString_16();
  public String GetOutputStdString()
  {
    return new String(GetOutputStdString_16(), StandardCharsets.UTF_8);
  }

  private native byte[] RegisterAndGetOutputString_17();
  public String RegisterAndGetOutputString()
  {
    return new String(RegisterAndGetOutputString_17(), StandardCharsets.UTF_8);
  }

  private native void SetHeader_18(byte[] id0, int len0);
  public void SetHeader(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetHeader_18(bytes0, bytes0.length);
  }

  private native byte[] GetHeader_19();
  public String GetHeader()
  {
    return new String(GetHeader_19(), StandardCharsets.UTF_8);
  }

  private native void SetWriteArrayMetaData_20(boolean id0);
  public void SetWriteArrayMetaData(boolean id0)
  {
    SetWriteArrayMetaData_20(id0);
  }

  private native boolean GetWriteArrayMetaData_21();
  public boolean GetWriteArrayMetaData()
  {
    return GetWriteArrayMetaData_21();
  }

  private native void WriteArrayMetaDataOn_22();
  public void WriteArrayMetaDataOn()
  {
    WriteArrayMetaDataOn_22();
  }

  private native void WriteArrayMetaDataOff_23();
  public void WriteArrayMetaDataOff()
  {
    WriteArrayMetaDataOff_23();
  }

  private native void SetFileType_24(int id0);
  public void SetFileType(int id0)
  {
    SetFileType_24(id0);
  }

  private native int GetFileTypeMinValue_25();
  public int GetFileTypeMinValue()
  {
    return GetFileTypeMinValue_25();
  }

  private native int GetFileTypeMaxValue_26();
  public int GetFileTypeMaxValue()
  {
    return GetFileTypeMaxValue_26();
  }

  private native int GetFileType_27();
  public int GetFileType()
  {
    return GetFileType_27();
  }

  private native void SetFileTypeToASCII_28();
  public void SetFileTypeToASCII()
  {
    SetFileTypeToASCII_28();
  }

  private native void SetFileTypeToBinary_29();
  public void SetFileTypeToBinary()
  {
    SetFileTypeToBinary_29();
  }

  private native void SetScalarsName_30(byte[] id0, int len0);
  public void SetScalarsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScalarsName_30(bytes0, bytes0.length);
  }

  private native byte[] GetScalarsName_31();
  public String GetScalarsName()
  {
    return new String(GetScalarsName_31(), StandardCharsets.UTF_8);
  }

  private native void SetVectorsName_32(byte[] id0, int len0);
  public void SetVectorsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVectorsName_32(bytes0, bytes0.length);
  }

  private native byte[] GetVectorsName_33();
  public String GetVectorsName()
  {
    return new String(GetVectorsName_33(), StandardCharsets.UTF_8);
  }

  private native void SetTensorsName_34(byte[] id0, int len0);
  public void SetTensorsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTensorsName_34(bytes0, bytes0.length);
  }

  private native byte[] GetTensorsName_35();
  public String GetTensorsName()
  {
    return new String(GetTensorsName_35(), StandardCharsets.UTF_8);
  }

  private native void SetNormalsName_36(byte[] id0, int len0);
  public void SetNormalsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNormalsName_36(bytes0, bytes0.length);
  }

  private native byte[] GetNormalsName_37();
  public String GetNormalsName()
  {
    return new String(GetNormalsName_37(), StandardCharsets.UTF_8);
  }

  private native void SetTCoordsName_38(byte[] id0, int len0);
  public void SetTCoordsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTCoordsName_38(bytes0, bytes0.length);
  }

  private native byte[] GetTCoordsName_39();
  public String GetTCoordsName()
  {
    return new String(GetTCoordsName_39(), StandardCharsets.UTF_8);
  }

  private native void SetGlobalIdsName_40(byte[] id0, int len0);
  public void SetGlobalIdsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGlobalIdsName_40(bytes0, bytes0.length);
  }

  private native byte[] GetGlobalIdsName_41();
  public String GetGlobalIdsName()
  {
    return new String(GetGlobalIdsName_41(), StandardCharsets.UTF_8);
  }

  private native void SetPedigreeIdsName_42(byte[] id0, int len0);
  public void SetPedigreeIdsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPedigreeIdsName_42(bytes0, bytes0.length);
  }

  private native byte[] GetPedigreeIdsName_43();
  public String GetPedigreeIdsName()
  {
    return new String(GetPedigreeIdsName_43(), StandardCharsets.UTF_8);
  }

  private native void SetEdgeFlagsName_44(byte[] id0, int len0);
  public void SetEdgeFlagsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeFlagsName_44(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeFlagsName_45();
  public String GetEdgeFlagsName()
  {
    return new String(GetEdgeFlagsName_45(), StandardCharsets.UTF_8);
  }

  private native void SetLookupTableName_46(byte[] id0, int len0);
  public void SetLookupTableName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLookupTableName_46(bytes0, bytes0.length);
  }

  private native byte[] GetLookupTableName_47();
  public String GetLookupTableName()
  {
    return new String(GetLookupTableName_47(), StandardCharsets.UTF_8);
  }

  private native void SetFieldDataName_48(byte[] id0, int len0);
  public void SetFieldDataName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFieldDataName_48(bytes0, bytes0.length);
  }

  private native byte[] GetFieldDataName_49();
  public String GetFieldDataName()
  {
    return new String(GetFieldDataName_49(), StandardCharsets.UTF_8);
  }

  public vtkDataWriter() { super(); }

  public vtkDataWriter(long id) { super(id); }
  public native long   VTKInit();

}
