// java wrapper for vtkPieChartActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPieChartActor extends vtkActor2D
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

  private native void SetTitleVisibility_7(int id0);
  public void SetTitleVisibility(int id0)
  {
    SetTitleVisibility_7(id0);
  }

  private native int GetTitleVisibility_8();
  public int GetTitleVisibility()
  {
    return GetTitleVisibility_8();
  }

  private native void TitleVisibilityOn_9();
  public void TitleVisibilityOn()
  {
    TitleVisibilityOn_9();
  }

  private native void TitleVisibilityOff_10();
  public void TitleVisibilityOff()
  {
    TitleVisibilityOff_10();
  }

  private native void SetTitle_11(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_11(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_12();
  public String GetTitle()
  {
    return new String(GetTitle_12(), StandardCharsets.UTF_8);
  }

  private native void SetTitleTextProperty_13(vtkTextProperty id0);
  public void SetTitleTextProperty(vtkTextProperty id0)
  {
    SetTitleTextProperty_13(id0);
  }

  private native long GetTitleTextProperty_14();
  public vtkTextProperty GetTitleTextProperty()
  {
    long temp = GetTitleTextProperty_14();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelVisibility_15(int id0);
  public void SetLabelVisibility(int id0)
  {
    SetLabelVisibility_15(id0);
  }

  private native int GetLabelVisibility_16();
  public int GetLabelVisibility()
  {
    return GetLabelVisibility_16();
  }

  private native void LabelVisibilityOn_17();
  public void LabelVisibilityOn()
  {
    LabelVisibilityOn_17();
  }

  private native void LabelVisibilityOff_18();
  public void LabelVisibilityOff()
  {
    LabelVisibilityOff_18();
  }

  private native void SetLabelTextProperty_19(vtkTextProperty id0);
  public void SetLabelTextProperty(vtkTextProperty id0)
  {
    SetLabelTextProperty_19(id0);
  }

  private native long GetLabelTextProperty_20();
  public vtkTextProperty GetLabelTextProperty()
  {
    long temp = GetLabelTextProperty_20();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPieceColor_21(int id0,double id1,double id2,double id3);
  public void SetPieceColor(int id0,double id1,double id2,double id3)
  {
    SetPieceColor_21(id0,id1,id2,id3);
  }

  private native void SetPieceColor_22(int id0,double id1[]);
  public void SetPieceColor(int id0,double id1[])
  {
    SetPieceColor_22(id0,id1);
  }

  private native void SetPieceLabel_23(int id0,byte[] id1, int len1);
  public void SetPieceLabel(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetPieceLabel_23(id0,bytes1, bytes1.length);
  }

  private native byte[] GetPieceLabel_24(int id0);
  public String GetPieceLabel(int id0)
  {
    return new String(GetPieceLabel_24(id0), StandardCharsets.UTF_8);
  }

  private native void SetLegendVisibility_25(int id0);
  public void SetLegendVisibility(int id0)
  {
    SetLegendVisibility_25(id0);
  }

  private native int GetLegendVisibility_26();
  public int GetLegendVisibility()
  {
    return GetLegendVisibility_26();
  }

  private native void LegendVisibilityOn_27();
  public void LegendVisibilityOn()
  {
    LegendVisibilityOn_27();
  }

  private native void LegendVisibilityOff_28();
  public void LegendVisibilityOff()
  {
    LegendVisibilityOff_28();
  }

  private native long GetLegendActor_29();
  public vtkLegendBoxActor GetLegendActor()
  {
    long temp = GetLegendActor_29();

    if (temp == 0) return null;
    return (vtkLegendBoxActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int RenderOverlay_30(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_30(id0);
  }

  private native int RenderOpaqueGeometry_31(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_31(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_32(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_32(id0);
  }

  private native int HasTranslucentPolygonalGeometry_33();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_33();
  }

  private native void ReleaseGraphicsResources_34(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_34(id0);
  }

  public vtkPieChartActor() { super(); }

  public vtkPieChartActor(long id) { super(id); }
  public native long   VTKInit();

}
