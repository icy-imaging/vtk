// java wrapper for vtkParametricSpline object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParametricSpline extends vtkParametricFunction
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

  private native void Evaluate_5(double id0[],double id1[],double id2[]);
  public void Evaluate(double id0[],double id1[],double id2[])
  {
    Evaluate_5(id0,id1,id2);
  }

  private native double EvaluateScalar_6(double id0[],double id1[],double id2[]);
  public double EvaluateScalar(double id0[],double id1[],double id2[])
  {
    return EvaluateScalar_6(id0,id1,id2);
  }

  private native void SetXSpline_7(vtkSpline id0);
  public void SetXSpline(vtkSpline id0)
  {
    SetXSpline_7(id0);
  }

  private native void SetYSpline_8(vtkSpline id0);
  public void SetYSpline(vtkSpline id0)
  {
    SetYSpline_8(id0);
  }

  private native void SetZSpline_9(vtkSpline id0);
  public void SetZSpline(vtkSpline id0)
  {
    SetZSpline_9(id0);
  }

  private native long GetXSpline_10();
  public vtkSpline GetXSpline()
  {
    long temp = GetXSpline_10();

    if (temp == 0) return null;
    return (vtkSpline)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetYSpline_11();
  public vtkSpline GetYSpline()
  {
    long temp = GetYSpline_11();

    if (temp == 0) return null;
    return (vtkSpline)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetZSpline_12();
  public vtkSpline GetZSpline()
  {
    long temp = GetZSpline_12();

    if (temp == 0) return null;
    return (vtkSpline)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPoints_13(vtkPoints id0);
  public void SetPoints(vtkPoints id0)
  {
    SetPoints_13(id0);
  }

  private native long GetPoints_14();
  public vtkPoints GetPoints()
  {
    long temp = GetPoints_14();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNumberOfPoints_15(long id0);
  public void SetNumberOfPoints(long id0)
  {
    SetNumberOfPoints_15(id0);
  }

  private native void SetPoint_16(long id0,double id1,double id2,double id3);
  public void SetPoint(long id0,double id1,double id2,double id3)
  {
    SetPoint_16(id0,id1,id2,id3);
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

  private native void SetParameterizeByLength_21(int id0);
  public void SetParameterizeByLength(int id0)
  {
    SetParameterizeByLength_21(id0);
  }

  private native int GetParameterizeByLength_22();
  public int GetParameterizeByLength()
  {
    return GetParameterizeByLength_22();
  }

  private native void ParameterizeByLengthOn_23();
  public void ParameterizeByLengthOn()
  {
    ParameterizeByLengthOn_23();
  }

  private native void ParameterizeByLengthOff_24();
  public void ParameterizeByLengthOff()
  {
    ParameterizeByLengthOff_24();
  }

  private native void SetLeftConstraint_25(int id0);
  public void SetLeftConstraint(int id0)
  {
    SetLeftConstraint_25(id0);
  }

  private native int GetLeftConstraintMinValue_26();
  public int GetLeftConstraintMinValue()
  {
    return GetLeftConstraintMinValue_26();
  }

  private native int GetLeftConstraintMaxValue_27();
  public int GetLeftConstraintMaxValue()
  {
    return GetLeftConstraintMaxValue_27();
  }

  private native int GetLeftConstraint_28();
  public int GetLeftConstraint()
  {
    return GetLeftConstraint_28();
  }

  private native void SetRightConstraint_29(int id0);
  public void SetRightConstraint(int id0)
  {
    SetRightConstraint_29(id0);
  }

  private native int GetRightConstraintMinValue_30();
  public int GetRightConstraintMinValue()
  {
    return GetRightConstraintMinValue_30();
  }

  private native int GetRightConstraintMaxValue_31();
  public int GetRightConstraintMaxValue()
  {
    return GetRightConstraintMaxValue_31();
  }

  private native int GetRightConstraint_32();
  public int GetRightConstraint()
  {
    return GetRightConstraint_32();
  }

  private native void SetLeftValue_33(double id0);
  public void SetLeftValue(double id0)
  {
    SetLeftValue_33(id0);
  }

  private native double GetLeftValue_34();
  public double GetLeftValue()
  {
    return GetLeftValue_34();
  }

  private native void SetRightValue_35(double id0);
  public void SetRightValue(double id0)
  {
    SetRightValue_35(id0);
  }

  private native double GetRightValue_36();
  public double GetRightValue()
  {
    return GetRightValue_36();
  }

  public vtkParametricSpline() { super(); }

  public vtkParametricSpline(long id) { super(id); }
  public native long   VTKInit();

}
