// java wrapper for vtkPlanes object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlanes extends vtkImplicitFunction
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

  private native void SetPoints_6(vtkPoints id0);
  public void SetPoints(vtkPoints id0)
  {
    SetPoints_6(id0);
  }

  private native long GetPoints_7();
  public vtkPoints GetPoints()
  {
    long temp = GetPoints_7();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNormals_8(vtkDataArray id0);
  public void SetNormals(vtkDataArray id0)
  {
    SetNormals_8(id0);
  }

  private native long GetNormals_9();
  public vtkDataArray GetNormals()
  {
    long temp = GetNormals_9();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFrustumPlanes_10(double id0[]);
  public void SetFrustumPlanes(double id0[])
  {
    SetFrustumPlanes_10(id0);
  }

  private native void SetBounds_11(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_11(id0);
  }

  private native void SetBounds_12(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_12(id0,id1,id2,id3,id4,id5);
  }

  private native int GetNumberOfPlanes_13();
  public int GetNumberOfPlanes()
  {
    return GetNumberOfPlanes_13();
  }

  private native long GetPlane_14(int id0);
  public vtkPlane GetPlane(int id0)
  {
    long temp = GetPlane_14(id0);

    if (temp == 0) return null;
    return (vtkPlane)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetPlane_15(int id0,vtkPlane id1);
  public void GetPlane(int id0,vtkPlane id1)
  {
    GetPlane_15(id0,id1);
  }

  private native void EvaluateFunction_16(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_16(id0,id1);
  }

  private native double EvaluateFunction_17(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_17(id0,id1,id2);
  }

  public vtkPlanes() { super(); }

  public vtkPlanes(long id) { super(id); }
  public native long   VTKInit();

}
