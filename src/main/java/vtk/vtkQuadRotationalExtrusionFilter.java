// java wrapper for vtkQuadRotationalExtrusionFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkQuadRotationalExtrusionFilter extends vtkMultiBlockDataSetAlgorithm
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

  private native void SetAxis_4(int id0);
  public void SetAxis(int id0)
  {
    SetAxis_4(id0);
  }

  private native int GetAxisMinValue_5();
  public int GetAxisMinValue()
  {
    return GetAxisMinValue_5();
  }

  private native int GetAxisMaxValue_6();
  public int GetAxisMaxValue()
  {
    return GetAxisMaxValue_6();
  }

  private native int GetAxis_7();
  public int GetAxis()
  {
    return GetAxis_7();
  }

  private native void SetAxisToX_8();
  public void SetAxisToX()
  {
    SetAxisToX_8();
  }

  private native void SetAxisToY_9();
  public void SetAxisToY()
  {
    SetAxisToY_9();
  }

  private native void SetAxisToZ_10();
  public void SetAxisToZ()
  {
    SetAxisToZ_10();
  }

  private native void SetResolution_11(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_11(id0);
  }

  private native int GetResolutionMinValue_12();
  public int GetResolutionMinValue()
  {
    return GetResolutionMinValue_12();
  }

  private native int GetResolutionMaxValue_13();
  public int GetResolutionMaxValue()
  {
    return GetResolutionMaxValue_13();
  }

  private native int GetResolution_14();
  public int GetResolution()
  {
    return GetResolution_14();
  }

  private native void SetCapping_15(int id0);
  public void SetCapping(int id0)
  {
    SetCapping_15(id0);
  }

  private native int GetCapping_16();
  public int GetCapping()
  {
    return GetCapping_16();
  }

  private native void CappingOn_17();
  public void CappingOn()
  {
    CappingOn_17();
  }

  private native void CappingOff_18();
  public void CappingOff()
  {
    CappingOff_18();
  }

  private native void SetDefaultAngle_19(double id0);
  public void SetDefaultAngle(double id0)
  {
    SetDefaultAngle_19(id0);
  }

  private native double GetDefaultAngle_20();
  public double GetDefaultAngle()
  {
    return GetDefaultAngle_20();
  }

  private native void RemoveAllPerBlockAngles_21();
  public void RemoveAllPerBlockAngles()
  {
    RemoveAllPerBlockAngles_21();
  }

  private native void AddPerBlockAngle_22(long id0,double id1);
  public void AddPerBlockAngle(long id0,double id1)
  {
    AddPerBlockAngle_22(id0,id1);
  }

  private native void SetTranslation_23(double id0);
  public void SetTranslation(double id0)
  {
    SetTranslation_23(id0);
  }

  private native double GetTranslation_24();
  public double GetTranslation()
  {
    return GetTranslation_24();
  }

  private native void SetDeltaRadius_25(double id0);
  public void SetDeltaRadius(double id0)
  {
    SetDeltaRadius_25(id0);
  }

  private native double GetDeltaRadius_26();
  public double GetDeltaRadius()
  {
    return GetDeltaRadius_26();
  }

  public vtkQuadRotationalExtrusionFilter() { super(); }

  public vtkQuadRotationalExtrusionFilter(long id) { super(id); }
  public native long   VTKInit();

}
