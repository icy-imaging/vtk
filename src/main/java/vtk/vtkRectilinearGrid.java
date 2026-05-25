// java wrapper for vtkRectilinearGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRectilinearGrid extends vtkDataSet
{

  private native long ExtendedNew_0();
  public vtkRectilinearGrid ExtendedNew()
  {
    long temp = ExtendedNew_0();

    if (temp == 0) return null;
    return (vtkRectilinearGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native long GetPoints_10();
  public vtkPoints GetPoints()
  {
    long temp = GetPoints_10();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double[] GetPoint_11(long id0);
  public double[] GetPoint(long id0)
  {
    return GetPoint_11(id0);
  }

  private native void GetPoint_12(long id0,double id1[]);
  public void GetPoint(long id0,double id1[])
  {
    GetPoint_12(id0,id1);
  }

  private native long GetCell_13(long id0);
  public vtkCell GetCell(long id0)
  {
    long temp = GetCell_13(id0);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCell_14(int id0,int id1,int id2);
  public vtkCell GetCell(int id0,int id1,int id2)
  {
    long temp = GetCell_14(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkCell)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetCell_15(long id0,vtkGenericCell id1);
  public void GetCell(long id0,vtkGenericCell id1)
  {
    GetCell_15(id0,id1);
  }

  private native void GetCellBounds_16(long id0,double id1[]);
  public void GetCellBounds(long id0,double id1[])
  {
    GetCellBounds_16(id0,id1);
  }

  private native long FindPoint_17(double id0[]);
  public long FindPoint(double id0[])
  {
    return FindPoint_17(id0);
  }

  private native int GetCellType_18(long id0);
  public int GetCellType(long id0)
  {
    return GetCellType_18(id0);
  }

  private native long GetCellSize_19(long id0);
  public long GetCellSize(long id0)
  {
    return GetCellSize_19(id0);
  }

  private native void GetCellPoints_20(long id0,vtkIdList id1);
  public void GetCellPoints(long id0,vtkIdList id1)
  {
    GetCellPoints_20(id0,id1);
  }

  private native void GetPointCells_21(long id0,vtkIdList id1);
  public void GetPointCells(long id0,vtkIdList id1)
  {
    GetPointCells_21(id0,id1);
  }

  private native void ComputeBounds_22();
  public void ComputeBounds()
  {
    ComputeBounds_22();
  }

  private native int GetMaxCellSize_23();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_23();
  }

  private native int GetMaxSpatialDimension_24();
  public int GetMaxSpatialDimension()
  {
    return GetMaxSpatialDimension_24();
  }

  private native void GetCellNeighbors_25(long id0,vtkIdList id1,vtkIdList id2);
  public void GetCellNeighbors(long id0,vtkIdList id1,vtkIdList id2)
  {
    GetCellNeighbors_25(id0,id1,id2);
  }

  private native long GetCells_26();
  public vtkStructuredCellArray GetCells()
  {
    long temp = GetCells_26();

    if (temp == 0) return null;
    return (vtkStructuredCellArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BlankPoint_27(long id0);
  public void BlankPoint(long id0)
  {
    BlankPoint_27(id0);
  }

  private native void UnBlankPoint_28(long id0);
  public void UnBlankPoint(long id0)
  {
    UnBlankPoint_28(id0);
  }

  private native void BlankPoint_29(int id0,int id1,int id2);
  public void BlankPoint(int id0,int id1,int id2)
  {
    BlankPoint_29(id0,id1,id2);
  }

  private native void UnBlankPoint_30(int id0,int id1,int id2);
  public void UnBlankPoint(int id0,int id1,int id2)
  {
    UnBlankPoint_30(id0,id1,id2);
  }

  private native void BlankCell_31(long id0);
  public void BlankCell(long id0)
  {
    BlankCell_31(id0);
  }

  private native void UnBlankCell_32(long id0);
  public void UnBlankCell(long id0)
  {
    UnBlankCell_32(id0);
  }

  private native void BlankCell_33(int id0,int id1,int id2);
  public void BlankCell(int id0,int id1,int id2)
  {
    BlankCell_33(id0,id1,id2);
  }

  private native void UnBlankCell_34(int id0,int id1,int id2);
  public void UnBlankCell(int id0,int id1,int id2)
  {
    UnBlankCell_34(id0,id1,id2);
  }

  private native byte IsPointVisible_35(long id0);
  public byte IsPointVisible(long id0)
  {
    return IsPointVisible_35(id0);
  }

  private native byte IsCellVisible_36(long id0);
  public byte IsCellVisible(long id0)
  {
    return IsCellVisible_36(id0);
  }

  private native boolean HasAnyBlankPoints_37();
  public boolean HasAnyBlankPoints()
  {
    return HasAnyBlankPoints_37();
  }

  private native boolean HasAnyBlankCells_38();
  public boolean HasAnyBlankCells()
  {
    return HasAnyBlankCells_38();
  }

  private native int GetDataDescription_39();
  public int GetDataDescription()
  {
    return GetDataDescription_39();
  }

  private native void GetCellDims_40(int id0[]);
  public void GetCellDims(int id0[])
  {
    GetCellDims_40(id0);
  }

  private native void GetPoints_41(vtkPoints id0);
  public void GetPoints(vtkPoints id0)
  {
    GetPoints_41(id0);
  }

  private native void SetDimensions_42(int id0,int id1,int id2);
  public void SetDimensions(int id0,int id1,int id2)
  {
    SetDimensions_42(id0,id1,id2);
  }

  private native void SetDimensions_43(int id0[]);
  public void SetDimensions(int id0[])
  {
    SetDimensions_43(id0);
  }

  private native int[] GetDimensions_44();
  public int[] GetDimensions()
  {
    return GetDimensions_44();
  }

  private native int GetDataDimension_45();
  public int GetDataDimension()
  {
    return GetDataDimension_45();
  }

  private native int ComputeStructuredCoordinates_46(double id0[],int id1[],double id2[]);
  public int ComputeStructuredCoordinates(double id0[],int id1[],double id2[])
  {
    return ComputeStructuredCoordinates_46(id0,id1,id2);
  }

  private native long ComputePointId_47(int id0[]);
  public long ComputePointId(int id0[])
  {
    return ComputePointId_47(id0);
  }

  private native long ComputeCellId_48(int id0[]);
  public long ComputeCellId(int id0[])
  {
    return ComputeCellId_48(id0);
  }

  private native void GetPoint_49(int id0,int id1,int id2,double id3[]);
  public void GetPoint(int id0,int id1,int id2,double id3[])
  {
    GetPoint_49(id0,id1,id2,id3);
  }

  private native void SetXCoordinates_50(vtkDataArray id0);
  public void SetXCoordinates(vtkDataArray id0)
  {
    SetXCoordinates_50(id0);
  }

  private native long GetXCoordinates_51();
  public vtkDataArray GetXCoordinates()
  {
    long temp = GetXCoordinates_51();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetYCoordinates_52(vtkDataArray id0);
  public void SetYCoordinates(vtkDataArray id0)
  {
    SetYCoordinates_52(id0);
  }

  private native long GetYCoordinates_53();
  public vtkDataArray GetYCoordinates()
  {
    long temp = GetYCoordinates_53();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetZCoordinates_54(vtkDataArray id0);
  public void SetZCoordinates(vtkDataArray id0)
  {
    SetZCoordinates_54(id0);
  }

  private native long GetZCoordinates_55();
  public vtkDataArray GetZCoordinates()
  {
    long temp = GetZCoordinates_55();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetExtent_56(int id0[]);
  public void SetExtent(int id0[])
  {
    SetExtent_56(id0);
  }

  private native void SetExtent_57(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetExtent_57(id0,id1,id2,id3,id4,id5);
  }

  private native int[] GetExtent_58();
  public int[] GetExtent()
  {
    return GetExtent_58();
  }

  private native long GetActualMemorySize_59();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_59();
  }

  private native void ShallowCopy_60(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_60(id0);
  }

  private native void DeepCopy_61(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_61(id0);
  }

  private native int GetExtentType_62();
  public int GetExtentType()
  {
    return GetExtentType_62();
  }

  private native long GetData_63(vtkInformation id0);
  public vtkRectilinearGrid GetData(vtkInformation id0)
  {
    long temp = GetData_63(id0);

    if (temp == 0) return null;
    return (vtkRectilinearGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_64(vtkInformationVector id0,int id1);
  public vtkRectilinearGrid GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_64(id0,id1);

    if (temp == 0) return null;
    return (vtkRectilinearGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScalarType_65(int id0,vtkInformation id1);
  public void SetScalarType(int id0,vtkInformation id1)
  {
    SetScalarType_65(id0,id1);
  }

  private native int GetScalarType_66(vtkInformation id0);
  public int GetScalarType(vtkInformation id0)
  {
    return GetScalarType_66(id0);
  }

  private native boolean HasScalarType_67(vtkInformation id0);
  public boolean HasScalarType(vtkInformation id0)
  {
    return HasScalarType_67(id0);
  }

  private native int GetScalarType_68();
  public int GetScalarType()
  {
    return GetScalarType_68();
  }

  private native byte[] GetScalarTypeAsString_69();
  public String GetScalarTypeAsString()
  {
    return new String(GetScalarTypeAsString_69(), StandardCharsets.UTF_8);
  }

  private native void SetNumberOfScalarComponents_70(int id0,vtkInformation id1);
  public void SetNumberOfScalarComponents(int id0,vtkInformation id1)
  {
    SetNumberOfScalarComponents_70(id0,id1);
  }

  private native int GetNumberOfScalarComponents_71(vtkInformation id0);
  public int GetNumberOfScalarComponents(vtkInformation id0)
  {
    return GetNumberOfScalarComponents_71(id0);
  }

  private native boolean HasNumberOfScalarComponents_72(vtkInformation id0);
  public boolean HasNumberOfScalarComponents(vtkInformation id0)
  {
    return HasNumberOfScalarComponents_72(id0);
  }

  private native int GetNumberOfScalarComponents_73();
  public int GetNumberOfScalarComponents()
  {
    return GetNumberOfScalarComponents_73();
  }

  public vtkRectilinearGrid() { super(); }

  public vtkRectilinearGrid(long id) { super(id); }
  public native long   VTKInit();

}
