// java wrapper for vtkUnstructuredGridBase object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUnstructuredGridBase extends vtkPointSet
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

  private native void Allocate_5(long id0,int id1);
  public void Allocate(long id0,int id1)
  {
    Allocate_5(id0,id1);
  }

  private native void DeepCopy_6(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_6(id0);
  }

  private native long InsertNextCell_7(int id0,vtkIdList id1);
  public long InsertNextCell(int id0,vtkIdList id1)
  {
    return InsertNextCell_7(id0,id1);
  }

  private native void GetIdsOfCellsOfType_8(int id0,vtkIdTypeArray id1);
  public void GetIdsOfCellsOfType(int id0,vtkIdTypeArray id1)
  {
    GetIdsOfCellsOfType_8(id0,id1);
  }

  private native int IsHomogeneous_9();
  public int IsHomogeneous()
  {
    return IsHomogeneous_9();
  }

  private native long GetData_10(vtkInformation id0);
  public vtkUnstructuredGridBase GetData(vtkInformation id0)
  {
    long temp = GetData_10(id0);

    if (temp == 0) return null;
    return (vtkUnstructuredGridBase)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_11(vtkInformationVector id0,int id1);
  public vtkUnstructuredGridBase GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_11(id0,id1);

    if (temp == 0) return null;
    return (vtkUnstructuredGridBase)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkUnstructuredGridBase() { super(); }

  public vtkUnstructuredGridBase(long id) { super(id); }

}
