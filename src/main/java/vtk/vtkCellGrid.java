// java wrapper for vtkCellGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellGrid extends vtkDataObject
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

  private native void Initialize_4();
  public void Initialize()
  {
    Initialize_4();
  }

  private native int GetDataObjectType_5();
  public int GetDataObjectType()
  {
    return GetDataObjectType_5();
  }

  private native long GetActualMemorySize_6();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_6();
  }

  private native void ShallowCopy_7(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_7(id0);
  }

  private native void DeepCopy_8(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_8(id0);
  }

  private native boolean CopyStructure_9(vtkCellGrid id0,boolean id1);
  public boolean CopyStructure(vtkCellGrid id0,boolean id1)
  {
    return CopyStructure_9(id0,id1);
  }

  private native long GetAttributes_10(int id0);
  public vtkDataSetAttributes GetAttributes(int id0)
  {
    long temp = GetAttributes_10(id0);

    if (temp == 0) return null;
    return (vtkDataSetAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FindAttributes_11(int id0);
  public vtkDataSetAttributes FindAttributes(int id0)
  {
    long temp = FindAttributes_11(id0);

    if (temp == 0) return null;
    return (vtkDataSetAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGhostArray_12(int id0);
  public vtkUnsignedCharArray GetGhostArray(int id0)
  {
    long temp = GetGhostArray_12(id0);

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean SupportsGhostArray_13(int id0);
  public boolean SupportsGhostArray(int id0)
  {
    return SupportsGhostArray_13(id0);
  }

  private native int GetAttributeTypeForArray_14(vtkAbstractArray id0);
  public int GetAttributeTypeForArray(vtkAbstractArray id0)
  {
    return GetAttributeTypeForArray_14(id0);
  }

  private native long GetNumberOfElements_15(int id0);
  public long GetNumberOfElements(int id0)
  {
    return GetNumberOfElements_15(id0);
  }

  private native long GetNumberOfCells_16();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_16();
  }

  private native void GetBounds_17(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_17(id0);
  }

  private native long AddCellMetadata_18(vtkCellMetadata id0);
  public vtkCellMetadata AddCellMetadata(vtkCellMetadata id0)
  {
    long temp = AddCellMetadata_18(id0);

    if (temp == 0) return null;
    return (vtkCellMetadata)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int AddAllCellMetadata_19();
  public int AddAllCellMetadata()
  {
    return AddAllCellMetadata_19();
  }

  private native boolean RemoveCellMetadata_20(vtkCellMetadata id0);
  public boolean RemoveCellMetadata(vtkCellMetadata id0)
  {
    return RemoveCellMetadata_20(id0);
  }

  private native int RemoveUnusedCellMetadata_21();
  public int RemoveUnusedCellMetadata()
  {
    return RemoveUnusedCellMetadata_21();
  }

  private native boolean AddCellAttribute_22(vtkCellAttribute id0);
  public boolean AddCellAttribute(vtkCellAttribute id0)
  {
    return AddCellAttribute_22(id0);
  }

  private native boolean RemoveCellAttribute_23(vtkCellAttribute id0);
  public boolean RemoveCellAttribute(vtkCellAttribute id0)
  {
    return RemoveCellAttribute_23(id0);
  }

  private native boolean GetCellAttributeRange_24(vtkCellAttribute id0,int id1,double id2[],boolean id3);
  public boolean GetCellAttributeRange(vtkCellAttribute id0,int id1,double id2[],boolean id3)
  {
    return GetCellAttributeRange_24(id0,id1,id2,id3);
  }

  private native void ClearRangeCache_25(byte[] id0, int len0);
  public void ClearRangeCache(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    ClearRangeCache_25(bytes0, bytes0.length);
  }

  private native long GetCellAttributeById_26(int id0);
  public vtkCellAttribute GetCellAttributeById(int id0)
  {
    long temp = GetCellAttributeById_26(id0);

    if (temp == 0) return null;
    return (vtkCellAttribute)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellAttributeByName_27(byte[] id0, int len0);
  public vtkCellAttribute GetCellAttributeByName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetCellAttributeByName_27(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkCellAttribute)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetShapeAttribute_28();
  public vtkCellAttribute GetShapeAttribute()
  {
    long temp = GetShapeAttribute_28();

    if (temp == 0) return null;
    return (vtkCellAttribute)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean SetShapeAttribute_29(vtkCellAttribute id0);
  public boolean SetShapeAttribute(vtkCellAttribute id0)
  {
    return SetShapeAttribute_29(id0);
  }

  private native boolean Query_30(vtkCellGridQuery id0);
  public boolean Query(vtkCellGridQuery id0)
  {
    return Query_30(id0);
  }

  private native int GetSchemaVersion_31();
  public int GetSchemaVersion()
  {
    return GetSchemaVersion_31();
  }

  private native void SetContentVersion_32(int id0);
  public void SetContentVersion(int id0)
  {
    SetContentVersion_32(id0);
  }

  private native int GetContentVersion_33();
  public int GetContentVersion()
  {
    return GetContentVersion_33();
  }

  private native long GetData_34(vtkInformation id0);
  public vtkCellGrid GetData(vtkInformation id0)
  {
    long temp = GetData_34(id0);

    if (temp == 0) return null;
    return (vtkCellGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_35(vtkInformationVector id0,int id1);
  public vtkCellGrid GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_35(id0,id1);

    if (temp == 0) return null;
    return (vtkCellGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CorrespondingArray_36(vtkCellGrid id0,vtkDataArray id1,vtkCellGrid id2);
  public vtkDataArray CorrespondingArray(vtkCellGrid id0,vtkDataArray id1,vtkCellGrid id2)
  {
    long temp = CorrespondingArray_36(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ARRAY_GROUP_IDS_37();
  public vtkInformationIntegerVectorKey ARRAY_GROUP_IDS()
  {
    long temp = ARRAY_GROUP_IDS_37();

    if (temp == 0) return null;
    return (vtkInformationIntegerVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkCellGrid() { super(); }

  public vtkCellGrid(long id) { super(id); }
  public native long   VTKInit();

}
