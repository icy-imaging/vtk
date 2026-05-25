// java wrapper for vtkGenericStreamTracer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericStreamTracer extends vtkPolyDataAlgorithm
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

  private native void SetStartPosition_4(double id0,double id1,double id2);
  public void SetStartPosition(double id0,double id1,double id2)
  {
    SetStartPosition_4(id0,id1,id2);
  }

  private native void SetStartPosition_5(double id0[]);
  public void SetStartPosition(double id0[])
  {
    SetStartPosition_5(id0);
  }

  private native double[] GetStartPosition_6();
  public double[] GetStartPosition()
  {
    return GetStartPosition_6();
  }

  private native void SetSourceData_7(vtkDataSet id0);
  public void SetSourceData(vtkDataSet id0)
  {
    SetSourceData_7(id0);
  }

  private native long GetSource_8();
  public vtkDataSet GetSource()
  {
    long temp = GetSource_8();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSourceConnection_9(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_9(id0);
  }

  private native int FillInputPortInformation_10(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_10(id0,id1);
  }

  private native void SetIntegrator_11(vtkInitialValueProblemSolver id0);
  public void SetIntegrator(vtkInitialValueProblemSolver id0)
  {
    SetIntegrator_11(id0);
  }

  private native long GetIntegrator_12();
  public vtkInitialValueProblemSolver GetIntegrator()
  {
    long temp = GetIntegrator_12();

    if (temp == 0) return null;
    return (vtkInitialValueProblemSolver)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetIntegratorType_13(int id0);
  public void SetIntegratorType(int id0)
  {
    SetIntegratorType_13(id0);
  }

  private native int GetIntegratorType_14();
  public int GetIntegratorType()
  {
    return GetIntegratorType_14();
  }

  private native void SetIntegratorTypeToRungeKutta2_15();
  public void SetIntegratorTypeToRungeKutta2()
  {
    SetIntegratorTypeToRungeKutta2_15();
  }

  private native void SetIntegratorTypeToRungeKutta4_16();
  public void SetIntegratorTypeToRungeKutta4()
  {
    SetIntegratorTypeToRungeKutta4_16();
  }

  private native void SetIntegratorTypeToRungeKutta45_17();
  public void SetIntegratorTypeToRungeKutta45()
  {
    SetIntegratorTypeToRungeKutta45_17();
  }

  private native void SetMaximumPropagation_18(int id0,double id1);
  public void SetMaximumPropagation(int id0,double id1)
  {
    SetMaximumPropagation_18(id0,id1);
  }

  private native void SetMaximumPropagation_19(double id0);
  public void SetMaximumPropagation(double id0)
  {
    SetMaximumPropagation_19(id0);
  }

  private native void SetMaximumPropagationUnit_20(int id0);
  public void SetMaximumPropagationUnit(int id0)
  {
    SetMaximumPropagationUnit_20(id0);
  }

  private native int GetMaximumPropagationUnit_21();
  public int GetMaximumPropagationUnit()
  {
    return GetMaximumPropagationUnit_21();
  }

  private native double GetMaximumPropagation_22();
  public double GetMaximumPropagation()
  {
    return GetMaximumPropagation_22();
  }

  private native void SetMaximumPropagationUnitToTimeUnit_23();
  public void SetMaximumPropagationUnitToTimeUnit()
  {
    SetMaximumPropagationUnitToTimeUnit_23();
  }

  private native void SetMaximumPropagationUnitToLengthUnit_24();
  public void SetMaximumPropagationUnitToLengthUnit()
  {
    SetMaximumPropagationUnitToLengthUnit_24();
  }

  private native void SetMaximumPropagationUnitToCellLengthUnit_25();
  public void SetMaximumPropagationUnitToCellLengthUnit()
  {
    SetMaximumPropagationUnitToCellLengthUnit_25();
  }

  private native void SetMinimumIntegrationStep_26(int id0,double id1);
  public void SetMinimumIntegrationStep(int id0,double id1)
  {
    SetMinimumIntegrationStep_26(id0,id1);
  }

  private native void SetMinimumIntegrationStepUnit_27(int id0);
  public void SetMinimumIntegrationStepUnit(int id0)
  {
    SetMinimumIntegrationStepUnit_27(id0);
  }

  private native void SetMinimumIntegrationStep_28(double id0);
  public void SetMinimumIntegrationStep(double id0)
  {
    SetMinimumIntegrationStep_28(id0);
  }

  private native int GetMinimumIntegrationStepUnit_29();
  public int GetMinimumIntegrationStepUnit()
  {
    return GetMinimumIntegrationStepUnit_29();
  }

  private native double GetMinimumIntegrationStep_30();
  public double GetMinimumIntegrationStep()
  {
    return GetMinimumIntegrationStep_30();
  }

  private native void SetMinimumIntegrationStepUnitToTimeUnit_31();
  public void SetMinimumIntegrationStepUnitToTimeUnit()
  {
    SetMinimumIntegrationStepUnitToTimeUnit_31();
  }

  private native void SetMinimumIntegrationStepUnitToLengthUnit_32();
  public void SetMinimumIntegrationStepUnitToLengthUnit()
  {
    SetMinimumIntegrationStepUnitToLengthUnit_32();
  }

  private native void SetMinimumIntegrationStepUnitToCellLengthUnit_33();
  public void SetMinimumIntegrationStepUnitToCellLengthUnit()
  {
    SetMinimumIntegrationStepUnitToCellLengthUnit_33();
  }

  private native void SetMaximumIntegrationStep_34(int id0,double id1);
  public void SetMaximumIntegrationStep(int id0,double id1)
  {
    SetMaximumIntegrationStep_34(id0,id1);
  }

  private native void SetMaximumIntegrationStepUnit_35(int id0);
  public void SetMaximumIntegrationStepUnit(int id0)
  {
    SetMaximumIntegrationStepUnit_35(id0);
  }

  private native void SetMaximumIntegrationStep_36(double id0);
  public void SetMaximumIntegrationStep(double id0)
  {
    SetMaximumIntegrationStep_36(id0);
  }

  private native int GetMaximumIntegrationStepUnit_37();
  public int GetMaximumIntegrationStepUnit()
  {
    return GetMaximumIntegrationStepUnit_37();
  }

  private native double GetMaximumIntegrationStep_38();
  public double GetMaximumIntegrationStep()
  {
    return GetMaximumIntegrationStep_38();
  }

  private native void SetMaximumIntegrationStepUnitToTimeUnit_39();
  public void SetMaximumIntegrationStepUnitToTimeUnit()
  {
    SetMaximumIntegrationStepUnitToTimeUnit_39();
  }

  private native void SetMaximumIntegrationStepUnitToLengthUnit_40();
  public void SetMaximumIntegrationStepUnitToLengthUnit()
  {
    SetMaximumIntegrationStepUnitToLengthUnit_40();
  }

  private native void SetMaximumIntegrationStepUnitToCellLengthUnit_41();
  public void SetMaximumIntegrationStepUnitToCellLengthUnit()
  {
    SetMaximumIntegrationStepUnitToCellLengthUnit_41();
  }

  private native void SetInitialIntegrationStep_42(int id0,double id1);
  public void SetInitialIntegrationStep(int id0,double id1)
  {
    SetInitialIntegrationStep_42(id0,id1);
  }

  private native void SetInitialIntegrationStepUnit_43(int id0);
  public void SetInitialIntegrationStepUnit(int id0)
  {
    SetInitialIntegrationStepUnit_43(id0);
  }

  private native void SetInitialIntegrationStep_44(double id0);
  public void SetInitialIntegrationStep(double id0)
  {
    SetInitialIntegrationStep_44(id0);
  }

  private native int GetInitialIntegrationStepUnit_45();
  public int GetInitialIntegrationStepUnit()
  {
    return GetInitialIntegrationStepUnit_45();
  }

  private native double GetInitialIntegrationStep_46();
  public double GetInitialIntegrationStep()
  {
    return GetInitialIntegrationStep_46();
  }

  private native void SetInitialIntegrationStepUnitToTimeUnit_47();
  public void SetInitialIntegrationStepUnitToTimeUnit()
  {
    SetInitialIntegrationStepUnitToTimeUnit_47();
  }

  private native void SetInitialIntegrationStepUnitToLengthUnit_48();
  public void SetInitialIntegrationStepUnitToLengthUnit()
  {
    SetInitialIntegrationStepUnitToLengthUnit_48();
  }

  private native void SetInitialIntegrationStepUnitToCellLengthUnit_49();
  public void SetInitialIntegrationStepUnitToCellLengthUnit()
  {
    SetInitialIntegrationStepUnitToCellLengthUnit_49();
  }

  private native void SetMaximumError_50(double id0);
  public void SetMaximumError(double id0)
  {
    SetMaximumError_50(id0);
  }

  private native double GetMaximumError_51();
  public double GetMaximumError()
  {
    return GetMaximumError_51();
  }

  private native void SetMaximumNumberOfSteps_52(long id0);
  public void SetMaximumNumberOfSteps(long id0)
  {
    SetMaximumNumberOfSteps_52(id0);
  }

  private native long GetMaximumNumberOfSteps_53();
  public long GetMaximumNumberOfSteps()
  {
    return GetMaximumNumberOfSteps_53();
  }

  private native void SetTerminalSpeed_54(double id0);
  public void SetTerminalSpeed(double id0)
  {
    SetTerminalSpeed_54(id0);
  }

  private native double GetTerminalSpeed_55();
  public double GetTerminalSpeed()
  {
    return GetTerminalSpeed_55();
  }

  private native void SetIntegrationStepUnit_56(int id0);
  public void SetIntegrationStepUnit(int id0)
  {
    SetIntegrationStepUnit_56(id0);
  }

  private native void SetIntegrationDirection_57(int id0);
  public void SetIntegrationDirection(int id0)
  {
    SetIntegrationDirection_57(id0);
  }

  private native int GetIntegrationDirectionMinValue_58();
  public int GetIntegrationDirectionMinValue()
  {
    return GetIntegrationDirectionMinValue_58();
  }

  private native int GetIntegrationDirectionMaxValue_59();
  public int GetIntegrationDirectionMaxValue()
  {
    return GetIntegrationDirectionMaxValue_59();
  }

  private native int GetIntegrationDirection_60();
  public int GetIntegrationDirection()
  {
    return GetIntegrationDirection_60();
  }

  private native void SetIntegrationDirectionToForward_61();
  public void SetIntegrationDirectionToForward()
  {
    SetIntegrationDirectionToForward_61();
  }

  private native void SetIntegrationDirectionToBackward_62();
  public void SetIntegrationDirectionToBackward()
  {
    SetIntegrationDirectionToBackward_62();
  }

  private native void SetIntegrationDirectionToBoth_63();
  public void SetIntegrationDirectionToBoth()
  {
    SetIntegrationDirectionToBoth_63();
  }

  private native void SetComputeVorticity_64(int id0);
  public void SetComputeVorticity(int id0)
  {
    SetComputeVorticity_64(id0);
  }

  private native int GetComputeVorticity_65();
  public int GetComputeVorticity()
  {
    return GetComputeVorticity_65();
  }

  private native void ComputeVorticityOn_66();
  public void ComputeVorticityOn()
  {
    ComputeVorticityOn_66();
  }

  private native void ComputeVorticityOff_67();
  public void ComputeVorticityOff()
  {
    ComputeVorticityOff_67();
  }

  private native void SetRotationScale_68(double id0);
  public void SetRotationScale(double id0)
  {
    SetRotationScale_68(id0);
  }

  private native double GetRotationScale_69();
  public double GetRotationScale()
  {
    return GetRotationScale_69();
  }

  private native byte[] GetInputVectorsSelection_70();
  public String GetInputVectorsSelection()
  {
    return new String(GetInputVectorsSelection_70(), StandardCharsets.UTF_8);
  }

  private native void SelectInputVectors_71(byte[] id0, int len0);
  public void SelectInputVectors(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SelectInputVectors_71(bytes0, bytes0.length);
  }

  private native void AddInputData_72(vtkGenericDataSet id0);
  public void AddInputData(vtkGenericDataSet id0)
  {
    AddInputData_72(id0);
  }

  private native void SetInterpolatorPrototype_73(vtkGenericInterpolatedVelocityField id0);
  public void SetInterpolatorPrototype(vtkGenericInterpolatedVelocityField id0)
  {
    SetInterpolatorPrototype_73(id0);
  }

  public vtkGenericStreamTracer() { super(); }

  public vtkGenericStreamTracer(long id) { super(id); }
  public native long   VTKInit();

}
