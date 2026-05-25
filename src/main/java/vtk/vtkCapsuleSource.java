// java wrapper for vtkCapsuleSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCapsuleSource extends vtkPolyDataAlgorithm
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

  private native void SetRadius_4(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_4(id0);
  }

  private native double GetRadiusMinValue_5();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_5();
  }

  private native double GetRadiusMaxValue_6();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_6();
  }

  private native double GetRadius_7();
  public double GetRadius()
  {
    return GetRadius_7();
  }

  private native void SetCenter_8(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_8(id0,id1,id2);
  }

  private native void SetCenter_9(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_9(id0);
  }

  private native double[] GetCenter_10();
  public double[] GetCenter()
  {
    return GetCenter_10();
  }

  private native void SetCylinderLength_11(double id0);
  public void SetCylinderLength(double id0)
  {
    SetCylinderLength_11(id0);
  }

  private native double GetCylinderLengthMinValue_12();
  public double GetCylinderLengthMinValue()
  {
    return GetCylinderLengthMinValue_12();
  }

  private native double GetCylinderLengthMaxValue_13();
  public double GetCylinderLengthMaxValue()
  {
    return GetCylinderLengthMaxValue_13();
  }

  private native double GetCylinderLength_14();
  public double GetCylinderLength()
  {
    return GetCylinderLength_14();
  }

  private native void SetThetaResolution_15(int id0);
  public void SetThetaResolution(int id0)
  {
    SetThetaResolution_15(id0);
  }

  private native int GetThetaResolutionMinValue_16();
  public int GetThetaResolutionMinValue()
  {
    return GetThetaResolutionMinValue_16();
  }

  private native int GetThetaResolutionMaxValue_17();
  public int GetThetaResolutionMaxValue()
  {
    return GetThetaResolutionMaxValue_17();
  }

  private native int GetThetaResolution_18();
  public int GetThetaResolution()
  {
    return GetThetaResolution_18();
  }

  private native void SetPhiResolution_19(int id0);
  public void SetPhiResolution(int id0)
  {
    SetPhiResolution_19(id0);
  }

  private native int GetPhiResolutionMinValue_20();
  public int GetPhiResolutionMinValue()
  {
    return GetPhiResolutionMinValue_20();
  }

  private native int GetPhiResolutionMaxValue_21();
  public int GetPhiResolutionMaxValue()
  {
    return GetPhiResolutionMaxValue_21();
  }

  private native int GetPhiResolution_22();
  public int GetPhiResolution()
  {
    return GetPhiResolution_22();
  }

  private native void SetLatLongTessellation_23(int id0);
  public void SetLatLongTessellation(int id0)
  {
    SetLatLongTessellation_23(id0);
  }

  private native int GetLatLongTessellation_24();
  public int GetLatLongTessellation()
  {
    return GetLatLongTessellation_24();
  }

  private native void LatLongTessellationOn_25();
  public void LatLongTessellationOn()
  {
    LatLongTessellationOn_25();
  }

  private native void LatLongTessellationOff_26();
  public void LatLongTessellationOff()
  {
    LatLongTessellationOff_26();
  }

  private native void SetOutputPointsPrecision_27(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_27(id0);
  }

  private native int GetOutputPointsPrecision_28();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_28();
  }

  public vtkCapsuleSource() { super(); }

  public vtkCapsuleSource(long id) { super(id); }
  public native long   VTKInit();

}
