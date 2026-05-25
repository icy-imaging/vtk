// java wrapper for vtkSQLDatabaseSchema object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSQLDatabaseSchema extends vtkObject
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

  private native int AddPreamble_4(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2);
  public int AddPreamble(String id0,String id1,String id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return AddPreamble_4(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  private native int AddTable_5(byte[] id0, int len0);
  public int AddTable(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddTable_5(bytes0, bytes0.length);
  }

  private native int AddColumnToTable_6(int id0,int id1,byte[] id2, int len2,int id3,byte[] id4, int len4);
  public int AddColumnToTable(int id0,int id1,String id2,int id3,String id4)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    return AddColumnToTable_6(id0,id1,bytes2, bytes2.length,id3,bytes4, bytes4.length);
  }

  private native int AddColumnToTable_7(byte[] id0, int len0,int id1,byte[] id2, int len2,int id3,byte[] id4, int len4);
  public int AddColumnToTable(String id0,int id1,String id2,int id3,String id4)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    return AddColumnToTable_7(bytes0, bytes0.length,id1,bytes2, bytes2.length,id3,bytes4, bytes4.length);
  }

  private native int AddIndexToTable_8(int id0,int id1,byte[] id2, int len2);
  public int AddIndexToTable(int id0,int id1,String id2)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return AddIndexToTable_8(id0,id1,bytes2, bytes2.length);
  }

  private native int AddIndexToTable_9(byte[] id0, int len0,int id1,byte[] id2, int len2);
  public int AddIndexToTable(String id0,int id1,String id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return AddIndexToTable_9(bytes0, bytes0.length,id1,bytes2, bytes2.length);
  }

  private native int AddColumnToIndex_10(int id0,int id1,int id2);
  public int AddColumnToIndex(int id0,int id1,int id2)
  {
    return AddColumnToIndex_10(id0,id1,id2);
  }

  private native int AddColumnToIndex_11(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2);
  public int AddColumnToIndex(String id0,String id1,String id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return AddColumnToIndex_11(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  private native int AddTriggerToTable_12(int id0,int id1,byte[] id2, int len2,byte[] id3, int len3,byte[] id4, int len4);
  public int AddTriggerToTable(int id0,int id1,String id2,String id3,String id4)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    return AddTriggerToTable_12(id0,id1,bytes2, bytes2.length,bytes3, bytes3.length,bytes4, bytes4.length);
  }

  private native int AddTriggerToTable_13(byte[] id0, int len0,int id1,byte[] id2, int len2,byte[] id3, int len3,byte[] id4, int len4);
  public int AddTriggerToTable(String id0,int id1,String id2,String id3,String id4)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    return AddTriggerToTable_13(bytes0, bytes0.length,id1,bytes2, bytes2.length,bytes3, bytes3.length,bytes4, bytes4.length);
  }

  private native int AddOptionToTable_14(int id0,byte[] id1, int len1,byte[] id2, int len2);
  public int AddOptionToTable(int id0,String id1,String id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return AddOptionToTable_14(id0,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  private native int AddOptionToTable_15(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2);
  public int AddOptionToTable(String id0,String id1,String id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return AddOptionToTable_15(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  private native int GetPreambleHandleFromName_16(byte[] id0, int len0);
  public int GetPreambleHandleFromName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPreambleHandleFromName_16(bytes0, bytes0.length);
  }

  private native byte[] GetPreambleNameFromHandle_17(int id0);
  public String GetPreambleNameFromHandle(int id0)
  {
    return new String(GetPreambleNameFromHandle_17(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetPreambleActionFromHandle_18(int id0);
  public String GetPreambleActionFromHandle(int id0)
  {
    return new String(GetPreambleActionFromHandle_18(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetPreambleBackendFromHandle_19(int id0);
  public String GetPreambleBackendFromHandle(int id0)
  {
    return new String(GetPreambleBackendFromHandle_19(id0), StandardCharsets.UTF_8);
  }

  private native int GetTableHandleFromName_20(byte[] id0, int len0);
  public int GetTableHandleFromName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetTableHandleFromName_20(bytes0, bytes0.length);
  }

  private native byte[] GetTableNameFromHandle_21(int id0);
  public String GetTableNameFromHandle(int id0)
  {
    return new String(GetTableNameFromHandle_21(id0), StandardCharsets.UTF_8);
  }

  private native int GetIndexHandleFromName_22(byte[] id0, int len0,byte[] id1, int len1);
  public int GetIndexHandleFromName(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetIndexHandleFromName_22(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native byte[] GetIndexNameFromHandle_23(int id0,int id1);
  public String GetIndexNameFromHandle(int id0,int id1)
  {
    return new String(GetIndexNameFromHandle_23(id0,id1), StandardCharsets.UTF_8);
  }

  private native int GetIndexTypeFromHandle_24(int id0,int id1);
  public int GetIndexTypeFromHandle(int id0,int id1)
  {
    return GetIndexTypeFromHandle_24(id0,id1);
  }

  private native byte[] GetIndexColumnNameFromHandle_25(int id0,int id1,int id2);
  public String GetIndexColumnNameFromHandle(int id0,int id1,int id2)
  {
    return new String(GetIndexColumnNameFromHandle_25(id0,id1,id2), StandardCharsets.UTF_8);
  }

  private native int GetColumnHandleFromName_26(byte[] id0, int len0,byte[] id1, int len1);
  public int GetColumnHandleFromName(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetColumnHandleFromName_26(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native byte[] GetColumnNameFromHandle_27(int id0,int id1);
  public String GetColumnNameFromHandle(int id0,int id1)
  {
    return new String(GetColumnNameFromHandle_27(id0,id1), StandardCharsets.UTF_8);
  }

  private native int GetColumnTypeFromHandle_28(int id0,int id1);
  public int GetColumnTypeFromHandle(int id0,int id1)
  {
    return GetColumnTypeFromHandle_28(id0,id1);
  }

  private native int GetColumnSizeFromHandle_29(int id0,int id1);
  public int GetColumnSizeFromHandle(int id0,int id1)
  {
    return GetColumnSizeFromHandle_29(id0,id1);
  }

  private native byte[] GetColumnAttributesFromHandle_30(int id0,int id1);
  public String GetColumnAttributesFromHandle(int id0,int id1)
  {
    return new String(GetColumnAttributesFromHandle_30(id0,id1), StandardCharsets.UTF_8);
  }

  private native int GetTriggerHandleFromName_31(byte[] id0, int len0,byte[] id1, int len1);
  public int GetTriggerHandleFromName(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetTriggerHandleFromName_31(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native byte[] GetTriggerNameFromHandle_32(int id0,int id1);
  public String GetTriggerNameFromHandle(int id0,int id1)
  {
    return new String(GetTriggerNameFromHandle_32(id0,id1), StandardCharsets.UTF_8);
  }

  private native int GetTriggerTypeFromHandle_33(int id0,int id1);
  public int GetTriggerTypeFromHandle(int id0,int id1)
  {
    return GetTriggerTypeFromHandle_33(id0,id1);
  }

  private native byte[] GetTriggerActionFromHandle_34(int id0,int id1);
  public String GetTriggerActionFromHandle(int id0,int id1)
  {
    return new String(GetTriggerActionFromHandle_34(id0,id1), StandardCharsets.UTF_8);
  }

  private native byte[] GetTriggerBackendFromHandle_35(int id0,int id1);
  public String GetTriggerBackendFromHandle(int id0,int id1)
  {
    return new String(GetTriggerBackendFromHandle_35(id0,id1), StandardCharsets.UTF_8);
  }

  private native byte[] GetOptionTextFromHandle_36(int id0,int id1);
  public String GetOptionTextFromHandle(int id0,int id1)
  {
    return new String(GetOptionTextFromHandle_36(id0,id1), StandardCharsets.UTF_8);
  }

  private native byte[] GetOptionBackendFromHandle_37(int id0,int id1);
  public String GetOptionBackendFromHandle(int id0,int id1)
  {
    return new String(GetOptionBackendFromHandle_37(id0,id1), StandardCharsets.UTF_8);
  }

  private native void Reset_38();
  public void Reset()
  {
    Reset_38();
  }

  private native int GetNumberOfPreambles_39();
  public int GetNumberOfPreambles()
  {
    return GetNumberOfPreambles_39();
  }

  private native int GetNumberOfTables_40();
  public int GetNumberOfTables()
  {
    return GetNumberOfTables_40();
  }

  private native int GetNumberOfColumnsInTable_41(int id0);
  public int GetNumberOfColumnsInTable(int id0)
  {
    return GetNumberOfColumnsInTable_41(id0);
  }

  private native int GetNumberOfIndicesInTable_42(int id0);
  public int GetNumberOfIndicesInTable(int id0)
  {
    return GetNumberOfIndicesInTable_42(id0);
  }

  private native int GetNumberOfColumnNamesInIndex_43(int id0,int id1);
  public int GetNumberOfColumnNamesInIndex(int id0,int id1)
  {
    return GetNumberOfColumnNamesInIndex_43(id0,id1);
  }

  private native int GetNumberOfTriggersInTable_44(int id0);
  public int GetNumberOfTriggersInTable(int id0)
  {
    return GetNumberOfTriggersInTable_44(id0);
  }

  private native int GetNumberOfOptionsInTable_45(int id0);
  public int GetNumberOfOptionsInTable(int id0)
  {
    return GetNumberOfOptionsInTable_45(id0);
  }

  private native void SetName_46(byte[] id0, int len0);
  public void SetName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetName_46(bytes0, bytes0.length);
  }

  private native byte[] GetName_47();
  public String GetName()
  {
    return new String(GetName_47(), StandardCharsets.UTF_8);
  }

  private native int AddTableMultipleArguments_48(byte[] id0, int len0);
  public int AddTableMultipleArguments(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddTableMultipleArguments_48(bytes0, bytes0.length);
  }

  public vtkSQLDatabaseSchema() { super(); }

  public vtkSQLDatabaseSchema(long id) { super(id); }
  public native long   VTKInit();

}
