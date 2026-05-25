// java wrapper for vtkFieldDataToDataSetAttribute object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFieldDataToDataSetAttribute extends vtkPassInputTypeAlgorithm
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

  private native void SetProcessAllArrays_4(boolean id0);
  public void SetProcessAllArrays(boolean id0)
  {
    SetProcessAllArrays_4(id0);
  }

  private native boolean GetProcessAllArrays_5();
  public boolean GetProcessAllArrays()
  {
    return GetProcessAllArrays_5();
  }

  private native void ProcessAllArraysOn_6();
  public void ProcessAllArraysOn()
  {
    ProcessAllArraysOn_6();
  }

  private native void ProcessAllArraysOff_7();
  public void ProcessAllArraysOff()
  {
    ProcessAllArraysOff_7();
  }

  private native void SetOutputFieldType_8(int id0);
  public void SetOutputFieldType(int id0)
  {
    SetOutputFieldType_8(id0);
  }

  private native int GetOutputFieldType_9();
  public int GetOutputFieldType()
  {
    return GetOutputFieldType_9();
  }

  private native void AddFieldDataArray_10(byte[] id0, int len0);
  public void AddFieldDataArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddFieldDataArray_10(bytes0, bytes0.length);
  }

  private native void RemoveFieldDataArray_11(byte[] id0, int len0);
  public void RemoveFieldDataArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveFieldDataArray_11(bytes0, bytes0.length);
  }

  private native void ClearFieldDataArrays_12();
  public void ClearFieldDataArrays()
  {
    ClearFieldDataArrays_12();
  }

  public vtkFieldDataToDataSetAttribute() { super(); }

  public vtkFieldDataToDataSetAttribute(long id) { super(id); }
  public native long   VTKInit();

}
