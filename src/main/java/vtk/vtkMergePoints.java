// java wrapper for vtkMergePoints object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMergePoints extends vtkPointLocator
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

  private native long IsInsertedPoint_4(double id0[]);
  public long IsInsertedPoint(double id0[])
  {
    return IsInsertedPoint_4(id0);
  }

  private native long IsInsertedPoint_5(double id0,double id1,double id2);
  public long IsInsertedPoint(double id0,double id1,double id2)
  {
    return IsInsertedPoint_5(id0,id1,id2);
  }

  public vtkMergePoints() { super(); }

  public vtkMergePoints(long id) { super(id); }
  public native long   VTKInit();

}
