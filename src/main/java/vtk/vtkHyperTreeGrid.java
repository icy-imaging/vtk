// java wrapper for vtkHyperTreeGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGrid extends vtkDataObject
{

  private native long LEVELS_0();
  public vtkInformationIntegerKey LEVELS()
  {
    long temp = LEVELS_0();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DIMENSION_1();
  public vtkInformationIntegerKey DIMENSION()
  {
    long temp = DIMENSION_1();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ORIENTATION_2();
  public vtkInformationIntegerKey ORIENTATION()
  {
    long temp = ORIENTATION_2();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SIZES_3();
  public vtkInformationDoubleVectorKey SIZES()
  {
    long temp = SIZES_3();

    if (temp == 0) return null;
    return (vtkInformationDoubleVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int IsTypeOf_4(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_4(bytes0, bytes0.length);
  }

  private native int IsA_5(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_5(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_6(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_6(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_7(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_7(bytes0, bytes0.length);
  }

  private native void SetModeSqueeze_8(byte[] id0, int len0);
  public void SetModeSqueeze(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetModeSqueeze_8(bytes0, bytes0.length);
  }

  private native byte[] GetModeSqueeze_9();
  public String GetModeSqueeze()
  {
    return new String(GetModeSqueeze_9(), StandardCharsets.UTF_8);
  }

  private native void Squeeze_10();
  public void Squeeze()
  {
    Squeeze_10();
  }

  private native int GetDataObjectType_11();
  public int GetDataObjectType()
  {
    return GetDataObjectType_11();
  }

  private native void CopyStructure_12(vtkDataObject id0);
  public void CopyStructure(vtkDataObject id0)
  {
    CopyStructure_12(id0);
  }

  private native void CopyEmptyStructure_13(vtkDataObject id0);
  public void CopyEmptyStructure(vtkDataObject id0)
  {
    CopyEmptyStructure_13(id0);
  }

  private native void SetDimensions_14(int id0[]);
  public void SetDimensions(int id0[])
  {
    SetDimensions_14(id0);
  }

  private native void SetDimensions_15(int id0,int id1,int id2);
  public void SetDimensions(int id0,int id1,int id2)
  {
    SetDimensions_15(id0,id1,id2);
  }

  private native void GetDimensions_16(int id0[]);
  public void GetDimensions(int id0[])
  {
    GetDimensions_16(id0);
  }

  private native void SetExtent_17(int id0[]);
  public void SetExtent(int id0[])
  {
    SetExtent_17(id0);
  }

  private native void SetExtent_18(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetExtent_18(id0,id1,id2,id3,id4,id5);
  }

  private native int[] GetExtent_19();
  public int[] GetExtent()
  {
    return GetExtent_19();
  }

  private native void GetCellDims_20(int id0[]);
  public void GetCellDims(int id0[])
  {
    GetCellDims_20(id0);
  }

  private native int GetDimension_21();
  public int GetDimension()
  {
    return GetDimension_21();
  }

  private native int GetNumberOfChildren_22();
  public int GetNumberOfChildren()
  {
    return GetNumberOfChildren_22();
  }

  private native void SetTransposedRootIndexing_23(boolean id0);
  public void SetTransposedRootIndexing(boolean id0)
  {
    SetTransposedRootIndexing_23(id0);
  }

  private native boolean GetTransposedRootIndexing_24();
  public boolean GetTransposedRootIndexing()
  {
    return GetTransposedRootIndexing_24();
  }

  private native void SetIndexingModeToKJI_25();
  public void SetIndexingModeToKJI()
  {
    SetIndexingModeToKJI_25();
  }

  private native void SetIndexingModeToIJK_26();
  public void SetIndexingModeToIJK()
  {
    SetIndexingModeToIJK_26();
  }

  private native int GetOrientation_27();
  public int GetOrientation()
  {
    return GetOrientation_27();
  }

  private native boolean GetFreezeState_28();
  public boolean GetFreezeState()
  {
    return GetFreezeState_28();
  }

  private native void SetBranchFactor_29(int id0);
  public void SetBranchFactor(int id0)
  {
    SetBranchFactor_29(id0);
  }

  private native int GetBranchFactor_30();
  public int GetBranchFactor()
  {
    return GetBranchFactor_30();
  }

  private native long GetMaxNumberOfTrees_31();
  public long GetMaxNumberOfTrees()
  {
    return GetMaxNumberOfTrees_31();
  }

  private native long GetNumberOfNonEmptyTrees_32();
  public long GetNumberOfNonEmptyTrees()
  {
    return GetNumberOfNonEmptyTrees_32();
  }

  private native long GetNumberOfLeaves_33();
  public long GetNumberOfLeaves()
  {
    return GetNumberOfLeaves_33();
  }

  private native int GetNumberOfLevels_34(long id0);
  public int GetNumberOfLevels(long id0)
  {
    return GetNumberOfLevels_34(id0);
  }

  private native int GetNumberOfLevels_35();
  public int GetNumberOfLevels()
  {
    return GetNumberOfLevels_35();
  }

  private native void SetXCoordinates_36(vtkDataArray id0);
  public void SetXCoordinates(vtkDataArray id0)
  {
    SetXCoordinates_36(id0);
  }

  private native long GetXCoordinates_37();
  public vtkDataArray GetXCoordinates()
  {
    long temp = GetXCoordinates_37();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetYCoordinates_38(vtkDataArray id0);
  public void SetYCoordinates(vtkDataArray id0)
  {
    SetYCoordinates_38(id0);
  }

  private native long GetYCoordinates_39();
  public vtkDataArray GetYCoordinates()
  {
    long temp = GetYCoordinates_39();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetZCoordinates_40(vtkDataArray id0);
  public void SetZCoordinates(vtkDataArray id0)
  {
    SetZCoordinates_40(id0);
  }

  private native long GetZCoordinates_41();
  public vtkDataArray GetZCoordinates()
  {
    long temp = GetZCoordinates_41();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CopyCoordinates_42(vtkHyperTreeGrid id0);
  public void CopyCoordinates(vtkHyperTreeGrid id0)
  {
    CopyCoordinates_42(id0);
  }

  private native void SetFixedCoordinates_43(int id0,double id1);
  public void SetFixedCoordinates(int id0,double id1)
  {
    SetFixedCoordinates_43(id0,id1);
  }

  private native void SetMask_44(vtkBitArray id0);
  public void SetMask(vtkBitArray id0)
  {
    SetMask_44(id0);
  }

  private native long GetMask_45();
  public vtkBitArray GetMask()
  {
    long temp = GetMask_45();

    if (temp == 0) return null;
    return (vtkBitArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean HasMask_46();
  public boolean HasMask()
  {
    return HasMask_46();
  }

  private native void SetHasInterface_47(boolean id0);
  public void SetHasInterface(boolean id0)
  {
    SetHasInterface_47(id0);
  }

  private native boolean GetHasInterface_48();
  public boolean GetHasInterface()
  {
    return GetHasInterface_48();
  }

  private native void HasInterfaceOn_49();
  public void HasInterfaceOn()
  {
    HasInterfaceOn_49();
  }

  private native void HasInterfaceOff_50();
  public void HasInterfaceOff()
  {
    HasInterfaceOff_50();
  }

  private native void SetInterfaceNormalsName_51(byte[] id0, int len0);
  public void SetInterfaceNormalsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInterfaceNormalsName_51(bytes0, bytes0.length);
  }

  private native byte[] GetInterfaceNormalsName_52();
  public String GetInterfaceNormalsName()
  {
    return new String(GetInterfaceNormalsName_52(), StandardCharsets.UTF_8);
  }

  private native void SetInterfaceInterceptsName_53(byte[] id0, int len0);
  public void SetInterfaceInterceptsName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInterfaceInterceptsName_53(bytes0, bytes0.length);
  }

  private native byte[] GetInterfaceInterceptsName_54();
  public String GetInterfaceInterceptsName()
  {
    return new String(GetInterfaceInterceptsName_54(), StandardCharsets.UTF_8);
  }

  private native void SetDepthLimiter_55(int id0);
  public void SetDepthLimiter(int id0)
  {
    SetDepthLimiter_55(id0);
  }

  private native int GetDepthLimiter_56();
  public int GetDepthLimiter()
  {
    return GetDepthLimiter_56();
  }

  private native void InitializeOrientedCursor_57(vtkHyperTreeGridOrientedCursor id0,long id1,boolean id2);
  public void InitializeOrientedCursor(vtkHyperTreeGridOrientedCursor id0,long id1,boolean id2)
  {
    InitializeOrientedCursor_57(id0,id1,id2);
  }

  private native long NewOrientedCursor_58(long id0,boolean id1);
  public vtkHyperTreeGridOrientedCursor NewOrientedCursor(long id0,boolean id1)
  {
    long temp = NewOrientedCursor_58(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridOrientedCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeOrientedGeometryCursor_59(vtkHyperTreeGridOrientedGeometryCursor id0,long id1,boolean id2);
  public void InitializeOrientedGeometryCursor(vtkHyperTreeGridOrientedGeometryCursor id0,long id1,boolean id2)
  {
    InitializeOrientedGeometryCursor_59(id0,id1,id2);
  }

  private native long NewOrientedGeometryCursor_60(long id0,boolean id1);
  public vtkHyperTreeGridOrientedGeometryCursor NewOrientedGeometryCursor(long id0,boolean id1)
  {
    long temp = NewOrientedGeometryCursor_60(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridOrientedGeometryCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeNonOrientedCursor_61(vtkHyperTreeGridNonOrientedCursor id0,long id1,boolean id2);
  public void InitializeNonOrientedCursor(vtkHyperTreeGridNonOrientedCursor id0,long id1,boolean id2)
  {
    InitializeNonOrientedCursor_61(id0,id1,id2);
  }

  private native long NewNonOrientedCursor_62(long id0,boolean id1);
  public vtkHyperTreeGridNonOrientedCursor NewNonOrientedCursor(long id0,boolean id1)
  {
    long temp = NewNonOrientedCursor_62(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeNonOrientedGeometryCursor_63(vtkHyperTreeGridNonOrientedGeometryCursor id0,long id1,boolean id2);
  public void InitializeNonOrientedGeometryCursor(vtkHyperTreeGridNonOrientedGeometryCursor id0,long id1,boolean id2)
  {
    InitializeNonOrientedGeometryCursor_63(id0,id1,id2);
  }

  private native long NewNonOrientedGeometryCursor_64(long id0,boolean id1);
  public vtkHyperTreeGridNonOrientedGeometryCursor NewNonOrientedGeometryCursor(long id0,boolean id1)
  {
    long temp = NewNonOrientedGeometryCursor_64(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedGeometryCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeNonOrientedUnlimitedGeometryCursor_65(vtkHyperTreeGridNonOrientedUnlimitedGeometryCursor id0,long id1,boolean id2);
  public void InitializeNonOrientedUnlimitedGeometryCursor(vtkHyperTreeGridNonOrientedUnlimitedGeometryCursor id0,long id1,boolean id2)
  {
    InitializeNonOrientedUnlimitedGeometryCursor_65(id0,id1,id2);
  }

  private native long NewNonOrientedUnlimitedGeometryCursor_66(long id0,boolean id1);
  public vtkHyperTreeGridNonOrientedUnlimitedGeometryCursor NewNonOrientedUnlimitedGeometryCursor(long id0,boolean id1)
  {
    long temp = NewNonOrientedUnlimitedGeometryCursor_66(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedUnlimitedGeometryCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FindNonOrientedGeometryCursor_67(double id0[]);
  public vtkHyperTreeGridNonOrientedGeometryCursor FindNonOrientedGeometryCursor(double id0[])
  {
    long temp = FindNonOrientedGeometryCursor_67(id0);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedGeometryCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int FindDichotomicX_68(double id0,double id1);
  public int FindDichotomicX(double id0,double id1)
  {
    return FindDichotomicX_68(id0,id1);
  }

  private native int FindDichotomicY_69(double id0,double id1);
  public int FindDichotomicY(double id0,double id1)
  {
    return FindDichotomicY_69(id0,id1);
  }

  private native int FindDichotomicZ_70(double id0,double id1);
  public int FindDichotomicZ(double id0,double id1)
  {
    return FindDichotomicZ_70(id0,id1);
  }

  private native void InitializeNonOrientedVonNeumannSuperCursor_71(vtkHyperTreeGridNonOrientedVonNeumannSuperCursor id0,long id1,boolean id2);
  public void InitializeNonOrientedVonNeumannSuperCursor(vtkHyperTreeGridNonOrientedVonNeumannSuperCursor id0,long id1,boolean id2)
  {
    InitializeNonOrientedVonNeumannSuperCursor_71(id0,id1,id2);
  }

  private native long NewNonOrientedVonNeumannSuperCursor_72(long id0,boolean id1);
  public vtkHyperTreeGridNonOrientedVonNeumannSuperCursor NewNonOrientedVonNeumannSuperCursor(long id0,boolean id1)
  {
    long temp = NewNonOrientedVonNeumannSuperCursor_72(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedVonNeumannSuperCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeNonOrientedVonNeumannSuperCursorLight_73(vtkHyperTreeGridNonOrientedVonNeumannSuperCursorLight id0,long id1,boolean id2);
  public void InitializeNonOrientedVonNeumannSuperCursorLight(vtkHyperTreeGridNonOrientedVonNeumannSuperCursorLight id0,long id1,boolean id2)
  {
    InitializeNonOrientedVonNeumannSuperCursorLight_73(id0,id1,id2);
  }

  private native long NewNonOrientedVonNeumannSuperCursorLight_74(long id0,boolean id1);
  public vtkHyperTreeGridNonOrientedVonNeumannSuperCursorLight NewNonOrientedVonNeumannSuperCursorLight(long id0,boolean id1)
  {
    long temp = NewNonOrientedVonNeumannSuperCursorLight_74(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedVonNeumannSuperCursorLight)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeNonOrientedMooreSuperCursor_75(vtkHyperTreeGridNonOrientedMooreSuperCursor id0,long id1,boolean id2);
  public void InitializeNonOrientedMooreSuperCursor(vtkHyperTreeGridNonOrientedMooreSuperCursor id0,long id1,boolean id2)
  {
    InitializeNonOrientedMooreSuperCursor_75(id0,id1,id2);
  }

  private native long NewNonOrientedMooreSuperCursor_76(long id0,boolean id1);
  public vtkHyperTreeGridNonOrientedMooreSuperCursor NewNonOrientedMooreSuperCursor(long id0,boolean id1)
  {
    long temp = NewNonOrientedMooreSuperCursor_76(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedMooreSuperCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeNonOrientedMooreSuperCursorLight_77(vtkHyperTreeGridNonOrientedMooreSuperCursorLight id0,long id1,boolean id2);
  public void InitializeNonOrientedMooreSuperCursorLight(vtkHyperTreeGridNonOrientedMooreSuperCursorLight id0,long id1,boolean id2)
  {
    InitializeNonOrientedMooreSuperCursorLight_77(id0,id1,id2);
  }

  private native long NewNonOrientedMooreSuperCursorLight_78(long id0,boolean id1);
  public vtkHyperTreeGridNonOrientedMooreSuperCursorLight NewNonOrientedMooreSuperCursorLight(long id0,boolean id1)
  {
    long temp = NewNonOrientedMooreSuperCursorLight_78(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedMooreSuperCursorLight)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InitializeNonOrientedUnlimitedMooreSuperCursor_79(vtkHyperTreeGridNonOrientedUnlimitedMooreSuperCursor id0,long id1,boolean id2);
  public void InitializeNonOrientedUnlimitedMooreSuperCursor(vtkHyperTreeGridNonOrientedUnlimitedMooreSuperCursor id0,long id1,boolean id2)
  {
    InitializeNonOrientedUnlimitedMooreSuperCursor_79(id0,id1,id2);
  }

  private native long NewNonOrientedUnlimitedMooreSuperCursor_80(long id0,boolean id1);
  public vtkHyperTreeGridNonOrientedUnlimitedMooreSuperCursor NewNonOrientedUnlimitedMooreSuperCursor(long id0,boolean id1)
  {
    long temp = NewNonOrientedUnlimitedMooreSuperCursor_80(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGridNonOrientedUnlimitedMooreSuperCursor)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Initialize_81();
  public void Initialize()
  {
    Initialize_81();
  }

  private native long GetTree_82(long id0,boolean id1);
  public vtkHyperTree GetTree(long id0,boolean id1)
  {
    long temp = GetTree_82(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTree_83(long id0,vtkHyperTree id1);
  public void SetTree(long id0,vtkHyperTree id1)
  {
    SetTree_83(id0,id1);
  }

  private native void ShallowCopy_84(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_84(id0);
  }

  private native void DeepCopy_85(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_85(id0);
  }

  private native int GetExtentType_86();
  public int GetExtentType()
  {
    return GetExtentType_86();
  }

  private native long GetActualMemorySizeBytes_87();
  public long GetActualMemorySizeBytes()
  {
    return GetActualMemorySizeBytes_87();
  }

  private native long GetActualMemorySize_88();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_88();
  }

  private native boolean SupportsGhostArray_89(int id0);
  public boolean SupportsGhostArray(int id0)
  {
    return SupportsGhostArray_89(id0);
  }

  private native long GetPureMask_90();
  public vtkBitArray GetPureMask()
  {
    long temp = GetPureMask_90();

    if (temp == 0) return null;
    return (vtkBitArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetChildMask_91(int id0);
  public int GetChildMask(int id0)
  {
    return GetChildMask_91(id0);
  }

  private native long GetShiftedLevelZeroIndex_92(long id0,int id1,int id2,int id3);
  public long GetShiftedLevelZeroIndex(long id0,int id1,int id2,int id3)
  {
    return GetShiftedLevelZeroIndex_92(id0,id1,id2,id3);
  }

  private native long GetGlobalNodeIndexMax_93();
  public long GetGlobalNodeIndexMax()
  {
    return GetGlobalNodeIndexMax_93();
  }

  private native void InitializeLocalIndexNode_94();
  public void InitializeLocalIndexNode()
  {
    InitializeLocalIndexNode_94();
  }

  private native boolean HasAnyGhostCells_95();
  public boolean HasAnyGhostCells()
  {
    return HasAnyGhostCells_95();
  }

  private native long GetGhostCells_96();
  public vtkUnsignedCharArray GetGhostCells()
  {
    long temp = GetGhostCells_96();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTreeGhostArray_97();
  public vtkUnsignedCharArray GetTreeGhostArray()
  {
    long temp = GetTreeGhostArray_97();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long AllocateTreeGhostArray_98();
  public vtkUnsignedCharArray AllocateTreeGhostArray()
  {
    long temp = AllocateTreeGhostArray_98();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_99(vtkInformation id0);
  public vtkHyperTreeGrid GetData(vtkInformation id0)
  {
    long temp = GetData_99(id0);

    if (temp == 0) return null;
    return (vtkHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_100(vtkInformationVector id0,int id1);
  public vtkHyperTreeGrid GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_100(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ComputeBounds_101();
  public void ComputeBounds()
  {
    ComputeBounds_101();
  }

  private native double[] GetBounds_102();
  public double[] GetBounds()
  {
    return GetBounds_102();
  }

  private native void GetBounds_103(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_103(id0);
  }

  private native void GetGridBounds_104(double id0[]);
  public void GetGridBounds(double id0[])
  {
    GetGridBounds_104(id0);
  }

  private native double[] GetCenter_105();
  public double[] GetCenter()
  {
    return GetCenter_105();
  }

  private native void GetCenter_106(double id0[]);
  public void GetCenter(double id0[])
  {
    GetCenter_106(id0);
  }

  private native long GetCellData_107();
  public vtkCellData GetCellData()
  {
    long temp = GetCellData_107();

    if (temp == 0) return null;
    return (vtkCellData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAttributesAsFieldData_108(int id0);
  public vtkFieldData GetAttributesAsFieldData(int id0)
  {
    long temp = GetAttributesAsFieldData_108(id0);

    if (temp == 0) return null;
    return (vtkFieldData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfElements_109(int id0);
  public long GetNumberOfElements(int id0)
  {
    return GetNumberOfElements_109(id0);
  }

  private native long GetNumberOfCells_110();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_110();
  }

  public vtkHyperTreeGrid() { super(); }

  public vtkHyperTreeGrid(long id) { super(id); }
  public native long   VTKInit();

}
