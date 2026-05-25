// java wrapper for vtkActorCollection object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkActorCollection extends vtkPropCollection
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

  private native void AddItem_4(vtkActor id0);
  public void AddItem(vtkActor id0)
  {
    AddItem_4(id0);
  }

  private native long GetNextActor_5();
  public vtkActor GetNextActor()
  {
    long temp = GetNextActor_5();

    if (temp == 0) return null;
    return (vtkActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLastActor_6();
  public vtkActor GetLastActor()
  {
    long temp = GetLastActor_6();

    if (temp == 0) return null;
    return (vtkActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNextItem_7();
  public vtkActor GetNextItem()
  {
    long temp = GetNextItem_7();

    if (temp == 0) return null;
    return (vtkActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLastItem_8();
  public vtkActor GetLastItem()
  {
    long temp = GetLastItem_8();

    if (temp == 0) return null;
    return (vtkActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ApplyProperties_9(vtkProperty id0);
  public void ApplyProperties(vtkProperty id0)
  {
    ApplyProperties_9(id0);
  }

  public vtkActorCollection() { super(); }

  public vtkActorCollection(long id) { super(id); }
  public native long   VTKInit();

}
