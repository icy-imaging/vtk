// java wrapper for vtkLightKit object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLightKit extends vtkObject
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

  private native void SetKeyLightIntensity_4(double id0);
  public void SetKeyLightIntensity(double id0)
  {
    SetKeyLightIntensity_4(id0);
  }

  private native double GetKeyLightIntensity_5();
  public double GetKeyLightIntensity()
  {
    return GetKeyLightIntensity_5();
  }

  private native void SetKeyToFillRatio_6(double id0);
  public void SetKeyToFillRatio(double id0)
  {
    SetKeyToFillRatio_6(id0);
  }

  private native double GetKeyToFillRatioMinValue_7();
  public double GetKeyToFillRatioMinValue()
  {
    return GetKeyToFillRatioMinValue_7();
  }

  private native double GetKeyToFillRatioMaxValue_8();
  public double GetKeyToFillRatioMaxValue()
  {
    return GetKeyToFillRatioMaxValue_8();
  }

  private native double GetKeyToFillRatio_9();
  public double GetKeyToFillRatio()
  {
    return GetKeyToFillRatio_9();
  }

  private native void SetKeyToHeadRatio_10(double id0);
  public void SetKeyToHeadRatio(double id0)
  {
    SetKeyToHeadRatio_10(id0);
  }

  private native double GetKeyToHeadRatioMinValue_11();
  public double GetKeyToHeadRatioMinValue()
  {
    return GetKeyToHeadRatioMinValue_11();
  }

  private native double GetKeyToHeadRatioMaxValue_12();
  public double GetKeyToHeadRatioMaxValue()
  {
    return GetKeyToHeadRatioMaxValue_12();
  }

  private native double GetKeyToHeadRatio_13();
  public double GetKeyToHeadRatio()
  {
    return GetKeyToHeadRatio_13();
  }

  private native void SetKeyToBackRatio_14(double id0);
  public void SetKeyToBackRatio(double id0)
  {
    SetKeyToBackRatio_14(id0);
  }

  private native double GetKeyToBackRatioMinValue_15();
  public double GetKeyToBackRatioMinValue()
  {
    return GetKeyToBackRatioMinValue_15();
  }

  private native double GetKeyToBackRatioMaxValue_16();
  public double GetKeyToBackRatioMaxValue()
  {
    return GetKeyToBackRatioMaxValue_16();
  }

  private native double GetKeyToBackRatio_17();
  public double GetKeyToBackRatio()
  {
    return GetKeyToBackRatio_17();
  }

  private native void SetKeyLightWarmth_18(double id0);
  public void SetKeyLightWarmth(double id0)
  {
    SetKeyLightWarmth_18(id0);
  }

  private native double GetKeyLightWarmth_19();
  public double GetKeyLightWarmth()
  {
    return GetKeyLightWarmth_19();
  }

  private native void SetFillLightWarmth_20(double id0);
  public void SetFillLightWarmth(double id0)
  {
    SetFillLightWarmth_20(id0);
  }

  private native double GetFillLightWarmth_21();
  public double GetFillLightWarmth()
  {
    return GetFillLightWarmth_21();
  }

  private native void SetHeadLightWarmth_22(double id0);
  public void SetHeadLightWarmth(double id0)
  {
    SetHeadLightWarmth_22(id0);
  }

  private native double GetHeadLightWarmth_23();
  public double GetHeadLightWarmth()
  {
    return GetHeadLightWarmth_23();
  }

  private native void SetBackLightWarmth_24(double id0);
  public void SetBackLightWarmth(double id0)
  {
    SetBackLightWarmth_24(id0);
  }

  private native double GetBackLightWarmth_25();
  public double GetBackLightWarmth()
  {
    return GetBackLightWarmth_25();
  }

  private native double[] GetKeyLightColor_26();
  public double[] GetKeyLightColor()
  {
    return GetKeyLightColor_26();
  }

  private native double[] GetFillLightColor_27();
  public double[] GetFillLightColor()
  {
    return GetFillLightColor_27();
  }

  private native double[] GetHeadLightColor_28();
  public double[] GetHeadLightColor()
  {
    return GetHeadLightColor_28();
  }

  private native double[] GetBackLightColor_29();
  public double[] GetBackLightColor()
  {
    return GetBackLightColor_29();
  }

  private native void MaintainLuminanceOn_30();
  public void MaintainLuminanceOn()
  {
    MaintainLuminanceOn_30();
  }

  private native void MaintainLuminanceOff_31();
  public void MaintainLuminanceOff()
  {
    MaintainLuminanceOff_31();
  }

  private native int GetMaintainLuminance_32();
  public int GetMaintainLuminance()
  {
    return GetMaintainLuminance_32();
  }

  private native void SetMaintainLuminance_33(int id0);
  public void SetMaintainLuminance(int id0)
  {
    SetMaintainLuminance_33(id0);
  }

  private native void SetKeyLightAngle_34(double id0,double id1);
  public void SetKeyLightAngle(double id0,double id1)
  {
    SetKeyLightAngle_34(id0,id1);
  }

  private native void SetKeyLightAngle_35(double id0[]);
  public void SetKeyLightAngle(double id0[])
  {
    SetKeyLightAngle_35(id0);
  }

  private native void SetKeyLightElevation_36(double id0);
  public void SetKeyLightElevation(double id0)
  {
    SetKeyLightElevation_36(id0);
  }

  private native void SetKeyLightAzimuth_37(double id0);
  public void SetKeyLightAzimuth(double id0)
  {
    SetKeyLightAzimuth_37(id0);
  }

  private native double[] GetKeyLightAngle_38();
  public double[] GetKeyLightAngle()
  {
    return GetKeyLightAngle_38();
  }

  private native double GetKeyLightElevation_39();
  public double GetKeyLightElevation()
  {
    return GetKeyLightElevation_39();
  }

  private native double GetKeyLightAzimuth_40();
  public double GetKeyLightAzimuth()
  {
    return GetKeyLightAzimuth_40();
  }

  private native void SetFillLightAngle_41(double id0,double id1);
  public void SetFillLightAngle(double id0,double id1)
  {
    SetFillLightAngle_41(id0,id1);
  }

  private native void SetFillLightAngle_42(double id0[]);
  public void SetFillLightAngle(double id0[])
  {
    SetFillLightAngle_42(id0);
  }

  private native void SetFillLightElevation_43(double id0);
  public void SetFillLightElevation(double id0)
  {
    SetFillLightElevation_43(id0);
  }

  private native void SetFillLightAzimuth_44(double id0);
  public void SetFillLightAzimuth(double id0)
  {
    SetFillLightAzimuth_44(id0);
  }

  private native double[] GetFillLightAngle_45();
  public double[] GetFillLightAngle()
  {
    return GetFillLightAngle_45();
  }

  private native double GetFillLightElevation_46();
  public double GetFillLightElevation()
  {
    return GetFillLightElevation_46();
  }

  private native double GetFillLightAzimuth_47();
  public double GetFillLightAzimuth()
  {
    return GetFillLightAzimuth_47();
  }

  private native void SetBackLightAngle_48(double id0,double id1);
  public void SetBackLightAngle(double id0,double id1)
  {
    SetBackLightAngle_48(id0,id1);
  }

  private native void SetBackLightAngle_49(double id0[]);
  public void SetBackLightAngle(double id0[])
  {
    SetBackLightAngle_49(id0);
  }

  private native void SetBackLightElevation_50(double id0);
  public void SetBackLightElevation(double id0)
  {
    SetBackLightElevation_50(id0);
  }

  private native void SetBackLightAzimuth_51(double id0);
  public void SetBackLightAzimuth(double id0)
  {
    SetBackLightAzimuth_51(id0);
  }

  private native double[] GetBackLightAngle_52();
  public double[] GetBackLightAngle()
  {
    return GetBackLightAngle_52();
  }

  private native double GetBackLightElevation_53();
  public double GetBackLightElevation()
  {
    return GetBackLightElevation_53();
  }

  private native double GetBackLightAzimuth_54();
  public double GetBackLightAzimuth()
  {
    return GetBackLightAzimuth_54();
  }

  private native void AddLightsToRenderer_55(vtkRenderer id0);
  public void AddLightsToRenderer(vtkRenderer id0)
  {
    AddLightsToRenderer_55(id0);
  }

  private native void RemoveLightsFromRenderer_56(vtkRenderer id0);
  public void RemoveLightsFromRenderer(vtkRenderer id0)
  {
    RemoveLightsFromRenderer_56(id0);
  }

  private native void DeepCopy_57(vtkLightKit id0);
  public void DeepCopy(vtkLightKit id0)
  {
    DeepCopy_57(id0);
  }

  private native void Modified_58();
  public void Modified()
  {
    Modified_58();
  }

  private native void Update_59();
  public void Update()
  {
    Update_59();
  }

  private native byte[] GetStringFromType_60(int id0);
  public String GetStringFromType(int id0)
  {
    return new String(GetStringFromType_60(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetStringFromSubType_61(int id0);
  public String GetStringFromSubType(int id0)
  {
    return new String(GetStringFromSubType_61(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetShortStringFromSubType_62(int id0);
  public String GetShortStringFromSubType(int id0)
  {
    return new String(GetShortStringFromSubType_62(id0), StandardCharsets.UTF_8);
  }

  private native int GetSubType_63(int id0,int id1);
  public int GetSubType(int id0,int id1)
  {
    return GetSubType_63(id0,id1);
  }

  public vtkLightKit() { super(); }

  public vtkLightKit(long id) { super(id); }
  public native long   VTKInit();

}
