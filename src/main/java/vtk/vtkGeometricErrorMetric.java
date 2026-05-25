// java wrapper for vtkGeometricErrorMetric object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGeometricErrorMetric extends vtkGenericSubdivisionErrorMetric
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

  private native double GetAbsoluteGeometricTolerance_4();
  public double GetAbsoluteGeometricTolerance()
  {
    return GetAbsoluteGeometricTolerance_4();
  }

  private native void SetAbsoluteGeometricTolerance_5(double id0);
  public void SetAbsoluteGeometricTolerance(double id0)
  {
    SetAbsoluteGeometricTolerance_5(id0);
  }

  private native void SetRelativeGeometricTolerance_6(double id0,vtkGenericDataSet id1);
  public void SetRelativeGeometricTolerance(double id0,vtkGenericDataSet id1)
  {
    SetRelativeGeometricTolerance_6(id0,id1);
  }

  private native int GetRelative_7();
  public int GetRelative()
  {
    return GetRelative_7();
  }

  public vtkGeometricErrorMetric() { super(); }

  public vtkGeometricErrorMetric(long id) { super(id); }
  public native long   VTKInit();

}
