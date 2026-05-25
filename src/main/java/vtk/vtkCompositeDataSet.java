// java wrapper for vtkCompositeDataSet object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCompositeDataSet extends vtkDataObject
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

  private native long NewIterator_4();
  public vtkCompositeDataIterator NewIterator()
  {
    long temp = NewIterator_4();

    if (temp == 0) return null;
    return (vtkCompositeDataIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDataObjectType_5();
  public int GetDataObjectType()
  {
    return GetDataObjectType_5();
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

  private native long GetDataSet_8(vtkCompositeDataIterator id0);
  public vtkDataObject GetDataSet(vtkCompositeDataIterator id0)
  {
    long temp = GetDataSet_8(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataSet_9(int id0);
  public vtkDataObject GetDataSet(int id0)
  {
    long temp = GetDataSet_9(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetActualMemorySize_10();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_10();
  }

  private native long GetData_11(vtkInformation id0);
  public vtkCompositeDataSet GetData(vtkInformation id0)
  {
    long temp = GetData_11(id0);

    if (temp == 0) return null;
    return (vtkCompositeDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_12(vtkInformationVector id0,int id1);
  public vtkCompositeDataSet GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_12(id0,id1);

    if (temp == 0) return null;
    return (vtkCompositeDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native void RecursiveShallowCopy_15(vtkDataObject id0);
  public void RecursiveShallowCopy(vtkDataObject id0)
  {
    RecursiveShallowCopy_15(id0);
  }

  private native long GetNumberOfPoints_16();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_16();
  }

  private native long GetNumberOfCells_17();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_17();
  }

  private native long GetNumberOfElements_18(int id0);
  public long GetNumberOfElements(int id0)
  {
    return GetNumberOfElements_18(id0);
  }

  private native void GetBounds_19(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_19(id0);
  }

  private native long NAME_20();
  public vtkInformationStringKey NAME()
  {
    long temp = NAME_20();

    if (temp == 0) return null;
    return (vtkInformationStringKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CURRENT_PROCESS_CAN_LOAD_BLOCK_21();
  public vtkInformationIntegerKey CURRENT_PROCESS_CAN_LOAD_BLOCK()
  {
    long temp = CURRENT_PROCESS_CAN_LOAD_BLOCK_21();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean SupportsGhostArray_22(int id0);
  public boolean SupportsGhostArray(int id0)
  {
    return SupportsGhostArray_22(id0);
  }

  public vtkCompositeDataSet() { super(); }

  public vtkCompositeDataSet(long id) { super(id); }

}
