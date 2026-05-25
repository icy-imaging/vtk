// java wrapper for vtkShrinkPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkShrinkPolyData extends vtkPolyDataAlgorithm
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

  private native void SetShrinkFactor_4(double id0);
  public void SetShrinkFactor(double id0)
  {
    SetShrinkFactor_4(id0);
  }

  private native double GetShrinkFactorMinValue_5();
  public double GetShrinkFactorMinValue()
  {
    return GetShrinkFactorMinValue_5();
  }

  private native double GetShrinkFactorMaxValue_6();
  public double GetShrinkFactorMaxValue()
  {
    return GetShrinkFactorMaxValue_6();
  }

  private native double GetShrinkFactor_7();
  public double GetShrinkFactor()
  {
    return GetShrinkFactor_7();
  }

  public vtkShrinkPolyData() { super(); }

  public vtkShrinkPolyData(long id) { super(id); }
  public native long   VTKInit();

}
