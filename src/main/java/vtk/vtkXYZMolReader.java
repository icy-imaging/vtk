// java wrapper for vtkXYZMolReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXYZMolReader extends vtkMoleculeReaderBase
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

  private native int CanReadFile_4(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_4(bytes0, bytes0.length);
  }

  private native void SetTimeStep_5(int id0);
  public void SetTimeStep(int id0)
  {
    SetTimeStep_5(id0);
  }

  private native int GetTimeStep_6();
  public int GetTimeStep()
  {
    return GetTimeStep_6();
  }

  private native int GetMaxTimeStep_7();
  public int GetMaxTimeStep()
  {
    return GetMaxTimeStep_7();
  }

  public vtkXYZMolReader() { super(); }

  public vtkXYZMolReader(long id) { super(id); }
  public native long   VTKInit();

}
