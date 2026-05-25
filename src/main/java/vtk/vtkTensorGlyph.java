// java wrapper for vtkTensorGlyph object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTensorGlyph extends vtkPolyDataAlgorithm
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

  private native void SetSourceData_4(vtkPolyData id0);
  public void SetSourceData(vtkPolyData id0)
  {
    SetSourceData_4(id0);
  }

  private native long GetSource_5();
  public vtkPolyData GetSource()
  {
    long temp = GetSource_5();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSourceConnection_6(int id0,vtkAlgorithmOutput id1);
  public void SetSourceConnection(int id0,vtkAlgorithmOutput id1)
  {
    SetSourceConnection_6(id0,id1);
  }

  private native void SetSourceConnection_7(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_7(id0);
  }

  private native void SetScaling_8(int id0);
  public void SetScaling(int id0)
  {
    SetScaling_8(id0);
  }

  private native int GetScaling_9();
  public int GetScaling()
  {
    return GetScaling_9();
  }

  private native void ScalingOn_10();
  public void ScalingOn()
  {
    ScalingOn_10();
  }

  private native void ScalingOff_11();
  public void ScalingOff()
  {
    ScalingOff_11();
  }

  private native void SetScaleFactor_12(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_12(id0);
  }

  private native double GetScaleFactor_13();
  public double GetScaleFactor()
  {
    return GetScaleFactor_13();
  }

  private native void SetThreeGlyphs_14(int id0);
  public void SetThreeGlyphs(int id0)
  {
    SetThreeGlyphs_14(id0);
  }

  private native int GetThreeGlyphs_15();
  public int GetThreeGlyphs()
  {
    return GetThreeGlyphs_15();
  }

  private native void ThreeGlyphsOn_16();
  public void ThreeGlyphsOn()
  {
    ThreeGlyphsOn_16();
  }

  private native void ThreeGlyphsOff_17();
  public void ThreeGlyphsOff()
  {
    ThreeGlyphsOff_17();
  }

  private native void SetSymmetric_18(int id0);
  public void SetSymmetric(int id0)
  {
    SetSymmetric_18(id0);
  }

  private native int GetSymmetric_19();
  public int GetSymmetric()
  {
    return GetSymmetric_19();
  }

  private native void SymmetricOn_20();
  public void SymmetricOn()
  {
    SymmetricOn_20();
  }

  private native void SymmetricOff_21();
  public void SymmetricOff()
  {
    SymmetricOff_21();
  }

  private native void SetLength_22(double id0);
  public void SetLength(double id0)
  {
    SetLength_22(id0);
  }

  private native double GetLength_23();
  public double GetLength()
  {
    return GetLength_23();
  }

  private native void SetExtractEigenvalues_24(int id0);
  public void SetExtractEigenvalues(int id0)
  {
    SetExtractEigenvalues_24(id0);
  }

  private native void ExtractEigenvaluesOn_25();
  public void ExtractEigenvaluesOn()
  {
    ExtractEigenvaluesOn_25();
  }

  private native void ExtractEigenvaluesOff_26();
  public void ExtractEigenvaluesOff()
  {
    ExtractEigenvaluesOff_26();
  }

  private native int GetExtractEigenvalues_27();
  public int GetExtractEigenvalues()
  {
    return GetExtractEigenvalues_27();
  }

  private native void SetColorGlyphs_28(int id0);
  public void SetColorGlyphs(int id0)
  {
    SetColorGlyphs_28(id0);
  }

  private native int GetColorGlyphs_29();
  public int GetColorGlyphs()
  {
    return GetColorGlyphs_29();
  }

  private native void ColorGlyphsOn_30();
  public void ColorGlyphsOn()
  {
    ColorGlyphsOn_30();
  }

  private native void ColorGlyphsOff_31();
  public void ColorGlyphsOff()
  {
    ColorGlyphsOff_31();
  }

  private native void SetColorMode_32(int id0);
  public void SetColorMode(int id0)
  {
    SetColorMode_32(id0);
  }

  private native int GetColorModeMinValue_33();
  public int GetColorModeMinValue()
  {
    return GetColorModeMinValue_33();
  }

  private native int GetColorModeMaxValue_34();
  public int GetColorModeMaxValue()
  {
    return GetColorModeMaxValue_34();
  }

  private native int GetColorMode_35();
  public int GetColorMode()
  {
    return GetColorMode_35();
  }

  private native void SetColorModeToScalars_36();
  public void SetColorModeToScalars()
  {
    SetColorModeToScalars_36();
  }

  private native void SetColorModeToEigenvalues_37();
  public void SetColorModeToEigenvalues()
  {
    SetColorModeToEigenvalues_37();
  }

  private native void SetClampScaling_38(int id0);
  public void SetClampScaling(int id0)
  {
    SetClampScaling_38(id0);
  }

  private native int GetClampScaling_39();
  public int GetClampScaling()
  {
    return GetClampScaling_39();
  }

  private native void ClampScalingOn_40();
  public void ClampScalingOn()
  {
    ClampScalingOn_40();
  }

  private native void ClampScalingOff_41();
  public void ClampScalingOff()
  {
    ClampScalingOff_41();
  }

  private native void SetMaxScaleFactor_42(double id0);
  public void SetMaxScaleFactor(double id0)
  {
    SetMaxScaleFactor_42(id0);
  }

  private native double GetMaxScaleFactor_43();
  public double GetMaxScaleFactor()
  {
    return GetMaxScaleFactor_43();
  }

  public vtkTensorGlyph() { super(); }

  public vtkTensorGlyph(long id) { super(id); }
  public native long   VTKInit();

}
