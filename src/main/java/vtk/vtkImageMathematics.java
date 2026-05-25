// java wrapper for vtkImageMathematics object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageMathematics extends vtkThreadedImageAlgorithm
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

  private native void SetOperation_4(int id0);
  public void SetOperation(int id0)
  {
    SetOperation_4(id0);
  }

  private native int GetOperation_5();
  public int GetOperation()
  {
    return GetOperation_5();
  }

  private native void SetOperationToAdd_6();
  public void SetOperationToAdd()
  {
    SetOperationToAdd_6();
  }

  private native void SetOperationToSubtract_7();
  public void SetOperationToSubtract()
  {
    SetOperationToSubtract_7();
  }

  private native void SetOperationToMultiply_8();
  public void SetOperationToMultiply()
  {
    SetOperationToMultiply_8();
  }

  private native void SetOperationToDivide_9();
  public void SetOperationToDivide()
  {
    SetOperationToDivide_9();
  }

  private native void SetOperationToConjugate_10();
  public void SetOperationToConjugate()
  {
    SetOperationToConjugate_10();
  }

  private native void SetOperationToComplexMultiply_11();
  public void SetOperationToComplexMultiply()
  {
    SetOperationToComplexMultiply_11();
  }

  private native void SetOperationToInvert_12();
  public void SetOperationToInvert()
  {
    SetOperationToInvert_12();
  }

  private native void SetOperationToSin_13();
  public void SetOperationToSin()
  {
    SetOperationToSin_13();
  }

  private native void SetOperationToCos_14();
  public void SetOperationToCos()
  {
    SetOperationToCos_14();
  }

  private native void SetOperationToExp_15();
  public void SetOperationToExp()
  {
    SetOperationToExp_15();
  }

  private native void SetOperationToLog_16();
  public void SetOperationToLog()
  {
    SetOperationToLog_16();
  }

  private native void SetOperationToAbsoluteValue_17();
  public void SetOperationToAbsoluteValue()
  {
    SetOperationToAbsoluteValue_17();
  }

  private native void SetOperationToSquare_18();
  public void SetOperationToSquare()
  {
    SetOperationToSquare_18();
  }

  private native void SetOperationToSquareRoot_19();
  public void SetOperationToSquareRoot()
  {
    SetOperationToSquareRoot_19();
  }

  private native void SetOperationToMin_20();
  public void SetOperationToMin()
  {
    SetOperationToMin_20();
  }

  private native void SetOperationToMax_21();
  public void SetOperationToMax()
  {
    SetOperationToMax_21();
  }

  private native void SetOperationToATAN_22();
  public void SetOperationToATAN()
  {
    SetOperationToATAN_22();
  }

  private native void SetOperationToATAN2_23();
  public void SetOperationToATAN2()
  {
    SetOperationToATAN2_23();
  }

  private native void SetOperationToMultiplyByK_24();
  public void SetOperationToMultiplyByK()
  {
    SetOperationToMultiplyByK_24();
  }

  private native void SetOperationToAddConstant_25();
  public void SetOperationToAddConstant()
  {
    SetOperationToAddConstant_25();
  }

  private native void SetOperationToReplaceCByK_26();
  public void SetOperationToReplaceCByK()
  {
    SetOperationToReplaceCByK_26();
  }

  private native void SetConstantK_27(double id0);
  public void SetConstantK(double id0)
  {
    SetConstantK_27(id0);
  }

  private native double GetConstantK_28();
  public double GetConstantK()
  {
    return GetConstantK_28();
  }

  private native void SetConstantC_29(double id0);
  public void SetConstantC(double id0)
  {
    SetConstantC_29(id0);
  }

  private native double GetConstantC_30();
  public double GetConstantC()
  {
    return GetConstantC_30();
  }

  private native void SetDivideByZeroToC_31(int id0);
  public void SetDivideByZeroToC(int id0)
  {
    SetDivideByZeroToC_31(id0);
  }

  private native int GetDivideByZeroToC_32();
  public int GetDivideByZeroToC()
  {
    return GetDivideByZeroToC_32();
  }

  private native void DivideByZeroToCOn_33();
  public void DivideByZeroToCOn()
  {
    DivideByZeroToCOn_33();
  }

  private native void DivideByZeroToCOff_34();
  public void DivideByZeroToCOff()
  {
    DivideByZeroToCOff_34();
  }

  private native void SetInput1Data_35(vtkDataObject id0);
  public void SetInput1Data(vtkDataObject id0)
  {
    SetInput1Data_35(id0);
  }

  private native void SetInput2Data_36(vtkDataObject id0);
  public void SetInput2Data(vtkDataObject id0)
  {
    SetInput2Data_36(id0);
  }

  private native void SetInputConnection_37(int id0,vtkAlgorithmOutput id1);
  public void SetInputConnection(int id0,vtkAlgorithmOutput id1)
  {
    SetInputConnection_37(id0,id1);
  }

  private native void SetInputConnection_38(vtkAlgorithmOutput id0);
  public void SetInputConnection(vtkAlgorithmOutput id0)
  {
    SetInputConnection_38(id0);
  }

  private native void ReplaceNthInputConnection_39(int id0,vtkAlgorithmOutput id1);
  public void ReplaceNthInputConnection(int id0,vtkAlgorithmOutput id1)
  {
    ReplaceNthInputConnection_39(id0,id1);
  }

  private native void SetInputData_40(int id0,vtkDataObject id1);
  public void SetInputData(int id0,vtkDataObject id1)
  {
    SetInputData_40(id0,id1);
  }

  private native void SetInputData_41(vtkDataObject id0);
  public void SetInputData(vtkDataObject id0)
  {
    SetInputData_41(id0);
  }

  private native long GetInput_42(int id0);
  public vtkDataObject GetInput(int id0)
  {
    long temp = GetInput_42(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_43();
  public vtkDataObject GetInput()
  {
    long temp = GetInput_43();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfInputs_44();
  public int GetNumberOfInputs()
  {
    return GetNumberOfInputs_44();
  }

  public vtkImageMathematics() { super(); }

  public vtkImageMathematics(long id) { super(id); }
  public native long   VTKInit();

}
