// java wrapper for vtkStrahlerMetric object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStrahlerMetric extends vtkTreeAlgorithm
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

  private native void SetMetricArrayName_4(byte[] id0, int len0);
  public void SetMetricArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMetricArrayName_4(bytes0, bytes0.length);
  }

  private native void SetNormalize_5(int id0);
  public void SetNormalize(int id0)
  {
    SetNormalize_5(id0);
  }

  private native int GetNormalize_6();
  public int GetNormalize()
  {
    return GetNormalize_6();
  }

  private native void NormalizeOn_7();
  public void NormalizeOn()
  {
    NormalizeOn_7();
  }

  private native void NormalizeOff_8();
  public void NormalizeOff()
  {
    NormalizeOff_8();
  }

  private native float GetMaxStrahler_9();
  public float GetMaxStrahler()
  {
    return GetMaxStrahler_9();
  }

  public vtkStrahlerMetric() { super(); }

  public vtkStrahlerMetric(long id) { super(id); }
  public native long   VTKInit();

}
