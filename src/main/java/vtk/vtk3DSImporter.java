// java wrapper for vtk3DSImporter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtk3DSImporter extends vtkImporter
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

  private native void SetComputeNormals_6(int id0);
  public void SetComputeNormals(int id0)
  {
    SetComputeNormals_6(id0);
  }

  private native int GetComputeNormals_7();
  public int GetComputeNormals()
  {
    return GetComputeNormals_7();
  }

  private native void ComputeNormalsOn_8();
  public void ComputeNormalsOn()
  {
    ComputeNormalsOn_8();
  }

  private native void ComputeNormalsOff_9();
  public void ComputeNormalsOff()
  {
    ComputeNormalsOff_9();
  }

  private native byte[] GetOutputsDescription_10();
  public String GetOutputsDescription()
  {
    return new String(GetOutputsDescription_10(), StandardCharsets.UTF_8);
  }

  public vtk3DSImporter() { super(); }

  public vtk3DSImporter(long id) { super(id); }
  public native long   VTKInit();

}
