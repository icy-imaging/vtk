// java wrapper for vtkPLinearExtrusionFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPLinearExtrusionFilter extends vtkLinearExtrusionFilter
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

  private native void SetPieceInvariant_4(int id0);
  public void SetPieceInvariant(int id0)
  {
    SetPieceInvariant_4(id0);
  }

  private native int GetPieceInvariant_5();
  public int GetPieceInvariant()
  {
    return GetPieceInvariant_5();
  }

  private native void PieceInvariantOn_6();
  public void PieceInvariantOn()
  {
    PieceInvariantOn_6();
  }

  private native void PieceInvariantOff_7();
  public void PieceInvariantOff()
  {
    PieceInvariantOff_7();
  }

  public vtkPLinearExtrusionFilter() { super(); }

  public vtkPLinearExtrusionFilter(long id) { super(id); }
  public native long   VTKInit();

}
