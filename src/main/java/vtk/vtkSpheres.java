// java wrapper for vtkSpheres object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSpheres extends vtkImplicitFunction
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

  private native double EvaluateFunction_4(double id0[]);
  public double EvaluateFunction(double id0[])
  {
    return EvaluateFunction_4(id0);
  }

  private native void EvaluateGradient_5(double id0[],double id1[]);
  public void EvaluateGradient(double id0[],double id1[])
  {
    EvaluateGradient_5(id0,id1);
  }

  private native void SetCenters_6(vtkPoints id0);
  public void SetCenters(vtkPoints id0)
  {
    SetCenters_6(id0);
  }

  private native long GetCenters_7();
  public vtkPoints GetCenters()
  {
    long temp = GetCenters_7();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRadii_8(vtkDataArray id0);
  public void SetRadii(vtkDataArray id0)
  {
    SetRadii_8(id0);
  }

  private native long GetRadii_9();
  public vtkDataArray GetRadii()
  {
    long temp = GetRadii_9();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfSpheres_10();
  public int GetNumberOfSpheres()
  {
    return GetNumberOfSpheres_10();
  }

  private native long GetSphere_11(int id0);
  public vtkSphere GetSphere(int id0)
  {
    long temp = GetSphere_11(id0);

    if (temp == 0) return null;
    return (vtkSphere)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetSphere_12(int id0,vtkSphere id1);
  public void GetSphere(int id0,vtkSphere id1)
  {
    GetSphere_12(id0,id1);
  }

  private native void EvaluateFunction_13(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_13(id0,id1);
  }

  private native double EvaluateFunction_14(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_14(id0,id1,id2);
  }

  public vtkSpheres() { super(); }

  public vtkSpheres(long id) { super(id); }
  public native long   VTKInit();

}
