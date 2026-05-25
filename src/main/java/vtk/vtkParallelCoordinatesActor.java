// java wrapper for vtkParallelCoordinatesActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParallelCoordinatesActor extends vtkActor2D
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

  private native void SetIndependentVariables_4(int id0);
  public void SetIndependentVariables(int id0)
  {
    SetIndependentVariables_4(id0);
  }

  private native int GetIndependentVariablesMinValue_5();
  public int GetIndependentVariablesMinValue()
  {
    return GetIndependentVariablesMinValue_5();
  }

  private native int GetIndependentVariablesMaxValue_6();
  public int GetIndependentVariablesMaxValue()
  {
    return GetIndependentVariablesMaxValue_6();
  }

  private native int GetIndependentVariables_7();
  public int GetIndependentVariables()
  {
    return GetIndependentVariables_7();
  }

  private native void SetIndependentVariablesToColumns_8();
  public void SetIndependentVariablesToColumns()
  {
    SetIndependentVariablesToColumns_8();
  }

  private native void SetIndependentVariablesToRows_9();
  public void SetIndependentVariablesToRows()
  {
    SetIndependentVariablesToRows_9();
  }

  private native void SetTitle_10(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_10(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_11();
  public String GetTitle()
  {
    return new String(GetTitle_11(), StandardCharsets.UTF_8);
  }

  private native void SetNumberOfLabels_12(int id0);
  public void SetNumberOfLabels(int id0)
  {
    SetNumberOfLabels_12(id0);
  }

  private native int GetNumberOfLabelsMinValue_13();
  public int GetNumberOfLabelsMinValue()
  {
    return GetNumberOfLabelsMinValue_13();
  }

  private native int GetNumberOfLabelsMaxValue_14();
  public int GetNumberOfLabelsMaxValue()
  {
    return GetNumberOfLabelsMaxValue_14();
  }

  private native int GetNumberOfLabels_15();
  public int GetNumberOfLabels()
  {
    return GetNumberOfLabels_15();
  }

  private native void SetLabelFormat_16(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_16(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_17();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_17(), StandardCharsets.UTF_8);
  }

  private native void SetTitleTextProperty_18(vtkTextProperty id0);
  public void SetTitleTextProperty(vtkTextProperty id0)
  {
    SetTitleTextProperty_18(id0);
  }

  private native long GetTitleTextProperty_19();
  public vtkTextProperty GetTitleTextProperty()
  {
    long temp = GetTitleTextProperty_19();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelTextProperty_20(vtkTextProperty id0);
  public void SetLabelTextProperty(vtkTextProperty id0)
  {
    SetLabelTextProperty_20(id0);
  }

  private native long GetLabelTextProperty_21();
  public vtkTextProperty GetLabelTextProperty()
  {
    long temp = GetLabelTextProperty_21();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int RenderOpaqueGeometry_22(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_22(id0);
  }

  private native int RenderOverlay_23(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_23(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_24(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_24(id0);
  }

  private native int HasTranslucentPolygonalGeometry_25();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_25();
  }

  private native void SetInputConnection_26(vtkAlgorithmOutput id0);
  public void SetInputConnection(vtkAlgorithmOutput id0)
  {
    SetInputConnection_26(id0);
  }

  private native void SetInputData_27(vtkDataObject id0);
  public void SetInputData(vtkDataObject id0)
  {
    SetInputData_27(id0);
  }

  private native long GetInput_28();
  public vtkDataObject GetInput()
  {
    long temp = GetInput_28();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ReleaseGraphicsResources_29(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_29(id0);
  }

  public vtkParallelCoordinatesActor() { super(); }

  public vtkParallelCoordinatesActor(long id) { super(id); }
  public native long   VTKInit();

}
