// java wrapper for vtkActor2DCollection object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkActor2DCollection extends vtkPropCollection
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

  private native void Sort_4();
  public void Sort()
  {
    Sort_4();
  }

  private native void AddItem_5(vtkActor2D id0);
  public void AddItem(vtkActor2D id0)
  {
    AddItem_5(id0);
  }

  private native int IsItemPresent_6(vtkActor2D id0);
  public int IsItemPresent(vtkActor2D id0)
  {
    return IsItemPresent_6(id0);
  }

  private native int IndexOfFirstOccurence_7(vtkActor2D id0);
  public int IndexOfFirstOccurence(vtkActor2D id0)
  {
    return IndexOfFirstOccurence_7(id0);
  }

  private native long GetNextActor2D_8();
  public vtkActor2D GetNextActor2D()
  {
    long temp = GetNextActor2D_8();

    if (temp == 0) return null;
    return (vtkActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLastActor2D_9();
  public vtkActor2D GetLastActor2D()
  {
    long temp = GetLastActor2D_9();

    if (temp == 0) return null;
    return (vtkActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNextItem_10();
  public vtkActor2D GetNextItem()
  {
    long temp = GetNextItem_10();

    if (temp == 0) return null;
    return (vtkActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLastItem_11();
  public vtkActor2D GetLastItem()
  {
    long temp = GetLastItem_11();

    if (temp == 0) return null;
    return (vtkActor2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RenderOverlay_12(vtkViewport id0);
  public void RenderOverlay(vtkViewport id0)
  {
    RenderOverlay_12(id0);
  }

  public vtkActor2DCollection() { super(); }

  public vtkActor2DCollection(long id) { super(id); }
  public native long   VTKInit();

}
