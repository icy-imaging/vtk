// java wrapper for vtkTreeAreaView object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTreeAreaView extends vtkRenderView
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

  private native long SetTreeFromInputConnection_4(vtkAlgorithmOutput id0);
  public vtkDataRepresentation SetTreeFromInputConnection(vtkAlgorithmOutput id0)
  {
    long temp = SetTreeFromInputConnection_4(id0);

    if (temp == 0) return null;
    return (vtkDataRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SetTreeFromInput_5(vtkTree id0);
  public vtkDataRepresentation SetTreeFromInput(vtkTree id0)
  {
    long temp = SetTreeFromInput_5(id0);

    if (temp == 0) return null;
    return (vtkDataRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SetGraphFromInputConnection_6(vtkAlgorithmOutput id0);
  public vtkDataRepresentation SetGraphFromInputConnection(vtkAlgorithmOutput id0)
  {
    long temp = SetGraphFromInputConnection_6(id0);

    if (temp == 0) return null;
    return (vtkDataRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SetGraphFromInput_7(vtkGraph id0);
  public vtkDataRepresentation SetGraphFromInput(vtkGraph id0)
  {
    long temp = SetGraphFromInput_7(id0);

    if (temp == 0) return null;
    return (vtkDataRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAreaLabelArrayName_8(byte[] id0, int len0);
  public void SetAreaLabelArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAreaLabelArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetAreaLabelArrayName_9();
  public String GetAreaLabelArrayName()
  {
    return new String(GetAreaLabelArrayName_9(), StandardCharsets.UTF_8);
  }

  private native void SetAreaSizeArrayName_10(byte[] id0, int len0);
  public void SetAreaSizeArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAreaSizeArrayName_10(bytes0, bytes0.length);
  }

  private native byte[] GetAreaSizeArrayName_11();
  public String GetAreaSizeArrayName()
  {
    return new String(GetAreaSizeArrayName_11(), StandardCharsets.UTF_8);
  }

  private native void SetLabelPriorityArrayName_12(byte[] id0, int len0);
  public void SetLabelPriorityArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelPriorityArrayName_12(bytes0, bytes0.length);
  }

  private native byte[] GetLabelPriorityArrayName_13();
  public String GetLabelPriorityArrayName()
  {
    return new String(GetLabelPriorityArrayName_13(), StandardCharsets.UTF_8);
  }

  private native void SetEdgeLabelArrayName_14(byte[] id0, int len0);
  public void SetEdgeLabelArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeLabelArrayName_14(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeLabelArrayName_15();
  public String GetEdgeLabelArrayName()
  {
    return new String(GetEdgeLabelArrayName_15(), StandardCharsets.UTF_8);
  }

  private native void SetAreaHoverArrayName_16(byte[] id0, int len0);
  public void SetAreaHoverArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAreaHoverArrayName_16(bytes0, bytes0.length);
  }

  private native byte[] GetAreaHoverArrayName_17();
  public String GetAreaHoverArrayName()
  {
    return new String(GetAreaHoverArrayName_17(), StandardCharsets.UTF_8);
  }

  private native void SetAreaLabelVisibility_18(boolean id0);
  public void SetAreaLabelVisibility(boolean id0)
  {
    SetAreaLabelVisibility_18(id0);
  }

  private native boolean GetAreaLabelVisibility_19();
  public boolean GetAreaLabelVisibility()
  {
    return GetAreaLabelVisibility_19();
  }

  private native void AreaLabelVisibilityOn_20();
  public void AreaLabelVisibilityOn()
  {
    AreaLabelVisibilityOn_20();
  }

  private native void AreaLabelVisibilityOff_21();
  public void AreaLabelVisibilityOff()
  {
    AreaLabelVisibilityOff_21();
  }

  private native void SetEdgeLabelVisibility_22(boolean id0);
  public void SetEdgeLabelVisibility(boolean id0)
  {
    SetEdgeLabelVisibility_22(id0);
  }

  private native boolean GetEdgeLabelVisibility_23();
  public boolean GetEdgeLabelVisibility()
  {
    return GetEdgeLabelVisibility_23();
  }

  private native void EdgeLabelVisibilityOn_24();
  public void EdgeLabelVisibilityOn()
  {
    EdgeLabelVisibilityOn_24();
  }

  private native void EdgeLabelVisibilityOff_25();
  public void EdgeLabelVisibilityOff()
  {
    EdgeLabelVisibilityOff_25();
  }

  private native void SetAreaColorArrayName_26(byte[] id0, int len0);
  public void SetAreaColorArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAreaColorArrayName_26(bytes0, bytes0.length);
  }

  private native byte[] GetAreaColorArrayName_27();
  public String GetAreaColorArrayName()
  {
    return new String(GetAreaColorArrayName_27(), StandardCharsets.UTF_8);
  }

  private native void SetColorAreas_28(boolean id0);
  public void SetColorAreas(boolean id0)
  {
    SetColorAreas_28(id0);
  }

  private native boolean GetColorAreas_29();
  public boolean GetColorAreas()
  {
    return GetColorAreas_29();
  }

  private native void ColorAreasOn_30();
  public void ColorAreasOn()
  {
    ColorAreasOn_30();
  }

  private native void ColorAreasOff_31();
  public void ColorAreasOff()
  {
    ColorAreasOff_31();
  }

  private native void SetEdgeColorArrayName_32(byte[] id0, int len0);
  public void SetEdgeColorArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeColorArrayName_32(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeColorArrayName_33();
  public String GetEdgeColorArrayName()
  {
    return new String(GetEdgeColorArrayName_33(), StandardCharsets.UTF_8);
  }

  private native void SetEdgeColorToSplineFraction_34();
  public void SetEdgeColorToSplineFraction()
  {
    SetEdgeColorToSplineFraction_34();
  }

  private native void SetShrinkPercentage_35(double id0);
  public void SetShrinkPercentage(double id0)
  {
    SetShrinkPercentage_35(id0);
  }

  private native double GetShrinkPercentage_36();
  public double GetShrinkPercentage()
  {
    return GetShrinkPercentage_36();
  }

  private native void SetColorEdges_37(boolean id0);
  public void SetColorEdges(boolean id0)
  {
    SetColorEdges_37(id0);
  }

  private native boolean GetColorEdges_38();
  public boolean GetColorEdges()
  {
    return GetColorEdges_38();
  }

  private native void ColorEdgesOn_39();
  public void ColorEdgesOn()
  {
    ColorEdgesOn_39();
  }

  private native void ColorEdgesOff_40();
  public void ColorEdgesOff()
  {
    ColorEdgesOff_40();
  }

  private native void SetBundlingStrength_41(double id0);
  public void SetBundlingStrength(double id0)
  {
    SetBundlingStrength_41(id0);
  }

  private native double GetBundlingStrength_42();
  public double GetBundlingStrength()
  {
    return GetBundlingStrength_42();
  }

  private native void SetAreaLabelFontSize_43(int id0);
  public void SetAreaLabelFontSize(int id0)
  {
    SetAreaLabelFontSize_43(id0);
  }

  private native int GetAreaLabelFontSize_44();
  public int GetAreaLabelFontSize()
  {
    return GetAreaLabelFontSize_44();
  }

  private native void SetEdgeLabelFontSize_45(int id0);
  public void SetEdgeLabelFontSize(int id0)
  {
    SetEdgeLabelFontSize_45(id0);
  }

  private native int GetEdgeLabelFontSize_46();
  public int GetEdgeLabelFontSize()
  {
    return GetEdgeLabelFontSize_46();
  }

  private native void SetLayoutStrategy_47(vtkAreaLayoutStrategy id0);
  public void SetLayoutStrategy(vtkAreaLayoutStrategy id0)
  {
    SetLayoutStrategy_47(id0);
  }

  private native long GetLayoutStrategy_48();
  public vtkAreaLayoutStrategy GetLayoutStrategy()
  {
    long temp = GetLayoutStrategy_48();

    if (temp == 0) return null;
    return (vtkAreaLayoutStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseRectangularCoordinates_49(boolean id0);
  public void SetUseRectangularCoordinates(boolean id0)
  {
    SetUseRectangularCoordinates_49(id0);
  }

  private native boolean GetUseRectangularCoordinates_50();
  public boolean GetUseRectangularCoordinates()
  {
    return GetUseRectangularCoordinates_50();
  }

  private native void UseRectangularCoordinatesOn_51();
  public void UseRectangularCoordinatesOn()
  {
    UseRectangularCoordinatesOn_51();
  }

  private native void UseRectangularCoordinatesOff_52();
  public void UseRectangularCoordinatesOff()
  {
    UseRectangularCoordinatesOff_52();
  }

  private native void SetEdgeScalarBarVisibility_53(boolean id0);
  public void SetEdgeScalarBarVisibility(boolean id0)
  {
    SetEdgeScalarBarVisibility_53(id0);
  }

  private native boolean GetEdgeScalarBarVisibility_54();
  public boolean GetEdgeScalarBarVisibility()
  {
    return GetEdgeScalarBarVisibility_54();
  }

  public vtkTreeAreaView() { super(); }

  public vtkTreeAreaView(long id) { super(id); }
  public native long   VTKInit();

}
