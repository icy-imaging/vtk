// java wrapper for vtkDynamicLoader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDynamicLoader extends vtkObject
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

  private native byte[] LibPrefix_4();
  public String LibPrefix()
  {
    return new String(LibPrefix_4(), StandardCharsets.UTF_8);
  }

  private native byte[] LibExtension_5();
  public String LibExtension()
  {
    return new String(LibExtension_5(), StandardCharsets.UTF_8);
  }

  private native byte[] LastError_6();
  public String LastError()
  {
    return new String(LastError_6(), StandardCharsets.UTF_8);
  }

  public vtkDynamicLoader() { super(); }

  public vtkDynamicLoader(long id) { super(id); }
  public native long   VTKInit();

}
