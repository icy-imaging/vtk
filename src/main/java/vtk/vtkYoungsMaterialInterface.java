// java wrapper for vtkYoungsMaterialInterface object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkYoungsMaterialInterface extends vtkMultiBlockDataSetAlgorithm
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

  private native void SetInverseNormal_4(int id0);
  public void SetInverseNormal(int id0)
  {
    SetInverseNormal_4(id0);
  }

  private native int GetInverseNormal_5();
  public int GetInverseNormal()
  {
    return GetInverseNormal_5();
  }

  private native void InverseNormalOn_6();
  public void InverseNormalOn()
  {
    InverseNormalOn_6();
  }

  private native void InverseNormalOff_7();
  public void InverseNormalOff()
  {
    InverseNormalOff_7();
  }

  private native void SetReverseMaterialOrder_8(int id0);
  public void SetReverseMaterialOrder(int id0)
  {
    SetReverseMaterialOrder_8(id0);
  }

  private native int GetReverseMaterialOrder_9();
  public int GetReverseMaterialOrder()
  {
    return GetReverseMaterialOrder_9();
  }

  private native void ReverseMaterialOrderOn_10();
  public void ReverseMaterialOrderOn()
  {
    ReverseMaterialOrderOn_10();
  }

  private native void ReverseMaterialOrderOff_11();
  public void ReverseMaterialOrderOff()
  {
    ReverseMaterialOrderOff_11();
  }

  private native void SetOnionPeel_12(int id0);
  public void SetOnionPeel(int id0)
  {
    SetOnionPeel_12(id0);
  }

  private native int GetOnionPeel_13();
  public int GetOnionPeel()
  {
    return GetOnionPeel_13();
  }

  private native void OnionPeelOn_14();
  public void OnionPeelOn()
  {
    OnionPeelOn_14();
  }

  private native void OnionPeelOff_15();
  public void OnionPeelOff()
  {
    OnionPeelOff_15();
  }

  private native void SetAxisSymetric_16(int id0);
  public void SetAxisSymetric(int id0)
  {
    SetAxisSymetric_16(id0);
  }

  private native int GetAxisSymetric_17();
  public int GetAxisSymetric()
  {
    return GetAxisSymetric_17();
  }

  private native void AxisSymetricOn_18();
  public void AxisSymetricOn()
  {
    AxisSymetricOn_18();
  }

  private native void AxisSymetricOff_19();
  public void AxisSymetricOff()
  {
    AxisSymetricOff_19();
  }

  private native void SetUseFractionAsDistance_20(int id0);
  public void SetUseFractionAsDistance(int id0)
  {
    SetUseFractionAsDistance_20(id0);
  }

  private native int GetUseFractionAsDistance_21();
  public int GetUseFractionAsDistance()
  {
    return GetUseFractionAsDistance_21();
  }

  private native void UseFractionAsDistanceOn_22();
  public void UseFractionAsDistanceOn()
  {
    UseFractionAsDistanceOn_22();
  }

  private native void UseFractionAsDistanceOff_23();
  public void UseFractionAsDistanceOff()
  {
    UseFractionAsDistanceOff_23();
  }

  private native void SetFillMaterial_24(int id0);
  public void SetFillMaterial(int id0)
  {
    SetFillMaterial_24(id0);
  }

  private native int GetFillMaterial_25();
  public int GetFillMaterial()
  {
    return GetFillMaterial_25();
  }

  private native void FillMaterialOn_26();
  public void FillMaterialOn()
  {
    FillMaterialOn_26();
  }

  private native void FillMaterialOff_27();
  public void FillMaterialOff()
  {
    FillMaterialOff_27();
  }

  private native void SetVolumeFractionRange_28(double id0,double id1);
  public void SetVolumeFractionRange(double id0,double id1)
  {
    SetVolumeFractionRange_28(id0,id1);
  }

  private native void SetVolumeFractionRange_29(double id0[]);
  public void SetVolumeFractionRange(double id0[])
  {
    SetVolumeFractionRange_29(id0);
  }

  private native double[] GetVolumeFractionRange_30();
  public double[] GetVolumeFractionRange()
  {
    return GetVolumeFractionRange_30();
  }

  private native void SetNumberOfMaterials_31(int id0);
  public void SetNumberOfMaterials(int id0)
  {
    SetNumberOfMaterials_31(id0);
  }

  private native int GetNumberOfMaterials_32();
  public int GetNumberOfMaterials()
  {
    return GetNumberOfMaterials_32();
  }

  private native void SetUseAllBlocks_33(boolean id0);
  public void SetUseAllBlocks(boolean id0)
  {
    SetUseAllBlocks_33(id0);
  }

  private native boolean GetUseAllBlocks_34();
  public boolean GetUseAllBlocks()
  {
    return GetUseAllBlocks_34();
  }

  private native void UseAllBlocksOn_35();
  public void UseAllBlocksOn()
  {
    UseAllBlocksOn_35();
  }

  private native void UseAllBlocksOff_36();
  public void UseAllBlocksOff()
  {
    UseAllBlocksOff_36();
  }

  private native int GetNumberOfDomains_37();
  public int GetNumberOfDomains()
  {
    return GetNumberOfDomains_37();
  }

  private native void SetMaterialArrays_38(int id0,byte[] id1, int len1,byte[] id2, int len2,byte[] id3, int len3,byte[] id4, int len4,byte[] id5, int len5);
  public void SetMaterialArrays(int id0,String id1,String id2,String id3,String id4,String id5)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    byte[] bytes4 = id4.getBytes(StandardCharsets.UTF_8);
    byte[] bytes5 = id5.getBytes(StandardCharsets.UTF_8);
    SetMaterialArrays_38(id0,bytes1, bytes1.length,bytes2, bytes2.length,bytes3, bytes3.length,bytes4, bytes4.length,bytes5, bytes5.length);
  }

  private native void SetMaterialArrays_39(int id0,byte[] id1, int len1,byte[] id2, int len2,byte[] id3, int len3);
  public void SetMaterialArrays(int id0,String id1,String id2,String id3)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    SetMaterialArrays_39(id0,bytes1, bytes1.length,bytes2, bytes2.length,bytes3, bytes3.length);
  }

  private native void SetMaterialVolumeFractionArray_40(int id0,byte[] id1, int len1);
  public void SetMaterialVolumeFractionArray(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetMaterialVolumeFractionArray_40(id0,bytes1, bytes1.length);
  }

  private native void SetMaterialNormalArray_41(int id0,byte[] id1, int len1);
  public void SetMaterialNormalArray(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetMaterialNormalArray_41(id0,bytes1, bytes1.length);
  }

  private native void SetMaterialOrderingArray_42(int id0,byte[] id1, int len1);
  public void SetMaterialOrderingArray(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetMaterialOrderingArray_42(id0,bytes1, bytes1.length);
  }

  private native void RemoveAllMaterials_43();
  public void RemoveAllMaterials()
  {
    RemoveAllMaterials_43();
  }

  private native void SetMaterialNormalArray_44(byte[] id0, int len0,byte[] id1, int len1);
  public void SetMaterialNormalArray(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetMaterialNormalArray_44(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void SetMaterialOrderingArray_45(byte[] id0, int len0,byte[] id1, int len1);
  public void SetMaterialOrderingArray(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetMaterialOrderingArray_45(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void RemoveAllMaterialBlockMappings_46();
  public void RemoveAllMaterialBlockMappings()
  {
    RemoveAllMaterialBlockMappings_46();
  }

  private native void AddMaterialBlockMapping_47(int id0);
  public void AddMaterialBlockMapping(int id0)
  {
    AddMaterialBlockMapping_47(id0);
  }

  public vtkYoungsMaterialInterface() { super(); }

  public vtkYoungsMaterialInterface(long id) { super(id); }
  public native long   VTKInit();

}
