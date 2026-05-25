// java wrapper for vtkDataSetTriangleFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataSetTriangleFilter extends vtkUnstructuredGridAlgorithm
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

  private native void SetTetrahedraOnly_4(int id0);
  public void SetTetrahedraOnly(int id0)
  {
    SetTetrahedraOnly_4(id0);
  }

  private native int GetTetrahedraOnly_5();
  public int GetTetrahedraOnly()
  {
    return GetTetrahedraOnly_5();
  }

  private native void TetrahedraOnlyOn_6();
  public void TetrahedraOnlyOn()
  {
    TetrahedraOnlyOn_6();
  }

  private native void TetrahedraOnlyOff_7();
  public void TetrahedraOnlyOff()
  {
    TetrahedraOnlyOff_7();
  }

  public vtkDataSetTriangleFilter() { super(); }

  public vtkDataSetTriangleFilter(long id) { super(id); }
  public native long   VTKInit();

}
