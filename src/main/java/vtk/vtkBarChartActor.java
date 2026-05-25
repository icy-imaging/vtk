// java wrapper for vtkBarChartActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBarChartActor extends vtkActor2D
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

  private native void SetInput_4(vtkDataObject id0);
  public void SetInput(vtkDataObject id0)
  {
    SetInput_4(id0);
  }

  private native long GetInput_5();
  public vtkDataObject GetInput()
  {
    long temp = GetInput_5();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTitleVisibility_6(int id0);
  public void SetTitleVisibility(int id0)
  {
    SetTitleVisibility_6(id0);
  }

  private native int GetTitleVisibility_7();
  public int GetTitleVisibility()
  {
    return GetTitleVisibility_7();
  }

  private native void TitleVisibilityOn_8();
  public void TitleVisibilityOn()
  {
    TitleVisibilityOn_8();
  }

  private native void TitleVisibilityOff_9();
  public void TitleVisibilityOff()
  {
    TitleVisibilityOff_9();
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

  private native void SetTitleTextProperty_12(vtkTextProperty id0);
  public void SetTitleTextProperty(vtkTextProperty id0)
  {
    SetTitleTextProperty_12(id0);
  }

  private native long GetTitleTextProperty_13();
  public vtkTextProperty GetTitleTextProperty()
  {
    long temp = GetTitleTextProperty_13();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelVisibility_14(int id0);
  public void SetLabelVisibility(int id0)
  {
    SetLabelVisibility_14(id0);
  }

  private native int GetLabelVisibility_15();
  public int GetLabelVisibility()
  {
    return GetLabelVisibility_15();
  }

  private native void LabelVisibilityOn_16();
  public void LabelVisibilityOn()
  {
    LabelVisibilityOn_16();
  }

  private native void LabelVisibilityOff_17();
  public void LabelVisibilityOff()
  {
    LabelVisibilityOff_17();
  }

  private native void SetLabelTextProperty_18(vtkTextProperty id0);
  public void SetLabelTextProperty(vtkTextProperty id0)
  {
    SetLabelTextProperty_18(id0);
  }

  private native long GetLabelTextProperty_19();
  public vtkTextProperty GetLabelTextProperty()
  {
    long temp = GetLabelTextProperty_19();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBarColor_20(int id0,double id1,double id2,double id3);
  public void SetBarColor(int id0,double id1,double id2,double id3)
  {
    SetBarColor_20(id0,id1,id2,id3);
  }

  private native void SetBarColor_21(int id0,double id1[]);
  public void SetBarColor(int id0,double id1[])
  {
    SetBarColor_21(id0,id1);
  }

  private native void SetBarLabel_22(int id0,byte[] id1, int len1);
  public void SetBarLabel(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetBarLabel_22(id0,bytes1, bytes1.length);
  }

  private native byte[] GetBarLabel_23(int id0);
  public String GetBarLabel(int id0)
  {
    return new String(GetBarLabel_23(id0), StandardCharsets.UTF_8);
  }

  private native void SetYTitle_24(byte[] id0, int len0);
  public void SetYTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetYTitle_24(bytes0, bytes0.length);
  }

  private native byte[] GetYTitle_25();
  public String GetYTitle()
  {
    return new String(GetYTitle_25(), StandardCharsets.UTF_8);
  }

  private native void SetLegendVisibility_26(int id0);
  public void SetLegendVisibility(int id0)
  {
    SetLegendVisibility_26(id0);
  }

  private native int GetLegendVisibility_27();
  public int GetLegendVisibility()
  {
    return GetLegendVisibility_27();
  }

  private native void LegendVisibilityOn_28();
  public void LegendVisibilityOn()
  {
    LegendVisibilityOn_28();
  }

  private native void LegendVisibilityOff_29();
  public void LegendVisibilityOff()
  {
    LegendVisibilityOff_29();
  }

  private native long GetLegendActor_30();
  public vtkLegendBoxActor GetLegendActor()
  {
    long temp = GetLegendActor_30();

    if (temp == 0) return null;
    return (vtkLegendBoxActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int RenderOverlay_31(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_31(id0);
  }

  private native int RenderOpaqueGeometry_32(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_32(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_33(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_33(id0);
  }

  private native int HasTranslucentPolygonalGeometry_34();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_34();
  }

  private native void ReleaseGraphicsResources_35(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_35(id0);
  }

  public vtkBarChartActor() { super(); }

  public vtkBarChartActor(long id) { super(id); }
  public native long   VTKInit();

}
