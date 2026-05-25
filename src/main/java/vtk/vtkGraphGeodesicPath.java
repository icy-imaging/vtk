// java wrapper for vtkGraphGeodesicPath object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGraphGeodesicPath extends vtkGeodesicPath
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

  private native long GetStartVertex_4();
  public long GetStartVertex()
  {
    return GetStartVertex_4();
  }

  private native void SetStartVertex_5(long id0);
  public void SetStartVertex(long id0)
  {
    SetStartVertex_5(id0);
  }

  private native long GetEndVertex_6();
  public long GetEndVertex()
  {
    return GetEndVertex_6();
  }

  private native void SetEndVertex_7(long id0);
  public void SetEndVertex(long id0)
  {
    SetEndVertex_7(id0);
  }

  public vtkGraphGeodesicPath() { super(); }

  public vtkGraphGeodesicPath(long id) { super(id); }

}
