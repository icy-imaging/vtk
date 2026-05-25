// java wrapper for vtkParallelCoordinatesHistogramRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParallelCoordinatesHistogramRepresentation extends vtkParallelCoordinatesRepresentation
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

  private native void SetUseHistograms_5(int id0);
  public void SetUseHistograms(int id0)
  {
    SetUseHistograms_5(id0);
  }

  private native int GetUseHistograms_6();
  public int GetUseHistograms()
  {
    return GetUseHistograms_6();
  }

  private native void UseHistogramsOn_7();
  public void UseHistogramsOn()
  {
    UseHistogramsOn_7();
  }

  private native void UseHistogramsOff_8();
  public void UseHistogramsOff()
  {
    UseHistogramsOff_8();
  }

  private native void SetShowOutliers_9(int id0);
  public void SetShowOutliers(int id0)
  {
    SetShowOutliers_9(id0);
  }

  private native int GetShowOutliers_10();
  public int GetShowOutliers()
  {
    return GetShowOutliers_10();
  }

  private native void ShowOutliersOn_11();
  public void ShowOutliersOn()
  {
    ShowOutliersOn_11();
  }

  private native void ShowOutliersOff_12();
  public void ShowOutliersOff()
  {
    ShowOutliersOff_12();
  }

  private native void SetHistogramLookupTableRange_13(double id0,double id1);
  public void SetHistogramLookupTableRange(double id0,double id1)
  {
    SetHistogramLookupTableRange_13(id0,id1);
  }

  private native void SetHistogramLookupTableRange_14(double id0[]);
  public void SetHistogramLookupTableRange(double id0[])
  {
    SetHistogramLookupTableRange_14(id0);
  }

  private native double[] GetHistogramLookupTableRange_15();
  public double[] GetHistogramLookupTableRange()
  {
    return GetHistogramLookupTableRange_15();
  }

  private native void SetNumberOfHistogramBins_16(int id0,int id1);
  public void SetNumberOfHistogramBins(int id0,int id1)
  {
    SetNumberOfHistogramBins_16(id0,id1);
  }

  private native int[] GetNumberOfHistogramBins_17();
  public int[] GetNumberOfHistogramBins()
  {
    return GetNumberOfHistogramBins_17();
  }

  private native void SetPreferredNumberOfOutliers_18(int id0);
  public void SetPreferredNumberOfOutliers(int id0)
  {
    SetPreferredNumberOfOutliers_18(id0);
  }

  private native int GetPreferredNumberOfOutliers_19();
  public int GetPreferredNumberOfOutliers()
  {
    return GetPreferredNumberOfOutliers_19();
  }

  private native int SwapAxisPositions_20(int id0,int id1);
  public int SwapAxisPositions(int id0,int id1)
  {
    return SwapAxisPositions_20(id0,id1);
  }

  private native int SetRangeAtPosition_21(int id0,double id1[]);
  public int SetRangeAtPosition(int id0,double id1[])
  {
    return SetRangeAtPosition_21(id0,id1);
  }

  public vtkParallelCoordinatesHistogramRepresentation() { super(); }

  public vtkParallelCoordinatesHistogramRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
