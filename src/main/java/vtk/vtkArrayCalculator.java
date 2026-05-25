// java wrapper for vtkArrayCalculator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkArrayCalculator extends vtkPassInputTypeAlgorithm
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

  private native void SetFunction_4(byte[] id0, int len0);
  public void SetFunction(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFunction_4(bytes0, bytes0.length);
  }

  private native byte[] GetFunction_5();
  public String GetFunction()
  {
    return new String(GetFunction_5(), StandardCharsets.UTF_8);
  }

  private native void AddScalarArrayName_6(byte[] id0, int len0,int id1);
  public void AddScalarArrayName(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddScalarArrayName_6(bytes0, bytes0.length,id1);
  }

  private native void AddVectorArrayName_7(byte[] id0, int len0,int id1,int id2,int id3);
  public void AddVectorArrayName(String id0,int id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddVectorArrayName_7(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void AddScalarVariable_8(byte[] id0, int len0,byte[] id1, int len1,int id2);
  public void AddScalarVariable(String id0,String id1,int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddScalarVariable_8(bytes0, bytes0.length,bytes1, bytes1.length,id2);
  }

  private native void AddVectorVariable_9(byte[] id0, int len0,byte[] id1, int len1,int id2,int id3,int id4);
  public void AddVectorVariable(String id0,String id1,int id2,int id3,int id4)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddVectorVariable_9(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3,id4);
  }

  private native void AddCoordinateScalarVariable_10(byte[] id0, int len0,int id1);
  public void AddCoordinateScalarVariable(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddCoordinateScalarVariable_10(bytes0, bytes0.length,id1);
  }

  private native void AddCoordinateVectorVariable_11(byte[] id0, int len0,int id1,int id2,int id3);
  public void AddCoordinateVectorVariable(String id0,int id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddCoordinateVectorVariable_11(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void SetResultArrayName_12(byte[] id0, int len0);
  public void SetResultArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetResultArrayName_12(bytes0, bytes0.length);
  }

  private native byte[] GetResultArrayName_13();
  public String GetResultArrayName()
  {
    return new String(GetResultArrayName_13(), StandardCharsets.UTF_8);
  }

  private native int GetResultArrayType_14();
  public int GetResultArrayType()
  {
    return GetResultArrayType_14();
  }

  private native void SetResultArrayType_15(int id0);
  public void SetResultArrayType(int id0)
  {
    SetResultArrayType_15(id0);
  }

  private native int GetCoordinateResults_16();
  public int GetCoordinateResults()
  {
    return GetCoordinateResults_16();
  }

  private native void SetCoordinateResults_17(int id0);
  public void SetCoordinateResults(int id0)
  {
    SetCoordinateResults_17(id0);
  }

  private native void CoordinateResultsOn_18();
  public void CoordinateResultsOn()
  {
    CoordinateResultsOn_18();
  }

  private native void CoordinateResultsOff_19();
  public void CoordinateResultsOff()
  {
    CoordinateResultsOff_19();
  }

  private native boolean GetResultNormals_20();
  public boolean GetResultNormals()
  {
    return GetResultNormals_20();
  }

  private native void SetResultNormals_21(boolean id0);
  public void SetResultNormals(boolean id0)
  {
    SetResultNormals_21(id0);
  }

  private native void ResultNormalsOn_22();
  public void ResultNormalsOn()
  {
    ResultNormalsOn_22();
  }

  private native void ResultNormalsOff_23();
  public void ResultNormalsOff()
  {
    ResultNormalsOff_23();
  }

  private native boolean GetResultTCoords_24();
  public boolean GetResultTCoords()
  {
    return GetResultTCoords_24();
  }

  private native void SetResultTCoords_25(boolean id0);
  public void SetResultTCoords(boolean id0)
  {
    SetResultTCoords_25(id0);
  }

  private native void ResultTCoordsOn_26();
  public void ResultTCoordsOn()
  {
    ResultTCoordsOn_26();
  }

  private native void ResultTCoordsOff_27();
  public void ResultTCoordsOff()
  {
    ResultTCoordsOff_27();
  }

  private native byte[] GetAttributeTypeAsString_28();
  public String GetAttributeTypeAsString()
  {
    return new String(GetAttributeTypeAsString_28(), StandardCharsets.UTF_8);
  }

  private native void SetAttributeType_29(int id0);
  public void SetAttributeType(int id0)
  {
    SetAttributeType_29(id0);
  }

  private native int GetAttributeType_30();
  public int GetAttributeType()
  {
    return GetAttributeType_30();
  }

  private native void SetAttributeTypeToDefault_31();
  public void SetAttributeTypeToDefault()
  {
    SetAttributeTypeToDefault_31();
  }

  private native void SetAttributeTypeToPointData_32();
  public void SetAttributeTypeToPointData()
  {
    SetAttributeTypeToPointData_32();
  }

  private native void SetAttributeTypeToCellData_33();
  public void SetAttributeTypeToCellData()
  {
    SetAttributeTypeToCellData_33();
  }

  private native void SetAttributeTypeToEdgeData_34();
  public void SetAttributeTypeToEdgeData()
  {
    SetAttributeTypeToEdgeData_34();
  }

  private native void SetAttributeTypeToVertexData_35();
  public void SetAttributeTypeToVertexData()
  {
    SetAttributeTypeToVertexData_35();
  }

  private native void SetAttributeTypeToRowData_36();
  public void SetAttributeTypeToRowData()
  {
    SetAttributeTypeToRowData_36();
  }

  private native void RemoveAllVariables_37();
  public void RemoveAllVariables()
  {
    RemoveAllVariables_37();
  }

  private native void RemoveScalarVariables_38();
  public void RemoveScalarVariables()
  {
    RemoveScalarVariables_38();
  }

  private native void RemoveVectorVariables_39();
  public void RemoveVectorVariables()
  {
    RemoveVectorVariables_39();
  }

  private native void RemoveCoordinateScalarVariables_40();
  public void RemoveCoordinateScalarVariables()
  {
    RemoveCoordinateScalarVariables_40();
  }

  private native void RemoveCoordinateVectorVariables_41();
  public void RemoveCoordinateVectorVariables()
  {
    RemoveCoordinateVectorVariables_41();
  }

  private native byte[] GetScalarArrayName_42(int id0);
  public String GetScalarArrayName(int id0)
  {
    return new String(GetScalarArrayName_42(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetVectorArrayName_43(int id0);
  public String GetVectorArrayName(int id0)
  {
    return new String(GetVectorArrayName_43(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetScalarVariableName_44(int id0);
  public String GetScalarVariableName(int id0)
  {
    return new String(GetScalarVariableName_44(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetVectorVariableName_45(int id0);
  public String GetVectorVariableName(int id0)
  {
    return new String(GetVectorVariableName_45(id0), StandardCharsets.UTF_8);
  }

  private native int GetSelectedScalarComponent_46(int id0);
  public int GetSelectedScalarComponent(int id0)
  {
    return GetSelectedScalarComponent_46(id0);
  }

  private native int GetNumberOfScalarArrays_47();
  public int GetNumberOfScalarArrays()
  {
    return GetNumberOfScalarArrays_47();
  }

  private native int GetNumberOfVectorArrays_48();
  public int GetNumberOfVectorArrays()
  {
    return GetNumberOfVectorArrays_48();
  }

  private native void SetReplaceInvalidValues_49(int id0);
  public void SetReplaceInvalidValues(int id0)
  {
    SetReplaceInvalidValues_49(id0);
  }

  private native int GetReplaceInvalidValues_50();
  public int GetReplaceInvalidValues()
  {
    return GetReplaceInvalidValues_50();
  }

  private native void ReplaceInvalidValuesOn_51();
  public void ReplaceInvalidValuesOn()
  {
    ReplaceInvalidValuesOn_51();
  }

  private native void ReplaceInvalidValuesOff_52();
  public void ReplaceInvalidValuesOff()
  {
    ReplaceInvalidValuesOff_52();
  }

  private native void SetReplacementValue_53(double id0);
  public void SetReplacementValue(double id0)
  {
    SetReplacementValue_53(id0);
  }

  private native double GetReplacementValue_54();
  public double GetReplacementValue()
  {
    return GetReplacementValue_54();
  }

  private native void SetIgnoreMissingArrays_55(boolean id0);
  public void SetIgnoreMissingArrays(boolean id0)
  {
    SetIgnoreMissingArrays_55(id0);
  }

  private native boolean GetIgnoreMissingArrays_56();
  public boolean GetIgnoreMissingArrays()
  {
    return GetIgnoreMissingArrays_56();
  }

  private native void IgnoreMissingArraysOn_57();
  public void IgnoreMissingArraysOn()
  {
    IgnoreMissingArraysOn_57();
  }

  private native void IgnoreMissingArraysOff_58();
  public void IgnoreMissingArraysOff()
  {
    IgnoreMissingArraysOff_58();
  }

  private native void SetFunctionParserType_59(int id0);
  public void SetFunctionParserType(int id0)
  {
    SetFunctionParserType_59(id0);
  }

  private native void SetFunctionParserTypeToFunctionParser_60();
  public void SetFunctionParserTypeToFunctionParser()
  {
    SetFunctionParserTypeToFunctionParser_60();
  }

  private native void SetFunctionParserTypeToExprTkFunctionParser_61();
  public void SetFunctionParserTypeToExprTkFunctionParser()
  {
    SetFunctionParserTypeToExprTkFunctionParser_61();
  }

  private native int GetFunctionParserType_62();
  public int GetFunctionParserType()
  {
    return GetFunctionParserType_62();
  }

  private native long GetDataSetOutput_63();
  public vtkDataSet GetDataSetOutput()
  {
    long temp = GetDataSetOutput_63();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkArrayCalculator() { super(); }

  public vtkArrayCalculator(long id) { super(id); }
  public native long   VTKInit();

}
