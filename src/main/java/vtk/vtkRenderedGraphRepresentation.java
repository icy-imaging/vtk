// java wrapper for vtkRenderedGraphRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRenderedGraphRepresentation extends vtkRenderedRepresentation
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

  private native void SetVertexLabelPriorityArrayName_6(byte[] id0, int len0);
  public void SetVertexLabelPriorityArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexLabelPriorityArrayName_6(bytes0, bytes0.length);
  }

  private native byte[] GetVertexLabelPriorityArrayName_7();
  public String GetVertexLabelPriorityArrayName()
  {
    return new String(GetVertexLabelPriorityArrayName_7(), StandardCharsets.UTF_8);
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

  private native void SetVertexLabelTextProperty_12(vtkTextProperty id0);
  public void SetVertexLabelTextProperty(vtkTextProperty id0)
  {
    SetVertexLabelTextProperty_12(id0);
  }

  private native long GetVertexLabelTextProperty_13();
  public vtkTextProperty GetVertexLabelTextProperty()
  {
    long temp = GetVertexLabelTextProperty_13();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetVertexHoverArrayName_14(byte[] id0, int len0);
  public void SetVertexHoverArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexHoverArrayName_14(bytes0, bytes0.length);
  }

  private native byte[] GetVertexHoverArrayName_15();
  public String GetVertexHoverArrayName()
  {
    return new String(GetVertexHoverArrayName_15(), StandardCharsets.UTF_8);
  }

  private native void SetHideVertexLabelsOnInteraction_16(boolean id0);
  public void SetHideVertexLabelsOnInteraction(boolean id0)
  {
    SetHideVertexLabelsOnInteraction_16(id0);
  }

  private native boolean GetHideVertexLabelsOnInteraction_17();
  public boolean GetHideVertexLabelsOnInteraction()
  {
    return GetHideVertexLabelsOnInteraction_17();
  }

  private native void HideVertexLabelsOnInteractionOn_18();
  public void HideVertexLabelsOnInteractionOn()
  {
    HideVertexLabelsOnInteractionOn_18();
  }

  private native void HideVertexLabelsOnInteractionOff_19();
  public void HideVertexLabelsOnInteractionOff()
  {
    HideVertexLabelsOnInteractionOff_19();
  }

  private native void SetEdgeLabelArrayName_20(byte[] id0, int len0);
  public void SetEdgeLabelArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeLabelArrayName_20(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeLabelArrayName_21();
  public String GetEdgeLabelArrayName()
  {
    return new String(GetEdgeLabelArrayName_21(), StandardCharsets.UTF_8);
  }

  private native void SetEdgeLabelPriorityArrayName_22(byte[] id0, int len0);
  public void SetEdgeLabelPriorityArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeLabelPriorityArrayName_22(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeLabelPriorityArrayName_23();
  public String GetEdgeLabelPriorityArrayName()
  {
    return new String(GetEdgeLabelPriorityArrayName_23(), StandardCharsets.UTF_8);
  }

  private native void SetEdgeLabelVisibility_24(boolean id0);
  public void SetEdgeLabelVisibility(boolean id0)
  {
    SetEdgeLabelVisibility_24(id0);
  }

  private native boolean GetEdgeLabelVisibility_25();
  public boolean GetEdgeLabelVisibility()
  {
    return GetEdgeLabelVisibility_25();
  }

  private native void EdgeLabelVisibilityOn_26();
  public void EdgeLabelVisibilityOn()
  {
    EdgeLabelVisibilityOn_26();
  }

  private native void EdgeLabelVisibilityOff_27();
  public void EdgeLabelVisibilityOff()
  {
    EdgeLabelVisibilityOff_27();
  }

  private native void SetEdgeLabelTextProperty_28(vtkTextProperty id0);
  public void SetEdgeLabelTextProperty(vtkTextProperty id0)
  {
    SetEdgeLabelTextProperty_28(id0);
  }

  private native long GetEdgeLabelTextProperty_29();
  public vtkTextProperty GetEdgeLabelTextProperty()
  {
    long temp = GetEdgeLabelTextProperty_29();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetEdgeHoverArrayName_30(byte[] id0, int len0);
  public void SetEdgeHoverArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeHoverArrayName_30(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeHoverArrayName_31();
  public String GetEdgeHoverArrayName()
  {
    return new String(GetEdgeHoverArrayName_31(), StandardCharsets.UTF_8);
  }

  private native void SetHideEdgeLabelsOnInteraction_32(boolean id0);
  public void SetHideEdgeLabelsOnInteraction(boolean id0)
  {
    SetHideEdgeLabelsOnInteraction_32(id0);
  }

  private native boolean GetHideEdgeLabelsOnInteraction_33();
  public boolean GetHideEdgeLabelsOnInteraction()
  {
    return GetHideEdgeLabelsOnInteraction_33();
  }

  private native void HideEdgeLabelsOnInteractionOn_34();
  public void HideEdgeLabelsOnInteractionOn()
  {
    HideEdgeLabelsOnInteractionOn_34();
  }

  private native void HideEdgeLabelsOnInteractionOff_35();
  public void HideEdgeLabelsOnInteractionOff()
  {
    HideEdgeLabelsOnInteractionOff_35();
  }

  private native void SetVertexIconArrayName_36(byte[] id0, int len0);
  public void SetVertexIconArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexIconArrayName_36(bytes0, bytes0.length);
  }

  private native byte[] GetVertexIconArrayName_37();
  public String GetVertexIconArrayName()
  {
    return new String(GetVertexIconArrayName_37(), StandardCharsets.UTF_8);
  }

  private native void SetVertexIconPriorityArrayName_38(byte[] id0, int len0);
  public void SetVertexIconPriorityArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexIconPriorityArrayName_38(bytes0, bytes0.length);
  }

  private native byte[] GetVertexIconPriorityArrayName_39();
  public String GetVertexIconPriorityArrayName()
  {
    return new String(GetVertexIconPriorityArrayName_39(), StandardCharsets.UTF_8);
  }

  private native void SetVertexIconVisibility_40(boolean id0);
  public void SetVertexIconVisibility(boolean id0)
  {
    SetVertexIconVisibility_40(id0);
  }

  private native boolean GetVertexIconVisibility_41();
  public boolean GetVertexIconVisibility()
  {
    return GetVertexIconVisibility_41();
  }

  private native void VertexIconVisibilityOn_42();
  public void VertexIconVisibilityOn()
  {
    VertexIconVisibilityOn_42();
  }

  private native void VertexIconVisibilityOff_43();
  public void VertexIconVisibilityOff()
  {
    VertexIconVisibilityOff_43();
  }

  private native void AddVertexIconType_44(byte[] id0, int len0,int id1);
  public void AddVertexIconType(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddVertexIconType_44(bytes0, bytes0.length,id1);
  }

  private native void ClearVertexIconTypes_45();
  public void ClearVertexIconTypes()
  {
    ClearVertexIconTypes_45();
  }

  private native void SetUseVertexIconTypeMap_46(boolean id0);
  public void SetUseVertexIconTypeMap(boolean id0)
  {
    SetUseVertexIconTypeMap_46(id0);
  }

  private native boolean GetUseVertexIconTypeMap_47();
  public boolean GetUseVertexIconTypeMap()
  {
    return GetUseVertexIconTypeMap_47();
  }

  private native void UseVertexIconTypeMapOn_48();
  public void UseVertexIconTypeMapOn()
  {
    UseVertexIconTypeMapOn_48();
  }

  private native void UseVertexIconTypeMapOff_49();
  public void UseVertexIconTypeMapOff()
  {
    UseVertexIconTypeMapOff_49();
  }

  private native void SetVertexIconAlignment_50(int id0);
  public void SetVertexIconAlignment(int id0)
  {
    SetVertexIconAlignment_50(id0);
  }

  private native int GetVertexIconAlignment_51();
  public int GetVertexIconAlignment()
  {
    return GetVertexIconAlignment_51();
  }

  private native void SetVertexSelectedIcon_52(int id0);
  public void SetVertexSelectedIcon(int id0)
  {
    SetVertexSelectedIcon_52(id0);
  }

  private native int GetVertexSelectedIcon_53();
  public int GetVertexSelectedIcon()
  {
    return GetVertexSelectedIcon_53();
  }

  private native void SetVertexDefaultIcon_54(int id0);
  public void SetVertexDefaultIcon(int id0)
  {
    SetVertexDefaultIcon_54(id0);
  }

  private native int GetVertexDefaultIcon_55();
  public int GetVertexDefaultIcon()
  {
    return GetVertexDefaultIcon_55();
  }

  private native void SetVertexIconSelectionMode_56(int id0);
  public void SetVertexIconSelectionMode(int id0)
  {
    SetVertexIconSelectionMode_56(id0);
  }

  private native int GetVertexIconSelectionMode_57();
  public int GetVertexIconSelectionMode()
  {
    return GetVertexIconSelectionMode_57();
  }

  private native void SetVertexIconSelectionModeToSelectedIcon_58();
  public void SetVertexIconSelectionModeToSelectedIcon()
  {
    SetVertexIconSelectionModeToSelectedIcon_58();
  }

  private native void SetVertexIconSelectionModeToSelectedOffset_59();
  public void SetVertexIconSelectionModeToSelectedOffset()
  {
    SetVertexIconSelectionModeToSelectedOffset_59();
  }

  private native void SetVertexIconSelectionModeToAnnotationIcon_60();
  public void SetVertexIconSelectionModeToAnnotationIcon()
  {
    SetVertexIconSelectionModeToAnnotationIcon_60();
  }

  private native void SetVertexIconSelectionModeToIgnoreSelection_61();
  public void SetVertexIconSelectionModeToIgnoreSelection()
  {
    SetVertexIconSelectionModeToIgnoreSelection_61();
  }

  private native void SetEdgeIconArrayName_62(byte[] id0, int len0);
  public void SetEdgeIconArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeIconArrayName_62(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeIconArrayName_63();
  public String GetEdgeIconArrayName()
  {
    return new String(GetEdgeIconArrayName_63(), StandardCharsets.UTF_8);
  }

  private native void SetEdgeIconPriorityArrayName_64(byte[] id0, int len0);
  public void SetEdgeIconPriorityArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeIconPriorityArrayName_64(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeIconPriorityArrayName_65();
  public String GetEdgeIconPriorityArrayName()
  {
    return new String(GetEdgeIconPriorityArrayName_65(), StandardCharsets.UTF_8);
  }

  private native void SetEdgeIconVisibility_66(boolean id0);
  public void SetEdgeIconVisibility(boolean id0)
  {
    SetEdgeIconVisibility_66(id0);
  }

  private native boolean GetEdgeIconVisibility_67();
  public boolean GetEdgeIconVisibility()
  {
    return GetEdgeIconVisibility_67();
  }

  private native void EdgeIconVisibilityOn_68();
  public void EdgeIconVisibilityOn()
  {
    EdgeIconVisibilityOn_68();
  }

  private native void EdgeIconVisibilityOff_69();
  public void EdgeIconVisibilityOff()
  {
    EdgeIconVisibilityOff_69();
  }

  private native void AddEdgeIconType_70(byte[] id0, int len0,int id1);
  public void AddEdgeIconType(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddEdgeIconType_70(bytes0, bytes0.length,id1);
  }

  private native void ClearEdgeIconTypes_71();
  public void ClearEdgeIconTypes()
  {
    ClearEdgeIconTypes_71();
  }

  private native void SetUseEdgeIconTypeMap_72(boolean id0);
  public void SetUseEdgeIconTypeMap(boolean id0)
  {
    SetUseEdgeIconTypeMap_72(id0);
  }

  private native boolean GetUseEdgeIconTypeMap_73();
  public boolean GetUseEdgeIconTypeMap()
  {
    return GetUseEdgeIconTypeMap_73();
  }

  private native void UseEdgeIconTypeMapOn_74();
  public void UseEdgeIconTypeMapOn()
  {
    UseEdgeIconTypeMapOn_74();
  }

  private native void UseEdgeIconTypeMapOff_75();
  public void UseEdgeIconTypeMapOff()
  {
    UseEdgeIconTypeMapOff_75();
  }

  private native void SetEdgeIconAlignment_76(int id0);
  public void SetEdgeIconAlignment(int id0)
  {
    SetEdgeIconAlignment_76(id0);
  }

  private native int GetEdgeIconAlignment_77();
  public int GetEdgeIconAlignment()
  {
    return GetEdgeIconAlignment_77();
  }

  private native void SetColorVerticesByArray_78(boolean id0);
  public void SetColorVerticesByArray(boolean id0)
  {
    SetColorVerticesByArray_78(id0);
  }

  private native boolean GetColorVerticesByArray_79();
  public boolean GetColorVerticesByArray()
  {
    return GetColorVerticesByArray_79();
  }

  private native void ColorVerticesByArrayOn_80();
  public void ColorVerticesByArrayOn()
  {
    ColorVerticesByArrayOn_80();
  }

  private native void ColorVerticesByArrayOff_81();
  public void ColorVerticesByArrayOff()
  {
    ColorVerticesByArrayOff_81();
  }

  private native void SetVertexColorArrayName_82(byte[] id0, int len0);
  public void SetVertexColorArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexColorArrayName_82(bytes0, bytes0.length);
  }

  private native byte[] GetVertexColorArrayName_83();
  public String GetVertexColorArrayName()
  {
    return new String(GetVertexColorArrayName_83(), StandardCharsets.UTF_8);
  }

  private native void SetColorEdgesByArray_84(boolean id0);
  public void SetColorEdgesByArray(boolean id0)
  {
    SetColorEdgesByArray_84(id0);
  }

  private native boolean GetColorEdgesByArray_85();
  public boolean GetColorEdgesByArray()
  {
    return GetColorEdgesByArray_85();
  }

  private native void ColorEdgesByArrayOn_86();
  public void ColorEdgesByArrayOn()
  {
    ColorEdgesByArrayOn_86();
  }

  private native void ColorEdgesByArrayOff_87();
  public void ColorEdgesByArrayOff()
  {
    ColorEdgesByArrayOff_87();
  }

  private native void SetEdgeColorArrayName_88(byte[] id0, int len0);
  public void SetEdgeColorArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeColorArrayName_88(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeColorArrayName_89();
  public String GetEdgeColorArrayName()
  {
    return new String(GetEdgeColorArrayName_89(), StandardCharsets.UTF_8);
  }

  private native void SetEnableVerticesByArray_90(boolean id0);
  public void SetEnableVerticesByArray(boolean id0)
  {
    SetEnableVerticesByArray_90(id0);
  }

  private native boolean GetEnableVerticesByArray_91();
  public boolean GetEnableVerticesByArray()
  {
    return GetEnableVerticesByArray_91();
  }

  private native void EnableVerticesByArrayOn_92();
  public void EnableVerticesByArrayOn()
  {
    EnableVerticesByArrayOn_92();
  }

  private native void EnableVerticesByArrayOff_93();
  public void EnableVerticesByArrayOff()
  {
    EnableVerticesByArrayOff_93();
  }

  private native void SetEnabledVerticesArrayName_94(byte[] id0, int len0);
  public void SetEnabledVerticesArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEnabledVerticesArrayName_94(bytes0, bytes0.length);
  }

  private native byte[] GetEnabledVerticesArrayName_95();
  public String GetEnabledVerticesArrayName()
  {
    return new String(GetEnabledVerticesArrayName_95(), StandardCharsets.UTF_8);
  }

  private native void SetEnableEdgesByArray_96(boolean id0);
  public void SetEnableEdgesByArray(boolean id0)
  {
    SetEnableEdgesByArray_96(id0);
  }

  private native boolean GetEnableEdgesByArray_97();
  public boolean GetEnableEdgesByArray()
  {
    return GetEnableEdgesByArray_97();
  }

  private native void EnableEdgesByArrayOn_98();
  public void EnableEdgesByArrayOn()
  {
    EnableEdgesByArrayOn_98();
  }

  private native void EnableEdgesByArrayOff_99();
  public void EnableEdgesByArrayOff()
  {
    EnableEdgesByArrayOff_99();
  }

  private native void SetEnabledEdgesArrayName_100(byte[] id0, int len0);
  public void SetEnabledEdgesArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEnabledEdgesArrayName_100(bytes0, bytes0.length);
  }

  private native byte[] GetEnabledEdgesArrayName_101();
  public String GetEnabledEdgesArrayName()
  {
    return new String(GetEnabledEdgesArrayName_101(), StandardCharsets.UTF_8);
  }

  private native void SetEdgeVisibility_102(boolean id0);
  public void SetEdgeVisibility(boolean id0)
  {
    SetEdgeVisibility_102(id0);
  }

  private native boolean GetEdgeVisibility_103();
  public boolean GetEdgeVisibility()
  {
    return GetEdgeVisibility_103();
  }

  private native void EdgeVisibilityOn_104();
  public void EdgeVisibilityOn()
  {
    EdgeVisibilityOn_104();
  }

  private native void EdgeVisibilityOff_105();
  public void EdgeVisibilityOff()
  {
    EdgeVisibilityOff_105();
  }

  private native void SetEdgeSelection_106(boolean id0);
  public void SetEdgeSelection(boolean id0)
  {
    SetEdgeSelection_106(id0);
  }

  private native boolean GetEdgeSelection_107();
  public boolean GetEdgeSelection()
  {
    return GetEdgeSelection_107();
  }

  private native void SetLayoutStrategy_108(vtkGraphLayoutStrategy id0);
  public void SetLayoutStrategy(vtkGraphLayoutStrategy id0)
  {
    SetLayoutStrategy_108(id0);
  }

  private native long GetLayoutStrategy_109();
  public vtkGraphLayoutStrategy GetLayoutStrategy()
  {
    long temp = GetLayoutStrategy_109();

    if (temp == 0) return null;
    return (vtkGraphLayoutStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLayoutStrategy_110(byte[] id0, int len0);
  public void SetLayoutStrategy(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLayoutStrategy_110(bytes0, bytes0.length);
  }

  private native byte[] GetLayoutStrategyName_111();
  public String GetLayoutStrategyName()
  {
    return new String(GetLayoutStrategyName_111(), StandardCharsets.UTF_8);
  }

  private native void SetLayoutStrategyToRandom_112();
  public void SetLayoutStrategyToRandom()
  {
    SetLayoutStrategyToRandom_112();
  }

  private native void SetLayoutStrategyToForceDirected_113();
  public void SetLayoutStrategyToForceDirected()
  {
    SetLayoutStrategyToForceDirected_113();
  }

  private native void SetLayoutStrategyToSimple2D_114();
  public void SetLayoutStrategyToSimple2D()
  {
    SetLayoutStrategyToSimple2D_114();
  }

  private native void SetLayoutStrategyToClustering2D_115();
  public void SetLayoutStrategyToClustering2D()
  {
    SetLayoutStrategyToClustering2D_115();
  }

  private native void SetLayoutStrategyToCommunity2D_116();
  public void SetLayoutStrategyToCommunity2D()
  {
    SetLayoutStrategyToCommunity2D_116();
  }

  private native void SetLayoutStrategyToFast2D_117();
  public void SetLayoutStrategyToFast2D()
  {
    SetLayoutStrategyToFast2D_117();
  }

  private native void SetLayoutStrategyToPassThrough_118();
  public void SetLayoutStrategyToPassThrough()
  {
    SetLayoutStrategyToPassThrough_118();
  }

  private native void SetLayoutStrategyToCircular_119();
  public void SetLayoutStrategyToCircular()
  {
    SetLayoutStrategyToCircular_119();
  }

  private native void SetLayoutStrategyToTree_120();
  public void SetLayoutStrategyToTree()
  {
    SetLayoutStrategyToTree_120();
  }

  private native void SetLayoutStrategyToCosmicTree_121();
  public void SetLayoutStrategyToCosmicTree()
  {
    SetLayoutStrategyToCosmicTree_121();
  }

  private native void SetLayoutStrategyToCone_122();
  public void SetLayoutStrategyToCone()
  {
    SetLayoutStrategyToCone_122();
  }

  private native void SetLayoutStrategyToSpanTree_123();
  public void SetLayoutStrategyToSpanTree()
  {
    SetLayoutStrategyToSpanTree_123();
  }

  private native void SetLayoutStrategyToAssignCoordinates_124(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2);
  public void SetLayoutStrategyToAssignCoordinates(String id0,String id1,String id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetLayoutStrategyToAssignCoordinates_124(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  private native void SetLayoutStrategyToTree_125(boolean id0,double id1,double id2,double id3);
  public void SetLayoutStrategyToTree(boolean id0,double id1,double id2,double id3)
  {
    SetLayoutStrategyToTree_125(id0,id1,id2,id3);
  }

  private native void SetLayoutStrategyToCosmicTree_126(byte[] id0, int len0,boolean id1,int id2,long id3);
  public void SetLayoutStrategyToCosmicTree(String id0,boolean id1,int id2,long id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLayoutStrategyToCosmicTree_126(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void SetEdgeLayoutStrategy_127(vtkEdgeLayoutStrategy id0);
  public void SetEdgeLayoutStrategy(vtkEdgeLayoutStrategy id0)
  {
    SetEdgeLayoutStrategy_127(id0);
  }

  private native long GetEdgeLayoutStrategy_128();
  public vtkEdgeLayoutStrategy GetEdgeLayoutStrategy()
  {
    long temp = GetEdgeLayoutStrategy_128();

    if (temp == 0) return null;
    return (vtkEdgeLayoutStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetEdgeLayoutStrategyToArcParallel_129();
  public void SetEdgeLayoutStrategyToArcParallel()
  {
    SetEdgeLayoutStrategyToArcParallel_129();
  }

  private native void SetEdgeLayoutStrategyToPassThrough_130();
  public void SetEdgeLayoutStrategyToPassThrough()
  {
    SetEdgeLayoutStrategyToPassThrough_130();
  }

  private native void SetEdgeLayoutStrategyToGeo_131(double id0);
  public void SetEdgeLayoutStrategyToGeo(double id0)
  {
    SetEdgeLayoutStrategyToGeo_131(id0);
  }

  private native void SetEdgeLayoutStrategy_132(byte[] id0, int len0);
  public void SetEdgeLayoutStrategy(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeLayoutStrategy_132(bytes0, bytes0.length);
  }

  private native byte[] GetEdgeLayoutStrategyName_133();
  public String GetEdgeLayoutStrategyName()
  {
    return new String(GetEdgeLayoutStrategyName_133(), StandardCharsets.UTF_8);
  }

  private native void ApplyViewTheme_134(vtkViewTheme id0);
  public void ApplyViewTheme(vtkViewTheme id0)
  {
    ApplyViewTheme_134(id0);
  }

  private native void SetGlyphType_135(int id0);
  public void SetGlyphType(int id0)
  {
    SetGlyphType_135(id0);
  }

  private native int GetGlyphType_136();
  public int GetGlyphType()
  {
    return GetGlyphType_136();
  }

  private native void SetScaling_137(boolean id0);
  public void SetScaling(boolean id0)
  {
    SetScaling_137(id0);
  }

  private native boolean GetScaling_138();
  public boolean GetScaling()
  {
    return GetScaling_138();
  }

  private native void ScalingOn_139();
  public void ScalingOn()
  {
    ScalingOn_139();
  }

  private native void ScalingOff_140();
  public void ScalingOff()
  {
    ScalingOff_140();
  }

  private native void SetScalingArrayName_141(byte[] id0, int len0);
  public void SetScalingArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScalingArrayName_141(bytes0, bytes0.length);
  }

  private native byte[] GetScalingArrayName_142();
  public String GetScalingArrayName()
  {
    return new String(GetScalingArrayName_142(), StandardCharsets.UTF_8);
  }

  private native void SetVertexScalarBarVisibility_143(boolean id0);
  public void SetVertexScalarBarVisibility(boolean id0)
  {
    SetVertexScalarBarVisibility_143(id0);
  }

  private native boolean GetVertexScalarBarVisibility_144();
  public boolean GetVertexScalarBarVisibility()
  {
    return GetVertexScalarBarVisibility_144();
  }

  private native void SetEdgeScalarBarVisibility_145(boolean id0);
  public void SetEdgeScalarBarVisibility(boolean id0)
  {
    SetEdgeScalarBarVisibility_145(id0);
  }

  private native boolean GetEdgeScalarBarVisibility_146();
  public boolean GetEdgeScalarBarVisibility()
  {
    return GetEdgeScalarBarVisibility_146();
  }

  private native long GetVertexScalarBar_147();
  public vtkScalarBarWidget GetVertexScalarBar()
  {
    long temp = GetVertexScalarBar_147();

    if (temp == 0) return null;
    return (vtkScalarBarWidget)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeScalarBar_148();
  public vtkScalarBarWidget GetEdgeScalarBar()
  {
    long temp = GetEdgeScalarBar_148();

    if (temp == 0) return null;
    return (vtkScalarBarWidget)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean IsLayoutComplete_149();
  public boolean IsLayoutComplete()
  {
    return IsLayoutComplete_149();
  }

  private native void UpdateLayout_150();
  public void UpdateLayout()
  {
    UpdateLayout_150();
  }

  private native void ComputeSelectedGraphBounds_151(double id0[]);
  public void ComputeSelectedGraphBounds(double id0[])
  {
    ComputeSelectedGraphBounds_151(id0);
  }

  public vtkRenderedGraphRepresentation() { super(); }

  public vtkRenderedGraphRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
