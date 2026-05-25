// java wrapper for vtkDataObject object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataObject extends vtkObject
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

  private native long GetInformation_4();
  public vtkInformation GetInformation()
  {
    long temp = GetInformation_4();

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInformation_5(vtkInformation id0);
  public void SetInformation(vtkInformation id0)
  {
    SetInformation_5(id0);
  }

  private native long GetMTime_6();
  public long GetMTime()
  {
    return GetMTime_6();
  }

  private native void Initialize_7();
  public void Initialize()
  {
    Initialize_7();
  }

  private native void ReleaseData_8();
  public void ReleaseData()
  {
    ReleaseData_8();
  }

  private native int GetDataReleased_9();
  public int GetDataReleased()
  {
    return GetDataReleased_9();
  }

  private native void SetGlobalReleaseDataFlag_10(int id0);
  public void SetGlobalReleaseDataFlag(int id0)
  {
    SetGlobalReleaseDataFlag_10(id0);
  }

  private native void GlobalReleaseDataFlagOn_11();
  public void GlobalReleaseDataFlagOn()
  {
    GlobalReleaseDataFlagOn_11();
  }

  private native void GlobalReleaseDataFlagOff_12();
  public void GlobalReleaseDataFlagOff()
  {
    GlobalReleaseDataFlagOff_12();
  }

  private native int GetGlobalReleaseDataFlag_13();
  public int GetGlobalReleaseDataFlag()
  {
    return GetGlobalReleaseDataFlag_13();
  }

  private native void SetFieldData_14(vtkFieldData id0);
  public void SetFieldData(vtkFieldData id0)
  {
    SetFieldData_14(id0);
  }

  private native long GetFieldData_15();
  public vtkFieldData GetFieldData()
  {
    long temp = GetFieldData_15();

    if (temp == 0) return null;
    return (vtkFieldData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetDataObjectType_16();
  public int GetDataObjectType()
  {
    return GetDataObjectType_16();
  }

  private native long GetUpdateTime_17();
  public long GetUpdateTime()
  {
    return GetUpdateTime_17();
  }

  private native long GetActualMemorySize_18();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_18();
  }

  private native void CopyInformationFromPipeline_19(vtkInformation id0);
  public void CopyInformationFromPipeline(vtkInformation id0)
  {
    CopyInformationFromPipeline_19(id0);
  }

  private native void CopyInformationToPipeline_20(vtkInformation id0);
  public void CopyInformationToPipeline(vtkInformation id0)
  {
    CopyInformationToPipeline_20(id0);
  }

  private native long GetActiveFieldInformation_21(vtkInformation id0,int id1,int id2);
  public vtkInformation GetActiveFieldInformation(vtkInformation id0,int id1,int id2)
  {
    long temp = GetActiveFieldInformation_21(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNamedFieldInformation_22(vtkInformation id0,int id1,byte[] id2, int len2);
  public vtkInformation GetNamedFieldInformation(vtkInformation id0,int id1,String id2)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    long temp = GetNamedFieldInformation_22(id0,id1,bytes2, bytes2.length);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RemoveNamedFieldInformation_23(vtkInformation id0,int id1,byte[] id2, int len2);
  public void RemoveNamedFieldInformation(vtkInformation id0,int id1,String id2)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    RemoveNamedFieldInformation_23(id0,id1,bytes2, bytes2.length);
  }

  private native long SetActiveAttribute_24(vtkInformation id0,int id1,byte[] id2, int len2,int id3);
  public vtkInformation SetActiveAttribute(vtkInformation id0,int id1,String id2,int id3)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    long temp = SetActiveAttribute_24(id0,id1,bytes2, bytes2.length,id3);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetActiveAttributeInfo_25(vtkInformation id0,int id1,int id2,byte[] id3, int len3,int id4,int id5,int id6);
  public void SetActiveAttributeInfo(vtkInformation id0,int id1,int id2,String id3,int id4,int id5,int id6)
  {
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    SetActiveAttributeInfo_25(id0,id1,id2,bytes3, bytes3.length,id4,id5,id6);
  }

  private native void SetPointDataActiveScalarInfo_26(vtkInformation id0,int id1,int id2);
  public void SetPointDataActiveScalarInfo(vtkInformation id0,int id1,int id2)
  {
    SetPointDataActiveScalarInfo_26(id0,id1,id2);
  }

  private native void DataHasBeenGenerated_27();
  public void DataHasBeenGenerated()
  {
    DataHasBeenGenerated_27();
  }

  private native void PrepareForNewData_28();
  public void PrepareForNewData()
  {
    PrepareForNewData_28();
  }

  private native void ShallowCopy_29(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_29(id0);
  }

  private native void DeepCopy_30(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_30(id0);
  }

  private native int GetExtentType_31();
  public int GetExtentType()
  {
    return GetExtentType_31();
  }

  private native long GetAttributes_32(int id0);
  public vtkDataSetAttributes GetAttributes(int id0)
  {
    long temp = GetAttributes_32(id0);

    if (temp == 0) return null;
    return (vtkDataSetAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGhostArray_33(int id0);
  public vtkUnsignedCharArray GetGhostArray(int id0)
  {
    long temp = GetGhostArray_33(id0);

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean SupportsGhostArray_34(int id0);
  public boolean SupportsGhostArray(int id0)
  {
    return SupportsGhostArray_34(id0);
  }

  private native long GetAttributesAsFieldData_35(int id0);
  public vtkFieldData GetAttributesAsFieldData(int id0)
  {
    long temp = GetAttributesAsFieldData_35(id0);

    if (temp == 0) return null;
    return (vtkFieldData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetAttributeTypeForArray_36(vtkAbstractArray id0);
  public int GetAttributeTypeForArray(vtkAbstractArray id0)
  {
    return GetAttributeTypeForArray_36(id0);
  }

  private native long GetNumberOfElements_37(int id0);
  public long GetNumberOfElements(int id0)
  {
    return GetNumberOfElements_37(id0);
  }

  private native byte[] GetAssociationTypeAsString_38(int id0);
  public String GetAssociationTypeAsString(int id0)
  {
    return new String(GetAssociationTypeAsString_38(id0), StandardCharsets.UTF_8);
  }

  private native int GetAssociationTypeFromString_39(byte[] id0, int len0);
  public int GetAssociationTypeFromString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetAssociationTypeFromString_39(bytes0, bytes0.length);
  }

  private native long DATA_TYPE_NAME_40();
  public vtkInformationStringKey DATA_TYPE_NAME()
  {
    long temp = DATA_TYPE_NAME_40();

    if (temp == 0) return null;
    return (vtkInformationStringKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DATA_OBJECT_41();
  public vtkInformationDataObjectKey DATA_OBJECT()
  {
    long temp = DATA_OBJECT_41();

    if (temp == 0) return null;
    return (vtkInformationDataObjectKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DATA_EXTENT_TYPE_42();
  public vtkInformationIntegerKey DATA_EXTENT_TYPE()
  {
    long temp = DATA_EXTENT_TYPE_42();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DATA_EXTENT_43();
  public vtkInformationIntegerPointerKey DATA_EXTENT()
  {
    long temp = DATA_EXTENT_43();

    if (temp == 0) return null;
    return (vtkInformationIntegerPointerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ALL_PIECES_EXTENT_44();
  public vtkInformationIntegerVectorKey ALL_PIECES_EXTENT()
  {
    long temp = ALL_PIECES_EXTENT_44();

    if (temp == 0) return null;
    return (vtkInformationIntegerVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DATA_PIECE_NUMBER_45();
  public vtkInformationIntegerKey DATA_PIECE_NUMBER()
  {
    long temp = DATA_PIECE_NUMBER_45();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DATA_NUMBER_OF_PIECES_46();
  public vtkInformationIntegerKey DATA_NUMBER_OF_PIECES()
  {
    long temp = DATA_NUMBER_OF_PIECES_46();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DATA_NUMBER_OF_GHOST_LEVELS_47();
  public vtkInformationIntegerKey DATA_NUMBER_OF_GHOST_LEVELS()
  {
    long temp = DATA_NUMBER_OF_GHOST_LEVELS_47();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DATA_TIME_STEP_48();
  public vtkInformationDoubleKey DATA_TIME_STEP()
  {
    long temp = DATA_TIME_STEP_48();

    if (temp == 0) return null;
    return (vtkInformationDoubleKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long POINT_DATA_VECTOR_49();
  public vtkInformationInformationVectorKey POINT_DATA_VECTOR()
  {
    long temp = POINT_DATA_VECTOR_49();

    if (temp == 0) return null;
    return (vtkInformationInformationVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CELL_DATA_VECTOR_50();
  public vtkInformationInformationVectorKey CELL_DATA_VECTOR()
  {
    long temp = CELL_DATA_VECTOR_50();

    if (temp == 0) return null;
    return (vtkInformationInformationVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long VERTEX_DATA_VECTOR_51();
  public vtkInformationInformationVectorKey VERTEX_DATA_VECTOR()
  {
    long temp = VERTEX_DATA_VECTOR_51();

    if (temp == 0) return null;
    return (vtkInformationInformationVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long EDGE_DATA_VECTOR_52();
  public vtkInformationInformationVectorKey EDGE_DATA_VECTOR()
  {
    long temp = EDGE_DATA_VECTOR_52();

    if (temp == 0) return null;
    return (vtkInformationInformationVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FIELD_ARRAY_TYPE_53();
  public vtkInformationIntegerKey FIELD_ARRAY_TYPE()
  {
    long temp = FIELD_ARRAY_TYPE_53();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FIELD_ASSOCIATION_54();
  public vtkInformationIntegerKey FIELD_ASSOCIATION()
  {
    long temp = FIELD_ASSOCIATION_54();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FIELD_ATTRIBUTE_TYPE_55();
  public vtkInformationIntegerKey FIELD_ATTRIBUTE_TYPE()
  {
    long temp = FIELD_ATTRIBUTE_TYPE_55();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FIELD_ACTIVE_ATTRIBUTE_56();
  public vtkInformationIntegerKey FIELD_ACTIVE_ATTRIBUTE()
  {
    long temp = FIELD_ACTIVE_ATTRIBUTE_56();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FIELD_NUMBER_OF_COMPONENTS_57();
  public vtkInformationIntegerKey FIELD_NUMBER_OF_COMPONENTS()
  {
    long temp = FIELD_NUMBER_OF_COMPONENTS_57();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FIELD_NUMBER_OF_TUPLES_58();
  public vtkInformationIntegerKey FIELD_NUMBER_OF_TUPLES()
  {
    long temp = FIELD_NUMBER_OF_TUPLES_58();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FIELD_OPERATION_59();
  public vtkInformationIntegerKey FIELD_OPERATION()
  {
    long temp = FIELD_OPERATION_59();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FIELD_RANGE_60();
  public vtkInformationDoubleVectorKey FIELD_RANGE()
  {
    long temp = FIELD_RANGE_60();

    if (temp == 0) return null;
    return (vtkInformationDoubleVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long PIECE_EXTENT_61();
  public vtkInformationIntegerVectorKey PIECE_EXTENT()
  {
    long temp = PIECE_EXTENT_61();

    if (temp == 0) return null;
    return (vtkInformationIntegerVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long FIELD_NAME_62();
  public vtkInformationStringKey FIELD_NAME()
  {
    long temp = FIELD_NAME_62();

    if (temp == 0) return null;
    return (vtkInformationStringKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ORIGIN_63();
  public vtkInformationDoubleVectorKey ORIGIN()
  {
    long temp = ORIGIN_63();

    if (temp == 0) return null;
    return (vtkInformationDoubleVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SPACING_64();
  public vtkInformationDoubleVectorKey SPACING()
  {
    long temp = SPACING_64();

    if (temp == 0) return null;
    return (vtkInformationDoubleVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DIRECTION_65();
  public vtkInformationDoubleVectorKey DIRECTION()
  {
    long temp = DIRECTION_65();

    if (temp == 0) return null;
    return (vtkInformationDoubleVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long BOUNDING_BOX_66();
  public vtkInformationDoubleVectorKey BOUNDING_BOX()
  {
    long temp = BOUNDING_BOX_66();

    if (temp == 0) return null;
    return (vtkInformationDoubleVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SIL_67();
  public vtkInformationDataObjectKey SIL()
  {
    long temp = SIL_67();

    if (temp == 0) return null;
    return (vtkInformationDataObjectKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_68(vtkInformation id0);
  public vtkDataObject GetData(vtkInformation id0)
  {
    long temp = GetData_68(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_69(vtkInformationVector id0,int id1);
  public vtkDataObject GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_69(id0,id1);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkDataObject() { super(); }

  public vtkDataObject(long id) { super(id); }
  public native long   VTKInit();

}
