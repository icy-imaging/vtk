// java wrapper for vtkCaptionActor2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCaptionActor2D extends vtkActor2D
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

  private native void SetCaption_4(byte[] id0, int len0);
  public void SetCaption(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCaption_4(bytes0, bytes0.length);
  }

  private native byte[] GetCaption_5();
  public String GetCaption()
  {
    return new String(GetCaption_5(), StandardCharsets.UTF_8);
  }

  private native long GetAttachmentPointCoordinate_6();
  public vtkCoordinate GetAttachmentPointCoordinate()
  {
    long temp = GetAttachmentPointCoordinate_6();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetAttachmentPoint_7(double id0[]);
  public void SetAttachmentPoint(double id0[])
  {
    SetAttachmentPoint_7(id0);
  }

  private native void SetAttachmentPoint_8(double id0,double id1,double id2);
  public void SetAttachmentPoint(double id0,double id1,double id2)
  {
    SetAttachmentPoint_8(id0,id1,id2);
  }

  private native double[] GetAttachmentPoint_9();
  public double[] GetAttachmentPoint()
  {
    return GetAttachmentPoint_9();
  }

  private native void SetBorder_10(int id0);
  public void SetBorder(int id0)
  {
    SetBorder_10(id0);
  }

  private native int GetBorder_11();
  public int GetBorder()
  {
    return GetBorder_11();
  }

  private native void BorderOn_12();
  public void BorderOn()
  {
    BorderOn_12();
  }

  private native void BorderOff_13();
  public void BorderOff()
  {
    BorderOff_13();
  }

  private native void SetLeader_14(int id0);
  public void SetLeader(int id0)
  {
    SetLeader_14(id0);
  }

  private native int GetLeader_15();
  public int GetLeader()
  {
    return GetLeader_15();
  }

  private native void LeaderOn_16();
  public void LeaderOn()
  {
    LeaderOn_16();
  }

  private native void LeaderOff_17();
  public void LeaderOff()
  {
    LeaderOff_17();
  }

  private native void SetThreeDimensionalLeader_18(int id0);
  public void SetThreeDimensionalLeader(int id0)
  {
    SetThreeDimensionalLeader_18(id0);
  }

  private native int GetThreeDimensionalLeader_19();
  public int GetThreeDimensionalLeader()
  {
    return GetThreeDimensionalLeader_19();
  }

  private native void ThreeDimensionalLeaderOn_20();
  public void ThreeDimensionalLeaderOn()
  {
    ThreeDimensionalLeaderOn_20();
  }

  private native void ThreeDimensionalLeaderOff_21();
  public void ThreeDimensionalLeaderOff()
  {
    ThreeDimensionalLeaderOff_21();
  }

  private native void SetLeaderGlyphData_22(vtkPolyData id0);
  public void SetLeaderGlyphData(vtkPolyData id0)
  {
    SetLeaderGlyphData_22(id0);
  }

  private native void SetLeaderGlyphConnection_23(vtkAlgorithmOutput id0);
  public void SetLeaderGlyphConnection(vtkAlgorithmOutput id0)
  {
    SetLeaderGlyphConnection_23(id0);
  }

  private native long GetLeaderGlyph_24();
  public vtkPolyData GetLeaderGlyph()
  {
    long temp = GetLeaderGlyph_24();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLeaderGlyphSize_25(double id0);
  public void SetLeaderGlyphSize(double id0)
  {
    SetLeaderGlyphSize_25(id0);
  }

  private native double GetLeaderGlyphSizeMinValue_26();
  public double GetLeaderGlyphSizeMinValue()
  {
    return GetLeaderGlyphSizeMinValue_26();
  }

  private native double GetLeaderGlyphSizeMaxValue_27();
  public double GetLeaderGlyphSizeMaxValue()
  {
    return GetLeaderGlyphSizeMaxValue_27();
  }

  private native double GetLeaderGlyphSize_28();
  public double GetLeaderGlyphSize()
  {
    return GetLeaderGlyphSize_28();
  }

  private native void SetMaximumLeaderGlyphSize_29(int id0);
  public void SetMaximumLeaderGlyphSize(int id0)
  {
    SetMaximumLeaderGlyphSize_29(id0);
  }

  private native int GetMaximumLeaderGlyphSizeMinValue_30();
  public int GetMaximumLeaderGlyphSizeMinValue()
  {
    return GetMaximumLeaderGlyphSizeMinValue_30();
  }

  private native int GetMaximumLeaderGlyphSizeMaxValue_31();
  public int GetMaximumLeaderGlyphSizeMaxValue()
  {
    return GetMaximumLeaderGlyphSizeMaxValue_31();
  }

  private native int GetMaximumLeaderGlyphSize_32();
  public int GetMaximumLeaderGlyphSize()
  {
    return GetMaximumLeaderGlyphSize_32();
  }

  private native void SetPadding_33(int id0);
  public void SetPadding(int id0)
  {
    SetPadding_33(id0);
  }

  private native int GetPaddingMinValue_34();
  public int GetPaddingMinValue()
  {
    return GetPaddingMinValue_34();
  }

  private native int GetPaddingMaxValue_35();
  public int GetPaddingMaxValue()
  {
    return GetPaddingMaxValue_35();
  }

  private native int GetPadding_36();
  public int GetPadding()
  {
    return GetPadding_36();
  }

  private native long GetTextActor_37();
  public vtkTextActor GetTextActor()
  {
    long temp = GetTextActor_37();

    if (temp == 0) return null;
    return (vtkTextActor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCaptionTextProperty_38(vtkTextProperty id0);
  public void SetCaptionTextProperty(vtkTextProperty id0)
  {
    SetCaptionTextProperty_38(id0);
  }

  private native long GetCaptionTextProperty_39();
  public vtkTextProperty GetCaptionTextProperty()
  {
    long temp = GetCaptionTextProperty_39();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ShallowCopy_40(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_40(id0);
  }

  private native void SetAttachEdgeOnly_41(int id0);
  public void SetAttachEdgeOnly(int id0)
  {
    SetAttachEdgeOnly_41(id0);
  }

  private native int GetAttachEdgeOnly_42();
  public int GetAttachEdgeOnly()
  {
    return GetAttachEdgeOnly_42();
  }

  private native void AttachEdgeOnlyOn_43();
  public void AttachEdgeOnlyOn()
  {
    AttachEdgeOnlyOn_43();
  }

  private native void AttachEdgeOnlyOff_44();
  public void AttachEdgeOnlyOff()
  {
    AttachEdgeOnlyOff_44();
  }

  private native void ReleaseGraphicsResources_45(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_45(id0);
  }

  private native int RenderOpaqueGeometry_46(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_46(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_47(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_47(id0);
  }

  private native int RenderOverlay_48(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_48(id0);
  }

  private native int HasTranslucentPolygonalGeometry_49();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_49();
  }

  public vtkCaptionActor2D() { super(); }

  public vtkCaptionActor2D(long id) { super(id); }
  public native long   VTKInit();

}
