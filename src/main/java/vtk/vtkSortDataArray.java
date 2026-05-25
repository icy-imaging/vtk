// java wrapper for vtkSortDataArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSortDataArray extends vtkObject
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

  private native void Sort_4(vtkIdList id0);
  public void Sort(vtkIdList id0)
  {
    Sort_4(id0);
  }

  private native void Sort_5(vtkAbstractArray id0);
  public void Sort(vtkAbstractArray id0)
  {
    Sort_5(id0);
  }

  private native void Sort_6(vtkIdList id0,int id1);
  public void Sort(vtkIdList id0,int id1)
  {
    Sort_6(id0,id1);
  }

  private native void Sort_7(vtkAbstractArray id0,int id1);
  public void Sort(vtkAbstractArray id0,int id1)
  {
    Sort_7(id0,id1);
  }

  private native void Sort_8(vtkAbstractArray id0,vtkAbstractArray id1);
  public void Sort(vtkAbstractArray id0,vtkAbstractArray id1)
  {
    Sort_8(id0,id1);
  }

  private native void Sort_9(vtkAbstractArray id0,vtkIdList id1);
  public void Sort(vtkAbstractArray id0,vtkIdList id1)
  {
    Sort_9(id0,id1);
  }

  private native void Sort_10(vtkAbstractArray id0,vtkAbstractArray id1,int id2);
  public void Sort(vtkAbstractArray id0,vtkAbstractArray id1,int id2)
  {
    Sort_10(id0,id1,id2);
  }

  private native void Sort_11(vtkAbstractArray id0,vtkIdList id1,int id2);
  public void Sort(vtkAbstractArray id0,vtkIdList id1,int id2)
  {
    Sort_11(id0,id1,id2);
  }

  private native void SortArrayByComponent_12(vtkAbstractArray id0,int id1);
  public void SortArrayByComponent(vtkAbstractArray id0,int id1)
  {
    SortArrayByComponent_12(id0,id1);
  }

  private native void SortArrayByComponent_13(vtkAbstractArray id0,int id1,int id2);
  public void SortArrayByComponent(vtkAbstractArray id0,int id1,int id2)
  {
    SortArrayByComponent_13(id0,id1,id2);
  }

  public vtkSortDataArray() { super(); }

  public vtkSortDataArray(long id) { super(id); }
  public native long   VTKInit();

}
