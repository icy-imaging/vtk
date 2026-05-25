// java wrapper for vtkParametricSuperEllipsoid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParametricSuperEllipsoid extends vtkParametricFunction
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

  private native int GetDimension_4();
  public int GetDimension()
  {
    return GetDimension_4();
  }

  private native void SetXRadius_5(double id0);
  public void SetXRadius(double id0)
  {
    SetXRadius_5(id0);
  }

  private native double GetXRadius_6();
  public double GetXRadius()
  {
    return GetXRadius_6();
  }

  private native void SetYRadius_7(double id0);
  public void SetYRadius(double id0)
  {
    SetYRadius_7(id0);
  }

  private native double GetYRadius_8();
  public double GetYRadius()
  {
    return GetYRadius_8();
  }

  private native void SetZRadius_9(double id0);
  public void SetZRadius(double id0)
  {
    SetZRadius_9(id0);
  }

  private native double GetZRadius_10();
  public double GetZRadius()
  {
    return GetZRadius_10();
  }

  private native void SetN1_11(double id0);
  public void SetN1(double id0)
  {
    SetN1_11(id0);
  }

  private native double GetN1_12();
  public double GetN1()
  {
    return GetN1_12();
  }

  private native void SetN2_13(double id0);
  public void SetN2(double id0)
  {
    SetN2_13(id0);
  }

  private native double GetN2_14();
  public double GetN2()
  {
    return GetN2_14();
  }

  private native void Evaluate_15(double id0[],double id1[],double id2[]);
  public void Evaluate(double id0[],double id1[],double id2[])
  {
    Evaluate_15(id0,id1,id2);
  }

  private native double EvaluateScalar_16(double id0[],double id1[],double id2[]);
  public double EvaluateScalar(double id0[],double id1[],double id2[])
  {
    return EvaluateScalar_16(id0,id1,id2);
  }

  public vtkParametricSuperEllipsoid() { super(); }

  public vtkParametricSuperEllipsoid(long id) { super(id); }
  public native long   VTKInit();

}
