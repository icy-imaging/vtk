// java wrapper for vtkLabelPlacementMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLabelPlacementMapper extends vtkMapper2D
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

  private native void RenderOverlay_4(vtkViewport id0,vtkActor2D id1);
  public void RenderOverlay(vtkViewport id0,vtkActor2D id1)
  {
    RenderOverlay_4(id0,id1);
  }

  private native void SetRenderStrategy_5(vtkLabelRenderStrategy id0);
  public void SetRenderStrategy(vtkLabelRenderStrategy id0)
  {
    SetRenderStrategy_5(id0);
  }

  private native long GetRenderStrategy_6();
  public vtkLabelRenderStrategy GetRenderStrategy()
  {
    long temp = GetRenderStrategy_6();

    if (temp == 0) return null;
    return (vtkLabelRenderStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMaximumLabelFraction_7(double id0);
  public void SetMaximumLabelFraction(double id0)
  {
    SetMaximumLabelFraction_7(id0);
  }

  private native double GetMaximumLabelFractionMinValue_8();
  public double GetMaximumLabelFractionMinValue()
  {
    return GetMaximumLabelFractionMinValue_8();
  }

  private native double GetMaximumLabelFractionMaxValue_9();
  public double GetMaximumLabelFractionMaxValue()
  {
    return GetMaximumLabelFractionMaxValue_9();
  }

  private native double GetMaximumLabelFraction_10();
  public double GetMaximumLabelFraction()
  {
    return GetMaximumLabelFraction_10();
  }

  private native void SetIteratorType_11(int id0);
  public void SetIteratorType(int id0)
  {
    SetIteratorType_11(id0);
  }

  private native int GetIteratorType_12();
  public int GetIteratorType()
  {
    return GetIteratorType_12();
  }

  private native boolean GetPositionsAsNormals_13();
  public boolean GetPositionsAsNormals()
  {
    return GetPositionsAsNormals_13();
  }

  private native void SetPositionsAsNormals_14(boolean id0);
  public void SetPositionsAsNormals(boolean id0)
  {
    SetPositionsAsNormals_14(id0);
  }

  private native void PositionsAsNormalsOn_15();
  public void PositionsAsNormalsOn()
  {
    PositionsAsNormalsOn_15();
  }

  private native void PositionsAsNormalsOff_16();
  public void PositionsAsNormalsOff()
  {
    PositionsAsNormalsOff_16();
  }

  private native boolean GetGeneratePerturbedLabelSpokes_17();
  public boolean GetGeneratePerturbedLabelSpokes()
  {
    return GetGeneratePerturbedLabelSpokes_17();
  }

  private native void SetGeneratePerturbedLabelSpokes_18(boolean id0);
  public void SetGeneratePerturbedLabelSpokes(boolean id0)
  {
    SetGeneratePerturbedLabelSpokes_18(id0);
  }

  private native void GeneratePerturbedLabelSpokesOn_19();
  public void GeneratePerturbedLabelSpokesOn()
  {
    GeneratePerturbedLabelSpokesOn_19();
  }

  private native void GeneratePerturbedLabelSpokesOff_20();
  public void GeneratePerturbedLabelSpokesOff()
  {
    GeneratePerturbedLabelSpokesOff_20();
  }

  private native boolean GetUseDepthBuffer_21();
  public boolean GetUseDepthBuffer()
  {
    return GetUseDepthBuffer_21();
  }

  private native void SetUseDepthBuffer_22(boolean id0);
  public void SetUseDepthBuffer(boolean id0)
  {
    SetUseDepthBuffer_22(id0);
  }

  private native void UseDepthBufferOn_23();
  public void UseDepthBufferOn()
  {
    UseDepthBufferOn_23();
  }

  private native void UseDepthBufferOff_24();
  public void UseDepthBufferOff()
  {
    UseDepthBufferOff_24();
  }

  private native void SetPlaceAllLabels_25(boolean id0);
  public void SetPlaceAllLabels(boolean id0)
  {
    SetPlaceAllLabels_25(id0);
  }

  private native boolean GetPlaceAllLabels_26();
  public boolean GetPlaceAllLabels()
  {
    return GetPlaceAllLabels_26();
  }

  private native void PlaceAllLabelsOn_27();
  public void PlaceAllLabelsOn()
  {
    PlaceAllLabelsOn_27();
  }

  private native void PlaceAllLabelsOff_28();
  public void PlaceAllLabelsOff()
  {
    PlaceAllLabelsOff_28();
  }

  private native void SetOutputTraversedBounds_29(boolean id0);
  public void SetOutputTraversedBounds(boolean id0)
  {
    SetOutputTraversedBounds_29(id0);
  }

  private native boolean GetOutputTraversedBounds_30();
  public boolean GetOutputTraversedBounds()
  {
    return GetOutputTraversedBounds_30();
  }

  private native void OutputTraversedBoundsOn_31();
  public void OutputTraversedBoundsOn()
  {
    OutputTraversedBoundsOn_31();
  }

  private native void OutputTraversedBoundsOff_32();
  public void OutputTraversedBoundsOff()
  {
    OutputTraversedBoundsOff_32();
  }

  private native void SetShape_33(int id0);
  public void SetShape(int id0)
  {
    SetShape_33(id0);
  }

  private native int GetShapeMinValue_34();
  public int GetShapeMinValue()
  {
    return GetShapeMinValue_34();
  }

  private native int GetShapeMaxValue_35();
  public int GetShapeMaxValue()
  {
    return GetShapeMaxValue_35();
  }

  private native int GetShape_36();
  public int GetShape()
  {
    return GetShape_36();
  }

  private native void SetShapeToNone_37();
  public void SetShapeToNone()
  {
    SetShapeToNone_37();
  }

  private native void SetShapeToRect_38();
  public void SetShapeToRect()
  {
    SetShapeToRect_38();
  }

  private native void SetShapeToRoundedRect_39();
  public void SetShapeToRoundedRect()
  {
    SetShapeToRoundedRect_39();
  }

  private native void SetStyle_40(int id0);
  public void SetStyle(int id0)
  {
    SetStyle_40(id0);
  }

  private native int GetStyleMinValue_41();
  public int GetStyleMinValue()
  {
    return GetStyleMinValue_41();
  }

  private native int GetStyleMaxValue_42();
  public int GetStyleMaxValue()
  {
    return GetStyleMaxValue_42();
  }

  private native int GetStyle_43();
  public int GetStyle()
  {
    return GetStyle_43();
  }

  private native void SetStyleToFilled_44();
  public void SetStyleToFilled()
  {
    SetStyleToFilled_44();
  }

  private native void SetStyleToOutline_45();
  public void SetStyleToOutline()
  {
    SetStyleToOutline_45();
  }

  private native void SetMargin_46(double id0);
  public void SetMargin(double id0)
  {
    SetMargin_46(id0);
  }

  private native double GetMargin_47();
  public double GetMargin()
  {
    return GetMargin_47();
  }

  private native void SetBackgroundColor_48(double id0,double id1,double id2);
  public void SetBackgroundColor(double id0,double id1,double id2)
  {
    SetBackgroundColor_48(id0,id1,id2);
  }

  private native void SetBackgroundColor_49(double id0[]);
  public void SetBackgroundColor(double id0[])
  {
    SetBackgroundColor_49(id0);
  }

  private native double[] GetBackgroundColor_50();
  public double[] GetBackgroundColor()
  {
    return GetBackgroundColor_50();
  }

  private native void SetBackgroundOpacity_51(double id0);
  public void SetBackgroundOpacity(double id0)
  {
    SetBackgroundOpacity_51(id0);
  }

  private native double GetBackgroundOpacityMinValue_52();
  public double GetBackgroundOpacityMinValue()
  {
    return GetBackgroundOpacityMinValue_52();
  }

  private native double GetBackgroundOpacityMaxValue_53();
  public double GetBackgroundOpacityMaxValue()
  {
    return GetBackgroundOpacityMaxValue_53();
  }

  private native double GetBackgroundOpacity_54();
  public double GetBackgroundOpacity()
  {
    return GetBackgroundOpacity_54();
  }

  private native long GetAnchorTransform_55();
  public vtkCoordinate GetAnchorTransform()
  {
    long temp = GetAnchorTransform_55();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ReleaseGraphicsResources_56(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_56(id0);
  }

  public vtkLabelPlacementMapper() { super(); }

  public vtkLabelPlacementMapper(long id) { super(id); }
  public native long   VTKInit();

}
