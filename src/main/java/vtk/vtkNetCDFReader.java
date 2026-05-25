// java wrapper for vtkNetCDFReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkNetCDFReader extends vtkDataObjectAlgorithm
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

  private native int UpdateMetaData_6();
  public int UpdateMetaData()
  {
    return UpdateMetaData_6();
  }

  private native int GetNumberOfVariableArrays_7();
  public int GetNumberOfVariableArrays()
  {
    return GetNumberOfVariableArrays_7();
  }

  private native byte[] GetVariableArrayName_8(int id0);
  public String GetVariableArrayName(int id0)
  {
    return new String(GetVariableArrayName_8(id0), StandardCharsets.UTF_8);
  }

  private native int GetVariableArrayStatus_9(byte[] id0, int len0);
  public int GetVariableArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetVariableArrayStatus_9(bytes0, bytes0.length);
  }

  private native void SetVariableArrayStatus_10(byte[] id0, int len0,int id1);
  public void SetVariableArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVariableArrayStatus_10(bytes0, bytes0.length,id1);
  }

  private native long GetAllVariableArrayNames_11();
  public vtkStringArray GetAllVariableArrayNames()
  {
    long temp = GetAllVariableArrayNames_11();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVariableDimensions_12();
  public vtkStringArray GetVariableDimensions()
  {
    long temp = GetVariableDimensions_12();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDimensions_13(byte[] id0, int len0);
  public void SetDimensions(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDimensions_13(bytes0, bytes0.length);
  }

  private native boolean ComputeArraySelection_14();
  public boolean ComputeArraySelection()
  {
    return ComputeArraySelection_14();
  }

  private native long GetAllDimensions_15();
  public vtkStringArray GetAllDimensions()
  {
    long temp = GetAllDimensions_15();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetReplaceFillValueWithNan_16();
  public int GetReplaceFillValueWithNan()
  {
    return GetReplaceFillValueWithNan_16();
  }

  private native void SetReplaceFillValueWithNan_17(int id0);
  public void SetReplaceFillValueWithNan(int id0)
  {
    SetReplaceFillValueWithNan_17(id0);
  }

  private native void ReplaceFillValueWithNanOn_18();
  public void ReplaceFillValueWithNanOn()
  {
    ReplaceFillValueWithNanOn_18();
  }

  private native void ReplaceFillValueWithNanOff_19();
  public void ReplaceFillValueWithNanOff()
  {
    ReplaceFillValueWithNanOff_19();
  }

  private native byte[] GetTimeUnits_20();
  public String GetTimeUnits()
  {
    return new String(GetTimeUnits_20(), StandardCharsets.UTF_8);
  }

  private native byte[] GetCalendar_21();
  public String GetCalendar()
  {
    return new String(GetCalendar_21(), StandardCharsets.UTF_8);
  }

  private native byte[] QueryArrayUnits_22(byte[] id0, int len0);
  public String QueryArrayUnits(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(QueryArrayUnits_22(bytes0, bytes0.length), StandardCharsets.UTF_8);
  }

  public vtkNetCDFReader() { super(); }

  public vtkNetCDFReader(long id) { super(id); }
  public native long   VTKInit();

}
