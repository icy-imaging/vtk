// java wrapper for vtkPointSetCellIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointSetCellIterator extends vtkCellIterator
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

  private native boolean IsDoneWithTraversal_4();
  public boolean IsDoneWithTraversal()
  {
    return IsDoneWithTraversal_4();
  }

  private native long GetCellId_5();
  public long GetCellId()
  {
    return GetCellId_5();
  }

  public vtkPointSetCellIterator() { super(); }

  public vtkPointSetCellIterator(long id) { super(id); }
  public native long   VTKInit();

}
