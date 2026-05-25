// java wrapper for vtkCellArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellArray extends vtkAbstractCellArray
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

  private native int Allocate_4(long id0,long id1);
  public int Allocate(long id0,long id1)
  {
    return Allocate_4(id0,id1);
  }

  private native boolean AllocateEstimate_5(long id0,long id1);
  public boolean AllocateEstimate(long id0,long id1)
  {
    return AllocateEstimate_5(id0,id1);
  }

  private native boolean AllocateExact_6(long id0,long id1);
  public boolean AllocateExact(long id0,long id1)
  {
    return AllocateExact_6(id0,id1);
  }

  private native boolean AllocateCopy_7(vtkCellArray id0);
  public boolean AllocateCopy(vtkCellArray id0)
  {
    return AllocateCopy_7(id0);
  }

  private native boolean ResizeExact_8(long id0,long id1);
  public boolean ResizeExact(long id0,long id1)
  {
    return ResizeExact_8(id0,id1);
  }

  private native void Initialize_9();
  public void Initialize()
  {
    Initialize_9();
  }

  private native void Reset_10();
  public void Reset()
  {
    Reset_10();
  }

  private native void Squeeze_11();
  public void Squeeze()
  {
    Squeeze_11();
  }

  private native boolean IsValid_12();
  public boolean IsValid()
  {
    return IsValid_12();
  }

  private native long GetNumberOfCells_13();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_13();
  }

  private native long GetNumberOfOffsets_14();
  public long GetNumberOfOffsets()
  {
    return GetNumberOfOffsets_14();
  }

  private native long GetOffset_15(long id0);
  public long GetOffset(long id0)
  {
    return GetOffset_15(id0);
  }

  private native long GetNumberOfConnectivityIds_16();
  public long GetNumberOfConnectivityIds()
  {
    return GetNumberOfConnectivityIds_16();
  }

  private native long NewIterator_17();
  public vtkCellArrayIterator NewIterator()
  {
    long temp = NewIterator_17();

    if (temp == 0) return null;
    return (vtkCellArrayIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetData_18(vtkIdTypeArray id0,vtkIdTypeArray id1);
  public void SetData(vtkIdTypeArray id0,vtkIdTypeArray id1)
  {
    SetData_18(id0,id1);
  }

  private native void SetData_19(vtkTypeInt32Array id0,vtkTypeInt32Array id1);
  public void SetData(vtkTypeInt32Array id0,vtkTypeInt32Array id1)
  {
    SetData_19(id0,id1);
  }

  private native void SetData_20(vtkTypeInt64Array id0,vtkTypeInt64Array id1);
  public void SetData(vtkTypeInt64Array id0,vtkTypeInt64Array id1)
  {
    SetData_20(id0,id1);
  }

  private native boolean SetData_21(vtkDataArray id0,vtkDataArray id1);
  public boolean SetData(vtkDataArray id0,vtkDataArray id1)
  {
    return SetData_21(id0,id1);
  }

  private native boolean SetData_22(long id0,vtkDataArray id1);
  public boolean SetData(long id0,vtkDataArray id1)
  {
    return SetData_22(id0,id1);
  }

  private native boolean IsStorage64Bit_23();
  public boolean IsStorage64Bit()
  {
    return IsStorage64Bit_23();
  }

  private native boolean IsStorageShareable_24();
  public boolean IsStorageShareable()
  {
    return IsStorageShareable_24();
  }

  private native void Use32BitStorage_25();
  public void Use32BitStorage()
  {
    Use32BitStorage_25();
  }

  private native void Use64BitStorage_26();
  public void Use64BitStorage()
  {
    Use64BitStorage_26();
  }

  private native void UseDefaultStorage_27();
  public void UseDefaultStorage()
  {
    UseDefaultStorage_27();
  }

  private native boolean CanConvertTo32BitStorage_28();
  public boolean CanConvertTo32BitStorage()
  {
    return CanConvertTo32BitStorage_28();
  }

  private native boolean CanConvertTo64BitStorage_29();
  public boolean CanConvertTo64BitStorage()
  {
    return CanConvertTo64BitStorage_29();
  }

  private native boolean CanConvertToDefaultStorage_30();
  public boolean CanConvertToDefaultStorage()
  {
    return CanConvertToDefaultStorage_30();
  }

  private native boolean ConvertTo32BitStorage_31();
  public boolean ConvertTo32BitStorage()
  {
    return ConvertTo32BitStorage_31();
  }

  private native boolean ConvertTo64BitStorage_32();
  public boolean ConvertTo64BitStorage()
  {
    return ConvertTo64BitStorage_32();
  }

  private native boolean ConvertToDefaultStorage_33();
  public boolean ConvertToDefaultStorage()
  {
    return ConvertToDefaultStorage_33();
  }

  private native boolean ConvertToSmallestStorage_34();
  public boolean ConvertToSmallestStorage()
  {
    return ConvertToSmallestStorage_34();
  }

  private native long GetOffsetsArray_35();
  public vtkDataArray GetOffsetsArray()
  {
    long temp = GetOffsetsArray_35();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOffsetsArray32_36();
  public vtkTypeInt32Array GetOffsetsArray32()
  {
    long temp = GetOffsetsArray32_36();

    if (temp == 0) return null;
    return (vtkTypeInt32Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOffsetsArray64_37();
  public vtkTypeInt64Array GetOffsetsArray64()
  {
    long temp = GetOffsetsArray64_37();

    if (temp == 0) return null;
    return (vtkTypeInt64Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetConnectivityArray_38();
  public vtkDataArray GetConnectivityArray()
  {
    long temp = GetConnectivityArray_38();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetConnectivityArray32_39();
  public vtkTypeInt32Array GetConnectivityArray32()
  {
    long temp = GetConnectivityArray32_39();

    if (temp == 0) return null;
    return (vtkTypeInt32Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetConnectivityArray64_40();
  public vtkTypeInt64Array GetConnectivityArray64()
  {
    long temp = GetConnectivityArray64_40();

    if (temp == 0) return null;
    return (vtkTypeInt64Array)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long IsHomogeneous_41();
  public long IsHomogeneous()
  {
    return IsHomogeneous_41();
  }

  private native void InitTraversal_42();
  public void InitTraversal()
  {
    InitTraversal_42();
  }

  private native int GetNextCell_43(vtkIdList id0);
  public int GetNextCell(vtkIdList id0)
  {
    return GetNextCell_43(id0);
  }

  private native void GetCellAtId_44(long id0,vtkIdList id1);
  public void GetCellAtId(long id0,vtkIdList id1)
  {
    GetCellAtId_44(id0,id1);
  }

  private native long GetCellSize_45(long id0);
  public long GetCellSize(long id0)
  {
    return GetCellSize_45(id0);
  }

  private native long InsertNextCell_46(vtkCell id0);
  public long InsertNextCell(vtkCell id0)
  {
    return InsertNextCell_46(id0);
  }

  private native long InsertNextCell_47(vtkIdList id0);
  public long InsertNextCell(vtkIdList id0)
  {
    return InsertNextCell_47(id0);
  }

  private native long InsertNextCell_48(int id0);
  public long InsertNextCell(int id0)
  {
    return InsertNextCell_48(id0);
  }

  private native void InsertCellPoint_49(long id0);
  public void InsertCellPoint(long id0)
  {
    InsertCellPoint_49(id0);
  }

  private native void UpdateCellCount_50(int id0);
  public void UpdateCellCount(int id0)
  {
    UpdateCellCount_50(id0);
  }

  private native long GetTraversalCellId_51();
  public long GetTraversalCellId()
  {
    return GetTraversalCellId_51();
  }

  private native void SetTraversalCellId_52(long id0);
  public void SetTraversalCellId(long id0)
  {
    SetTraversalCellId_52(id0);
  }

  private native void ReverseCellAtId_53(long id0);
  public void ReverseCellAtId(long id0)
  {
    ReverseCellAtId_53(id0);
  }

  private native void ReplaceCellAtId_54(long id0,vtkIdList id1);
  public void ReplaceCellAtId(long id0,vtkIdList id1)
  {
    ReplaceCellAtId_54(id0,id1);
  }

  private native void ReplaceCellPointAtId_55(long id0,long id1,long id2);
  public void ReplaceCellPointAtId(long id0,long id1,long id2)
  {
    ReplaceCellPointAtId_55(id0,id1,id2);
  }

  private native int GetMaxCellSize_56();
  public int GetMaxCellSize()
  {
    return GetMaxCellSize_56();
  }

  private native void DeepCopy_57(vtkAbstractCellArray id0);
  public void DeepCopy(vtkAbstractCellArray id0)
  {
    DeepCopy_57(id0);
  }

  private native void ShallowCopy_58(vtkAbstractCellArray id0);
  public void ShallowCopy(vtkAbstractCellArray id0)
  {
    ShallowCopy_58(id0);
  }

  private native void Append_59(vtkCellArray id0,long id1);
  public void Append(vtkCellArray id0,long id1)
  {
    Append_59(id0,id1);
  }

  private native void ExportLegacyFormat_60(vtkIdTypeArray id0);
  public void ExportLegacyFormat(vtkIdTypeArray id0)
  {
    ExportLegacyFormat_60(id0);
  }

  private native void ImportLegacyFormat_61(vtkIdTypeArray id0);
  public void ImportLegacyFormat(vtkIdTypeArray id0)
  {
    ImportLegacyFormat_61(id0);
  }

  private native void AppendLegacyFormat_62(vtkIdTypeArray id0,long id1);
  public void AppendLegacyFormat(vtkIdTypeArray id0,long id1)
  {
    AppendLegacyFormat_62(id0,id1);
  }

  private native long GetActualMemorySize_63();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_63();
  }

  private native void SetNumberOfCells_64(long id0);
  public void SetNumberOfCells(long id0)
  {
    SetNumberOfCells_64(id0);
  }

  private native long EstimateSize_65(long id0,int id1);
  public long EstimateSize(long id0,int id1)
  {
    return EstimateSize_65(id0,id1);
  }

  private native long GetSize_66();
  public long GetSize()
  {
    return GetSize_66();
  }

  private native long GetNumberOfConnectivityEntries_67();
  public long GetNumberOfConnectivityEntries()
  {
    return GetNumberOfConnectivityEntries_67();
  }

  private native void GetCell_68(long id0,vtkIdList id1);
  public void GetCell(long id0,vtkIdList id1)
  {
    GetCell_68(id0,id1);
  }

  private native long GetInsertLocation_69(int id0);
  public long GetInsertLocation(int id0)
  {
    return GetInsertLocation_69(id0);
  }

  private native long GetTraversalLocation_70();
  public long GetTraversalLocation()
  {
    return GetTraversalLocation_70();
  }

  private native long GetTraversalLocation_71(long id0);
  public long GetTraversalLocation(long id0)
  {
    return GetTraversalLocation_71(id0);
  }

  private native void SetTraversalLocation_72(long id0);
  public void SetTraversalLocation(long id0)
  {
    SetTraversalLocation_72(id0);
  }

  private native void ReverseCell_73(long id0);
  public void ReverseCell(long id0)
  {
    ReverseCell_73(id0);
  }

  private native void SetCells_74(long id0,vtkIdTypeArray id1);
  public void SetCells(long id0,vtkIdTypeArray id1)
  {
    SetCells_74(id0,id1);
  }

  private native long GetData_75();
  public vtkIdTypeArray GetData()
  {
    long temp = GetData_75();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkCellArray() { super(); }

  public vtkCellArray(long id) { super(id); }
  public native long   VTKInit();

}
