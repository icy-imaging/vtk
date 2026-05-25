// java wrapper for vtkOBJImporter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOBJImporter extends vtkImporter
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

  private native void SetFileNameMTL_5(byte[] id0, int len0);
  public void SetFileNameMTL(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileNameMTL_5(bytes0, bytes0.length);
  }

  private native void SetTexturePath_6(byte[] id0, int len0);
  public void SetTexturePath(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTexturePath_6(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_7();
  public String GetFileName()
  {
    return new String(GetFileName_7(), StandardCharsets.UTF_8);
  }

  private native byte[] GetFileNameMTL_8();
  public String GetFileNameMTL()
  {
    return new String(GetFileNameMTL_8(), StandardCharsets.UTF_8);
  }

  private native byte[] GetTexturePath_9();
  public String GetTexturePath()
  {
    return new String(GetTexturePath_9(), StandardCharsets.UTF_8);
  }

  private native byte[] GetOutputsDescription_10();
  public String GetOutputsDescription()
  {
    return new String(GetOutputsDescription_10(), StandardCharsets.UTF_8);
  }

  private native byte[] GetOutputDescription_11(int id0);
  public String GetOutputDescription(int id0)
  {
    return new String(GetOutputDescription_11(id0), StandardCharsets.UTF_8);
  }

  public vtkOBJImporter() { super(); }

  public vtkOBJImporter(long id) { super(id); }
  public native long   VTKInit();

}
