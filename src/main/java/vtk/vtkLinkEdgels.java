// java wrapper for vtkLinkEdgels object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLinkEdgels extends vtkPolyDataAlgorithm
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

  private native void SetLinkThreshold_4(double id0);
  public void SetLinkThreshold(double id0)
  {
    SetLinkThreshold_4(id0);
  }

  private native double GetLinkThreshold_5();
  public double GetLinkThreshold()
  {
    return GetLinkThreshold_5();
  }

  private native void SetPhiThreshold_6(double id0);
  public void SetPhiThreshold(double id0)
  {
    SetPhiThreshold_6(id0);
  }

  private native double GetPhiThreshold_7();
  public double GetPhiThreshold()
  {
    return GetPhiThreshold_7();
  }

  private native void SetGradientThreshold_8(double id0);
  public void SetGradientThreshold(double id0)
  {
    SetGradientThreshold_8(id0);
  }

  private native double GetGradientThreshold_9();
  public double GetGradientThreshold()
  {
    return GetGradientThreshold_9();
  }

  public vtkLinkEdgels() { super(); }

  public vtkLinkEdgels(long id) { super(id); }
  public native long   VTKInit();

}
