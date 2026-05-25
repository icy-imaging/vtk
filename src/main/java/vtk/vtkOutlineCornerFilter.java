// java wrapper for vtkOutlineCornerFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOutlineCornerFilter extends vtkPolyDataAlgorithm
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

  private native void SetCornerFactor_4(double id0);
  public void SetCornerFactor(double id0)
  {
    SetCornerFactor_4(id0);
  }

  private native double GetCornerFactorMinValue_5();
  public double GetCornerFactorMinValue()
  {
    return GetCornerFactorMinValue_5();
  }

  private native double GetCornerFactorMaxValue_6();
  public double GetCornerFactorMaxValue()
  {
    return GetCornerFactorMaxValue_6();
  }

  private native double GetCornerFactor_7();
  public double GetCornerFactor()
  {
    return GetCornerFactor_7();
  }

  public vtkOutlineCornerFilter() { super(); }

  public vtkOutlineCornerFilter(long id) { super(id); }
  public native long   VTKInit();

}
