// java wrapper for vtkStreamSurface object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStreamSurface extends vtkStreamTracer
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

  private native void SetUseIterativeSeeding_4(boolean id0);
  public void SetUseIterativeSeeding(boolean id0)
  {
    SetUseIterativeSeeding_4(id0);
  }

  private native boolean GetUseIterativeSeeding_5();
  public boolean GetUseIterativeSeeding()
  {
    return GetUseIterativeSeeding_5();
  }

  private native void UseIterativeSeedingOn_6();
  public void UseIterativeSeedingOn()
  {
    UseIterativeSeedingOn_6();
  }

  private native void UseIterativeSeedingOff_7();
  public void UseIterativeSeedingOff()
  {
    UseIterativeSeedingOff_7();
  }

  public vtkStreamSurface() { super(); }

  public vtkStreamSurface(long id) { super(id); }
  public native long   VTKInit();

}
