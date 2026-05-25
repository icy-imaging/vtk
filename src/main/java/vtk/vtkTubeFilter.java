// java wrapper for vtkTubeFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTubeFilter extends vtkPolyDataAlgorithm
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

  private native void SetVaryRadius_8(int id0);
  public void SetVaryRadius(int id0)
  {
    SetVaryRadius_8(id0);
  }

  private native int GetVaryRadiusMinValue_9();
  public int GetVaryRadiusMinValue()
  {
    return GetVaryRadiusMinValue_9();
  }

  private native int GetVaryRadiusMaxValue_10();
  public int GetVaryRadiusMaxValue()
  {
    return GetVaryRadiusMaxValue_10();
  }

  private native int GetVaryRadius_11();
  public int GetVaryRadius()
  {
    return GetVaryRadius_11();
  }

  private native void SetVaryRadiusToVaryRadiusOff_12();
  public void SetVaryRadiusToVaryRadiusOff()
  {
    SetVaryRadiusToVaryRadiusOff_12();
  }

  private native void SetVaryRadiusToVaryRadiusByScalar_13();
  public void SetVaryRadiusToVaryRadiusByScalar()
  {
    SetVaryRadiusToVaryRadiusByScalar_13();
  }

  private native void SetVaryRadiusToVaryRadiusByVector_14();
  public void SetVaryRadiusToVaryRadiusByVector()
  {
    SetVaryRadiusToVaryRadiusByVector_14();
  }

  private native void SetVaryRadiusToVaryRadiusByVectorNorm_15();
  public void SetVaryRadiusToVaryRadiusByVectorNorm()
  {
    SetVaryRadiusToVaryRadiusByVectorNorm_15();
  }

  private native void SetVaryRadiusToVaryRadiusByAbsoluteScalar_16();
  public void SetVaryRadiusToVaryRadiusByAbsoluteScalar()
  {
    SetVaryRadiusToVaryRadiusByAbsoluteScalar_16();
  }

  private native byte[] GetVaryRadiusAsString_17();
  public String GetVaryRadiusAsString()
  {
    return new String(GetVaryRadiusAsString_17(), StandardCharsets.UTF_8);
  }

  private native void SetNumberOfSides_18(int id0);
  public void SetNumberOfSides(int id0)
  {
    SetNumberOfSides_18(id0);
  }

  private native int GetNumberOfSidesMinValue_19();
  public int GetNumberOfSidesMinValue()
  {
    return GetNumberOfSidesMinValue_19();
  }

  private native int GetNumberOfSidesMaxValue_20();
  public int GetNumberOfSidesMaxValue()
  {
    return GetNumberOfSidesMaxValue_20();
  }

  private native int GetNumberOfSides_21();
  public int GetNumberOfSides()
  {
    return GetNumberOfSides_21();
  }

  private native void SetRadiusFactor_22(double id0);
  public void SetRadiusFactor(double id0)
  {
    SetRadiusFactor_22(id0);
  }

  private native double GetRadiusFactor_23();
  public double GetRadiusFactor()
  {
    return GetRadiusFactor_23();
  }

  private native void SetDefaultNormal_24(double id0,double id1,double id2);
  public void SetDefaultNormal(double id0,double id1,double id2)
  {
    SetDefaultNormal_24(id0,id1,id2);
  }

  private native void SetDefaultNormal_25(double id0[]);
  public void SetDefaultNormal(double id0[])
  {
    SetDefaultNormal_25(id0);
  }

  private native double[] GetDefaultNormal_26();
  public double[] GetDefaultNormal()
  {
    return GetDefaultNormal_26();
  }

  private native void SetUseDefaultNormal_27(int id0);
  public void SetUseDefaultNormal(int id0)
  {
    SetUseDefaultNormal_27(id0);
  }

  private native int GetUseDefaultNormal_28();
  public int GetUseDefaultNormal()
  {
    return GetUseDefaultNormal_28();
  }

  private native void UseDefaultNormalOn_29();
  public void UseDefaultNormalOn()
  {
    UseDefaultNormalOn_29();
  }

  private native void UseDefaultNormalOff_30();
  public void UseDefaultNormalOff()
  {
    UseDefaultNormalOff_30();
  }

  private native void SetSidesShareVertices_31(int id0);
  public void SetSidesShareVertices(int id0)
  {
    SetSidesShareVertices_31(id0);
  }

  private native int GetSidesShareVertices_32();
  public int GetSidesShareVertices()
  {
    return GetSidesShareVertices_32();
  }

  private native void SidesShareVerticesOn_33();
  public void SidesShareVerticesOn()
  {
    SidesShareVerticesOn_33();
  }

  private native void SidesShareVerticesOff_34();
  public void SidesShareVerticesOff()
  {
    SidesShareVerticesOff_34();
  }

  private native void SetCapping_35(int id0);
  public void SetCapping(int id0)
  {
    SetCapping_35(id0);
  }

  private native int GetCapping_36();
  public int GetCapping()
  {
    return GetCapping_36();
  }

  private native void CappingOn_37();
  public void CappingOn()
  {
    CappingOn_37();
  }

  private native void CappingOff_38();
  public void CappingOff()
  {
    CappingOff_38();
  }

  private native void SetOnRatio_39(int id0);
  public void SetOnRatio(int id0)
  {
    SetOnRatio_39(id0);
  }

  private native int GetOnRatioMinValue_40();
  public int GetOnRatioMinValue()
  {
    return GetOnRatioMinValue_40();
  }

  private native int GetOnRatioMaxValue_41();
  public int GetOnRatioMaxValue()
  {
    return GetOnRatioMaxValue_41();
  }

  private native int GetOnRatio_42();
  public int GetOnRatio()
  {
    return GetOnRatio_42();
  }

  private native void SetOffset_43(int id0);
  public void SetOffset(int id0)
  {
    SetOffset_43(id0);
  }

  private native int GetOffsetMinValue_44();
  public int GetOffsetMinValue()
  {
    return GetOffsetMinValue_44();
  }

  private native int GetOffsetMaxValue_45();
  public int GetOffsetMaxValue()
  {
    return GetOffsetMaxValue_45();
  }

  private native int GetOffset_46();
  public int GetOffset()
  {
    return GetOffset_46();
  }

  private native void SetGenerateTCoords_47(int id0);
  public void SetGenerateTCoords(int id0)
  {
    SetGenerateTCoords_47(id0);
  }

  private native int GetGenerateTCoordsMinValue_48();
  public int GetGenerateTCoordsMinValue()
  {
    return GetGenerateTCoordsMinValue_48();
  }

  private native int GetGenerateTCoordsMaxValue_49();
  public int GetGenerateTCoordsMaxValue()
  {
    return GetGenerateTCoordsMaxValue_49();
  }

  private native int GetGenerateTCoords_50();
  public int GetGenerateTCoords()
  {
    return GetGenerateTCoords_50();
  }

  private native void SetGenerateTCoordsToOff_51();
  public void SetGenerateTCoordsToOff()
  {
    SetGenerateTCoordsToOff_51();
  }

  private native void SetGenerateTCoordsToNormalizedLength_52();
  public void SetGenerateTCoordsToNormalizedLength()
  {
    SetGenerateTCoordsToNormalizedLength_52();
  }

  private native void SetGenerateTCoordsToUseLength_53();
  public void SetGenerateTCoordsToUseLength()
  {
    SetGenerateTCoordsToUseLength_53();
  }

  private native void SetGenerateTCoordsToUseScalars_54();
  public void SetGenerateTCoordsToUseScalars()
  {
    SetGenerateTCoordsToUseScalars_54();
  }

  private native byte[] GetGenerateTCoordsAsString_55();
  public String GetGenerateTCoordsAsString()
  {
    return new String(GetGenerateTCoordsAsString_55(), StandardCharsets.UTF_8);
  }

  private native void SetTextureLength_56(double id0);
  public void SetTextureLength(double id0)
  {
    SetTextureLength_56(id0);
  }

  private native double GetTextureLengthMinValue_57();
  public double GetTextureLengthMinValue()
  {
    return GetTextureLengthMinValue_57();
  }

  private native double GetTextureLengthMaxValue_58();
  public double GetTextureLengthMaxValue()
  {
    return GetTextureLengthMaxValue_58();
  }

  private native double GetTextureLength_59();
  public double GetTextureLength()
  {
    return GetTextureLength_59();
  }

  private native void SetOutputPointsPrecision_60(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_60(id0);
  }

  private native int GetOutputPointsPrecision_61();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_61();
  }

  public vtkTubeFilter() { super(); }

  public vtkTubeFilter(long id) { super(id); }
  public native long   VTKInit();

}
