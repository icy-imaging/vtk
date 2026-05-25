// java wrapper for vtkPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyData extends vtkPointSet
{

  private native long ExtendedNew_0();
  public vtkPolyData ExtendedNew()
  {
    long temp = ExtendedNew_0();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int IsTypeOf_1(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_1(bytes0, bytes0.length);
  }

  private native int IsA_2(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_3(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_4(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_4(bytes0, bytes0.length);
  }

  private native int GetDataObjectType_5();
  public int GetDataObjectType()
  {
    return GetDataObjectType_5();
  }

  private native void CopyStructure_6(vtkDataSet id0);
  public void CopyStructure(vtkDataSet id0)
  {
    CopyStructure_6(id0);
  }

  private native long GetNumberOfCells_7();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_7();
  }

  private native long GetCell_8(long id0);
  public vtkCell GetCell(long id0)
  {
    long temp = GetCell_8(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCell_9(long id0,vtkGenericCell id1);
  public void GetCell(long id0,vtkGenericCell id1)
  {
    GetCell_9(id0,id1);
  }

  private native int GetCellType_10(long id0);
  public int GetCellType(long id0)
  {
    return GetCellType_10(id0);
  }

  private native long GetCellSize_11(long id0);
  public long GetCellSize(long id0)
  {
    return GetCellSize_11(id0);
  }

  private native void GetCellBounds_12(long id0,double id1[]);
  public void GetCellBounds(long id0,double id1[])
  {
    GetCellBounds_12(id0,id1);
  }

  private native void GetCellNeighbors_13(long id0,vtkIdList id1,vtkIdList id2);
  public void GetCellNeighbors(long id0,vtkIdList id1,vtkIdList id2)
  {
    GetCellNeighbors_13(id0,id1,id2);
  }

  private native void CopyCells_14(vtkPolyData id0,vtkIdList id1,vtkIncrementalPointLocator id2);
  public void CopyCells(vtkPolyData id0,vtkIdList id1,vtkIncrementalPointLocator id2)
  {
    CopyCells_14(id0,id1,id2);
  }

  private native void GetCellPoints_15(long id0,vtkIdList id1);
  public void GetCellPoints(long id0,vtkIdList id1)
  {
    GetCellPoints_15(id0,id1);
  }

  private native void GetPointCells_16(long id0,vtkIdList id1);
  public void GetPointCells(long id0,vtkIdList id1)
  {
    GetPointCells_16(id0,id1);
  }

  private native void ComputeCellsBounds_17();
  public void ComputeCellsBounds()
  {
    ComputeCellsBounds_17();
  }

  private native void GetCellsBounds_18(double id0[]);
  public void GetCellsBounds(double id0[])
  {
    GetCellsBounds_18(id0);
  }

  private native void Squeeze_19();
  public void Squeeze()
  {
    Squeeze_19();
  }

  private native int GetMaxCellSize_20();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_20();
  }

  private native int GetMaxSpatialDimension_21();
  public int GetMaxSpatialDimension()
  {
    return GetMaxSpatialDimension_21();
  }

  private native long GetCellIdRelativeToCellArray_22(long id0);
  public long GetCellIdRelativeToCellArray(long id0)
  {
    return GetCellIdRelativeToCellArray_22(id0);
  }

  private native void SetVerts_23(vtkCellArray id0);
  public void SetVerts(vtkCellArray id0)
  {
    SetVerts_23(id0);
  }

  private native long GetVerts_24();
  public vtkCellArray GetVerts()
  {
    long temp = GetVerts_24();

    if (temp == 0) return null;
    return (vtkCellArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLines_25(vtkCellArray id0);
  public void SetLines(vtkCellArray id0)
  {
    SetLines_25(id0);
  }

  private native long GetLines_26();
  public vtkCellArray GetLines()
  {
    long temp = GetLines_26();

    if (temp == 0) return null;
    return (vtkCellArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPolys_27(vtkCellArray id0);
  public void SetPolys(vtkCellArray id0)
  {
    SetPolys_27(id0);
  }

  private native long GetPolys_28();
  public vtkCellArray GetPolys()
  {
    long temp = GetPolys_28();

    if (temp == 0) return null;
    return (vtkCellArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetStrips_29(vtkCellArray id0);
  public void SetStrips(vtkCellArray id0)
  {
    SetStrips_29(id0);
  }

  private native long GetStrips_30();
  public vtkCellArray GetStrips()
  {
    long temp = GetStrips_30();

    if (temp == 0) return null;
    return (vtkCellArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfVerts_31();
  public long GetNumberOfVerts()
  {
    return GetNumberOfVerts_31();
  }

  private native long GetNumberOfLines_32();
  public long GetNumberOfLines()
  {
    return GetNumberOfLines_32();
  }

  private native long GetNumberOfPolys_33();
  public long GetNumberOfPolys()
  {
    return GetNumberOfPolys_33();
  }

  private native long GetNumberOfStrips_34();
  public long GetNumberOfStrips()
  {
    return GetNumberOfStrips_34();
  }

  private native boolean AllocateEstimate_35(long id0,long id1);
  public boolean AllocateEstimate(long id0,long id1)
  {
    return AllocateEstimate_35(id0,id1);
  }

  private native boolean AllocateEstimate_36(long id0,long id1,long id2,long id3,long id4,long id5,long id6,long id7);
  public boolean AllocateEstimate(long id0,long id1,long id2,long id3,long id4,long id5,long id6,long id7)
  {
    return AllocateEstimate_36(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native boolean AllocateExact_37(long id0,long id1);
  public boolean AllocateExact(long id0,long id1)
  {
    return AllocateExact_37(id0,id1);
  }

  private native boolean AllocateExact_38(long id0,long id1,long id2,long id3,long id4,long id5,long id6,long id7);
  public boolean AllocateExact(long id0,long id1,long id2,long id3,long id4,long id5,long id6,long id7)
  {
    return AllocateExact_38(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native boolean AllocateCopy_39(vtkPolyData id0);
  public boolean AllocateCopy(vtkPolyData id0)
  {
    return AllocateCopy_39(id0);
  }

  private native boolean AllocateProportional_40(vtkPolyData id0,double id1);
  public boolean AllocateProportional(vtkPolyData id0,double id1)
  {
    return AllocateProportional_40(id0,id1);
  }

  private native void Allocate_41(long id0,int id1);
  public void Allocate(long id0,int id1)
  {
    Allocate_41(id0,id1);
  }

  private native void Allocate_42(vtkPolyData id0,long id1,int id2);
  public void Allocate(vtkPolyData id0,long id1,int id2)
  {
    Allocate_42(id0,id1,id2);
  }

  private native long InsertNextCell_43(int id0,vtkIdList id1);
  public long InsertNextCell(int id0,vtkIdList id1)
  {
    return InsertNextCell_43(id0,id1);
  }

  private native void Reset_44();
  public void Reset()
  {
    Reset_44();
  }

  private native void BuildCells_45();
  public void BuildCells()
  {
    BuildCells_45();
  }

  private native boolean NeedToBuildCells_46();
  public boolean NeedToBuildCells()
  {
    return NeedToBuildCells_46();
  }

  private native void BuildLinks_47(int id0);
  public void BuildLinks(int id0)
  {
    BuildLinks_47(id0);
  }

  private native void SetLinks_48(vtkAbstractCellLinks id0);
  public void SetLinks(vtkAbstractCellLinks id0)
  {
    SetLinks_48(id0);
  }

  private native long GetLinks_49();
  public vtkAbstractCellLinks GetLinks()
  {
    long temp = GetLinks_49();

    if (temp == 0) return null;
    return (vtkAbstractCellLinks)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void DeleteCells_50();
  public void DeleteCells()
  {
    DeleteCells_50();
  }

  private native void DeleteLinks_51();
  public void DeleteLinks()
  {
    DeleteLinks_51();
  }

  private native void GetCellEdgeNeighbors_52(long id0,long id1,long id2,vtkIdList id3);
  public void GetCellEdgeNeighbors(long id0,long id1,long id2,vtkIdList id3)
  {
    GetCellEdgeNeighbors_52(id0,id1,id2,id3);
  }

  private native int IsTriangle_53(int id0,int id1,int id2);
  public int IsTriangle(int id0,int id1,int id2)
  {
    return IsTriangle_53(id0,id1,id2);
  }

  private native int IsEdge_54(long id0,long id1);
  public int IsEdge(long id0,long id1)
  {
    return IsEdge_54(id0,id1);
  }

  private native int IsPointUsedByCell_55(long id0,long id1);
  public int IsPointUsedByCell(long id0,long id1)
  {
    return IsPointUsedByCell_55(id0,id1);
  }

  private native void ReplaceCell_56(long id0,vtkIdList id1);
  public void ReplaceCell(long id0,vtkIdList id1)
  {
    ReplaceCell_56(id0,id1);
  }

  private native void ReplaceCellPoint_57(long id0,long id1,long id2);
  public void ReplaceCellPoint(long id0,long id1,long id2)
  {
    ReplaceCellPoint_57(id0,id1,id2);
  }

  private native void ReplaceCellPoint_58(long id0,long id1,long id2,vtkIdList id3);
  public void ReplaceCellPoint(long id0,long id1,long id2,vtkIdList id3)
  {
    ReplaceCellPoint_58(id0,id1,id2,id3);
  }

  private native void ReverseCell_59(long id0);
  public void ReverseCell(long id0)
  {
    ReverseCell_59(id0);
  }

  private native void DeletePoint_60(long id0);
  public void DeletePoint(long id0)
  {
    DeletePoint_60(id0);
  }

  private native void DeleteCell_61(long id0);
  public void DeleteCell(long id0)
  {
    DeleteCell_61(id0);
  }

  private native void RemoveDeletedCells_62();
  public void RemoveDeletedCells()
  {
    RemoveDeletedCells_62();
  }

  private native long InsertNextLinkedPoint_63(int id0);
  public long InsertNextLinkedPoint(int id0)
  {
    return InsertNextLinkedPoint_63(id0);
  }

  private native long InsertNextLinkedPoint_64(double id0[],int id1);
  public long InsertNextLinkedPoint(double id0[],int id1)
  {
    return InsertNextLinkedPoint_64(id0,id1);
  }

  private native void RemoveCellReference_65(long id0);
  public void RemoveCellReference(long id0)
  {
    RemoveCellReference_65(id0);
  }

  private native void AddCellReference_66(long id0);
  public void AddCellReference(long id0)
  {
    AddCellReference_66(id0);
  }

  private native void RemoveReferenceToCell_67(long id0,long id1);
  public void RemoveReferenceToCell(long id0,long id1)
  {
    RemoveReferenceToCell_67(id0,id1);
  }

  private native void AddReferenceToCell_68(long id0,long id1);
  public void AddReferenceToCell(long id0,long id1)
  {
    AddReferenceToCell_68(id0,id1);
  }

  private native void ResizeCellList_69(long id0,int id1);
  public void ResizeCellList(long id0,int id1)
  {
    ResizeCellList_69(id0,id1);
  }

  private native void Initialize_70();
  public void Initialize()
  {
    Initialize_70();
  }

  private native int GetPiece_71();
  public int GetPiece()
  {
    return GetPiece_71();
  }

  private native int GetNumberOfPieces_72();
  public int GetNumberOfPieces()
  {
    return GetNumberOfPieces_72();
  }

  private native int GetGhostLevel_73();
  public int GetGhostLevel()
  {
    return GetGhostLevel_73();
  }

  private native long GetActualMemorySize_74();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_74();
  }

  private native void ShallowCopy_75(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_75(id0);
  }

  private native void DeepCopy_76(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_76(id0);
  }

  private native void RemoveGhostCells_77();
  public void RemoveGhostCells()
  {
    RemoveGhostCells_77();
  }

  private native long GetData_78(vtkInformation id0);
  public vtkPolyData GetData(vtkInformation id0)
  {
    long temp = GetData_78(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_79(vtkInformationVector id0,int id1);
  public vtkPolyData GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_79(id0,id1);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetScalarFieldCriticalIndex_80(long id0,vtkDataArray id1);
  public int GetScalarFieldCriticalIndex(long id0,vtkDataArray id1)
  {
    return GetScalarFieldCriticalIndex_80(id0,id1);
  }

  private native int GetScalarFieldCriticalIndex_81(long id0,int id1);
  public int GetScalarFieldCriticalIndex(long id0,int id1)
  {
    return GetScalarFieldCriticalIndex_81(id0,id1);
  }

  private native int GetScalarFieldCriticalIndex_82(long id0,byte[] id1, int len1);
  public int GetScalarFieldCriticalIndex(long id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return GetScalarFieldCriticalIndex_82(id0,bytes1, bytes1.length);
  }

  private native long GetMeshMTime_83();
  public long GetMeshMTime()
  {
    return GetMeshMTime_83();
  }

  private native long GetMTime_84();
  public long GetMTime()
  {
    return GetMTime_84();
  }

  private native long GetCell_85(int id0,int id1,int id2);
  public vtkCell GetCell(int id0,int id1,int id2)
  {
    long temp = GetCell_85(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPolyData() { super(); }

  public vtkPolyData(long id) { super(id); }
  public native long   VTKInit();

}
