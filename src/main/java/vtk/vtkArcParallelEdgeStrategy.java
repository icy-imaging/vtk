// java wrapper for vtkArcParallelEdgeStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkArcParallelEdgeStrategy extends vtkEdgeLayoutStrategy
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

  private native void Layout_4();
  public void Layout()
  {
    Layout_4();
  }

  private native int GetNumberOfSubdivisions_5();
  public int GetNumberOfSubdivisions()
  {
    return GetNumberOfSubdivisions_5();
  }

  private native void SetNumberOfSubdivisions_6(int id0);
  public void SetNumberOfSubdivisions(int id0)
  {
    SetNumberOfSubdivisions_6(id0);
  }

  public vtkArcParallelEdgeStrategy() { super(); }

  public vtkArcParallelEdgeStrategy(long id) { super(id); }
  public native long   VTKInit();

}
