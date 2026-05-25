// java wrapper for vtkJSONImageWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkJSONImageWriter extends vtkImageAlgorithm
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

  private native void SetArrayName_6(byte[] id0, int len0);
  public void SetArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetArrayName_6(bytes0, bytes0.length);
  }

  private native byte[] GetArrayName_7();
  public String GetArrayName()
  {
    return new String(GetArrayName_7(), StandardCharsets.UTF_8);
  }

  private native void SetSlice_8(int id0);
  public void SetSlice(int id0)
  {
    SetSlice_8(id0);
  }

  private native int GetSlice_9();
  public int GetSlice()
  {
    return GetSlice_9();
  }

  private native void Write_10();
  public void Write()
  {
    Write_10();
  }

  public vtkJSONImageWriter() { super(); }

  public vtkJSONImageWriter(long id) { super(id); }
  public native long   VTKInit();

}
