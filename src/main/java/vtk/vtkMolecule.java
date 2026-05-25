// java wrapper for vtkMolecule object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMolecule extends vtkUndirectedGraph
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

  private native long GetNumberOfAtoms_6();
  public long GetNumberOfAtoms()
  {
    return GetNumberOfAtoms_6();
  }

  private native long GetNumberOfBonds_7();
  public long GetNumberOfBonds()
  {
    return GetNumberOfBonds_7();
  }

  private native short GetAtomAtomicNumber_8(long id0);
  public short GetAtomAtomicNumber(long id0)
  {
    return GetAtomAtomicNumber_8(id0);
  }

  private native void SetAtomAtomicNumber_9(long id0,short id1);
  public void SetAtomAtomicNumber(long id0,short id1)
  {
    SetAtomAtomicNumber_9(id0,id1);
  }

  private native void SetAtomPosition_10(long id0,double id1,double id2,double id3);
  public void SetAtomPosition(long id0,double id1,double id2,double id3)
  {
    SetAtomPosition_10(id0,id1,id2,id3);
  }

  private native void SetAtomPosition_11(long id0,double id1[]);
  public void SetAtomPosition(long id0,double id1[])
  {
    SetAtomPosition_11(id0,id1);
  }

  private native void GetAtomPosition_12(long id0,float id1[]);
  public void GetAtomPosition(long id0,float id1[])
  {
    GetAtomPosition_12(id0,id1);
  }

  private native void GetAtomPosition_13(long id0,double id1[]);
  public void GetAtomPosition(long id0,double id1[])
  {
    GetAtomPosition_13(id0,id1);
  }

  private native void SetBondOrder_14(long id0,short id1);
  public void SetBondOrder(long id0,short id1)
  {
    SetBondOrder_14(id0,id1);
  }

  private native short GetBondOrder_15(long id0);
  public short GetBondOrder(long id0)
  {
    return GetBondOrder_15(id0);
  }

  private native double GetBondLength_16(long id0);
  public double GetBondLength(long id0)
  {
    return GetBondLength_16(id0);
  }

  private native long GetAtomicPositionArray_17();
  public vtkPoints GetAtomicPositionArray()
  {
    long temp = GetAtomicPositionArray_17();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAtomicNumberArray_18();
  public vtkUnsignedShortArray GetAtomicNumberArray()
  {
    long temp = GetAtomicNumberArray_18();

    if (temp == 0) return null;
    return (vtkUnsignedShortArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBondOrdersArray_19();
  public vtkUnsignedShortArray GetBondOrdersArray()
  {
    long temp = GetBondOrdersArray_19();

    if (temp == 0) return null;
    return (vtkUnsignedShortArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetElectronicData_20();
  public vtkAbstractElectronicData GetElectronicData()
  {
    long temp = GetElectronicData_20();

    if (temp == 0) return null;
    return (vtkAbstractElectronicData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetElectronicData_21(vtkAbstractElectronicData id0);
  public void SetElectronicData(vtkAbstractElectronicData id0)
  {
    SetElectronicData_21(id0);
  }

  private native boolean CheckedShallowCopy_22(vtkGraph id0);
  public boolean CheckedShallowCopy(vtkGraph id0)
  {
    return CheckedShallowCopy_22(id0);
  }

  private native boolean CheckedDeepCopy_23(vtkGraph id0);
  public boolean CheckedDeepCopy(vtkGraph id0)
  {
    return CheckedDeepCopy_23(id0);
  }

  private native void ShallowCopy_24(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_24(id0);
  }

  private native void DeepCopy_25(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_25(id0);
  }

  private native void ShallowCopyStructure_26(vtkMolecule id0);
  public void ShallowCopyStructure(vtkMolecule id0)
  {
    ShallowCopyStructure_26(id0);
  }

  private native void DeepCopyStructure_27(vtkMolecule id0);
  public void DeepCopyStructure(vtkMolecule id0)
  {
    DeepCopyStructure_27(id0);
  }

  private native void ShallowCopyAttributes_28(vtkMolecule id0);
  public void ShallowCopyAttributes(vtkMolecule id0)
  {
    ShallowCopyAttributes_28(id0);
  }

  private native void DeepCopyAttributes_29(vtkMolecule id0);
  public void DeepCopyAttributes(vtkMolecule id0)
  {
    DeepCopyAttributes_29(id0);
  }

  private native boolean HasLattice_30();
  public boolean HasLattice()
  {
    return HasLattice_30();
  }

  private native void ClearLattice_31();
  public void ClearLattice()
  {
    ClearLattice_31();
  }

  private native void SetLattice_32(vtkMatrix3x3 id0);
  public void SetLattice(vtkMatrix3x3 id0)
  {
    SetLattice_32(id0);
  }

  private native long GetLattice_33();
  public vtkMatrix3x3 GetLattice()
  {
    long temp = GetLattice_33();

    if (temp == 0) return null;
    return (vtkMatrix3x3)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAtomGhostArray_34();
  public vtkUnsignedCharArray GetAtomGhostArray()
  {
    long temp = GetAtomGhostArray_34();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AllocateAtomGhostArray_35();
  public void AllocateAtomGhostArray()
  {
    AllocateAtomGhostArray_35();
  }

  private native long GetBondGhostArray_36();
  public vtkUnsignedCharArray GetBondGhostArray()
  {
    long temp = GetBondGhostArray_36();

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AllocateBondGhostArray_37();
  public void AllocateBondGhostArray()
  {
    AllocateBondGhostArray_37();
  }

  private native int Initialize_38(vtkPoints id0,vtkDataArray id1,vtkDataSetAttributes id2);
  public int Initialize(vtkPoints id0,vtkDataArray id1,vtkDataSetAttributes id2)
  {
    return Initialize_38(id0,id1,id2);
  }

  private native int Initialize_39(vtkPoints id0,vtkDataSetAttributes id1);
  public int Initialize(vtkPoints id0,vtkDataSetAttributes id1)
  {
    return Initialize_39(id0,id1);
  }

  private native int Initialize_40(vtkMolecule id0);
  public int Initialize(vtkMolecule id0)
  {
    return Initialize_40(id0);
  }

  private native long GetData_41(vtkInformation id0);
  public vtkMolecule GetData(vtkInformation id0)
  {
    long temp = GetData_41(id0);

    if (temp == 0) return null;
    return (vtkMolecule)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_42(vtkInformationVector id0,int id1);
  public vtkMolecule GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_42(id0,id1);

    if (temp == 0) return null;
    return (vtkMolecule)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAtomData_43();
  public vtkDataSetAttributes GetAtomData()
  {
    long temp = GetAtomData_43();

    if (temp == 0) return null;
    return (vtkDataSetAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBondData_44();
  public vtkDataSetAttributes GetBondData()
  {
    long temp = GetBondData_44();

    if (temp == 0) return null;
    return (vtkDataSetAttributes)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBondId_45(long id0,long id1);
  public long GetBondId(long id0,long id1)
  {
    return GetBondId_45(id0,id1);
  }

  private native void SetAtomicNumberArrayName_46(byte[] id0, int len0);
  public void SetAtomicNumberArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAtomicNumberArrayName_46(bytes0, bytes0.length);
  }

  private native byte[] GetAtomicNumberArrayName_47();
  public String GetAtomicNumberArrayName()
  {
    return new String(GetAtomicNumberArrayName_47(), StandardCharsets.UTF_8);
  }

  private native void SetBondOrdersArrayName_48(byte[] id0, int len0);
  public void SetBondOrdersArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBondOrdersArrayName_48(bytes0, bytes0.length);
  }

  private native byte[] GetBondOrdersArrayName_49();
  public String GetBondOrdersArrayName()
  {
    return new String(GetBondOrdersArrayName_49(), StandardCharsets.UTF_8);
  }

  private native long GetActualMemorySize_50();
  public long GetActualMemorySize()
  {
    return GetActualMemorySize_50();
  }

  public vtkMolecule() { super(); }

  public vtkMolecule(long id) { super(id); }
  public native long   VTKInit();

}
