// java wrapper for vtkArrowSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkArrowSource extends vtkPolyDataAlgorithm
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

  private native void SetTipLength_4(double id0);
  public void SetTipLength(double id0)
  {
    SetTipLength_4(id0);
  }

  private native double GetTipLengthMinValue_5();
  public double GetTipLengthMinValue()
  {
    return GetTipLengthMinValue_5();
  }

  private native double GetTipLengthMaxValue_6();
  public double GetTipLengthMaxValue()
  {
    return GetTipLengthMaxValue_6();
  }

  private native double GetTipLength_7();
  public double GetTipLength()
  {
    return GetTipLength_7();
  }

  private native void SetTipRadius_8(double id0);
  public void SetTipRadius(double id0)
  {
    SetTipRadius_8(id0);
  }

  private native double GetTipRadiusMinValue_9();
  public double GetTipRadiusMinValue()
  {
    return GetTipRadiusMinValue_9();
  }

  private native double GetTipRadiusMaxValue_10();
  public double GetTipRadiusMaxValue()
  {
    return GetTipRadiusMaxValue_10();
  }

  private native double GetTipRadius_11();
  public double GetTipRadius()
  {
    return GetTipRadius_11();
  }

  private native void SetTipResolution_12(int id0);
  public void SetTipResolution(int id0)
  {
    SetTipResolution_12(id0);
  }

  private native int GetTipResolutionMinValue_13();
  public int GetTipResolutionMinValue()
  {
    return GetTipResolutionMinValue_13();
  }

  private native int GetTipResolutionMaxValue_14();
  public int GetTipResolutionMaxValue()
  {
    return GetTipResolutionMaxValue_14();
  }

  private native int GetTipResolution_15();
  public int GetTipResolution()
  {
    return GetTipResolution_15();
  }

  private native void SetShaftRadius_16(double id0);
  public void SetShaftRadius(double id0)
  {
    SetShaftRadius_16(id0);
  }

  private native double GetShaftRadiusMinValue_17();
  public double GetShaftRadiusMinValue()
  {
    return GetShaftRadiusMinValue_17();
  }

  private native double GetShaftRadiusMaxValue_18();
  public double GetShaftRadiusMaxValue()
  {
    return GetShaftRadiusMaxValue_18();
  }

  private native double GetShaftRadius_19();
  public double GetShaftRadius()
  {
    return GetShaftRadius_19();
  }

  private native void SetShaftResolution_20(int id0);
  public void SetShaftResolution(int id0)
  {
    SetShaftResolution_20(id0);
  }

  private native int GetShaftResolutionMinValue_21();
  public int GetShaftResolutionMinValue()
  {
    return GetShaftResolutionMinValue_21();
  }

  private native int GetShaftResolutionMaxValue_22();
  public int GetShaftResolutionMaxValue()
  {
    return GetShaftResolutionMaxValue_22();
  }

  private native int GetShaftResolution_23();
  public int GetShaftResolution()
  {
    return GetShaftResolution_23();
  }

  private native void InvertOn_24();
  public void InvertOn()
  {
    InvertOn_24();
  }

  private native void InvertOff_25();
  public void InvertOff()
  {
    InvertOff_25();
  }

  private native void SetInvert_26(boolean id0);
  public void SetInvert(boolean id0)
  {
    SetInvert_26(id0);
  }

  private native boolean GetInvert_27();
  public boolean GetInvert()
  {
    return GetInvert_27();
  }

  private native void SetArrowOrigin_28(int id0);
  public void SetArrowOrigin(int id0)
  {
    SetArrowOrigin_28(id0);
  }

  private native int GetArrowOrigin_29();
  public int GetArrowOrigin()
  {
    return GetArrowOrigin_29();
  }

  private native void SetArrowOriginToDefault_30();
  public void SetArrowOriginToDefault()
  {
    SetArrowOriginToDefault_30();
  }

  private native void SetArrowOriginToCenter_31();
  public void SetArrowOriginToCenter()
  {
    SetArrowOriginToCenter_31();
  }

  private native byte[] GetArrowOriginAsString_32();
  public String GetArrowOriginAsString()
  {
    return new String(GetArrowOriginAsString_32(), StandardCharsets.UTF_8);
  }

  public vtkArrowSource() { super(); }

  public vtkArrowSource(long id) { super(id); }
  public native long   VTKInit();

}
