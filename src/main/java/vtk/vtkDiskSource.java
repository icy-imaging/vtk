// java wrapper for vtkDiskSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDiskSource extends vtkPolyDataAlgorithm
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

  private native void SetInnerRadius_4(double id0);
  public void SetInnerRadius(double id0)
  {
    SetInnerRadius_4(id0);
  }

  private native double GetInnerRadiusMinValue_5();
  public double GetInnerRadiusMinValue()
  {
    return GetInnerRadiusMinValue_5();
  }

  private native double GetInnerRadiusMaxValue_6();
  public double GetInnerRadiusMaxValue()
  {
    return GetInnerRadiusMaxValue_6();
  }

  private native double GetInnerRadius_7();
  public double GetInnerRadius()
  {
    return GetInnerRadius_7();
  }

  private native void SetOuterRadius_8(double id0);
  public void SetOuterRadius(double id0)
  {
    SetOuterRadius_8(id0);
  }

  private native double GetOuterRadiusMinValue_9();
  public double GetOuterRadiusMinValue()
  {
    return GetOuterRadiusMinValue_9();
  }

  private native double GetOuterRadiusMaxValue_10();
  public double GetOuterRadiusMaxValue()
  {
    return GetOuterRadiusMaxValue_10();
  }

  private native double GetOuterRadius_11();
  public double GetOuterRadius()
  {
    return GetOuterRadius_11();
  }

  private native void SetRadialResolution_12(int id0);
  public void SetRadialResolution(int id0)
  {
    SetRadialResolution_12(id0);
  }

  private native int GetRadialResolutionMinValue_13();
  public int GetRadialResolutionMinValue()
  {
    return GetRadialResolutionMinValue_13();
  }

  private native int GetRadialResolutionMaxValue_14();
  public int GetRadialResolutionMaxValue()
  {
    return GetRadialResolutionMaxValue_14();
  }

  private native int GetRadialResolution_15();
  public int GetRadialResolution()
  {
    return GetRadialResolution_15();
  }

  private native void SetCircumferentialResolution_16(int id0);
  public void SetCircumferentialResolution(int id0)
  {
    SetCircumferentialResolution_16(id0);
  }

  private native int GetCircumferentialResolutionMinValue_17();
  public int GetCircumferentialResolutionMinValue()
  {
    return GetCircumferentialResolutionMinValue_17();
  }

  private native int GetCircumferentialResolutionMaxValue_18();
  public int GetCircumferentialResolutionMaxValue()
  {
    return GetCircumferentialResolutionMaxValue_18();
  }

  private native int GetCircumferentialResolution_19();
  public int GetCircumferentialResolution()
  {
    return GetCircumferentialResolution_19();
  }

  private native void SetCenter_20(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_20(id0,id1,id2);
  }

  private native void SetCenter_21(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_21(id0);
  }

  private native double[] GetCenter_22();
  public double[] GetCenter()
  {
    return GetCenter_22();
  }

  private native void SetNormal_23(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_23(id0,id1,id2);
  }

  private native void SetNormal_24(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_24(id0);
  }

  private native double[] GetNormal_25();
  public double[] GetNormal()
  {
    return GetNormal_25();
  }

  private native void SetOutputPointsPrecision_26(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_26(id0);
  }

  private native int GetOutputPointsPrecision_27();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_27();
  }

  public vtkDiskSource() { super(); }

  public vtkDiskSource(long id) { super(id); }
  public native long   VTKInit();

}
