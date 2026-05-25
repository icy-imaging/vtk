// java wrapper for vtkInformation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInformation extends vtkObject
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

  private native void Modified_4();
  public void Modified()
  {
    Modified_4();
  }

  private native void Modified_5(vtkInformationKey id0);
  public void Modified(vtkInformationKey id0)
  {
    Modified_5(id0);
  }

  private native void Clear_6();
  public void Clear()
  {
    Clear_6();
  }

  private native int GetNumberOfKeys_7();
  public int GetNumberOfKeys()
  {
    return GetNumberOfKeys_7();
  }

  private native void Copy_8(vtkInformation id0,int id1);
  public void Copy(vtkInformation id0,int id1)
  {
    Copy_8(id0,id1);
  }

  private native void Append_9(vtkInformation id0,int id1);
  public void Append(vtkInformation id0,int id1)
  {
    Append_9(id0,id1);
  }

  private native void CopyEntry_10(vtkInformation id0,vtkInformationKey id1,int id2);
  public void CopyEntry(vtkInformation id0,vtkInformationKey id1,int id2)
  {
    CopyEntry_10(id0,id1,id2);
  }

  private native void CopyEntry_11(vtkInformation id0,vtkInformationDataObjectKey id1,int id2);
  public void CopyEntry(vtkInformation id0,vtkInformationDataObjectKey id1,int id2)
  {
    CopyEntry_11(id0,id1,id2);
  }

  private native void CopyEntry_12(vtkInformation id0,vtkInformationDoubleVectorKey id1,int id2);
  public void CopyEntry(vtkInformation id0,vtkInformationDoubleVectorKey id1,int id2)
  {
    CopyEntry_12(id0,id1,id2);
  }

  private native void CopyEntry_13(vtkInformation id0,vtkInformationVariantKey id1,int id2);
  public void CopyEntry(vtkInformation id0,vtkInformationVariantKey id1,int id2)
  {
    CopyEntry_13(id0,id1,id2);
  }

  private native void CopyEntry_14(vtkInformation id0,vtkInformationVariantVectorKey id1,int id2);
  public void CopyEntry(vtkInformation id0,vtkInformationVariantVectorKey id1,int id2)
  {
    CopyEntry_14(id0,id1,id2);
  }

  private native void CopyEntry_15(vtkInformation id0,vtkInformationInformationKey id1,int id2);
  public void CopyEntry(vtkInformation id0,vtkInformationInformationKey id1,int id2)
  {
    CopyEntry_15(id0,id1,id2);
  }

  private native void CopyEntry_16(vtkInformation id0,vtkInformationInformationVectorKey id1,int id2);
  public void CopyEntry(vtkInformation id0,vtkInformationInformationVectorKey id1,int id2)
  {
    CopyEntry_16(id0,id1,id2);
  }

  private native void CopyEntry_17(vtkInformation id0,vtkInformationIntegerKey id1,int id2);
  public void CopyEntry(vtkInformation id0,vtkInformationIntegerKey id1,int id2)
  {
    CopyEntry_17(id0,id1,id2);
  }

  private native void CopyEntry_18(vtkInformation id0,vtkInformationIntegerVectorKey id1,int id2);
  public void CopyEntry(vtkInformation id0,vtkInformationIntegerVectorKey id1,int id2)
  {
    CopyEntry_18(id0,id1,id2);
  }

  private native void CopyEntry_19(vtkInformation id0,vtkInformationObjectBaseVectorKey id1,int id2);
  public void CopyEntry(vtkInformation id0,vtkInformationObjectBaseVectorKey id1,int id2)
  {
    CopyEntry_19(id0,id1,id2);
  }

  private native void CopyEntry_20(vtkInformation id0,vtkInformationRequestKey id1,int id2);
  public void CopyEntry(vtkInformation id0,vtkInformationRequestKey id1,int id2)
  {
    CopyEntry_20(id0,id1,id2);
  }

  private native void CopyEntry_21(vtkInformation id0,vtkInformationStringKey id1,int id2);
  public void CopyEntry(vtkInformation id0,vtkInformationStringKey id1,int id2)
  {
    CopyEntry_21(id0,id1,id2);
  }

  private native void CopyEntry_22(vtkInformation id0,vtkInformationStringVectorKey id1,int id2);
  public void CopyEntry(vtkInformation id0,vtkInformationStringVectorKey id1,int id2)
  {
    CopyEntry_22(id0,id1,id2);
  }

  private native void CopyEntry_23(vtkInformation id0,vtkInformationUnsignedLongKey id1,int id2);
  public void CopyEntry(vtkInformation id0,vtkInformationUnsignedLongKey id1,int id2)
  {
    CopyEntry_23(id0,id1,id2);
  }

  private native void CopyEntries_24(vtkInformation id0,vtkInformationKeyVectorKey id1,int id2);
  public void CopyEntries(vtkInformation id0,vtkInformationKeyVectorKey id1,int id2)
  {
    CopyEntries_24(id0,id1,id2);
  }

  private native int Has_25(vtkInformationKey id0);
  public int Has(vtkInformationKey id0)
  {
    return Has_25(id0);
  }

  private native void Remove_26(vtkInformationKey id0);
  public void Remove(vtkInformationKey id0)
  {
    Remove_26(id0);
  }

  private native void Set_27(vtkInformationRequestKey id0);
  public void Set(vtkInformationRequestKey id0)
  {
    Set_27(id0);
  }

  private native void Remove_28(vtkInformationRequestKey id0);
  public void Remove(vtkInformationRequestKey id0)
  {
    Remove_28(id0);
  }

  private native int Has_29(vtkInformationRequestKey id0);
  public int Has(vtkInformationRequestKey id0)
  {
    return Has_29(id0);
  }

  private native void Set_30(vtkInformationIntegerKey id0,int id1);
  public void Set(vtkInformationIntegerKey id0,int id1)
  {
    Set_30(id0,id1);
  }

  private native int Get_31(vtkInformationIntegerKey id0);
  public int Get(vtkInformationIntegerKey id0)
  {
    return Get_31(id0);
  }

  private native void Remove_32(vtkInformationIntegerKey id0);
  public void Remove(vtkInformationIntegerKey id0)
  {
    Remove_32(id0);
  }

  private native int Has_33(vtkInformationIntegerKey id0);
  public int Has(vtkInformationIntegerKey id0)
  {
    return Has_33(id0);
  }

  private native void Set_34(vtkInformationIdTypeKey id0,long id1);
  public void Set(vtkInformationIdTypeKey id0,long id1)
  {
    Set_34(id0,id1);
  }

  private native long Get_35(vtkInformationIdTypeKey id0);
  public long Get(vtkInformationIdTypeKey id0)
  {
    return Get_35(id0);
  }

  private native void Remove_36(vtkInformationIdTypeKey id0);
  public void Remove(vtkInformationIdTypeKey id0)
  {
    Remove_36(id0);
  }

  private native int Has_37(vtkInformationIdTypeKey id0);
  public int Has(vtkInformationIdTypeKey id0)
  {
    return Has_37(id0);
  }

  private native void Set_38(vtkInformationDoubleKey id0,double id1);
  public void Set(vtkInformationDoubleKey id0,double id1)
  {
    Set_38(id0,id1);
  }

  private native double Get_39(vtkInformationDoubleKey id0);
  public double Get(vtkInformationDoubleKey id0)
  {
    return Get_39(id0);
  }

  private native void Remove_40(vtkInformationDoubleKey id0);
  public void Remove(vtkInformationDoubleKey id0)
  {
    Remove_40(id0);
  }

  private native int Has_41(vtkInformationDoubleKey id0);
  public int Has(vtkInformationDoubleKey id0)
  {
    return Has_41(id0);
  }

  private native void Remove_42(vtkInformationVariantKey id0);
  public void Remove(vtkInformationVariantKey id0)
  {
    Remove_42(id0);
  }

  private native int Has_43(vtkInformationVariantKey id0);
  public int Has(vtkInformationVariantKey id0)
  {
    return Has_43(id0);
  }

  private native void Append_44(vtkInformationIntegerVectorKey id0,int id1);
  public void Append(vtkInformationIntegerVectorKey id0,int id1)
  {
    Append_44(id0,id1);
  }

  private native void Set_45(vtkInformationIntegerVectorKey id0,int id1,int id2,int id3);
  public void Set(vtkInformationIntegerVectorKey id0,int id1,int id2,int id3)
  {
    Set_45(id0,id1,id2,id3);
  }

  private native void Set_46(vtkInformationIntegerVectorKey id0,int id1,int id2,int id3,int id4,int id5,int id6);
  public void Set(vtkInformationIntegerVectorKey id0,int id1,int id2,int id3,int id4,int id5,int id6)
  {
    Set_46(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int Get_47(vtkInformationIntegerVectorKey id0,int id1);
  public int Get(vtkInformationIntegerVectorKey id0,int id1)
  {
    return Get_47(id0,id1);
  }

  private native int Length_48(vtkInformationIntegerVectorKey id0);
  public int Length(vtkInformationIntegerVectorKey id0)
  {
    return Length_48(id0);
  }

  private native void Remove_49(vtkInformationIntegerVectorKey id0);
  public void Remove(vtkInformationIntegerVectorKey id0)
  {
    Remove_49(id0);
  }

  private native int Has_50(vtkInformationIntegerVectorKey id0);
  public int Has(vtkInformationIntegerVectorKey id0)
  {
    return Has_50(id0);
  }

  private native void Append_51(vtkInformationStringVectorKey id0,byte[] id1, int len1);
  public void Append(vtkInformationStringVectorKey id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    Append_51(id0,bytes1, bytes1.length);
  }

  private native void Set_52(vtkInformationStringVectorKey id0,byte[] id1, int len1,int id2);
  public void Set(vtkInformationStringVectorKey id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    Set_52(id0,bytes1, bytes1.length,id2);
  }

  private native byte[] Get_53(vtkInformationStringVectorKey id0,int id1);
  public String Get(vtkInformationStringVectorKey id0,int id1)
  {
    return new String(Get_53(id0,id1), StandardCharsets.UTF_8);
  }

  private native int Length_54(vtkInformationStringVectorKey id0);
  public int Length(vtkInformationStringVectorKey id0)
  {
    return Length_54(id0);
  }

  private native void Remove_55(vtkInformationStringVectorKey id0);
  public void Remove(vtkInformationStringVectorKey id0)
  {
    Remove_55(id0);
  }

  private native int Has_56(vtkInformationStringVectorKey id0);
  public int Has(vtkInformationStringVectorKey id0)
  {
    return Has_56(id0);
  }

  private native int Length_57(vtkInformationIntegerPointerKey id0);
  public int Length(vtkInformationIntegerPointerKey id0)
  {
    return Length_57(id0);
  }

  private native void Remove_58(vtkInformationIntegerPointerKey id0);
  public void Remove(vtkInformationIntegerPointerKey id0)
  {
    Remove_58(id0);
  }

  private native int Has_59(vtkInformationIntegerPointerKey id0);
  public int Has(vtkInformationIntegerPointerKey id0)
  {
    return Has_59(id0);
  }

  private native void Set_60(vtkInformationUnsignedLongKey id0,long id1);
  public void Set(vtkInformationUnsignedLongKey id0,long id1)
  {
    Set_60(id0,id1);
  }

  private native long Get_61(vtkInformationUnsignedLongKey id0);
  public long Get(vtkInformationUnsignedLongKey id0)
  {
    return Get_61(id0);
  }

  private native void Remove_62(vtkInformationUnsignedLongKey id0);
  public void Remove(vtkInformationUnsignedLongKey id0)
  {
    Remove_62(id0);
  }

  private native int Has_63(vtkInformationUnsignedLongKey id0);
  public int Has(vtkInformationUnsignedLongKey id0)
  {
    return Has_63(id0);
  }

  private native void Append_64(vtkInformationDoubleVectorKey id0,double id1);
  public void Append(vtkInformationDoubleVectorKey id0,double id1)
  {
    Append_64(id0,id1);
  }

  private native void Set_65(vtkInformationDoubleVectorKey id0,double id1,double id2,double id3);
  public void Set(vtkInformationDoubleVectorKey id0,double id1,double id2,double id3)
  {
    Set_65(id0,id1,id2,id3);
  }

  private native void Set_66(vtkInformationDoubleVectorKey id0,double id1,double id2,double id3,double id4,double id5,double id6);
  public void Set(vtkInformationDoubleVectorKey id0,double id1,double id2,double id3,double id4,double id5,double id6)
  {
    Set_66(id0,id1,id2,id3,id4,id5,id6);
  }

  private native double Get_67(vtkInformationDoubleVectorKey id0,int id1);
  public double Get(vtkInformationDoubleVectorKey id0,int id1)
  {
    return Get_67(id0,id1);
  }

  private native int Length_68(vtkInformationDoubleVectorKey id0);
  public int Length(vtkInformationDoubleVectorKey id0)
  {
    return Length_68(id0);
  }

  private native void Remove_69(vtkInformationDoubleVectorKey id0);
  public void Remove(vtkInformationDoubleVectorKey id0)
  {
    Remove_69(id0);
  }

  private native int Has_70(vtkInformationDoubleVectorKey id0);
  public int Has(vtkInformationDoubleVectorKey id0)
  {
    return Has_70(id0);
  }

  private native int Length_71(vtkInformationVariantVectorKey id0);
  public int Length(vtkInformationVariantVectorKey id0)
  {
    return Length_71(id0);
  }

  private native void Remove_72(vtkInformationVariantVectorKey id0);
  public void Remove(vtkInformationVariantVectorKey id0)
  {
    Remove_72(id0);
  }

  private native int Has_73(vtkInformationVariantVectorKey id0);
  public int Has(vtkInformationVariantVectorKey id0)
  {
    return Has_73(id0);
  }

  private native void Append_74(vtkInformationKeyVectorKey id0,vtkInformationKey id1);
  public void Append(vtkInformationKeyVectorKey id0,vtkInformationKey id1)
  {
    Append_74(id0,id1);
  }

  private native void AppendUnique_75(vtkInformationKeyVectorKey id0,vtkInformationKey id1);
  public void AppendUnique(vtkInformationKeyVectorKey id0,vtkInformationKey id1)
  {
    AppendUnique_75(id0,id1);
  }

  private native void Remove_76(vtkInformationKeyVectorKey id0,vtkInformationKey id1);
  public void Remove(vtkInformationKeyVectorKey id0,vtkInformationKey id1)
  {
    Remove_76(id0,id1);
  }

  private native long Get_77(vtkInformationKeyVectorKey id0,int id1);
  public vtkInformationKey Get(vtkInformationKeyVectorKey id0,int id1)
  {
    long temp = Get_77(id0,id1);

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int Length_78(vtkInformationKeyVectorKey id0);
  public int Length(vtkInformationKeyVectorKey id0)
  {
    return Length_78(id0);
  }

  private native void Remove_79(vtkInformationKeyVectorKey id0);
  public void Remove(vtkInformationKeyVectorKey id0)
  {
    Remove_79(id0);
  }

  private native int Has_80(vtkInformationKeyVectorKey id0);
  public int Has(vtkInformationKeyVectorKey id0)
  {
    return Has_80(id0);
  }

  private native void Append_81(vtkInformationKeyVectorKey id0,vtkInformationDataObjectKey id1);
  public void Append(vtkInformationKeyVectorKey id0,vtkInformationDataObjectKey id1)
  {
    Append_81(id0,id1);
  }

  private native void Append_82(vtkInformationKeyVectorKey id0,vtkInformationDoubleKey id1);
  public void Append(vtkInformationKeyVectorKey id0,vtkInformationDoubleKey id1)
  {
    Append_82(id0,id1);
  }

  private native void Append_83(vtkInformationKeyVectorKey id0,vtkInformationDoubleVectorKey id1);
  public void Append(vtkInformationKeyVectorKey id0,vtkInformationDoubleVectorKey id1)
  {
    Append_83(id0,id1);
  }

  private native void Append_84(vtkInformationKeyVectorKey id0,vtkInformationInformationKey id1);
  public void Append(vtkInformationKeyVectorKey id0,vtkInformationInformationKey id1)
  {
    Append_84(id0,id1);
  }

  private native void Append_85(vtkInformationKeyVectorKey id0,vtkInformationInformationVectorKey id1);
  public void Append(vtkInformationKeyVectorKey id0,vtkInformationInformationVectorKey id1)
  {
    Append_85(id0,id1);
  }

  private native void Append_86(vtkInformationKeyVectorKey id0,vtkInformationIntegerKey id1);
  public void Append(vtkInformationKeyVectorKey id0,vtkInformationIntegerKey id1)
  {
    Append_86(id0,id1);
  }

  private native void Append_87(vtkInformationKeyVectorKey id0,vtkInformationIntegerVectorKey id1);
  public void Append(vtkInformationKeyVectorKey id0,vtkInformationIntegerVectorKey id1)
  {
    Append_87(id0,id1);
  }

  private native void Append_88(vtkInformationKeyVectorKey id0,vtkInformationStringKey id1);
  public void Append(vtkInformationKeyVectorKey id0,vtkInformationStringKey id1)
  {
    Append_88(id0,id1);
  }

  private native void Append_89(vtkInformationKeyVectorKey id0,vtkInformationStringVectorKey id1);
  public void Append(vtkInformationKeyVectorKey id0,vtkInformationStringVectorKey id1)
  {
    Append_89(id0,id1);
  }

  private native void Append_90(vtkInformationKeyVectorKey id0,vtkInformationObjectBaseKey id1);
  public void Append(vtkInformationKeyVectorKey id0,vtkInformationObjectBaseKey id1)
  {
    Append_90(id0,id1);
  }

  private native void Append_91(vtkInformationKeyVectorKey id0,vtkInformationUnsignedLongKey id1);
  public void Append(vtkInformationKeyVectorKey id0,vtkInformationUnsignedLongKey id1)
  {
    Append_91(id0,id1);
  }

  private native void AppendUnique_92(vtkInformationKeyVectorKey id0,vtkInformationDataObjectKey id1);
  public void AppendUnique(vtkInformationKeyVectorKey id0,vtkInformationDataObjectKey id1)
  {
    AppendUnique_92(id0,id1);
  }

  private native void AppendUnique_93(vtkInformationKeyVectorKey id0,vtkInformationDoubleKey id1);
  public void AppendUnique(vtkInformationKeyVectorKey id0,vtkInformationDoubleKey id1)
  {
    AppendUnique_93(id0,id1);
  }

  private native void AppendUnique_94(vtkInformationKeyVectorKey id0,vtkInformationDoubleVectorKey id1);
  public void AppendUnique(vtkInformationKeyVectorKey id0,vtkInformationDoubleVectorKey id1)
  {
    AppendUnique_94(id0,id1);
  }

  private native void AppendUnique_95(vtkInformationKeyVectorKey id0,vtkInformationInformationKey id1);
  public void AppendUnique(vtkInformationKeyVectorKey id0,vtkInformationInformationKey id1)
  {
    AppendUnique_95(id0,id1);
  }

  private native void AppendUnique_96(vtkInformationKeyVectorKey id0,vtkInformationInformationVectorKey id1);
  public void AppendUnique(vtkInformationKeyVectorKey id0,vtkInformationInformationVectorKey id1)
  {
    AppendUnique_96(id0,id1);
  }

  private native void AppendUnique_97(vtkInformationKeyVectorKey id0,vtkInformationIntegerKey id1);
  public void AppendUnique(vtkInformationKeyVectorKey id0,vtkInformationIntegerKey id1)
  {
    AppendUnique_97(id0,id1);
  }

  private native void AppendUnique_98(vtkInformationKeyVectorKey id0,vtkInformationIntegerVectorKey id1);
  public void AppendUnique(vtkInformationKeyVectorKey id0,vtkInformationIntegerVectorKey id1)
  {
    AppendUnique_98(id0,id1);
  }

  private native void AppendUnique_99(vtkInformationKeyVectorKey id0,vtkInformationStringKey id1);
  public void AppendUnique(vtkInformationKeyVectorKey id0,vtkInformationStringKey id1)
  {
    AppendUnique_99(id0,id1);
  }

  private native void AppendUnique_100(vtkInformationKeyVectorKey id0,vtkInformationStringVectorKey id1);
  public void AppendUnique(vtkInformationKeyVectorKey id0,vtkInformationStringVectorKey id1)
  {
    AppendUnique_100(id0,id1);
  }

  private native void AppendUnique_101(vtkInformationKeyVectorKey id0,vtkInformationObjectBaseKey id1);
  public void AppendUnique(vtkInformationKeyVectorKey id0,vtkInformationObjectBaseKey id1)
  {
    AppendUnique_101(id0,id1);
  }

  private native void AppendUnique_102(vtkInformationKeyVectorKey id0,vtkInformationUnsignedLongKey id1);
  public void AppendUnique(vtkInformationKeyVectorKey id0,vtkInformationUnsignedLongKey id1)
  {
    AppendUnique_102(id0,id1);
  }

  private native void Set_103(vtkInformationStringKey id0,byte[] id1, int len1);
  public void Set(vtkInformationStringKey id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    Set_103(id0,bytes1, bytes1.length);
  }

  private native byte[] Get_104(vtkInformationStringKey id0);
  public String Get(vtkInformationStringKey id0)
  {
    return new String(Get_104(id0), StandardCharsets.UTF_8);
  }

  private native void Remove_105(vtkInformationStringKey id0);
  public void Remove(vtkInformationStringKey id0)
  {
    Remove_105(id0);
  }

  private native int Has_106(vtkInformationStringKey id0);
  public int Has(vtkInformationStringKey id0)
  {
    return Has_106(id0);
  }

  private native void Set_107(vtkInformationInformationKey id0,vtkInformation id1);
  public void Set(vtkInformationInformationKey id0,vtkInformation id1)
  {
    Set_107(id0,id1);
  }

  private native long Get_108(vtkInformationInformationKey id0);
  public vtkInformation Get(vtkInformationInformationKey id0)
  {
    long temp = Get_108(id0);

    if (temp == 0) return null;
    return (vtkInformation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Remove_109(vtkInformationInformationKey id0);
  public void Remove(vtkInformationInformationKey id0)
  {
    Remove_109(id0);
  }

  private native int Has_110(vtkInformationInformationKey id0);
  public int Has(vtkInformationInformationKey id0)
  {
    return Has_110(id0);
  }

  private native void Set_111(vtkInformationInformationVectorKey id0,vtkInformationVector id1);
  public void Set(vtkInformationInformationVectorKey id0,vtkInformationVector id1)
  {
    Set_111(id0,id1);
  }

  private native long Get_112(vtkInformationInformationVectorKey id0);
  public vtkInformationVector Get(vtkInformationInformationVectorKey id0)
  {
    long temp = Get_112(id0);

    if (temp == 0) return null;
    return (vtkInformationVector)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Remove_113(vtkInformationInformationVectorKey id0);
  public void Remove(vtkInformationInformationVectorKey id0)
  {
    Remove_113(id0);
  }

  private native int Has_114(vtkInformationInformationVectorKey id0);
  public int Has(vtkInformationInformationVectorKey id0)
  {
    return Has_114(id0);
  }

  private native void Set_115(vtkInformationObjectBaseKey id0,vtkObjectBase id1);
  public void Set(vtkInformationObjectBaseKey id0,vtkObjectBase id1)
  {
    Set_115(id0,id1);
  }

  private native long Get_116(vtkInformationObjectBaseKey id0);
  public vtkObjectBase Get(vtkInformationObjectBaseKey id0)
  {
    long temp = Get_116(id0);

    if (temp == 0) return null;
    return (vtkObjectBase)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Remove_117(vtkInformationObjectBaseKey id0);
  public void Remove(vtkInformationObjectBaseKey id0)
  {
    Remove_117(id0);
  }

  private native int Has_118(vtkInformationObjectBaseKey id0);
  public int Has(vtkInformationObjectBaseKey id0)
  {
    return Has_118(id0);
  }

  private native void Append_119(vtkInformationObjectBaseVectorKey id0,vtkObjectBase id1);
  public void Append(vtkInformationObjectBaseVectorKey id0,vtkObjectBase id1)
  {
    Append_119(id0,id1);
  }

  private native void Set_120(vtkInformationObjectBaseVectorKey id0,vtkObjectBase id1,int id2);
  public void Set(vtkInformationObjectBaseVectorKey id0,vtkObjectBase id1,int id2)
  {
    Set_120(id0,id1,id2);
  }

  private native long Get_121(vtkInformationObjectBaseVectorKey id0,int id1);
  public vtkObjectBase Get(vtkInformationObjectBaseVectorKey id0,int id1)
  {
    long temp = Get_121(id0,id1);

    if (temp == 0) return null;
    return (vtkObjectBase)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int Length_122(vtkInformationObjectBaseVectorKey id0);
  public int Length(vtkInformationObjectBaseVectorKey id0)
  {
    return Length_122(id0);
  }

  private native void Remove_123(vtkInformationObjectBaseVectorKey id0);
  public void Remove(vtkInformationObjectBaseVectorKey id0)
  {
    Remove_123(id0);
  }

  private native void Remove_124(vtkInformationObjectBaseVectorKey id0,vtkObjectBase id1);
  public void Remove(vtkInformationObjectBaseVectorKey id0,vtkObjectBase id1)
  {
    Remove_124(id0,id1);
  }

  private native void Remove_125(vtkInformationObjectBaseVectorKey id0,int id1);
  public void Remove(vtkInformationObjectBaseVectorKey id0,int id1)
  {
    Remove_125(id0,id1);
  }

  private native int Has_126(vtkInformationObjectBaseVectorKey id0);
  public int Has(vtkInformationObjectBaseVectorKey id0)
  {
    return Has_126(id0);
  }

  private native void Remove_127(vtkInformationDataObjectKey id0);
  public void Remove(vtkInformationDataObjectKey id0)
  {
    Remove_127(id0);
  }

  private native int Has_128(vtkInformationDataObjectKey id0);
  public int Has(vtkInformationDataObjectKey id0)
  {
    return Has_128(id0);
  }

  private native long GetKey_129(vtkInformationDataObjectKey id0);
  public vtkInformationKey GetKey(vtkInformationDataObjectKey id0)
  {
    long temp = GetKey_129(id0);

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetKey_130(vtkInformationDoubleKey id0);
  public vtkInformationKey GetKey(vtkInformationDoubleKey id0)
  {
    long temp = GetKey_130(id0);

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetKey_131(vtkInformationDoubleVectorKey id0);
  public vtkInformationKey GetKey(vtkInformationDoubleVectorKey id0)
  {
    long temp = GetKey_131(id0);

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetKey_132(vtkInformationInformationKey id0);
  public vtkInformationKey GetKey(vtkInformationInformationKey id0)
  {
    long temp = GetKey_132(id0);

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetKey_133(vtkInformationInformationVectorKey id0);
  public vtkInformationKey GetKey(vtkInformationInformationVectorKey id0)
  {
    long temp = GetKey_133(id0);

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetKey_134(vtkInformationIntegerKey id0);
  public vtkInformationKey GetKey(vtkInformationIntegerKey id0)
  {
    long temp = GetKey_134(id0);

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetKey_135(vtkInformationIntegerVectorKey id0);
  public vtkInformationKey GetKey(vtkInformationIntegerVectorKey id0)
  {
    long temp = GetKey_135(id0);

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetKey_136(vtkInformationRequestKey id0);
  public vtkInformationKey GetKey(vtkInformationRequestKey id0)
  {
    long temp = GetKey_136(id0);

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetKey_137(vtkInformationStringKey id0);
  public vtkInformationKey GetKey(vtkInformationStringKey id0)
  {
    long temp = GetKey_137(id0);

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetKey_138(vtkInformationStringVectorKey id0);
  public vtkInformationKey GetKey(vtkInformationStringVectorKey id0)
  {
    long temp = GetKey_138(id0);

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetKey_139(vtkInformationKey id0);
  public vtkInformationKey GetKey(vtkInformationKey id0)
  {
    long temp = GetKey_139(id0);

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetKey_140(vtkInformationUnsignedLongKey id0);
  public vtkInformationKey GetKey(vtkInformationUnsignedLongKey id0)
  {
    long temp = GetKey_140(id0);

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetKey_141(vtkInformationVariantKey id0);
  public vtkInformationKey GetKey(vtkInformationVariantKey id0)
  {
    long temp = GetKey_141(id0);

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetKey_142(vtkInformationVariantVectorKey id0);
  public vtkInformationKey GetKey(vtkInformationVariantVectorKey id0)
  {
    long temp = GetKey_142(id0);

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean UsesGarbageCollector_143();
  public boolean UsesGarbageCollector()
  {
    return UsesGarbageCollector_143();
  }

  private native void SetRequest_144(vtkInformationRequestKey id0);
  public void SetRequest(vtkInformationRequestKey id0)
  {
    SetRequest_144(id0);
  }

  private native long GetRequest_145();
  public vtkInformationRequestKey GetRequest()
  {
    long temp = GetRequest_145();

    if (temp == 0) return null;
    return (vtkInformationRequestKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkInformation() { super(); }

  public vtkInformation(long id) { super(id); }
  public native long   VTKInit();

}
