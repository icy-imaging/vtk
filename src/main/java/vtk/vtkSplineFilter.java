// java wrapper for vtkSplineFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSplineFilter extends vtkPolyDataAlgorithm
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

  private native void SetMaximumNumberOfSubdivisions_4(int id0);
  public void SetMaximumNumberOfSubdivisions(int id0)
  {
    SetMaximumNumberOfSubdivisions_4(id0);
  }

  private native int GetMaximumNumberOfSubdivisionsMinValue_5();
  public int GetMaximumNumberOfSubdivisionsMinValue()
  {
    return GetMaximumNumberOfSubdivisionsMinValue_5();
  }

  private native int GetMaximumNumberOfSubdivisionsMaxValue_6();
  public int GetMaximumNumberOfSubdivisionsMaxValue()
  {
    return GetMaximumNumberOfSubdivisionsMaxValue_6();
  }

  private native int GetMaximumNumberOfSubdivisions_7();
  public int GetMaximumNumberOfSubdivisions()
  {
    return GetMaximumNumberOfSubdivisions_7();
  }

  private native void SetSubdivide_8(int id0);
  public void SetSubdivide(int id0)
  {
    SetSubdivide_8(id0);
  }

  private native int GetSubdivideMinValue_9();
  public int GetSubdivideMinValue()
  {
    return GetSubdivideMinValue_9();
  }

  private native int GetSubdivideMaxValue_10();
  public int GetSubdivideMaxValue()
  {
    return GetSubdivideMaxValue_10();
  }

  private native int GetSubdivide_11();
  public int GetSubdivide()
  {
    return GetSubdivide_11();
  }

  private native void SetSubdivideToSpecified_12();
  public void SetSubdivideToSpecified()
  {
    SetSubdivideToSpecified_12();
  }

  private native void SetSubdivideToLength_13();
  public void SetSubdivideToLength()
  {
    SetSubdivideToLength_13();
  }

  private native byte[] GetSubdivideAsString_14();
  public String GetSubdivideAsString()
  {
    return new String(GetSubdivideAsString_14(), StandardCharsets.UTF_8);
  }

  private native void SetNumberOfSubdivisions_15(int id0);
  public void SetNumberOfSubdivisions(int id0)
  {
    SetNumberOfSubdivisions_15(id0);
  }

  private native int GetNumberOfSubdivisionsMinValue_16();
  public int GetNumberOfSubdivisionsMinValue()
  {
    return GetNumberOfSubdivisionsMinValue_16();
  }

  private native int GetNumberOfSubdivisionsMaxValue_17();
  public int GetNumberOfSubdivisionsMaxValue()
  {
    return GetNumberOfSubdivisionsMaxValue_17();
  }

  private native int GetNumberOfSubdivisions_18();
  public int GetNumberOfSubdivisions()
  {
    return GetNumberOfSubdivisions_18();
  }

  private native void SetLength_19(double id0);
  public void SetLength(double id0)
  {
    SetLength_19(id0);
  }

  private native double GetLengthMinValue_20();
  public double GetLengthMinValue()
  {
    return GetLengthMinValue_20();
  }

  private native double GetLengthMaxValue_21();
  public double GetLengthMaxValue()
  {
    return GetLengthMaxValue_21();
  }

  private native double GetLength_22();
  public double GetLength()
  {
    return GetLength_22();
  }

  private native void SetSpline_23(vtkSpline id0);
  public void SetSpline(vtkSpline id0)
  {
    SetSpline_23(id0);
  }

  private native long GetSpline_24();
  public vtkSpline GetSpline()
  {
    long temp = GetSpline_24();

    if (temp == 0) return null;
    return (vtkSpline)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native void SetOutputPointsPrecision_38(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_38(id0);
  }

  private native int GetOutputPointsPrecision_39();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_39();
  }

  public vtkSplineFilter() { super(); }

  public vtkSplineFilter(long id) { super(id); }
  public native long   VTKInit();

}
