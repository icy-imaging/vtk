// java wrapper for vtkRenderedSurfaceRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRenderedSurfaceRepresentation extends vtkRenderedRepresentation
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

  private native void SetCellColorArrayName_4(byte[] id0, int len0);
  public void SetCellColorArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellColorArrayName_4(bytes0, bytes0.length);
  }

  private native byte[] GetCellColorArrayName_5();
  public String GetCellColorArrayName()
  {
    return new String(GetCellColorArrayName_5(), StandardCharsets.UTF_8);
  }

  private native void ApplyViewTheme_6(vtkViewTheme id0);
  public void ApplyViewTheme(vtkViewTheme id0)
  {
    ApplyViewTheme_6(id0);
  }

  public vtkRenderedSurfaceRepresentation() { super(); }

  public vtkRenderedSurfaceRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
