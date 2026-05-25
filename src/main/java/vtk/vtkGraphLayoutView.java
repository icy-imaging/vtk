// java wrapper for vtkGraphLayoutView object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGraphLayoutView extends vtkRenderView
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

  private native void SetVertexLabelArrayName_4(byte[] id0, int len0);
  public void SetVertexLabelArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexLabelArrayName_4(bytes0, bytes0.length);
  }

  private native byte[] GetVertexLabelArrayName_5();
  public String GetVertexLabelArrayName()
  {
    return new String(GetVertexLabelArrayName_5(), StandardCharsets.UTF_8);
  }

  private native void SetEdgeLabelArrayName_6(byte[] id0, int len0);
  public void SetEdgeLabelArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeLabelArrayName_6(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeLabelArrayName_7();
  public String GetEdgeLabelArrayName()
  {
    return new String(GetEdgeLabelArrayName_7(), StandardCharsets.UTF_8);
  }

  private native void SetVertexLabelVisibility_8(boolean id0);
  public void SetVertexLabelVisibility(boolean id0)
  {
    SetVertexLabelVisibility_8(id0);
  }

  private native boolean GetVertexLabelVisibility_9();
  public boolean GetVertexLabelVisibility()
  {
    return GetVertexLabelVisibility_9();
  }

  private native void VertexLabelVisibilityOn_10();
  public void VertexLabelVisibilityOn()
  {
    VertexLabelVisibilityOn_10();
  }

  private native void VertexLabelVisibilityOff_11();
  public void VertexLabelVisibilityOff()
  {
    VertexLabelVisibilityOff_11();
  }

  private native void SetHideVertexLabelsOnInteraction_12(boolean id0);
  public void SetHideVertexLabelsOnInteraction(boolean id0)
  {
    SetHideVertexLabelsOnInteraction_12(id0);
  }

  private native boolean GetHideVertexLabelsOnInteraction_13();
  public boolean GetHideVertexLabelsOnInteraction()
  {
    return GetHideVertexLabelsOnInteraction_13();
  }

  private native void HideVertexLabelsOnInteractionOn_14();
  public void HideVertexLabelsOnInteractionOn()
  {
    HideVertexLabelsOnInteractionOn_14();
  }

  private native void HideVertexLabelsOnInteractionOff_15();
  public void HideVertexLabelsOnInteractionOff()
  {
    HideVertexLabelsOnInteractionOff_15();
  }

  private native void SetEdgeVisibility_16(boolean id0);
  public void SetEdgeVisibility(boolean id0)
  {
    SetEdgeVisibility_16(id0);
  }

  private native boolean GetEdgeVisibility_17();
  public boolean GetEdgeVisibility()
  {
    return GetEdgeVisibility_17();
  }

  private native void EdgeVisibilityOn_18();
  public void EdgeVisibilityOn()
  {
    EdgeVisibilityOn_18();
  }

  private native void EdgeVisibilityOff_19();
  public void EdgeVisibilityOff()
  {
    EdgeVisibilityOff_19();
  }

  private native void SetEdgeLabelVisibility_20(boolean id0);
  public void SetEdgeLabelVisibility(boolean id0)
  {
    SetEdgeLabelVisibility_20(id0);
  }

  private native boolean GetEdgeLabelVisibility_21();
  public boolean GetEdgeLabelVisibility()
  {
    return GetEdgeLabelVisibility_21();
  }

  private native void EdgeLabelVisibilityOn_22();
  public void EdgeLabelVisibilityOn()
  {
    EdgeLabelVisibilityOn_22();
  }

  private native void EdgeLabelVisibilityOff_23();
  public void EdgeLabelVisibilityOff()
  {
    EdgeLabelVisibilityOff_23();
  }

  private native void SetHideEdgeLabelsOnInteraction_24(boolean id0);
  public void SetHideEdgeLabelsOnInteraction(boolean id0)
  {
    SetHideEdgeLabelsOnInteraction_24(id0);
  }

  private native boolean GetHideEdgeLabelsOnInteraction_25();
  public boolean GetHideEdgeLabelsOnInteraction()
  {
    return GetHideEdgeLabelsOnInteraction_25();
  }

  private native void HideEdgeLabelsOnInteractionOn_26();
  public void HideEdgeLabelsOnInteractionOn()
  {
    HideEdgeLabelsOnInteractionOn_26();
  }

  private native void HideEdgeLabelsOnInteractionOff_27();
  public void HideEdgeLabelsOnInteractionOff()
  {
    HideEdgeLabelsOnInteractionOff_27();
  }

  private native void SetVertexColorArrayName_28(byte[] id0, int len0);
  public void SetVertexColorArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexColorArrayName_28(bytes0, bytes0.length);
  }

  private native byte[] GetVertexColorArrayName_29();
  public String GetVertexColorArrayName()
  {
    return new String(GetVertexColorArrayName_29(), StandardCharsets.UTF_8);
  }

  private native void SetColorVertices_30(boolean id0);
  public void SetColorVertices(boolean id0)
  {
    SetColorVertices_30(id0);
  }

  private native boolean GetColorVertices_31();
  public boolean GetColorVertices()
  {
    return GetColorVertices_31();
  }

  private native void ColorVerticesOn_32();
  public void ColorVerticesOn()
  {
    ColorVerticesOn_32();
  }

  private native void ColorVerticesOff_33();
  public void ColorVerticesOff()
  {
    ColorVerticesOff_33();
  }

  private native void SetEdgeColorArrayName_34(byte[] id0, int len0);
  public void SetEdgeColorArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeColorArrayName_34(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeColorArrayName_35();
  public String GetEdgeColorArrayName()
  {
    return new String(GetEdgeColorArrayName_35(), StandardCharsets.UTF_8);
  }

  private native void SetColorEdges_36(boolean id0);
  public void SetColorEdges(boolean id0)
  {
    SetColorEdges_36(id0);
  }

  private native boolean GetColorEdges_37();
  public boolean GetColorEdges()
  {
    return GetColorEdges_37();
  }

  private native void ColorEdgesOn_38();
  public void ColorEdgesOn()
  {
    ColorEdgesOn_38();
  }

  private native void ColorEdgesOff_39();
  public void ColorEdgesOff()
  {
    ColorEdgesOff_39();
  }

  private native void SetEdgeSelection_40(boolean id0);
  public void SetEdgeSelection(boolean id0)
  {
    SetEdgeSelection_40(id0);
  }

  private native boolean GetEdgeSelection_41();
  public boolean GetEdgeSelection()
  {
    return GetEdgeSelection_41();
  }

  private native void EdgeSelectionOn_42();
  public void EdgeSelectionOn()
  {
    EdgeSelectionOn_42();
  }

  private native void EdgeSelectionOff_43();
  public void EdgeSelectionOff()
  {
    EdgeSelectionOff_43();
  }

  private native void SetEnabledEdgesArrayName_44(byte[] id0, int len0);
  public void SetEnabledEdgesArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEnabledEdgesArrayName_44(bytes0, bytes0.length);
  }

  private native byte[] GetEnabledEdgesArrayName_45();
  public String GetEnabledEdgesArrayName()
  {
    return new String(GetEnabledEdgesArrayName_45(), StandardCharsets.UTF_8);
  }

  private native void SetEnableEdgesByArray_46(boolean id0);
  public void SetEnableEdgesByArray(boolean id0)
  {
    SetEnableEdgesByArray_46(id0);
  }

  private native int GetEnableEdgesByArray_47();
  public int GetEnableEdgesByArray()
  {
    return GetEnableEdgesByArray_47();
  }

  private native void SetEnabledVerticesArrayName_48(byte[] id0, int len0);
  public void SetEnabledVerticesArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEnabledVerticesArrayName_48(bytes0, bytes0.length);
  }

  private native byte[] GetEnabledVerticesArrayName_49();
  public String GetEnabledVerticesArrayName()
  {
    return new String(GetEnabledVerticesArrayName_49(), StandardCharsets.UTF_8);
  }

  private native void SetEnableVerticesByArray_50(boolean id0);
  public void SetEnableVerticesByArray(boolean id0)
  {
    SetEnableVerticesByArray_50(id0);
  }

  private native int GetEnableVerticesByArray_51();
  public int GetEnableVerticesByArray()
  {
    return GetEnableVerticesByArray_51();
  }

  private native void SetScalingArrayName_52(byte[] id0, int len0);
  public void SetScalingArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScalingArrayName_52(bytes0, bytes0.length);
  }

  private native byte[] GetScalingArrayName_53();
  public String GetScalingArrayName()
  {
    return new String(GetScalingArrayName_53(), StandardCharsets.UTF_8);
  }

  private native void SetScaledGlyphs_54(boolean id0);
  public void SetScaledGlyphs(boolean id0)
  {
    SetScaledGlyphs_54(id0);
  }

  private native boolean GetScaledGlyphs_55();
  public boolean GetScaledGlyphs()
  {
    return GetScaledGlyphs_55();
  }

  private native void ScaledGlyphsOn_56();
  public void ScaledGlyphsOn()
  {
    ScaledGlyphsOn_56();
  }

  private native void ScaledGlyphsOff_57();
  public void ScaledGlyphsOff()
  {
    ScaledGlyphsOff_57();
  }

  private native void SetLayoutStrategy_58(byte[] id0, int len0);
  public void SetLayoutStrategy(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLayoutStrategy_58(bytes0, bytes0.length);
  }

  private native void SetLayoutStrategyToRandom_59();
  public void SetLayoutStrategyToRandom()
  {
    SetLayoutStrategyToRandom_59();
  }

  private native void SetLayoutStrategyToForceDirected_60();
  public void SetLayoutStrategyToForceDirected()
  {
    SetLayoutStrategyToForceDirected_60();
  }

  private native void SetLayoutStrategyToSimple2D_61();
  public void SetLayoutStrategyToSimple2D()
  {
    SetLayoutStrategyToSimple2D_61();
  }

  private native void SetLayoutStrategyToClustering2D_62();
  public void SetLayoutStrategyToClustering2D()
  {
    SetLayoutStrategyToClustering2D_62();
  }

  private native void SetLayoutStrategyToCommunity2D_63();
  public void SetLayoutStrategyToCommunity2D()
  {
    SetLayoutStrategyToCommunity2D_63();
  }

  private native void SetLayoutStrategyToFast2D_64();
  public void SetLayoutStrategyToFast2D()
  {
    SetLayoutStrategyToFast2D_64();
  }

  private native void SetLayoutStrategyToPassThrough_65();
  public void SetLayoutStrategyToPassThrough()
  {
    SetLayoutStrategyToPassThrough_65();
  }

  private native void SetLayoutStrategyToCircular_66();
  public void SetLayoutStrategyToCircular()
  {
    SetLayoutStrategyToCircular_66();
  }

  private native void SetLayoutStrategyToTree_67();
  public void SetLayoutStrategyToTree()
  {
    SetLayoutStrategyToTree_67();
  }

  private native void SetLayoutStrategyToCosmicTree_68();
  public void SetLayoutStrategyToCosmicTree()
  {
    SetLayoutStrategyToCosmicTree_68();
  }

  private native void SetLayoutStrategyToCone_69();
  public void SetLayoutStrategyToCone()
  {
    SetLayoutStrategyToCone_69();
  }

  private native void SetLayoutStrategyToSpanTree_70();
  public void SetLayoutStrategyToSpanTree()
  {
    SetLayoutStrategyToSpanTree_70();
  }

  private native byte[] GetLayoutStrategyName_71();
  public String GetLayoutStrategyName()
  {
    return new String(GetLayoutStrategyName_71(), StandardCharsets.UTF_8);
  }

  private native long GetLayoutStrategy_72();
  public vtkGraphLayoutStrategy GetLayoutStrategy()
  {
    long temp = GetLayoutStrategy_72();

    if (temp == 0) return null;
    return (vtkGraphLayoutStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLayoutStrategy_73(vtkGraphLayoutStrategy id0);
  public void SetLayoutStrategy(vtkGraphLayoutStrategy id0)
  {
    SetLayoutStrategy_73(id0);
  }

  private native void SetEdgeLayoutStrategy_74(byte[] id0, int len0);
  public void SetEdgeLayoutStrategy(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeLayoutStrategy_74(bytes0, bytes0.length);
  }

  private native void SetEdgeLayoutStrategyToArcParallel_75();
  public void SetEdgeLayoutStrategyToArcParallel()
  {
    SetEdgeLayoutStrategyToArcParallel_75();
  }

  private native void SetEdgeLayoutStrategyToPassThrough_76();
  public void SetEdgeLayoutStrategyToPassThrough()
  {
    SetEdgeLayoutStrategyToPassThrough_76();
  }

  private native byte[] GetEdgeLayoutStrategyName_77();
  public String GetEdgeLayoutStrategyName()
  {
    return new String(GetEdgeLayoutStrategyName_77(), StandardCharsets.UTF_8);
  }

  private native long GetEdgeLayoutStrategy_78();
  public vtkEdgeLayoutStrategy GetEdgeLayoutStrategy()
  {
    long temp = GetEdgeLayoutStrategy_78();

    if (temp == 0) return null;
    return (vtkEdgeLayoutStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetEdgeLayoutStrategy_79(vtkEdgeLayoutStrategy id0);
  public void SetEdgeLayoutStrategy(vtkEdgeLayoutStrategy id0)
  {
    SetEdgeLayoutStrategy_79(id0);
  }

  private native void AddIconType_80(byte[] id0, int len0,int id1);
  public void AddIconType(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddIconType_80(bytes0, bytes0.length,id1);
  }

  private native void ClearIconTypes_81();
  public void ClearIconTypes()
  {
    ClearIconTypes_81();
  }

  private native void SetIconAlignment_82(int id0);
  public void SetIconAlignment(int id0)
  {
    SetIconAlignment_82(id0);
  }

  private native void SetIconVisibility_83(boolean id0);
  public void SetIconVisibility(boolean id0)
  {
    SetIconVisibility_83(id0);
  }

  private native boolean GetIconVisibility_84();
  public boolean GetIconVisibility()
  {
    return GetIconVisibility_84();
  }

  private native void IconVisibilityOn_85();
  public void IconVisibilityOn()
  {
    IconVisibilityOn_85();
  }

  private native void IconVisibilityOff_86();
  public void IconVisibilityOff()
  {
    IconVisibilityOff_86();
  }

  private native void SetIconArrayName_87(byte[] id0, int len0);
  public void SetIconArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetIconArrayName_87(bytes0, bytes0.length);
  }

  private native byte[] GetIconArrayName_88();
  public String GetIconArrayName()
  {
    return new String(GetIconArrayName_88(), StandardCharsets.UTF_8);
  }

  private native void SetGlyphType_89(int id0);
  public void SetGlyphType(int id0)
  {
    SetGlyphType_89(id0);
  }

  private native int GetGlyphType_90();
  public int GetGlyphType()
  {
    return GetGlyphType_90();
  }

  private native void SetVertexLabelFontSize_91(int id0);
  public void SetVertexLabelFontSize(int id0)
  {
    SetVertexLabelFontSize_91(id0);
  }

  private native int GetVertexLabelFontSize_92();
  public int GetVertexLabelFontSize()
  {
    return GetVertexLabelFontSize_92();
  }

  private native void SetEdgeLabelFontSize_93(int id0);
  public void SetEdgeLabelFontSize(int id0)
  {
    SetEdgeLabelFontSize_93(id0);
  }

  private native int GetEdgeLabelFontSize_94();
  public int GetEdgeLabelFontSize()
  {
    return GetEdgeLabelFontSize_94();
  }

  private native void SetEdgeScalarBarVisibility_95(boolean id0);
  public void SetEdgeScalarBarVisibility(boolean id0)
  {
    SetEdgeScalarBarVisibility_95(id0);
  }

  private native boolean GetEdgeScalarBarVisibility_96();
  public boolean GetEdgeScalarBarVisibility()
  {
    return GetEdgeScalarBarVisibility_96();
  }

  private native void SetVertexScalarBarVisibility_97(boolean id0);
  public void SetVertexScalarBarVisibility(boolean id0)
  {
    SetVertexScalarBarVisibility_97(id0);
  }

  private native boolean GetVertexScalarBarVisibility_98();
  public boolean GetVertexScalarBarVisibility()
  {
    return GetVertexScalarBarVisibility_98();
  }

  private native void ZoomToSelection_99();
  public void ZoomToSelection()
  {
    ZoomToSelection_99();
  }

  private native int IsLayoutComplete_100();
  public int IsLayoutComplete()
  {
    return IsLayoutComplete_100();
  }

  private native void UpdateLayout_101();
  public void UpdateLayout()
  {
    UpdateLayout_101();
  }

  public vtkGraphLayoutView() { super(); }

  public vtkGraphLayoutView(long id) { super(id); }
  public native long   VTKInit();

}
