// java wrapper for vtkAttributesErrorMetric object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAttributesErrorMetric extends vtkGenericSubdivisionErrorMetric
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

  private native double GetAbsoluteAttributeTolerance_4();
  public double GetAbsoluteAttributeTolerance()
  {
    return GetAbsoluteAttributeTolerance_4();
  }

  private native void SetAbsoluteAttributeTolerance_5(double id0);
  public void SetAbsoluteAttributeTolerance(double id0)
  {
    SetAbsoluteAttributeTolerance_5(id0);
  }

  private native double GetAttributeTolerance_6();
  public double GetAttributeTolerance()
  {
    return GetAttributeTolerance_6();
  }

  private native void SetAttributeTolerance_7(double id0);
  public void SetAttributeTolerance(double id0)
  {
    SetAttributeTolerance_7(id0);
  }

  public vtkAttributesErrorMetric() { super(); }

  public vtkAttributesErrorMetric(long id) { super(id); }
  public native long   VTKInit();

}
