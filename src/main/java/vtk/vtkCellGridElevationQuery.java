// java wrapper for vtkCellGridElevationQuery object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellGridElevationQuery extends vtkCellGridQuery
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

  private native boolean Initialize_4();
  public boolean Initialize()
  {
    return Initialize_4();
  }

  private native boolean Finalize_5();
  public boolean Finalize()
  {
    return Finalize_5();
  }

  public vtkCellGridElevationQuery() { super(); }

  public vtkCellGridElevationQuery(long id) { super(id); }
  public native long   VTKInit();

}
