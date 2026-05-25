// java wrapper for vtkHyperTreeGridSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridSource extends vtkHyperTreeGridAlgorithm
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

  private native int GetMaxDepth_4();
  public int GetMaxDepth()
  {
    return GetMaxDepth_4();
  }

  private native void SetMaxDepth_5(int id0);
  public void SetMaxDepth(int id0)
  {
    SetMaxDepth_5(id0);
  }

  private native void SetOrigin_6(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_6(id0,id1,id2);
  }

  private native void SetOrigin_7(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_7(id0);
  }

  private native double[] GetOrigin_8();
  public double[] GetOrigin()
  {
    return GetOrigin_8();
  }

  private native void SetGridScale_9(double id0,double id1,double id2);
  public void SetGridScale(double id0,double id1,double id2)
  {
    SetGridScale_9(id0,id1,id2);
  }

  private native void SetGridScale_10(double id0[]);
  public void SetGridScale(double id0[])
  {
    SetGridScale_10(id0);
  }

  private native double[] GetGridScale_11();
  public double[] GetGridScale()
  {
    return GetGridScale_11();
  }

  private native void SetGridScale_12(double id0);
  public void SetGridScale(double id0)
  {
    SetGridScale_12(id0);
  }

  private native void SetDimensions_13(int id0,int id1,int id2);
  public void SetDimensions(int id0,int id1,int id2)
  {
    SetDimensions_13(id0,id1,id2);
  }

  private native void SetTransposedRootIndexing_14(boolean id0);
  public void SetTransposedRootIndexing(boolean id0)
  {
    SetTransposedRootIndexing_14(id0);
  }

  private native boolean GetTransposedRootIndexing_15();
  public boolean GetTransposedRootIndexing()
  {
    return GetTransposedRootIndexing_15();
  }

  private native void SetIndexingModeToKJI_16();
  public void SetIndexingModeToKJI()
  {
    SetIndexingModeToKJI_16();
  }

  private native void SetIndexingModeToIJK_17();
  public void SetIndexingModeToIJK()
  {
    SetIndexingModeToIJK_17();
  }

  private native int GetOrientation_18();
  public int GetOrientation()
  {
    return GetOrientation_18();
  }

  private native void SetBranchFactor_19(int id0);
  public void SetBranchFactor(int id0)
  {
    SetBranchFactor_19(id0);
  }

  private native int GetBranchFactorMinValue_20();
  public int GetBranchFactorMinValue()
  {
    return GetBranchFactorMinValue_20();
  }

  private native int GetBranchFactorMaxValue_21();
  public int GetBranchFactorMaxValue()
  {
    return GetBranchFactorMaxValue_21();
  }

  private native int GetBranchFactor_22();
  public int GetBranchFactor()
  {
    return GetBranchFactor_22();
  }

  private native void SetUseDescriptor_23(boolean id0);
  public void SetUseDescriptor(boolean id0)
  {
    SetUseDescriptor_23(id0);
  }

  private native boolean GetUseDescriptor_24();
  public boolean GetUseDescriptor()
  {
    return GetUseDescriptor_24();
  }

  private native void UseDescriptorOn_25();
  public void UseDescriptorOn()
  {
    UseDescriptorOn_25();
  }

  private native void UseDescriptorOff_26();
  public void UseDescriptorOff()
  {
    UseDescriptorOff_26();
  }

  private native void SetUseMask_27(boolean id0);
  public void SetUseMask(boolean id0)
  {
    SetUseMask_27(id0);
  }

  private native boolean GetUseMask_28();
  public boolean GetUseMask()
  {
    return GetUseMask_28();
  }

  private native void UseMaskOn_29();
  public void UseMaskOn()
  {
    UseMaskOn_29();
  }

  private native void UseMaskOff_30();
  public void UseMaskOff()
  {
    UseMaskOff_30();
  }

  private native void SetGenerateInterfaceFields_31(boolean id0);
  public void SetGenerateInterfaceFields(boolean id0)
  {
    SetGenerateInterfaceFields_31(id0);
  }

  private native boolean GetGenerateInterfaceFields_32();
  public boolean GetGenerateInterfaceFields()
  {
    return GetGenerateInterfaceFields_32();
  }

  private native void GenerateInterfaceFieldsOn_33();
  public void GenerateInterfaceFieldsOn()
  {
    GenerateInterfaceFieldsOn_33();
  }

  private native void GenerateInterfaceFieldsOff_34();
  public void GenerateInterfaceFieldsOff()
  {
    GenerateInterfaceFieldsOff_34();
  }

  private native void SetDescriptor_35(byte[] id0, int len0);
  public void SetDescriptor(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDescriptor_35(bytes0, bytes0.length);
  }

  private native byte[] GetDescriptor_36();
  public String GetDescriptor()
  {
    return new String(GetDescriptor_36(), StandardCharsets.UTF_8);
  }

  private native void SetMask_37(byte[] id0, int len0);
  public void SetMask(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMask_37(bytes0, bytes0.length);
  }

  private native byte[] GetMask_38();
  public String GetMask()
  {
    return new String(GetMask_38(), StandardCharsets.UTF_8);
  }

  private native void SetDescriptorBits_39(vtkBitArray id0);
  public void SetDescriptorBits(vtkBitArray id0)
  {
    SetDescriptorBits_39(id0);
  }

  private native long GetDescriptorBits_40();
  public vtkBitArray GetDescriptorBits()
  {
    long temp = GetDescriptorBits_40();

    if (temp == 0) return null;
    return (vtkBitArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLevelZeroMaterialIndex_41(vtkIdTypeArray id0);
  public void SetLevelZeroMaterialIndex(vtkIdTypeArray id0)
  {
    SetLevelZeroMaterialIndex_41(id0);
  }

  private native void SetMaskBits_42(vtkBitArray id0);
  public void SetMaskBits(vtkBitArray id0)
  {
    SetMaskBits_42(id0);
  }

  private native long GetMaskBits_43();
  public vtkBitArray GetMaskBits()
  {
    long temp = GetMaskBits_43();

    if (temp == 0) return null;
    return (vtkBitArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetQuadric_44(vtkQuadric id0);
  public void SetQuadric(vtkQuadric id0)
  {
    SetQuadric_44(id0);
  }

  private native long GetQuadric_45();
  public vtkQuadric GetQuadric()
  {
    long temp = GetQuadric_45();

    if (temp == 0) return null;
    return (vtkQuadric)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetQuadricCoefficients_46(double id0[]);
  public void SetQuadricCoefficients(double id0[])
  {
    SetQuadricCoefficients_46(id0);
  }

  private native void GetQuadricCoefficients_47(double id0[]);
  public void GetQuadricCoefficients(double id0[])
  {
    GetQuadricCoefficients_47(id0);
  }

  private native long GetMTime_48();
  public long GetMTime()
  {
    return GetMTime_48();
  }

  private native long ConvertDescriptorStringToBitArray_49(byte[] id0, int len0);
  public vtkBitArray ConvertDescriptorStringToBitArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = ConvertDescriptorStringToBitArray_49(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkBitArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long ConvertMaskStringToBitArray_50(byte[] id0, int len0);
  public vtkBitArray ConvertMaskStringToBitArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = ConvertMaskStringToBitArray_50(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkBitArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkHyperTreeGridSource() { super(); }

  public vtkHyperTreeGridSource(long id) { super(id); }
  public native long   VTKInit();

}
