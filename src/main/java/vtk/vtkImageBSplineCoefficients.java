// java wrapper for vtkImageBSplineCoefficients object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageBSplineCoefficients extends vtkThreadedImageAlgorithm
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

  private native void SetSplineDegree_4(int id0);
  public void SetSplineDegree(int id0)
  {
    SetSplineDegree_4(id0);
  }

  private native int GetSplineDegreeMinValue_5();
  public int GetSplineDegreeMinValue()
  {
    return GetSplineDegreeMinValue_5();
  }

  private native int GetSplineDegreeMaxValue_6();
  public int GetSplineDegreeMaxValue()
  {
    return GetSplineDegreeMaxValue_6();
  }

  private native int GetSplineDegree_7();
  public int GetSplineDegree()
  {
    return GetSplineDegree_7();
  }

  private native void SetBorderModeToClamp_8();
  public void SetBorderModeToClamp()
  {
    SetBorderModeToClamp_8();
  }

  private native void SetBorderModeToRepeat_9();
  public void SetBorderModeToRepeat()
  {
    SetBorderModeToRepeat_9();
  }

  private native void SetBorderModeToMirror_10();
  public void SetBorderModeToMirror()
  {
    SetBorderModeToMirror_10();
  }

  private native byte[] GetBorderModeAsString_11();
  public String GetBorderModeAsString()
  {
    return new String(GetBorderModeAsString_11(), StandardCharsets.UTF_8);
  }

  private native void SetOutputScalarType_12(int id0);
  public void SetOutputScalarType(int id0)
  {
    SetOutputScalarType_12(id0);
  }

  private native int GetOutputScalarTypeMinValue_13();
  public int GetOutputScalarTypeMinValue()
  {
    return GetOutputScalarTypeMinValue_13();
  }

  private native int GetOutputScalarTypeMaxValue_14();
  public int GetOutputScalarTypeMaxValue()
  {
    return GetOutputScalarTypeMaxValue_14();
  }

  private native int GetOutputScalarType_15();
  public int GetOutputScalarType()
  {
    return GetOutputScalarType_15();
  }

  private native void SetOutputScalarTypeToFloat_16();
  public void SetOutputScalarTypeToFloat()
  {
    SetOutputScalarTypeToFloat_16();
  }

  private native void SetOutputScalarTypeToDouble_17();
  public void SetOutputScalarTypeToDouble()
  {
    SetOutputScalarTypeToDouble_17();
  }

  private native byte[] GetOutputScalarTypeAsString_18();
  public String GetOutputScalarTypeAsString()
  {
    return new String(GetOutputScalarTypeAsString_18(), StandardCharsets.UTF_8);
  }

  private native void SetBypass_19(int id0);
  public void SetBypass(int id0)
  {
    SetBypass_19(id0);
  }

  private native void BypassOn_20();
  public void BypassOn()
  {
    BypassOn_20();
  }

  private native void BypassOff_21();
  public void BypassOff()
  {
    BypassOff_21();
  }

  private native int GetBypass_22();
  public int GetBypass()
  {
    return GetBypass_22();
  }

  private native int CheckBounds_23(double id0[]);
  public int CheckBounds(double id0[])
  {
    return CheckBounds_23(id0);
  }

  private native double Evaluate_24(double id0,double id1,double id2);
  public double Evaluate(double id0,double id1,double id2)
  {
    return Evaluate_24(id0,id1,id2);
  }

  private native double Evaluate_25(double id0[]);
  public double Evaluate(double id0[])
  {
    return Evaluate_25(id0);
  }

  public vtkImageBSplineCoefficients() { super(); }

  public vtkImageBSplineCoefficients(long id) { super(id); }
  public native long   VTKInit();

}
