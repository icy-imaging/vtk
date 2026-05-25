// java wrapper for vtkCollectionIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCollectionIterator extends vtkObject
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

  private native void SetCollection_4(vtkCollection id0);
  public void SetCollection(vtkCollection id0)
  {
    SetCollection_4(id0);
  }

  private native long GetCollection_5();
  public vtkCollection GetCollection()
  {
    long temp = GetCollection_5();

    if (temp == 0) return null;
    return (vtkCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitTraversal_6();
  public void InitTraversal()
  {
    InitTraversal_6();
  }

  private native void GoToFirstItem_7();
  public void GoToFirstItem()
  {
    GoToFirstItem_7();
  }

  private native void GoToNextItem_8();
  public void GoToNextItem()
  {
    GoToNextItem_8();
  }

  private native int IsDoneWithTraversal_9();
  public int IsDoneWithTraversal()
  {
    return IsDoneWithTraversal_9();
  }

  private native long GetCurrentObject_10();
  public vtkObject GetCurrentObject()
  {
    long temp = GetCurrentObject_10();

    if (temp == 0) return null;
    return (vtkObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkCollectionIterator() { super(); }

  public vtkCollectionIterator(long id) { super(id); }
  public native long   VTKInit();

}
