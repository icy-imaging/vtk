// java wrapper for vtkSuperquadricSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSuperquadricSource extends vtkPolyDataAlgorithm
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

  private native void SetCenter_4(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_4(id0,id1,id2);
  }

  private native void SetCenter_5(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_5(id0);
  }

  private native double[] GetCenter_6();
  public double[] GetCenter()
  {
    return GetCenter_6();
  }

  private native void SetScale_7(double id0,double id1,double id2);
  public void SetScale(double id0,double id1,double id2)
  {
    SetScale_7(id0,id1,id2);
  }

  private native void SetScale_8(double id0[]);
  public void SetScale(double id0[])
  {
    SetScale_8(id0);
  }

  private native double[] GetScale_9();
  public double[] GetScale()
  {
    return GetScale_9();
  }

  private native int GetThetaResolution_10();
  public int GetThetaResolution()
  {
    return GetThetaResolution_10();
  }

  private native void SetThetaResolution_11(int id0);
  public void SetThetaResolution(int id0)
  {
    SetThetaResolution_11(id0);
  }

  private native int GetPhiResolution_12();
  public int GetPhiResolution()
  {
    return GetPhiResolution_12();
  }

  private native void SetPhiResolution_13(int id0);
  public void SetPhiResolution(int id0)
  {
    SetPhiResolution_13(id0);
  }

  private native double GetThickness_14();
  public double GetThickness()
  {
    return GetThickness_14();
  }

  private native void SetThickness_15(double id0);
  public void SetThickness(double id0)
  {
    SetThickness_15(id0);
  }

  private native double GetThicknessMinValue_16();
  public double GetThicknessMinValue()
  {
    return GetThicknessMinValue_16();
  }

  private native double GetThicknessMaxValue_17();
  public double GetThicknessMaxValue()
  {
    return GetThicknessMaxValue_17();
  }

  private native double GetPhiRoundness_18();
  public double GetPhiRoundness()
  {
    return GetPhiRoundness_18();
  }

  private native void SetPhiRoundness_19(double id0);
  public void SetPhiRoundness(double id0)
  {
    SetPhiRoundness_19(id0);
  }

  private native double GetThetaRoundness_20();
  public double GetThetaRoundness()
  {
    return GetThetaRoundness_20();
  }

  private native void SetThetaRoundness_21(double id0);
  public void SetThetaRoundness(double id0)
  {
    SetThetaRoundness_21(id0);
  }

  private native void SetSize_22(double id0);
  public void SetSize(double id0)
  {
    SetSize_22(id0);
  }

  private native double GetSize_23();
  public double GetSize()
  {
    return GetSize_23();
  }

  private native void SetAxisOfSymmetry_24(int id0);
  public void SetAxisOfSymmetry(int id0)
  {
    SetAxisOfSymmetry_24(id0);
  }

  private native int GetAxisOfSymmetry_25();
  public int GetAxisOfSymmetry()
  {
    return GetAxisOfSymmetry_25();
  }

  private native void SetXAxisOfSymmetry_26();
  public void SetXAxisOfSymmetry()
  {
    SetXAxisOfSymmetry_26();
  }

  private native void SetYAxisOfSymmetry_27();
  public void SetYAxisOfSymmetry()
  {
    SetYAxisOfSymmetry_27();
  }

  private native void SetZAxisOfSymmetry_28();
  public void SetZAxisOfSymmetry()
  {
    SetZAxisOfSymmetry_28();
  }

  private native void ToroidalOn_29();
  public void ToroidalOn()
  {
    ToroidalOn_29();
  }

  private native void ToroidalOff_30();
  public void ToroidalOff()
  {
    ToroidalOff_30();
  }

  private native int GetToroidal_31();
  public int GetToroidal()
  {
    return GetToroidal_31();
  }

  private native void SetToroidal_32(int id0);
  public void SetToroidal(int id0)
  {
    SetToroidal_32(id0);
  }

  private native void SetOutputPointsPrecision_33(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_33(id0);
  }

  private native int GetOutputPointsPrecision_34();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_34();
  }

  public vtkSuperquadricSource() { super(); }

  public vtkSuperquadricSource(long id) { super(id); }
  public native long   VTKInit();

}
