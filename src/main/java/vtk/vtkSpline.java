// java wrapper for vtkSpline object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSpline extends vtkObject
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

  private native void SetParametricRange_4(double id0,double id1);
  public void SetParametricRange(double id0,double id1)
  {
    SetParametricRange_4(id0,id1);
  }

  private native void SetParametricRange_5(double id0[]);
  public void SetParametricRange(double id0[])
  {
    SetParametricRange_5(id0);
  }

  private native void GetParametricRange_6(double id0[]);
  public void GetParametricRange(double id0[])
  {
    GetParametricRange_6(id0);
  }

  private native void SetClampValue_7(int id0);
  public void SetClampValue(int id0)
  {
    SetClampValue_7(id0);
  }

  private native int GetClampValue_8();
  public int GetClampValue()
  {
    return GetClampValue_8();
  }

  private native void ClampValueOn_9();
  public void ClampValueOn()
  {
    ClampValueOn_9();
  }

  private native void ClampValueOff_10();
  public void ClampValueOff()
  {
    ClampValueOff_10();
  }

  private native void Compute_11();
  public void Compute()
  {
    Compute_11();
  }

  private native double Evaluate_12(double id0);
  public double Evaluate(double id0)
  {
    return Evaluate_12(id0);
  }

  private native int GetNumberOfPoints_13();
  public int GetNumberOfPoints()
  {
    return GetNumberOfPoints_13();
  }

  private native void AddPoint_14(double id0,double id1);
  public void AddPoint(double id0,double id1)
  {
    AddPoint_14(id0,id1);
  }

  private native void RemovePoint_15(double id0);
  public void RemovePoint(double id0)
  {
    RemovePoint_15(id0);
  }

  private native void RemoveAllPoints_16();
  public void RemoveAllPoints()
  {
    RemoveAllPoints_16();
  }

  private native void SetClosed_17(int id0);
  public void SetClosed(int id0)
  {
    SetClosed_17(id0);
  }

  private native int GetClosed_18();
  public int GetClosed()
  {
    return GetClosed_18();
  }

  private native void ClosedOn_19();
  public void ClosedOn()
  {
    ClosedOn_19();
  }

  private native void ClosedOff_20();
  public void ClosedOff()
  {
    ClosedOff_20();
  }

  private native void SetLeftConstraint_21(int id0);
  public void SetLeftConstraint(int id0)
  {
    SetLeftConstraint_21(id0);
  }

  private native int GetLeftConstraintMinValue_22();
  public int GetLeftConstraintMinValue()
  {
    return GetLeftConstraintMinValue_22();
  }

  private native int GetLeftConstraintMaxValue_23();
  public int GetLeftConstraintMaxValue()
  {
    return GetLeftConstraintMaxValue_23();
  }

  private native int GetLeftConstraint_24();
  public int GetLeftConstraint()
  {
    return GetLeftConstraint_24();
  }

  private native void SetRightConstraint_25(int id0);
  public void SetRightConstraint(int id0)
  {
    SetRightConstraint_25(id0);
  }

  private native int GetRightConstraintMinValue_26();
  public int GetRightConstraintMinValue()
  {
    return GetRightConstraintMinValue_26();
  }

  private native int GetRightConstraintMaxValue_27();
  public int GetRightConstraintMaxValue()
  {
    return GetRightConstraintMaxValue_27();
  }

  private native int GetRightConstraint_28();
  public int GetRightConstraint()
  {
    return GetRightConstraint_28();
  }

  private native void SetLeftValue_29(double id0);
  public void SetLeftValue(double id0)
  {
    SetLeftValue_29(id0);
  }

  private native double GetLeftValue_30();
  public double GetLeftValue()
  {
    return GetLeftValue_30();
  }

  private native void SetRightValue_31(double id0);
  public void SetRightValue(double id0)
  {
    SetRightValue_31(id0);
  }

  private native double GetRightValue_32();
  public double GetRightValue()
  {
    return GetRightValue_32();
  }

  private native long GetMTime_33();
  public long GetMTime()
  {
    return GetMTime_33();
  }

  private native void DeepCopy_34(vtkSpline id0);
  public void DeepCopy(vtkSpline id0)
  {
    DeepCopy_34(id0);
  }

  public vtkSpline() { super(); }

  public vtkSpline(long id) { super(id); }

}
