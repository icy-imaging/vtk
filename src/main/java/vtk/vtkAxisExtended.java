// java wrapper for vtkAxisExtended object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAxisExtended extends vtkObject
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

  private native double Simplicity_4(int id0,int id1,int id2,double id3,double id4,double id5);
  public double Simplicity(int id0,int id1,int id2,double id3,double id4,double id5)
  {
    return Simplicity_4(id0,id1,id2,id3,id4,id5);
  }

  private native double SimplicityMax_5(int id0,int id1,int id2);
  public double SimplicityMax(int id0,int id1,int id2)
  {
    return SimplicityMax_5(id0,id1,id2);
  }

  private native double Coverage_6(double id0,double id1,double id2,double id3);
  public double Coverage(double id0,double id1,double id2,double id3)
  {
    return Coverage_6(id0,id1,id2,id3);
  }

  private native double CoverageMax_7(double id0,double id1,double id2);
  public double CoverageMax(double id0,double id1,double id2)
  {
    return CoverageMax_7(id0,id1,id2);
  }

  private native double Density_8(int id0,double id1,double id2,double id3,double id4,double id5);
  public double Density(int id0,double id1,double id2,double id3,double id4,double id5)
  {
    return Density_8(id0,id1,id2,id3,id4,id5);
  }

  private native double DensityMax_9(int id0,double id1);
  public double DensityMax(int id0,double id1)
  {
    return DensityMax_9(id0,id1);
  }

  private native double FormatLegibilityScore_10(double id0,int id1);
  public double FormatLegibilityScore(double id0,int id1)
  {
    return FormatLegibilityScore_10(id0,id1);
  }

  private native int FormatStringLength_11(int id0,double id1,int id2);
  public int FormatStringLength(int id0,double id1,int id2)
  {
    return FormatStringLength_11(id0,id1,id2);
  }

  private native int GetFontSize_12();
  public int GetFontSize()
  {
    return GetFontSize_12();
  }

  private native void SetFontSize_13(int id0);
  public void SetFontSize(int id0)
  {
    SetFontSize_13(id0);
  }

  private native int GetDesiredFontSize_14();
  public int GetDesiredFontSize()
  {
    return GetDesiredFontSize_14();
  }

  private native void SetDesiredFontSize_15(int id0);
  public void SetDesiredFontSize(int id0)
  {
    SetDesiredFontSize_15(id0);
  }

  private native int GetPrecision_16();
  public int GetPrecision()
  {
    return GetPrecision_16();
  }

  private native void SetPrecision_17(int id0);
  public void SetPrecision(int id0)
  {
    SetPrecision_17(id0);
  }

  private native int GetLabelFormat_18();
  public int GetLabelFormat()
  {
    return GetLabelFormat_18();
  }

  private native void SetLabelFormat_19(int id0);
  public void SetLabelFormat(int id0)
  {
    SetLabelFormat_19(id0);
  }

  private native int GetOrientation_20();
  public int GetOrientation()
  {
    return GetOrientation_20();
  }

  private native void SetOrientation_21(int id0);
  public void SetOrientation(int id0)
  {
    SetOrientation_21(id0);
  }

  private native boolean GetIsAxisVertical_22();
  public boolean GetIsAxisVertical()
  {
    return GetIsAxisVertical_22();
  }

  private native void SetIsAxisVertical_23(boolean id0);
  public void SetIsAxisVertical(boolean id0)
  {
    SetIsAxisVertical_23(id0);
  }

  public vtkAxisExtended() { super(); }

  public vtkAxisExtended(long id) { super(id); }
  public native long   VTKInit();

}
