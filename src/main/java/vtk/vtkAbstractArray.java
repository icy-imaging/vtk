// java wrapper for vtkAbstractArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractArray extends vtkObject
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

  private native void Initialize_5();
  public void Initialize()
  {
    Initialize_5();
  }

  private native int GetDataType_6();
  public int GetDataType()
  {
    return GetDataType_6();
  }

  private native int GetDataTypeSize_7();
  public int GetDataTypeSize()
  {
    return GetDataTypeSize_7();
  }

  private native int GetDataTypeSize_8(int id0);
  public int GetDataTypeSize(int id0)
  {
    return GetDataTypeSize_8(id0);
  }

  private native int GetElementComponentSize_9();
  public int GetElementComponentSize()
  {
    return GetElementComponentSize_9();
  }

  private native void SetNumberOfComponents_10(int id0);
  public void SetNumberOfComponents(int id0)
  {
    SetNumberOfComponents_10(id0);
  }

  private native int GetNumberOfComponentsMinValue_11();
  public int GetNumberOfComponentsMinValue()
  {
    return GetNumberOfComponentsMinValue_11();
  }

  private native int GetNumberOfComponentsMaxValue_12();
  public int GetNumberOfComponentsMaxValue()
  {
    return GetNumberOfComponentsMaxValue_12();
  }

  private native int GetNumberOfComponents_13();
  public int GetNumberOfComponents()
  {
    return GetNumberOfComponents_13();
  }

  private native void SetComponentName_14(long id0,byte[] id1, int len1);
  public void SetComponentName(long id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetComponentName_14(id0,bytes1, bytes1.length);
  }

  private native byte[] GetComponentName_15(long id0);
  public String GetComponentName(long id0)
  {
    return new String(GetComponentName_15(id0), StandardCharsets.UTF_8);
  }

  private native boolean HasAComponentName_16();
  public boolean HasAComponentName()
  {
    return HasAComponentName_16();
  }

  private native int CopyComponentNames_17(vtkAbstractArray id0);
  public int CopyComponentNames(vtkAbstractArray id0)
  {
    return CopyComponentNames_17(id0);
  }

  private native void SetNumberOfTuples_18(long id0);
  public void SetNumberOfTuples(long id0)
  {
    SetNumberOfTuples_18(id0);
  }

  private native boolean SetNumberOfValues_19(long id0);
  public boolean SetNumberOfValues(long id0)
  {
    return SetNumberOfValues_19(id0);
  }

  private native long GetNumberOfTuples_20();
  public long GetNumberOfTuples()
  {
    return GetNumberOfTuples_20();
  }

  private native long GetNumberOfValues_21();
  public long GetNumberOfValues()
  {
    return GetNumberOfValues_21();
  }

  private native void SetTuple_22(long id0,long id1,vtkAbstractArray id2);
  public void SetTuple(long id0,long id1,vtkAbstractArray id2)
  {
    SetTuple_22(id0,id1,id2);
  }

  private native void InsertTuple_23(long id0,long id1,vtkAbstractArray id2);
  public void InsertTuple(long id0,long id1,vtkAbstractArray id2)
  {
    InsertTuple_23(id0,id1,id2);
  }

  private native void InsertTuples_24(vtkIdList id0,vtkIdList id1,vtkAbstractArray id2);
  public void InsertTuples(vtkIdList id0,vtkIdList id1,vtkAbstractArray id2)
  {
    InsertTuples_24(id0,id1,id2);
  }

  private native void InsertTuplesStartingAt_25(long id0,vtkIdList id1,vtkAbstractArray id2);
  public void InsertTuplesStartingAt(long id0,vtkIdList id1,vtkAbstractArray id2)
  {
    InsertTuplesStartingAt_25(id0,id1,id2);
  }

  private native void InsertTuples_26(long id0,long id1,long id2,vtkAbstractArray id3);
  public void InsertTuples(long id0,long id1,long id2,vtkAbstractArray id3)
  {
    InsertTuples_26(id0,id1,id2,id3);
  }

  private native long InsertNextTuple_27(long id0,vtkAbstractArray id1);
  public long InsertNextTuple(long id0,vtkAbstractArray id1)
  {
    return InsertNextTuple_27(id0,id1);
  }

  private native void GetTuples_28(vtkIdList id0,vtkAbstractArray id1);
  public void GetTuples(vtkIdList id0,vtkAbstractArray id1)
  {
    GetTuples_28(id0,id1);
  }

  private native void GetTuples_29(long id0,long id1,vtkAbstractArray id2);
  public void GetTuples(long id0,long id1,vtkAbstractArray id2)
  {
    GetTuples_29(id0,id1,id2);
  }

  private native boolean HasStandardMemoryLayout_30();
  public boolean HasStandardMemoryLayout()
  {
    return HasStandardMemoryLayout_30();
  }

  private native void DeepCopy_31(vtkAbstractArray id0);
  public void DeepCopy(vtkAbstractArray id0)
  {
    DeepCopy_31(id0);
  }

  private native void InterpolateTuple_32(long id0,long id1,vtkAbstractArray id2,long id3,vtkAbstractArray id4,double id5);
  public void InterpolateTuple(long id0,long id1,vtkAbstractArray id2,long id3,vtkAbstractArray id4,double id5)
  {
    InterpolateTuple_32(id0,id1,id2,id3,id4,id5);
  }

  private native void Squeeze_33();
  public void Squeeze()
  {
    Squeeze_33();
  }

  private native int Resize_34(long id0);
  public int Resize(long id0)
  {
    return Resize_34(id0);
  }

  private native void Reset_35();
  public void Reset()
  {
    Reset_35();
  }

  private native long GetSize_36();
  public long GetSize()
  {
    return GetSize_36();
  }

  private native long GetMaxId_37();
  public long GetMaxId()
  {
    return GetMaxId_37();
  }

  private native long GetActualMemorySize_38();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_38();
  }

  private native void SetName_39(byte[] id0, int len0);
  public void SetName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetName_39(bytes0, bytes0.length);
  }

  private native byte[] GetName_40();
  public String GetName()
  {
    return new String(GetName_40(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDataTypeAsString_41();
  public String GetDataTypeAsString()
  {
    return new String(GetDataTypeAsString_41(), StandardCharsets.UTF_8);
  }

  private native long CreateArray_42(int id0);
  public vtkAbstractArray CreateArray(int id0)
  {
    long temp = CreateArray_42(id0);

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int IsNumeric_43();
  public int IsNumeric()
  {
    return IsNumeric_43();
  }

  private native boolean IsIntegral_44();
  public boolean IsIntegral()
  {
    return IsIntegral_44();
  }

  private native long NewIterator_45();
  public vtkArrayIterator NewIterator()
  {
    long temp = NewIterator_45();

    if (temp == 0) return null;
    return (vtkArrayIterator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataSize_46();
  public long GetDataSize()
  {
    return GetDataSize_46();
  }

  private native void DataChanged_47();
  public void DataChanged()
  {
    DataChanged_47();
  }

  private native void ClearLookup_48();
  public void ClearLookup()
  {
    ClearLookup_48();
  }

  private native void GetProminentComponentValues_49(int id0,vtkVariantArray id1,double id2,double id3);
  public void GetProminentComponentValues(int id0,vtkVariantArray id1,double id2,double id3)
  {
    GetProminentComponentValues_49(id0,id1,id2,id3);
  }

  private native long GetInformation_50();
  public vtkInformation GetInformation()
  {
    long temp = GetInformation_50();

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean HasInformation_51();
  public boolean HasInformation()
  {
    return HasInformation_51();
  }

  private native int CopyInformation_52(vtkInformation id0,int id1);
  public int CopyInformation(vtkInformation id0,int id1)
  {
    return CopyInformation_52(id0,id1);
  }

  private native long GUI_HIDE_53();
  public vtkInformationIntegerKey GUI_HIDE()
  {
    long temp = GUI_HIDE_53();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long PER_COMPONENT_54();
  public vtkInformationInformationVectorKey PER_COMPONENT()
  {
    long temp = PER_COMPONENT_54();

    if (temp == 0) return null;
    return (vtkInformationInformationVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long PER_FINITE_COMPONENT_55();
  public vtkInformationInformationVectorKey PER_FINITE_COMPONENT()
  {
    long temp = PER_FINITE_COMPONENT_55();

    if (temp == 0) return null;
    return (vtkInformationInformationVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Modified_56();
  public void Modified()
  {
    Modified_56();
  }

  private native long DISCRETE_VALUES_57();
  public vtkInformationVariantVectorKey DISCRETE_VALUES()
  {
    long temp = DISCRETE_VALUES_57();

    if (temp == 0) return null;
    return (vtkInformationVariantVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DISCRETE_VALUE_SAMPLE_PARAMETERS_58();
  public vtkInformationDoubleVectorKey DISCRETE_VALUE_SAMPLE_PARAMETERS()
  {
    long temp = DISCRETE_VALUE_SAMPLE_PARAMETERS_58();

    if (temp == 0) return null;
    return (vtkInformationDoubleVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetMaxDiscreteValues_59();
  public int GetMaxDiscreteValues()
  {
    return GetMaxDiscreteValues_59();
  }

  private native void SetMaxDiscreteValues_60(int id0);
  public void SetMaxDiscreteValues(int id0)
  {
    SetMaxDiscreteValues_60(id0);
  }

  private native int GetArrayType_61();
  public int GetArrayType()
  {
    return GetArrayType_61();
  }

  private native byte[] GetArrayTypeAsString_62();
  public String GetArrayTypeAsString()
  {
    return new String(GetArrayTypeAsString_62(), StandardCharsets.UTF_8);
  }

  public vtkAbstractArray() { super(); }

  public vtkAbstractArray(long id) { super(id); }

}
