// java wrapper for vtkParametricFunction object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParametricFunction extends vtkObject
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

  private native int GetDimension_4();
  public int GetDimension()
  {
    return GetDimension_4();
  }

  private native void Evaluate_5(double id0[],double id1[],double id2[]);
  public void Evaluate(double id0[],double id1[],double id2[])
  {
    Evaluate_5(id0,id1,id2);
  }

  private native double EvaluateScalar_6(double id0[],double id1[],double id2[]);
  public double EvaluateScalar(double id0[],double id1[],double id2[])
  {
    return EvaluateScalar_6(id0,id1,id2);
  }

  private native void SetMinimumU_7(double id0);
  public void SetMinimumU(double id0)
  {
    SetMinimumU_7(id0);
  }

  private native double GetMinimumU_8();
  public double GetMinimumU()
  {
    return GetMinimumU_8();
  }

  private native void SetMaximumU_9(double id0);
  public void SetMaximumU(double id0)
  {
    SetMaximumU_9(id0);
  }

  private native double GetMaximumU_10();
  public double GetMaximumU()
  {
    return GetMaximumU_10();
  }

  private native void SetMinimumV_11(double id0);
  public void SetMinimumV(double id0)
  {
    SetMinimumV_11(id0);
  }

  private native double GetMinimumV_12();
  public double GetMinimumV()
  {
    return GetMinimumV_12();
  }

  private native void SetMaximumV_13(double id0);
  public void SetMaximumV(double id0)
  {
    SetMaximumV_13(id0);
  }

  private native double GetMaximumV_14();
  public double GetMaximumV()
  {
    return GetMaximumV_14();
  }

  private native void SetMinimumW_15(double id0);
  public void SetMinimumW(double id0)
  {
    SetMinimumW_15(id0);
  }

  private native double GetMinimumW_16();
  public double GetMinimumW()
  {
    return GetMinimumW_16();
  }

  private native void SetMaximumW_17(double id0);
  public void SetMaximumW(double id0)
  {
    SetMaximumW_17(id0);
  }

  private native double GetMaximumW_18();
  public double GetMaximumW()
  {
    return GetMaximumW_18();
  }

  private native void SetJoinU_19(int id0);
  public void SetJoinU(int id0)
  {
    SetJoinU_19(id0);
  }

  private native int GetJoinUMinValue_20();
  public int GetJoinUMinValue()
  {
    return GetJoinUMinValue_20();
  }

  private native int GetJoinUMaxValue_21();
  public int GetJoinUMaxValue()
  {
    return GetJoinUMaxValue_21();
  }

  private native int GetJoinU_22();
  public int GetJoinU()
  {
    return GetJoinU_22();
  }

  private native void JoinUOn_23();
  public void JoinUOn()
  {
    JoinUOn_23();
  }

  private native void JoinUOff_24();
  public void JoinUOff()
  {
    JoinUOff_24();
  }

  private native void SetJoinV_25(int id0);
  public void SetJoinV(int id0)
  {
    SetJoinV_25(id0);
  }

  private native int GetJoinVMinValue_26();
  public int GetJoinVMinValue()
  {
    return GetJoinVMinValue_26();
  }

  private native int GetJoinVMaxValue_27();
  public int GetJoinVMaxValue()
  {
    return GetJoinVMaxValue_27();
  }

  private native int GetJoinV_28();
  public int GetJoinV()
  {
    return GetJoinV_28();
  }

  private native void JoinVOn_29();
  public void JoinVOn()
  {
    JoinVOn_29();
  }

  private native void JoinVOff_30();
  public void JoinVOff()
  {
    JoinVOff_30();
  }

  private native void SetJoinW_31(int id0);
  public void SetJoinW(int id0)
  {
    SetJoinW_31(id0);
  }

  private native int GetJoinWMinValue_32();
  public int GetJoinWMinValue()
  {
    return GetJoinWMinValue_32();
  }

  private native int GetJoinWMaxValue_33();
  public int GetJoinWMaxValue()
  {
    return GetJoinWMaxValue_33();
  }

  private native int GetJoinW_34();
  public int GetJoinW()
  {
    return GetJoinW_34();
  }

  private native void JoinWOn_35();
  public void JoinWOn()
  {
    JoinWOn_35();
  }

  private native void JoinWOff_36();
  public void JoinWOff()
  {
    JoinWOff_36();
  }

  private native void SetTwistU_37(int id0);
  public void SetTwistU(int id0)
  {
    SetTwistU_37(id0);
  }

  private native int GetTwistUMinValue_38();
  public int GetTwistUMinValue()
  {
    return GetTwistUMinValue_38();
  }

  private native int GetTwistUMaxValue_39();
  public int GetTwistUMaxValue()
  {
    return GetTwistUMaxValue_39();
  }

  private native int GetTwistU_40();
  public int GetTwistU()
  {
    return GetTwistU_40();
  }

  private native void TwistUOn_41();
  public void TwistUOn()
  {
    TwistUOn_41();
  }

  private native void TwistUOff_42();
  public void TwistUOff()
  {
    TwistUOff_42();
  }

  private native void SetTwistV_43(int id0);
  public void SetTwistV(int id0)
  {
    SetTwistV_43(id0);
  }

  private native int GetTwistVMinValue_44();
  public int GetTwistVMinValue()
  {
    return GetTwistVMinValue_44();
  }

  private native int GetTwistVMaxValue_45();
  public int GetTwistVMaxValue()
  {
    return GetTwistVMaxValue_45();
  }

  private native int GetTwistV_46();
  public int GetTwistV()
  {
    return GetTwistV_46();
  }

  private native void TwistVOn_47();
  public void TwistVOn()
  {
    TwistVOn_47();
  }

  private native void TwistVOff_48();
  public void TwistVOff()
  {
    TwistVOff_48();
  }

  private native void SetTwistW_49(int id0);
  public void SetTwistW(int id0)
  {
    SetTwistW_49(id0);
  }

  private native int GetTwistWMinValue_50();
  public int GetTwistWMinValue()
  {
    return GetTwistWMinValue_50();
  }

  private native int GetTwistWMaxValue_51();
  public int GetTwistWMaxValue()
  {
    return GetTwistWMaxValue_51();
  }

  private native int GetTwistW_52();
  public int GetTwistW()
  {
    return GetTwistW_52();
  }

  private native void TwistWOn_53();
  public void TwistWOn()
  {
    TwistWOn_53();
  }

  private native void TwistWOff_54();
  public void TwistWOff()
  {
    TwistWOff_54();
  }

  private native void SetClockwiseOrdering_55(int id0);
  public void SetClockwiseOrdering(int id0)
  {
    SetClockwiseOrdering_55(id0);
  }

  private native int GetClockwiseOrderingMinValue_56();
  public int GetClockwiseOrderingMinValue()
  {
    return GetClockwiseOrderingMinValue_56();
  }

  private native int GetClockwiseOrderingMaxValue_57();
  public int GetClockwiseOrderingMaxValue()
  {
    return GetClockwiseOrderingMaxValue_57();
  }

  private native int GetClockwiseOrdering_58();
  public int GetClockwiseOrdering()
  {
    return GetClockwiseOrdering_58();
  }

  private native void ClockwiseOrderingOn_59();
  public void ClockwiseOrderingOn()
  {
    ClockwiseOrderingOn_59();
  }

  private native void ClockwiseOrderingOff_60();
  public void ClockwiseOrderingOff()
  {
    ClockwiseOrderingOff_60();
  }

  private native void SetDerivativesAvailable_61(int id0);
  public void SetDerivativesAvailable(int id0)
  {
    SetDerivativesAvailable_61(id0);
  }

  private native int GetDerivativesAvailableMinValue_62();
  public int GetDerivativesAvailableMinValue()
  {
    return GetDerivativesAvailableMinValue_62();
  }

  private native int GetDerivativesAvailableMaxValue_63();
  public int GetDerivativesAvailableMaxValue()
  {
    return GetDerivativesAvailableMaxValue_63();
  }

  private native int GetDerivativesAvailable_64();
  public int GetDerivativesAvailable()
  {
    return GetDerivativesAvailable_64();
  }

  private native void DerivativesAvailableOn_65();
  public void DerivativesAvailableOn()
  {
    DerivativesAvailableOn_65();
  }

  private native void DerivativesAvailableOff_66();
  public void DerivativesAvailableOff()
  {
    DerivativesAvailableOff_66();
  }

  public vtkParametricFunction() { super(); }

  public vtkParametricFunction(long id) { super(id); }

}
