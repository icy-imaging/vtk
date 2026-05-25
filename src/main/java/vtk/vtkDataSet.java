// java wrapper for vtkDataSet object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataSet extends vtkDataObject
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

  private native void CopyStructure_4(vtkDataSet id0);
  public void CopyStructure(vtkDataSet id0)
  {
    CopyStructure_4(id0);
  }

  private native void CopyAttributes_5(vtkDataSet id0);
  public void CopyAttributes(vtkDataSet id0)
  {
    CopyAttributes_5(id0);
  }

  private native long GetNumberOfPoints_6();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_6();
  }

  private native long GetNumberOfCells_7();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_7();
  }

  private native long GetPoints_8();
  public vtkPoints GetPoints()
  {
    long temp = GetPoints_8();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double[] GetPoint_9(long id0);
  public double[] GetPoint(long id0)
  {
    return GetPoint_9(id0);
  }

  private native void GetPoint_10(long id0,double id1[]);
  public void GetPoint(long id0,double id1[])
  {
    GetPoint_10(id0,id1);
  }

  private native long NewCellIterator_11();
  public vtkCellIterator NewCellIterator()
  {
    long temp = NewCellIterator_11();

    if (temp == 0) return null;
    return (vtkCellIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native void SetCellOrderAndRationalWeights_14(long id0,vtkGenericCell id1);
  public void SetCellOrderAndRationalWeights(long id0,vtkGenericCell id1)
  {
    SetCellOrderAndRationalWeights_14(id0,id1);
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

  private native int GetCellType_17(long id0);
  public int GetCellType(long id0)
  {
    return GetCellType_17(id0);
  }

  private native long GetCellSize_18(long id0);
  public long GetCellSize(long id0)
  {
    return GetCellSize_18(id0);
  }

  private native void GetCellTypes_19(vtkCellTypes id0);
  public void GetCellTypes(vtkCellTypes id0)
  {
    GetCellTypes_19(id0);
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

  private native void GetCellNeighbors_22(long id0,vtkIdList id1,vtkIdList id2);
  public void GetCellNeighbors(long id0,vtkIdList id1,vtkIdList id2)
  {
    GetCellNeighbors_22(id0,id1,id2);
  }

  private native long FindPoint_23(double id0,double id1,double id2);
  public long FindPoint(double id0,double id1,double id2)
  {
    return FindPoint_23(id0,id1,id2);
  }

  private native long FindPoint_24(double id0[]);
  public long FindPoint(double id0[])
  {
    return FindPoint_24(id0);
  }

  private native long GetMTime_25();
  public long GetMTime()
  {
    return GetMTime_25();
  }

  private native long GetCellData_26();
  public vtkCellData GetCellData()
  {
    long temp = GetCellData_26();

    if (temp == 0) return null;
    return (vtkCellData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPointData_27();
  public vtkPointData GetPointData()
  {
    long temp = GetPointData_27();

    if (temp == 0) return null;
    return (vtkPointData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Squeeze_28();
  public void Squeeze()
  {
    Squeeze_28();
  }

  private native void ComputeBounds_29();
  public void ComputeBounds()
  {
    ComputeBounds_29();
  }

  private native double[] GetBounds_30();
  public double[] GetBounds()
  {
    return GetBounds_30();
  }

  private native void GetBounds_31(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_31(id0);
  }

  private native double[] GetCenter_32();
  public double[] GetCenter()
  {
    return GetCenter_32();
  }

  private native void GetCenter_33(double id0[]);
  public void GetCenter(double id0[])
  {
    GetCenter_33(id0);
  }

  private native double GetLength_34();
  public double GetLength()
  {
    return GetLength_34();
  }

  private native double GetLength2_35();
  public double GetLength2()
  {
    return GetLength2_35();
  }

  private native void Initialize_36();
  public void Initialize()
  {
    Initialize_36();
  }

  private native void GetScalarRange_37(double id0[]);
  public void GetScalarRange(double id0[])
  {
    GetScalarRange_37(id0);
  }

  private native double[] GetScalarRange_38();
  public double[] GetScalarRange()
  {
    return GetScalarRange_38();
  }

  private native int GetMaxCellSize_39();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_39();
  }

  private native int GetMaxSpatialDimension_40();
  public int GetMaxSpatialDimension()
  {
    return GetMaxSpatialDimension_40();
  }

  private native long GetActualMemorySize_41();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_41();
  }

  private native int GetDataObjectType_42();
  public int GetDataObjectType()
  {
    return GetDataObjectType_42();
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

  private native int CheckAttributes_45();
  public int CheckAttributes()
  {
    return CheckAttributes_45();
  }

  private native void GenerateGhostArray_46(int id0[]);
  public void GenerateGhostArray(int id0[])
  {
    GenerateGhostArray_46(id0);
  }

  private native void GenerateGhostArray_47(int id0[],boolean id1);
  public void GenerateGhostArray(int id0[],boolean id1)
  {
    GenerateGhostArray_47(id0,id1);
  }

  private native long GetData_48(vtkInformation id0);
  public vtkDataSet GetData(vtkInformation id0)
  {
    long temp = GetData_48(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_49(vtkInformationVector id0,int id1);
  public vtkDataSet GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_49(id0,id1);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAttributesAsFieldData_50(int id0);
  public vtkFieldData GetAttributesAsFieldData(int id0)
  {
    long temp = GetAttributesAsFieldData_50(id0);

    if (temp == 0) return null;
    return (vtkFieldData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfElements_51(int id0);
  public long GetNumberOfElements(int id0)
  {
    return GetNumberOfElements_51(id0);
  }

  private native long GetMeshMTime_52();
  public long GetMeshMTime()
  {
    return GetMeshMTime_52();
  }

  private native boolean HasAnyGhostCells_53();
  public boolean HasAnyGhostCells()
  {
    return HasAnyGhostCells_53();
  }

  private native boolean HasAnyGhostPoints_54();
  public boolean HasAnyGhostPoints()
  {
    return HasAnyGhostPoints_54();
  }

  private native boolean HasAnyBlankCells_55();
  public boolean HasAnyBlankCells()
  {
    return HasAnyBlankCells_55();
  }

  private native boolean HasAnyBlankPoints_56();
  public boolean HasAnyBlankPoints()
  {
    return HasAnyBlankPoints_56();
  }

  private native long GetPointGhostArray_57();
  public vtkUnsignedCharArray GetPointGhostArray()
  {
    long temp = GetPointGhostArray_57();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void UpdatePointGhostArrayCache_58();
  public void UpdatePointGhostArrayCache()
  {
    UpdatePointGhostArrayCache_58();
  }

  private native long AllocatePointGhostArray_59();
  public vtkUnsignedCharArray AllocatePointGhostArray()
  {
    long temp = AllocatePointGhostArray_59();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellGhostArray_60();
  public vtkUnsignedCharArray GetCellGhostArray()
  {
    long temp = GetCellGhostArray_60();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void UpdateCellGhostArrayCache_61();
  public void UpdateCellGhostArrayCache()
  {
    UpdateCellGhostArrayCache_61();
  }

  private native long AllocateCellGhostArray_62();
  public vtkUnsignedCharArray AllocateCellGhostArray()
  {
    long temp = AllocateCellGhostArray_62();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGhostArray_63(int id0);
  public vtkUnsignedCharArray GetGhostArray(int id0)
  {
    long temp = GetGhostArray_63(id0);

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean SupportsGhostArray_64(int id0);
  public boolean SupportsGhostArray(int id0)
  {
    return SupportsGhostArray_64(id0);
  }

  public vtkDataSet() { super(); }

  public vtkDataSet(long id) { super(id); }

}
