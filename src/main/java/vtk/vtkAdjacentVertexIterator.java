// java wrapper for vtkAdjacentVertexIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAdjacentVertexIterator extends vtkObject
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

  private native void Initialize_4(vtkGraph id0,long id1);
  public void Initialize(vtkGraph id0,long id1)
  {
    Initialize_4(id0,id1);
  }

  private native long GetGraph_5();
  public vtkGraph GetGraph()
  {
    long temp = GetGraph_5();

    if (temp == 0) return null;
    return (vtkGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVertex_6();
  public long GetVertex()
  {
    return GetVertex_6();
  }

  private native long Next_7();
  public long Next()
  {
    return Next_7();
  }

  private native boolean HasNext_8();
  public boolean HasNext()
  {
    return HasNext_8();
  }

  public vtkAdjacentVertexIterator() { super(); }

  public vtkAdjacentVertexIterator(long id) { super(id); }
  public native long   VTKInit();

}
