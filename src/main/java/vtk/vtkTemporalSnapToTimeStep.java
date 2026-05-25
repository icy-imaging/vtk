// java wrapper for vtkTemporalSnapToTimeStep object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTemporalSnapToTimeStep extends vtkPassInputTypeAlgorithm
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

  private native void SetSnapMode_4(int id0);
  public void SetSnapMode(int id0)
  {
    SetSnapMode_4(id0);
  }

  private native int GetSnapMode_5();
  public int GetSnapMode()
  {
    return GetSnapMode_5();
  }

  private native void SetSnapModeToNearest_6();
  public void SetSnapModeToNearest()
  {
    SetSnapModeToNearest_6();
  }

  private native void SetSnapModeToNextBelowOrEqual_7();
  public void SetSnapModeToNextBelowOrEqual()
  {
    SetSnapModeToNextBelowOrEqual_7();
  }

  private native void SetSnapModeToNextAboveOrEqual_8();
  public void SetSnapModeToNextAboveOrEqual()
  {
    SetSnapModeToNextAboveOrEqual_8();
  }

  public vtkTemporalSnapToTimeStep() { super(); }

  public vtkTemporalSnapToTimeStep(long id) { super(id); }
  public native long   VTKInit();

}
