// java wrapper for vtkAMRUtilities object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAMRUtilities extends vtkObject
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

  private native void StripGhostLayers_4(vtkOverlappingAMR id0,vtkOverlappingAMR id1);
  public void StripGhostLayers(vtkOverlappingAMR id0,vtkOverlappingAMR id1)
  {
    StripGhostLayers_4(id0,id1);
  }

  private native boolean HasPartiallyOverlappingGhostCells_5(vtkOverlappingAMR id0);
  public boolean HasPartiallyOverlappingGhostCells(vtkOverlappingAMR id0)
  {
    return HasPartiallyOverlappingGhostCells_5(id0);
  }

  private native void BlankCells_6(vtkOverlappingAMR id0);
  public void BlankCells(vtkOverlappingAMR id0)
  {
    BlankCells_6(id0);
  }

  public vtkAMRUtilities() { super(); }

  public vtkAMRUtilities(long id) { super(id); }

}
