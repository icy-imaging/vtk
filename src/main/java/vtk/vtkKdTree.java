// java wrapper for vtkKdTree object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkKdTree extends vtkLocator
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

  private native void TimingOn_4();
  public void TimingOn()
  {
    TimingOn_4();
  }

  private native void TimingOff_5();
  public void TimingOff()
  {
    TimingOff_5();
  }

  private native void SetTiming_6(int id0);
  public void SetTiming(int id0)
  {
    SetTiming_6(id0);
  }

  private native int GetTiming_7();
  public int GetTiming()
  {
    return GetTiming_7();
  }

  private native void SetMinCells_8(int id0);
  public void SetMinCells(int id0)
  {
    SetMinCells_8(id0);
  }

  private native int GetMinCells_9();
  public int GetMinCells()
  {
    return GetMinCells_9();
  }

  private native int GetNumberOfRegionsOrLess_10();
  public int GetNumberOfRegionsOrLess()
  {
    return GetNumberOfRegionsOrLess_10();
  }

  private native void SetNumberOfRegionsOrLess_11(int id0);
  public void SetNumberOfRegionsOrLess(int id0)
  {
    SetNumberOfRegionsOrLess_11(id0);
  }

  private native int GetNumberOfRegionsOrMore_12();
  public int GetNumberOfRegionsOrMore()
  {
    return GetNumberOfRegionsOrMore_12();
  }

  private native void SetNumberOfRegionsOrMore_13(int id0);
  public void SetNumberOfRegionsOrMore(int id0)
  {
    SetNumberOfRegionsOrMore_13(id0);
  }

  private native double GetFudgeFactor_14();
  public double GetFudgeFactor()
  {
    return GetFudgeFactor_14();
  }

  private native void SetFudgeFactor_15(double id0);
  public void SetFudgeFactor(double id0)
  {
    SetFudgeFactor_15(id0);
  }

  private native long GetCuts_16();
  public vtkBSPCuts GetCuts()
  {
    long temp = GetCuts_16();

    if (temp == 0) return null;
    return (vtkBSPCuts)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCuts_17(vtkBSPCuts id0);
  public void SetCuts(vtkBSPCuts id0)
  {
    SetCuts_17(id0);
  }

  private native void OmitXPartitioning_18();
  public void OmitXPartitioning()
  {
    OmitXPartitioning_18();
  }

  private native void OmitYPartitioning_19();
  public void OmitYPartitioning()
  {
    OmitYPartitioning_19();
  }

  private native void OmitZPartitioning_20();
  public void OmitZPartitioning()
  {
    OmitZPartitioning_20();
  }

  private native void OmitXYPartitioning_21();
  public void OmitXYPartitioning()
  {
    OmitXYPartitioning_21();
  }

  private native void OmitYZPartitioning_22();
  public void OmitYZPartitioning()
  {
    OmitYZPartitioning_22();
  }

  private native void OmitZXPartitioning_23();
  public void OmitZXPartitioning()
  {
    OmitZXPartitioning_23();
  }

  private native void OmitNoPartitioning_24();
  public void OmitNoPartitioning()
  {
    OmitNoPartitioning_24();
  }

  private native void SetDataSet_25(vtkDataSet id0);
  public void SetDataSet(vtkDataSet id0)
  {
    SetDataSet_25(id0);
  }

  private native void AddDataSet_26(vtkDataSet id0);
  public void AddDataSet(vtkDataSet id0)
  {
    AddDataSet_26(id0);
  }

  private native void RemoveDataSet_27(int id0);
  public void RemoveDataSet(int id0)
  {
    RemoveDataSet_27(id0);
  }

  private native void RemoveDataSet_28(vtkDataSet id0);
  public void RemoveDataSet(vtkDataSet id0)
  {
    RemoveDataSet_28(id0);
  }

  private native void RemoveAllDataSets_29();
  public void RemoveAllDataSets()
  {
    RemoveAllDataSets_29();
  }

  private native int GetNumberOfDataSets_30();
  public int GetNumberOfDataSets()
  {
    return GetNumberOfDataSets_30();
  }

  private native long GetDataSet_31(int id0);
  public vtkDataSet GetDataSet(int id0)
  {
    long temp = GetDataSet_31(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataSet_32();
  public vtkDataSet GetDataSet()
  {
    long temp = GetDataSet_32();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataSets_33();
  public vtkDataSetCollection GetDataSets()
  {
    long temp = GetDataSets_33();

    if (temp == 0) return null;
    return (vtkDataSetCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDataSetIndex_34(vtkDataSet id0);
  public int GetDataSetIndex(vtkDataSet id0)
  {
    return GetDataSetIndex_34(id0);
  }

  private native int GetNumberOfRegions_35();
  public int GetNumberOfRegions()
  {
    return GetNumberOfRegions_35();
  }

  private native void GetRegionBounds_36(int id0,double id1[]);
  public void GetRegionBounds(int id0,double id1[])
  {
    GetRegionBounds_36(id0,id1);
  }

  private native void GetRegionDataBounds_37(int id0,double id1[]);
  public void GetRegionDataBounds(int id0,double id1[])
  {
    GetRegionDataBounds_37(id0,id1);
  }

  private native void PrintTree_38();
  public void PrintTree()
  {
    PrintTree_38();
  }

  private native void PrintVerboseTree_39();
  public void PrintVerboseTree()
  {
    PrintVerboseTree_39();
  }

  private native void PrintRegion_40(int id0);
  public void PrintRegion(int id0)
  {
    PrintRegion_40(id0);
  }

  private native void CreateCellLists_41();
  public void CreateCellLists()
  {
    CreateCellLists_41();
  }

  private native void SetIncludeRegionBoundaryCells_42(int id0);
  public void SetIncludeRegionBoundaryCells(int id0)
  {
    SetIncludeRegionBoundaryCells_42(id0);
  }

  private native int GetIncludeRegionBoundaryCells_43();
  public int GetIncludeRegionBoundaryCells()
  {
    return GetIncludeRegionBoundaryCells_43();
  }

  private native void IncludeRegionBoundaryCellsOn_44();
  public void IncludeRegionBoundaryCellsOn()
  {
    IncludeRegionBoundaryCellsOn_44();
  }

  private native void IncludeRegionBoundaryCellsOff_45();
  public void IncludeRegionBoundaryCellsOff()
  {
    IncludeRegionBoundaryCellsOff_45();
  }

  private native void DeleteCellLists_46();
  public void DeleteCellLists()
  {
    DeleteCellLists_46();
  }

  private native long GetCellList_47(int id0);
  public vtkIdList GetCellList(int id0)
  {
    long temp = GetCellList_47(id0);

    if (temp == 0) return null;
    return (vtkIdList)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBoundaryCellList_48(int id0);
  public vtkIdList GetBoundaryCellList(int id0)
  {
    long temp = GetBoundaryCellList_48(id0);

    if (temp == 0) return null;
    return (vtkIdList)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellLists_49(vtkIntArray id0,int id1,vtkIdList id2,vtkIdList id3);
  public long GetCellLists(vtkIntArray id0,int id1,vtkIdList id2,vtkIdList id3)
  {
    return GetCellLists_49(id0,id1,id2,id3);
  }

  private native long GetCellLists_50(vtkIntArray id0,vtkDataSet id1,vtkIdList id2,vtkIdList id3);
  public long GetCellLists(vtkIntArray id0,vtkDataSet id1,vtkIdList id2,vtkIdList id3)
  {
    return GetCellLists_50(id0,id1,id2,id3);
  }

  private native long GetCellLists_51(vtkIntArray id0,vtkIdList id1,vtkIdList id2);
  public long GetCellLists(vtkIntArray id0,vtkIdList id1,vtkIdList id2)
  {
    return GetCellLists_51(id0,id1,id2);
  }

  private native int GetRegionContainingCell_52(vtkDataSet id0,long id1);
  public int GetRegionContainingCell(vtkDataSet id0,long id1)
  {
    return GetRegionContainingCell_52(id0,id1);
  }

  private native int GetRegionContainingCell_53(int id0,long id1);
  public int GetRegionContainingCell(int id0,long id1)
  {
    return GetRegionContainingCell_53(id0,id1);
  }

  private native int GetRegionContainingCell_54(long id0);
  public int GetRegionContainingCell(long id0)
  {
    return GetRegionContainingCell_54(id0);
  }

  private native int GetRegionContainingPoint_55(double id0,double id1,double id2);
  public int GetRegionContainingPoint(double id0,double id1,double id2)
  {
    return GetRegionContainingPoint_55(id0,id1,id2);
  }

  private native void BuildLocator_56();
  public void BuildLocator()
  {
    BuildLocator_56();
  }

  private native void ForceBuildLocator_57();
  public void ForceBuildLocator()
  {
    ForceBuildLocator_57();
  }

  private native int ViewOrderAllRegionsInDirection_58(double id0[],vtkIntArray id1);
  public int ViewOrderAllRegionsInDirection(double id0[],vtkIntArray id1)
  {
    return ViewOrderAllRegionsInDirection_58(id0,id1);
  }

  private native int ViewOrderRegionsInDirection_59(vtkIntArray id0,double id1[],vtkIntArray id2);
  public int ViewOrderRegionsInDirection(vtkIntArray id0,double id1[],vtkIntArray id2)
  {
    return ViewOrderRegionsInDirection_59(id0,id1,id2);
  }

  private native int ViewOrderAllRegionsFromPosition_60(double id0[],vtkIntArray id1);
  public int ViewOrderAllRegionsFromPosition(double id0[],vtkIntArray id1)
  {
    return ViewOrderAllRegionsFromPosition_60(id0,id1);
  }

  private native int ViewOrderRegionsFromPosition_61(vtkIntArray id0,double id1[],vtkIntArray id2);
  public int ViewOrderRegionsFromPosition(vtkIntArray id0,double id1[],vtkIntArray id2)
  {
    return ViewOrderRegionsFromPosition_61(id0,id1,id2);
  }

  private native void BuildLocatorFromPoints_62(vtkPointSet id0);
  public void BuildLocatorFromPoints(vtkPointSet id0)
  {
    BuildLocatorFromPoints_62(id0);
  }

  private native void BuildLocatorFromPoints_63(vtkPoints id0);
  public void BuildLocatorFromPoints(vtkPoints id0)
  {
    BuildLocatorFromPoints_63(id0);
  }

  private native long BuildMapForDuplicatePoints_64(float id0);
  public vtkIdTypeArray BuildMapForDuplicatePoints(float id0)
  {
    long temp = BuildMapForDuplicatePoints_64(id0);

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FindPoint_65(double id0,double id1,double id2);
  public long FindPoint(double id0,double id1,double id2)
  {
    return FindPoint_65(id0,id1,id2);
  }

  private native void FindPointsWithinRadius_66(double id0,double id1[],vtkIdList id2);
  public void FindPointsWithinRadius(double id0,double id1[],vtkIdList id2)
  {
    FindPointsWithinRadius_66(id0,id1,id2);
  }

  private native void FindClosestNPoints_67(int id0,double id1[],vtkIdList id2);
  public void FindClosestNPoints(int id0,double id1[],vtkIdList id2)
  {
    FindClosestNPoints_67(id0,id1,id2);
  }

  private native long GetPointsInRegion_68(int id0);
  public vtkIdTypeArray GetPointsInRegion(int id0)
  {
    long temp = GetPointsInRegion_68(id0);

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void FreeSearchStructure_69();
  public void FreeSearchStructure()
  {
    FreeSearchStructure_69();
  }

  private native void GenerateRepresentation_70(int id0,vtkPolyData id1);
  public void GenerateRepresentation(int id0,vtkPolyData id1)
  {
    GenerateRepresentation_70(id0,id1);
  }

  private native void GenerateRepresentationUsingDataBoundsOn_71();
  public void GenerateRepresentationUsingDataBoundsOn()
  {
    GenerateRepresentationUsingDataBoundsOn_71();
  }

  private native void GenerateRepresentationUsingDataBoundsOff_72();
  public void GenerateRepresentationUsingDataBoundsOff()
  {
    GenerateRepresentationUsingDataBoundsOff_72();
  }

  private native void SetGenerateRepresentationUsingDataBounds_73(int id0);
  public void SetGenerateRepresentationUsingDataBounds(int id0)
  {
    SetGenerateRepresentationUsingDataBounds_73(id0);
  }

  private native int GetGenerateRepresentationUsingDataBounds_74();
  public int GetGenerateRepresentationUsingDataBounds()
  {
    return GetGenerateRepresentationUsingDataBounds_74();
  }

  private native int NewGeometry_75();
  public int NewGeometry()
  {
    return NewGeometry_75();
  }

  private native void InvalidateGeometry_76();
  public void InvalidateGeometry()
  {
    InvalidateGeometry_76();
  }

  private native long CopyTree_77(vtkKdNode id0);
  public vtkKdNode CopyTree(vtkKdNode id0)
  {
    long temp = CopyTree_77(id0);

    if (temp == 0) return null;
    return (vtkKdNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkKdTree() { super(); }

  public vtkKdTree(long id) { super(id); }
  public native long   VTKInit();

}
