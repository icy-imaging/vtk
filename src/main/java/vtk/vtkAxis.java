// java wrapper for vtkAxis object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAxis extends vtkContextItem
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

  private native void SetPosition_4(int id0);
  public void SetPosition(int id0)
  {
    SetPosition_4(id0);
  }

  private native int GetPosition_5();
  public int GetPosition()
  {
    return GetPosition_5();
  }

  private native void SetPoint1_6(float id0,float id1);
  public void SetPoint1(float id0,float id1)
  {
    SetPoint1_6(id0,id1);
  }

  private native float[] GetPoint1_7();
  public float[] GetPoint1()
  {
    return GetPoint1_7();
  }

  private native void SetPoint2_8(float id0,float id1);
  public void SetPoint2(float id0,float id1)
  {
    SetPoint2_8(id0,id1);
  }

  private native float[] GetPoint2_9();
  public float[] GetPoint2()
  {
    return GetPoint2_9();
  }

  private native void SetNumberOfTicks_10(int id0);
  public void SetNumberOfTicks(int id0)
  {
    SetNumberOfTicks_10(id0);
  }

  private native int GetNumberOfTicks_11();
  public int GetNumberOfTicks()
  {
    return GetNumberOfTicks_11();
  }

  private native void SetTickLength_12(float id0);
  public void SetTickLength(float id0)
  {
    SetTickLength_12(id0);
  }

  private native float GetTickLength_13();
  public float GetTickLength()
  {
    return GetTickLength_13();
  }

  private native long GetLabelProperties_14();
  public vtkTextProperty GetLabelProperties()
  {
    long temp = GetLabelProperties_14();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMinimum_15(double id0);
  public void SetMinimum(double id0)
  {
    SetMinimum_15(id0);
  }

  private native double GetMinimum_16();
  public double GetMinimum()
  {
    return GetMinimum_16();
  }

  private native void SetMaximum_17(double id0);
  public void SetMaximum(double id0)
  {
    SetMaximum_17(id0);
  }

  private native double GetMaximum_18();
  public double GetMaximum()
  {
    return GetMaximum_18();
  }

  private native void SetUnscaledMinimum_19(double id0);
  public void SetUnscaledMinimum(double id0)
  {
    SetUnscaledMinimum_19(id0);
  }

  private native double GetUnscaledMinimum_20();
  public double GetUnscaledMinimum()
  {
    return GetUnscaledMinimum_20();
  }

  private native void SetUnscaledMaximum_21(double id0);
  public void SetUnscaledMaximum(double id0)
  {
    SetUnscaledMaximum_21(id0);
  }

  private native double GetUnscaledMaximum_22();
  public double GetUnscaledMaximum()
  {
    return GetUnscaledMaximum_22();
  }

  private native void SetRange_23(double id0,double id1);
  public void SetRange(double id0,double id1)
  {
    SetRange_23(id0,id1);
  }

  private native void SetRange_24(double id0[]);
  public void SetRange(double id0[])
  {
    SetRange_24(id0);
  }

  private native void SetUnscaledRange_25(double id0,double id1);
  public void SetUnscaledRange(double id0,double id1)
  {
    SetUnscaledRange_25(id0,id1);
  }

  private native void SetUnscaledRange_26(double id0[]);
  public void SetUnscaledRange(double id0[])
  {
    SetUnscaledRange_26(id0);
  }

  private native void SetMinimumLimit_27(double id0);
  public void SetMinimumLimit(double id0)
  {
    SetMinimumLimit_27(id0);
  }

  private native double GetMinimumLimit_28();
  public double GetMinimumLimit()
  {
    return GetMinimumLimit_28();
  }

  private native void SetMaximumLimit_29(double id0);
  public void SetMaximumLimit(double id0)
  {
    SetMaximumLimit_29(id0);
  }

  private native double GetMaximumLimit_30();
  public double GetMaximumLimit()
  {
    return GetMaximumLimit_30();
  }

  private native void SetUnscaledMinimumLimit_31(double id0);
  public void SetUnscaledMinimumLimit(double id0)
  {
    SetUnscaledMinimumLimit_31(id0);
  }

  private native double GetUnscaledMinimumLimit_32();
  public double GetUnscaledMinimumLimit()
  {
    return GetUnscaledMinimumLimit_32();
  }

  private native void SetUnscaledMaximumLimit_33(double id0);
  public void SetUnscaledMaximumLimit(double id0)
  {
    SetUnscaledMaximumLimit_33(id0);
  }

  private native double GetUnscaledMaximumLimit_34();
  public double GetUnscaledMaximumLimit()
  {
    return GetUnscaledMaximumLimit_34();
  }

  private native int[] GetMargins_35();
  public int[] GetMargins()
  {
    return GetMargins_35();
  }

  private native void SetMargins_36(int id0,int id1);
  public void SetMargins(int id0,int id1)
  {
    SetMargins_36(id0,id1);
  }

  private native void SetMargins_37(int id0[]);
  public void SetMargins(int id0[])
  {
    SetMargins_37(id0);
  }

  private native void SetTitle_38(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_38(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_39();
  public String GetTitle()
  {
    return new String(GetTitle_39(), StandardCharsets.UTF_8);
  }

  private native long GetTitleProperties_40();
  public vtkTextProperty GetTitleProperties()
  {
    long temp = GetTitleProperties_40();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetLogScaleActive_41();
  public boolean GetLogScaleActive()
  {
    return GetLogScaleActive_41();
  }

  private native boolean GetLogScale_42();
  public boolean GetLogScale()
  {
    return GetLogScale_42();
  }

  private native void SetLogScale_43(boolean id0);
  public void SetLogScale(boolean id0)
  {
    SetLogScale_43(id0);
  }

  private native void LogScaleOn_44();
  public void LogScaleOn()
  {
    LogScaleOn_44();
  }

  private native void LogScaleOff_45();
  public void LogScaleOff()
  {
    LogScaleOff_45();
  }

  private native void SetGridVisible_46(boolean id0);
  public void SetGridVisible(boolean id0)
  {
    SetGridVisible_46(id0);
  }

  private native boolean GetGridVisible_47();
  public boolean GetGridVisible()
  {
    return GetGridVisible_47();
  }

  private native void SetLabelsVisible_48(boolean id0);
  public void SetLabelsVisible(boolean id0)
  {
    SetLabelsVisible_48(id0);
  }

  private native boolean GetLabelsVisible_49();
  public boolean GetLabelsVisible()
  {
    return GetLabelsVisible_49();
  }

  private native void SetRangeLabelsVisible_50(boolean id0);
  public void SetRangeLabelsVisible(boolean id0)
  {
    SetRangeLabelsVisible_50(id0);
  }

  private native boolean GetRangeLabelsVisible_51();
  public boolean GetRangeLabelsVisible()
  {
    return GetRangeLabelsVisible_51();
  }

  private native void SetLabelOffset_52(float id0);
  public void SetLabelOffset(float id0)
  {
    SetLabelOffset_52(id0);
  }

  private native float GetLabelOffset_53();
  public float GetLabelOffset()
  {
    return GetLabelOffset_53();
  }

  private native void SetTicksVisible_54(boolean id0);
  public void SetTicksVisible(boolean id0)
  {
    SetTicksVisible_54(id0);
  }

  private native boolean GetTicksVisible_55();
  public boolean GetTicksVisible()
  {
    return GetTicksVisible_55();
  }

  private native void SetAxisVisible_56(boolean id0);
  public void SetAxisVisible(boolean id0)
  {
    SetAxisVisible_56(id0);
  }

  private native boolean GetAxisVisible_57();
  public boolean GetAxisVisible()
  {
    return GetAxisVisible_57();
  }

  private native void SetTitleVisible_58(boolean id0);
  public void SetTitleVisible(boolean id0)
  {
    SetTitleVisible_58(id0);
  }

  private native boolean GetTitleVisible_59();
  public boolean GetTitleVisible()
  {
    return GetTitleVisible_59();
  }

  private native void SetPrecision_60(int id0);
  public void SetPrecision(int id0)
  {
    SetPrecision_60(id0);
  }

  private native int GetPrecision_61();
  public int GetPrecision()
  {
    return GetPrecision_61();
  }

  private native void SetLabelFormat_62(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_62(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_63();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_63(), StandardCharsets.UTF_8);
  }

  private native void SetRangeLabelFormat_64(byte[] id0, int len0);
  public void SetRangeLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetRangeLabelFormat_64(bytes0, bytes0.length);
  }

  private native byte[] GetRangeLabelFormat_65();
  public String GetRangeLabelFormat()
  {
    return new String(GetRangeLabelFormat_65(), StandardCharsets.UTF_8);
  }

  private native void SetNotation_66(int id0);
  public void SetNotation(int id0)
  {
    SetNotation_66(id0);
  }

  private native int GetNotation_67();
  public int GetNotation()
  {
    return GetNotation_67();
  }

  private native void SetBehavior_68(int id0);
  public void SetBehavior(int id0)
  {
    SetBehavior_68(id0);
  }

  private native int GetBehavior_69();
  public int GetBehavior()
  {
    return GetBehavior_69();
  }

  private native void SetPen_70(vtkPen id0);
  public void SetPen(vtkPen id0)
  {
    SetPen_70(id0);
  }

  private native long GetPen_71();
  public vtkPen GetPen()
  {
    long temp = GetPen_71();

    if (temp == 0) return null;
    return (vtkPen)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGridPen_72(vtkPen id0);
  public void SetGridPen(vtkPen id0)
  {
    SetGridPen_72(id0);
  }

  private native long GetGridPen_73();
  public vtkPen GetGridPen()
  {
    long temp = GetGridPen_73();

    if (temp == 0) return null;
    return (vtkPen)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTickLabelAlgorithm_74(int id0);
  public void SetTickLabelAlgorithm(int id0)
  {
    SetTickLabelAlgorithm_74(id0);
  }

  private native int GetTickLabelAlgorithm_75();
  public int GetTickLabelAlgorithm()
  {
    return GetTickLabelAlgorithm_75();
  }

  private native void SetScalingFactor_76(double id0);
  public void SetScalingFactor(double id0)
  {
    SetScalingFactor_76(id0);
  }

  private native double GetScalingFactor_77();
  public double GetScalingFactor()
  {
    return GetScalingFactor_77();
  }

  private native void SetShift_78(double id0);
  public void SetShift(double id0)
  {
    SetShift_78(id0);
  }

  private native double GetShift_79();
  public double GetShift()
  {
    return GetShift_79();
  }

  private native void Update_80();
  public void Update()
  {
    Update_80();
  }

  private native boolean Paint_81(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_81(id0);
  }

  private native void AutoScale_82();
  public void AutoScale()
  {
    AutoScale_82();
  }

  private native void RecalculateTickSpacing_83();
  public void RecalculateTickSpacing()
  {
    RecalculateTickSpacing_83();
  }

  private native long GetTickPositions_84();
  public vtkDoubleArray GetTickPositions()
  {
    long temp = GetTickPositions_84();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTickScenePositions_85();
  public vtkFloatArray GetTickScenePositions()
  {
    long temp = GetTickScenePositions_85();

    if (temp == 0) return null;
    return (vtkFloatArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTickLabels_86();
  public vtkStringArray GetTickLabels()
  {
    long temp = GetTickLabels_86();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean SetCustomTickPositions_87(vtkDoubleArray id0,vtkStringArray id1);
  public boolean SetCustomTickPositions(vtkDoubleArray id0,vtkStringArray id1)
  {
    return SetCustomTickPositions_87(id0,id1);
  }

  private native double NiceNumber_88(double id0,boolean id1);
  public double NiceNumber(double id0,boolean id1)
  {
    return NiceNumber_88(id0,id1);
  }

  private native byte[] GenerateSimpleLabel_89(double id0);
  public String GenerateSimpleLabel(double id0)
  {
    return new String(GenerateSimpleLabel_89(id0), StandardCharsets.UTF_8);
  }

  public vtkAxis() { super(); }

  public vtkAxis(long id) { super(id); }
  public native long   VTKInit();

}
