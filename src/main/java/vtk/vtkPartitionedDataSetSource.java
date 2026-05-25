// java wrapper for vtkPartitionedDataSetSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPartitionedDataSetSource extends vtkPartitionedDataSetAlgorithm
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

  private native void EnableRank_4(int id0);
  public void EnableRank(int id0)
  {
    EnableRank_4(id0);
  }

  private native void EnableAllRanks_5();
  public void EnableAllRanks()
  {
    EnableAllRanks_5();
  }

  private native void DisableRank_6(int id0);
  public void DisableRank(int id0)
  {
    DisableRank_6(id0);
  }

  private native void DisableAllRanks_7();
  public void DisableAllRanks()
  {
    DisableAllRanks_7();
  }

  private native boolean IsEnabledRank_8(int id0);
  public boolean IsEnabledRank(int id0)
  {
    return IsEnabledRank_8(id0);
  }

  private native void SetNumberOfPartitions_9(int id0);
  public void SetNumberOfPartitions(int id0)
  {
    SetNumberOfPartitions_9(id0);
  }

  private native int GetNumberOfPartitionsMinValue_10();
  public int GetNumberOfPartitionsMinValue()
  {
    return GetNumberOfPartitionsMinValue_10();
  }

  private native int GetNumberOfPartitionsMaxValue_11();
  public int GetNumberOfPartitionsMaxValue()
  {
    return GetNumberOfPartitionsMaxValue_11();
  }

  private native int GetNumberOfPartitions_12();
  public int GetNumberOfPartitions()
  {
    return GetNumberOfPartitions_12();
  }

  private native void SetParametricFunction_13(vtkParametricFunction id0);
  public void SetParametricFunction(vtkParametricFunction id0)
  {
    SetParametricFunction_13(id0);
  }

  private native long GetParametricFunction_14();
  public vtkParametricFunction GetParametricFunction()
  {
    long temp = GetParametricFunction_14();

    if (temp == 0) return null;
    return (vtkParametricFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPartitionedDataSetSource() { super(); }

  public vtkPartitionedDataSetSource(long id) { super(id); }
  public native long   VTKInit();

}
