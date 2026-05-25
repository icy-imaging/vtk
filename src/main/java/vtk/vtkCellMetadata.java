// java wrapper for vtkCellMetadata object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellMetadata extends vtkObject
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

  private native boolean SetCellGrid_4(vtkCellGrid id0);
  public boolean SetCellGrid(vtkCellGrid id0)
  {
    return SetCellGrid_4(id0);
  }

  private native long GetCellGrid_5();
  public vtkCellGrid GetCellGrid()
  {
    long temp = GetCellGrid_5();

    if (temp == 0) return null;
    return (vtkCellGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfCells_6();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_6();
  }

  private native boolean Query_7(vtkCellGridQuery id0);
  public boolean Query(vtkCellGridQuery id0)
  {
    return Query_7(id0);
  }

  private native void ShallowCopy_8(vtkCellMetadata id0);
  public void ShallowCopy(vtkCellMetadata id0)
  {
    ShallowCopy_8(id0);
  }

  private native void DeepCopy_9(vtkCellMetadata id0);
  public void DeepCopy(vtkCellMetadata id0)
  {
    DeepCopy_9(id0);
  }

  private native long GetResponders_10();
  public vtkCellGridResponders GetResponders()
  {
    long temp = GetResponders_10();

    if (temp == 0) return null;
    return (vtkCellGridResponders)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ClearResponders_11();
  public void ClearResponders()
  {
    ClearResponders_11();
  }

  private native long GetCaches_12();
  public vtkCellGridResponders GetCaches()
  {
    long temp = GetCaches_12();

    if (temp == 0) return null;
    return (vtkCellGridResponders)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkCellMetadata() { super(); }

  public vtkCellMetadata(long id) { super(id); }

}
