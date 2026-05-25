// java wrapper for vtkPartitionedDataSet object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPartitionedDataSet extends vtkDataObjectTree
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

  private native int GetDataObjectType_4();
  public int GetDataObjectType()
  {
    return GetDataObjectType_4();
  }

  private native void SetNumberOfPartitions_5(int id0);
  public void SetNumberOfPartitions(int id0)
  {
    SetNumberOfPartitions_5(id0);
  }

  private native int GetNumberOfPartitions_6();
  public int GetNumberOfPartitions()
  {
    return GetNumberOfPartitions_6();
  }

  private native long GetPartition_7(int id0);
  public vtkDataSet GetPartition(int id0)
  {
    long temp = GetPartition_7(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPartitionAsDataObject_8(int id0);
  public vtkDataObject GetPartitionAsDataObject(int id0)
  {
    long temp = GetPartitionAsDataObject_8(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPartition_9(int id0,vtkDataObject id1);
  public void SetPartition(int id0,vtkDataObject id1)
  {
    SetPartition_9(id0,id1);
  }

  private native int HasMetaData_10(int id0);
  public int HasMetaData(int id0)
  {
    return HasMetaData_10(id0);
  }

  private native long GetMetaData_11(int id0);
  public vtkInformation GetMetaData(int id0)
  {
    long temp = GetMetaData_11(id0);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_12(vtkInformation id0);
  public vtkPartitionedDataSet GetData(vtkInformation id0)
  {
    long temp = GetData_12(id0);

    if (temp == 0) return null;
    return (vtkPartitionedDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_13(vtkInformationVector id0,int id1);
  public vtkPartitionedDataSet GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_13(id0,id1);

    if (temp == 0) return null;
    return (vtkPartitionedDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMetaData_14(vtkCompositeDataIterator id0);
  public vtkInformation GetMetaData(vtkCompositeDataIterator id0)
  {
    long temp = GetMetaData_14(id0);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int HasMetaData_15(vtkCompositeDataIterator id0);
  public int HasMetaData(vtkCompositeDataIterator id0)
  {
    return HasMetaData_15(id0);
  }

  private native void RemoveNullPartitions_16();
  public void RemoveNullPartitions()
  {
    RemoveNullPartitions_16();
  }

  public vtkPartitionedDataSet() { super(); }

  public vtkPartitionedDataSet(long id) { super(id); }
  public native long   VTKInit();

}
