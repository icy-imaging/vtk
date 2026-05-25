// java wrapper for vtkDataObjectTree object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataObjectTree extends vtkCompositeDataSet
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

  private native long NewTreeIterator_4();
  public vtkDataObjectTreeIterator NewTreeIterator()
  {
    long temp = NewTreeIterator_4();

    if (temp == 0) return null;
    return (vtkDataObjectTreeIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long NewIterator_5();
  public vtkCompositeDataIterator NewIterator()
  {
    long temp = NewIterator_5();

    if (temp == 0) return null;
    return (vtkCompositeDataIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CopyStructure_6(vtkCompositeDataSet id0);
  public void CopyStructure(vtkCompositeDataSet id0)
  {
    CopyStructure_6(id0);
  }

  private native void SetDataSet_7(vtkCompositeDataIterator id0,vtkDataObject id1);
  public void SetDataSet(vtkCompositeDataIterator id0,vtkDataObject id1)
  {
    SetDataSet_7(id0,id1);
  }

  private native void SetDataSetFrom_8(vtkDataObjectTreeIterator id0,vtkDataObject id1);
  public void SetDataSetFrom(vtkDataObjectTreeIterator id0,vtkDataObject id1)
  {
    SetDataSetFrom_8(id0,id1);
  }

  private native long GetDataSet_9(vtkCompositeDataIterator id0);
  public vtkDataObject GetDataSet(vtkCompositeDataIterator id0)
  {
    long temp = GetDataSet_9(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMetaData_10(vtkCompositeDataIterator id0);
  public vtkInformation GetMetaData(vtkCompositeDataIterator id0)
  {
    long temp = GetMetaData_10(id0);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int HasMetaData_11(vtkCompositeDataIterator id0);
  public int HasMetaData(vtkCompositeDataIterator id0)
  {
    return HasMetaData_11(id0);
  }

  private native long GetActualMemorySize_12();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_12();
  }

  private native void Initialize_13();
  public void Initialize()
  {
    Initialize_13();
  }

  private native void CompositeShallowCopy_14(vtkCompositeDataSet id0);
  public void CompositeShallowCopy(vtkCompositeDataSet id0)
  {
    CompositeShallowCopy_14(id0);
  }

  private native void ShallowCopy_15(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_15(id0);
  }

  private native void DeepCopy_16(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_16(id0);
  }

  private native void RecursiveShallowCopy_17(vtkDataObject id0);
  public void RecursiveShallowCopy(vtkDataObject id0)
  {
    RecursiveShallowCopy_17(id0);
  }

  private native long GetNumberOfPoints_18();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_18();
  }

  private native long GetNumberOfCells_19();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_19();
  }

  private native int GetNumberOfChildren_20();
  public int GetNumberOfChildren()
  {
    return GetNumberOfChildren_20();
  }

  private native long GetChild_21(int id0);
  public vtkDataObject GetChild(int id0)
  {
    long temp = GetChild_21(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetChildMetaData_22(int id0);
  public vtkInformation GetChildMetaData(int id0)
  {
    long temp = GetChildMetaData_22(id0);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int HasChildMetaData_23(int id0);
  public int HasChildMetaData(int id0)
  {
    return HasChildMetaData_23(id0);
  }

  private native long GetData_24(vtkInformation id0);
  public vtkDataObjectTree GetData(vtkInformation id0)
  {
    long temp = GetData_24(id0);

    if (temp == 0) return null;
    return (vtkDataObjectTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_25(vtkInformationVector id0,int id1);
  public vtkDataObjectTree GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_25(id0,id1);

    if (temp == 0) return null;
    return (vtkDataObjectTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDataObjectType_26();
  public int GetDataObjectType()
  {
    return GetDataObjectType_26();
  }

  private native long GetDataSet_27(int id0);
  public vtkDataObject GetDataSet(int id0)
  {
    long temp = GetDataSet_27(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkDataObjectTree() { super(); }

  public vtkDataObjectTree(long id) { super(id); }

}
