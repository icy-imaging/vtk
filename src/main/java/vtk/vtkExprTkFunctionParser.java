// java wrapper for vtkExprTkFunctionParser object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExprTkFunctionParser extends vtkObject
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void SetFunction_5(byte[] id0, int len0);
  public void SetFunction(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFunction_5(bytes0, bytes0.length);
  }

  private native byte[] GetFunction_6();
  public String GetFunction()
  {
    return new String(GetFunction_6(), StandardCharsets.UTF_8);
  }

  private native int IsScalarResult_7();
  public int IsScalarResult()
  {
    return IsScalarResult_7();
  }

  private native int IsVectorResult_8();
  public int IsVectorResult()
  {
    return IsVectorResult_8();
  }

  private native double GetScalarResult_9();
  public double GetScalarResult()
  {
    return GetScalarResult_9();
  }

  private native double[] GetVectorResult_10();
  public double[] GetVectorResult()
  {
    return GetVectorResult_10();
  }

  private native void GetVectorResult_11(double id0[]);
  public void GetVectorResult(double id0[])
  {
    GetVectorResult_11(id0);
  }

  private native void SetScalarVariableValue_12(byte[] id0, int len0,double id1);
  public void SetScalarVariableValue(String id0,double id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScalarVariableValue_12(bytes0, bytes0.length,id1);
  }

  private native void SetScalarVariableValue_13(int id0,double id1);
  public void SetScalarVariableValue(int id0,double id1)
  {
    SetScalarVariableValue_13(id0,id1);
  }

  private native double GetScalarVariableValue_14(byte[] id0, int len0);
  public double GetScalarVariableValue(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetScalarVariableValue_14(bytes0, bytes0.length);
  }

  private native double GetScalarVariableValue_15(int id0);
  public double GetScalarVariableValue(int id0)
  {
    return GetScalarVariableValue_15(id0);
  }

  private native void SetVectorVariableValue_16(byte[] id0, int len0,double id1,double id2,double id3);
  public void SetVectorVariableValue(String id0,double id1,double id2,double id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVectorVariableValue_16(bytes0, bytes0.length,id1,id2,id3);
  }

  private native void SetVectorVariableValue_17(byte[] id0, int len0,double id1[]);
  public void SetVectorVariableValue(String id0,double id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVectorVariableValue_17(bytes0, bytes0.length,id1);
  }

  private native void SetVectorVariableValue_18(int id0,double id1,double id2,double id3);
  public void SetVectorVariableValue(int id0,double id1,double id2,double id3)
  {
    SetVectorVariableValue_18(id0,id1,id2,id3);
  }

  private native void SetVectorVariableValue_19(int id0,double id1[]);
  public void SetVectorVariableValue(int id0,double id1[])
  {
    SetVectorVariableValue_19(id0,id1);
  }

  private native double[] GetVectorVariableValue_20(byte[] id0, int len0);
  public double[] GetVectorVariableValue(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetVectorVariableValue_20(bytes0, bytes0.length);
  }

  private native void GetVectorVariableValue_21(byte[] id0, int len0,double id1[]);
  public void GetVectorVariableValue(String id0,double id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    GetVectorVariableValue_21(bytes0, bytes0.length,id1);
  }

  private native double[] GetVectorVariableValue_22(int id0);
  public double[] GetVectorVariableValue(int id0)
  {
    return GetVectorVariableValue_22(id0);
  }

  private native void GetVectorVariableValue_23(int id0,double id1[]);
  public void GetVectorVariableValue(int id0,double id1[])
  {
    GetVectorVariableValue_23(id0,id1);
  }

  private native int GetNumberOfScalarVariables_24();
  public int GetNumberOfScalarVariables()
  {
    return GetNumberOfScalarVariables_24();
  }

  private native int GetScalarVariableIndex_25(byte[] id0, int len0);
  public int GetScalarVariableIndex(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetScalarVariableIndex_25(bytes0, bytes0.length);
  }

  private native int GetNumberOfVectorVariables_26();
  public int GetNumberOfVectorVariables()
  {
    return GetNumberOfVectorVariables_26();
  }

  private native int GetVectorVariableIndex_27(byte[] id0, int len0);
  public int GetVectorVariableIndex(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetVectorVariableIndex_27(bytes0, bytes0.length);
  }

  private native byte[] GetScalarVariableName_28(int id0);
  public String GetScalarVariableName(int id0)
  {
    return new String(GetScalarVariableName_28(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetVectorVariableName_29(int id0);
  public String GetVectorVariableName(int id0)
  {
    return new String(GetVectorVariableName_29(id0), StandardCharsets.UTF_8);
  }

  private native boolean GetScalarVariableNeeded_30(int id0);
  public boolean GetScalarVariableNeeded(int id0)
  {
    return GetScalarVariableNeeded_30(id0);
  }

  private native boolean GetScalarVariableNeeded_31(byte[] id0, int len0);
  public boolean GetScalarVariableNeeded(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetScalarVariableNeeded_31(bytes0, bytes0.length);
  }

  private native boolean GetVectorVariableNeeded_32(int id0);
  public boolean GetVectorVariableNeeded(int id0)
  {
    return GetVectorVariableNeeded_32(id0);
  }

  private native boolean GetVectorVariableNeeded_33(byte[] id0, int len0);
  public boolean GetVectorVariableNeeded(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetVectorVariableNeeded_33(bytes0, bytes0.length);
  }

  private native void RemoveAllVariables_34();
  public void RemoveAllVariables()
  {
    RemoveAllVariables_34();
  }

  private native void RemoveScalarVariables_35();
  public void RemoveScalarVariables()
  {
    RemoveScalarVariables_35();
  }

  private native void RemoveVectorVariables_36();
  public void RemoveVectorVariables()
  {
    RemoveVectorVariables_36();
  }

  private native void SetReplaceInvalidValues_37(int id0);
  public void SetReplaceInvalidValues(int id0)
  {
    SetReplaceInvalidValues_37(id0);
  }

  private native int GetReplaceInvalidValues_38();
  public int GetReplaceInvalidValues()
  {
    return GetReplaceInvalidValues_38();
  }

  private native void ReplaceInvalidValuesOn_39();
  public void ReplaceInvalidValuesOn()
  {
    ReplaceInvalidValuesOn_39();
  }

  private native void ReplaceInvalidValuesOff_40();
  public void ReplaceInvalidValuesOff()
  {
    ReplaceInvalidValuesOff_40();
  }

  private native void SetReplacementValue_41(double id0);
  public void SetReplacementValue(double id0)
  {
    SetReplacementValue_41(id0);
  }

  private native double GetReplacementValue_42();
  public double GetReplacementValue()
  {
    return GetReplacementValue_42();
  }

  private native void InvalidateFunction_43();
  public void InvalidateFunction()
  {
    InvalidateFunction_43();
  }

  private native byte[] SanitizeName_44(byte[] id0, int len0);
  public String SanitizeName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(SanitizeName_44(bytes0, bytes0.length), StandardCharsets.UTF_8);
  }

  public vtkExprTkFunctionParser() { super(); }

  public vtkExprTkFunctionParser(long id) { super(id); }
  public native long   VTKInit();

}
