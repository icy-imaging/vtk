// java wrapper for vtkExodusIIReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExodusIIReader extends vtkMultiBlockDataSetAlgorithm
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

  private native int CanReadFile_4(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_4(bytes0, bytes0.length);
  }

  private native long GetMTime_5();
  public long GetMTime()
  {
    return GetMTime_5();
  }

  private native long GetMetadataMTime_6();
  public long GetMetadataMTime()
  {
    return GetMetadataMTime_6();
  }

  private native void SetFileName_7(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_7(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_8();
  public String GetFileName()
  {
    return new String(GetFileName_8(), StandardCharsets.UTF_8);
  }

  private native void SetXMLFileName_9(byte[] id0, int len0);
  public void SetXMLFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXMLFileName_9(bytes0, bytes0.length);
  }

  private native byte[] GetXMLFileName_10();
  public String GetXMLFileName()
  {
    return new String(GetXMLFileName_10(), StandardCharsets.UTF_8);
  }

  private native void SetTimeStep_11(int id0);
  public void SetTimeStep(int id0)
  {
    SetTimeStep_11(id0);
  }

  private native int GetTimeStep_12();
  public int GetTimeStep()
  {
    return GetTimeStep_12();
  }

  private native void SetModeShape_13(int id0);
  public void SetModeShape(int id0)
  {
    SetModeShape_13(id0);
  }

  private native int[] GetModeShapesRange_14();
  public int[] GetModeShapesRange()
  {
    return GetModeShapesRange_14();
  }

  private native int[] GetTimeStepRange_15();
  public int[] GetTimeStepRange()
  {
    return GetTimeStepRange_15();
  }

  private native void SetGenerateObjectIdCellArray_16(int id0);
  public void SetGenerateObjectIdCellArray(int id0)
  {
    SetGenerateObjectIdCellArray_16(id0);
  }

  private native int GetGenerateObjectIdCellArray_17();
  public int GetGenerateObjectIdCellArray()
  {
    return GetGenerateObjectIdCellArray_17();
  }

  private native void GenerateObjectIdCellArrayOn_18();
  public void GenerateObjectIdCellArrayOn()
  {
    GenerateObjectIdCellArrayOn_18();
  }

  private native void GenerateObjectIdCellArrayOff_19();
  public void GenerateObjectIdCellArrayOff()
  {
    GenerateObjectIdCellArrayOff_19();
  }

  private native byte[] GetObjectIdArrayName_20();
  public String GetObjectIdArrayName()
  {
    return new String(GetObjectIdArrayName_20(), StandardCharsets.UTF_8);
  }

  private native void SetGenerateGlobalElementIdArray_21(int id0);
  public void SetGenerateGlobalElementIdArray(int id0)
  {
    SetGenerateGlobalElementIdArray_21(id0);
  }

  private native int GetGenerateGlobalElementIdArray_22();
  public int GetGenerateGlobalElementIdArray()
  {
    return GetGenerateGlobalElementIdArray_22();
  }

  private native void GenerateGlobalElementIdArrayOn_23();
  public void GenerateGlobalElementIdArrayOn()
  {
    GenerateGlobalElementIdArrayOn_23();
  }

  private native void GenerateGlobalElementIdArrayOff_24();
  public void GenerateGlobalElementIdArrayOff()
  {
    GenerateGlobalElementIdArrayOff_24();
  }

  private native void SetGenerateGlobalNodeIdArray_25(int id0);
  public void SetGenerateGlobalNodeIdArray(int id0)
  {
    SetGenerateGlobalNodeIdArray_25(id0);
  }

  private native int GetGenerateGlobalNodeIdArray_26();
  public int GetGenerateGlobalNodeIdArray()
  {
    return GetGenerateGlobalNodeIdArray_26();
  }

  private native void GenerateGlobalNodeIdArrayOn_27();
  public void GenerateGlobalNodeIdArrayOn()
  {
    GenerateGlobalNodeIdArrayOn_27();
  }

  private native void GenerateGlobalNodeIdArrayOff_28();
  public void GenerateGlobalNodeIdArrayOff()
  {
    GenerateGlobalNodeIdArrayOff_28();
  }

  private native void SetGenerateImplicitElementIdArray_29(int id0);
  public void SetGenerateImplicitElementIdArray(int id0)
  {
    SetGenerateImplicitElementIdArray_29(id0);
  }

  private native int GetGenerateImplicitElementIdArray_30();
  public int GetGenerateImplicitElementIdArray()
  {
    return GetGenerateImplicitElementIdArray_30();
  }

  private native void GenerateImplicitElementIdArrayOn_31();
  public void GenerateImplicitElementIdArrayOn()
  {
    GenerateImplicitElementIdArrayOn_31();
  }

  private native void GenerateImplicitElementIdArrayOff_32();
  public void GenerateImplicitElementIdArrayOff()
  {
    GenerateImplicitElementIdArrayOff_32();
  }

  private native void SetGenerateImplicitNodeIdArray_33(int id0);
  public void SetGenerateImplicitNodeIdArray(int id0)
  {
    SetGenerateImplicitNodeIdArray_33(id0);
  }

  private native int GetGenerateImplicitNodeIdArray_34();
  public int GetGenerateImplicitNodeIdArray()
  {
    return GetGenerateImplicitNodeIdArray_34();
  }

  private native void GenerateImplicitNodeIdArrayOn_35();
  public void GenerateImplicitNodeIdArrayOn()
  {
    GenerateImplicitNodeIdArrayOn_35();
  }

  private native void GenerateImplicitNodeIdArrayOff_36();
  public void GenerateImplicitNodeIdArrayOff()
  {
    GenerateImplicitNodeIdArrayOff_36();
  }

  private native void SetGenerateFileIdArray_37(int id0);
  public void SetGenerateFileIdArray(int id0)
  {
    SetGenerateFileIdArray_37(id0);
  }

  private native int GetGenerateFileIdArray_38();
  public int GetGenerateFileIdArray()
  {
    return GetGenerateFileIdArray_38();
  }

  private native void GenerateFileIdArrayOn_39();
  public void GenerateFileIdArrayOn()
  {
    GenerateFileIdArrayOn_39();
  }

  private native void GenerateFileIdArrayOff_40();
  public void GenerateFileIdArrayOff()
  {
    GenerateFileIdArrayOff_40();
  }

  private native void SetFileId_41(int id0);
  public void SetFileId(int id0)
  {
    SetFileId_41(id0);
  }

  private native int GetFileId_42();
  public int GetFileId()
  {
    return GetFileId_42();
  }

  private native byte[] GetGlobalElementIdArrayName_43();
  public String GetGlobalElementIdArrayName()
  {
    return new String(GetGlobalElementIdArrayName_43(), StandardCharsets.UTF_8);
  }

  private native byte[] GetPedigreeElementIdArrayName_44();
  public String GetPedigreeElementIdArrayName()
  {
    return new String(GetPedigreeElementIdArrayName_44(), StandardCharsets.UTF_8);
  }

  private native int GetGlobalElementID_45(vtkDataSet id0,int id1);
  public int GetGlobalElementID(vtkDataSet id0,int id1)
  {
    return GetGlobalElementID_45(id0,id1);
  }

  private native int GetGlobalElementID_46(vtkDataSet id0,int id1,int id2);
  public int GetGlobalElementID(vtkDataSet id0,int id1,int id2)
  {
    return GetGlobalElementID_46(id0,id1,id2);
  }

  private native byte[] GetImplicitElementIdArrayName_47();
  public String GetImplicitElementIdArrayName()
  {
    return new String(GetImplicitElementIdArrayName_47(), StandardCharsets.UTF_8);
  }

  private native byte[] GetGlobalFaceIdArrayName_48();
  public String GetGlobalFaceIdArrayName()
  {
    return new String(GetGlobalFaceIdArrayName_48(), StandardCharsets.UTF_8);
  }

  private native byte[] GetPedigreeFaceIdArrayName_49();
  public String GetPedigreeFaceIdArrayName()
  {
    return new String(GetPedigreeFaceIdArrayName_49(), StandardCharsets.UTF_8);
  }

  private native int GetGlobalFaceID_50(vtkDataSet id0,int id1);
  public int GetGlobalFaceID(vtkDataSet id0,int id1)
  {
    return GetGlobalFaceID_50(id0,id1);
  }

  private native int GetGlobalFaceID_51(vtkDataSet id0,int id1,int id2);
  public int GetGlobalFaceID(vtkDataSet id0,int id1,int id2)
  {
    return GetGlobalFaceID_51(id0,id1,id2);
  }

  private native byte[] GetImplicitFaceIdArrayName_52();
  public String GetImplicitFaceIdArrayName()
  {
    return new String(GetImplicitFaceIdArrayName_52(), StandardCharsets.UTF_8);
  }

  private native byte[] GetGlobalEdgeIdArrayName_53();
  public String GetGlobalEdgeIdArrayName()
  {
    return new String(GetGlobalEdgeIdArrayName_53(), StandardCharsets.UTF_8);
  }

  private native byte[] GetPedigreeEdgeIdArrayName_54();
  public String GetPedigreeEdgeIdArrayName()
  {
    return new String(GetPedigreeEdgeIdArrayName_54(), StandardCharsets.UTF_8);
  }

  private native int GetGlobalEdgeID_55(vtkDataSet id0,int id1);
  public int GetGlobalEdgeID(vtkDataSet id0,int id1)
  {
    return GetGlobalEdgeID_55(id0,id1);
  }

  private native int GetGlobalEdgeID_56(vtkDataSet id0,int id1,int id2);
  public int GetGlobalEdgeID(vtkDataSet id0,int id1,int id2)
  {
    return GetGlobalEdgeID_56(id0,id1,id2);
  }

  private native byte[] GetImplicitEdgeIdArrayName_57();
  public String GetImplicitEdgeIdArrayName()
  {
    return new String(GetImplicitEdgeIdArrayName_57(), StandardCharsets.UTF_8);
  }

  private native byte[] GetGlobalNodeIdArrayName_58();
  public String GetGlobalNodeIdArrayName()
  {
    return new String(GetGlobalNodeIdArrayName_58(), StandardCharsets.UTF_8);
  }

  private native byte[] GetPedigreeNodeIdArrayName_59();
  public String GetPedigreeNodeIdArrayName()
  {
    return new String(GetPedigreeNodeIdArrayName_59(), StandardCharsets.UTF_8);
  }

  private native int GetGlobalNodeID_60(vtkDataSet id0,int id1);
  public int GetGlobalNodeID(vtkDataSet id0,int id1)
  {
    return GetGlobalNodeID_60(id0,id1);
  }

  private native int GetGlobalNodeID_61(vtkDataSet id0,int id1,int id2);
  public int GetGlobalNodeID(vtkDataSet id0,int id1,int id2)
  {
    return GetGlobalNodeID_61(id0,id1,id2);
  }

  private native byte[] GetImplicitNodeIdArrayName_62();
  public String GetImplicitNodeIdArrayName()
  {
    return new String(GetImplicitNodeIdArrayName_62(), StandardCharsets.UTF_8);
  }

  private native byte[] GetSideSetSourceElementIdArrayName_63();
  public String GetSideSetSourceElementIdArrayName()
  {
    return new String(GetSideSetSourceElementIdArrayName_63(), StandardCharsets.UTF_8);
  }

  private native byte[] GetSideSetSourceElementSideArrayName_64();
  public String GetSideSetSourceElementSideArrayName()
  {
    return new String(GetSideSetSourceElementSideArrayName_64(), StandardCharsets.UTF_8);
  }

  private native void SetApplyDisplacements_65(int id0);
  public void SetApplyDisplacements(int id0)
  {
    SetApplyDisplacements_65(id0);
  }

  private native int GetApplyDisplacements_66();
  public int GetApplyDisplacements()
  {
    return GetApplyDisplacements_66();
  }

  private native void ApplyDisplacementsOn_67();
  public void ApplyDisplacementsOn()
  {
    ApplyDisplacementsOn_67();
  }

  private native void ApplyDisplacementsOff_68();
  public void ApplyDisplacementsOff()
  {
    ApplyDisplacementsOff_68();
  }

  private native void SetDisplacementMagnitude_69(float id0);
  public void SetDisplacementMagnitude(float id0)
  {
    SetDisplacementMagnitude_69(id0);
  }

  private native float GetDisplacementMagnitude_70();
  public float GetDisplacementMagnitude()
  {
    return GetDisplacementMagnitude_70();
  }

  private native void SetHasModeShapes_71(int id0);
  public void SetHasModeShapes(int id0)
  {
    SetHasModeShapes_71(id0);
  }

  private native int GetHasModeShapes_72();
  public int GetHasModeShapes()
  {
    return GetHasModeShapes_72();
  }

  private native void HasModeShapesOn_73();
  public void HasModeShapesOn()
  {
    HasModeShapesOn_73();
  }

  private native void HasModeShapesOff_74();
  public void HasModeShapesOff()
  {
    HasModeShapesOff_74();
  }

  private native void SetModeShapeTime_75(double id0);
  public void SetModeShapeTime(double id0)
  {
    SetModeShapeTime_75(id0);
  }

  private native double GetModeShapeTime_76();
  public double GetModeShapeTime()
  {
    return GetModeShapeTime_76();
  }

  private native void SetAnimateModeShapes_77(int id0);
  public void SetAnimateModeShapes(int id0)
  {
    SetAnimateModeShapes_77(id0);
  }

  private native int GetAnimateModeShapes_78();
  public int GetAnimateModeShapes()
  {
    return GetAnimateModeShapes_78();
  }

  private native void AnimateModeShapesOn_79();
  public void AnimateModeShapesOn()
  {
    AnimateModeShapesOn_79();
  }

  private native void AnimateModeShapesOff_80();
  public void AnimateModeShapesOff()
  {
    AnimateModeShapesOff_80();
  }

  private native void SetIgnoreFileTime_81(boolean id0);
  public void SetIgnoreFileTime(boolean id0)
  {
    SetIgnoreFileTime_81(id0);
  }

  private native boolean GetIgnoreFileTime_82();
  public boolean GetIgnoreFileTime()
  {
    return GetIgnoreFileTime_82();
  }

  private native void IgnoreFileTimeOn_83();
  public void IgnoreFileTimeOn()
  {
    IgnoreFileTimeOn_83();
  }

  private native void IgnoreFileTimeOff_84();
  public void IgnoreFileTimeOff()
  {
    IgnoreFileTimeOff_84();
  }

  private native byte[] GetTitle_85();
  public String GetTitle()
  {
    return new String(GetTitle_85(), StandardCharsets.UTF_8);
  }

  private native int GetDimensionality_86();
  public int GetDimensionality()
  {
    return GetDimensionality_86();
  }

  private native int GetNumberOfTimeSteps_87();
  public int GetNumberOfTimeSteps()
  {
    return GetNumberOfTimeSteps_87();
  }

  private native int GetNumberOfNodesInFile_88();
  public int GetNumberOfNodesInFile()
  {
    return GetNumberOfNodesInFile_88();
  }

  private native int GetNumberOfEdgesInFile_89();
  public int GetNumberOfEdgesInFile()
  {
    return GetNumberOfEdgesInFile_89();
  }

  private native int GetNumberOfFacesInFile_90();
  public int GetNumberOfFacesInFile()
  {
    return GetNumberOfFacesInFile_90();
  }

  private native int GetNumberOfElementsInFile_91();
  public int GetNumberOfElementsInFile()
  {
    return GetNumberOfElementsInFile_91();
  }

  private native int GetObjectTypeFromName_92(byte[] id0, int len0);
  public int GetObjectTypeFromName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetObjectTypeFromName_92(bytes0, bytes0.length);
  }

  private native byte[] GetObjectTypeName_93(int id0);
  public String GetObjectTypeName(int id0)
  {
    return new String(GetObjectTypeName_93(id0), StandardCharsets.UTF_8);
  }

  private native int GetNumberOfNodes_94();
  public int GetNumberOfNodes()
  {
    return GetNumberOfNodes_94();
  }

  private native int GetNumberOfObjects_95(int id0);
  public int GetNumberOfObjects(int id0)
  {
    return GetNumberOfObjects_95(id0);
  }

  private native int GetNumberOfEntriesInObject_96(int id0,int id1);
  public int GetNumberOfEntriesInObject(int id0,int id1)
  {
    return GetNumberOfEntriesInObject_96(id0,id1);
  }

  private native int GetObjectId_97(int id0,int id1);
  public int GetObjectId(int id0,int id1)
  {
    return GetObjectId_97(id0,id1);
  }

  private native byte[] GetObjectName_98(int id0,int id1);
  public String GetObjectName(int id0,int id1)
  {
    return new String(GetObjectName_98(id0,id1), StandardCharsets.UTF_8);
  }

  private native int GetObjectIndex_99(int id0,byte[] id1, int len1);
  public int GetObjectIndex(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetObjectIndex_99(id0,bytes1, bytes1.length);
  }

  private native int GetObjectIndex_100(int id0,int id1);
  public int GetObjectIndex(int id0,int id1)
  {
    return GetObjectIndex_100(id0,id1);
  }

  private native int GetObjectStatus_101(int id0,int id1);
  public int GetObjectStatus(int id0,int id1)
  {
    return GetObjectStatus_101(id0,id1);
  }

  private native int GetObjectStatus_102(int id0,byte[] id1, int len1);
  public int GetObjectStatus(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetObjectStatus_102(id0,bytes1, bytes1.length);
  }

  private native void SetObjectStatus_103(int id0,int id1,int id2);
  public void SetObjectStatus(int id0,int id1,int id2)
  {
    SetObjectStatus_103(id0,id1,id2);
  }

  private native void SetObjectStatus_104(int id0,byte[] id1, int len1,int id2);
  public void SetObjectStatus(int id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetObjectStatus_104(id0,bytes1, bytes1.length,id2);
  }

  private native int GetNumberOfObjectArrays_105(int id0);
  public int GetNumberOfObjectArrays(int id0)
  {
    return GetNumberOfObjectArrays_105(id0);
  }

  private native byte[] GetObjectArrayName_106(int id0,int id1);
  public String GetObjectArrayName(int id0,int id1)
  {
    return new String(GetObjectArrayName_106(id0,id1), StandardCharsets.UTF_8);
  }

  private native int GetObjectArrayIndex_107(int id0,byte[] id1, int len1);
  public int GetObjectArrayIndex(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetObjectArrayIndex_107(id0,bytes1, bytes1.length);
  }

  private native int GetNumberOfObjectArrayComponents_108(int id0,int id1);
  public int GetNumberOfObjectArrayComponents(int id0,int id1)
  {
    return GetNumberOfObjectArrayComponents_108(id0,id1);
  }

  private native int GetObjectArrayStatus_109(int id0,int id1);
  public int GetObjectArrayStatus(int id0,int id1)
  {
    return GetObjectArrayStatus_109(id0,id1);
  }

  private native int GetObjectArrayStatus_110(int id0,byte[] id1, int len1);
  public int GetObjectArrayStatus(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetObjectArrayStatus_110(id0,bytes1, bytes1.length);
  }

  private native void SetObjectArrayStatus_111(int id0,int id1,int id2);
  public void SetObjectArrayStatus(int id0,int id1,int id2)
  {
    SetObjectArrayStatus_111(id0,id1,id2);
  }

  private native void SetObjectArrayStatus_112(int id0,byte[] id1, int len1,int id2);
  public void SetObjectArrayStatus(int id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetObjectArrayStatus_112(id0,bytes1, bytes1.length,id2);
  }

  private native int GetNumberOfObjectAttributes_113(int id0,int id1);
  public int GetNumberOfObjectAttributes(int id0,int id1)
  {
    return GetNumberOfObjectAttributes_113(id0,id1);
  }

  private native byte[] GetObjectAttributeName_114(int id0,int id1,int id2);
  public String GetObjectAttributeName(int id0,int id1,int id2)
  {
    return new String(GetObjectAttributeName_114(id0,id1,id2), StandardCharsets.UTF_8);
  }

  private native int GetObjectAttributeIndex_115(int id0,int id1,byte[] id2, int len2);
  public int GetObjectAttributeIndex(int id0,int id1,String id2)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return GetObjectAttributeIndex_115(id0,id1,bytes2, bytes2.length);
  }

  private native int GetObjectAttributeStatus_116(int id0,int id1,int id2);
  public int GetObjectAttributeStatus(int id0,int id1,int id2)
  {
    return GetObjectAttributeStatus_116(id0,id1,id2);
  }

  private native int GetObjectAttributeStatus_117(int id0,int id1,byte[] id2, int len2);
  public int GetObjectAttributeStatus(int id0,int id1,String id2)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return GetObjectAttributeStatus_117(id0,id1,bytes2, bytes2.length);
  }

  private native void SetObjectAttributeStatus_118(int id0,int id1,int id2,int id3);
  public void SetObjectAttributeStatus(int id0,int id1,int id2,int id3)
  {
    SetObjectAttributeStatus_118(id0,id1,id2,id3);
  }

  private native void SetObjectAttributeStatus_119(int id0,int id1,byte[] id2, int len2,int id3);
  public void SetObjectAttributeStatus(int id0,int id1,String id2,int id3)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetObjectAttributeStatus_119(id0,id1,bytes2, bytes2.length,id3);
  }

  private native long GetTotalNumberOfNodes_120();
  public long GetTotalNumberOfNodes()
  {
    return GetTotalNumberOfNodes_120();
  }

  private native long GetTotalNumberOfEdges_121();
  public long GetTotalNumberOfEdges()
  {
    return GetTotalNumberOfEdges_121();
  }

  private native long GetTotalNumberOfFaces_122();
  public long GetTotalNumberOfFaces()
  {
    return GetTotalNumberOfFaces_122();
  }

  private native long GetTotalNumberOfElements_123();
  public long GetTotalNumberOfElements()
  {
    return GetTotalNumberOfElements_123();
  }

  private native int GetNumberOfPartArrays_124();
  public int GetNumberOfPartArrays()
  {
    return GetNumberOfPartArrays_124();
  }

  private native byte[] GetPartArrayName_125(int id0);
  public String GetPartArrayName(int id0)
  {
    return new String(GetPartArrayName_125(id0), StandardCharsets.UTF_8);
  }

  private native int GetPartArrayID_126(byte[] id0, int len0);
  public int GetPartArrayID(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPartArrayID_126(bytes0, bytes0.length);
  }

  private native byte[] GetPartBlockInfo_127(int id0);
  public String GetPartBlockInfo(int id0)
  {
    return new String(GetPartBlockInfo_127(id0), StandardCharsets.UTF_8);
  }

  private native void SetPartArrayStatus_128(int id0,int id1);
  public void SetPartArrayStatus(int id0,int id1)
  {
    SetPartArrayStatus_128(id0,id1);
  }

  private native void SetPartArrayStatus_129(byte[] id0, int len0,int id1);
  public void SetPartArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPartArrayStatus_129(bytes0, bytes0.length,id1);
  }

  private native int GetPartArrayStatus_130(int id0);
  public int GetPartArrayStatus(int id0)
  {
    return GetPartArrayStatus_130(id0);
  }

  private native int GetPartArrayStatus_131(byte[] id0, int len0);
  public int GetPartArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPartArrayStatus_131(bytes0, bytes0.length);
  }

  private native int GetNumberOfMaterialArrays_132();
  public int GetNumberOfMaterialArrays()
  {
    return GetNumberOfMaterialArrays_132();
  }

  private native byte[] GetMaterialArrayName_133(int id0);
  public String GetMaterialArrayName(int id0)
  {
    return new String(GetMaterialArrayName_133(id0), StandardCharsets.UTF_8);
  }

  private native int GetMaterialArrayID_134(byte[] id0, int len0);
  public int GetMaterialArrayID(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetMaterialArrayID_134(bytes0, bytes0.length);
  }

  private native void SetMaterialArrayStatus_135(int id0,int id1);
  public void SetMaterialArrayStatus(int id0,int id1)
  {
    SetMaterialArrayStatus_135(id0,id1);
  }

  private native void SetMaterialArrayStatus_136(byte[] id0, int len0,int id1);
  public void SetMaterialArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMaterialArrayStatus_136(bytes0, bytes0.length,id1);
  }

  private native int GetMaterialArrayStatus_137(int id0);
  public int GetMaterialArrayStatus(int id0)
  {
    return GetMaterialArrayStatus_137(id0);
  }

  private native int GetMaterialArrayStatus_138(byte[] id0, int len0);
  public int GetMaterialArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetMaterialArrayStatus_138(bytes0, bytes0.length);
  }

  private native int GetNumberOfAssemblyArrays_139();
  public int GetNumberOfAssemblyArrays()
  {
    return GetNumberOfAssemblyArrays_139();
  }

  private native byte[] GetAssemblyArrayName_140(int id0);
  public String GetAssemblyArrayName(int id0)
  {
    return new String(GetAssemblyArrayName_140(id0), StandardCharsets.UTF_8);
  }

  private native int GetAssemblyArrayID_141(byte[] id0, int len0);
  public int GetAssemblyArrayID(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetAssemblyArrayID_141(bytes0, bytes0.length);
  }

  private native void SetAssemblyArrayStatus_142(int id0,int id1);
  public void SetAssemblyArrayStatus(int id0,int id1)
  {
    SetAssemblyArrayStatus_142(id0,id1);
  }

  private native void SetAssemblyArrayStatus_143(byte[] id0, int len0,int id1);
  public void SetAssemblyArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAssemblyArrayStatus_143(bytes0, bytes0.length,id1);
  }

  private native int GetAssemblyArrayStatus_144(int id0);
  public int GetAssemblyArrayStatus(int id0)
  {
    return GetAssemblyArrayStatus_144(id0);
  }

  private native int GetAssemblyArrayStatus_145(byte[] id0, int len0);
  public int GetAssemblyArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetAssemblyArrayStatus_145(bytes0, bytes0.length);
  }

  private native int GetNumberOfHierarchyArrays_146();
  public int GetNumberOfHierarchyArrays()
  {
    return GetNumberOfHierarchyArrays_146();
  }

  private native byte[] GetHierarchyArrayName_147(int id0);
  public String GetHierarchyArrayName(int id0)
  {
    return new String(GetHierarchyArrayName_147(id0), StandardCharsets.UTF_8);
  }

  private native void SetHierarchyArrayStatus_148(int id0,int id1);
  public void SetHierarchyArrayStatus(int id0,int id1)
  {
    SetHierarchyArrayStatus_148(id0,id1);
  }

  private native void SetHierarchyArrayStatus_149(byte[] id0, int len0,int id1);
  public void SetHierarchyArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetHierarchyArrayStatus_149(bytes0, bytes0.length,id1);
  }

  private native int GetHierarchyArrayStatus_150(int id0);
  public int GetHierarchyArrayStatus(int id0)
  {
    return GetHierarchyArrayStatus_150(id0);
  }

  private native int GetHierarchyArrayStatus_151(byte[] id0, int len0);
  public int GetHierarchyArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetHierarchyArrayStatus_151(bytes0, bytes0.length);
  }

  private native int GetDisplayType_152();
  public int GetDisplayType()
  {
    return GetDisplayType_152();
  }

  private native void SetDisplayType_153(int id0);
  public void SetDisplayType(int id0)
  {
    SetDisplayType_153(id0);
  }

  private native int IsValidVariable_154(byte[] id0, int len0,byte[] id1, int len1);
  public int IsValidVariable(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return IsValidVariable_154(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native int GetVariableID_155(byte[] id0, int len0,byte[] id1, int len1);
  public int GetVariableID(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetVariableID_155(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void SetAllArrayStatus_156(int id0,int id1);
  public void SetAllArrayStatus(int id0,int id1)
  {
    SetAllArrayStatus_156(id0,id1);
  }

  private native int GetTimeSeriesData_157(int id0,byte[] id1, int len1,byte[] id2, int len2,vtkFloatArray id3);
  public int GetTimeSeriesData(int id0,String id1,String id2,vtkFloatArray id3)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return GetTimeSeriesData_157(id0,bytes1, bytes1.length,bytes2, bytes2.length,id3);
  }

  private native int GetNumberOfEdgeBlockArrays_158();
  public int GetNumberOfEdgeBlockArrays()
  {
    return GetNumberOfEdgeBlockArrays_158();
  }

  private native byte[] GetEdgeBlockArrayName_159(int id0);
  public String GetEdgeBlockArrayName(int id0)
  {
    return new String(GetEdgeBlockArrayName_159(id0), StandardCharsets.UTF_8);
  }

  private native int GetEdgeBlockArrayStatus_160(byte[] id0, int len0);
  public int GetEdgeBlockArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetEdgeBlockArrayStatus_160(bytes0, bytes0.length);
  }

  private native void SetEdgeBlockArrayStatus_161(byte[] id0, int len0,int id1);
  public void SetEdgeBlockArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeBlockArrayStatus_161(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfFaceBlockArrays_162();
  public int GetNumberOfFaceBlockArrays()
  {
    return GetNumberOfFaceBlockArrays_162();
  }

  private native byte[] GetFaceBlockArrayName_163(int id0);
  public String GetFaceBlockArrayName(int id0)
  {
    return new String(GetFaceBlockArrayName_163(id0), StandardCharsets.UTF_8);
  }

  private native int GetFaceBlockArrayStatus_164(byte[] id0, int len0);
  public int GetFaceBlockArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetFaceBlockArrayStatus_164(bytes0, bytes0.length);
  }

  private native void SetFaceBlockArrayStatus_165(byte[] id0, int len0,int id1);
  public void SetFaceBlockArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFaceBlockArrayStatus_165(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfElementBlockArrays_166();
  public int GetNumberOfElementBlockArrays()
  {
    return GetNumberOfElementBlockArrays_166();
  }

  private native byte[] GetElementBlockArrayName_167(int id0);
  public String GetElementBlockArrayName(int id0)
  {
    return new String(GetElementBlockArrayName_167(id0), StandardCharsets.UTF_8);
  }

  private native int GetElementBlockArrayStatus_168(byte[] id0, int len0);
  public int GetElementBlockArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetElementBlockArrayStatus_168(bytes0, bytes0.length);
  }

  private native void SetElementBlockArrayStatus_169(byte[] id0, int len0,int id1);
  public void SetElementBlockArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetElementBlockArrayStatus_169(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfGlobalResultArrays_170();
  public int GetNumberOfGlobalResultArrays()
  {
    return GetNumberOfGlobalResultArrays_170();
  }

  private native byte[] GetGlobalResultArrayName_171(int id0);
  public String GetGlobalResultArrayName(int id0)
  {
    return new String(GetGlobalResultArrayName_171(id0), StandardCharsets.UTF_8);
  }

  private native int GetGlobalResultArrayStatus_172(byte[] id0, int len0);
  public int GetGlobalResultArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetGlobalResultArrayStatus_172(bytes0, bytes0.length);
  }

  private native void SetGlobalResultArrayStatus_173(byte[] id0, int len0,int id1);
  public void SetGlobalResultArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetGlobalResultArrayStatus_173(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfPointResultArrays_174();
  public int GetNumberOfPointResultArrays()
  {
    return GetNumberOfPointResultArrays_174();
  }

  private native byte[] GetPointResultArrayName_175(int id0);
  public String GetPointResultArrayName(int id0)
  {
    return new String(GetPointResultArrayName_175(id0), StandardCharsets.UTF_8);
  }

  private native int GetPointResultArrayStatus_176(byte[] id0, int len0);
  public int GetPointResultArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPointResultArrayStatus_176(bytes0, bytes0.length);
  }

  private native void SetPointResultArrayStatus_177(byte[] id0, int len0,int id1);
  public void SetPointResultArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointResultArrayStatus_177(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfEdgeResultArrays_178();
  public int GetNumberOfEdgeResultArrays()
  {
    return GetNumberOfEdgeResultArrays_178();
  }

  private native byte[] GetEdgeResultArrayName_179(int id0);
  public String GetEdgeResultArrayName(int id0)
  {
    return new String(GetEdgeResultArrayName_179(id0), StandardCharsets.UTF_8);
  }

  private native int GetEdgeResultArrayStatus_180(byte[] id0, int len0);
  public int GetEdgeResultArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetEdgeResultArrayStatus_180(bytes0, bytes0.length);
  }

  private native void SetEdgeResultArrayStatus_181(byte[] id0, int len0,int id1);
  public void SetEdgeResultArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeResultArrayStatus_181(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfFaceResultArrays_182();
  public int GetNumberOfFaceResultArrays()
  {
    return GetNumberOfFaceResultArrays_182();
  }

  private native byte[] GetFaceResultArrayName_183(int id0);
  public String GetFaceResultArrayName(int id0)
  {
    return new String(GetFaceResultArrayName_183(id0), StandardCharsets.UTF_8);
  }

  private native int GetFaceResultArrayStatus_184(byte[] id0, int len0);
  public int GetFaceResultArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetFaceResultArrayStatus_184(bytes0, bytes0.length);
  }

  private native void SetFaceResultArrayStatus_185(byte[] id0, int len0,int id1);
  public void SetFaceResultArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFaceResultArrayStatus_185(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfElementResultArrays_186();
  public int GetNumberOfElementResultArrays()
  {
    return GetNumberOfElementResultArrays_186();
  }

  private native byte[] GetElementResultArrayName_187(int id0);
  public String GetElementResultArrayName(int id0)
  {
    return new String(GetElementResultArrayName_187(id0), StandardCharsets.UTF_8);
  }

  private native int GetElementResultArrayStatus_188(byte[] id0, int len0);
  public int GetElementResultArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetElementResultArrayStatus_188(bytes0, bytes0.length);
  }

  private native void SetElementResultArrayStatus_189(byte[] id0, int len0,int id1);
  public void SetElementResultArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetElementResultArrayStatus_189(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfNodeMapArrays_190();
  public int GetNumberOfNodeMapArrays()
  {
    return GetNumberOfNodeMapArrays_190();
  }

  private native byte[] GetNodeMapArrayName_191(int id0);
  public String GetNodeMapArrayName(int id0)
  {
    return new String(GetNodeMapArrayName_191(id0), StandardCharsets.UTF_8);
  }

  private native int GetNodeMapArrayStatus_192(byte[] id0, int len0);
  public int GetNodeMapArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNodeMapArrayStatus_192(bytes0, bytes0.length);
  }

  private native void SetNodeMapArrayStatus_193(byte[] id0, int len0,int id1);
  public void SetNodeMapArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNodeMapArrayStatus_193(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfEdgeMapArrays_194();
  public int GetNumberOfEdgeMapArrays()
  {
    return GetNumberOfEdgeMapArrays_194();
  }

  private native byte[] GetEdgeMapArrayName_195(int id0);
  public String GetEdgeMapArrayName(int id0)
  {
    return new String(GetEdgeMapArrayName_195(id0), StandardCharsets.UTF_8);
  }

  private native int GetEdgeMapArrayStatus_196(byte[] id0, int len0);
  public int GetEdgeMapArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetEdgeMapArrayStatus_196(bytes0, bytes0.length);
  }

  private native void SetEdgeMapArrayStatus_197(byte[] id0, int len0,int id1);
  public void SetEdgeMapArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeMapArrayStatus_197(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfFaceMapArrays_198();
  public int GetNumberOfFaceMapArrays()
  {
    return GetNumberOfFaceMapArrays_198();
  }

  private native byte[] GetFaceMapArrayName_199(int id0);
  public String GetFaceMapArrayName(int id0)
  {
    return new String(GetFaceMapArrayName_199(id0), StandardCharsets.UTF_8);
  }

  private native int GetFaceMapArrayStatus_200(byte[] id0, int len0);
  public int GetFaceMapArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetFaceMapArrayStatus_200(bytes0, bytes0.length);
  }

  private native void SetFaceMapArrayStatus_201(byte[] id0, int len0,int id1);
  public void SetFaceMapArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFaceMapArrayStatus_201(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfElementMapArrays_202();
  public int GetNumberOfElementMapArrays()
  {
    return GetNumberOfElementMapArrays_202();
  }

  private native byte[] GetElementMapArrayName_203(int id0);
  public String GetElementMapArrayName(int id0)
  {
    return new String(GetElementMapArrayName_203(id0), StandardCharsets.UTF_8);
  }

  private native int GetElementMapArrayStatus_204(byte[] id0, int len0);
  public int GetElementMapArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetElementMapArrayStatus_204(bytes0, bytes0.length);
  }

  private native void SetElementMapArrayStatus_205(byte[] id0, int len0,int id1);
  public void SetElementMapArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetElementMapArrayStatus_205(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfNodeSetArrays_206();
  public int GetNumberOfNodeSetArrays()
  {
    return GetNumberOfNodeSetArrays_206();
  }

  private native byte[] GetNodeSetArrayName_207(int id0);
  public String GetNodeSetArrayName(int id0)
  {
    return new String(GetNodeSetArrayName_207(id0), StandardCharsets.UTF_8);
  }

  private native int GetNodeSetArrayStatus_208(byte[] id0, int len0);
  public int GetNodeSetArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNodeSetArrayStatus_208(bytes0, bytes0.length);
  }

  private native void SetNodeSetArrayStatus_209(byte[] id0, int len0,int id1);
  public void SetNodeSetArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNodeSetArrayStatus_209(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfSideSetArrays_210();
  public int GetNumberOfSideSetArrays()
  {
    return GetNumberOfSideSetArrays_210();
  }

  private native byte[] GetSideSetArrayName_211(int id0);
  public String GetSideSetArrayName(int id0)
  {
    return new String(GetSideSetArrayName_211(id0), StandardCharsets.UTF_8);
  }

  private native int GetSideSetArrayStatus_212(byte[] id0, int len0);
  public int GetSideSetArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetSideSetArrayStatus_212(bytes0, bytes0.length);
  }

  private native void SetSideSetArrayStatus_213(byte[] id0, int len0,int id1);
  public void SetSideSetArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSideSetArrayStatus_213(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfEdgeSetArrays_214();
  public int GetNumberOfEdgeSetArrays()
  {
    return GetNumberOfEdgeSetArrays_214();
  }

  private native byte[] GetEdgeSetArrayName_215(int id0);
  public String GetEdgeSetArrayName(int id0)
  {
    return new String(GetEdgeSetArrayName_215(id0), StandardCharsets.UTF_8);
  }

  private native int GetEdgeSetArrayStatus_216(byte[] id0, int len0);
  public int GetEdgeSetArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetEdgeSetArrayStatus_216(bytes0, bytes0.length);
  }

  private native void SetEdgeSetArrayStatus_217(byte[] id0, int len0,int id1);
  public void SetEdgeSetArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeSetArrayStatus_217(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfFaceSetArrays_218();
  public int GetNumberOfFaceSetArrays()
  {
    return GetNumberOfFaceSetArrays_218();
  }

  private native byte[] GetFaceSetArrayName_219(int id0);
  public String GetFaceSetArrayName(int id0)
  {
    return new String(GetFaceSetArrayName_219(id0), StandardCharsets.UTF_8);
  }

  private native int GetFaceSetArrayStatus_220(byte[] id0, int len0);
  public int GetFaceSetArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetFaceSetArrayStatus_220(bytes0, bytes0.length);
  }

  private native void SetFaceSetArrayStatus_221(byte[] id0, int len0,int id1);
  public void SetFaceSetArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFaceSetArrayStatus_221(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfElementSetArrays_222();
  public int GetNumberOfElementSetArrays()
  {
    return GetNumberOfElementSetArrays_222();
  }

  private native byte[] GetElementSetArrayName_223(int id0);
  public String GetElementSetArrayName(int id0)
  {
    return new String(GetElementSetArrayName_223(id0), StandardCharsets.UTF_8);
  }

  private native int GetElementSetArrayStatus_224(byte[] id0, int len0);
  public int GetElementSetArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetElementSetArrayStatus_224(bytes0, bytes0.length);
  }

  private native void SetElementSetArrayStatus_225(byte[] id0, int len0,int id1);
  public void SetElementSetArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetElementSetArrayStatus_225(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfNodeSetResultArrays_226();
  public int GetNumberOfNodeSetResultArrays()
  {
    return GetNumberOfNodeSetResultArrays_226();
  }

  private native byte[] GetNodeSetResultArrayName_227(int id0);
  public String GetNodeSetResultArrayName(int id0)
  {
    return new String(GetNodeSetResultArrayName_227(id0), StandardCharsets.UTF_8);
  }

  private native int GetNodeSetResultArrayStatus_228(byte[] id0, int len0);
  public int GetNodeSetResultArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNodeSetResultArrayStatus_228(bytes0, bytes0.length);
  }

  private native void SetNodeSetResultArrayStatus_229(byte[] id0, int len0,int id1);
  public void SetNodeSetResultArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNodeSetResultArrayStatus_229(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfSideSetResultArrays_230();
  public int GetNumberOfSideSetResultArrays()
  {
    return GetNumberOfSideSetResultArrays_230();
  }

  private native byte[] GetSideSetResultArrayName_231(int id0);
  public String GetSideSetResultArrayName(int id0)
  {
    return new String(GetSideSetResultArrayName_231(id0), StandardCharsets.UTF_8);
  }

  private native int GetSideSetResultArrayStatus_232(byte[] id0, int len0);
  public int GetSideSetResultArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetSideSetResultArrayStatus_232(bytes0, bytes0.length);
  }

  private native void SetSideSetResultArrayStatus_233(byte[] id0, int len0,int id1);
  public void SetSideSetResultArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSideSetResultArrayStatus_233(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfEdgeSetResultArrays_234();
  public int GetNumberOfEdgeSetResultArrays()
  {
    return GetNumberOfEdgeSetResultArrays_234();
  }

  private native byte[] GetEdgeSetResultArrayName_235(int id0);
  public String GetEdgeSetResultArrayName(int id0)
  {
    return new String(GetEdgeSetResultArrayName_235(id0), StandardCharsets.UTF_8);
  }

  private native int GetEdgeSetResultArrayStatus_236(byte[] id0, int len0);
  public int GetEdgeSetResultArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetEdgeSetResultArrayStatus_236(bytes0, bytes0.length);
  }

  private native void SetEdgeSetResultArrayStatus_237(byte[] id0, int len0,int id1);
  public void SetEdgeSetResultArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeSetResultArrayStatus_237(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfFaceSetResultArrays_238();
  public int GetNumberOfFaceSetResultArrays()
  {
    return GetNumberOfFaceSetResultArrays_238();
  }

  private native byte[] GetFaceSetResultArrayName_239(int id0);
  public String GetFaceSetResultArrayName(int id0)
  {
    return new String(GetFaceSetResultArrayName_239(id0), StandardCharsets.UTF_8);
  }

  private native int GetFaceSetResultArrayStatus_240(byte[] id0, int len0);
  public int GetFaceSetResultArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetFaceSetResultArrayStatus_240(bytes0, bytes0.length);
  }

  private native void SetFaceSetResultArrayStatus_241(byte[] id0, int len0,int id1);
  public void SetFaceSetResultArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFaceSetResultArrayStatus_241(bytes0, bytes0.length,id1);
  }

  private native int GetNumberOfElementSetResultArrays_242();
  public int GetNumberOfElementSetResultArrays()
  {
    return GetNumberOfElementSetResultArrays_242();
  }

  private native byte[] GetElementSetResultArrayName_243(int id0);
  public String GetElementSetResultArrayName(int id0)
  {
    return new String(GetElementSetResultArrayName_243(id0), StandardCharsets.UTF_8);
  }

  private native int GetElementSetResultArrayStatus_244(byte[] id0, int len0);
  public int GetElementSetResultArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetElementSetResultArrayStatus_244(bytes0, bytes0.length);
  }

  private native void SetElementSetResultArrayStatus_245(byte[] id0, int len0,int id1);
  public void SetElementSetResultArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetElementSetResultArrayStatus_245(bytes0, bytes0.length,id1);
  }

  private native void Reset_246();
  public void Reset()
  {
    Reset_246();
  }

  private native void ResetSettings_247();
  public void ResetSettings()
  {
    ResetSettings_247();
  }

  private native void ResetCache_248();
  public void ResetCache()
  {
    ResetCache_248();
  }

  private native void SetCacheSize_249(double id0);
  public void SetCacheSize(double id0)
  {
    SetCacheSize_249(id0);
  }

  private native double GetCacheSize_250();
  public double GetCacheSize()
  {
    return GetCacheSize_250();
  }

  private native void SetSqueezePoints_251(boolean id0);
  public void SetSqueezePoints(boolean id0)
  {
    SetSqueezePoints_251(id0);
  }

  private native boolean GetSqueezePoints_252();
  public boolean GetSqueezePoints()
  {
    return GetSqueezePoints_252();
  }

  private native void Dump_253();
  public void Dump()
  {
    Dump_253();
  }

  private native long GetSIL_254();
  public vtkGraph GetSIL()
  {
    long temp = GetSIL_254();

    if (temp == 0) return null;
    return (vtkGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetSILUpdateStamp_255();
  public int GetSILUpdateStamp()
  {
    return GetSILUpdateStamp_255();
  }

  private native int GetMaxNameLength_256();
  public int GetMaxNameLength()
  {
    return GetMaxNameLength_256();
  }

  private native long GLOBAL_VARIABLE_257();
  public vtkInformationIntegerKey GLOBAL_VARIABLE()
  {
    long temp = GLOBAL_VARIABLE_257();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GLOBAL_TEMPORAL_VARIABLE_258();
  public vtkInformationIntegerKey GLOBAL_TEMPORAL_VARIABLE()
  {
    long temp = GLOBAL_TEMPORAL_VARIABLE_258();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseLegacyBlockNames_259(boolean id0);
  public void SetUseLegacyBlockNames(boolean id0)
  {
    SetUseLegacyBlockNames_259(id0);
  }

  private native boolean GetUseLegacyBlockNames_260();
  public boolean GetUseLegacyBlockNames()
  {
    return GetUseLegacyBlockNames_260();
  }

  private native void UseLegacyBlockNamesOn_261();
  public void UseLegacyBlockNamesOn()
  {
    UseLegacyBlockNamesOn_261();
  }

  private native void UseLegacyBlockNamesOff_262();
  public void UseLegacyBlockNamesOff()
  {
    UseLegacyBlockNamesOff_262();
  }

  private native byte[] GetObjectName_263();
  public String GetObjectName()
  {
    return new String(GetObjectName_263(), StandardCharsets.UTF_8);
  }

  public vtkExodusIIReader() { super(); }

  public vtkExodusIIReader(long id) { super(id); }
  public native long   VTKInit();

}
