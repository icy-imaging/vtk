// java wrapper for vtkArcSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkArcSource extends vtkPolyDataAlgorithm
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

  private native void SetPoint1_4(double id0,double id1,double id2);
  public void SetPoint1(double id0,double id1,double id2)
  {
    SetPoint1_4(id0,id1,id2);
  }

  private native void SetPoint1_5(double id0[]);
  public void SetPoint1(double id0[])
  {
    SetPoint1_5(id0);
  }

  private native double[] GetPoint1_6();
  public double[] GetPoint1()
  {
    return GetPoint1_6();
  }

  private native void SetPoint2_7(double id0,double id1,double id2);
  public void SetPoint2(double id0,double id1,double id2)
  {
    SetPoint2_7(id0,id1,id2);
  }

  private native void SetPoint2_8(double id0[]);
  public void SetPoint2(double id0[])
  {
    SetPoint2_8(id0);
  }

  private native double[] GetPoint2_9();
  public double[] GetPoint2()
  {
    return GetPoint2_9();
  }

  private native void SetCenter_10(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_10(id0,id1,id2);
  }

  private native void SetCenter_11(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_11(id0);
  }

  private native double[] GetCenter_12();
  public double[] GetCenter()
  {
    return GetCenter_12();
  }

  private native void SetNormal_13(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_13(id0,id1,id2);
  }

  private native void SetNormal_14(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_14(id0);
  }

  private native double[] GetNormal_15();
  public double[] GetNormal()
  {
    return GetNormal_15();
  }

  private native void SetPolarVector_16(double id0,double id1,double id2);
  public void SetPolarVector(double id0,double id1,double id2)
  {
    SetPolarVector_16(id0,id1,id2);
  }

  private native void SetPolarVector_17(double id0[]);
  public void SetPolarVector(double id0[])
  {
    SetPolarVector_17(id0);
  }

  private native double[] GetPolarVector_18();
  public double[] GetPolarVector()
  {
    return GetPolarVector_18();
  }

  private native void SetAngle_19(double id0);
  public void SetAngle(double id0)
  {
    SetAngle_19(id0);
  }

  private native double GetAngleMinValue_20();
  public double GetAngleMinValue()
  {
    return GetAngleMinValue_20();
  }

  private native double GetAngleMaxValue_21();
  public double GetAngleMaxValue()
  {
    return GetAngleMaxValue_21();
  }

  private native double GetAngle_22();
  public double GetAngle()
  {
    return GetAngle_22();
  }

  private native void SetResolution_23(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_23(id0);
  }

  private native int GetResolutionMinValue_24();
  public int GetResolutionMinValue()
  {
    return GetResolutionMinValue_24();
  }

  private native int GetResolutionMaxValue_25();
  public int GetResolutionMaxValue()
  {
    return GetResolutionMaxValue_25();
  }

  private native int GetResolution_26();
  public int GetResolution()
  {
    return GetResolution_26();
  }

  private native void SetNegative_27(boolean id0);
  public void SetNegative(boolean id0)
  {
    SetNegative_27(id0);
  }

  private native boolean GetNegative_28();
  public boolean GetNegative()
  {
    return GetNegative_28();
  }

  private native void NegativeOn_29();
  public void NegativeOn()
  {
    NegativeOn_29();
  }

  private native void NegativeOff_30();
  public void NegativeOff()
  {
    NegativeOff_30();
  }

  private native void SetUseNormalAndAngle_31(boolean id0);
  public void SetUseNormalAndAngle(boolean id0)
  {
    SetUseNormalAndAngle_31(id0);
  }

  private native boolean GetUseNormalAndAngle_32();
  public boolean GetUseNormalAndAngle()
  {
    return GetUseNormalAndAngle_32();
  }

  private native void UseNormalAndAngleOn_33();
  public void UseNormalAndAngleOn()
  {
    UseNormalAndAngleOn_33();
  }

  private native void UseNormalAndAngleOff_34();
  public void UseNormalAndAngleOff()
  {
    UseNormalAndAngleOff_34();
  }

  private native void SetOutputPointsPrecision_35(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_35(id0);
  }

  private native int GetOutputPointsPrecision_36();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_36();
  }

  public vtkArcSource() { super(); }

  public vtkArcSource(long id) { super(id); }
  public native long   VTKInit();

}
