// java wrapper for vtkRandomAttributeGenerator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRandomAttributeGenerator extends vtkPassInputTypeAlgorithm
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

  private native void SetDataType_4(int id0);
  public void SetDataType(int id0)
  {
    SetDataType_4(id0);
  }

  private native void SetDataTypeToBit_5();
  public void SetDataTypeToBit()
  {
    SetDataTypeToBit_5();
  }

  private native void SetDataTypeToChar_6();
  public void SetDataTypeToChar()
  {
    SetDataTypeToChar_6();
  }

  private native void SetDataTypeToUnsignedChar_7();
  public void SetDataTypeToUnsignedChar()
  {
    SetDataTypeToUnsignedChar_7();
  }

  private native void SetDataTypeToShort_8();
  public void SetDataTypeToShort()
  {
    SetDataTypeToShort_8();
  }

  private native void SetDataTypeToUnsignedShort_9();
  public void SetDataTypeToUnsignedShort()
  {
    SetDataTypeToUnsignedShort_9();
  }

  private native void SetDataTypeToInt_10();
  public void SetDataTypeToInt()
  {
    SetDataTypeToInt_10();
  }

  private native void SetDataTypeToUnsignedInt_11();
  public void SetDataTypeToUnsignedInt()
  {
    SetDataTypeToUnsignedInt_11();
  }

  private native void SetDataTypeToLong_12();
  public void SetDataTypeToLong()
  {
    SetDataTypeToLong_12();
  }

  private native void SetDataTypeToLongLong_13();
  public void SetDataTypeToLongLong()
  {
    SetDataTypeToLongLong_13();
  }

  private native void SetDataTypeToUnsignedLong_14();
  public void SetDataTypeToUnsignedLong()
  {
    SetDataTypeToUnsignedLong_14();
  }

  private native void SetDataTypeToUnsignedLongLong_15();
  public void SetDataTypeToUnsignedLongLong()
  {
    SetDataTypeToUnsignedLongLong_15();
  }

  private native void SetDataTypeToIdType_16();
  public void SetDataTypeToIdType()
  {
    SetDataTypeToIdType_16();
  }

  private native void SetDataTypeToFloat_17();
  public void SetDataTypeToFloat()
  {
    SetDataTypeToFloat_17();
  }

  private native void SetDataTypeToDouble_18();
  public void SetDataTypeToDouble()
  {
    SetDataTypeToDouble_18();
  }

  private native int GetDataType_19();
  public int GetDataType()
  {
    return GetDataType_19();
  }

  private native void SetNumberOfComponents_20(int id0);
  public void SetNumberOfComponents(int id0)
  {
    SetNumberOfComponents_20(id0);
  }

  private native int GetNumberOfComponentsMinValue_21();
  public int GetNumberOfComponentsMinValue()
  {
    return GetNumberOfComponentsMinValue_21();
  }

  private native int GetNumberOfComponentsMaxValue_22();
  public int GetNumberOfComponentsMaxValue()
  {
    return GetNumberOfComponentsMaxValue_22();
  }

  private native int GetNumberOfComponents_23();
  public int GetNumberOfComponents()
  {
    return GetNumberOfComponents_23();
  }

  private native void SetMinimumComponentValue_24(double id0);
  public void SetMinimumComponentValue(double id0)
  {
    SetMinimumComponentValue_24(id0);
  }

  private native double GetMinimumComponentValue_25();
  public double GetMinimumComponentValue()
  {
    return GetMinimumComponentValue_25();
  }

  private native void SetComponentRange_26(double id0,double id1);
  public void SetComponentRange(double id0,double id1)
  {
    SetComponentRange_26(id0,id1);
  }

  private native void SetMaximumComponentValue_27(double id0);
  public void SetMaximumComponentValue(double id0)
  {
    SetMaximumComponentValue_27(id0);
  }

  private native double GetMaximumComponentValue_28();
  public double GetMaximumComponentValue()
  {
    return GetMaximumComponentValue_28();
  }

  private native void SetNumberOfTuples_29(long id0);
  public void SetNumberOfTuples(long id0)
  {
    SetNumberOfTuples_29(id0);
  }

  private native long GetNumberOfTuplesMinValue_30();
  public long GetNumberOfTuplesMinValue()
  {
    return GetNumberOfTuplesMinValue_30();
  }

  private native long GetNumberOfTuplesMaxValue_31();
  public long GetNumberOfTuplesMaxValue()
  {
    return GetNumberOfTuplesMaxValue_31();
  }

  private native long GetNumberOfTuples_32();
  public long GetNumberOfTuples()
  {
    return GetNumberOfTuples_32();
  }

  private native void SetGeneratePointScalars_33(int id0);
  public void SetGeneratePointScalars(int id0)
  {
    SetGeneratePointScalars_33(id0);
  }

  private native int GetGeneratePointScalars_34();
  public int GetGeneratePointScalars()
  {
    return GetGeneratePointScalars_34();
  }

  private native void GeneratePointScalarsOn_35();
  public void GeneratePointScalarsOn()
  {
    GeneratePointScalarsOn_35();
  }

  private native void GeneratePointScalarsOff_36();
  public void GeneratePointScalarsOff()
  {
    GeneratePointScalarsOff_36();
  }

  private native void SetGeneratePointVectors_37(int id0);
  public void SetGeneratePointVectors(int id0)
  {
    SetGeneratePointVectors_37(id0);
  }

  private native int GetGeneratePointVectors_38();
  public int GetGeneratePointVectors()
  {
    return GetGeneratePointVectors_38();
  }

  private native void GeneratePointVectorsOn_39();
  public void GeneratePointVectorsOn()
  {
    GeneratePointVectorsOn_39();
  }

  private native void GeneratePointVectorsOff_40();
  public void GeneratePointVectorsOff()
  {
    GeneratePointVectorsOff_40();
  }

  private native void SetGeneratePointNormals_41(int id0);
  public void SetGeneratePointNormals(int id0)
  {
    SetGeneratePointNormals_41(id0);
  }

  private native int GetGeneratePointNormals_42();
  public int GetGeneratePointNormals()
  {
    return GetGeneratePointNormals_42();
  }

  private native void GeneratePointNormalsOn_43();
  public void GeneratePointNormalsOn()
  {
    GeneratePointNormalsOn_43();
  }

  private native void GeneratePointNormalsOff_44();
  public void GeneratePointNormalsOff()
  {
    GeneratePointNormalsOff_44();
  }

  private native void SetGeneratePointTensors_45(int id0);
  public void SetGeneratePointTensors(int id0)
  {
    SetGeneratePointTensors_45(id0);
  }

  private native int GetGeneratePointTensors_46();
  public int GetGeneratePointTensors()
  {
    return GetGeneratePointTensors_46();
  }

  private native void GeneratePointTensorsOn_47();
  public void GeneratePointTensorsOn()
  {
    GeneratePointTensorsOn_47();
  }

  private native void GeneratePointTensorsOff_48();
  public void GeneratePointTensorsOff()
  {
    GeneratePointTensorsOff_48();
  }

  private native void SetGeneratePointTCoords_49(int id0);
  public void SetGeneratePointTCoords(int id0)
  {
    SetGeneratePointTCoords_49(id0);
  }

  private native int GetGeneratePointTCoords_50();
  public int GetGeneratePointTCoords()
  {
    return GetGeneratePointTCoords_50();
  }

  private native void GeneratePointTCoordsOn_51();
  public void GeneratePointTCoordsOn()
  {
    GeneratePointTCoordsOn_51();
  }

  private native void GeneratePointTCoordsOff_52();
  public void GeneratePointTCoordsOff()
  {
    GeneratePointTCoordsOff_52();
  }

  private native void SetGeneratePointArray_53(int id0);
  public void SetGeneratePointArray(int id0)
  {
    SetGeneratePointArray_53(id0);
  }

  private native int GetGeneratePointArray_54();
  public int GetGeneratePointArray()
  {
    return GetGeneratePointArray_54();
  }

  private native void GeneratePointArrayOn_55();
  public void GeneratePointArrayOn()
  {
    GeneratePointArrayOn_55();
  }

  private native void GeneratePointArrayOff_56();
  public void GeneratePointArrayOff()
  {
    GeneratePointArrayOff_56();
  }

  private native void SetGenerateCellScalars_57(int id0);
  public void SetGenerateCellScalars(int id0)
  {
    SetGenerateCellScalars_57(id0);
  }

  private native int GetGenerateCellScalars_58();
  public int GetGenerateCellScalars()
  {
    return GetGenerateCellScalars_58();
  }

  private native void GenerateCellScalarsOn_59();
  public void GenerateCellScalarsOn()
  {
    GenerateCellScalarsOn_59();
  }

  private native void GenerateCellScalarsOff_60();
  public void GenerateCellScalarsOff()
  {
    GenerateCellScalarsOff_60();
  }

  private native void SetGenerateCellVectors_61(int id0);
  public void SetGenerateCellVectors(int id0)
  {
    SetGenerateCellVectors_61(id0);
  }

  private native int GetGenerateCellVectors_62();
  public int GetGenerateCellVectors()
  {
    return GetGenerateCellVectors_62();
  }

  private native void GenerateCellVectorsOn_63();
  public void GenerateCellVectorsOn()
  {
    GenerateCellVectorsOn_63();
  }

  private native void GenerateCellVectorsOff_64();
  public void GenerateCellVectorsOff()
  {
    GenerateCellVectorsOff_64();
  }

  private native void SetGenerateCellNormals_65(int id0);
  public void SetGenerateCellNormals(int id0)
  {
    SetGenerateCellNormals_65(id0);
  }

  private native int GetGenerateCellNormals_66();
  public int GetGenerateCellNormals()
  {
    return GetGenerateCellNormals_66();
  }

  private native void GenerateCellNormalsOn_67();
  public void GenerateCellNormalsOn()
  {
    GenerateCellNormalsOn_67();
  }

  private native void GenerateCellNormalsOff_68();
  public void GenerateCellNormalsOff()
  {
    GenerateCellNormalsOff_68();
  }

  private native void SetGenerateCellTensors_69(int id0);
  public void SetGenerateCellTensors(int id0)
  {
    SetGenerateCellTensors_69(id0);
  }

  private native int GetGenerateCellTensors_70();
  public int GetGenerateCellTensors()
  {
    return GetGenerateCellTensors_70();
  }

  private native void GenerateCellTensorsOn_71();
  public void GenerateCellTensorsOn()
  {
    GenerateCellTensorsOn_71();
  }

  private native void GenerateCellTensorsOff_72();
  public void GenerateCellTensorsOff()
  {
    GenerateCellTensorsOff_72();
  }

  private native void SetGenerateCellTCoords_73(int id0);
  public void SetGenerateCellTCoords(int id0)
  {
    SetGenerateCellTCoords_73(id0);
  }

  private native int GetGenerateCellTCoords_74();
  public int GetGenerateCellTCoords()
  {
    return GetGenerateCellTCoords_74();
  }

  private native void GenerateCellTCoordsOn_75();
  public void GenerateCellTCoordsOn()
  {
    GenerateCellTCoordsOn_75();
  }

  private native void GenerateCellTCoordsOff_76();
  public void GenerateCellTCoordsOff()
  {
    GenerateCellTCoordsOff_76();
  }

  private native void SetGenerateCellArray_77(int id0);
  public void SetGenerateCellArray(int id0)
  {
    SetGenerateCellArray_77(id0);
  }

  private native int GetGenerateCellArray_78();
  public int GetGenerateCellArray()
  {
    return GetGenerateCellArray_78();
  }

  private native void GenerateCellArrayOn_79();
  public void GenerateCellArrayOn()
  {
    GenerateCellArrayOn_79();
  }

  private native void GenerateCellArrayOff_80();
  public void GenerateCellArrayOff()
  {
    GenerateCellArrayOff_80();
  }

  private native void SetGenerateFieldArray_81(int id0);
  public void SetGenerateFieldArray(int id0)
  {
    SetGenerateFieldArray_81(id0);
  }

  private native int GetGenerateFieldArray_82();
  public int GetGenerateFieldArray()
  {
    return GetGenerateFieldArray_82();
  }

  private native void GenerateFieldArrayOn_83();
  public void GenerateFieldArrayOn()
  {
    GenerateFieldArrayOn_83();
  }

  private native void GenerateFieldArrayOff_84();
  public void GenerateFieldArrayOff()
  {
    GenerateFieldArrayOff_84();
  }

  private native void SetAttributesConstantPerBlock_85(boolean id0);
  public void SetAttributesConstantPerBlock(boolean id0)
  {
    SetAttributesConstantPerBlock_85(id0);
  }

  private native boolean GetAttributesConstantPerBlock_86();
  public boolean GetAttributesConstantPerBlock()
  {
    return GetAttributesConstantPerBlock_86();
  }

  private native void AttributesConstantPerBlockOn_87();
  public void AttributesConstantPerBlockOn()
  {
    AttributesConstantPerBlockOn_87();
  }

  private native void AttributesConstantPerBlockOff_88();
  public void AttributesConstantPerBlockOff()
  {
    AttributesConstantPerBlockOff_88();
  }

  private native void GenerateAllPointDataOn_89();
  public void GenerateAllPointDataOn()
  {
    GenerateAllPointDataOn_89();
  }

  private native void GenerateAllPointDataOff_90();
  public void GenerateAllPointDataOff()
  {
    GenerateAllPointDataOff_90();
  }

  private native void GenerateAllCellDataOn_91();
  public void GenerateAllCellDataOn()
  {
    GenerateAllCellDataOn_91();
  }

  private native void GenerateAllCellDataOff_92();
  public void GenerateAllCellDataOff()
  {
    GenerateAllCellDataOff_92();
  }

  private native void GenerateAllDataOn_93();
  public void GenerateAllDataOn()
  {
    GenerateAllDataOn_93();
  }

  private native void GenerateAllDataOff_94();
  public void GenerateAllDataOff()
  {
    GenerateAllDataOff_94();
  }

  public vtkRandomAttributeGenerator() { super(); }

  public vtkRandomAttributeGenerator(long id) { super(id); }
  public native long   VTKInit();

}
