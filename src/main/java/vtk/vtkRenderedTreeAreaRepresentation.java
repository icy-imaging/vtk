// java wrapper for vtkRenderedTreeAreaRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRenderedTreeAreaRepresentation extends vtkRenderedRepresentation
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

  private native void SetLabelRenderMode_4(int id0);
  public void SetLabelRenderMode(int id0)
  {
    SetLabelRenderMode_4(id0);
  }

  private native void SetAreaLabelArrayName_5(byte[] id0, int len0);
  public void SetAreaLabelArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAreaLabelArrayName_5(bytes0, bytes0.length);
  }

  private native byte[] GetAreaLabelArrayName_6();
  public String GetAreaLabelArrayName()
  {
    return new String(GetAreaLabelArrayName_6(), StandardCharsets.UTF_8);
  }

  private native void SetAreaSizeArrayName_7(byte[] id0, int len0);
  public void SetAreaSizeArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAreaSizeArrayName_7(bytes0, bytes0.length);
  }

  private native byte[] GetAreaSizeArrayName_8();
  public String GetAreaSizeArrayName()
  {
    return new String(GetAreaSizeArrayName_8(), StandardCharsets.UTF_8);
  }

  private native void SetAreaLabelPriorityArrayName_9(byte[] id0, int len0);
  public void SetAreaLabelPriorityArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAreaLabelPriorityArrayName_9(bytes0, bytes0.length);
  }

  private native byte[] GetAreaLabelPriorityArrayName_10();
  public String GetAreaLabelPriorityArrayName()
  {
    return new String(GetAreaLabelPriorityArrayName_10(), StandardCharsets.UTF_8);
  }

  private native void SetGraphEdgeLabelArrayName_11(byte[] id0, int len0);
  public void SetGraphEdgeLabelArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGraphEdgeLabelArrayName_11(bytes0, bytes0.length);
  }

  private native void SetGraphEdgeLabelArrayName_12(byte[] id0, int len0,int id1);
  public void SetGraphEdgeLabelArrayName(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGraphEdgeLabelArrayName_12(bytes0, bytes0.length,id1);
  }

  private native byte[] GetGraphEdgeLabelArrayName_13();
  public String GetGraphEdgeLabelArrayName()
  {
    return new String(GetGraphEdgeLabelArrayName_13(), StandardCharsets.UTF_8);
  }

  private native byte[] GetGraphEdgeLabelArrayName_14(int id0);
  public String GetGraphEdgeLabelArrayName(int id0)
  {
    return new String(GetGraphEdgeLabelArrayName_14(id0), StandardCharsets.UTF_8);
  }

  private native void SetGraphEdgeLabelTextProperty_15(vtkTextProperty id0);
  public void SetGraphEdgeLabelTextProperty(vtkTextProperty id0)
  {
    SetGraphEdgeLabelTextProperty_15(id0);
  }

  private native void SetGraphEdgeLabelTextProperty_16(vtkTextProperty id0,int id1);
  public void SetGraphEdgeLabelTextProperty(vtkTextProperty id0,int id1)
  {
    SetGraphEdgeLabelTextProperty_16(id0,id1);
  }

  private native long GetGraphEdgeLabelTextProperty_17();
  public vtkTextProperty GetGraphEdgeLabelTextProperty()
  {
    long temp = GetGraphEdgeLabelTextProperty_17();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGraphEdgeLabelTextProperty_18(int id0);
  public vtkTextProperty GetGraphEdgeLabelTextProperty(int id0)
  {
    long temp = GetGraphEdgeLabelTextProperty_18(id0);

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAreaHoverArrayName_19(byte[] id0, int len0);
  public void SetAreaHoverArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAreaHoverArrayName_19(bytes0, bytes0.length);
  }

  private native byte[] GetAreaHoverArrayName_20();
  public String GetAreaHoverArrayName()
  {
    return new String(GetAreaHoverArrayName_20(), StandardCharsets.UTF_8);
  }

  private native void SetAreaLabelVisibility_21(boolean id0);
  public void SetAreaLabelVisibility(boolean id0)
  {
    SetAreaLabelVisibility_21(id0);
  }

  private native boolean GetAreaLabelVisibility_22();
  public boolean GetAreaLabelVisibility()
  {
    return GetAreaLabelVisibility_22();
  }

  private native void AreaLabelVisibilityOn_23();
  public void AreaLabelVisibilityOn()
  {
    AreaLabelVisibilityOn_23();
  }

  private native void AreaLabelVisibilityOff_24();
  public void AreaLabelVisibilityOff()
  {
    AreaLabelVisibilityOff_24();
  }

  private native void SetAreaLabelTextProperty_25(vtkTextProperty id0);
  public void SetAreaLabelTextProperty(vtkTextProperty id0)
  {
    SetAreaLabelTextProperty_25(id0);
  }

  private native long GetAreaLabelTextProperty_26();
  public vtkTextProperty GetAreaLabelTextProperty()
  {
    long temp = GetAreaLabelTextProperty_26();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGraphEdgeLabelVisibility_27(boolean id0);
  public void SetGraphEdgeLabelVisibility(boolean id0)
  {
    SetGraphEdgeLabelVisibility_27(id0);
  }

  private native void SetGraphEdgeLabelVisibility_28(boolean id0,int id1);
  public void SetGraphEdgeLabelVisibility(boolean id0,int id1)
  {
    SetGraphEdgeLabelVisibility_28(id0,id1);
  }

  private native boolean GetGraphEdgeLabelVisibility_29();
  public boolean GetGraphEdgeLabelVisibility()
  {
    return GetGraphEdgeLabelVisibility_29();
  }

  private native boolean GetGraphEdgeLabelVisibility_30(int id0);
  public boolean GetGraphEdgeLabelVisibility(int id0)
  {
    return GetGraphEdgeLabelVisibility_30(id0);
  }

  private native void GraphEdgeLabelVisibilityOn_31();
  public void GraphEdgeLabelVisibilityOn()
  {
    GraphEdgeLabelVisibilityOn_31();
  }

  private native void GraphEdgeLabelVisibilityOff_32();
  public void GraphEdgeLabelVisibilityOff()
  {
    GraphEdgeLabelVisibilityOff_32();
  }

  private native void SetAreaColorArrayName_33(byte[] id0, int len0);
  public void SetAreaColorArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAreaColorArrayName_33(bytes0, bytes0.length);
  }

  private native byte[] GetAreaColorArrayName_34();
  public String GetAreaColorArrayName()
  {
    return new String(GetAreaColorArrayName_34(), StandardCharsets.UTF_8);
  }

  private native void SetColorAreasByArray_35(boolean id0);
  public void SetColorAreasByArray(boolean id0)
  {
    SetColorAreasByArray_35(id0);
  }

  private native boolean GetColorAreasByArray_36();
  public boolean GetColorAreasByArray()
  {
    return GetColorAreasByArray_36();
  }

  private native void ColorAreasByArrayOn_37();
  public void ColorAreasByArrayOn()
  {
    ColorAreasByArrayOn_37();
  }

  private native void ColorAreasByArrayOff_38();
  public void ColorAreasByArrayOff()
  {
    ColorAreasByArrayOff_38();
  }

  private native void SetGraphEdgeColorArrayName_39(byte[] id0, int len0);
  public void SetGraphEdgeColorArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGraphEdgeColorArrayName_39(bytes0, bytes0.length);
  }

  private native void SetGraphEdgeColorArrayName_40(byte[] id0, int len0,int id1);
  public void SetGraphEdgeColorArrayName(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGraphEdgeColorArrayName_40(bytes0, bytes0.length,id1);
  }

  private native byte[] GetGraphEdgeColorArrayName_41();
  public String GetGraphEdgeColorArrayName()
  {
    return new String(GetGraphEdgeColorArrayName_41(), StandardCharsets.UTF_8);
  }

  private native byte[] GetGraphEdgeColorArrayName_42(int id0);
  public String GetGraphEdgeColorArrayName(int id0)
  {
    return new String(GetGraphEdgeColorArrayName_42(id0), StandardCharsets.UTF_8);
  }

  private native void SetGraphEdgeColorToSplineFraction_43();
  public void SetGraphEdgeColorToSplineFraction()
  {
    SetGraphEdgeColorToSplineFraction_43();
  }

  private native void SetGraphEdgeColorToSplineFraction_44(int id0);
  public void SetGraphEdgeColorToSplineFraction(int id0)
  {
    SetGraphEdgeColorToSplineFraction_44(id0);
  }

  private native void SetColorGraphEdgesByArray_45(boolean id0);
  public void SetColorGraphEdgesByArray(boolean id0)
  {
    SetColorGraphEdgesByArray_45(id0);
  }

  private native void SetColorGraphEdgesByArray_46(boolean id0,int id1);
  public void SetColorGraphEdgesByArray(boolean id0,int id1)
  {
    SetColorGraphEdgesByArray_46(id0,id1);
  }

  private native boolean GetColorGraphEdgesByArray_47();
  public boolean GetColorGraphEdgesByArray()
  {
    return GetColorGraphEdgesByArray_47();
  }

  private native boolean GetColorGraphEdgesByArray_48(int id0);
  public boolean GetColorGraphEdgesByArray(int id0)
  {
    return GetColorGraphEdgesByArray_48(id0);
  }

  private native void ColorGraphEdgesByArrayOn_49();
  public void ColorGraphEdgesByArrayOn()
  {
    ColorGraphEdgesByArrayOn_49();
  }

  private native void ColorGraphEdgesByArrayOff_50();
  public void ColorGraphEdgesByArrayOff()
  {
    ColorGraphEdgesByArrayOff_50();
  }

  private native void SetGraphHoverArrayName_51(byte[] id0, int len0);
  public void SetGraphHoverArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGraphHoverArrayName_51(bytes0, bytes0.length);
  }

  private native void SetGraphHoverArrayName_52(byte[] id0, int len0,int id1);
  public void SetGraphHoverArrayName(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGraphHoverArrayName_52(bytes0, bytes0.length,id1);
  }

  private native byte[] GetGraphHoverArrayName_53();
  public String GetGraphHoverArrayName()
  {
    return new String(GetGraphHoverArrayName_53(), StandardCharsets.UTF_8);
  }

  private native byte[] GetGraphHoverArrayName_54(int id0);
  public String GetGraphHoverArrayName(int id0)
  {
    return new String(GetGraphHoverArrayName_54(id0), StandardCharsets.UTF_8);
  }

  private native void SetShrinkPercentage_55(double id0);
  public void SetShrinkPercentage(double id0)
  {
    SetShrinkPercentage_55(id0);
  }

  private native double GetShrinkPercentage_56();
  public double GetShrinkPercentage()
  {
    return GetShrinkPercentage_56();
  }

  private native void SetGraphBundlingStrength_57(double id0);
  public void SetGraphBundlingStrength(double id0)
  {
    SetGraphBundlingStrength_57(id0);
  }

  private native void SetGraphBundlingStrength_58(double id0,int id1);
  public void SetGraphBundlingStrength(double id0,int id1)
  {
    SetGraphBundlingStrength_58(id0,id1);
  }

  private native double GetGraphBundlingStrength_59();
  public double GetGraphBundlingStrength()
  {
    return GetGraphBundlingStrength_59();
  }

  private native double GetGraphBundlingStrength_60(int id0);
  public double GetGraphBundlingStrength(int id0)
  {
    return GetGraphBundlingStrength_60(id0);
  }

  private native void SetGraphSplineType_61(int id0,int id1);
  public void SetGraphSplineType(int id0,int id1)
  {
    SetGraphSplineType_61(id0,id1);
  }

  private native int GetGraphSplineType_62(int id0);
  public int GetGraphSplineType(int id0)
  {
    return GetGraphSplineType_62(id0);
  }

  private native void SetAreaLayoutStrategy_63(vtkAreaLayoutStrategy id0);
  public void SetAreaLayoutStrategy(vtkAreaLayoutStrategy id0)
  {
    SetAreaLayoutStrategy_63(id0);
  }

  private native long GetAreaLayoutStrategy_64();
  public vtkAreaLayoutStrategy GetAreaLayoutStrategy()
  {
    long temp = GetAreaLayoutStrategy_64();

    if (temp == 0) return null;
    return (vtkAreaLayoutStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAreaToPolyData_65(vtkPolyDataAlgorithm id0);
  public void SetAreaToPolyData(vtkPolyDataAlgorithm id0)
  {
    SetAreaToPolyData_65(id0);
  }

  private native long GetAreaToPolyData_66();
  public vtkPolyDataAlgorithm GetAreaToPolyData()
  {
    long temp = GetAreaToPolyData_66();

    if (temp == 0) return null;
    return (vtkPolyDataAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseRectangularCoordinates_67(boolean id0);
  public void SetUseRectangularCoordinates(boolean id0)
  {
    SetUseRectangularCoordinates_67(id0);
  }

  private native boolean GetUseRectangularCoordinates_68();
  public boolean GetUseRectangularCoordinates()
  {
    return GetUseRectangularCoordinates_68();
  }

  private native void UseRectangularCoordinatesOn_69();
  public void UseRectangularCoordinatesOn()
  {
    UseRectangularCoordinatesOn_69();
  }

  private native void UseRectangularCoordinatesOff_70();
  public void UseRectangularCoordinatesOff()
  {
    UseRectangularCoordinatesOff_70();
  }

  private native void SetAreaLabelMapper_71(vtkLabeledDataMapper id0);
  public void SetAreaLabelMapper(vtkLabeledDataMapper id0)
  {
    SetAreaLabelMapper_71(id0);
  }

  private native long GetAreaLabelMapper_72();
  public vtkLabeledDataMapper GetAreaLabelMapper()
  {
    long temp = GetAreaLabelMapper_72();

    if (temp == 0) return null;
    return (vtkLabeledDataMapper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ApplyViewTheme_73(vtkViewTheme id0);
  public void ApplyViewTheme(vtkViewTheme id0)
  {
    ApplyViewTheme_73(id0);
  }

  private native void SetEdgeScalarBarVisibility_74(boolean id0);
  public void SetEdgeScalarBarVisibility(boolean id0)
  {
    SetEdgeScalarBarVisibility_74(id0);
  }

  private native boolean GetEdgeScalarBarVisibility_75();
  public boolean GetEdgeScalarBarVisibility()
  {
    return GetEdgeScalarBarVisibility_75();
  }

  public vtkRenderedTreeAreaRepresentation() { super(); }

  public vtkRenderedTreeAreaRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
