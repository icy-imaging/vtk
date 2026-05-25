// java wrapper for vtkStatisticsAlgorithm object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStatisticsAlgorithm extends vtkTableAlgorithm
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

  private native void SetLearnOptionParameterConnection_4(vtkAlgorithmOutput id0);
  public void SetLearnOptionParameterConnection(vtkAlgorithmOutput id0)
  {
    SetLearnOptionParameterConnection_4(id0);
  }

  private native void SetLearnOptionParameters_5(vtkDataObject id0);
  public void SetLearnOptionParameters(vtkDataObject id0)
  {
    SetLearnOptionParameters_5(id0);
  }

  private native void SetInputModelConnection_6(vtkAlgorithmOutput id0);
  public void SetInputModelConnection(vtkAlgorithmOutput id0)
  {
    SetInputModelConnection_6(id0);
  }

  private native void SetInputModel_7(vtkDataObject id0);
  public void SetInputModel(vtkDataObject id0)
  {
    SetInputModel_7(id0);
  }

  private native void SetLearnOption_8(boolean id0);
  public void SetLearnOption(boolean id0)
  {
    SetLearnOption_8(id0);
  }

  private native boolean GetLearnOption_9();
  public boolean GetLearnOption()
  {
    return GetLearnOption_9();
  }

  private native void SetDeriveOption_10(boolean id0);
  public void SetDeriveOption(boolean id0)
  {
    SetDeriveOption_10(id0);
  }

  private native boolean GetDeriveOption_11();
  public boolean GetDeriveOption()
  {
    return GetDeriveOption_11();
  }

  private native void SetAssessOption_12(boolean id0);
  public void SetAssessOption(boolean id0)
  {
    SetAssessOption_12(id0);
  }

  private native boolean GetAssessOption_13();
  public boolean GetAssessOption()
  {
    return GetAssessOption_13();
  }

  private native void SetTestOption_14(boolean id0);
  public void SetTestOption(boolean id0)
  {
    SetTestOption_14(id0);
  }

  private native boolean GetTestOption_15();
  public boolean GetTestOption()
  {
    return GetTestOption_15();
  }

  private native void SetNumberOfPrimaryTables_16(long id0);
  public void SetNumberOfPrimaryTables(long id0)
  {
    SetNumberOfPrimaryTables_16(id0);
  }

  private native long GetNumberOfPrimaryTables_17();
  public long GetNumberOfPrimaryTables()
  {
    return GetNumberOfPrimaryTables_17();
  }

  private native void SetAssessNames_18(vtkStringArray id0);
  public void SetAssessNames(vtkStringArray id0)
  {
    SetAssessNames_18(id0);
  }

  private native long GetAssessNames_19();
  public vtkStringArray GetAssessNames()
  {
    long temp = GetAssessNames_19();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetColumnStatus_20(byte[] id0, int len0,int id1);
  public void SetColumnStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetColumnStatus_20(bytes0, bytes0.length,id1);
  }

  private native void ResetAllColumnStates_21();
  public void ResetAllColumnStates()
  {
    ResetAllColumnStates_21();
  }

  private native int RequestSelectedColumns_22();
  public int RequestSelectedColumns()
  {
    return RequestSelectedColumns_22();
  }

  private native void ResetRequests_23();
  public void ResetRequests()
  {
    ResetRequests_23();
  }

  private native long GetNumberOfRequests_24();
  public long GetNumberOfRequests()
  {
    return GetNumberOfRequests_24();
  }

  private native long GetNumberOfColumnsForRequest_25(long id0);
  public long GetNumberOfColumnsForRequest(long id0)
  {
    return GetNumberOfColumnsForRequest_25(id0);
  }

  private native byte[] GetColumnForRequest_26(long id0,long id1);
  public String GetColumnForRequest(long id0,long id1)
  {
    return new String(GetColumnForRequest_26(id0,id1), StandardCharsets.UTF_8);
  }

  private native int GetColumnForRequest_27(long id0,long id1,byte[] id2, int len2);
  public int GetColumnForRequest(long id0,long id1,String id2)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return GetColumnForRequest_27(id0,id1,bytes2, bytes2.length);
  }

  private native void AddColumn_28(byte[] id0, int len0);
  public void AddColumn(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddColumn_28(bytes0, bytes0.length);
  }

  private native void AddColumnPair_29(byte[] id0, int len0,byte[] id1, int len1);
  public void AddColumnPair(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddColumnPair_29(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void Aggregate_30(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1);
  public void Aggregate(vtkDataObjectCollection id0,vtkMultiBlockDataSet id1)
  {
    Aggregate_30(id0,id1);
  }

  public vtkStatisticsAlgorithm() { super(); }

  public vtkStatisticsAlgorithm(long id) { super(id); }

}
