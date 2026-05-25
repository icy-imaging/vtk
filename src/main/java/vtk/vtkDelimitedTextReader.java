// java wrapper for vtkDelimitedTextReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDelimitedTextReader extends vtkTableAlgorithm
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

  private native byte[] GetFileName_4();
  public String GetFileName()
  {
    return new String(GetFileName_4(), StandardCharsets.UTF_8);
  }

  private native void SetFileName_5(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_5(bytes0, bytes0.length);
  }

  private native void SetInputString_6(byte[] id0, int len0);
  public void SetInputString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputString_6(bytes0, bytes0.length);
  }

  private native byte[] GetInputString_7();
  public String GetInputString()
  {
    return new String(GetInputString_7(), StandardCharsets.UTF_8);
  }

  private native void SetInputString_8(byte[] id0, int len0,int id1);
  public void SetInputString(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputString_8(bytes0, bytes0.length,id1);
  }

  private native int GetInputStringLength_9();
  public int GetInputStringLength()
  {
    return GetInputStringLength_9();
  }

  private native void SetReadFromInputString_10(int id0);
  public void SetReadFromInputString(int id0)
  {
    SetReadFromInputString_10(id0);
  }

  private native int GetReadFromInputString_11();
  public int GetReadFromInputString()
  {
    return GetReadFromInputString_11();
  }

  private native void ReadFromInputStringOn_12();
  public void ReadFromInputStringOn()
  {
    ReadFromInputStringOn_12();
  }

  private native void ReadFromInputStringOff_13();
  public void ReadFromInputStringOff()
  {
    ReadFromInputStringOff_13();
  }

  private native byte[] GetUnicodeCharacterSet_14();
  public String GetUnicodeCharacterSet()
  {
    return new String(GetUnicodeCharacterSet_14(), StandardCharsets.UTF_8);
  }

  private native void SetUnicodeCharacterSet_15(byte[] id0, int len0);
  public void SetUnicodeCharacterSet(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUnicodeCharacterSet_15(bytes0, bytes0.length);
  }

  private native void SetUTF8RecordDelimiters_16(byte[] id0, int len0);
  public void SetUTF8RecordDelimiters(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUTF8RecordDelimiters_16(bytes0, bytes0.length);
  }

  private native byte[] GetUTF8RecordDelimiters_17();
  public String GetUTF8RecordDelimiters()
  {
    return new String(GetUTF8RecordDelimiters_17(), StandardCharsets.UTF_8);
  }

  private native void SetFieldDelimiterCharacters_18(byte[] id0, int len0);
  public void SetFieldDelimiterCharacters(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFieldDelimiterCharacters_18(bytes0, bytes0.length);
  }

  private native byte[] GetFieldDelimiterCharacters_19();
  public String GetFieldDelimiterCharacters()
  {
    return new String(GetFieldDelimiterCharacters_19(), StandardCharsets.UTF_8);
  }

  private native void SetUTF8FieldDelimiters_20(byte[] id0, int len0);
  public void SetUTF8FieldDelimiters(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUTF8FieldDelimiters_20(bytes0, bytes0.length);
  }

  private native byte[] GetUTF8FieldDelimiters_21();
  public String GetUTF8FieldDelimiters()
  {
    return new String(GetUTF8FieldDelimiters_21(), StandardCharsets.UTF_8);
  }

  private native char GetStringDelimiter_22();
  public char GetStringDelimiter()
  {
    return GetStringDelimiter_22();
  }

  private native void SetStringDelimiter_23(char id0);
  public void SetStringDelimiter(char id0)
  {
    SetStringDelimiter_23(id0);
  }

  private native void SetUTF8StringDelimiters_24(byte[] id0, int len0);
  public void SetUTF8StringDelimiters(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetUTF8StringDelimiters_24(bytes0, bytes0.length);
  }

  private native byte[] GetUTF8StringDelimiters_25();
  public String GetUTF8StringDelimiters()
  {
    return new String(GetUTF8StringDelimiters_25(), StandardCharsets.UTF_8);
  }

  private native void SetUseStringDelimiter_26(boolean id0);
  public void SetUseStringDelimiter(boolean id0)
  {
    SetUseStringDelimiter_26(id0);
  }

  private native boolean GetUseStringDelimiter_27();
  public boolean GetUseStringDelimiter()
  {
    return GetUseStringDelimiter_27();
  }

  private native void UseStringDelimiterOn_28();
  public void UseStringDelimiterOn()
  {
    UseStringDelimiterOn_28();
  }

  private native void UseStringDelimiterOff_29();
  public void UseStringDelimiterOff()
  {
    UseStringDelimiterOff_29();
  }

  private native boolean GetHaveHeaders_30();
  public boolean GetHaveHeaders()
  {
    return GetHaveHeaders_30();
  }

  private native void SetHaveHeaders_31(boolean id0);
  public void SetHaveHeaders(boolean id0)
  {
    SetHaveHeaders_31(id0);
  }

  private native void SetMergeConsecutiveDelimiters_32(boolean id0);
  public void SetMergeConsecutiveDelimiters(boolean id0)
  {
    SetMergeConsecutiveDelimiters_32(id0);
  }

  private native boolean GetMergeConsecutiveDelimiters_33();
  public boolean GetMergeConsecutiveDelimiters()
  {
    return GetMergeConsecutiveDelimiters_33();
  }

  private native void MergeConsecutiveDelimitersOn_34();
  public void MergeConsecutiveDelimitersOn()
  {
    MergeConsecutiveDelimitersOn_34();
  }

  private native void MergeConsecutiveDelimitersOff_35();
  public void MergeConsecutiveDelimitersOff()
  {
    MergeConsecutiveDelimitersOff_35();
  }

  private native long GetMaxRecords_36();
  public long GetMaxRecords()
  {
    return GetMaxRecords_36();
  }

  private native void SetMaxRecords_37(long id0);
  public void SetMaxRecords(long id0)
  {
    SetMaxRecords_37(id0);
  }

  private native void SetDetectNumericColumns_38(boolean id0);
  public void SetDetectNumericColumns(boolean id0)
  {
    SetDetectNumericColumns_38(id0);
  }

  private native boolean GetDetectNumericColumns_39();
  public boolean GetDetectNumericColumns()
  {
    return GetDetectNumericColumns_39();
  }

  private native void DetectNumericColumnsOn_40();
  public void DetectNumericColumnsOn()
  {
    DetectNumericColumnsOn_40();
  }

  private native void DetectNumericColumnsOff_41();
  public void DetectNumericColumnsOff()
  {
    DetectNumericColumnsOff_41();
  }

  private native void SetForceDouble_42(boolean id0);
  public void SetForceDouble(boolean id0)
  {
    SetForceDouble_42(id0);
  }

  private native boolean GetForceDouble_43();
  public boolean GetForceDouble()
  {
    return GetForceDouble_43();
  }

  private native void ForceDoubleOn_44();
  public void ForceDoubleOn()
  {
    ForceDoubleOn_44();
  }

  private native void ForceDoubleOff_45();
  public void ForceDoubleOff()
  {
    ForceDoubleOff_45();
  }

  private native void SetTrimWhitespacePriorToNumericConversion_46(boolean id0);
  public void SetTrimWhitespacePriorToNumericConversion(boolean id0)
  {
    SetTrimWhitespacePriorToNumericConversion_46(id0);
  }

  private native boolean GetTrimWhitespacePriorToNumericConversion_47();
  public boolean GetTrimWhitespacePriorToNumericConversion()
  {
    return GetTrimWhitespacePriorToNumericConversion_47();
  }

  private native void TrimWhitespacePriorToNumericConversionOn_48();
  public void TrimWhitespacePriorToNumericConversionOn()
  {
    TrimWhitespacePriorToNumericConversionOn_48();
  }

  private native void TrimWhitespacePriorToNumericConversionOff_49();
  public void TrimWhitespacePriorToNumericConversionOff()
  {
    TrimWhitespacePriorToNumericConversionOff_49();
  }

  private native void SetDefaultIntegerValue_50(int id0);
  public void SetDefaultIntegerValue(int id0)
  {
    SetDefaultIntegerValue_50(id0);
  }

  private native int GetDefaultIntegerValue_51();
  public int GetDefaultIntegerValue()
  {
    return GetDefaultIntegerValue_51();
  }

  private native void SetDefaultDoubleValue_52(double id0);
  public void SetDefaultDoubleValue(double id0)
  {
    SetDefaultDoubleValue_52(id0);
  }

  private native double GetDefaultDoubleValue_53();
  public double GetDefaultDoubleValue()
  {
    return GetDefaultDoubleValue_53();
  }

  private native void SetPedigreeIdArrayName_54(byte[] id0, int len0);
  public void SetPedigreeIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPedigreeIdArrayName_54(bytes0, bytes0.length);
  }

  private native byte[] GetPedigreeIdArrayName_55();
  public String GetPedigreeIdArrayName()
  {
    return new String(GetPedigreeIdArrayName_55(), StandardCharsets.UTF_8);
  }

  private native void SetGeneratePedigreeIds_56(boolean id0);
  public void SetGeneratePedigreeIds(boolean id0)
  {
    SetGeneratePedigreeIds_56(id0);
  }

  private native boolean GetGeneratePedigreeIds_57();
  public boolean GetGeneratePedigreeIds()
  {
    return GetGeneratePedigreeIds_57();
  }

  private native void GeneratePedigreeIdsOn_58();
  public void GeneratePedigreeIdsOn()
  {
    GeneratePedigreeIdsOn_58();
  }

  private native void GeneratePedigreeIdsOff_59();
  public void GeneratePedigreeIdsOff()
  {
    GeneratePedigreeIdsOff_59();
  }

  private native void SetOutputPedigreeIds_60(boolean id0);
  public void SetOutputPedigreeIds(boolean id0)
  {
    SetOutputPedigreeIds_60(id0);
  }

  private native boolean GetOutputPedigreeIds_61();
  public boolean GetOutputPedigreeIds()
  {
    return GetOutputPedigreeIds_61();
  }

  private native void OutputPedigreeIdsOn_62();
  public void OutputPedigreeIdsOn()
  {
    OutputPedigreeIdsOn_62();
  }

  private native void OutputPedigreeIdsOff_63();
  public void OutputPedigreeIdsOff()
  {
    OutputPedigreeIdsOff_63();
  }

  private native void SetAddTabFieldDelimiter_64(boolean id0);
  public void SetAddTabFieldDelimiter(boolean id0)
  {
    SetAddTabFieldDelimiter_64(id0);
  }

  private native boolean GetAddTabFieldDelimiter_65();
  public boolean GetAddTabFieldDelimiter()
  {
    return GetAddTabFieldDelimiter_65();
  }

  private native void AddTabFieldDelimiterOn_66();
  public void AddTabFieldDelimiterOn()
  {
    AddTabFieldDelimiterOn_66();
  }

  private native void AddTabFieldDelimiterOff_67();
  public void AddTabFieldDelimiterOff()
  {
    AddTabFieldDelimiterOff_67();
  }

  private native byte[] GetLastError_68();
  public String GetLastError()
  {
    return new String(GetLastError_68(), StandardCharsets.UTF_8);
  }

  private native void SetReplacementCharacter_69(int id0);
  public void SetReplacementCharacter(int id0)
  {
    SetReplacementCharacter_69(id0);
  }

  private native int GetReplacementCharacter_70();
  public int GetReplacementCharacter()
  {
    return GetReplacementCharacter_70();
  }

  public vtkDelimitedTextReader() { super(); }

  public vtkDelimitedTextReader(long id) { super(id); }
  public native long   VTKInit();

}
