// java wrapper for vtkLSDynaReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLSDynaReader extends vtkMultiBlockDataSetAlgorithm
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

  private native void DebugDump_4();
  public void DebugDump()
  {
    DebugDump_4();
  }

  private native int CanReadFile_5(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_5(bytes0, bytes0.length);
  }

  private native void SetDatabaseDirectory_6(byte[] id0, int len0);
  public void SetDatabaseDirectory(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDatabaseDirectory_6(bytes0, bytes0.length);
  }

  private native byte[] GetDatabaseDirectory_7();
  public String GetDatabaseDirectory()
  {
    return new String(GetDatabaseDirectory_7(), StandardCharsets.UTF_8);
  }

  private native int IsDatabaseValid_8();
  public int IsDatabaseValid()
  {
    return IsDatabaseValid_8();
  }

  private native void SetFileName_9(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_9(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_10();
  public String GetFileName()
  {
    return new String(GetFileName_10(), StandardCharsets.UTF_8);
  }

  private native byte[] GetTitle_11();
  public String GetTitle()
  {
    return new String(GetTitle_11(), StandardCharsets.UTF_8);
  }

  private native int GetDimensionality_12();
  public int GetDimensionality()
  {
    return GetDimensionality_12();
  }

  private native long GetNumberOfNodes_13();
  public long GetNumberOfNodes()
  {
    return GetNumberOfNodes_13();
  }

  private native long GetNumberOfCells_14();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_14();
  }

  private native long GetNumberOfContinuumCells_15();
  public long GetNumberOfContinuumCells()
  {
    return GetNumberOfContinuumCells_15();
  }

  private native long GetNumberOfSolidCells_16();
  public long GetNumberOfSolidCells()
  {
    return GetNumberOfSolidCells_16();
  }

  private native long GetNumberOfThickShellCells_17();
  public long GetNumberOfThickShellCells()
  {
    return GetNumberOfThickShellCells_17();
  }

  private native long GetNumberOfShellCells_18();
  public long GetNumberOfShellCells()
  {
    return GetNumberOfShellCells_18();
  }

  private native long GetNumberOfRigidBodyCells_19();
  public long GetNumberOfRigidBodyCells()
  {
    return GetNumberOfRigidBodyCells_19();
  }

  private native long GetNumberOfRoadSurfaceCells_20();
  public long GetNumberOfRoadSurfaceCells()
  {
    return GetNumberOfRoadSurfaceCells_20();
  }

  private native long GetNumberOfBeamCells_21();
  public long GetNumberOfBeamCells()
  {
    return GetNumberOfBeamCells_21();
  }

  private native long GetNumberOfParticleCells_22();
  public long GetNumberOfParticleCells()
  {
    return GetNumberOfParticleCells_22();
  }

  private native long GetNumberOfTimeSteps_23();
  public long GetNumberOfTimeSteps()
  {
    return GetNumberOfTimeSteps_23();
  }

  private native void SetTimeStep_24(long id0);
  public void SetTimeStep(long id0)
  {
    SetTimeStep_24(id0);
  }

  private native long GetTimeStep_25();
  public long GetTimeStep()
  {
    return GetTimeStep_25();
  }

  private native double GetTimeValue_26(long id0);
  public double GetTimeValue(long id0)
  {
    return GetTimeValue_26(id0);
  }

  private native int[] GetTimeStepRange_27();
  public int[] GetTimeStepRange()
  {
    return GetTimeStepRange_27();
  }

  private native void SetTimeStepRange_28(int id0,int id1);
  public void SetTimeStepRange(int id0,int id1)
  {
    SetTimeStepRange_28(id0,id1);
  }

  private native void SetTimeStepRange_29(int id0[]);
  public void SetTimeStepRange(int id0[])
  {
    SetTimeStepRange_29(id0);
  }

  private native int GetNumberOfPointArrays_30();
  public int GetNumberOfPointArrays()
  {
    return GetNumberOfPointArrays_30();
  }

  private native byte[] GetPointArrayName_31(int id0);
  public String GetPointArrayName(int id0)
  {
    return new String(GetPointArrayName_31(id0), StandardCharsets.UTF_8);
  }

  private native void SetPointArrayStatus_32(int id0,int id1);
  public void SetPointArrayStatus(int id0,int id1)
  {
    SetPointArrayStatus_32(id0,id1);
  }

  private native void SetPointArrayStatus_33(byte[] id0, int len0,int id1);
  public void SetPointArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointArrayStatus_33(bytes0, bytes0.length,id1);
  }

  private native int GetPointArrayStatus_34(int id0);
  public int GetPointArrayStatus(int id0)
  {
    return GetPointArrayStatus_34(id0);
  }

  private native int GetPointArrayStatus_35(byte[] id0, int len0);
  public int GetPointArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPointArrayStatus_35(bytes0, bytes0.length);
  }

  private native int GetNumberOfComponentsInPointArray_36(int id0);
  public int GetNumberOfComponentsInPointArray(int id0)
  {
    return GetNumberOfComponentsInPointArray_36(id0);
  }

  private native int GetNumberOfComponentsInPointArray_37(byte[] id0, int len0);
  public int GetNumberOfComponentsInPointArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfComponentsInPointArray_37(bytes0, bytes0.length);
  }

  private native int GetNumberOfCellArrays_38(int id0);
  public int GetNumberOfCellArrays(int id0)
  {
    return GetNumberOfCellArrays_38(id0);
  }

  private native byte[] GetCellArrayName_39(int id0,int id1);
  public String GetCellArrayName(int id0,int id1)
  {
    return new String(GetCellArrayName_39(id0,id1), StandardCharsets.UTF_8);
  }

  private native void SetCellArrayStatus_40(int id0,int id1,int id2);
  public void SetCellArrayStatus(int id0,int id1,int id2)
  {
    SetCellArrayStatus_40(id0,id1,id2);
  }

  private native void SetCellArrayStatus_41(int id0,byte[] id1, int len1,int id2);
  public void SetCellArrayStatus(int id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetCellArrayStatus_41(id0,bytes1, bytes1.length,id2);
  }

  private native int GetCellArrayStatus_42(int id0,int id1);
  public int GetCellArrayStatus(int id0,int id1)
  {
    return GetCellArrayStatus_42(id0,id1);
  }

  private native int GetCellArrayStatus_43(int id0,byte[] id1, int len1);
  public int GetCellArrayStatus(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetCellArrayStatus_43(id0,bytes1, bytes1.length);
  }

  private native int GetNumberOfComponentsInCellArray_44(int id0,int id1);
  public int GetNumberOfComponentsInCellArray(int id0,int id1)
  {
    return GetNumberOfComponentsInCellArray_44(id0,id1);
  }

  private native int GetNumberOfComponentsInCellArray_45(int id0,byte[] id1, int len1);
  public int GetNumberOfComponentsInCellArray(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfComponentsInCellArray_45(id0,bytes1, bytes1.length);
  }

  private native int GetNumberOfSolidArrays_46();
  public int GetNumberOfSolidArrays()
  {
    return GetNumberOfSolidArrays_46();
  }

  private native byte[] GetSolidArrayName_47(int id0);
  public String GetSolidArrayName(int id0)
  {
    return new String(GetSolidArrayName_47(id0), StandardCharsets.UTF_8);
  }

  private native void SetSolidArrayStatus_48(int id0,int id1);
  public void SetSolidArrayStatus(int id0,int id1)
  {
    SetSolidArrayStatus_48(id0,id1);
  }

  private native void SetSolidArrayStatus_49(byte[] id0, int len0,int id1);
  public void SetSolidArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSolidArrayStatus_49(bytes0, bytes0.length,id1);
  }

  private native int GetSolidArrayStatus_50(int id0);
  public int GetSolidArrayStatus(int id0)
  {
    return GetSolidArrayStatus_50(id0);
  }

  private native int GetSolidArrayStatus_51(byte[] id0, int len0);
  public int GetSolidArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetSolidArrayStatus_51(bytes0, bytes0.length);
  }

  private native int GetNumberOfComponentsInSolidArray_52(int id0);
  public int GetNumberOfComponentsInSolidArray(int id0)
  {
    return GetNumberOfComponentsInSolidArray_52(id0);
  }

  private native int GetNumberOfComponentsInSolidArray_53(byte[] id0, int len0);
  public int GetNumberOfComponentsInSolidArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfComponentsInSolidArray_53(bytes0, bytes0.length);
  }

  private native int GetNumberOfThickShellArrays_54();
  public int GetNumberOfThickShellArrays()
  {
    return GetNumberOfThickShellArrays_54();
  }

  private native byte[] GetThickShellArrayName_55(int id0);
  public String GetThickShellArrayName(int id0)
  {
    return new String(GetThickShellArrayName_55(id0), StandardCharsets.UTF_8);
  }

  private native void SetThickShellArrayStatus_56(int id0,int id1);
  public void SetThickShellArrayStatus(int id0,int id1)
  {
    SetThickShellArrayStatus_56(id0,id1);
  }

  private native void SetThickShellArrayStatus_57(byte[] id0, int len0,int id1);
  public void SetThickShellArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetThickShellArrayStatus_57(bytes0, bytes0.length,id1);
  }

  private native int GetThickShellArrayStatus_58(int id0);
  public int GetThickShellArrayStatus(int id0)
  {
    return GetThickShellArrayStatus_58(id0);
  }

  private native int GetThickShellArrayStatus_59(byte[] id0, int len0);
  public int GetThickShellArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetThickShellArrayStatus_59(bytes0, bytes0.length);
  }

  private native int GetNumberOfComponentsInThickShellArray_60(int id0);
  public int GetNumberOfComponentsInThickShellArray(int id0)
  {
    return GetNumberOfComponentsInThickShellArray_60(id0);
  }

  private native int GetNumberOfComponentsInThickShellArray_61(byte[] id0, int len0);
  public int GetNumberOfComponentsInThickShellArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfComponentsInThickShellArray_61(bytes0, bytes0.length);
  }

  private native int GetNumberOfShellArrays_62();
  public int GetNumberOfShellArrays()
  {
    return GetNumberOfShellArrays_62();
  }

  private native byte[] GetShellArrayName_63(int id0);
  public String GetShellArrayName(int id0)
  {
    return new String(GetShellArrayName_63(id0), StandardCharsets.UTF_8);
  }

  private native void SetShellArrayStatus_64(int id0,int id1);
  public void SetShellArrayStatus(int id0,int id1)
  {
    SetShellArrayStatus_64(id0,id1);
  }

  private native void SetShellArrayStatus_65(byte[] id0, int len0,int id1);
  public void SetShellArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetShellArrayStatus_65(bytes0, bytes0.length,id1);
  }

  private native int GetShellArrayStatus_66(int id0);
  public int GetShellArrayStatus(int id0)
  {
    return GetShellArrayStatus_66(id0);
  }

  private native int GetShellArrayStatus_67(byte[] id0, int len0);
  public int GetShellArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetShellArrayStatus_67(bytes0, bytes0.length);
  }

  private native int GetNumberOfComponentsInShellArray_68(int id0);
  public int GetNumberOfComponentsInShellArray(int id0)
  {
    return GetNumberOfComponentsInShellArray_68(id0);
  }

  private native int GetNumberOfComponentsInShellArray_69(byte[] id0, int len0);
  public int GetNumberOfComponentsInShellArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfComponentsInShellArray_69(bytes0, bytes0.length);
  }

  private native int GetNumberOfRigidBodyArrays_70();
  public int GetNumberOfRigidBodyArrays()
  {
    return GetNumberOfRigidBodyArrays_70();
  }

  private native byte[] GetRigidBodyArrayName_71(int id0);
  public String GetRigidBodyArrayName(int id0)
  {
    return new String(GetRigidBodyArrayName_71(id0), StandardCharsets.UTF_8);
  }

  private native void SetRigidBodyArrayStatus_72(int id0,int id1);
  public void SetRigidBodyArrayStatus(int id0,int id1)
  {
    SetRigidBodyArrayStatus_72(id0,id1);
  }

  private native void SetRigidBodyArrayStatus_73(byte[] id0, int len0,int id1);
  public void SetRigidBodyArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetRigidBodyArrayStatus_73(bytes0, bytes0.length,id1);
  }

  private native int GetRigidBodyArrayStatus_74(int id0);
  public int GetRigidBodyArrayStatus(int id0)
  {
    return GetRigidBodyArrayStatus_74(id0);
  }

  private native int GetRigidBodyArrayStatus_75(byte[] id0, int len0);
  public int GetRigidBodyArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetRigidBodyArrayStatus_75(bytes0, bytes0.length);
  }

  private native int GetNumberOfComponentsInRigidBodyArray_76(int id0);
  public int GetNumberOfComponentsInRigidBodyArray(int id0)
  {
    return GetNumberOfComponentsInRigidBodyArray_76(id0);
  }

  private native int GetNumberOfComponentsInRigidBodyArray_77(byte[] id0, int len0);
  public int GetNumberOfComponentsInRigidBodyArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfComponentsInRigidBodyArray_77(bytes0, bytes0.length);
  }

  private native int GetNumberOfRoadSurfaceArrays_78();
  public int GetNumberOfRoadSurfaceArrays()
  {
    return GetNumberOfRoadSurfaceArrays_78();
  }

  private native byte[] GetRoadSurfaceArrayName_79(int id0);
  public String GetRoadSurfaceArrayName(int id0)
  {
    return new String(GetRoadSurfaceArrayName_79(id0), StandardCharsets.UTF_8);
  }

  private native void SetRoadSurfaceArrayStatus_80(int id0,int id1);
  public void SetRoadSurfaceArrayStatus(int id0,int id1)
  {
    SetRoadSurfaceArrayStatus_80(id0,id1);
  }

  private native void SetRoadSurfaceArrayStatus_81(byte[] id0, int len0,int id1);
  public void SetRoadSurfaceArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetRoadSurfaceArrayStatus_81(bytes0, bytes0.length,id1);
  }

  private native int GetRoadSurfaceArrayStatus_82(int id0);
  public int GetRoadSurfaceArrayStatus(int id0)
  {
    return GetRoadSurfaceArrayStatus_82(id0);
  }

  private native int GetRoadSurfaceArrayStatus_83(byte[] id0, int len0);
  public int GetRoadSurfaceArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetRoadSurfaceArrayStatus_83(bytes0, bytes0.length);
  }

  private native int GetNumberOfComponentsInRoadSurfaceArray_84(int id0);
  public int GetNumberOfComponentsInRoadSurfaceArray(int id0)
  {
    return GetNumberOfComponentsInRoadSurfaceArray_84(id0);
  }

  private native int GetNumberOfComponentsInRoadSurfaceArray_85(byte[] id0, int len0);
  public int GetNumberOfComponentsInRoadSurfaceArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfComponentsInRoadSurfaceArray_85(bytes0, bytes0.length);
  }

  private native int GetNumberOfBeamArrays_86();
  public int GetNumberOfBeamArrays()
  {
    return GetNumberOfBeamArrays_86();
  }

  private native byte[] GetBeamArrayName_87(int id0);
  public String GetBeamArrayName(int id0)
  {
    return new String(GetBeamArrayName_87(id0), StandardCharsets.UTF_8);
  }

  private native void SetBeamArrayStatus_88(int id0,int id1);
  public void SetBeamArrayStatus(int id0,int id1)
  {
    SetBeamArrayStatus_88(id0,id1);
  }

  private native void SetBeamArrayStatus_89(byte[] id0, int len0,int id1);
  public void SetBeamArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBeamArrayStatus_89(bytes0, bytes0.length,id1);
  }

  private native int GetBeamArrayStatus_90(int id0);
  public int GetBeamArrayStatus(int id0)
  {
    return GetBeamArrayStatus_90(id0);
  }

  private native int GetBeamArrayStatus_91(byte[] id0, int len0);
  public int GetBeamArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetBeamArrayStatus_91(bytes0, bytes0.length);
  }

  private native int GetNumberOfComponentsInBeamArray_92(int id0);
  public int GetNumberOfComponentsInBeamArray(int id0)
  {
    return GetNumberOfComponentsInBeamArray_92(id0);
  }

  private native int GetNumberOfComponentsInBeamArray_93(byte[] id0, int len0);
  public int GetNumberOfComponentsInBeamArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfComponentsInBeamArray_93(bytes0, bytes0.length);
  }

  private native int GetNumberOfParticleArrays_94();
  public int GetNumberOfParticleArrays()
  {
    return GetNumberOfParticleArrays_94();
  }

  private native byte[] GetParticleArrayName_95(int id0);
  public String GetParticleArrayName(int id0)
  {
    return new String(GetParticleArrayName_95(id0), StandardCharsets.UTF_8);
  }

  private native void SetParticleArrayStatus_96(int id0,int id1);
  public void SetParticleArrayStatus(int id0,int id1)
  {
    SetParticleArrayStatus_96(id0,id1);
  }

  private native void SetParticleArrayStatus_97(byte[] id0, int len0,int id1);
  public void SetParticleArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetParticleArrayStatus_97(bytes0, bytes0.length,id1);
  }

  private native int GetParticleArrayStatus_98(int id0);
  public int GetParticleArrayStatus(int id0)
  {
    return GetParticleArrayStatus_98(id0);
  }

  private native int GetParticleArrayStatus_99(byte[] id0, int len0);
  public int GetParticleArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetParticleArrayStatus_99(bytes0, bytes0.length);
  }

  private native int GetNumberOfComponentsInParticleArray_100(int id0);
  public int GetNumberOfComponentsInParticleArray(int id0)
  {
    return GetNumberOfComponentsInParticleArray_100(id0);
  }

  private native int GetNumberOfComponentsInParticleArray_101(byte[] id0, int len0);
  public int GetNumberOfComponentsInParticleArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfComponentsInParticleArray_101(bytes0, bytes0.length);
  }

  private native void SetDeformedMesh_102(int id0);
  public void SetDeformedMesh(int id0)
  {
    SetDeformedMesh_102(id0);
  }

  private native int GetDeformedMesh_103();
  public int GetDeformedMesh()
  {
    return GetDeformedMesh_103();
  }

  private native void DeformedMeshOn_104();
  public void DeformedMeshOn()
  {
    DeformedMeshOn_104();
  }

  private native void DeformedMeshOff_105();
  public void DeformedMeshOff()
  {
    DeformedMeshOff_105();
  }

  private native void SetRemoveDeletedCells_106(int id0);
  public void SetRemoveDeletedCells(int id0)
  {
    SetRemoveDeletedCells_106(id0);
  }

  private native int GetRemoveDeletedCells_107();
  public int GetRemoveDeletedCells()
  {
    return GetRemoveDeletedCells_107();
  }

  private native void RemoveDeletedCellsOn_108();
  public void RemoveDeletedCellsOn()
  {
    RemoveDeletedCellsOn_108();
  }

  private native void RemoveDeletedCellsOff_109();
  public void RemoveDeletedCellsOff()
  {
    RemoveDeletedCellsOff_109();
  }

  private native void SetDeletedCellsAsGhostArray_110(int id0);
  public void SetDeletedCellsAsGhostArray(int id0)
  {
    SetDeletedCellsAsGhostArray_110(id0);
  }

  private native int GetDeletedCellsAsGhostArray_111();
  public int GetDeletedCellsAsGhostArray()
  {
    return GetDeletedCellsAsGhostArray_111();
  }

  private native void DeletedCellsAsGhostArrayOn_112();
  public void DeletedCellsAsGhostArrayOn()
  {
    DeletedCellsAsGhostArrayOn_112();
  }

  private native void DeletedCellsAsGhostArrayOff_113();
  public void DeletedCellsAsGhostArrayOff()
  {
    DeletedCellsAsGhostArrayOff_113();
  }

  private native void SetInputDeck_114(byte[] id0, int len0);
  public void SetInputDeck(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputDeck_114(bytes0, bytes0.length);
  }

  private native byte[] GetInputDeck_115();
  public String GetInputDeck()
  {
    return new String(GetInputDeck_115(), StandardCharsets.UTF_8);
  }

  private native int GetNumberOfPartArrays_116();
  public int GetNumberOfPartArrays()
  {
    return GetNumberOfPartArrays_116();
  }

  private native byte[] GetPartArrayName_117(int id0);
  public String GetPartArrayName(int id0)
  {
    return new String(GetPartArrayName_117(id0), StandardCharsets.UTF_8);
  }

  private native void SetPartArrayStatus_118(int id0,int id1);
  public void SetPartArrayStatus(int id0,int id1)
  {
    SetPartArrayStatus_118(id0,id1);
  }

  private native void SetPartArrayStatus_119(byte[] id0, int len0,int id1);
  public void SetPartArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPartArrayStatus_119(bytes0, bytes0.length,id1);
  }

  private native int GetPartArrayStatus_120(int id0);
  public int GetPartArrayStatus(int id0)
  {
    return GetPartArrayStatus_120(id0);
  }

  private native int GetPartArrayStatus_121(byte[] id0, int len0);
  public int GetPartArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPartArrayStatus_121(bytes0, bytes0.length);
  }

  public vtkLSDynaReader() { super(); }

  public vtkLSDynaReader(long id) { super(id); }
  public native long   VTKInit();

}
