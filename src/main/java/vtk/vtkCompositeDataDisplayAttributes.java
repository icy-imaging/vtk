// java wrapper for vtkCompositeDataDisplayAttributes object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCompositeDataDisplayAttributes extends vtkObject
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

  private native boolean HasBlockVisibilities_4();
  public boolean HasBlockVisibilities()
  {
    return HasBlockVisibilities_4();
  }

  private native void SetBlockVisibility_5(vtkDataObject id0,boolean id1);
  public void SetBlockVisibility(vtkDataObject id0,boolean id1)
  {
    SetBlockVisibility_5(id0,id1);
  }

  private native boolean GetBlockVisibility_6(vtkDataObject id0);
  public boolean GetBlockVisibility(vtkDataObject id0)
  {
    return GetBlockVisibility_6(id0);
  }

  private native boolean HasBlockVisibility_7(vtkDataObject id0);
  public boolean HasBlockVisibility(vtkDataObject id0)
  {
    return HasBlockVisibility_7(id0);
  }

  private native void RemoveBlockVisibility_8(vtkDataObject id0);
  public void RemoveBlockVisibility(vtkDataObject id0)
  {
    RemoveBlockVisibility_8(id0);
  }

  private native void RemoveBlockVisibilities_9();
  public void RemoveBlockVisibilities()
  {
    RemoveBlockVisibilities_9();
  }

  private native boolean HasBlockPickabilities_10();
  public boolean HasBlockPickabilities()
  {
    return HasBlockPickabilities_10();
  }

  private native void SetBlockPickability_11(vtkDataObject id0,boolean id1);
  public void SetBlockPickability(vtkDataObject id0,boolean id1)
  {
    SetBlockPickability_11(id0,id1);
  }

  private native boolean GetBlockPickability_12(vtkDataObject id0);
  public boolean GetBlockPickability(vtkDataObject id0)
  {
    return GetBlockPickability_12(id0);
  }

  private native boolean HasBlockPickability_13(vtkDataObject id0);
  public boolean HasBlockPickability(vtkDataObject id0)
  {
    return HasBlockPickability_13(id0);
  }

  private native void RemoveBlockPickability_14(vtkDataObject id0);
  public void RemoveBlockPickability(vtkDataObject id0)
  {
    RemoveBlockPickability_14(id0);
  }

  private native void RemoveBlockPickabilities_15();
  public void RemoveBlockPickabilities()
  {
    RemoveBlockPickabilities_15();
  }

  private native void SetBlockScalarVisibility_16(vtkDataObject id0,boolean id1);
  public void SetBlockScalarVisibility(vtkDataObject id0,boolean id1)
  {
    SetBlockScalarVisibility_16(id0,id1);
  }

  private native boolean GetBlockScalarVisibility_17(vtkDataObject id0);
  public boolean GetBlockScalarVisibility(vtkDataObject id0)
  {
    return GetBlockScalarVisibility_17(id0);
  }

  private native boolean HasBlockScalarVisibility_18(vtkDataObject id0);
  public boolean HasBlockScalarVisibility(vtkDataObject id0)
  {
    return HasBlockScalarVisibility_18(id0);
  }

  private native boolean HasBlockScalarVisibilities_19();
  public boolean HasBlockScalarVisibilities()
  {
    return HasBlockScalarVisibilities_19();
  }

  private native void RemoveBlockScalarVisibility_20(vtkDataObject id0);
  public void RemoveBlockScalarVisibility(vtkDataObject id0)
  {
    RemoveBlockScalarVisibility_20(id0);
  }

  private native void RemoveBlockScalarVisibilities_21();
  public void RemoveBlockScalarVisibilities()
  {
    RemoveBlockScalarVisibilities_21();
  }

  private native void SetBlockUseLookupTableScalarRange_22(vtkDataObject id0,boolean id1);
  public void SetBlockUseLookupTableScalarRange(vtkDataObject id0,boolean id1)
  {
    SetBlockUseLookupTableScalarRange_22(id0,id1);
  }

  private native boolean GetBlockUseLookupTableScalarRange_23(vtkDataObject id0);
  public boolean GetBlockUseLookupTableScalarRange(vtkDataObject id0)
  {
    return GetBlockUseLookupTableScalarRange_23(id0);
  }

  private native boolean HasBlockUseLookupTableScalarRange_24(vtkDataObject id0);
  public boolean HasBlockUseLookupTableScalarRange(vtkDataObject id0)
  {
    return HasBlockUseLookupTableScalarRange_24(id0);
  }

  private native boolean HasBlockUseLookupTableScalarRanges_25();
  public boolean HasBlockUseLookupTableScalarRanges()
  {
    return HasBlockUseLookupTableScalarRanges_25();
  }

  private native void RemoveBlockUseLookupTableScalarRange_26(vtkDataObject id0);
  public void RemoveBlockUseLookupTableScalarRange(vtkDataObject id0)
  {
    RemoveBlockUseLookupTableScalarRange_26(id0);
  }

  private native void RemoveBlockUseLookupTableScalarRanges_27();
  public void RemoveBlockUseLookupTableScalarRanges()
  {
    RemoveBlockUseLookupTableScalarRanges_27();
  }

  private native void SetBlockInterpolateScalarsBeforeMapping_28(vtkDataObject id0,boolean id1);
  public void SetBlockInterpolateScalarsBeforeMapping(vtkDataObject id0,boolean id1)
  {
    SetBlockInterpolateScalarsBeforeMapping_28(id0,id1);
  }

  private native boolean GetBlockInterpolateScalarsBeforeMapping_29(vtkDataObject id0);
  public boolean GetBlockInterpolateScalarsBeforeMapping(vtkDataObject id0)
  {
    return GetBlockInterpolateScalarsBeforeMapping_29(id0);
  }

  private native boolean HasBlockInterpolateScalarsBeforeMapping_30(vtkDataObject id0);
  public boolean HasBlockInterpolateScalarsBeforeMapping(vtkDataObject id0)
  {
    return HasBlockInterpolateScalarsBeforeMapping_30(id0);
  }

  private native boolean HasBlockInterpolateScalarsBeforeMappings_31();
  public boolean HasBlockInterpolateScalarsBeforeMappings()
  {
    return HasBlockInterpolateScalarsBeforeMappings_31();
  }

  private native void RemoveBlockInterpolateScalarsBeforeMapping_32(vtkDataObject id0);
  public void RemoveBlockInterpolateScalarsBeforeMapping(vtkDataObject id0)
  {
    RemoveBlockInterpolateScalarsBeforeMapping_32(id0);
  }

  private native void RemoveBlockInterpolateScalarsBeforeMappings_33();
  public void RemoveBlockInterpolateScalarsBeforeMappings()
  {
    RemoveBlockInterpolateScalarsBeforeMappings_33();
  }

  private native void SetBlockColor_34(vtkDataObject id0,double id1[]);
  public void SetBlockColor(vtkDataObject id0,double id1[])
  {
    SetBlockColor_34(id0,id1);
  }

  private native void GetBlockColor_35(vtkDataObject id0,double id1[]);
  public void GetBlockColor(vtkDataObject id0,double id1[])
  {
    GetBlockColor_35(id0,id1);
  }

  private native boolean HasBlockColors_36();
  public boolean HasBlockColors()
  {
    return HasBlockColors_36();
  }

  private native boolean HasBlockColor_37(vtkDataObject id0);
  public boolean HasBlockColor(vtkDataObject id0)
  {
    return HasBlockColor_37(id0);
  }

  private native void RemoveBlockColor_38(vtkDataObject id0);
  public void RemoveBlockColor(vtkDataObject id0)
  {
    RemoveBlockColor_38(id0);
  }

  private native void RemoveBlockColors_39();
  public void RemoveBlockColors()
  {
    RemoveBlockColors_39();
  }

  private native void SetBlockOpacity_40(vtkDataObject id0,double id1);
  public void SetBlockOpacity(vtkDataObject id0,double id1)
  {
    SetBlockOpacity_40(id0,id1);
  }

  private native double GetBlockOpacity_41(vtkDataObject id0);
  public double GetBlockOpacity(vtkDataObject id0)
  {
    return GetBlockOpacity_41(id0);
  }

  private native boolean HasBlockOpacities_42();
  public boolean HasBlockOpacities()
  {
    return HasBlockOpacities_42();
  }

  private native boolean HasBlockOpacity_43(vtkDataObject id0);
  public boolean HasBlockOpacity(vtkDataObject id0)
  {
    return HasBlockOpacity_43(id0);
  }

  private native void RemoveBlockOpacity_44(vtkDataObject id0);
  public void RemoveBlockOpacity(vtkDataObject id0)
  {
    RemoveBlockOpacity_44(id0);
  }

  private native void RemoveBlockOpacities_45();
  public void RemoveBlockOpacities()
  {
    RemoveBlockOpacities_45();
  }

  private native void SetBlockMaterial_46(vtkDataObject id0,byte[] id1, int len1);
  public void SetBlockMaterial(vtkDataObject id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetBlockMaterial_46(id0,bytes1, bytes1.length);
  }

  private native byte[] GetBlockMaterial_47(vtkDataObject id0);
  public String GetBlockMaterial(vtkDataObject id0)
  {
    return new String(GetBlockMaterial_47(id0), StandardCharsets.UTF_8);
  }

  private native boolean HasBlockMaterials_48();
  public boolean HasBlockMaterials()
  {
    return HasBlockMaterials_48();
  }

  private native boolean HasBlockMaterial_49(vtkDataObject id0);
  public boolean HasBlockMaterial(vtkDataObject id0)
  {
    return HasBlockMaterial_49(id0);
  }

  private native void RemoveBlockMaterial_50(vtkDataObject id0);
  public void RemoveBlockMaterial(vtkDataObject id0)
  {
    RemoveBlockMaterial_50(id0);
  }

  private native void RemoveBlockMaterials_51();
  public void RemoveBlockMaterials()
  {
    RemoveBlockMaterials_51();
  }

  private native void SetBlockColorMode_52(vtkDataObject id0,int id1);
  public void SetBlockColorMode(vtkDataObject id0,int id1)
  {
    SetBlockColorMode_52(id0,id1);
  }

  private native int GetBlockColorMode_53(vtkDataObject id0);
  public int GetBlockColorMode(vtkDataObject id0)
  {
    return GetBlockColorMode_53(id0);
  }

  private native boolean HasBlockColorMode_54(vtkDataObject id0);
  public boolean HasBlockColorMode(vtkDataObject id0)
  {
    return HasBlockColorMode_54(id0);
  }

  private native boolean HasBlockColorModes_55();
  public boolean HasBlockColorModes()
  {
    return HasBlockColorModes_55();
  }

  private native void RemoveBlockColorMode_56(vtkDataObject id0);
  public void RemoveBlockColorMode(vtkDataObject id0)
  {
    RemoveBlockColorMode_56(id0);
  }

  private native void RemoveBlockColorModes_57();
  public void RemoveBlockColorModes()
  {
    RemoveBlockColorModes_57();
  }

  private native void SetBlockScalarMode_58(vtkDataObject id0,int id1);
  public void SetBlockScalarMode(vtkDataObject id0,int id1)
  {
    SetBlockScalarMode_58(id0,id1);
  }

  private native int GetBlockScalarMode_59(vtkDataObject id0);
  public int GetBlockScalarMode(vtkDataObject id0)
  {
    return GetBlockScalarMode_59(id0);
  }

  private native boolean HasBlockScalarMode_60(vtkDataObject id0);
  public boolean HasBlockScalarMode(vtkDataObject id0)
  {
    return HasBlockScalarMode_60(id0);
  }

  private native boolean HasBlockScalarModes_61();
  public boolean HasBlockScalarModes()
  {
    return HasBlockScalarModes_61();
  }

  private native void RemoveBlockScalarMode_62(vtkDataObject id0);
  public void RemoveBlockScalarMode(vtkDataObject id0)
  {
    RemoveBlockScalarMode_62(id0);
  }

  private native void RemoveBlockScalarModes_63();
  public void RemoveBlockScalarModes()
  {
    RemoveBlockScalarModes_63();
  }

  private native void SetBlockArrayAccessMode_64(vtkDataObject id0,int id1);
  public void SetBlockArrayAccessMode(vtkDataObject id0,int id1)
  {
    SetBlockArrayAccessMode_64(id0,id1);
  }

  private native int GetBlockArrayAccessMode_65(vtkDataObject id0);
  public int GetBlockArrayAccessMode(vtkDataObject id0)
  {
    return GetBlockArrayAccessMode_65(id0);
  }

  private native boolean HasBlockArrayAccessMode_66(vtkDataObject id0);
  public boolean HasBlockArrayAccessMode(vtkDataObject id0)
  {
    return HasBlockArrayAccessMode_66(id0);
  }

  private native boolean HasBlockArrayAccessModes_67();
  public boolean HasBlockArrayAccessModes()
  {
    return HasBlockArrayAccessModes_67();
  }

  private native void RemoveBlockArrayAccessMode_68(vtkDataObject id0);
  public void RemoveBlockArrayAccessMode(vtkDataObject id0)
  {
    RemoveBlockArrayAccessMode_68(id0);
  }

  private native void RemoveBlockArrayAccessModes_69();
  public void RemoveBlockArrayAccessModes()
  {
    RemoveBlockArrayAccessModes_69();
  }

  private native void SetBlockArrayComponent_70(vtkDataObject id0,int id1);
  public void SetBlockArrayComponent(vtkDataObject id0,int id1)
  {
    SetBlockArrayComponent_70(id0,id1);
  }

  private native int GetBlockArrayComponent_71(vtkDataObject id0);
  public int GetBlockArrayComponent(vtkDataObject id0)
  {
    return GetBlockArrayComponent_71(id0);
  }

  private native boolean HasBlockArrayComponent_72(vtkDataObject id0);
  public boolean HasBlockArrayComponent(vtkDataObject id0)
  {
    return HasBlockArrayComponent_72(id0);
  }

  private native boolean HasBlockArrayComponents_73();
  public boolean HasBlockArrayComponents()
  {
    return HasBlockArrayComponents_73();
  }

  private native void RemoveBlockArrayComponent_74(vtkDataObject id0);
  public void RemoveBlockArrayComponent(vtkDataObject id0)
  {
    RemoveBlockArrayComponent_74(id0);
  }

  private native void RemoveBlockArrayComponents_75();
  public void RemoveBlockArrayComponents()
  {
    RemoveBlockArrayComponents_75();
  }

  private native void SetBlockArrayId_76(vtkDataObject id0,int id1);
  public void SetBlockArrayId(vtkDataObject id0,int id1)
  {
    SetBlockArrayId_76(id0,id1);
  }

  private native int GetBlockArrayId_77(vtkDataObject id0);
  public int GetBlockArrayId(vtkDataObject id0)
  {
    return GetBlockArrayId_77(id0);
  }

  private native boolean HasBlockArrayId_78(vtkDataObject id0);
  public boolean HasBlockArrayId(vtkDataObject id0)
  {
    return HasBlockArrayId_78(id0);
  }

  private native boolean HasBlockArrayIds_79();
  public boolean HasBlockArrayIds()
  {
    return HasBlockArrayIds_79();
  }

  private native void RemoveBlockArrayId_80(vtkDataObject id0);
  public void RemoveBlockArrayId(vtkDataObject id0)
  {
    RemoveBlockArrayId_80(id0);
  }

  private native void RemoveBlockArrayIds_81();
  public void RemoveBlockArrayIds()
  {
    RemoveBlockArrayIds_81();
  }

  private native boolean HasBlockScalarRange_82(vtkDataObject id0);
  public boolean HasBlockScalarRange(vtkDataObject id0)
  {
    return HasBlockScalarRange_82(id0);
  }

  private native boolean HasBlockScalarRanges_83();
  public boolean HasBlockScalarRanges()
  {
    return HasBlockScalarRanges_83();
  }

  private native void RemoveBlockScalarRange_84(vtkDataObject id0);
  public void RemoveBlockScalarRange(vtkDataObject id0)
  {
    RemoveBlockScalarRange_84(id0);
  }

  private native void RemoveBlockScalarRanges_85();
  public void RemoveBlockScalarRanges()
  {
    RemoveBlockScalarRanges_85();
  }

  private native void SetBlockArrayName_86(vtkDataObject id0,byte[] id1, int len1);
  public void SetBlockArrayName(vtkDataObject id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetBlockArrayName_86(id0,bytes1, bytes1.length);
  }

  private native byte[] GetBlockArrayName_87(vtkDataObject id0);
  public String GetBlockArrayName(vtkDataObject id0)
  {
    return new String(GetBlockArrayName_87(id0), StandardCharsets.UTF_8);
  }

  private native boolean HasBlockArrayName_88(vtkDataObject id0);
  public boolean HasBlockArrayName(vtkDataObject id0)
  {
    return HasBlockArrayName_88(id0);
  }

  private native boolean HasBlockArrayNames_89();
  public boolean HasBlockArrayNames()
  {
    return HasBlockArrayNames_89();
  }

  private native void RemoveBlockArrayName_90(vtkDataObject id0);
  public void RemoveBlockArrayName(vtkDataObject id0)
  {
    RemoveBlockArrayName_90(id0);
  }

  private native void RemoveBlockArrayNames_91();
  public void RemoveBlockArrayNames()
  {
    RemoveBlockArrayNames_91();
  }

  private native void SetBlockFieldDataTupleId_92(vtkDataObject id0,long id1);
  public void SetBlockFieldDataTupleId(vtkDataObject id0,long id1)
  {
    SetBlockFieldDataTupleId_92(id0,id1);
  }

  private native long GetBlockFieldDataTupleId_93(vtkDataObject id0);
  public long GetBlockFieldDataTupleId(vtkDataObject id0)
  {
    return GetBlockFieldDataTupleId_93(id0);
  }

  private native boolean HasBlockFieldDataTupleId_94(vtkDataObject id0);
  public boolean HasBlockFieldDataTupleId(vtkDataObject id0)
  {
    return HasBlockFieldDataTupleId_94(id0);
  }

  private native boolean HasBlockFieldDataTupleIds_95();
  public boolean HasBlockFieldDataTupleIds()
  {
    return HasBlockFieldDataTupleIds_95();
  }

  private native void RemoveBlockFieldDataTupleId_96(vtkDataObject id0);
  public void RemoveBlockFieldDataTupleId(vtkDataObject id0)
  {
    RemoveBlockFieldDataTupleId_96(id0);
  }

  private native void RemoveBlockFieldDataTupleIds_97();
  public void RemoveBlockFieldDataTupleIds()
  {
    RemoveBlockFieldDataTupleIds_97();
  }

  private native boolean HasBlockLookupTable_98(vtkDataObject id0);
  public boolean HasBlockLookupTable(vtkDataObject id0)
  {
    return HasBlockLookupTable_98(id0);
  }

  private native boolean HasBlockLookupTables_99();
  public boolean HasBlockLookupTables()
  {
    return HasBlockLookupTables_99();
  }

  private native void RemoveBlockLookupTable_100(vtkDataObject id0);
  public void RemoveBlockLookupTable(vtkDataObject id0)
  {
    RemoveBlockLookupTable_100(id0);
  }

  private native void RemoveBlockLookupTables_101();
  public void RemoveBlockLookupTables()
  {
    RemoveBlockLookupTables_101();
  }

  private native void ComputeVisibleBounds_102(vtkCompositeDataDisplayAttributes id0,vtkDataObject id1,double id2[]);
  public void ComputeVisibleBounds(vtkCompositeDataDisplayAttributes id0,vtkDataObject id1,double id2[])
  {
    ComputeVisibleBounds_102(id0,id1,id2);
  }

  private native long DataObjectFromIndex_103(int id0,vtkDataObject id1,int id2);
  public vtkDataObject DataObjectFromIndex(int id0,vtkDataObject id1,int id2)
  {
    long temp = DataObjectFromIndex_103(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkCompositeDataDisplayAttributes() { super(); }

  public vtkCompositeDataDisplayAttributes(long id) { super(id); }
  public native long   VTKInit();

}
