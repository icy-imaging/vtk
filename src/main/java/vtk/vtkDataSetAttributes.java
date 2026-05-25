// java wrapper for vtkDataSetAttributes object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataSetAttributes extends vtkFieldData
{

  private native long ExtendedNew_0();
  public vtkDataSetAttributes ExtendedNew()
  {
    long temp = ExtendedNew_0();

    if (temp == 0) return null;
    return (vtkDataSetAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  private native void Initialize_5();
  public void Initialize()
  {
    Initialize_5();
  }

  private native void Update_6();
  public void Update()
  {
    Update_6();
  }

  private native void DeepCopy_7(vtkFieldData id0);
  public void DeepCopy(vtkFieldData id0)
  {
    DeepCopy_7(id0);
  }

  private native void ShallowCopy_8(vtkFieldData id0);
  public void ShallowCopy(vtkFieldData id0)
  {
    ShallowCopy_8(id0);
  }

  private native byte[] GhostArrayName_9();
  public String GhostArrayName()
  {
    return new String(GhostArrayName_9(), StandardCharsets.UTF_8);
  }

  private native int SetScalars_10(vtkDataArray id0);
  public int SetScalars(vtkDataArray id0)
  {
    return SetScalars_10(id0);
  }

  private native int SetActiveScalars_11(byte[] id0, int len0);
  public int SetActiveScalars(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetActiveScalars_11(bytes0, bytes0.length);
  }

  private native long GetScalars_12();
  public vtkDataArray GetScalars()
  {
    long temp = GetScalars_12();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int SetVectors_13(vtkDataArray id0);
  public int SetVectors(vtkDataArray id0)
  {
    return SetVectors_13(id0);
  }

  private native int SetActiveVectors_14(byte[] id0, int len0);
  public int SetActiveVectors(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetActiveVectors_14(bytes0, bytes0.length);
  }

  private native long GetVectors_15();
  public vtkDataArray GetVectors()
  {
    long temp = GetVectors_15();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int SetNormals_16(vtkDataArray id0);
  public int SetNormals(vtkDataArray id0)
  {
    return SetNormals_16(id0);
  }

  private native int SetActiveNormals_17(byte[] id0, int len0);
  public int SetActiveNormals(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetActiveNormals_17(bytes0, bytes0.length);
  }

  private native long GetNormals_18();
  public vtkDataArray GetNormals()
  {
    long temp = GetNormals_18();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int SetTangents_19(vtkDataArray id0);
  public int SetTangents(vtkDataArray id0)
  {
    return SetTangents_19(id0);
  }

  private native int SetActiveTangents_20(byte[] id0, int len0);
  public int SetActiveTangents(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetActiveTangents_20(bytes0, bytes0.length);
  }

  private native long GetTangents_21();
  public vtkDataArray GetTangents()
  {
    long temp = GetTangents_21();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int SetTCoords_22(vtkDataArray id0);
  public int SetTCoords(vtkDataArray id0)
  {
    return SetTCoords_22(id0);
  }

  private native int SetActiveTCoords_23(byte[] id0, int len0);
  public int SetActiveTCoords(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetActiveTCoords_23(bytes0, bytes0.length);
  }

  private native long GetTCoords_24();
  public vtkDataArray GetTCoords()
  {
    long temp = GetTCoords_24();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int SetTensors_25(vtkDataArray id0);
  public int SetTensors(vtkDataArray id0)
  {
    return SetTensors_25(id0);
  }

  private native int SetActiveTensors_26(byte[] id0, int len0);
  public int SetActiveTensors(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetActiveTensors_26(bytes0, bytes0.length);
  }

  private native long GetTensors_27();
  public vtkDataArray GetTensors()
  {
    long temp = GetTensors_27();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int SetGlobalIds_28(vtkDataArray id0);
  public int SetGlobalIds(vtkDataArray id0)
  {
    return SetGlobalIds_28(id0);
  }

  private native int SetActiveGlobalIds_29(byte[] id0, int len0);
  public int SetActiveGlobalIds(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetActiveGlobalIds_29(bytes0, bytes0.length);
  }

  private native long GetGlobalIds_30();
  public vtkDataArray GetGlobalIds()
  {
    long temp = GetGlobalIds_30();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int SetPedigreeIds_31(vtkAbstractArray id0);
  public int SetPedigreeIds(vtkAbstractArray id0)
  {
    return SetPedigreeIds_31(id0);
  }

  private native int SetActivePedigreeIds_32(byte[] id0, int len0);
  public int SetActivePedigreeIds(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetActivePedigreeIds_32(bytes0, bytes0.length);
  }

  private native long GetPedigreeIds_33();
  public vtkAbstractArray GetPedigreeIds()
  {
    long temp = GetPedigreeIds_33();

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int SetRationalWeights_34(vtkDataArray id0);
  public int SetRationalWeights(vtkDataArray id0)
  {
    return SetRationalWeights_34(id0);
  }

  private native int SetActiveRationalWeights_35(byte[] id0, int len0);
  public int SetActiveRationalWeights(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetActiveRationalWeights_35(bytes0, bytes0.length);
  }

  private native long GetRationalWeights_36();
  public vtkDataArray GetRationalWeights()
  {
    long temp = GetRationalWeights_36();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int SetHigherOrderDegrees_37(vtkDataArray id0);
  public int SetHigherOrderDegrees(vtkDataArray id0)
  {
    return SetHigherOrderDegrees_37(id0);
  }

  private native int SetActiveHigherOrderDegrees_38(byte[] id0, int len0);
  public int SetActiveHigherOrderDegrees(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetActiveHigherOrderDegrees_38(bytes0, bytes0.length);
  }

  private native long GetHigherOrderDegrees_39();
  public vtkDataArray GetHigherOrderDegrees()
  {
    long temp = GetHigherOrderDegrees_39();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int SetProcessIds_40(vtkDataArray id0);
  public int SetProcessIds(vtkDataArray id0)
  {
    return SetProcessIds_40(id0);
  }

  private native int SetActiveProcessIds_41(byte[] id0, int len0);
  public int SetActiveProcessIds(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetActiveProcessIds_41(bytes0, bytes0.length);
  }

  private native long GetProcessIds_42();
  public vtkDataArray GetProcessIds()
  {
    long temp = GetProcessIds_42();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetScalars_43(byte[] id0, int len0);
  public vtkDataArray GetScalars(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetScalars_43(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetVectors_44(byte[] id0, int len0);
  public vtkDataArray GetVectors(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetVectors_44(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNormals_45(byte[] id0, int len0);
  public vtkDataArray GetNormals(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetNormals_45(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTangents_46(byte[] id0, int len0);
  public vtkDataArray GetTangents(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetTangents_46(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTCoords_47(byte[] id0, int len0);
  public vtkDataArray GetTCoords(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetTCoords_47(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTensors_48(byte[] id0, int len0);
  public vtkDataArray GetTensors(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetTensors_48(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetGlobalIds_49(byte[] id0, int len0);
  public vtkDataArray GetGlobalIds(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetGlobalIds_49(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPedigreeIds_50(byte[] id0, int len0);
  public vtkAbstractArray GetPedigreeIds(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetPedigreeIds_50(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRationalWeights_51(byte[] id0, int len0);
  public vtkDataArray GetRationalWeights(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetRationalWeights_51(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetHigherOrderDegrees_52(byte[] id0, int len0);
  public vtkDataArray GetHigherOrderDegrees(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetHigherOrderDegrees_52(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetProcessIds_53(byte[] id0, int len0);
  public vtkDataArray GetProcessIds(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = GetProcessIds_53(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int SetActiveAttribute_54(byte[] id0, int len0,int id1);
  public int SetActiveAttribute(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetActiveAttribute_54(bytes0, bytes0.length,id1);
  }

  private native int SetActiveAttribute_55(int id0,int id1);
  public int SetActiveAttribute(int id0,int id1)
  {
    return SetActiveAttribute_55(id0,id1);
  }

  private native int IsArrayAnAttribute_56(int id0);
  public int IsArrayAnAttribute(int id0)
  {
    return IsArrayAnAttribute_56(id0);
  }

  private native int SetAttribute_57(vtkAbstractArray id0,int id1);
  public int SetAttribute(vtkAbstractArray id0,int id1)
  {
    return SetAttribute_57(id0,id1);
  }

  private native long GetAttribute_58(int id0);
  public vtkDataArray GetAttribute(int id0)
  {
    long temp = GetAttribute_58(id0);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAbstractAttribute_59(int id0);
  public vtkAbstractArray GetAbstractAttribute(int id0)
  {
    long temp = GetAbstractAttribute_59(id0);

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RemoveArray_60(int id0);
  public void RemoveArray(int id0)
  {
    RemoveArray_60(id0);
  }

  private native byte[] GetAttributeTypeAsString_61(int id0);
  public String GetAttributeTypeAsString(int id0)
  {
    return new String(GetAttributeTypeAsString_61(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetLongAttributeTypeAsString_62(int id0);
  public String GetLongAttributeTypeAsString(int id0)
  {
    return new String(GetLongAttributeTypeAsString_62(id0), StandardCharsets.UTF_8);
  }

  private native void SetCopyAttribute_63(int id0,int id1,int id2);
  public void SetCopyAttribute(int id0,int id1,int id2)
  {
    SetCopyAttribute_63(id0,id1,id2);
  }

  private native int GetCopyAttribute_64(int id0,int id1);
  public int GetCopyAttribute(int id0,int id1)
  {
    return GetCopyAttribute_64(id0,id1);
  }

  private native void SetCopyScalars_65(int id0,int id1);
  public void SetCopyScalars(int id0,int id1)
  {
    SetCopyScalars_65(id0,id1);
  }

  private native int GetCopyScalars_66(int id0);
  public int GetCopyScalars(int id0)
  {
    return GetCopyScalars_66(id0);
  }

  private native void CopyScalarsOn_67();
  public void CopyScalarsOn()
  {
    CopyScalarsOn_67();
  }

  private native void CopyScalarsOff_68();
  public void CopyScalarsOff()
  {
    CopyScalarsOff_68();
  }

  private native void SetCopyVectors_69(int id0,int id1);
  public void SetCopyVectors(int id0,int id1)
  {
    SetCopyVectors_69(id0,id1);
  }

  private native int GetCopyVectors_70(int id0);
  public int GetCopyVectors(int id0)
  {
    return GetCopyVectors_70(id0);
  }

  private native void CopyVectorsOn_71();
  public void CopyVectorsOn()
  {
    CopyVectorsOn_71();
  }

  private native void CopyVectorsOff_72();
  public void CopyVectorsOff()
  {
    CopyVectorsOff_72();
  }

  private native void SetCopyNormals_73(int id0,int id1);
  public void SetCopyNormals(int id0,int id1)
  {
    SetCopyNormals_73(id0,id1);
  }

  private native int GetCopyNormals_74(int id0);
  public int GetCopyNormals(int id0)
  {
    return GetCopyNormals_74(id0);
  }

  private native void CopyNormalsOn_75();
  public void CopyNormalsOn()
  {
    CopyNormalsOn_75();
  }

  private native void CopyNormalsOff_76();
  public void CopyNormalsOff()
  {
    CopyNormalsOff_76();
  }

  private native void SetCopyTangents_77(int id0,int id1);
  public void SetCopyTangents(int id0,int id1)
  {
    SetCopyTangents_77(id0,id1);
  }

  private native int GetCopyTangents_78(int id0);
  public int GetCopyTangents(int id0)
  {
    return GetCopyTangents_78(id0);
  }

  private native void CopyTangentsOn_79();
  public void CopyTangentsOn()
  {
    CopyTangentsOn_79();
  }

  private native void CopyTangentsOff_80();
  public void CopyTangentsOff()
  {
    CopyTangentsOff_80();
  }

  private native void SetCopyTCoords_81(int id0,int id1);
  public void SetCopyTCoords(int id0,int id1)
  {
    SetCopyTCoords_81(id0,id1);
  }

  private native int GetCopyTCoords_82(int id0);
  public int GetCopyTCoords(int id0)
  {
    return GetCopyTCoords_82(id0);
  }

  private native void CopyTCoordsOn_83();
  public void CopyTCoordsOn()
  {
    CopyTCoordsOn_83();
  }

  private native void CopyTCoordsOff_84();
  public void CopyTCoordsOff()
  {
    CopyTCoordsOff_84();
  }

  private native void SetCopyTensors_85(int id0,int id1);
  public void SetCopyTensors(int id0,int id1)
  {
    SetCopyTensors_85(id0,id1);
  }

  private native int GetCopyTensors_86(int id0);
  public int GetCopyTensors(int id0)
  {
    return GetCopyTensors_86(id0);
  }

  private native void CopyTensorsOn_87();
  public void CopyTensorsOn()
  {
    CopyTensorsOn_87();
  }

  private native void CopyTensorsOff_88();
  public void CopyTensorsOff()
  {
    CopyTensorsOff_88();
  }

  private native void SetCopyGlobalIds_89(int id0,int id1);
  public void SetCopyGlobalIds(int id0,int id1)
  {
    SetCopyGlobalIds_89(id0,id1);
  }

  private native int GetCopyGlobalIds_90(int id0);
  public int GetCopyGlobalIds(int id0)
  {
    return GetCopyGlobalIds_90(id0);
  }

  private native void CopyGlobalIdsOn_91();
  public void CopyGlobalIdsOn()
  {
    CopyGlobalIdsOn_91();
  }

  private native void CopyGlobalIdsOff_92();
  public void CopyGlobalIdsOff()
  {
    CopyGlobalIdsOff_92();
  }

  private native void SetCopyPedigreeIds_93(int id0,int id1);
  public void SetCopyPedigreeIds(int id0,int id1)
  {
    SetCopyPedigreeIds_93(id0,id1);
  }

  private native int GetCopyPedigreeIds_94(int id0);
  public int GetCopyPedigreeIds(int id0)
  {
    return GetCopyPedigreeIds_94(id0);
  }

  private native void CopyPedigreeIdsOn_95();
  public void CopyPedigreeIdsOn()
  {
    CopyPedigreeIdsOn_95();
  }

  private native void CopyPedigreeIdsOff_96();
  public void CopyPedigreeIdsOff()
  {
    CopyPedigreeIdsOff_96();
  }

  private native void SetCopyRationalWeights_97(int id0,int id1);
  public void SetCopyRationalWeights(int id0,int id1)
  {
    SetCopyRationalWeights_97(id0,id1);
  }

  private native int GetCopyRationalWeights_98(int id0);
  public int GetCopyRationalWeights(int id0)
  {
    return GetCopyRationalWeights_98(id0);
  }

  private native void CopyRationalWeightsOn_99();
  public void CopyRationalWeightsOn()
  {
    CopyRationalWeightsOn_99();
  }

  private native void CopyRationalWeightsOff_100();
  public void CopyRationalWeightsOff()
  {
    CopyRationalWeightsOff_100();
  }

  private native void SetCopyHigherOrderDegrees_101(int id0,int id1);
  public void SetCopyHigherOrderDegrees(int id0,int id1)
  {
    SetCopyHigherOrderDegrees_101(id0,id1);
  }

  private native int GetCopyHigherOrderDegrees_102(int id0);
  public int GetCopyHigherOrderDegrees(int id0)
  {
    return GetCopyHigherOrderDegrees_102(id0);
  }

  private native void CopyHigherOrderDegreesOn_103();
  public void CopyHigherOrderDegreesOn()
  {
    CopyHigherOrderDegreesOn_103();
  }

  private native void CopyHigherOrderDegreesOff_104();
  public void CopyHigherOrderDegreesOff()
  {
    CopyHigherOrderDegreesOff_104();
  }

  private native void SetCopyProcessIds_105(int id0,int id1);
  public void SetCopyProcessIds(int id0,int id1)
  {
    SetCopyProcessIds_105(id0,id1);
  }

  private native int GetCopyProcessIds_106(int id0);
  public int GetCopyProcessIds(int id0)
  {
    return GetCopyProcessIds_106(id0);
  }

  private native void CopyProcessIdsOn_107();
  public void CopyProcessIdsOn()
  {
    CopyProcessIdsOn_107();
  }

  private native void CopyProcessIdsOff_108();
  public void CopyProcessIdsOff()
  {
    CopyProcessIdsOff_108();
  }

  private native void CopyAllOn_109(int id0);
  public void CopyAllOn(int id0)
  {
    CopyAllOn_109(id0);
  }

  private native void CopyAllOff_110(int id0);
  public void CopyAllOff(int id0)
  {
    CopyAllOff_110(id0);
  }

  private native void PassData_111(vtkFieldData id0);
  public void PassData(vtkFieldData id0)
  {
    PassData_111(id0);
  }

  private native void CopyAllocate_112(vtkDataSetAttributes id0,long id1,long id2);
  public void CopyAllocate(vtkDataSetAttributes id0,long id1,long id2)
  {
    CopyAllocate_112(id0,id1,id2);
  }

  private native void CopyAllocate_113(vtkDataSetAttributes id0,long id1,long id2,int id3);
  public void CopyAllocate(vtkDataSetAttributes id0,long id1,long id2,int id3)
  {
    CopyAllocate_113(id0,id1,id2,id3);
  }

  private native void SetupForCopy_114(vtkDataSetAttributes id0);
  public void SetupForCopy(vtkDataSetAttributes id0)
  {
    SetupForCopy_114(id0);
  }

  private native void CopyData_115(vtkDataSetAttributes id0,long id1,long id2);
  public void CopyData(vtkDataSetAttributes id0,long id1,long id2)
  {
    CopyData_115(id0,id1,id2);
  }

  private native void CopyData_116(vtkDataSetAttributes id0,vtkIdList id1,vtkIdList id2);
  public void CopyData(vtkDataSetAttributes id0,vtkIdList id1,vtkIdList id2)
  {
    CopyData_116(id0,id1,id2);
  }

  private native void CopyData_117(vtkDataSetAttributes id0,vtkIdList id1,long id2);
  public void CopyData(vtkDataSetAttributes id0,vtkIdList id1,long id2)
  {
    CopyData_117(id0,id1,id2);
  }

  private native void CopyData_118(vtkDataSetAttributes id0,long id1,long id2,long id3);
  public void CopyData(vtkDataSetAttributes id0,long id1,long id2,long id3)
  {
    CopyData_118(id0,id1,id2,id3);
  }

  private native void CopyTuple_119(vtkAbstractArray id0,vtkAbstractArray id1,long id2,long id3);
  public void CopyTuple(vtkAbstractArray id0,vtkAbstractArray id1,long id2,long id3)
  {
    CopyTuple_119(id0,id1,id2,id3);
  }

  private native void CopyTuples_120(vtkAbstractArray id0,vtkAbstractArray id1,vtkIdList id2,vtkIdList id3);
  public void CopyTuples(vtkAbstractArray id0,vtkAbstractArray id1,vtkIdList id2,vtkIdList id3)
  {
    CopyTuples_120(id0,id1,id2,id3);
  }

  private native void CopyTuples_121(vtkAbstractArray id0,vtkAbstractArray id1,long id2,long id3,long id4);
  public void CopyTuples(vtkAbstractArray id0,vtkAbstractArray id1,long id2,long id3,long id4)
  {
    CopyTuples_121(id0,id1,id2,id3,id4);
  }

  private native void InterpolateAllocate_122(vtkDataSetAttributes id0,long id1,long id2);
  public void InterpolateAllocate(vtkDataSetAttributes id0,long id1,long id2)
  {
    InterpolateAllocate_122(id0,id1,id2);
  }

  private native void InterpolateAllocate_123(vtkDataSetAttributes id0,long id1,long id2,int id3);
  public void InterpolateAllocate(vtkDataSetAttributes id0,long id1,long id2,int id3)
  {
    InterpolateAllocate_123(id0,id1,id2,id3);
  }

  private native void InterpolateEdge_124(vtkDataSetAttributes id0,long id1,long id2,long id3,double id4);
  public void InterpolateEdge(vtkDataSetAttributes id0,long id1,long id2,long id3,double id4)
  {
    InterpolateEdge_124(id0,id1,id2,id3,id4);
  }

  private native void InterpolateTime_125(vtkDataSetAttributes id0,vtkDataSetAttributes id1,long id2,double id3);
  public void InterpolateTime(vtkDataSetAttributes id0,vtkDataSetAttributes id1,long id2,double id3)
  {
    InterpolateTime_125(id0,id1,id2,id3);
  }

  private native void RemoveArray_126(byte[] id0, int len0);
  public void RemoveArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveArray_126(bytes0, bytes0.length);
  }

  public vtkDataSetAttributes() { super(); }

  public vtkDataSetAttributes(long id) { super(id); }
  public native long   VTKInit();

}
