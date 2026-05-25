// java wrapper for vtkGenericMovieWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericMovieWriter extends vtkImageAlgorithm
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

  private native void Start_6();
  public void Start()
  {
    Start_6();
  }

  private native void Write_7();
  public void Write()
  {
    Write_7();
  }

  private native void End_8();
  public void End()
  {
    End_8();
  }

  private native int GetError_9();
  public int GetError()
  {
    return GetError_9();
  }

  private native byte[] GetStringFromErrorCode_10(long id0);
  public String GetStringFromErrorCode(long id0)
  {
    return new String(GetStringFromErrorCode_10(id0), StandardCharsets.UTF_8);
  }

  public vtkGenericMovieWriter() { super(); }

  public vtkGenericMovieWriter(long id) { super(id); }

}
