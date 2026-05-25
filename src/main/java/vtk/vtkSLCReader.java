// java wrapper for vtkSLCReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSLCReader extends vtkImageReader2
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

  private native int GetError_4();
  public int GetError()
  {
    return GetError_4();
  }

  private native int CanReadFile_5(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_5(bytes0, bytes0.length);
  }

  private native byte[] GetFileExtensions_6();
  public String GetFileExtensions()
  {
    return new String(GetFileExtensions_6(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDescriptiveName_7();
  public String GetDescriptiveName()
  {
    return new String(GetDescriptiveName_7(), StandardCharsets.UTF_8);
  }

  public vtkSLCReader() { super(); }

  public vtkSLCReader(long id) { super(id); }
  public native long   VTKInit();

}
