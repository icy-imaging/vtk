// java wrapper for vtkCylinderSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCylinderSource extends vtkPolyDataAlgorithm
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

  private native void SetHeight_4(double id0);
  public void SetHeight(double id0)
  {
    SetHeight_4(id0);
  }

  private native double GetHeightMinValue_5();
  public double GetHeightMinValue()
  {
    return GetHeightMinValue_5();
  }

  private native double GetHeightMaxValue_6();
  public double GetHeightMaxValue()
  {
    return GetHeightMaxValue_6();
  }

  private native double GetHeight_7();
  public double GetHeight()
  {
    return GetHeight_7();
  }

  private native void SetRadius_8(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_8(id0);
  }

  private native double GetRadiusMinValue_9();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_9();
  }

  private native double GetRadiusMaxValue_10();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_10();
  }

  private native double GetRadius_11();
  public double GetRadius()
  {
    return GetRadius_11();
  }

  private native void SetCenter_12(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_12(id0,id1,id2);
  }

  private native void SetCenter_13(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_13(id0);
  }

  private native double[] GetCenter_14();
  public double[] GetCenter()
  {
    return GetCenter_14();
  }

  private native void SetResolution_15(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_15(id0);
  }

  private native int GetResolutionMinValue_16();
  public int GetResolutionMinValue()
  {
    return GetResolutionMinValue_16();
  }

  private native int GetResolutionMaxValue_17();
  public int GetResolutionMaxValue()
  {
    return GetResolutionMaxValue_17();
  }

  private native int GetResolution_18();
  public int GetResolution()
  {
    return GetResolution_18();
  }

  private native void SetCapping_19(int id0);
  public void SetCapping(int id0)
  {
    SetCapping_19(id0);
  }

  private native int GetCapping_20();
  public int GetCapping()
  {
    return GetCapping_20();
  }

  private native void CappingOn_21();
  public void CappingOn()
  {
    CappingOn_21();
  }

  private native void CappingOff_22();
  public void CappingOff()
  {
    CappingOff_22();
  }

  private native void SetCapsuleCap_23(int id0);
  public void SetCapsuleCap(int id0)
  {
    SetCapsuleCap_23(id0);
  }

  private native int GetCapsuleCap_24();
  public int GetCapsuleCap()
  {
    return GetCapsuleCap_24();
  }

  private native void CapsuleCapOn_25();
  public void CapsuleCapOn()
  {
    CapsuleCapOn_25();
  }

  private native void CapsuleCapOff_26();
  public void CapsuleCapOff()
  {
    CapsuleCapOff_26();
  }

  private native void SetLatLongTessellation_27(int id0);
  public void SetLatLongTessellation(int id0)
  {
    SetLatLongTessellation_27(id0);
  }

  private native int GetLatLongTessellation_28();
  public int GetLatLongTessellation()
  {
    return GetLatLongTessellation_28();
  }

  private native void LatLongTessellationOn_29();
  public void LatLongTessellationOn()
  {
    LatLongTessellationOn_29();
  }

  private native void LatLongTessellationOff_30();
  public void LatLongTessellationOff()
  {
    LatLongTessellationOff_30();
  }

  private native void SetOutputPointsPrecision_31(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_31(id0);
  }

  private native int GetOutputPointsPrecision_32();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_32();
  }

  public vtkCylinderSource() { super(); }

  public vtkCylinderSource(long id) { super(id); }
  public native long   VTKInit();

}
