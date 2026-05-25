// java wrapper for vtkAssemblyPaths object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAssemblyPaths extends vtkCollection
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

  private native void AddItem_4(vtkAssemblyPath id0);
  public void AddItem(vtkAssemblyPath id0)
  {
    AddItem_4(id0);
  }

  private native void RemoveItem_5(vtkAssemblyPath id0);
  public void RemoveItem(vtkAssemblyPath id0)
  {
    RemoveItem_5(id0);
  }

  private native int IsItemPresent_6(vtkAssemblyPath id0);
  public int IsItemPresent(vtkAssemblyPath id0)
  {
    return IsItemPresent_6(id0);
  }

  private native long GetNextItem_7();
  public vtkAssemblyPath GetNextItem()
  {
    long temp = GetNextItem_7();

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_8();
  public long GetMTime()
  {
    return GetMTime_8();
  }

  public vtkAssemblyPaths() { super(); }

  public vtkAssemblyPaths(long id) { super(id); }
  public native long   VTKInit();

}
