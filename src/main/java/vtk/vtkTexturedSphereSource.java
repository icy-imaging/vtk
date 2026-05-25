// java wrapper for vtkTexturedSphereSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTexturedSphereSource extends vtkPolyDataAlgorithm
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

  private native void SetThetaResolution_8(int id0);
  public void SetThetaResolution(int id0)
  {
    SetThetaResolution_8(id0);
  }

  private native int GetThetaResolutionMinValue_9();
  public int GetThetaResolutionMinValue()
  {
    return GetThetaResolutionMinValue_9();
  }

  private native int GetThetaResolutionMaxValue_10();
  public int GetThetaResolutionMaxValue()
  {
    return GetThetaResolutionMaxValue_10();
  }

  private native int GetThetaResolution_11();
  public int GetThetaResolution()
  {
    return GetThetaResolution_11();
  }

  private native void SetPhiResolution_12(int id0);
  public void SetPhiResolution(int id0)
  {
    SetPhiResolution_12(id0);
  }

  private native int GetPhiResolutionMinValue_13();
  public int GetPhiResolutionMinValue()
  {
    return GetPhiResolutionMinValue_13();
  }

  private native int GetPhiResolutionMaxValue_14();
  public int GetPhiResolutionMaxValue()
  {
    return GetPhiResolutionMaxValue_14();
  }

  private native int GetPhiResolution_15();
  public int GetPhiResolution()
  {
    return GetPhiResolution_15();
  }

  private native void SetTheta_16(double id0);
  public void SetTheta(double id0)
  {
    SetTheta_16(id0);
  }

  private native double GetThetaMinValue_17();
  public double GetThetaMinValue()
  {
    return GetThetaMinValue_17();
  }

  private native double GetThetaMaxValue_18();
  public double GetThetaMaxValue()
  {
    return GetThetaMaxValue_18();
  }

  private native double GetTheta_19();
  public double GetTheta()
  {
    return GetTheta_19();
  }

  private native void SetPhi_20(double id0);
  public void SetPhi(double id0)
  {
    SetPhi_20(id0);
  }

  private native double GetPhiMinValue_21();
  public double GetPhiMinValue()
  {
    return GetPhiMinValue_21();
  }

  private native double GetPhiMaxValue_22();
  public double GetPhiMaxValue()
  {
    return GetPhiMaxValue_22();
  }

  private native double GetPhi_23();
  public double GetPhi()
  {
    return GetPhi_23();
  }

  private native void SetOutputPointsPrecision_24(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_24(id0);
  }

  private native int GetOutputPointsPrecision_25();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_25();
  }

  public vtkTexturedSphereSource() { super(); }

  public vtkTexturedSphereSource(long id) { super(id); }
  public native long   VTKInit();

}
