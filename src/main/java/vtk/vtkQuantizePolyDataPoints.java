// java wrapper for vtkQuantizePolyDataPoints object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkQuantizePolyDataPoints extends vtkCleanPolyData
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

  private native void SetQFactor_4(double id0);
  public void SetQFactor(double id0)
  {
    SetQFactor_4(id0);
  }

  private native double GetQFactorMinValue_5();
  public double GetQFactorMinValue()
  {
    return GetQFactorMinValue_5();
  }

  private native double GetQFactorMaxValue_6();
  public double GetQFactorMaxValue()
  {
    return GetQFactorMaxValue_6();
  }

  private native double GetQFactor_7();
  public double GetQFactor()
  {
    return GetQFactor_7();
  }

  private native void OperateOnPoint_8(double id0[],double id1[]);
  public void OperateOnPoint(double id0[],double id1[])
  {
    OperateOnPoint_8(id0,id1);
  }

  private native void OperateOnBounds_9(double id0[],double id1[]);
  public void OperateOnBounds(double id0[],double id1[])
  {
    OperateOnBounds_9(id0,id1);
  }

  public vtkQuantizePolyDataPoints() { super(); }

  public vtkQuantizePolyDataPoints(long id) { super(id); }
  public native long   VTKInit();

}
