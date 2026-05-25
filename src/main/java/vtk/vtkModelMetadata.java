// java wrapper for vtkModelMetadata object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkModelMetadata extends vtkObject
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

  private native void PrintGlobalInformation_4();
  public void PrintGlobalInformation()
  {
    PrintGlobalInformation_4();
  }

  private native void PrintLocalInformation_5();
  public void PrintLocalInformation()
  {
    PrintLocalInformation_5();
  }

  private native void SetTitle_6(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_6(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_7();
  public String GetTitle()
  {
    return new String(GetTitle_7(), StandardCharsets.UTF_8);
  }

  private native int GetNumberOfInformationLines_8();
  public int GetNumberOfInformationLines()
  {
    return GetNumberOfInformationLines_8();
  }

  private native void SetTimeStepIndex_9(int id0);
  public void SetTimeStepIndex(int id0)
  {
    SetTimeStepIndex_9(id0);
  }

  private native int GetTimeStepIndex_10();
  public int GetTimeStepIndex()
  {
    return GetTimeStepIndex_10();
  }

  private native int GetNumberOfTimeSteps_11();
  public int GetNumberOfTimeSteps()
  {
    return GetNumberOfTimeSteps_11();
  }

  private native int GetDimension_12();
  public int GetDimension()
  {
    return GetDimension_12();
  }

  private native void SetNumberOfBlocks_13(int id0);
  public void SetNumberOfBlocks(int id0)
  {
    SetNumberOfBlocks_13(id0);
  }

  private native int GetNumberOfBlocks_14();
  public int GetNumberOfBlocks()
  {
    return GetNumberOfBlocks_14();
  }

  private native int GetSumElementsPerBlock_15();
  public int GetSumElementsPerBlock()
  {
    return GetSumElementsPerBlock_15();
  }

  private native int GetSizeBlockAttributeArray_16();
  public int GetSizeBlockAttributeArray()
  {
    return GetSizeBlockAttributeArray_16();
  }

  private native void SetNumberOfNodeSets_17(int id0);
  public void SetNumberOfNodeSets(int id0)
  {
    SetNumberOfNodeSets_17(id0);
  }

  private native int GetNumberOfNodeSets_18();
  public int GetNumberOfNodeSets()
  {
    return GetNumberOfNodeSets_18();
  }

  private native void SetNodeSetNames_19(vtkStringArray id0);
  public void SetNodeSetNames(vtkStringArray id0)
  {
    SetNodeSetNames_19(id0);
  }

  private native long GetNodeSetNames_20();
  public vtkStringArray GetNodeSetNames()
  {
    long temp = GetNodeSetNames_20();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSumNodesPerNodeSet_21(int id0);
  public void SetSumNodesPerNodeSet(int id0)
  {
    SetSumNodesPerNodeSet_21(id0);
  }

  private native int GetSumNodesPerNodeSet_22();
  public int GetSumNodesPerNodeSet()
  {
    return GetSumNodesPerNodeSet_22();
  }

  private native int GetSumDistFactPerNodeSet_23();
  public int GetSumDistFactPerNodeSet()
  {
    return GetSumDistFactPerNodeSet_23();
  }

  private native void SetNumberOfSideSets_24(int id0);
  public void SetNumberOfSideSets(int id0)
  {
    SetNumberOfSideSets_24(id0);
  }

  private native int GetNumberOfSideSets_25();
  public int GetNumberOfSideSets()
  {
    return GetNumberOfSideSets_25();
  }

  private native void SetSideSetNames_26(vtkStringArray id0);
  public void SetSideSetNames(vtkStringArray id0)
  {
    SetSideSetNames_26(id0);
  }

  private native long GetSideSetNames_27();
  public vtkStringArray GetSideSetNames()
  {
    long temp = GetSideSetNames_27();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSumSidesPerSideSet_28(int id0);
  public void SetSumSidesPerSideSet(int id0)
  {
    SetSumSidesPerSideSet_28(id0);
  }

  private native int GetSumSidesPerSideSet_29();
  public int GetSumSidesPerSideSet()
  {
    return GetSumSidesPerSideSet_29();
  }

  private native int GetSumDistFactPerSideSet_30();
  public int GetSumDistFactPerSideSet()
  {
    return GetSumDistFactPerSideSet_30();
  }

  private native int GetNumberOfBlockProperties_31();
  public int GetNumberOfBlockProperties()
  {
    return GetNumberOfBlockProperties_31();
  }

  private native int GetNumberOfNodeSetProperties_32();
  public int GetNumberOfNodeSetProperties()
  {
    return GetNumberOfNodeSetProperties_32();
  }

  private native int GetNumberOfSideSetProperties_33();
  public int GetNumberOfSideSetProperties()
  {
    return GetNumberOfSideSetProperties_33();
  }

  private native int GetNumberOfGlobalVariables_34();
  public int GetNumberOfGlobalVariables()
  {
    return GetNumberOfGlobalVariables_34();
  }

  private native void SetAllVariablesDefinedInAllBlocks_35(int id0);
  public void SetAllVariablesDefinedInAllBlocks(int id0)
  {
    SetAllVariablesDefinedInAllBlocks_35(id0);
  }

  private native void AllVariablesDefinedInAllBlocksOn_36();
  public void AllVariablesDefinedInAllBlocksOn()
  {
    AllVariablesDefinedInAllBlocksOn_36();
  }

  private native void AllVariablesDefinedInAllBlocksOff_37();
  public void AllVariablesDefinedInAllBlocksOff()
  {
    AllVariablesDefinedInAllBlocksOff_37();
  }

  private native int GetAllVariablesDefinedInAllBlocks_38();
  public int GetAllVariablesDefinedInAllBlocks()
  {
    return GetAllVariablesDefinedInAllBlocks_38();
  }

  private native int GetOriginalNumberOfElementVariables_39();
  public int GetOriginalNumberOfElementVariables()
  {
    return GetOriginalNumberOfElementVariables_39();
  }

  private native int GetNumberOfElementVariables_40();
  public int GetNumberOfElementVariables()
  {
    return GetNumberOfElementVariables_40();
  }

  private native int GetOriginalNumberOfNodeVariables_41();
  public int GetOriginalNumberOfNodeVariables()
  {
    return GetOriginalNumberOfNodeVariables_41();
  }

  private native int GetNumberOfNodeVariables_42();
  public int GetNumberOfNodeVariables()
  {
    return GetNumberOfNodeVariables_42();
  }

  private native void FreeAllGlobalData_43();
  public void FreeAllGlobalData()
  {
    FreeAllGlobalData_43();
  }

  private native void FreeAllLocalData_44();
  public void FreeAllLocalData()
  {
    FreeAllLocalData_44();
  }

  private native void FreeBlockDependentData_45();
  public void FreeBlockDependentData()
  {
    FreeBlockDependentData_45();
  }

  private native void FreeOriginalElementVariableNames_46();
  public void FreeOriginalElementVariableNames()
  {
    FreeOriginalElementVariableNames_46();
  }

  private native void FreeOriginalNodeVariableNames_47();
  public void FreeOriginalNodeVariableNames()
  {
    FreeOriginalNodeVariableNames_47();
  }

  private native void FreeUsedElementVariableNames_48();
  public void FreeUsedElementVariableNames()
  {
    FreeUsedElementVariableNames_48();
  }

  private native void FreeUsedNodeVariableNames_49();
  public void FreeUsedNodeVariableNames()
  {
    FreeUsedNodeVariableNames_49();
  }

  private native void FreeUsedElementVariables_50();
  public void FreeUsedElementVariables()
  {
    FreeUsedElementVariables_50();
  }

  private native void FreeUsedNodeVariables_51();
  public void FreeUsedNodeVariables()
  {
    FreeUsedNodeVariables_51();
  }

  private native void Reset_52();
  public void Reset()
  {
    Reset_52();
  }

  public vtkModelMetadata() { super(); }

  public vtkModelMetadata(long id) { super(id); }
  public native long   VTKInit();

}
