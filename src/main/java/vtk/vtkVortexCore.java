// java wrapper for vtkVortexCore object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVortexCore extends vtkPolyDataAlgorithm
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

  private native void SetHigherOrderMethod_4(int id0);
  public void SetHigherOrderMethod(int id0)
  {
    SetHigherOrderMethod_4(id0);
  }

  private native int GetHigherOrderMethod_5();
  public int GetHigherOrderMethod()
  {
    return GetHigherOrderMethod_5();
  }

  private native void HigherOrderMethodOn_6();
  public void HigherOrderMethodOn()
  {
    HigherOrderMethodOn_6();
  }

  private native void HigherOrderMethodOff_7();
  public void HigherOrderMethodOff()
  {
    HigherOrderMethodOff_7();
  }

  private native boolean GetFasterApproximation_8();
  public boolean GetFasterApproximation()
  {
    return GetFasterApproximation_8();
  }

  private native void SetFasterApproximation_9(boolean id0);
  public void SetFasterApproximation(boolean id0)
  {
    SetFasterApproximation_9(id0);
  }

  private native void FasterApproximationOn_10();
  public void FasterApproximationOn()
  {
    FasterApproximationOn_10();
  }

  private native void FasterApproximationOff_11();
  public void FasterApproximationOff()
  {
    FasterApproximationOff_11();
  }

  public vtkVortexCore() { super(); }

  public vtkVortexCore(long id) { super(id); }
  public native long   VTKInit();

}
