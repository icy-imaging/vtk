// java wrapper for vtkStructuredGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStructuredGrid extends vtkPointSet
{

  private native long ExtendedNew_0();
  public vtkStructuredGrid ExtendedNew()
  {
    long temp = ExtendedNew_0();

    if (temp == 0) return null;
    return (vtkStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native void Initialize_7();
  public void Initialize()
  {
    Initialize_7();
  }

  private native long GetNumberOfCells_8();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_8();
  }

  private native long GetNumberOfPoints_9();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_9();
  }

  private native double[] GetPoint_10(long id0);
  public double[] GetPoint(long id0)
  {
    return GetPoint_10(id0);
  }

  private native void GetPoint_11(long id0,double id1[]);
  public void GetPoint(long id0,double id1[])
  {
    GetPoint_11(id0,id1);
  }

  private native long GetCell_12(long id0);
  public vtkCell GetCell(long id0)
  {
    long temp = GetCell_12(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCell_13(int id0,int id1,int id2);
  public vtkCell GetCell(int id0,int id1,int id2)
  {
    long temp = GetCell_13(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCell_14(long id0,vtkGenericCell id1);
  public void GetCell(long id0,vtkGenericCell id1)
  {
    GetCell_14(id0,id1);
  }

  private native void GetCellBounds_15(long id0,double id1[]);
  public void GetCellBounds(long id0,double id1[])
  {
    GetCellBounds_15(id0,id1);
  }

  private native int GetCellType_16(long id0);
  public int GetCellType(long id0)
  {
    return GetCellType_16(id0);
  }

  private native long GetCellSize_17(long id0);
  public long GetCellSize(long id0)
  {
    return GetCellSize_17(id0);
  }

  private native void GetCellPoints_18(long id0,vtkIdList id1);
  public void GetCellPoints(long id0,vtkIdList id1)
  {
    GetCellPoints_18(id0,id1);
  }

  private native void GetPointCells_19(long id0,vtkIdList id1);
  public void GetPointCells(long id0,vtkIdList id1)
  {
    GetPointCells_19(id0,id1);
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

  private native void GetCellNeighbors_22(long id0,vtkIdList id1,vtkIdList id2);
  public void GetCellNeighbors(long id0,vtkIdList id1,vtkIdList id2)
  {
    GetCellNeighbors_22(id0,id1,id2);
  }

  private native long GetCells_23();
  public vtkStructuredCellArray GetCells()
  {
    long temp = GetCells_23();

    if (temp == 0) return null;
    return (vtkStructuredCellArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BlankPoint_24(long id0);
  public void BlankPoint(long id0)
  {
    BlankPoint_24(id0);
  }

  private native void UnBlankPoint_25(long id0);
  public void UnBlankPoint(long id0)
  {
    UnBlankPoint_25(id0);
  }

  private native void BlankCell_26(long id0);
  public void BlankCell(long id0)
  {
    BlankCell_26(id0);
  }

  private native void UnBlankCell_27(long id0);
  public void UnBlankCell(long id0)
  {
    UnBlankCell_27(id0);
  }

  private native byte IsPointVisible_28(long id0);
  public byte IsPointVisible(long id0)
  {
    return IsPointVisible_28(id0);
  }

  private native byte IsCellVisible_29(long id0);
  public byte IsCellVisible(long id0)
  {
    return IsCellVisible_29(id0);
  }

  private native boolean HasAnyBlankPoints_30();
  public boolean HasAnyBlankPoints()
  {
    return HasAnyBlankPoints_30();
  }

  private native boolean HasAnyBlankCells_31();
  public boolean HasAnyBlankCells()
  {
    return HasAnyBlankCells_31();
  }

  private native int GetDataDescription_32();
  public int GetDataDescription()
  {
    return GetDataDescription_32();
  }

  private native void GetCellDims_33(int id0[]);
  public void GetCellDims(int id0[])
  {
    GetCellDims_33(id0);
  }

  private native void SetDimensions_34(int id0,int id1,int id2);
  public void SetDimensions(int id0,int id1,int id2)
  {
    SetDimensions_34(id0,id1,id2);
  }

  private native void SetDimensions_35(int id0[]);
  public void SetDimensions(int id0[])
  {
    SetDimensions_35(id0);
  }

  private native int[] GetDimensions_36();
  public int[] GetDimensions()
  {
    return GetDimensions_36();
  }

  private native void GetDimensions_37(int id0[]);
  public void GetDimensions(int id0[])
  {
    GetDimensions_37(id0);
  }

  private native int GetDataDimension_38();
  public int GetDataDimension()
  {
    return GetDataDimension_38();
  }

  private native void SetExtent_39(int id0[]);
  public void SetExtent(int id0[])
  {
    SetExtent_39(id0);
  }

  private native void SetExtent_40(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetExtent_40(id0,id1,id2,id3,id4,id5);
  }

  private native int[] GetExtent_41();
  public int[] GetExtent()
  {
    return GetExtent_41();
  }

  private native long GetActualMemorySize_42();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_42();
  }

  private native void ShallowCopy_43(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_43(id0);
  }

  private native void DeepCopy_44(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_44(id0);
  }

  private native int GetExtentType_45();
  public int GetExtentType()
  {
    return GetExtentType_45();
  }

  private native long GetData_46(vtkInformation id0);
  public vtkStructuredGrid GetData(vtkInformation id0)
  {
    long temp = GetData_46(id0);

    if (temp == 0) return null;
    return (vtkStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_47(vtkInformationVector id0,int id1);
  public vtkStructuredGrid GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_47(id0,id1);

    if (temp == 0) return null;
    return (vtkStructuredGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetPoint_48(int id0,int id1,int id2,double id3[],boolean id4);
  public void GetPoint(int id0,int id1,int id2,double id3[],boolean id4)
  {
    GetPoint_48(id0,id1,id2,id3,id4);
  }

  public vtkStructuredGrid() { super(); }

  public vtkStructuredGrid(long id) { super(id); }
  public native long   VTKInit();

}
