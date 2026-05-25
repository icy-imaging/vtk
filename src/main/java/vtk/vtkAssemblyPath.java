// java wrapper for vtkAssemblyPath object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAssemblyPath extends vtkCollection
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

  private native void AddNode_4(vtkProp id0,vtkMatrix4x4 id1);
  public void AddNode(vtkProp id0,vtkMatrix4x4 id1)
  {
    AddNode_4(id0,id1);
  }

  private native long GetNextNode_5();
  public vtkAssemblyNode GetNextNode()
  {
    long temp = GetNextNode_5();

    if (temp == 0) return null;
    return (vtkAssemblyNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFirstNode_6();
  public vtkAssemblyNode GetFirstNode()
  {
    long temp = GetFirstNode_6();

    if (temp == 0) return null;
    return (vtkAssemblyNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLastNode_7();
  public vtkAssemblyNode GetLastNode()
  {
    long temp = GetLastNode_7();

    if (temp == 0) return null;
    return (vtkAssemblyNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void DeleteLastNode_8();
  public void DeleteLastNode()
  {
    DeleteLastNode_8();
  }

  private native void ShallowCopy_9(vtkAssemblyPath id0);
  public void ShallowCopy(vtkAssemblyPath id0)
  {
    ShallowCopy_9(id0);
  }

  private native long GetMTime_10();
  public long GetMTime()
  {
    return GetMTime_10();
  }

  public vtkAssemblyPath() { super(); }

  public vtkAssemblyPath(long id) { super(id); }
  public native long   VTKInit();

}
