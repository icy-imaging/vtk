// java wrapper for vtkTreeIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTreeIterator extends vtkObject
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

  private native void SetTree_4(vtkTree id0);
  public void SetTree(vtkTree id0)
  {
    SetTree_4(id0);
  }

  private native long GetTree_5();
  public vtkTree GetTree()
  {
    long temp = GetTree_5();

    if (temp == 0) return null;
    return (vtkTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetStartVertex_6(long id0);
  public void SetStartVertex(long id0)
  {
    SetStartVertex_6(id0);
  }

  private native long GetStartVertex_7();
  public long GetStartVertex()
  {
    return GetStartVertex_7();
  }

  private native long Next_8();
  public long Next()
  {
    return Next_8();
  }

  private native boolean HasNext_9();
  public boolean HasNext()
  {
    return HasNext_9();
  }

  private native void Restart_10();
  public void Restart()
  {
    Restart_10();
  }

  public vtkTreeIterator() { super(); }

  public vtkTreeIterator(long id) { super(id); }

}
