// java wrapper for vtkCGNSReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCGNSReader extends vtkMultiBlockDataSetAlgorithm
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

  private native void SetDataLocation_4(int id0);
  public void SetDataLocation(int id0)
  {
    SetDataLocation_4(id0);
  }

  private native int GetDataLocationMinValue_5();
  public int GetDataLocationMinValue()
  {
    return GetDataLocationMinValue_5();
  }

  private native int GetDataLocationMaxValue_6();
  public int GetDataLocationMaxValue()
  {
    return GetDataLocationMaxValue_6();
  }

  private native int GetDataLocation_7();
  public int GetDataLocation()
  {
    return GetDataLocation_7();
  }

  private native void SetFileName_8(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_8(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_9();
  public String GetFileName()
  {
    return new String(GetFileName_9(), StandardCharsets.UTF_8);
  }

  private native int CanReadFile_10(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_10(bytes0, bytes0.length);
  }

  private native long GetBaseSelection_11();
  public vtkDataArraySelection GetBaseSelection()
  {
    long temp = GetBaseSelection_11();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFamilySelection_12();
  public vtkDataArraySelection GetFamilySelection()
  {
    long temp = GetFamilySelection_12();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellDataArraySelection_13();
  public vtkDataArraySelection GetCellDataArraySelection()
  {
    long temp = GetCellDataArraySelection_13();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetFaceDataArraySelection_14();
  public vtkDataArraySelection GetFaceDataArraySelection()
  {
    long temp = GetFaceDataArraySelection_14();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPointDataArraySelection_15();
  public vtkDataArraySelection GetPointDataArraySelection()
  {
    long temp = GetPointDataArraySelection_15();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetBaseArrayStatus_16(byte[] id0, int len0);
  public int GetBaseArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetBaseArrayStatus_16(bytes0, bytes0.length);
  }

  private native void SetBaseArrayStatus_17(byte[] id0, int len0,int id1);
  public void SetBaseArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBaseArrayStatus_17(bytes0, bytes0.length,id1);
  }

  private native void DisableAllBases_18();
  public void DisableAllBases()
  {
    DisableAllBases_18();
  }

  private native void EnableAllBases_19();
  public void EnableAllBases()
  {
    EnableAllBases_19();
  }

  private native int GetNumberOfBaseArrays_20();
  public int GetNumberOfBaseArrays()
  {
    return GetNumberOfBaseArrays_20();
  }

  private native byte[] GetBaseArrayName_21(int id0);
  public String GetBaseArrayName(int id0)
  {
    return new String(GetBaseArrayName_21(id0), StandardCharsets.UTF_8);
  }

  private native int GetNumberOfFamilyArrays_22();
  public int GetNumberOfFamilyArrays()
  {
    return GetNumberOfFamilyArrays_22();
  }

  private native byte[] GetFamilyArrayName_23(int id0);
  public String GetFamilyArrayName(int id0)
  {
    return new String(GetFamilyArrayName_23(id0), StandardCharsets.UTF_8);
  }

  private native void SetFamilyArrayStatus_24(byte[] id0, int len0,int id1);
  public void SetFamilyArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFamilyArrayStatus_24(bytes0, bytes0.length,id1);
  }

  private native int GetFamilyArrayStatus_25(byte[] id0, int len0);
  public int GetFamilyArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetFamilyArrayStatus_25(bytes0, bytes0.length);
  }

  private native void EnableAllFamilies_26();
  public void EnableAllFamilies()
  {
    EnableAllFamilies_26();
  }

  private native void DisableAllFamilies_27();
  public void DisableAllFamilies()
  {
    DisableAllFamilies_27();
  }

  private native int GetNumberOfPointArrays_28();
  public int GetNumberOfPointArrays()
  {
    return GetNumberOfPointArrays_28();
  }

  private native byte[] GetPointArrayName_29(int id0);
  public String GetPointArrayName(int id0)
  {
    return new String(GetPointArrayName_29(id0), StandardCharsets.UTF_8);
  }

  private native int GetPointArrayStatus_30(byte[] id0, int len0);
  public int GetPointArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPointArrayStatus_30(bytes0, bytes0.length);
  }

  private native void SetPointArrayStatus_31(byte[] id0, int len0,int id1);
  public void SetPointArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointArrayStatus_31(bytes0, bytes0.length,id1);
  }

  private native void DisableAllPointArrays_32();
  public void DisableAllPointArrays()
  {
    DisableAllPointArrays_32();
  }

  private native void EnableAllPointArrays_33();
  public void EnableAllPointArrays()
  {
    EnableAllPointArrays_33();
  }

  private native int GetNumberOfCellArrays_34();
  public int GetNumberOfCellArrays()
  {
    return GetNumberOfCellArrays_34();
  }

  private native byte[] GetCellArrayName_35(int id0);
  public String GetCellArrayName(int id0)
  {
    return new String(GetCellArrayName_35(id0), StandardCharsets.UTF_8);
  }

  private native int GetCellArrayStatus_36(byte[] id0, int len0);
  public int GetCellArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetCellArrayStatus_36(bytes0, bytes0.length);
  }

  private native void SetCellArrayStatus_37(byte[] id0, int len0,int id1);
  public void SetCellArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellArrayStatus_37(bytes0, bytes0.length,id1);
  }

  private native void DisableAllCellArrays_38();
  public void DisableAllCellArrays()
  {
    DisableAllCellArrays_38();
  }

  private native void EnableAllCellArrays_39();
  public void EnableAllCellArrays()
  {
    EnableAllCellArrays_39();
  }

  private native int GetNumberOfFaceArrays_40();
  public int GetNumberOfFaceArrays()
  {
    return GetNumberOfFaceArrays_40();
  }

  private native byte[] GetFaceArrayName_41(int id0);
  public String GetFaceArrayName(int id0)
  {
    return new String(GetFaceArrayName_41(id0), StandardCharsets.UTF_8);
  }

  private native int GetFaceArrayStatus_42(byte[] id0, int len0);
  public int GetFaceArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetFaceArrayStatus_42(bytes0, bytes0.length);
  }

  private native void SetFaceArrayStatus_43(byte[] id0, int len0,int id1);
  public void SetFaceArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFaceArrayStatus_43(bytes0, bytes0.length,id1);
  }

  private native void DisableAllFaceArrays_44();
  public void DisableAllFaceArrays()
  {
    DisableAllFaceArrays_44();
  }

  private native void EnableAllFaceArrays_45();
  public void EnableAllFaceArrays()
  {
    EnableAllFaceArrays_45();
  }

  private native void SetDoublePrecisionMesh_46(int id0);
  public void SetDoublePrecisionMesh(int id0)
  {
    SetDoublePrecisionMesh_46(id0);
  }

  private native int GetDoublePrecisionMesh_47();
  public int GetDoublePrecisionMesh()
  {
    return GetDoublePrecisionMesh_47();
  }

  private native void DoublePrecisionMeshOn_48();
  public void DoublePrecisionMeshOn()
  {
    DoublePrecisionMeshOn_48();
  }

  private native void DoublePrecisionMeshOff_49();
  public void DoublePrecisionMeshOff()
  {
    DoublePrecisionMeshOff_49();
  }

  private native void SetLoadBndPatch_50(boolean id0);
  public void SetLoadBndPatch(boolean id0)
  {
    SetLoadBndPatch_50(id0);
  }

  private native boolean GetLoadBndPatch_51();
  public boolean GetLoadBndPatch()
  {
    return GetLoadBndPatch_51();
  }

  private native void LoadBndPatchOn_52();
  public void LoadBndPatchOn()
  {
    LoadBndPatchOn_52();
  }

  private native void LoadBndPatchOff_53();
  public void LoadBndPatchOff()
  {
    LoadBndPatchOff_53();
  }

  private native void SetLoadMesh_54(boolean id0);
  public void SetLoadMesh(boolean id0)
  {
    SetLoadMesh_54(id0);
  }

  private native boolean GetLoadMesh_55();
  public boolean GetLoadMesh()
  {
    return GetLoadMesh_55();
  }

  private native void LoadMeshOn_56();
  public void LoadMeshOn()
  {
    LoadMeshOn_56();
  }

  private native void LoadMeshOff_57();
  public void LoadMeshOff()
  {
    LoadMeshOff_57();
  }

  private native void SetUse3DVector_58(boolean id0);
  public void SetUse3DVector(boolean id0)
  {
    SetUse3DVector_58(id0);
  }

  private native boolean GetUse3DVector_59();
  public boolean GetUse3DVector()
  {
    return GetUse3DVector_59();
  }

  private native void Use3DVectorOn_60();
  public void Use3DVectorOn()
  {
    Use3DVectorOn_60();
  }

  private native void Use3DVectorOff_61();
  public void Use3DVectorOff()
  {
    Use3DVectorOff_61();
  }

  private native void SetCreateEachSolutionAsBlock_62(int id0);
  public void SetCreateEachSolutionAsBlock(int id0)
  {
    SetCreateEachSolutionAsBlock_62(id0);
  }

  private native int GetCreateEachSolutionAsBlock_63();
  public int GetCreateEachSolutionAsBlock()
  {
    return GetCreateEachSolutionAsBlock_63();
  }

  private native void CreateEachSolutionAsBlockOn_64();
  public void CreateEachSolutionAsBlockOn()
  {
    CreateEachSolutionAsBlockOn_64();
  }

  private native void CreateEachSolutionAsBlockOff_65();
  public void CreateEachSolutionAsBlockOff()
  {
    CreateEachSolutionAsBlockOff_65();
  }

  private native void SetIgnoreFlowSolutionPointers_66(boolean id0);
  public void SetIgnoreFlowSolutionPointers(boolean id0)
  {
    SetIgnoreFlowSolutionPointers_66(id0);
  }

  private native boolean GetIgnoreFlowSolutionPointers_67();
  public boolean GetIgnoreFlowSolutionPointers()
  {
    return GetIgnoreFlowSolutionPointers_67();
  }

  private native void IgnoreFlowSolutionPointersOn_68();
  public void IgnoreFlowSolutionPointersOn()
  {
    IgnoreFlowSolutionPointersOn_68();
  }

  private native void IgnoreFlowSolutionPointersOff_69();
  public void IgnoreFlowSolutionPointersOff()
  {
    IgnoreFlowSolutionPointersOff_69();
  }

  private native void SetUseUnsteadyPattern_70(boolean id0);
  public void SetUseUnsteadyPattern(boolean id0)
  {
    SetUseUnsteadyPattern_70(id0);
  }

  private native boolean GetUseUnsteadyPattern_71();
  public boolean GetUseUnsteadyPattern()
  {
    return GetUseUnsteadyPattern_71();
  }

  private native void UseUnsteadyPatternOn_72();
  public void UseUnsteadyPatternOn()
  {
    UseUnsteadyPatternOn_72();
  }

  private native void UseUnsteadyPatternOff_73();
  public void UseUnsteadyPatternOff()
  {
    UseUnsteadyPatternOff_73();
  }

  private native void SetUnsteadySolutionStartTimestep_74(int id0);
  public void SetUnsteadySolutionStartTimestep(int id0)
  {
    SetUnsteadySolutionStartTimestep_74(id0);
  }

  private native int GetUnsteadySolutionStartTimestep_75();
  public int GetUnsteadySolutionStartTimestep()
  {
    return GetUnsteadySolutionStartTimestep_75();
  }

  private native void SetDistributeBlocks_76(boolean id0);
  public void SetDistributeBlocks(boolean id0)
  {
    SetDistributeBlocks_76(id0);
  }

  private native boolean GetDistributeBlocks_77();
  public boolean GetDistributeBlocks()
  {
    return GetDistributeBlocks_77();
  }

  private native void DistributeBlocksOn_78();
  public void DistributeBlocksOn()
  {
    DistributeBlocksOn_78();
  }

  private native void DistributeBlocksOff_79();
  public void DistributeBlocksOff()
  {
    DistributeBlocksOff_79();
  }

  private native void SetCacheMesh_80(boolean id0);
  public void SetCacheMesh(boolean id0)
  {
    SetCacheMesh_80(id0);
  }

  private native boolean GetCacheMesh_81();
  public boolean GetCacheMesh()
  {
    return GetCacheMesh_81();
  }

  private native void CacheMeshOn_82();
  public void CacheMeshOn()
  {
    CacheMeshOn_82();
  }

  private native void CacheMeshOff_83();
  public void CacheMeshOff()
  {
    CacheMeshOff_83();
  }

  private native void SetCacheConnectivity_84(boolean id0);
  public void SetCacheConnectivity(boolean id0)
  {
    SetCacheConnectivity_84(id0);
  }

  private native boolean GetCacheConnectivity_85();
  public boolean GetCacheConnectivity()
  {
    return GetCacheConnectivity_85();
  }

  private native void CacheConnectivityOn_86();
  public void CacheConnectivityOn()
  {
    CacheConnectivityOn_86();
  }

  private native void CacheConnectivityOff_87();
  public void CacheConnectivityOff()
  {
    CacheConnectivityOff_87();
  }

  private native void SetController_88(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_88(id0);
  }

  private native long GetController_89();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_89();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Broadcast_90(vtkMultiProcessController id0);
  public void Broadcast(vtkMultiProcessController id0)
  {
    Broadcast_90(id0);
  }

  private native long FAMILY_91();
  public vtkInformationStringKey FAMILY()
  {
    long temp = FAMILY_91();

    if (temp == 0) return null;
    return (vtkInformationStringKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkCGNSReader() { super(); }

  public vtkCGNSReader(long id) { super(id); }
  public native long   VTKInit();

}
