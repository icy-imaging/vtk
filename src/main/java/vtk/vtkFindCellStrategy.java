// java wrapper for vtkFindCellStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFindCellStrategy extends vtkObject
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

  private native int Initialize_4(vtkPointSet id0);
  public int Initialize(vtkPointSet id0)
  {
    return Initialize_4(id0);
  }

  private native boolean InsideCellBounds_5(double id0[],long id1);
  public boolean InsideCellBounds(double id0[],long id1)
  {
    return InsideCellBounds_5(id0,id1);
  }

  private native void CopyParameters_6(vtkFindCellStrategy id0);
  public void CopyParameters(vtkFindCellStrategy id0)
  {
    CopyParameters_6(id0);
  }

  public vtkFindCellStrategy() { super(); }

  public vtkFindCellStrategy(long id) { super(id); }

}
