// java wrapper for vtkCellArrayIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellArrayIterator extends vtkObject
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

  private native long GetCellArray_4();
  public vtkCellArray GetCellArray()
  {
    long temp = GetCellArray_4();

    if (temp == 0) return null;
    return (vtkCellArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GoToCell_5(long id0);
  public void GoToCell(long id0)
  {
    GoToCell_5(id0);
  }

  private native void GetCellAtId_6(long id0,vtkIdList id1);
  public void GetCellAtId(long id0,vtkIdList id1)
  {
    GetCellAtId_6(id0,id1);
  }

  private native long GetCellAtId_7(long id0);
  public vtkIdList GetCellAtId(long id0)
  {
    long temp = GetCellAtId_7(id0);

    if (temp == 0) return null;
    return (vtkIdList)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GoToFirstCell_8();
  public void GoToFirstCell()
  {
    GoToFirstCell_8();
  }

  private native void GoToNextCell_9();
  public void GoToNextCell()
  {
    GoToNextCell_9();
  }

  private native boolean IsDoneWithTraversal_10();
  public boolean IsDoneWithTraversal()
  {
    return IsDoneWithTraversal_10();
  }

  private native long GetCurrentCellId_11();
  public long GetCurrentCellId()
  {
    return GetCurrentCellId_11();
  }

  private native void GetCurrentCell_12(vtkIdList id0);
  public void GetCurrentCell(vtkIdList id0)
  {
    GetCurrentCell_12(id0);
  }

  private native long GetCurrentCell_13();
  public vtkIdList GetCurrentCell()
  {
    long temp = GetCurrentCell_13();

    if (temp == 0) return null;
    return (vtkIdList)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ReplaceCurrentCell_14(vtkIdList id0);
  public void ReplaceCurrentCell(vtkIdList id0)
  {
    ReplaceCurrentCell_14(id0);
  }

  private native void ReverseCurrentCell_15();
  public void ReverseCurrentCell()
  {
    ReverseCurrentCell_15();
  }

  public vtkCellArrayIterator() { super(); }

  public vtkCellArrayIterator(long id) { super(id); }
  public native long   VTKInit();

}
