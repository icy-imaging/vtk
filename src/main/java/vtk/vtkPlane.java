// java wrapper for vtkPlane object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlane extends vtkImplicitFunction
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

  private native void EvaluateFunction_4(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_4(id0,id1);
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

  private native void SetNormal_7(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_7(id0,id1,id2);
  }

  private native void SetNormal_8(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_8(id0);
  }

  private native double[] GetNormal_9();
  public double[] GetNormal()
  {
    return GetNormal_9();
  }

  private native void SetOrigin_10(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_10(id0,id1,id2);
  }

  private native void SetOrigin_11(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_11(id0);
  }

  private native double[] GetOrigin_12();
  public double[] GetOrigin()
  {
    return GetOrigin_12();
  }

  private native void Push_13(double id0);
  public void Push(double id0)
  {
    Push_13(id0);
  }

  private native void ProjectPoint_14(double id0[],double id1[],double id2[],double id3[]);
  public void ProjectPoint(double id0[],double id1[],double id2[],double id3[])
  {
    ProjectPoint_14(id0,id1,id2,id3);
  }

  private native void ProjectPoint_15(double id0[],double id1[]);
  public void ProjectPoint(double id0[],double id1[])
  {
    ProjectPoint_15(id0,id1);
  }

  private native void ProjectVector_16(double id0[],double id1[],double id2[],double id3[]);
  public void ProjectVector(double id0[],double id1[],double id2[],double id3[])
  {
    ProjectVector_16(id0,id1,id2,id3);
  }

  private native void ProjectVector_17(double id0[],double id1[]);
  public void ProjectVector(double id0[],double id1[])
  {
    ProjectVector_17(id0,id1);
  }

  private native void GeneralizedProjectPoint_18(double id0[],double id1[],double id2[],double id3[]);
  public void GeneralizedProjectPoint(double id0[],double id1[],double id2[],double id3[])
  {
    GeneralizedProjectPoint_18(id0,id1,id2,id3);
  }

  private native void GeneralizedProjectPoint_19(double id0[],double id1[]);
  public void GeneralizedProjectPoint(double id0[],double id1[])
  {
    GeneralizedProjectPoint_19(id0,id1);
  }

  private native double Evaluate_20(double id0[],double id1[],double id2[]);
  public double Evaluate(double id0[],double id1[],double id2[])
  {
    return Evaluate_20(id0,id1,id2);
  }

  private native double DistanceToPlane_21(double id0[],double id1[],double id2[]);
  public double DistanceToPlane(double id0[],double id1[],double id2[])
  {
    return DistanceToPlane_21(id0,id1,id2);
  }

  private native double DistanceToPlane_22(double id0[]);
  public double DistanceToPlane(double id0[])
  {
    return DistanceToPlane_22(id0);
  }

  private native int IntersectWithFinitePlane_23(double id0[],double id1[],double id2[],double id3[],double id4[],double id5[],double id6[]);
  public int IntersectWithFinitePlane(double id0[],double id1[],double id2[],double id3[],double id4[],double id5[],double id6[])
  {
    return IntersectWithFinitePlane_23(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int IntersectWithFinitePlane_24(double id0[],double id1[],double id2[],double id3[],double id4[]);
  public int IntersectWithFinitePlane(double id0[],double id1[],double id2[],double id3[],double id4[])
  {
    return IntersectWithFinitePlane_24(id0,id1,id2,id3,id4);
  }

  private native double EvaluateFunction_25(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_25(id0,id1,id2);
  }

  public vtkPlane() { super(); }

  public vtkPlane(long id) { super(id); }
  public native long   VTKInit();

}
