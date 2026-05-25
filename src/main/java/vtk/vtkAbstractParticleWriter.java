// java wrapper for vtkAbstractParticleWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractParticleWriter extends vtkWriter
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

  private native void SetTimeStep_4(int id0);
  public void SetTimeStep(int id0)
  {
    SetTimeStep_4(id0);
  }

  private native int GetTimeStep_5();
  public int GetTimeStep()
  {
    return GetTimeStep_5();
  }

  private native void SetTimeValue_6(double id0);
  public void SetTimeValue(double id0)
  {
    SetTimeValue_6(id0);
  }

  private native double GetTimeValue_7();
  public double GetTimeValue()
  {
    return GetTimeValue_7();
  }

  private native void SetFileName_8(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_8(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_9();
  public String GetFileName()
  {
    return new String(GetFileName_9(), StandardCharsets.UTF_8);
  }

  private native void SetCollectiveIO_10(int id0);
  public void SetCollectiveIO(int id0)
  {
    SetCollectiveIO_10(id0);
  }

  private native int GetCollectiveIO_11();
  public int GetCollectiveIO()
  {
    return GetCollectiveIO_11();
  }

  private native void SetWriteModeToCollective_12();
  public void SetWriteModeToCollective()
  {
    SetWriteModeToCollective_12();
  }

  private native void SetWriteModeToIndependent_13();
  public void SetWriteModeToIndependent()
  {
    SetWriteModeToIndependent_13();
  }

  private native void CloseFile_14();
  public void CloseFile()
  {
    CloseFile_14();
  }

  public vtkAbstractParticleWriter() { super(); }

  public vtkAbstractParticleWriter(long id) { super(id); }

}
