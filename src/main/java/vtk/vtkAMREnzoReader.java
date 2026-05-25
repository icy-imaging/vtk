// java wrapper for vtkAMREnzoReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAMREnzoReader extends vtkAMRBaseReader
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

  private native void SetConvertToCGS_4(int id0);
  public void SetConvertToCGS(int id0)
  {
    SetConvertToCGS_4(id0);
  }

  private native int GetConvertToCGS_5();
  public int GetConvertToCGS()
  {
    return GetConvertToCGS_5();
  }

  private native void ConvertToCGSOn_6();
  public void ConvertToCGSOn()
  {
    ConvertToCGSOn_6();
  }

  private native void ConvertToCGSOff_7();
  public void ConvertToCGSOff()
  {
    ConvertToCGSOff_7();
  }

  private native int GetNumberOfBlocks_8();
  public int GetNumberOfBlocks()
  {
    return GetNumberOfBlocks_8();
  }

  private native int GetNumberOfLevels_9();
  public int GetNumberOfLevels()
  {
    return GetNumberOfLevels_9();
  }

  private native void SetFileName_10(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_10(bytes0, bytes0.length);
  }

  public vtkAMREnzoReader() { super(); }

  public vtkAMREnzoReader(long id) { super(id); }
  public native long   VTKInit();

}
