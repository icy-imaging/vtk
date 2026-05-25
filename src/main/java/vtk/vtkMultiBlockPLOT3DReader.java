// java wrapper for vtkMultiBlockPLOT3DReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMultiBlockPLOT3DReader extends vtkParallelReader
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

  private native long GetOutput_4();
  public vtkMultiBlockDataSet GetOutput()
  {
    long temp = GetOutput_4();

    if (temp == 0) return null;
    return (vtkMultiBlockDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_5(int id0);
  public vtkMultiBlockDataSet GetOutput(int id0)
  {
    long temp = GetOutput_5(id0);

    if (temp == 0) return null;
    return (vtkMultiBlockDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFileName_6(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_6(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_7();
  public String GetFileName()
  {
    return new String(GetFileName_7(), StandardCharsets.UTF_8);
  }

  private native byte[] GetFileName_8(int id0);
  public String GetFileName(int id0)
  {
    return new String(GetFileName_8(id0), StandardCharsets.UTF_8);
  }

  private native void SetXYZFileName_9(byte[] id0, int len0);
  public void SetXYZFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetXYZFileName_9(bytes0, bytes0.length);
  }

  private native byte[] GetXYZFileName_10();
  public String GetXYZFileName()
  {
    return new String(GetXYZFileName_10(), StandardCharsets.UTF_8);
  }

  private native void SetQFileName_11(byte[] id0, int len0);
  public void SetQFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetQFileName_11(bytes0, bytes0.length);
  }

  private native byte[] GetQFileName_12();
  public String GetQFileName()
  {
    return new String(GetQFileName_12(), StandardCharsets.UTF_8);
  }

  private native void SetFunctionFileName_13(byte[] id0, int len0);
  public void SetFunctionFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFunctionFileName_13(bytes0, bytes0.length);
  }

  private native byte[] GetFunctionFileName_14();
  public String GetFunctionFileName()
  {
    return new String(GetFunctionFileName_14(), StandardCharsets.UTF_8);
  }

  private native void SetAutoDetectFormat_15(int id0);
  public void SetAutoDetectFormat(int id0)
  {
    SetAutoDetectFormat_15(id0);
  }

  private native int GetAutoDetectFormat_16();
  public int GetAutoDetectFormat()
  {
    return GetAutoDetectFormat_16();
  }

  private native void AutoDetectFormatOn_17();
  public void AutoDetectFormatOn()
  {
    AutoDetectFormatOn_17();
  }

  private native void AutoDetectFormatOff_18();
  public void AutoDetectFormatOff()
  {
    AutoDetectFormatOff_18();
  }

  private native void SetBinaryFile_19(int id0);
  public void SetBinaryFile(int id0)
  {
    SetBinaryFile_19(id0);
  }

  private native int GetBinaryFile_20();
  public int GetBinaryFile()
  {
    return GetBinaryFile_20();
  }

  private native void BinaryFileOn_21();
  public void BinaryFileOn()
  {
    BinaryFileOn_21();
  }

  private native void BinaryFileOff_22();
  public void BinaryFileOff()
  {
    BinaryFileOff_22();
  }

  private native void SetMultiGrid_23(int id0);
  public void SetMultiGrid(int id0)
  {
    SetMultiGrid_23(id0);
  }

  private native int GetMultiGrid_24();
  public int GetMultiGrid()
  {
    return GetMultiGrid_24();
  }

  private native void MultiGridOn_25();
  public void MultiGridOn()
  {
    MultiGridOn_25();
  }

  private native void MultiGridOff_26();
  public void MultiGridOff()
  {
    MultiGridOff_26();
  }

  private native void SetHasByteCount_27(int id0);
  public void SetHasByteCount(int id0)
  {
    SetHasByteCount_27(id0);
  }

  private native int GetHasByteCount_28();
  public int GetHasByteCount()
  {
    return GetHasByteCount_28();
  }

  private native void HasByteCountOn_29();
  public void HasByteCountOn()
  {
    HasByteCountOn_29();
  }

  private native void HasByteCountOff_30();
  public void HasByteCountOff()
  {
    HasByteCountOff_30();
  }

  private native void SetIBlanking_31(int id0);
  public void SetIBlanking(int id0)
  {
    SetIBlanking_31(id0);
  }

  private native int GetIBlanking_32();
  public int GetIBlanking()
  {
    return GetIBlanking_32();
  }

  private native void IBlankingOn_33();
  public void IBlankingOn()
  {
    IBlankingOn_33();
  }

  private native void IBlankingOff_34();
  public void IBlankingOff()
  {
    IBlankingOff_34();
  }

  private native void SetTwoDimensionalGeometry_35(int id0);
  public void SetTwoDimensionalGeometry(int id0)
  {
    SetTwoDimensionalGeometry_35(id0);
  }

  private native int GetTwoDimensionalGeometry_36();
  public int GetTwoDimensionalGeometry()
  {
    return GetTwoDimensionalGeometry_36();
  }

  private native void TwoDimensionalGeometryOn_37();
  public void TwoDimensionalGeometryOn()
  {
    TwoDimensionalGeometryOn_37();
  }

  private native void TwoDimensionalGeometryOff_38();
  public void TwoDimensionalGeometryOff()
  {
    TwoDimensionalGeometryOff_38();
  }

  private native void SetDoublePrecision_39(int id0);
  public void SetDoublePrecision(int id0)
  {
    SetDoublePrecision_39(id0);
  }

  private native int GetDoublePrecision_40();
  public int GetDoublePrecision()
  {
    return GetDoublePrecision_40();
  }

  private native void DoublePrecisionOn_41();
  public void DoublePrecisionOn()
  {
    DoublePrecisionOn_41();
  }

  private native void DoublePrecisionOff_42();
  public void DoublePrecisionOff()
  {
    DoublePrecisionOff_42();
  }

  private native void SetForceRead_43(int id0);
  public void SetForceRead(int id0)
  {
    SetForceRead_43(id0);
  }

  private native int GetForceRead_44();
  public int GetForceRead()
  {
    return GetForceRead_44();
  }

  private native void ForceReadOn_45();
  public void ForceReadOn()
  {
    ForceReadOn_45();
  }

  private native void ForceReadOff_46();
  public void ForceReadOff()
  {
    ForceReadOff_46();
  }

  private native void SetByteOrderToBigEndian_47();
  public void SetByteOrderToBigEndian()
  {
    SetByteOrderToBigEndian_47();
  }

  private native void SetByteOrderToLittleEndian_48();
  public void SetByteOrderToLittleEndian()
  {
    SetByteOrderToLittleEndian_48();
  }

  private native void SetByteOrder_49(int id0);
  public void SetByteOrder(int id0)
  {
    SetByteOrder_49(id0);
  }

  private native int GetByteOrder_50();
  public int GetByteOrder()
  {
    return GetByteOrder_50();
  }

  private native byte[] GetByteOrderAsString_51();
  public String GetByteOrderAsString()
  {
    return new String(GetByteOrderAsString_51(), StandardCharsets.UTF_8);
  }

  private native void SetR_52(double id0);
  public void SetR(double id0)
  {
    SetR_52(id0);
  }

  private native double GetR_53();
  public double GetR()
  {
    return GetR_53();
  }

  private native void SetGamma_54(double id0);
  public void SetGamma(double id0)
  {
    SetGamma_54(id0);
  }

  private native double GetGamma_55();
  public double GetGamma()
  {
    return GetGamma_55();
  }

  private native void SetPreserveIntermediateFunctions_56(boolean id0);
  public void SetPreserveIntermediateFunctions(boolean id0)
  {
    SetPreserveIntermediateFunctions_56(id0);
  }

  private native boolean GetPreserveIntermediateFunctions_57();
  public boolean GetPreserveIntermediateFunctions()
  {
    return GetPreserveIntermediateFunctions_57();
  }

  private native void PreserveIntermediateFunctionsOn_58();
  public void PreserveIntermediateFunctionsOn()
  {
    PreserveIntermediateFunctionsOn_58();
  }

  private native void PreserveIntermediateFunctionsOff_59();
  public void PreserveIntermediateFunctionsOff()
  {
    PreserveIntermediateFunctionsOff_59();
  }

  private native void SetScalarFunctionNumber_60(int id0);
  public void SetScalarFunctionNumber(int id0)
  {
    SetScalarFunctionNumber_60(id0);
  }

  private native int GetScalarFunctionNumber_61();
  public int GetScalarFunctionNumber()
  {
    return GetScalarFunctionNumber_61();
  }

  private native void SetVectorFunctionNumber_62(int id0);
  public void SetVectorFunctionNumber(int id0)
  {
    SetVectorFunctionNumber_62(id0);
  }

  private native int GetVectorFunctionNumber_63();
  public int GetVectorFunctionNumber()
  {
    return GetVectorFunctionNumber_63();
  }

  private native void AddFunction_64(int id0);
  public void AddFunction(int id0)
  {
    AddFunction_64(id0);
  }

  private native void RemoveFunction_65(int id0);
  public void RemoveFunction(int id0)
  {
    RemoveFunction_65(id0);
  }

  private native void RemoveAllFunctions_66();
  public void RemoveAllFunctions()
  {
    RemoveAllFunctions_66();
  }

  private native int CanReadBinaryFile_67(byte[] id0, int len0);
  public int CanReadBinaryFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadBinaryFile_67(bytes0, bytes0.length);
  }

  private native void SetController_68(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_68(id0);
  }

  private native long GetController_69();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_69();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void AddFunctionName_70(byte[] id0, int len0);
  public void AddFunctionName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddFunctionName_70(bytes0, bytes0.length);
  }

  private native int ReadMetaData_71(vtkInformation id0);
  public int ReadMetaData(vtkInformation id0)
  {
    return ReadMetaData_71(id0);
  }

  private native int ReadMesh_72(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadMesh(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadMesh_72(id0,id1,id2,id3,id4);
  }

  private native int ReadPoints_73(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadPoints(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadPoints_73(id0,id1,id2,id3,id4);
  }

  private native int ReadArrays_74(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadArrays(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadArrays_74(id0,id1,id2,id3,id4);
  }

  public vtkMultiBlockPLOT3DReader() { super(); }

  public vtkMultiBlockPLOT3DReader(long id) { super(id); }
  public native long   VTKInit();

}
