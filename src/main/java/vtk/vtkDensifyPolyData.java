// java wrapper for vtkDensifyPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDensifyPolyData extends vtkPolyDataAlgorithm
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

  private native void SetNumberOfSubdivisions_4(int id0);
  public void SetNumberOfSubdivisions(int id0)
  {
    SetNumberOfSubdivisions_4(id0);
  }

  private native int GetNumberOfSubdivisions_5();
  public int GetNumberOfSubdivisions()
  {
    return GetNumberOfSubdivisions_5();
  }

  public vtkDensifyPolyData() { super(); }

  public vtkDensifyPolyData(long id) { super(id); }
  public native long   VTKInit();

}
