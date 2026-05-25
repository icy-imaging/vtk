// java wrapper for vtkElevationFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkElevationFilter extends vtkDataSetAlgorithm
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

  private native void SetLowPoint_4(double id0,double id1,double id2);
  public void SetLowPoint(double id0,double id1,double id2)
  {
    SetLowPoint_4(id0,id1,id2);
  }

  private native void SetLowPoint_5(double id0[]);
  public void SetLowPoint(double id0[])
  {
    SetLowPoint_5(id0);
  }

  private native double[] GetLowPoint_6();
  public double[] GetLowPoint()
  {
    return GetLowPoint_6();
  }

  private native void SetHighPoint_7(double id0,double id1,double id2);
  public void SetHighPoint(double id0,double id1,double id2)
  {
    SetHighPoint_7(id0,id1,id2);
  }

  private native void SetHighPoint_8(double id0[]);
  public void SetHighPoint(double id0[])
  {
    SetHighPoint_8(id0);
  }

  private native double[] GetHighPoint_9();
  public double[] GetHighPoint()
  {
    return GetHighPoint_9();
  }

  private native void SetScalarRange_10(double id0,double id1);
  public void SetScalarRange(double id0,double id1)
  {
    SetScalarRange_10(id0,id1);
  }

  private native void SetScalarRange_11(double id0[]);
  public void SetScalarRange(double id0[])
  {
    SetScalarRange_11(id0);
  }

  private native double[] GetScalarRange_12();
  public double[] GetScalarRange()
  {
    return GetScalarRange_12();
  }

  public vtkElevationFilter() { super(); }

  public vtkElevationFilter(long id) { super(id); }
  public native long   VTKInit();

}
