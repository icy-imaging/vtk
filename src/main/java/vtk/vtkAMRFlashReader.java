// java wrapper for vtkAMRFlashReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAMRFlashReader extends vtkAMRBaseReader
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

  private native int GetNumberOfBlocks_4();
  public int GetNumberOfBlocks()
  {
    return GetNumberOfBlocks_4();
  }

  private native int GetNumberOfLevels_5();
  public int GetNumberOfLevels()
  {
    return GetNumberOfLevels_5();
  }

  private native void SetFileName_6(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_6(bytes0, bytes0.length);
  }

  public vtkAMRFlashReader() { super(); }

  public vtkAMRFlashReader(long id) { super(id); }
  public native long   VTKInit();

}
