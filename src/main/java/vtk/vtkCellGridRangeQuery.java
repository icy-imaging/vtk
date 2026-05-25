// java wrapper for vtkCellGridRangeQuery object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellGridRangeQuery extends vtkCellGridQuery
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

  private native void SetComponent_4(int id0);
  public void SetComponent(int id0)
  {
    SetComponent_4(id0);
  }

  private native int GetComponent_5();
  public int GetComponent()
  {
    return GetComponent_5();
  }

  private native void SetFiniteRange_6(int id0);
  public void SetFiniteRange(int id0)
  {
    SetFiniteRange_6(id0);
  }

  private native int GetFiniteRange_7();
  public int GetFiniteRange()
  {
    return GetFiniteRange_7();
  }

  private native void SetCellGrid_8(vtkCellGrid id0);
  public void SetCellGrid(vtkCellGrid id0)
  {
    SetCellGrid_8(id0);
  }

  private native long GetCellGrid_9();
  public vtkCellGrid GetCellGrid()
  {
    long temp = GetCellGrid_9();

    if (temp == 0) return null;
    return (vtkCellGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCellAttribute_10(vtkCellAttribute id0);
  public void SetCellAttribute(vtkCellAttribute id0)
  {
    SetCellAttribute_10(id0);
  }

  private native long GetCellAttribute_11();
  public vtkCellAttribute GetCellAttribute()
  {
    long temp = GetCellAttribute_11();

    if (temp == 0) return null;
    return (vtkCellAttribute)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean Initialize_12();
  public boolean Initialize()
  {
    return Initialize_12();
  }

  private native boolean Finalize_13();
  public boolean Finalize()
  {
    return Finalize_13();
  }

  public vtkCellGridRangeQuery() { super(); }

  public vtkCellGridRangeQuery(long id) { super(id); }
  public native long   VTKInit();

}
