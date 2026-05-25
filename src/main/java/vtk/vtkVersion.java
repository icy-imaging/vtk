// java wrapper for vtkVersion object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVersion extends vtkObject
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

  private native byte[] GetVTKVersion_4();
  public String GetVTKVersion()
  {
    return new String(GetVTKVersion_4(), StandardCharsets.UTF_8);
  }

  private native byte[] GetVTKVersionFull_5();
  public String GetVTKVersionFull()
  {
    return new String(GetVTKVersionFull_5(), StandardCharsets.UTF_8);
  }

  private native int GetVTKMajorVersion_6();
  public int GetVTKMajorVersion()
  {
    return GetVTKMajorVersion_6();
  }

  private native int GetVTKMinorVersion_7();
  public int GetVTKMinorVersion()
  {
    return GetVTKMinorVersion_7();
  }

  private native int GetVTKBuildVersion_8();
  public int GetVTKBuildVersion()
  {
    return GetVTKBuildVersion_8();
  }

  private native byte[] GetVTKSourceVersion_9();
  public String GetVTKSourceVersion()
  {
    return new String(GetVTKSourceVersion_9(), StandardCharsets.UTF_8);
  }

  public vtkVersion() { super(); }

  public vtkVersion(long id) { super(id); }
  public native long   VTKInit();

}
