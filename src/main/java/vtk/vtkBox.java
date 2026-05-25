// java wrapper for vtkBox object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBox extends vtkImplicitFunction
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

  private native void SetXMin_6(double id0[]);
  public void SetXMin(double id0[])
  {
    SetXMin_6(id0);
  }

  private native void SetXMin_7(double id0,double id1,double id2);
  public void SetXMin(double id0,double id1,double id2)
  {
    SetXMin_7(id0,id1,id2);
  }

  private native void GetXMin_8(double id0[]);
  public void GetXMin(double id0[])
  {
    GetXMin_8(id0);
  }

  private native void SetXMax_9(double id0[]);
  public void SetXMax(double id0[])
  {
    SetXMax_9(id0);
  }

  private native void SetXMax_10(double id0,double id1,double id2);
  public void SetXMax(double id0,double id1,double id2)
  {
    SetXMax_10(id0,id1,id2);
  }

  private native void GetXMax_11(double id0[]);
  public void GetXMax(double id0[])
  {
    GetXMax_11(id0);
  }

  private native void SetBounds_12(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_12(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_13(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_13(id0);
  }

  private native void GetBounds_14(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_14(id0);
  }

  private native double[] GetBounds_15();
  public double[] GetBounds()
  {
    return GetBounds_15();
  }

  private native void AddBounds_16(double id0[]);
  public void AddBounds(double id0[])
  {
    AddBounds_16(id0);
  }

  private native int IntersectWithPlane_17(double id0[],double id1[],double id2[]);
  public int IntersectWithPlane(double id0[],double id1[],double id2[])
  {
    return IntersectWithPlane_17(id0,id1,id2);
  }

  private native int IntersectWithPlane_18(double id0[],double id1[],double id2[],double id3[]);
  public int IntersectWithPlane(double id0[],double id1[],double id2[],double id3[])
  {
    return IntersectWithPlane_18(id0,id1,id2,id3);
  }

  private native int IsBoxInFrustum_19(double id0[],double id1[]);
  public int IsBoxInFrustum(double id0[],double id1[])
  {
    return IsBoxInFrustum_19(id0,id1);
  }

  private native void EvaluateFunction_20(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_20(id0,id1);
  }

  private native double EvaluateFunction_21(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_21(id0,id1,id2);
  }

  public vtkBox() { super(); }

  public vtkBox(long id) { super(id); }
  public native long   VTKInit();

}
