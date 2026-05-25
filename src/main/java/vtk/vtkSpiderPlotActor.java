// java wrapper for vtkSpiderPlotActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSpiderPlotActor extends vtkActor2D
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

  private native void SetInputData_4(vtkDataObject id0);
  public void SetInputData(vtkDataObject id0)
  {
    SetInputData_4(id0);
  }

  private native void SetInputConnection_5(vtkAlgorithmOutput id0);
  public void SetInputConnection(vtkAlgorithmOutput id0)
  {
    SetInputConnection_5(id0);
  }

  private native long GetInput_6();
  public vtkDataObject GetInput()
  {
    long temp = GetInput_6();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetIndependentVariables_7(int id0);
  public void SetIndependentVariables(int id0)
  {
    SetIndependentVariables_7(id0);
  }

  private native int GetIndependentVariablesMinValue_8();
  public int GetIndependentVariablesMinValue()
  {
    return GetIndependentVariablesMinValue_8();
  }

  private native int GetIndependentVariablesMaxValue_9();
  public int GetIndependentVariablesMaxValue()
  {
    return GetIndependentVariablesMaxValue_9();
  }

  private native int GetIndependentVariables_10();
  public int GetIndependentVariables()
  {
    return GetIndependentVariables_10();
  }

  private native void SetIndependentVariablesToColumns_11();
  public void SetIndependentVariablesToColumns()
  {
    SetIndependentVariablesToColumns_11();
  }

  private native void SetIndependentVariablesToRows_12();
  public void SetIndependentVariablesToRows()
  {
    SetIndependentVariablesToRows_12();
  }

  private native void SetTitleVisibility_13(int id0);
  public void SetTitleVisibility(int id0)
  {
    SetTitleVisibility_13(id0);
  }

  private native int GetTitleVisibility_14();
  public int GetTitleVisibility()
  {
    return GetTitleVisibility_14();
  }

  private native void TitleVisibilityOn_15();
  public void TitleVisibilityOn()
  {
    TitleVisibilityOn_15();
  }

  private native void TitleVisibilityOff_16();
  public void TitleVisibilityOff()
  {
    TitleVisibilityOff_16();
  }

  private native void SetTitle_17(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_17(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_18();
  public String GetTitle()
  {
    return new String(GetTitle_18(), StandardCharsets.UTF_8);
  }

  private native void SetTitleTextProperty_19(vtkTextProperty id0);
  public void SetTitleTextProperty(vtkTextProperty id0)
  {
    SetTitleTextProperty_19(id0);
  }

  private native long GetTitleTextProperty_20();
  public vtkTextProperty GetTitleTextProperty()
  {
    long temp = GetTitleTextProperty_20();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelVisibility_21(int id0);
  public void SetLabelVisibility(int id0)
  {
    SetLabelVisibility_21(id0);
  }

  private native int GetLabelVisibility_22();
  public int GetLabelVisibility()
  {
    return GetLabelVisibility_22();
  }

  private native void LabelVisibilityOn_23();
  public void LabelVisibilityOn()
  {
    LabelVisibilityOn_23();
  }

  private native void LabelVisibilityOff_24();
  public void LabelVisibilityOff()
  {
    LabelVisibilityOff_24();
  }

  private native void SetLabelTextProperty_25(vtkTextProperty id0);
  public void SetLabelTextProperty(vtkTextProperty id0)
  {
    SetLabelTextProperty_25(id0);
  }

  private native long GetLabelTextProperty_26();
  public vtkTextProperty GetLabelTextProperty()
  {
    long temp = GetLabelTextProperty_26();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNumberOfRings_27(int id0);
  public void SetNumberOfRings(int id0)
  {
    SetNumberOfRings_27(id0);
  }

  private native int GetNumberOfRingsMinValue_28();
  public int GetNumberOfRingsMinValue()
  {
    return GetNumberOfRingsMinValue_28();
  }

  private native int GetNumberOfRingsMaxValue_29();
  public int GetNumberOfRingsMaxValue()
  {
    return GetNumberOfRingsMaxValue_29();
  }

  private native int GetNumberOfRings_30();
  public int GetNumberOfRings()
  {
    return GetNumberOfRings_30();
  }

  private native void SetAxisLabel_31(int id0,byte[] id1, int len1);
  public void SetAxisLabel(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetAxisLabel_31(id0,bytes1, bytes1.length);
  }

  private native byte[] GetAxisLabel_32(int id0);
  public String GetAxisLabel(int id0)
  {
    return new String(GetAxisLabel_32(id0), StandardCharsets.UTF_8);
  }

  private native void SetAxisRange_33(int id0,double id1,double id2);
  public void SetAxisRange(int id0,double id1,double id2)
  {
    SetAxisRange_33(id0,id1,id2);
  }

  private native void SetAxisRange_34(int id0,double id1[]);
  public void SetAxisRange(int id0,double id1[])
  {
    SetAxisRange_34(id0,id1);
  }

  private native void GetAxisRange_35(int id0,double id1[]);
  public void GetAxisRange(int id0,double id1[])
  {
    GetAxisRange_35(id0,id1);
  }

  private native void SetPlotColor_36(int id0,double id1,double id2,double id3);
  public void SetPlotColor(int id0,double id1,double id2,double id3)
  {
    SetPlotColor_36(id0,id1,id2,id3);
  }

  private native void SetPlotColor_37(int id0,double id1[]);
  public void SetPlotColor(int id0,double id1[])
  {
    SetPlotColor_37(id0,id1);
  }

  private native void SetLegendVisibility_38(int id0);
  public void SetLegendVisibility(int id0)
  {
    SetLegendVisibility_38(id0);
  }

  private native int GetLegendVisibility_39();
  public int GetLegendVisibility()
  {
    return GetLegendVisibility_39();
  }

  private native void LegendVisibilityOn_40();
  public void LegendVisibilityOn()
  {
    LegendVisibilityOn_40();
  }

  private native void LegendVisibilityOff_41();
  public void LegendVisibilityOff()
  {
    LegendVisibilityOff_41();
  }

  private native long GetLegendActor_42();
  public vtkLegendBoxActor GetLegendActor()
  {
    long temp = GetLegendActor_42();

    if (temp == 0) return null;
    return (vtkLegendBoxActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int RenderOverlay_43(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_43(id0);
  }

  private native int RenderOpaqueGeometry_44(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_44(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_45(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_45(id0);
  }

  private native int HasTranslucentPolygonalGeometry_46();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_46();
  }

  private native void ReleaseGraphicsResources_47(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_47(id0);
  }

  public vtkSpiderPlotActor() { super(); }

  public vtkSpiderPlotActor(long id) { super(id); }
  public native long   VTKInit();

}
