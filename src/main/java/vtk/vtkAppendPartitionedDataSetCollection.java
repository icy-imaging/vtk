// java wrapper for vtkAppendPartitionedDataSetCollection object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAppendPartitionedDataSetCollection extends vtkPartitionedDataSetCollectionAlgorithm
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

  private native void SetAppendMode_4(int id0);
  public void SetAppendMode(int id0)
  {
    SetAppendMode_4(id0);
  }

  private native int GetAppendModeMinValue_5();
  public int GetAppendModeMinValue()
  {
    return GetAppendModeMinValue_5();
  }

  private native int GetAppendModeMaxValue_6();
  public int GetAppendModeMaxValue()
  {
    return GetAppendModeMaxValue_6();
  }

  private native void SetAppendModeToAppendPartitions_7();
  public void SetAppendModeToAppendPartitions()
  {
    SetAppendModeToAppendPartitions_7();
  }

  private native void SetAppendModeToMergePartitions_8();
  public void SetAppendModeToMergePartitions()
  {
    SetAppendModeToMergePartitions_8();
  }

  private native int GetAppendMode_9();
  public int GetAppendMode()
  {
    return GetAppendMode_9();
  }

  private native void SetAppendFieldData_10(boolean id0);
  public void SetAppendFieldData(boolean id0)
  {
    SetAppendFieldData_10(id0);
  }

  private native boolean GetAppendFieldData_11();
  public boolean GetAppendFieldData()
  {
    return GetAppendFieldData_11();
  }

  private native void AppendFieldDataOn_12();
  public void AppendFieldDataOn()
  {
    AppendFieldDataOn_12();
  }

  private native void AppendFieldDataOff_13();
  public void AppendFieldDataOff()
  {
    AppendFieldDataOff_13();
  }

  public vtkAppendPartitionedDataSetCollection() { super(); }

  public vtkAppendPartitionedDataSetCollection(long id) { super(id); }
  public native long   VTKInit();

}
