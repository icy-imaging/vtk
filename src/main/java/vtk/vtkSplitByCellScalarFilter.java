// java wrapper for vtkSplitByCellScalarFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSplitByCellScalarFilter extends vtkMultiBlockDataSetAlgorithm
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

  private native boolean GetPassAllPoints_4();
  public boolean GetPassAllPoints()
  {
    return GetPassAllPoints_4();
  }

  private native void SetPassAllPoints_5(boolean id0);
  public void SetPassAllPoints(boolean id0)
  {
    SetPassAllPoints_5(id0);
  }

  private native void PassAllPointsOn_6();
  public void PassAllPointsOn()
  {
    PassAllPointsOn_6();
  }

  private native void PassAllPointsOff_7();
  public void PassAllPointsOff()
  {
    PassAllPointsOff_7();
  }

  public vtkSplitByCellScalarFilter() { super(); }

  public vtkSplitByCellScalarFilter(long id) { super(id); }
  public native long   VTKInit();

}
