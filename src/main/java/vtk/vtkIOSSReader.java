// java wrapper for vtkIOSSReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkIOSSReader extends vtkReaderAlgorithm
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

  private native void AddFileName_4(byte[] id0, int len0);
  public void AddFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddFileName_4(bytes0, bytes0.length);
  }

  private native void ClearFileNames_5();
  public void ClearFileNames()
  {
    ClearFileNames_5();
  }

  private native byte[] GetFileName_6(int id0);
  public String GetFileName(int id0)
  {
    return new String(GetFileName_6(id0), StandardCharsets.UTF_8);
  }

  private native int GetNumberOfFileNames_7();
  public int GetNumberOfFileNames()
  {
    return GetNumberOfFileNames_7();
  }

  private native void SetFileName_8(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_8(bytes0, bytes0.length);
  }

  private native void SetDatabaseTypeOverride_9(byte[] id0, int len0);
  public void SetDatabaseTypeOverride(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDatabaseTypeOverride_9(bytes0, bytes0.length);
  }

  private native byte[] GetDatabaseTypeOverride_10();
  public String GetDatabaseTypeOverride()
  {
    return new String(GetDatabaseTypeOverride_10(), StandardCharsets.UTF_8);
  }

  private native void SetDisplacementMagnitude_11(double id0);
  public void SetDisplacementMagnitude(double id0)
  {
    SetDisplacementMagnitude_11(id0);
  }

  private native double GetDisplacementMagnitude_12();
  public double GetDisplacementMagnitude()
  {
    return GetDisplacementMagnitude_12();
  }

  private native void SetGroupNumericVectorFieldComponents_13(boolean id0);
  public void SetGroupNumericVectorFieldComponents(boolean id0)
  {
    SetGroupNumericVectorFieldComponents_13(id0);
  }

  private native boolean GetGroupNumericVectorFieldComponents_14();
  public boolean GetGroupNumericVectorFieldComponents()
  {
    return GetGroupNumericVectorFieldComponents_14();
  }

  private native void SetFieldSuffixSeparator_15(byte[] id0, int len0);
  public void SetFieldSuffixSeparator(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFieldSuffixSeparator_15(bytes0, bytes0.length);
  }

  private native byte[] GetFieldSuffixSeparator_16();
  public String GetFieldSuffixSeparator()
  {
    return new String(GetFieldSuffixSeparator_16(), StandardCharsets.UTF_8);
  }

  private native void SetScanForRelatedFiles_17(boolean id0);
  public void SetScanForRelatedFiles(boolean id0)
  {
    SetScanForRelatedFiles_17(id0);
  }

  private native boolean GetScanForRelatedFiles_18();
  public boolean GetScanForRelatedFiles()
  {
    return GetScanForRelatedFiles_18();
  }

  private native void ScanForRelatedFilesOn_19();
  public void ScanForRelatedFilesOn()
  {
    ScanForRelatedFilesOn_19();
  }

  private native void ScanForRelatedFilesOff_20();
  public void ScanForRelatedFilesOff()
  {
    ScanForRelatedFilesOff_20();
  }

  private native void SetFileRange_21(int id0,int id1);
  public void SetFileRange(int id0,int id1)
  {
    SetFileRange_21(id0,id1);
  }

  private native void SetFileRange_22(int id0[]);
  public void SetFileRange(int id0[])
  {
    SetFileRange_22(id0);
  }

  private native int[] GetFileRange_23();
  public int[] GetFileRange()
  {
    return GetFileRange_23();
  }

  private native void SetFileStride_24(int id0);
  public void SetFileStride(int id0)
  {
    SetFileStride_24(id0);
  }

  private native int GetFileStrideMinValue_25();
  public int GetFileStrideMinValue()
  {
    return GetFileStrideMinValue_25();
  }

  private native int GetFileStrideMaxValue_26();
  public int GetFileStrideMaxValue()
  {
    return GetFileStrideMaxValue_26();
  }

  private native int GetFileStride_27();
  public int GetFileStride()
  {
    return GetFileStride_27();
  }

  private native void SetCaching_28(boolean id0);
  public void SetCaching(boolean id0)
  {
    SetCaching_28(id0);
  }

  private native boolean GetCaching_29();
  public boolean GetCaching()
  {
    return GetCaching_29();
  }

  private native void CachingOn_30();
  public void CachingOn()
  {
    CachingOn_30();
  }

  private native void CachingOff_31();
  public void CachingOff()
  {
    CachingOff_31();
  }

  private native void SetMergeExodusEntityBlocks_32(boolean id0);
  public void SetMergeExodusEntityBlocks(boolean id0)
  {
    SetMergeExodusEntityBlocks_32(id0);
  }

  private native boolean GetMergeExodusEntityBlocks_33();
  public boolean GetMergeExodusEntityBlocks()
  {
    return GetMergeExodusEntityBlocks_33();
  }

  private native void MergeExodusEntityBlocksOn_34();
  public void MergeExodusEntityBlocksOn()
  {
    MergeExodusEntityBlocksOn_34();
  }

  private native void MergeExodusEntityBlocksOff_35();
  public void MergeExodusEntityBlocksOff()
  {
    MergeExodusEntityBlocksOff_35();
  }

  private native void SetElementAndSideIds_36(boolean id0);
  public void SetElementAndSideIds(boolean id0)
  {
    SetElementAndSideIds_36(id0);
  }

  private native boolean GetElementAndSideIds_37();
  public boolean GetElementAndSideIds()
  {
    return GetElementAndSideIds_37();
  }

  private native void ElementAndSideIdsOn_38();
  public void ElementAndSideIdsOn()
  {
    ElementAndSideIdsOn_38();
  }

  private native void ElementAndSideIdsOff_39();
  public void ElementAndSideIdsOff()
  {
    ElementAndSideIdsOff_39();
  }

  private native void SetGenerateFileId_40(boolean id0);
  public void SetGenerateFileId(boolean id0)
  {
    SetGenerateFileId_40(id0);
  }

  private native boolean GetGenerateFileId_41();
  public boolean GetGenerateFileId()
  {
    return GetGenerateFileId_41();
  }

  private native void GenerateFileIdOn_42();
  public void GenerateFileIdOn()
  {
    GenerateFileIdOn_42();
  }

  private native void GenerateFileIdOff_43();
  public void GenerateFileIdOff()
  {
    GenerateFileIdOff_43();
  }

  private native void SetReadIds_44(boolean id0);
  public void SetReadIds(boolean id0)
  {
    SetReadIds_44(id0);
  }

  private native boolean GetReadIds_45();
  public boolean GetReadIds()
  {
    return GetReadIds_45();
  }

  private native void ReadIdsOn_46();
  public void ReadIdsOn()
  {
    ReadIdsOn_46();
  }

  private native void ReadIdsOff_47();
  public void ReadIdsOff()
  {
    ReadIdsOff_47();
  }

  private native void SetRemoveUnusedPoints_48(boolean id0);
  public void SetRemoveUnusedPoints(boolean id0)
  {
    SetRemoveUnusedPoints_48(id0);
  }

  private native boolean GetRemoveUnusedPoints_49();
  public boolean GetRemoveUnusedPoints()
  {
    return GetRemoveUnusedPoints_49();
  }

  private native void RemoveUnusedPointsOn_50();
  public void RemoveUnusedPointsOn()
  {
    RemoveUnusedPointsOn_50();
  }

  private native void RemoveUnusedPointsOff_51();
  public void RemoveUnusedPointsOff()
  {
    RemoveUnusedPointsOff_51();
  }

  private native void SetApplyDisplacements_52(boolean id0);
  public void SetApplyDisplacements(boolean id0)
  {
    SetApplyDisplacements_52(id0);
  }

  private native boolean GetApplyDisplacements_53();
  public boolean GetApplyDisplacements()
  {
    return GetApplyDisplacements_53();
  }

  private native void ApplyDisplacementsOn_54();
  public void ApplyDisplacementsOn()
  {
    ApplyDisplacementsOn_54();
  }

  private native void ApplyDisplacementsOff_55();
  public void ApplyDisplacementsOff()
  {
    ApplyDisplacementsOff_55();
  }

  private native void SetReadGlobalFields_56(boolean id0);
  public void SetReadGlobalFields(boolean id0)
  {
    SetReadGlobalFields_56(id0);
  }

  private native boolean GetReadGlobalFields_57();
  public boolean GetReadGlobalFields()
  {
    return GetReadGlobalFields_57();
  }

  private native void ReadGlobalFieldsOn_58();
  public void ReadGlobalFieldsOn()
  {
    ReadGlobalFieldsOn_58();
  }

  private native void ReadGlobalFieldsOff_59();
  public void ReadGlobalFieldsOff()
  {
    ReadGlobalFieldsOff_59();
  }

  private native void SetReadAllFilesToDetermineStructure_60(boolean id0);
  public void SetReadAllFilesToDetermineStructure(boolean id0)
  {
    SetReadAllFilesToDetermineStructure_60(id0);
  }

  private native boolean GetReadAllFilesToDetermineStructure_61();
  public boolean GetReadAllFilesToDetermineStructure()
  {
    return GetReadAllFilesToDetermineStructure_61();
  }

  private native void ReadAllFilesToDetermineStructureOn_62();
  public void ReadAllFilesToDetermineStructureOn()
  {
    ReadAllFilesToDetermineStructureOn_62();
  }

  private native void ReadAllFilesToDetermineStructureOff_63();
  public void ReadAllFilesToDetermineStructureOff()
  {
    ReadAllFilesToDetermineStructureOff_63();
  }

  private native void SetReadQAAndInformationRecords_64(boolean id0);
  public void SetReadQAAndInformationRecords(boolean id0)
  {
    SetReadQAAndInformationRecords_64(id0);
  }

  private native boolean GetReadQAAndInformationRecords_65();
  public boolean GetReadQAAndInformationRecords()
  {
    return GetReadQAAndInformationRecords_65();
  }

  private native void ReadQAAndInformationRecordsOn_66();
  public void ReadQAAndInformationRecordsOn()
  {
    ReadQAAndInformationRecordsOn_66();
  }

  private native void ReadQAAndInformationRecordsOff_67();
  public void ReadQAAndInformationRecordsOff()
  {
    ReadQAAndInformationRecordsOff_67();
  }

  private native void SetController_68(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_68(id0);
  }

  private native long GetController_69();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_69();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AddProperty_70(byte[] id0, int len0,int id1);
  public void AddProperty(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddProperty_70(bytes0, bytes0.length,id1);
  }

  private native void AddProperty_71(byte[] id0, int len0,double id1);
  public void AddProperty(String id0,double id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddProperty_71(bytes0, bytes0.length,id1);
  }

  private native void AddProperty_72(byte[] id0, int len0,byte[] id1, int len1);
  public void AddProperty(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddProperty_72(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void RemoveProperty_73(byte[] id0, int len0);
  public void RemoveProperty(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveProperty_73(bytes0, bytes0.length);
  }

  private native void ClearProperties_74();
  public void ClearProperties()
  {
    ClearProperties_74();
  }

  private native boolean GetEntityTypeIsBlock_75(int id0);
  public boolean GetEntityTypeIsBlock(int id0)
  {
    return GetEntityTypeIsBlock_75(id0);
  }

  private native boolean GetEntityTypeIsSet_76(int id0);
  public boolean GetEntityTypeIsSet(int id0)
  {
    return GetEntityTypeIsSet_76(id0);
  }

  private native byte[] GetDataAssemblyNodeNameForEntityType_77(int id0);
  public String GetDataAssemblyNodeNameForEntityType(int id0)
  {
    return new String(GetDataAssemblyNodeNameForEntityType_77(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetMergedEntityNameForEntityType_78(int id0);
  public String GetMergedEntityNameForEntityType(int id0)
  {
    return new String(GetMergedEntityNameForEntityType_78(id0), StandardCharsets.UTF_8);
  }

  private native long GetEntitySelection_79(int id0);
  public vtkDataArraySelection GetEntitySelection(int id0)
  {
    long temp = GetEntitySelection_79(id0);

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNodeBlockSelection_80();
  public vtkDataArraySelection GetNodeBlockSelection()
  {
    long temp = GetNodeBlockSelection_80();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeBlockSelection_81();
  public vtkDataArraySelection GetEdgeBlockSelection()
  {
    long temp = GetEdgeBlockSelection_81();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaceBlockSelection_82();
  public vtkDataArraySelection GetFaceBlockSelection()
  {
    long temp = GetFaceBlockSelection_82();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetElementBlockSelection_83();
  public vtkDataArraySelection GetElementBlockSelection()
  {
    long temp = GetElementBlockSelection_83();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredBlockSelection_84();
  public vtkDataArraySelection GetStructuredBlockSelection()
  {
    long temp = GetStructuredBlockSelection_84();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNodeSetSelection_85();
  public vtkDataArraySelection GetNodeSetSelection()
  {
    long temp = GetNodeSetSelection_85();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeSetSelection_86();
  public vtkDataArraySelection GetEdgeSetSelection()
  {
    long temp = GetEdgeSetSelection_86();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaceSetSelection_87();
  public vtkDataArraySelection GetFaceSetSelection()
  {
    long temp = GetFaceSetSelection_87();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetElementSetSelection_88();
  public vtkDataArraySelection GetElementSetSelection()
  {
    long temp = GetElementSetSelection_88();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSideSetSelection_89();
  public vtkDataArraySelection GetSideSetSelection()
  {
    long temp = GetSideSetSelection_89();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFieldSelection_90(int id0);
  public vtkDataArraySelection GetFieldSelection(int id0)
  {
    long temp = GetFieldSelection_90(id0);

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNodeBlockFieldSelection_91();
  public vtkDataArraySelection GetNodeBlockFieldSelection()
  {
    long temp = GetNodeBlockFieldSelection_91();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeBlockFieldSelection_92();
  public vtkDataArraySelection GetEdgeBlockFieldSelection()
  {
    long temp = GetEdgeBlockFieldSelection_92();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaceBlockFieldSelection_93();
  public vtkDataArraySelection GetFaceBlockFieldSelection()
  {
    long temp = GetFaceBlockFieldSelection_93();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetElementBlockFieldSelection_94();
  public vtkDataArraySelection GetElementBlockFieldSelection()
  {
    long temp = GetElementBlockFieldSelection_94();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredBlockFieldSelection_95();
  public vtkDataArraySelection GetStructuredBlockFieldSelection()
  {
    long temp = GetStructuredBlockFieldSelection_95();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNodeSetFieldSelection_96();
  public vtkDataArraySelection GetNodeSetFieldSelection()
  {
    long temp = GetNodeSetFieldSelection_96();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeSetFieldSelection_97();
  public vtkDataArraySelection GetEdgeSetFieldSelection()
  {
    long temp = GetEdgeSetFieldSelection_97();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaceSetFieldSelection_98();
  public vtkDataArraySelection GetFaceSetFieldSelection()
  {
    long temp = GetFaceSetFieldSelection_98();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetElementSetFieldSelection_99();
  public vtkDataArraySelection GetElementSetFieldSelection()
  {
    long temp = GetElementSetFieldSelection_99();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSideSetFieldSelection_100();
  public vtkDataArraySelection GetSideSetFieldSelection()
  {
    long temp = GetSideSetFieldSelection_100();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RemoveAllEntitySelections_101();
  public void RemoveAllEntitySelections()
  {
    RemoveAllEntitySelections_101();
  }

  private native void RemoveAllFieldSelections_102();
  public void RemoveAllFieldSelections()
  {
    RemoveAllFieldSelections_102();
  }

  private native void RemoveAllSelections_103();
  public void RemoveAllSelections()
  {
    RemoveAllSelections_103();
  }

  private native long GetEntityIdMapAsString_104(int id0);
  public vtkStringArray GetEntityIdMapAsString(int id0)
  {
    long temp = GetEntityIdMapAsString_104(id0);

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNodeBlockIdMapAsString_105();
  public vtkStringArray GetNodeBlockIdMapAsString()
  {
    long temp = GetNodeBlockIdMapAsString_105();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeBlockIdMapAsString_106();
  public vtkStringArray GetEdgeBlockIdMapAsString()
  {
    long temp = GetEdgeBlockIdMapAsString_106();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaceBlockIdMapAsString_107();
  public vtkStringArray GetFaceBlockIdMapAsString()
  {
    long temp = GetFaceBlockIdMapAsString_107();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetElementBlockIdMapAsString_108();
  public vtkStringArray GetElementBlockIdMapAsString()
  {
    long temp = GetElementBlockIdMapAsString_108();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStructuredBlockIdMapAsString_109();
  public vtkStringArray GetStructuredBlockIdMapAsString()
  {
    long temp = GetStructuredBlockIdMapAsString_109();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNodeSetIdMapAsString_110();
  public vtkStringArray GetNodeSetIdMapAsString()
  {
    long temp = GetNodeSetIdMapAsString_110();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgeSetIdMapAsString_111();
  public vtkStringArray GetEdgeSetIdMapAsString()
  {
    long temp = GetEdgeSetIdMapAsString_111();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaceSetIdMapAsString_112();
  public vtkStringArray GetFaceSetIdMapAsString()
  {
    long temp = GetFaceSetIdMapAsString_112();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetElementSetIdMapAsString_113();
  public vtkStringArray GetElementSetIdMapAsString()
  {
    long temp = GetElementSetIdMapAsString_113();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSideSetIdMapAsString_114();
  public vtkStringArray GetSideSetIdMapAsString()
  {
    long temp = GetSideSetIdMapAsString_114();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAssembly_115();
  public vtkDataAssembly GetAssembly()
  {
    long temp = GetAssembly_115();

    if (temp == 0) return null;
    return (vtkDataAssembly)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetAssemblyTag_116();
  public int GetAssemblyTag()
  {
    return GetAssemblyTag_116();
  }

  private native boolean AddSelector_117(byte[] id0, int len0);
  public boolean AddSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddSelector_117(bytes0, bytes0.length);
  }

  private native void ClearSelectors_118();
  public void ClearSelectors()
  {
    ClearSelectors_118();
  }

  private native void SetSelector_119(byte[] id0, int len0);
  public void SetSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSelector_119(bytes0, bytes0.length);
  }

  private native int GetNumberOfSelectors_120();
  public int GetNumberOfSelectors()
  {
    return GetNumberOfSelectors_120();
  }

  private native byte[] GetSelector_121(int id0);
  public String GetSelector(int id0)
  {
    return new String(GetSelector_121(id0), StandardCharsets.UTF_8);
  }

  private native int ReadMetaData_122(vtkInformation id0);
  public int ReadMetaData(vtkInformation id0)
  {
    return ReadMetaData_122(id0);
  }

  private native int ReadMesh_123(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadMesh(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadMesh_123(id0,id1,id2,id3,id4);
  }

  private native int ReadPoints_124(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadPoints(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadPoints_124(id0,id1,id2,id3,id4);
  }

  private native int ReadArrays_125(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadArrays(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadArrays_125(id0,id1,id2,id3,id4);
  }

  private native long GetMTime_126();
  public long GetMTime()
  {
    return GetMTime_126();
  }

  private native boolean DoTestFilePatternMatching_127();
  public boolean DoTestFilePatternMatching()
  {
    return DoTestFilePatternMatching_127();
  }

  private native long ENTITY_ID_128();
  public vtkInformationIntegerKey ENTITY_ID()
  {
    long temp = ENTITY_ID_128();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkIOSSReader() { super(); }

  public vtkIOSSReader(long id) { super(id); }
  public native long   VTKInit();

}
