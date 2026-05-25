// java wrapper for vtkCollection object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCollection extends vtkObject
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

  private native void AddItem_4(vtkObject id0);
  public void AddItem(vtkObject id0)
  {
    AddItem_4(id0);
  }

  private native void InsertItem_5(int id0,vtkObject id1);
  public void InsertItem(int id0,vtkObject id1)
  {
    InsertItem_5(id0,id1);
  }

  private native void ReplaceItem_6(int id0,vtkObject id1);
  public void ReplaceItem(int id0,vtkObject id1)
  {
    ReplaceItem_6(id0,id1);
  }

  private native void RemoveItem_7(int id0);
  public void RemoveItem(int id0)
  {
    RemoveItem_7(id0);
  }

  private native void RemoveItem_8(vtkObject id0);
  public void RemoveItem(vtkObject id0)
  {
    RemoveItem_8(id0);
  }

  private native void RemoveAllItems_9();
  public void RemoveAllItems()
  {
    RemoveAllItems_9();
  }

  private native int IsItemPresent_10(vtkObject id0);
  public int IsItemPresent(vtkObject id0)
  {
    return IsItemPresent_10(id0);
  }

  private native int IndexOfFirstOccurence_11(vtkObject id0);
  public int IndexOfFirstOccurence(vtkObject id0)
  {
    return IndexOfFirstOccurence_11(id0);
  }

  private native int GetNumberOfItems_12();
  public int GetNumberOfItems()
  {
    return GetNumberOfItems_12();
  }

  private native void InitTraversal_13();
  public void InitTraversal()
  {
    InitTraversal_13();
  }

  private native long GetNextItemAsObject_14();
  public vtkObject GetNextItemAsObject()
  {
    long temp = GetNextItemAsObject_14();

    if (temp == 0) return null;
    return (vtkObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetItemAsObject_15(int id0);
  public vtkObject GetItemAsObject(int id0)
  {
    long temp = GetItemAsObject_15(id0);

    if (temp == 0) return null;
    return (vtkObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long NewIterator_16();
  public vtkCollectionIterator NewIterator()
  {
    long temp = NewIterator_16();

    if (temp == 0) return null;
    return (vtkCollectionIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean UsesGarbageCollector_17();
  public boolean UsesGarbageCollector()
  {
    return UsesGarbageCollector_17();
  }

  public vtkCollection() { super(); }

  public vtkCollection(long id) { super(id); }
  public native long   VTKInit();

}
