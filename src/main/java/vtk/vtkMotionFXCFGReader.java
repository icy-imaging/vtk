// java wrapper for vtkMotionFXCFGReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMotionFXCFGReader extends vtkMultiBlockDataSetAlgorithm
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

  private native void SetTimeResolution_6(int id0);
  public void SetTimeResolution(int id0)
  {
    SetTimeResolution_6(id0);
  }

  private native int GetTimeResolutionMinValue_7();
  public int GetTimeResolutionMinValue()
  {
    return GetTimeResolutionMinValue_7();
  }

  private native int GetTimeResolutionMaxValue_8();
  public int GetTimeResolutionMaxValue()
  {
    return GetTimeResolutionMaxValue_8();
  }

  private native int GetTimeResolution_9();
  public int GetTimeResolution()
  {
    return GetTimeResolution_9();
  }

  public vtkMotionFXCFGReader() { super(); }

  public vtkMotionFXCFGReader(long id) { super(id); }
  public native long   VTKInit();

}
