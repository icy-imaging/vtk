// java wrapper for vtkAbstractSplineRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractSplineRepresentation extends vtkCurveRepresentation
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

  private native void GetPolyData_4(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_4(id0);
  }

  private native void SetResolution_5(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_5(id0);
  }

  private native int GetResolution_6();
  public int GetResolution()
  {
    return GetResolution_6();
  }

  private native long GetParametricSpline_7();
  public vtkParametricSpline GetParametricSpline()
  {
    long temp = GetParametricSpline_7();

    if (temp == 0) return null;
    return (vtkParametricSpline)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetParametricSpline_8(vtkParametricSpline id0);
  public void SetParametricSpline(vtkParametricSpline id0)
  {
    SetParametricSpline_8(id0);
  }

  private native long GetHandlePositions_9();
  public vtkDoubleArray GetHandlePositions()
  {
    long temp = GetHandlePositions_9();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double GetSummedLength_10();
  public double GetSummedLength()
  {
    return GetSummedLength_10();
  }

  public vtkAbstractSplineRepresentation() { super(); }

  public vtkAbstractSplineRepresentation(long id) { super(id); }

}
