// java wrapper for vtkRectilinearGridGeometryFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRectilinearGridGeometryFilter extends vtkPolyDataAlgorithm
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

  private native int[] GetExtent_4();
  public int[] GetExtent()
  {
    return GetExtent_4();
  }

  private native void SetExtent_5(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetExtent_5(id0,id1,id2,id3,id4,id5);
  }

  private native void SetExtent_6(int id0[]);
  public void SetExtent(int id0[])
  {
    SetExtent_6(id0);
  }

  public vtkRectilinearGridGeometryFilter() { super(); }

  public vtkRectilinearGridGeometryFilter(long id) { super(id); }
  public native long   VTKInit();

}
