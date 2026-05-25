// java wrapper for vtkSocketCollection object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSocketCollection extends vtkCollection
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

  private native void AddItem_4(vtkSocket id0);
  public void AddItem(vtkSocket id0)
  {
    AddItem_4(id0);
  }

  private native int SelectSockets_5(long id0);
  public int SelectSockets(long id0)
  {
    return SelectSockets_5(id0);
  }

  private native long GetLastSelectedSocket_6();
  public vtkSocket GetLastSelectedSocket()
  {
    long temp = GetLastSelectedSocket_6();

    if (temp == 0) return null;
    return (vtkSocket)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ReplaceItem_7(int id0,vtkObject id1);
  public void ReplaceItem(int id0,vtkObject id1)
  {
    ReplaceItem_7(id0,id1);
  }

  private native void RemoveItem_8(int id0);
  public void RemoveItem(int id0)
  {
    RemoveItem_8(id0);
  }

  private native void RemoveItem_9(vtkObject id0);
  public void RemoveItem(vtkObject id0)
  {
    RemoveItem_9(id0);
  }

  private native void RemoveAllItems_10();
  public void RemoveAllItems()
  {
    RemoveAllItems_10();
  }

  public vtkSocketCollection() { super(); }

  public vtkSocketCollection(long id) { super(id); }
  public native long   VTKInit();

}
