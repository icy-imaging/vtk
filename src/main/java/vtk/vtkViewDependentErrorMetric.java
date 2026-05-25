// java wrapper for vtkViewDependentErrorMetric object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkViewDependentErrorMetric extends vtkGenericSubdivisionErrorMetric
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

  private native double GetPixelTolerance_4();
  public double GetPixelTolerance()
  {
    return GetPixelTolerance_4();
  }

  private native void SetPixelTolerance_5(double id0);
  public void SetPixelTolerance(double id0)
  {
    SetPixelTolerance_5(id0);
  }

  private native long GetViewport_6();
  public vtkViewport GetViewport()
  {
    long temp = GetViewport_6();

    if (temp == 0) return null;
    return (vtkViewport)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetViewport_7(vtkViewport id0);
  public void SetViewport(vtkViewport id0)
  {
    SetViewport_7(id0);
  }

  public vtkViewDependentErrorMetric() { super(); }

  public vtkViewDependentErrorMetric(long id) { super(id); }
  public native long   VTKInit();

}
