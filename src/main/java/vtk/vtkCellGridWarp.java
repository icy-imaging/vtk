// java wrapper for vtkCellGridWarp object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellGridWarp extends vtkCellGridAlgorithm
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void SetScaleFactor_5(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_5(id0);
  }

  private native double GetScaleFactor_6();
  public double GetScaleFactor()
  {
    return GetScaleFactor_6();
  }

  public vtkCellGridWarp() { super(); }

  public vtkCellGridWarp(long id) { super(id); }
  public native long   VTKInit();

}
