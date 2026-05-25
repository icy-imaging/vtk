// java wrapper for vtkIOSSWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkIOSSWriter extends vtkWriter
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetAssemblyName_6(byte[] id0, int len0);
  public void SetAssemblyName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAssemblyName_6(bytes0, bytes0.length);
  }

  private native byte[] GetAssemblyName_7();
  public String GetAssemblyName()
  {
    return new String(GetAssemblyName_7(), StandardCharsets.UTF_8);
  }

  private native void SetChooseFieldsToWrite_8(boolean id0);
  public void SetChooseFieldsToWrite(boolean id0)
  {
    SetChooseFieldsToWrite_8(id0);
  }

  private native boolean GetChooseFieldsToWrite_9();
  public boolean GetChooseFieldsToWrite()
  {
    return GetChooseFieldsToWrite_9();
  }

  private native void ChooseFieldsToWriteOn_10();
  public void ChooseFieldsToWriteOn()
  {
    ChooseFieldsToWriteOn_10();
  }

  private native void ChooseFieldsToWriteOff_11();
  public void ChooseFieldsToWriteOff()
  {
    ChooseFieldsToWriteOff_11();
  }

  private native boolean AddSelector_12(int id0,byte[] id1, int len1);
  public boolean AddSelector(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return AddSelector_12(id0,bytes1, bytes1.length);
  }

  private native void ClearSelectors_13(int id0);
  public void ClearSelectors(int id0)
  {
    ClearSelectors_13(id0);
  }

  private native void SetSelector_14(int id0,byte[] id1, int len1);
  public void SetSelector(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetSelector_14(id0,bytes1, bytes1.length);
  }

  private native int GetNumberOfSelectors_15(int id0);
  public int GetNumberOfSelectors(int id0)
  {
    return GetNumberOfSelectors_15(id0);
  }

  private native byte[] GetSelector_16(int id0,int id1);
  public String GetSelector(int id0,int id1)
  {
    return new String(GetSelector_16(id0,id1), StandardCharsets.UTF_8);
  }

  private native long GetFieldSelection_17(int id0);
  public vtkDataArraySelection GetFieldSelection(int id0)
  {
    long temp = GetFieldSelection_17(id0);

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNodeBlockFieldSelection_18();
  public vtkDataArraySelection GetNodeBlockFieldSelection()
  {
    long temp = GetNodeBlockFieldSelection_18();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean AddEdgeBlockSelector_19(byte[] id0, int len0);
  public boolean AddEdgeBlockSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddEdgeBlockSelector_19(bytes0, bytes0.length);
  }

  private native void ClearEdgeBlockSelectors_20();
  public void ClearEdgeBlockSelectors()
  {
    ClearEdgeBlockSelectors_20();
  }

  private native void SetEdgeBlockSelector_21(byte[] id0, int len0);
  public void SetEdgeBlockSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeBlockSelector_21(bytes0, bytes0.length);
  }

  private native int GetNumberOfEdgeBlockSelectors_22();
  public int GetNumberOfEdgeBlockSelectors()
  {
    return GetNumberOfEdgeBlockSelectors_22();
  }

  private native byte[] GetEdgeBlockSelector_23(int id0);
  public String GetEdgeBlockSelector(int id0)
  {
    return new String(GetEdgeBlockSelector_23(id0), StandardCharsets.UTF_8);
  }

  private native long GetEdgeBlockFieldSelection_24();
  public vtkDataArraySelection GetEdgeBlockFieldSelection()
  {
    long temp = GetEdgeBlockFieldSelection_24();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean AddFaceBlockSelector_25(byte[] id0, int len0);
  public boolean AddFaceBlockSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddFaceBlockSelector_25(bytes0, bytes0.length);
  }

  private native void ClearFaceBlockSelectors_26();
  public void ClearFaceBlockSelectors()
  {
    ClearFaceBlockSelectors_26();
  }

  private native void SetFaceBlockSelector_27(byte[] id0, int len0);
  public void SetFaceBlockSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFaceBlockSelector_27(bytes0, bytes0.length);
  }

  private native int GetNumberOfFaceBlockSelectors_28();
  public int GetNumberOfFaceBlockSelectors()
  {
    return GetNumberOfFaceBlockSelectors_28();
  }

  private native byte[] GetFaceBlockSelector_29(int id0);
  public String GetFaceBlockSelector(int id0)
  {
    return new String(GetFaceBlockSelector_29(id0), StandardCharsets.UTF_8);
  }

  private native long GetFaceBlockFieldSelection_30();
  public vtkDataArraySelection GetFaceBlockFieldSelection()
  {
    long temp = GetFaceBlockFieldSelection_30();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean AddElementBlockSelector_31(byte[] id0, int len0);
  public boolean AddElementBlockSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddElementBlockSelector_31(bytes0, bytes0.length);
  }

  private native void ClearElementBlockSelectors_32();
  public void ClearElementBlockSelectors()
  {
    ClearElementBlockSelectors_32();
  }

  private native void SetElementBlockSelector_33(byte[] id0, int len0);
  public void SetElementBlockSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetElementBlockSelector_33(bytes0, bytes0.length);
  }

  private native int GetNumberOfElementBlockSelectors_34();
  public int GetNumberOfElementBlockSelectors()
  {
    return GetNumberOfElementBlockSelectors_34();
  }

  private native byte[] GetElementBlockSelector_35(int id0);
  public String GetElementBlockSelector(int id0)
  {
    return new String(GetElementBlockSelector_35(id0), StandardCharsets.UTF_8);
  }

  private native long GetElementBlockFieldSelection_36();
  public vtkDataArraySelection GetElementBlockFieldSelection()
  {
    long temp = GetElementBlockFieldSelection_36();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean AddNodeSetSelector_37(byte[] id0, int len0);
  public boolean AddNodeSetSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddNodeSetSelector_37(bytes0, bytes0.length);
  }

  private native void ClearNodeSetSelectors_38();
  public void ClearNodeSetSelectors()
  {
    ClearNodeSetSelectors_38();
  }

  private native void SetNodeSetSelector_39(byte[] id0, int len0);
  public void SetNodeSetSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNodeSetSelector_39(bytes0, bytes0.length);
  }

  private native int GetNumberOfNodeSetSelectors_40();
  public int GetNumberOfNodeSetSelectors()
  {
    return GetNumberOfNodeSetSelectors_40();
  }

  private native byte[] GetNodeSetSelector_41(int id0);
  public String GetNodeSetSelector(int id0)
  {
    return new String(GetNodeSetSelector_41(id0), StandardCharsets.UTF_8);
  }

  private native long GetNodeSetFieldSelection_42();
  public vtkDataArraySelection GetNodeSetFieldSelection()
  {
    long temp = GetNodeSetFieldSelection_42();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean AddEdgeSetSelector_43(byte[] id0, int len0);
  public boolean AddEdgeSetSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddEdgeSetSelector_43(bytes0, bytes0.length);
  }

  private native void ClearEdgeSetSelectors_44();
  public void ClearEdgeSetSelectors()
  {
    ClearEdgeSetSelectors_44();
  }

  private native void SetEdgeSetSelector_45(byte[] id0, int len0);
  public void SetEdgeSetSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetEdgeSetSelector_45(bytes0, bytes0.length);
  }

  private native int GetNumberOfEdgeSetSelectors_46();
  public int GetNumberOfEdgeSetSelectors()
  {
    return GetNumberOfEdgeSetSelectors_46();
  }

  private native byte[] GetEdgeSetSelector_47(int id0);
  public String GetEdgeSetSelector(int id0)
  {
    return new String(GetEdgeSetSelector_47(id0), StandardCharsets.UTF_8);
  }

  private native long GetEdgeSetFieldSelection_48();
  public vtkDataArraySelection GetEdgeSetFieldSelection()
  {
    long temp = GetEdgeSetFieldSelection_48();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean AddFaceSetSelector_49(byte[] id0, int len0);
  public boolean AddFaceSetSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddFaceSetSelector_49(bytes0, bytes0.length);
  }

  private native void ClearFaceSetSelectors_50();
  public void ClearFaceSetSelectors()
  {
    ClearFaceSetSelectors_50();
  }

  private native void SetFaceSetSelector_51(byte[] id0, int len0);
  public void SetFaceSetSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFaceSetSelector_51(bytes0, bytes0.length);
  }

  private native int GetNumberOfFaceSetSelectors_52();
  public int GetNumberOfFaceSetSelectors()
  {
    return GetNumberOfFaceSetSelectors_52();
  }

  private native byte[] GetFaceSetSelector_53(int id0);
  public String GetFaceSetSelector(int id0)
  {
    return new String(GetFaceSetSelector_53(id0), StandardCharsets.UTF_8);
  }

  private native long GetFaceSetFieldSelection_54();
  public vtkDataArraySelection GetFaceSetFieldSelection()
  {
    long temp = GetFaceSetFieldSelection_54();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean AddElementSetSelector_55(byte[] id0, int len0);
  public boolean AddElementSetSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddElementSetSelector_55(bytes0, bytes0.length);
  }

  private native void ClearElementSetSelectors_56();
  public void ClearElementSetSelectors()
  {
    ClearElementSetSelectors_56();
  }

  private native void SetElementSetSelector_57(byte[] id0, int len0);
  public void SetElementSetSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetElementSetSelector_57(bytes0, bytes0.length);
  }

  private native int GetNumberOfElementSetSelectors_58();
  public int GetNumberOfElementSetSelectors()
  {
    return GetNumberOfElementSetSelectors_58();
  }

  private native byte[] GetElementSetSelector_59(int id0);
  public String GetElementSetSelector(int id0)
  {
    return new String(GetElementSetSelector_59(id0), StandardCharsets.UTF_8);
  }

  private native long GetElementSetFieldSelection_60();
  public vtkDataArraySelection GetElementSetFieldSelection()
  {
    long temp = GetElementSetFieldSelection_60();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean AddSideSetSelector_61(byte[] id0, int len0);
  public boolean AddSideSetSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddSideSetSelector_61(bytes0, bytes0.length);
  }

  private native void ClearSideSetSelectors_62();
  public void ClearSideSetSelectors()
  {
    ClearSideSetSelectors_62();
  }

  private native void SetSideSetSelector_63(byte[] id0, int len0);
  public void SetSideSetSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSideSetSelector_63(bytes0, bytes0.length);
  }

  private native int GetNumberOfSideSetSelectors_64();
  public int GetNumberOfSideSetSelectors()
  {
    return GetNumberOfSideSetSelectors_64();
  }

  private native byte[] GetSideSetSelector_65(int id0);
  public String GetSideSetSelector(int id0)
  {
    return new String(GetSideSetSelector_65(id0), StandardCharsets.UTF_8);
  }

  private native long GetSideSetFieldSelection_66();
  public vtkDataArraySelection GetSideSetFieldSelection()
  {
    long temp = GetSideSetFieldSelection_66();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRemoveGhosts_67(boolean id0);
  public void SetRemoveGhosts(boolean id0)
  {
    SetRemoveGhosts_67(id0);
  }

  private native boolean GetRemoveGhosts_68();
  public boolean GetRemoveGhosts()
  {
    return GetRemoveGhosts_68();
  }

  private native void SetOffsetGlobalIds_69(boolean id0);
  public void SetOffsetGlobalIds(boolean id0)
  {
    SetOffsetGlobalIds_69(id0);
  }

  private native boolean GetOffsetGlobalIds_70();
  public boolean GetOffsetGlobalIds()
  {
    return GetOffsetGlobalIds_70();
  }

  private native void OffsetGlobalIdsOn_71();
  public void OffsetGlobalIdsOn()
  {
    OffsetGlobalIdsOn_71();
  }

  private native void OffsetGlobalIdsOff_72();
  public void OffsetGlobalIdsOff()
  {
    OffsetGlobalIdsOff_72();
  }

  private native void SetPreserveInputEntityGroups_73(boolean id0);
  public void SetPreserveInputEntityGroups(boolean id0)
  {
    SetPreserveInputEntityGroups_73(id0);
  }

  private native boolean GetPreserveInputEntityGroups_74();
  public boolean GetPreserveInputEntityGroups()
  {
    return GetPreserveInputEntityGroups_74();
  }

  private native void PreserveInputEntityGroupsOn_75();
  public void PreserveInputEntityGroupsOn()
  {
    PreserveInputEntityGroupsOn_75();
  }

  private native void PreserveInputEntityGroupsOff_76();
  public void PreserveInputEntityGroupsOff()
  {
    PreserveInputEntityGroupsOff_76();
  }

  private native void SetPreserveOriginalIds_77(boolean id0);
  public void SetPreserveOriginalIds(boolean id0)
  {
    SetPreserveOriginalIds_77(id0);
  }

  private native boolean GetPreserveOriginalIds_78();
  public boolean GetPreserveOriginalIds()
  {
    return GetPreserveOriginalIds_78();
  }

  private native void PreserveOriginalIdsOn_79();
  public void PreserveOriginalIdsOn()
  {
    PreserveOriginalIdsOn_79();
  }

  private native void PreserveOriginalIdsOff_80();
  public void PreserveOriginalIdsOff()
  {
    PreserveOriginalIdsOff_80();
  }

  private native void SetWriteQAAndInformationRecords_81(boolean id0);
  public void SetWriteQAAndInformationRecords(boolean id0)
  {
    SetWriteQAAndInformationRecords_81(id0);
  }

  private native boolean GetWriteQAAndInformationRecords_82();
  public boolean GetWriteQAAndInformationRecords()
  {
    return GetWriteQAAndInformationRecords_82();
  }

  private native void WriteQAAndInformationRecordsOn_83();
  public void WriteQAAndInformationRecordsOn()
  {
    WriteQAAndInformationRecordsOn_83();
  }

  private native void WriteQAAndInformationRecordsOff_84();
  public void WriteQAAndInformationRecordsOff()
  {
    WriteQAAndInformationRecordsOff_84();
  }

  private native void SetDisplacementMagnitude_85(double id0);
  public void SetDisplacementMagnitude(double id0)
  {
    SetDisplacementMagnitude_85(id0);
  }

  private native double GetDisplacementMagnitudeMinValue_86();
  public double GetDisplacementMagnitudeMinValue()
  {
    return GetDisplacementMagnitudeMinValue_86();
  }

  private native double GetDisplacementMagnitudeMaxValue_87();
  public double GetDisplacementMagnitudeMaxValue()
  {
    return GetDisplacementMagnitudeMaxValue_87();
  }

  private native double GetDisplacementMagnitude_88();
  public double GetDisplacementMagnitude()
  {
    return GetDisplacementMagnitude_88();
  }

  private native void SetMaximumTimeStepsPerFile_89(int id0);
  public void SetMaximumTimeStepsPerFile(int id0)
  {
    SetMaximumTimeStepsPerFile_89(id0);
  }

  private native int GetMaximumTimeStepsPerFile_90();
  public int GetMaximumTimeStepsPerFile()
  {
    return GetMaximumTimeStepsPerFile_90();
  }

  private native void SetTimeStepRange_91(int id0,int id1);
  public void SetTimeStepRange(int id0,int id1)
  {
    SetTimeStepRange_91(id0,id1);
  }

  private native void SetTimeStepRange_92(int id0[]);
  public void SetTimeStepRange(int id0[])
  {
    SetTimeStepRange_92(id0);
  }

  private native int[] GetTimeStepRange_93();
  public int[] GetTimeStepRange()
  {
    return GetTimeStepRange_93();
  }

  private native void SetTimeStepStride_94(int id0);
  public void SetTimeStepStride(int id0)
  {
    SetTimeStepStride_94(id0);
  }

  private native int GetTimeStepStrideMinValue_95();
  public int GetTimeStepStrideMinValue()
  {
    return GetTimeStepStrideMinValue_95();
  }

  private native int GetTimeStepStrideMaxValue_96();
  public int GetTimeStepStrideMaxValue()
  {
    return GetTimeStepStrideMaxValue_96();
  }

  private native int GetTimeStepStride_97();
  public int GetTimeStepStride()
  {
    return GetTimeStepStride_97();
  }

  private native void SetController_98(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_98(id0);
  }

  private native long GetController_99();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_99();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkIOSSWriter() { super(); }

  public vtkIOSSWriter(long id) { super(id); }
  public native long   VTKInit();

}
