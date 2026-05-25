// java wrapper for vtkGlyphSource2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGlyphSource2D extends vtkPolyDataAlgorithm
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

  private native void SetScale_7(double id0);
  public void SetScale(double id0)
  {
    SetScale_7(id0);
  }

  private native double GetScaleMinValue_8();
  public double GetScaleMinValue()
  {
    return GetScaleMinValue_8();
  }

  private native double GetScaleMaxValue_9();
  public double GetScaleMaxValue()
  {
    return GetScaleMaxValue_9();
  }

  private native double GetScale_10();
  public double GetScale()
  {
    return GetScale_10();
  }

  private native void SetScale2_11(double id0);
  public void SetScale2(double id0)
  {
    SetScale2_11(id0);
  }

  private native double GetScale2MinValue_12();
  public double GetScale2MinValue()
  {
    return GetScale2MinValue_12();
  }

  private native double GetScale2MaxValue_13();
  public double GetScale2MaxValue()
  {
    return GetScale2MaxValue_13();
  }

  private native double GetScale2_14();
  public double GetScale2()
  {
    return GetScale2_14();
  }

  private native void SetColor_15(double id0,double id1,double id2);
  public void SetColor(double id0,double id1,double id2)
  {
    SetColor_15(id0,id1,id2);
  }

  private native void SetColor_16(double id0[]);
  public void SetColor(double id0[])
  {
    SetColor_16(id0);
  }

  private native double[] GetColor_17();
  public double[] GetColor()
  {
    return GetColor_17();
  }

  private native void SetFilled_18(int id0);
  public void SetFilled(int id0)
  {
    SetFilled_18(id0);
  }

  private native int GetFilled_19();
  public int GetFilled()
  {
    return GetFilled_19();
  }

  private native void FilledOn_20();
  public void FilledOn()
  {
    FilledOn_20();
  }

  private native void FilledOff_21();
  public void FilledOff()
  {
    FilledOff_21();
  }

  private native void SetDash_22(int id0);
  public void SetDash(int id0)
  {
    SetDash_22(id0);
  }

  private native int GetDash_23();
  public int GetDash()
  {
    return GetDash_23();
  }

  private native void DashOn_24();
  public void DashOn()
  {
    DashOn_24();
  }

  private native void DashOff_25();
  public void DashOff()
  {
    DashOff_25();
  }

  private native void SetCross_26(int id0);
  public void SetCross(int id0)
  {
    SetCross_26(id0);
  }

  private native int GetCross_27();
  public int GetCross()
  {
    return GetCross_27();
  }

  private native void CrossOn_28();
  public void CrossOn()
  {
    CrossOn_28();
  }

  private native void CrossOff_29();
  public void CrossOff()
  {
    CrossOff_29();
  }

  private native void SetRotationAngle_30(double id0);
  public void SetRotationAngle(double id0)
  {
    SetRotationAngle_30(id0);
  }

  private native double GetRotationAngle_31();
  public double GetRotationAngle()
  {
    return GetRotationAngle_31();
  }

  private native void SetResolution_32(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_32(id0);
  }

  private native int GetResolutionMinValue_33();
  public int GetResolutionMinValue()
  {
    return GetResolutionMinValue_33();
  }

  private native int GetResolutionMaxValue_34();
  public int GetResolutionMaxValue()
  {
    return GetResolutionMaxValue_34();
  }

  private native int GetResolution_35();
  public int GetResolution()
  {
    return GetResolution_35();
  }

  private native void SetGlyphType_36(int id0);
  public void SetGlyphType(int id0)
  {
    SetGlyphType_36(id0);
  }

  private native int GetGlyphTypeMinValue_37();
  public int GetGlyphTypeMinValue()
  {
    return GetGlyphTypeMinValue_37();
  }

  private native int GetGlyphTypeMaxValue_38();
  public int GetGlyphTypeMaxValue()
  {
    return GetGlyphTypeMaxValue_38();
  }

  private native int GetGlyphType_39();
  public int GetGlyphType()
  {
    return GetGlyphType_39();
  }

  private native void SetGlyphTypeToNone_40();
  public void SetGlyphTypeToNone()
  {
    SetGlyphTypeToNone_40();
  }

  private native void SetGlyphTypeToVertex_41();
  public void SetGlyphTypeToVertex()
  {
    SetGlyphTypeToVertex_41();
  }

  private native void SetGlyphTypeToDash_42();
  public void SetGlyphTypeToDash()
  {
    SetGlyphTypeToDash_42();
  }

  private native void SetGlyphTypeToCross_43();
  public void SetGlyphTypeToCross()
  {
    SetGlyphTypeToCross_43();
  }

  private native void SetGlyphTypeToThickCross_44();
  public void SetGlyphTypeToThickCross()
  {
    SetGlyphTypeToThickCross_44();
  }

  private native void SetGlyphTypeToTriangle_45();
  public void SetGlyphTypeToTriangle()
  {
    SetGlyphTypeToTriangle_45();
  }

  private native void SetGlyphTypeToSquare_46();
  public void SetGlyphTypeToSquare()
  {
    SetGlyphTypeToSquare_46();
  }

  private native void SetGlyphTypeToCircle_47();
  public void SetGlyphTypeToCircle()
  {
    SetGlyphTypeToCircle_47();
  }

  private native void SetGlyphTypeToDiamond_48();
  public void SetGlyphTypeToDiamond()
  {
    SetGlyphTypeToDiamond_48();
  }

  private native void SetGlyphTypeToArrow_49();
  public void SetGlyphTypeToArrow()
  {
    SetGlyphTypeToArrow_49();
  }

  private native void SetGlyphTypeToThickArrow_50();
  public void SetGlyphTypeToThickArrow()
  {
    SetGlyphTypeToThickArrow_50();
  }

  private native void SetGlyphTypeToHookedArrow_51();
  public void SetGlyphTypeToHookedArrow()
  {
    SetGlyphTypeToHookedArrow_51();
  }

  private native void SetGlyphTypeToEdgeArrow_52();
  public void SetGlyphTypeToEdgeArrow()
  {
    SetGlyphTypeToEdgeArrow_52();
  }

  private native void SetOutputPointsPrecision_53(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_53(id0);
  }

  private native int GetOutputPointsPrecision_54();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_54();
  }

  private native void SetTipLength_55(double id0);
  public void SetTipLength(double id0)
  {
    SetTipLength_55(id0);
  }

  private native double GetTipLengthMinValue_56();
  public double GetTipLengthMinValue()
  {
    return GetTipLengthMinValue_56();
  }

  private native double GetTipLengthMaxValue_57();
  public double GetTipLengthMaxValue()
  {
    return GetTipLengthMaxValue_57();
  }

  private native double GetTipLength_58();
  public double GetTipLength()
  {
    return GetTipLength_58();
  }

  private native void SetDoublePointed_59(boolean id0);
  public void SetDoublePointed(boolean id0)
  {
    SetDoublePointed_59(id0);
  }

  private native boolean GetDoublePointed_60();
  public boolean GetDoublePointed()
  {
    return GetDoublePointed_60();
  }

  private native void DoublePointedOn_61();
  public void DoublePointedOn()
  {
    DoublePointedOn_61();
  }

  private native void DoublePointedOff_62();
  public void DoublePointedOff()
  {
    DoublePointedOff_62();
  }

  private native void SetPointInwards_63(boolean id0);
  public void SetPointInwards(boolean id0)
  {
    SetPointInwards_63(id0);
  }

  private native boolean GetPointInwards_64();
  public boolean GetPointInwards()
  {
    return GetPointInwards_64();
  }

  private native void PointInwardsOn_65();
  public void PointInwardsOn()
  {
    PointInwardsOn_65();
  }

  private native void PointInwardsOff_66();
  public void PointInwardsOff()
  {
    PointInwardsOff_66();
  }

  public vtkGlyphSource2D() { super(); }

  public vtkGlyphSource2D(long id) { super(id); }
  public native long   VTKInit();

}
