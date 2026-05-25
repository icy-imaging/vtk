// java wrapper for vtkSectorSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSectorSource extends vtkPolyDataAlgorithm
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

  private native void SetZCoord_12(double id0);
  public void SetZCoord(double id0)
  {
    SetZCoord_12(id0);
  }

  private native double GetZCoordMinValue_13();
  public double GetZCoordMinValue()
  {
    return GetZCoordMinValue_13();
  }

  private native double GetZCoordMaxValue_14();
  public double GetZCoordMaxValue()
  {
    return GetZCoordMaxValue_14();
  }

  private native double GetZCoord_15();
  public double GetZCoord()
  {
    return GetZCoord_15();
  }

  private native void SetRadialResolution_16(int id0);
  public void SetRadialResolution(int id0)
  {
    SetRadialResolution_16(id0);
  }

  private native int GetRadialResolutionMinValue_17();
  public int GetRadialResolutionMinValue()
  {
    return GetRadialResolutionMinValue_17();
  }

  private native int GetRadialResolutionMaxValue_18();
  public int GetRadialResolutionMaxValue()
  {
    return GetRadialResolutionMaxValue_18();
  }

  private native int GetRadialResolution_19();
  public int GetRadialResolution()
  {
    return GetRadialResolution_19();
  }

  private native void SetCircumferentialResolution_20(int id0);
  public void SetCircumferentialResolution(int id0)
  {
    SetCircumferentialResolution_20(id0);
  }

  private native int GetCircumferentialResolutionMinValue_21();
  public int GetCircumferentialResolutionMinValue()
  {
    return GetCircumferentialResolutionMinValue_21();
  }

  private native int GetCircumferentialResolutionMaxValue_22();
  public int GetCircumferentialResolutionMaxValue()
  {
    return GetCircumferentialResolutionMaxValue_22();
  }

  private native int GetCircumferentialResolution_23();
  public int GetCircumferentialResolution()
  {
    return GetCircumferentialResolution_23();
  }

  private native void SetStartAngle_24(double id0);
  public void SetStartAngle(double id0)
  {
    SetStartAngle_24(id0);
  }

  private native double GetStartAngleMinValue_25();
  public double GetStartAngleMinValue()
  {
    return GetStartAngleMinValue_25();
  }

  private native double GetStartAngleMaxValue_26();
  public double GetStartAngleMaxValue()
  {
    return GetStartAngleMaxValue_26();
  }

  private native double GetStartAngle_27();
  public double GetStartAngle()
  {
    return GetStartAngle_27();
  }

  private native void SetEndAngle_28(double id0);
  public void SetEndAngle(double id0)
  {
    SetEndAngle_28(id0);
  }

  private native double GetEndAngleMinValue_29();
  public double GetEndAngleMinValue()
  {
    return GetEndAngleMinValue_29();
  }

  private native double GetEndAngleMaxValue_30();
  public double GetEndAngleMaxValue()
  {
    return GetEndAngleMaxValue_30();
  }

  private native double GetEndAngle_31();
  public double GetEndAngle()
  {
    return GetEndAngle_31();
  }

  public vtkSectorSource() { super(); }

  public vtkSectorSource(long id) { super(id); }
  public native long   VTKInit();

}
