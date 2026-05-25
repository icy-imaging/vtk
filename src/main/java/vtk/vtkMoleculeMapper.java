// java wrapper for vtkMoleculeMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMoleculeMapper extends vtkMapper
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

  private native void SetInputData_4(vtkMolecule id0);
  public void SetInputData(vtkMolecule id0)
  {
    SetInputData_4(id0);
  }

  private native long GetInput_5();
  public vtkMolecule GetInput()
  {
    long temp = GetInput_5();

    if (temp == 0) return null;
    return (vtkMolecule)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void UseBallAndStickSettings_6();
  public void UseBallAndStickSettings()
  {
    UseBallAndStickSettings_6();
  }

  private native void UseVDWSpheresSettings_7();
  public void UseVDWSpheresSettings()
  {
    UseVDWSpheresSettings_7();
  }

  private native void UseLiquoriceStickSettings_8();
  public void UseLiquoriceStickSettings()
  {
    UseLiquoriceStickSettings_8();
  }

  private native void UseFastSettings_9();
  public void UseFastSettings()
  {
    UseFastSettings_9();
  }

  private native boolean GetRenderAtoms_10();
  public boolean GetRenderAtoms()
  {
    return GetRenderAtoms_10();
  }

  private native void SetRenderAtoms_11(boolean id0);
  public void SetRenderAtoms(boolean id0)
  {
    SetRenderAtoms_11(id0);
  }

  private native void RenderAtomsOn_12();
  public void RenderAtomsOn()
  {
    RenderAtomsOn_12();
  }

  private native void RenderAtomsOff_13();
  public void RenderAtomsOff()
  {
    RenderAtomsOff_13();
  }

  private native boolean GetRenderBonds_14();
  public boolean GetRenderBonds()
  {
    return GetRenderBonds_14();
  }

  private native void SetRenderBonds_15(boolean id0);
  public void SetRenderBonds(boolean id0)
  {
    SetRenderBonds_15(id0);
  }

  private native void RenderBondsOn_16();
  public void RenderBondsOn()
  {
    RenderBondsOn_16();
  }

  private native void RenderBondsOff_17();
  public void RenderBondsOff()
  {
    RenderBondsOff_17();
  }

  private native boolean GetRenderLattice_18();
  public boolean GetRenderLattice()
  {
    return GetRenderLattice_18();
  }

  private native void SetRenderLattice_19(boolean id0);
  public void SetRenderLattice(boolean id0)
  {
    SetRenderLattice_19(id0);
  }

  private native void RenderLatticeOn_20();
  public void RenderLatticeOn()
  {
    RenderLatticeOn_20();
  }

  private native void RenderLatticeOff_21();
  public void RenderLatticeOff()
  {
    RenderLatticeOff_21();
  }

  private native int GetAtomicRadiusType_22();
  public int GetAtomicRadiusType()
  {
    return GetAtomicRadiusType_22();
  }

  private native void SetAtomicRadiusType_23(int id0);
  public void SetAtomicRadiusType(int id0)
  {
    SetAtomicRadiusType_23(id0);
  }

  private native byte[] GetAtomicRadiusTypeAsString_24();
  public String GetAtomicRadiusTypeAsString()
  {
    return new String(GetAtomicRadiusTypeAsString_24(), StandardCharsets.UTF_8);
  }

  private native void SetAtomicRadiusTypeToCovalentRadius_25();
  public void SetAtomicRadiusTypeToCovalentRadius()
  {
    SetAtomicRadiusTypeToCovalentRadius_25();
  }

  private native void SetAtomicRadiusTypeToVDWRadius_26();
  public void SetAtomicRadiusTypeToVDWRadius()
  {
    SetAtomicRadiusTypeToVDWRadius_26();
  }

  private native void SetAtomicRadiusTypeToUnitRadius_27();
  public void SetAtomicRadiusTypeToUnitRadius()
  {
    SetAtomicRadiusTypeToUnitRadius_27();
  }

  private native void SetAtomicRadiusTypeToCustomArrayRadius_28();
  public void SetAtomicRadiusTypeToCustomArrayRadius()
  {
    SetAtomicRadiusTypeToCustomArrayRadius_28();
  }

  private native float GetAtomicRadiusScaleFactor_29();
  public float GetAtomicRadiusScaleFactor()
  {
    return GetAtomicRadiusScaleFactor_29();
  }

  private native void SetAtomicRadiusScaleFactor_30(float id0);
  public void SetAtomicRadiusScaleFactor(float id0)
  {
    SetAtomicRadiusScaleFactor_30(id0);
  }

  private native boolean GetUseMultiCylindersForBonds_31();
  public boolean GetUseMultiCylindersForBonds()
  {
    return GetUseMultiCylindersForBonds_31();
  }

  private native void SetUseMultiCylindersForBonds_32(boolean id0);
  public void SetUseMultiCylindersForBonds(boolean id0)
  {
    SetUseMultiCylindersForBonds_32(id0);
  }

  private native void UseMultiCylindersForBondsOn_33();
  public void UseMultiCylindersForBondsOn()
  {
    UseMultiCylindersForBondsOn_33();
  }

  private native void UseMultiCylindersForBondsOff_34();
  public void UseMultiCylindersForBondsOff()
  {
    UseMultiCylindersForBondsOff_34();
  }

  private native int GetBondColorMode_35();
  public int GetBondColorMode()
  {
    return GetBondColorMode_35();
  }

  private native void SetBondColorMode_36(int id0);
  public void SetBondColorMode(int id0)
  {
    SetBondColorMode_36(id0);
  }

  private native int GetBondColorModeMinValue_37();
  public int GetBondColorModeMinValue()
  {
    return GetBondColorModeMinValue_37();
  }

  private native int GetBondColorModeMaxValue_38();
  public int GetBondColorModeMaxValue()
  {
    return GetBondColorModeMaxValue_38();
  }

  private native void SetBondColorModeToSingleColor_39();
  public void SetBondColorModeToSingleColor()
  {
    SetBondColorModeToSingleColor_39();
  }

  private native void SetBondColorModeToDiscreteByAtom_40();
  public void SetBondColorModeToDiscreteByAtom()
  {
    SetBondColorModeToDiscreteByAtom_40();
  }

  private native byte[] GetBondColorModeAsString_41();
  public String GetBondColorModeAsString()
  {
    return new String(GetBondColorModeAsString_41(), StandardCharsets.UTF_8);
  }

  private native int GetAtomColorMode_42();
  public int GetAtomColorMode()
  {
    return GetAtomColorMode_42();
  }

  private native void SetAtomColorMode_43(int id0);
  public void SetAtomColorMode(int id0)
  {
    SetAtomColorMode_43(id0);
  }

  private native int GetAtomColorModeMinValue_44();
  public int GetAtomColorModeMinValue()
  {
    return GetAtomColorModeMinValue_44();
  }

  private native int GetAtomColorModeMaxValue_45();
  public int GetAtomColorModeMaxValue()
  {
    return GetAtomColorModeMaxValue_45();
  }

  private native byte[]  GetAtomColor_46();
  public byte[]  GetAtomColor()
  {
    return GetAtomColor_46();
  }

  private native void SetAtomColor_47(byte id0,byte id1,byte id2);
  public void SetAtomColor(byte id0,byte id1,byte id2)
  {
    SetAtomColor_47(id0,id1,id2);
  }

  private native byte[]  GetBondColor_48();
  public byte[]  GetBondColor()
  {
    return GetBondColor_48();
  }

  private native void SetBondColor_49(byte id0,byte id1,byte id2);
  public void SetBondColor(byte id0,byte id1,byte id2)
  {
    SetBondColor_49(id0,id1,id2);
  }

  private native float GetBondRadius_50();
  public float GetBondRadius()
  {
    return GetBondRadius_50();
  }

  private native void SetBondRadius_51(float id0);
  public void SetBondRadius(float id0)
  {
    SetBondRadius_51(id0);
  }

  private native byte[]  GetLatticeColor_52();
  public byte[]  GetLatticeColor()
  {
    return GetLatticeColor_52();
  }

  private native void SetLatticeColor_53(byte id0,byte id1,byte id2);
  public void SetLatticeColor(byte id0,byte id1,byte id2)
  {
    SetLatticeColor_53(id0,id1,id2);
  }

  private native void GetSelectedAtomsAndBonds_54(vtkSelection id0,vtkIdTypeArray id1,vtkIdTypeArray id2);
  public void GetSelectedAtomsAndBonds(vtkSelection id0,vtkIdTypeArray id1,vtkIdTypeArray id2)
  {
    GetSelectedAtomsAndBonds_54(id0,id1,id2);
  }

  private native void GetSelectedAtoms_55(vtkSelection id0,vtkIdTypeArray id1);
  public void GetSelectedAtoms(vtkSelection id0,vtkIdTypeArray id1)
  {
    GetSelectedAtoms_55(id0,id1);
  }

  private native void GetSelectedBonds_56(vtkSelection id0,vtkIdTypeArray id1);
  public void GetSelectedBonds(vtkSelection id0,vtkIdTypeArray id1)
  {
    GetSelectedBonds_56(id0,id1);
  }

  private native void Render_57(vtkRenderer id0,vtkActor id1);
  public void Render(vtkRenderer id0,vtkActor id1)
  {
    Render_57(id0,id1);
  }

  private native void ReleaseGraphicsResources_58(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_58(id0);
  }

  private native void GetBounds_59(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_59(id0);
  }

  private native int FillInputPortInformation_60(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_60(id0,id1);
  }

  private native boolean GetSupportsSelection_61();
  public boolean GetSupportsSelection()
  {
    return GetSupportsSelection_61();
  }

  private native byte[] GetAtomicRadiusArrayName_62();
  public String GetAtomicRadiusArrayName()
  {
    return new String(GetAtomicRadiusArrayName_62(), StandardCharsets.UTF_8);
  }

  private native void SetAtomicRadiusArrayName_63(byte[] id0, int len0);
  public void SetAtomicRadiusArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetAtomicRadiusArrayName_63(bytes0, bytes0.length);
  }

  private native void SetMapScalars_64(boolean id0);
  public void SetMapScalars(boolean id0)
  {
    SetMapScalars_64(id0);
  }

  private native long GetPeriodicTable_65();
  public vtkPeriodicTable GetPeriodicTable()
  {
    long temp = GetPeriodicTable_65();

    if (temp == 0) return null;
    return (vtkPeriodicTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkMoleculeMapper() { super(); }

  public vtkMoleculeMapper(long id) { super(id); }
  public native long   VTKInit();

}
