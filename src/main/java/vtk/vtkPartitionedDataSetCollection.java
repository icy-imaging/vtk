// java wrapper for vtkPartitionedDataSetCollection object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPartitionedDataSetCollection extends vtkDataObjectTree
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

  private native void SetNumberOfPartitionedDataSets_5(int id0);
  public void SetNumberOfPartitionedDataSets(int id0)
  {
    SetNumberOfPartitionedDataSets_5(id0);
  }

  private native int GetNumberOfPartitionedDataSets_6();
  public int GetNumberOfPartitionedDataSets()
  {
    return GetNumberOfPartitionedDataSets_6();
  }

  private native long GetPartitionedDataSet_7(int id0);
  public vtkPartitionedDataSet GetPartitionedDataSet(int id0)
  {
    long temp = GetPartitionedDataSet_7(id0);

    if (temp == 0) return null;
    return (vtkPartitionedDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPartitionedDataSet_8(int id0,vtkPartitionedDataSet id1);
  public void SetPartitionedDataSet(int id0,vtkPartitionedDataSet id1)
  {
    SetPartitionedDataSet_8(id0,id1);
  }

  private native void RemovePartitionedDataSet_9(int id0);
  public void RemovePartitionedDataSet(int id0)
  {
    RemovePartitionedDataSet_9(id0);
  }

  private native void SetPartition_10(int id0,int id1,vtkDataObject id2);
  public void SetPartition(int id0,int id1,vtkDataObject id2)
  {
    SetPartition_10(id0,id1,id2);
  }

  private native long GetPartition_11(int id0,int id1);
  public vtkDataSet GetPartition(int id0,int id1)
  {
    long temp = GetPartition_11(id0,id1);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPartitionAsDataObject_12(int id0,int id1);
  public vtkDataObject GetPartitionAsDataObject(int id0,int id1)
  {
    long temp = GetPartitionAsDataObject_12(id0,id1);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfPartitions_13(int id0);
  public int GetNumberOfPartitions(int id0)
  {
    return GetNumberOfPartitions_13(id0);
  }

  private native void SetNumberOfPartitions_14(int id0,int id1);
  public void SetNumberOfPartitions(int id0,int id1)
  {
    SetNumberOfPartitions_14(id0,id1);
  }

  private native int HasMetaData_15(int id0);
  public int HasMetaData(int id0)
  {
    return HasMetaData_15(id0);
  }

  private native long GetMetaData_16(int id0);
  public vtkInformation GetMetaData(int id0)
  {
    long temp = GetMetaData_16(id0);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataAssembly_17();
  public vtkDataAssembly GetDataAssembly()
  {
    long temp = GetDataAssembly_17();

    if (temp == 0) return null;
    return (vtkDataAssembly)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDataAssembly_18(vtkDataAssembly id0);
  public void SetDataAssembly(vtkDataAssembly id0)
  {
    SetDataAssembly_18(id0);
  }

  private native int GetCompositeIndex_19(int id0);
  public int GetCompositeIndex(int id0)
  {
    return GetCompositeIndex_19(id0);
  }

  private native int GetCompositeIndex_20(int id0,int id1);
  public int GetCompositeIndex(int id0,int id1)
  {
    return GetCompositeIndex_20(id0,id1);
  }

  private native long GetData_21(vtkInformation id0);
  public vtkPartitionedDataSetCollection GetData(vtkInformation id0)
  {
    long temp = GetData_21(id0);

    if (temp == 0) return null;
    return (vtkPartitionedDataSetCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_22(vtkInformationVector id0,int id1);
  public vtkPartitionedDataSetCollection GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_22(id0,id1);

    if (temp == 0) return null;
    return (vtkPartitionedDataSetCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMetaData_23(vtkCompositeDataIterator id0);
  public vtkInformation GetMetaData(vtkCompositeDataIterator id0)
  {
    long temp = GetMetaData_23(id0);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int HasMetaData_24(vtkCompositeDataIterator id0);
  public int HasMetaData(vtkCompositeDataIterator id0)
  {
    return HasMetaData_24(id0);
  }

  private native long GetMTime_25();
  public long GetMTime()
  {
    return GetMTime_25();
  }

  private native void CompositeShallowCopy_26(vtkCompositeDataSet id0);
  public void CompositeShallowCopy(vtkCompositeDataSet id0)
  {
    CompositeShallowCopy_26(id0);
  }

  private native void ShallowCopy_27(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_27(id0);
  }

  private native void DeepCopy_28(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_28(id0);
  }

  private native void CopyStructure_29(vtkCompositeDataSet id0);
  public void CopyStructure(vtkCompositeDataSet id0)
  {
    CopyStructure_29(id0);
  }

  private native void Initialize_30();
  public void Initialize()
  {
    Initialize_30();
  }

  public vtkPartitionedDataSetCollection() { super(); }

  public vtkPartitionedDataSetCollection(long id) { super(id); }
  public native long   VTKInit();

}
