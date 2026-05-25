// java wrapper for vtkRibbonFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRibbonFilter extends vtkPolyDataAlgorithm
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

  private native void SetWidth_4(double id0);
  public void SetWidth(double id0)
  {
    SetWidth_4(id0);
  }

  private native double GetWidthMinValue_5();
  public double GetWidthMinValue()
  {
    return GetWidthMinValue_5();
  }

  private native double GetWidthMaxValue_6();
  public double GetWidthMaxValue()
  {
    return GetWidthMaxValue_6();
  }

  private native double GetWidth_7();
  public double GetWidth()
  {
    return GetWidth_7();
  }

  private native void SetAngle_8(double id0);
  public void SetAngle(double id0)
  {
    SetAngle_8(id0);
  }

  private native double GetAngleMinValue_9();
  public double GetAngleMinValue()
  {
    return GetAngleMinValue_9();
  }

  private native double GetAngleMaxValue_10();
  public double GetAngleMaxValue()
  {
    return GetAngleMaxValue_10();
  }

  private native double GetAngle_11();
  public double GetAngle()
  {
    return GetAngle_11();
  }

  private native void SetVaryWidth_12(int id0);
  public void SetVaryWidth(int id0)
  {
    SetVaryWidth_12(id0);
  }

  private native int GetVaryWidth_13();
  public int GetVaryWidth()
  {
    return GetVaryWidth_13();
  }

  private native void VaryWidthOn_14();
  public void VaryWidthOn()
  {
    VaryWidthOn_14();
  }

  private native void VaryWidthOff_15();
  public void VaryWidthOff()
  {
    VaryWidthOff_15();
  }

  private native void SetWidthFactor_16(double id0);
  public void SetWidthFactor(double id0)
  {
    SetWidthFactor_16(id0);
  }

  private native double GetWidthFactor_17();
  public double GetWidthFactor()
  {
    return GetWidthFactor_17();
  }

  private native void SetDefaultNormal_18(double id0,double id1,double id2);
  public void SetDefaultNormal(double id0,double id1,double id2)
  {
    SetDefaultNormal_18(id0,id1,id2);
  }

  private native void SetDefaultNormal_19(double id0[]);
  public void SetDefaultNormal(double id0[])
  {
    SetDefaultNormal_19(id0);
  }

  private native double[] GetDefaultNormal_20();
  public double[] GetDefaultNormal()
  {
    return GetDefaultNormal_20();
  }

  private native void SetUseDefaultNormal_21(int id0);
  public void SetUseDefaultNormal(int id0)
  {
    SetUseDefaultNormal_21(id0);
  }

  private native int GetUseDefaultNormal_22();
  public int GetUseDefaultNormal()
  {
    return GetUseDefaultNormal_22();
  }

  private native void UseDefaultNormalOn_23();
  public void UseDefaultNormalOn()
  {
    UseDefaultNormalOn_23();
  }

  private native void UseDefaultNormalOff_24();
  public void UseDefaultNormalOff()
  {
    UseDefaultNormalOff_24();
  }

  private native void SetGenerateTCoords_25(int id0);
  public void SetGenerateTCoords(int id0)
  {
    SetGenerateTCoords_25(id0);
  }

  private native int GetGenerateTCoordsMinValue_26();
  public int GetGenerateTCoordsMinValue()
  {
    return GetGenerateTCoordsMinValue_26();
  }

  private native int GetGenerateTCoordsMaxValue_27();
  public int GetGenerateTCoordsMaxValue()
  {
    return GetGenerateTCoordsMaxValue_27();
  }

  private native int GetGenerateTCoords_28();
  public int GetGenerateTCoords()
  {
    return GetGenerateTCoords_28();
  }

  private native void SetGenerateTCoordsToOff_29();
  public void SetGenerateTCoordsToOff()
  {
    SetGenerateTCoordsToOff_29();
  }

  private native void SetGenerateTCoordsToNormalizedLength_30();
  public void SetGenerateTCoordsToNormalizedLength()
  {
    SetGenerateTCoordsToNormalizedLength_30();
  }

  private native void SetGenerateTCoordsToUseLength_31();
  public void SetGenerateTCoordsToUseLength()
  {
    SetGenerateTCoordsToUseLength_31();
  }

  private native void SetGenerateTCoordsToUseScalars_32();
  public void SetGenerateTCoordsToUseScalars()
  {
    SetGenerateTCoordsToUseScalars_32();
  }

  private native byte[] GetGenerateTCoordsAsString_33();
  public String GetGenerateTCoordsAsString()
  {
    return new String(GetGenerateTCoordsAsString_33(), StandardCharsets.UTF_8);
  }

  private native void SetTextureLength_34(double id0);
  public void SetTextureLength(double id0)
  {
    SetTextureLength_34(id0);
  }

  private native double GetTextureLengthMinValue_35();
  public double GetTextureLengthMinValue()
  {
    return GetTextureLengthMinValue_35();
  }

  private native double GetTextureLengthMaxValue_36();
  public double GetTextureLengthMaxValue()
  {
    return GetTextureLengthMaxValue_36();
  }

  private native double GetTextureLength_37();
  public double GetTextureLength()
  {
    return GetTextureLength_37();
  }

  public vtkRibbonFilter() { super(); }

  public vtkRibbonFilter(long id) { super(id); }
  public native long   VTKInit();

}
