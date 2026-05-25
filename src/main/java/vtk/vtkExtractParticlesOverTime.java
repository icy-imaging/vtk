// java wrapper for vtkExtractParticlesOverTime object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractParticlesOverTime extends vtkDataSetAlgorithm
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

  private native void SetIdChannelArray_4(byte[] id0, int len0);
  public void SetIdChannelArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetIdChannelArray_4(bytes0, bytes0.length);
  }

  private native byte[] GetIdChannelArray_5();
  public String GetIdChannelArray()
  {
    return new String(GetIdChannelArray_5(), StandardCharsets.UTF_8);
  }

  public vtkExtractParticlesOverTime() { super(); }

  public vtkExtractParticlesOverTime(long id) { super(id); }
  public native long   VTKInit();

}
