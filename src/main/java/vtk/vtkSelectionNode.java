// java wrapper for vtkSelectionNode object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSelectionNode extends vtkObject
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

  private native void SetSelectionList_5(vtkAbstractArray id0);
  public void SetSelectionList(vtkAbstractArray id0)
  {
    SetSelectionList_5(id0);
  }

  private native long GetSelectionList_6();
  public vtkAbstractArray GetSelectionList()
  {
    long temp = GetSelectionList_6();

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectionData_7(vtkDataSetAttributes id0);
  public void SetSelectionData(vtkDataSetAttributes id0)
  {
    SetSelectionData_7(id0);
  }

  private native long GetSelectionData_8();
  public vtkDataSetAttributes GetSelectionData()
  {
    long temp = GetSelectionData_8();

    if (temp == 0) return null;
    return (vtkDataSetAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetProperties_9();
  public vtkInformation GetProperties()
  {
    long temp = GetProperties_9();

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void DeepCopy_10(vtkSelectionNode id0);
  public void DeepCopy(vtkSelectionNode id0)
  {
    DeepCopy_10(id0);
  }

  private native void ShallowCopy_11(vtkSelectionNode id0);
  public void ShallowCopy(vtkSelectionNode id0)
  {
    ShallowCopy_11(id0);
  }

  private native long GetMTime_12();
  public long GetMTime()
  {
    return GetMTime_12();
  }

  private native long CONTENT_TYPE_13();
  public vtkInformationIntegerKey CONTENT_TYPE()
  {
    long temp = CONTENT_TYPE_13();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetContentType_14(int id0);
  public void SetContentType(int id0)
  {
    SetContentType_14(id0);
  }

  private native int GetContentType_15();
  public int GetContentType()
  {
    return GetContentType_15();
  }

  private native byte[] GetContentTypeAsString_16(int id0);
  public String GetContentTypeAsString(int id0)
  {
    return new String(GetContentTypeAsString_16(id0), StandardCharsets.UTF_8);
  }

  private native long FIELD_TYPE_17();
  public vtkInformationIntegerKey FIELD_TYPE()
  {
    long temp = FIELD_TYPE_17();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFieldType_18(int id0);
  public void SetFieldType(int id0)
  {
    SetFieldType_18(id0);
  }

  private native int GetFieldType_19();
  public int GetFieldType()
  {
    return GetFieldType_19();
  }

  private native byte[] GetFieldTypeAsString_20(int id0);
  public String GetFieldTypeAsString(int id0)
  {
    return new String(GetFieldTypeAsString_20(id0), StandardCharsets.UTF_8);
  }

  private native int GetFieldTypeFromString_21(byte[] id0, int len0);
  public int GetFieldTypeFromString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetFieldTypeFromString_21(bytes0, bytes0.length);
  }

  private native int ConvertSelectionFieldToAttributeType_22(int id0);
  public int ConvertSelectionFieldToAttributeType(int id0)
  {
    return ConvertSelectionFieldToAttributeType_22(id0);
  }

  private native int ConvertAttributeTypeToSelectionField_23(int id0);
  public int ConvertAttributeTypeToSelectionField(int id0)
  {
    return ConvertAttributeTypeToSelectionField_23(id0);
  }

  private native void SetQueryString_24(byte[] id0, int len0);
  public void SetQueryString(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetQueryString_24(bytes0, bytes0.length);
  }

  private native byte[] GetQueryString_25();
  public String GetQueryString()
  {
    return new String(GetQueryString_25(), StandardCharsets.UTF_8);
  }

  private native long EPSILON_26();
  public vtkInformationDoubleKey EPSILON()
  {
    long temp = EPSILON_26();

    if (temp == 0) return null;
    return (vtkInformationDoubleKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ZBUFFER_VALUE_27();
  public vtkInformationDoubleKey ZBUFFER_VALUE()
  {
    long temp = ZBUFFER_VALUE_27();

    if (temp == 0) return null;
    return (vtkInformationDoubleKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CONTAINING_CELLS_28();
  public vtkInformationIntegerKey CONTAINING_CELLS()
  {
    long temp = CONTAINING_CELLS_28();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CONNECTED_LAYERS_29();
  public vtkInformationIntegerKey CONNECTED_LAYERS()
  {
    long temp = CONNECTED_LAYERS_29();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CONNECTED_LAYERS_REMOVE_SEED_30();
  public vtkInformationIntegerKey CONNECTED_LAYERS_REMOVE_SEED()
  {
    long temp = CONNECTED_LAYERS_REMOVE_SEED_30();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CONNECTED_LAYERS_REMOVE_INTERMEDIATE_LAYERS_31();
  public vtkInformationIntegerKey CONNECTED_LAYERS_REMOVE_INTERMEDIATE_LAYERS()
  {
    long temp = CONNECTED_LAYERS_REMOVE_INTERMEDIATE_LAYERS_31();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long COMPONENT_NUMBER_32();
  public vtkInformationIntegerKey COMPONENT_NUMBER()
  {
    long temp = COMPONENT_NUMBER_32();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long INVERSE_33();
  public vtkInformationIntegerKey INVERSE()
  {
    long temp = INVERSE_33();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long PIXEL_COUNT_34();
  public vtkInformationIntegerKey PIXEL_COUNT()
  {
    long temp = PIXEL_COUNT_34();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SOURCE_35();
  public vtkInformationObjectBaseKey SOURCE()
  {
    long temp = SOURCE_35();

    if (temp == 0) return null;
    return (vtkInformationObjectBaseKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SOURCE_ID_36();
  public vtkInformationIntegerKey SOURCE_ID()
  {
    long temp = SOURCE_ID_36();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long PROP_37();
  public vtkInformationObjectBaseKey PROP()
  {
    long temp = PROP_37();

    if (temp == 0) return null;
    return (vtkInformationObjectBaseKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long PROP_ID_38();
  public vtkInformationIntegerKey PROP_ID()
  {
    long temp = PROP_ID_38();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long PROCESS_ID_39();
  public vtkInformationIntegerKey PROCESS_ID()
  {
    long temp = PROCESS_ID_39();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ASSEMBLY_NAME_40();
  public vtkInformationStringKey ASSEMBLY_NAME()
  {
    long temp = ASSEMBLY_NAME_40();

    if (temp == 0) return null;
    return (vtkInformationStringKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SELECTORS_41();
  public vtkInformationStringVectorKey SELECTORS()
  {
    long temp = SELECTORS_41();

    if (temp == 0) return null;
    return (vtkInformationStringVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long COMPOSITE_INDEX_42();
  public vtkInformationIntegerKey COMPOSITE_INDEX()
  {
    long temp = COMPOSITE_INDEX_42();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long HIERARCHICAL_LEVEL_43();
  public vtkInformationIntegerKey HIERARCHICAL_LEVEL()
  {
    long temp = HIERARCHICAL_LEVEL_43();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long HIERARCHICAL_INDEX_44();
  public vtkInformationIntegerKey HIERARCHICAL_INDEX()
  {
    long temp = HIERARCHICAL_INDEX_44();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CELLGRID_CELL_TYPE_INDEX_45();
  public vtkInformationIntegerKey CELLGRID_CELL_TYPE_INDEX()
  {
    long temp = CELLGRID_CELL_TYPE_INDEX_45();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CELLGRID_SOURCE_SPECIFICATION_INDEX_46();
  public vtkInformationIntegerKey CELLGRID_SOURCE_SPECIFICATION_INDEX()
  {
    long temp = CELLGRID_SOURCE_SPECIFICATION_INDEX_46();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void UnionSelectionList_47(vtkSelectionNode id0);
  public void UnionSelectionList(vtkSelectionNode id0)
  {
    UnionSelectionList_47(id0);
  }

  private native void SubtractSelectionList_48(vtkSelectionNode id0);
  public void SubtractSelectionList(vtkSelectionNode id0)
  {
    SubtractSelectionList_48(id0);
  }

  private native boolean EqualProperties_49(vtkSelectionNode id0,boolean id1);
  public boolean EqualProperties(vtkSelectionNode id0,boolean id1)
  {
    return EqualProperties_49(id0,id1);
  }

  public vtkSelectionNode() { super(); }

  public vtkSelectionNode(long id) { super(id); }
  public native long   VTKInit();

}
