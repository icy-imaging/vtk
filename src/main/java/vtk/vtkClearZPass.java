// java wrapper for vtkClearZPass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkClearZPass extends vtkRenderPass
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

  private native void SetDepth_4(double id0);
  public void SetDepth(double id0)
  {
    SetDepth_4(id0);
  }

  private native double GetDepthMinValue_5();
  public double GetDepthMinValue()
  {
    return GetDepthMinValue_5();
  }

  private native double GetDepthMaxValue_6();
  public double GetDepthMaxValue()
  {
    return GetDepthMaxValue_6();
  }

  private native double GetDepth_7();
  public double GetDepth()
  {
    return GetDepth_7();
  }

  public vtkClearZPass() { super(); }

  public vtkClearZPass(long id) { super(id); }
  public native long   VTKInit();

}
