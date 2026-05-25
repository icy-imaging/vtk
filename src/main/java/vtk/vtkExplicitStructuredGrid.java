// java wrapper for vtkExplicitStructuredGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExplicitStructuredGrid extends vtkPointSet
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

  private native int GetDataObjectType_4();
  public int GetDataObjectType()
  {
    return GetDataObjectType_4();
  }

  private native void Initialize_5();
  public void Initialize()
  {
    Initialize_5();
  }

  private native long GetCell_6(long id0);
  public vtkCell GetCell(long id0)
  {
    long temp = GetCell_6(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCell_7(long id0,vtkGenericCell id1);
  public void GetCell(long id0,vtkGenericCell id1)
  {
    GetCell_7(id0,id1);
  }

  private native void GetCellBounds_8(long id0,double id1[]);
  public void GetCellBounds(long id0,double id1[])
  {
    GetCellBounds_8(id0,id1);
  }

  private native int GetCellType_9(long id0);
  public int GetCellType(long id0)
  {
    return GetCellType_9(id0);
  }

  private native long GetCellSize_10(long id0);
  public long GetCellSize(long id0)
  {
    return GetCellSize_10(id0);
  }

  private native long GetNumberOfCells_11();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_11();
  }

  private native void GetCellPoints_12(long id0,vtkIdList id1);
  public void GetCellPoints(long id0,vtkIdList id1)
  {
    GetCellPoints_12(id0,id1);
  }

  private native void GetPointCells_13(long id0,vtkIdList id1);
  public void GetPointCells(long id0,vtkIdList id1)
  {
    GetPointCells_13(id0,id1);
  }

  private native int GetMaxCellSize_14();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_14();
  }

  private native int GetMaxSpatialDimension_15();
  public int GetMaxSpatialDimension()
  {
    return GetMaxSpatialDimension_15();
  }

  private native void GetCellNeighbors_16(long id0,vtkIdList id1,vtkIdList id2);
  public void GetCellNeighbors(long id0,vtkIdList id1,vtkIdList id2)
  {
    GetCellNeighbors_16(id0,id1,id2);
  }

  private native void CopyStructure_17(vtkDataSet id0);
  public void CopyStructure(vtkDataSet id0)
  {
    CopyStructure_17(id0);
  }

  private native void ShallowCopy_18(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_18(id0);
  }

  private native void DeepCopy_19(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_19(id0);
  }

  private native int GetDataDimension_20();
  public int GetDataDimension()
  {
    return GetDataDimension_20();
  }

  private native void SetDimensions_21(int id0,int id1,int id2);
  public void SetDimensions(int id0,int id1,int id2)
  {
    SetDimensions_21(id0,id1,id2);
  }

  private native void SetDimensions_22(int id0[]);
  public void SetDimensions(int id0[])
  {
    SetDimensions_22(id0);
  }

  private native void GetDimensions_23(int id0[]);
  public void GetDimensions(int id0[])
  {
    GetDimensions_23(id0);
  }

  private native void GetCellDims_24(int id0[]);
  public void GetCellDims(int id0[])
  {
    GetCellDims_24(id0);
  }

  private native int GetExtentType_25();
  public int GetExtentType()
  {
    return GetExtentType_25();
  }

  private native void SetExtent_26(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetExtent_26(id0,id1,id2,id3,id4,id5);
  }

  private native void SetExtent_27(int id0[]);
  public void SetExtent(int id0[])
  {
    SetExtent_27(id0);
  }

  private native int[] GetExtent_28();
  public int[] GetExtent()
  {
    return GetExtent_28();
  }

  private native void SetCells_29(vtkCellArray id0);
  public void SetCells(vtkCellArray id0)
  {
    SetCells_29(id0);
  }

  private native long GetCells_30();
  public vtkCellArray GetCells()
  {
    long temp = GetCells_30();

    if (temp == 0) return null;
    return (vtkCellArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildLinks_31();
  public void BuildLinks()
  {
    BuildLinks_31();
  }

  private native void SetLinks_32(vtkAbstractCellLinks id0);
  public void SetLinks(vtkAbstractCellLinks id0)
  {
    SetLinks_32(id0);
  }

  private native long GetLinks_33();
  public vtkAbstractCellLinks GetLinks()
  {
    long temp = GetLinks_33();

    if (temp == 0) return null;
    return (vtkAbstractCellLinks)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ComputeCellId_34(int id0,int id1,int id2,boolean id3);
  public long ComputeCellId(int id0,int id1,int id2,boolean id3)
  {
    return ComputeCellId_34(id0,id1,id2,id3);
  }

  private native void ComputeFacesConnectivityFlagsArray_35();
  public void ComputeFacesConnectivityFlagsArray()
  {
    ComputeFacesConnectivityFlagsArray_35();
  }

  private native void SetFacesConnectivityFlagsArrayName_36(byte[] id0, int len0);
  public void SetFacesConnectivityFlagsArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFacesConnectivityFlagsArrayName_36(bytes0, bytes0.length);
  }

  private native byte[] GetFacesConnectivityFlagsArrayName_37();
  public String GetFacesConnectivityFlagsArrayName()
  {
    return new String(GetFacesConnectivityFlagsArrayName_37(), StandardCharsets.UTF_8);
  }

  private native void BlankCell_38(long id0);
  public void BlankCell(long id0)
  {
    BlankCell_38(id0);
  }

  private native void UnBlankCell_39(long id0);
  public void UnBlankCell(long id0)
  {
    UnBlankCell_39(id0);
  }

  private native boolean HasAnyBlankCells_40();
  public boolean HasAnyBlankCells()
  {
    return HasAnyBlankCells_40();
  }

  private native byte IsCellVisible_41(long id0);
  public byte IsCellVisible(long id0)
  {
    return IsCellVisible_41(id0);
  }

  private native byte IsCellGhost_42(long id0);
  public byte IsCellGhost(long id0)
  {
    return IsCellGhost_42(id0);
  }

  private native boolean HasAnyGhostCells_43();
  public boolean HasAnyGhostCells()
  {
    return HasAnyGhostCells_43();
  }

  private native long GetData_44(vtkInformation id0);
  public vtkExplicitStructuredGrid GetData(vtkInformation id0)
  {
    long temp = GetData_44(id0);

    if (temp == 0) return null;
    return (vtkExplicitStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_45(vtkInformationVector id0,int id1);
  public vtkExplicitStructuredGrid GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_45(id0,id1);

    if (temp == 0) return null;
    return (vtkExplicitStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetActualMemorySize_46();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_46();
  }

  private native void CheckAndReorderFaces_47();
  public void CheckAndReorderFaces()
  {
    CheckAndReorderFaces_47();
  }

  private native void GenerateGhostArray_48(int id0[],boolean id1);
  public void GenerateGhostArray(int id0[],boolean id1)
  {
    GenerateGhostArray_48(id0,id1);
  }

  private native long GetCell_49(int id0,int id1,int id2);
  public vtkCell GetCell(int id0,int id1,int id2)
  {
    long temp = GetCell_49(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GenerateGhostArray_50(int id0[]);
  public void GenerateGhostArray(int id0[])
  {
    GenerateGhostArray_50(id0);
  }

  public vtkExplicitStructuredGrid() { super(); }

  public vtkExplicitStructuredGrid(long id) { super(id); }
  public native long   VTKInit();

}
