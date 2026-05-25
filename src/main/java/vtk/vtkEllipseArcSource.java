// java wrapper for vtkEllipseArcSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEllipseArcSource extends vtkPolyDataAlgorithm
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

  private native void SetNormal_7(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_7(id0,id1,id2);
  }

  private native void SetNormal_8(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_8(id0);
  }

  private native double[] GetNormal_9();
  public double[] GetNormal()
  {
    return GetNormal_9();
  }

  private native void SetMajorRadiusVector_10(double id0,double id1,double id2);
  public void SetMajorRadiusVector(double id0,double id1,double id2)
  {
    SetMajorRadiusVector_10(id0,id1,id2);
  }

  private native void SetMajorRadiusVector_11(double id0[]);
  public void SetMajorRadiusVector(double id0[])
  {
    SetMajorRadiusVector_11(id0);
  }

  private native double[] GetMajorRadiusVector_12();
  public double[] GetMajorRadiusVector()
  {
    return GetMajorRadiusVector_12();
  }

  private native void SetStartAngle_13(double id0);
  public void SetStartAngle(double id0)
  {
    SetStartAngle_13(id0);
  }

  private native double GetStartAngleMinValue_14();
  public double GetStartAngleMinValue()
  {
    return GetStartAngleMinValue_14();
  }

  private native double GetStartAngleMaxValue_15();
  public double GetStartAngleMaxValue()
  {
    return GetStartAngleMaxValue_15();
  }

  private native double GetStartAngle_16();
  public double GetStartAngle()
  {
    return GetStartAngle_16();
  }

  private native void SetSegmentAngle_17(double id0);
  public void SetSegmentAngle(double id0)
  {
    SetSegmentAngle_17(id0);
  }

  private native double GetSegmentAngleMinValue_18();
  public double GetSegmentAngleMinValue()
  {
    return GetSegmentAngleMinValue_18();
  }

  private native double GetSegmentAngleMaxValue_19();
  public double GetSegmentAngleMaxValue()
  {
    return GetSegmentAngleMaxValue_19();
  }

  private native double GetSegmentAngle_20();
  public double GetSegmentAngle()
  {
    return GetSegmentAngle_20();
  }

  private native void SetResolution_21(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_21(id0);
  }

  private native int GetResolutionMinValue_22();
  public int GetResolutionMinValue()
  {
    return GetResolutionMinValue_22();
  }

  private native int GetResolutionMaxValue_23();
  public int GetResolutionMaxValue()
  {
    return GetResolutionMaxValue_23();
  }

  private native int GetResolution_24();
  public int GetResolution()
  {
    return GetResolution_24();
  }

  private native void SetClose_25(boolean id0);
  public void SetClose(boolean id0)
  {
    SetClose_25(id0);
  }

  private native boolean GetClose_26();
  public boolean GetClose()
  {
    return GetClose_26();
  }

  private native void CloseOn_27();
  public void CloseOn()
  {
    CloseOn_27();
  }

  private native void CloseOff_28();
  public void CloseOff()
  {
    CloseOff_28();
  }

  private native void SetOutputPointsPrecision_29(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_29(id0);
  }

  private native int GetOutputPointsPrecision_30();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_30();
  }

  private native void SetRatio_31(double id0);
  public void SetRatio(double id0)
  {
    SetRatio_31(id0);
  }

  private native double GetRatioMinValue_32();
  public double GetRatioMinValue()
  {
    return GetRatioMinValue_32();
  }

  private native double GetRatioMaxValue_33();
  public double GetRatioMaxValue()
  {
    return GetRatioMaxValue_33();
  }

  private native double GetRatio_34();
  public double GetRatio()
  {
    return GetRatio_34();
  }

  public vtkEllipseArcSource() { super(); }

  public vtkEllipseArcSource(long id) { super(id); }
  public native long   VTKInit();

}
