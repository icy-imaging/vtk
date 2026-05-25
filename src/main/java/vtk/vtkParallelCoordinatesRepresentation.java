// java wrapper for vtkParallelCoordinatesRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParallelCoordinatesRepresentation extends vtkRenderedRepresentation
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

  private native void ApplyViewTheme_4(vtkViewTheme id0);
  public void ApplyViewTheme(vtkViewTheme id0)
  {
    ApplyViewTheme_4(id0);
  }

  private native byte[] GetHoverString_5(vtkView id0,int id1,int id2);
  public String GetHoverString(vtkView id0,int id1,int id2)
  {
    return new String(GetHoverString_5(id0,id1,id2), StandardCharsets.UTF_8);
  }

  private native void SetAxisTitles_6(vtkStringArray id0);
  public void SetAxisTitles(vtkStringArray id0)
  {
    SetAxisTitles_6(id0);
  }

  private native void SetAxisTitles_7(vtkAlgorithmOutput id0);
  public void SetAxisTitles(vtkAlgorithmOutput id0)
  {
    SetAxisTitles_7(id0);
  }

  private native void SetPlotTitle_8(byte[] id0, int len0);
  public void SetPlotTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPlotTitle_8(bytes0, bytes0.length);
  }

  private native int GetNumberOfAxes_9();
  public int GetNumberOfAxes()
  {
    return GetNumberOfAxes_9();
  }

  private native int GetNumberOfSamples_10();
  public int GetNumberOfSamples()
  {
    return GetNumberOfSamples_10();
  }

  private native void SetNumberOfAxisLabels_11(int id0);
  public void SetNumberOfAxisLabels(int id0)
  {
    SetNumberOfAxisLabels_11(id0);
  }

  private native int GetNumberOfAxisLabels_12();
  public int GetNumberOfAxisLabels()
  {
    return GetNumberOfAxisLabels_12();
  }

  private native int SwapAxisPositions_13(int id0,int id1);
  public int SwapAxisPositions(int id0,int id1)
  {
    return SwapAxisPositions_13(id0,id1);
  }

  private native int SetXCoordinateOfPosition_14(int id0,double id1);
  public int SetXCoordinateOfPosition(int id0,double id1)
  {
    return SetXCoordinateOfPosition_14(id0,id1);
  }

  private native double GetXCoordinateOfPosition_15(int id0);
  public double GetXCoordinateOfPosition(int id0)
  {
    return GetXCoordinateOfPosition_15(id0);
  }

  private native int GetPositionNearXCoordinate_16(double id0);
  public int GetPositionNearXCoordinate(double id0)
  {
    return GetPositionNearXCoordinate_16(id0);
  }

  private native void SetUseCurves_17(int id0);
  public void SetUseCurves(int id0)
  {
    SetUseCurves_17(id0);
  }

  private native int GetUseCurves_18();
  public int GetUseCurves()
  {
    return GetUseCurves_18();
  }

  private native void UseCurvesOn_19();
  public void UseCurvesOn()
  {
    UseCurvesOn_19();
  }

  private native void UseCurvesOff_20();
  public void UseCurvesOff()
  {
    UseCurvesOff_20();
  }

  private native void SetCurveResolution_21(int id0);
  public void SetCurveResolution(int id0)
  {
    SetCurveResolution_21(id0);
  }

  private native int GetCurveResolution_22();
  public int GetCurveResolution()
  {
    return GetCurveResolution_22();
  }

  private native double GetLineOpacity_23();
  public double GetLineOpacity()
  {
    return GetLineOpacity_23();
  }

  private native double GetFontSize_24();
  public double GetFontSize()
  {
    return GetFontSize_24();
  }

  private native double[] GetLineColor_25();
  public double[] GetLineColor()
  {
    return GetLineColor_25();
  }

  private native double[] GetAxisColor_26();
  public double[] GetAxisColor()
  {
    return GetAxisColor_26();
  }

  private native double[] GetAxisLabelColor_27();
  public double[] GetAxisLabelColor()
  {
    return GetAxisLabelColor_27();
  }

  private native void SetLineOpacity_28(double id0);
  public void SetLineOpacity(double id0)
  {
    SetLineOpacity_28(id0);
  }

  private native void SetFontSize_29(double id0);
  public void SetFontSize(double id0)
  {
    SetFontSize_29(id0);
  }

  private native void SetLineColor_30(double id0,double id1,double id2);
  public void SetLineColor(double id0,double id1,double id2)
  {
    SetLineColor_30(id0,id1,id2);
  }

  private native void SetLineColor_31(double id0[]);
  public void SetLineColor(double id0[])
  {
    SetLineColor_31(id0);
  }

  private native void SetAxisColor_32(double id0,double id1,double id2);
  public void SetAxisColor(double id0,double id1,double id2)
  {
    SetAxisColor_32(id0,id1,id2);
  }

  private native void SetAxisColor_33(double id0[]);
  public void SetAxisColor(double id0[])
  {
    SetAxisColor_33(id0);
  }

  private native void SetAxisLabelColor_34(double id0,double id1,double id2);
  public void SetAxisLabelColor(double id0,double id1,double id2)
  {
    SetAxisLabelColor_34(id0,id1,id2);
  }

  private native void SetAxisLabelColor_35(double id0[]);
  public void SetAxisLabelColor(double id0[])
  {
    SetAxisLabelColor_35(id0);
  }

  private native void SetAngleBrushThreshold_36(double id0);
  public void SetAngleBrushThreshold(double id0)
  {
    SetAngleBrushThreshold_36(id0);
  }

  private native double GetAngleBrushThreshold_37();
  public double GetAngleBrushThreshold()
  {
    return GetAngleBrushThreshold_37();
  }

  private native void SetFunctionBrushThreshold_38(double id0);
  public void SetFunctionBrushThreshold(double id0)
  {
    SetFunctionBrushThreshold_38(id0);
  }

  private native double GetFunctionBrushThreshold_39();
  public double GetFunctionBrushThreshold()
  {
    return GetFunctionBrushThreshold_39();
  }

  private native int GetRangeAtPosition_40(int id0,double id1[]);
  public int GetRangeAtPosition(int id0,double id1[])
  {
    return GetRangeAtPosition_40(id0,id1);
  }

  private native int SetRangeAtPosition_41(int id0,double id1[]);
  public int SetRangeAtPosition(int id0,double id1[])
  {
    return SetRangeAtPosition_41(id0,id1);
  }

  private native void ResetAxes_42();
  public void ResetAxes()
  {
    ResetAxes_42();
  }

  private native void LassoSelect_43(int id0,int id1,vtkPoints id2);
  public void LassoSelect(int id0,int id1,vtkPoints id2)
  {
    LassoSelect_43(id0,id1,id2);
  }

  public vtkParallelCoordinatesRepresentation() { super(); }

  public vtkParallelCoordinatesRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
