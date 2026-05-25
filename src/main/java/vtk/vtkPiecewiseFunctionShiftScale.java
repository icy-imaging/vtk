// java wrapper for vtkPiecewiseFunctionShiftScale object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPiecewiseFunctionShiftScale extends vtkPiecewiseFunctionAlgorithm
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

  private native void SetPositionShift_4(double id0);
  public void SetPositionShift(double id0)
  {
    SetPositionShift_4(id0);
  }

  private native void SetPositionScale_5(double id0);
  public void SetPositionScale(double id0)
  {
    SetPositionScale_5(id0);
  }

  private native void SetValueShift_6(double id0);
  public void SetValueShift(double id0)
  {
    SetValueShift_6(id0);
  }

  private native void SetValueScale_7(double id0);
  public void SetValueScale(double id0)
  {
    SetValueScale_7(id0);
  }

  private native double GetPositionShift_8();
  public double GetPositionShift()
  {
    return GetPositionShift_8();
  }

  private native double GetPositionScale_9();
  public double GetPositionScale()
  {
    return GetPositionScale_9();
  }

  private native double GetValueShift_10();
  public double GetValueShift()
  {
    return GetValueShift_10();
  }

  private native double GetValueScale_11();
  public double GetValueScale()
  {
    return GetValueScale_11();
  }

  public vtkPiecewiseFunctionShiftScale() { super(); }

  public vtkPiecewiseFunctionShiftScale(long id) { super(id); }
  public native long   VTKInit();

}
