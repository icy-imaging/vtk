// java wrapper for vtkGenericEnSightReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericEnSightReader extends vtkMultiBlockDataSetAlgorithm
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

  private native void SetCaseFileName_4(byte[] id0, int len0);
  public void SetCaseFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCaseFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetCaseFileName_5();
  public String GetCaseFileName()
  {
    return new String(GetCaseFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetFilePath_6(byte[] id0, int len0);
  public void SetFilePath(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFilePath_6(bytes0, bytes0.length);
  }

  private native byte[] GetFilePath_7();
  public String GetFilePath()
  {
    return new String(GetFilePath_7(), StandardCharsets.UTF_8);
  }

  private native int GetEnSightVersion_8();
  public int GetEnSightVersion()
  {
    return GetEnSightVersion_8();
  }

  private native int GetNumberOfVariables_9();
  public int GetNumberOfVariables()
  {
    return GetNumberOfVariables_9();
  }

  private native int GetNumberOfComplexVariables_10();
  public int GetNumberOfComplexVariables()
  {
    return GetNumberOfComplexVariables_10();
  }

  private native int GetNumberOfVariables_11(int id0);
  public int GetNumberOfVariables(int id0)
  {
    return GetNumberOfVariables_11(id0);
  }

  private native int GetNumberOfScalarsPerNode_12();
  public int GetNumberOfScalarsPerNode()
  {
    return GetNumberOfScalarsPerNode_12();
  }

  private native int GetNumberOfVectorsPerNode_13();
  public int GetNumberOfVectorsPerNode()
  {
    return GetNumberOfVectorsPerNode_13();
  }

  private native int GetNumberOfTensorsAsymPerNode_14();
  public int GetNumberOfTensorsAsymPerNode()
  {
    return GetNumberOfTensorsAsymPerNode_14();
  }

  private native int GetNumberOfTensorsSymmPerNode_15();
  public int GetNumberOfTensorsSymmPerNode()
  {
    return GetNumberOfTensorsSymmPerNode_15();
  }

  private native int GetNumberOfScalarsPerElement_16();
  public int GetNumberOfScalarsPerElement()
  {
    return GetNumberOfScalarsPerElement_16();
  }

  private native int GetNumberOfVectorsPerElement_17();
  public int GetNumberOfVectorsPerElement()
  {
    return GetNumberOfVectorsPerElement_17();
  }

  private native int GetNumberOfTensorsAsymPerElement_18();
  public int GetNumberOfTensorsAsymPerElement()
  {
    return GetNumberOfTensorsAsymPerElement_18();
  }

  private native int GetNumberOfTensorsSymmPerElement_19();
  public int GetNumberOfTensorsSymmPerElement()
  {
    return GetNumberOfTensorsSymmPerElement_19();
  }

  private native int GetNumberOfScalarsPerMeasuredNode_20();
  public int GetNumberOfScalarsPerMeasuredNode()
  {
    return GetNumberOfScalarsPerMeasuredNode_20();
  }

  private native int GetNumberOfVectorsPerMeasuredNode_21();
  public int GetNumberOfVectorsPerMeasuredNode()
  {
    return GetNumberOfVectorsPerMeasuredNode_21();
  }

  private native int GetNumberOfComplexScalarsPerNode_22();
  public int GetNumberOfComplexScalarsPerNode()
  {
    return GetNumberOfComplexScalarsPerNode_22();
  }

  private native int GetNumberOfComplexVectorsPerNode_23();
  public int GetNumberOfComplexVectorsPerNode()
  {
    return GetNumberOfComplexVectorsPerNode_23();
  }

  private native int GetNumberOfComplexScalarsPerElement_24();
  public int GetNumberOfComplexScalarsPerElement()
  {
    return GetNumberOfComplexScalarsPerElement_24();
  }

  private native int GetNumberOfComplexVectorsPerElement_25();
  public int GetNumberOfComplexVectorsPerElement()
  {
    return GetNumberOfComplexVectorsPerElement_25();
  }

  private native byte[] GetDescription_26(int id0);
  public String GetDescription(int id0)
  {
    return new String(GetDescription_26(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetComplexDescription_27(int id0);
  public String GetComplexDescription(int id0)
  {
    return new String(GetComplexDescription_27(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetDescription_28(int id0,int id1);
  public String GetDescription(int id0,int id1)
  {
    return new String(GetDescription_28(id0,id1), StandardCharsets.UTF_8);
  }

  private native int GetVariableType_29(int id0);
  public int GetVariableType(int id0)
  {
    return GetVariableType_29(id0);
  }

  private native int GetComplexVariableType_30(int id0);
  public int GetComplexVariableType(int id0)
  {
    return GetComplexVariableType_30(id0);
  }

  private native void SetTimeValue_31(double id0);
  public void SetTimeValue(double id0)
  {
    SetTimeValue_31(id0);
  }

  private native double GetTimeValue_32();
  public double GetTimeValue()
  {
    return GetTimeValue_32();
  }

  private native double GetMinimumTimeValue_33();
  public double GetMinimumTimeValue()
  {
    return GetMinimumTimeValue_33();
  }

  private native double GetMaximumTimeValue_34();
  public double GetMaximumTimeValue()
  {
    return GetMaximumTimeValue_34();
  }

  private native long GetTimeSets_35();
  public vtkDataArrayCollection GetTimeSets()
  {
    long temp = GetTimeSets_35();

    if (temp == 0) return null;
    return (vtkDataArrayCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int DetermineEnSightVersion_36(int id0);
  public int DetermineEnSightVersion(int id0)
  {
    return DetermineEnSightVersion_36(id0);
  }

  private native void ReadAllVariablesOn_37();
  public void ReadAllVariablesOn()
  {
    ReadAllVariablesOn_37();
  }

  private native void ReadAllVariablesOff_38();
  public void ReadAllVariablesOff()
  {
    ReadAllVariablesOff_38();
  }

  private native void SetReadAllVariables_39(int id0);
  public void SetReadAllVariables(int id0)
  {
    SetReadAllVariables_39(id0);
  }

  private native int GetReadAllVariables_40();
  public int GetReadAllVariables()
  {
    return GetReadAllVariables_40();
  }

  private native long GetPointDataArraySelection_41();
  public vtkDataArraySelection GetPointDataArraySelection()
  {
    long temp = GetPointDataArraySelection_41();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellDataArraySelection_42();
  public vtkDataArraySelection GetCellDataArraySelection()
  {
    long temp = GetCellDataArraySelection_42();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfPointArrays_43();
  public int GetNumberOfPointArrays()
  {
    return GetNumberOfPointArrays_43();
  }

  private native int GetNumberOfCellArrays_44();
  public int GetNumberOfCellArrays()
  {
    return GetNumberOfCellArrays_44();
  }

  private native byte[] GetPointArrayName_45(int id0);
  public String GetPointArrayName(int id0)
  {
    return new String(GetPointArrayName_45(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetCellArrayName_46(int id0);
  public String GetCellArrayName(int id0)
  {
    return new String(GetCellArrayName_46(id0), StandardCharsets.UTF_8);
  }

  private native int GetPointArrayStatus_47(byte[] id0, int len0);
  public int GetPointArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPointArrayStatus_47(bytes0, bytes0.length);
  }

  private native int GetCellArrayStatus_48(byte[] id0, int len0);
  public int GetCellArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetCellArrayStatus_48(bytes0, bytes0.length);
  }

  private native void SetPointArrayStatus_49(byte[] id0, int len0,int id1);
  public void SetPointArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointArrayStatus_49(bytes0, bytes0.length,id1);
  }

  private native void SetCellArrayStatus_50(byte[] id0, int len0,int id1);
  public void SetCellArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellArrayStatus_50(bytes0, bytes0.length,id1);
  }

  private native void SetByteOrderToBigEndian_51();
  public void SetByteOrderToBigEndian()
  {
    SetByteOrderToBigEndian_51();
  }

  private native void SetByteOrderToLittleEndian_52();
  public void SetByteOrderToLittleEndian()
  {
    SetByteOrderToLittleEndian_52();
  }

  private native void SetByteOrder_53(int id0);
  public void SetByteOrder(int id0)
  {
    SetByteOrder_53(id0);
  }

  private native int GetByteOrder_54();
  public int GetByteOrder()
  {
    return GetByteOrder_54();
  }

  private native byte[] GetByteOrderAsString_55();
  public String GetByteOrderAsString()
  {
    return new String(GetByteOrderAsString_55(), StandardCharsets.UTF_8);
  }

  private native byte[] GetGeometryFileName_56();
  public String GetGeometryFileName()
  {
    return new String(GetGeometryFileName_56(), StandardCharsets.UTF_8);
  }

  private native void SetParticleCoordinatesByIndex_57(int id0);
  public void SetParticleCoordinatesByIndex(int id0)
  {
    SetParticleCoordinatesByIndex_57(id0);
  }

  private native int GetParticleCoordinatesByIndex_58();
  public int GetParticleCoordinatesByIndex()
  {
    return GetParticleCoordinatesByIndex_58();
  }

  private native void ParticleCoordinatesByIndexOn_59();
  public void ParticleCoordinatesByIndexOn()
  {
    ParticleCoordinatesByIndexOn_59();
  }

  private native void ParticleCoordinatesByIndexOff_60();
  public void ParticleCoordinatesByIndexOff()
  {
    ParticleCoordinatesByIndexOff_60();
  }

  private native boolean IsEnSightFile_61(byte[] id0, int len0);
  public boolean IsEnSightFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsEnSightFile_61(bytes0, bytes0.length);
  }

  private native int CanReadFile_62(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_62(bytes0, bytes0.length);
  }

  private native long GetReader_63();
  public vtkGenericEnSightReader GetReader()
  {
    long temp = GetReader_63();

    if (temp == 0) return null;
    return (vtkGenericEnSightReader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetApplyTetrahedralize_64();
  public boolean GetApplyTetrahedralize()
  {
    return GetApplyTetrahedralize_64();
  }

  private native void SetApplyTetrahedralize_65(boolean id0);
  public void SetApplyTetrahedralize(boolean id0)
  {
    SetApplyTetrahedralize_65(id0);
  }

  public vtkGenericEnSightReader() { super(); }

  public vtkGenericEnSightReader(long id) { super(id); }
  public native long   VTKInit();

}
