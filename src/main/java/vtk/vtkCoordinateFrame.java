// java wrapper for vtkCoordinateFrame object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCoordinateFrame extends vtkImplicitFunction
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

  private native void SetOrigin_6(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_6(id0,id1,id2);
  }

  private native void SetOrigin_7(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_7(id0);
  }

  private native double[] GetOrigin_8();
  public double[] GetOrigin()
  {
    return GetOrigin_8();
  }

  private native void SetXAxis_9(double id0,double id1,double id2);
  public void SetXAxis(double id0,double id1,double id2)
  {
    SetXAxis_9(id0,id1,id2);
  }

  private native void SetXAxis_10(double id0[]);
  public void SetXAxis(double id0[])
  {
    SetXAxis_10(id0);
  }

  private native double[] GetXAxis_11();
  public double[] GetXAxis()
  {
    return GetXAxis_11();
  }

  private native void SetYAxis_12(double id0,double id1,double id2);
  public void SetYAxis(double id0,double id1,double id2)
  {
    SetYAxis_12(id0,id1,id2);
  }

  private native void SetYAxis_13(double id0[]);
  public void SetYAxis(double id0[])
  {
    SetYAxis_13(id0);
  }

  private native double[] GetYAxis_14();
  public double[] GetYAxis()
  {
    return GetYAxis_14();
  }

  private native void SetZAxis_15(double id0,double id1,double id2);
  public void SetZAxis(double id0,double id1,double id2)
  {
    SetZAxis_15(id0,id1,id2);
  }

  private native void SetZAxis_16(double id0[]);
  public void SetZAxis(double id0[])
  {
    SetZAxis_16(id0);
  }

  private native double[] GetZAxis_17();
  public double[] GetZAxis()
  {
    return GetZAxis_17();
  }

  private native void EvaluateFunction_18(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_18(id0,id1);
  }

  private native double EvaluateFunction_19(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_19(id0,id1,id2);
  }

  public vtkCoordinateFrame() { super(); }

  public vtkCoordinateFrame(long id) { super(id); }
  public native long   VTKInit();

}
