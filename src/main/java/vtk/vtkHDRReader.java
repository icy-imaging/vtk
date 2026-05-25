// java wrapper for vtkHDRReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHDRReader extends vtkImageReader
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

  private native int GetFormat_4();
  public int GetFormat()
  {
    return GetFormat_4();
  }

  private native double GetGamma_5();
  public double GetGamma()
  {
    return GetGamma_5();
  }

  private native double GetExposure_6();
  public double GetExposure()
  {
    return GetExposure_6();
  }

  private native double GetPixelAspect_7();
  public double GetPixelAspect()
  {
    return GetPixelAspect_7();
  }

  private native int CanReadFile_8(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_8(bytes0, bytes0.length);
  }

  private native byte[] GetFileExtensions_9();
  public String GetFileExtensions()
  {
    return new String(GetFileExtensions_9(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDescriptiveName_10();
  public String GetDescriptiveName()
  {
    return new String(GetDescriptiveName_10(), StandardCharsets.UTF_8);
  }

  public vtkHDRReader() { super(); }

  public vtkHDRReader(long id) { super(id); }
  public native long   VTKInit();

}
