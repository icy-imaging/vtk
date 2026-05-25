// java wrapper for vtkSelectionSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSelectionSource extends vtkSelectionAlgorithm
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

  private native void SetNumberOfNodes_4(int id0);
  public void SetNumberOfNodes(int id0)
  {
    SetNumberOfNodes_4(id0);
  }

  private native int GetNumberOfNodes_5();
  public int GetNumberOfNodes()
  {
    return GetNumberOfNodes_5();
  }

  private native void RemoveNode_6(int id0);
  public void RemoveNode(int id0)
  {
    RemoveNode_6(id0);
  }

  private native void RemoveNode_7(byte[] id0, int len0);
  public void RemoveNode(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveNode_7(bytes0, bytes0.length);
  }

  private native void RemoveAllNodes_8();
  public void RemoveAllNodes()
  {
    RemoveAllNodes_8();
  }

  private native void SetExpression_9(byte[] id0, int len0);
  public void SetExpression(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetExpression_9(bytes0, bytes0.length);
  }

  private native byte[] GetExpression_10();
  public String GetExpression()
  {
    return new String(GetExpression_10(), StandardCharsets.UTF_8);
  }

  private native void SetFieldTypeOption_11(int id0);
  public void SetFieldTypeOption(int id0)
  {
    SetFieldTypeOption_11(id0);
  }

  private native int GetFieldTypeOptionMinValue_12();
  public int GetFieldTypeOptionMinValue()
  {
    return GetFieldTypeOptionMinValue_12();
  }

  private native int GetFieldTypeOptionMaxValue_13();
  public int GetFieldTypeOptionMaxValue()
  {
    return GetFieldTypeOptionMaxValue_13();
  }

  private native void SetFieldTypeOptionToFieldType_14();
  public void SetFieldTypeOptionToFieldType()
  {
    SetFieldTypeOptionToFieldType_14();
  }

  private native void SetFieldTypeOptionToElementType_15();
  public void SetFieldTypeOptionToElementType()
  {
    SetFieldTypeOptionToElementType_15();
  }

  private native int GetFieldTypeOption_16();
  public int GetFieldTypeOption()
  {
    return GetFieldTypeOption_16();
  }

  private native void SetFieldType_17(int id0);
  public void SetFieldType(int id0)
  {
    SetFieldType_17(id0);
  }

  private native int GetFieldTypeMinValue_18();
  public int GetFieldTypeMinValue()
  {
    return GetFieldTypeMinValue_18();
  }

  private native int GetFieldTypeMaxValue_19();
  public int GetFieldTypeMaxValue()
  {
    return GetFieldTypeMaxValue_19();
  }

  private native int GetFieldType_20();
  public int GetFieldType()
  {
    return GetFieldType_20();
  }

  private native void SetElementType_21(int id0);
  public void SetElementType(int id0)
  {
    SetElementType_21(id0);
  }

  private native int GetElementTypeMinValue_22();
  public int GetElementTypeMinValue()
  {
    return GetElementTypeMinValue_22();
  }

  private native int GetElementTypeMaxValue_23();
  public int GetElementTypeMaxValue()
  {
    return GetElementTypeMaxValue_23();
  }

  private native int GetElementType_24();
  public int GetElementType()
  {
    return GetElementType_24();
  }

  private native void SetProcessID_25(int id0);
  public void SetProcessID(int id0)
  {
    SetProcessID_25(id0);
  }

  private native int GetProcessIDMinValue_26();
  public int GetProcessIDMinValue()
  {
    return GetProcessIDMinValue_26();
  }

  private native int GetProcessIDMaxValue_27();
  public int GetProcessIDMaxValue()
  {
    return GetProcessIDMaxValue_27();
  }

  private native int GetProcessID_28();
  public int GetProcessID()
  {
    return GetProcessID_28();
  }

  private native void SetNodeName_29(int id0,byte[] id1, int len1);
  public void SetNodeName(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetNodeName_29(id0,bytes1, bytes1.length);
  }

  private native void SetNodeName_30(byte[] id0, int len0);
  public void SetNodeName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNodeName_30(bytes0, bytes0.length);
  }

  private native byte[] GetNodeName_31(int id0);
  public String GetNodeName(int id0)
  {
    return new String(GetNodeName_31(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetNodeName_32();
  public String GetNodeName()
  {
    return new String(GetNodeName_32(), StandardCharsets.UTF_8);
  }

  private native void AddID_33(int id0,long id1,long id2);
  public void AddID(int id0,long id1,long id2)
  {
    AddID_33(id0,id1,id2);
  }

  private native void AddID_34(long id0,long id1);
  public void AddID(long id0,long id1)
  {
    AddID_34(id0,id1);
  }

  private native void AddStringID_35(int id0,long id1,byte[] id2, int len2);
  public void AddStringID(int id0,long id1,String id2)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    AddStringID_35(id0,id1,bytes2, bytes2.length);
  }

  private native void AddStringID_36(long id0,byte[] id1, int len1);
  public void AddStringID(long id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddStringID_36(id0,bytes1, bytes1.length);
  }

  private native void AddLocation_37(int id0,double id1,double id2,double id3);
  public void AddLocation(int id0,double id1,double id2,double id3)
  {
    AddLocation_37(id0,id1,id2,id3);
  }

  private native void AddLocation_38(double id0,double id1,double id2);
  public void AddLocation(double id0,double id1,double id2)
  {
    AddLocation_38(id0,id1,id2);
  }

  private native void AddThreshold_39(int id0,double id1,double id2);
  public void AddThreshold(int id0,double id1,double id2)
  {
    AddThreshold_39(id0,id1,id2);
  }

  private native void AddThreshold_40(double id0,double id1);
  public void AddThreshold(double id0,double id1)
  {
    AddThreshold_40(id0,id1);
  }

  private native void AddBlock_41(int id0,long id1);
  public void AddBlock(int id0,long id1)
  {
    AddBlock_41(id0,id1);
  }

  private native void AddBlock_42(long id0);
  public void AddBlock(long id0)
  {
    AddBlock_42(id0);
  }

  private native void AddBlockSelector_43(int id0,byte[] id1, int len1);
  public void AddBlockSelector(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddBlockSelector_43(id0,bytes1, bytes1.length);
  }

  private native void AddBlockSelector_44(byte[] id0, int len0);
  public void AddBlockSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddBlockSelector_44(bytes0, bytes0.length);
  }

  private native void RemoveAllBlockSelectors_45(int id0);
  public void RemoveAllBlockSelectors(int id0)
  {
    RemoveAllBlockSelectors_45(id0);
  }

  private native void RemoveAllBlockSelectors_46();
  public void RemoveAllBlockSelectors()
  {
    RemoveAllBlockSelectors_46();
  }

  private native void RemoveAllIDs_47(int id0);
  public void RemoveAllIDs(int id0)
  {
    RemoveAllIDs_47(id0);
  }

  private native void RemoveAllIDs_48();
  public void RemoveAllIDs()
  {
    RemoveAllIDs_48();
  }

  private native void RemoveAllStringIDs_49(int id0);
  public void RemoveAllStringIDs(int id0)
  {
    RemoveAllStringIDs_49(id0);
  }

  private native void RemoveAllStringIDs_50();
  public void RemoveAllStringIDs()
  {
    RemoveAllStringIDs_50();
  }

  private native void RemoveAllThresholds_51(int id0);
  public void RemoveAllThresholds(int id0)
  {
    RemoveAllThresholds_51(id0);
  }

  private native void RemoveAllThresholds_52();
  public void RemoveAllThresholds()
  {
    RemoveAllThresholds_52();
  }

  private native void RemoveAllLocations_53(int id0);
  public void RemoveAllLocations(int id0)
  {
    RemoveAllLocations_53(id0);
  }

  private native void RemoveAllLocations_54();
  public void RemoveAllLocations()
  {
    RemoveAllLocations_54();
  }

  private native void RemoveAllBlocks_55(int id0);
  public void RemoveAllBlocks(int id0)
  {
    RemoveAllBlocks_55(id0);
  }

  private native void RemoveAllBlocks_56();
  public void RemoveAllBlocks()
  {
    RemoveAllBlocks_56();
  }

  private native void SetContentType_57(int id0,int id1);
  public void SetContentType(int id0,int id1)
  {
    SetContentType_57(id0,id1);
  }

  private native void SetContentType_58(int id0);
  public void SetContentType(int id0)
  {
    SetContentType_58(id0);
  }

  private native int GetContentTypeMinValue_59();
  public int GetContentTypeMinValue()
  {
    return GetContentTypeMinValue_59();
  }

  private native int GetContentTypeMaxValue_60();
  public int GetContentTypeMaxValue()
  {
    return GetContentTypeMaxValue_60();
  }

  private native int GetContentType_61(int id0);
  public int GetContentType(int id0)
  {
    return GetContentType_61(id0);
  }

  private native int GetContentType_62();
  public int GetContentType()
  {
    return GetContentType_62();
  }

  private native void SetContainingCells_63(int id0,int id1);
  public void SetContainingCells(int id0,int id1)
  {
    SetContainingCells_63(id0,id1);
  }

  private native void SetContainingCells_64(int id0);
  public void SetContainingCells(int id0)
  {
    SetContainingCells_64(id0);
  }

  private native int GetContainingCells_65(int id0);
  public int GetContainingCells(int id0)
  {
    return GetContainingCells_65(id0);
  }

  private native int GetContainingCells_66();
  public int GetContainingCells()
  {
    return GetContainingCells_66();
  }

  private native void SetNumberOfLayers_67(int id0,int id1);
  public void SetNumberOfLayers(int id0,int id1)
  {
    SetNumberOfLayers_67(id0,id1);
  }

  private native void SetNumberOfLayers_68(int id0);
  public void SetNumberOfLayers(int id0)
  {
    SetNumberOfLayers_68(id0);
  }

  private native int GetNumberOfLayersMinValue_69();
  public int GetNumberOfLayersMinValue()
  {
    return GetNumberOfLayersMinValue_69();
  }

  private native int GetNumberOfLayersMaxValue_70();
  public int GetNumberOfLayersMaxValue()
  {
    return GetNumberOfLayersMaxValue_70();
  }

  private native int GetNumberOfLayers_71(int id0);
  public int GetNumberOfLayers(int id0)
  {
    return GetNumberOfLayers_71(id0);
  }

  private native int GetNumberOfLayers_72();
  public int GetNumberOfLayers()
  {
    return GetNumberOfLayers_72();
  }

  private native void SetRemoveSeed_73(int id0,boolean id1);
  public void SetRemoveSeed(int id0,boolean id1)
  {
    SetRemoveSeed_73(id0,id1);
  }

  private native void SetRemoveSeed_74(boolean id0);
  public void SetRemoveSeed(boolean id0)
  {
    SetRemoveSeed_74(id0);
  }

  private native boolean GetRemoveSeed_75(int id0);
  public boolean GetRemoveSeed(int id0)
  {
    return GetRemoveSeed_75(id0);
  }

  private native boolean GetRemoveSeed_76();
  public boolean GetRemoveSeed()
  {
    return GetRemoveSeed_76();
  }

  private native void SetRemoveIntermediateLayers_77(int id0,boolean id1);
  public void SetRemoveIntermediateLayers(int id0,boolean id1)
  {
    SetRemoveIntermediateLayers_77(id0,id1);
  }

  private native void SetRemoveIntermediateLayers_78(boolean id0);
  public void SetRemoveIntermediateLayers(boolean id0)
  {
    SetRemoveIntermediateLayers_78(id0);
  }

  private native boolean GetRemoveIntermediateLayers_79(int id0);
  public boolean GetRemoveIntermediateLayers(int id0)
  {
    return GetRemoveIntermediateLayers_79(id0);
  }

  private native boolean GetRemoveIntermediateLayers_80();
  public boolean GetRemoveIntermediateLayers()
  {
    return GetRemoveIntermediateLayers_80();
  }

  private native void SetInverse_81(int id0,int id1);
  public void SetInverse(int id0,int id1)
  {
    SetInverse_81(id0,id1);
  }

  private native void SetInverse_82(int id0);
  public void SetInverse(int id0)
  {
    SetInverse_82(id0);
  }

  private native int GetInverse_83(int id0);
  public int GetInverse(int id0)
  {
    return GetInverse_83(id0);
  }

  private native int GetInverse_84();
  public int GetInverse()
  {
    return GetInverse_84();
  }

  private native void SetArrayName_85(int id0,byte[] id1, int len1);
  public void SetArrayName(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetArrayName_85(id0,bytes1, bytes1.length);
  }

  private native void SetArrayName_86(byte[] id0, int len0);
  public void SetArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetArrayName_86(bytes0, bytes0.length);
  }

  private native byte[] GetArrayName_87(int id0);
  public String GetArrayName(int id0)
  {
    return new String(GetArrayName_87(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetArrayName_88();
  public String GetArrayName()
  {
    return new String(GetArrayName_88(), StandardCharsets.UTF_8);
  }

  private native void SetArrayComponent_89(int id0,int id1);
  public void SetArrayComponent(int id0,int id1)
  {
    SetArrayComponent_89(id0,id1);
  }

  private native void SetArrayComponent_90(int id0);
  public void SetArrayComponent(int id0)
  {
    SetArrayComponent_90(id0);
  }

  private native int GetArrayComponent_91(int id0);
  public int GetArrayComponent(int id0)
  {
    return GetArrayComponent_91(id0);
  }

  private native int GetArrayComponent_92();
  public int GetArrayComponent()
  {
    return GetArrayComponent_92();
  }

  private native void SetCompositeIndex_93(int id0,int id1);
  public void SetCompositeIndex(int id0,int id1)
  {
    SetCompositeIndex_93(id0,id1);
  }

  private native void SetCompositeIndex_94(int id0);
  public void SetCompositeIndex(int id0)
  {
    SetCompositeIndex_94(id0);
  }

  private native int GetCompositeIndex_95(int id0);
  public int GetCompositeIndex(int id0)
  {
    return GetCompositeIndex_95(id0);
  }

  private native int GetCompositeIndex_96();
  public int GetCompositeIndex()
  {
    return GetCompositeIndex_96();
  }

  private native void SetHierarchicalLevel_97(int id0,int id1);
  public void SetHierarchicalLevel(int id0,int id1)
  {
    SetHierarchicalLevel_97(id0,id1);
  }

  private native void SetHierarchicalLevel_98(int id0);
  public void SetHierarchicalLevel(int id0)
  {
    SetHierarchicalLevel_98(id0);
  }

  private native int GetHierarchicalLevel_99(int id0);
  public int GetHierarchicalLevel(int id0)
  {
    return GetHierarchicalLevel_99(id0);
  }

  private native int GetHierarchicalLevel_100();
  public int GetHierarchicalLevel()
  {
    return GetHierarchicalLevel_100();
  }

  private native void SetHierarchicalIndex_101(int id0,int id1);
  public void SetHierarchicalIndex(int id0,int id1)
  {
    SetHierarchicalIndex_101(id0,id1);
  }

  private native void SetHierarchicalIndex_102(int id0);
  public void SetHierarchicalIndex(int id0)
  {
    SetHierarchicalIndex_102(id0);
  }

  private native int GetHierarchicalIndex_103(int id0);
  public int GetHierarchicalIndex(int id0)
  {
    return GetHierarchicalIndex_103(id0);
  }

  private native int GetHierarchicalIndex_104();
  public int GetHierarchicalIndex()
  {
    return GetHierarchicalIndex_104();
  }

  private native void SetAssemblyName_105(int id0,byte[] id1, int len1);
  public void SetAssemblyName(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetAssemblyName_105(id0,bytes1, bytes1.length);
  }

  private native void SetAssemblyName_106(byte[] id0, int len0);
  public void SetAssemblyName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAssemblyName_106(bytes0, bytes0.length);
  }

  private native byte[] GetAssemblyName_107(int id0);
  public String GetAssemblyName(int id0)
  {
    return new String(GetAssemblyName_107(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetAssemblyName_108();
  public String GetAssemblyName()
  {
    return new String(GetAssemblyName_108(), StandardCharsets.UTF_8);
  }

  private native void AddSelector_109(int id0,byte[] id1, int len1);
  public void AddSelector(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddSelector_109(id0,bytes1, bytes1.length);
  }

  private native void AddSelector_110(byte[] id0, int len0);
  public void AddSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddSelector_110(bytes0, bytes0.length);
  }

  private native void RemoveAllSelectors_111(int id0);
  public void RemoveAllSelectors(int id0)
  {
    RemoveAllSelectors_111(id0);
  }

  private native void RemoveAllSelectors_112();
  public void RemoveAllSelectors()
  {
    RemoveAllSelectors_112();
  }

  private native void SetQueryString_113(int id0,byte[] id1, int len1);
  public void SetQueryString(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetQueryString_113(id0,bytes1, bytes1.length);
  }

  private native void SetQueryString_114(byte[] id0, int len0);
  public void SetQueryString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetQueryString_114(bytes0, bytes0.length);
  }

  private native byte[] GetQueryString_115(int id0);
  public String GetQueryString(int id0)
  {
    return new String(GetQueryString_115(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetQueryString_116();
  public String GetQueryString()
  {
    return new String(GetQueryString_116(), StandardCharsets.UTF_8);
  }

  public vtkSelectionSource() { super(); }

  public vtkSelectionSource(long id) { super(id); }
  public native long   VTKInit();

}
