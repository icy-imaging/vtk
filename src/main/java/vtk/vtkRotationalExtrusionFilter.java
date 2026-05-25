// java wrapper for vtkRotationalExtrusionFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRotationalExtrusionFilter extends vtkPolyDataAlgorithm
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

  private native void SetResolution_4(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_4(id0);
  }

  private native int GetResolutionMinValue_5();
  public int GetResolutionMinValue()
  {
    return GetResolutionMinValue_5();
  }

  private native int GetResolutionMaxValue_6();
  public int GetResolutionMaxValue()
  {
    return GetResolutionMaxValue_6();
  }

  private native int GetResolution_7();
  public int GetResolution()
  {
    return GetResolution_7();
  }

  private native void SetCapping_8(int id0);
  public void SetCapping(int id0)
  {
    SetCapping_8(id0);
  }

  private native int GetCapping_9();
  public int GetCapping()
  {
    return GetCapping_9();
  }

  private native void CappingOn_10();
  public void CappingOn()
  {
    CappingOn_10();
  }

  private native void CappingOff_11();
  public void CappingOff()
  {
    CappingOff_11();
  }

  private native void SetAngle_12(double id0);
  public void SetAngle(double id0)
  {
    SetAngle_12(id0);
  }

  private native double GetAngle_13();
  public double GetAngle()
  {
    return GetAngle_13();
  }

  private native void SetTranslation_14(double id0);
  public void SetTranslation(double id0)
  {
    SetTranslation_14(id0);
  }

  private native double GetTranslation_15();
  public double GetTranslation()
  {
    return GetTranslation_15();
  }

  private native void SetDeltaRadius_16(double id0);
  public void SetDeltaRadius(double id0)
  {
    SetDeltaRadius_16(id0);
  }

  private native double GetDeltaRadius_17();
  public double GetDeltaRadius()
  {
    return GetDeltaRadius_17();
  }

  private native void SetRotationAxis_18(double id0,double id1,double id2);
  public void SetRotationAxis(double id0,double id1,double id2)
  {
    SetRotationAxis_18(id0,id1,id2);
  }

  private native void SetRotationAxis_19(double id0[]);
  public void SetRotationAxis(double id0[])
  {
    SetRotationAxis_19(id0);
  }

  private native double[] GetRotationAxis_20();
  public double[] GetRotationAxis()
  {
    return GetRotationAxis_20();
  }

  public vtkRotationalExtrusionFilter() { super(); }

  public vtkRotationalExtrusionFilter(long id) { super(id); }
  public native long   VTKInit();

}
