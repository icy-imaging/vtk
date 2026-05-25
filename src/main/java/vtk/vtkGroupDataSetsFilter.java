// java wrapper for vtkGroupDataSetsFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGroupDataSetsFilter extends vtkDataObjectAlgorithm
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

  private native void SetOutputType_4(int id0);
  public void SetOutputType(int id0)
  {
    SetOutputType_4(id0);
  }

  private native int GetOutputType_5();
  public int GetOutputType()
  {
    return GetOutputType_5();
  }

  private native void SetOutputTypeToPartitionedDataSet_6();
  public void SetOutputTypeToPartitionedDataSet()
  {
    SetOutputTypeToPartitionedDataSet_6();
  }

  private native void SetOutputTypeToPartitionedDataSetCollection_7();
  public void SetOutputTypeToPartitionedDataSetCollection()
  {
    SetOutputTypeToPartitionedDataSetCollection_7();
  }

  private native void SetOutputTypeToMultiBlockDataSet_8();
  public void SetOutputTypeToMultiBlockDataSet()
  {
    SetOutputTypeToMultiBlockDataSet_8();
  }

  private native void SetInputName_9(int id0,byte[] id1, int len1);
  public void SetInputName(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetInputName_9(id0,bytes1, bytes1.length);
  }

  private native byte[] GetInputName_10(int id0);
  public String GetInputName(int id0)
  {
    return new String(GetInputName_10(id0), StandardCharsets.UTF_8);
  }

  private native void ClearInputNames_11();
  public void ClearInputNames()
  {
    ClearInputNames_11();
  }

  public vtkGroupDataSetsFilter() { super(); }

  public vtkGroupDataSetsFilter(long id) { super(id); }
  public native long   VTKInit();

}
