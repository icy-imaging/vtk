// java wrapper for vtkDataArray object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataArray extends vtkAbstractArray
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

  private native long FastDownCast_4(vtkAbstractArray id0);
  public vtkDataArray FastDownCast(vtkAbstractArray id0)
  {
    long temp = FastDownCast_4(id0);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int IsNumeric_5();
  public int IsNumeric()
  {
    return IsNumeric_5();
  }

  private native int GetElementComponentSize_6();
  public int GetElementComponentSize()
  {
    return GetElementComponentSize_6();
  }

  private native void InsertTuple_7(long id0,long id1,vtkAbstractArray id2);
  public void InsertTuple(long id0,long id1,vtkAbstractArray id2)
  {
    InsertTuple_7(id0,id1,id2);
  }

  private native long InsertNextTuple_8(long id0,vtkAbstractArray id1);
  public long InsertNextTuple(long id0,vtkAbstractArray id1)
  {
    return InsertNextTuple_8(id0,id1);
  }

  private native void InsertTuples_9(vtkIdList id0,vtkIdList id1,vtkAbstractArray id2);
  public void InsertTuples(vtkIdList id0,vtkIdList id1,vtkAbstractArray id2)
  {
    InsertTuples_9(id0,id1,id2);
  }

  private native void InsertTuples_10(long id0,long id1,long id2,vtkAbstractArray id3);
  public void InsertTuples(long id0,long id1,long id2,vtkAbstractArray id3)
  {
    InsertTuples_10(id0,id1,id2,id3);
  }

  private native void InsertTuplesStartingAt_11(long id0,vtkIdList id1,vtkAbstractArray id2);
  public void InsertTuplesStartingAt(long id0,vtkIdList id1,vtkAbstractArray id2)
  {
    InsertTuplesStartingAt_11(id0,id1,id2);
  }

  private native void SetTuple_12(long id0,long id1,vtkAbstractArray id2);
  public void SetTuple(long id0,long id1,vtkAbstractArray id2)
  {
    SetTuple_12(id0,id1,id2);
  }

  private native void GetTuples_13(vtkIdList id0,vtkAbstractArray id1);
  public void GetTuples(vtkIdList id0,vtkAbstractArray id1)
  {
    GetTuples_13(id0,id1);
  }

  private native void GetTuples_14(long id0,long id1,vtkAbstractArray id2);
  public void GetTuples(long id0,long id1,vtkAbstractArray id2)
  {
    GetTuples_14(id0,id1,id2);
  }

  private native void InterpolateTuple_15(long id0,long id1,vtkAbstractArray id2,long id3,vtkAbstractArray id4,double id5);
  public void InterpolateTuple(long id0,long id1,vtkAbstractArray id2,long id3,vtkAbstractArray id4,double id5)
  {
    InterpolateTuple_15(id0,id1,id2,id3,id4,id5);
  }

  private native double GetTuple1_16(long id0);
  public double GetTuple1(long id0)
  {
    return GetTuple1_16(id0);
  }

  private native double[] GetTuple2_17(long id0);
  public double[] GetTuple2(long id0)
  {
    return GetTuple2_17(id0);
  }

  private native double[] GetTuple3_18(long id0);
  public double[] GetTuple3(long id0)
  {
    return GetTuple3_18(id0);
  }

  private native double[] GetTuple4_19(long id0);
  public double[] GetTuple4(long id0)
  {
    return GetTuple4_19(id0);
  }

  private native double[] GetTuple6_20(long id0);
  public double[] GetTuple6(long id0)
  {
    return GetTuple6_20(id0);
  }

  private native double[] GetTuple9_21(long id0);
  public double[] GetTuple9(long id0)
  {
    return GetTuple9_21(id0);
  }

  private native void SetTuple1_22(long id0,double id1);
  public void SetTuple1(long id0,double id1)
  {
    SetTuple1_22(id0,id1);
  }

  private native void SetTuple2_23(long id0,double id1,double id2);
  public void SetTuple2(long id0,double id1,double id2)
  {
    SetTuple2_23(id0,id1,id2);
  }

  private native void SetTuple3_24(long id0,double id1,double id2,double id3);
  public void SetTuple3(long id0,double id1,double id2,double id3)
  {
    SetTuple3_24(id0,id1,id2,id3);
  }

  private native void SetTuple4_25(long id0,double id1,double id2,double id3,double id4);
  public void SetTuple4(long id0,double id1,double id2,double id3,double id4)
  {
    SetTuple4_25(id0,id1,id2,id3,id4);
  }

  private native void SetTuple6_26(long id0,double id1,double id2,double id3,double id4,double id5,double id6);
  public void SetTuple6(long id0,double id1,double id2,double id3,double id4,double id5,double id6)
  {
    SetTuple6_26(id0,id1,id2,id3,id4,id5,id6);
  }

  private native void SetTuple9_27(long id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8,double id9);
  public void SetTuple9(long id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8,double id9)
  {
    SetTuple9_27(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native void InsertTuple1_28(long id0,double id1);
  public void InsertTuple1(long id0,double id1)
  {
    InsertTuple1_28(id0,id1);
  }

  private native void InsertTuple2_29(long id0,double id1,double id2);
  public void InsertTuple2(long id0,double id1,double id2)
  {
    InsertTuple2_29(id0,id1,id2);
  }

  private native void InsertTuple3_30(long id0,double id1,double id2,double id3);
  public void InsertTuple3(long id0,double id1,double id2,double id3)
  {
    InsertTuple3_30(id0,id1,id2,id3);
  }

  private native void InsertTuple4_31(long id0,double id1,double id2,double id3,double id4);
  public void InsertTuple4(long id0,double id1,double id2,double id3,double id4)
  {
    InsertTuple4_31(id0,id1,id2,id3,id4);
  }

  private native void InsertTuple6_32(long id0,double id1,double id2,double id3,double id4,double id5,double id6);
  public void InsertTuple6(long id0,double id1,double id2,double id3,double id4,double id5,double id6)
  {
    InsertTuple6_32(id0,id1,id2,id3,id4,id5,id6);
  }

  private native void InsertTuple9_33(long id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8,double id9);
  public void InsertTuple9(long id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8,double id9)
  {
    InsertTuple9_33(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native void InsertNextTuple1_34(double id0);
  public void InsertNextTuple1(double id0)
  {
    InsertNextTuple1_34(id0);
  }

  private native void InsertNextTuple2_35(double id0,double id1);
  public void InsertNextTuple2(double id0,double id1)
  {
    InsertNextTuple2_35(id0,id1);
  }

  private native void InsertNextTuple3_36(double id0,double id1,double id2);
  public void InsertNextTuple3(double id0,double id1,double id2)
  {
    InsertNextTuple3_36(id0,id1,id2);
  }

  private native void InsertNextTuple4_37(double id0,double id1,double id2,double id3);
  public void InsertNextTuple4(double id0,double id1,double id2,double id3)
  {
    InsertNextTuple4_37(id0,id1,id2,id3);
  }

  private native void InsertNextTuple6_38(double id0,double id1,double id2,double id3,double id4,double id5);
  public void InsertNextTuple6(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    InsertNextTuple6_38(id0,id1,id2,id3,id4,id5);
  }

  private native void InsertNextTuple9_39(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8);
  public void InsertNextTuple9(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8)
  {
    InsertNextTuple9_39(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native void RemoveTuple_40(long id0);
  public void RemoveTuple(long id0)
  {
    RemoveTuple_40(id0);
  }

  private native void RemoveFirstTuple_41();
  public void RemoveFirstTuple()
  {
    RemoveFirstTuple_41();
  }

  private native void RemoveLastTuple_42();
  public void RemoveLastTuple()
  {
    RemoveLastTuple_42();
  }

  private native double GetComponent_43(long id0,int id1);
  public double GetComponent(long id0,int id1)
  {
    return GetComponent_43(id0,id1);
  }

  private native void SetComponent_44(long id0,int id1,double id2);
  public void SetComponent(long id0,int id1,double id2)
  {
    SetComponent_44(id0,id1,id2);
  }

  private native void InsertComponent_45(long id0,int id1,double id2);
  public void InsertComponent(long id0,int id1,double id2)
  {
    InsertComponent_45(id0,id1,id2);
  }

  private native void GetData_46(long id0,long id1,int id2,int id3,vtkDoubleArray id4);
  public void GetData(long id0,long id1,int id2,int id3,vtkDoubleArray id4)
  {
    GetData_46(id0,id1,id2,id3,id4);
  }

  private native void DeepCopy_47(vtkAbstractArray id0);
  public void DeepCopy(vtkAbstractArray id0)
  {
    DeepCopy_47(id0);
  }

  private native void DeepCopy_48(vtkDataArray id0);
  public void DeepCopy(vtkDataArray id0)
  {
    DeepCopy_48(id0);
  }

  private native void ShallowCopy_49(vtkDataArray id0);
  public void ShallowCopy(vtkDataArray id0)
  {
    ShallowCopy_49(id0);
  }

  private native void FillComponent_50(int id0,double id1);
  public void FillComponent(int id0,double id1)
  {
    FillComponent_50(id0,id1);
  }

  private native void Fill_51(double id0);
  public void Fill(double id0)
  {
    Fill_51(id0);
  }

  private native void CopyComponent_52(int id0,vtkDataArray id1,int id2);
  public void CopyComponent(int id0,vtkDataArray id1,int id2)
  {
    CopyComponent_52(id0,id1,id2);
  }

  private native long GetActualMemorySize_53();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_53();
  }

  private native void CreateDefaultLookupTable_54();
  public void CreateDefaultLookupTable()
  {
    CreateDefaultLookupTable_54();
  }

  private native void SetLookupTable_55(vtkLookupTable id0);
  public void SetLookupTable(vtkLookupTable id0)
  {
    SetLookupTable_55(id0);
  }

  private native long GetLookupTable_56();
  public vtkLookupTable GetLookupTable()
  {
    long temp = GetLookupTable_56();

    if (temp == 0) return null;
    return (vtkLookupTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetRange_57(double id0[],int id1);
  public void GetRange(double id0[],int id1)
  {
    GetRange_57(id0,id1);
  }

  private native double[] GetRange_58(int id0);
  public double[] GetRange(int id0)
  {
    return GetRange_58(id0);
  }

  private native double[] GetRange_59();
  public double[] GetRange()
  {
    return GetRange_59();
  }

  private native void GetRange_60(double id0[]);
  public void GetRange(double id0[])
  {
    GetRange_60(id0);
  }

  private native void GetFiniteRange_61(double id0[],int id1);
  public void GetFiniteRange(double id0[],int id1)
  {
    GetFiniteRange_61(id0,id1);
  }

  private native double[] GetFiniteRange_62(int id0);
  public double[] GetFiniteRange(int id0)
  {
    return GetFiniteRange_62(id0);
  }

  private native double[] GetFiniteRange_63();
  public double[] GetFiniteRange()
  {
    return GetFiniteRange_63();
  }

  private native void GetFiniteRange_64(double id0[]);
  public void GetFiniteRange(double id0[])
  {
    GetFiniteRange_64(id0);
  }

  private native void GetDataTypeRange_65(double id0[]);
  public void GetDataTypeRange(double id0[])
  {
    GetDataTypeRange_65(id0);
  }

  private native double GetDataTypeMin_66();
  public double GetDataTypeMin()
  {
    return GetDataTypeMin_66();
  }

  private native double GetDataTypeMax_67();
  public double GetDataTypeMax()
  {
    return GetDataTypeMax_67();
  }

  private native void GetDataTypeRange_68(int id0,double id1[]);
  public void GetDataTypeRange(int id0,double id1[])
  {
    GetDataTypeRange_68(id0,id1);
  }

  private native double GetDataTypeMin_69(int id0);
  public double GetDataTypeMin(int id0)
  {
    return GetDataTypeMin_69(id0);
  }

  private native double GetDataTypeMax_70(int id0);
  public double GetDataTypeMax(int id0)
  {
    return GetDataTypeMax_70(id0);
  }

  private native double GetMaxNorm_71();
  public double GetMaxNorm()
  {
    return GetMaxNorm_71();
  }

  private native long CreateDataArray_72(int id0);
  public vtkDataArray CreateDataArray(int id0)
  {
    long temp = CreateDataArray_72(id0);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long COMPONENT_RANGE_73();
  public vtkInformationDoubleVectorKey COMPONENT_RANGE()
  {
    long temp = COMPONENT_RANGE_73();

    if (temp == 0) return null;
    return (vtkInformationDoubleVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long L2_NORM_RANGE_74();
  public vtkInformationDoubleVectorKey L2_NORM_RANGE()
  {
    long temp = L2_NORM_RANGE_74();

    if (temp == 0) return null;
    return (vtkInformationDoubleVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long L2_NORM_FINITE_RANGE_75();
  public vtkInformationDoubleVectorKey L2_NORM_FINITE_RANGE()
  {
    long temp = L2_NORM_FINITE_RANGE_75();

    if (temp == 0) return null;
    return (vtkInformationDoubleVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Modified_76();
  public void Modified()
  {
    Modified_76();
  }

  private native long UNITS_LABEL_77();
  public vtkInformationStringKey UNITS_LABEL()
  {
    long temp = UNITS_LABEL_77();

    if (temp == 0) return null;
    return (vtkInformationStringKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int CopyInformation_78(vtkInformation id0,int id1);
  public int CopyInformation(vtkInformation id0,int id1)
  {
    return CopyInformation_78(id0,id1);
  }

  private native int GetArrayType_79();
  public int GetArrayType()
  {
    return GetArrayType_79();
  }

  public vtkDataArray() { super(); }

  public vtkDataArray(long id) { super(id); }

}
