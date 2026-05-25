// java wrapper for vtkExtractPointCloudPiece object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractPointCloudPiece extends vtkPolyDataAlgorithm
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

  private native void SetModuloOrdering_4(boolean id0);
  public void SetModuloOrdering(boolean id0)
  {
    SetModuloOrdering_4(id0);
  }

  private native boolean GetModuloOrdering_5();
  public boolean GetModuloOrdering()
  {
    return GetModuloOrdering_5();
  }

  private native void ModuloOrderingOn_6();
  public void ModuloOrderingOn()
  {
    ModuloOrderingOn_6();
  }

  private native void ModuloOrderingOff_7();
  public void ModuloOrderingOff()
  {
    ModuloOrderingOff_7();
  }

  public vtkExtractPointCloudPiece() { super(); }

  public vtkExtractPointCloudPiece(long id) { super(id); }
  public native long   VTKInit();

}
