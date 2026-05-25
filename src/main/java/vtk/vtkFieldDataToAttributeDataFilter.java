// java wrapper for vtkFieldDataToAttributeDataFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFieldDataToAttributeDataFilter extends vtkDataSetAlgorithm
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

  private native void SetInputField_4(int id0);
  public void SetInputField(int id0)
  {
    SetInputField_4(id0);
  }

  private native int GetInputField_5();
  public int GetInputField()
  {
    return GetInputField_5();
  }

  private native void SetInputFieldToDataObjectField_6();
  public void SetInputFieldToDataObjectField()
  {
    SetInputFieldToDataObjectField_6();
  }

  private native void SetInputFieldToPointDataField_7();
  public void SetInputFieldToPointDataField()
  {
    SetInputFieldToPointDataField_7();
  }

  private native void SetInputFieldToCellDataField_8();
  public void SetInputFieldToCellDataField()
  {
    SetInputFieldToCellDataField_8();
  }

  private native void SetOutputAttributeData_9(int id0);
  public void SetOutputAttributeData(int id0)
  {
    SetOutputAttributeData_9(id0);
  }

  private native int GetOutputAttributeData_10();
  public int GetOutputAttributeData()
  {
    return GetOutputAttributeData_10();
  }

  private native void SetOutputAttributeDataToCellData_11();
  public void SetOutputAttributeDataToCellData()
  {
    SetOutputAttributeDataToCellData_11();
  }

  private native void SetOutputAttributeDataToPointData_12();
  public void SetOutputAttributeDataToPointData()
  {
    SetOutputAttributeDataToPointData_12();
  }

  private native void SetScalarComponent_13(int id0,byte[] id1, int len1,int id2,int id3,int id4,int id5);
  public void SetScalarComponent(int id0,String id1,int id2,int id3,int id4,int id5)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetScalarComponent_13(id0,bytes1, bytes1.length,id2,id3,id4,id5);
  }

  private native void SetScalarComponent_14(int id0,byte[] id1, int len1,int id2);
  public void SetScalarComponent(int id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetScalarComponent_14(id0,bytes1, bytes1.length,id2);
  }

  private native byte[] GetScalarComponentArrayName_15(int id0);
  public String GetScalarComponentArrayName(int id0)
  {
    return new String(GetScalarComponentArrayName_15(id0), StandardCharsets.UTF_8);
  }

  private native int GetScalarComponentArrayComponent_16(int id0);
  public int GetScalarComponentArrayComponent(int id0)
  {
    return GetScalarComponentArrayComponent_16(id0);
  }

  private native int GetScalarComponentMinRange_17(int id0);
  public int GetScalarComponentMinRange(int id0)
  {
    return GetScalarComponentMinRange_17(id0);
  }

  private native int GetScalarComponentMaxRange_18(int id0);
  public int GetScalarComponentMaxRange(int id0)
  {
    return GetScalarComponentMaxRange_18(id0);
  }

  private native int GetScalarComponentNormalizeFlag_19(int id0);
  public int GetScalarComponentNormalizeFlag(int id0)
  {
    return GetScalarComponentNormalizeFlag_19(id0);
  }

  private native void SetVectorComponent_20(int id0,byte[] id1, int len1,int id2,int id3,int id4,int id5);
  public void SetVectorComponent(int id0,String id1,int id2,int id3,int id4,int id5)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetVectorComponent_20(id0,bytes1, bytes1.length,id2,id3,id4,id5);
  }

  private native void SetVectorComponent_21(int id0,byte[] id1, int len1,int id2);
  public void SetVectorComponent(int id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetVectorComponent_21(id0,bytes1, bytes1.length,id2);
  }

  private native byte[] GetVectorComponentArrayName_22(int id0);
  public String GetVectorComponentArrayName(int id0)
  {
    return new String(GetVectorComponentArrayName_22(id0), StandardCharsets.UTF_8);
  }

  private native int GetVectorComponentArrayComponent_23(int id0);
  public int GetVectorComponentArrayComponent(int id0)
  {
    return GetVectorComponentArrayComponent_23(id0);
  }

  private native int GetVectorComponentMinRange_24(int id0);
  public int GetVectorComponentMinRange(int id0)
  {
    return GetVectorComponentMinRange_24(id0);
  }

  private native int GetVectorComponentMaxRange_25(int id0);
  public int GetVectorComponentMaxRange(int id0)
  {
    return GetVectorComponentMaxRange_25(id0);
  }

  private native int GetVectorComponentNormalizeFlag_26(int id0);
  public int GetVectorComponentNormalizeFlag(int id0)
  {
    return GetVectorComponentNormalizeFlag_26(id0);
  }

  private native void SetNormalComponent_27(int id0,byte[] id1, int len1,int id2,int id3,int id4,int id5);
  public void SetNormalComponent(int id0,String id1,int id2,int id3,int id4,int id5)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetNormalComponent_27(id0,bytes1, bytes1.length,id2,id3,id4,id5);
  }

  private native void SetNormalComponent_28(int id0,byte[] id1, int len1,int id2);
  public void SetNormalComponent(int id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetNormalComponent_28(id0,bytes1, bytes1.length,id2);
  }

  private native byte[] GetNormalComponentArrayName_29(int id0);
  public String GetNormalComponentArrayName(int id0)
  {
    return new String(GetNormalComponentArrayName_29(id0), StandardCharsets.UTF_8);
  }

  private native int GetNormalComponentArrayComponent_30(int id0);
  public int GetNormalComponentArrayComponent(int id0)
  {
    return GetNormalComponentArrayComponent_30(id0);
  }

  private native int GetNormalComponentMinRange_31(int id0);
  public int GetNormalComponentMinRange(int id0)
  {
    return GetNormalComponentMinRange_31(id0);
  }

  private native int GetNormalComponentMaxRange_32(int id0);
  public int GetNormalComponentMaxRange(int id0)
  {
    return GetNormalComponentMaxRange_32(id0);
  }

  private native int GetNormalComponentNormalizeFlag_33(int id0);
  public int GetNormalComponentNormalizeFlag(int id0)
  {
    return GetNormalComponentNormalizeFlag_33(id0);
  }

  private native void SetTensorComponent_34(int id0,byte[] id1, int len1,int id2,int id3,int id4,int id5);
  public void SetTensorComponent(int id0,String id1,int id2,int id3,int id4,int id5)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetTensorComponent_34(id0,bytes1, bytes1.length,id2,id3,id4,id5);
  }

  private native void SetTensorComponent_35(int id0,byte[] id1, int len1,int id2);
  public void SetTensorComponent(int id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetTensorComponent_35(id0,bytes1, bytes1.length,id2);
  }

  private native byte[] GetTensorComponentArrayName_36(int id0);
  public String GetTensorComponentArrayName(int id0)
  {
    return new String(GetTensorComponentArrayName_36(id0), StandardCharsets.UTF_8);
  }

  private native int GetTensorComponentArrayComponent_37(int id0);
  public int GetTensorComponentArrayComponent(int id0)
  {
    return GetTensorComponentArrayComponent_37(id0);
  }

  private native int GetTensorComponentMinRange_38(int id0);
  public int GetTensorComponentMinRange(int id0)
  {
    return GetTensorComponentMinRange_38(id0);
  }

  private native int GetTensorComponentMaxRange_39(int id0);
  public int GetTensorComponentMaxRange(int id0)
  {
    return GetTensorComponentMaxRange_39(id0);
  }

  private native int GetTensorComponentNormalizeFlag_40(int id0);
  public int GetTensorComponentNormalizeFlag(int id0)
  {
    return GetTensorComponentNormalizeFlag_40(id0);
  }

  private native void SetTCoordComponent_41(int id0,byte[] id1, int len1,int id2,int id3,int id4,int id5);
  public void SetTCoordComponent(int id0,String id1,int id2,int id3,int id4,int id5)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetTCoordComponent_41(id0,bytes1, bytes1.length,id2,id3,id4,id5);
  }

  private native void SetTCoordComponent_42(int id0,byte[] id1, int len1,int id2);
  public void SetTCoordComponent(int id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetTCoordComponent_42(id0,bytes1, bytes1.length,id2);
  }

  private native byte[] GetTCoordComponentArrayName_43(int id0);
  public String GetTCoordComponentArrayName(int id0)
  {
    return new String(GetTCoordComponentArrayName_43(id0), StandardCharsets.UTF_8);
  }

  private native int GetTCoordComponentArrayComponent_44(int id0);
  public int GetTCoordComponentArrayComponent(int id0)
  {
    return GetTCoordComponentArrayComponent_44(id0);
  }

  private native int GetTCoordComponentMinRange_45(int id0);
  public int GetTCoordComponentMinRange(int id0)
  {
    return GetTCoordComponentMinRange_45(id0);
  }

  private native int GetTCoordComponentMaxRange_46(int id0);
  public int GetTCoordComponentMaxRange(int id0)
  {
    return GetTCoordComponentMaxRange_46(id0);
  }

  private native int GetTCoordComponentNormalizeFlag_47(int id0);
  public int GetTCoordComponentNormalizeFlag(int id0)
  {
    return GetTCoordComponentNormalizeFlag_47(id0);
  }

  private native void SetDefaultNormalize_48(int id0);
  public void SetDefaultNormalize(int id0)
  {
    SetDefaultNormalize_48(id0);
  }

  private native int GetDefaultNormalize_49();
  public int GetDefaultNormalize()
  {
    return GetDefaultNormalize_49();
  }

  private native void DefaultNormalizeOn_50();
  public void DefaultNormalizeOn()
  {
    DefaultNormalizeOn_50();
  }

  private native void DefaultNormalizeOff_51();
  public void DefaultNormalizeOff()
  {
    DefaultNormalizeOff_51();
  }

  private native int ConstructArray_52(vtkDataArray id0,int id1,vtkDataArray id2,int id3,long id4,long id5,int id6);
  public int ConstructArray(vtkDataArray id0,int id1,vtkDataArray id2,int id3,long id4,long id5,int id6)
  {
    return ConstructArray_52(id0,id1,id2,id3,id4,id5,id6);
  }

  private native long GetFieldArray_53(vtkFieldData id0,byte[] id1, int len1,int id2);
  public vtkDataArray GetFieldArray(vtkFieldData id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    long temp = GetFieldArray_53(id0,bytes1, bytes1.length,id2);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int UpdateComponentRange_54(vtkDataArray id0,long id1[]);
  public int UpdateComponentRange(vtkDataArray id0,long id1[])
  {
    return UpdateComponentRange_54(id0,id1);
  }

  public vtkFieldDataToAttributeDataFilter() { super(); }

  public vtkFieldDataToAttributeDataFilter(long id) { super(id); }
  public native long   VTKInit();

}
