// java wrapper for vtkXMLReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLReader extends vtkAlgorithm
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

  private native void SetReadFromInputString_6(int id0);
  public void SetReadFromInputString(int id0)
  {
    SetReadFromInputString_6(id0);
  }

  private native int GetReadFromInputString_7();
  public int GetReadFromInputString()
  {
    return GetReadFromInputString_7();
  }

  private native void ReadFromInputStringOn_8();
  public void ReadFromInputStringOn()
  {
    ReadFromInputStringOn_8();
  }

  private native void ReadFromInputStringOff_9();
  public void ReadFromInputStringOff()
  {
    ReadFromInputStringOff_9();
  }

  private native void SetInputString_10(byte[] id0, int len0);
  public void SetInputString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputString_10(bytes0, bytes0.length);
  }

  private native void SetInputString_11(byte[] id0, int len0,int id1);
  public void SetInputString(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputString_11(bytes0, bytes0.length,id1);
  }

  private native void SetBinaryInputString_12(byte[] id0, int len0,int id1);
  public void SetBinaryInputString(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBinaryInputString_12(bytes0, bytes0.length,id1);
  }

  private native void SetInputArray_13(vtkCharArray id0);
  public void SetInputArray(vtkCharArray id0)
  {
    SetInputArray_13(id0);
  }

  private native int CanReadFile_14(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_14(bytes0, bytes0.length);
  }

  private native long GetOutputAsDataSet_15();
  public vtkDataSet GetOutputAsDataSet()
  {
    long temp = GetOutputAsDataSet_15();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutputAsDataSet_16(int id0);
  public vtkDataSet GetOutputAsDataSet(int id0)
  {
    long temp = GetOutputAsDataSet_16(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPointDataArraySelection_17();
  public vtkDataArraySelection GetPointDataArraySelection()
  {
    long temp = GetPointDataArraySelection_17();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellDataArraySelection_18();
  public vtkDataArraySelection GetCellDataArraySelection()
  {
    long temp = GetCellDataArraySelection_18();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetColumnArraySelection_19();
  public vtkDataArraySelection GetColumnArraySelection()
  {
    long temp = GetColumnArraySelection_19();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfPointArrays_20();
  public int GetNumberOfPointArrays()
  {
    return GetNumberOfPointArrays_20();
  }

  private native int GetNumberOfCellArrays_21();
  public int GetNumberOfCellArrays()
  {
    return GetNumberOfCellArrays_21();
  }

  private native int GetNumberOfColumnArrays_22();
  public int GetNumberOfColumnArrays()
  {
    return GetNumberOfColumnArrays_22();
  }

  private native int GetNumberOfTimeDataArrays_23();
  public int GetNumberOfTimeDataArrays()
  {
    return GetNumberOfTimeDataArrays_23();
  }

  private native byte[] GetTimeDataArray_24(int id0);
  public String GetTimeDataArray(int id0)
  {
    return new String(GetTimeDataArray_24(id0), StandardCharsets.UTF_8);
  }

  private native long GetTimeDataStringArray_25();
  public vtkStringArray GetTimeDataStringArray()
  {
    long temp = GetTimeDataStringArray_25();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetActiveTimeDataArrayName_26();
  public String GetActiveTimeDataArrayName()
  {
    return new String(GetActiveTimeDataArrayName_26(), StandardCharsets.UTF_8);
  }

  private native void SetActiveTimeDataArrayName_27(byte[] id0, int len0);
  public void SetActiveTimeDataArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetActiveTimeDataArrayName_27(bytes0, bytes0.length);
  }

  private native byte[] GetPointArrayName_28(int id0);
  public String GetPointArrayName(int id0)
  {
    return new String(GetPointArrayName_28(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetCellArrayName_29(int id0);
  public String GetCellArrayName(int id0)
  {
    return new String(GetCellArrayName_29(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetColumnArrayName_30(int id0);
  public String GetColumnArrayName(int id0)
  {
    return new String(GetColumnArrayName_30(id0), StandardCharsets.UTF_8);
  }

  private native int GetPointArrayStatus_31(byte[] id0, int len0);
  public int GetPointArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPointArrayStatus_31(bytes0, bytes0.length);
  }

  private native int GetCellArrayStatus_32(byte[] id0, int len0);
  public int GetCellArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetCellArrayStatus_32(bytes0, bytes0.length);
  }

  private native void SetPointArrayStatus_33(byte[] id0, int len0,int id1);
  public void SetPointArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointArrayStatus_33(bytes0, bytes0.length,id1);
  }

  private native void SetCellArrayStatus_34(byte[] id0, int len0,int id1);
  public void SetCellArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellArrayStatus_34(bytes0, bytes0.length,id1);
  }

  private native int GetColumnArrayStatus_35(byte[] id0, int len0);
  public int GetColumnArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetColumnArrayStatus_35(bytes0, bytes0.length);
  }

  private native void SetColumnArrayStatus_36(byte[] id0, int len0,int id1);
  public void SetColumnArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetColumnArrayStatus_36(bytes0, bytes0.length,id1);
  }

  private native void CopyOutputInformation_37(vtkInformation id0,int id1);
  public void CopyOutputInformation(vtkInformation id0,int id1)
  {
    CopyOutputInformation_37(id0,id1);
  }

  private native void SetTimeStep_38(int id0);
  public void SetTimeStep(int id0)
  {
    SetTimeStep_38(id0);
  }

  private native int GetTimeStep_39();
  public int GetTimeStep()
  {
    return GetTimeStep_39();
  }

  private native int GetNumberOfTimeSteps_40();
  public int GetNumberOfTimeSteps()
  {
    return GetNumberOfTimeSteps_40();
  }

  private native int[] GetTimeStepRange_41();
  public int[] GetTimeStepRange()
  {
    return GetTimeStepRange_41();
  }

  private native void SetTimeStepRange_42(int id0,int id1);
  public void SetTimeStepRange(int id0,int id1)
  {
    SetTimeStepRange_42(id0,id1);
  }

  private native void SetTimeStepRange_43(int id0[]);
  public void SetTimeStepRange(int id0[])
  {
    SetTimeStepRange_43(id0);
  }

  private native long GetXMLParser_44();
  public vtkXMLDataParser GetXMLParser()
  {
    long temp = GetXMLParser_44();

    if (temp == 0) return null;
    return (vtkXMLDataParser)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetReaderErrorObserver_45(vtkCommand id0);
  public void SetReaderErrorObserver(vtkCommand id0)
  {
    SetReaderErrorObserver_45(id0);
  }

  private native long GetReaderErrorObserver_46();
  public vtkCommand GetReaderErrorObserver()
  {
    long temp = GetReaderErrorObserver_46();

    if (temp == 0) return null;
    return (vtkCommand)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetParserErrorObserver_47(vtkCommand id0);
  public void SetParserErrorObserver(vtkCommand id0)
  {
    SetParserErrorObserver_47(id0);
  }

  private native long GetParserErrorObserver_48();
  public vtkCommand GetParserErrorObserver()
  {
    long temp = GetParserErrorObserver_48();

    if (temp == 0) return null;
    return (vtkCommand)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkXMLReader() { super(); }

  public vtkXMLReader(long id) { super(id); }

}
