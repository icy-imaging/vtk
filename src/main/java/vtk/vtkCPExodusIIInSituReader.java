// java wrapper for vtkCPExodusIIInSituReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCPExodusIIInSituReader extends vtkMultiBlockDataSetAlgorithm
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native int GetCurrentTimeStep_6();
  public int GetCurrentTimeStep()
  {
    return GetCurrentTimeStep_6();
  }

  private native void SetCurrentTimeStep_7(int id0);
  public void SetCurrentTimeStep(int id0)
  {
    SetCurrentTimeStep_7(id0);
  }

  private native int[] GetTimeStepRange_8();
  public int[] GetTimeStepRange()
  {
    return GetTimeStepRange_8();
  }

  private native double GetTimeStepValue_9(int id0);
  public double GetTimeStepValue(int id0)
  {
    return GetTimeStepValue_9(id0);
  }

  public vtkCPExodusIIInSituReader() { super(); }

  public vtkCPExodusIIInSituReader(long id) { super(id); }
  public native long   VTKInit();

}
