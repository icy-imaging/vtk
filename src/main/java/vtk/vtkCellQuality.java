// java wrapper for vtkCellQuality object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellQuality extends vtkDataSetAlgorithm
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

  private native void SetQualityMeasure_4(int id0);
  public void SetQualityMeasure(int id0)
  {
    SetQualityMeasure_4(id0);
  }

  private native void SetQualityMeasureToArea_5();
  public void SetQualityMeasureToArea()
  {
    SetQualityMeasureToArea_5();
  }

  private native void SetQualityMeasureToAspectFrobenius_6();
  public void SetQualityMeasureToAspectFrobenius()
  {
    SetQualityMeasureToAspectFrobenius_6();
  }

  private native void SetQualityMeasureToAspectGamma_7();
  public void SetQualityMeasureToAspectGamma()
  {
    SetQualityMeasureToAspectGamma_7();
  }

  private native void SetQualityMeasureToAspectRatio_8();
  public void SetQualityMeasureToAspectRatio()
  {
    SetQualityMeasureToAspectRatio_8();
  }

  private native void SetQualityMeasureToCollapseRatio_9();
  public void SetQualityMeasureToCollapseRatio()
  {
    SetQualityMeasureToCollapseRatio_9();
  }

  private native void SetQualityMeasureToCondition_10();
  public void SetQualityMeasureToCondition()
  {
    SetQualityMeasureToCondition_10();
  }

  private native void SetQualityMeasureToDiagonal_11();
  public void SetQualityMeasureToDiagonal()
  {
    SetQualityMeasureToDiagonal_11();
  }

  private native void SetQualityMeasureToDimension_12();
  public void SetQualityMeasureToDimension()
  {
    SetQualityMeasureToDimension_12();
  }

  private native void SetQualityMeasureToDistortion_13();
  public void SetQualityMeasureToDistortion()
  {
    SetQualityMeasureToDistortion_13();
  }

  private native void SetQualityMeasureToJacobian_14();
  public void SetQualityMeasureToJacobian()
  {
    SetQualityMeasureToJacobian_14();
  }

  private native void SetQualityMeasureToMaxAngle_15();
  public void SetQualityMeasureToMaxAngle()
  {
    SetQualityMeasureToMaxAngle_15();
  }

  private native void SetQualityMeasureToMaxAspectFrobenius_16();
  public void SetQualityMeasureToMaxAspectFrobenius()
  {
    SetQualityMeasureToMaxAspectFrobenius_16();
  }

  private native void SetQualityMeasureToMaxEdgeRatio_17();
  public void SetQualityMeasureToMaxEdgeRatio()
  {
    SetQualityMeasureToMaxEdgeRatio_17();
  }

  private native void SetQualityMeasureToMedAspectFrobenius_18();
  public void SetQualityMeasureToMedAspectFrobenius()
  {
    SetQualityMeasureToMedAspectFrobenius_18();
  }

  private native void SetQualityMeasureToMinAngle_19();
  public void SetQualityMeasureToMinAngle()
  {
    SetQualityMeasureToMinAngle_19();
  }

  private native void SetQualityMeasureToOddy_20();
  public void SetQualityMeasureToOddy()
  {
    SetQualityMeasureToOddy_20();
  }

  private native void SetQualityMeasureToRadiusRatio_21();
  public void SetQualityMeasureToRadiusRatio()
  {
    SetQualityMeasureToRadiusRatio_21();
  }

  private native void SetQualityMeasureToRelativeSizeSquared_22();
  public void SetQualityMeasureToRelativeSizeSquared()
  {
    SetQualityMeasureToRelativeSizeSquared_22();
  }

  private native void SetQualityMeasureToScaledJacobian_23();
  public void SetQualityMeasureToScaledJacobian()
  {
    SetQualityMeasureToScaledJacobian_23();
  }

  private native void SetQualityMeasureToShapeAndSize_24();
  public void SetQualityMeasureToShapeAndSize()
  {
    SetQualityMeasureToShapeAndSize_24();
  }

  private native void SetQualityMeasureToShape_25();
  public void SetQualityMeasureToShape()
  {
    SetQualityMeasureToShape_25();
  }

  private native void SetQualityMeasureToShearAndSize_26();
  public void SetQualityMeasureToShearAndSize()
  {
    SetQualityMeasureToShearAndSize_26();
  }

  private native void SetQualityMeasureToShear_27();
  public void SetQualityMeasureToShear()
  {
    SetQualityMeasureToShear_27();
  }

  private native void SetQualityMeasureToSkew_28();
  public void SetQualityMeasureToSkew()
  {
    SetQualityMeasureToSkew_28();
  }

  private native void SetQualityMeasureToStretch_29();
  public void SetQualityMeasureToStretch()
  {
    SetQualityMeasureToStretch_29();
  }

  private native void SetQualityMeasureToTaper_30();
  public void SetQualityMeasureToTaper()
  {
    SetQualityMeasureToTaper_30();
  }

  private native void SetQualityMeasureToVolume_31();
  public void SetQualityMeasureToVolume()
  {
    SetQualityMeasureToVolume_31();
  }

  private native void SetQualityMeasureToWarpage_32();
  public void SetQualityMeasureToWarpage()
  {
    SetQualityMeasureToWarpage_32();
  }

  private native void SetUnsupportedGeometry_33(double id0);
  public void SetUnsupportedGeometry(double id0)
  {
    SetUnsupportedGeometry_33(id0);
  }

  private native double GetUnsupportedGeometry_34();
  public double GetUnsupportedGeometry()
  {
    return GetUnsupportedGeometry_34();
  }

  private native void SetUndefinedQuality_35(double id0);
  public void SetUndefinedQuality(double id0)
  {
    SetUndefinedQuality_35(id0);
  }

  private native double GetUndefinedQuality_36();
  public double GetUndefinedQuality()
  {
    return GetUndefinedQuality_36();
  }

  private native double TriangleStripArea_37(vtkCell id0);
  public double TriangleStripArea(vtkCell id0)
  {
    return TriangleStripArea_37(id0);
  }

  private native double PixelArea_38(vtkCell id0);
  public double PixelArea(vtkCell id0)
  {
    return PixelArea_38(id0);
  }

  private native double PolygonArea_39(vtkCell id0);
  public double PolygonArea(vtkCell id0)
  {
    return PolygonArea_39(id0);
  }

  public vtkCellQuality() { super(); }

  public vtkCellQuality(long id) { super(id); }
  public native long   VTKInit();

}
