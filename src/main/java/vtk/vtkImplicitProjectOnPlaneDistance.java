// java wrapper for vtkImplicitProjectOnPlaneDistance object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitProjectOnPlaneDistance extends vtkImplicitFunction
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native double EvaluateFunction_5(double id0[]);
  public double EvaluateFunction(double id0[])
  {
    return EvaluateFunction_5(id0);
  }

  private native void EvaluateGradient_6(double id0[],double id1[]);
  public void EvaluateGradient(double id0[],double id1[])
  {
    EvaluateGradient_6(id0,id1);
  }

  private native void SetInput_7(vtkPolyData id0);
  public void SetInput(vtkPolyData id0)
  {
    SetInput_7(id0);
  }

  private native double GetTolerance_8();
  public double GetTolerance()
  {
    return GetTolerance_8();
  }

  private native void SetTolerance_9(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_9(id0);
  }

  private native int GetNorm_10();
  public int GetNorm()
  {
    return GetNorm_10();
  }

  private native void SetNorm_11(int id0);
  public void SetNorm(int id0)
  {
    SetNorm_11(id0);
  }

  private native long GetLocator_12();
  public vtkAbstractCellLocator GetLocator()
  {
    long temp = GetLocator_12();

    if (temp == 0) return null;
    return (vtkAbstractCellLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLocator_13(vtkAbstractCellLocator id0);
  public void SetLocator(vtkAbstractCellLocator id0)
  {
    SetLocator_13(id0);
  }

  private native void EvaluateFunction_14(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_14(id0,id1);
  }

  private native double EvaluateFunction_15(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_15(id0,id1,id2);
  }

  public vtkImplicitProjectOnPlaneDistance() { super(); }

  public vtkImplicitProjectOnPlaneDistance(long id) { super(id); }
  public native long   VTKInit();

}
